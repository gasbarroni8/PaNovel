package cc.aoeiuv020.panovel.report

import android.annotation.SuppressLint
import android.content.Context
import cc.aoeiuv020.panovel.settings.OtherSettings
import com.tencent.bugly.crashreport.CrashReport
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.debug

/**
 * 封装异常上报，
 * 当前使用，腾讯的bugly,
 *
 * Created by AoEiuV020 on 2018.05.17-18:04:30.
 */
object Reporter : AnkoLogger {
    @SuppressLint("HardwareIds")
    fun init(ctx: Context) {
        // 第三个参数为SDK调试模式开关，
        // 打开会导致开发机上报异常，
        CrashReport.initCrashReport(ctx, "be0d684a75", false)
        // 貌似设置了开发设备就不上报了，
        CrashReport.setIsDevelopmentDevice(ctx, !OtherSettings.reportCrash)

        val androidId = android.provider.Settings.Secure.getString(ctx.contentResolver, android.provider.Settings.Secure.ANDROID_ID)
        CrashReport.setUserId(androidId)
    }

    fun unreachable() {
        post("不可到达，")
    }

    /**
     * requireNotNull,
     */
    inline fun <reified T> notNull(t: T?): T {
        if (t == null) {
            val message = "<${T::class.java}>不可空，"
            val e = NullPointerException(message)
            // 可能有重复上报，抛出去的异常可能再被捕获然后上报，但不嫌多，
            post(message, e)
            throw  e
        }
        return t
    }

    fun post(message: String) {
        debug(message)
        postException(IllegalStateException(message))
    }

    fun unreachable(e: Throwable) {
        post("不可到达，", e)
    }

    fun post(message: String, e: Throwable) {
        debug(message, e)
        // 断网导致的问题也一并上报了，
        postException(IllegalStateException(message, e))
    }

    private fun postException(e: Throwable) {
        CrashReport.postCatchedException(e)
    }
}