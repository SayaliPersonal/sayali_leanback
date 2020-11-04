package com.example.leanbacksample3

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.leanback.widget.ListRow
import androidx.leanback.widget.Presenter

class IconHeaderItemPresenter : Presenter() {

    override fun onCreateViewHolder(viewGroup: ViewGroup): Presenter.ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).run {
            inflate(R.layout.icon_header_item, null)
        }

        return Presenter.ViewHolder(view)
    }


    override fun onBindViewHolder(viewHolder: Presenter.ViewHolder, o: Any) {
        val headerItem = (o as ListRow).headerItem
        val rootView = viewHolder.view

        rootView.findViewById<ImageView>(R.id.header_icon).apply {
            rootView.resources.getDrawable(R.mipmap.ic_launcher, null).also { icon ->
                setImageDrawable(icon)
            }
        }

        rootView.findViewById<TextView>(R.id.header_label).apply {
            text = headerItem.name
        }
    }

    override fun onUnbindViewHolder(viewHolder: Presenter.ViewHolder) {
        // no op
    }
}