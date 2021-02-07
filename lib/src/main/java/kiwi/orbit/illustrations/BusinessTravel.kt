package kiwi.orbit.illustrations

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import kiwi.orbit.R

@get:Composable
public val Illustrations.BusinessTravel: Painter
	get() {
		if (illustration != null) return illustration!!
		illustration = painterResource(R.drawable.il_business_travel)
		return illustration!!
	}

private var illustration: Painter? = null
