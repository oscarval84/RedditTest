import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RedditResponse(
    @SerialName("data") val `data`: Data? = Data(),
    @SerialName("kind") val kind: String? = "",
)

@Serializable
data class Data(
    @SerialName("children") val children: List<Children>? = listOf(),
)

@Serializable
data class Children(
    @SerialName("data")
    val `data`: DataX? = DataX(),
)

@Serializable
data class DataX(
    @SerialName("allow_live_comments")
    val allowLiveComments: Boolean? = false,
    @SerialName("archived")
    val archived: Boolean? = false,
    @SerialName("author")
    val author: String? = "",
    @SerialName("author_flair_background_color")
    val authorFlairBackgroundColor: String? = "",
    @SerialName("author_flair_richtext")
    val authorFlairRichtext: List<AuthorFlairRichtext>? = listOf(),
    @SerialName("author_flair_template_id")
    val authorFlairTemplateId: String? = "",
    @SerialName("author_flair_text")
    val authorFlairText: String? = "",
    @SerialName("author_flair_text_color")
    val authorFlairTextColor: String? = "",
    @SerialName("author_flair_type")
    val authorFlairType: String? = "",
    @SerialName("author_fullname")
    val authorFullname: String? = "",
    @SerialName("author_is_blocked")
    val authorIsBlocked: Boolean? = false,
    @SerialName("author_patreon_flair")
    val authorPatreonFlair: Boolean? = false,
    @SerialName("author_premium")
    val authorPremium: Boolean? = false,
    @SerialName("can_gild")
    val canGild: Boolean? = false,
    @SerialName("can_mod_post")
    val canModPost: Boolean? = false,
    @SerialName("clicked")
    val clicked: Boolean? = false,
    @SerialName("content_categories")
    val contentCategories: List<String>? = listOf(),
    @SerialName("contest_mode")
    val contestMode: Boolean? = false,
    @SerialName("created")
    val created: Double? = 0.0,
    @SerialName("created_utc")
    val createdUtc: Double? = 0.0,
    @SerialName("domain")
    val domain: String? = "",
    @SerialName("downs")
    val downs: Int? = 0,
    @SerialName("gallery_data")
    val galleryData: GalleryData? = GalleryData(),
    @SerialName("gilded")
    val gilded: Int? = 0,
    @SerialName("gildings")
    val gildings: Gildings? = Gildings(),
    @SerialName("hidden")
    val hidden: Boolean? = false,
    @SerialName("hide_score")
    val hideScore: Boolean? = false,
    @SerialName("id")
    val id: String? = "",
    @SerialName("is_created_from_ads_ui")
    val isCreatedFromAdsUi: Boolean? = false,
    @SerialName("is_crosspostable")
    val isCrosspostable: Boolean? = false,
    @SerialName("is_gallery")
    val isGallery: Boolean? = false,
    @SerialName("is_meta")
    val isMeta: Boolean? = false,
    @SerialName("is_original_content")
    val isOriginalContent: Boolean? = false,
    @SerialName("is_reddit_media_domain")
    val isRedditMediaDomain: Boolean? = false,
    @SerialName("is_robot_indexable")
    val isRobotIndexable: Boolean? = false,
    @SerialName("is_self")
    val isSelf: Boolean? = false,
    @SerialName("is_video")
    val isVideo: Boolean? = false,
    @SerialName("link_flair_background_color")
    val linkFlairBackgroundColor: String? = "",
    @SerialName("link_flair_css_class")
    val linkFlairCssClass: String? = "",
    @SerialName("link_flair_richtext")
    val linkFlairRichtext: List<LinkFlairRichtext>? = listOf(),
    @SerialName("link_flair_template_id")
    val linkFlairTemplateId: String? = "",
    @SerialName("link_flair_text")
    val linkFlairText: String? = "",
    @SerialName("link_flair_text_color")
    val linkFlairTextColor: String? = "",
    @SerialName("link_flair_type")
    val linkFlairType: String? = "",
    @SerialName("locked")
    val locked: Boolean? = false,
    @SerialName("media")
    val media: Media? = Media(),
    @SerialName("media_embed")
    val mediaEmbed: MediaEmbed? = MediaEmbed(),
    @SerialName("media_only")
    val mediaOnly: Boolean? = false,
    @SerialName("name")
    val name: String? = "",
    @SerialName("no_follow")
    val noFollow: Boolean? = false,
    @SerialName("num_comments")
    val numComments: Int? = 0,
    @SerialName("num_crossposts")
    val numCrossposts: Int? = 0,
    @SerialName("over_18")
    val over18: Boolean? = false,
    @SerialName("parent_whitelist_status")
    val parentWhitelistStatus: String? = "",
    @SerialName("permalink")
    val permalink: String? = "",
    @SerialName("pinned")
    val pinned: Boolean? = false,
    @SerialName("post_hint")
    val postHint: String? = "",
    @SerialName("preview")
    val preview: Preview? = Preview(),
    @SerialName("pwls")
    val pwls: Int? = 0,
    @SerialName("quarantine")
    val quarantine: Boolean? = false,
    @SerialName("saved")
    val saved: Boolean? = false,
    @SerialName("score")
    val score: Int? = 0,
    @SerialName("secure_media")
    val secureMedia: SecureMedia? = SecureMedia(),
    @SerialName("secure_media_embed")
    val secureMediaEmbed: SecureMediaEmbed? = SecureMediaEmbed(),
    @SerialName("selftext")
    val selftext: String? = "",
    @SerialName("selftext_html")
    val selftextHtml: String? = "",
    @SerialName("send_replies")
    val sendReplies: Boolean? = false,
    @SerialName("spoiler")
    val spoiler: Boolean? = false,
    @SerialName("stickied")
    val stickied: Boolean? = false,
    @SerialName("subreddit")
    val subreddit: String? = "",
    @SerialName("subreddit_id")
    val subredditId: String? = "",
    @SerialName("subreddit_name_prefixed")
    val subredditNamePrefixed: String? = "",
    @SerialName("subreddit_subscribers")
    val subredditSubscribers: Int? = 0,
    @SerialName("subreddit_type")
    val subredditType: String? = "",
    @SerialName("suggested_sort")
    val suggestedSort: String? = "",
    @SerialName("thumbnail")
    val thumbnail: String? = "",
    @SerialName("thumbnail_height")
    val thumbnailHeight: Int? = 0,
    @SerialName("thumbnail_width")
    val thumbnailWidth: Int? = 0,
    @SerialName("title")
    val title: String? = "",
    @SerialName("total_awards_received")
    val totalAwardsReceived: Int? = 0,
    @SerialName("ups")
    val ups: Int? = 0,
    @SerialName("upvote_ratio")
    val upvoteRatio: Double? = 0.0,
    @SerialName("url")
    val url: String? = "",
    @SerialName("url_overridden_by_dest")
    val urlOverriddenByDest: String? = "",
    @SerialName("visited")
    val visited: Boolean? = false,
    @SerialName("whitelist_status")
    val whitelistStatus: String? = "",
    @SerialName("wls")
    val wls: Int? = 0,
)

@Serializable
data class AuthorFlairRichtext(
    @SerialName("a")
    val a: String? = null,
    @SerialName("e")
    val e: String? = null,
    @SerialName("u")
    val u: String? = null,
)

@Serializable
data class GalleryData(
    @SerialName("items")
    val items: List<Item?>? = null,
)

@Serializable
class Gildings

@Serializable
data class LinkFlairRichtext(
    @SerialName("a")
    val a: String? = null,
    @SerialName("e")
    val e: String? = null,
    @SerialName("t")
    val t: String? = null,
    @SerialName("u")
    val u: String? = null,
)

@Serializable
data class Media(
    @SerialName("oembed")
    val oembed: Oembed? = null,
    @SerialName("reddit_video")
    val redditVideo: RedditVideo? = null,
    @SerialName("type")
    val type: String? = null,
)

@Serializable
data class MediaEmbed(
    @SerialName("content")
    val content: String? = null,
    @SerialName("height")
    val height: Int? = null,
    @SerialName("scrolling")
    val scrolling: Boolean? = null,
    @SerialName("width")
    val width: Int? = null,
)

@Serializable
data class Preview(
    @SerialName("enabled")
    val enabled: Boolean? = null,
    @SerialName("images")
    val images: List<Image?>? = null,
)

@Serializable
data class SecureMedia(
    @SerialName("oembed")
    val oembed: Oembed? = Oembed(),
    @SerialName("reddit_video")
    val redditVideo: RedditVideo? = RedditVideo(),
    @SerialName("type")
    val type: String? = "",
)

@Serializable
data class SecureMediaEmbed(
    @SerialName("content")
    val content: String? = null,
    @SerialName("height")
    val height: Int? = null,
    @SerialName("media_domain_url")
    val mediaDomainUrl: String? = null,
    @SerialName("scrolling")
    val scrolling: Boolean? = null,
    @SerialName("width")
    val width: Int? = null,
)

@Serializable
data class Item(
    @SerialName("id")
    val id: Int? = null,
    @SerialName("media_id")
    val mediaId: String? = null,
)

@Serializable
data class Oembed(
    @SerialName("author_name")
    val authorName: String? = null,
    @SerialName("author_url")
    val authorUrl: String? = null,
    @SerialName("cache_age")
    val cacheAge: Long? = null,
    @SerialName("html")
    val html: String? = null,
    @SerialName("provider_name")
    val providerName: String? = null,
    @SerialName("provider_url")
    val providerUrl: String? = null,
    @SerialName("type")
    val type: String? = null,
    @SerialName("url")
    val url: String? = null,
    @SerialName("version")
    val version: String? = null,
    @SerialName("width")
    val width: Int? = null,
)

@Serializable
data class RedditVideo(
    @SerialName("bitrate_kbps")
    val bitrateKbps: Int? = null,
    @SerialName("dash_url")
    val dashUrl: String? = null,
    @SerialName("duration")
    val duration: Int? = null,
    @SerialName("fallback_url")
    val fallbackUrl: String? = null,
    @SerialName("has_audio")
    val hasAudio: Boolean? = null,
    @SerialName("height")
    val height: Int? = null,
    @SerialName("hls_url")
    val hlsUrl: String? = null,
    @SerialName("is_gif")
    val isGif: Boolean? = null,
    @SerialName("scrubber_media_url")
    val scrubberMediaUrl: String? = null,
    @SerialName("transcoding_status")
    val transcodingStatus: String? = null,
    @SerialName("width")
    val width: Int? = null,
)

@Serializable
data class Image(
    @SerialName("id")
    val id: String? = null,
    @SerialName("resolutions")
    val resolutions: List<Resolution?>? = null,
    @SerialName("source")
    val source: Source? = null,
)

@Serializable
data class Resolution(
    @SerialName("height")
    val height: Int? = null,
    @SerialName("url")
    val url: String? = null,
    @SerialName("width")
    val width: Int? = null,
)

@Serializable
data class Source(
    @SerialName("height")
    val height: Int? = null,
    @SerialName("url")
    val url: String? = null,
    @SerialName("width")
    val width: Int? = null,
)
