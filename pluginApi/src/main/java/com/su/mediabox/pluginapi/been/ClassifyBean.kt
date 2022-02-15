package com.su.mediabox.pluginapi.been

class ClassifyBean(
    override var type: String,
    override var actionUrl: String,
    var name: String,
    var classifyDataList: ArrayList<ClassifyDataBean>
) : BaseBean {
    override fun toString(): String {
        return name.replace("：", "").replace(":", "")
    }
}

//每个分类子项，如字母的A，地区的大陆等
class ClassifyDataBean(
    override var type: String,
    override var actionUrl: String,
    var url: String,
    var title: String
) : BaseBean