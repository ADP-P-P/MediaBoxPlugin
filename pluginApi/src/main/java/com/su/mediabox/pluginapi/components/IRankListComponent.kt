package com.su.mediabox.pluginapi.components

import com.su.mediabox.pluginapi.been.AnimeCoverBean
import com.su.mediabox.pluginapi.been.PageNumberBean

/**
 * 获取排行榜界面Tab数据组件
 */
interface IRankListComponent : IBaseComponent {
    /**
     * 获取排行榜列表数据
     *
     * @param partUrl  页面部分url，不为null
     * @return Pair，不可为null
     * List<AnimeCoverBean>：排行榜列表数据List，不为null
     * PageNumberBean：下一页数据地址Bean，可为null，为空则没有下一页
     */
    suspend fun getRankListData(partUrl: String): Pair<List<AnimeCoverBean>, PageNumberBean?>

}