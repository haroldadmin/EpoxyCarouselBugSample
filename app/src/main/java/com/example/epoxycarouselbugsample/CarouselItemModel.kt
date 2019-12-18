package com.example.epoxycarouselbugsample

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import android.widget.TextView
import com.airbnb.epoxy.ModelView
import com.airbnb.epoxy.TextProp

@ModelView(autoLayout = ModelView.Size.WRAP_WIDTH_MATCH_HEIGHT)
class CarouselItemModel @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    init {
        inflate(context, R.layout.item_carousel, this)
    }

    private val textContent = findViewById<TextView>(R.id.textContent)

    @TextProp
    fun setTextContent(text: CharSequence) {
        textContent.text = text
    }

}