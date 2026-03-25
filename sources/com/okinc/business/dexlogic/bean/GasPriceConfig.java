package com.okinc.business.dexlogic.bean;

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
public final class GasPriceConfig {
    private String average;
    private String averageCost;
    private String baseFee;
    private String fast;
    private String fastCost;
    private String fastPriorityFee;
    private final String gasPriceScalar;
    private String gasPriceUnit;
    private String gweiPrecision;
    private String proposePriorityFee;
    private String safePriorityFee;
    private String slow;
    private String slowCost;
    private String suggestBaseFee;
    private boolean supportEip1559;
    private String usdAverage;
    private String usdFast;
    private String usdLow;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GasPriceConfig() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, 262143, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.slow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.slowCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.proposePriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.safePriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.fastPriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.suggestBaseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.baseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component16() {
        return this.supportEip1559;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.gasPriceUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.gasPriceScalar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.average;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.usdAverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.usdFast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.usdLow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.gweiPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.fastCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.averageCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasPriceConfig copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, boolean z, @NotNull String str16, @NotNull String str17) {
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
        Intrinsics.checkNotNullParameter(str17, "");
        return new GasPriceConfig(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, z, str16, str17);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GasPriceConfig)) {
            return false;
        }
        GasPriceConfig gasPriceConfig = (GasPriceConfig) obj;
        return Intrinsics.EZpvd((Object) this.slow, (Object) gasPriceConfig.slow) && Intrinsics.EZpvd((Object) this.average, (Object) gasPriceConfig.average) && Intrinsics.EZpvd((Object) this.fast, (Object) gasPriceConfig.fast) && Intrinsics.EZpvd((Object) this.usdAverage, (Object) gasPriceConfig.usdAverage) && Intrinsics.EZpvd((Object) this.usdFast, (Object) gasPriceConfig.usdFast) && Intrinsics.EZpvd((Object) this.usdLow, (Object) gasPriceConfig.usdLow) && Intrinsics.EZpvd((Object) this.gweiPrecision, (Object) gasPriceConfig.gweiPrecision) && Intrinsics.EZpvd((Object) this.fastCost, (Object) gasPriceConfig.fastCost) && Intrinsics.EZpvd((Object) this.averageCost, (Object) gasPriceConfig.averageCost) && Intrinsics.EZpvd((Object) this.slowCost, (Object) gasPriceConfig.slowCost) && Intrinsics.EZpvd((Object) this.proposePriorityFee, (Object) gasPriceConfig.proposePriorityFee) && Intrinsics.EZpvd((Object) this.safePriorityFee, (Object) gasPriceConfig.safePriorityFee) && Intrinsics.EZpvd((Object) this.fastPriorityFee, (Object) gasPriceConfig.fastPriorityFee) && Intrinsics.EZpvd((Object) this.suggestBaseFee, (Object) gasPriceConfig.suggestBaseFee) && Intrinsics.EZpvd((Object) this.baseFee, (Object) gasPriceConfig.baseFee) && this.supportEip1559 == gasPriceConfig.supportEip1559 && Intrinsics.EZpvd((Object) this.gasPriceUnit, (Object) gasPriceConfig.gasPriceUnit) && Intrinsics.EZpvd((Object) this.gasPriceScalar, (Object) gasPriceConfig.gasPriceScalar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAverage() {
        return this.average;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAverageCost() {
        return this.averageCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseFee() {
        return this.baseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFast() {
        return this.fast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFastCost() {
        return this.fastCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFastPriorityFee() {
        return this.fastPriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPriceScalar() {
        return this.gasPriceScalar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPriceUnit() {
        return this.gasPriceUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGweiPrecision() {
        return this.gweiPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProposePriorityFee() {
        return this.proposePriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSafePriorityFee() {
        return this.safePriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlow() {
        return this.slow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlowCost() {
        return this.slowCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSuggestBaseFee() {
        return this.suggestBaseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportEip1559() {
        return this.supportEip1559;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdAverage() {
        return this.usdAverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdFast() {
        return this.usdFast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdLow() {
        return this.usdLow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.slow.hashCode() * 31) + this.average.hashCode()) * 31) + this.fast.hashCode()) * 31) + this.usdAverage.hashCode()) * 31) + this.usdFast.hashCode()) * 31) + this.usdLow.hashCode()) * 31) + this.gweiPrecision.hashCode()) * 31) + this.fastCost.hashCode()) * 31) + this.averageCost.hashCode()) * 31) + this.slowCost.hashCode()) * 31) + this.proposePriorityFee.hashCode()) * 31) + this.safePriorityFee.hashCode()) * 31) + this.fastPriorityFee.hashCode()) * 31) + this.suggestBaseFee.hashCode()) * 31) + this.baseFee.hashCode()) * 31) + Boolean.hashCode(this.supportEip1559)) * 31) + this.gasPriceUnit.hashCode()) * 31) + this.gasPriceScalar.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAverage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.average = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAverageCost(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.averageCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFast(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fast = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFastCost(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fastCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFastPriorityFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fastPriorityFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasPriceUnit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gasPriceUnit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGweiPrecision(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gweiPrecision = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProposePriorityFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.proposePriorityFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSafePriorityFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.safePriorityFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlow(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slow = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlowCost(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slowCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSuggestBaseFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.suggestBaseFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportEip1559(boolean z) {
        this.supportEip1559 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdAverage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.usdAverage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdFast(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.usdFast = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdLow(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.usdLow = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GasPriceConfig(slow=" + this.slow + ", average=" + this.average + ", fast=" + this.fast + ", usdAverage=" + this.usdAverage + ", usdFast=" + this.usdFast + ", usdLow=" + this.usdLow + ", gweiPrecision=" + this.gweiPrecision + ", fastCost=" + this.fastCost + ", averageCost=" + this.averageCost + ", slowCost=" + this.slowCost + ", proposePriorityFee=" + this.proposePriorityFee + ", safePriorityFee=" + this.safePriorityFee + ", fastPriorityFee=" + this.fastPriorityFee + ", suggestBaseFee=" + this.suggestBaseFee + ", baseFee=" + this.baseFee + ", supportEip1559=" + this.supportEip1559 + ", gasPriceUnit=" + this.gasPriceUnit + ", gasPriceScalar=" + this.gasPriceScalar + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.GasPriceConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GasPriceConfig> serializer() {
            return GasPriceConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GasPriceConfig(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z, String str16, String str17, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.slow = "0.0";
        } else {
            this.slow = str;
        }
        if ((i & 2) == 0) {
            this.average = "0.0";
        } else {
            this.average = str2;
        }
        if ((i & 4) == 0) {
            this.fast = "0.0";
        } else {
            this.fast = str3;
        }
        if ((i & 8) == 0) {
            this.usdAverage = "0";
        } else {
            this.usdAverage = str4;
        }
        if ((i & 16) == 0) {
            this.usdFast = "0";
        } else {
            this.usdFast = str5;
        }
        if ((i & 32) == 0) {
            this.usdLow = "0";
        } else {
            this.usdLow = str6;
        }
        if ((i & 64) == 0) {
            this.gweiPrecision = "";
        } else {
            this.gweiPrecision = str7;
        }
        if ((i & 128) == 0) {
            this.fastCost = "";
        } else {
            this.fastCost = str8;
        }
        if ((i & 256) == 0) {
            this.averageCost = "";
        } else {
            this.averageCost = str9;
        }
        if ((i & 512) == 0) {
            this.slowCost = "";
        } else {
            this.slowCost = str10;
        }
        if ((i & 1024) == 0) {
            this.proposePriorityFee = "";
        } else {
            this.proposePriorityFee = str11;
        }
        if ((i & 2048) == 0) {
            this.safePriorityFee = "";
        } else {
            this.safePriorityFee = str12;
        }
        if ((i & 4096) == 0) {
            this.fastPriorityFee = "";
        } else {
            this.fastPriorityFee = str13;
        }
        if ((i & 8192) == 0) {
            this.suggestBaseFee = "";
        } else {
            this.suggestBaseFee = str14;
        }
        if ((i & 16384) == 0) {
            this.baseFee = "";
        } else {
            this.baseFee = str15;
        }
        this.supportEip1559 = (32768 & i) == 0 ? false : z;
        if ((65536 & i) == 0) {
            this.gasPriceUnit = "";
        } else {
            this.gasPriceUnit = str16;
        }
        if ((i & 131072) == 0) {
            this.gasPriceScalar = "";
        } else {
            this.gasPriceScalar = str17;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(GasPriceConfig gasPriceConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) gasPriceConfig.slow, (Object) "0.0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, gasPriceConfig.slow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) gasPriceConfig.average, (Object) "0.0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, gasPriceConfig.average);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) gasPriceConfig.fast, (Object) "0.0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, gasPriceConfig.fast);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) gasPriceConfig.usdAverage, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, gasPriceConfig.usdAverage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) gasPriceConfig.usdFast, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, gasPriceConfig.usdFast);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) gasPriceConfig.usdLow, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, gasPriceConfig.usdLow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) gasPriceConfig.gweiPrecision, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, gasPriceConfig.gweiPrecision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) gasPriceConfig.fastCost, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, gasPriceConfig.fastCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) gasPriceConfig.averageCost, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, gasPriceConfig.averageCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) gasPriceConfig.slowCost, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, gasPriceConfig.slowCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) gasPriceConfig.proposePriorityFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, gasPriceConfig.proposePriorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) gasPriceConfig.safePriorityFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, gasPriceConfig.safePriorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) gasPriceConfig.fastPriorityFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, gasPriceConfig.fastPriorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) gasPriceConfig.suggestBaseFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, gasPriceConfig.suggestBaseFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) gasPriceConfig.baseFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, gasPriceConfig.baseFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || gasPriceConfig.supportEip1559) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 15, gasPriceConfig.supportEip1559);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) gasPriceConfig.gasPriceUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, gasPriceConfig.gasPriceUnit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) && Intrinsics.EZpvd((Object) gasPriceConfig.gasPriceScalar, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 17, gasPriceConfig.gasPriceScalar);
    }

    public GasPriceConfig(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, boolean z, @NotNull String str16, @NotNull String str17) {
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
        Intrinsics.checkNotNullParameter(str17, "");
        this.slow = str;
        this.average = str2;
        this.fast = str3;
        this.usdAverage = str4;
        this.usdFast = str5;
        this.usdLow = str6;
        this.gweiPrecision = str7;
        this.fastCost = str8;
        this.averageCost = str9;
        this.slowCost = str10;
        this.proposePriorityFee = str11;
        this.safePriorityFee = str12;
        this.fastPriorityFee = str13;
        this.suggestBaseFee = str14;
        this.baseFee = str15;
        this.supportEip1559 = z;
        this.gasPriceUnit = str16;
        this.gasPriceScalar = str17;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c9: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r38v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0.0") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r38v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("0.0") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r38v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r22v0 java.lang.String) : ("0.0"))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r38v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("0") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r38v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("0") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r38v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : ("0"))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r38v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r38v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r38v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r38v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r38v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r38v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0066: ARITH (r38v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006e: ARITH (r38v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0078: ARITH (r38v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0084: ARITH (r38v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? false : (r35v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008f: ARITH (r38v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009a: ARITH (r38v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String):void (m)] (LINE:1442) call: com.okinc.business.dexlogic.bean.GasPriceConfig.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ GasPriceConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z, String str16, String str17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0.0" : str, (i & 2) != 0 ? "0.0" : str2, (i & 4) == 0 ? str3 : "0.0", (i & 8) != 0 ? "0" : str4, (i & 16) != 0 ? "0" : str5, (i & 32) == 0 ? str6 : "0", (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? false : z, (i & 65536) != 0 ? "" : str16, (i & 131072) != 0 ? "" : str17);
    }

    public final String getGasPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((Object) str, (Object) "0") ? this.slow : Intrinsics.EZpvd((Object) str, (Object) "1") ? this.average : this.fast;
    }
}
