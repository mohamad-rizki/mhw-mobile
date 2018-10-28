package com.dafian.android.mhwmobile.ui.armor

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

class ArmorFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return ArmorUI().createView(AnkoContext.create(context!!, this, false))
    }

    class ArmorUI : AnkoComponent<ArmorFragment> {

        companion object {
            const val idList = 1
        }

        override fun createView(ui: AnkoContext<ArmorFragment>) = with(ui) {
            verticalLayout {
                lparams(width = matchParent, height = matchParent)

                recyclerView {
                    id = idList
                    lparams(matchParent, wrapContent)
                    layoutManager = LinearLayoutManager(context)
                    itemAnimator = DefaultItemAnimator()
                    addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
                }
            }
        }
    }
}