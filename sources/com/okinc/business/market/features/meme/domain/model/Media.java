package com.okinc.business.market.features.meme.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class Media implements Parcelable {
    public static final Parcelable.Creator<Media> CREATOR = new Creator();
    public final TikTokMedia AEQbTJ;
    public final String AhwBna;
    public final InstagramMedia EZpvd;
    public final DiscordMedia KWHzl;
    public final FacebookMedia OLrzqt;
    public final String copydefault;
    public final TwitchMedia djBIcL;
    public final XMedia gEmmrt;
    public final YoutubeMedia valueOf;

    public static final class Creator implements Parcelable.Creator<Media> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Media createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Media(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : XMedia.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : YoutubeMedia.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FacebookMedia.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TwitchMedia.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InstagramMedia.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TikTokMedia.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DiscordMedia.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Media[] newArray(int i) {
            return new Media[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Media() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InstagramMedia AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final YoutubeMedia AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TikTokMedia EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DiscordMedia OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FacebookMedia copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Media copydefault(@NotNull String str, @NotNull String str2, XMedia xMedia, YoutubeMedia youtubeMedia, FacebookMedia facebookMedia, TwitchMedia twitchMedia, InstagramMedia instagramMedia, TikTokMedia tikTokMedia, DiscordMedia discordMedia) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new Media(str, str2, xMedia, youtubeMedia, facebookMedia, twitchMedia, instagramMedia, tikTokMedia, discordMedia);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final XMedia djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Media)) {
            return false;
        }
        Media media = (Media) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) media.copydefault) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) media.AhwBna) && Intrinsics.EZpvd(this.gEmmrt, media.gEmmrt) && Intrinsics.EZpvd(this.valueOf, media.valueOf) && Intrinsics.EZpvd(this.OLrzqt, media.OLrzqt) && Intrinsics.EZpvd(this.djBIcL, media.djBIcL) && Intrinsics.EZpvd(this.EZpvd, media.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, media.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, media.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.AhwBna.hashCode();
        XMedia xMedia = this.gEmmrt;
        int iHashCode3 = xMedia == null ? 0 : xMedia.hashCode();
        YoutubeMedia youtubeMedia = this.valueOf;
        int iHashCode4 = youtubeMedia == null ? 0 : youtubeMedia.hashCode();
        FacebookMedia facebookMedia = this.OLrzqt;
        int iHashCode5 = facebookMedia == null ? 0 : facebookMedia.hashCode();
        TwitchMedia twitchMedia = this.djBIcL;
        int iHashCode6 = twitchMedia == null ? 0 : twitchMedia.hashCode();
        InstagramMedia instagramMedia = this.EZpvd;
        int iHashCode7 = instagramMedia == null ? 0 : instagramMedia.hashCode();
        TikTokMedia tikTokMedia = this.AEQbTJ;
        int iHashCode8 = tikTokMedia == null ? 0 : tikTokMedia.hashCode();
        DiscordMedia discordMedia = this.KWHzl;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (discordMedia != null ? discordMedia.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Media(telegram=" + this.copydefault + ", website=" + this.AhwBna + ", x=" + this.gEmmrt + ", youtube=" + this.valueOf + ", facebook=" + this.OLrzqt + ", twitch=" + this.djBIcL + ", instagram=" + this.EZpvd + ", tiktok=" + this.AEQbTJ + ", discord=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitchMedia valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeString(this.AhwBna);
        XMedia xMedia = this.gEmmrt;
        if (xMedia == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            xMedia.writeToParcel(parcel, i);
        }
        YoutubeMedia youtubeMedia = this.valueOf;
        if (youtubeMedia == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            youtubeMedia.writeToParcel(parcel, i);
        }
        FacebookMedia facebookMedia = this.OLrzqt;
        if (facebookMedia == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            facebookMedia.writeToParcel(parcel, i);
        }
        TwitchMedia twitchMedia = this.djBIcL;
        if (twitchMedia == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            twitchMedia.writeToParcel(parcel, i);
        }
        InstagramMedia instagramMedia = this.EZpvd;
        if (instagramMedia == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            instagramMedia.writeToParcel(parcel, i);
        }
        TikTokMedia tikTokMedia = this.AEQbTJ;
        if (tikTokMedia == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tikTokMedia.writeToParcel(parcel, i);
        }
        DiscordMedia discordMedia = this.KWHzl;
        if (discordMedia == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            discordMedia.writeToParcel(parcel, i);
        }
    }

    public Media(@NotNull String str, @NotNull String str2, XMedia xMedia, YoutubeMedia youtubeMedia, FacebookMedia facebookMedia, TwitchMedia twitchMedia, InstagramMedia instagramMedia, TikTokMedia tikTokMedia, DiscordMedia discordMedia) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        this.AhwBna = str2;
        this.gEmmrt = xMedia;
        this.valueOf = youtubeMedia;
        this.OLrzqt = facebookMedia;
        this.djBIcL = twitchMedia;
        this.EZpvd = instagramMedia;
        this.AEQbTJ = tikTokMedia;
        this.KWHzl = discordMedia;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0055: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r12v0 java.lang.String) : (""))
  (wrap:com.okinc.business.market.features.meme.domain.model.XMedia:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.domain.model.XMedia) : (r13v0 com.okinc.business.market.features.meme.domain.model.XMedia))
  (wrap:com.okinc.business.market.features.meme.domain.model.YoutubeMedia:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.domain.model.YoutubeMedia) : (r14v0 com.okinc.business.market.features.meme.domain.model.YoutubeMedia))
  (wrap:com.okinc.business.market.features.meme.domain.model.FacebookMedia:?: TERNARY null = ((wrap:int:0x0020: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.domain.model.FacebookMedia) : (r15v0 com.okinc.business.market.features.meme.domain.model.FacebookMedia))
  (wrap:com.okinc.business.market.features.meme.domain.model.TwitchMedia:?: TERNARY null = ((wrap:int:0x0027: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.domain.model.TwitchMedia) : (r16v0 com.okinc.business.market.features.meme.domain.model.TwitchMedia))
  (wrap:com.okinc.business.market.features.meme.domain.model.InstagramMedia:?: TERNARY null = ((wrap:int:0x002f: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.domain.model.InstagramMedia) : (r17v0 com.okinc.business.market.features.meme.domain.model.InstagramMedia))
  (wrap:com.okinc.business.market.features.meme.domain.model.TikTokMedia:?: TERNARY null = ((wrap:int:0x0037: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.domain.model.TikTokMedia) : (r18v0 com.okinc.business.market.features.meme.domain.model.TikTokMedia))
  (wrap:com.okinc.business.market.features.meme.domain.model.DiscordMedia:?: TERNARY null = ((wrap:int:0x003f: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 com.okinc.business.market.features.meme.domain.model.DiscordMedia) : (null com.okinc.business.market.features.meme.domain.model.DiscordMedia))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.market.features.meme.domain.model.XMedia, com.okinc.business.market.features.meme.domain.model.YoutubeMedia, com.okinc.business.market.features.meme.domain.model.FacebookMedia, com.okinc.business.market.features.meme.domain.model.TwitchMedia, com.okinc.business.market.features.meme.domain.model.InstagramMedia, com.okinc.business.market.features.meme.domain.model.TikTokMedia, com.okinc.business.market.features.meme.domain.model.DiscordMedia):void (m)] (LINE:8) call: com.okinc.business.market.features.meme.domain.model.Media.<init>(java.lang.String, java.lang.String, com.okinc.business.market.features.meme.domain.model.XMedia, com.okinc.business.market.features.meme.domain.model.YoutubeMedia, com.okinc.business.market.features.meme.domain.model.FacebookMedia, com.okinc.business.market.features.meme.domain.model.TwitchMedia, com.okinc.business.market.features.meme.domain.model.InstagramMedia, com.okinc.business.market.features.meme.domain.model.TikTokMedia, com.okinc.business.market.features.meme.domain.model.DiscordMedia):void type: THIS */
    public /* synthetic */ Media(String str, String str2, XMedia xMedia, YoutubeMedia youtubeMedia, FacebookMedia facebookMedia, TwitchMedia twitchMedia, InstagramMedia instagramMedia, TikTokMedia tikTokMedia, DiscordMedia discordMedia, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? null : xMedia, (i & 8) != 0 ? null : youtubeMedia, (i & 16) != 0 ? null : facebookMedia, (i & 32) != 0 ? null : twitchMedia, (i & 64) != 0 ? null : instagramMedia, (i & 128) != 0 ? null : tikTokMedia, (i & 256) == 0 ? discordMedia : null);
    }
}
