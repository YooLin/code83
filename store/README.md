恭喜你完成“83行代码重构大师赛“预选赛全部舱位的重启，来到方舟的控制中枢！

*请注意本关卡为本次赛事的总决赛，排名按照通关的时刻排序，具体请从大赛首页赛程前往查看赛制规则。

你的任务：
找到埋藏的bug；控制中枢的重启需要你帮助完成贸易站的系统升级，让我们可以添加新的商品，以保证在灾害结束前供应给需要的人们。

简单介绍一下我们的系统：
* 商品（Item）都有一个销售剩余天数（SellIn），表示该商品必须在该值所代表的天数内销售出去。
* 所有商品都有一个Value值，代表商品的价值。
* 每过一天，所有商品的SellIn值和Value值都减1。
* 一旦过了销售剩余天数，价值就以双倍的速度下滑。
* 陈年老酒（Aged Wine）是一种特殊的商品，放得越久，价值反而越高。而且过了销售剩余天数后价值会双倍上涨。
* 商品的价值永远不会小于0，也永远不会超过50。
* 魔法锤（Sulfuras）是一种传奇商品，其销售剩余天数和品质值都不会变化。
* 演出票（Show Ticket）越接近演出日，价值反而上升。在演出前10天，价值每天上升2点；演出前5天，价值每天上升3点。但一旦过了演出日，价值就马上变成0。

* 最近因为灾害，我们采购了特效药（Cure）， 特效药的贬值速度是普通物品的两倍，这更加需要尽快升级我们的系统。


### 注意：
后台会运行若干单测来验证程序的正确性，请不要修改提示了不允许修改的类或者方法的签名，以保证测试的正常运行。例如以下提示：     
// Please don't modify the signature of this method.   
// Please don't modify the class name.  
