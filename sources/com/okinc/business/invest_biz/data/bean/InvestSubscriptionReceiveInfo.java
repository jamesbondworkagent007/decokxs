package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.invest_biz.data.bean.response.TransactionStep;
import com.okinc.business.invest_biz.data.bean.response.TransactionStep$$serializer;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount$$serializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.AbstractC25546iyk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestSubscriptionReceiveInfo extends AbstractC25546iyk implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final String alreadyStakeAmount;
    private final List<InvestTokenWithApprove> approveStatusList;
    private final BoostParameters boostParameters;
    private final InvestTokenWithAmount borrowFee;
    private final String collateral;
    private final CollateralRatioInfo collateralRatioInfo;
    private final String currentPrice;
    private final Integer currentTick;
    private final String deadline;
    private final String estimateGasFee;
    private final String exchangeRate;
    private final String feeRate;
    private final String fixedApy;
    private final List<InvestTokenWithAmount> gainsTokenList;
    private final HeathFactorInfo healthFactorInfo;
    private final List<InvestTokenWithAmount> investWithTokenList;
    private final boolean isAllowSubscribe;
    private final String maturityTime;
    private final String maxStakeAmount;
    private final String minimumStakeAmount;
    private final PointsInfo pointsInfo;
    private final String positionStatus;
    private final List<InvestTipInfoVo> productExtInfoList;
    private final PromptInformation promptInformation;
    private final InvestTokenWithAmount receiveTokenInfo;
    private final List<InvestTokenWithAmount> safeMoonTokenList;
    private final String settlementTime;
    private final String subscribeCallDataExtInfo;
    private final List<InvestTokenWithAmount> swapToTokenList;
    private final List<ExpectTokenInfo> tokenInfoList;
    private final String totalGainsCurrencyAmount;
    private final InvestTransactionLossInfo transactionLossInfo;
    private final List<TransactionStep> transactionStepList;
    private final String valueDeviationPercentage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestSubscriptionReceiveInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestSubscriptionReceiveInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestSubscriptionReceiveInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList4.add(InvestTokenWithApprove.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList5.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
            }
            int i5 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList6.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
            }
            boolean z = parcel.readInt() != 0;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            InvestTokenWithAmount investTokenWithAmountCreateFromParcel = parcel.readInt() == 0 ? null : InvestTokenWithAmount.CREATOR.createFromParcel(parcel);
            int i7 = parcel.readInt();
            ArrayList arrayList7 = new ArrayList(i7);
            for (int i8 = 0; i8 != i7; i8++) {
                arrayList7.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i9 = parcel.readInt();
            ArrayList arrayList8 = new ArrayList(i9);
            for (int i10 = 0; i10 != i9; i10++) {
                arrayList8.add(ExpectTokenInfo.CREATOR.createFromParcel(parcel));
            }
            int i11 = parcel.readInt();
            ArrayList arrayList9 = new ArrayList(i11);
            int i12 = 0;
            while (i12 != i11) {
                arrayList9.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
                i12++;
                i11 = i11;
            }
            String string6 = parcel.readString();
            PromptInformation promptInformationCreateFromParcel = parcel.readInt() == 0 ? null : PromptInformation.CREATOR.createFromParcel(parcel);
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            InvestTransactionLossInfo investTransactionLossInfoCreateFromParcel = parcel.readInt() == 0 ? null : InvestTransactionLossInfo.CREATOR.createFromParcel(parcel);
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            CollateralRatioInfo collateralRatioInfoCreateFromParcel = parcel.readInt() == 0 ? null : CollateralRatioInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = arrayList9;
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(i13);
                arrayList = arrayList9;
                int i14 = 0;
                while (i14 != i13) {
                    arrayList10.add(TransactionStep.CREATOR.createFromParcel(parcel));
                    i14++;
                    i13 = i13;
                }
                arrayList2 = arrayList10;
            }
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList11 = new ArrayList(i15);
                int i16 = 0;
                while (i16 != i15) {
                    arrayList11.add(InvestTipInfoVo.CREATOR.createFromParcel(parcel));
                    i16++;
                    i15 = i15;
                }
                arrayList3 = arrayList11;
            }
            return new InvestSubscriptionReceiveInfo(string, arrayList4, arrayList5, arrayList6, z, string2, string3, investTokenWithAmountCreateFromParcel, arrayList7, string4, string5, arrayList8, arrayList, string6, promptInformationCreateFromParcel, numValueOf, string7, string8, string9, investTransactionLossInfoCreateFromParcel, string10, string11, collateralRatioInfoCreateFromParcel, arrayList2, string12, string13, arrayList3, parcel.readString(), parcel.readInt() == 0 ? null : PointsInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : HeathFactorInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InvestTokenWithAmount.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : BoostParameters.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestSubscriptionReceiveInfo[] newArray(int i) {
            return new InvestSubscriptionReceiveInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestSubscriptionReceiveInfo() {
        this((String) null, (List) null, (List) null, (List) null, false, (String) null, (String) null, (InvestTokenWithAmount) null, (List) null, (String) null, (String) null, (List) null, (List) null, (String) null, (PromptInformation) null, (Integer) null, (String) null, (String) null, (String) null, (InvestTransactionLossInfo) null, (String) null, (String) null, (CollateralRatioInfo) null, (List) null, (String) null, (String) null, (List) null, (String) null, (PointsInfo) null, (String) null, (HeathFactorInfo) null, (InvestTokenWithAmount) null, (String) null, (BoostParameters) null, -1, 3, (DefaultConstructorMarker) null);
    }

    @SerialName("alreadyStakeAmount")
    public static /* synthetic */ void getAlreadyStakeAmount$annotations() {
    }

    @SerialName("approveStatusList")
    public static /* synthetic */ void getApproveStatusList$annotations() {
    }

    @SerialName("boostParameter")
    public static /* synthetic */ void getBoostParameters$annotations() {
    }

    @SerialName("borrowFee")
    public static /* synthetic */ void getBorrowFee$annotations() {
    }

    @SerialName("collateral")
    public static /* synthetic */ void getCollateral$annotations() {
    }

    @SerialName("collateralRatioInfo")
    public static /* synthetic */ void getCollateralRatioInfo$annotations() {
    }

    @SerialName("currentPrice")
    public static /* synthetic */ void getCurrentPrice$annotations() {
    }

    @SerialName("currentTick")
    public static /* synthetic */ void getCurrentTick$annotations() {
    }

    @SerialName("deadline")
    public static /* synthetic */ void getDeadline$annotations() {
    }

    @SerialName("estimateGasFee")
    public static /* synthetic */ void getEstimateGasFee$annotations() {
    }

    @SerialName("exchangeRate")
    public static /* synthetic */ void getExchangeRate$annotations() {
    }

    @SerialName("feeRate")
    public static /* synthetic */ void getFeeRate$annotations() {
    }

    @SerialName("fixedApy")
    public static /* synthetic */ void getFixedApy$annotations() {
    }

    @SerialName("gainsTokenList")
    public static /* synthetic */ void getGainsTokenList$annotations() {
    }

    @SerialName("healthFactorInfo")
    public static /* synthetic */ void getHealthFactorInfo$annotations() {
    }

    @SerialName("investWithTokenList")
    public static /* synthetic */ void getInvestWithTokenList$annotations() {
    }

    @SerialName("maturityTime")
    public static /* synthetic */ void getMaturityTime$annotations() {
    }

    @SerialName("maxStakeAmount")
    public static /* synthetic */ void getMaxStakeAmount$annotations() {
    }

    @SerialName("minimumStakeAmount")
    public static /* synthetic */ void getMinimumStakeAmount$annotations() {
    }

    @SerialName("pointsInfo")
    public static /* synthetic */ void getPointsInfo$annotations() {
    }

    @SerialName("positionStatus")
    public static /* synthetic */ void getPositionStatus$annotations() {
    }

    @SerialName("productExtInfoList")
    public static /* synthetic */ void getProductExtInfoList$annotations() {
    }

    @SerialName("promptInformation")
    public static /* synthetic */ void getPromptInformation$annotations() {
    }

    @SerialName("receiveTokenInfo")
    public static /* synthetic */ void getReceiveTokenInfo$annotations() {
    }

    @SerialName("safeMoonTokenList")
    public static /* synthetic */ void getSafeMoonTokenList$annotations() {
    }

    @SerialName("settlementTime")
    public static /* synthetic */ void getSettlementTime$annotations() {
    }

    @SerialName("subscribeCallDataExtInfo")
    public static /* synthetic */ void getSubscribeCallDataExtInfo$annotations() {
    }

    @SerialName("swapToTokenList")
    public static /* synthetic */ void getSwapToTokenList$annotations() {
    }

    @SerialName("tokenInfoList")
    public static /* synthetic */ void getTokenInfoList$annotations() {
    }

    @SerialName("totalGainsCurrencyAmount")
    public static /* synthetic */ void getTotalGainsCurrencyAmount$annotations() {
    }

    @SerialName("transactionLossInfo")
    public static /* synthetic */ void getTransactionLossInfo$annotations() {
    }

    @SerialName("transactionStepList")
    public static /* synthetic */ void getTransactionStepList$annotations() {
    }

    @SerialName("valueDeviationPercentage")
    public static /* synthetic */ void getValueDeviationPercentage$annotations() {
    }

    @SerialName("isAllowSubscribe")
    public static /* synthetic */ void isAllowSubscribe$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.alreadyStakeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.valueDeviationPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.estimateGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ExpectTokenInfo> component12() {
        return this.tokenInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component13() {
        return this.safeMoonTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.exchangeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PromptInformation component15() {
        return this.promptInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component16() {
        return this.currentTick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.positionStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithApprove> component2() {
        return this.approveStatusList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTransactionLossInfo component20() {
        return this.transactionLossInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.fixedApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.maturityTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CollateralRatioInfo component23() {
        return this.collateralRatioInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TransactionStep> component24() {
        return this.transactionStepList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.deadline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.settlementTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTipInfoVo> component27() {
        return this.productExtInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.subscribeCallDataExtInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PointsInfo component29() {
        return this.pointsInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component3() {
        return this.gainsTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.collateral;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HeathFactorInfo component31() {
        return this.healthFactorInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount component32() {
        return this.borrowFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.totalGainsCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BoostParameters component34() {
        return this.boostParameters;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component4() {
        return this.investWithTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isAllowSubscribe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.maxStakeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.minimumStakeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount component8() {
        return this.receiveTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component9() {
        return this.swapToTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestSubscriptionReceiveInfo copy(@NotNull String str, @NotNull List<InvestTokenWithApprove> list, @NotNull List<InvestTokenWithAmount> list2, @NotNull List<InvestTokenWithAmount> list3, boolean z, @NotNull String str2, @NotNull String str3, InvestTokenWithAmount investTokenWithAmount, @NotNull List<InvestTokenWithAmount> list4, @NotNull String str4, @NotNull String str5, @NotNull List<ExpectTokenInfo> list5, @NotNull List<InvestTokenWithAmount> list6, @NotNull String str6, PromptInformation promptInformation, Integer num, String str7, String str8, String str9, InvestTransactionLossInfo investTransactionLossInfo, @NotNull String str10, @NotNull String str11, CollateralRatioInfo collateralRatioInfo, List<TransactionStep> list7, String str12, String str13, List<InvestTipInfoVo> list8, String str14, PointsInfo pointsInfo, String str15, HeathFactorInfo heathFactorInfo, InvestTokenWithAmount investTokenWithAmount2, String str16, BoostParameters boostParameters) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(list6, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new InvestSubscriptionReceiveInfo(str, list, list2, list3, z, str2, str3, investTokenWithAmount, list4, str4, str5, list5, list6, str6, promptInformation, num, str7, str8, str9, investTransactionLossInfo, str10, str11, collateralRatioInfo, list7, str12, str13, list8, str14, pointsInfo, str15, heathFactorInfo, investTokenWithAmount2, str16, boostParameters);
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
        if (!(obj instanceof InvestSubscriptionReceiveInfo)) {
            return false;
        }
        InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo = (InvestSubscriptionReceiveInfo) obj;
        return Intrinsics.EZpvd((Object) this.alreadyStakeAmount, (Object) investSubscriptionReceiveInfo.alreadyStakeAmount) && Intrinsics.EZpvd(this.approveStatusList, investSubscriptionReceiveInfo.approveStatusList) && Intrinsics.EZpvd(this.gainsTokenList, investSubscriptionReceiveInfo.gainsTokenList) && Intrinsics.EZpvd(this.investWithTokenList, investSubscriptionReceiveInfo.investWithTokenList) && this.isAllowSubscribe == investSubscriptionReceiveInfo.isAllowSubscribe && Intrinsics.EZpvd((Object) this.maxStakeAmount, (Object) investSubscriptionReceiveInfo.maxStakeAmount) && Intrinsics.EZpvd((Object) this.minimumStakeAmount, (Object) investSubscriptionReceiveInfo.minimumStakeAmount) && Intrinsics.EZpvd(this.receiveTokenInfo, investSubscriptionReceiveInfo.receiveTokenInfo) && Intrinsics.EZpvd(this.swapToTokenList, investSubscriptionReceiveInfo.swapToTokenList) && Intrinsics.EZpvd((Object) this.valueDeviationPercentage, (Object) investSubscriptionReceiveInfo.valueDeviationPercentage) && Intrinsics.EZpvd((Object) this.estimateGasFee, (Object) investSubscriptionReceiveInfo.estimateGasFee) && Intrinsics.EZpvd(this.tokenInfoList, investSubscriptionReceiveInfo.tokenInfoList) && Intrinsics.EZpvd(this.safeMoonTokenList, investSubscriptionReceiveInfo.safeMoonTokenList) && Intrinsics.EZpvd((Object) this.exchangeRate, (Object) investSubscriptionReceiveInfo.exchangeRate) && Intrinsics.EZpvd(this.promptInformation, investSubscriptionReceiveInfo.promptInformation) && Intrinsics.EZpvd(this.currentTick, investSubscriptionReceiveInfo.currentTick) && Intrinsics.EZpvd((Object) this.currentPrice, (Object) investSubscriptionReceiveInfo.currentPrice) && Intrinsics.EZpvd((Object) this.feeRate, (Object) investSubscriptionReceiveInfo.feeRate) && Intrinsics.EZpvd((Object) this.positionStatus, (Object) investSubscriptionReceiveInfo.positionStatus) && Intrinsics.EZpvd(this.transactionLossInfo, investSubscriptionReceiveInfo.transactionLossInfo) && Intrinsics.EZpvd((Object) this.fixedApy, (Object) investSubscriptionReceiveInfo.fixedApy) && Intrinsics.EZpvd((Object) this.maturityTime, (Object) investSubscriptionReceiveInfo.maturityTime) && Intrinsics.EZpvd(this.collateralRatioInfo, investSubscriptionReceiveInfo.collateralRatioInfo) && Intrinsics.EZpvd(this.transactionStepList, investSubscriptionReceiveInfo.transactionStepList) && Intrinsics.EZpvd((Object) this.deadline, (Object) investSubscriptionReceiveInfo.deadline) && Intrinsics.EZpvd((Object) this.settlementTime, (Object) investSubscriptionReceiveInfo.settlementTime) && Intrinsics.EZpvd(this.productExtInfoList, investSubscriptionReceiveInfo.productExtInfoList) && Intrinsics.EZpvd((Object) this.subscribeCallDataExtInfo, (Object) investSubscriptionReceiveInfo.subscribeCallDataExtInfo) && Intrinsics.EZpvd(this.pointsInfo, investSubscriptionReceiveInfo.pointsInfo) && Intrinsics.EZpvd((Object) this.collateral, (Object) investSubscriptionReceiveInfo.collateral) && Intrinsics.EZpvd(this.healthFactorInfo, investSubscriptionReceiveInfo.healthFactorInfo) && Intrinsics.EZpvd(this.borrowFee, investSubscriptionReceiveInfo.borrowFee) && Intrinsics.EZpvd((Object) this.totalGainsCurrencyAmount, (Object) investSubscriptionReceiveInfo.totalGainsCurrencyAmount) && Intrinsics.EZpvd(this.boostParameters, investSubscriptionReceiveInfo.boostParameters);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlreadyStakeAmount() {
        return this.alreadyStakeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithApprove> getApproveStatusList() {
        return this.approveStatusList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BoostParameters getBoostParameters() {
        return this.boostParameters;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount getBorrowFee() {
        return this.borrowFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCollateral() {
        return this.collateral;
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
    public final String getDeadline() {
        return this.deadline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimateGasFee() {
        return this.estimateGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExchangeRate() {
        return this.exchangeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeRate() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFixedApy() {
        return this.fixedApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> getGainsTokenList() {
        return this.gainsTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HeathFactorInfo getHealthFactorInfo() {
        return this.healthFactorInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> getInvestWithTokenList() {
        return this.investWithTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaturityTime() {
        return this.maturityTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxStakeAmount() {
        return this.maxStakeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinimumStakeAmount() {
        return this.minimumStakeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PointsInfo getPointsInfo() {
        return this.pointsInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPositionStatus() {
        return this.positionStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTipInfoVo> getProductExtInfoList() {
        return this.productExtInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PromptInformation getPromptInformation() {
        return this.promptInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount getReceiveTokenInfo() {
        return this.receiveTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> getSafeMoonTokenList() {
        return this.safeMoonTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettlementTime() {
        return this.settlementTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubscribeCallDataExtInfo() {
        return this.subscribeCallDataExtInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> getSwapToTokenList() {
        return this.swapToTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ExpectTokenInfo> getTokenInfoList() {
        return this.tokenInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalGainsCurrencyAmount() {
        return this.totalGainsCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTransactionLossInfo getTransactionLossInfo() {
        return this.transactionLossInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TransactionStep> getTransactionStepList() {
        return this.transactionStepList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValueDeviationPercentage() {
        return this.valueDeviationPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.alreadyStakeAmount.hashCode();
        int iHashCode2 = this.approveStatusList.hashCode();
        int iHashCode3 = this.gainsTokenList.hashCode();
        int iHashCode4 = this.investWithTokenList.hashCode();
        int iHashCode5 = Boolean.hashCode(this.isAllowSubscribe);
        int iHashCode6 = this.maxStakeAmount.hashCode();
        int iHashCode7 = this.minimumStakeAmount.hashCode();
        InvestTokenWithAmount investTokenWithAmount = this.receiveTokenInfo;
        int iHashCode8 = investTokenWithAmount == null ? 0 : investTokenWithAmount.hashCode();
        int iHashCode9 = this.swapToTokenList.hashCode();
        int iHashCode10 = this.valueDeviationPercentage.hashCode();
        int iHashCode11 = this.estimateGasFee.hashCode();
        int iHashCode12 = this.tokenInfoList.hashCode();
        int iHashCode13 = this.safeMoonTokenList.hashCode();
        int iHashCode14 = this.exchangeRate.hashCode();
        PromptInformation promptInformation = this.promptInformation;
        int iHashCode15 = promptInformation == null ? 0 : promptInformation.hashCode();
        Integer num = this.currentTick;
        int iHashCode16 = num == null ? 0 : num.hashCode();
        String str = this.currentPrice;
        int iHashCode17 = str == null ? 0 : str.hashCode();
        String str2 = this.feeRate;
        int iHashCode18 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.positionStatus;
        int iHashCode19 = str3 == null ? 0 : str3.hashCode();
        InvestTransactionLossInfo investTransactionLossInfo = this.transactionLossInfo;
        int iHashCode20 = investTransactionLossInfo == null ? 0 : investTransactionLossInfo.hashCode();
        int iHashCode21 = this.fixedApy.hashCode();
        int iHashCode22 = this.maturityTime.hashCode();
        CollateralRatioInfo collateralRatioInfo = this.collateralRatioInfo;
        int iHashCode23 = collateralRatioInfo == null ? 0 : collateralRatioInfo.hashCode();
        List<TransactionStep> list = this.transactionStepList;
        int iHashCode24 = list == null ? 0 : list.hashCode();
        String str4 = this.deadline;
        int iHashCode25 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.settlementTime;
        int iHashCode26 = str5 == null ? 0 : str5.hashCode();
        List<InvestTipInfoVo> list2 = this.productExtInfoList;
        int iHashCode27 = list2 == null ? 0 : list2.hashCode();
        String str6 = this.subscribeCallDataExtInfo;
        int iHashCode28 = str6 == null ? 0 : str6.hashCode();
        PointsInfo pointsInfo = this.pointsInfo;
        int iHashCode29 = pointsInfo == null ? 0 : pointsInfo.hashCode();
        String str7 = this.collateral;
        int iHashCode30 = str7 == null ? 0 : str7.hashCode();
        HeathFactorInfo heathFactorInfo = this.healthFactorInfo;
        int iHashCode31 = heathFactorInfo == null ? 0 : heathFactorInfo.hashCode();
        InvestTokenWithAmount investTokenWithAmount2 = this.borrowFee;
        int iHashCode32 = investTokenWithAmount2 == null ? 0 : investTokenWithAmount2.hashCode();
        String str8 = this.totalGainsCurrencyAmount;
        int iHashCode33 = str8 == null ? 0 : str8.hashCode();
        BoostParameters boostParameters = this.boostParameters;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + (boostParameters == null ? 0 : boostParameters.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAllowSubscribe() {
        return this.isAllowSubscribe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestSubscriptionReceiveInfo(alreadyStakeAmount=" + this.alreadyStakeAmount + ", approveStatusList=" + this.approveStatusList + ", gainsTokenList=" + this.gainsTokenList + ", investWithTokenList=" + this.investWithTokenList + ", isAllowSubscribe=" + this.isAllowSubscribe + ", maxStakeAmount=" + this.maxStakeAmount + ", minimumStakeAmount=" + this.minimumStakeAmount + ", receiveTokenInfo=" + this.receiveTokenInfo + ", swapToTokenList=" + this.swapToTokenList + ", valueDeviationPercentage=" + this.valueDeviationPercentage + ", estimateGasFee=" + this.estimateGasFee + ", tokenInfoList=" + this.tokenInfoList + ", safeMoonTokenList=" + this.safeMoonTokenList + ", exchangeRate=" + this.exchangeRate + ", promptInformation=" + this.promptInformation + ", currentTick=" + this.currentTick + ", currentPrice=" + this.currentPrice + ", feeRate=" + this.feeRate + ", positionStatus=" + this.positionStatus + ", transactionLossInfo=" + this.transactionLossInfo + ", fixedApy=" + this.fixedApy + ", maturityTime=" + this.maturityTime + ", collateralRatioInfo=" + this.collateralRatioInfo + ", transactionStepList=" + this.transactionStepList + ", deadline=" + this.deadline + ", settlementTime=" + this.settlementTime + ", productExtInfoList=" + this.productExtInfoList + ", subscribeCallDataExtInfo=" + this.subscribeCallDataExtInfo + ", pointsInfo=" + this.pointsInfo + ", collateral=" + this.collateral + ", healthFactorInfo=" + this.healthFactorInfo + ", borrowFee=" + this.borrowFee + ", totalGainsCurrencyAmount=" + this.totalGainsCurrencyAmount + ", boostParameters=" + this.boostParameters + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.alreadyStakeAmount);
        List<InvestTokenWithApprove> list = this.approveStatusList;
        parcel.writeInt(list.size());
        Iterator<InvestTokenWithApprove> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        List<InvestTokenWithAmount> list2 = this.gainsTokenList;
        parcel.writeInt(list2.size());
        Iterator<InvestTokenWithAmount> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        List<InvestTokenWithAmount> list3 = this.investWithTokenList;
        parcel.writeInt(list3.size());
        Iterator<InvestTokenWithAmount> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isAllowSubscribe ? 1 : 0);
        parcel.writeString(this.maxStakeAmount);
        parcel.writeString(this.minimumStakeAmount);
        InvestTokenWithAmount investTokenWithAmount = this.receiveTokenInfo;
        if (investTokenWithAmount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTokenWithAmount.writeToParcel(parcel, i);
        }
        List<InvestTokenWithAmount> list4 = this.swapToTokenList;
        parcel.writeInt(list4.size());
        Iterator<InvestTokenWithAmount> it4 = list4.iterator();
        while (it4.hasNext()) {
            it4.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.valueDeviationPercentage);
        parcel.writeString(this.estimateGasFee);
        List<ExpectTokenInfo> list5 = this.tokenInfoList;
        parcel.writeInt(list5.size());
        Iterator<ExpectTokenInfo> it5 = list5.iterator();
        while (it5.hasNext()) {
            it5.next().writeToParcel(parcel, i);
        }
        List<InvestTokenWithAmount> list6 = this.safeMoonTokenList;
        parcel.writeInt(list6.size());
        Iterator<InvestTokenWithAmount> it6 = list6.iterator();
        while (it6.hasNext()) {
            it6.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.exchangeRate);
        PromptInformation promptInformation = this.promptInformation;
        if (promptInformation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promptInformation.writeToParcel(parcel, i);
        }
        Integer num = this.currentTick;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.currentPrice);
        parcel.writeString(this.feeRate);
        parcel.writeString(this.positionStatus);
        InvestTransactionLossInfo investTransactionLossInfo = this.transactionLossInfo;
        if (investTransactionLossInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTransactionLossInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.fixedApy);
        parcel.writeString(this.maturityTime);
        CollateralRatioInfo collateralRatioInfo = this.collateralRatioInfo;
        if (collateralRatioInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            collateralRatioInfo.writeToParcel(parcel, i);
        }
        List<TransactionStep> list7 = this.transactionStepList;
        if (list7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list7.size());
            Iterator<TransactionStep> it7 = list7.iterator();
            while (it7.hasNext()) {
                it7.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.deadline);
        parcel.writeString(this.settlementTime);
        List<InvestTipInfoVo> list8 = this.productExtInfoList;
        if (list8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list8.size());
            Iterator<InvestTipInfoVo> it8 = list8.iterator();
            while (it8.hasNext()) {
                it8.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.subscribeCallDataExtInfo);
        PointsInfo pointsInfo = this.pointsInfo;
        if (pointsInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pointsInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.collateral);
        HeathFactorInfo heathFactorInfo = this.healthFactorInfo;
        if (heathFactorInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            heathFactorInfo.writeToParcel(parcel, i);
        }
        InvestTokenWithAmount investTokenWithAmount2 = this.borrowFee;
        if (investTokenWithAmount2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTokenWithAmount2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.totalGainsCurrencyAmount);
        BoostParameters boostParameters = this.boostParameters;
        if (boostParameters == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            boostParameters.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestSubscriptionReceiveInfo> serializer() {
            return InvestSubscriptionReceiveInfo$$serializer.INSTANCE;
        }
    }

    static {
        InvestTokenWithAmount$$serializer investTokenWithAmount$$serializer = InvestTokenWithAmount$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new ArrayListSerializer(InvestTokenWithApprove$$serializer.INSTANCE), new ArrayListSerializer(investTokenWithAmount$$serializer), new ArrayListSerializer(investTokenWithAmount$$serializer), null, null, null, null, new ArrayListSerializer(investTokenWithAmount$$serializer), null, null, new ArrayListSerializer(ExpectTokenInfo$$serializer.INSTANCE), new ArrayListSerializer(investTokenWithAmount$$serializer), null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(TransactionStep$$serializer.INSTANCE), null, null, new ArrayListSerializer(InvestTipInfoVo$$serializer.INSTANCE), null, null, null, null, null, null, null};
    }

    public /* synthetic */ InvestSubscriptionReceiveInfo(int i, int i2, String str, List list, List list2, List list3, boolean z, String str2, String str3, InvestTokenWithAmount investTokenWithAmount, List list4, String str4, String str5, List list5, List list6, String str6, PromptInformation promptInformation, Integer num, String str7, String str8, String str9, InvestTransactionLossInfo investTransactionLossInfo, String str10, String str11, CollateralRatioInfo collateralRatioInfo, List list7, String str12, String str13, List list8, String str14, PointsInfo pointsInfo, String str15, HeathFactorInfo heathFactorInfo, InvestTokenWithAmount investTokenWithAmount2, String str16, BoostParameters boostParameters, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if ((i & 1) == 0) {
            this.alreadyStakeAmount = "";
        } else {
            this.alreadyStakeAmount = str;
        }
        this.approveStatusList = (i & 2) == 0 ? new ArrayList() : list;
        this.gainsTokenList = (i & 4) == 0 ? new ArrayList() : list2;
        this.investWithTokenList = (i & 8) == 0 ? new ArrayList() : list3;
        this.isAllowSubscribe = (i & 16) == 0 ? true : z;
        if ((i & 32) == 0) {
            this.maxStakeAmount = "";
        } else {
            this.maxStakeAmount = str2;
        }
        if ((i & 64) == 0) {
            this.minimumStakeAmount = "";
        } else {
            this.minimumStakeAmount = str3;
        }
        if ((i & 128) == 0) {
            this.receiveTokenInfo = null;
        } else {
            this.receiveTokenInfo = investTokenWithAmount;
        }
        this.swapToTokenList = (i & 256) == 0 ? new ArrayList() : list4;
        if ((i & 512) == 0) {
            this.valueDeviationPercentage = "";
        } else {
            this.valueDeviationPercentage = str4;
        }
        if ((i & 1024) == 0) {
            this.estimateGasFee = "";
        } else {
            this.estimateGasFee = str5;
        }
        this.tokenInfoList = (i & 2048) == 0 ? new ArrayList() : list5;
        this.safeMoonTokenList = (i & 4096) == 0 ? new ArrayList() : list6;
        if ((i & 8192) == 0) {
            this.exchangeRate = "";
        } else {
            this.exchangeRate = str6;
        }
        if ((i & 16384) == 0) {
            this.promptInformation = null;
        } else {
            this.promptInformation = promptInformation;
        }
        if ((32768 & i) == 0) {
            this.currentTick = null;
        } else {
            this.currentTick = num;
        }
        if ((65536 & i) == 0) {
            this.currentPrice = null;
        } else {
            this.currentPrice = str7;
        }
        if ((131072 & i) == 0) {
            this.feeRate = null;
        } else {
            this.feeRate = str8;
        }
        if ((262144 & i) == 0) {
            this.positionStatus = null;
        } else {
            this.positionStatus = str9;
        }
        if ((524288 & i) == 0) {
            this.transactionLossInfo = null;
        } else {
            this.transactionLossInfo = investTransactionLossInfo;
        }
        if ((1048576 & i) == 0) {
            this.fixedApy = "";
        } else {
            this.fixedApy = str10;
        }
        if ((2097152 & i) == 0) {
            this.maturityTime = "";
        } else {
            this.maturityTime = str11;
        }
        if ((4194304 & i) == 0) {
            this.collateralRatioInfo = null;
        } else {
            this.collateralRatioInfo = collateralRatioInfo;
        }
        if ((8388608 & i) == 0) {
            this.transactionStepList = null;
        } else {
            this.transactionStepList = list7;
        }
        if ((16777216 & i) == 0) {
            this.deadline = null;
        } else {
            this.deadline = str12;
        }
        if ((33554432 & i) == 0) {
            this.settlementTime = null;
        } else {
            this.settlementTime = str13;
        }
        if ((67108864 & i) == 0) {
            this.productExtInfoList = null;
        } else {
            this.productExtInfoList = list8;
        }
        if ((134217728 & i) == 0) {
            this.subscribeCallDataExtInfo = null;
        } else {
            this.subscribeCallDataExtInfo = str14;
        }
        if ((268435456 & i) == 0) {
            this.pointsInfo = null;
        } else {
            this.pointsInfo = pointsInfo;
        }
        if ((536870912 & i) == 0) {
            this.collateral = null;
        } else {
            this.collateral = str15;
        }
        if ((1073741824 & i) == 0) {
            this.healthFactorInfo = null;
        } else {
            this.healthFactorInfo = heathFactorInfo;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.borrowFee = null;
        } else {
            this.borrowFee = investTokenWithAmount2;
        }
        if ((i2 & 1) == 0) {
            this.totalGainsCurrencyAmount = null;
        } else {
            this.totalGainsCurrencyAmount = str16;
        }
        if ((i2 & 2) == 0) {
            this.boostParameters = null;
        } else {
            this.boostParameters = boostParameters;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [121=7] */
    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) investSubscriptionReceiveInfo.alreadyStakeAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, investSubscriptionReceiveInfo.alreadyStakeAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(investSubscriptionReceiveInfo.approveStatusList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], investSubscriptionReceiveInfo.approveStatusList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(investSubscriptionReceiveInfo.gainsTokenList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], investSubscriptionReceiveInfo.gainsTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(investSubscriptionReceiveInfo.investWithTokenList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], investSubscriptionReceiveInfo.investWithTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !investSubscriptionReceiveInfo.isAllowSubscribe) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, investSubscriptionReceiveInfo.isAllowSubscribe);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) investSubscriptionReceiveInfo.maxStakeAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, investSubscriptionReceiveInfo.maxStakeAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) investSubscriptionReceiveInfo.minimumStakeAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, investSubscriptionReceiveInfo.minimumStakeAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || investSubscriptionReceiveInfo.receiveTokenInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, InvestTokenWithAmount$$serializer.INSTANCE, investSubscriptionReceiveInfo.receiveTokenInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(investSubscriptionReceiveInfo.swapToTokenList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], investSubscriptionReceiveInfo.swapToTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) investSubscriptionReceiveInfo.valueDeviationPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, investSubscriptionReceiveInfo.valueDeviationPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) investSubscriptionReceiveInfo.estimateGasFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, investSubscriptionReceiveInfo.estimateGasFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(investSubscriptionReceiveInfo.tokenInfoList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], investSubscriptionReceiveInfo.tokenInfoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd(investSubscriptionReceiveInfo.safeMoonTokenList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], investSubscriptionReceiveInfo.safeMoonTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) investSubscriptionReceiveInfo.exchangeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, investSubscriptionReceiveInfo.exchangeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || investSubscriptionReceiveInfo.promptInformation != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, PromptInformation$$serializer.INSTANCE, investSubscriptionReceiveInfo.promptInformation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || investSubscriptionReceiveInfo.currentTick != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, IntSerializer.INSTANCE, investSubscriptionReceiveInfo.currentTick);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || investSubscriptionReceiveInfo.currentPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, investSubscriptionReceiveInfo.currentPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || investSubscriptionReceiveInfo.feeRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, investSubscriptionReceiveInfo.feeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || investSubscriptionReceiveInfo.positionStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, investSubscriptionReceiveInfo.positionStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || investSubscriptionReceiveInfo.transactionLossInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, InvestTransactionLossInfo$$serializer.INSTANCE, investSubscriptionReceiveInfo.transactionLossInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) investSubscriptionReceiveInfo.fixedApy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, investSubscriptionReceiveInfo.fixedApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) investSubscriptionReceiveInfo.maturityTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, investSubscriptionReceiveInfo.maturityTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || investSubscriptionReceiveInfo.collateralRatioInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, CollateralRatioInfo$$serializer.INSTANCE, investSubscriptionReceiveInfo.collateralRatioInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || investSubscriptionReceiveInfo.transactionStepList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, kSerializerArr[23], investSubscriptionReceiveInfo.transactionStepList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || investSubscriptionReceiveInfo.deadline != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, investSubscriptionReceiveInfo.deadline);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || investSubscriptionReceiveInfo.settlementTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, investSubscriptionReceiveInfo.settlementTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || investSubscriptionReceiveInfo.productExtInfoList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, kSerializerArr[26], investSubscriptionReceiveInfo.productExtInfoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || investSubscriptionReceiveInfo.subscribeCallDataExtInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, StringSerializer.INSTANCE, investSubscriptionReceiveInfo.subscribeCallDataExtInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || investSubscriptionReceiveInfo.pointsInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, PointsInfo$$serializer.INSTANCE, investSubscriptionReceiveInfo.pointsInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || investSubscriptionReceiveInfo.collateral != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, investSubscriptionReceiveInfo.collateral);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || investSubscriptionReceiveInfo.healthFactorInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, HeathFactorInfo$$serializer.INSTANCE, investSubscriptionReceiveInfo.healthFactorInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || investSubscriptionReceiveInfo.borrowFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, InvestTokenWithAmount$$serializer.INSTANCE, investSubscriptionReceiveInfo.borrowFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || investSubscriptionReceiveInfo.totalGainsCurrencyAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, StringSerializer.INSTANCE, investSubscriptionReceiveInfo.totalGainsCurrencyAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) && investSubscriptionReceiveInfo.boostParameters == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, BoostParameters$$serializer.INSTANCE, investSubscriptionReceiveInfo.boostParameters);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01a9: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r69v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r69v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0012: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:130) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r36v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0018: ARITH (r69v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001e: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:132) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r37v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0024: ARITH (r69v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002a: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:135) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r38v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0030: ARITH (r69v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r39v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r69v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r69v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.models.InvestTokenWithAmount:?: TERNARY null = ((wrap:int:0x0048: ARITH (r69v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.models.InvestTokenWithAmount) : (r42v0 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0050: ARITH (r69v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0056: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:150) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r43v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r69v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r69v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x006c: ARITH (r69v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0072: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:158) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r46v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0078: ARITH (r69v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x007e: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:160) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r47v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0084: ARITH (r69v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.PromptInformation:?: TERNARY null = ((wrap:int:0x008e: ARITH (r69v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.PromptInformation) : (r49v0 com.okinc.business.invest_biz.data.bean.PromptInformation))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0099: ARITH (r69v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r50v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a4: ARITH (r69v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00af: ARITH (r69v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ba: ARITH (r69v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r53v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo:?: TERNARY null = ((wrap:int:0x00c5: ARITH (r69v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo) : (r54v0 com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d0: ARITH (r69v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00db: ARITH (r69v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.CollateralRatioInfo:?: TERNARY null = ((wrap:int:0x00e6: ARITH (r69v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.CollateralRatioInfo) : (r57v0 com.okinc.business.invest_biz.data.bean.CollateralRatioInfo))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00f1: ARITH (r69v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r58v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fc: ARITH (r69v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0107: ARITH (r69v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r60v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0112: ARITH (r69v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r61v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011d: ARITH (r69v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r62v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.PointsInfo:?: TERNARY null = ((wrap:int:0x0128: ARITH (r69v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.PointsInfo) : (r63v0 com.okinc.business.invest_biz.data.bean.PointsInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0133: ARITH (r69v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r64v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.HeathFactorInfo:?: TERNARY null = ((wrap:int:0x013e: ARITH (r69v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.HeathFactorInfo) : (r65v0 com.okinc.business.invest_biz.data.bean.HeathFactorInfo))
  (wrap:com.okinc.business.invest_biz.data.models.InvestTokenWithAmount:?: TERNARY null = ((wrap:int:0x0149: ARITH (r69v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.models.InvestTokenWithAmount) : (r66v0 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0151: ARITH (r70v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r67v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.BoostParameters:?: TERNARY null = ((wrap:int:0x015a: ARITH (r70v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.BoostParameters) : (r68v0 com.okinc.business.invest_biz.data.bean.BoostParameters))
 A[MD:(java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.InvestTokenWithApprove>, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, boolean, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.ExpectTokenInfo>, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, java.lang.String, com.okinc.business.invest_biz.data.bean.PromptInformation, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.CollateralRatioInfo, java.util.List<com.okinc.business.invest_biz.data.bean.response.TransactionStep>, java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.InvestTipInfoVo>, java.lang.String, com.okinc.business.invest_biz.data.bean.PointsInfo, java.lang.String, com.okinc.business.invest_biz.data.bean.HeathFactorInfo, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, java.lang.String, com.okinc.business.invest_biz.data.bean.BoostParameters):void (m)] (LINE:124) call: com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfo.<init>(java.lang.String, java.util.List, java.util.List, java.util.List, boolean, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, java.util.List, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, com.okinc.business.invest_biz.data.bean.PromptInformation, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.CollateralRatioInfo, java.util.List, java.lang.String, java.lang.String, java.util.List, java.lang.String, com.okinc.business.invest_biz.data.bean.PointsInfo, java.lang.String, com.okinc.business.invest_biz.data.bean.HeathFactorInfo, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, java.lang.String, com.okinc.business.invest_biz.data.bean.BoostParameters):void type: THIS */
    public /* synthetic */ InvestSubscriptionReceiveInfo(String str, List list, List list2, List list3, boolean z, String str2, String str3, InvestTokenWithAmount investTokenWithAmount, List list4, String str4, String str5, List list5, List list6, String str6, PromptInformation promptInformation, Integer num, String str7, String str8, String str9, InvestTransactionLossInfo investTransactionLossInfo, String str10, String str11, CollateralRatioInfo collateralRatioInfo, List list7, String str12, String str13, List list8, String str14, PointsInfo pointsInfo, String str15, HeathFactorInfo heathFactorInfo, InvestTokenWithAmount investTokenWithAmount2, String str16, BoostParameters boostParameters, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? new ArrayList() : list2, (i & 8) != 0 ? new ArrayList() : list3, (i & 16) != 0 ? true : z, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? null : investTokenWithAmount, (i & 256) != 0 ? new ArrayList() : list4, (i & 512) != 0 ? "" : str4, (i & 1024) != 0 ? "" : str5, (i & 2048) != 0 ? new ArrayList() : list5, (i & 4096) != 0 ? new ArrayList() : list6, (i & 8192) != 0 ? "" : str6, (i & 16384) != 0 ? null : promptInformation, (i & 32768) != 0 ? null : num, (i & 65536) != 0 ? null : str7, (i & 131072) != 0 ? null : str8, (i & 262144) != 0 ? null : str9, (i & 524288) != 0 ? null : investTransactionLossInfo, (i & 1048576) != 0 ? "" : str10, (i & 2097152) != 0 ? "" : str11, (i & 4194304) != 0 ? null : collateralRatioInfo, (i & 8388608) != 0 ? null : list7, (i & 16777216) != 0 ? null : str12, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str13, (i & 67108864) != 0 ? null : list8, (i & 134217728) != 0 ? null : str14, (i & 268435456) != 0 ? null : pointsInfo, (i & 536870912) != 0 ? null : str15, (i & 1073741824) != 0 ? null : heathFactorInfo, (i & Integer.MIN_VALUE) != 0 ? null : investTokenWithAmount2, (i2 & 1) != 0 ? null : str16, (i2 & 2) != 0 ? null : boostParameters);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestSubscriptionReceiveInfo(@NotNull String str, @NotNull List<InvestTokenWithApprove> list, @NotNull List<InvestTokenWithAmount> list2, @NotNull List<InvestTokenWithAmount> list3, boolean z, @NotNull String str2, @NotNull String str3, InvestTokenWithAmount investTokenWithAmount, @NotNull List<InvestTokenWithAmount> list4, @NotNull String str4, @NotNull String str5, @NotNull List<ExpectTokenInfo> list5, @NotNull List<InvestTokenWithAmount> list6, @NotNull String str6, PromptInformation promptInformation, Integer num, String str7, String str8, String str9, InvestTransactionLossInfo investTransactionLossInfo, @NotNull String str10, @NotNull String str11, CollateralRatioInfo collateralRatioInfo, List<TransactionStep> list7, String str12, String str13, List<InvestTipInfoVo> list8, String str14, PointsInfo pointsInfo, String str15, HeathFactorInfo heathFactorInfo, InvestTokenWithAmount investTokenWithAmount2, String str16, BoostParameters boostParameters) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(list6, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.alreadyStakeAmount = str;
        this.approveStatusList = list;
        this.gainsTokenList = list2;
        this.investWithTokenList = list3;
        this.isAllowSubscribe = z;
        this.maxStakeAmount = str2;
        this.minimumStakeAmount = str3;
        this.receiveTokenInfo = investTokenWithAmount;
        this.swapToTokenList = list4;
        this.valueDeviationPercentage = str4;
        this.estimateGasFee = str5;
        this.tokenInfoList = list5;
        this.safeMoonTokenList = list6;
        this.exchangeRate = str6;
        this.promptInformation = promptInformation;
        this.currentTick = num;
        this.currentPrice = str7;
        this.feeRate = str8;
        this.positionStatus = str9;
        this.transactionLossInfo = investTransactionLossInfo;
        this.fixedApy = str10;
        this.maturityTime = str11;
        this.collateralRatioInfo = collateralRatioInfo;
        this.transactionStepList = list7;
        this.deadline = str12;
        this.settlementTime = str13;
        this.productExtInfoList = list8;
        this.subscribeCallDataExtInfo = str14;
        this.pointsInfo = pointsInfo;
        this.collateral = str15;
        this.healthFactorInfo = heathFactorInfo;
        this.borrowFee = investTokenWithAmount2;
        this.totalGainsCurrencyAmount = str16;
        this.boostParameters = boostParameters;
    }
}
