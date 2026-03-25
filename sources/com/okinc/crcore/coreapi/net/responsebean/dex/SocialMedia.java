package com.okinc.crcore.coreapi.net.responsebean.dex;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class SocialMedia {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String description;
    private final String discord;
    private final String facebook;
    private final String github;
    private final String medium;
    private final String officialWebsite;
    private final String reddit;
    private final String score;
    private final String telegram;
    private final String twitter;
    private final TwitterDetailInfo twitterDetailInfo;
    private final String twitterLinkType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SocialMedia() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TwitterDetailInfo) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.twitter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitterDetailInfo component11() {
        return this.twitterDetailInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.twitterLinkType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.discord;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.facebook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.github;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.medium;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.officialWebsite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.reddit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.score;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.telegram;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SocialMedia copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull TwitterDetailInfo twitterDetailInfo, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(twitterDetailInfo, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new SocialMedia(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, twitterDetailInfo, str11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialMedia)) {
            return false;
        }
        SocialMedia socialMedia = (SocialMedia) obj;
        return Intrinsics.EZpvd((Object) this.description, (Object) socialMedia.description) && Intrinsics.EZpvd((Object) this.discord, (Object) socialMedia.discord) && Intrinsics.EZpvd((Object) this.facebook, (Object) socialMedia.facebook) && Intrinsics.EZpvd((Object) this.github, (Object) socialMedia.github) && Intrinsics.EZpvd((Object) this.medium, (Object) socialMedia.medium) && Intrinsics.EZpvd((Object) this.officialWebsite, (Object) socialMedia.officialWebsite) && Intrinsics.EZpvd((Object) this.reddit, (Object) socialMedia.reddit) && Intrinsics.EZpvd((Object) this.score, (Object) socialMedia.score) && Intrinsics.EZpvd((Object) this.telegram, (Object) socialMedia.telegram) && Intrinsics.EZpvd((Object) this.twitter, (Object) socialMedia.twitter) && Intrinsics.EZpvd(this.twitterDetailInfo, socialMedia.twitterDetailInfo) && Intrinsics.EZpvd((Object) this.twitterLinkType, (Object) socialMedia.twitterLinkType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDiscord() {
        return this.discord;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFacebook() {
        return this.facebook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGithub() {
        return this.github;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMedium() {
        return this.medium;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOfficialWebsite() {
        return this.officialWebsite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReddit() {
        return this.reddit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getScore() {
        return this.score;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTelegram() {
        return this.telegram;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTwitter() {
        return this.twitter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitterDetailInfo getTwitterDetailInfo() {
        return this.twitterDetailInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTwitterLinkType() {
        return this.twitterLinkType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((this.description.hashCode() * 31) + this.discord.hashCode()) * 31) + this.facebook.hashCode()) * 31) + this.github.hashCode()) * 31) + this.medium.hashCode()) * 31) + this.officialWebsite.hashCode()) * 31) + this.reddit.hashCode()) * 31) + this.score.hashCode()) * 31) + this.telegram.hashCode()) * 31) + this.twitter.hashCode()) * 31) + this.twitterDetailInfo.hashCode()) * 31) + this.twitterLinkType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SocialMedia(description=" + this.description + ", discord=" + this.discord + ", facebook=" + this.facebook + ", github=" + this.github + ", medium=" + this.medium + ", officialWebsite=" + this.officialWebsite + ", reddit=" + this.reddit + ", score=" + this.score + ", telegram=" + this.telegram + ", twitter=" + this.twitter + ", twitterDetailInfo=" + this.twitterDetailInfo + ", twitterLinkType=" + this.twitterLinkType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.dex.SocialMedia.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SocialMedia> serializer() {
            return SocialMedia$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SocialMedia(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, TwitterDetailInfo twitterDetailInfo, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.description = "";
        } else {
            this.description = str;
        }
        if ((i & 2) == 0) {
            this.discord = "";
        } else {
            this.discord = str2;
        }
        if ((i & 4) == 0) {
            this.facebook = "";
        } else {
            this.facebook = str3;
        }
        if ((i & 8) == 0) {
            this.github = "";
        } else {
            this.github = str4;
        }
        if ((i & 16) == 0) {
            this.medium = "";
        } else {
            this.medium = str5;
        }
        if ((i & 32) == 0) {
            this.officialWebsite = "";
        } else {
            this.officialWebsite = str6;
        }
        if ((i & 64) == 0) {
            this.reddit = "";
        } else {
            this.reddit = str7;
        }
        if ((i & 128) == 0) {
            this.score = "";
        } else {
            this.score = str8;
        }
        if ((i & 256) == 0) {
            this.telegram = "";
        } else {
            this.telegram = str9;
        }
        if ((i & 512) == 0) {
            this.twitter = "";
        } else {
            this.twitter = str10;
        }
        if ((i & 1024) == 0) {
            this.twitterDetailInfo = new TwitterDetailInfo((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        } else {
            this.twitterDetailInfo = twitterDetailInfo;
        }
        if ((i & 2048) == 0) {
            this.twitterLinkType = "";
        } else {
            this.twitterLinkType = str11;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(SocialMedia socialMedia, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) socialMedia.description, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, socialMedia.description);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) socialMedia.discord, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, socialMedia.discord);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) socialMedia.facebook, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, socialMedia.facebook);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) socialMedia.github, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, socialMedia.github);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) socialMedia.medium, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, socialMedia.medium);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) socialMedia.officialWebsite, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, socialMedia.officialWebsite);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) socialMedia.reddit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, socialMedia.reddit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) socialMedia.score, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, socialMedia.score);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) socialMedia.telegram, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, socialMedia.telegram);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) socialMedia.twitter, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, socialMedia.twitter);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(socialMedia.twitterDetailInfo, new TwitterDetailInfo((String) null, (String) null, 3, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, TwitterDetailInfo$$serializer.INSTANCE, socialMedia.twitterDetailInfo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && Intrinsics.EZpvd((Object) socialMedia.twitterLinkType, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 11, socialMedia.twitterLinkType);
    }

    public SocialMedia(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull TwitterDetailInfo twitterDetailInfo, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(twitterDetailInfo, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.description = str;
        this.discord = str2;
        this.facebook = str3;
        this.github = str4;
        this.medium = str5;
        this.officialWebsite = str6;
        this.reddit = str7;
        this.score = str8;
        this.telegram = str9;
        this.twitter = str10;
        this.twitterDetailInfo = twitterDetailInfo;
        this.twitterLinkType = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0083: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.dex.TwitterDetailInfo:?: TERNARY null = ((wrap:int:0x0054: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005c: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (3 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:86) call: com.okinc.crcore.coreapi.net.responsebean.dex.TwitterDetailInfo.<init>(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r26v0 com.okinc.crcore.coreapi.net.responsebean.dex.TwitterDetailInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.crcore.coreapi.net.responsebean.dex.TwitterDetailInfo, java.lang.String):void (m)] (LINE:75) call: com.okinc.crcore.coreapi.net.responsebean.dex.SocialMedia.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.crcore.coreapi.net.responsebean.dex.TwitterDetailInfo, java.lang.String):void type: THIS */
    public /* synthetic */ SocialMedia(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, TwitterDetailInfo twitterDetailInfo, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? new TwitterDetailInfo((String) null, (String) null, 3, (DefaultConstructorMarker) null) : twitterDetailInfo, (i & 2048) == 0 ? str11 : "");
    }
}
