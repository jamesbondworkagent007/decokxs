package com.okinc.business.dexlogic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class DeFiPlatformForSwap implements Parcelable {
    private final DexAutoSlippageInfoParam autoSlippageInfo;
    private final OfflineQuote calldata;
    private final String defiPlatformId;
    private final List<DexRouterList> dexRouterList;
    private final String diffPercent;
    private final String diffValue;
    private final String estimateGasFee;
    private final String estimatedTime;
    private final String expireTime;
    private final String isEnableMev;
    private final int isHasSaving;
    private final String logo;
    private final Integer mevUnstableShowLevel;
    private final String minimumReceived;
    private final String name;
    private final String needApprove;
    private final String networkFeeOfNativeToken;
    private final Integer offlineType;
    private final Permit2Data permit2Data;
    private final String quoteData;
    private final String quoteDiffPercentThreshold;
    private final String quoteDiffValThreshold;
    private final String quoteId;
    private final String quoteNetWorkFeeOfMoney;
    private final String receiveAmount;
    private final String reducePercent;
    private final String router;
    private final String savingAmount;
    private final String savingValueUSD;
    private final ServiceFeeInfo serviceFeeInfo;
    private final boolean showValueDiffWarn;
    private final String slippage;
    private final Integer structureType;
    private final String toTokenPrice;
    private final String toTokenValue;
    private final String warnPercent;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DeFiPlatformForSwap> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(DexRouterList$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<DeFiPlatformForSwap> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeFiPlatformForSwap createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int i2 = 0;
                while (i2 != i) {
                    arrayList2.add(DexRouterList.CREATOR.createFromParcel(parcel));
                    i2++;
                    i = i;
                }
                arrayList = arrayList2;
            }
            return new DeFiPlatformForSwap(string, string2, string3, string4, string5, string6, string7, string8, numValueOf, numValueOf2, string9, string10, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : OfflineQuote.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DexAutoSlippageInfoParam.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Permit2Data.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ServiceFeeInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeFiPlatformForSwap[] newArray(int i) {
            return new DeFiPlatformForSwap[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DeFiPlatformForSwap() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (OfflineQuote) null, (DexAutoSlippageInfoParam) null, (Permit2Data) null, (ServiceFeeInfo) null, (String) null, (Integer) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, -1, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.defiPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component10() {
        return this.structureType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.router;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.toTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexRouterList> component13() {
        return this.dexRouterList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.quoteNetWorkFeeOfMoney;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.estimateGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfflineQuote component17() {
        return this.calldata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexAutoSlippageInfoParam component18() {
        return this.autoSlippageInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Permit2Data component19() {
        return this.permit2Data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo component20() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.quoteData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component22() {
        return this.mevUnstableShowLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component25() {
        return this.showValueDiffWarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.diffValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.diffPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.quoteDiffValThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.quoteDiffPercentThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.networkFeeOfNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.needApprove;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.isEnableMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.estimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component34() {
        return this.isHasSaving;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.savingAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.savingValueUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.receiveAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.toTokenValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.reducePercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.warnPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.minimumReceived;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component9() {
        return this.offlineType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeFiPlatformForSwap copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, String str9, String str10, List<DexRouterList> list, String str11, String str12, String str13, OfflineQuote offlineQuote, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, Permit2Data permit2Data, ServiceFeeInfo serviceFeeInfo, String str14, Integer num3, String str15, String str16, boolean z, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, int i, @NotNull String str25, @NotNull String str26) {
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
        return new DeFiPlatformForSwap(str, str2, str3, str4, str5, str6, str7, str8, num, num2, str9, str10, list, str11, str12, str13, offlineQuote, dexAutoSlippageInfoParam, permit2Data, serviceFeeInfo, str14, num3, str15, str16, z, str17, str18, str19, str20, str21, str22, str23, str24, i, str25, str26);
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
        if (!(obj instanceof DeFiPlatformForSwap)) {
            return false;
        }
        DeFiPlatformForSwap deFiPlatformForSwap = (DeFiPlatformForSwap) obj;
        return Intrinsics.EZpvd((Object) this.defiPlatformId, (Object) deFiPlatformForSwap.defiPlatformId) && Intrinsics.EZpvd((Object) this.name, (Object) deFiPlatformForSwap.name) && Intrinsics.EZpvd((Object) this.logo, (Object) deFiPlatformForSwap.logo) && Intrinsics.EZpvd((Object) this.receiveAmount, (Object) deFiPlatformForSwap.receiveAmount) && Intrinsics.EZpvd((Object) this.toTokenValue, (Object) deFiPlatformForSwap.toTokenValue) && Intrinsics.EZpvd((Object) this.reducePercent, (Object) deFiPlatformForSwap.reducePercent) && Intrinsics.EZpvd((Object) this.warnPercent, (Object) deFiPlatformForSwap.warnPercent) && Intrinsics.EZpvd((Object) this.minimumReceived, (Object) deFiPlatformForSwap.minimumReceived) && Intrinsics.EZpvd(this.offlineType, deFiPlatformForSwap.offlineType) && Intrinsics.EZpvd(this.structureType, deFiPlatformForSwap.structureType) && Intrinsics.EZpvd((Object) this.router, (Object) deFiPlatformForSwap.router) && Intrinsics.EZpvd((Object) this.toTokenPrice, (Object) deFiPlatformForSwap.toTokenPrice) && Intrinsics.EZpvd(this.dexRouterList, deFiPlatformForSwap.dexRouterList) && Intrinsics.EZpvd((Object) this.slippage, (Object) deFiPlatformForSwap.slippage) && Intrinsics.EZpvd((Object) this.quoteNetWorkFeeOfMoney, (Object) deFiPlatformForSwap.quoteNetWorkFeeOfMoney) && Intrinsics.EZpvd((Object) this.estimateGasFee, (Object) deFiPlatformForSwap.estimateGasFee) && Intrinsics.EZpvd(this.calldata, deFiPlatformForSwap.calldata) && Intrinsics.EZpvd(this.autoSlippageInfo, deFiPlatformForSwap.autoSlippageInfo) && Intrinsics.EZpvd(this.permit2Data, deFiPlatformForSwap.permit2Data) && Intrinsics.EZpvd(this.serviceFeeInfo, deFiPlatformForSwap.serviceFeeInfo) && Intrinsics.EZpvd((Object) this.quoteData, (Object) deFiPlatformForSwap.quoteData) && Intrinsics.EZpvd(this.mevUnstableShowLevel, deFiPlatformForSwap.mevUnstableShowLevel) && Intrinsics.EZpvd((Object) this.quoteId, (Object) deFiPlatformForSwap.quoteId) && Intrinsics.EZpvd((Object) this.expireTime, (Object) deFiPlatformForSwap.expireTime) && this.showValueDiffWarn == deFiPlatformForSwap.showValueDiffWarn && Intrinsics.EZpvd((Object) this.diffValue, (Object) deFiPlatformForSwap.diffValue) && Intrinsics.EZpvd((Object) this.diffPercent, (Object) deFiPlatformForSwap.diffPercent) && Intrinsics.EZpvd((Object) this.quoteDiffValThreshold, (Object) deFiPlatformForSwap.quoteDiffValThreshold) && Intrinsics.EZpvd((Object) this.quoteDiffPercentThreshold, (Object) deFiPlatformForSwap.quoteDiffPercentThreshold) && Intrinsics.EZpvd((Object) this.networkFeeOfNativeToken, (Object) deFiPlatformForSwap.networkFeeOfNativeToken) && Intrinsics.EZpvd((Object) this.needApprove, (Object) deFiPlatformForSwap.needApprove) && Intrinsics.EZpvd((Object) this.isEnableMev, (Object) deFiPlatformForSwap.isEnableMev) && Intrinsics.EZpvd((Object) this.estimatedTime, (Object) deFiPlatformForSwap.estimatedTime) && this.isHasSaving == deFiPlatformForSwap.isHasSaving && Intrinsics.EZpvd((Object) this.savingAmount, (Object) deFiPlatformForSwap.savingAmount) && Intrinsics.EZpvd((Object) this.savingValueUSD, (Object) deFiPlatformForSwap.savingValueUSD);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexAutoSlippageInfoParam getAutoSlippageInfo() {
        return this.autoSlippageInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfflineQuote getCalldata() {
        return this.calldata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefiPlatformId() {
        return this.defiPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexRouterList> getDexRouterList() {
        return this.dexRouterList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDiffPercent() {
        return this.diffPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDiffValue() {
        return this.diffValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimateGasFee() {
        return this.estimateGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimatedTime() {
        return this.estimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpireTime() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMevUnstableShowLevel() {
        return this.mevUnstableShowLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinimumReceived() {
        return this.minimumReceived;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
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
    public final Integer getOfflineType() {
        return this.offlineType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Permit2Data getPermit2Data() {
        return this.permit2Data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteData() {
        return this.quoteData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteDiffPercentThreshold() {
        return this.quoteDiffPercentThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteDiffValThreshold() {
        return this.quoteDiffValThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteId() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteNetWorkFeeOfMoney() {
        return this.quoteNetWorkFeeOfMoney;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceiveAmount() {
        return this.receiveAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReducePercent() {
        return this.reducePercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRouter() {
        return this.router;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSavingAmount() {
        return this.savingAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSavingValueUSD() {
        return this.savingValueUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo getServiceFeeInfo() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowValueDiffWarn() {
        return this.showValueDiffWarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippage() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getStructureType() {
        return this.structureType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenPrice() {
        return this.toTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenValue() {
        return this.toTokenValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWarnPercent() {
        return this.warnPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.defiPlatformId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.name;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.logo;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.receiveAmount;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.toTokenValue;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.reducePercent;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.warnPercent;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.minimumReceived;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        Integer num = this.offlineType;
        int iHashCode9 = num == null ? 0 : num.hashCode();
        Integer num2 = this.structureType;
        int iHashCode10 = num2 == null ? 0 : num2.hashCode();
        String str9 = this.router;
        int iHashCode11 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.toTokenPrice;
        int iHashCode12 = str10 == null ? 0 : str10.hashCode();
        List<DexRouterList> list = this.dexRouterList;
        int iHashCode13 = list == null ? 0 : list.hashCode();
        String str11 = this.slippage;
        int iHashCode14 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.quoteNetWorkFeeOfMoney;
        int iHashCode15 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.estimateGasFee;
        int iHashCode16 = str13 == null ? 0 : str13.hashCode();
        OfflineQuote offlineQuote = this.calldata;
        int iHashCode17 = offlineQuote == null ? 0 : offlineQuote.hashCode();
        DexAutoSlippageInfoParam dexAutoSlippageInfoParam = this.autoSlippageInfo;
        int iHashCode18 = dexAutoSlippageInfoParam == null ? 0 : dexAutoSlippageInfoParam.hashCode();
        Permit2Data permit2Data = this.permit2Data;
        int iHashCode19 = permit2Data == null ? 0 : permit2Data.hashCode();
        ServiceFeeInfo serviceFeeInfo = this.serviceFeeInfo;
        int iHashCode20 = serviceFeeInfo == null ? 0 : serviceFeeInfo.hashCode();
        String str14 = this.quoteData;
        int iHashCode21 = str14 == null ? 0 : str14.hashCode();
        Integer num3 = this.mevUnstableShowLevel;
        int iHashCode22 = num3 == null ? 0 : num3.hashCode();
        String str15 = this.quoteId;
        int iHashCode23 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.expireTime;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + (str16 == null ? 0 : str16.hashCode())) * 31) + Boolean.hashCode(this.showValueDiffWarn)) * 31) + this.diffValue.hashCode()) * 31) + this.diffPercent.hashCode()) * 31) + this.quoteDiffValThreshold.hashCode()) * 31) + this.quoteDiffPercentThreshold.hashCode()) * 31) + this.networkFeeOfNativeToken.hashCode()) * 31) + this.needApprove.hashCode()) * 31) + this.isEnableMev.hashCode()) * 31) + this.estimatedTime.hashCode()) * 31) + Integer.hashCode(this.isHasSaving)) * 31) + this.savingAmount.hashCode()) * 31) + this.savingValueUSD.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isEnableMev() {
        return this.isEnableMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isHasSaving() {
        return this.isHasSaving;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DeFiPlatformForSwap(defiPlatformId=" + this.defiPlatformId + ", name=" + this.name + ", logo=" + this.logo + ", receiveAmount=" + this.receiveAmount + ", toTokenValue=" + this.toTokenValue + ", reducePercent=" + this.reducePercent + ", warnPercent=" + this.warnPercent + ", minimumReceived=" + this.minimumReceived + ", offlineType=" + this.offlineType + ", structureType=" + this.structureType + ", router=" + this.router + ", toTokenPrice=" + this.toTokenPrice + ", dexRouterList=" + this.dexRouterList + ", slippage=" + this.slippage + ", quoteNetWorkFeeOfMoney=" + this.quoteNetWorkFeeOfMoney + ", estimateGasFee=" + this.estimateGasFee + ", calldata=" + this.calldata + ", autoSlippageInfo=" + this.autoSlippageInfo + ", permit2Data=" + this.permit2Data + ", serviceFeeInfo=" + this.serviceFeeInfo + ", quoteData=" + this.quoteData + ", mevUnstableShowLevel=" + this.mevUnstableShowLevel + ", quoteId=" + this.quoteId + ", expireTime=" + this.expireTime + ", showValueDiffWarn=" + this.showValueDiffWarn + ", diffValue=" + this.diffValue + ", diffPercent=" + this.diffPercent + ", quoteDiffValThreshold=" + this.quoteDiffValThreshold + ", quoteDiffPercentThreshold=" + this.quoteDiffPercentThreshold + ", networkFeeOfNativeToken=" + this.networkFeeOfNativeToken + ", needApprove=" + this.needApprove + ", isEnableMev=" + this.isEnableMev + ", estimatedTime=" + this.estimatedTime + ", isHasSaving=" + this.isHasSaving + ", savingAmount=" + this.savingAmount + ", savingValueUSD=" + this.savingValueUSD + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.defiPlatformId);
        parcel.writeString(this.name);
        parcel.writeString(this.logo);
        parcel.writeString(this.receiveAmount);
        parcel.writeString(this.toTokenValue);
        parcel.writeString(this.reducePercent);
        parcel.writeString(this.warnPercent);
        parcel.writeString(this.minimumReceived);
        Integer num = this.offlineType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.structureType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.router);
        parcel.writeString(this.toTokenPrice);
        List<DexRouterList> list = this.dexRouterList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<DexRouterList> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.slippage);
        parcel.writeString(this.quoteNetWorkFeeOfMoney);
        parcel.writeString(this.estimateGasFee);
        OfflineQuote offlineQuote = this.calldata;
        if (offlineQuote == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offlineQuote.writeToParcel(parcel, i);
        }
        DexAutoSlippageInfoParam dexAutoSlippageInfoParam = this.autoSlippageInfo;
        if (dexAutoSlippageInfoParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexAutoSlippageInfoParam.writeToParcel(parcel, i);
        }
        Permit2Data permit2Data = this.permit2Data;
        if (permit2Data == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            permit2Data.writeToParcel(parcel, i);
        }
        ServiceFeeInfo serviceFeeInfo = this.serviceFeeInfo;
        if (serviceFeeInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serviceFeeInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.quoteData);
        Integer num3 = this.mevUnstableShowLevel;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.quoteId);
        parcel.writeString(this.expireTime);
        parcel.writeInt(this.showValueDiffWarn ? 1 : 0);
        parcel.writeString(this.diffValue);
        parcel.writeString(this.diffPercent);
        parcel.writeString(this.quoteDiffValThreshold);
        parcel.writeString(this.quoteDiffPercentThreshold);
        parcel.writeString(this.networkFeeOfNativeToken);
        parcel.writeString(this.needApprove);
        parcel.writeString(this.isEnableMev);
        parcel.writeString(this.estimatedTime);
        parcel.writeInt(this.isHasSaving);
        parcel.writeString(this.savingAmount);
        parcel.writeString(this.savingValueUSD);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.DeFiPlatformForSwap.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DeFiPlatformForSwap> serializer() {
            return DeFiPlatformForSwap$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DeFiPlatformForSwap(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, String str9, String str10, List list, String str11, String str12, String str13, OfflineQuote offlineQuote, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, Permit2Data permit2Data, ServiceFeeInfo serviceFeeInfo, String str14, Integer num3, String str15, String str16, boolean z, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, int i3, String str25, String str26, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.defiPlatformId = null;
        } else {
            this.defiPlatformId = str;
        }
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.logo = null;
        } else {
            this.logo = str3;
        }
        if ((i & 8) == 0) {
            this.receiveAmount = null;
        } else {
            this.receiveAmount = str4;
        }
        if ((i & 16) == 0) {
            this.toTokenValue = null;
        } else {
            this.toTokenValue = str5;
        }
        if ((i & 32) == 0) {
            this.reducePercent = null;
        } else {
            this.reducePercent = str6;
        }
        if ((i & 64) == 0) {
            this.warnPercent = null;
        } else {
            this.warnPercent = str7;
        }
        if ((i & 128) == 0) {
            this.minimumReceived = null;
        } else {
            this.minimumReceived = str8;
        }
        if ((i & 256) == 0) {
            this.offlineType = null;
        } else {
            this.offlineType = num;
        }
        if ((i & 512) == 0) {
            this.structureType = null;
        } else {
            this.structureType = num2;
        }
        if ((i & 1024) == 0) {
            this.router = null;
        } else {
            this.router = str9;
        }
        if ((i & 2048) == 0) {
            this.toTokenPrice = "";
        } else {
            this.toTokenPrice = str10;
        }
        if ((i & 4096) == 0) {
            this.dexRouterList = null;
        } else {
            this.dexRouterList = list;
        }
        if ((i & 8192) == 0) {
            this.slippage = null;
        } else {
            this.slippage = str11;
        }
        if ((i & 16384) == 0) {
            this.quoteNetWorkFeeOfMoney = null;
        } else {
            this.quoteNetWorkFeeOfMoney = str12;
        }
        if ((32768 & i) == 0) {
            this.estimateGasFee = null;
        } else {
            this.estimateGasFee = str13;
        }
        if ((65536 & i) == 0) {
            this.calldata = null;
        } else {
            this.calldata = offlineQuote;
        }
        if ((131072 & i) == 0) {
            this.autoSlippageInfo = null;
        } else {
            this.autoSlippageInfo = dexAutoSlippageInfoParam;
        }
        if ((262144 & i) == 0) {
            this.permit2Data = null;
        } else {
            this.permit2Data = permit2Data;
        }
        if ((524288 & i) == 0) {
            this.serviceFeeInfo = null;
        } else {
            this.serviceFeeInfo = serviceFeeInfo;
        }
        if ((1048576 & i) == 0) {
            this.quoteData = null;
        } else {
            this.quoteData = str14;
        }
        if ((2097152 & i) == 0) {
            this.mevUnstableShowLevel = null;
        } else {
            this.mevUnstableShowLevel = num3;
        }
        if ((4194304 & i) == 0) {
            this.quoteId = null;
        } else {
            this.quoteId = str15;
        }
        if ((8388608 & i) == 0) {
            this.expireTime = null;
        } else {
            this.expireTime = str16;
        }
        if ((16777216 & i) == 0) {
            this.showValueDiffWarn = false;
        } else {
            this.showValueDiffWarn = z;
        }
        if ((33554432 & i) == 0) {
            this.diffValue = "";
        } else {
            this.diffValue = str17;
        }
        if ((67108864 & i) == 0) {
            this.diffPercent = "";
        } else {
            this.diffPercent = str18;
        }
        if ((134217728 & i) == 0) {
            this.quoteDiffValThreshold = "";
        } else {
            this.quoteDiffValThreshold = str19;
        }
        if ((268435456 & i) == 0) {
            this.quoteDiffPercentThreshold = "";
        } else {
            this.quoteDiffPercentThreshold = str20;
        }
        if ((536870912 & i) == 0) {
            this.networkFeeOfNativeToken = "";
        } else {
            this.networkFeeOfNativeToken = str21;
        }
        if ((1073741824 & i) == 0) {
            this.needApprove = "";
        } else {
            this.needApprove = str22;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.isEnableMev = "";
        } else {
            this.isEnableMev = str23;
        }
        if ((i2 & 1) == 0) {
            this.estimatedTime = "";
        } else {
            this.estimatedTime = str24;
        }
        if ((i2 & 2) == 0) {
            this.isHasSaving = 0;
        } else {
            this.isHasSaving = i3;
        }
        if ((i2 & 4) == 0) {
            this.savingAmount = "";
        } else {
            this.savingAmount = str25;
        }
        if ((i2 & 8) == 0) {
            this.savingValueUSD = "";
        } else {
            this.savingValueUSD = str26;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(DeFiPlatformForSwap deFiPlatformForSwap, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || deFiPlatformForSwap.defiPlatformId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, deFiPlatformForSwap.defiPlatformId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || deFiPlatformForSwap.name != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, deFiPlatformForSwap.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || deFiPlatformForSwap.logo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, deFiPlatformForSwap.logo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || deFiPlatformForSwap.receiveAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, deFiPlatformForSwap.receiveAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || deFiPlatformForSwap.toTokenValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, deFiPlatformForSwap.toTokenValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || deFiPlatformForSwap.reducePercent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, deFiPlatformForSwap.reducePercent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || deFiPlatformForSwap.warnPercent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, deFiPlatformForSwap.warnPercent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || deFiPlatformForSwap.minimumReceived != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, deFiPlatformForSwap.minimumReceived);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || deFiPlatformForSwap.offlineType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.INSTANCE, deFiPlatformForSwap.offlineType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || deFiPlatformForSwap.structureType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, deFiPlatformForSwap.structureType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || deFiPlatformForSwap.router != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, deFiPlatformForSwap.router);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) deFiPlatformForSwap.toTokenPrice, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, deFiPlatformForSwap.toTokenPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || deFiPlatformForSwap.dexRouterList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr[12], deFiPlatformForSwap.dexRouterList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || deFiPlatformForSwap.slippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, deFiPlatformForSwap.slippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || deFiPlatformForSwap.quoteNetWorkFeeOfMoney != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, deFiPlatformForSwap.quoteNetWorkFeeOfMoney);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || deFiPlatformForSwap.estimateGasFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, deFiPlatformForSwap.estimateGasFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || deFiPlatformForSwap.calldata != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, OfflineQuote$$serializer.INSTANCE, deFiPlatformForSwap.calldata);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || deFiPlatformForSwap.autoSlippageInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, DexAutoSlippageInfoParam$$serializer.INSTANCE, deFiPlatformForSwap.autoSlippageInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || deFiPlatformForSwap.permit2Data != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, Permit2Data$$serializer.INSTANCE, deFiPlatformForSwap.permit2Data);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || deFiPlatformForSwap.serviceFeeInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, ServiceFeeInfo$$serializer.INSTANCE, deFiPlatformForSwap.serviceFeeInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || deFiPlatformForSwap.quoteData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, deFiPlatformForSwap.quoteData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || deFiPlatformForSwap.mevUnstableShowLevel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, IntSerializer.INSTANCE, deFiPlatformForSwap.mevUnstableShowLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || deFiPlatformForSwap.quoteId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, deFiPlatformForSwap.quoteId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || deFiPlatformForSwap.expireTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, deFiPlatformForSwap.expireTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || deFiPlatformForSwap.showValueDiffWarn) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 24, deFiPlatformForSwap.showValueDiffWarn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) deFiPlatformForSwap.diffValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, deFiPlatformForSwap.diffValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) deFiPlatformForSwap.diffPercent, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, deFiPlatformForSwap.diffPercent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) deFiPlatformForSwap.quoteDiffValThreshold, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, deFiPlatformForSwap.quoteDiffValThreshold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) deFiPlatformForSwap.quoteDiffPercentThreshold, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, deFiPlatformForSwap.quoteDiffPercentThreshold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) deFiPlatformForSwap.networkFeeOfNativeToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, deFiPlatformForSwap.networkFeeOfNativeToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) deFiPlatformForSwap.needApprove, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, deFiPlatformForSwap.needApprove);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) deFiPlatformForSwap.isEnableMev, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, deFiPlatformForSwap.isEnableMev);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) deFiPlatformForSwap.estimatedTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, deFiPlatformForSwap.estimatedTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || deFiPlatformForSwap.isHasSaving != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 33, deFiPlatformForSwap.isHasSaving);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) deFiPlatformForSwap.savingAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, deFiPlatformForSwap.savingAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) && Intrinsics.EZpvd((Object) deFiPlatformForSwap.savingValueUSD, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 35, deFiPlatformForSwap.savingValueUSD);
    }

    public DeFiPlatformForSwap(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, String str9, String str10, List<DexRouterList> list, String str11, String str12, String str13, OfflineQuote offlineQuote, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, Permit2Data permit2Data, ServiceFeeInfo serviceFeeInfo, String str14, Integer num3, String str15, String str16, boolean z, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, int i, @NotNull String str25, @NotNull String str26) {
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
        this.defiPlatformId = str;
        this.name = str2;
        this.logo = str3;
        this.receiveAmount = str4;
        this.toTokenValue = str5;
        this.reducePercent = str6;
        this.warnPercent = str7;
        this.minimumReceived = str8;
        this.offlineType = num;
        this.structureType = num2;
        this.router = str9;
        this.toTokenPrice = str10;
        this.dexRouterList = list;
        this.slippage = str11;
        this.quoteNetWorkFeeOfMoney = str12;
        this.estimateGasFee = str13;
        this.calldata = offlineQuote;
        this.autoSlippageInfo = dexAutoSlippageInfoParam;
        this.permit2Data = permit2Data;
        this.serviceFeeInfo = serviceFeeInfo;
        this.quoteData = str14;
        this.mevUnstableShowLevel = num3;
        this.quoteId = str15;
        this.expireTime = str16;
        this.showValueDiffWarn = z;
        this.diffValue = str17;
        this.diffPercent = str18;
        this.quoteDiffValThreshold = str19;
        this.quoteDiffPercentThreshold = str20;
        this.networkFeeOfNativeToken = str21;
        this.needApprove = str22;
        this.isEnableMev = str23;
        this.estimatedTime = str24;
        this.isHasSaving = i;
        this.savingAmount = str25;
        this.savingValueUSD = str26;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01a8: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r73v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r73v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r73v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r73v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r73v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r73v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r73v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r73v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0042: ARITH (r73v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r45v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x004a: ARITH (r73v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r46v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r73v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r73v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0064: ARITH (r73v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r49v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r73v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r73v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0081: ARITH (r73v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.OfflineQuote:?: TERNARY null = ((wrap:int:0x008c: ARITH (r73v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.OfflineQuote) : (r53v0 com.okinc.business.dexlogic.bean.OfflineQuote))
  (wrap:com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam:?: TERNARY null = ((wrap:int:0x0097: ARITH (r73v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam) : (r54v0 com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam))
  (wrap:com.okinc.business.dexlogic.bean.Permit2Data:?: TERNARY null = ((wrap:int:0x00a2: ARITH (r73v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.Permit2Data) : (r55v0 com.okinc.business.dexlogic.bean.Permit2Data))
  (wrap:com.okinc.business.dexlogic.bean.ServiceFeeInfo:?: TERNARY null = ((wrap:int:0x00ad: ARITH (r73v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.ServiceFeeInfo) : (r56v0 com.okinc.business.dexlogic.bean.ServiceFeeInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b8: ARITH (r73v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r57v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00c3: ARITH (r73v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r58v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ce: ARITH (r73v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d9: ARITH (r73v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r60v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00e4: ARITH (r73v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? false : (r61v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f1: ARITH (r73v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fc: ARITH (r73v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0107: ARITH (r73v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0112: ARITH (r73v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011d: ARITH (r73v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0128: ARITH (r73v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0133: ARITH (r73v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x013c: ARITH (r74v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0145: ARITH (r74v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r70v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x014c: ARITH (r74v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0155: ARITH (r74v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r72v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.util.List<com.okinc.business.dexlogic.bean.DexRouterList>, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.OfflineQuote, com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam, com.okinc.business.dexlogic.bean.Permit2Data, com.okinc.business.dexlogic.bean.ServiceFeeInfo, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String):void (m)] (LINE:1050) call: com.okinc.business.dexlogic.bean.DeFiPlatformForSwap.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.OfflineQuote, com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam, com.okinc.business.dexlogic.bean.Permit2Data, com.okinc.business.dexlogic.bean.ServiceFeeInfo, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DeFiPlatformForSwap(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, String str9, String str10, List list, String str11, String str12, String str13, OfflineQuote offlineQuote, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, Permit2Data permit2Data, ServiceFeeInfo serviceFeeInfo, String str14, Integer num3, String str15, String str16, boolean z, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, int i, String str25, String str26, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6, (i2 & 64) != 0 ? null : str7, (i2 & 128) != 0 ? null : str8, (i2 & 256) != 0 ? null : num, (i2 & 512) != 0 ? null : num2, (i2 & 1024) != 0 ? null : str9, (i2 & 2048) != 0 ? "" : str10, (i2 & 4096) != 0 ? null : list, (i2 & 8192) != 0 ? null : str11, (i2 & 16384) != 0 ? null : str12, (i2 & 32768) != 0 ? null : str13, (i2 & 65536) != 0 ? null : offlineQuote, (i2 & 131072) != 0 ? null : dexAutoSlippageInfoParam, (i2 & 262144) != 0 ? null : permit2Data, (i2 & 524288) != 0 ? null : serviceFeeInfo, (i2 & 1048576) != 0 ? null : str14, (i2 & 2097152) != 0 ? null : num3, (i2 & 4194304) != 0 ? null : str15, (i2 & 8388608) != 0 ? null : str16, (i2 & 16777216) != 0 ? false : z, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str17, (i2 & 67108864) != 0 ? "" : str18, (i2 & 134217728) != 0 ? "" : str19, (i2 & 268435456) != 0 ? "" : str20, (i2 & 536870912) != 0 ? "" : str21, (i2 & 1073741824) != 0 ? "" : str22, (i2 & Integer.MIN_VALUE) != 0 ? "" : str23, (i3 & 1) != 0 ? "" : str24, (i3 & 2) == 0 ? i : 0, (i3 & 4) != 0 ? "" : str25, (i3 & 8) != 0 ? "" : str26);
    }

    public final boolean isPMM() {
        Integer num = this.offlineType;
        return num != null && num.intValue() == 1;
    }
}
