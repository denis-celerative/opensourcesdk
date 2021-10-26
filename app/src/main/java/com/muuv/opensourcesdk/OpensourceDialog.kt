package com.muuv.opensourcesdk

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment


class OpensourceDialog(private val onClickListener: DialogInterface.OnClickListener): DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        super.onCreateDialog(savedInstanceState)
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.setTitle(R.string.muuv_opensourcesdk_title)
                .setMessage(R.string.muuv_opensourcesdk_description)
                .setPositiveButton(R.string.muuv_opensourcesdk_positive_button, onClickListener)
                .setNegativeButton(R.string.muuv_opensourcesdk_negative_button, onClickListener)
                .setCancelable(true)
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be found")
    }

}
