package com.okinc.dexkline.market.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class SocialMediaData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String description;
    public final String discord;
    public final String facebook;
    public final String github;
    public final String medium;
    public final String officialWebsite;
    public final String reddit;
    public final String score;
    public final String telegram;
    public final String twitter;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SocialMediaData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.facebook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.telegram;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.reddit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.discord;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.github;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SocialMediaData copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
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
        return new SocialMediaData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.medium;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialMediaData)) {
            return false;
        }
        SocialMediaData socialMediaData = (SocialMediaData) obj;
        return Intrinsics.EZpvd((Object) this.facebook, (Object) socialMediaData.facebook) && Intrinsics.EZpvd((Object) this.twitter, (Object) socialMediaData.twitter) && Intrinsics.EZpvd((Object) this.github, (Object) socialMediaData.github) && Intrinsics.EZpvd((Object) this.reddit, (Object) socialMediaData.reddit) && Intrinsics.EZpvd((Object) this.medium, (Object) socialMediaData.medium) && Intrinsics.EZpvd((Object) this.telegram, (Object) socialMediaData.telegram) && Intrinsics.EZpvd((Object) this.discord, (Object) socialMediaData.discord) && Intrinsics.EZpvd((Object) this.officialWebsite, (Object) socialMediaData.officialWebsite) && Intrinsics.EZpvd((Object) this.description, (Object) socialMediaData.description) && Intrinsics.EZpvd((Object) this.score, (Object) socialMediaData.score);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.officialWebsite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.facebook.hashCode() * 31) + this.twitter.hashCode()) * 31) + this.github.hashCode()) * 31) + this.reddit.hashCode()) * 31) + this.medium.hashCode()) * 31) + this.telegram.hashCode()) * 31) + this.discord.hashCode()) * 31) + this.officialWebsite.hashCode()) * 31) + this.description.hashCode()) * 31) + this.score.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SocialMediaData(facebook=" + this.facebook + ", twitter=" + this.twitter + ", github=" + this.github + ", reddit=" + this.reddit + ", medium=" + this.medium + ", telegram=" + this.telegram + ", discord=" + this.discord + ", officialWebsite=" + this.officialWebsite + ", description=" + this.description + ", score=" + this.score + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.twitter;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.data.model.SocialMediaData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SocialMediaData> serializer() {
            return SocialMediaData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SocialMediaData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.facebook = "";
        } else {
            this.facebook = str;
        }
        if ((i & 2) == 0) {
            this.twitter = "";
        } else {
            this.twitter = str2;
        }
        if ((i & 4) == 0) {
            this.github = "";
        } else {
            this.github = str3;
        }
        if ((i & 8) == 0) {
            this.reddit = "";
        } else {
            this.reddit = str4;
        }
        if ((i & 16) == 0) {
            this.medium = "";
        } else {
            this.medium = str5;
        }
        if ((i & 32) == 0) {
            this.telegram = "";
        } else {
            this.telegram = str6;
        }
        if ((i & 64) == 0) {
            this.discord = "";
        } else {
            this.discord = str7;
        }
        if ((i & 128) == 0) {
            this.officialWebsite = "";
        } else {
            this.officialWebsite = str8;
        }
        if ((i & 256) == 0) {
            this.description = "";
        } else {
            this.description = str9;
        }
        if ((i & 512) == 0) {
            this.score = "";
        } else {
            this.score = str10;
        }
    }

    public static final /* synthetic */ void AEQbTJ(SocialMediaData socialMediaData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) socialMediaData.facebook, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, socialMediaData.facebook);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) socialMediaData.twitter, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, socialMediaData.twitter);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) socialMediaData.github, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, socialMediaData.github);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) socialMediaData.reddit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, socialMediaData.reddit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) socialMediaData.medium, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, socialMediaData.medium);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) socialMediaData.telegram, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, socialMediaData.telegram);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) socialMediaData.discord, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, socialMediaData.discord);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) socialMediaData.officialWebsite, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, socialMediaData.officialWebsite);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) socialMediaData.description, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, socialMediaData.description);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) socialMediaData.score, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, socialMediaData.score);
    }

    public SocialMediaData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
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
        this.facebook = str;
        this.twitter = str2;
        this.github = str3;
        this.reddit = str4;
        this.medium = str5;
        this.telegram = str6;
        this.discord = str7;
        this.officialWebsite = str8;
        this.description = str9;
        this.score = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:115) call: com.okinc.dexkline.market.data.model.SocialMediaData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SocialMediaData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) == 0 ? str10 : "");
    }
}
