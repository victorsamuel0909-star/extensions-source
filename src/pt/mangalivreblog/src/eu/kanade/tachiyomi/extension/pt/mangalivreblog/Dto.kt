package eu.kanade.tachiyomi.extension.pt.mangalivreblog

import kotlinx.serialization.Serializable

@Serializable
class ChaptersResponse(
    val list: String,
    val offset: Int,
)
