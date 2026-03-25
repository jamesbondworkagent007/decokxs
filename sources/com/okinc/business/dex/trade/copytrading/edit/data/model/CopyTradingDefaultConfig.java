package com.okinc.business.dex.trade.copytrading.edit.data.model;

import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo$$serializer;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedChainType;
import com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CopyTradingDefaultConfig {
    private final String chainId;
    private final String chainType;
    private final boolean dynamicSupportMax;
    private final String gasPriceUnitDecimal;
    private final String minBuyAmountUSD;
    private final String minLimitNativeTokenBalance;
    private final String nativeTokenPrice;
    private final String networkFeeDecimals;
    private final String networkFeeUnit;
    private final CopyTradingPresetConfig preset;
    private final ServiceFeeInfo serviceFeeInfo;
    private final boolean supportAutoMode;
    private final boolean supportCustomGasFee;
    private final boolean supportSlippage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CopyTradingDefaultConfig() {
        this((String) null, (String) null, (CopyTradingPresetConfig) null, (ServiceFeeInfo) null, (String) null, (String) null, (String) null, (String) null, false, false, false, false, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.supportCustomGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.supportSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.dynamicSupportMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.networkFeeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.networkFeeDecimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CopyTradingPresetConfig component3() {
        return this.preset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo component4() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.nativeTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.gasPriceUnitDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.minBuyAmountUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.minLimitNativeTokenBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.supportAutoMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CopyTradingDefaultConfig copy(@NotNull String str, @NotNull String str2, @NotNull CopyTradingPresetConfig copyTradingPresetConfig, @NotNull ServiceFeeInfo serviceFeeInfo, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, boolean z2, boolean z3, boolean z4, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(copyTradingPresetConfig, "");
        Intrinsics.checkNotNullParameter(serviceFeeInfo, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new CopyTradingDefaultConfig(str, str2, copyTradingPresetConfig, serviceFeeInfo, str3, str4, str5, str6, z, z2, z3, z4, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CopyTradingDefaultConfig)) {
            return false;
        }
        CopyTradingDefaultConfig copyTradingDefaultConfig = (CopyTradingDefaultConfig) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) copyTradingDefaultConfig.chainId) && Intrinsics.EZpvd((Object) this.chainType, (Object) copyTradingDefaultConfig.chainType) && Intrinsics.EZpvd(this.preset, copyTradingDefaultConfig.preset) && Intrinsics.EZpvd(this.serviceFeeInfo, copyTradingDefaultConfig.serviceFeeInfo) && Intrinsics.EZpvd((Object) this.nativeTokenPrice, (Object) copyTradingDefaultConfig.nativeTokenPrice) && Intrinsics.EZpvd((Object) this.gasPriceUnitDecimal, (Object) copyTradingDefaultConfig.gasPriceUnitDecimal) && Intrinsics.EZpvd((Object) this.minBuyAmountUSD, (Object) copyTradingDefaultConfig.minBuyAmountUSD) && Intrinsics.EZpvd((Object) this.minLimitNativeTokenBalance, (Object) copyTradingDefaultConfig.minLimitNativeTokenBalance) && this.supportAutoMode == copyTradingDefaultConfig.supportAutoMode && this.supportCustomGasFee == copyTradingDefaultConfig.supportCustomGasFee && this.supportSlippage == copyTradingDefaultConfig.supportSlippage && this.dynamicSupportMax == copyTradingDefaultConfig.dynamicSupportMax && Intrinsics.EZpvd((Object) this.networkFeeUnit, (Object) copyTradingDefaultConfig.networkFeeUnit) && Intrinsics.EZpvd((Object) this.networkFeeDecimals, (Object) copyTradingDefaultConfig.networkFeeDecimals);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainType() {
        return this.chainType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDynamicSupportMax() {
        return this.dynamicSupportMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPriceUnitDecimal() {
        return this.gasPriceUnitDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinBuyAmountUSD() {
        return this.minBuyAmountUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinLimitNativeTokenBalance() {
        return this.minLimitNativeTokenBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNativeTokenPrice() {
        return this.nativeTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkFeeDecimals() {
        return this.networkFeeDecimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkFeeUnit() {
        return this.networkFeeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CopyTradingPresetConfig getPreset() {
        return this.preset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo getServiceFeeInfo() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportAutoMode() {
        return this.supportAutoMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportCustomGasFee() {
        return this.supportCustomGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportSlippage() {
        return this.supportSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((this.chainId.hashCode() * 31) + this.chainType.hashCode()) * 31) + this.preset.hashCode()) * 31) + this.serviceFeeInfo.hashCode()) * 31) + this.nativeTokenPrice.hashCode()) * 31) + this.gasPriceUnitDecimal.hashCode()) * 31) + this.minBuyAmountUSD.hashCode()) * 31) + this.minLimitNativeTokenBalance.hashCode()) * 31) + Boolean.hashCode(this.supportAutoMode)) * 31) + Boolean.hashCode(this.supportCustomGasFee)) * 31) + Boolean.hashCode(this.supportSlippage)) * 31) + Boolean.hashCode(this.dynamicSupportMax)) * 31) + this.networkFeeUnit.hashCode()) * 31) + this.networkFeeDecimals.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CopyTradingDefaultConfig(chainId=" + this.chainId + ", chainType=" + this.chainType + ", preset=" + this.preset + ", serviceFeeInfo=" + this.serviceFeeInfo + ", nativeTokenPrice=" + this.nativeTokenPrice + ", gasPriceUnitDecimal=" + this.gasPriceUnitDecimal + ", minBuyAmountUSD=" + this.minBuyAmountUSD + ", minLimitNativeTokenBalance=" + this.minLimitNativeTokenBalance + ", supportAutoMode=" + this.supportAutoMode + ", supportCustomGasFee=" + this.supportCustomGasFee + ", supportSlippage=" + this.supportSlippage + ", dynamicSupportMax=" + this.dynamicSupportMax + ", networkFeeUnit=" + this.networkFeeUnit + ", networkFeeDecimals=" + this.networkFeeDecimals + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingDefaultConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CopyTradingDefaultConfig> serializer() {
            return CopyTradingDefaultConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CopyTradingDefaultConfig(int i, String str, String str2, CopyTradingPresetConfig copyTradingPresetConfig, ServiceFeeInfo serviceFeeInfo, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        CopyTradingPresetConfig copyTradingPresetConfig2;
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        this.chainType = (i & 2) == 0 ? AdvancedChainType.OTHER.getValue() : str2;
        if ((i & 4) == 0) {
            copyTradingPresetConfig2 = new CopyTradingPresetConfig((BuySellPreset) null, (BuySellPreset) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        } else {
            copyTradingPresetConfig2 = copyTradingPresetConfig;
        }
        this.preset = copyTradingPresetConfig2;
        this.serviceFeeInfo = (i & 8) == 0 ? new ServiceFeeInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null) : serviceFeeInfo;
        if ((i & 16) == 0) {
            this.nativeTokenPrice = "";
        } else {
            this.nativeTokenPrice = str3;
        }
        if ((i & 32) == 0) {
            this.gasPriceUnitDecimal = "";
        } else {
            this.gasPriceUnitDecimal = str4;
        }
        if ((i & 64) == 0) {
            this.minBuyAmountUSD = "";
        } else {
            this.minBuyAmountUSD = str5;
        }
        if ((i & 128) == 0) {
            this.minLimitNativeTokenBalance = "";
        } else {
            this.minLimitNativeTokenBalance = str6;
        }
        if ((i & 256) == 0) {
            this.supportAutoMode = false;
        } else {
            this.supportAutoMode = z;
        }
        if ((i & 512) == 0) {
            this.supportCustomGasFee = false;
        } else {
            this.supportCustomGasFee = z2;
        }
        if ((i & 1024) == 0) {
            this.supportSlippage = false;
        } else {
            this.supportSlippage = z3;
        }
        if ((i & 2048) == 0) {
            this.dynamicSupportMax = false;
        } else {
            this.dynamicSupportMax = z4;
        }
        if ((i & 4096) == 0) {
            this.networkFeeUnit = "";
        } else {
            this.networkFeeUnit = str7;
        }
        if ((i & 8192) == 0) {
            this.networkFeeDecimals = "";
        } else {
            this.networkFeeDecimals = str8;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [9=4] */
    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CopyTradingDefaultConfig copyTradingDefaultConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) copyTradingDefaultConfig.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, copyTradingDefaultConfig.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) copyTradingDefaultConfig.chainType, (Object) AdvancedChainType.OTHER.getValue())) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, copyTradingDefaultConfig.chainType);
        }
        int i = 3;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(copyTradingDefaultConfig.preset, new CopyTradingPresetConfig((BuySellPreset) null, (BuySellPreset) (0 == true ? 1 : 0), i, (DefaultConstructorMarker) (0 == true ? 1 : 0)))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, CopyTradingPresetConfig$$serializer.INSTANCE, copyTradingDefaultConfig.preset);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(copyTradingDefaultConfig.serviceFeeInfo, new ServiceFeeInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, ServiceFeeInfo$$serializer.INSTANCE, copyTradingDefaultConfig.serviceFeeInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) copyTradingDefaultConfig.nativeTokenPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, copyTradingDefaultConfig.nativeTokenPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) copyTradingDefaultConfig.gasPriceUnitDecimal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, copyTradingDefaultConfig.gasPriceUnitDecimal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) copyTradingDefaultConfig.minBuyAmountUSD, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, copyTradingDefaultConfig.minBuyAmountUSD);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) copyTradingDefaultConfig.minLimitNativeTokenBalance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, copyTradingDefaultConfig.minLimitNativeTokenBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || copyTradingDefaultConfig.supportAutoMode) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 8, copyTradingDefaultConfig.supportAutoMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || copyTradingDefaultConfig.supportCustomGasFee) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, copyTradingDefaultConfig.supportCustomGasFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || copyTradingDefaultConfig.supportSlippage) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 10, copyTradingDefaultConfig.supportSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || copyTradingDefaultConfig.dynamicSupportMax) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 11, copyTradingDefaultConfig.dynamicSupportMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) copyTradingDefaultConfig.networkFeeUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, copyTradingDefaultConfig.networkFeeUnit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && Intrinsics.EZpvd((Object) copyTradingDefaultConfig.networkFeeDecimals, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 13, copyTradingDefaultConfig.networkFeeDecimals);
    }

    public CopyTradingDefaultConfig(@NotNull String str, @NotNull String str2, @NotNull CopyTradingPresetConfig copyTradingPresetConfig, @NotNull ServiceFeeInfo serviceFeeInfo, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, boolean z2, boolean z3, boolean z4, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(copyTradingPresetConfig, "");
        Intrinsics.checkNotNullParameter(serviceFeeInfo, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.chainId = str;
        this.chainType = str2;
        this.preset = copyTradingPresetConfig;
        this.serviceFeeInfo = serviceFeeInfo;
        this.nativeTokenPrice = str3;
        this.gasPriceUnitDecimal = str4;
        this.minBuyAmountUSD = str5;
        this.minLimitNativeTokenBalance = str6;
        this.supportAutoMode = z;
        this.supportCustomGasFee = z2;
        this.supportSlippage = z3;
        this.dynamicSupportMax = z4;
        this.networkFeeUnit = str7;
        this.networkFeeDecimals = str8;
    }

    public /* synthetic */ CopyTradingDefaultConfig(String str, String str2, CopyTradingPresetConfig copyTradingPresetConfig, ServiceFeeInfo serviceFeeInfo, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        CopyTradingPresetConfig copyTradingPresetConfig2;
        String str9 = (i & 1) != 0 ? "" : str;
        String value = (i & 2) != 0 ? AdvancedChainType.OTHER.getValue() : str2;
        if ((i & 4) != 0) {
            copyTradingPresetConfig2 = new CopyTradingPresetConfig((BuySellPreset) null, (BuySellPreset) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        } else {
            copyTradingPresetConfig2 = copyTradingPresetConfig;
        }
        this(str9, value, copyTradingPresetConfig2, (i & 8) != 0 ? new ServiceFeeInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null) : serviceFeeInfo, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? false : z, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? false : z3, (i & 2048) == 0 ? z4 : false, (i & 4096) != 0 ? "" : str7, (i & 8192) == 0 ? str8 : "");
    }

    public final boolean isEvm() {
        return Intrinsics.EZpvd((Object) this.chainType, (Object) AdvancedChainType.EVM.getValue());
    }
}
