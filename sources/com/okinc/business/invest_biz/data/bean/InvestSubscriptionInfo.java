package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.invest_biz.data.contants.BTCMode;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount$$serializer;
import com.okinc.business.invest_biz.data.models.InvestType;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.AbstractC25473ixQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestSubscriptionInfo extends AbstractC25473ixQ implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    public static final int MODE_STX_TEMPLATE = 1;
    private final Long analysisPlatformId;
    private final BTCMode btcMode;
    private final long chainId;
    private final CollateralRatioInfo collateralRatioInfo;
    private final String currentPrice;
    private final Integer currentTick;
    private final String feeRate;
    private final List<InvestTokenWithAmount> gainsTokenList;
    private final Integer inputPrecision;
    private final InvestType investType;
    private final List<InvestTokenWithAmount> investWithTokenList;
    private final long investmentId;
    private final String investmentName;
    private final boolean isLp;
    private final boolean isSingleValidator;
    private final boolean isSupportLock;
    private final boolean isSupportSwap;
    private final String lockRedeemTip;
    private final String lowerPrice;
    private final Integer mode;
    private final String network;
    private final String networkLogo;
    private final String platformLogo;
    private final String platformName;
    private final PointsInfo pointsInfo;
    private final PromptInformation promptInformation;
    private final List<InvestUniv3RangeInfo> rangeInfo;
    private final String rateDesc;
    private final InvestTokenWithAmount receiveTokenInfo;
    private final String reserveFee;
    private final boolean showEstDailyYield;
    private final long sourceInvestmentId;
    private final TransactionMethod subscriptionMethod;
    private final boolean supportAdapter;
    private final List<InvestTokenWithAmount> swapToTokenList;
    private final Integer tickSpacing;
    private final String tvl;
    private final List<InvestUnderlyingToken> underlyingTokenList;
    private final String upperPrice;
    private final String validatorName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestSubscriptionInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestSubscriptionInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestSubscriptionInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            int i = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList3.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
            }
            InvestType investTypeValueOf = InvestType.valueOf(parcel.readString());
            int i3 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList4.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
            }
            long j2 = parcel.readLong();
            String string = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            boolean z = parcel.readInt() != 0;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            InvestTokenWithAmount investTokenWithAmountCreateFromParcel = parcel.readInt() == 0 ? null : InvestTokenWithAmount.CREATOR.createFromParcel(parcel);
            String string6 = parcel.readString();
            long j3 = parcel.readLong();
            boolean z2 = parcel.readInt() != 0;
            int i5 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList5.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
            }
            TransactionMethod transactionMethodValueOf = TransactionMethod.valueOf(parcel.readString());
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            String string7 = parcel.readString();
            PromptInformation promptInformationCreateFromParcel = parcel.readInt() == 0 ? null : PromptInformation.CREATOR.createFromParcel(parcel);
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z5 = parcel.readInt() != 0;
            String string8 = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i7 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i7);
                int i8 = 0;
                while (i8 != i7) {
                    arrayList6.add(InvestUniv3RangeInfo.CREATOR.createFromParcel(parcel));
                    i8++;
                    i7 = i7;
                }
                arrayList = arrayList6;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i9 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i9);
                int i10 = 0;
                while (i10 != i9) {
                    arrayList7.add(InvestUnderlyingToken.CREATOR.createFromParcel(parcel));
                    i10++;
                    i9 = i9;
                }
                arrayList2 = arrayList7;
            }
            return new InvestSubscriptionInfo(j, arrayList3, investTypeValueOf, arrayList4, j2, string, lValueOf, z, string2, string3, string4, string5, investTokenWithAmountCreateFromParcel, string6, j3, z2, arrayList5, transactionMethodValueOf, z3, z4, string7, promptInformationCreateFromParcel, numValueOf, z5, string8, numValueOf2, arrayList, arrayList2, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : CollateralRatioInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BTCMode.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : PointsInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestSubscriptionInfo[] newArray(int i) {
            return new InvestSubscriptionInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestSubscriptionInfo() {
        this(0L, (List) null, (InvestType) null, (List) null, 0L, (String) null, (Long) null, false, (String) null, (String) null, (String) null, (String) null, (InvestTokenWithAmount) null, (String) null, 0L, false, (List) null, (TransactionMethod) null, false, false, (String) null, (PromptInformation) null, (Integer) null, false, (String) null, (Integer) null, (List) null, (List) null, (Integer) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (CollateralRatioInfo) null, (BTCMode) null, false, (PointsInfo) null, (String) null, (String) null, -1, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.networkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.platformLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount component13() {
        return this.receiveTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.reserveFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component15() {
        return this.sourceInvestmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component16() {
        return this.supportAdapter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component17() {
        return this.swapToTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionMethod component18() {
        return this.subscriptionMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component19() {
        return this.isLp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component2() {
        return this.gainsTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component20() {
        return this.isSupportLock;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.lockRedeemTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PromptInformation component22() {
        return this.promptInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component23() {
        return this.inputPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component24() {
        return this.isSingleValidator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.validatorName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component26() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUniv3RangeInfo> component27() {
        return this.rangeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUnderlyingToken> component28() {
        return this.underlyingTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component29() {
        return this.currentTick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestType component3() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.lowerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.upperPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component33() {
        return this.tickSpacing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CollateralRatioInfo component35() {
        return this.collateralRatioInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BTCMode component36() {
        return this.btcMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component37() {
        return this.showEstDailyYield;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PointsInfo component38() {
        return this.pointsInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.rateDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component4() {
        return this.investWithTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component40() {
        return this.tvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.investmentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component7() {
        return this.analysisPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.isSupportSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestSubscriptionInfo copy(long j, @NotNull List<InvestTokenWithAmount> list, @NotNull InvestType investType, @NotNull List<InvestTokenWithAmount> list2, long j2, @NotNull String str, Long l, boolean z, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, InvestTokenWithAmount investTokenWithAmount, @NotNull String str6, long j3, boolean z2, @NotNull List<InvestTokenWithAmount> list3, @NotNull TransactionMethod transactionMethod, boolean z3, boolean z4, @NotNull String str7, PromptInformation promptInformation, Integer num, boolean z5, @NotNull String str8, Integer num2, List<InvestUniv3RangeInfo> list4, List<InvestUnderlyingToken> list5, Integer num3, String str9, String str10, String str11, Integer num4, String str12, CollateralRatioInfo collateralRatioInfo, BTCMode bTCMode, boolean z6, PointsInfo pointsInfo, String str13, @NotNull String str14) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(investType, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(transactionMethod, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str14, "");
        return new InvestSubscriptionInfo(j, list, investType, list2, j2, str, l, z, str2, str3, str4, str5, investTokenWithAmount, str6, j3, z2, list3, transactionMethod, z3, z4, str7, promptInformation, num, z5, str8, num2, list4, list5, num3, str9, str10, str11, num4, str12, collateralRatioInfo, bTCMode, z6, pointsInfo, str13, str14);
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
        if (!(obj instanceof InvestSubscriptionInfo)) {
            return false;
        }
        InvestSubscriptionInfo investSubscriptionInfo = (InvestSubscriptionInfo) obj;
        return this.chainId == investSubscriptionInfo.chainId && Intrinsics.EZpvd(this.gainsTokenList, investSubscriptionInfo.gainsTokenList) && this.investType == investSubscriptionInfo.investType && Intrinsics.EZpvd(this.investWithTokenList, investSubscriptionInfo.investWithTokenList) && this.investmentId == investSubscriptionInfo.investmentId && Intrinsics.EZpvd((Object) this.investmentName, (Object) investSubscriptionInfo.investmentName) && Intrinsics.EZpvd(this.analysisPlatformId, investSubscriptionInfo.analysisPlatformId) && this.isSupportSwap == investSubscriptionInfo.isSupportSwap && Intrinsics.EZpvd((Object) this.network, (Object) investSubscriptionInfo.network) && Intrinsics.EZpvd((Object) this.networkLogo, (Object) investSubscriptionInfo.networkLogo) && Intrinsics.EZpvd((Object) this.platformLogo, (Object) investSubscriptionInfo.platformLogo) && Intrinsics.EZpvd((Object) this.platformName, (Object) investSubscriptionInfo.platformName) && Intrinsics.EZpvd(this.receiveTokenInfo, investSubscriptionInfo.receiveTokenInfo) && Intrinsics.EZpvd((Object) this.reserveFee, (Object) investSubscriptionInfo.reserveFee) && this.sourceInvestmentId == investSubscriptionInfo.sourceInvestmentId && this.supportAdapter == investSubscriptionInfo.supportAdapter && Intrinsics.EZpvd(this.swapToTokenList, investSubscriptionInfo.swapToTokenList) && this.subscriptionMethod == investSubscriptionInfo.subscriptionMethod && this.isLp == investSubscriptionInfo.isLp && this.isSupportLock == investSubscriptionInfo.isSupportLock && Intrinsics.EZpvd((Object) this.lockRedeemTip, (Object) investSubscriptionInfo.lockRedeemTip) && Intrinsics.EZpvd(this.promptInformation, investSubscriptionInfo.promptInformation) && Intrinsics.EZpvd(this.inputPrecision, investSubscriptionInfo.inputPrecision) && this.isSingleValidator == investSubscriptionInfo.isSingleValidator && Intrinsics.EZpvd((Object) this.validatorName, (Object) investSubscriptionInfo.validatorName) && Intrinsics.EZpvd(this.mode, investSubscriptionInfo.mode) && Intrinsics.EZpvd(this.rangeInfo, investSubscriptionInfo.rangeInfo) && Intrinsics.EZpvd(this.underlyingTokenList, investSubscriptionInfo.underlyingTokenList) && Intrinsics.EZpvd(this.currentTick, investSubscriptionInfo.currentTick) && Intrinsics.EZpvd((Object) this.currentPrice, (Object) investSubscriptionInfo.currentPrice) && Intrinsics.EZpvd((Object) this.lowerPrice, (Object) investSubscriptionInfo.lowerPrice) && Intrinsics.EZpvd((Object) this.upperPrice, (Object) investSubscriptionInfo.upperPrice) && Intrinsics.EZpvd(this.tickSpacing, investSubscriptionInfo.tickSpacing) && Intrinsics.EZpvd((Object) this.feeRate, (Object) investSubscriptionInfo.feeRate) && Intrinsics.EZpvd(this.collateralRatioInfo, investSubscriptionInfo.collateralRatioInfo) && this.btcMode == investSubscriptionInfo.btcMode && this.showEstDailyYield == investSubscriptionInfo.showEstDailyYield && Intrinsics.EZpvd(this.pointsInfo, investSubscriptionInfo.pointsInfo) && Intrinsics.EZpvd((Object) this.rateDesc, (Object) investSubscriptionInfo.rateDesc) && Intrinsics.EZpvd((Object) this.tvl, (Object) investSubscriptionInfo.tvl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getAnalysisPlatformId() {
        return this.analysisPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BTCMode getBtcMode() {
        return this.btcMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CollateralRatioInfo getCollateralRatioInfo() {
        return this.collateralRatioInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentPrice() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrentTick() {
        return this.currentTick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeRate() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> getGainsTokenList() {
        return this.gainsTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getInputPrecision() {
        return this.inputPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestType getInvestType() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> getInvestWithTokenList() {
        return this.investWithTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getInvestmentId() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestmentName() {
        return this.investmentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLockRedeemTip() {
        return this.lockRedeemTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLowerPrice() {
        return this.lowerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMode() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkLogo() {
        return this.networkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformLogo() {
        return this.platformLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformName() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PointsInfo getPointsInfo() {
        return this.pointsInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PromptInformation getPromptInformation() {
        return this.promptInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUniv3RangeInfo> getRangeInfo() {
        return this.rangeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRateDesc() {
        return this.rateDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount getReceiveTokenInfo() {
        return this.receiveTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReserveFee() {
        return this.reserveFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowEstDailyYield() {
        return this.showEstDailyYield;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getSourceInvestmentId() {
        return this.sourceInvestmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionMethod getSubscriptionMethod() {
        return this.subscriptionMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportAdapter() {
        return this.supportAdapter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> getSwapToTokenList() {
        return this.swapToTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTickSpacing() {
        return this.tickSpacing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTvl() {
        return this.tvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUnderlyingToken> getUnderlyingTokenList() {
        return this.underlyingTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpperPrice() {
        return this.upperPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValidatorName() {
        return this.validatorName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.chainId);
        int iHashCode2 = this.gainsTokenList.hashCode();
        int iHashCode3 = this.investType.hashCode();
        int iHashCode4 = this.investWithTokenList.hashCode();
        int iHashCode5 = Long.hashCode(this.investmentId);
        int iHashCode6 = this.investmentName.hashCode();
        Long l = this.analysisPlatformId;
        int iHashCode7 = l == null ? 0 : l.hashCode();
        int iHashCode8 = Boolean.hashCode(this.isSupportSwap);
        int iHashCode9 = this.network.hashCode();
        int iHashCode10 = this.networkLogo.hashCode();
        int iHashCode11 = this.platformLogo.hashCode();
        int iHashCode12 = this.platformName.hashCode();
        InvestTokenWithAmount investTokenWithAmount = this.receiveTokenInfo;
        int iHashCode13 = investTokenWithAmount == null ? 0 : investTokenWithAmount.hashCode();
        int iHashCode14 = this.reserveFee.hashCode();
        int iHashCode15 = Long.hashCode(this.sourceInvestmentId);
        int iHashCode16 = Boolean.hashCode(this.supportAdapter);
        int iHashCode17 = this.swapToTokenList.hashCode();
        int iHashCode18 = this.subscriptionMethod.hashCode();
        int iHashCode19 = Boolean.hashCode(this.isLp);
        int iHashCode20 = Boolean.hashCode(this.isSupportLock);
        int iHashCode21 = this.lockRedeemTip.hashCode();
        PromptInformation promptInformation = this.promptInformation;
        int iHashCode22 = promptInformation == null ? 0 : promptInformation.hashCode();
        Integer num = this.inputPrecision;
        int iHashCode23 = num == null ? 0 : num.hashCode();
        int iHashCode24 = Boolean.hashCode(this.isSingleValidator);
        int iHashCode25 = this.validatorName.hashCode();
        Integer num2 = this.mode;
        int iHashCode26 = num2 == null ? 0 : num2.hashCode();
        List<InvestUniv3RangeInfo> list = this.rangeInfo;
        int iHashCode27 = list == null ? 0 : list.hashCode();
        List<InvestUnderlyingToken> list2 = this.underlyingTokenList;
        int iHashCode28 = list2 == null ? 0 : list2.hashCode();
        Integer num3 = this.currentTick;
        int iHashCode29 = num3 == null ? 0 : num3.hashCode();
        String str = this.currentPrice;
        int iHashCode30 = str == null ? 0 : str.hashCode();
        String str2 = this.lowerPrice;
        int iHashCode31 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.upperPrice;
        int iHashCode32 = str3 == null ? 0 : str3.hashCode();
        Integer num4 = this.tickSpacing;
        int iHashCode33 = num4 == null ? 0 : num4.hashCode();
        String str4 = this.feeRate;
        int iHashCode34 = str4 == null ? 0 : str4.hashCode();
        CollateralRatioInfo collateralRatioInfo = this.collateralRatioInfo;
        int iHashCode35 = collateralRatioInfo == null ? 0 : collateralRatioInfo.hashCode();
        BTCMode bTCMode = this.btcMode;
        int iHashCode36 = bTCMode == null ? 0 : bTCMode.hashCode();
        int iHashCode37 = Boolean.hashCode(this.showEstDailyYield);
        PointsInfo pointsInfo = this.pointsInfo;
        int iHashCode38 = pointsInfo == null ? 0 : pointsInfo.hashCode();
        String str5 = this.rateDesc;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + (str5 == null ? 0 : str5.hashCode())) * 31) + this.tvl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isLp() {
        return this.isLp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSingleValidator() {
        return this.isSingleValidator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSupportLock() {
        return this.isSupportLock;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSupportSwap() {
        return this.isSupportSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestSubscriptionInfo(chainId=" + this.chainId + ", gainsTokenList=" + this.gainsTokenList + ", investType=" + this.investType + ", investWithTokenList=" + this.investWithTokenList + ", investmentId=" + this.investmentId + ", investmentName=" + this.investmentName + ", analysisPlatformId=" + this.analysisPlatformId + ", isSupportSwap=" + this.isSupportSwap + ", network=" + this.network + ", networkLogo=" + this.networkLogo + ", platformLogo=" + this.platformLogo + ", platformName=" + this.platformName + ", receiveTokenInfo=" + this.receiveTokenInfo + ", reserveFee=" + this.reserveFee + ", sourceInvestmentId=" + this.sourceInvestmentId + ", supportAdapter=" + this.supportAdapter + ", swapToTokenList=" + this.swapToTokenList + ", subscriptionMethod=" + this.subscriptionMethod + ", isLp=" + this.isLp + ", isSupportLock=" + this.isSupportLock + ", lockRedeemTip=" + this.lockRedeemTip + ", promptInformation=" + this.promptInformation + ", inputPrecision=" + this.inputPrecision + ", isSingleValidator=" + this.isSingleValidator + ", validatorName=" + this.validatorName + ", mode=" + this.mode + ", rangeInfo=" + this.rangeInfo + ", underlyingTokenList=" + this.underlyingTokenList + ", currentTick=" + this.currentTick + ", currentPrice=" + this.currentPrice + ", lowerPrice=" + this.lowerPrice + ", upperPrice=" + this.upperPrice + ", tickSpacing=" + this.tickSpacing + ", feeRate=" + this.feeRate + ", collateralRatioInfo=" + this.collateralRatioInfo + ", btcMode=" + this.btcMode + ", showEstDailyYield=" + this.showEstDailyYield + ", pointsInfo=" + this.pointsInfo + ", rateDesc=" + this.rateDesc + ", tvl=" + this.tvl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.chainId);
        List<InvestTokenWithAmount> list = this.gainsTokenList;
        parcel.writeInt(list.size());
        Iterator<InvestTokenWithAmount> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.investType.name());
        List<InvestTokenWithAmount> list2 = this.investWithTokenList;
        parcel.writeInt(list2.size());
        Iterator<InvestTokenWithAmount> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeLong(this.investmentId);
        parcel.writeString(this.investmentName);
        Long l = this.analysisPlatformId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.isSupportSwap ? 1 : 0);
        parcel.writeString(this.network);
        parcel.writeString(this.networkLogo);
        parcel.writeString(this.platformLogo);
        parcel.writeString(this.platformName);
        InvestTokenWithAmount investTokenWithAmount = this.receiveTokenInfo;
        if (investTokenWithAmount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTokenWithAmount.writeToParcel(parcel, i);
        }
        parcel.writeString(this.reserveFee);
        parcel.writeLong(this.sourceInvestmentId);
        parcel.writeInt(this.supportAdapter ? 1 : 0);
        List<InvestTokenWithAmount> list3 = this.swapToTokenList;
        parcel.writeInt(list3.size());
        Iterator<InvestTokenWithAmount> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.subscriptionMethod.name());
        parcel.writeInt(this.isLp ? 1 : 0);
        parcel.writeInt(this.isSupportLock ? 1 : 0);
        parcel.writeString(this.lockRedeemTip);
        PromptInformation promptInformation = this.promptInformation;
        if (promptInformation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promptInformation.writeToParcel(parcel, i);
        }
        Integer num = this.inputPrecision;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.isSingleValidator ? 1 : 0);
        parcel.writeString(this.validatorName);
        Integer num2 = this.mode;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        List<InvestUniv3RangeInfo> list4 = this.rangeInfo;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            Iterator<InvestUniv3RangeInfo> it4 = list4.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, i);
            }
        }
        List<InvestUnderlyingToken> list5 = this.underlyingTokenList;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list5.size());
            Iterator<InvestUnderlyingToken> it5 = list5.iterator();
            while (it5.hasNext()) {
                it5.next().writeToParcel(parcel, i);
            }
        }
        Integer num3 = this.currentTick;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.currentPrice);
        parcel.writeString(this.lowerPrice);
        parcel.writeString(this.upperPrice);
        Integer num4 = this.tickSpacing;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeString(this.feeRate);
        CollateralRatioInfo collateralRatioInfo = this.collateralRatioInfo;
        if (collateralRatioInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            collateralRatioInfo.writeToParcel(parcel, i);
        }
        BTCMode bTCMode = this.btcMode;
        if (bTCMode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bTCMode.name());
        }
        parcel.writeInt(this.showEstDailyYield ? 1 : 0);
        PointsInfo pointsInfo = this.pointsInfo;
        if (pointsInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pointsInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.rateDesc);
        parcel.writeString(this.tvl);
    }

    public /* synthetic */ InvestSubscriptionInfo(int i, int i2, long j, List list, InvestType investType, List list2, long j2, String str, Long l, boolean z, String str2, String str3, String str4, String str5, InvestTokenWithAmount investTokenWithAmount, String str6, long j3, boolean z2, List list3, TransactionMethod transactionMethod, boolean z3, boolean z4, String str7, PromptInformation promptInformation, Integer num, boolean z5, String str8, Integer num2, List list4, List list5, Integer num3, String str9, String str10, String str11, Integer num4, String str12, CollateralRatioInfo collateralRatioInfo, BTCMode bTCMode, boolean z6, PointsInfo pointsInfo, String str13, String str14, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if ((i & 1) == 0) {
            this.chainId = 0L;
        } else {
            this.chainId = j;
        }
        this.gainsTokenList = (i & 2) == 0 ? new ArrayList() : list;
        this.investType = (i & 4) == 0 ? InvestType.Save : investType;
        this.investWithTokenList = (i & 8) == 0 ? new ArrayList() : list2;
        if ((i & 16) == 0) {
            this.investmentId = 0L;
        } else {
            this.investmentId = j2;
        }
        if ((i & 32) == 0) {
            this.investmentName = "";
        } else {
            this.investmentName = str;
        }
        if ((i & 64) == 0) {
            this.analysisPlatformId = null;
        } else {
            this.analysisPlatformId = l;
        }
        if ((i & 128) == 0) {
            this.isSupportSwap = false;
        } else {
            this.isSupportSwap = z;
        }
        if ((i & 256) == 0) {
            this.network = "";
        } else {
            this.network = str2;
        }
        if ((i & 512) == 0) {
            this.networkLogo = "";
        } else {
            this.networkLogo = str3;
        }
        if ((i & 1024) == 0) {
            this.platformLogo = "";
        } else {
            this.platformLogo = str4;
        }
        if ((i & 2048) == 0) {
            this.platformName = "";
        } else {
            this.platformName = str5;
        }
        if ((i & 4096) == 0) {
            this.receiveTokenInfo = null;
        } else {
            this.receiveTokenInfo = investTokenWithAmount;
        }
        if ((i & 8192) == 0) {
            this.reserveFee = "";
        } else {
            this.reserveFee = str6;
        }
        if ((i & 16384) == 0) {
            this.sourceInvestmentId = 0L;
        } else {
            this.sourceInvestmentId = j3;
        }
        if ((32768 & i) == 0) {
            this.supportAdapter = true;
        } else {
            this.supportAdapter = z2;
        }
        this.swapToTokenList = (65536 & i) == 0 ? new ArrayList() : list3;
        this.subscriptionMethod = (131072 & i) == 0 ? TransactionMethod.UNKNOWN : transactionMethod;
        if ((262144 & i) == 0) {
            this.isLp = false;
        } else {
            this.isLp = z3;
        }
        if ((524288 & i) == 0) {
            this.isSupportLock = false;
        } else {
            this.isSupportLock = z4;
        }
        if ((1048576 & i) == 0) {
            this.lockRedeemTip = "";
        } else {
            this.lockRedeemTip = str7;
        }
        if ((2097152 & i) == 0) {
            this.promptInformation = null;
        } else {
            this.promptInformation = promptInformation;
        }
        if ((4194304 & i) == 0) {
            this.inputPrecision = null;
        } else {
            this.inputPrecision = num;
        }
        this.isSingleValidator = (8388608 & i) != 0 ? z5 : false;
        if ((16777216 & i) == 0) {
            this.validatorName = "";
        } else {
            this.validatorName = str8;
        }
        if ((33554432 & i) == 0) {
            this.mode = null;
        } else {
            this.mode = num2;
        }
        if ((67108864 & i) == 0) {
            this.rangeInfo = null;
        } else {
            this.rangeInfo = list4;
        }
        if ((134217728 & i) == 0) {
            this.underlyingTokenList = null;
        } else {
            this.underlyingTokenList = list5;
        }
        if ((268435456 & i) == 0) {
            this.currentTick = null;
        } else {
            this.currentTick = num3;
        }
        if ((536870912 & i) == 0) {
            this.currentPrice = null;
        } else {
            this.currentPrice = str9;
        }
        if ((1073741824 & i) == 0) {
            this.lowerPrice = null;
        } else {
            this.lowerPrice = str10;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.upperPrice = null;
        } else {
            this.upperPrice = str11;
        }
        if ((i2 & 1) == 0) {
            this.tickSpacing = null;
        } else {
            this.tickSpacing = num4;
        }
        if ((i2 & 2) == 0) {
            this.feeRate = null;
        } else {
            this.feeRate = str12;
        }
        if ((i2 & 4) == 0) {
            this.collateralRatioInfo = null;
        } else {
            this.collateralRatioInfo = collateralRatioInfo;
        }
        if ((i2 & 8) == 0) {
            this.btcMode = null;
        } else {
            this.btcMode = bTCMode;
        }
        if ((i2 & 16) == 0) {
            this.showEstDailyYield = true;
        } else {
            this.showEstDailyYield = z6;
        }
        if ((i2 & 32) == 0) {
            this.pointsInfo = null;
        } else {
            this.pointsInfo = pointsInfo;
        }
        if ((i2 & 64) == 0) {
            this.rateDesc = "";
        } else {
            this.rateDesc = str13;
        }
        if ((i2 & 128) == 0) {
            this.tvl = "";
        } else {
            this.tvl = str14;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [43=6] */
    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestSubscriptionInfo investSubscriptionInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investSubscriptionInfo.chainId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, investSubscriptionInfo.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(investSubscriptionInfo.gainsTokenList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], investSubscriptionInfo.gainsTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investSubscriptionInfo.investType != InvestType.Save) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], investSubscriptionInfo.investType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(investSubscriptionInfo.investWithTokenList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], investSubscriptionInfo.investWithTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investSubscriptionInfo.investmentId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 4, investSubscriptionInfo.investmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) investSubscriptionInfo.investmentName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, investSubscriptionInfo.investmentName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || investSubscriptionInfo.analysisPlatformId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, LongSerializer.INSTANCE, investSubscriptionInfo.analysisPlatformId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || investSubscriptionInfo.isSupportSwap) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, investSubscriptionInfo.isSupportSwap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) investSubscriptionInfo.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, investSubscriptionInfo.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) investSubscriptionInfo.networkLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, investSubscriptionInfo.networkLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) investSubscriptionInfo.platformLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, investSubscriptionInfo.platformLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) investSubscriptionInfo.platformName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, investSubscriptionInfo.platformName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || investSubscriptionInfo.receiveTokenInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, InvestTokenWithAmount$$serializer.INSTANCE, investSubscriptionInfo.receiveTokenInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) investSubscriptionInfo.reserveFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, investSubscriptionInfo.reserveFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || investSubscriptionInfo.sourceInvestmentId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 14, investSubscriptionInfo.sourceInvestmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !investSubscriptionInfo.supportAdapter) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 15, investSubscriptionInfo.supportAdapter);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd(investSubscriptionInfo.swapToTokenList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 16, kSerializerArr[16], investSubscriptionInfo.swapToTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || investSubscriptionInfo.subscriptionMethod != TransactionMethod.UNKNOWN) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 17, kSerializerArr[17], investSubscriptionInfo.subscriptionMethod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || investSubscriptionInfo.isLp) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 18, investSubscriptionInfo.isLp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || investSubscriptionInfo.isSupportLock) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 19, investSubscriptionInfo.isSupportLock);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) investSubscriptionInfo.lockRedeemTip, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, investSubscriptionInfo.lockRedeemTip);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || investSubscriptionInfo.promptInformation != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, PromptInformation$$serializer.INSTANCE, investSubscriptionInfo.promptInformation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || investSubscriptionInfo.inputPrecision != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, IntSerializer.INSTANCE, investSubscriptionInfo.inputPrecision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || investSubscriptionInfo.isSingleValidator) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 23, investSubscriptionInfo.isSingleValidator);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) investSubscriptionInfo.validatorName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, investSubscriptionInfo.validatorName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || investSubscriptionInfo.mode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, IntSerializer.INSTANCE, investSubscriptionInfo.mode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || investSubscriptionInfo.rangeInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, kSerializerArr[26], investSubscriptionInfo.rangeInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || investSubscriptionInfo.underlyingTokenList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, kSerializerArr[27], investSubscriptionInfo.underlyingTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || investSubscriptionInfo.currentTick != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, IntSerializer.INSTANCE, investSubscriptionInfo.currentTick);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || investSubscriptionInfo.currentPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, investSubscriptionInfo.currentPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || investSubscriptionInfo.lowerPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.INSTANCE, investSubscriptionInfo.lowerPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || investSubscriptionInfo.upperPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, StringSerializer.INSTANCE, investSubscriptionInfo.upperPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || investSubscriptionInfo.tickSpacing != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, IntSerializer.INSTANCE, investSubscriptionInfo.tickSpacing);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || investSubscriptionInfo.feeRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, StringSerializer.INSTANCE, investSubscriptionInfo.feeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || investSubscriptionInfo.collateralRatioInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, CollateralRatioInfo$$serializer.INSTANCE, investSubscriptionInfo.collateralRatioInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || investSubscriptionInfo.btcMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, kSerializerArr[35], investSubscriptionInfo.btcMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !investSubscriptionInfo.showEstDailyYield) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 36, investSubscriptionInfo.showEstDailyYield);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || investSubscriptionInfo.pointsInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 37, PointsInfo$$serializer.INSTANCE, investSubscriptionInfo.pointsInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) investSubscriptionInfo.rateDesc, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 38, StringSerializer.INSTANCE, investSubscriptionInfo.rateDesc);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) && Intrinsics.EZpvd((Object) investSubscriptionInfo.tvl, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 39, investSubscriptionInfo.tvl);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01ec: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0004: ARITH (r86v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r43v0 long))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000d: ARITH (r86v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0013: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:48) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r45v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.models.InvestType:?: TERNARY null = ((wrap:int:0x0019: ARITH (r86v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001d: SGET  A[WRAPPED] (LINE:49) com.okinc.business.invest_biz.data.models.InvestType.Save com.okinc.business.invest_biz.data.models.InvestType) : (r46v0 com.okinc.business.invest_biz.data.models.InvestType))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0022: ARITH (r86v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0028: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:50) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r47v0 java.util.List))
  (wrap:long:?: TERNARY null = ((wrap:int:0x002e: ARITH (r86v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r48v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r86v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0041: ARITH (r86v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r51v0 java.lang.Long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0049: ARITH (r86v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r52v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r86v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r86v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r86v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:0x0077: TERNARY null = ((wrap:int:0x006e: ARITH (r86v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.models.InvestTokenWithAmount:0x0081: TERNARY null = ((wrap:int:0x0079: ARITH (r86v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.models.InvestTokenWithAmount) : (r57v0 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount))
  (wrap:java.lang.String:0x008c: TERNARY null = ((wrap:int:0x0083: ARITH (r86v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x008e: ARITH (r86v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r59v0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x009a: ARITH (32768 int) & (r86v0 int) A[WRAPPED]) != (0 int)) ? true : (r61v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00a6: ARITH (r86v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00ac: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:63) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r62v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.bean.TransactionMethod:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r86v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00b8: SGET  A[WRAPPED] (LINE:64) com.okinc.business.invest_biz.data.bean.TransactionMethod.UNKNOWN com.okinc.business.invest_biz.data.bean.TransactionMethod) : (r63v0 com.okinc.business.invest_biz.data.bean.TransactionMethod))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00bf: ARITH (r86v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? false : (r64v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00ca: ARITH (r86v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? false : (r65v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d5: ARITH (r86v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.PromptInformation:?: TERNARY null = ((wrap:int:0x00e0: ARITH (r86v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.PromptInformation) : (r67v0 com.okinc.business.invest_biz.data.bean.PromptInformation))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00eb: ARITH (r86v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r68v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00f6: ARITH (r86v0 int) & (8388608 int) A[WRAPPED]) == (0 int)) ? (r69v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ff: ARITH (r86v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x010a: ARITH (r86v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r71v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0115: ARITH (r86v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r72v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0120: ARITH (r86v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r73v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x012b: ARITH (r86v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r74v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0136: ARITH (r86v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r75v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0141: ARITH (r86v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r76v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x014c: ARITH (r86v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r77v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0154: ARITH (r87v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r78v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x015d: ARITH (r87v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r79v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.CollateralRatioInfo:?: TERNARY null = ((wrap:int:0x0166: ARITH (r87v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.CollateralRatioInfo) : (r80v0 com.okinc.business.invest_biz.data.bean.CollateralRatioInfo))
  (wrap:com.okinc.business.invest_biz.data.contants.BTCMode:?: TERNARY null = ((wrap:int:0x016f: ARITH (r87v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.contants.BTCMode) : (r81v0 com.okinc.business.invest_biz.data.contants.BTCMode))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0178: ARITH (r87v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r82v0 boolean) : true)
  (wrap:com.okinc.business.invest_biz.data.bean.PointsInfo:?: TERNARY null = ((wrap:int:0x017f: ARITH (r87v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.PointsInfo) : (r83v0 com.okinc.business.invest_biz.data.bean.PointsInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0188: ARITH (r87v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r84v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0191: ARITH (r87v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r85v0 java.lang.String))
 A[MD:(long, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, com.okinc.business.invest_biz.data.models.InvestType, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, long, java.lang.String, java.lang.Long, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, java.lang.String, long, boolean, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, com.okinc.business.invest_biz.data.bean.TransactionMethod, boolean, boolean, java.lang.String, com.okinc.business.invest_biz.data.bean.PromptInformation, java.lang.Integer, boolean, java.lang.String, java.lang.Integer, java.util.List<com.okinc.business.invest_biz.data.bean.InvestUniv3RangeInfo>, java.util.List<com.okinc.business.invest_biz.data.bean.InvestUnderlyingToken>, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, com.okinc.business.invest_biz.data.bean.CollateralRatioInfo, com.okinc.business.invest_biz.data.contants.BTCMode, boolean, com.okinc.business.invest_biz.data.bean.PointsInfo, java.lang.String, java.lang.String):void (m)] (LINE:46) call: com.okinc.business.invest_biz.data.bean.InvestSubscriptionInfo.<init>(long, java.util.List, com.okinc.business.invest_biz.data.models.InvestType, java.util.List, long, java.lang.String, java.lang.Long, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, java.lang.String, long, boolean, java.util.List, com.okinc.business.invest_biz.data.bean.TransactionMethod, boolean, boolean, java.lang.String, com.okinc.business.invest_biz.data.bean.PromptInformation, java.lang.Integer, boolean, java.lang.String, java.lang.Integer, java.util.List, java.util.List, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, com.okinc.business.invest_biz.data.bean.CollateralRatioInfo, com.okinc.business.invest_biz.data.contants.BTCMode, boolean, com.okinc.business.invest_biz.data.bean.PointsInfo, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InvestSubscriptionInfo(long j, List list, InvestType investType, List list2, long j2, String str, Long l, boolean z, String str2, String str3, String str4, String str5, InvestTokenWithAmount investTokenWithAmount, String str6, long j3, boolean z2, List list3, TransactionMethod transactionMethod, boolean z3, boolean z4, String str7, PromptInformation promptInformation, Integer num, boolean z5, String str8, Integer num2, List list4, List list5, Integer num3, String str9, String str10, String str11, Integer num4, String str12, CollateralRatioInfo collateralRatioInfo, BTCMode bTCMode, boolean z6, PointsInfo pointsInfo, String str13, String str14, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? InvestType.Save : investType, (i & 8) != 0 ? new ArrayList() : list2, (i & 16) != 0 ? 0L : j2, (i & 32) != 0 ? "" : str, (i & 64) != 0 ? null : l, (i & 128) != 0 ? false : z, (i & 256) != 0 ? "" : str2, (i & 512) != 0 ? "" : str3, (i & 1024) != 0 ? "" : str4, (i & 2048) != 0 ? "" : str5, (i & 4096) != 0 ? null : investTokenWithAmount, (i & 8192) != 0 ? "" : str6, (i & 16384) != 0 ? 0L : j3, (32768 & i) != 0 ? true : z2, (i & 65536) != 0 ? new ArrayList() : list3, (i & 131072) != 0 ? TransactionMethod.UNKNOWN : transactionMethod, (i & 262144) != 0 ? false : z3, (i & 524288) != 0 ? false : z4, (i & 1048576) != 0 ? "" : str7, (i & 2097152) != 0 ? null : promptInformation, (i & 4194304) != 0 ? null : num, (i & 8388608) == 0 ? z5 : false, (i & 16777216) != 0 ? "" : str8, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : num2, (i & 67108864) != 0 ? null : list4, (i & 134217728) != 0 ? null : list5, (i & 268435456) != 0 ? null : num3, (i & 536870912) != 0 ? null : str9, (i & 1073741824) != 0 ? null : str10, (i & Integer.MIN_VALUE) != 0 ? null : str11, (i2 & 1) != 0 ? null : num4, (i2 & 2) != 0 ? null : str12, (i2 & 4) != 0 ? null : collateralRatioInfo, (i2 & 8) != 0 ? null : bTCMode, (i2 & 16) == 0 ? z6 : true, (i2 & 32) != 0 ? null : pointsInfo, (i2 & 64) != 0 ? "" : str13, (i2 & 128) != 0 ? "" : str14);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestSubscriptionInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InvestSubscriptionInfo> serializer() {
            return InvestSubscriptionInfo$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestSubscriptionInfo(long j, @NotNull List<InvestTokenWithAmount> list, @NotNull InvestType investType, @NotNull List<InvestTokenWithAmount> list2, long j2, @NotNull String str, Long l, boolean z, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, InvestTokenWithAmount investTokenWithAmount, @NotNull String str6, long j3, boolean z2, @NotNull List<InvestTokenWithAmount> list3, @NotNull TransactionMethod transactionMethod, boolean z3, boolean z4, @NotNull String str7, PromptInformation promptInformation, Integer num, boolean z5, @NotNull String str8, Integer num2, List<InvestUniv3RangeInfo> list4, List<InvestUnderlyingToken> list5, Integer num3, String str9, String str10, String str11, Integer num4, String str12, CollateralRatioInfo collateralRatioInfo, BTCMode bTCMode, boolean z6, PointsInfo pointsInfo, String str13, @NotNull String str14) {
        super(null);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(investType, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(transactionMethod, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str14, "");
        this.chainId = j;
        this.gainsTokenList = list;
        this.investType = investType;
        this.investWithTokenList = list2;
        this.investmentId = j2;
        this.investmentName = str;
        this.analysisPlatformId = l;
        this.isSupportSwap = z;
        this.network = str2;
        this.networkLogo = str3;
        this.platformLogo = str4;
        this.platformName = str5;
        this.receiveTokenInfo = investTokenWithAmount;
        this.reserveFee = str6;
        this.sourceInvestmentId = j3;
        this.supportAdapter = z2;
        this.swapToTokenList = list3;
        this.subscriptionMethod = transactionMethod;
        this.isLp = z3;
        this.isSupportLock = z4;
        this.lockRedeemTip = str7;
        this.promptInformation = promptInformation;
        this.inputPrecision = num;
        this.isSingleValidator = z5;
        this.validatorName = str8;
        this.mode = num2;
        this.rangeInfo = list4;
        this.underlyingTokenList = list5;
        this.currentTick = num3;
        this.currentPrice = str9;
        this.lowerPrice = str10;
        this.upperPrice = str11;
        this.tickSpacing = num4;
        this.feeRate = str12;
        this.collateralRatioInfo = collateralRatioInfo;
        this.btcMode = bTCMode;
        this.showEstDailyYield = z6;
        this.pointsInfo = pointsInfo;
        this.rateDesc = str13;
        this.tvl = str14;
    }

    static {
        InvestTokenWithAmount$$serializer investTokenWithAmount$$serializer = InvestTokenWithAmount$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new ArrayListSerializer(investTokenWithAmount$$serializer), InvestType.Companion.serializer(), new ArrayListSerializer(investTokenWithAmount$$serializer), null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(investTokenWithAmount$$serializer), TransactionMethod.Companion.serializer(), null, null, null, null, null, null, null, null, new ArrayListSerializer(InvestUniv3RangeInfo$$serializer.INSTANCE), new ArrayListSerializer(InvestUnderlyingToken$$serializer.INSTANCE), null, null, null, null, null, null, null, BTCMode.Companion.serializer(), null, null, null, null};
    }
}
