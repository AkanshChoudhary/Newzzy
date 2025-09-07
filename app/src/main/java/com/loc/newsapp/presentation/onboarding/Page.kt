package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

val pages = listOf(
    Page(
        title = "Stay Updated",
        description = "Discover the latest headlines from trusted sources and stay informed with real-time updates. Explore articles in a clean, distraction-free reader designed to give you the news that matters most.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Find What Matters",
        description = "Quickly search for any topic, keyword, or interest to get curated results tailored to you. Whether it’s breaking news or a specific story, finding the information you care about is effortless.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Save & Share",
        description = "Bookmark articles to revisit later and keep all your saved stories in one place. When you find something worth sharing, easily send news links to your friends and family with just one tap.",
        image = R.drawable.onboarding3
    )
)