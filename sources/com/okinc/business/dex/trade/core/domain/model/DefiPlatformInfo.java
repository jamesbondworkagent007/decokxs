package com.okinc.business.dex.trade.core.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.bean.MevUnstableShowLevelType;
import com.okinc.business.dexlogic.bean.OfflineQuote;
import com.okinc.business.dexlogic.bean.OfflineQuote$$serializer;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class DefiPlatformInfo implements Parcelable {
    private final AutoSlippageInfo autoSlippageInfo;
    private final OfflineQuote calldata;
    private final String defiPlatformId;
    private final List<DexRouter> dexRouterList;
    private final String diffPercent;
    private final String diffValue;
    private final String estimateGasFee;
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
    private final String toTokenValue;
    private final V6CalldataResponseData transactionData;
    private final String warnPercent;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DefiPlatformInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(DexRouter$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<DefiPlatformInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DefiPlatformInfo createFromParcel(Parcel parcel) {
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
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(DexRouter.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new DefiPlatformInfo(string, string2, string3, string4, string5, string6, string7, string8, numValueOf, numValueOf2, string9, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : OfflineQuote.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AutoSlippageInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Permit2Data.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ServiceFeeInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : V6CalldataResponseData.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DefiPlatformInfo[] newArray(int i) {
            return new DefiPlatformInfo[i];
        }
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
    public final List<DexRouter> component12() {
        return this.dexRouterList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.quoteNetWorkFeeOfMoney;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.estimateGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfflineQuote component16() {
        return this.calldata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AutoSlippageInfo component17() {
        return this.autoSlippageInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Permit2Data component18() {
        return this.permit2Data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo component19() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.quoteData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component21() {
        return this.mevUnstableShowLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component24() {
        return this.showValueDiffWarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.diffValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.diffPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.quoteDiffValThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.quoteDiffPercentThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.networkFeeOfNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.needApprove;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.isEnableMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V6CalldataResponseData component32() {
        return this.transactionData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component33() {
        return this.isHasSaving;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.savingAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
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
    public final DefiPlatformInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, String str9, List<DexRouter> list, String str10, String str11, String str12, OfflineQuote offlineQuote, AutoSlippageInfo autoSlippageInfo, Permit2Data permit2Data, ServiceFeeInfo serviceFeeInfo, String str13, Integer num3, String str14, String str15, boolean z, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, V6CalldataResponseData v6CalldataResponseData, int i, @NotNull String str23, @NotNull String str24) {
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        return new DefiPlatformInfo(str, str2, str3, str4, str5, str6, str7, str8, num, num2, str9, list, str10, str11, str12, offlineQuote, autoSlippageInfo, permit2Data, serviceFeeInfo, str13, num3, str14, str15, z, str16, str17, str18, str19, str20, str21, str22, v6CalldataResponseData, i, str23, str24);
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
        if (!(obj instanceof DefiPlatformInfo)) {
            return false;
        }
        DefiPlatformInfo defiPlatformInfo = (DefiPlatformInfo) obj;
        return Intrinsics.EZpvd((Object) this.defiPlatformId, (Object) defiPlatformInfo.defiPlatformId) && Intrinsics.EZpvd((Object) this.name, (Object) defiPlatformInfo.name) && Intrinsics.EZpvd((Object) this.logo, (Object) defiPlatformInfo.logo) && Intrinsics.EZpvd((Object) this.receiveAmount, (Object) defiPlatformInfo.receiveAmount) && Intrinsics.EZpvd((Object) this.toTokenValue, (Object) defiPlatformInfo.toTokenValue) && Intrinsics.EZpvd((Object) this.reducePercent, (Object) defiPlatformInfo.reducePercent) && Intrinsics.EZpvd((Object) this.warnPercent, (Object) defiPlatformInfo.warnPercent) && Intrinsics.EZpvd((Object) this.minimumReceived, (Object) defiPlatformInfo.minimumReceived) && Intrinsics.EZpvd(this.offlineType, defiPlatformInfo.offlineType) && Intrinsics.EZpvd(this.structureType, defiPlatformInfo.structureType) && Intrinsics.EZpvd((Object) this.router, (Object) defiPlatformInfo.router) && Intrinsics.EZpvd(this.dexRouterList, defiPlatformInfo.dexRouterList) && Intrinsics.EZpvd((Object) this.slippage, (Object) defiPlatformInfo.slippage) && Intrinsics.EZpvd((Object) this.quoteNetWorkFeeOfMoney, (Object) defiPlatformInfo.quoteNetWorkFeeOfMoney) && Intrinsics.EZpvd((Object) this.estimateGasFee, (Object) defiPlatformInfo.estimateGasFee) && Intrinsics.EZpvd(this.calldata, defiPlatformInfo.calldata) && Intrinsics.EZpvd(this.autoSlippageInfo, defiPlatformInfo.autoSlippageInfo) && Intrinsics.EZpvd(this.permit2Data, defiPlatformInfo.permit2Data) && Intrinsics.EZpvd(this.serviceFeeInfo, defiPlatformInfo.serviceFeeInfo) && Intrinsics.EZpvd((Object) this.quoteData, (Object) defiPlatformInfo.quoteData) && Intrinsics.EZpvd(this.mevUnstableShowLevel, defiPlatformInfo.mevUnstableShowLevel) && Intrinsics.EZpvd((Object) this.quoteId, (Object) defiPlatformInfo.quoteId) && Intrinsics.EZpvd((Object) this.expireTime, (Object) defiPlatformInfo.expireTime) && this.showValueDiffWarn == defiPlatformInfo.showValueDiffWarn && Intrinsics.EZpvd((Object) this.diffValue, (Object) defiPlatformInfo.diffValue) && Intrinsics.EZpvd((Object) this.diffPercent, (Object) defiPlatformInfo.diffPercent) && Intrinsics.EZpvd((Object) this.quoteDiffValThreshold, (Object) defiPlatformInfo.quoteDiffValThreshold) && Intrinsics.EZpvd((Object) this.quoteDiffPercentThreshold, (Object) defiPlatformInfo.quoteDiffPercentThreshold) && Intrinsics.EZpvd((Object) this.networkFeeOfNativeToken, (Object) defiPlatformInfo.networkFeeOfNativeToken) && Intrinsics.EZpvd((Object) this.needApprove, (Object) defiPlatformInfo.needApprove) && Intrinsics.EZpvd((Object) this.isEnableMev, (Object) defiPlatformInfo.isEnableMev) && Intrinsics.EZpvd(this.transactionData, defiPlatformInfo.transactionData) && this.isHasSaving == defiPlatformInfo.isHasSaving && Intrinsics.EZpvd((Object) this.savingAmount, (Object) defiPlatformInfo.savingAmount) && Intrinsics.EZpvd((Object) this.savingValueUSD, (Object) defiPlatformInfo.savingValueUSD);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AutoSlippageInfo getAutoSlippageInfo() {
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
    public final List<DexRouter> getDexRouterList() {
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
    public final String getToTokenValue() {
        return this.toTokenValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V6CalldataResponseData getTransactionData() {
        return this.transactionData;
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
        List<DexRouter> list = this.dexRouterList;
        int iHashCode12 = list == null ? 0 : list.hashCode();
        String str10 = this.slippage;
        int iHashCode13 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.quoteNetWorkFeeOfMoney;
        int iHashCode14 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.estimateGasFee;
        int iHashCode15 = str12 == null ? 0 : str12.hashCode();
        OfflineQuote offlineQuote = this.calldata;
        int iHashCode16 = offlineQuote == null ? 0 : offlineQuote.hashCode();
        AutoSlippageInfo autoSlippageInfo = this.autoSlippageInfo;
        int iHashCode17 = autoSlippageInfo == null ? 0 : autoSlippageInfo.hashCode();
        Permit2Data permit2Data = this.permit2Data;
        int iHashCode18 = permit2Data == null ? 0 : permit2Data.hashCode();
        ServiceFeeInfo serviceFeeInfo = this.serviceFeeInfo;
        int iHashCode19 = serviceFeeInfo == null ? 0 : serviceFeeInfo.hashCode();
        String str13 = this.quoteData;
        int iHashCode20 = str13 == null ? 0 : str13.hashCode();
        Integer num3 = this.mevUnstableShowLevel;
        int iHashCode21 = num3 == null ? 0 : num3.hashCode();
        String str14 = this.quoteId;
        int iHashCode22 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.expireTime;
        int iHashCode23 = str15 == null ? 0 : str15.hashCode();
        int iHashCode24 = Boolean.hashCode(this.showValueDiffWarn);
        int iHashCode25 = this.diffValue.hashCode();
        int iHashCode26 = this.diffPercent.hashCode();
        int iHashCode27 = this.quoteDiffValThreshold.hashCode();
        int iHashCode28 = this.quoteDiffPercentThreshold.hashCode();
        int iHashCode29 = this.networkFeeOfNativeToken.hashCode();
        int iHashCode30 = this.needApprove.hashCode();
        int iHashCode31 = this.isEnableMev.hashCode();
        V6CalldataResponseData v6CalldataResponseData = this.transactionData;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + (v6CalldataResponseData == null ? 0 : v6CalldataResponseData.hashCode())) * 31) + Integer.hashCode(this.isHasSaving)) * 31) + this.savingAmount.hashCode()) * 31) + this.savingValueUSD.hashCode();
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
        return "DefiPlatformInfo(defiPlatformId=" + this.defiPlatformId + ", name=" + this.name + ", logo=" + this.logo + ", receiveAmount=" + this.receiveAmount + ", toTokenValue=" + this.toTokenValue + ", reducePercent=" + this.reducePercent + ", warnPercent=" + this.warnPercent + ", minimumReceived=" + this.minimumReceived + ", offlineType=" + this.offlineType + ", structureType=" + this.structureType + ", router=" + this.router + ", dexRouterList=" + this.dexRouterList + ", slippage=" + this.slippage + ", quoteNetWorkFeeOfMoney=" + this.quoteNetWorkFeeOfMoney + ", estimateGasFee=" + this.estimateGasFee + ", calldata=" + this.calldata + ", autoSlippageInfo=" + this.autoSlippageInfo + ", permit2Data=" + this.permit2Data + ", serviceFeeInfo=" + this.serviceFeeInfo + ", quoteData=" + this.quoteData + ", mevUnstableShowLevel=" + this.mevUnstableShowLevel + ", quoteId=" + this.quoteId + ", expireTime=" + this.expireTime + ", showValueDiffWarn=" + this.showValueDiffWarn + ", diffValue=" + this.diffValue + ", diffPercent=" + this.diffPercent + ", quoteDiffValThreshold=" + this.quoteDiffValThreshold + ", quoteDiffPercentThreshold=" + this.quoteDiffPercentThreshold + ", networkFeeOfNativeToken=" + this.networkFeeOfNativeToken + ", needApprove=" + this.needApprove + ", isEnableMev=" + this.isEnableMev + ", transactionData=" + this.transactionData + ", isHasSaving=" + this.isHasSaving + ", savingAmount=" + this.savingAmount + ", savingValueUSD=" + this.savingValueUSD + ")";
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
        List<DexRouter> list = this.dexRouterList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<DexRouter> it = list.iterator();
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
        AutoSlippageInfo autoSlippageInfo = this.autoSlippageInfo;
        if (autoSlippageInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autoSlippageInfo.writeToParcel(parcel, i);
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
        V6CalldataResponseData v6CalldataResponseData = this.transactionData;
        if (v6CalldataResponseData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            v6CalldataResponseData.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isHasSaving);
        parcel.writeString(this.savingAmount);
        parcel.writeString(this.savingValueUSD);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DefiPlatformInfo> serializer() {
            return DefiPlatformInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DefiPlatformInfo(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, String str9, List list, String str10, String str11, String str12, OfflineQuote offlineQuote, AutoSlippageInfo autoSlippageInfo, Permit2Data permit2Data, ServiceFeeInfo serviceFeeInfo, String str13, Integer num3, String str14, String str15, boolean z, String str16, String str17, String str18, String str19, String str20, String str21, String str22, V6CalldataResponseData v6CalldataResponseData, int i3, String str23, String str24, SerializationConstructorMarker serializationConstructorMarker) {
        if (2139095040 != (i & 2139095040)) {
            PluginExceptionsKt.throwArrayMissingFieldException(new int[]{i, i2}, new int[]{2139095040, 0}, DefiPlatformInfo$$serializer.INSTANCE.getDescriptor());
        }
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
            this.dexRouterList = null;
        } else {
            this.dexRouterList = list;
        }
        if ((i & 4096) == 0) {
            this.slippage = null;
        } else {
            this.slippage = str10;
        }
        if ((i & 8192) == 0) {
            this.quoteNetWorkFeeOfMoney = null;
        } else {
            this.quoteNetWorkFeeOfMoney = str11;
        }
        if ((i & 16384) == 0) {
            this.estimateGasFee = null;
        } else {
            this.estimateGasFee = str12;
        }
        if ((32768 & i) == 0) {
            this.calldata = null;
        } else {
            this.calldata = offlineQuote;
        }
        if ((65536 & i) == 0) {
            this.autoSlippageInfo = null;
        } else {
            this.autoSlippageInfo = autoSlippageInfo;
        }
        if ((131072 & i) == 0) {
            this.permit2Data = null;
        } else {
            this.permit2Data = permit2Data;
        }
        if ((262144 & i) == 0) {
            this.serviceFeeInfo = null;
        } else {
            this.serviceFeeInfo = serviceFeeInfo;
        }
        if ((524288 & i) == 0) {
            this.quoteData = null;
        } else {
            this.quoteData = str13;
        }
        if ((1048576 & i) == 0) {
            this.mevUnstableShowLevel = null;
        } else {
            this.mevUnstableShowLevel = num3;
        }
        if ((2097152 & i) == 0) {
            this.quoteId = null;
        } else {
            this.quoteId = str14;
        }
        if ((4194304 & i) == 0) {
            this.expireTime = null;
        } else {
            this.expireTime = str15;
        }
        this.showValueDiffWarn = z;
        this.diffValue = str16;
        this.diffPercent = str17;
        this.quoteDiffValThreshold = str18;
        this.quoteDiffPercentThreshold = str19;
        this.networkFeeOfNativeToken = str20;
        this.needApprove = str21;
        this.isEnableMev = str22;
        if ((i & Integer.MIN_VALUE) == 0) {
            this.transactionData = null;
        } else {
            this.transactionData = v6CalldataResponseData;
        }
        if ((i2 & 1) == 0) {
            this.isHasSaving = 0;
        } else {
            this.isHasSaving = i3;
        }
        if ((i2 & 2) == 0) {
            this.savingAmount = "";
        } else {
            this.savingAmount = str23;
        }
        if ((i2 & 4) == 0) {
            this.savingValueUSD = "";
        } else {
            this.savingValueUSD = str24;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(DefiPlatformInfo defiPlatformInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || defiPlatformInfo.defiPlatformId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, defiPlatformInfo.defiPlatformId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || defiPlatformInfo.name != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, defiPlatformInfo.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || defiPlatformInfo.logo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, defiPlatformInfo.logo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || defiPlatformInfo.receiveAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, defiPlatformInfo.receiveAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || defiPlatformInfo.toTokenValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, defiPlatformInfo.toTokenValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || defiPlatformInfo.reducePercent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, defiPlatformInfo.reducePercent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || defiPlatformInfo.warnPercent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, defiPlatformInfo.warnPercent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || defiPlatformInfo.minimumReceived != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, defiPlatformInfo.minimumReceived);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || defiPlatformInfo.offlineType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.INSTANCE, defiPlatformInfo.offlineType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || defiPlatformInfo.structureType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, defiPlatformInfo.structureType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || defiPlatformInfo.router != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, defiPlatformInfo.router);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || defiPlatformInfo.dexRouterList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], defiPlatformInfo.dexRouterList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || defiPlatformInfo.slippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, defiPlatformInfo.slippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || defiPlatformInfo.quoteNetWorkFeeOfMoney != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, defiPlatformInfo.quoteNetWorkFeeOfMoney);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || defiPlatformInfo.estimateGasFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, defiPlatformInfo.estimateGasFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || defiPlatformInfo.calldata != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, OfflineQuote$$serializer.INSTANCE, defiPlatformInfo.calldata);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || defiPlatformInfo.autoSlippageInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, AutoSlippageInfo$$serializer.INSTANCE, defiPlatformInfo.autoSlippageInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || defiPlatformInfo.permit2Data != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, Permit2Data$$serializer.INSTANCE, defiPlatformInfo.permit2Data);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || defiPlatformInfo.serviceFeeInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, ServiceFeeInfo$$serializer.INSTANCE, defiPlatformInfo.serviceFeeInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || defiPlatformInfo.quoteData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, defiPlatformInfo.quoteData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || defiPlatformInfo.mevUnstableShowLevel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, IntSerializer.INSTANCE, defiPlatformInfo.mevUnstableShowLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || defiPlatformInfo.quoteId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, defiPlatformInfo.quoteId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || defiPlatformInfo.expireTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, defiPlatformInfo.expireTime);
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 23, defiPlatformInfo.showValueDiffWarn);
        compositeEncoder.encodeStringElement(serialDescriptor, 24, defiPlatformInfo.diffValue);
        compositeEncoder.encodeStringElement(serialDescriptor, 25, defiPlatformInfo.diffPercent);
        compositeEncoder.encodeStringElement(serialDescriptor, 26, defiPlatformInfo.quoteDiffValThreshold);
        compositeEncoder.encodeStringElement(serialDescriptor, 27, defiPlatformInfo.quoteDiffPercentThreshold);
        compositeEncoder.encodeStringElement(serialDescriptor, 28, defiPlatformInfo.networkFeeOfNativeToken);
        compositeEncoder.encodeStringElement(serialDescriptor, 29, defiPlatformInfo.needApprove);
        compositeEncoder.encodeStringElement(serialDescriptor, 30, defiPlatformInfo.isEnableMev);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || defiPlatformInfo.transactionData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, V6CalldataResponseData$$serializer.INSTANCE, defiPlatformInfo.transactionData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || defiPlatformInfo.isHasSaving != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 32, defiPlatformInfo.isHasSaving);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) defiPlatformInfo.savingAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, defiPlatformInfo.savingAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) && Intrinsics.EZpvd((Object) defiPlatformInfo.savingValueUSD, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 34, defiPlatformInfo.savingValueUSD);
    }

    public DefiPlatformInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, String str9, List<DexRouter> list, String str10, String str11, String str12, OfflineQuote offlineQuote, AutoSlippageInfo autoSlippageInfo, Permit2Data permit2Data, ServiceFeeInfo serviceFeeInfo, String str13, Integer num3, String str14, String str15, boolean z, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, V6CalldataResponseData v6CalldataResponseData, int i, @NotNull String str23, @NotNull String str24) {
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
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
        this.dexRouterList = list;
        this.slippage = str10;
        this.quoteNetWorkFeeOfMoney = str11;
        this.estimateGasFee = str12;
        this.calldata = offlineQuote;
        this.autoSlippageInfo = autoSlippageInfo;
        this.permit2Data = permit2Data;
        this.serviceFeeInfo = serviceFeeInfo;
        this.quoteData = str13;
        this.mevUnstableShowLevel = num3;
        this.quoteId = str14;
        this.expireTime = str15;
        this.showValueDiffWarn = z;
        this.diffValue = str16;
        this.diffPercent = str17;
        this.quoteDiffValThreshold = str18;
        this.quoteDiffPercentThreshold = str19;
        this.networkFeeOfNativeToken = str20;
        this.needApprove = str21;
        this.isEnableMev = str22;
        this.transactionData = v6CalldataResponseData;
        this.isHasSaving = i;
        this.savingAmount = str23;
        this.savingValueUSD = str24;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0109: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r75v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r75v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r75v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r75v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r75v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r75v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r75v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r75v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0043: ARITH (r75v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r48v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x004b: ARITH (r75v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r49v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r75v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x005b: ARITH (r75v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r51v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r75v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r75v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0075: ARITH (r75v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r54v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.OfflineQuote:?: TERNARY null = ((wrap:int:0x0081: ARITH (32768 int) & (r75v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.OfflineQuote) : (r55v0 com.okinc.business.dexlogic.bean.OfflineQuote))
  (wrap:com.okinc.business.dex.trade.core.domain.model.AutoSlippageInfo:?: TERNARY null = ((wrap:int:0x008b: ARITH (65536 int) & (r75v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.AutoSlippageInfo) : (r56v0 com.okinc.business.dex.trade.core.domain.model.AutoSlippageInfo))
  (wrap:com.okinc.business.dex.trade.core.domain.model.Permit2Data:?: TERNARY null = ((wrap:int:0x0095: ARITH (131072 int) & (r75v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.Permit2Data) : (r57v0 com.okinc.business.dex.trade.core.domain.model.Permit2Data))
  (wrap:com.okinc.business.dex.trade.core.domain.model.ServiceFeeInfo:?: TERNARY null = ((wrap:int:0x009f: ARITH (262144 int) & (r75v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.ServiceFeeInfo) : (r58v0 com.okinc.business.dex.trade.core.domain.model.ServiceFeeInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a9: ARITH (524288 int) & (r75v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r59v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00b3: ARITH (1048576 int) & (r75v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r60v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bd: ARITH (2097152 int) & (r75v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c7: ARITH (4194304 int) & (r75v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r62v0 java.lang.String))
  (r63v0 boolean)
  (r64v0 java.lang.String)
  (r65v0 java.lang.String)
  (r66v0 java.lang.String)
  (r67v0 java.lang.String)
  (r68v0 java.lang.String)
  (r69v0 java.lang.String)
  (r70v0 java.lang.String)
  (wrap:com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData:?: TERNARY null = ((wrap:int:0x00d1: ARITH (r75v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData) : (r71v0 com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00d9: ARITH (r76v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r72v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e3: ARITH (r76v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r73v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ee: ARITH (r76v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r74v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.util.List<com.okinc.business.dex.trade.core.domain.model.DexRouter>, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.OfflineQuote, com.okinc.business.dex.trade.core.domain.model.AutoSlippageInfo, com.okinc.business.dex.trade.core.domain.model.Permit2Data, com.okinc.business.dex.trade.core.domain.model.ServiceFeeInfo, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData, int, java.lang.String, java.lang.String):void (m)] (LINE:159) call: com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.OfflineQuote, com.okinc.business.dex.trade.core.domain.model.AutoSlippageInfo, com.okinc.business.dex.trade.core.domain.model.Permit2Data, com.okinc.business.dex.trade.core.domain.model.ServiceFeeInfo, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DefiPlatformInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, String str9, List list, String str10, String str11, String str12, OfflineQuote offlineQuote, AutoSlippageInfo autoSlippageInfo, Permit2Data permit2Data, ServiceFeeInfo serviceFeeInfo, String str13, Integer num3, String str14, String str15, boolean z, String str16, String str17, String str18, String str19, String str20, String str21, String str22, V6CalldataResponseData v6CalldataResponseData, int i, String str23, String str24, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6, (i2 & 64) != 0 ? null : str7, (i2 & 128) != 0 ? null : str8, (i2 & 256) != 0 ? null : num, (i2 & 512) != 0 ? null : num2, (i2 & 1024) != 0 ? null : str9, (i2 & 2048) != 0 ? null : list, (i2 & 4096) != 0 ? null : str10, (i2 & 8192) != 0 ? null : str11, (i2 & 16384) != 0 ? null : str12, (32768 & i2) != 0 ? null : offlineQuote, (65536 & i2) != 0 ? null : autoSlippageInfo, (131072 & i2) != 0 ? null : permit2Data, (262144 & i2) != 0 ? null : serviceFeeInfo, (524288 & i2) != 0 ? null : str13, (1048576 & i2) != 0 ? null : num3, (2097152 & i2) != 0 ? null : str14, (4194304 & i2) != 0 ? null : str15, z, str16, str17, str18, str19, str20, str21, str22, (i2 & Integer.MIN_VALUE) != 0 ? null : v6CalldataResponseData, (i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str23, (i3 & 4) != 0 ? "" : str24);
    }

    public final boolean isPMM() {
        Integer num = this.offlineType;
        return num != null && num.intValue() == 1;
    }

    public final boolean isMevUnstableError() {
        return Intrinsics.EZpvd((Object) C33129mqd.gEmmrt(this.mevUnstableShowLevel), (Object) MevUnstableShowLevelType.ERROR.getType());
    }

    public final boolean isMevUnstableWarning() {
        return Intrinsics.EZpvd((Object) C33129mqd.gEmmrt(this.mevUnstableShowLevel), (Object) MevUnstableShowLevelType.WARNING.getType());
    }
}
