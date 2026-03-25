package com.okinc.business.market.features.smart_money.ranking.domain.model;

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
public final class RankingFilter {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String chainId;
    public final String desc;
    public final String label;
    public final String periodType;
    public final String pnlMax;
    public final String pnlMin;
    public final String rankBy;
    public final String roiMax;
    public final String roiMin;
    public final String tradeVolumeMax;
    public final String tradeVolumeMin;
    public final String txsMax;
    public final String txsMin;
    public final String winRateMax;
    public final String winRateMin;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RankingFilter() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RankingFilter EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15) {
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
        return new RankingFilter(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RankingFilter)) {
            return false;
        }
        RankingFilter rankingFilter = (RankingFilter) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) rankingFilter.chainId) && Intrinsics.EZpvd((Object) this.desc, (Object) rankingFilter.desc) && Intrinsics.EZpvd((Object) this.label, (Object) rankingFilter.label) && Intrinsics.EZpvd((Object) this.periodType, (Object) rankingFilter.periodType) && Intrinsics.EZpvd((Object) this.pnlMax, (Object) rankingFilter.pnlMax) && Intrinsics.EZpvd((Object) this.pnlMin, (Object) rankingFilter.pnlMin) && Intrinsics.EZpvd((Object) this.rankBy, (Object) rankingFilter.rankBy) && Intrinsics.EZpvd((Object) this.roiMax, (Object) rankingFilter.roiMax) && Intrinsics.EZpvd((Object) this.roiMin, (Object) rankingFilter.roiMin) && Intrinsics.EZpvd((Object) this.winRateMin, (Object) rankingFilter.winRateMin) && Intrinsics.EZpvd((Object) this.winRateMax, (Object) rankingFilter.winRateMax) && Intrinsics.EZpvd((Object) this.tradeVolumeMax, (Object) rankingFilter.tradeVolumeMax) && Intrinsics.EZpvd((Object) this.tradeVolumeMin, (Object) rankingFilter.tradeVolumeMin) && Intrinsics.EZpvd((Object) this.txsMax, (Object) rankingFilter.txsMax) && Intrinsics.EZpvd((Object) this.txsMin, (Object) rankingFilter.txsMin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((this.chainId.hashCode() * 31) + this.desc.hashCode()) * 31) + this.label.hashCode()) * 31) + this.periodType.hashCode()) * 31) + this.pnlMax.hashCode()) * 31) + this.pnlMin.hashCode()) * 31) + this.rankBy.hashCode()) * 31) + this.roiMax.hashCode()) * 31) + this.roiMin.hashCode()) * 31) + this.winRateMin.hashCode()) * 31) + this.winRateMax.hashCode()) * 31) + this.tradeVolumeMax.hashCode()) * 31) + this.tradeVolumeMin.hashCode()) * 31) + this.txsMax.hashCode()) * 31) + this.txsMin.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RankingFilter(chainId=" + this.chainId + ", desc=" + this.desc + ", label=" + this.label + ", periodType=" + this.periodType + ", pnlMax=" + this.pnlMax + ", pnlMin=" + this.pnlMin + ", rankBy=" + this.rankBy + ", roiMax=" + this.roiMax + ", roiMin=" + this.roiMin + ", winRateMin=" + this.winRateMin + ", winRateMax=" + this.winRateMax + ", tradeVolumeMax=" + this.tradeVolumeMax + ", tradeVolumeMin=" + this.tradeVolumeMin + ", txsMax=" + this.txsMax + ", txsMin=" + this.txsMin + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.smart_money.ranking.domain.model.RankingFilter.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RankingFilter> serializer() {
            return RankingFilter$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RankingFilter(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        this.desc = (i & 2) == 0 ? "true" : str2;
        if ((i & 4) == 0) {
            this.label = "";
        } else {
            this.label = str3;
        }
        if ((i & 8) == 0) {
            this.periodType = "";
        } else {
            this.periodType = str4;
        }
        if ((i & 16) == 0) {
            this.pnlMax = "";
        } else {
            this.pnlMax = str5;
        }
        if ((i & 32) == 0) {
            this.pnlMin = "";
        } else {
            this.pnlMin = str6;
        }
        if ((i & 64) == 0) {
            this.rankBy = "";
        } else {
            this.rankBy = str7;
        }
        if ((i & 128) == 0) {
            this.roiMax = "";
        } else {
            this.roiMax = str8;
        }
        if ((i & 256) == 0) {
            this.roiMin = "";
        } else {
            this.roiMin = str9;
        }
        if ((i & 512) == 0) {
            this.winRateMin = "";
        } else {
            this.winRateMin = str10;
        }
        if ((i & 1024) == 0) {
            this.winRateMax = "";
        } else {
            this.winRateMax = str11;
        }
        if ((i & 2048) == 0) {
            this.tradeVolumeMax = "";
        } else {
            this.tradeVolumeMax = str12;
        }
        if ((i & 4096) == 0) {
            this.tradeVolumeMin = "";
        } else {
            this.tradeVolumeMin = str13;
        }
        if ((i & 8192) == 0) {
            this.txsMax = "";
        } else {
            this.txsMax = str14;
        }
        if ((i & 16384) == 0) {
            this.txsMin = "";
        } else {
            this.txsMin = str15;
        }
    }

    public static final /* synthetic */ void EZpvd(RankingFilter rankingFilter, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) rankingFilter.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, rankingFilter.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) rankingFilter.desc, (Object) "true")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, rankingFilter.desc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) rankingFilter.label, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, rankingFilter.label);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) rankingFilter.periodType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, rankingFilter.periodType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) rankingFilter.pnlMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, rankingFilter.pnlMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) rankingFilter.pnlMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, rankingFilter.pnlMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) rankingFilter.rankBy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, rankingFilter.rankBy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) rankingFilter.roiMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, rankingFilter.roiMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) rankingFilter.roiMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, rankingFilter.roiMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) rankingFilter.winRateMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, rankingFilter.winRateMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) rankingFilter.winRateMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, rankingFilter.winRateMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) rankingFilter.tradeVolumeMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, rankingFilter.tradeVolumeMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) rankingFilter.tradeVolumeMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, rankingFilter.tradeVolumeMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) rankingFilter.txsMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, rankingFilter.txsMax);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && Intrinsics.EZpvd((Object) rankingFilter.txsMin, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 14, rankingFilter.txsMin);
    }

    public RankingFilter(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15) {
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
        this.chainId = str;
        this.desc = str2;
        this.label = str3;
        this.periodType = str4;
        this.pnlMax = str5;
        this.pnlMin = str6;
        this.rankBy = str7;
        this.roiMax = str8;
        this.roiMin = str9;
        this.winRateMin = str10;
        this.winRateMax = str11;
        this.tradeVolumeMax = str12;
        this.tradeVolumeMin = str13;
        this.txsMax = str14;
        this.txsMin = str15;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x009c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("true") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006d: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0075: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r31v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:19) call: com.okinc.business.market.features.smart_money.ranking.domain.model.RankingFilter.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RankingFilter(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "true" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) == 0 ? str15 : "");
    }
}
