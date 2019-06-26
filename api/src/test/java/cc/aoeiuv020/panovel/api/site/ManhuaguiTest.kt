package cc.aoeiuv020.panovel.api.site

import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Created by AoEiuV020 on 2019.02.11-19:27:57.
 */
class ManhuaguiTest : BaseNovelContextText(Manhuagui::class) {
    @Test
    fun search() {
        search("魔王")
        search("穷神", "助野嘉昭", "2492")
        search("修真聊天群", "火力熊猫", "25630")
        search("枪之勇者重生录", "にぃと,アネコユサギ", "25878")
    }

    @Test
    fun detail() {
        detail("2492", "2492", "穷神", "助野嘉昭",
                "https://cf.hamreus.com/cpic/h/2492.jpg",
                "集美貌、财力、智慧、运动万能於一身的樱市子，是个有着超强好运的高中女孩，在她的人生字典中，从没有「努力」跟「失败」这两个词汇！因为她的超强运道扰乱了世间运气的平衡，穷神界派出了懒惰穷神红叶，要来恢复因樱市子而混乱的运气均衡，然而红叶发现，樱市子并不光只是运气好而已，她竟然还会吸走别人身上的好运……？(2009年12月21日上市)\n" +
                        "红叶策划要夺走市子的胸部…不对，是过多的幸福能量，因而召来了超被虐狂的犬神跟浦岛太郎神，又用网球引发了大骚动，两人间的大混战仍然无法结束！就在这时，红叶的秘策竟然意外奏功？(2010年2月9日上市)\n" +
                        "红叶的作战成功，市子进入了超沮丧模式…。莫非剧情终於要开始认真发展了!?就在此时，市子班上又来了一名转学生，她姓龙胆，名岚丸！其热血硬派的作风不输男儿的岚丸，和市子展开了大对决!!(2010年3月10日上市)\n" +
                        "市子交到了朋友岚丸，却无法坦率说出自己的秘密…。就在此时，市子刚开始饲养的小猫被红叶绑架了!?另外，从厕所跑出了大●…厕所神，红叶也极其难得地变强，市子将遭遇人生的大危机!?(2010年4月12日上市)\n" +
                        "红叶的穷神变身事件告一段落，市子吵吵闹闹的日常生活又回来了！因为石蕗被足球队找去充人数，市子跟岚丸因而前去观看足球比赛。然而，接近石蕗的两人，却遭遇谜样的陷阱攻击!?究竟犯人的真正身份是…!?(2010年6月15日上市)\n" +
                        "争夺石蕗的女人战争愈演愈烈!?贴纸争夺战加上游泳比赛，在红叶的搧风点火之下，市子‧岚丸‧抚子展开了三方角力!!究竟谁会赢得胜利!?就在这时，为代替偷懒不工作的红叶，穷神上司‧山吹降临人间了!?(2010年8月6日上市)\n" +
                        "市子被红叶附身已经过了３个月。她渐渐理解到和重要的夥伴们共度时光的那种幸福。接着，暑假终於来了！在不顾穷神工作、只顾玩乐的红叶以及兴高采烈的市子身上，发生了意想不到的大事!?(2010年12月14日上市)\n" +
                        "为了从福神蒲公英手中救出市子，夥伴们集合了！石蕗的足球、岚丸的蛮力、抚子的忍术，再加上狗．和尚．管家的变态力量，顺利地拦下了蒲公英一行人。市子对在此时出现的红叶所说的话，又会有何反应呢!?那麽，开始反击!!(2011年5月6上市)\n" +
                        "开始慢活吧！市子和石蕗兄弟拜访了诹访野居住的雨水村，却因为厚脸皮跟来的红叶，演变成全村动员的事件？而去过海边跟祭典、充分享受了乡村生活的市子，和出乎意料的人物重逢了…!?(2011年10月6日上市)\n" +
                        "红叶开始追寻市子的诞生之谜。就在这时，付丧神．牡丹出现在市子面前！将市子视为投胎转世主人加以仰慕的牡丹，为了争夺夥伴宝座，跟红叶展开了异色战斗！牡丹的真正目的究竟是…!?(2012年8月27日上市)\n" +
                        "市子被策画让「神奈」复活的付丧神们抽离意识。结果红叶居然让懋毘威进入市子体内!!一边追赶着逃跑的市子（懋毘威），付丧神与红叶等人一边展开激烈冲突！战斗的结果将会如何，而市子的贞操又会…!?(2012年9月25日上市)\n" +
                        "和红叶开始同居的市子受到冲击…！自己居然变胖了!?市子和比她胖得更严重的岚丸、抚子决定开始减肥…。此外，还有岚丸与桃央的修行秘话、付丧神．石艳丸的奋斗，大份量的第12集!!(2012年10月25日上市)\n" +
                        "碇的魔手逼近…！穷神们着手调查佛女津市的异常情况，但八百万神明却被碇的刺客‧枣一一消灭。另一方面，原本市子等人正热热闹闹地准备校庆，突然间，所有人的态度都变了…!?(2012年12月4日上市)\n" +
                        "因为取回红叶留下的幸福能量，以及了解她行动背後的真正意思，市子完全复活！她和熊谷等人一起前往穷神界。在出发前，市子去向石蕗道别，然而，因为石蕗出人意料的一句话，市子干劲ＭＡＸ！那麽，开始反击罗!!(2013年3月20日上市)\n" +
                        "神奈跟碇两人拥有相反力量却相互吸引。就在此时，拥有异常不幸能量、有最凶恶穷神之称的花菱逃亡至地面上。因为银杏的请托，神奈答应出借力量协助捕获花菱，但是，碇却对银杏起疑…!?(2013年5月13日上市)\n" +
                        "(完结篇)为阻止碇实现他扭曲的野心，市子跟红叶两人挺身而出！岚丸、抚子、石蕗以及穷神们，相信着她们两人并持续奋战，然而碇却将收集到的能量全数吸到自己体内了？直到最後最後都盛大无比的大团圆结局！(2013年12月20日上市)",
                "2015-10-13 00:00:00")
        detail("25630", "25630", "修真聊天群", "火力熊猫",
                "https://cf.hamreus.com/cpic/h/25630.jpg",
                "某天，宋书航意外加入了一个仙侠中二病资深患者的交流群，里面的群友们都以‘道友’相称，群名片都是各种府主、洞主、真人、天师。连群主走失的宠物犬都称为大妖犬离家出走。整天聊的是炼丹、闯秘境、炼功经验啥的。\n" +
                        "突然有一天，潜水良久的他突然发现……群里每一个群员，竟然全部是修真者，能移山倒海、长生千年的那种！\n" +
                        "啊啊啊啊，世界观在一夜间彻底崩碎啦！",
                "2018-11-20 00:00:00")
        detail("25878", "25878", "枪之勇者重生录", "にぃと,アネコユサギ",
                "https://cf.hamreus.com/cpic/h/25878.jpg",
                "成为枪之勇者被召唤到异世界的北村元康。经历死亡的危机得到了时间回溯的能力。",
                "2019-01-28 00:00:00")
    }

    @Test
    fun chapters() {
        chapters("2492", "第01卷", "2492/20927", null,
                "第16卷", "2492/124042", null,
                16)
        chapters("25630", "宋·迎新春·书航", "25630/394126", null,
                "103 这是在鞭尸啊！", "25630/403295", null,
                112)
    }

    @Test
    fun content() {
        content("25630/403295")!!.let {
            it.forEach {
                println(it)
            }
            assertTrue(it.first().startsWith("![img](https://eu.hamreus.com/ps3/x/xiuzltq_hlxm/103/001.jpg.webp?cid=403295&md5="))
            assertTrue(it.last().startsWith("![img](https://eu.hamreus.com/ps3/x/xiuzltq_hlxm/103/098.jpg.webp?cid=403295&md5="))
        }
    }

}
