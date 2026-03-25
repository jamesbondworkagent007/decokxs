package com.okinc.business.dex.trade.copytrading.edit.data.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class TokenFilter {
    private final List<String> blackCoinList;
    private final String maxAge;
    private final String maxAgeUnit;
    private final String maxLiquidity;
    private final String maxLiquidityUnit;
    private final String maxMc;
    private final String maxMcUnit;
    private final String maxThreshold;
    private final String minAge;
    private final String minAgeUnit;
    private final String minLiquidity;
    private final String minLiquidityUnit;
    private final String minMc;
    private final String minMcUnit;
    private final String threshold;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenFilter() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.minMc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.minMcUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.maxMcUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.maxAgeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.minAgeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.minLiquidityUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.maxLiquidityUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.maxMc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.minAge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.maxAge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.minLiquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.maxLiquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.threshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.maxThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component9() {
        return this.blackCoinList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenFilter copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, String str7, String str8, @NotNull List<String> list, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        return new TokenFilter(str, str2, str3, str4, str5, str6, str7, str8, list, str9, str10, str11, str12, str13, str14);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenFilter)) {
            return false;
        }
        TokenFilter tokenFilter = (TokenFilter) obj;
        return Intrinsics.EZpvd((Object) this.minMc, (Object) tokenFilter.minMc) && Intrinsics.EZpvd((Object) this.maxMc, (Object) tokenFilter.maxMc) && Intrinsics.EZpvd((Object) this.minAge, (Object) tokenFilter.minAge) && Intrinsics.EZpvd((Object) this.maxAge, (Object) tokenFilter.maxAge) && Intrinsics.EZpvd((Object) this.minLiquidity, (Object) tokenFilter.minLiquidity) && Intrinsics.EZpvd((Object) this.maxLiquidity, (Object) tokenFilter.maxLiquidity) && Intrinsics.EZpvd((Object) this.threshold, (Object) tokenFilter.threshold) && Intrinsics.EZpvd((Object) this.maxThreshold, (Object) tokenFilter.maxThreshold) && Intrinsics.EZpvd(this.blackCoinList, tokenFilter.blackCoinList) && Intrinsics.EZpvd((Object) this.minMcUnit, (Object) tokenFilter.minMcUnit) && Intrinsics.EZpvd((Object) this.maxMcUnit, (Object) tokenFilter.maxMcUnit) && Intrinsics.EZpvd((Object) this.maxAgeUnit, (Object) tokenFilter.maxAgeUnit) && Intrinsics.EZpvd((Object) this.minAgeUnit, (Object) tokenFilter.minAgeUnit) && Intrinsics.EZpvd((Object) this.minLiquidityUnit, (Object) tokenFilter.minLiquidityUnit) && Intrinsics.EZpvd((Object) this.maxLiquidityUnit, (Object) tokenFilter.maxLiquidityUnit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getBlackCoinList() {
        return this.blackCoinList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxAge() {
        return this.maxAge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxAgeUnit() {
        return this.maxAgeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxLiquidity() {
        return this.maxLiquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxLiquidityUnit() {
        return this.maxLiquidityUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxMc() {
        return this.maxMc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxMcUnit() {
        return this.maxMcUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxThreshold() {
        return this.maxThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinAge() {
        return this.minAge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinAgeUnit() {
        return this.minAgeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinLiquidity() {
        return this.minLiquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinLiquidityUnit() {
        return this.minLiquidityUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinMc() {
        return this.minMc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinMcUnit() {
        return this.minMcUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getThreshold() {
        return this.threshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.minMc.hashCode();
        int iHashCode2 = this.maxMc.hashCode();
        int iHashCode3 = this.minAge.hashCode();
        int iHashCode4 = this.maxAge.hashCode();
        int iHashCode5 = this.minLiquidity.hashCode();
        int iHashCode6 = this.maxLiquidity.hashCode();
        String str = this.threshold;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        String str2 = this.maxThreshold;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.blackCoinList.hashCode()) * 31) + this.minMcUnit.hashCode()) * 31) + this.maxMcUnit.hashCode()) * 31) + this.maxAgeUnit.hashCode()) * 31) + this.minAgeUnit.hashCode()) * 31) + this.minLiquidityUnit.hashCode()) * 31) + this.maxLiquidityUnit.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenFilter(minMc=" + this.minMc + ", maxMc=" + this.maxMc + ", minAge=" + this.minAge + ", maxAge=" + this.maxAge + ", minLiquidity=" + this.minLiquidity + ", maxLiquidity=" + this.maxLiquidity + ", threshold=" + this.threshold + ", maxThreshold=" + this.maxThreshold + ", blackCoinList=" + this.blackCoinList + ", minMcUnit=" + this.minMcUnit + ", maxMcUnit=" + this.maxMcUnit + ", maxAgeUnit=" + this.maxAgeUnit + ", minAgeUnit=" + this.minAgeUnit + ", minLiquidityUnit=" + this.minLiquidityUnit + ", maxLiquidityUnit=" + this.maxLiquidityUnit + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.edit.data.model.TokenFilter.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenFilter> serializer() {
            return TokenFilter$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenFilter(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, String str10, String str11, String str12, String str13, String str14, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.minMc = "";
        } else {
            this.minMc = str;
        }
        if ((i & 2) == 0) {
            this.maxMc = "";
        } else {
            this.maxMc = str2;
        }
        if ((i & 4) == 0) {
            this.minAge = "";
        } else {
            this.minAge = str3;
        }
        if ((i & 8) == 0) {
            this.maxAge = "";
        } else {
            this.maxAge = str4;
        }
        if ((i & 16) == 0) {
            this.minLiquidity = "";
        } else {
            this.minLiquidity = str5;
        }
        if ((i & 32) == 0) {
            this.maxLiquidity = "";
        } else {
            this.maxLiquidity = str6;
        }
        if ((i & 64) == 0) {
            this.threshold = null;
        } else {
            this.threshold = str7;
        }
        if ((i & 128) == 0) {
            this.maxThreshold = null;
        } else {
            this.maxThreshold = str8;
        }
        this.blackCoinList = (i & 256) == 0 ? yDY.AhwBna() : list;
        if ((i & 512) == 0) {
            this.minMcUnit = "";
        } else {
            this.minMcUnit = str9;
        }
        if ((i & 1024) == 0) {
            this.maxMcUnit = "";
        } else {
            this.maxMcUnit = str10;
        }
        if ((i & 2048) == 0) {
            this.maxAgeUnit = "";
        } else {
            this.maxAgeUnit = str11;
        }
        if ((i & 4096) == 0) {
            this.minAgeUnit = "";
        } else {
            this.minAgeUnit = str12;
        }
        if ((i & 8192) == 0) {
            this.minLiquidityUnit = "";
        } else {
            this.minLiquidityUnit = str13;
        }
        if ((i & 16384) == 0) {
            this.maxLiquidityUnit = "";
        } else {
            this.maxLiquidityUnit = str14;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TokenFilter tokenFilter, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tokenFilter.minMc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tokenFilter.minMc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tokenFilter.maxMc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tokenFilter.maxMc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tokenFilter.minAge, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tokenFilter.minAge);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tokenFilter.maxAge, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tokenFilter.maxAge);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tokenFilter.minLiquidity, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tokenFilter.minLiquidity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) tokenFilter.maxLiquidity, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, tokenFilter.maxLiquidity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || tokenFilter.threshold != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, tokenFilter.threshold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || tokenFilter.maxThreshold != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, tokenFilter.maxThreshold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(tokenFilter.blackCoinList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], tokenFilter.blackCoinList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) tokenFilter.minMcUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, tokenFilter.minMcUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) tokenFilter.maxMcUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, tokenFilter.maxMcUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) tokenFilter.maxAgeUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, tokenFilter.maxAgeUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) tokenFilter.minAgeUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, tokenFilter.minAgeUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) tokenFilter.minLiquidityUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, tokenFilter.minLiquidityUnit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && Intrinsics.EZpvd((Object) tokenFilter.maxLiquidityUnit, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 14, tokenFilter.maxLiquidityUnit);
    }

    public TokenFilter(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, String str7, String str8, @NotNull List<String> list, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        this.minMc = str;
        this.maxMc = str2;
        this.minAge = str3;
        this.maxAge = str4;
        this.minLiquidity = str5;
        this.maxLiquidity = str6;
        this.threshold = str7;
        this.maxThreshold = str8;
        this.blackCoinList = list;
        this.minMcUnit = str9;
        this.maxMcUnit = str10;
        this.maxAgeUnit = str11;
        this.minAgeUnit = str12;
        this.minLiquidityUnit = str13;
        this.maxLiquidityUnit = str14;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x009e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r32v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r24v0 java.lang.String) : (null java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0044: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0048: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:116)) : (r25v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0057: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005f: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0067: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006f: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0077: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r31v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:107) call: com.okinc.business.dex.trade.copytrading.edit.data.model.TokenFilter.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TokenFilter(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, String str10, String str11, String str12, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? null : str7, (i & 128) == 0 ? str8 : null, (i & 256) != 0 ? yDY.AhwBna() : list, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) != 0 ? "" : str13, (i & 16384) == 0 ? str14 : "");
    }
}
