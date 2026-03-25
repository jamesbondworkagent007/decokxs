package com.okinc.business.market.features.vibes.domain;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class VibesKolData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String authorId;
    public final String engagementCount;
    public final String engagementCountChangeRate;
    public final String firstMentionContentId;
    public final String firstMentionMarketCap;
    public final String firstMentionPrice;
    public final String firstMentionTime;
    public final String followers;
    public final String impressionsCount;
    public final String impressionsCountChangeRate;
    public final String kolAvatar;
    public final String kolHandleId;
    public final String kolNickname;
    public final String mentionsCount;
    public final String mentionsCountChangeRate;
    public final String twitterLink;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VibesKolData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 65535, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.authorId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.impressionsCountChangeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.followers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.kolHandleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.firstMentionPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.engagementCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VibesKolData OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16) {
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
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        return new VibesKolData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.firstMentionContentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.engagementCountChangeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.impressionsCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VibesKolData)) {
            return false;
        }
        VibesKolData vibesKolData = (VibesKolData) obj;
        return Intrinsics.EZpvd((Object) this.authorId, (Object) vibesKolData.authorId) && Intrinsics.EZpvd((Object) this.kolNickname, (Object) vibesKolData.kolNickname) && Intrinsics.EZpvd((Object) this.kolHandleId, (Object) vibesKolData.kolHandleId) && Intrinsics.EZpvd((Object) this.kolAvatar, (Object) vibesKolData.kolAvatar) && Intrinsics.EZpvd((Object) this.engagementCount, (Object) vibesKolData.engagementCount) && Intrinsics.EZpvd((Object) this.engagementCountChangeRate, (Object) vibesKolData.engagementCountChangeRate) && Intrinsics.EZpvd((Object) this.impressionsCount, (Object) vibesKolData.impressionsCount) && Intrinsics.EZpvd((Object) this.impressionsCountChangeRate, (Object) vibesKolData.impressionsCountChangeRate) && Intrinsics.EZpvd((Object) this.mentionsCount, (Object) vibesKolData.mentionsCount) && Intrinsics.EZpvd((Object) this.mentionsCountChangeRate, (Object) vibesKolData.mentionsCountChangeRate) && Intrinsics.EZpvd((Object) this.followers, (Object) vibesKolData.followers) && Intrinsics.EZpvd((Object) this.twitterLink, (Object) vibesKolData.twitterLink) && Intrinsics.EZpvd((Object) this.firstMentionTime, (Object) vibesKolData.firstMentionTime) && Intrinsics.EZpvd((Object) this.firstMentionContentId, (Object) vibesKolData.firstMentionContentId) && Intrinsics.EZpvd((Object) this.firstMentionPrice, (Object) vibesKolData.firstMentionPrice) && Intrinsics.EZpvd((Object) this.firstMentionMarketCap, (Object) vibesKolData.firstMentionMarketCap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.mentionsCountChangeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.firstMentionTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((this.authorId.hashCode() * 31) + this.kolNickname.hashCode()) * 31) + this.kolHandleId.hashCode()) * 31) + this.kolAvatar.hashCode()) * 31) + this.engagementCount.hashCode()) * 31) + this.engagementCountChangeRate.hashCode()) * 31) + this.impressionsCount.hashCode()) * 31) + this.impressionsCountChangeRate.hashCode()) * 31) + this.mentionsCount.hashCode()) * 31) + this.mentionsCountChangeRate.hashCode()) * 31) + this.followers.hashCode()) * 31) + this.twitterLink.hashCode()) * 31) + this.firstMentionTime.hashCode()) * 31) + this.firstMentionContentId.hashCode()) * 31) + this.firstMentionPrice.hashCode()) * 31) + this.firstMentionMarketCap.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.kolNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VibesKolData(authorId=" + this.authorId + ", kolNickname=" + this.kolNickname + ", kolHandleId=" + this.kolHandleId + ", kolAvatar=" + this.kolAvatar + ", engagementCount=" + this.engagementCount + ", engagementCountChangeRate=" + this.engagementCountChangeRate + ", impressionsCount=" + this.impressionsCount + ", impressionsCountChangeRate=" + this.impressionsCountChangeRate + ", mentionsCount=" + this.mentionsCount + ", mentionsCountChangeRate=" + this.mentionsCountChangeRate + ", followers=" + this.followers + ", twitterLink=" + this.twitterLink + ", firstMentionTime=" + this.firstMentionTime + ", firstMentionContentId=" + this.firstMentionContentId + ", firstMentionPrice=" + this.firstMentionPrice + ", firstMentionMarketCap=" + this.firstMentionMarketCap + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.kolAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.mentionsCount;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.vibes.domain.VibesKolData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VibesKolData> serializer() {
            return VibesKolData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VibesKolData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.authorId = "";
        } else {
            this.authorId = str;
        }
        if ((i & 2) == 0) {
            this.kolNickname = "";
        } else {
            this.kolNickname = str2;
        }
        if ((i & 4) == 0) {
            this.kolHandleId = "";
        } else {
            this.kolHandleId = str3;
        }
        if ((i & 8) == 0) {
            this.kolAvatar = "";
        } else {
            this.kolAvatar = str4;
        }
        if ((i & 16) == 0) {
            this.engagementCount = "";
        } else {
            this.engagementCount = str5;
        }
        if ((i & 32) == 0) {
            this.engagementCountChangeRate = "";
        } else {
            this.engagementCountChangeRate = str6;
        }
        if ((i & 64) == 0) {
            this.impressionsCount = "";
        } else {
            this.impressionsCount = str7;
        }
        if ((i & 128) == 0) {
            this.impressionsCountChangeRate = "";
        } else {
            this.impressionsCountChangeRate = str8;
        }
        if ((i & 256) == 0) {
            this.mentionsCount = "";
        } else {
            this.mentionsCount = str9;
        }
        if ((i & 512) == 0) {
            this.mentionsCountChangeRate = "";
        } else {
            this.mentionsCountChangeRate = str10;
        }
        if ((i & 1024) == 0) {
            this.followers = "";
        } else {
            this.followers = str11;
        }
        if ((i & 2048) == 0) {
            this.twitterLink = "";
        } else {
            this.twitterLink = str12;
        }
        if ((i & 4096) == 0) {
            this.firstMentionTime = "";
        } else {
            this.firstMentionTime = str13;
        }
        if ((i & 8192) == 0) {
            this.firstMentionContentId = "";
        } else {
            this.firstMentionContentId = str14;
        }
        if ((i & 16384) == 0) {
            this.firstMentionPrice = "";
        } else {
            this.firstMentionPrice = str15;
        }
        if ((i & 32768) == 0) {
            this.firstMentionMarketCap = "";
        } else {
            this.firstMentionMarketCap = str16;
        }
    }

    public static final /* synthetic */ void KWHzl(VibesKolData vibesKolData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) vibesKolData.authorId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, vibesKolData.authorId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) vibesKolData.kolNickname, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, vibesKolData.kolNickname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) vibesKolData.kolHandleId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, vibesKolData.kolHandleId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) vibesKolData.kolAvatar, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, vibesKolData.kolAvatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) vibesKolData.engagementCount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, vibesKolData.engagementCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) vibesKolData.engagementCountChangeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, vibesKolData.engagementCountChangeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) vibesKolData.impressionsCount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, vibesKolData.impressionsCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) vibesKolData.impressionsCountChangeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, vibesKolData.impressionsCountChangeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) vibesKolData.mentionsCount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, vibesKolData.mentionsCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) vibesKolData.mentionsCountChangeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, vibesKolData.mentionsCountChangeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) vibesKolData.followers, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, vibesKolData.followers);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) vibesKolData.twitterLink, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, vibesKolData.twitterLink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) vibesKolData.firstMentionTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, vibesKolData.firstMentionTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) vibesKolData.firstMentionContentId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, vibesKolData.firstMentionContentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) vibesKolData.firstMentionPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, vibesKolData.firstMentionPrice);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && Intrinsics.EZpvd((Object) vibesKolData.firstMentionMarketCap, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 15, vibesKolData.firstMentionMarketCap);
    }

    public VibesKolData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16) {
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
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        this.authorId = str;
        this.kolNickname = str2;
        this.kolHandleId = str3;
        this.kolAvatar = str4;
        this.engagementCount = str5;
        this.engagementCountChangeRate = str6;
        this.impressionsCount = str7;
        this.impressionsCountChangeRate = str8;
        this.mentionsCount = str9;
        this.mentionsCountChangeRate = str10;
        this.followers = str11;
        this.twitterLink = str12;
        this.firstMentionTime = str13;
        this.firstMentionContentId = str14;
        this.firstMentionPrice = str15;
        this.firstMentionMarketCap = str16;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ad: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r34v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r34v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r34v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r34v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r34v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r34v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r34v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r34v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:16) call: com.okinc.business.market.features.vibes.domain.VibesKolData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ VibesKolData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16);
    }
}
