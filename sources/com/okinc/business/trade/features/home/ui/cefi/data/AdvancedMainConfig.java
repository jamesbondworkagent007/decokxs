package com.okinc.business.trade.features.home.ui.cefi.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean$$serializer;
import com.okinc.business.dexlogic.bean.TokenInfoForApp;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedChainType;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class AdvancedMainConfig implements Parcelable {
    private final String cefiChainType;
    private final String chainId;
    private final AdvancedDefaultPreset defaultPresets;
    private final String gasPriceUnitDecimal;
    private final boolean isHotChain;
    private final String mevPriceThreshold;
    private final DexMultiTokenInfoBean nativeTokenInfo;
    private final Double priceImpactValue;
    private final PriorityFeeInfo priorityFeeInfo;
    private final MinMaxData slippageConfig;
    private final boolean supportAutoMode;
    private final boolean supportCustomGasFee;
    private final Boolean supportEip1559;
    private final String wrapperTokenAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AdvancedMainConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AdvancedMainConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvancedMainConfig createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AdvancedMainConfig(string, dValueOf, boolValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MinMaxData.CREATOR.createFromParcel(parcel) : null, PriorityFeeInfo.CREATOR.createFromParcel(parcel), AdvancedDefaultPreset.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvancedMainConfig[] newArray(int i) {
            return new AdvancedMainConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AdvancedMainConfig() {
        this((String) null, (Double) null, (Boolean) null, (String) null, (String) null, (String) null, (DexMultiTokenInfoBean) null, (MinMaxData) null, (PriorityFeeInfo) null, (AdvancedDefaultPreset) null, (String) null, false, false, false, 16383, (DefaultConstructorMarker) null);
    }

    @SerialName("cefiChainType")
    public static /* synthetic */ void getCefiChainType$annotations() {
    }

    @SerialName("chainId")
    public static /* synthetic */ void getChainId$annotations() {
    }

    @SerialName("defaultPresets")
    public static /* synthetic */ void getDefaultPresets$annotations() {
    }

    @SerialName("gasPriceUnitDecimal")
    public static /* synthetic */ void getGasPriceUnitDecimal$annotations() {
    }

    @SerialName("mevPriceThreshold")
    public static /* synthetic */ void getMevPriceThreshold$annotations() {
    }

    @SerialName("nativeTokenInfo")
    public static /* synthetic */ void getNativeTokenInfo$annotations() {
    }

    @SerialName("priceImpactValue")
    public static /* synthetic */ void getPriceImpactValue$annotations() {
    }

    @SerialName("priorityFeeInfo")
    public static /* synthetic */ void getPriorityFeeInfo$annotations() {
    }

    @SerialName("slippageConfig")
    public static /* synthetic */ void getSlippageConfig$annotations() {
    }

    @SerialName("supportAutoMode")
    public static /* synthetic */ void getSupportAutoMode$annotations() {
    }

    @SerialName("supportCustomGasFee")
    public static /* synthetic */ void getSupportCustomGasFee$annotations() {
    }

    @SerialName("supportEip1559")
    public static /* synthetic */ void getSupportEip1559$annotations() {
    }

    @SerialName("wrapperTokenAddress")
    public static /* synthetic */ void getWrapperTokenAddress$annotations() {
    }

    @SerialName("isHotChain")
    public static /* synthetic */ void isHotChain$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedDefaultPreset component10() {
        return this.defaultPresets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.wrapperTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.supportAutoMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component13() {
        return this.isHotChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.supportCustomGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double component2() {
        return this.priceImpactValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.supportEip1559;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.gasPriceUnitDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.mevPriceThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.cefiChainType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component7() {
        return this.nativeTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MinMaxData component8() {
        return this.slippageConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriorityFeeInfo component9() {
        return this.priorityFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedMainConfig copy(@NotNull String str, Double d, Boolean bool, String str2, String str3, @NotNull String str4, DexMultiTokenInfoBean dexMultiTokenInfoBean, MinMaxData minMaxData, @NotNull PriorityFeeInfo priorityFeeInfo, @NotNull AdvancedDefaultPreset advancedDefaultPreset, String str5, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(priorityFeeInfo, "");
        Intrinsics.checkNotNullParameter(advancedDefaultPreset, "");
        return new AdvancedMainConfig(str, d, bool, str2, str3, str4, dexMultiTokenInfoBean, minMaxData, priorityFeeInfo, advancedDefaultPreset, str5, z, z2, z3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvancedMainConfig)) {
            return false;
        }
        AdvancedMainConfig advancedMainConfig = (AdvancedMainConfig) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) advancedMainConfig.chainId) && Intrinsics.EZpvd(this.priceImpactValue, advancedMainConfig.priceImpactValue) && Intrinsics.EZpvd(this.supportEip1559, advancedMainConfig.supportEip1559) && Intrinsics.EZpvd((Object) this.gasPriceUnitDecimal, (Object) advancedMainConfig.gasPriceUnitDecimal) && Intrinsics.EZpvd((Object) this.mevPriceThreshold, (Object) advancedMainConfig.mevPriceThreshold) && Intrinsics.EZpvd((Object) this.cefiChainType, (Object) advancedMainConfig.cefiChainType) && Intrinsics.EZpvd(this.nativeTokenInfo, advancedMainConfig.nativeTokenInfo) && Intrinsics.EZpvd(this.slippageConfig, advancedMainConfig.slippageConfig) && Intrinsics.EZpvd(this.priorityFeeInfo, advancedMainConfig.priorityFeeInfo) && Intrinsics.EZpvd(this.defaultPresets, advancedMainConfig.defaultPresets) && Intrinsics.EZpvd((Object) this.wrapperTokenAddress, (Object) advancedMainConfig.wrapperTokenAddress) && this.supportAutoMode == advancedMainConfig.supportAutoMode && this.isHotChain == advancedMainConfig.isHotChain && this.supportCustomGasFee == advancedMainConfig.supportCustomGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCefiChainType() {
        return this.cefiChainType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedDefaultPreset getDefaultPresets() {
        return this.defaultPresets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPriceUnitDecimal() {
        return this.gasPriceUnitDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMevPriceThreshold() {
        return this.mevPriceThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getNativeTokenInfo() {
        return this.nativeTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getPriceImpactValue() {
        return this.priceImpactValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriorityFeeInfo getPriorityFeeInfo() {
        return this.priorityFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MinMaxData getSlippageConfig() {
        return this.slippageConfig;
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
    public final Boolean getSupportEip1559() {
        return this.supportEip1559;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWrapperTokenAddress() {
        return this.wrapperTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainId.hashCode();
        Double d = this.priceImpactValue;
        int iHashCode2 = d == null ? 0 : d.hashCode();
        Boolean bool = this.supportEip1559;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        String str = this.gasPriceUnitDecimal;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.mevPriceThreshold;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        int iHashCode6 = this.cefiChainType.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.nativeTokenInfo;
        int iHashCode7 = dexMultiTokenInfoBean == null ? 0 : dexMultiTokenInfoBean.hashCode();
        MinMaxData minMaxData = this.slippageConfig;
        int iHashCode8 = minMaxData == null ? 0 : minMaxData.hashCode();
        int iHashCode9 = this.priorityFeeInfo.hashCode();
        int iHashCode10 = this.defaultPresets.hashCode();
        String str3 = this.wrapperTokenAddress;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.supportAutoMode)) * 31) + Boolean.hashCode(this.isHotChain)) * 31) + Boolean.hashCode(this.supportCustomGasFee);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHotChain() {
        return this.isHotChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AdvancedMainConfig(chainId=" + this.chainId + ", priceImpactValue=" + this.priceImpactValue + ", supportEip1559=" + this.supportEip1559 + ", gasPriceUnitDecimal=" + this.gasPriceUnitDecimal + ", mevPriceThreshold=" + this.mevPriceThreshold + ", cefiChainType=" + this.cefiChainType + ", nativeTokenInfo=" + this.nativeTokenInfo + ", slippageConfig=" + this.slippageConfig + ", priorityFeeInfo=" + this.priorityFeeInfo + ", defaultPresets=" + this.defaultPresets + ", wrapperTokenAddress=" + this.wrapperTokenAddress + ", supportAutoMode=" + this.supportAutoMode + ", isHotChain=" + this.isHotChain + ", supportCustomGasFee=" + this.supportCustomGasFee + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainId);
        Double d = this.priceImpactValue;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Boolean bool = this.supportEip1559;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.gasPriceUnitDecimal);
        parcel.writeString(this.mevPriceThreshold);
        parcel.writeString(this.cefiChainType);
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.nativeTokenInfo;
        if (dexMultiTokenInfoBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexMultiTokenInfoBean.writeToParcel(parcel, i);
        }
        MinMaxData minMaxData = this.slippageConfig;
        if (minMaxData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            minMaxData.writeToParcel(parcel, i);
        }
        this.priorityFeeInfo.writeToParcel(parcel, i);
        this.defaultPresets.writeToParcel(parcel, i);
        parcel.writeString(this.wrapperTokenAddress);
        parcel.writeInt(this.supportAutoMode ? 1 : 0);
        parcel.writeInt(this.isHotChain ? 1 : 0);
        parcel.writeInt(this.supportCustomGasFee ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.cefi.data.AdvancedMainConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AdvancedMainConfig> serializer() {
            return AdvancedMainConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AdvancedMainConfig(int i, String str, Double d, Boolean bool, String str2, String str3, String str4, DexMultiTokenInfoBean dexMultiTokenInfoBean, MinMaxData minMaxData, PriorityFeeInfo priorityFeeInfo, AdvancedDefaultPreset advancedDefaultPreset, String str5, boolean z, boolean z2, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
        MinMaxData minMaxData2;
        PriorityFeeInfo priorityFeeInfo2;
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        this.priceImpactValue = (i & 2) == 0 ? Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE) : d;
        this.supportEip1559 = (i & 4) == 0 ? Boolean.FALSE : bool;
        if ((i & 8) == 0) {
            this.gasPriceUnitDecimal = "";
        } else {
            this.gasPriceUnitDecimal = str2;
        }
        if ((i & 16) == 0) {
            this.mevPriceThreshold = "";
        } else {
            this.mevPriceThreshold = str3;
        }
        if ((i & 32) == 0) {
            this.cefiChainType = "";
        } else {
            this.cefiChainType = str4;
        }
        this.nativeTokenInfo = (i & 64) == 0 ? new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null) : dexMultiTokenInfoBean;
        int i2 = 3;
        String str6 = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        if ((i & 128) == 0) {
            minMaxData2 = new MinMaxData(str6, (String) (b5 == true ? 1 : 0), i2, (DefaultConstructorMarker) (b4 == true ? 1 : 0));
        } else {
            minMaxData2 = minMaxData;
        }
        this.slippageConfig = minMaxData2;
        if ((i & 256) == 0) {
            priorityFeeInfo2 = new PriorityFeeInfo((String) (b3 == true ? 1 : 0), (String) (b2 == true ? 1 : 0), i2, (DefaultConstructorMarker) (b == true ? 1 : 0));
        } else {
            priorityFeeInfo2 = priorityFeeInfo;
        }
        this.priorityFeeInfo = priorityFeeInfo2;
        this.defaultPresets = (i & 512) == 0 ? new AdvancedDefaultPreset((Boolean) null, (Integer) null, (String) null, 7, (DefaultConstructorMarker) null) : advancedDefaultPreset;
        if ((i & 1024) == 0) {
            this.wrapperTokenAddress = "";
        } else {
            this.wrapperTokenAddress = str5;
        }
        if ((i & 2048) == 0) {
            this.supportAutoMode = false;
        } else {
            this.supportAutoMode = z;
        }
        if ((i & 4096) == 0) {
            this.isHotChain = false;
        } else {
            this.isHotChain = z2;
        }
        if ((i & 8192) == 0) {
            this.supportCustomGasFee = false;
        } else {
            this.supportCustomGasFee = z3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [117=5] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$OKDex_dex_impl(AdvancedMainConfig advancedMainConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) advancedMainConfig.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, advancedMainConfig.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(advancedMainConfig.priceImpactValue, Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, DoubleSerializer.INSTANCE, advancedMainConfig.priceImpactValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(advancedMainConfig.supportEip1559, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, advancedMainConfig.supportEip1559);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) advancedMainConfig.gasPriceUnitDecimal, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, advancedMainConfig.gasPriceUnitDecimal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) advancedMainConfig.mevPriceThreshold, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, advancedMainConfig.mevPriceThreshold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) advancedMainConfig.cefiChainType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, advancedMainConfig.cefiChainType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, DexMultiTokenInfoBean$$serializer.INSTANCE, advancedMainConfig.nativeTokenInfo);
        } else {
            String str = null;
            if (!Intrinsics.EZpvd(advancedMainConfig.nativeTokenInfo, new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str, str, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null))) {
            }
        }
        String str2 = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, MinMaxData$$serializer.INSTANCE, advancedMainConfig.slippageConfig);
        } else {
            if (!Intrinsics.EZpvd(advancedMainConfig.slippageConfig, new MinMaxData(str2, (String) (b5 == true ? 1 : 0), 3, (DefaultConstructorMarker) (b4 == true ? 1 : 0)))) {
            }
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8)) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, PriorityFeeInfo$$serializer.INSTANCE, advancedMainConfig.priorityFeeInfo);
        } else {
            if (!Intrinsics.EZpvd(advancedMainConfig.priorityFeeInfo, new PriorityFeeInfo((String) (b3 == true ? 1 : 0), (String) (b2 == true ? 1 : 0), 3, (DefaultConstructorMarker) (b == true ? 1 : 0)))) {
            }
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(advancedMainConfig.defaultPresets, new AdvancedDefaultPreset((Boolean) null, (Integer) null, (String) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 9, AdvancedDefaultPreset$$serializer.INSTANCE, advancedMainConfig.defaultPresets);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) advancedMainConfig.wrapperTokenAddress, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, advancedMainConfig.wrapperTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || advancedMainConfig.supportAutoMode) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 11, advancedMainConfig.supportAutoMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || advancedMainConfig.isHotChain) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 12, advancedMainConfig.isHotChain);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || advancedMainConfig.supportCustomGasFee) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 13, advancedMainConfig.supportCustomGasFee);
        }
    }

    public AdvancedMainConfig(@NotNull String str, Double d, Boolean bool, String str2, String str3, @NotNull String str4, DexMultiTokenInfoBean dexMultiTokenInfoBean, MinMaxData minMaxData, @NotNull PriorityFeeInfo priorityFeeInfo, @NotNull AdvancedDefaultPreset advancedDefaultPreset, String str5, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(priorityFeeInfo, "");
        Intrinsics.checkNotNullParameter(advancedDefaultPreset, "");
        this.chainId = str;
        this.priceImpactValue = d;
        this.supportEip1559 = bool;
        this.gasPriceUnitDecimal = str2;
        this.mevPriceThreshold = str3;
        this.cefiChainType = str4;
        this.nativeTokenInfo = dexMultiTokenInfoBean;
        this.slippageConfig = minMaxData;
        this.priorityFeeInfo = priorityFeeInfo;
        this.defaultPresets = advancedDefaultPreset;
        this.wrapperTokenAddress = str5;
        this.supportAutoMode = z;
        this.isHotChain = z2;
        this.supportCustomGasFee = z3;
    }

    public /* synthetic */ AdvancedMainConfig(String str, Double d, Boolean bool, String str2, String str3, String str4, DexMultiTokenInfoBean dexMultiTokenInfoBean, MinMaxData minMaxData, PriorityFeeInfo priorityFeeInfo, AdvancedDefaultPreset advancedDefaultPreset, String str5, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        MinMaxData minMaxData2;
        PriorityFeeInfo priorityFeeInfo2;
        String str6 = (i & 1) != 0 ? "" : str;
        Double dValueOf = (i & 2) != 0 ? Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE) : d;
        Boolean bool2 = (i & 4) != 0 ? Boolean.FALSE : bool;
        String str7 = (i & 8) != 0 ? "" : str2;
        String str8 = (i & 16) != 0 ? "" : str3;
        String str9 = (i & 32) != 0 ? "" : str4;
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = (i & 64) != 0 ? new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null) : dexMultiTokenInfoBean;
        int i2 = 3;
        String str10 = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        if ((i & 128) != 0) {
            minMaxData2 = new MinMaxData(str10, (String) (b5 == true ? 1 : 0), i2, (DefaultConstructorMarker) (b4 == true ? 1 : 0));
        } else {
            minMaxData2 = minMaxData;
        }
        if ((i & 256) != 0) {
            priorityFeeInfo2 = new PriorityFeeInfo((String) (b3 == true ? 1 : 0), (String) (b2 == true ? 1 : 0), i2, (DefaultConstructorMarker) (b == true ? 1 : 0));
        } else {
            priorityFeeInfo2 = priorityFeeInfo;
        }
        this(str6, dValueOf, bool2, str7, str8, str9, dexMultiTokenInfoBean2, minMaxData2, priorityFeeInfo2, (i & 512) != 0 ? new AdvancedDefaultPreset((Boolean) null, (Integer) null, (String) null, 7, (DefaultConstructorMarker) null) : advancedDefaultPreset, (i & 1024) == 0 ? str5 : "", (i & 2048) != 0 ? false : z, (i & 4096) != 0 ? false : z2, (i & 8192) == 0 ? z3 : false);
    }

    public final boolean isEvm() {
        return Intrinsics.EZpvd((Object) this.cefiChainType, (Object) AdvancedChainType.EVM.getValue());
    }

    public final boolean isSOl() {
        return Intrinsics.EZpvd((Object) this.cefiChainType, (Object) AdvancedChainType.SOL.getValue());
    }

    public final boolean isOtherChain() {
        return Intrinsics.EZpvd((Object) this.cefiChainType, (Object) AdvancedChainType.OTHER.getValue());
    }
}
