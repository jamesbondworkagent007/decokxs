package com.okinc.business.dexlogic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C23313hvq;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class PathSelectionRouterItem implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final DexAutoSlippageInfoParam autoSlippageInfo;
    private final String bestPriceRouterSave;
    private final DexQuoteBridgeVO bridge;
    private final String bridgeFeeUsd;
    private final String crossChainFee;
    private final String estimateGasFee;
    private String estimateGasFeeAmount;
    private String estimateGasFeeAmountUsd;
    private final String estimateTokenFee;
    private final String estimatedTime;
    private final ArrayList<DexRouterList> fromDexRouterList;
    private final String fromSwapFee;
    private final String fromSwapFeeUsd;
    private final DexMultiTokenInfoBean fromSwapToTokenInfo;
    private boolean localSelected;
    private final String minimumReceived;
    private final String needApprove;
    private final String networkFeeOfNativeToken;
    private final ArrayList<DexRouterList> originFromDexRouterList;
    private final String realSlippage;
    private final String receiveAmount;
    private final String routerLabel;
    private final ArrayList<DexSwapSmartRoutingMenuVo> smartRoutingMenuVoList;
    private final ArrayList<DexRouterList> toDexRouterToList;
    private final String toSwapFee;
    private final String toSwapFeeUsd;
    private final DexMultiTokenInfoBean toSwapFromTokenInfo;
    private final String toSwapServiceFee;
    private final String toSwapServiceFeeUsd;
    private final String toTokenPrice;
    private final String totalFee;
    private final ValueDiffInfo valueDiffInfo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PathSelectionRouterItem> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PathSelectionRouterItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PathSelectionRouterItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(DexSwapSmartRoutingMenuVo.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(DexRouterList.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(DexRouterList.CREATOR.createFromParcel(parcel));
                }
            }
            DexQuoteBridgeVO dexQuoteBridgeVOCreateFromParcel = parcel.readInt() == 0 ? null : DexQuoteBridgeVO.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i7 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    arrayList5.add(DexRouterList.CREATOR.createFromParcel(parcel));
                }
                arrayList4 = arrayList5;
            }
            return new PathSelectionRouterItem(string, string2, string3, string4, string5, string6, string7, arrayList, arrayList2, arrayList3, dexQuoteBridgeVOCreateFromParcel, arrayList4, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : DexAutoSlippageInfoParam.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ValueDiffInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PathSelectionRouterItem[] newArray(int i) {
            return new PathSelectionRouterItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PathSelectionRouterItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, -1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.routerLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DexRouterList> component10() {
        return this.originFromDexRouterList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexQuoteBridgeVO component11() {
        return this.bridge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DexRouterList> component12() {
        return this.toDexRouterToList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.receiveAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.totalFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.crossChainFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.toSwapFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.estimateGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.estimateTokenFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.realSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromSwapFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.networkFeeOfNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexAutoSlippageInfoParam component21() {
        return this.autoSlippageInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.minimumReceived;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component23() {
        return this.fromSwapToTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component24() {
        return this.toSwapFromTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.toTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.estimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.needApprove;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component28() {
        return this.localSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.bestPriceRouterSave;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fromSwapFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.toSwapServiceFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.toSwapServiceFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ValueDiffInfo component32() {
        return this.valueDiffInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.bridgeFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.toSwapFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.estimateGasFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.estimateGasFeeAmountUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DexSwapSmartRoutingMenuVo> component8() {
        return this.smartRoutingMenuVoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DexRouterList> component9() {
        return this.fromDexRouterList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PathSelectionRouterItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, ArrayList<DexSwapSmartRoutingMenuVo> arrayList, ArrayList<DexRouterList> arrayList2, ArrayList<DexRouterList> arrayList3, DexQuoteBridgeVO dexQuoteBridgeVO, ArrayList<DexRouterList> arrayList4, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, @NotNull String str16, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, @NotNull String str17, @NotNull String str18, @NotNull String str19, boolean z, @NotNull String str20, @NotNull String str21, @NotNull String str22, ValueDiffInfo valueDiffInfo) {
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
        return new PathSelectionRouterItem(str, str2, str3, str4, str5, str6, str7, arrayList, arrayList2, arrayList3, dexQuoteBridgeVO, arrayList4, str8, str9, str10, str11, str12, str13, str14, str15, dexAutoSlippageInfoParam, str16, dexMultiTokenInfoBean, dexMultiTokenInfoBean2, str17, str18, str19, z, str20, str21, str22, valueDiffInfo);
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
        if (!(obj instanceof PathSelectionRouterItem)) {
            return false;
        }
        PathSelectionRouterItem pathSelectionRouterItem = (PathSelectionRouterItem) obj;
        return Intrinsics.EZpvd((Object) this.routerLabel, (Object) pathSelectionRouterItem.routerLabel) && Intrinsics.EZpvd((Object) this.fromSwapFee, (Object) pathSelectionRouterItem.fromSwapFee) && Intrinsics.EZpvd((Object) this.fromSwapFeeUsd, (Object) pathSelectionRouterItem.fromSwapFeeUsd) && Intrinsics.EZpvd((Object) this.bridgeFeeUsd, (Object) pathSelectionRouterItem.bridgeFeeUsd) && Intrinsics.EZpvd((Object) this.toSwapFeeUsd, (Object) pathSelectionRouterItem.toSwapFeeUsd) && Intrinsics.EZpvd((Object) this.estimateGasFeeAmount, (Object) pathSelectionRouterItem.estimateGasFeeAmount) && Intrinsics.EZpvd((Object) this.estimateGasFeeAmountUsd, (Object) pathSelectionRouterItem.estimateGasFeeAmountUsd) && Intrinsics.EZpvd(this.smartRoutingMenuVoList, pathSelectionRouterItem.smartRoutingMenuVoList) && Intrinsics.EZpvd(this.fromDexRouterList, pathSelectionRouterItem.fromDexRouterList) && Intrinsics.EZpvd(this.originFromDexRouterList, pathSelectionRouterItem.originFromDexRouterList) && Intrinsics.EZpvd(this.bridge, pathSelectionRouterItem.bridge) && Intrinsics.EZpvd(this.toDexRouterToList, pathSelectionRouterItem.toDexRouterToList) && Intrinsics.EZpvd((Object) this.receiveAmount, (Object) pathSelectionRouterItem.receiveAmount) && Intrinsics.EZpvd((Object) this.totalFee, (Object) pathSelectionRouterItem.totalFee) && Intrinsics.EZpvd((Object) this.crossChainFee, (Object) pathSelectionRouterItem.crossChainFee) && Intrinsics.EZpvd((Object) this.toSwapFee, (Object) pathSelectionRouterItem.toSwapFee) && Intrinsics.EZpvd((Object) this.estimateGasFee, (Object) pathSelectionRouterItem.estimateGasFee) && Intrinsics.EZpvd((Object) this.estimateTokenFee, (Object) pathSelectionRouterItem.estimateTokenFee) && Intrinsics.EZpvd((Object) this.realSlippage, (Object) pathSelectionRouterItem.realSlippage) && Intrinsics.EZpvd((Object) this.networkFeeOfNativeToken, (Object) pathSelectionRouterItem.networkFeeOfNativeToken) && Intrinsics.EZpvd(this.autoSlippageInfo, pathSelectionRouterItem.autoSlippageInfo) && Intrinsics.EZpvd((Object) this.minimumReceived, (Object) pathSelectionRouterItem.minimumReceived) && Intrinsics.EZpvd(this.fromSwapToTokenInfo, pathSelectionRouterItem.fromSwapToTokenInfo) && Intrinsics.EZpvd(this.toSwapFromTokenInfo, pathSelectionRouterItem.toSwapFromTokenInfo) && Intrinsics.EZpvd((Object) this.toTokenPrice, (Object) pathSelectionRouterItem.toTokenPrice) && Intrinsics.EZpvd((Object) this.estimatedTime, (Object) pathSelectionRouterItem.estimatedTime) && Intrinsics.EZpvd((Object) this.needApprove, (Object) pathSelectionRouterItem.needApprove) && this.localSelected == pathSelectionRouterItem.localSelected && Intrinsics.EZpvd((Object) this.bestPriceRouterSave, (Object) pathSelectionRouterItem.bestPriceRouterSave) && Intrinsics.EZpvd((Object) this.toSwapServiceFee, (Object) pathSelectionRouterItem.toSwapServiceFee) && Intrinsics.EZpvd((Object) this.toSwapServiceFeeUsd, (Object) pathSelectionRouterItem.toSwapServiceFeeUsd) && Intrinsics.EZpvd(this.valueDiffInfo, pathSelectionRouterItem.valueDiffInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexAutoSlippageInfoParam getAutoSlippageInfo() {
        return this.autoSlippageInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBestPriceRouterSave() {
        return this.bestPriceRouterSave;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexQuoteBridgeVO getBridge() {
        return this.bridge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBridgeFeeUsd() {
        return this.bridgeFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCrossChainFee() {
        return this.crossChainFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimateGasFee() {
        return this.estimateGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimateGasFeeAmount() {
        return this.estimateGasFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimateGasFeeAmountUsd() {
        return this.estimateGasFeeAmountUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimateTokenFee() {
        return this.estimateTokenFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimatedTime() {
        return this.estimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DexRouterList> getFromDexRouterList() {
        return this.fromDexRouterList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromSwapFee() {
        return this.fromSwapFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromSwapFeeUsd() {
        return this.fromSwapFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getFromSwapToTokenInfo() {
        return this.fromSwapToTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getLocalSelected() {
        return this.localSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinimumReceived() {
        return this.minimumReceived;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNeedApprove() {
        return this.needApprove;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkFeeOfNativeToken() {
        return this.networkFeeOfNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DexRouterList> getOriginFromDexRouterList() {
        return this.originFromDexRouterList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealSlippage() {
        return this.realSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceiveAmount() {
        return this.receiveAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRouterLabel() {
        return this.routerLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DexSwapSmartRoutingMenuVo> getSmartRoutingMenuVoList() {
        return this.smartRoutingMenuVoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DexRouterList> getToDexRouterToList() {
        return this.toDexRouterToList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToSwapFee() {
        return this.toSwapFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToSwapFeeUsd() {
        return this.toSwapFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getToSwapFromTokenInfo() {
        return this.toSwapFromTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToSwapServiceFee() {
        return this.toSwapServiceFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToSwapServiceFeeUsd() {
        return this.toSwapServiceFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenPrice() {
        return this.toTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalFee() {
        return this.totalFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ValueDiffInfo getValueDiffInfo() {
        return this.valueDiffInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.routerLabel.hashCode();
        int iHashCode2 = this.fromSwapFee.hashCode();
        int iHashCode3 = this.fromSwapFeeUsd.hashCode();
        int iHashCode4 = this.bridgeFeeUsd.hashCode();
        int iHashCode5 = this.toSwapFeeUsd.hashCode();
        int iHashCode6 = this.estimateGasFeeAmount.hashCode();
        int iHashCode7 = this.estimateGasFeeAmountUsd.hashCode();
        ArrayList<DexSwapSmartRoutingMenuVo> arrayList = this.smartRoutingMenuVoList;
        int iHashCode8 = arrayList == null ? 0 : arrayList.hashCode();
        ArrayList<DexRouterList> arrayList2 = this.fromDexRouterList;
        int iHashCode9 = arrayList2 == null ? 0 : arrayList2.hashCode();
        ArrayList<DexRouterList> arrayList3 = this.originFromDexRouterList;
        int iHashCode10 = arrayList3 == null ? 0 : arrayList3.hashCode();
        DexQuoteBridgeVO dexQuoteBridgeVO = this.bridge;
        int iHashCode11 = dexQuoteBridgeVO == null ? 0 : dexQuoteBridgeVO.hashCode();
        ArrayList<DexRouterList> arrayList4 = this.toDexRouterToList;
        int iHashCode12 = arrayList4 == null ? 0 : arrayList4.hashCode();
        int iHashCode13 = this.receiveAmount.hashCode();
        int iHashCode14 = this.totalFee.hashCode();
        int iHashCode15 = this.crossChainFee.hashCode();
        int iHashCode16 = this.toSwapFee.hashCode();
        int iHashCode17 = this.estimateGasFee.hashCode();
        int iHashCode18 = this.estimateTokenFee.hashCode();
        int iHashCode19 = this.realSlippage.hashCode();
        int iHashCode20 = this.networkFeeOfNativeToken.hashCode();
        DexAutoSlippageInfoParam dexAutoSlippageInfoParam = this.autoSlippageInfo;
        int iHashCode21 = dexAutoSlippageInfoParam == null ? 0 : dexAutoSlippageInfoParam.hashCode();
        int iHashCode22 = this.minimumReceived.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.fromSwapToTokenInfo;
        int iHashCode23 = dexMultiTokenInfoBean == null ? 0 : dexMultiTokenInfoBean.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.toSwapFromTokenInfo;
        int iHashCode24 = dexMultiTokenInfoBean2 == null ? 0 : dexMultiTokenInfoBean2.hashCode();
        int iHashCode25 = this.toTokenPrice.hashCode();
        int iHashCode26 = this.estimatedTime.hashCode();
        int iHashCode27 = this.needApprove.hashCode();
        int iHashCode28 = Boolean.hashCode(this.localSelected);
        int iHashCode29 = this.bestPriceRouterSave.hashCode();
        int iHashCode30 = this.toSwapServiceFee.hashCode();
        int iHashCode31 = this.toSwapServiceFeeUsd.hashCode();
        ValueDiffInfo valueDiffInfo = this.valueDiffInfo;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + (valueDiffInfo == null ? 0 : valueDiffInfo.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimateGasFeeAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.estimateGasFeeAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimateGasFeeAmountUsd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.estimateGasFeeAmountUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocalSelected(boolean z) {
        this.localSelected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PathSelectionRouterItem(routerLabel=" + this.routerLabel + ", fromSwapFee=" + this.fromSwapFee + ", fromSwapFeeUsd=" + this.fromSwapFeeUsd + ", bridgeFeeUsd=" + this.bridgeFeeUsd + ", toSwapFeeUsd=" + this.toSwapFeeUsd + ", estimateGasFeeAmount=" + this.estimateGasFeeAmount + ", estimateGasFeeAmountUsd=" + this.estimateGasFeeAmountUsd + ", smartRoutingMenuVoList=" + this.smartRoutingMenuVoList + ", fromDexRouterList=" + this.fromDexRouterList + ", originFromDexRouterList=" + this.originFromDexRouterList + ", bridge=" + this.bridge + ", toDexRouterToList=" + this.toDexRouterToList + ", receiveAmount=" + this.receiveAmount + ", totalFee=" + this.totalFee + ", crossChainFee=" + this.crossChainFee + ", toSwapFee=" + this.toSwapFee + ", estimateGasFee=" + this.estimateGasFee + ", estimateTokenFee=" + this.estimateTokenFee + ", realSlippage=" + this.realSlippage + ", networkFeeOfNativeToken=" + this.networkFeeOfNativeToken + ", autoSlippageInfo=" + this.autoSlippageInfo + ", minimumReceived=" + this.minimumReceived + ", fromSwapToTokenInfo=" + this.fromSwapToTokenInfo + ", toSwapFromTokenInfo=" + this.toSwapFromTokenInfo + ", toTokenPrice=" + this.toTokenPrice + ", estimatedTime=" + this.estimatedTime + ", needApprove=" + this.needApprove + ", localSelected=" + this.localSelected + ", bestPriceRouterSave=" + this.bestPriceRouterSave + ", toSwapServiceFee=" + this.toSwapServiceFee + ", toSwapServiceFeeUsd=" + this.toSwapServiceFeeUsd + ", valueDiffInfo=" + this.valueDiffInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.routerLabel);
        parcel.writeString(this.fromSwapFee);
        parcel.writeString(this.fromSwapFeeUsd);
        parcel.writeString(this.bridgeFeeUsd);
        parcel.writeString(this.toSwapFeeUsd);
        parcel.writeString(this.estimateGasFeeAmount);
        parcel.writeString(this.estimateGasFeeAmountUsd);
        ArrayList<DexSwapSmartRoutingMenuVo> arrayList = this.smartRoutingMenuVoList;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<DexSwapSmartRoutingMenuVo> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        ArrayList<DexRouterList> arrayList2 = this.fromDexRouterList;
        if (arrayList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList2.size());
            Iterator<DexRouterList> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        ArrayList<DexRouterList> arrayList3 = this.originFromDexRouterList;
        if (arrayList3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList3.size());
            Iterator<DexRouterList> it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        DexQuoteBridgeVO dexQuoteBridgeVO = this.bridge;
        if (dexQuoteBridgeVO == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexQuoteBridgeVO.writeToParcel(parcel, i);
        }
        ArrayList<DexRouterList> arrayList4 = this.toDexRouterToList;
        if (arrayList4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList4.size());
            Iterator<DexRouterList> it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.receiveAmount);
        parcel.writeString(this.totalFee);
        parcel.writeString(this.crossChainFee);
        parcel.writeString(this.toSwapFee);
        parcel.writeString(this.estimateGasFee);
        parcel.writeString(this.estimateTokenFee);
        parcel.writeString(this.realSlippage);
        parcel.writeString(this.networkFeeOfNativeToken);
        DexAutoSlippageInfoParam dexAutoSlippageInfoParam = this.autoSlippageInfo;
        if (dexAutoSlippageInfoParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexAutoSlippageInfoParam.writeToParcel(parcel, i);
        }
        parcel.writeString(this.minimumReceived);
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.fromSwapToTokenInfo;
        if (dexMultiTokenInfoBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexMultiTokenInfoBean.writeToParcel(parcel, i);
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.toSwapFromTokenInfo;
        if (dexMultiTokenInfoBean2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexMultiTokenInfoBean2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.toTokenPrice);
        parcel.writeString(this.estimatedTime);
        parcel.writeString(this.needApprove);
        parcel.writeInt(this.localSelected ? 1 : 0);
        parcel.writeString(this.bestPriceRouterSave);
        parcel.writeString(this.toSwapServiceFee);
        parcel.writeString(this.toSwapServiceFeeUsd);
        ValueDiffInfo valueDiffInfo = this.valueDiffInfo;
        if (valueDiffInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            valueDiffInfo.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.PathSelectionRouterItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PathSelectionRouterItem> serializer() {
            return PathSelectionRouterItem$$serializer.INSTANCE;
        }
    }

    static {
        DexRouterList$$serializer dexRouterList$$serializer = DexRouterList$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, new ArrayListSerializer(DexSwapSmartRoutingMenuVo$$serializer.INSTANCE), new ArrayListSerializer(dexRouterList$$serializer), new ArrayListSerializer(dexRouterList$$serializer), null, new ArrayListSerializer(dexRouterList$$serializer), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ PathSelectionRouterItem(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, DexQuoteBridgeVO dexQuoteBridgeVO, ArrayList arrayList4, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, String str16, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, String str17, String str18, String str19, boolean z, String str20, String str21, String str22, ValueDiffInfo valueDiffInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.routerLabel = "";
        } else {
            this.routerLabel = str;
        }
        if ((i & 2) == 0) {
            this.fromSwapFee = "";
        } else {
            this.fromSwapFee = str2;
        }
        if ((i & 4) == 0) {
            this.fromSwapFeeUsd = "";
        } else {
            this.fromSwapFeeUsd = str3;
        }
        if ((i & 8) == 0) {
            this.bridgeFeeUsd = "";
        } else {
            this.bridgeFeeUsd = str4;
        }
        if ((i & 16) == 0) {
            this.toSwapFeeUsd = "";
        } else {
            this.toSwapFeeUsd = str5;
        }
        if ((i & 32) == 0) {
            this.estimateGasFeeAmount = "";
        } else {
            this.estimateGasFeeAmount = str6;
        }
        if ((i & 64) == 0) {
            this.estimateGasFeeAmountUsd = "";
        } else {
            this.estimateGasFeeAmountUsd = str7;
        }
        if ((i & 128) == 0) {
            this.smartRoutingMenuVoList = null;
        } else {
            this.smartRoutingMenuVoList = arrayList;
        }
        if ((i & 256) == 0) {
            this.fromDexRouterList = null;
        } else {
            this.fromDexRouterList = arrayList2;
        }
        if ((i & 512) == 0) {
            this.originFromDexRouterList = null;
        } else {
            this.originFromDexRouterList = arrayList3;
        }
        if ((i & 1024) == 0) {
            this.bridge = null;
        } else {
            this.bridge = dexQuoteBridgeVO;
        }
        if ((i & 2048) == 0) {
            this.toDexRouterToList = null;
        } else {
            this.toDexRouterToList = arrayList4;
        }
        if ((i & 4096) == 0) {
            this.receiveAmount = "";
        } else {
            this.receiveAmount = str8;
        }
        if ((i & 8192) == 0) {
            this.totalFee = "";
        } else {
            this.totalFee = str9;
        }
        if ((i & 16384) == 0) {
            this.crossChainFee = "";
        } else {
            this.crossChainFee = str10;
        }
        if ((32768 & i) == 0) {
            this.toSwapFee = "";
        } else {
            this.toSwapFee = str11;
        }
        if ((65536 & i) == 0) {
            this.estimateGasFee = "";
        } else {
            this.estimateGasFee = str12;
        }
        if ((131072 & i) == 0) {
            this.estimateTokenFee = "";
        } else {
            this.estimateTokenFee = str13;
        }
        if ((262144 & i) == 0) {
            this.realSlippage = "";
        } else {
            this.realSlippage = str14;
        }
        if ((524288 & i) == 0) {
            this.networkFeeOfNativeToken = "";
        } else {
            this.networkFeeOfNativeToken = str15;
        }
        if ((1048576 & i) == 0) {
            this.autoSlippageInfo = null;
        } else {
            this.autoSlippageInfo = dexAutoSlippageInfoParam;
        }
        if ((2097152 & i) == 0) {
            this.minimumReceived = "";
        } else {
            this.minimumReceived = str16;
        }
        if ((4194304 & i) == 0) {
            this.fromSwapToTokenInfo = null;
        } else {
            this.fromSwapToTokenInfo = dexMultiTokenInfoBean;
        }
        if ((8388608 & i) == 0) {
            this.toSwapFromTokenInfo = null;
        } else {
            this.toSwapFromTokenInfo = dexMultiTokenInfoBean2;
        }
        if ((16777216 & i) == 0) {
            this.toTokenPrice = "";
        } else {
            this.toTokenPrice = str17;
        }
        if ((33554432 & i) == 0) {
            this.estimatedTime = "";
        } else {
            this.estimatedTime = str18;
        }
        if ((67108864 & i) == 0) {
            this.needApprove = "";
        } else {
            this.needApprove = str19;
        }
        this.localSelected = (134217728 & i) == 0 ? false : z;
        if ((268435456 & i) == 0) {
            this.bestPriceRouterSave = "";
        } else {
            this.bestPriceRouterSave = str20;
        }
        if ((536870912 & i) == 0) {
            this.toSwapServiceFee = "";
        } else {
            this.toSwapServiceFee = str21;
        }
        if ((1073741824 & i) == 0) {
            this.toSwapServiceFeeUsd = "";
        } else {
            this.toSwapServiceFeeUsd = str22;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.valueDiffInfo = null;
        } else {
            this.valueDiffInfo = valueDiffInfo;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(PathSelectionRouterItem pathSelectionRouterItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) pathSelectionRouterItem.routerLabel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, pathSelectionRouterItem.routerLabel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) pathSelectionRouterItem.fromSwapFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, pathSelectionRouterItem.fromSwapFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) pathSelectionRouterItem.fromSwapFeeUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, pathSelectionRouterItem.fromSwapFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) pathSelectionRouterItem.bridgeFeeUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, pathSelectionRouterItem.bridgeFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) pathSelectionRouterItem.toSwapFeeUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, pathSelectionRouterItem.toSwapFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) pathSelectionRouterItem.estimateGasFeeAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, pathSelectionRouterItem.estimateGasFeeAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) pathSelectionRouterItem.estimateGasFeeAmountUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, pathSelectionRouterItem.estimateGasFeeAmountUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || pathSelectionRouterItem.smartRoutingMenuVoList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], pathSelectionRouterItem.smartRoutingMenuVoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || pathSelectionRouterItem.fromDexRouterList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], pathSelectionRouterItem.fromDexRouterList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || pathSelectionRouterItem.originFromDexRouterList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], pathSelectionRouterItem.originFromDexRouterList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || pathSelectionRouterItem.bridge != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, DexQuoteBridgeVO$$serializer.INSTANCE, pathSelectionRouterItem.bridge);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || pathSelectionRouterItem.toDexRouterToList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], pathSelectionRouterItem.toDexRouterToList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) pathSelectionRouterItem.receiveAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, pathSelectionRouterItem.receiveAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) pathSelectionRouterItem.totalFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, pathSelectionRouterItem.totalFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) pathSelectionRouterItem.crossChainFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, pathSelectionRouterItem.crossChainFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) pathSelectionRouterItem.toSwapFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, pathSelectionRouterItem.toSwapFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) pathSelectionRouterItem.estimateGasFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, pathSelectionRouterItem.estimateGasFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) pathSelectionRouterItem.estimateTokenFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, pathSelectionRouterItem.estimateTokenFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) pathSelectionRouterItem.realSlippage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, pathSelectionRouterItem.realSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) pathSelectionRouterItem.networkFeeOfNativeToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, pathSelectionRouterItem.networkFeeOfNativeToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || pathSelectionRouterItem.autoSlippageInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, DexAutoSlippageInfoParam$$serializer.INSTANCE, pathSelectionRouterItem.autoSlippageInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) pathSelectionRouterItem.minimumReceived, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, pathSelectionRouterItem.minimumReceived);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || pathSelectionRouterItem.fromSwapToTokenInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, DexMultiTokenInfoBean$$serializer.INSTANCE, pathSelectionRouterItem.fromSwapToTokenInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || pathSelectionRouterItem.toSwapFromTokenInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, DexMultiTokenInfoBean$$serializer.INSTANCE, pathSelectionRouterItem.toSwapFromTokenInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) pathSelectionRouterItem.toTokenPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, pathSelectionRouterItem.toTokenPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) pathSelectionRouterItem.estimatedTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, pathSelectionRouterItem.estimatedTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) pathSelectionRouterItem.needApprove, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, pathSelectionRouterItem.needApprove);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || pathSelectionRouterItem.localSelected) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 27, pathSelectionRouterItem.localSelected);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) pathSelectionRouterItem.bestPriceRouterSave, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, pathSelectionRouterItem.bestPriceRouterSave);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) pathSelectionRouterItem.toSwapServiceFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, pathSelectionRouterItem.toSwapServiceFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) pathSelectionRouterItem.toSwapServiceFeeUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, pathSelectionRouterItem.toSwapServiceFeeUsd);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) && pathSelectionRouterItem.valueDiffInfo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, ValueDiffInfo$$serializer.INSTANCE, pathSelectionRouterItem.valueDiffInfo);
    }

    public PathSelectionRouterItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, ArrayList<DexSwapSmartRoutingMenuVo> arrayList, ArrayList<DexRouterList> arrayList2, ArrayList<DexRouterList> arrayList3, DexQuoteBridgeVO dexQuoteBridgeVO, ArrayList<DexRouterList> arrayList4, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, @NotNull String str16, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, @NotNull String str17, @NotNull String str18, @NotNull String str19, boolean z, @NotNull String str20, @NotNull String str21, @NotNull String str22, ValueDiffInfo valueDiffInfo) {
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
        this.routerLabel = str;
        this.fromSwapFee = str2;
        this.fromSwapFeeUsd = str3;
        this.bridgeFeeUsd = str4;
        this.toSwapFeeUsd = str5;
        this.estimateGasFeeAmount = str6;
        this.estimateGasFeeAmountUsd = str7;
        this.smartRoutingMenuVoList = arrayList;
        this.fromDexRouterList = arrayList2;
        this.originFromDexRouterList = arrayList3;
        this.bridge = dexQuoteBridgeVO;
        this.toDexRouterToList = arrayList4;
        this.receiveAmount = str8;
        this.totalFee = str9;
        this.crossChainFee = str10;
        this.toSwapFee = str11;
        this.estimateGasFee = str12;
        this.estimateTokenFee = str13;
        this.realSlippage = str14;
        this.networkFeeOfNativeToken = str15;
        this.autoSlippageInfo = dexAutoSlippageInfoParam;
        this.minimumReceived = str16;
        this.fromSwapToTokenInfo = dexMultiTokenInfoBean;
        this.toSwapFromTokenInfo = dexMultiTokenInfoBean2;
        this.toTokenPrice = str17;
        this.estimatedTime = str18;
        this.needApprove = str19;
        this.localSelected = z;
        this.bestPriceRouterSave = str20;
        this.toSwapServiceFee = str21;
        this.toSwapServiceFeeUsd = str22;
        this.valueDiffInfo = valueDiffInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x017c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r66v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r66v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r66v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r66v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r66v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r66v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r66v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x003c: ARITH (r66v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r41v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0044: ARITH (r66v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r42v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x004c: ARITH (r66v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r43v0 java.util.ArrayList))
  (wrap:com.okinc.business.dexlogic.bean.DexQuoteBridgeVO:?: TERNARY null = ((wrap:int:0x0054: ARITH (r66v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexQuoteBridgeVO) : (r44v0 com.okinc.business.dexlogic.bean.DexQuoteBridgeVO))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x005c: ARITH (r66v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r45v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r66v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r66v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r66v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r66v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r66v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r66v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r66v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r66v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r66v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam) : (r54v0 com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r66v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r66v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r56v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x00da: ARITH (r66v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r57v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e5: ARITH (r66v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f0: ARITH (r66v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fb: ARITH (r66v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0106: ARITH (r66v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? false : (r61v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0111: ARITH (r66v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011c: ARITH (r66v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0127: ARITH (r66v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.ValueDiffInfo:?: TERNARY null = ((wrap:int:0x0132: ARITH (r66v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.ValueDiffInfo) : (r65v0 com.okinc.business.dexlogic.bean.ValueDiffInfo))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.business.dexlogic.bean.DexSwapSmartRoutingMenuVo>, java.util.ArrayList<com.okinc.business.dexlogic.bean.DexRouterList>, java.util.ArrayList<com.okinc.business.dexlogic.bean.DexRouterList>, com.okinc.business.dexlogic.bean.DexQuoteBridgeVO, java.util.ArrayList<com.okinc.business.dexlogic.bean.DexRouterList>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.ValueDiffInfo):void (m)] (LINE:40) call: com.okinc.business.dexlogic.bean.PathSelectionRouterItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, com.okinc.business.dexlogic.bean.DexQuoteBridgeVO, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.ValueDiffInfo):void type: THIS */
    public /* synthetic */ PathSelectionRouterItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, DexQuoteBridgeVO dexQuoteBridgeVO, ArrayList arrayList4, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, String str16, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, String str17, String str18, String str19, boolean z, String str20, String str21, String str22, ValueDiffInfo valueDiffInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? null : arrayList, (i & 256) != 0 ? null : arrayList2, (i & 512) != 0 ? null : arrayList3, (i & 1024) != 0 ? null : dexQuoteBridgeVO, (i & 2048) != 0 ? null : arrayList4, (i & 4096) != 0 ? "" : str8, (i & 8192) != 0 ? "" : str9, (i & 16384) != 0 ? "" : str10, (i & 32768) != 0 ? "" : str11, (i & 65536) != 0 ? "" : str12, (i & 131072) != 0 ? "" : str13, (i & 262144) != 0 ? "" : str14, (i & 524288) != 0 ? "" : str15, (i & 1048576) != 0 ? null : dexAutoSlippageInfoParam, (i & 2097152) != 0 ? "" : str16, (i & 4194304) != 0 ? null : dexMultiTokenInfoBean, (i & 8388608) != 0 ? null : dexMultiTokenInfoBean2, (i & 16777216) != 0 ? "" : str17, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str18, (i & 67108864) != 0 ? "" : str19, (i & 134217728) != 0 ? false : z, (i & 268435456) != 0 ? "" : str20, (i & 536870912) != 0 ? "" : str21, (i & 1073741824) != 0 ? "" : str22, (i & Integer.MIN_VALUE) != 0 ? null : valueDiffInfo);
    }

    public final boolean showValueDiffWarn() {
        ValueDiffInfo valueDiffInfo = this.valueDiffInfo;
        if (valueDiffInfo != null) {
            return valueDiffInfo.getShowValueDiffWarn();
        }
        return false;
    }

    public final String getBridgeId() {
        DexQuoteBridgeVO dexQuoteBridgeVO = this.bridge;
        if (dexQuoteBridgeVO != null) {
            return dexQuoteBridgeVO.getBridgeId();
        }
        return null;
    }

    public final boolean isToSwapValueDiffHint() {
        String bridgeAmountOutUsd;
        if (this.toSwapFeeUsd.length() == 0) {
            return false;
        }
        String str = this.toSwapFeeUsd;
        DexQuoteBridgeVO dexQuoteBridgeVO = this.bridge;
        if (dexQuoteBridgeVO == null || (bridgeAmountOutUsd = dexQuoteBridgeVO.getBridgeAmountOutUsd()) == null) {
            bridgeAmountOutUsd = "";
        }
        String strDivCheckS$default = C23313hvq.divCheckS$default(str, bridgeAmountOutUsd, null, null, null, 14, null);
        DexQuoteBridgeVO dexQuoteBridgeVO2 = this.bridge;
        return C23313hvq.EZpvd(strDivCheckS$default, dexQuoteBridgeVO2 != null ? dexQuoteBridgeVO2.getToRiskLimit() : null);
    }

    public final boolean containsFromSwap() {
        ArrayList<DexRouterList> arrayList = this.fromDexRouterList;
        if (arrayList != null) {
            return C33129mqd.KWHzl((Collection) arrayList);
        }
        return false;
    }

    public final boolean containsToSwap() {
        ArrayList<DexRouterList> arrayList = this.toDexRouterToList;
        if (arrayList != null) {
            return C33129mqd.KWHzl((Collection) arrayList);
        }
        return false;
    }
}
