package com.example.android.mylibrary

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.android.mylibrary.databinding.LargeRegularViewBinding

class LargeRegularTextView(context: Context, attrs: AttributeSet? = null) :
    LinearLayout(context, attrs) {

    private var _binding: LargeRegularViewBinding? = null

    private val binding get() = _binding!!

    init {
        _binding = LargeRegularViewBinding.inflate(LayoutInflater.from(context), this)
    }

    //set text to bold and large size
    fun setBold(text: String) {
        binding.apply {
            tvValue.setTextAppearance(context, R.style.headingText)
            tvValue.text = text
        }
    }

    //set text to normal and small size
    fun setNormal(text: String) {
        binding.apply {
            tvValue.setTextAppearance(context, R.style.smallText)
            tvValue.text = text
        }
    }

    // if you want to set text color as well
    fun setTextColorRes(color: Int) {
        binding.apply {
            tvValue.setTextColor(color)
        }
    }


}
