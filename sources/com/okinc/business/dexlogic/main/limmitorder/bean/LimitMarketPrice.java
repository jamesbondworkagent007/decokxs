package com.okinc.business.dexlogic.main.limmitorder.bean;

import com.okinc.business.dexlogic.bean.CommonDexInfo;
import com.okinc.business.dexlogic.bean.CommonDexInfo$$serializer;
import com.okinc.business.dexlogic.bean.DefiPlatformInfo;
import com.okinc.business.dexlogic.bean.DefiPlatformInfo$$serializer;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam$$serializer;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MevUnstableShowLevelType;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class LimitMarketPrice {
    private final String autoSlippage;
    private String changeRate;
    private final CommonDexInfo commonDexInfo;
    private final DefiPlatformInfo defiPlatformInfo;
    private final boolean enableJito;
    private String formatOriginValue;
    private final String fromMarketCapacity;
    private final boolean fromTokenIsDisplay;
    private String fromTokenPrice;
    private String gasToFromPercent;
    private boolean isHigh;
    private final String mevUnstableShowLevel;
    private String minSellAmount;
    private final String minimumReceived;
    private final NewFeeData newFeeData;
    private final String receiveAmount;
    private final ServiceFeeInfo serviceFeeInfo;
    private final int showRateFluctuation;
    private final DexAutoSlippageInfoParam slippageConfig;
    private final String toMarketCapacity;
    private final boolean toTokenIsDisplay;
    private String toTokenPrice;
    private boolean valDiff;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LimitMarketPrice() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (DefiPlatformInfo) null, (CommonDexInfo) null, false, (String) null, false, (String) null, false, (String) null, false, false, (String) null, (String) null, (String) null, (ServiceFeeInfo) null, (NewFeeData) null, 0, (DexAutoSlippageInfoParam) null, 8388607, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.changeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.mevUnstableShowLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.isHigh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.formatOriginValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component13() {
        return this.valDiff;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.gasToFromPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component15() {
        return this.fromTokenIsDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component16() {
        return this.toTokenIsDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.autoSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.minimumReceived;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.receiveAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo component20() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewFeeData component21() {
        return this.newFeeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component22() {
        return this.showRateFluctuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexAutoSlippageInfoParam component23() {
        return this.slippageConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fromMarketCapacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.toMarketCapacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.toTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.minSellAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefiPlatformInfo component7() {
        return this.defiPlatformInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonDexInfo component8() {
        return this.commonDexInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.enableJito;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitMarketPrice copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull DefiPlatformInfo defiPlatformInfo, @NotNull CommonDexInfo commonDexInfo, boolean z, @NotNull String str7, boolean z2, @NotNull String str8, boolean z3, @NotNull String str9, boolean z4, boolean z5, @NotNull String str10, @NotNull String str11, @NotNull String str12, ServiceFeeInfo serviceFeeInfo, NewFeeData newFeeData, int i, DexAutoSlippageInfoParam dexAutoSlippageInfoParam) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(defiPlatformInfo, "");
        Intrinsics.checkNotNullParameter(commonDexInfo, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        return new LimitMarketPrice(str, str2, str3, str4, str5, str6, defiPlatformInfo, commonDexInfo, z, str7, z2, str8, z3, str9, z4, z5, str10, str11, str12, serviceFeeInfo, newFeeData, i, dexAutoSlippageInfoParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitMarketPrice)) {
            return false;
        }
        LimitMarketPrice limitMarketPrice = (LimitMarketPrice) obj;
        return Intrinsics.EZpvd((Object) this.changeRate, (Object) limitMarketPrice.changeRate) && Intrinsics.EZpvd((Object) this.fromTokenPrice, (Object) limitMarketPrice.fromTokenPrice) && Intrinsics.EZpvd((Object) this.fromMarketCapacity, (Object) limitMarketPrice.fromMarketCapacity) && Intrinsics.EZpvd((Object) this.toMarketCapacity, (Object) limitMarketPrice.toMarketCapacity) && Intrinsics.EZpvd((Object) this.toTokenPrice, (Object) limitMarketPrice.toTokenPrice) && Intrinsics.EZpvd((Object) this.minSellAmount, (Object) limitMarketPrice.minSellAmount) && Intrinsics.EZpvd(this.defiPlatformInfo, limitMarketPrice.defiPlatformInfo) && Intrinsics.EZpvd(this.commonDexInfo, limitMarketPrice.commonDexInfo) && this.enableJito == limitMarketPrice.enableJito && Intrinsics.EZpvd((Object) this.mevUnstableShowLevel, (Object) limitMarketPrice.mevUnstableShowLevel) && this.isHigh == limitMarketPrice.isHigh && Intrinsics.EZpvd((Object) this.formatOriginValue, (Object) limitMarketPrice.formatOriginValue) && this.valDiff == limitMarketPrice.valDiff && Intrinsics.EZpvd((Object) this.gasToFromPercent, (Object) limitMarketPrice.gasToFromPercent) && this.fromTokenIsDisplay == limitMarketPrice.fromTokenIsDisplay && this.toTokenIsDisplay == limitMarketPrice.toTokenIsDisplay && Intrinsics.EZpvd((Object) this.autoSlippage, (Object) limitMarketPrice.autoSlippage) && Intrinsics.EZpvd((Object) this.minimumReceived, (Object) limitMarketPrice.minimumReceived) && Intrinsics.EZpvd((Object) this.receiveAmount, (Object) limitMarketPrice.receiveAmount) && Intrinsics.EZpvd(this.serviceFeeInfo, limitMarketPrice.serviceFeeInfo) && Intrinsics.EZpvd(this.newFeeData, limitMarketPrice.newFeeData) && this.showRateFluctuation == limitMarketPrice.showRateFluctuation && Intrinsics.EZpvd(this.slippageConfig, limitMarketPrice.slippageConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoSlippage() {
        return this.autoSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangeRate() {
        return this.changeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonDexInfo getCommonDexInfo() {
        return this.commonDexInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefiPlatformInfo getDefiPlatformInfo() {
        return this.defiPlatformInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnableJito() {
        return this.enableJito;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFormatOriginValue() {
        return this.formatOriginValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromMarketCapacity() {
        return this.fromMarketCapacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFromTokenIsDisplay() {
        return this.fromTokenIsDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenPrice() {
        return this.fromTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasToFromPercent() {
        return this.gasToFromPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMevUnstableShowLevel() {
        return this.mevUnstableShowLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinSellAmount() {
        return this.minSellAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinimumReceived() {
        return this.minimumReceived;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewFeeData getNewFeeData() {
        return this.newFeeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceiveAmount() {
        return this.receiveAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo getServiceFeeInfo() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getShowRateFluctuation() {
        return this.showRateFluctuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexAutoSlippageInfoParam getSlippageConfig() {
        return this.slippageConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToMarketCapacity() {
        return this.toMarketCapacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getToTokenIsDisplay() {
        return this.toTokenIsDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenPrice() {
        return this.toTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getValDiff() {
        return this.valDiff;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.changeRate.hashCode();
        int iHashCode2 = this.fromTokenPrice.hashCode();
        int iHashCode3 = this.fromMarketCapacity.hashCode();
        int iHashCode4 = this.toMarketCapacity.hashCode();
        int iHashCode5 = this.toTokenPrice.hashCode();
        int iHashCode6 = this.minSellAmount.hashCode();
        int iHashCode7 = this.defiPlatformInfo.hashCode();
        int iHashCode8 = this.commonDexInfo.hashCode();
        int iHashCode9 = Boolean.hashCode(this.enableJito);
        int iHashCode10 = this.mevUnstableShowLevel.hashCode();
        int iHashCode11 = Boolean.hashCode(this.isHigh);
        int iHashCode12 = this.formatOriginValue.hashCode();
        int iHashCode13 = Boolean.hashCode(this.valDiff);
        int iHashCode14 = this.gasToFromPercent.hashCode();
        int iHashCode15 = Boolean.hashCode(this.fromTokenIsDisplay);
        int iHashCode16 = Boolean.hashCode(this.toTokenIsDisplay);
        int iHashCode17 = this.autoSlippage.hashCode();
        int iHashCode18 = this.minimumReceived.hashCode();
        int iHashCode19 = this.receiveAmount.hashCode();
        ServiceFeeInfo serviceFeeInfo = this.serviceFeeInfo;
        int iHashCode20 = serviceFeeInfo == null ? 0 : serviceFeeInfo.hashCode();
        NewFeeData newFeeData = this.newFeeData;
        int iHashCode21 = newFeeData == null ? 0 : newFeeData.hashCode();
        int iHashCode22 = Integer.hashCode(this.showRateFluctuation);
        DexAutoSlippageInfoParam dexAutoSlippageInfoParam = this.slippageConfig;
        return (((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + (dexAutoSlippageInfoParam != null ? dexAutoSlippageInfoParam.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHigh() {
        return this.isHigh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangeRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.changeRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFormatOriginValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.formatOriginValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromTokenPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fromTokenPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasToFromPercent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gasToFromPercent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHigh(boolean z) {
        this.isHigh = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinSellAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minSellAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToTokenPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toTokenPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValDiff(boolean z) {
        this.valDiff = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LimitMarketPrice(changeRate=" + this.changeRate + ", fromTokenPrice=" + this.fromTokenPrice + ", fromMarketCapacity=" + this.fromMarketCapacity + ", toMarketCapacity=" + this.toMarketCapacity + ", toTokenPrice=" + this.toTokenPrice + ", minSellAmount=" + this.minSellAmount + ", defiPlatformInfo=" + this.defiPlatformInfo + ", commonDexInfo=" + this.commonDexInfo + ", enableJito=" + this.enableJito + ", mevUnstableShowLevel=" + this.mevUnstableShowLevel + ", isHigh=" + this.isHigh + ", formatOriginValue=" + this.formatOriginValue + ", valDiff=" + this.valDiff + ", gasToFromPercent=" + this.gasToFromPercent + ", fromTokenIsDisplay=" + this.fromTokenIsDisplay + ", toTokenIsDisplay=" + this.toTokenIsDisplay + ", autoSlippage=" + this.autoSlippage + ", minimumReceived=" + this.minimumReceived + ", receiveAmount=" + this.receiveAmount + ", serviceFeeInfo=" + this.serviceFeeInfo + ", newFeeData=" + this.newFeeData + ", showRateFluctuation=" + this.showRateFluctuation + ", slippageConfig=" + this.slippageConfig + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.limmitorder.bean.LimitMarketPrice.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LimitMarketPrice> serializer() {
            return LimitMarketPrice$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LimitMarketPrice(int i, String str, String str2, String str3, String str4, String str5, String str6, DefiPlatformInfo defiPlatformInfo, CommonDexInfo commonDexInfo, boolean z, String str7, boolean z2, String str8, boolean z3, String str9, boolean z4, boolean z5, String str10, String str11, String str12, ServiceFeeInfo serviceFeeInfo, NewFeeData newFeeData, int i2, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.changeRate = "";
        } else {
            this.changeRate = str;
        }
        if ((i & 2) == 0) {
            this.fromTokenPrice = "";
        } else {
            this.fromTokenPrice = str2;
        }
        if ((i & 4) == 0) {
            this.fromMarketCapacity = "";
        } else {
            this.fromMarketCapacity = str3;
        }
        if ((i & 8) == 0) {
            this.toMarketCapacity = "";
        } else {
            this.toMarketCapacity = str4;
        }
        if ((i & 16) == 0) {
            this.toTokenPrice = "";
        } else {
            this.toTokenPrice = str5;
        }
        if ((i & 32) == 0) {
            this.minSellAmount = "";
        } else {
            this.minSellAmount = str6;
        }
        this.defiPlatformInfo = (i & 64) == 0 ? new DefiPlatformInfo((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : defiPlatformInfo;
        this.commonDexInfo = (i & 128) == 0 ? new CommonDexInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (DexMultiTokenInfoBean) null, (DexMultiTokenInfoBean) null, (DefiPlatformInfo) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 15, (DefaultConstructorMarker) null) : commonDexInfo;
        if ((i & 256) == 0) {
            this.enableJito = false;
        } else {
            this.enableJito = z;
        }
        this.mevUnstableShowLevel = (i & 512) == 0 ? MevUnstableShowLevelType.NORMAL.getType() : str7;
        if ((i & 1024) == 0) {
            this.isHigh = false;
        } else {
            this.isHigh = z2;
        }
        if ((i & 2048) == 0) {
            this.formatOriginValue = "";
        } else {
            this.formatOriginValue = str8;
        }
        if ((i & 4096) == 0) {
            this.valDiff = false;
        } else {
            this.valDiff = z3;
        }
        if ((i & 8192) == 0) {
            this.gasToFromPercent = "";
        } else {
            this.gasToFromPercent = str9;
        }
        if ((i & 16384) == 0) {
            this.fromTokenIsDisplay = false;
        } else {
            this.fromTokenIsDisplay = z4;
        }
        if ((32768 & i) == 0) {
            this.toTokenIsDisplay = false;
        } else {
            this.toTokenIsDisplay = z5;
        }
        if ((65536 & i) == 0) {
            this.autoSlippage = "";
        } else {
            this.autoSlippage = str10;
        }
        if ((131072 & i) == 0) {
            this.minimumReceived = "";
        } else {
            this.minimumReceived = str11;
        }
        if ((262144 & i) == 0) {
            this.receiveAmount = "";
        } else {
            this.receiveAmount = str12;
        }
        if ((524288 & i) == 0) {
            this.serviceFeeInfo = null;
        } else {
            this.serviceFeeInfo = serviceFeeInfo;
        }
        if ((1048576 & i) == 0) {
            this.newFeeData = null;
        } else {
            this.newFeeData = newFeeData;
        }
        this.showRateFluctuation = (2097152 & i) == 0 ? ShowRateFluctuation.DoNotShowTips.getType() : i2;
        if ((i & 4194304) == 0) {
            this.slippageConfig = null;
        } else {
            this.slippageConfig = dexAutoSlippageInfoParam;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [99=5] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$OKDex_dex_impl(LimitMarketPrice limitMarketPrice, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) limitMarketPrice.changeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, limitMarketPrice.changeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) limitMarketPrice.fromTokenPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, limitMarketPrice.fromTokenPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) limitMarketPrice.fromMarketCapacity, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, limitMarketPrice.fromMarketCapacity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) limitMarketPrice.toMarketCapacity, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, limitMarketPrice.toMarketCapacity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) limitMarketPrice.toTokenPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, limitMarketPrice.toTokenPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) limitMarketPrice.minSellAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, limitMarketPrice.minSellAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(limitMarketPrice.defiPlatformInfo, new DefiPlatformInfo((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, DefiPlatformInfo$$serializer.INSTANCE, limitMarketPrice.defiPlatformInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7)) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, CommonDexInfo$$serializer.INSTANCE, limitMarketPrice.commonDexInfo);
        } else {
            String str = null;
            if (!Intrinsics.EZpvd(limitMarketPrice.commonDexInfo, new CommonDexInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str, str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (DexMultiTokenInfoBean) null, (DexMultiTokenInfoBean) null, (DefiPlatformInfo) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 15, (DefaultConstructorMarker) null))) {
            }
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || limitMarketPrice.enableJito) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 8, limitMarketPrice.enableJito);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) limitMarketPrice.mevUnstableShowLevel, (Object) MevUnstableShowLevelType.NORMAL.getType())) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, limitMarketPrice.mevUnstableShowLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || limitMarketPrice.isHigh) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 10, limitMarketPrice.isHigh);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) limitMarketPrice.formatOriginValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, limitMarketPrice.formatOriginValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || limitMarketPrice.valDiff) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 12, limitMarketPrice.valDiff);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) limitMarketPrice.gasToFromPercent, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, limitMarketPrice.gasToFromPercent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || limitMarketPrice.fromTokenIsDisplay) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 14, limitMarketPrice.fromTokenIsDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || limitMarketPrice.toTokenIsDisplay) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 15, limitMarketPrice.toTokenIsDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) limitMarketPrice.autoSlippage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, limitMarketPrice.autoSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) limitMarketPrice.minimumReceived, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, limitMarketPrice.minimumReceived);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) limitMarketPrice.receiveAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, limitMarketPrice.receiveAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || limitMarketPrice.serviceFeeInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, ServiceFeeInfo$$serializer.INSTANCE, limitMarketPrice.serviceFeeInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || limitMarketPrice.newFeeData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, NewFeeData$$serializer.INSTANCE, limitMarketPrice.newFeeData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || limitMarketPrice.showRateFluctuation != ShowRateFluctuation.DoNotShowTips.getType()) {
            compositeEncoder.encodeIntElement(serialDescriptor, 21, limitMarketPrice.showRateFluctuation);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) && limitMarketPrice.slippageConfig == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, DexAutoSlippageInfoParam$$serializer.INSTANCE, limitMarketPrice.slippageConfig);
    }

    public LimitMarketPrice(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull DefiPlatformInfo defiPlatformInfo, @NotNull CommonDexInfo commonDexInfo, boolean z, @NotNull String str7, boolean z2, @NotNull String str8, boolean z3, @NotNull String str9, boolean z4, boolean z5, @NotNull String str10, @NotNull String str11, @NotNull String str12, ServiceFeeInfo serviceFeeInfo, NewFeeData newFeeData, int i, DexAutoSlippageInfoParam dexAutoSlippageInfoParam) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(defiPlatformInfo, "");
        Intrinsics.checkNotNullParameter(commonDexInfo, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        this.changeRate = str;
        this.fromTokenPrice = str2;
        this.fromMarketCapacity = str3;
        this.toMarketCapacity = str4;
        this.toTokenPrice = str5;
        this.minSellAmount = str6;
        this.defiPlatformInfo = defiPlatformInfo;
        this.commonDexInfo = commonDexInfo;
        this.enableJito = z;
        this.mevUnstableShowLevel = str7;
        this.isHigh = z2;
        this.formatOriginValue = str8;
        this.valDiff = z3;
        this.gasToFromPercent = str9;
        this.fromTokenIsDisplay = z4;
        this.toTokenIsDisplay = z5;
        this.autoSlippage = str10;
        this.minimumReceived = str11;
        this.receiveAmount = str12;
        this.serviceFeeInfo = serviceFeeInfo;
        this.newFeeData = newFeeData;
        this.showRateFluctuation = i;
        this.slippageConfig = dexAutoSlippageInfoParam;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0177: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r74v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r74v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r74v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r74v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r74v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r74v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.DefiPlatformInfo:?: TERNARY null = ((wrap:int:0x0034: ARITH (r74v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004f: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:108) call: com.okinc.business.dexlogic.bean.DefiPlatformInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r57v0 com.okinc.business.dexlogic.bean.DefiPlatformInfo))
  (wrap:com.okinc.business.dexlogic.bean.CommonDexInfo:?: TERNARY null = ((wrap:int:0x0055: ARITH (r74v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00a5: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: CAST (com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: CAST (com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:com.okinc.business.dexlogic.bean.DefiPlatformInfo:?: CAST (com.okinc.business.dexlogic.bean.DefiPlatformInfo) (null com.okinc.business.dexlogic.bean.DefiPlatformInfo))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (-1 int)
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DefiPlatformInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:109) call: com.okinc.business.dexlogic.bean.CommonDexInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DefiPlatformInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r58v0 com.okinc.business.dexlogic.bean.CommonDexInfo))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00ab: ARITH (r74v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r59v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b3: ARITH (r74v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00b9: INVOKE 
  (wrap:com.okinc.business.dexlogic.bean.MevUnstableShowLevelType:0x00b7: SGET  A[WRAPPED] (LINE:111) com.okinc.business.dexlogic.bean.MevUnstableShowLevelType.NORMAL com.okinc.business.dexlogic.bean.MevUnstableShowLevelType)
 VIRTUAL call: com.okinc.business.dexlogic.bean.MevUnstableShowLevelType.getType():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:111)) : (r60v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00c0: ARITH (r74v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r61v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c8: ARITH (r74v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00d0: ARITH (r74v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r63v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d8: ARITH (r74v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00e2: ARITH (r74v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? false : (r65v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00ed: ARITH (r74v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? false : (r66v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f8: ARITH (r74v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0103: ARITH (r74v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010e: ARITH (r74v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.ServiceFeeInfo:?: TERNARY null = ((wrap:int:0x0119: ARITH (r74v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.ServiceFeeInfo) : (r70v0 com.okinc.business.dexlogic.bean.ServiceFeeInfo))
  (wrap:com.okinc.business.dexlogic.main.limmitorder.bean.NewFeeData:?: TERNARY null = ((wrap:int:0x0126: ARITH (r74v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.main.limmitorder.bean.NewFeeData) : (r71v0 com.okinc.business.dexlogic.main.limmitorder.bean.NewFeeData))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0131: ARITH (r74v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0137: INVOKE 
  (wrap:com.okinc.business.dexlogic.main.limmitorder.bean.ShowRateFluctuation:0x0135: SGET  A[WRAPPED] (LINE:123) com.okinc.business.dexlogic.main.limmitorder.bean.ShowRateFluctuation.DoNotShowTips com.okinc.business.dexlogic.main.limmitorder.bean.ShowRateFluctuation)
 VIRTUAL call: com.okinc.business.dexlogic.main.limmitorder.bean.ShowRateFluctuation.getType():int A[MD:():int (m), WRAPPED] (LINE:123)) : (r72v0 int))
  (wrap:com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam:?: TERNARY null = ((wrap:int:0x0140: ARITH (r74v0 int) & (4194304 int) A[WRAPPED]) == (0 int)) ? (r73v0 com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam) : (null com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DefiPlatformInfo, com.okinc.business.dexlogic.bean.CommonDexInfo, boolean, java.lang.String, boolean, java.lang.String, boolean, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.ServiceFeeInfo, com.okinc.business.dexlogic.main.limmitorder.bean.NewFeeData, int, com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam):void (m)] (LINE:101) call: com.okinc.business.dexlogic.main.limmitorder.bean.LimitMarketPrice.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DefiPlatformInfo, com.okinc.business.dexlogic.bean.CommonDexInfo, boolean, java.lang.String, boolean, java.lang.String, boolean, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.ServiceFeeInfo, com.okinc.business.dexlogic.main.limmitorder.bean.NewFeeData, int, com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam):void type: THIS */
    public /* synthetic */ LimitMarketPrice(String str, String str2, String str3, String str4, String str5, String str6, DefiPlatformInfo defiPlatformInfo, CommonDexInfo commonDexInfo, boolean z, String str7, boolean z2, String str8, boolean z3, String str9, boolean z4, boolean z5, String str10, String str11, String str12, ServiceFeeInfo serviceFeeInfo, NewFeeData newFeeData, int i, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? new DefiPlatformInfo((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : defiPlatformInfo, (i2 & 128) != 0 ? new CommonDexInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (DexMultiTokenInfoBean) null, (DexMultiTokenInfoBean) null, (DefiPlatformInfo) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 15, (DefaultConstructorMarker) null) : commonDexInfo, (i2 & 256) != 0 ? false : z, (i2 & 512) != 0 ? MevUnstableShowLevelType.NORMAL.getType() : str7, (i2 & 1024) != 0 ? false : z2, (i2 & 2048) != 0 ? "" : str8, (i2 & 4096) != 0 ? false : z3, (i2 & 8192) != 0 ? "" : str9, (i2 & 16384) != 0 ? false : z4, (i2 & 32768) != 0 ? false : z5, (i2 & 65536) != 0 ? "" : str10, (i2 & 131072) != 0 ? "" : str11, (i2 & 262144) != 0 ? "" : str12, (i2 & 524288) != 0 ? null : serviceFeeInfo, (i2 & 1048576) != 0 ? null : newFeeData, (i2 & 2097152) != 0 ? ShowRateFluctuation.DoNotShowTips.getType() : i, (i2 & 4194304) == 0 ? dexAutoSlippageInfoParam : null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class QuoteState {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ QuoteState[] $VALUES;
        public static final QuoteState QuoteSuccess = new QuoteState("QuoteSuccess", 0);
        public static final QuoteState Quoting = new QuoteState("Quoting", 1);
        public static final QuoteState NoLiquidity = new QuoteState("NoLiquidity", 2);
        public static final QuoteState QuoteFail = new QuoteState("QuoteFail", 3);
        public static final QuoteState QuoteHoneyPot = new QuoteState("QuoteHoneyPot", 4);
        public static final QuoteState NoLiquidityAtTheMoment = new QuoteState("NoLiquidityAtTheMoment", 5);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ QuoteState[] $values() {
            return new QuoteState[]{QuoteSuccess, Quoting, NoLiquidity, QuoteFail, QuoteHoneyPot, NoLiquidityAtTheMoment};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<QuoteState> getEntries() {
            return $ENTRIES;
        }

        private QuoteState(String str, int i) {
        }

        static {
            QuoteState[] quoteStateArr$values = $values();
            $VALUES = quoteStateArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(quoteStateArr$values);
        }

        public static QuoteState valueOf(String str) {
            return (QuoteState) Enum.valueOf(QuoteState.class, str);
        }

        public static QuoteState[] values() {
            return (QuoteState[]) $VALUES.clone();
        }
    }
}
