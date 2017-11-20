package cc.aoeiuv020.panovel.history

import android.annotation.SuppressLint
import android.content.Context
import android.view.ViewGroup
import cc.aoeiuv020.panovel.IView
import cc.aoeiuv020.panovel.R
import cc.aoeiuv020.panovel.api.NovelChapter
import cc.aoeiuv020.panovel.api.NovelDetail
import cc.aoeiuv020.panovel.api.NovelItem
import cc.aoeiuv020.panovel.detail.NovelDetailActivity
import cc.aoeiuv020.panovel.util.hide
import cc.aoeiuv020.panovel.util.show
import cn.lemon.view.adapter.BaseViewHolder
import cn.lemon.view.adapter.RecyclerAdapter
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.bookshelf_item.view.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.debug
import java.text.SimpleDateFormat
import java.util.*

/**
 * 绝大部分照搬书架，
 * Created by AoEiuV020 on 2017.10.15-18:12:19.
 */
class HistoryAdapter(context: Context, val historyPresenter: HistoryPresenter) : RecyclerAdapter<NovelItem>(context) {
    @SuppressLint("SimpleDateFormat")
    private val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")

    override fun onCreateBaseViewHolder(parent: ViewGroup?, viewType: Int): BaseViewHolder<NovelItem>
            = ViewHolder(parent, R.layout.bookshelf_item)

    override fun onViewRecycled(holder: BaseViewHolder<NovelItem>) {
        // header和footer会强转失败，
        (holder as? ViewHolder)?.destroy()
    }

    inner class ViewHolder(parent: ViewGroup?, layoutId: Int) : BaseViewHolder<NovelItem>(parent, layoutId), IView, AnkoLogger {
        private val presenter = historyPresenter.subPresenter()
        private val image = itemView.imageView
        private val name = itemView.tvName
        private val author = itemView.tvAuthor
        private val site = itemView.tvSite
        private val update = itemView.tvUpdate
        private val readAt = itemView.tvReadAt
        private val last = itemView.tvLast
        private val progressBar = itemView.progressBar

        override fun setData(data: NovelItem) {
            super.setData(data)
            debug {
                "${this.hashCode()} $layoutPosition setData $data"
            }
            @Suppress("UnnecessaryVariable")
            val novel = data
            name.text = novel.name
            author.text = novel.author
            site.text = novel.site
            progressBar.show()

            // 清空残留数据，避免闪烁，
            update.text = ""
            last.text = ""
            image.setImageDrawable(null)
            readAt.text = ""

            presenter.attach(this)
            presenter.requestDetail(novel)
        }

        fun showDetail(detail: NovelDetail) {
            showUpdateTime(detail.update)
            Glide.with(context).load(detail.bigImg).into(image)
            presenter.requestUpdate(detail)
            presenter.requestChapters(detail)
        }

        fun showUpdateTime(updateTime: Date) {
            update.text = sdf.format(updateTime)
        }

        fun showChapter(chapters: List<NovelChapter>, progress: Int) {
            readAt.text = chapters[progress].name
            last.text = chapters.last().name
            progressBar.hide()
        }

        override fun onItemViewClick(data: NovelItem) {
            NovelDetailActivity.start(context, data)
        }

        fun destroy() {
            presenter.detach()
        }
    }
}