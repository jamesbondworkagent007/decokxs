package com.okinc.business.market.features.scanner.surge.trending.data;

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

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class SurgeTrendingChainFilterData {
    private final String keyword;
    private final String marketCapMax;
    private final String marketCapMin;
    private final boolean needSocialLink;
    private final String rankType;
    private final List<String> selectedProtocols;
    private final String tokenAgeMax;
    private final String tokenAgeMin;
    private final int tokenAgeTypeValue;
    private final String volumeMax;
    private final String volumeMin;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SurgeTrendingChainFilterData() {
        this((String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, false, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.rankType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.keyword;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.needSocialLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.selectedProtocols;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.marketCapMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.marketCapMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.volumeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.volumeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenAgeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tokenAgeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.tokenAgeTypeValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SurgeTrendingChainFilterData copy(@NotNull String str, @NotNull List<String> list, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, @NotNull String str8, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new SurgeTrendingChainFilterData(str, list, str2, str3, str4, str5, str6, str7, i, str8, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurgeTrendingChainFilterData)) {
            return false;
        }
        SurgeTrendingChainFilterData surgeTrendingChainFilterData = (SurgeTrendingChainFilterData) obj;
        return Intrinsics.EZpvd((Object) this.rankType, (Object) surgeTrendingChainFilterData.rankType) && Intrinsics.EZpvd(this.selectedProtocols, surgeTrendingChainFilterData.selectedProtocols) && Intrinsics.EZpvd((Object) this.marketCapMin, (Object) surgeTrendingChainFilterData.marketCapMin) && Intrinsics.EZpvd((Object) this.marketCapMax, (Object) surgeTrendingChainFilterData.marketCapMax) && Intrinsics.EZpvd((Object) this.volumeMin, (Object) surgeTrendingChainFilterData.volumeMin) && Intrinsics.EZpvd((Object) this.volumeMax, (Object) surgeTrendingChainFilterData.volumeMax) && Intrinsics.EZpvd((Object) this.tokenAgeMin, (Object) surgeTrendingChainFilterData.tokenAgeMin) && Intrinsics.EZpvd((Object) this.tokenAgeMax, (Object) surgeTrendingChainFilterData.tokenAgeMax) && this.tokenAgeTypeValue == surgeTrendingChainFilterData.tokenAgeTypeValue && Intrinsics.EZpvd((Object) this.keyword, (Object) surgeTrendingChainFilterData.keyword) && this.needSocialLink == surgeTrendingChainFilterData.needSocialLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKeyword() {
        return this.keyword;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketCapMax() {
        return this.marketCapMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketCapMin() {
        return this.marketCapMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedSocialLink() {
        return this.needSocialLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRankType() {
        return this.rankType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSelectedProtocols() {
        return this.selectedProtocols;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAgeMax() {
        return this.tokenAgeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAgeMin() {
        return this.tokenAgeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTokenAgeTypeValue() {
        return this.tokenAgeTypeValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolumeMax() {
        return this.volumeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolumeMin() {
        return this.volumeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((this.rankType.hashCode() * 31) + this.selectedProtocols.hashCode()) * 31) + this.marketCapMin.hashCode()) * 31) + this.marketCapMax.hashCode()) * 31) + this.volumeMin.hashCode()) * 31) + this.volumeMax.hashCode()) * 31) + this.tokenAgeMin.hashCode()) * 31) + this.tokenAgeMax.hashCode()) * 31) + Integer.hashCode(this.tokenAgeTypeValue)) * 31) + this.keyword.hashCode()) * 31) + Boolean.hashCode(this.needSocialLink);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SurgeTrendingChainFilterData(rankType=" + this.rankType + ", selectedProtocols=" + this.selectedProtocols + ", marketCapMin=" + this.marketCapMin + ", marketCapMax=" + this.marketCapMax + ", volumeMin=" + this.volumeMin + ", volumeMax=" + this.volumeMax + ", tokenAgeMin=" + this.tokenAgeMin + ", tokenAgeMax=" + this.tokenAgeMax + ", tokenAgeTypeValue=" + this.tokenAgeTypeValue + ", keyword=" + this.keyword + ", needSocialLink=" + this.needSocialLink + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.scanner.surge.trending.data.SurgeTrendingChainFilterData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SurgeTrendingChainFilterData> serializer() {
            return SurgeTrendingChainFilterData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SurgeTrendingChainFilterData(int i, String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, int i2, String str8, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.rankType = "";
        } else {
            this.rankType = str;
        }
        if ((i & 2) == 0) {
            this.selectedProtocols = yDY.AhwBna();
        } else {
            this.selectedProtocols = list;
        }
        if ((i & 4) == 0) {
            this.marketCapMin = "";
        } else {
            this.marketCapMin = str2;
        }
        if ((i & 8) == 0) {
            this.marketCapMax = "";
        } else {
            this.marketCapMax = str3;
        }
        if ((i & 16) == 0) {
            this.volumeMin = "";
        } else {
            this.volumeMin = str4;
        }
        if ((i & 32) == 0) {
            this.volumeMax = "";
        } else {
            this.volumeMax = str5;
        }
        if ((i & 64) == 0) {
            this.tokenAgeMin = "";
        } else {
            this.tokenAgeMin = str6;
        }
        if ((i & 128) == 0) {
            this.tokenAgeMax = "";
        } else {
            this.tokenAgeMax = str7;
        }
        if ((i & 256) == 0) {
            this.tokenAgeTypeValue = 0;
        } else {
            this.tokenAgeTypeValue = i2;
        }
        if ((i & 512) == 0) {
            this.keyword = "";
        } else {
            this.keyword = str8;
        }
        if ((i & 1024) == 0) {
            this.needSocialLink = false;
        } else {
            this.needSocialLink = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(SurgeTrendingChainFilterData surgeTrendingChainFilterData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) surgeTrendingChainFilterData.rankType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, surgeTrendingChainFilterData.rankType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(surgeTrendingChainFilterData.selectedProtocols, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], surgeTrendingChainFilterData.selectedProtocols);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) surgeTrendingChainFilterData.marketCapMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, surgeTrendingChainFilterData.marketCapMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) surgeTrendingChainFilterData.marketCapMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, surgeTrendingChainFilterData.marketCapMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) surgeTrendingChainFilterData.volumeMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, surgeTrendingChainFilterData.volumeMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) surgeTrendingChainFilterData.volumeMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, surgeTrendingChainFilterData.volumeMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) surgeTrendingChainFilterData.tokenAgeMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, surgeTrendingChainFilterData.tokenAgeMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) surgeTrendingChainFilterData.tokenAgeMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, surgeTrendingChainFilterData.tokenAgeMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || surgeTrendingChainFilterData.tokenAgeTypeValue != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 8, surgeTrendingChainFilterData.tokenAgeTypeValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) surgeTrendingChainFilterData.keyword, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, surgeTrendingChainFilterData.keyword);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || surgeTrendingChainFilterData.needSocialLink) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 10, surgeTrendingChainFilterData.needSocialLink);
        }
    }

    public SurgeTrendingChainFilterData(@NotNull String str, @NotNull List<String> list, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, @NotNull String str8, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.rankType = str;
        this.selectedProtocols = list;
        this.marketCapMin = str2;
        this.marketCapMax = str3;
        this.volumeMin = str4;
        this.volumeMax = str5;
        this.tokenAgeMin = str6;
        this.tokenAgeMax = str7;
        this.tokenAgeTypeValue = i;
        this.keyword = str8;
        this.needSocialLink = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0072: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r25v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:25)) : (r15v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r25v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r25v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r25v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0045: ARITH (r25v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r22v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r25v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0055: ARITH (r25v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r24v0 boolean) : false)
 A[MD:(java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, boolean):void (m)] (LINE:23) call: com.okinc.business.market.features.scanner.surge.trending.data.SurgeTrendingChainFilterData.<init>(java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ SurgeTrendingChainFilterData(String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? yDY.AhwBna() : list, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? "" : str7, (i2 & 256) != 0 ? 0 : i, (i2 & 512) == 0 ? str8 : "", (i2 & 1024) == 0 ? z : false);
    }
}
