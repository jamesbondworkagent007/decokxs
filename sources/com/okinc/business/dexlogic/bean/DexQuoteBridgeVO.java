package com.okinc.business.dexlogic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C23313hvq;
import o.C33129mqd;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class DexQuoteBridgeVO implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final String bridgeAmountIn;
    private final String bridgeAmountInUsd;
    private final String bridgeAmountOut;
    private final String bridgeAmountOutUsd;
    private final String bridgeId;
    private final String bridgeLogoUrl;
    private final String bridgeName;
    private final int bridgeType;
    private final Map<String, String> callDataMap;
    private final OfflineQuote calldata;
    private final String crossChainFee;
    private final DexMultiTokenInfoBean crossFromToken;
    private final DexMultiTokenInfoBean crossToToken;
    private final String defiPlatformId;
    private DeFiPlatformTokenApprovalInfo dexMultiTokenAllowanceOut;
    private final String estimateBridgeFeeAmount;
    private final String estimateBridgeFeeAmountUsd;
    private final String estimateClaimFeeAmount;
    private final String estimateClaimFeeAmountUsd;
    private final String expectedTimeDesc;
    private final String fromPoolAddress;
    private final String fromPoolName;
    private final String gasCost;
    private final String gasFeeTokenAmount;
    private final String isFreeNetworkFee;
    private final String isNeedClaim;
    private final String maxRatio;
    private final String maximumSwap;
    private final String minLimitUsd;
    private final String minimumSwap;
    private final String officialBridgeFee;
    private final String otherFee;
    private final String percent;
    private final String poolDepthUsd;
    private final List<String> signatureName;
    private final String toPoolAddress;
    private final String toPoolName;
    private final String toRiskLimit;
    private final String totalFee;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DexQuoteBridgeVO> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DexQuoteBridgeVO> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexQuoteBridgeVO createFromParcel(Parcel parcel) {
            String str;
            String str2;
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCreateFromParcel = parcel.readInt() == 0 ? null : DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel);
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCreateFromParcel2 = parcel.readInt() == 0 ? null : DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                str2 = string12;
                str = string13;
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                str = string13;
                int i2 = 0;
                while (i2 != i) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                    i2++;
                    i = i;
                    string12 = string12;
                }
                str2 = string12;
                linkedHashMap = linkedHashMap2;
            }
            return new DexQuoteBridgeVO(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, str2, str, string14, string15, dexMultiTokenInfoBeanCreateFromParcel, dexMultiTokenInfoBeanCreateFromParcel2, linkedHashMap, parcel.readInt() == 0 ? null : OfflineQuote.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : DeFiPlatformTokenApprovalInfo.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexQuoteBridgeVO[] newArray(int i) {
            return new DexQuoteBridgeVO[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexQuoteBridgeVO() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (DexMultiTokenInfoBean) null, (DexMultiTokenInfoBean) null, (Map) null, (OfflineQuote) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (List) null, (DeFiPlatformTokenApprovalInfo) null, (String) null, -1, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.bridgeLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.maximumSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.minimumSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.fromPoolAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.toPoolAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.fromPoolName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.toPoolName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component16() {
        return this.crossFromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component17() {
        return this.crossToToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component18() {
        return this.callDataMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfflineQuote component19() {
        return this.calldata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.bridgeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.gasFeeTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.gasCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.percent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.poolDepthUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.maxRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.minLimitUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.officialBridgeFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.estimateBridgeFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.estimateBridgeFeeAmountUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.estimateClaimFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.bridgeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.estimateClaimFeeAmountUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.bridgeAmountOutUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.bridgeAmountInUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.toRiskLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component34() {
        return this.bridgeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.defiPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.isFreeNetworkFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component37() {
        return this.signatureName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeFiPlatformTokenApprovalInfo component38() {
        return this.dexMultiTokenAllowanceOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.isNeedClaim;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.bridgeAmountIn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.bridgeAmountOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.expectedTimeDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.crossChainFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.otherFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.totalFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexQuoteBridgeVO copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, Map<String, String> map, OfflineQuote offlineQuote, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, int i, @NotNull String str30, @NotNull String str31, @NotNull List<String> list, DeFiPlatformTokenApprovalInfo deFiPlatformTokenApprovalInfo, @NotNull String str32) {
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
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str32, "");
        return new DexQuoteBridgeVO(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, dexMultiTokenInfoBean, dexMultiTokenInfoBean2, map, offlineQuote, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, i, str30, str31, list, deFiPlatformTokenApprovalInfo, str32);
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
        if (!(obj instanceof DexQuoteBridgeVO)) {
            return false;
        }
        DexQuoteBridgeVO dexQuoteBridgeVO = (DexQuoteBridgeVO) obj;
        return Intrinsics.EZpvd((Object) this.bridgeLogoUrl, (Object) dexQuoteBridgeVO.bridgeLogoUrl) && Intrinsics.EZpvd((Object) this.bridgeId, (Object) dexQuoteBridgeVO.bridgeId) && Intrinsics.EZpvd((Object) this.bridgeName, (Object) dexQuoteBridgeVO.bridgeName) && Intrinsics.EZpvd((Object) this.bridgeAmountIn, (Object) dexQuoteBridgeVO.bridgeAmountIn) && Intrinsics.EZpvd((Object) this.bridgeAmountOut, (Object) dexQuoteBridgeVO.bridgeAmountOut) && Intrinsics.EZpvd((Object) this.expectedTimeDesc, (Object) dexQuoteBridgeVO.expectedTimeDesc) && Intrinsics.EZpvd((Object) this.crossChainFee, (Object) dexQuoteBridgeVO.crossChainFee) && Intrinsics.EZpvd((Object) this.otherFee, (Object) dexQuoteBridgeVO.otherFee) && Intrinsics.EZpvd((Object) this.totalFee, (Object) dexQuoteBridgeVO.totalFee) && Intrinsics.EZpvd((Object) this.maximumSwap, (Object) dexQuoteBridgeVO.maximumSwap) && Intrinsics.EZpvd((Object) this.minimumSwap, (Object) dexQuoteBridgeVO.minimumSwap) && Intrinsics.EZpvd((Object) this.fromPoolAddress, (Object) dexQuoteBridgeVO.fromPoolAddress) && Intrinsics.EZpvd((Object) this.toPoolAddress, (Object) dexQuoteBridgeVO.toPoolAddress) && Intrinsics.EZpvd((Object) this.fromPoolName, (Object) dexQuoteBridgeVO.fromPoolName) && Intrinsics.EZpvd((Object) this.toPoolName, (Object) dexQuoteBridgeVO.toPoolName) && Intrinsics.EZpvd(this.crossFromToken, dexQuoteBridgeVO.crossFromToken) && Intrinsics.EZpvd(this.crossToToken, dexQuoteBridgeVO.crossToToken) && Intrinsics.EZpvd(this.callDataMap, dexQuoteBridgeVO.callDataMap) && Intrinsics.EZpvd(this.calldata, dexQuoteBridgeVO.calldata) && Intrinsics.EZpvd((Object) this.gasFeeTokenAmount, (Object) dexQuoteBridgeVO.gasFeeTokenAmount) && Intrinsics.EZpvd((Object) this.gasCost, (Object) dexQuoteBridgeVO.gasCost) && Intrinsics.EZpvd((Object) this.percent, (Object) dexQuoteBridgeVO.percent) && Intrinsics.EZpvd((Object) this.poolDepthUsd, (Object) dexQuoteBridgeVO.poolDepthUsd) && Intrinsics.EZpvd((Object) this.maxRatio, (Object) dexQuoteBridgeVO.maxRatio) && Intrinsics.EZpvd((Object) this.minLimitUsd, (Object) dexQuoteBridgeVO.minLimitUsd) && Intrinsics.EZpvd((Object) this.officialBridgeFee, (Object) dexQuoteBridgeVO.officialBridgeFee) && Intrinsics.EZpvd((Object) this.estimateBridgeFeeAmount, (Object) dexQuoteBridgeVO.estimateBridgeFeeAmount) && Intrinsics.EZpvd((Object) this.estimateBridgeFeeAmountUsd, (Object) dexQuoteBridgeVO.estimateBridgeFeeAmountUsd) && Intrinsics.EZpvd((Object) this.estimateClaimFeeAmount, (Object) dexQuoteBridgeVO.estimateClaimFeeAmount) && Intrinsics.EZpvd((Object) this.estimateClaimFeeAmountUsd, (Object) dexQuoteBridgeVO.estimateClaimFeeAmountUsd) && Intrinsics.EZpvd((Object) this.bridgeAmountOutUsd, (Object) dexQuoteBridgeVO.bridgeAmountOutUsd) && Intrinsics.EZpvd((Object) this.bridgeAmountInUsd, (Object) dexQuoteBridgeVO.bridgeAmountInUsd) && Intrinsics.EZpvd((Object) this.toRiskLimit, (Object) dexQuoteBridgeVO.toRiskLimit) && this.bridgeType == dexQuoteBridgeVO.bridgeType && Intrinsics.EZpvd((Object) this.defiPlatformId, (Object) dexQuoteBridgeVO.defiPlatformId) && Intrinsics.EZpvd((Object) this.isFreeNetworkFee, (Object) dexQuoteBridgeVO.isFreeNetworkFee) && Intrinsics.EZpvd(this.signatureName, dexQuoteBridgeVO.signatureName) && Intrinsics.EZpvd(this.dexMultiTokenAllowanceOut, dexQuoteBridgeVO.dexMultiTokenAllowanceOut) && Intrinsics.EZpvd((Object) this.isNeedClaim, (Object) dexQuoteBridgeVO.isNeedClaim);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBridgeAmountIn() {
        return this.bridgeAmountIn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBridgeAmountInUsd() {
        return this.bridgeAmountInUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBridgeAmountOut() {
        return this.bridgeAmountOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBridgeAmountOutUsd() {
        return this.bridgeAmountOutUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBridgeId() {
        return this.bridgeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBridgeLogoUrl() {
        return this.bridgeLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBridgeName() {
        return this.bridgeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBridgeType() {
        return this.bridgeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getCallDataMap() {
        return this.callDataMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfflineQuote getCalldata() {
        return this.calldata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCrossChainFee() {
        return this.crossChainFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getCrossFromToken() {
        return this.crossFromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getCrossToToken() {
        return this.crossToToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefiPlatformId() {
        return this.defiPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeFiPlatformTokenApprovalInfo getDexMultiTokenAllowanceOut() {
        return this.dexMultiTokenAllowanceOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimateBridgeFeeAmount() {
        return this.estimateBridgeFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimateBridgeFeeAmountUsd() {
        return this.estimateBridgeFeeAmountUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimateClaimFeeAmount() {
        return this.estimateClaimFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimateClaimFeeAmountUsd() {
        return this.estimateClaimFeeAmountUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpectedTimeDesc() {
        return this.expectedTimeDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromPoolAddress() {
        return this.fromPoolAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromPoolName() {
        return this.fromPoolName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasCost() {
        return this.gasCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasFeeTokenAmount() {
        return this.gasFeeTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxRatio() {
        return this.maxRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaximumSwap() {
        return this.maximumSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinLimitUsd() {
        return this.minLimitUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinimumSwap() {
        return this.minimumSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOfficialBridgeFee() {
        return this.officialBridgeFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOtherFee() {
        return this.otherFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPercent() {
        return this.percent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPoolDepthUsd() {
        return this.poolDepthUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSignatureName() {
        return this.signatureName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToPoolAddress() {
        return this.toPoolAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToPoolName() {
        return this.toPoolName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToRiskLimit() {
        return this.toRiskLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalFee() {
        return this.totalFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.bridgeLogoUrl.hashCode();
        int iHashCode2 = this.bridgeId.hashCode();
        int iHashCode3 = this.bridgeName.hashCode();
        int iHashCode4 = this.bridgeAmountIn.hashCode();
        int iHashCode5 = this.bridgeAmountOut.hashCode();
        int iHashCode6 = this.expectedTimeDesc.hashCode();
        int iHashCode7 = this.crossChainFee.hashCode();
        int iHashCode8 = this.otherFee.hashCode();
        int iHashCode9 = this.totalFee.hashCode();
        int iHashCode10 = this.maximumSwap.hashCode();
        int iHashCode11 = this.minimumSwap.hashCode();
        int iHashCode12 = this.fromPoolAddress.hashCode();
        int iHashCode13 = this.toPoolAddress.hashCode();
        int iHashCode14 = this.fromPoolName.hashCode();
        int iHashCode15 = this.toPoolName.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.crossFromToken;
        int iHashCode16 = dexMultiTokenInfoBean == null ? 0 : dexMultiTokenInfoBean.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.crossToToken;
        int iHashCode17 = dexMultiTokenInfoBean2 == null ? 0 : dexMultiTokenInfoBean2.hashCode();
        Map<String, String> map = this.callDataMap;
        int iHashCode18 = map == null ? 0 : map.hashCode();
        OfflineQuote offlineQuote = this.calldata;
        int iHashCode19 = offlineQuote == null ? 0 : offlineQuote.hashCode();
        int iHashCode20 = this.gasFeeTokenAmount.hashCode();
        int iHashCode21 = this.gasCost.hashCode();
        int iHashCode22 = this.percent.hashCode();
        int iHashCode23 = this.poolDepthUsd.hashCode();
        int iHashCode24 = this.maxRatio.hashCode();
        int iHashCode25 = this.minLimitUsd.hashCode();
        int iHashCode26 = this.officialBridgeFee.hashCode();
        int iHashCode27 = this.estimateBridgeFeeAmount.hashCode();
        int iHashCode28 = this.estimateBridgeFeeAmountUsd.hashCode();
        int iHashCode29 = this.estimateClaimFeeAmount.hashCode();
        int iHashCode30 = this.estimateClaimFeeAmountUsd.hashCode();
        int iHashCode31 = this.bridgeAmountOutUsd.hashCode();
        int iHashCode32 = this.bridgeAmountInUsd.hashCode();
        int iHashCode33 = this.toRiskLimit.hashCode();
        int iHashCode34 = Integer.hashCode(this.bridgeType);
        int iHashCode35 = this.defiPlatformId.hashCode();
        int iHashCode36 = this.isFreeNetworkFee.hashCode();
        int iHashCode37 = this.signatureName.hashCode();
        DeFiPlatformTokenApprovalInfo deFiPlatformTokenApprovalInfo = this.dexMultiTokenAllowanceOut;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + (deFiPlatformTokenApprovalInfo != null ? deFiPlatformTokenApprovalInfo.hashCode() : 0)) * 31) + this.isNeedClaim.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isFreeNetworkFee() {
        return this.isFreeNetworkFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isNeedClaim() {
        return this.isNeedClaim;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDexMultiTokenAllowanceOut(DeFiPlatformTokenApprovalInfo deFiPlatformTokenApprovalInfo) {
        this.dexMultiTokenAllowanceOut = deFiPlatformTokenApprovalInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexQuoteBridgeVO(bridgeLogoUrl=" + this.bridgeLogoUrl + ", bridgeId=" + this.bridgeId + ", bridgeName=" + this.bridgeName + ", bridgeAmountIn=" + this.bridgeAmountIn + ", bridgeAmountOut=" + this.bridgeAmountOut + ", expectedTimeDesc=" + this.expectedTimeDesc + ", crossChainFee=" + this.crossChainFee + ", otherFee=" + this.otherFee + ", totalFee=" + this.totalFee + ", maximumSwap=" + this.maximumSwap + ", minimumSwap=" + this.minimumSwap + ", fromPoolAddress=" + this.fromPoolAddress + ", toPoolAddress=" + this.toPoolAddress + ", fromPoolName=" + this.fromPoolName + ", toPoolName=" + this.toPoolName + ", crossFromToken=" + this.crossFromToken + ", crossToToken=" + this.crossToToken + ", callDataMap=" + this.callDataMap + ", calldata=" + this.calldata + ", gasFeeTokenAmount=" + this.gasFeeTokenAmount + ", gasCost=" + this.gasCost + ", percent=" + this.percent + ", poolDepthUsd=" + this.poolDepthUsd + ", maxRatio=" + this.maxRatio + ", minLimitUsd=" + this.minLimitUsd + ", officialBridgeFee=" + this.officialBridgeFee + ", estimateBridgeFeeAmount=" + this.estimateBridgeFeeAmount + ", estimateBridgeFeeAmountUsd=" + this.estimateBridgeFeeAmountUsd + ", estimateClaimFeeAmount=" + this.estimateClaimFeeAmount + ", estimateClaimFeeAmountUsd=" + this.estimateClaimFeeAmountUsd + ", bridgeAmountOutUsd=" + this.bridgeAmountOutUsd + ", bridgeAmountInUsd=" + this.bridgeAmountInUsd + ", toRiskLimit=" + this.toRiskLimit + ", bridgeType=" + this.bridgeType + ", defiPlatformId=" + this.defiPlatformId + ", isFreeNetworkFee=" + this.isFreeNetworkFee + ", signatureName=" + this.signatureName + ", dexMultiTokenAllowanceOut=" + this.dexMultiTokenAllowanceOut + ", isNeedClaim=" + this.isNeedClaim + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.bridgeLogoUrl);
        parcel.writeString(this.bridgeId);
        parcel.writeString(this.bridgeName);
        parcel.writeString(this.bridgeAmountIn);
        parcel.writeString(this.bridgeAmountOut);
        parcel.writeString(this.expectedTimeDesc);
        parcel.writeString(this.crossChainFee);
        parcel.writeString(this.otherFee);
        parcel.writeString(this.totalFee);
        parcel.writeString(this.maximumSwap);
        parcel.writeString(this.minimumSwap);
        parcel.writeString(this.fromPoolAddress);
        parcel.writeString(this.toPoolAddress);
        parcel.writeString(this.fromPoolName);
        parcel.writeString(this.toPoolName);
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.crossFromToken;
        if (dexMultiTokenInfoBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexMultiTokenInfoBean.writeToParcel(parcel, i);
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.crossToToken;
        if (dexMultiTokenInfoBean2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexMultiTokenInfoBean2.writeToParcel(parcel, i);
        }
        Map<String, String> map = this.callDataMap;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        OfflineQuote offlineQuote = this.calldata;
        if (offlineQuote == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offlineQuote.writeToParcel(parcel, i);
        }
        parcel.writeString(this.gasFeeTokenAmount);
        parcel.writeString(this.gasCost);
        parcel.writeString(this.percent);
        parcel.writeString(this.poolDepthUsd);
        parcel.writeString(this.maxRatio);
        parcel.writeString(this.minLimitUsd);
        parcel.writeString(this.officialBridgeFee);
        parcel.writeString(this.estimateBridgeFeeAmount);
        parcel.writeString(this.estimateBridgeFeeAmountUsd);
        parcel.writeString(this.estimateClaimFeeAmount);
        parcel.writeString(this.estimateClaimFeeAmountUsd);
        parcel.writeString(this.bridgeAmountOutUsd);
        parcel.writeString(this.bridgeAmountInUsd);
        parcel.writeString(this.toRiskLimit);
        parcel.writeInt(this.bridgeType);
        parcel.writeString(this.defiPlatformId);
        parcel.writeString(this.isFreeNetworkFee);
        parcel.writeStringList(this.signatureName);
        DeFiPlatformTokenApprovalInfo deFiPlatformTokenApprovalInfo = this.dexMultiTokenAllowanceOut;
        if (deFiPlatformTokenApprovalInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            deFiPlatformTokenApprovalInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.isNeedClaim);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.DexQuoteBridgeVO.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexQuoteBridgeVO> serializer() {
            return DexQuoteBridgeVO$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new LinkedHashMapSerializer(stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), null, null};
    }

    public /* synthetic */ DexQuoteBridgeVO(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, Map map, OfflineQuote offlineQuote, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, int i3, String str30, String str31, List list, DeFiPlatformTokenApprovalInfo deFiPlatformTokenApprovalInfo, String str32, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.bridgeLogoUrl = "";
        } else {
            this.bridgeLogoUrl = str;
        }
        if ((i & 2) == 0) {
            this.bridgeId = "";
        } else {
            this.bridgeId = str2;
        }
        if ((i & 4) == 0) {
            this.bridgeName = "";
        } else {
            this.bridgeName = str3;
        }
        if ((i & 8) == 0) {
            this.bridgeAmountIn = "";
        } else {
            this.bridgeAmountIn = str4;
        }
        if ((i & 16) == 0) {
            this.bridgeAmountOut = "";
        } else {
            this.bridgeAmountOut = str5;
        }
        if ((i & 32) == 0) {
            this.expectedTimeDesc = "";
        } else {
            this.expectedTimeDesc = str6;
        }
        if ((i & 64) == 0) {
            this.crossChainFee = "";
        } else {
            this.crossChainFee = str7;
        }
        if ((i & 128) == 0) {
            this.otherFee = "";
        } else {
            this.otherFee = str8;
        }
        if ((i & 256) == 0) {
            this.totalFee = "";
        } else {
            this.totalFee = str9;
        }
        if ((i & 512) == 0) {
            this.maximumSwap = "";
        } else {
            this.maximumSwap = str10;
        }
        if ((i & 1024) == 0) {
            this.minimumSwap = "";
        } else {
            this.minimumSwap = str11;
        }
        if ((i & 2048) == 0) {
            this.fromPoolAddress = "";
        } else {
            this.fromPoolAddress = str12;
        }
        if ((i & 4096) == 0) {
            this.toPoolAddress = "";
        } else {
            this.toPoolAddress = str13;
        }
        if ((i & 8192) == 0) {
            this.fromPoolName = "";
        } else {
            this.fromPoolName = str14;
        }
        if ((i & 16384) == 0) {
            this.toPoolName = "";
        } else {
            this.toPoolName = str15;
        }
        if ((32768 & i) == 0) {
            this.crossFromToken = null;
        } else {
            this.crossFromToken = dexMultiTokenInfoBean;
        }
        if ((65536 & i) == 0) {
            this.crossToToken = null;
        } else {
            this.crossToToken = dexMultiTokenInfoBean2;
        }
        if ((131072 & i) == 0) {
            this.callDataMap = null;
        } else {
            this.callDataMap = map;
        }
        if ((262144 & i) == 0) {
            this.calldata = null;
        } else {
            this.calldata = offlineQuote;
        }
        if ((524288 & i) == 0) {
            this.gasFeeTokenAmount = "";
        } else {
            this.gasFeeTokenAmount = str16;
        }
        if ((1048576 & i) == 0) {
            this.gasCost = "";
        } else {
            this.gasCost = str17;
        }
        if ((2097152 & i) == 0) {
            this.percent = "";
        } else {
            this.percent = str18;
        }
        if ((4194304 & i) == 0) {
            this.poolDepthUsd = "";
        } else {
            this.poolDepthUsd = str19;
        }
        if ((8388608 & i) == 0) {
            this.maxRatio = "";
        } else {
            this.maxRatio = str20;
        }
        if ((16777216 & i) == 0) {
            this.minLimitUsd = "";
        } else {
            this.minLimitUsd = str21;
        }
        if ((33554432 & i) == 0) {
            this.officialBridgeFee = "";
        } else {
            this.officialBridgeFee = str22;
        }
        if ((67108864 & i) == 0) {
            this.estimateBridgeFeeAmount = "";
        } else {
            this.estimateBridgeFeeAmount = str23;
        }
        if ((134217728 & i) == 0) {
            this.estimateBridgeFeeAmountUsd = "";
        } else {
            this.estimateBridgeFeeAmountUsd = str24;
        }
        if ((268435456 & i) == 0) {
            this.estimateClaimFeeAmount = "";
        } else {
            this.estimateClaimFeeAmount = str25;
        }
        if ((536870912 & i) == 0) {
            this.estimateClaimFeeAmountUsd = "";
        } else {
            this.estimateClaimFeeAmountUsd = str26;
        }
        if ((1073741824 & i) == 0) {
            this.bridgeAmountOutUsd = "";
        } else {
            this.bridgeAmountOutUsd = str27;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.bridgeAmountInUsd = "";
        } else {
            this.bridgeAmountInUsd = str28;
        }
        if ((i2 & 1) == 0) {
            this.toRiskLimit = "";
        } else {
            this.toRiskLimit = str29;
        }
        this.bridgeType = (i2 & 2) == 0 ? 0 : i3;
        if ((i2 & 4) == 0) {
            this.defiPlatformId = "";
        } else {
            this.defiPlatformId = str30;
        }
        if ((i2 & 8) == 0) {
            this.isFreeNetworkFee = "";
        } else {
            this.isFreeNetworkFee = str31;
        }
        this.signatureName = (i2 & 16) == 0 ? yDY.AhwBna() : list;
        if ((i2 & 32) == 0) {
            this.dexMultiTokenAllowanceOut = null;
        } else {
            this.dexMultiTokenAllowanceOut = deFiPlatformTokenApprovalInfo;
        }
        if ((i2 & 64) == 0) {
            this.isNeedClaim = "";
        } else {
            this.isNeedClaim = str32;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(DexQuoteBridgeVO dexQuoteBridgeVO, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dexQuoteBridgeVO.bridgeLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dexQuoteBridgeVO.bridgeLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dexQuoteBridgeVO.bridgeId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dexQuoteBridgeVO.bridgeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dexQuoteBridgeVO.bridgeName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dexQuoteBridgeVO.bridgeName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) dexQuoteBridgeVO.bridgeAmountIn, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, dexQuoteBridgeVO.bridgeAmountIn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) dexQuoteBridgeVO.bridgeAmountOut, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, dexQuoteBridgeVO.bridgeAmountOut);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) dexQuoteBridgeVO.expectedTimeDesc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, dexQuoteBridgeVO.expectedTimeDesc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) dexQuoteBridgeVO.crossChainFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, dexQuoteBridgeVO.crossChainFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) dexQuoteBridgeVO.otherFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, dexQuoteBridgeVO.otherFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) dexQuoteBridgeVO.totalFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, dexQuoteBridgeVO.totalFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) dexQuoteBridgeVO.maximumSwap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, dexQuoteBridgeVO.maximumSwap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) dexQuoteBridgeVO.minimumSwap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, dexQuoteBridgeVO.minimumSwap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) dexQuoteBridgeVO.fromPoolAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, dexQuoteBridgeVO.fromPoolAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) dexQuoteBridgeVO.toPoolAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, dexQuoteBridgeVO.toPoolAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) dexQuoteBridgeVO.fromPoolName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, dexQuoteBridgeVO.fromPoolName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) dexQuoteBridgeVO.toPoolName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, dexQuoteBridgeVO.toPoolName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || dexQuoteBridgeVO.crossFromToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, DexMultiTokenInfoBean$$serializer.INSTANCE, dexQuoteBridgeVO.crossFromToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || dexQuoteBridgeVO.crossToToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, DexMultiTokenInfoBean$$serializer.INSTANCE, dexQuoteBridgeVO.crossToToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || dexQuoteBridgeVO.callDataMap != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, kSerializerArr[17], dexQuoteBridgeVO.callDataMap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || dexQuoteBridgeVO.calldata != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, OfflineQuote$$serializer.INSTANCE, dexQuoteBridgeVO.calldata);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) dexQuoteBridgeVO.gasFeeTokenAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, dexQuoteBridgeVO.gasFeeTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) dexQuoteBridgeVO.gasCost, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, dexQuoteBridgeVO.gasCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) dexQuoteBridgeVO.percent, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, dexQuoteBridgeVO.percent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) dexQuoteBridgeVO.poolDepthUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, dexQuoteBridgeVO.poolDepthUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) dexQuoteBridgeVO.maxRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, dexQuoteBridgeVO.maxRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) dexQuoteBridgeVO.minLimitUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, dexQuoteBridgeVO.minLimitUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) dexQuoteBridgeVO.officialBridgeFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, dexQuoteBridgeVO.officialBridgeFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) dexQuoteBridgeVO.estimateBridgeFeeAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, dexQuoteBridgeVO.estimateBridgeFeeAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) dexQuoteBridgeVO.estimateBridgeFeeAmountUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, dexQuoteBridgeVO.estimateBridgeFeeAmountUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) dexQuoteBridgeVO.estimateClaimFeeAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, dexQuoteBridgeVO.estimateClaimFeeAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) dexQuoteBridgeVO.estimateClaimFeeAmountUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, dexQuoteBridgeVO.estimateClaimFeeAmountUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) dexQuoteBridgeVO.bridgeAmountOutUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, dexQuoteBridgeVO.bridgeAmountOutUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) dexQuoteBridgeVO.bridgeAmountInUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, dexQuoteBridgeVO.bridgeAmountInUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) dexQuoteBridgeVO.toRiskLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, dexQuoteBridgeVO.toRiskLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || dexQuoteBridgeVO.bridgeType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 33, dexQuoteBridgeVO.bridgeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) dexQuoteBridgeVO.defiPlatformId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, dexQuoteBridgeVO.defiPlatformId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) dexQuoteBridgeVO.isFreeNetworkFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 35, dexQuoteBridgeVO.isFreeNetworkFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd(dexQuoteBridgeVO.signatureName, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 36, kSerializerArr[36], dexQuoteBridgeVO.signatureName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || dexQuoteBridgeVO.dexMultiTokenAllowanceOut != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 37, DeFiPlatformTokenApprovalInfo$$serializer.INSTANCE, dexQuoteBridgeVO.dexMultiTokenAllowanceOut);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) && Intrinsics.EZpvd((Object) dexQuoteBridgeVO.isNeedClaim, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 38, dexQuoteBridgeVO.isNeedClaim);
    }

    public DexQuoteBridgeVO(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, Map<String, String> map, OfflineQuote offlineQuote, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, int i, @NotNull String str30, @NotNull String str31, @NotNull List<String> list, DeFiPlatformTokenApprovalInfo deFiPlatformTokenApprovalInfo, @NotNull String str32) {
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
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str32, "");
        this.bridgeLogoUrl = str;
        this.bridgeId = str2;
        this.bridgeName = str3;
        this.bridgeAmountIn = str4;
        this.bridgeAmountOut = str5;
        this.expectedTimeDesc = str6;
        this.crossChainFee = str7;
        this.otherFee = str8;
        this.totalFee = str9;
        this.maximumSwap = str10;
        this.minimumSwap = str11;
        this.fromPoolAddress = str12;
        this.toPoolAddress = str13;
        this.fromPoolName = str14;
        this.toPoolName = str15;
        this.crossFromToken = dexMultiTokenInfoBean;
        this.crossToToken = dexMultiTokenInfoBean2;
        this.callDataMap = map;
        this.calldata = offlineQuote;
        this.gasFeeTokenAmount = str16;
        this.gasCost = str17;
        this.percent = str18;
        this.poolDepthUsd = str19;
        this.maxRatio = str20;
        this.minLimitUsd = str21;
        this.officialBridgeFee = str22;
        this.estimateBridgeFeeAmount = str23;
        this.estimateBridgeFeeAmountUsd = str24;
        this.estimateClaimFeeAmount = str25;
        this.estimateClaimFeeAmountUsd = str26;
        this.bridgeAmountOutUsd = str27;
        this.bridgeAmountInUsd = str28;
        this.toRiskLimit = str29;
        this.bridgeType = i;
        this.defiPlatformId = str30;
        this.isFreeNetworkFee = str31;
        this.signatureName = list;
        this.dexMultiTokenAllowanceOut = deFiPlatformTokenApprovalInfo;
        this.isNeedClaim = str32;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01cc: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r79v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r79v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r79v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r79v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r79v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r79v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r79v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r79v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r79v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r79v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r79v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r79v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r79v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r79v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r79v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x0082: ARITH (r79v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r55v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x008f: ARITH (r79v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r56v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x009a: ARITH (r79v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r57v0 java.util.Map))
  (wrap:com.okinc.business.dexlogic.bean.OfflineQuote:?: TERNARY null = ((wrap:int:0x00a5: ARITH (r79v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.OfflineQuote) : (r58v0 com.okinc.business.dexlogic.bean.OfflineQuote))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b0: ARITH (r79v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bb: ARITH (r79v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c6: ARITH (r79v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d1: ARITH (r79v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00dc: ARITH (r79v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e7: ARITH (r79v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f2: ARITH (r79v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fd: ARITH (r79v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0108: ARITH (r79v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0113: ARITH (r79v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011e: ARITH (r79v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0129: ARITH (r79v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0134: ARITH (r79v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x013d: ARITH (r80v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r72v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0146: ARITH (r80v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r73v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x014f: ARITH (r80v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r74v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0158: ARITH (r80v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r75v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0161: ARITH (r80v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0165: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:1786)) : (r76v0 java.util.List))
  (wrap:com.okinc.business.dexlogic.bean.DeFiPlatformTokenApprovalInfo:?: TERNARY null = ((wrap:int:0x016c: ARITH (r80v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r77v0 com.okinc.business.dexlogic.bean.DeFiPlatformTokenApprovalInfo) : (null com.okinc.business.dexlogic.bean.DeFiPlatformTokenApprovalInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0173: ARITH (r80v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r78v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.util.Map<java.lang.String, java.lang.String>, com.okinc.business.dexlogic.bean.OfflineQuote, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.util.List<java.lang.String>, com.okinc.business.dexlogic.bean.DeFiPlatformTokenApprovalInfo, java.lang.String):void (m)] (LINE:1743) call: com.okinc.business.dexlogic.bean.DexQuoteBridgeVO.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.util.Map, com.okinc.business.dexlogic.bean.OfflineQuote, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.util.List, com.okinc.business.dexlogic.bean.DeFiPlatformTokenApprovalInfo, java.lang.String):void type: THIS */
    public /* synthetic */ DexQuoteBridgeVO(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, Map map, OfflineQuote offlineQuote, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, int i, String str30, String str31, List list, DeFiPlatformTokenApprovalInfo deFiPlatformTokenApprovalInfo, String str32, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? "" : str9, (i2 & 512) != 0 ? "" : str10, (i2 & 1024) != 0 ? "" : str11, (i2 & 2048) != 0 ? "" : str12, (i2 & 4096) != 0 ? "" : str13, (i2 & 8192) != 0 ? "" : str14, (i2 & 16384) != 0 ? "" : str15, (i2 & 32768) != 0 ? null : dexMultiTokenInfoBean, (i2 & 65536) != 0 ? null : dexMultiTokenInfoBean2, (i2 & 131072) != 0 ? null : map, (i2 & 262144) != 0 ? null : offlineQuote, (i2 & 524288) != 0 ? "" : str16, (i2 & 1048576) != 0 ? "" : str17, (i2 & 2097152) != 0 ? "" : str18, (i2 & 4194304) != 0 ? "" : str19, (i2 & 8388608) != 0 ? "" : str20, (i2 & 16777216) != 0 ? "" : str21, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str22, (i2 & 67108864) != 0 ? "" : str23, (i2 & 134217728) != 0 ? "" : str24, (i2 & 268435456) != 0 ? "" : str25, (i2 & 536870912) != 0 ? "" : str26, (i2 & 1073741824) != 0 ? "" : str27, (i2 & Integer.MIN_VALUE) != 0 ? "" : str28, (i3 & 1) != 0 ? "" : str29, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? "" : str30, (i3 & 8) != 0 ? "" : str31, (i3 & 16) != 0 ? yDY.AhwBna() : list, (i3 & 32) == 0 ? deFiPlatformTokenApprovalInfo : null, (i3 & 64) != 0 ? "" : str32);
    }

    public final boolean isSwftBtc() {
        return Intrinsics.EZpvd((Object) this.bridgeId, (Object) "8");
    }

    public final boolean isBtcThorSwap() {
        return Intrinsics.EZpvd((Object) this.bridgeId, (Object) "23");
    }

    public final boolean isFreeNetWorkFee() {
        return C23313hvq.copydefault(this.isFreeNetworkFee, 1);
    }

    public final boolean isEstimateBridgeFeeAmountValid() {
        return C33129mqd.OLrzqt((CharSequence) this.estimateBridgeFeeAmount) && !Intrinsics.EZpvd((Object) this.estimateBridgeFeeAmount, (Object) "0");
    }

    public final boolean thorSwapOrderCheck(String str) {
        return isBtcThorSwap() && (str == null || str.length() == 0);
    }

    public final boolean isIntentBridge() {
        return C23313hvq.copydefault(Integer.valueOf(this.bridgeType), 3);
    }
}
