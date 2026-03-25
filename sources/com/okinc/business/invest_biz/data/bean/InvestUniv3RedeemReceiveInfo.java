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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C25541iyf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestUniv3RedeemReceiveInfo implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<InvestTokenWithApprove> approveStatusList;
    private final List<InvestTokenWithAmount> assetsList;
    private final String currentPrice;
    private final String estimateGasFee;
    private final List<InvestTokenWithAmount> feeEarning;
    private final String feeRate;
    private final boolean isAllowRedeem;
    private final boolean isSwapInvest;
    private final String liquidity;
    private final String lowerPrice;
    private final String nftTokenLogo;
    private final boolean openMev;
    private final String positionStatus;
    private final PromptInformation promptInformation;
    private final List<InvestTokenWithAmount> receiveTokenList;
    private final List<InvestTokenWithAmount> rewardList;
    private final List<InvestTokenWithAmount> safeMoonTokenList;
    private final List<InvestTokenWithAmount> swapFromTokenList;
    private final String swapSlippage;
    private final List<ExpectTokenInfo> tokenInfoList;
    private final InvestTransactionLossInfo transactionLossInfo;
    private final List<TransactionStep> transactionStepList;
    private final List<InvestTokenWithAmount> underlyingTokenList;
    private final String upperPrice;
    private final String valueDeviationPercentage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestUniv3RedeemReceiveInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestUniv3RedeemReceiveInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUniv3RedeemReceiveInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(InvestTokenWithApprove.CREATOR.createFromParcel(parcel));
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
            }
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList3.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
            }
            int i7 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i7);
            for (int i8 = 0; i8 != i7; i8++) {
                arrayList4.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
            }
            String string3 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            PromptInformation promptInformationCreateFromParcel = parcel.readInt() == 0 ? null : PromptInformation.CREATOR.createFromParcel(parcel);
            int i9 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i9);
            int i10 = 0;
            while (i10 != i9) {
                arrayList5.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
                i10++;
                i9 = i9;
            }
            int i11 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(i11);
            int i12 = 0;
            while (i12 != i11) {
                arrayList6.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
                i12++;
                i11 = i11;
            }
            int i13 = parcel.readInt();
            ArrayList arrayList7 = new ArrayList(i13);
            int i14 = 0;
            while (i14 != i13) {
                arrayList7.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
                i14++;
                i13 = i13;
            }
            int i15 = parcel.readInt();
            ArrayList arrayList8 = new ArrayList(i15);
            int i16 = 0;
            while (i16 != i15) {
                arrayList8.add(ExpectTokenInfo.CREATOR.createFromParcel(parcel));
                i16++;
                i15 = i15;
            }
            int i17 = parcel.readInt();
            ArrayList arrayList9 = new ArrayList(i17);
            int i18 = 0;
            while (i18 != i17) {
                arrayList9.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
                i18++;
                i17 = i17;
            }
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            int i19 = parcel.readInt();
            ArrayList arrayList10 = new ArrayList(i19);
            int i20 = 0;
            while (i20 != i19) {
                arrayList10.add(TransactionStep.CREATOR.createFromParcel(parcel));
                i20++;
                i19 = i19;
            }
            return new InvestUniv3RedeemReceiveInfo(arrayList, string, string2, arrayList2, arrayList3, arrayList4, string3, z, z2, string4, string5, string6, string7, promptInformationCreateFromParcel, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9, string8, string9, arrayList10, parcel.readInt() != 0 ? InvestTransactionLossInfo.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUniv3RedeemReceiveInfo[] newArray(int i) {
            return new InvestUniv3RedeemReceiveInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestUniv3RedeemReceiveInfo() {
        this((List) null, (String) null, (String) null, (List) null, (List) null, (List) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (PromptInformation) null, (List) null, (List) null, (List) null, (List) null, (List) null, (String) null, (String) null, (List) null, (InvestTransactionLossInfo) null, (String) null, false, 33554431, (DefaultConstructorMarker) null);
    }

    @SerialName("openMev")
    public static /* synthetic */ void getOpenMev$annotations() {
    }

    @SerialName("swapSlippage")
    public static /* synthetic */ void getSwapSlippage$annotations() {
    }

    @SerialName("transactionLossInfo")
    public static /* synthetic */ void getTransactionLossInfo$annotations() {
    }

    @SerialName("transactionStepList")
    public static /* synthetic */ void getTransactionStepList$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithApprove> component1() {
        return this.approveStatusList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.lowerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.nftTokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.positionStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PromptInformation component14() {
        return this.promptInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component15() {
        return this.receiveTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component16() {
        return this.safeMoonTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component17() {
        return this.swapFromTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ExpectTokenInfo> component18() {
        return this.tokenInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component19() {
        return this.underlyingTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.valueDeviationPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.upperPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TransactionStep> component22() {
        return this.transactionStepList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTransactionLossInfo component23() {
        return this.transactionLossInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.swapSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component25() {
        return this.openMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.estimateGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component4() {
        return this.assetsList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component5() {
        return this.rewardList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component6() {
        return this.feeEarning;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.isAllowRedeem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.isSwapInvest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUniv3RedeemReceiveInfo copy(@NotNull List<InvestTokenWithApprove> list, @NotNull String str, @NotNull String str2, @NotNull List<InvestTokenWithAmount> list2, @NotNull List<InvestTokenWithAmount> list3, @NotNull List<InvestTokenWithAmount> list4, @NotNull String str3, boolean z, boolean z2, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, PromptInformation promptInformation, @NotNull List<InvestTokenWithAmount> list5, @NotNull List<InvestTokenWithAmount> list6, @NotNull List<InvestTokenWithAmount> list7, @NotNull List<ExpectTokenInfo> list8, @NotNull List<InvestTokenWithAmount> list9, @NotNull String str8, @NotNull String str9, @NotNull List<TransactionStep> list10, InvestTransactionLossInfo investTransactionLossInfo, String str10, boolean z3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(list6, "");
        Intrinsics.checkNotNullParameter(list7, "");
        Intrinsics.checkNotNullParameter(list8, "");
        Intrinsics.checkNotNullParameter(list9, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(list10, "");
        return new InvestUniv3RedeemReceiveInfo(list, str, str2, list2, list3, list4, str3, z, z2, str4, str5, str6, str7, promptInformation, list5, list6, list7, list8, list9, str8, str9, list10, investTransactionLossInfo, str10, z3);
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
        if (!(obj instanceof InvestUniv3RedeemReceiveInfo)) {
            return false;
        }
        InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo = (InvestUniv3RedeemReceiveInfo) obj;
        return Intrinsics.EZpvd(this.approveStatusList, investUniv3RedeemReceiveInfo.approveStatusList) && Intrinsics.EZpvd((Object) this.currentPrice, (Object) investUniv3RedeemReceiveInfo.currentPrice) && Intrinsics.EZpvd((Object) this.estimateGasFee, (Object) investUniv3RedeemReceiveInfo.estimateGasFee) && Intrinsics.EZpvd(this.assetsList, investUniv3RedeemReceiveInfo.assetsList) && Intrinsics.EZpvd(this.rewardList, investUniv3RedeemReceiveInfo.rewardList) && Intrinsics.EZpvd(this.feeEarning, investUniv3RedeemReceiveInfo.feeEarning) && Intrinsics.EZpvd((Object) this.feeRate, (Object) investUniv3RedeemReceiveInfo.feeRate) && this.isAllowRedeem == investUniv3RedeemReceiveInfo.isAllowRedeem && this.isSwapInvest == investUniv3RedeemReceiveInfo.isSwapInvest && Intrinsics.EZpvd((Object) this.liquidity, (Object) investUniv3RedeemReceiveInfo.liquidity) && Intrinsics.EZpvd((Object) this.lowerPrice, (Object) investUniv3RedeemReceiveInfo.lowerPrice) && Intrinsics.EZpvd((Object) this.nftTokenLogo, (Object) investUniv3RedeemReceiveInfo.nftTokenLogo) && Intrinsics.EZpvd((Object) this.positionStatus, (Object) investUniv3RedeemReceiveInfo.positionStatus) && Intrinsics.EZpvd(this.promptInformation, investUniv3RedeemReceiveInfo.promptInformation) && Intrinsics.EZpvd(this.receiveTokenList, investUniv3RedeemReceiveInfo.receiveTokenList) && Intrinsics.EZpvd(this.safeMoonTokenList, investUniv3RedeemReceiveInfo.safeMoonTokenList) && Intrinsics.EZpvd(this.swapFromTokenList, investUniv3RedeemReceiveInfo.swapFromTokenList) && Intrinsics.EZpvd(this.tokenInfoList, investUniv3RedeemReceiveInfo.tokenInfoList) && Intrinsics.EZpvd(this.underlyingTokenList, investUniv3RedeemReceiveInfo.underlyingTokenList) && Intrinsics.EZpvd((Object) this.valueDeviationPercentage, (Object) investUniv3RedeemReceiveInfo.valueDeviationPercentage) && Intrinsics.EZpvd((Object) this.upperPrice, (Object) investUniv3RedeemReceiveInfo.upperPrice) && Intrinsics.EZpvd(this.transactionStepList, investUniv3RedeemReceiveInfo.transactionStepList) && Intrinsics.EZpvd(this.transactionLossInfo, investUniv3RedeemReceiveInfo.transactionLossInfo) && Intrinsics.EZpvd((Object) this.swapSlippage, (Object) investUniv3RedeemReceiveInfo.swapSlippage) && this.openMev == investUniv3RedeemReceiveInfo.openMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithApprove> getApproveStatusList() {
        return this.approveStatusList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> getAssetsList() {
        return this.assetsList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentPrice() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimateGasFee() {
        return this.estimateGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> getFeeEarning() {
        return this.feeEarning;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeRate() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiquidity() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLowerPrice() {
        return this.lowerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNftTokenLogo() {
        return this.nftTokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getOpenMev() {
        return this.openMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPositionStatus() {
        return this.positionStatus;
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
    public final List<InvestTokenWithAmount> getRewardList() {
        return this.rewardList;
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
    public final String getSwapSlippage() {
        return this.swapSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ExpectTokenInfo> getTokenInfoList() {
        return this.tokenInfoList;
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
    public final List<InvestTokenWithAmount> getUnderlyingTokenList() {
        return this.underlyingTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpperPrice() {
        return this.upperPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValueDeviationPercentage() {
        return this.valueDeviationPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.approveStatusList.hashCode();
        int iHashCode2 = this.currentPrice.hashCode();
        int iHashCode3 = this.estimateGasFee.hashCode();
        int iHashCode4 = this.assetsList.hashCode();
        int iHashCode5 = this.rewardList.hashCode();
        int iHashCode6 = this.feeEarning.hashCode();
        int iHashCode7 = this.feeRate.hashCode();
        int iHashCode8 = Boolean.hashCode(this.isAllowRedeem);
        int iHashCode9 = Boolean.hashCode(this.isSwapInvest);
        int iHashCode10 = this.liquidity.hashCode();
        int iHashCode11 = this.lowerPrice.hashCode();
        int iHashCode12 = this.nftTokenLogo.hashCode();
        int iHashCode13 = this.positionStatus.hashCode();
        PromptInformation promptInformation = this.promptInformation;
        int iHashCode14 = promptInformation == null ? 0 : promptInformation.hashCode();
        int iHashCode15 = this.receiveTokenList.hashCode();
        int iHashCode16 = this.safeMoonTokenList.hashCode();
        int iHashCode17 = this.swapFromTokenList.hashCode();
        int iHashCode18 = this.tokenInfoList.hashCode();
        int iHashCode19 = this.underlyingTokenList.hashCode();
        int iHashCode20 = this.valueDeviationPercentage.hashCode();
        int iHashCode21 = this.upperPrice.hashCode();
        int iHashCode22 = this.transactionStepList.hashCode();
        InvestTransactionLossInfo investTransactionLossInfo = this.transactionLossInfo;
        int iHashCode23 = investTransactionLossInfo == null ? 0 : investTransactionLossInfo.hashCode();
        String str = this.swapSlippage;
        return (((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.openMev);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAllowRedeem() {
        return this.isAllowRedeem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSwapInvest() {
        return this.isSwapInvest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestUniv3RedeemReceiveInfo(approveStatusList=" + this.approveStatusList + ", currentPrice=" + this.currentPrice + ", estimateGasFee=" + this.estimateGasFee + ", assetsList=" + this.assetsList + ", rewardList=" + this.rewardList + ", feeEarning=" + this.feeEarning + ", feeRate=" + this.feeRate + ", isAllowRedeem=" + this.isAllowRedeem + ", isSwapInvest=" + this.isSwapInvest + ", liquidity=" + this.liquidity + ", lowerPrice=" + this.lowerPrice + ", nftTokenLogo=" + this.nftTokenLogo + ", positionStatus=" + this.positionStatus + ", promptInformation=" + this.promptInformation + ", receiveTokenList=" + this.receiveTokenList + ", safeMoonTokenList=" + this.safeMoonTokenList + ", swapFromTokenList=" + this.swapFromTokenList + ", tokenInfoList=" + this.tokenInfoList + ", underlyingTokenList=" + this.underlyingTokenList + ", valueDeviationPercentage=" + this.valueDeviationPercentage + ", upperPrice=" + this.upperPrice + ", transactionStepList=" + this.transactionStepList + ", transactionLossInfo=" + this.transactionLossInfo + ", swapSlippage=" + this.swapSlippage + ", openMev=" + this.openMev + ")";
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
        parcel.writeString(this.currentPrice);
        parcel.writeString(this.estimateGasFee);
        List<InvestTokenWithAmount> list2 = this.assetsList;
        parcel.writeInt(list2.size());
        Iterator<InvestTokenWithAmount> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        List<InvestTokenWithAmount> list3 = this.rewardList;
        parcel.writeInt(list3.size());
        Iterator<InvestTokenWithAmount> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        List<InvestTokenWithAmount> list4 = this.feeEarning;
        parcel.writeInt(list4.size());
        Iterator<InvestTokenWithAmount> it4 = list4.iterator();
        while (it4.hasNext()) {
            it4.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.feeRate);
        parcel.writeInt(this.isAllowRedeem ? 1 : 0);
        parcel.writeInt(this.isSwapInvest ? 1 : 0);
        parcel.writeString(this.liquidity);
        parcel.writeString(this.lowerPrice);
        parcel.writeString(this.nftTokenLogo);
        parcel.writeString(this.positionStatus);
        PromptInformation promptInformation = this.promptInformation;
        if (promptInformation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promptInformation.writeToParcel(parcel, i);
        }
        List<InvestTokenWithAmount> list5 = this.receiveTokenList;
        parcel.writeInt(list5.size());
        Iterator<InvestTokenWithAmount> it5 = list5.iterator();
        while (it5.hasNext()) {
            it5.next().writeToParcel(parcel, i);
        }
        List<InvestTokenWithAmount> list6 = this.safeMoonTokenList;
        parcel.writeInt(list6.size());
        Iterator<InvestTokenWithAmount> it6 = list6.iterator();
        while (it6.hasNext()) {
            it6.next().writeToParcel(parcel, i);
        }
        List<InvestTokenWithAmount> list7 = this.swapFromTokenList;
        parcel.writeInt(list7.size());
        Iterator<InvestTokenWithAmount> it7 = list7.iterator();
        while (it7.hasNext()) {
            it7.next().writeToParcel(parcel, i);
        }
        List<ExpectTokenInfo> list8 = this.tokenInfoList;
        parcel.writeInt(list8.size());
        Iterator<ExpectTokenInfo> it8 = list8.iterator();
        while (it8.hasNext()) {
            it8.next().writeToParcel(parcel, i);
        }
        List<InvestTokenWithAmount> list9 = this.underlyingTokenList;
        parcel.writeInt(list9.size());
        Iterator<InvestTokenWithAmount> it9 = list9.iterator();
        while (it9.hasNext()) {
            it9.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.valueDeviationPercentage);
        parcel.writeString(this.upperPrice);
        List<TransactionStep> list10 = this.transactionStepList;
        parcel.writeInt(list10.size());
        Iterator<TransactionStep> it10 = list10.iterator();
        while (it10.hasNext()) {
            it10.next().writeToParcel(parcel, i);
        }
        InvestTransactionLossInfo investTransactionLossInfo = this.transactionLossInfo;
        if (investTransactionLossInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTransactionLossInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.swapSlippage);
        parcel.writeInt(this.openMev ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestUniv3RedeemReceiveInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestUniv3RedeemReceiveInfo> serializer() {
            return InvestUniv3RedeemReceiveInfo$$serializer.INSTANCE;
        }
    }

    static {
        InvestTokenWithAmount$$serializer investTokenWithAmount$$serializer = InvestTokenWithAmount$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(InvestTokenWithApprove$$serializer.INSTANCE), null, null, new ArrayListSerializer(investTokenWithAmount$$serializer), new ArrayListSerializer(investTokenWithAmount$$serializer), new ArrayListSerializer(investTokenWithAmount$$serializer), null, null, null, null, null, null, null, null, new ArrayListSerializer(investTokenWithAmount$$serializer), new ArrayListSerializer(investTokenWithAmount$$serializer), new ArrayListSerializer(investTokenWithAmount$$serializer), new ArrayListSerializer(ExpectTokenInfo$$serializer.INSTANCE), new ArrayListSerializer(investTokenWithAmount$$serializer), null, null, new ArrayListSerializer(TransactionStep$$serializer.INSTANCE), null, null, null};
    }

    public /* synthetic */ InvestUniv3RedeemReceiveInfo(int i, List list, String str, String str2, List list2, List list3, List list4, String str3, boolean z, boolean z2, String str4, String str5, String str6, String str7, PromptInformation promptInformation, List list5, List list6, List list7, List list8, List list9, String str8, String str9, List list10, InvestTransactionLossInfo investTransactionLossInfo, String str10, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
        this.approveStatusList = (i & 1) == 0 ? new ArrayList() : list;
        if ((i & 2) == 0) {
            this.currentPrice = "";
        } else {
            this.currentPrice = str;
        }
        if ((i & 4) == 0) {
            this.estimateGasFee = "";
        } else {
            this.estimateGasFee = str2;
        }
        this.assetsList = (i & 8) == 0 ? new ArrayList(2) : list2;
        this.rewardList = (i & 16) == 0 ? new ArrayList(2) : list3;
        this.feeEarning = (i & 32) == 0 ? new ArrayList(2) : list4;
        if ((i & 64) == 0) {
            this.feeRate = "";
        } else {
            this.feeRate = str3;
        }
        this.isAllowRedeem = (i & 128) == 0 ? true : z;
        if ((i & 256) == 0) {
            this.isSwapInvest = false;
        } else {
            this.isSwapInvest = z2;
        }
        if ((i & 512) == 0) {
            this.liquidity = "";
        } else {
            this.liquidity = str4;
        }
        if ((i & 1024) == 0) {
            this.lowerPrice = "";
        } else {
            this.lowerPrice = str5;
        }
        if ((i & 2048) == 0) {
            this.nftTokenLogo = "";
        } else {
            this.nftTokenLogo = str6;
        }
        if ((i & 4096) == 0) {
            this.positionStatus = "";
        } else {
            this.positionStatus = str7;
        }
        if ((i & 8192) == 0) {
            this.promptInformation = null;
        } else {
            this.promptInformation = promptInformation;
        }
        this.receiveTokenList = (i & 16384) == 0 ? new ArrayList(2) : list5;
        this.safeMoonTokenList = (32768 & i) == 0 ? new ArrayList() : list6;
        this.swapFromTokenList = (65536 & i) == 0 ? new ArrayList(2) : list7;
        this.tokenInfoList = (131072 & i) == 0 ? new ArrayList() : list8;
        this.underlyingTokenList = (262144 & i) == 0 ? new ArrayList() : list9;
        if ((524288 & i) == 0) {
            this.valueDeviationPercentage = "";
        } else {
            this.valueDeviationPercentage = str8;
        }
        if ((1048576 & i) == 0) {
            this.upperPrice = "";
        } else {
            this.upperPrice = str9;
        }
        this.transactionStepList = (2097152 & i) == 0 ? new ArrayList() : list10;
        if ((4194304 & i) == 0) {
            this.transactionLossInfo = null;
        } else {
            this.transactionLossInfo = investTransactionLossInfo;
        }
        if ((8388608 & i) == 0) {
            this.swapSlippage = "";
        } else {
            this.swapSlippage = str10;
        }
        if ((i & 16777216) == 0) {
            this.openMev = false;
        } else {
            this.openMev = z3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [46=11] */
    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(investUniv3RedeemReceiveInfo.approveStatusList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], investUniv3RedeemReceiveInfo.approveStatusList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) investUniv3RedeemReceiveInfo.currentPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, investUniv3RedeemReceiveInfo.currentPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investUniv3RedeemReceiveInfo.estimateGasFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, investUniv3RedeemReceiveInfo.estimateGasFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(investUniv3RedeemReceiveInfo.assetsList, new ArrayList(2))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], investUniv3RedeemReceiveInfo.assetsList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(investUniv3RedeemReceiveInfo.rewardList, new ArrayList(2))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], investUniv3RedeemReceiveInfo.rewardList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(investUniv3RedeemReceiveInfo.feeEarning, new ArrayList(2))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], investUniv3RedeemReceiveInfo.feeEarning);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) investUniv3RedeemReceiveInfo.feeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, investUniv3RedeemReceiveInfo.feeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !investUniv3RedeemReceiveInfo.isAllowRedeem) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, investUniv3RedeemReceiveInfo.isAllowRedeem);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || investUniv3RedeemReceiveInfo.isSwapInvest) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 8, investUniv3RedeemReceiveInfo.isSwapInvest);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) investUniv3RedeemReceiveInfo.liquidity, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, investUniv3RedeemReceiveInfo.liquidity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) investUniv3RedeemReceiveInfo.lowerPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, investUniv3RedeemReceiveInfo.lowerPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) investUniv3RedeemReceiveInfo.nftTokenLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, investUniv3RedeemReceiveInfo.nftTokenLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) investUniv3RedeemReceiveInfo.positionStatus, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, investUniv3RedeemReceiveInfo.positionStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || investUniv3RedeemReceiveInfo.promptInformation != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, PromptInformation$$serializer.INSTANCE, investUniv3RedeemReceiveInfo.promptInformation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd(investUniv3RedeemReceiveInfo.receiveTokenList, new ArrayList(2))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], investUniv3RedeemReceiveInfo.receiveTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd(investUniv3RedeemReceiveInfo.safeMoonTokenList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 15, kSerializerArr[15], investUniv3RedeemReceiveInfo.safeMoonTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd(investUniv3RedeemReceiveInfo.swapFromTokenList, new ArrayList(2))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 16, kSerializerArr[16], investUniv3RedeemReceiveInfo.swapFromTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd(investUniv3RedeemReceiveInfo.tokenInfoList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 17, kSerializerArr[17], investUniv3RedeemReceiveInfo.tokenInfoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd(investUniv3RedeemReceiveInfo.underlyingTokenList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 18, kSerializerArr[18], investUniv3RedeemReceiveInfo.underlyingTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) investUniv3RedeemReceiveInfo.valueDeviationPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, investUniv3RedeemReceiveInfo.valueDeviationPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) investUniv3RedeemReceiveInfo.upperPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, investUniv3RedeemReceiveInfo.upperPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd(investUniv3RedeemReceiveInfo.transactionStepList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 21, kSerializerArr[21], investUniv3RedeemReceiveInfo.transactionStepList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || investUniv3RedeemReceiveInfo.transactionLossInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, InvestTransactionLossInfo$$serializer.INSTANCE, investUniv3RedeemReceiveInfo.transactionLossInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) investUniv3RedeemReceiveInfo.swapSlippage, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, investUniv3RedeemReceiveInfo.swapSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || investUniv3RedeemReceiveInfo.openMev) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 24, investUniv3RedeemReceiveInfo.openMev);
        }
    }

    public InvestUniv3RedeemReceiveInfo(@NotNull List<InvestTokenWithApprove> list, @NotNull String str, @NotNull String str2, @NotNull List<InvestTokenWithAmount> list2, @NotNull List<InvestTokenWithAmount> list3, @NotNull List<InvestTokenWithAmount> list4, @NotNull String str3, boolean z, boolean z2, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, PromptInformation promptInformation, @NotNull List<InvestTokenWithAmount> list5, @NotNull List<InvestTokenWithAmount> list6, @NotNull List<InvestTokenWithAmount> list7, @NotNull List<ExpectTokenInfo> list8, @NotNull List<InvestTokenWithAmount> list9, @NotNull String str8, @NotNull String str9, @NotNull List<TransactionStep> list10, InvestTransactionLossInfo investTransactionLossInfo, String str10, boolean z3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(list6, "");
        Intrinsics.checkNotNullParameter(list7, "");
        Intrinsics.checkNotNullParameter(list8, "");
        Intrinsics.checkNotNullParameter(list9, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(list10, "");
        this.approveStatusList = list;
        this.currentPrice = str;
        this.estimateGasFee = str2;
        this.assetsList = list2;
        this.rewardList = list3;
        this.feeEarning = list4;
        this.feeRate = str3;
        this.isAllowRedeem = z;
        this.isSwapInvest = z2;
        this.liquidity = str4;
        this.lowerPrice = str5;
        this.nftTokenLogo = str6;
        this.positionStatus = str7;
        this.promptInformation = promptInformation;
        this.receiveTokenList = list5;
        this.safeMoonTokenList = list6;
        this.swapFromTokenList = list7;
        this.tokenInfoList = list8;
        this.underlyingTokenList = list9;
        this.valueDeviationPercentage = str8;
        this.upperPrice = str9;
        this.transactionStepList = list10;
        this.transactionLossInfo = investTransactionLossInfo;
        this.swapSlippage = str10;
        this.openMev = z3;
    }

    public /* synthetic */ InvestUniv3RedeemReceiveInfo(List list, String str, String str2, List list2, List list3, List list4, String str3, boolean z, boolean z2, String str4, String str5, String str6, String str7, PromptInformation promptInformation, List list5, List list6, List list7, List list8, List list9, String str8, String str9, List list10, InvestTransactionLossInfo investTransactionLossInfo, String str10, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        PromptInformation promptInformation2;
        List arrayList;
        List list11;
        List list12;
        List arrayList2;
        List arrayList3 = (i & 1) != 0 ? new ArrayList() : list;
        String str11 = (i & 2) != 0 ? "" : str;
        String str12 = (i & 4) != 0 ? "" : str2;
        List arrayList4 = (i & 8) != 0 ? new ArrayList(2) : list2;
        List arrayList5 = (i & 16) != 0 ? new ArrayList(2) : list3;
        List arrayList6 = (i & 32) != 0 ? new ArrayList(2) : list4;
        String str13 = (i & 64) != 0 ? "" : str3;
        boolean z4 = (i & 128) != 0 ? true : z;
        boolean z5 = (i & 256) != 0 ? false : z2;
        String str14 = (i & 512) != 0 ? "" : str4;
        String str15 = (i & 1024) != 0 ? "" : str5;
        String str16 = (i & 2048) != 0 ? "" : str6;
        String str17 = (i & 4096) != 0 ? "" : str7;
        PromptInformation promptInformation3 = (i & 8192) != 0 ? null : promptInformation;
        if ((i & 16384) != 0) {
            promptInformation2 = promptInformation3;
            arrayList = new ArrayList(2);
        } else {
            promptInformation2 = promptInformation3;
            arrayList = list5;
        }
        List arrayList7 = (32768 & i) != 0 ? new ArrayList() : list6;
        if ((i & 65536) != 0) {
            list12 = arrayList7;
            list11 = arrayList;
            arrayList2 = new ArrayList(2);
        } else {
            list11 = arrayList;
            list12 = arrayList7;
            arrayList2 = list7;
        }
        this(arrayList3, str11, str12, arrayList4, arrayList5, arrayList6, str13, z4, z5, str14, str15, str16, str17, promptInformation2, list11, list12, arrayList2, (131072 & i) != 0 ? new ArrayList() : list8, (i & 262144) != 0 ? new ArrayList() : list9, (i & 524288) != 0 ? "" : str8, (i & 1048576) != 0 ? "" : str9, (i & 2097152) != 0 ? new ArrayList() : list10, (i & 4194304) == 0 ? investTransactionLossInfo : null, (i & 8388608) != 0 ? "" : str10, (i & 16777216) != 0 ? false : z3);
    }

    public final boolean isActive() {
        return C25541iyf.OLrzqt(this.positionStatus);
    }
}
