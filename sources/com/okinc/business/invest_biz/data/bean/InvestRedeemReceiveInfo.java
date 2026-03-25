package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.AbstractC25546iyk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestRedeemReceiveInfo extends AbstractC25546iyk implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<InvestTokenWithApprove> approveStatusList;
    private final BorrowedInfo borrowed;
    private final String collateral;
    private final CollateralRatioInfo collateralRatioInfo;
    private final String estimateGasFee;
    private final String exchangeRate;
    private final InvestTokenWithAmount extraRedemptionFee;
    private final HeathFactorInfo healthFactorInfo;
    private final String inputCurrencyAmount;
    private final boolean isAllowRedeem;
    private final String maxRedeemAmount;
    private final String minimumRedeemAmount;
    private final InvestTokenWithAmount mySupply;
    private final InvestTokenWithAmount payWithToken;
    private final PromptInformation promptInformation;
    private final List<InvestTokenWithAmount> receiveTokenList;
    private final RemainingRepaymentInfo remainingRepaymentInfo;
    private final boolean rewardNeedApprove;
    private final List<InvestTokenWithAmount> safeMoonTokenList;
    private final List<InvestTokenWithAmount> swapFromTokenList;
    private final List<ExpectTokenInfo> tokenInfoList;
    private final List<TransactionStep> transactionStepList;
    private final String valueDeviationPercentage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestRedeemReceiveInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestRedeemReceiveInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestRedeemReceiveInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(InvestTokenWithApprove.CREATOR.createFromParcel(parcel));
            }
            String string = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
            }
            boolean z = parcel.readInt() != 0;
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList3.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
            }
            InvestTokenWithAmount investTokenWithAmountCreateFromParcel = InvestTokenWithAmount.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i7 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i7);
            for (int i8 = 0; i8 != i7; i8++) {
                arrayList4.add(ExpectTokenInfo.CREATOR.createFromParcel(parcel));
            }
            boolean z2 = parcel.readInt() != 0;
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i9 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i9);
            int i10 = 0;
            while (i10 != i9) {
                arrayList5.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
                i10++;
                i9 = i9;
            }
            PromptInformation promptInformationCreateFromParcel = parcel.readInt() == 0 ? null : PromptInformation.CREATOR.createFromParcel(parcel);
            InvestTokenWithAmount investTokenWithAmountCreateFromParcel2 = parcel.readInt() == 0 ? null : InvestTokenWithAmount.CREATOR.createFromParcel(parcel);
            RemainingRepaymentInfo remainingRepaymentInfoCreateFromParcel = parcel.readInt() == 0 ? null : RemainingRepaymentInfo.CREATOR.createFromParcel(parcel);
            CollateralRatioInfo collateralRatioInfoCreateFromParcel = parcel.readInt() == 0 ? null : CollateralRatioInfo.CREATOR.createFromParcel(parcel);
            InvestTokenWithAmount investTokenWithAmountCreateFromParcel3 = parcel.readInt() == 0 ? null : InvestTokenWithAmount.CREATOR.createFromParcel(parcel);
            int i11 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(i11);
            int i12 = 0;
            while (i12 != i11) {
                arrayList6.add(TransactionStep.CREATOR.createFromParcel(parcel));
                i12++;
                i11 = i11;
            }
            return new InvestRedeemReceiveInfo(arrayList, string, arrayList2, z, arrayList3, investTokenWithAmountCreateFromParcel, string2, string3, arrayList4, z2, string4, string5, string6, arrayList5, promptInformationCreateFromParcel, investTokenWithAmountCreateFromParcel2, remainingRepaymentInfoCreateFromParcel, collateralRatioInfoCreateFromParcel, investTokenWithAmountCreateFromParcel3, arrayList6, parcel.readString(), parcel.readInt() == 0 ? null : HeathFactorInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BorrowedInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestRedeemReceiveInfo[] newArray(int i) {
            return new InvestRedeemReceiveInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestRedeemReceiveInfo() {
        this((List) null, (String) null, (List) null, false, (List) null, (InvestTokenWithAmount) null, (String) null, (String) null, (List) null, false, (String) null, (String) null, (String) null, (List) null, (PromptInformation) null, (InvestTokenWithAmount) null, (RemainingRepaymentInfo) null, (CollateralRatioInfo) null, (InvestTokenWithAmount) null, (List) null, (String) null, (HeathFactorInfo) null, (BorrowedInfo) null, 8388607, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithApprove> component1() {
        return this.approveStatusList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.isAllowRedeem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.maxRedeemAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.minimumRedeemAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.exchangeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component14() {
        return this.safeMoonTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PromptInformation component15() {
        return this.promptInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount component16() {
        return this.payWithToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RemainingRepaymentInfo component17() {
        return this.remainingRepaymentInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CollateralRatioInfo component18() {
        return this.collateralRatioInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount component19() {
        return this.extraRedemptionFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.inputCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TransactionStep> component20() {
        return this.transactionStepList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.collateral;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HeathFactorInfo component22() {
        return this.healthFactorInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BorrowedInfo component23() {
        return this.borrowed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component3() {
        return this.receiveTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.rewardNeedApprove;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component5() {
        return this.swapFromTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount component6() {
        return this.mySupply;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.valueDeviationPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.estimateGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ExpectTokenInfo> component9() {
        return this.tokenInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestRedeemReceiveInfo copy(@NotNull List<InvestTokenWithApprove> list, @NotNull String str, @NotNull List<InvestTokenWithAmount> list2, boolean z, @NotNull List<InvestTokenWithAmount> list3, @NotNull InvestTokenWithAmount investTokenWithAmount, @NotNull String str2, @NotNull String str3, @NotNull List<ExpectTokenInfo> list4, boolean z2, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<InvestTokenWithAmount> list5, PromptInformation promptInformation, InvestTokenWithAmount investTokenWithAmount2, RemainingRepaymentInfo remainingRepaymentInfo, CollateralRatioInfo collateralRatioInfo, InvestTokenWithAmount investTokenWithAmount3, @NotNull List<TransactionStep> list6, String str7, HeathFactorInfo heathFactorInfo, BorrowedInfo borrowedInfo) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(list6, "");
        return new InvestRedeemReceiveInfo(list, str, list2, z, list3, investTokenWithAmount, str2, str3, list4, z2, str4, str5, str6, list5, promptInformation, investTokenWithAmount2, remainingRepaymentInfo, collateralRatioInfo, investTokenWithAmount3, list6, str7, heathFactorInfo, borrowedInfo);
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
        if (!(obj instanceof InvestRedeemReceiveInfo)) {
            return false;
        }
        InvestRedeemReceiveInfo investRedeemReceiveInfo = (InvestRedeemReceiveInfo) obj;
        return Intrinsics.EZpvd(this.approveStatusList, investRedeemReceiveInfo.approveStatusList) && Intrinsics.EZpvd((Object) this.inputCurrencyAmount, (Object) investRedeemReceiveInfo.inputCurrencyAmount) && Intrinsics.EZpvd(this.receiveTokenList, investRedeemReceiveInfo.receiveTokenList) && this.rewardNeedApprove == investRedeemReceiveInfo.rewardNeedApprove && Intrinsics.EZpvd(this.swapFromTokenList, investRedeemReceiveInfo.swapFromTokenList) && Intrinsics.EZpvd(this.mySupply, investRedeemReceiveInfo.mySupply) && Intrinsics.EZpvd((Object) this.valueDeviationPercentage, (Object) investRedeemReceiveInfo.valueDeviationPercentage) && Intrinsics.EZpvd((Object) this.estimateGasFee, (Object) investRedeemReceiveInfo.estimateGasFee) && Intrinsics.EZpvd(this.tokenInfoList, investRedeemReceiveInfo.tokenInfoList) && this.isAllowRedeem == investRedeemReceiveInfo.isAllowRedeem && Intrinsics.EZpvd((Object) this.maxRedeemAmount, (Object) investRedeemReceiveInfo.maxRedeemAmount) && Intrinsics.EZpvd((Object) this.minimumRedeemAmount, (Object) investRedeemReceiveInfo.minimumRedeemAmount) && Intrinsics.EZpvd((Object) this.exchangeRate, (Object) investRedeemReceiveInfo.exchangeRate) && Intrinsics.EZpvd(this.safeMoonTokenList, investRedeemReceiveInfo.safeMoonTokenList) && Intrinsics.EZpvd(this.promptInformation, investRedeemReceiveInfo.promptInformation) && Intrinsics.EZpvd(this.payWithToken, investRedeemReceiveInfo.payWithToken) && Intrinsics.EZpvd(this.remainingRepaymentInfo, investRedeemReceiveInfo.remainingRepaymentInfo) && Intrinsics.EZpvd(this.collateralRatioInfo, investRedeemReceiveInfo.collateralRatioInfo) && Intrinsics.EZpvd(this.extraRedemptionFee, investRedeemReceiveInfo.extraRedemptionFee) && Intrinsics.EZpvd(this.transactionStepList, investRedeemReceiveInfo.transactionStepList) && Intrinsics.EZpvd((Object) this.collateral, (Object) investRedeemReceiveInfo.collateral) && Intrinsics.EZpvd(this.healthFactorInfo, investRedeemReceiveInfo.healthFactorInfo) && Intrinsics.EZpvd(this.borrowed, investRedeemReceiveInfo.borrowed);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithApprove> getApproveStatusList() {
        return this.approveStatusList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BorrowedInfo getBorrowed() {
        return this.borrowed;
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
    public final String getEstimateGasFee() {
        return this.estimateGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExchangeRate() {
        return this.exchangeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount getExtraRedemptionFee() {
        return this.extraRedemptionFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HeathFactorInfo getHealthFactorInfo() {
        return this.healthFactorInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInputCurrencyAmount() {
        return this.inputCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxRedeemAmount() {
        return this.maxRedeemAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinimumRedeemAmount() {
        return this.minimumRedeemAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount getMySupply() {
        return this.mySupply;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount getPayWithToken() {
        return this.payWithToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PromptInformation getPromptInformation() {
        return this.promptInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> getReceiveTokenList() {
        return this.receiveTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RemainingRepaymentInfo getRemainingRepaymentInfo() {
        return this.remainingRepaymentInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getRewardNeedApprove() {
        return this.rewardNeedApprove;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> getSafeMoonTokenList() {
        return this.safeMoonTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> getSwapFromTokenList() {
        return this.swapFromTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ExpectTokenInfo> getTokenInfoList() {
        return this.tokenInfoList;
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
        int iHashCode = this.approveStatusList.hashCode();
        int iHashCode2 = this.inputCurrencyAmount.hashCode();
        int iHashCode3 = this.receiveTokenList.hashCode();
        int iHashCode4 = Boolean.hashCode(this.rewardNeedApprove);
        int iHashCode5 = this.swapFromTokenList.hashCode();
        int iHashCode6 = this.mySupply.hashCode();
        int iHashCode7 = this.valueDeviationPercentage.hashCode();
        int iHashCode8 = this.estimateGasFee.hashCode();
        int iHashCode9 = this.tokenInfoList.hashCode();
        int iHashCode10 = Boolean.hashCode(this.isAllowRedeem);
        int iHashCode11 = this.maxRedeemAmount.hashCode();
        int iHashCode12 = this.minimumRedeemAmount.hashCode();
        int iHashCode13 = this.exchangeRate.hashCode();
        int iHashCode14 = this.safeMoonTokenList.hashCode();
        PromptInformation promptInformation = this.promptInformation;
        int iHashCode15 = promptInformation == null ? 0 : promptInformation.hashCode();
        InvestTokenWithAmount investTokenWithAmount = this.payWithToken;
        int iHashCode16 = investTokenWithAmount == null ? 0 : investTokenWithAmount.hashCode();
        RemainingRepaymentInfo remainingRepaymentInfo = this.remainingRepaymentInfo;
        int iHashCode17 = remainingRepaymentInfo == null ? 0 : remainingRepaymentInfo.hashCode();
        CollateralRatioInfo collateralRatioInfo = this.collateralRatioInfo;
        int iHashCode18 = collateralRatioInfo == null ? 0 : collateralRatioInfo.hashCode();
        InvestTokenWithAmount investTokenWithAmount2 = this.extraRedemptionFee;
        int iHashCode19 = investTokenWithAmount2 == null ? 0 : investTokenWithAmount2.hashCode();
        int iHashCode20 = this.transactionStepList.hashCode();
        String str = this.collateral;
        int iHashCode21 = str == null ? 0 : str.hashCode();
        HeathFactorInfo heathFactorInfo = this.healthFactorInfo;
        int iHashCode22 = heathFactorInfo == null ? 0 : heathFactorInfo.hashCode();
        BorrowedInfo borrowedInfo = this.borrowed;
        return (((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + (borrowedInfo != null ? borrowedInfo.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAllowRedeem() {
        return this.isAllowRedeem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestRedeemReceiveInfo(approveStatusList=" + this.approveStatusList + ", inputCurrencyAmount=" + this.inputCurrencyAmount + ", receiveTokenList=" + this.receiveTokenList + ", rewardNeedApprove=" + this.rewardNeedApprove + ", swapFromTokenList=" + this.swapFromTokenList + ", mySupply=" + this.mySupply + ", valueDeviationPercentage=" + this.valueDeviationPercentage + ", estimateGasFee=" + this.estimateGasFee + ", tokenInfoList=" + this.tokenInfoList + ", isAllowRedeem=" + this.isAllowRedeem + ", maxRedeemAmount=" + this.maxRedeemAmount + ", minimumRedeemAmount=" + this.minimumRedeemAmount + ", exchangeRate=" + this.exchangeRate + ", safeMoonTokenList=" + this.safeMoonTokenList + ", promptInformation=" + this.promptInformation + ", payWithToken=" + this.payWithToken + ", remainingRepaymentInfo=" + this.remainingRepaymentInfo + ", collateralRatioInfo=" + this.collateralRatioInfo + ", extraRedemptionFee=" + this.extraRedemptionFee + ", transactionStepList=" + this.transactionStepList + ", collateral=" + this.collateral + ", healthFactorInfo=" + this.healthFactorInfo + ", borrowed=" + this.borrowed + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<InvestTokenWithApprove> list = this.approveStatusList;
        parcel.writeInt(list.size());
        Iterator<InvestTokenWithApprove> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.inputCurrencyAmount);
        List<InvestTokenWithAmount> list2 = this.receiveTokenList;
        parcel.writeInt(list2.size());
        Iterator<InvestTokenWithAmount> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.rewardNeedApprove ? 1 : 0);
        List<InvestTokenWithAmount> list3 = this.swapFromTokenList;
        parcel.writeInt(list3.size());
        Iterator<InvestTokenWithAmount> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        this.mySupply.writeToParcel(parcel, i);
        parcel.writeString(this.valueDeviationPercentage);
        parcel.writeString(this.estimateGasFee);
        List<ExpectTokenInfo> list4 = this.tokenInfoList;
        parcel.writeInt(list4.size());
        Iterator<ExpectTokenInfo> it4 = list4.iterator();
        while (it4.hasNext()) {
            it4.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isAllowRedeem ? 1 : 0);
        parcel.writeString(this.maxRedeemAmount);
        parcel.writeString(this.minimumRedeemAmount);
        parcel.writeString(this.exchangeRate);
        List<InvestTokenWithAmount> list5 = this.safeMoonTokenList;
        parcel.writeInt(list5.size());
        Iterator<InvestTokenWithAmount> it5 = list5.iterator();
        while (it5.hasNext()) {
            it5.next().writeToParcel(parcel, i);
        }
        PromptInformation promptInformation = this.promptInformation;
        if (promptInformation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promptInformation.writeToParcel(parcel, i);
        }
        InvestTokenWithAmount investTokenWithAmount = this.payWithToken;
        if (investTokenWithAmount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTokenWithAmount.writeToParcel(parcel, i);
        }
        RemainingRepaymentInfo remainingRepaymentInfo = this.remainingRepaymentInfo;
        if (remainingRepaymentInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            remainingRepaymentInfo.writeToParcel(parcel, i);
        }
        CollateralRatioInfo collateralRatioInfo = this.collateralRatioInfo;
        if (collateralRatioInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            collateralRatioInfo.writeToParcel(parcel, i);
        }
        InvestTokenWithAmount investTokenWithAmount2 = this.extraRedemptionFee;
        if (investTokenWithAmount2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTokenWithAmount2.writeToParcel(parcel, i);
        }
        List<TransactionStep> list6 = this.transactionStepList;
        parcel.writeInt(list6.size());
        Iterator<TransactionStep> it6 = list6.iterator();
        while (it6.hasNext()) {
            it6.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.collateral);
        HeathFactorInfo heathFactorInfo = this.healthFactorInfo;
        if (heathFactorInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            heathFactorInfo.writeToParcel(parcel, i);
        }
        BorrowedInfo borrowedInfo = this.borrowed;
        if (borrowedInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            borrowedInfo.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestRedeemReceiveInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestRedeemReceiveInfo> serializer() {
            return InvestRedeemReceiveInfo$$serializer.INSTANCE;
        }
    }

    static {
        InvestTokenWithAmount$$serializer investTokenWithAmount$$serializer = InvestTokenWithAmount$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(InvestTokenWithApprove$$serializer.INSTANCE), null, new ArrayListSerializer(investTokenWithAmount$$serializer), null, new ArrayListSerializer(investTokenWithAmount$$serializer), null, null, null, new ArrayListSerializer(ExpectTokenInfo$$serializer.INSTANCE), null, null, null, null, new ArrayListSerializer(investTokenWithAmount$$serializer), null, null, null, null, null, new ArrayListSerializer(TransactionStep$$serializer.INSTANCE), null, null, null};
    }

    public /* synthetic */ InvestRedeemReceiveInfo(int i, List list, String str, List list2, boolean z, List list3, InvestTokenWithAmount investTokenWithAmount, String str2, String str3, List list4, boolean z2, String str4, String str5, String str6, List list5, PromptInformation promptInformation, InvestTokenWithAmount investTokenWithAmount2, RemainingRepaymentInfo remainingRepaymentInfo, CollateralRatioInfo collateralRatioInfo, InvestTokenWithAmount investTokenWithAmount3, List list6, String str7, HeathFactorInfo heathFactorInfo, BorrowedInfo borrowedInfo, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        this.approveStatusList = (i & 1) == 0 ? new ArrayList() : list;
        if ((i & 2) == 0) {
            this.inputCurrencyAmount = "";
        } else {
            this.inputCurrencyAmount = str;
        }
        this.receiveTokenList = (i & 4) == 0 ? new ArrayList() : list2;
        this.rewardNeedApprove = (i & 8) == 0 ? false : z;
        this.swapFromTokenList = (i & 16) == 0 ? new ArrayList() : list3;
        this.mySupply = (i & 32) == 0 ? new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null) : investTokenWithAmount;
        if ((i & 64) == 0) {
            this.valueDeviationPercentage = "";
        } else {
            this.valueDeviationPercentage = str2;
        }
        if ((i & 128) == 0) {
            this.estimateGasFee = "";
        } else {
            this.estimateGasFee = str3;
        }
        this.tokenInfoList = (i & 256) == 0 ? new ArrayList() : list4;
        this.isAllowRedeem = (i & 512) == 0 ? true : z2;
        if ((i & 1024) == 0) {
            this.maxRedeemAmount = "";
        } else {
            this.maxRedeemAmount = str4;
        }
        if ((i & 2048) == 0) {
            this.minimumRedeemAmount = "";
        } else {
            this.minimumRedeemAmount = str5;
        }
        if ((i & 4096) == 0) {
            this.exchangeRate = "";
        } else {
            this.exchangeRate = str6;
        }
        this.safeMoonTokenList = (i & 8192) == 0 ? new ArrayList() : list5;
        if ((i & 16384) == 0) {
            this.promptInformation = null;
        } else {
            this.promptInformation = promptInformation;
        }
        if ((32768 & i) == 0) {
            this.payWithToken = null;
        } else {
            this.payWithToken = investTokenWithAmount2;
        }
        if ((65536 & i) == 0) {
            this.remainingRepaymentInfo = null;
        } else {
            this.remainingRepaymentInfo = remainingRepaymentInfo;
        }
        if ((131072 & i) == 0) {
            this.collateralRatioInfo = null;
        } else {
            this.collateralRatioInfo = collateralRatioInfo;
        }
        if ((262144 & i) == 0) {
            this.extraRedemptionFee = null;
        } else {
            this.extraRedemptionFee = investTokenWithAmount3;
        }
        this.transactionStepList = (524288 & i) == 0 ? new ArrayList() : list6;
        if ((1048576 & i) == 0) {
            this.collateral = null;
        } else {
            this.collateral = str7;
        }
        if ((2097152 & i) == 0) {
            this.healthFactorInfo = null;
        } else {
            this.healthFactorInfo = heathFactorInfo;
        }
        if ((i & 4194304) == 0) {
            this.borrowed = null;
        } else {
            this.borrowed = borrowedInfo;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [850=8] */
    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestRedeemReceiveInfo investRedeemReceiveInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(investRedeemReceiveInfo.approveStatusList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], investRedeemReceiveInfo.approveStatusList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) investRedeemReceiveInfo.inputCurrencyAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, investRedeemReceiveInfo.inputCurrencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(investRedeemReceiveInfo.receiveTokenList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], investRedeemReceiveInfo.receiveTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investRedeemReceiveInfo.rewardNeedApprove) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, investRedeemReceiveInfo.rewardNeedApprove);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(investRedeemReceiveInfo.swapFromTokenList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], investRedeemReceiveInfo.swapFromTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(investRedeemReceiveInfo.mySupply, new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, InvestTokenWithAmount$$serializer.INSTANCE, investRedeemReceiveInfo.mySupply);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) investRedeemReceiveInfo.valueDeviationPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, investRedeemReceiveInfo.valueDeviationPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) investRedeemReceiveInfo.estimateGasFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, investRedeemReceiveInfo.estimateGasFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(investRedeemReceiveInfo.tokenInfoList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], investRedeemReceiveInfo.tokenInfoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !investRedeemReceiveInfo.isAllowRedeem) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, investRedeemReceiveInfo.isAllowRedeem);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) investRedeemReceiveInfo.maxRedeemAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, investRedeemReceiveInfo.maxRedeemAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) investRedeemReceiveInfo.minimumRedeemAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, investRedeemReceiveInfo.minimumRedeemAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) investRedeemReceiveInfo.exchangeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, investRedeemReceiveInfo.exchangeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd(investRedeemReceiveInfo.safeMoonTokenList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 13, kSerializerArr[13], investRedeemReceiveInfo.safeMoonTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || investRedeemReceiveInfo.promptInformation != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, PromptInformation$$serializer.INSTANCE, investRedeemReceiveInfo.promptInformation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || investRedeemReceiveInfo.payWithToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, InvestTokenWithAmount$$serializer.INSTANCE, investRedeemReceiveInfo.payWithToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || investRedeemReceiveInfo.remainingRepaymentInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, RemainingRepaymentInfo$$serializer.INSTANCE, investRedeemReceiveInfo.remainingRepaymentInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || investRedeemReceiveInfo.collateralRatioInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, CollateralRatioInfo$$serializer.INSTANCE, investRedeemReceiveInfo.collateralRatioInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || investRedeemReceiveInfo.extraRedemptionFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, InvestTokenWithAmount$$serializer.INSTANCE, investRedeemReceiveInfo.extraRedemptionFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd(investRedeemReceiveInfo.transactionStepList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 19, kSerializerArr[19], investRedeemReceiveInfo.transactionStepList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || investRedeemReceiveInfo.collateral != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, investRedeemReceiveInfo.collateral);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || investRedeemReceiveInfo.healthFactorInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, HeathFactorInfo$$serializer.INSTANCE, investRedeemReceiveInfo.healthFactorInfo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) && investRedeemReceiveInfo.borrowed == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, BorrowedInfo$$serializer.INSTANCE, investRedeemReceiveInfo.borrowed);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0159: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r64v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:854) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r41v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r64v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0018: ARITH (r64v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001e: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:856) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r43v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r64v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r44v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002c: ARITH (r64v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0032: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:858) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r45v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.models.InvestTokenWithAmount:?: TERNARY null = ((wrap:int:0x0038: ARITH (r64v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0077: CONSTRUCTOR 
  (0 long)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  false
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.Integer:?: CAST (java.lang.Integer) (null java.lang.Integer))
  (wrap:com.okinc.business.invest_biz.data.bean.ButtonType:?: CAST (com.okinc.business.invest_biz.data.bean.ButtonType) (null com.okinc.business.invest_biz.data.bean.ButtonType))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTokenType:?: CAST (com.okinc.business.invest_biz.data.bean.InvestTokenType) (null com.okinc.business.invest_biz.data.bean.InvestTokenType))
  (wrap:java.lang.Long:?: CAST (java.lang.Long) (null java.lang.Long))
  (wrap:java.lang.Long:?: CAST (java.lang.Long) (null java.lang.Long))
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.Long:?: CAST (java.lang.Long) (null java.lang.Long))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (268435455 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(long, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.okinc.business.invest_biz.data.bean.ButtonType, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestTokenType, java.lang.Long, java.lang.Long, int, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:859) call: com.okinc.business.invest_biz.data.models.InvestTokenWithAmount.<init>(long, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.okinc.business.invest_biz.data.bean.ButtonType, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestTokenType, java.lang.Long, java.lang.Long, int, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r46v0 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r64v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0085: ARITH (r64v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x008d: ARITH (r64v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0093: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:862) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r49v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0099: ARITH (r64v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? true : (r50v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a1: ARITH (r64v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r64v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b1: ARITH (r64v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r53v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00b8: ARITH (r64v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00be: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:867) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r54v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.bean.PromptInformation:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r64v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.PromptInformation) : (r55v0 com.okinc.business.invest_biz.data.bean.PromptInformation))
  (wrap:com.okinc.business.invest_biz.data.models.InvestTokenWithAmount:?: TERNARY null = ((wrap:int:0x00d2: ARITH (r64v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.models.InvestTokenWithAmount) : (r56v0 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount))
  (wrap:com.okinc.business.invest_biz.data.bean.RemainingRepaymentInfo:?: TERNARY null = ((wrap:int:0x00dd: ARITH (r64v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.RemainingRepaymentInfo) : (r57v0 com.okinc.business.invest_biz.data.bean.RemainingRepaymentInfo))
  (wrap:com.okinc.business.invest_biz.data.bean.CollateralRatioInfo:?: TERNARY null = ((wrap:int:0x00e8: ARITH (r64v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.CollateralRatioInfo) : (r58v0 com.okinc.business.invest_biz.data.bean.CollateralRatioInfo))
  (wrap:com.okinc.business.invest_biz.data.models.InvestTokenWithAmount:?: TERNARY null = ((wrap:int:0x00f3: ARITH (r64v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.models.InvestTokenWithAmount) : (r59v0 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00fe: ARITH (r64v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0104: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:873) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r60v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010c: ARITH (r64v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r61v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.HeathFactorInfo:?: TERNARY null = ((wrap:int:0x0117: ARITH (r64v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.HeathFactorInfo) : (r62v0 com.okinc.business.invest_biz.data.bean.HeathFactorInfo))
  (wrap:com.okinc.business.invest_biz.data.bean.BorrowedInfo:?: TERNARY null = ((wrap:int:0x0122: ARITH (r64v0 int) & (4194304 int) A[WRAPPED]) == (0 int)) ? (r63v0 com.okinc.business.invest_biz.data.bean.BorrowedInfo) : (null com.okinc.business.invest_biz.data.bean.BorrowedInfo))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.bean.InvestTokenWithApprove>, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, boolean, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.ExpectTokenInfo>, boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, com.okinc.business.invest_biz.data.bean.PromptInformation, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, com.okinc.business.invest_biz.data.bean.RemainingRepaymentInfo, com.okinc.business.invest_biz.data.bean.CollateralRatioInfo, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, java.util.List<com.okinc.business.invest_biz.data.bean.response.TransactionStep>, java.lang.String, com.okinc.business.invest_biz.data.bean.HeathFactorInfo, com.okinc.business.invest_biz.data.bean.BorrowedInfo):void (m)] (LINE:853) call: com.okinc.business.invest_biz.data.bean.InvestRedeemReceiveInfo.<init>(java.util.List, java.lang.String, java.util.List, boolean, java.util.List, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, java.lang.String, java.lang.String, java.util.List, boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.business.invest_biz.data.bean.PromptInformation, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, com.okinc.business.invest_biz.data.bean.RemainingRepaymentInfo, com.okinc.business.invest_biz.data.bean.CollateralRatioInfo, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, java.util.List, java.lang.String, com.okinc.business.invest_biz.data.bean.HeathFactorInfo, com.okinc.business.invest_biz.data.bean.BorrowedInfo):void type: THIS */
    public /* synthetic */ InvestRedeemReceiveInfo(List list, String str, List list2, boolean z, List list3, InvestTokenWithAmount investTokenWithAmount, String str2, String str3, List list4, boolean z2, String str4, String str5, String str6, List list5, PromptInformation promptInformation, InvestTokenWithAmount investTokenWithAmount2, RemainingRepaymentInfo remainingRepaymentInfo, CollateralRatioInfo collateralRatioInfo, InvestTokenWithAmount investTokenWithAmount3, List list6, String str7, HeathFactorInfo heathFactorInfo, BorrowedInfo borrowedInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? new ArrayList() : list2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? new ArrayList() : list3, (i & 32) != 0 ? new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null) : investTokenWithAmount, (i & 64) != 0 ? "" : str2, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? new ArrayList() : list4, (i & 512) != 0 ? true : z2, (i & 1024) != 0 ? "" : str4, (i & 2048) != 0 ? "" : str5, (i & 4096) == 0 ? str6 : "", (i & 8192) != 0 ? new ArrayList() : list5, (i & 16384) != 0 ? null : promptInformation, (i & 32768) != 0 ? null : investTokenWithAmount2, (i & 65536) != 0 ? null : remainingRepaymentInfo, (i & 131072) != 0 ? null : collateralRatioInfo, (i & 262144) != 0 ? null : investTokenWithAmount3, (i & 524288) != 0 ? new ArrayList() : list6, (i & 1048576) != 0 ? null : str7, (i & 2097152) != 0 ? null : heathFactorInfo, (i & 4194304) == 0 ? borrowedInfo : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestRedeemReceiveInfo(@NotNull List<InvestTokenWithApprove> list, @NotNull String str, @NotNull List<InvestTokenWithAmount> list2, boolean z, @NotNull List<InvestTokenWithAmount> list3, @NotNull InvestTokenWithAmount investTokenWithAmount, @NotNull String str2, @NotNull String str3, @NotNull List<ExpectTokenInfo> list4, boolean z2, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<InvestTokenWithAmount> list5, PromptInformation promptInformation, InvestTokenWithAmount investTokenWithAmount2, RemainingRepaymentInfo remainingRepaymentInfo, CollateralRatioInfo collateralRatioInfo, InvestTokenWithAmount investTokenWithAmount3, @NotNull List<TransactionStep> list6, String str7, HeathFactorInfo heathFactorInfo, BorrowedInfo borrowedInfo) {
        super(null);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(list6, "");
        this.approveStatusList = list;
        this.inputCurrencyAmount = str;
        this.receiveTokenList = list2;
        this.rewardNeedApprove = z;
        this.swapFromTokenList = list3;
        this.mySupply = investTokenWithAmount;
        this.valueDeviationPercentage = str2;
        this.estimateGasFee = str3;
        this.tokenInfoList = list4;
        this.isAllowRedeem = z2;
        this.maxRedeemAmount = str4;
        this.minimumRedeemAmount = str5;
        this.exchangeRate = str6;
        this.safeMoonTokenList = list5;
        this.promptInformation = promptInformation;
        this.payWithToken = investTokenWithAmount2;
        this.remainingRepaymentInfo = remainingRepaymentInfo;
        this.collateralRatioInfo = collateralRatioInfo;
        this.extraRedemptionFee = investTokenWithAmount3;
        this.transactionStepList = list6;
        this.collateral = str7;
        this.healthFactorInfo = heathFactorInfo;
        this.borrowed = borrowedInfo;
    }
}
