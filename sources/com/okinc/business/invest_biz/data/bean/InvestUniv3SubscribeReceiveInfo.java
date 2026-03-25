package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_biz.data.bean.response.TransactionStep;
import com.okinc.business.invest_biz.data.bean.response.TransactionStep$$serializer;
import com.okinc.business.invest_biz.data.contants.InvestAction;
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
import o.C25541iyf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestUniv3SubscribeReceiveInfo implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<InvestTokenWithApprove> approveStatusList;
    private final String apr;
    private final List<InvestTokenWithAmount> assetsList;
    private final String currentPrice;
    private final Integer currentTick;
    private final String estimateGasFee;
    private final List<InvestTokenWithAmount> feeEarning;
    private final String feeRate;
    private final List<InvestTokenWithAmount> gainsTokenList;
    private final List<InvestTokenWithAmount> investWithTokenList;
    private final boolean isAllowSubscribe;
    private final boolean isSwapInvest;
    private final String lowerPrice;
    private final boolean openMev;
    private final String positionStatus;
    private final InvestUniv3SubscribePromptInformation promptInformation;
    private final InvestTokenWithAmount receiveTokenInfo;
    private final List<InvestTokenWithAmount> safeMoonTokenList;
    private final String swapSlippage;
    private final List<InvestTokenWithAmount> swapToTokenList;
    private final List<ExpectTokenInfo> tokenInfoList;
    private final InvestTransactionLossInfo transactionLossInfo;
    private final List<TransactionStep> transactionStepList;
    private final String upperPrice;
    private final String valueDeviationPercentage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestUniv3SubscribeReceiveInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestUniv3SubscribeReceiveInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUniv3SubscribeReceiveInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(InvestTokenWithApprove.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
            }
            String string = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList3.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
            }
            String string3 = parcel.readString();
            int i7 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i7);
            for (int i8 = 0; i8 != i7; i8++) {
                arrayList4.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
            }
            int i9 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i9);
            for (int i10 = 0; i10 != i9; i10++) {
                arrayList5.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
            }
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            String string4 = parcel.readString();
            InvestUniv3SubscribePromptInformation investUniv3SubscribePromptInformationCreateFromParcel = parcel.readInt() == 0 ? null : InvestUniv3SubscribePromptInformation.CREATOR.createFromParcel(parcel);
            InvestTokenWithAmount investTokenWithAmountCreateFromParcel = parcel.readInt() != 0 ? InvestTokenWithAmount.CREATOR.createFromParcel(parcel) : null;
            int i11 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList6.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
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
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            int i17 = parcel.readInt();
            ArrayList arrayList9 = new ArrayList(i17);
            int i18 = 0;
            while (i18 != i17) {
                arrayList9.add(TransactionStep.CREATOR.createFromParcel(parcel));
                i18++;
                i17 = i17;
            }
            return new InvestUniv3SubscribeReceiveInfo(arrayList, arrayList2, string, numValueOf, string2, arrayList3, string3, arrayList4, arrayList5, z, z2, string4, investUniv3SubscribePromptInformationCreateFromParcel, investTokenWithAmountCreateFromParcel, arrayList6, arrayList7, arrayList8, string5, string6, string7, string8, arrayList9, InvestTransactionLossInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUniv3SubscribeReceiveInfo[] newArray(int i) {
            return new InvestUniv3SubscribeReceiveInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestUniv3SubscribeReceiveInfo() {
        this((List) null, (List) null, (String) null, (Integer) null, (String) null, (List) null, (String) null, (List) null, (List) null, false, false, (String) null, (InvestUniv3SubscribePromptInformation) null, (InvestTokenWithAmount) null, (List) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (List) null, (InvestTransactionLossInfo) null, (String) null, false, 33554431, (DefaultConstructorMarker) null);
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
    public final boolean component10() {
        return this.isAllowSubscribe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.isSwapInvest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.positionStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUniv3SubscribePromptInformation component13() {
        return this.promptInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount component14() {
        return this.receiveTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component15() {
        return this.safeMoonTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component16() {
        return this.swapToTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ExpectTokenInfo> component17() {
        return this.tokenInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.valueDeviationPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.lowerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component2() {
        return this.assetsList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.upperPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.apr;
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
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.currentTick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.estimateGasFee;
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
    public final List<InvestTokenWithAmount> component8() {
        return this.gainsTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component9() {
        return this.investWithTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUniv3SubscribeReceiveInfo copy(@NotNull List<InvestTokenWithApprove> list, @NotNull List<InvestTokenWithAmount> list2, @NotNull String str, Integer num, @NotNull String str2, @NotNull List<InvestTokenWithAmount> list3, @NotNull String str3, @NotNull List<InvestTokenWithAmount> list4, @NotNull List<InvestTokenWithAmount> list5, boolean z, boolean z2, @NotNull String str4, InvestUniv3SubscribePromptInformation investUniv3SubscribePromptInformation, InvestTokenWithAmount investTokenWithAmount, @NotNull List<InvestTokenWithAmount> list6, @NotNull List<InvestTokenWithAmount> list7, @NotNull List<ExpectTokenInfo> list8, @NotNull String str5, @NotNull String str6, @NotNull String str7, String str8, @NotNull List<TransactionStep> list9, @NotNull InvestTransactionLossInfo investTransactionLossInfo, @NotNull String str9, boolean z3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list6, "");
        Intrinsics.checkNotNullParameter(list7, "");
        Intrinsics.checkNotNullParameter(list8, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list9, "");
        Intrinsics.checkNotNullParameter(investTransactionLossInfo, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new InvestUniv3SubscribeReceiveInfo(list, list2, str, num, str2, list3, str3, list4, list5, z, z2, str4, investUniv3SubscribePromptInformation, investTokenWithAmount, list6, list7, list8, str5, str6, str7, str8, list9, investTransactionLossInfo, str9, z3);
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
        if (!(obj instanceof InvestUniv3SubscribeReceiveInfo)) {
            return false;
        }
        InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo = (InvestUniv3SubscribeReceiveInfo) obj;
        return Intrinsics.EZpvd(this.approveStatusList, investUniv3SubscribeReceiveInfo.approveStatusList) && Intrinsics.EZpvd(this.assetsList, investUniv3SubscribeReceiveInfo.assetsList) && Intrinsics.EZpvd((Object) this.currentPrice, (Object) investUniv3SubscribeReceiveInfo.currentPrice) && Intrinsics.EZpvd(this.currentTick, investUniv3SubscribeReceiveInfo.currentTick) && Intrinsics.EZpvd((Object) this.estimateGasFee, (Object) investUniv3SubscribeReceiveInfo.estimateGasFee) && Intrinsics.EZpvd(this.feeEarning, investUniv3SubscribeReceiveInfo.feeEarning) && Intrinsics.EZpvd((Object) this.feeRate, (Object) investUniv3SubscribeReceiveInfo.feeRate) && Intrinsics.EZpvd(this.gainsTokenList, investUniv3SubscribeReceiveInfo.gainsTokenList) && Intrinsics.EZpvd(this.investWithTokenList, investUniv3SubscribeReceiveInfo.investWithTokenList) && this.isAllowSubscribe == investUniv3SubscribeReceiveInfo.isAllowSubscribe && this.isSwapInvest == investUniv3SubscribeReceiveInfo.isSwapInvest && Intrinsics.EZpvd((Object) this.positionStatus, (Object) investUniv3SubscribeReceiveInfo.positionStatus) && Intrinsics.EZpvd(this.promptInformation, investUniv3SubscribeReceiveInfo.promptInformation) && Intrinsics.EZpvd(this.receiveTokenInfo, investUniv3SubscribeReceiveInfo.receiveTokenInfo) && Intrinsics.EZpvd(this.safeMoonTokenList, investUniv3SubscribeReceiveInfo.safeMoonTokenList) && Intrinsics.EZpvd(this.swapToTokenList, investUniv3SubscribeReceiveInfo.swapToTokenList) && Intrinsics.EZpvd(this.tokenInfoList, investUniv3SubscribeReceiveInfo.tokenInfoList) && Intrinsics.EZpvd((Object) this.valueDeviationPercentage, (Object) investUniv3SubscribeReceiveInfo.valueDeviationPercentage) && Intrinsics.EZpvd((Object) this.lowerPrice, (Object) investUniv3SubscribeReceiveInfo.lowerPrice) && Intrinsics.EZpvd((Object) this.upperPrice, (Object) investUniv3SubscribeReceiveInfo.upperPrice) && Intrinsics.EZpvd((Object) this.apr, (Object) investUniv3SubscribeReceiveInfo.apr) && Intrinsics.EZpvd(this.transactionStepList, investUniv3SubscribeReceiveInfo.transactionStepList) && Intrinsics.EZpvd(this.transactionLossInfo, investUniv3SubscribeReceiveInfo.transactionLossInfo) && Intrinsics.EZpvd((Object) this.swapSlippage, (Object) investUniv3SubscribeReceiveInfo.swapSlippage) && this.openMev == investUniv3SubscribeReceiveInfo.openMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithApprove> getApproveStatusList() {
        return this.approveStatusList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApr() {
        return this.apr;
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
    public final Integer getCurrentTick() {
        return this.currentTick;
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
    public final List<InvestTokenWithAmount> getGainsTokenList() {
        return this.gainsTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> getInvestWithTokenList() {
        return this.investWithTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLowerPrice() {
        return this.lowerPrice;
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
    public final InvestUniv3SubscribePromptInformation getPromptInformation() {
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
    public final String getSwapSlippage() {
        return this.swapSlippage;
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
    public final InvestTransactionLossInfo getTransactionLossInfo() {
        return this.transactionLossInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TransactionStep> getTransactionStepList() {
        return this.transactionStepList;
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
        int iHashCode2 = this.assetsList.hashCode();
        int iHashCode3 = this.currentPrice.hashCode();
        Integer num = this.currentTick;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        int iHashCode5 = this.estimateGasFee.hashCode();
        int iHashCode6 = this.feeEarning.hashCode();
        int iHashCode7 = this.feeRate.hashCode();
        int iHashCode8 = this.gainsTokenList.hashCode();
        int iHashCode9 = this.investWithTokenList.hashCode();
        int iHashCode10 = Boolean.hashCode(this.isAllowSubscribe);
        int iHashCode11 = Boolean.hashCode(this.isSwapInvest);
        int iHashCode12 = this.positionStatus.hashCode();
        InvestUniv3SubscribePromptInformation investUniv3SubscribePromptInformation = this.promptInformation;
        int iHashCode13 = investUniv3SubscribePromptInformation == null ? 0 : investUniv3SubscribePromptInformation.hashCode();
        InvestTokenWithAmount investTokenWithAmount = this.receiveTokenInfo;
        int iHashCode14 = investTokenWithAmount == null ? 0 : investTokenWithAmount.hashCode();
        int iHashCode15 = this.safeMoonTokenList.hashCode();
        int iHashCode16 = this.swapToTokenList.hashCode();
        int iHashCode17 = this.tokenInfoList.hashCode();
        int iHashCode18 = this.valueDeviationPercentage.hashCode();
        int iHashCode19 = this.lowerPrice.hashCode();
        int iHashCode20 = this.upperPrice.hashCode();
        String str = this.apr;
        return (((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.transactionStepList.hashCode()) * 31) + this.transactionLossInfo.hashCode()) * 31) + this.swapSlippage.hashCode()) * 31) + Boolean.hashCode(this.openMev);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAllowSubscribe() {
        return this.isAllowSubscribe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSwapInvest() {
        return this.isSwapInvest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestUniv3SubscribeReceiveInfo(approveStatusList=" + this.approveStatusList + ", assetsList=" + this.assetsList + ", currentPrice=" + this.currentPrice + ", currentTick=" + this.currentTick + ", estimateGasFee=" + this.estimateGasFee + ", feeEarning=" + this.feeEarning + ", feeRate=" + this.feeRate + ", gainsTokenList=" + this.gainsTokenList + ", investWithTokenList=" + this.investWithTokenList + ", isAllowSubscribe=" + this.isAllowSubscribe + ", isSwapInvest=" + this.isSwapInvest + ", positionStatus=" + this.positionStatus + ", promptInformation=" + this.promptInformation + ", receiveTokenInfo=" + this.receiveTokenInfo + ", safeMoonTokenList=" + this.safeMoonTokenList + ", swapToTokenList=" + this.swapToTokenList + ", tokenInfoList=" + this.tokenInfoList + ", valueDeviationPercentage=" + this.valueDeviationPercentage + ", lowerPrice=" + this.lowerPrice + ", upperPrice=" + this.upperPrice + ", apr=" + this.apr + ", transactionStepList=" + this.transactionStepList + ", transactionLossInfo=" + this.transactionLossInfo + ", swapSlippage=" + this.swapSlippage + ", openMev=" + this.openMev + ")";
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
        List<InvestTokenWithAmount> list2 = this.assetsList;
        parcel.writeInt(list2.size());
        Iterator<InvestTokenWithAmount> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.currentPrice);
        Integer num = this.currentTick;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.estimateGasFee);
        List<InvestTokenWithAmount> list3 = this.feeEarning;
        parcel.writeInt(list3.size());
        Iterator<InvestTokenWithAmount> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.feeRate);
        List<InvestTokenWithAmount> list4 = this.gainsTokenList;
        parcel.writeInt(list4.size());
        Iterator<InvestTokenWithAmount> it4 = list4.iterator();
        while (it4.hasNext()) {
            it4.next().writeToParcel(parcel, i);
        }
        List<InvestTokenWithAmount> list5 = this.investWithTokenList;
        parcel.writeInt(list5.size());
        Iterator<InvestTokenWithAmount> it5 = list5.iterator();
        while (it5.hasNext()) {
            it5.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isAllowSubscribe ? 1 : 0);
        parcel.writeInt(this.isSwapInvest ? 1 : 0);
        parcel.writeString(this.positionStatus);
        InvestUniv3SubscribePromptInformation investUniv3SubscribePromptInformation = this.promptInformation;
        if (investUniv3SubscribePromptInformation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investUniv3SubscribePromptInformation.writeToParcel(parcel, i);
        }
        InvestTokenWithAmount investTokenWithAmount = this.receiveTokenInfo;
        if (investTokenWithAmount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTokenWithAmount.writeToParcel(parcel, i);
        }
        List<InvestTokenWithAmount> list6 = this.safeMoonTokenList;
        parcel.writeInt(list6.size());
        Iterator<InvestTokenWithAmount> it6 = list6.iterator();
        while (it6.hasNext()) {
            it6.next().writeToParcel(parcel, i);
        }
        List<InvestTokenWithAmount> list7 = this.swapToTokenList;
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
        parcel.writeString(this.valueDeviationPercentage);
        parcel.writeString(this.lowerPrice);
        parcel.writeString(this.upperPrice);
        parcel.writeString(this.apr);
        List<TransactionStep> list9 = this.transactionStepList;
        parcel.writeInt(list9.size());
        Iterator<TransactionStep> it9 = list9.iterator();
        while (it9.hasNext()) {
            it9.next().writeToParcel(parcel, i);
        }
        this.transactionLossInfo.writeToParcel(parcel, i);
        parcel.writeString(this.swapSlippage);
        parcel.writeInt(this.openMev ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeReceiveInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestUniv3SubscribeReceiveInfo> serializer() {
            return InvestUniv3SubscribeReceiveInfo$$serializer.INSTANCE;
        }
    }

    static {
        InvestTokenWithAmount$$serializer investTokenWithAmount$$serializer = InvestTokenWithAmount$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(InvestTokenWithApprove$$serializer.INSTANCE), new ArrayListSerializer(investTokenWithAmount$$serializer), null, null, null, new ArrayListSerializer(investTokenWithAmount$$serializer), null, new ArrayListSerializer(investTokenWithAmount$$serializer), new ArrayListSerializer(investTokenWithAmount$$serializer), null, null, null, null, null, new ArrayListSerializer(investTokenWithAmount$$serializer), new ArrayListSerializer(investTokenWithAmount$$serializer), new ArrayListSerializer(ExpectTokenInfo$$serializer.INSTANCE), null, null, null, null, new ArrayListSerializer(TransactionStep$$serializer.INSTANCE), null, null, null};
    }

    public /* synthetic */ InvestUniv3SubscribeReceiveInfo(int i, List list, List list2, String str, Integer num, String str2, List list3, String str3, List list4, List list5, boolean z, boolean z2, String str4, InvestUniv3SubscribePromptInformation investUniv3SubscribePromptInformation, InvestTokenWithAmount investTokenWithAmount, List list6, List list7, List list8, String str5, String str6, String str7, String str8, List list9, InvestTransactionLossInfo investTransactionLossInfo, String str9, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
        this.approveStatusList = (i & 1) == 0 ? new ArrayList() : list;
        this.assetsList = (i & 2) == 0 ? new ArrayList(2) : list2;
        if ((i & 4) == 0) {
            this.currentPrice = "";
        } else {
            this.currentPrice = str;
        }
        if ((i & 8) == 0) {
            this.currentTick = null;
        } else {
            this.currentTick = num;
        }
        if ((i & 16) == 0) {
            this.estimateGasFee = "";
        } else {
            this.estimateGasFee = str2;
        }
        this.feeEarning = (i & 32) == 0 ? new ArrayList(2) : list3;
        if ((i & 64) == 0) {
            this.feeRate = "";
        } else {
            this.feeRate = str3;
        }
        this.gainsTokenList = (i & 128) == 0 ? new ArrayList() : list4;
        this.investWithTokenList = (i & 256) == 0 ? new ArrayList() : list5;
        this.isAllowSubscribe = (i & 512) == 0 ? true : z;
        if ((i & 1024) == 0) {
            this.isSwapInvest = false;
        } else {
            this.isSwapInvest = z2;
        }
        if ((i & 2048) == 0) {
            this.positionStatus = "";
        } else {
            this.positionStatus = str4;
        }
        if ((i & 4096) == 0) {
            this.promptInformation = null;
        } else {
            this.promptInformation = investUniv3SubscribePromptInformation;
        }
        if ((i & 8192) == 0) {
            this.receiveTokenInfo = null;
        } else {
            this.receiveTokenInfo = investTokenWithAmount;
        }
        this.safeMoonTokenList = (i & 16384) == 0 ? new ArrayList() : list6;
        this.swapToTokenList = (32768 & i) == 0 ? new ArrayList() : list7;
        this.tokenInfoList = (65536 & i) == 0 ? new ArrayList() : list8;
        if ((131072 & i) == 0) {
            this.valueDeviationPercentage = "";
        } else {
            this.valueDeviationPercentage = str5;
        }
        if ((262144 & i) == 0) {
            this.lowerPrice = "";
        } else {
            this.lowerPrice = str6;
        }
        if ((524288 & i) == 0) {
            this.upperPrice = "";
        } else {
            this.upperPrice = str7;
        }
        if ((1048576 & i) == 0) {
            this.apr = null;
        } else {
            this.apr = str8;
        }
        this.transactionStepList = (2097152 & i) == 0 ? new ArrayList() : list9;
        this.transactionLossInfo = (4194304 & i) == 0 ? new InvestTransactionLossInfo((String) null, 0, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : investTransactionLossInfo;
        if ((8388608 & i) == 0) {
            this.swapSlippage = "";
        } else {
            this.swapSlippage = str9;
        }
        if ((i & 16777216) == 0) {
            this.openMev = false;
        } else {
            this.openMev = z3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [152=11] */
    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(investUniv3SubscribeReceiveInfo.approveStatusList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], investUniv3SubscribeReceiveInfo.approveStatusList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(investUniv3SubscribeReceiveInfo.assetsList, new ArrayList(2))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], investUniv3SubscribeReceiveInfo.assetsList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investUniv3SubscribeReceiveInfo.currentPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, investUniv3SubscribeReceiveInfo.currentPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investUniv3SubscribeReceiveInfo.currentTick != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, investUniv3SubscribeReceiveInfo.currentTick);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) investUniv3SubscribeReceiveInfo.estimateGasFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, investUniv3SubscribeReceiveInfo.estimateGasFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(investUniv3SubscribeReceiveInfo.feeEarning, new ArrayList(2))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], investUniv3SubscribeReceiveInfo.feeEarning);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) investUniv3SubscribeReceiveInfo.feeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, investUniv3SubscribeReceiveInfo.feeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(investUniv3SubscribeReceiveInfo.gainsTokenList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], investUniv3SubscribeReceiveInfo.gainsTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(investUniv3SubscribeReceiveInfo.investWithTokenList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], investUniv3SubscribeReceiveInfo.investWithTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !investUniv3SubscribeReceiveInfo.isAllowSubscribe) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, investUniv3SubscribeReceiveInfo.isAllowSubscribe);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || investUniv3SubscribeReceiveInfo.isSwapInvest) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 10, investUniv3SubscribeReceiveInfo.isSwapInvest);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) investUniv3SubscribeReceiveInfo.positionStatus, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, investUniv3SubscribeReceiveInfo.positionStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || investUniv3SubscribeReceiveInfo.promptInformation != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, InvestUniv3SubscribePromptInformation$$serializer.INSTANCE, investUniv3SubscribeReceiveInfo.promptInformation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || investUniv3SubscribeReceiveInfo.receiveTokenInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, InvestTokenWithAmount$$serializer.INSTANCE, investUniv3SubscribeReceiveInfo.receiveTokenInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd(investUniv3SubscribeReceiveInfo.safeMoonTokenList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], investUniv3SubscribeReceiveInfo.safeMoonTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd(investUniv3SubscribeReceiveInfo.swapToTokenList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 15, kSerializerArr[15], investUniv3SubscribeReceiveInfo.swapToTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd(investUniv3SubscribeReceiveInfo.tokenInfoList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 16, kSerializerArr[16], investUniv3SubscribeReceiveInfo.tokenInfoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) investUniv3SubscribeReceiveInfo.valueDeviationPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, investUniv3SubscribeReceiveInfo.valueDeviationPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) investUniv3SubscribeReceiveInfo.lowerPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, investUniv3SubscribeReceiveInfo.lowerPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) investUniv3SubscribeReceiveInfo.upperPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, investUniv3SubscribeReceiveInfo.upperPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || investUniv3SubscribeReceiveInfo.apr != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, investUniv3SubscribeReceiveInfo.apr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd(investUniv3SubscribeReceiveInfo.transactionStepList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 21, kSerializerArr[21], investUniv3SubscribeReceiveInfo.transactionStepList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd(investUniv3SubscribeReceiveInfo.transactionLossInfo, new InvestTransactionLossInfo((String) null, 0, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 22, InvestTransactionLossInfo$$serializer.INSTANCE, investUniv3SubscribeReceiveInfo.transactionLossInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) investUniv3SubscribeReceiveInfo.swapSlippage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, investUniv3SubscribeReceiveInfo.swapSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || investUniv3SubscribeReceiveInfo.openMev) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 24, investUniv3SubscribeReceiveInfo.openMev);
        }
    }

    public InvestUniv3SubscribeReceiveInfo(@NotNull List<InvestTokenWithApprove> list, @NotNull List<InvestTokenWithAmount> list2, @NotNull String str, Integer num, @NotNull String str2, @NotNull List<InvestTokenWithAmount> list3, @NotNull String str3, @NotNull List<InvestTokenWithAmount> list4, @NotNull List<InvestTokenWithAmount> list5, boolean z, boolean z2, @NotNull String str4, InvestUniv3SubscribePromptInformation investUniv3SubscribePromptInformation, InvestTokenWithAmount investTokenWithAmount, @NotNull List<InvestTokenWithAmount> list6, @NotNull List<InvestTokenWithAmount> list7, @NotNull List<ExpectTokenInfo> list8, @NotNull String str5, @NotNull String str6, @NotNull String str7, String str8, @NotNull List<TransactionStep> list9, @NotNull InvestTransactionLossInfo investTransactionLossInfo, @NotNull String str9, boolean z3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list6, "");
        Intrinsics.checkNotNullParameter(list7, "");
        Intrinsics.checkNotNullParameter(list8, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list9, "");
        Intrinsics.checkNotNullParameter(investTransactionLossInfo, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.approveStatusList = list;
        this.assetsList = list2;
        this.currentPrice = str;
        this.currentTick = num;
        this.estimateGasFee = str2;
        this.feeEarning = list3;
        this.feeRate = str3;
        this.gainsTokenList = list4;
        this.investWithTokenList = list5;
        this.isAllowSubscribe = z;
        this.isSwapInvest = z2;
        this.positionStatus = str4;
        this.promptInformation = investUniv3SubscribePromptInformation;
        this.receiveTokenInfo = investTokenWithAmount;
        this.safeMoonTokenList = list6;
        this.swapToTokenList = list7;
        this.tokenInfoList = list8;
        this.valueDeviationPercentage = str5;
        this.lowerPrice = str6;
        this.upperPrice = str7;
        this.apr = str8;
        this.transactionStepList = list9;
        this.transactionLossInfo = investTransactionLossInfo;
        this.swapSlippage = str9;
        this.openMev = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0163: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r57v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:156) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r32v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000e: ARITH (r57v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0015: CONSTRUCTOR (2 int) A[MD:(int):void (c), WRAPPED] (LINE:157) call: java.util.ArrayList.<init>(int):void type: CONSTRUCTOR) : (r33v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r57v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0025: ARITH (r57v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r35v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r57v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0035: ARITH (r57v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003b: CONSTRUCTOR (2 int) A[MD:(int):void (c), WRAPPED] (LINE:161) call: java.util.ArrayList.<init>(int):void type: CONSTRUCTOR) : (r37v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r57v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0049: ARITH (r57v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004f: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:163) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r39v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0055: ARITH (r57v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005b: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:164) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r40v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0061: ARITH (r57v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? true : (r41v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0069: ARITH (r57v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r42v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0071: ARITH (r57v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribePromptInformation:?: TERNARY null = ((wrap:int:0x0079: ARITH (r57v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribePromptInformation) : (r44v0 com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribePromptInformation))
  (wrap:com.okinc.business.invest_biz.data.models.InvestTokenWithAmount:?: TERNARY null = ((wrap:int:0x0081: ARITH (r57v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.models.InvestTokenWithAmount) : (r45v0 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x008b: ARITH (r57v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0091: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:170) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r46v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x009a: ARITH (r57v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00a0: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:171) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r47v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00a8: ARITH (r57v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00ae: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:172) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r48v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b6: ARITH (r57v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c1: ARITH (r57v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cc: ARITH (r57v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d7: ARITH (r57v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00e2: ARITH (r57v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00e8: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:178) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r53v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo:?: TERNARY null = ((wrap:int:0x00f0: ARITH (r57v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0114: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (31 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:180) call: com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r54v0 com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011c: ARITH (r57v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0127: ARITH (r57v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? false : (r56v0 boolean))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.bean.InvestTokenWithApprove>, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, java.lang.String, java.lang.Integer, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, boolean, boolean, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribePromptInformation, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, java.util.List<com.okinc.business.invest_biz.data.bean.ExpectTokenInfo>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.response.TransactionStep>, com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo, java.lang.String, boolean):void (m)] (LINE:155) call: com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeReceiveInfo.<init>(java.util.List, java.util.List, java.lang.String, java.lang.Integer, java.lang.String, java.util.List, java.lang.String, java.util.List, java.util.List, boolean, boolean, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribePromptInformation, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, java.util.List, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ InvestUniv3SubscribeReceiveInfo(List list, List list2, String str, Integer num, String str2, List list3, String str3, List list4, List list5, boolean z, boolean z2, String str4, InvestUniv3SubscribePromptInformation investUniv3SubscribePromptInformation, InvestTokenWithAmount investTokenWithAmount, List list6, List list7, List list8, String str5, String str6, String str7, String str8, List list9, InvestTransactionLossInfo investTransactionLossInfo, String str9, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList(2) : list2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? null : num, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? new ArrayList(2) : list3, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? new ArrayList() : list4, (i & 256) != 0 ? new ArrayList() : list5, (i & 512) != 0 ? true : z, (i & 1024) != 0 ? false : z2, (i & 2048) != 0 ? "" : str4, (i & 4096) != 0 ? null : investUniv3SubscribePromptInformation, (i & 8192) != 0 ? null : investTokenWithAmount, (i & 16384) != 0 ? new ArrayList() : list6, (i & 32768) != 0 ? new ArrayList() : list7, (i & 65536) != 0 ? new ArrayList() : list8, (i & 131072) != 0 ? "" : str5, (i & 262144) != 0 ? "" : str6, (i & 524288) != 0 ? "" : str7, (i & 1048576) != 0 ? null : str8, (i & 2097152) != 0 ? new ArrayList() : list9, (i & 4194304) != 0 ? new InvestTransactionLossInfo((String) null, 0, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : investTransactionLossInfo, (i & 8388608) != 0 ? "" : str9, (i & 16777216) != 0 ? false : z3);
    }

    public final boolean isActive() {
        return C25541iyf.OLrzqt(this.positionStatus);
    }

    public final boolean isApproveStep() {
        Object next;
        Iterator<T> it = this.transactionStepList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            TransactionStep transactionStep = (TransactionStep) next;
            if (transactionStep.valueOf() == InvestAction.SubscriptionApprove.getValue() && transactionStep.fetchVPNInfo()) {
                break;
            }
        }
        return next != null;
    }
}
