package com.saladevs.changelogclone.ui.details

import com.saladevs.changelogclone.model.PackageUpdate
import com.saladevs.changelogclone.ui.MvpView

interface DetailsMvpView : MvpView {

    fun showEmptyState(b: Boolean)

    fun showUpdates(updates: List<PackageUpdate>)

    fun setPackageIgnored(ignored: Boolean)

}
