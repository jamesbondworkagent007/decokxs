package com.okinc.business.market.features.meme.data.model;

import androidx.core.app.FrameMetricsAggregator;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.business.market.features.meme.domain.model.DiscordMedia;
import com.okinc.business.market.features.meme.domain.model.FacebookMedia;
import com.okinc.business.market.features.meme.domain.model.InstagramMedia;
import com.okinc.business.market.features.meme.domain.model.Media;
import com.okinc.business.market.features.meme.domain.model.TikTokMedia;
import com.okinc.business.market.features.meme.domain.model.TwitchMedia;
import com.okinc.business.market.features.meme.domain.model.XMedia;
import com.okinc.business.market.features.meme.domain.model.YoutubeMedia;
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
public final class MediaV2Data {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final DiscordMediaV2Data discord;
    private final FacebookMediaV2Data facebook;
    private final InstagramMediaV2Data instagram;
    private final String telegram;
    private final TikTokMediaV2Data tiktok;
    private final TwitchMediaV2Data twitch;
    private final String website;
    private final XMediaV2Data x;
    private final YoutubeMediaV2Data youtube;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MediaV2Data() {
        this((String) null, (String) null, (XMediaV2Data) null, (YoutubeMediaV2Data) null, (FacebookMediaV2Data) null, (TwitchMediaV2Data) null, (InstagramMediaV2Data) null, (TikTokMediaV2Data) null, (DiscordMediaV2Data) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
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
    public final XMediaV2Data component3() {
        return this.x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final YoutubeMediaV2Data component4() {
        return this.youtube;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FacebookMediaV2Data component5() {
        return this.facebook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitchMediaV2Data component6() {
        return this.twitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InstagramMediaV2Data component7() {
        return this.instagram;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TikTokMediaV2Data component8() {
        return this.tiktok;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DiscordMediaV2Data component9() {
        return this.discord;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MediaV2Data copy(@NotNull String str, @NotNull String str2, XMediaV2Data xMediaV2Data, YoutubeMediaV2Data youtubeMediaV2Data, FacebookMediaV2Data facebookMediaV2Data, TwitchMediaV2Data twitchMediaV2Data, InstagramMediaV2Data instagramMediaV2Data, TikTokMediaV2Data tikTokMediaV2Data, DiscordMediaV2Data discordMediaV2Data) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new MediaV2Data(str, str2, xMediaV2Data, youtubeMediaV2Data, facebookMediaV2Data, twitchMediaV2Data, instagramMediaV2Data, tikTokMediaV2Data, discordMediaV2Data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaV2Data)) {
            return false;
        }
        MediaV2Data mediaV2Data = (MediaV2Data) obj;
        return Intrinsics.EZpvd((Object) this.telegram, (Object) mediaV2Data.telegram) && Intrinsics.EZpvd((Object) this.website, (Object) mediaV2Data.website) && Intrinsics.EZpvd(this.x, mediaV2Data.x) && Intrinsics.EZpvd(this.youtube, mediaV2Data.youtube) && Intrinsics.EZpvd(this.facebook, mediaV2Data.facebook) && Intrinsics.EZpvd(this.twitch, mediaV2Data.twitch) && Intrinsics.EZpvd(this.instagram, mediaV2Data.instagram) && Intrinsics.EZpvd(this.tiktok, mediaV2Data.tiktok) && Intrinsics.EZpvd(this.discord, mediaV2Data.discord);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DiscordMediaV2Data getDiscord() {
        return this.discord;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FacebookMediaV2Data getFacebook() {
        return this.facebook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InstagramMediaV2Data getInstagram() {
        return this.instagram;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTelegram() {
        return this.telegram;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TikTokMediaV2Data getTiktok() {
        return this.tiktok;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitchMediaV2Data getTwitch() {
        return this.twitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWebsite() {
        return this.website;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final XMediaV2Data getX() {
        return this.x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final YoutubeMediaV2Data getYoutube() {
        return this.youtube;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.telegram.hashCode();
        int iHashCode2 = this.website.hashCode();
        XMediaV2Data xMediaV2Data = this.x;
        int iHashCode3 = xMediaV2Data == null ? 0 : xMediaV2Data.hashCode();
        YoutubeMediaV2Data youtubeMediaV2Data = this.youtube;
        int iHashCode4 = youtubeMediaV2Data == null ? 0 : youtubeMediaV2Data.hashCode();
        FacebookMediaV2Data facebookMediaV2Data = this.facebook;
        int iHashCode5 = facebookMediaV2Data == null ? 0 : facebookMediaV2Data.hashCode();
        TwitchMediaV2Data twitchMediaV2Data = this.twitch;
        int iHashCode6 = twitchMediaV2Data == null ? 0 : twitchMediaV2Data.hashCode();
        InstagramMediaV2Data instagramMediaV2Data = this.instagram;
        int iHashCode7 = instagramMediaV2Data == null ? 0 : instagramMediaV2Data.hashCode();
        TikTokMediaV2Data tikTokMediaV2Data = this.tiktok;
        int iHashCode8 = tikTokMediaV2Data == null ? 0 : tikTokMediaV2Data.hashCode();
        DiscordMediaV2Data discordMediaV2Data = this.discord;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (discordMediaV2Data != null ? discordMediaV2Data.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MediaV2Data(telegram=" + this.telegram + ", website=" + this.website + ", x=" + this.x + ", youtube=" + this.youtube + ", facebook=" + this.facebook + ", twitch=" + this.twitch + ", instagram=" + this.instagram + ", tiktok=" + this.tiktok + ", discord=" + this.discord + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.data.model.MediaV2Data.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MediaV2Data> serializer() {
            return MediaV2Data$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MediaV2Data(int i, String str, String str2, XMediaV2Data xMediaV2Data, YoutubeMediaV2Data youtubeMediaV2Data, FacebookMediaV2Data facebookMediaV2Data, TwitchMediaV2Data twitchMediaV2Data, InstagramMediaV2Data instagramMediaV2Data, TikTokMediaV2Data tikTokMediaV2Data, DiscordMediaV2Data discordMediaV2Data, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.x = xMediaV2Data;
        }
        if ((i & 8) == 0) {
            this.youtube = null;
        } else {
            this.youtube = youtubeMediaV2Data;
        }
        if ((i & 16) == 0) {
            this.facebook = null;
        } else {
            this.facebook = facebookMediaV2Data;
        }
        if ((i & 32) == 0) {
            this.twitch = null;
        } else {
            this.twitch = twitchMediaV2Data;
        }
        if ((i & 64) == 0) {
            this.instagram = null;
        } else {
            this.instagram = instagramMediaV2Data;
        }
        if ((i & 128) == 0) {
            this.tiktok = null;
        } else {
            this.tiktok = tikTokMediaV2Data;
        }
        if ((i & 256) == 0) {
            this.discord = null;
        } else {
            this.discord = discordMediaV2Data;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(MediaV2Data mediaV2Data, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) mediaV2Data.telegram, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, mediaV2Data.telegram);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) mediaV2Data.website, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, mediaV2Data.website);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || mediaV2Data.x != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, XMediaV2Data$$serializer.INSTANCE, mediaV2Data.x);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || mediaV2Data.youtube != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, YoutubeMediaV2Data$$serializer.INSTANCE, mediaV2Data.youtube);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || mediaV2Data.facebook != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, FacebookMediaV2Data$$serializer.INSTANCE, mediaV2Data.facebook);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || mediaV2Data.twitch != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, TwitchMediaV2Data$$serializer.INSTANCE, mediaV2Data.twitch);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || mediaV2Data.instagram != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, InstagramMediaV2Data$$serializer.INSTANCE, mediaV2Data.instagram);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || mediaV2Data.tiktok != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, TikTokMediaV2Data$$serializer.INSTANCE, mediaV2Data.tiktok);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && mediaV2Data.discord == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, DiscordMediaV2Data$$serializer.INSTANCE, mediaV2Data.discord);
    }

    public MediaV2Data(@NotNull String str, @NotNull String str2, XMediaV2Data xMediaV2Data, YoutubeMediaV2Data youtubeMediaV2Data, FacebookMediaV2Data facebookMediaV2Data, TwitchMediaV2Data twitchMediaV2Data, InstagramMediaV2Data instagramMediaV2Data, TikTokMediaV2Data tikTokMediaV2Data, DiscordMediaV2Data discordMediaV2Data) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.telegram = str;
        this.website = str2;
        this.x = xMediaV2Data;
        this.youtube = youtubeMediaV2Data;
        this.facebook = facebookMediaV2Data;
        this.twitch = twitchMediaV2Data;
        this.instagram = instagramMediaV2Data;
        this.tiktok = tikTokMediaV2Data;
        this.discord = discordMediaV2Data;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0055: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r12v0 java.lang.String) : (""))
  (wrap:com.okinc.business.market.features.meme.data.model.XMediaV2Data:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.data.model.XMediaV2Data) : (r13v0 com.okinc.business.market.features.meme.data.model.XMediaV2Data))
  (wrap:com.okinc.business.market.features.meme.data.model.YoutubeMediaV2Data:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.data.model.YoutubeMediaV2Data) : (r14v0 com.okinc.business.market.features.meme.data.model.YoutubeMediaV2Data))
  (wrap:com.okinc.business.market.features.meme.data.model.FacebookMediaV2Data:?: TERNARY null = ((wrap:int:0x0020: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.data.model.FacebookMediaV2Data) : (r15v0 com.okinc.business.market.features.meme.data.model.FacebookMediaV2Data))
  (wrap:com.okinc.business.market.features.meme.data.model.TwitchMediaV2Data:?: TERNARY null = ((wrap:int:0x0027: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.data.model.TwitchMediaV2Data) : (r16v0 com.okinc.business.market.features.meme.data.model.TwitchMediaV2Data))
  (wrap:com.okinc.business.market.features.meme.data.model.InstagramMediaV2Data:?: TERNARY null = ((wrap:int:0x002f: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.data.model.InstagramMediaV2Data) : (r17v0 com.okinc.business.market.features.meme.data.model.InstagramMediaV2Data))
  (wrap:com.okinc.business.market.features.meme.data.model.TikTokMediaV2Data:?: TERNARY null = ((wrap:int:0x0037: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.data.model.TikTokMediaV2Data) : (r18v0 com.okinc.business.market.features.meme.data.model.TikTokMediaV2Data))
  (wrap:com.okinc.business.market.features.meme.data.model.DiscordMediaV2Data:?: TERNARY null = ((wrap:int:0x003f: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 com.okinc.business.market.features.meme.data.model.DiscordMediaV2Data) : (null com.okinc.business.market.features.meme.data.model.DiscordMediaV2Data))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.market.features.meme.data.model.XMediaV2Data, com.okinc.business.market.features.meme.data.model.YoutubeMediaV2Data, com.okinc.business.market.features.meme.data.model.FacebookMediaV2Data, com.okinc.business.market.features.meme.data.model.TwitchMediaV2Data, com.okinc.business.market.features.meme.data.model.InstagramMediaV2Data, com.okinc.business.market.features.meme.data.model.TikTokMediaV2Data, com.okinc.business.market.features.meme.data.model.DiscordMediaV2Data):void (m)] (LINE:17) call: com.okinc.business.market.features.meme.data.model.MediaV2Data.<init>(java.lang.String, java.lang.String, com.okinc.business.market.features.meme.data.model.XMediaV2Data, com.okinc.business.market.features.meme.data.model.YoutubeMediaV2Data, com.okinc.business.market.features.meme.data.model.FacebookMediaV2Data, com.okinc.business.market.features.meme.data.model.TwitchMediaV2Data, com.okinc.business.market.features.meme.data.model.InstagramMediaV2Data, com.okinc.business.market.features.meme.data.model.TikTokMediaV2Data, com.okinc.business.market.features.meme.data.model.DiscordMediaV2Data):void type: THIS */
    public /* synthetic */ MediaV2Data(String str, String str2, XMediaV2Data xMediaV2Data, YoutubeMediaV2Data youtubeMediaV2Data, FacebookMediaV2Data facebookMediaV2Data, TwitchMediaV2Data twitchMediaV2Data, InstagramMediaV2Data instagramMediaV2Data, TikTokMediaV2Data tikTokMediaV2Data, DiscordMediaV2Data discordMediaV2Data, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? null : xMediaV2Data, (i & 8) != 0 ? null : youtubeMediaV2Data, (i & 16) != 0 ? null : facebookMediaV2Data, (i & 32) != 0 ? null : twitchMediaV2Data, (i & 64) != 0 ? null : instagramMediaV2Data, (i & 128) != 0 ? null : tikTokMediaV2Data, (i & 256) == 0 ? discordMediaV2Data : null);
    }

    public final Media toMedia() {
        String str = this.telegram;
        String str2 = this.website;
        XMediaV2Data xMediaV2Data = this.x;
        XMedia xMedia = xMediaV2Data != null ? new XMedia(xMediaV2Data.getUrl(), xMediaV2Data.getType(), xMediaV2Data.getXTime(), xMediaV2Data.getXrenameCnt()) : null;
        YoutubeMediaV2Data youtubeMediaV2Data = this.youtube;
        YoutubeMedia youtubeMedia = youtubeMediaV2Data != null ? new YoutubeMedia(youtubeMediaV2Data.getUrl(), youtubeMediaV2Data.getType()) : null;
        FacebookMediaV2Data facebookMediaV2Data = this.facebook;
        FacebookMedia facebookMedia = facebookMediaV2Data != null ? new FacebookMedia(facebookMediaV2Data.getUrl(), facebookMediaV2Data.getType()) : null;
        TwitchMediaV2Data twitchMediaV2Data = this.twitch;
        TwitchMedia twitchMedia = twitchMediaV2Data != null ? new TwitchMedia(twitchMediaV2Data.getUrl(), twitchMediaV2Data.getType()) : null;
        InstagramMediaV2Data instagramMediaV2Data = this.instagram;
        InstagramMedia instagramMedia = instagramMediaV2Data != null ? new InstagramMedia(instagramMediaV2Data.getUrl(), instagramMediaV2Data.getType()) : null;
        TikTokMediaV2Data tikTokMediaV2Data = this.tiktok;
        TikTokMedia tikTokMedia = tikTokMediaV2Data != null ? new TikTokMedia(tikTokMediaV2Data.getUrl(), tikTokMediaV2Data.getType()) : null;
        DiscordMediaV2Data discordMediaV2Data = this.discord;
        return new Media(str, str2, xMedia, youtubeMedia, facebookMedia, twitchMedia, instagramMedia, tikTokMedia, discordMediaV2Data != null ? new DiscordMedia(discordMediaV2Data.getUrl(), discordMediaV2Data.getType()) : null);
    }
}
