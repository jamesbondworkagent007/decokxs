package com.okinc.business.invest_biz.data.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.annotations.SerializedName;
import com.okinc.business.invest_biz.data.bean.BorrowedInfo;
import com.okinc.business.invest_biz.data.bean.BorrowedInfo$$serializer;
import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.CollateralRatioInfo;
import com.okinc.business.invest_biz.data.bean.CollateralRatioInfo$$serializer;
import com.okinc.business.invest_biz.data.bean.ExpectTokenInfo;
import com.okinc.business.invest_biz.data.bean.ExpectTokenInfo$$serializer;
import com.okinc.business.invest_biz.data.bean.HeathFactorInfo;
import com.okinc.business.invest_biz.data.bean.HeathFactorInfo$$serializer;
import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig$$serializer;
import com.okinc.business.invest_biz.data.bean.InvestSlippageConfig;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.bean.InvestTokenWithApprove;
import com.okinc.business.invest_biz.data.bean.InvestTokenWithApprove$$serializer;
import com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo;
import com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo$$serializer;
import com.okinc.business.invest_biz.data.bean.NetworkFee;
import com.okinc.business.invest_biz.data.bean.PromptInformation;
import com.okinc.business.invest_biz.data.bean.PromptInformation$$serializer;
import com.okinc.business.invest_biz.data.bean.RemainingRepaymentInfo;
import com.okinc.business.invest_biz.data.bean.RemainingRepaymentInfo$$serializer;
import com.okinc.business.invest_biz.data.bean.SwapSlippageConfig;
import com.okinc.business.invest_biz.data.bean.response.TransactionStep;
import com.okinc.business.invest_biz.data.bean.response.TransactionStep$$serializer;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class RedeemDetailsAndGasFee implements Parcelable {
    public static final KSerializer<Object>[] $childSerializers;

    @SerializedName("approveStatusList")
    private final List<InvestTokenWithApprove> approveStatusList;
    public final List<InvestTokenWithAmount> assetsList;

    @SerializedName("borrowed")
    private final BorrowedInfo borrowed;
    public final String collateral;

    @SerializedName("collateralRatioInfo")
    private final CollateralRatioInfo collateralRatioInfo;

    @SerializedName("currentPrice")
    private final String currentPrice;

    @SerializedName("estimateGasFee")
    private final String estimateGasFee;

    @SerializedName("exchangeRate")
    private final String exchangeRate;
    public final List<InvestTokenWithAmount> feeEarning;
    public final String feeRate;

    @SerializedName("investGasPriceConfig")
    private final InvestGasPriceConfig gasPriceConfig;
    public final HeathFactorInfo healthFactorInfo;

    @SerializedName("inputCurrencyAmount")
    private final String inputCurrencyAmount;

    @SerializedName("isAllowRedeem")
    private final boolean isAllowRedeem;
    public final Boolean isSwapInvest;
    public final String liquidity;
    public final String lowerPrice;

    @SerializedName("mySupply")
    private final InvestTokenWithAmount mySupply;
    public final String nftTokenLogo;
    public final Boolean openMev;

    @SerializedName("payWithToken")
    private final InvestTokenWithAmount payWithToken;
    public final String positionStatus;

    @SerializedName("promptInformation")
    private final PromptInformation promptInformation;

    @SerializedName("receiveTokenList")
    private final List<InvestTokenWithAmount> receiveTokenList;

    @SerializedName("remainingRepaymentInfo")
    private final RemainingRepaymentInfo remainingRepaymentInfo;
    public final List<InvestTokenWithAmount> rewardList;

    @SerializedName("safeMoonTokenList")
    private final List<InvestTokenWithAmount> safeMoonTokenList;

    @SerializedName("swapFromTokenList")
    private final List<InvestTokenWithAmount> swapFromTokenList;
    public final String swapSlippage;

    @SerializedName("tokenInfoList")
    private final List<ExpectTokenInfo> tokenInfoList;
    public final InvestTransactionLossInfo transactionLossInfo;

    @SerializedName("transactionStepList")
    private final List<TransactionStep> transactionStepList;
    public final List<InvestTokenWithAmount> underlyingTokenList;
    public final String upperPrice;

    @SerializedName("valueDeviationPercentage")
    private final String valueDeviationPercentage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RedeemDetailsAndGasFee> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RedeemDetailsAndGasFee> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RedeemDetailsAndGasFee createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            InvestGasPriceConfig investGasPriceConfigCreateFromParcel = InvestGasPriceConfig.CREATOR.createFromParcel(parcel);
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
            boolean z = parcel.readInt() != 0;
            String string4 = parcel.readString();
            int i9 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i9);
            for (int i10 = 0; i10 != i9; i10++) {
                arrayList5.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
            }
            PromptInformation promptInformationCreateFromParcel = PromptInformation.CREATOR.createFromParcel(parcel);
            InvestTokenWithAmount investTokenWithAmountCreateFromParcel2 = InvestTokenWithAmount.CREATOR.createFromParcel(parcel);
            RemainingRepaymentInfo remainingRepaymentInfoCreateFromParcel = RemainingRepaymentInfo.CREATOR.createFromParcel(parcel);
            CollateralRatioInfo collateralRatioInfoCreateFromParcel = CollateralRatioInfo.CREATOR.createFromParcel(parcel);
            int i11 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(i11);
            int i12 = 0;
            while (i12 != i11) {
                arrayList6.add(TransactionStep.CREATOR.createFromParcel(parcel));
                i12++;
                i11 = i11;
            }
            String string5 = parcel.readString();
            HeathFactorInfo heathFactorInfoCreateFromParcel = parcel.readInt() == 0 ? null : HeathFactorInfo.CREATOR.createFromParcel(parcel);
            BorrowedInfo borrowedInfoCreateFromParcel = parcel.readInt() == 0 ? null : BorrowedInfo.CREATOR.createFromParcel(parcel);
            String string6 = parcel.readString();
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
                arrayList8.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
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
            String string7 = parcel.readString();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            int i19 = parcel.readInt();
            ArrayList arrayList10 = new ArrayList(i19);
            int i20 = 0;
            while (i20 != i19) {
                arrayList10.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
                i20++;
                i19 = i19;
            }
            return new RedeemDetailsAndGasFee(investGasPriceConfigCreateFromParcel, arrayList, string, arrayList2, arrayList3, investTokenWithAmountCreateFromParcel, string2, string3, arrayList4, z, string4, arrayList5, promptInformationCreateFromParcel, investTokenWithAmountCreateFromParcel2, remainingRepaymentInfoCreateFromParcel, collateralRatioInfoCreateFromParcel, arrayList6, string5, heathFactorInfoCreateFromParcel, borrowedInfoCreateFromParcel, string6, arrayList7, arrayList8, arrayList9, string7, boolValueOf, string8, string9, string10, string11, string12, arrayList10, parcel.readString(), parcel.readInt() == 0 ? null : InvestTransactionLossInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RedeemDetailsAndGasFee[] newArray(int i) {
            return new RedeemDetailsAndGasFee[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RedeemDetailsAndGasFee() {
        this((InvestGasPriceConfig) null, (List) null, (String) null, (List) null, (List) null, (InvestTokenWithAmount) null, (String) null, (String) null, (List) null, false, (String) null, (List) null, (PromptInformation) null, (InvestTokenWithAmount) null, (RemainingRepaymentInfo) null, (CollateralRatioInfo) null, (List) null, (String) null, (HeathFactorInfo) null, (BorrowedInfo) null, (String) null, (List) null, (List) null, (List) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (InvestTransactionLossInfo) null, (Boolean) null, -1, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> AYXKKw() {
        return this.feeEarning;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.exchangeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> AuCTel() {
        return this.receiveTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AubY() {
        return this.isAllowRedeem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean DbNXlk() {
        return this.openMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> EZpvd() {
        return this.assetsList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CollateralRatioInfo KWHzl() {
        return this.collateralRatioInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BorrowedInfo copydefault() {
        return this.borrowed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RedeemDetailsAndGasFee copydefault(@NotNull InvestGasPriceConfig investGasPriceConfig, @NotNull List<InvestTokenWithApprove> list, @NotNull String str, @NotNull List<InvestTokenWithAmount> list2, @NotNull List<InvestTokenWithAmount> list3, @NotNull InvestTokenWithAmount investTokenWithAmount, @NotNull String str2, @NotNull String str3, @NotNull List<ExpectTokenInfo> list4, boolean z, @NotNull String str4, @NotNull List<InvestTokenWithAmount> list5, @NotNull PromptInformation promptInformation, @NotNull InvestTokenWithAmount investTokenWithAmount2, @NotNull RemainingRepaymentInfo remainingRepaymentInfo, @NotNull CollateralRatioInfo collateralRatioInfo, @NotNull List<TransactionStep> list6, String str5, HeathFactorInfo heathFactorInfo, BorrowedInfo borrowedInfo, String str6, @NotNull List<InvestTokenWithAmount> list7, @NotNull List<InvestTokenWithAmount> list8, @NotNull List<InvestTokenWithAmount> list9, String str7, Boolean bool, String str8, String str9, String str10, String str11, String str12, @NotNull List<InvestTokenWithAmount> list10, String str13, InvestTransactionLossInfo investTransactionLossInfo, Boolean bool2) {
        Intrinsics.checkNotNullParameter(investGasPriceConfig, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(promptInformation, "");
        Intrinsics.checkNotNullParameter(investTokenWithAmount2, "");
        Intrinsics.checkNotNullParameter(remainingRepaymentInfo, "");
        Intrinsics.checkNotNullParameter(collateralRatioInfo, "");
        Intrinsics.checkNotNullParameter(list6, "");
        Intrinsics.checkNotNullParameter(list7, "");
        Intrinsics.checkNotNullParameter(list8, "");
        Intrinsics.checkNotNullParameter(list9, "");
        Intrinsics.checkNotNullParameter(list10, "");
        return new RedeemDetailsAndGasFee(investGasPriceConfig, list, str, list2, list3, investTokenWithAmount, str2, str3, list4, z, str4, list5, promptInformation, investTokenWithAmount2, remainingRepaymentInfo, collateralRatioInfo, list6, str5, heathFactorInfo, borrowedInfo, str6, list7, list8, list9, str7, bool, str8, str9, str10, str11, str12, list10, str13, investTransactionLossInfo, bool2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HeathFactorInfo djBIcL() {
        return this.healthFactorInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> ejfBZ() {
        return this.swapFromTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RedeemDetailsAndGasFee)) {
            return false;
        }
        RedeemDetailsAndGasFee redeemDetailsAndGasFee = (RedeemDetailsAndGasFee) obj;
        return Intrinsics.EZpvd(this.gasPriceConfig, redeemDetailsAndGasFee.gasPriceConfig) && Intrinsics.EZpvd(this.approveStatusList, redeemDetailsAndGasFee.approveStatusList) && Intrinsics.EZpvd((Object) this.inputCurrencyAmount, (Object) redeemDetailsAndGasFee.inputCurrencyAmount) && Intrinsics.EZpvd(this.receiveTokenList, redeemDetailsAndGasFee.receiveTokenList) && Intrinsics.EZpvd(this.swapFromTokenList, redeemDetailsAndGasFee.swapFromTokenList) && Intrinsics.EZpvd(this.mySupply, redeemDetailsAndGasFee.mySupply) && Intrinsics.EZpvd((Object) this.valueDeviationPercentage, (Object) redeemDetailsAndGasFee.valueDeviationPercentage) && Intrinsics.EZpvd((Object) this.estimateGasFee, (Object) redeemDetailsAndGasFee.estimateGasFee) && Intrinsics.EZpvd(this.tokenInfoList, redeemDetailsAndGasFee.tokenInfoList) && this.isAllowRedeem == redeemDetailsAndGasFee.isAllowRedeem && Intrinsics.EZpvd((Object) this.exchangeRate, (Object) redeemDetailsAndGasFee.exchangeRate) && Intrinsics.EZpvd(this.safeMoonTokenList, redeemDetailsAndGasFee.safeMoonTokenList) && Intrinsics.EZpvd(this.promptInformation, redeemDetailsAndGasFee.promptInformation) && Intrinsics.EZpvd(this.payWithToken, redeemDetailsAndGasFee.payWithToken) && Intrinsics.EZpvd(this.remainingRepaymentInfo, redeemDetailsAndGasFee.remainingRepaymentInfo) && Intrinsics.EZpvd(this.collateralRatioInfo, redeemDetailsAndGasFee.collateralRatioInfo) && Intrinsics.EZpvd(this.transactionStepList, redeemDetailsAndGasFee.transactionStepList) && Intrinsics.EZpvd((Object) this.collateral, (Object) redeemDetailsAndGasFee.collateral) && Intrinsics.EZpvd(this.healthFactorInfo, redeemDetailsAndGasFee.healthFactorInfo) && Intrinsics.EZpvd(this.borrowed, redeemDetailsAndGasFee.borrowed) && Intrinsics.EZpvd((Object) this.currentPrice, (Object) redeemDetailsAndGasFee.currentPrice) && Intrinsics.EZpvd(this.assetsList, redeemDetailsAndGasFee.assetsList) && Intrinsics.EZpvd(this.rewardList, redeemDetailsAndGasFee.rewardList) && Intrinsics.EZpvd(this.feeEarning, redeemDetailsAndGasFee.feeEarning) && Intrinsics.EZpvd((Object) this.feeRate, (Object) redeemDetailsAndGasFee.feeRate) && Intrinsics.EZpvd(this.isSwapInvest, redeemDetailsAndGasFee.isSwapInvest) && Intrinsics.EZpvd((Object) this.liquidity, (Object) redeemDetailsAndGasFee.liquidity) && Intrinsics.EZpvd((Object) this.positionStatus, (Object) redeemDetailsAndGasFee.positionStatus) && Intrinsics.EZpvd((Object) this.lowerPrice, (Object) redeemDetailsAndGasFee.lowerPrice) && Intrinsics.EZpvd((Object) this.upperPrice, (Object) redeemDetailsAndGasFee.upperPrice) && Intrinsics.EZpvd((Object) this.nftTokenLogo, (Object) redeemDetailsAndGasFee.nftTokenLogo) && Intrinsics.EZpvd(this.underlyingTokenList, redeemDetailsAndGasFee.underlyingTokenList) && Intrinsics.EZpvd((Object) this.swapSlippage, (Object) redeemDetailsAndGasFee.swapSlippage) && Intrinsics.EZpvd(this.transactionLossInfo, redeemDetailsAndGasFee.transactionLossInfo) && Intrinsics.EZpvd(this.openMev, redeemDetailsAndGasFee.openMev);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> fARcdN() {
        return this.rewardList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RemainingRepaymentInfo fIwbmz() {
        return this.remainingRepaymentInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> fJNWhG() {
        return this.safeMoonTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount fetchVPNInfo() {
        return this.mySupply;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.inputCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFieldNames() {
        return this.valueDeviationPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TransactionStep> getNewProxyInstance() {
        return this.transactionStepList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ExpectTokenInfo> hDKMBd() {
        return this.tokenInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.gasPriceConfig.hashCode();
        int iHashCode2 = this.approveStatusList.hashCode();
        int iHashCode3 = this.inputCurrencyAmount.hashCode();
        int iHashCode4 = this.receiveTokenList.hashCode();
        int iHashCode5 = this.swapFromTokenList.hashCode();
        int iHashCode6 = this.mySupply.hashCode();
        int iHashCode7 = this.valueDeviationPercentage.hashCode();
        int iHashCode8 = this.estimateGasFee.hashCode();
        int iHashCode9 = this.tokenInfoList.hashCode();
        int iHashCode10 = Boolean.hashCode(this.isAllowRedeem);
        int iHashCode11 = this.exchangeRate.hashCode();
        int iHashCode12 = this.safeMoonTokenList.hashCode();
        int iHashCode13 = this.promptInformation.hashCode();
        int iHashCode14 = this.payWithToken.hashCode();
        int iHashCode15 = this.remainingRepaymentInfo.hashCode();
        int iHashCode16 = this.collateralRatioInfo.hashCode();
        int iHashCode17 = this.transactionStepList.hashCode();
        String str = this.collateral;
        int iHashCode18 = str == null ? 0 : str.hashCode();
        HeathFactorInfo heathFactorInfo = this.healthFactorInfo;
        int iHashCode19 = heathFactorInfo == null ? 0 : heathFactorInfo.hashCode();
        BorrowedInfo borrowedInfo = this.borrowed;
        int iHashCode20 = borrowedInfo == null ? 0 : borrowedInfo.hashCode();
        String str2 = this.currentPrice;
        int iHashCode21 = str2 == null ? 0 : str2.hashCode();
        int iHashCode22 = this.assetsList.hashCode();
        int iHashCode23 = this.rewardList.hashCode();
        int iHashCode24 = this.feeEarning.hashCode();
        String str3 = this.feeRate;
        int iHashCode25 = str3 == null ? 0 : str3.hashCode();
        Boolean bool = this.isSwapInvest;
        int iHashCode26 = bool == null ? 0 : bool.hashCode();
        String str4 = this.liquidity;
        int iHashCode27 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.positionStatus;
        int iHashCode28 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.lowerPrice;
        int iHashCode29 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.upperPrice;
        int iHashCode30 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.nftTokenLogo;
        int iHashCode31 = str8 == null ? 0 : str8.hashCode();
        int iHashCode32 = this.underlyingTokenList.hashCode();
        String str9 = this.swapSlippage;
        int iHashCode33 = str9 == null ? 0 : str9.hashCode();
        InvestTransactionLossInfo investTransactionLossInfo = this.transactionLossInfo;
        int iHashCode34 = investTransactionLossInfo == null ? 0 : investTransactionLossInfo.hashCode();
        Boolean bool2 = this.openMev;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount isConnected() {
        return this.payWithToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTransactionLossInfo iwGUEr() {
        return this.transactionLossInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RedeemDetailsAndGasFee(gasPriceConfig=" + this.gasPriceConfig + ", approveStatusList=" + this.approveStatusList + ", inputCurrencyAmount=" + this.inputCurrencyAmount + ", receiveTokenList=" + this.receiveTokenList + ", swapFromTokenList=" + this.swapFromTokenList + ", mySupply=" + this.mySupply + ", valueDeviationPercentage=" + this.valueDeviationPercentage + ", estimateGasFee=" + this.estimateGasFee + ", tokenInfoList=" + this.tokenInfoList + ", isAllowRedeem=" + this.isAllowRedeem + ", exchangeRate=" + this.exchangeRate + ", safeMoonTokenList=" + this.safeMoonTokenList + ", promptInformation=" + this.promptInformation + ", payWithToken=" + this.payWithToken + ", remainingRepaymentInfo=" + this.remainingRepaymentInfo + ", collateralRatioInfo=" + this.collateralRatioInfo + ", transactionStepList=" + this.transactionStepList + ", collateral=" + this.collateral + ", healthFactorInfo=" + this.healthFactorInfo + ", borrowed=" + this.borrowed + ", currentPrice=" + this.currentPrice + ", assetsList=" + this.assetsList + ", rewardList=" + this.rewardList + ", feeEarning=" + this.feeEarning + ", feeRate=" + this.feeRate + ", isSwapInvest=" + this.isSwapInvest + ", liquidity=" + this.liquidity + ", positionStatus=" + this.positionStatus + ", lowerPrice=" + this.lowerPrice + ", upperPrice=" + this.upperPrice + ", nftTokenLogo=" + this.nftTokenLogo + ", underlyingTokenList=" + this.underlyingTokenList + ", swapSlippage=" + this.swapSlippage + ", transactionLossInfo=" + this.transactionLossInfo + ", openMev=" + this.openMev + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String uzCIH() {
        return this.swapSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestGasPriceConfig valueOf() {
        return this.gasPriceConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PromptInformation values() {
        return this.promptInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.gasPriceConfig.writeToParcel(parcel, i);
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
        parcel.writeString(this.exchangeRate);
        List<InvestTokenWithAmount> list5 = this.safeMoonTokenList;
        parcel.writeInt(list5.size());
        Iterator<InvestTokenWithAmount> it5 = list5.iterator();
        while (it5.hasNext()) {
            it5.next().writeToParcel(parcel, i);
        }
        this.promptInformation.writeToParcel(parcel, i);
        this.payWithToken.writeToParcel(parcel, i);
        this.remainingRepaymentInfo.writeToParcel(parcel, i);
        this.collateralRatioInfo.writeToParcel(parcel, i);
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
        parcel.writeString(this.currentPrice);
        List<InvestTokenWithAmount> list7 = this.assetsList;
        parcel.writeInt(list7.size());
        Iterator<InvestTokenWithAmount> it7 = list7.iterator();
        while (it7.hasNext()) {
            it7.next().writeToParcel(parcel, i);
        }
        List<InvestTokenWithAmount> list8 = this.rewardList;
        parcel.writeInt(list8.size());
        Iterator<InvestTokenWithAmount> it8 = list8.iterator();
        while (it8.hasNext()) {
            it8.next().writeToParcel(parcel, i);
        }
        List<InvestTokenWithAmount> list9 = this.feeEarning;
        parcel.writeInt(list9.size());
        Iterator<InvestTokenWithAmount> it9 = list9.iterator();
        while (it9.hasNext()) {
            it9.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.feeRate);
        Boolean bool = this.isSwapInvest;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.liquidity);
        parcel.writeString(this.positionStatus);
        parcel.writeString(this.lowerPrice);
        parcel.writeString(this.upperPrice);
        parcel.writeString(this.nftTokenLogo);
        List<InvestTokenWithAmount> list10 = this.underlyingTokenList;
        parcel.writeInt(list10.size());
        Iterator<InvestTokenWithAmount> it10 = list10.iterator();
        while (it10.hasNext()) {
            it10.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.swapSlippage);
        InvestTransactionLossInfo investTransactionLossInfo = this.transactionLossInfo;
        if (investTransactionLossInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTransactionLossInfo.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.openMev;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.models.RedeemDetailsAndGasFee.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RedeemDetailsAndGasFee> serializer() {
            return RedeemDetailsAndGasFee$$serializer.INSTANCE;
        }
    }

    static {
        InvestTokenWithAmount$$serializer investTokenWithAmount$$serializer = InvestTokenWithAmount$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new ArrayListSerializer(InvestTokenWithApprove$$serializer.INSTANCE), null, new ArrayListSerializer(investTokenWithAmount$$serializer), new ArrayListSerializer(investTokenWithAmount$$serializer), null, null, null, new ArrayListSerializer(ExpectTokenInfo$$serializer.INSTANCE), null, null, new ArrayListSerializer(investTokenWithAmount$$serializer), null, null, null, null, new ArrayListSerializer(TransactionStep$$serializer.INSTANCE), null, null, null, null, new ArrayListSerializer(investTokenWithAmount$$serializer), new ArrayListSerializer(investTokenWithAmount$$serializer), new ArrayListSerializer(investTokenWithAmount$$serializer), null, null, null, null, null, null, null, new ArrayListSerializer(investTokenWithAmount$$serializer), null, null, null};
    }

    public /* synthetic */ RedeemDetailsAndGasFee(int i, int i2, InvestGasPriceConfig investGasPriceConfig, List list, String str, List list2, List list3, InvestTokenWithAmount investTokenWithAmount, String str2, String str3, List list4, boolean z, String str4, List list5, PromptInformation promptInformation, InvestTokenWithAmount investTokenWithAmount2, RemainingRepaymentInfo remainingRepaymentInfo, CollateralRatioInfo collateralRatioInfo, List list6, String str5, HeathFactorInfo heathFactorInfo, BorrowedInfo borrowedInfo, String str6, List list7, List list8, List list9, String str7, Boolean bool, String str8, String str9, String str10, String str11, String str12, List list10, String str13, InvestTransactionLossInfo investTransactionLossInfo, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        RemainingRepaymentInfo remainingRepaymentInfo2;
        this.gasPriceConfig = (i & 1) == 0 ? new InvestGasPriceConfig((InvestSlippageConfig) null, (NetworkFee) null, (String) null, (SwapSlippageConfig) null, 15, (DefaultConstructorMarker) null) : investGasPriceConfig;
        this.approveStatusList = (i & 2) == 0 ? yDY.AhwBna() : list;
        if ((i & 4) == 0) {
            this.inputCurrencyAmount = "";
        } else {
            this.inputCurrencyAmount = str;
        }
        this.receiveTokenList = (i & 8) == 0 ? yDY.AhwBna() : list2;
        this.swapFromTokenList = (i & 16) == 0 ? yDY.AhwBna() : list3;
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
        this.tokenInfoList = (i & 256) == 0 ? yDY.AhwBna() : list4;
        this.isAllowRedeem = (i & 512) == 0 ? true : z;
        if ((i & 1024) == 0) {
            this.exchangeRate = "";
        } else {
            this.exchangeRate = str4;
        }
        this.safeMoonTokenList = (i & 2048) == 0 ? yDY.AhwBna() : list5;
        this.promptInformation = (i & 4096) == 0 ? new PromptInformation((InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, 1023, (DefaultConstructorMarker) null) : promptInformation;
        this.payWithToken = (i & 8192) == 0 ? new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null) : investTokenWithAmount2;
        InvestTokenWithAmount investTokenWithAmount3 = null;
        byte b = 0;
        byte b2 = 0;
        if ((i & 16384) == 0) {
            remainingRepaymentInfo2 = new RemainingRepaymentInfo(investTokenWithAmount3, (InvestTokenWithAmount) (b2 == true ? 1 : 0), 3, (DefaultConstructorMarker) (b == true ? 1 : 0));
        } else {
            remainingRepaymentInfo2 = remainingRepaymentInfo;
        }
        this.remainingRepaymentInfo = remainingRepaymentInfo2;
        this.collateralRatioInfo = (32768 & i) == 0 ? new CollateralRatioInfo((String) null, (Integer) null, (String) null, (Integer) null, (String) null, 31, (DefaultConstructorMarker) null) : collateralRatioInfo;
        this.transactionStepList = (65536 & i) == 0 ? yDY.AhwBna() : list6;
        if ((131072 & i) == 0) {
            this.collateral = null;
        } else {
            this.collateral = str5;
        }
        if ((262144 & i) == 0) {
            this.healthFactorInfo = null;
        } else {
            this.healthFactorInfo = heathFactorInfo;
        }
        if ((524288 & i) == 0) {
            this.borrowed = null;
        } else {
            this.borrowed = borrowedInfo;
        }
        if ((1048576 & i) == 0) {
            this.currentPrice = "";
        } else {
            this.currentPrice = str6;
        }
        this.assetsList = (2097152 & i) == 0 ? new ArrayList(2) : list7;
        this.rewardList = (4194304 & i) == 0 ? new ArrayList(2) : list8;
        this.feeEarning = (8388608 & i) == 0 ? new ArrayList(2) : list9;
        if ((16777216 & i) == 0) {
            this.feeRate = "";
        } else {
            this.feeRate = str7;
        }
        this.isSwapInvest = (33554432 & i) == 0 ? Boolean.FALSE : bool;
        if ((67108864 & i) == 0) {
            this.liquidity = "";
        } else {
            this.liquidity = str8;
        }
        if ((134217728 & i) == 0) {
            this.positionStatus = "";
        } else {
            this.positionStatus = str9;
        }
        if ((268435456 & i) == 0) {
            this.lowerPrice = "";
        } else {
            this.lowerPrice = str10;
        }
        if ((536870912 & i) == 0) {
            this.upperPrice = "";
        } else {
            this.upperPrice = str11;
        }
        if ((1073741824 & i) == 0) {
            this.nftTokenLogo = "";
        } else {
            this.nftTokenLogo = str12;
        }
        this.underlyingTokenList = (i & Integer.MIN_VALUE) == 0 ? new ArrayList() : list10;
        if ((i2 & 1) == 0) {
            this.swapSlippage = "";
        } else {
            this.swapSlippage = str13;
        }
        if ((i2 & 2) == 0) {
            this.transactionLossInfo = null;
        } else {
            this.transactionLossInfo = investTransactionLossInfo;
        }
        this.openMev = (i2 & 4) == 0 ? Boolean.FALSE : bool2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [21=17] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void AEQbTJ(RedeemDetailsAndGasFee redeemDetailsAndGasFee, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(redeemDetailsAndGasFee.gasPriceConfig, new InvestGasPriceConfig((InvestSlippageConfig) null, (NetworkFee) null, (String) null, (SwapSlippageConfig) null, 15, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, InvestGasPriceConfig$$serializer.INSTANCE, redeemDetailsAndGasFee.gasPriceConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(redeemDetailsAndGasFee.approveStatusList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], redeemDetailsAndGasFee.approveStatusList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) redeemDetailsAndGasFee.inputCurrencyAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, redeemDetailsAndGasFee.inputCurrencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(redeemDetailsAndGasFee.receiveTokenList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], redeemDetailsAndGasFee.receiveTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(redeemDetailsAndGasFee.swapFromTokenList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], redeemDetailsAndGasFee.swapFromTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(redeemDetailsAndGasFee.mySupply, new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, InvestTokenWithAmount$$serializer.INSTANCE, redeemDetailsAndGasFee.mySupply);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) redeemDetailsAndGasFee.valueDeviationPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, redeemDetailsAndGasFee.valueDeviationPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) redeemDetailsAndGasFee.estimateGasFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, redeemDetailsAndGasFee.estimateGasFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(redeemDetailsAndGasFee.tokenInfoList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], redeemDetailsAndGasFee.tokenInfoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !redeemDetailsAndGasFee.isAllowRedeem) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, redeemDetailsAndGasFee.isAllowRedeem);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) redeemDetailsAndGasFee.exchangeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, redeemDetailsAndGasFee.exchangeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(redeemDetailsAndGasFee.safeMoonTokenList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], redeemDetailsAndGasFee.safeMoonTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd(redeemDetailsAndGasFee.promptInformation, new PromptInformation((InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, 1023, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 12, PromptInformation$$serializer.INSTANCE, redeemDetailsAndGasFee.promptInformation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd(redeemDetailsAndGasFee.payWithToken, new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 13, InvestTokenWithAmount$$serializer.INSTANCE, redeemDetailsAndGasFee.payWithToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14)) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 14, RemainingRepaymentInfo$$serializer.INSTANCE, redeemDetailsAndGasFee.remainingRepaymentInfo);
        } else {
            if (!Intrinsics.EZpvd(redeemDetailsAndGasFee.remainingRepaymentInfo, new RemainingRepaymentInfo((InvestTokenWithAmount) null, (InvestTokenWithAmount) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0)))) {
            }
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd(redeemDetailsAndGasFee.collateralRatioInfo, new CollateralRatioInfo((String) null, (Integer) null, (String) null, (Integer) null, (String) null, 31, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 15, CollateralRatioInfo$$serializer.INSTANCE, redeemDetailsAndGasFee.collateralRatioInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd(redeemDetailsAndGasFee.transactionStepList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 16, kSerializerArr[16], redeemDetailsAndGasFee.transactionStepList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || redeemDetailsAndGasFee.collateral != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, redeemDetailsAndGasFee.collateral);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || redeemDetailsAndGasFee.healthFactorInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, HeathFactorInfo$$serializer.INSTANCE, redeemDetailsAndGasFee.healthFactorInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || redeemDetailsAndGasFee.borrowed != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, BorrowedInfo$$serializer.INSTANCE, redeemDetailsAndGasFee.borrowed);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) redeemDetailsAndGasFee.currentPrice, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, redeemDetailsAndGasFee.currentPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd(redeemDetailsAndGasFee.assetsList, new ArrayList(2))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 21, kSerializerArr[21], redeemDetailsAndGasFee.assetsList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd(redeemDetailsAndGasFee.rewardList, new ArrayList(2))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 22, kSerializerArr[22], redeemDetailsAndGasFee.rewardList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd(redeemDetailsAndGasFee.feeEarning, new ArrayList(2))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 23, kSerializerArr[23], redeemDetailsAndGasFee.feeEarning);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) redeemDetailsAndGasFee.feeRate, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, redeemDetailsAndGasFee.feeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd(redeemDetailsAndGasFee.isSwapInvest, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, BooleanSerializer.INSTANCE, redeemDetailsAndGasFee.isSwapInvest);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) redeemDetailsAndGasFee.liquidity, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, redeemDetailsAndGasFee.liquidity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) redeemDetailsAndGasFee.positionStatus, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, StringSerializer.INSTANCE, redeemDetailsAndGasFee.positionStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) redeemDetailsAndGasFee.lowerPrice, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, StringSerializer.INSTANCE, redeemDetailsAndGasFee.lowerPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) redeemDetailsAndGasFee.upperPrice, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, redeemDetailsAndGasFee.upperPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) redeemDetailsAndGasFee.nftTokenLogo, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.INSTANCE, redeemDetailsAndGasFee.nftTokenLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd(redeemDetailsAndGasFee.underlyingTokenList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 31, kSerializerArr[31], redeemDetailsAndGasFee.underlyingTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) redeemDetailsAndGasFee.swapSlippage, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, StringSerializer.INSTANCE, redeemDetailsAndGasFee.swapSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || redeemDetailsAndGasFee.transactionLossInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, InvestTransactionLossInfo$$serializer.INSTANCE, redeemDetailsAndGasFee.transactionLossInfo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) && Intrinsics.EZpvd(redeemDetailsAndGasFee.openMev, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, BooleanSerializer.INSTANCE, redeemDetailsAndGasFee.openMev);
    }

    public RedeemDetailsAndGasFee(@NotNull InvestGasPriceConfig investGasPriceConfig, @NotNull List<InvestTokenWithApprove> list, @NotNull String str, @NotNull List<InvestTokenWithAmount> list2, @NotNull List<InvestTokenWithAmount> list3, @NotNull InvestTokenWithAmount investTokenWithAmount, @NotNull String str2, @NotNull String str3, @NotNull List<ExpectTokenInfo> list4, boolean z, @NotNull String str4, @NotNull List<InvestTokenWithAmount> list5, @NotNull PromptInformation promptInformation, @NotNull InvestTokenWithAmount investTokenWithAmount2, @NotNull RemainingRepaymentInfo remainingRepaymentInfo, @NotNull CollateralRatioInfo collateralRatioInfo, @NotNull List<TransactionStep> list6, String str5, HeathFactorInfo heathFactorInfo, BorrowedInfo borrowedInfo, String str6, @NotNull List<InvestTokenWithAmount> list7, @NotNull List<InvestTokenWithAmount> list8, @NotNull List<InvestTokenWithAmount> list9, String str7, Boolean bool, String str8, String str9, String str10, String str11, String str12, @NotNull List<InvestTokenWithAmount> list10, String str13, InvestTransactionLossInfo investTransactionLossInfo, Boolean bool2) {
        Intrinsics.checkNotNullParameter(investGasPriceConfig, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(promptInformation, "");
        Intrinsics.checkNotNullParameter(investTokenWithAmount2, "");
        Intrinsics.checkNotNullParameter(remainingRepaymentInfo, "");
        Intrinsics.checkNotNullParameter(collateralRatioInfo, "");
        Intrinsics.checkNotNullParameter(list6, "");
        Intrinsics.checkNotNullParameter(list7, "");
        Intrinsics.checkNotNullParameter(list8, "");
        Intrinsics.checkNotNullParameter(list9, "");
        Intrinsics.checkNotNullParameter(list10, "");
        this.gasPriceConfig = investGasPriceConfig;
        this.approveStatusList = list;
        this.inputCurrencyAmount = str;
        this.receiveTokenList = list2;
        this.swapFromTokenList = list3;
        this.mySupply = investTokenWithAmount;
        this.valueDeviationPercentage = str2;
        this.estimateGasFee = str3;
        this.tokenInfoList = list4;
        this.isAllowRedeem = z;
        this.exchangeRate = str4;
        this.safeMoonTokenList = list5;
        this.promptInformation = promptInformation;
        this.payWithToken = investTokenWithAmount2;
        this.remainingRepaymentInfo = remainingRepaymentInfo;
        this.collateralRatioInfo = collateralRatioInfo;
        this.transactionStepList = list6;
        this.collateral = str5;
        this.healthFactorInfo = heathFactorInfo;
        this.borrowed = borrowedInfo;
        this.currentPrice = str6;
        this.assetsList = list7;
        this.rewardList = list8;
        this.feeEarning = list9;
        this.feeRate = str7;
        this.isSwapInvest = bool;
        this.liquidity = str8;
        this.positionStatus = str9;
        this.lowerPrice = str10;
        this.upperPrice = str11;
        this.nftTokenLogo = str12;
        this.underlyingTokenList = list10;
        this.swapSlippage = str13;
        this.transactionLossInfo = investTransactionLossInfo;
        this.openMev = bool2;
    }

    public /* synthetic */ RedeemDetailsAndGasFee(InvestGasPriceConfig investGasPriceConfig, List list, String str, List list2, List list3, InvestTokenWithAmount investTokenWithAmount, String str2, String str3, List list4, boolean z, String str4, List list5, PromptInformation promptInformation, InvestTokenWithAmount investTokenWithAmount2, RemainingRepaymentInfo remainingRepaymentInfo, CollateralRatioInfo collateralRatioInfo, List list6, String str5, HeathFactorInfo heathFactorInfo, BorrowedInfo borrowedInfo, String str6, List list7, List list8, List list9, String str7, Boolean bool, String str8, String str9, String str10, String str11, String str12, List list10, String str13, InvestTransactionLossInfo investTransactionLossInfo, Boolean bool2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        PromptInformation promptInformation2;
        RemainingRepaymentInfo remainingRepaymentInfo2;
        CollateralRatioInfo collateralRatioInfo2;
        List arrayList;
        List list11;
        List arrayList2;
        List list12;
        List arrayList3;
        InvestGasPriceConfig investGasPriceConfig2 = (i & 1) != 0 ? new InvestGasPriceConfig((InvestSlippageConfig) null, (NetworkFee) null, (String) null, (SwapSlippageConfig) null, 15, (DefaultConstructorMarker) null) : investGasPriceConfig;
        List listAhwBna = (i & 2) != 0 ? yDY.AhwBna() : list;
        String str14 = (i & 4) != 0 ? "" : str;
        List listAhwBna2 = (i & 8) != 0 ? yDY.AhwBna() : list2;
        List listAhwBna3 = (i & 16) != 0 ? yDY.AhwBna() : list3;
        InvestTokenWithAmount investTokenWithAmount3 = (i & 32) != 0 ? new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null) : investTokenWithAmount;
        String str15 = (i & 64) != 0 ? "" : str2;
        String str16 = (i & 128) != 0 ? "" : str3;
        List listAhwBna4 = (i & 256) != 0 ? yDY.AhwBna() : list4;
        boolean z2 = (i & 512) != 0 ? true : z;
        String str17 = (i & 1024) != 0 ? "" : str4;
        List listAhwBna5 = (i & 2048) != 0 ? yDY.AhwBna() : list5;
        PromptInformation promptInformation3 = (i & 4096) != 0 ? new PromptInformation((InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, 1023, (DefaultConstructorMarker) null) : promptInformation;
        InvestTokenWithAmount investTokenWithAmount4 = (i & 8192) != 0 ? new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null) : investTokenWithAmount2;
        InvestTokenWithAmount investTokenWithAmount5 = null;
        byte b = 0;
        byte b2 = 0;
        if ((i & 16384) != 0) {
            promptInformation2 = promptInformation3;
            remainingRepaymentInfo2 = new RemainingRepaymentInfo(investTokenWithAmount5, (InvestTokenWithAmount) (b2 == true ? 1 : 0), 3, (DefaultConstructorMarker) (b == true ? 1 : 0));
        } else {
            promptInformation2 = promptInformation3;
            remainingRepaymentInfo2 = remainingRepaymentInfo;
        }
        CollateralRatioInfo collateralRatioInfo3 = (32768 & i) != 0 ? new CollateralRatioInfo((String) null, (Integer) null, (String) null, (Integer) null, (String) null, 31, (DefaultConstructorMarker) null) : collateralRatioInfo;
        List listAhwBna6 = (i & 65536) != 0 ? yDY.AhwBna() : list6;
        String str18 = (i & 131072) != 0 ? null : str5;
        HeathFactorInfo heathFactorInfo2 = (i & 262144) != 0 ? null : heathFactorInfo;
        BorrowedInfo borrowedInfo2 = (i & 524288) != 0 ? null : borrowedInfo;
        String str19 = (i & 1048576) != 0 ? "" : str6;
        if ((i & 2097152) != 0) {
            collateralRatioInfo2 = collateralRatioInfo3;
            arrayList = new ArrayList(2);
        } else {
            collateralRatioInfo2 = collateralRatioInfo3;
            arrayList = list7;
        }
        if ((i & 4194304) != 0) {
            list11 = arrayList;
            arrayList2 = new ArrayList(2);
        } else {
            list11 = arrayList;
            arrayList2 = list8;
        }
        if ((i & 8388608) != 0) {
            list12 = arrayList2;
            arrayList3 = new ArrayList(2);
        } else {
            list12 = arrayList2;
            arrayList3 = list9;
        }
        this(investGasPriceConfig2, listAhwBna, str14, listAhwBna2, listAhwBna3, investTokenWithAmount3, str15, str16, listAhwBna4, z2, str17, listAhwBna5, promptInformation2, investTokenWithAmount4, remainingRepaymentInfo2, collateralRatioInfo2, listAhwBna6, str18, heathFactorInfo2, borrowedInfo2, str19, list11, list12, arrayList3, (16777216 & i) != 0 ? "" : str7, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? Boolean.FALSE : bool, (i & 67108864) != 0 ? "" : str8, (i & 134217728) != 0 ? "" : str9, (i & 268435456) != 0 ? "" : str10, (i & 536870912) != 0 ? "" : str11, (i & 1073741824) != 0 ? "" : str12, (i & Integer.MIN_VALUE) != 0 ? new ArrayList() : list10, (i2 & 1) != 0 ? "" : str13, (i2 & 2) != 0 ? null : investTransactionLossInfo, (i2 & 4) != 0 ? Boolean.FALSE : bool2);
    }
}
