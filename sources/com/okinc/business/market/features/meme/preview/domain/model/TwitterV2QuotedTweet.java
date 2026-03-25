package com.okinc.business.market.features.meme.preview.domain.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class TwitterV2QuotedTweet {
    private final long bookmarkCount;
    private final String contentId;
    private final String createdAt;
    private final List<Integer> displayTextRange;
    private final TwitterV2Entities entities;
    private final String idStr;
    private final String lang;
    private final long likeCount;
    private final List<TwitterV2MediaDetail> mediaDetails;
    private final long quoteCount;
    private final TwitterV2QuotedTweet quotedTweet;
    private final TwitterReferenceType referencedType;
    private final long replyCount;
    private final long retweetCount;
    private final String sourceLanguage;
    private final String text;
    private final String translatedLanguage;
    private final String translatedText;
    private final String url;
    private final TwitterV2User user;
    private final long viewCount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null, null, null, null, new ArrayListSerializer(TwitterV2MediaDetail$$serializer.INSTANCE), null, null, TwitterReferenceType.Companion.serializer(), null, null, null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TwitterV2QuotedTweet() {
        this(0L, (String) null, (String) null, (List) null, (TwitterV2Entities) null, (String) null, (String) null, 0L, (List) null, 0L, (TwitterV2QuotedTweet) null, (TwitterReferenceType) null, 0L, 0L, (String) null, (String) null, (String) null, (String) null, (String) null, (TwitterV2User) null, 0L, 2097151, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: com.okinc.business.market.features.meme.preview.domain.model.TwitterV2QuotedTweet */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TwitterV2QuotedTweet copy$default(TwitterV2QuotedTweet twitterV2QuotedTweet, long j, String str, String str2, List list, TwitterV2Entities twitterV2Entities, String str3, String str4, long j2, List list2, long j3, TwitterV2QuotedTweet twitterV2QuotedTweet2, TwitterReferenceType twitterReferenceType, long j4, long j5, String str5, String str6, String str7, String str8, String str9, TwitterV2User twitterV2User, long j6, int i, Object obj) {
        long j7 = (i & 1) != 0 ? twitterV2QuotedTweet.bookmarkCount : j;
        String str10 = (i & 2) != 0 ? twitterV2QuotedTweet.contentId : str;
        String str11 = (i & 4) != 0 ? twitterV2QuotedTweet.createdAt : str2;
        List list3 = (i & 8) != 0 ? twitterV2QuotedTweet.displayTextRange : list;
        TwitterV2Entities twitterV2Entities2 = (i & 16) != 0 ? twitterV2QuotedTweet.entities : twitterV2Entities;
        String str12 = (i & 32) != 0 ? twitterV2QuotedTweet.idStr : str3;
        String str13 = (i & 64) != 0 ? twitterV2QuotedTweet.lang : str4;
        long j8 = (i & 128) != 0 ? twitterV2QuotedTweet.likeCount : j2;
        List list4 = (i & 256) != 0 ? twitterV2QuotedTweet.mediaDetails : list2;
        long j9 = (i & 512) != 0 ? twitterV2QuotedTweet.quoteCount : j3;
        return twitterV2QuotedTweet.copy(j7, str10, str11, list3, twitterV2Entities2, str12, str13, j8, list4, j9, (i & 1024) != 0 ? twitterV2QuotedTweet.quotedTweet : twitterV2QuotedTweet2, (i & 2048) != 0 ? twitterV2QuotedTweet.referencedType : twitterReferenceType, (i & 4096) != 0 ? twitterV2QuotedTweet.replyCount : j4, (i & 8192) != 0 ? twitterV2QuotedTweet.retweetCount : j5, (i & 16384) != 0 ? twitterV2QuotedTweet.sourceLanguage : str5, (i & 32768) != 0 ? twitterV2QuotedTweet.text : str6, (i & 65536) != 0 ? twitterV2QuotedTweet.translatedLanguage : str7, (i & 131072) != 0 ? twitterV2QuotedTweet.translatedText : str8, (i & 262144) != 0 ? twitterV2QuotedTweet.url : str9, (i & 524288) != 0 ? twitterV2QuotedTweet.user : twitterV2User, (i & 1048576) != 0 ? twitterV2QuotedTweet.viewCount : j6);
    }

    @SerialName("bookmarkCount")
    public static /* synthetic */ void getBookmarkCount$annotations() {
    }

    @SerialName("contentId")
    public static /* synthetic */ void getContentId$annotations() {
    }

    @SerialName("createdAt")
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @SerialName("displayTextRange")
    public static /* synthetic */ void getDisplayTextRange$annotations() {
    }

    @SerialName("entities")
    public static /* synthetic */ void getEntities$annotations() {
    }

    @SerialName("idStr")
    public static /* synthetic */ void getIdStr$annotations() {
    }

    @SerialName("lang")
    public static /* synthetic */ void getLang$annotations() {
    }

    @SerialName("likeCount")
    public static /* synthetic */ void getLikeCount$annotations() {
    }

    @SerialName("mediaDetails")
    public static /* synthetic */ void getMediaDetails$annotations() {
    }

    @SerialName("quoteCount")
    public static /* synthetic */ void getQuoteCount$annotations() {
    }

    @SerialName("quotedTweet")
    public static /* synthetic */ void getQuotedTweet$annotations() {
    }

    @SerialName("referencedType")
    public static /* synthetic */ void getReferencedType$annotations() {
    }

    @SerialName("replyCount")
    public static /* synthetic */ void getReplyCount$annotations() {
    }

    @SerialName("retweetCount")
    public static /* synthetic */ void getRetweetCount$annotations() {
    }

    @SerialName("sourceLanguage")
    public static /* synthetic */ void getSourceLanguage$annotations() {
    }

    @SerialName("text")
    public static /* synthetic */ void getText$annotations() {
    }

    @SerialName("translatedLanguage")
    public static /* synthetic */ void getTranslatedLanguage$annotations() {
    }

    @SerialName("translatedText")
    public static /* synthetic */ void getTranslatedText$annotations() {
    }

    @SerialName("url")
    public static /* synthetic */ void getUrl$annotations() {
    }

    @SerialName("user")
    public static /* synthetic */ void getUser$annotations() {
    }

    @SerialName("viewCount")
    public static /* synthetic */ void getViewCount$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.bookmarkCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component10() {
        return this.quoteCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitterV2QuotedTweet component11() {
        return this.quotedTweet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitterReferenceType component12() {
        return this.referencedType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component13() {
        return this.replyCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component14() {
        return this.retweetCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.sourceLanguage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.translatedLanguage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.translatedText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.contentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitterV2User component20() {
        return this.user;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component21() {
        return this.viewCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.createdAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component4() {
        return this.displayTextRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitterV2Entities component5() {
        return this.entities;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.idStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.lang;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component8() {
        return this.likeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TwitterV2MediaDetail> component9() {
        return this.mediaDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitterV2QuotedTweet copy(long j, String str, String str2, @NotNull List<Integer> list, TwitterV2Entities twitterV2Entities, String str3, String str4, long j2, @NotNull List<TwitterV2MediaDetail> list2, long j3, TwitterV2QuotedTweet twitterV2QuotedTweet, @NotNull TwitterReferenceType twitterReferenceType, long j4, long j5, String str5, String str6, String str7, String str8, String str9, TwitterV2User twitterV2User, long j6) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(twitterReferenceType, "");
        return new TwitterV2QuotedTweet(j, str, str2, list, twitterV2Entities, str3, str4, j2, list2, j3, twitterV2QuotedTweet, twitterReferenceType, j4, j5, str5, str6, str7, str8, str9, twitterV2User, j6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TwitterV2QuotedTweet)) {
            return false;
        }
        TwitterV2QuotedTweet twitterV2QuotedTweet = (TwitterV2QuotedTweet) obj;
        return this.bookmarkCount == twitterV2QuotedTweet.bookmarkCount && Intrinsics.EZpvd((Object) this.contentId, (Object) twitterV2QuotedTweet.contentId) && Intrinsics.EZpvd((Object) this.createdAt, (Object) twitterV2QuotedTweet.createdAt) && Intrinsics.EZpvd(this.displayTextRange, twitterV2QuotedTweet.displayTextRange) && Intrinsics.EZpvd(this.entities, twitterV2QuotedTweet.entities) && Intrinsics.EZpvd((Object) this.idStr, (Object) twitterV2QuotedTweet.idStr) && Intrinsics.EZpvd((Object) this.lang, (Object) twitterV2QuotedTweet.lang) && this.likeCount == twitterV2QuotedTweet.likeCount && Intrinsics.EZpvd(this.mediaDetails, twitterV2QuotedTweet.mediaDetails) && this.quoteCount == twitterV2QuotedTweet.quoteCount && Intrinsics.EZpvd(this.quotedTweet, twitterV2QuotedTweet.quotedTweet) && this.referencedType == twitterV2QuotedTweet.referencedType && this.replyCount == twitterV2QuotedTweet.replyCount && this.retweetCount == twitterV2QuotedTweet.retweetCount && Intrinsics.EZpvd((Object) this.sourceLanguage, (Object) twitterV2QuotedTweet.sourceLanguage) && Intrinsics.EZpvd((Object) this.text, (Object) twitterV2QuotedTweet.text) && Intrinsics.EZpvd((Object) this.translatedLanguage, (Object) twitterV2QuotedTweet.translatedLanguage) && Intrinsics.EZpvd((Object) this.translatedText, (Object) twitterV2QuotedTweet.translatedText) && Intrinsics.EZpvd((Object) this.url, (Object) twitterV2QuotedTweet.url) && Intrinsics.EZpvd(this.user, twitterV2QuotedTweet.user) && this.viewCount == twitterV2QuotedTweet.viewCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getBookmarkCount() {
        return this.bookmarkCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContentId() {
        return this.contentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getDisplayTextRange() {
        return this.displayTextRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitterV2Entities getEntities() {
        return this.entities;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIdStr() {
        return this.idStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLang() {
        return this.lang;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getLikeCount() {
        return this.likeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TwitterV2MediaDetail> getMediaDetails() {
        return this.mediaDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getQuoteCount() {
        return this.quoteCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitterV2QuotedTweet getQuotedTweet() {
        return this.quotedTweet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitterReferenceType getReferencedType() {
        return this.referencedType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getReplyCount() {
        return this.replyCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getRetweetCount() {
        return this.retweetCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceLanguage() {
        return this.sourceLanguage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTranslatedLanguage() {
        return this.translatedLanguage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTranslatedText() {
        return this.translatedText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitterV2User getUser() {
        return this.user;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getViewCount() {
        return this.viewCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.bookmarkCount);
        String str = this.contentId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.createdAt;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        int iHashCode4 = this.displayTextRange.hashCode();
        TwitterV2Entities twitterV2Entities = this.entities;
        int iHashCode5 = twitterV2Entities == null ? 0 : twitterV2Entities.hashCode();
        String str3 = this.idStr;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.lang;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        int iHashCode8 = Long.hashCode(this.likeCount);
        int iHashCode9 = this.mediaDetails.hashCode();
        int iHashCode10 = Long.hashCode(this.quoteCount);
        TwitterV2QuotedTweet twitterV2QuotedTweet = this.quotedTweet;
        int iHashCode11 = twitterV2QuotedTweet == null ? 0 : twitterV2QuotedTweet.hashCode();
        int iHashCode12 = this.referencedType.hashCode();
        int iHashCode13 = Long.hashCode(this.replyCount);
        int i = iHashCode3;
        int iHashCode14 = Long.hashCode(this.retweetCount);
        String str5 = this.sourceLanguage;
        int iHashCode15 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.text;
        int iHashCode16 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.translatedLanguage;
        int iHashCode17 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.translatedText;
        int iHashCode18 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.url;
        int iHashCode19 = str9 == null ? 0 : str9.hashCode();
        TwitterV2User twitterV2User = this.user;
        return (((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + i) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + (twitterV2User == null ? 0 : twitterV2User.hashCode())) * 31) + Long.hashCode(this.viewCount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TwitterV2QuotedTweet(bookmarkCount=" + this.bookmarkCount + ", contentId=" + this.contentId + ", createdAt=" + this.createdAt + ", displayTextRange=" + this.displayTextRange + ", entities=" + this.entities + ", idStr=" + this.idStr + ", lang=" + this.lang + ", likeCount=" + this.likeCount + ", mediaDetails=" + this.mediaDetails + ", quoteCount=" + this.quoteCount + ", quotedTweet=" + this.quotedTweet + ", referencedType=" + this.referencedType + ", replyCount=" + this.replyCount + ", retweetCount=" + this.retweetCount + ", sourceLanguage=" + this.sourceLanguage + ", text=" + this.text + ", translatedLanguage=" + this.translatedLanguage + ", translatedText=" + this.translatedText + ", url=" + this.url + ", user=" + this.user + ", viewCount=" + this.viewCount + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.preview.domain.model.TwitterV2QuotedTweet.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TwitterV2QuotedTweet> serializer() {
            return TwitterV2QuotedTweet$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TwitterV2QuotedTweet(int i, long j, String str, String str2, List list, TwitterV2Entities twitterV2Entities, String str3, String str4, long j2, List list2, long j3, TwitterV2QuotedTweet twitterV2QuotedTweet, TwitterReferenceType twitterReferenceType, long j4, long j5, String str5, String str6, String str7, String str8, String str9, TwitterV2User twitterV2User, long j6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.bookmarkCount = 0L;
        } else {
            this.bookmarkCount = j;
        }
        if ((i & 2) == 0) {
            this.contentId = null;
        } else {
            this.contentId = str;
        }
        if ((i & 4) == 0) {
            this.createdAt = null;
        } else {
            this.createdAt = str2;
        }
        this.displayTextRange = (i & 8) == 0 ? yDY.AhwBna() : list;
        if ((i & 16) == 0) {
            this.entities = null;
        } else {
            this.entities = twitterV2Entities;
        }
        if ((i & 32) == 0) {
            this.idStr = null;
        } else {
            this.idStr = str3;
        }
        if ((i & 64) == 0) {
            this.lang = null;
        } else {
            this.lang = str4;
        }
        if ((i & 128) == 0) {
            this.likeCount = 0L;
        } else {
            this.likeCount = j2;
        }
        this.mediaDetails = (i & 256) == 0 ? yDY.AhwBna() : list2;
        if ((i & 512) == 0) {
            this.quoteCount = 0L;
        } else {
            this.quoteCount = j3;
        }
        if ((i & 1024) == 0) {
            this.quotedTweet = null;
        } else {
            this.quotedTweet = twitterV2QuotedTweet;
        }
        this.referencedType = (i & 2048) == 0 ? TwitterReferenceType.UNKNOWN : twitterReferenceType;
        if ((i & 4096) == 0) {
            this.replyCount = 0L;
        } else {
            this.replyCount = j4;
        }
        if ((i & 8192) == 0) {
            this.retweetCount = 0L;
        } else {
            this.retweetCount = j5;
        }
        if ((i & 16384) == 0) {
            this.sourceLanguage = null;
        } else {
            this.sourceLanguage = str5;
        }
        if ((32768 & i) == 0) {
            this.text = null;
        } else {
            this.text = str6;
        }
        if ((65536 & i) == 0) {
            this.translatedLanguage = null;
        } else {
            this.translatedLanguage = str7;
        }
        if ((131072 & i) == 0) {
            this.translatedText = null;
        } else {
            this.translatedText = str8;
        }
        if ((262144 & i) == 0) {
            this.url = null;
        } else {
            this.url = str9;
        }
        if ((524288 & i) == 0) {
            this.user = null;
        } else {
            this.user = twitterV2User;
        }
        if ((i & 1048576) == 0) {
            this.viewCount = 0L;
        } else {
            this.viewCount = j6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [206=4] */
    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TwitterV2QuotedTweet twitterV2QuotedTweet, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || twitterV2QuotedTweet.bookmarkCount != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, twitterV2QuotedTweet.bookmarkCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || twitterV2QuotedTweet.contentId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, twitterV2QuotedTweet.contentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || twitterV2QuotedTweet.createdAt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, twitterV2QuotedTweet.createdAt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(twitterV2QuotedTweet.displayTextRange, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], twitterV2QuotedTweet.displayTextRange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || twitterV2QuotedTweet.entities != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, TwitterV2Entities$$serializer.INSTANCE, twitterV2QuotedTweet.entities);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || twitterV2QuotedTweet.idStr != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, twitterV2QuotedTweet.idStr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || twitterV2QuotedTweet.lang != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, twitterV2QuotedTweet.lang);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || twitterV2QuotedTweet.likeCount != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 7, twitterV2QuotedTweet.likeCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(twitterV2QuotedTweet.mediaDetails, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], twitterV2QuotedTweet.mediaDetails);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || twitterV2QuotedTweet.quoteCount != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 9, twitterV2QuotedTweet.quoteCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || twitterV2QuotedTweet.quotedTweet != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, TwitterV2QuotedTweet$$serializer.INSTANCE, twitterV2QuotedTweet.quotedTweet);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || twitterV2QuotedTweet.referencedType != TwitterReferenceType.UNKNOWN) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], twitterV2QuotedTweet.referencedType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || twitterV2QuotedTweet.replyCount != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 12, twitterV2QuotedTweet.replyCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || twitterV2QuotedTweet.retweetCount != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 13, twitterV2QuotedTweet.retweetCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || twitterV2QuotedTweet.sourceLanguage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, twitterV2QuotedTweet.sourceLanguage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || twitterV2QuotedTweet.text != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, twitterV2QuotedTweet.text);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || twitterV2QuotedTweet.translatedLanguage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, twitterV2QuotedTweet.translatedLanguage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || twitterV2QuotedTweet.translatedText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, twitterV2QuotedTweet.translatedText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || twitterV2QuotedTweet.url != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, twitterV2QuotedTweet.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || twitterV2QuotedTweet.user != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, TwitterV2User$$serializer.INSTANCE, twitterV2QuotedTweet.user);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) && twitterV2QuotedTweet.viewCount == 0) {
            return;
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 20, twitterV2QuotedTweet.viewCount);
    }

    public TwitterV2QuotedTweet(long j, String str, String str2, @NotNull List<Integer> list, TwitterV2Entities twitterV2Entities, String str3, String str4, long j2, @NotNull List<TwitterV2MediaDetail> list2, long j3, TwitterV2QuotedTweet twitterV2QuotedTweet, @NotNull TwitterReferenceType twitterReferenceType, long j4, long j5, String str5, String str6, String str7, String str8, String str9, TwitterV2User twitterV2User, long j6) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(twitterReferenceType, "");
        this.bookmarkCount = j;
        this.contentId = str;
        this.createdAt = str2;
        this.displayTextRange = list;
        this.entities = twitterV2Entities;
        this.idStr = str3;
        this.lang = str4;
        this.likeCount = j2;
        this.mediaDetails = list2;
        this.quoteCount = j3;
        this.quotedTweet = twitterV2QuotedTweet;
        this.referencedType = twitterReferenceType;
        this.replyCount = j4;
        this.retweetCount = j5;
        this.sourceLanguage = str5;
        this.text = str6;
        this.translatedLanguage = str7;
        this.translatedText = str8;
        this.url = str9;
        this.user = twitterV2User;
        this.viewCount = j6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00f5: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r57v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r30v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r57v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r57v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001b: ARITH (r57v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:216)) : (r34v0 java.util.List))
  (wrap:com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Entities:?: TERNARY null = ((wrap:int:0x0026: ARITH (r57v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Entities) : (r35v0 com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Entities))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r57v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r57v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x003e: ARITH (r57v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r38v0 long))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0047: ARITH (r57v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004b: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:226)) : (r40v0 java.util.List))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0052: ARITH (r57v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r41v0 long))
  (wrap:com.okinc.business.market.features.meme.preview.domain.model.TwitterV2QuotedTweet:?: TERNARY null = ((wrap:int:0x005b: ARITH (r57v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.preview.domain.model.TwitterV2QuotedTweet) : (r43v0 com.okinc.business.market.features.meme.preview.domain.model.TwitterV2QuotedTweet))
  (wrap:com.okinc.business.market.features.meme.preview.domain.model.TwitterReferenceType:?: TERNARY null = ((wrap:int:0x0063: ARITH (r57v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0067: SGET  A[WRAPPED] (LINE:232) com.okinc.business.market.features.meme.preview.domain.model.TwitterReferenceType.UNKNOWN com.okinc.business.market.features.meme.preview.domain.model.TwitterReferenceType) : (r44v0 com.okinc.business.market.features.meme.preview.domain.model.TwitterReferenceType))
  (wrap:long:?: TERNARY null = ((wrap:int:0x006c: ARITH (r57v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r45v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0075: ARITH (r57v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r47v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007e: ARITH (r57v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0089: ARITH (r57v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0094: ARITH (r57v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009f: ARITH (r57v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00aa: ARITH (r57v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r53v0 java.lang.String))
  (wrap:com.okinc.business.market.features.meme.preview.domain.model.TwitterV2User:?: TERNARY null = ((wrap:int:0x00b5: ARITH (r57v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.preview.domain.model.TwitterV2User) : (r54v0 com.okinc.business.market.features.meme.preview.domain.model.TwitterV2User))
  (wrap:long:?: TERNARY null = ((wrap:int:0x00c0: ARITH (r57v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r55v0 long))
 A[MD:(long, java.lang.String, java.lang.String, java.util.List<java.lang.Integer>, com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Entities, java.lang.String, java.lang.String, long, java.util.List<com.okinc.business.market.features.meme.preview.domain.model.TwitterV2MediaDetail>, long, com.okinc.business.market.features.meme.preview.domain.model.TwitterV2QuotedTweet, com.okinc.business.market.features.meme.preview.domain.model.TwitterReferenceType, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.features.meme.preview.domain.model.TwitterV2User, long):void (m)] (LINE:208) call: com.okinc.business.market.features.meme.preview.domain.model.TwitterV2QuotedTweet.<init>(long, java.lang.String, java.lang.String, java.util.List, com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Entities, java.lang.String, java.lang.String, long, java.util.List, long, com.okinc.business.market.features.meme.preview.domain.model.TwitterV2QuotedTweet, com.okinc.business.market.features.meme.preview.domain.model.TwitterReferenceType, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.features.meme.preview.domain.model.TwitterV2User, long):void type: THIS */
    public /* synthetic */ TwitterV2QuotedTweet(long j, String str, String str2, List list, TwitterV2Entities twitterV2Entities, String str3, String str4, long j2, List list2, long j3, TwitterV2QuotedTweet twitterV2QuotedTweet, TwitterReferenceType twitterReferenceType, long j4, long j5, String str5, String str6, String str7, String str8, String str9, TwitterV2User twitterV2User, long j6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? yDY.AhwBna() : list, (i & 16) != 0 ? null : twitterV2Entities, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? 0L : j2, (i & 256) != 0 ? yDY.AhwBna() : list2, (i & 512) != 0 ? 0L : j3, (i & 1024) != 0 ? null : twitterV2QuotedTweet, (i & 2048) != 0 ? TwitterReferenceType.UNKNOWN : twitterReferenceType, (i & 4096) != 0 ? 0L : j4, (i & 8192) != 0 ? 0L : j5, (i & 16384) != 0 ? null : str5, (i & 32768) != 0 ? null : str6, (i & 65536) != 0 ? null : str7, (i & 131072) != 0 ? null : str8, (i & 262144) != 0 ? null : str9, (i & 524288) != 0 ? null : twitterV2User, (i & 1048576) != 0 ? 0L : j6);
    }
}
