package com.okinc.business.market.features.meme.data.model;

import androidx.core.app.FrameMetricsAggregator;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class MediaWsData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final DiscordMediaWsData discord;
    private final FacebookMediaWsData facebook;
    private final InstagramMediaWsData instagram;
    private final String telegram;
    private final TikTokMediaWsData tiktok;
    private final TwitchMediaWsData twitch;
    private final String website;
    private final XMediaWsData x;
    private final YoutubeMediaWsData youtube;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MediaWsData() {
        this((String) null, (String) null, (XMediaWsData) null, (YoutubeMediaWsData) null, (FacebookMediaWsData) null, (TwitchMediaWsData) null, (InstagramMediaWsData) null, (TikTokMediaWsData) null, (DiscordMediaWsData) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    @SerialName("discord")
    public static /* synthetic */ void getDiscord$annotations() {
    }

    @SerialName("facebook")
    public static /* synthetic */ void getFacebook$annotations() {
    }

    @SerialName("insta")
    public static /* synthetic */ void getInstagram$annotations() {
    }

    @SerialName("tg")
    public static /* synthetic */ void getTelegram$annotations() {
    }

    @SerialName(TtmlNode.TAG_TT)
    public static /* synthetic */ void getTiktok$annotations() {
    }

    @SerialName("twitch")
    public static /* synthetic */ void getTwitch$annotations() {
    }

    @SerialName("web")
    public static /* synthetic */ void getWebsite$annotations() {
    }

    @SerialName("x")
    public static /* synthetic */ void getX$annotations() {
    }

    @SerialName("youtb")
    public static /* synthetic */ void getYoutube$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.telegram;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.website;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final XMediaWsData component3() {
        return this.x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final YoutubeMediaWsData component4() {
        return this.youtube;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FacebookMediaWsData component5() {
        return this.facebook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitchMediaWsData component6() {
        return this.twitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InstagramMediaWsData component7() {
        return this.instagram;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TikTokMediaWsData component8() {
        return this.tiktok;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DiscordMediaWsData component9() {
        return this.discord;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MediaWsData copy(@NotNull String str, @NotNull String str2, XMediaWsData xMediaWsData, YoutubeMediaWsData youtubeMediaWsData, FacebookMediaWsData facebookMediaWsData, TwitchMediaWsData twitchMediaWsData, InstagramMediaWsData instagramMediaWsData, TikTokMediaWsData tikTokMediaWsData, DiscordMediaWsData discordMediaWsData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new MediaWsData(str, str2, xMediaWsData, youtubeMediaWsData, facebookMediaWsData, twitchMediaWsData, instagramMediaWsData, tikTokMediaWsData, discordMediaWsData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaWsData)) {
            return false;
        }
        MediaWsData mediaWsData = (MediaWsData) obj;
        return Intrinsics.EZpvd((Object) this.telegram, (Object) mediaWsData.telegram) && Intrinsics.EZpvd((Object) this.website, (Object) mediaWsData.website) && Intrinsics.EZpvd(this.x, mediaWsData.x) && Intrinsics.EZpvd(this.youtube, mediaWsData.youtube) && Intrinsics.EZpvd(this.facebook, mediaWsData.facebook) && Intrinsics.EZpvd(this.twitch, mediaWsData.twitch) && Intrinsics.EZpvd(this.instagram, mediaWsData.instagram) && Intrinsics.EZpvd(this.tiktok, mediaWsData.tiktok) && Intrinsics.EZpvd(this.discord, mediaWsData.discord);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DiscordMediaWsData getDiscord() {
        return this.discord;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FacebookMediaWsData getFacebook() {
        return this.facebook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InstagramMediaWsData getInstagram() {
        return this.instagram;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTelegram() {
        return this.telegram;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TikTokMediaWsData getTiktok() {
        return this.tiktok;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitchMediaWsData getTwitch() {
        return this.twitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWebsite() {
        return this.website;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final XMediaWsData getX() {
        return this.x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final YoutubeMediaWsData getYoutube() {
        return this.youtube;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.telegram.hashCode();
        int iHashCode2 = this.website.hashCode();
        XMediaWsData xMediaWsData = this.x;
        int iHashCode3 = xMediaWsData == null ? 0 : xMediaWsData.hashCode();
        YoutubeMediaWsData youtubeMediaWsData = this.youtube;
        int iHashCode4 = youtubeMediaWsData == null ? 0 : youtubeMediaWsData.hashCode();
        FacebookMediaWsData facebookMediaWsData = this.facebook;
        int iHashCode5 = facebookMediaWsData == null ? 0 : facebookMediaWsData.hashCode();
        TwitchMediaWsData twitchMediaWsData = this.twitch;
        int iHashCode6 = twitchMediaWsData == null ? 0 : twitchMediaWsData.hashCode();
        InstagramMediaWsData instagramMediaWsData = this.instagram;
        int iHashCode7 = instagramMediaWsData == null ? 0 : instagramMediaWsData.hashCode();
        TikTokMediaWsData tikTokMediaWsData = this.tiktok;
        int iHashCode8 = tikTokMediaWsData == null ? 0 : tikTokMediaWsData.hashCode();
        DiscordMediaWsData discordMediaWsData = this.discord;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (discordMediaWsData != null ? discordMediaWsData.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MediaWsData(telegram=" + this.telegram + ", website=" + this.website + ", x=" + this.x + ", youtube=" + this.youtube + ", facebook=" + this.facebook + ", twitch=" + this.twitch + ", instagram=" + this.instagram + ", tiktok=" + this.tiktok + ", discord=" + this.discord + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.data.model.MediaWsData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MediaWsData> serializer() {
            return MediaWsData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MediaWsData(int i, String str, String str2, XMediaWsData xMediaWsData, YoutubeMediaWsData youtubeMediaWsData, FacebookMediaWsData facebookMediaWsData, TwitchMediaWsData twitchMediaWsData, InstagramMediaWsData instagramMediaWsData, TikTokMediaWsData tikTokMediaWsData, DiscordMediaWsData discordMediaWsData, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.telegram = "";
        } else {
            this.telegram = str;
        }
        if ((i & 2) == 0) {
            this.website = "";
        } else {
            this.website = str2;
        }
        if ((i & 4) == 0) {
            this.x = null;
        } else {
            this.x = xMediaWsData;
        }
        if ((i & 8) == 0) {
            this.youtube = null;
        } else {
            this.youtube = youtubeMediaWsData;
        }
        if ((i & 16) == 0) {
            this.facebook = null;
        } else {
            this.facebook = facebookMediaWsData;
        }
        if ((i & 32) == 0) {
            this.twitch = null;
        } else {
            this.twitch = twitchMediaWsData;
        }
        if ((i & 64) == 0) {
            this.instagram = null;
        } else {
            this.instagram = instagramMediaWsData;
        }
        if ((i & 128) == 0) {
            this.tiktok = null;
        } else {
            this.tiktok = tikTokMediaWsData;
        }
        if ((i & 256) == 0) {
            this.discord = null;
        } else {
            this.discord = discordMediaWsData;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(MediaWsData mediaWsData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) mediaWsData.telegram, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, mediaWsData.telegram);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) mediaWsData.website, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, mediaWsData.website);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || mediaWsData.x != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, XMediaWsData$$serializer.INSTANCE, mediaWsData.x);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || mediaWsData.youtube != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, YoutubeMediaWsData$$serializer.INSTANCE, mediaWsData.youtube);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || mediaWsData.facebook != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, FacebookMediaWsData$$serializer.INSTANCE, mediaWsData.facebook);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || mediaWsData.twitch != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, TwitchMediaWsData$$serializer.INSTANCE, mediaWsData.twitch);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || mediaWsData.instagram != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, InstagramMediaWsData$$serializer.INSTANCE, mediaWsData.instagram);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || mediaWsData.tiktok != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, TikTokMediaWsData$$serializer.INSTANCE, mediaWsData.tiktok);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && mediaWsData.discord == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, DiscordMediaWsData$$serializer.INSTANCE, mediaWsData.discord);
    }

    public MediaWsData(@NotNull String str, @NotNull String str2, XMediaWsData xMediaWsData, YoutubeMediaWsData youtubeMediaWsData, FacebookMediaWsData facebookMediaWsData, TwitchMediaWsData twitchMediaWsData, InstagramMediaWsData instagramMediaWsData, TikTokMediaWsData tikTokMediaWsData, DiscordMediaWsData discordMediaWsData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.telegram = str;
        this.website = str2;
        this.x = xMediaWsData;
        this.youtube = youtubeMediaWsData;
        this.facebook = facebookMediaWsData;
        this.twitch = twitchMediaWsData;
        this.instagram = instagramMediaWsData;
        this.tiktok = tikTokMediaWsData;
        this.discord = discordMediaWsData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0055: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r12v0 java.lang.String) : (""))
  (wrap:com.okinc.business.market.features.meme.data.model.XMediaWsData:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.data.model.XMediaWsData) : (r13v0 com.okinc.business.market.features.meme.data.model.XMediaWsData))
  (wrap:com.okinc.business.market.features.meme.data.model.YoutubeMediaWsData:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.data.model.YoutubeMediaWsData) : (r14v0 com.okinc.business.market.features.meme.data.model.YoutubeMediaWsData))
  (wrap:com.okinc.business.market.features.meme.data.model.FacebookMediaWsData:?: TERNARY null = ((wrap:int:0x0020: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.data.model.FacebookMediaWsData) : (r15v0 com.okinc.business.market.features.meme.data.model.FacebookMediaWsData))
  (wrap:com.okinc.business.market.features.meme.data.model.TwitchMediaWsData:?: TERNARY null = ((wrap:int:0x0027: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.data.model.TwitchMediaWsData) : (r16v0 com.okinc.business.market.features.meme.data.model.TwitchMediaWsData))
  (wrap:com.okinc.business.market.features.meme.data.model.InstagramMediaWsData:?: TERNARY null = ((wrap:int:0x002f: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.data.model.InstagramMediaWsData) : (r17v0 com.okinc.business.market.features.meme.data.model.InstagramMediaWsData))
  (wrap:com.okinc.business.market.features.meme.data.model.TikTokMediaWsData:?: TERNARY null = ((wrap:int:0x0037: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.data.model.TikTokMediaWsData) : (r18v0 com.okinc.business.market.features.meme.data.model.TikTokMediaWsData))
  (wrap:com.okinc.business.market.features.meme.data.model.DiscordMediaWsData:?: TERNARY null = ((wrap:int:0x003f: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 com.okinc.business.market.features.meme.data.model.DiscordMediaWsData) : (null com.okinc.business.market.features.meme.data.model.DiscordMediaWsData))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.market.features.meme.data.model.XMediaWsData, com.okinc.business.market.features.meme.data.model.YoutubeMediaWsData, com.okinc.business.market.features.meme.data.model.FacebookMediaWsData, com.okinc.business.market.features.meme.data.model.TwitchMediaWsData, com.okinc.business.market.features.meme.data.model.InstagramMediaWsData, com.okinc.business.market.features.meme.data.model.TikTokMediaWsData, com.okinc.business.market.features.meme.data.model.DiscordMediaWsData):void (m)] (LINE:9) call: com.okinc.business.market.features.meme.data.model.MediaWsData.<init>(java.lang.String, java.lang.String, com.okinc.business.market.features.meme.data.model.XMediaWsData, com.okinc.business.market.features.meme.data.model.YoutubeMediaWsData, com.okinc.business.market.features.meme.data.model.FacebookMediaWsData, com.okinc.business.market.features.meme.data.model.TwitchMediaWsData, com.okinc.business.market.features.meme.data.model.InstagramMediaWsData, com.okinc.business.market.features.meme.data.model.TikTokMediaWsData, com.okinc.business.market.features.meme.data.model.DiscordMediaWsData):void type: THIS */
    public /* synthetic */ MediaWsData(String str, String str2, XMediaWsData xMediaWsData, YoutubeMediaWsData youtubeMediaWsData, FacebookMediaWsData facebookMediaWsData, TwitchMediaWsData twitchMediaWsData, InstagramMediaWsData instagramMediaWsData, TikTokMediaWsData tikTokMediaWsData, DiscordMediaWsData discordMediaWsData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? null : xMediaWsData, (i & 8) != 0 ? null : youtubeMediaWsData, (i & 16) != 0 ? null : facebookMediaWsData, (i & 32) != 0 ? null : twitchMediaWsData, (i & 64) != 0 ? null : instagramMediaWsData, (i & 128) != 0 ? null : tikTokMediaWsData, (i & 256) == 0 ? discordMediaWsData : null);
    }
}
