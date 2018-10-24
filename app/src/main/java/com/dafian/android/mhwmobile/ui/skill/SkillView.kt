package com.dafian.android.mhwmobile.ui.skill

import com.dafian.android.mhwmobile.base.BaseView
import com.dafian.android.mhwmobile.data.entity.SkillHead

interface SkillView : BaseView {

    fun showSkillAll(skillList: List<SkillHead>)
}