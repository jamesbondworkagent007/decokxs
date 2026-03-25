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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.AbstractC25473ixQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestRedeemInitialInfo extends AbstractC25473ixQ implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    public static final int MODE_SOL_TEMPLATE = 3;
    public static final int MODE_STX_TEMPLATE = 1;
    public static final int MODE_SUI_TEMPLATE = 2;
    private final Long analysisPlatformId;
    private final BorrowedInfo borrowed;
    private final BTCMode btcMode;
    private final long chainId;
    private final CollateralRatioInfo collateralRatioInfo;
    private final Boolean disableInput;
    private final Integer estUnbondTime;
    private final Integer inputPrecision;
    private final List<InvestOrder> investOrderList;
    private final InvestType investType;
    private final long investmentId;
    private final String investmentName;
    private final boolean isSingleValidator;
    private final boolean isSupportLock;
    private final boolean isSupportSwap;
    private final String lockRedeemTip;
    private final InvestTokenWithAmount lpTokenInfo;
    private final Integer mode;
    private final InvestTokenWithAmount mySupply;
    private final String network;
    private final String networkLogo;
    private final String platformLogo;
    private final String platformName;
    private final PromptInformation promptInformation;
    private final List<InvestTokenWithAmount> receiveTokenList;
    private final TransactionMethod redeemMethod;
    private final InvestTokenWithAmount remainingRepayment;
    private final String reserveFee;
    private final String tvl;
    private final List<InvestTokenWithAmount> underlyingTokenList;
    private final String validatorName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestRedeemInitialInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestRedeemInitialInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestRedeemInitialInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            InvestType investTypeValueOf = InvestType.valueOf(parcel.readString());
            long j2 = parcel.readLong();
            String string = parcel.readString();
            boolean z = parcel.readInt() != 0;
            InvestTokenWithAmount investTokenWithAmountCreateFromParcel = InvestTokenWithAmount.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
            }
            TransactionMethod transactionMethodValueOf = TransactionMethod.valueOf(parcel.readString());
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            int i4 = 0;
            while (i4 != i3) {
                arrayList2.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
                i4++;
                i3 = i3;
            }
            InvestTokenWithAmount investTokenWithAmountCreateFromParcel2 = parcel.readInt() == 0 ? null : InvestTokenWithAmount.CREATOR.createFromParcel(parcel);
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            boolean z2 = parcel.readInt() != 0;
            String string6 = parcel.readString();
            PromptInformation promptInformationCreateFromParcel = parcel.readInt() == 0 ? null : PromptInformation.CREATOR.createFromParcel(parcel);
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z3 = parcel.readInt() != 0;
            String string7 = parcel.readString();
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            int i6 = 0;
            while (i6 != i5) {
                arrayList3.add(InvestOrder.CREATOR.createFromParcel(parcel));
                i6++;
                i5 = i5;
            }
            return new InvestRedeemInitialInfo(j, investTypeValueOf, j2, string, z, investTokenWithAmountCreateFromParcel, string2, string3, string4, string5, arrayList, transactionMethodValueOf, arrayList2, investTokenWithAmountCreateFromParcel2, lValueOf, z2, string6, promptInformationCreateFromParcel, numValueOf, z3, string7, arrayList3, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : InvestTokenWithAmount.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CollateralRatioInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : BTCMode.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : BorrowedInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestRedeemInitialInfo[] newArray(int i) {
            return new InvestRedeemInitialInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestRedeemInitialInfo() {
        this(0L, (InvestType) null, 0L, (String) null, false, (InvestTokenWithAmount) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TransactionMethod) null, (List) null, (InvestTokenWithAmount) null, (Long) null, false, (String) null, (PromptInformation) null, (Integer) null, false, (String) null, (List) null, (Integer) null, (Boolean) null, (InvestTokenWithAmount) null, (CollateralRatioInfo) null, (Integer) null, (BTCMode) null, (BorrowedInfo) null, (String) null, (String) null, Integer.MAX_VALUE, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component11() {
        return this.receiveTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionMethod component12() {
        return this.redeemMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component13() {
        return this.underlyingTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount component14() {
        return this.lpTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component15() {
        return this.analysisPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component16() {
        return this.isSupportLock;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.lockRedeemTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PromptInformation component18() {
        return this.promptInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component19() {
        return this.inputPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestType component2() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component20() {
        return this.isSingleValidator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.validatorName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestOrder> component22() {
        return this.investOrderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component23() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component24() {
        return this.disableInput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount component25() {
        return this.remainingRepayment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CollateralRatioInfo component26() {
        return this.collateralRatioInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component27() {
        return this.estUnbondTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BTCMode component28() {
        return this.btcMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BorrowedInfo component29() {
        return this.borrowed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.reserveFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.tvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.investmentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isSupportSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount component6() {
        return this.mySupply;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.networkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.platformLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestRedeemInitialInfo copy(long j, @NotNull InvestType investType, long j2, @NotNull String str, boolean z, @NotNull InvestTokenWithAmount investTokenWithAmount, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull List<InvestTokenWithAmount> list, @NotNull TransactionMethod transactionMethod, @NotNull List<InvestTokenWithAmount> list2, InvestTokenWithAmount investTokenWithAmount2, Long l, boolean z2, @NotNull String str6, PromptInformation promptInformation, Integer num, boolean z3, @NotNull String str7, @NotNull List<InvestOrder> list3, Integer num2, Boolean bool, InvestTokenWithAmount investTokenWithAmount3, CollateralRatioInfo collateralRatioInfo, Integer num3, BTCMode bTCMode, BorrowedInfo borrowedInfo, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(investType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(transactionMethod, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new InvestRedeemInitialInfo(j, investType, j2, str, z, investTokenWithAmount, str2, str3, str4, str5, list, transactionMethod, list2, investTokenWithAmount2, l, z2, str6, promptInformation, num, z3, str7, list3, num2, bool, investTokenWithAmount3, collateralRatioInfo, num3, bTCMode, borrowedInfo, str8, str9);
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
        if (!(obj instanceof InvestRedeemInitialInfo)) {
            return false;
        }
        InvestRedeemInitialInfo investRedeemInitialInfo = (InvestRedeemInitialInfo) obj;
        return this.chainId == investRedeemInitialInfo.chainId && this.investType == investRedeemInitialInfo.investType && this.investmentId == investRedeemInitialInfo.investmentId && Intrinsics.EZpvd((Object) this.investmentName, (Object) investRedeemInitialInfo.investmentName) && this.isSupportSwap == investRedeemInitialInfo.isSupportSwap && Intrinsics.EZpvd(this.mySupply, investRedeemInitialInfo.mySupply) && Intrinsics.EZpvd((Object) this.network, (Object) investRedeemInitialInfo.network) && Intrinsics.EZpvd((Object) this.networkLogo, (Object) investRedeemInitialInfo.networkLogo) && Intrinsics.EZpvd((Object) this.platformLogo, (Object) investRedeemInitialInfo.platformLogo) && Intrinsics.EZpvd((Object) this.platformName, (Object) investRedeemInitialInfo.platformName) && Intrinsics.EZpvd(this.receiveTokenList, investRedeemInitialInfo.receiveTokenList) && this.redeemMethod == investRedeemInitialInfo.redeemMethod && Intrinsics.EZpvd(this.underlyingTokenList, investRedeemInitialInfo.underlyingTokenList) && Intrinsics.EZpvd(this.lpTokenInfo, investRedeemInitialInfo.lpTokenInfo) && Intrinsics.EZpvd(this.analysisPlatformId, investRedeemInitialInfo.analysisPlatformId) && this.isSupportLock == investRedeemInitialInfo.isSupportLock && Intrinsics.EZpvd((Object) this.lockRedeemTip, (Object) investRedeemInitialInfo.lockRedeemTip) && Intrinsics.EZpvd(this.promptInformation, investRedeemInitialInfo.promptInformation) && Intrinsics.EZpvd(this.inputPrecision, investRedeemInitialInfo.inputPrecision) && this.isSingleValidator == investRedeemInitialInfo.isSingleValidator && Intrinsics.EZpvd((Object) this.validatorName, (Object) investRedeemInitialInfo.validatorName) && Intrinsics.EZpvd(this.investOrderList, investRedeemInitialInfo.investOrderList) && Intrinsics.EZpvd(this.mode, investRedeemInitialInfo.mode) && Intrinsics.EZpvd(this.disableInput, investRedeemInitialInfo.disableInput) && Intrinsics.EZpvd(this.remainingRepayment, investRedeemInitialInfo.remainingRepayment) && Intrinsics.EZpvd(this.collateralRatioInfo, investRedeemInitialInfo.collateralRatioInfo) && Intrinsics.EZpvd(this.estUnbondTime, investRedeemInitialInfo.estUnbondTime) && this.btcMode == investRedeemInitialInfo.btcMode && Intrinsics.EZpvd(this.borrowed, investRedeemInitialInfo.borrowed) && Intrinsics.EZpvd((Object) this.reserveFee, (Object) investRedeemInitialInfo.reserveFee) && Intrinsics.EZpvd((Object) this.tvl, (Object) investRedeemInitialInfo.tvl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getAnalysisPlatformId() {
        return this.analysisPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BorrowedInfo getBorrowed() {
        return this.borrowed;
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
    public final Boolean getDisableInput() {
        return this.disableInput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getEstUnbondTime() {
        return this.estUnbondTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getInputPrecision() {
        return this.inputPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestOrder> getInvestOrderList() {
        return this.investOrderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestType getInvestType() {
        return this.investType;
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
    public final InvestTokenWithAmount getLpTokenInfo() {
        return this.lpTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMode() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount getMySupply() {
        return this.mySupply;
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
    public final PromptInformation getPromptInformation() {
        return this.promptInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> getReceiveTokenList() {
        return this.receiveTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionMethod getRedeemMethod() {
        return this.redeemMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount getRemainingRepayment() {
        return this.remainingRepayment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReserveFee() {
        return this.reserveFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTvl() {
        return this.tvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> getUnderlyingTokenList() {
        return this.underlyingTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValidatorName() {
        return this.validatorName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.chainId);
        int iHashCode2 = this.investType.hashCode();
        int iHashCode3 = Long.hashCode(this.investmentId);
        int iHashCode4 = this.investmentName.hashCode();
        int iHashCode5 = Boolean.hashCode(this.isSupportSwap);
        int iHashCode6 = this.mySupply.hashCode();
        int iHashCode7 = this.network.hashCode();
        int iHashCode8 = this.networkLogo.hashCode();
        int iHashCode9 = this.platformLogo.hashCode();
        int iHashCode10 = this.platformName.hashCode();
        int iHashCode11 = this.receiveTokenList.hashCode();
        int iHashCode12 = this.redeemMethod.hashCode();
        int iHashCode13 = this.underlyingTokenList.hashCode();
        InvestTokenWithAmount investTokenWithAmount = this.lpTokenInfo;
        int iHashCode14 = investTokenWithAmount == null ? 0 : investTokenWithAmount.hashCode();
        Long l = this.analysisPlatformId;
        int iHashCode15 = l == null ? 0 : l.hashCode();
        int iHashCode16 = Boolean.hashCode(this.isSupportLock);
        int iHashCode17 = this.lockRedeemTip.hashCode();
        PromptInformation promptInformation = this.promptInformation;
        int iHashCode18 = promptInformation == null ? 0 : promptInformation.hashCode();
        Integer num = this.inputPrecision;
        int iHashCode19 = num == null ? 0 : num.hashCode();
        int iHashCode20 = Boolean.hashCode(this.isSingleValidator);
        int iHashCode21 = this.validatorName.hashCode();
        int iHashCode22 = this.investOrderList.hashCode();
        Integer num2 = this.mode;
        int iHashCode23 = num2 == null ? 0 : num2.hashCode();
        Boolean bool = this.disableInput;
        int iHashCode24 = bool == null ? 0 : bool.hashCode();
        InvestTokenWithAmount investTokenWithAmount2 = this.remainingRepayment;
        int iHashCode25 = investTokenWithAmount2 == null ? 0 : investTokenWithAmount2.hashCode();
        CollateralRatioInfo collateralRatioInfo = this.collateralRatioInfo;
        int iHashCode26 = collateralRatioInfo == null ? 0 : collateralRatioInfo.hashCode();
        Integer num3 = this.estUnbondTime;
        int iHashCode27 = num3 == null ? 0 : num3.hashCode();
        BTCMode bTCMode = this.btcMode;
        int iHashCode28 = bTCMode == null ? 0 : bTCMode.hashCode();
        BorrowedInfo borrowedInfo = this.borrowed;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + (borrowedInfo == null ? 0 : borrowedInfo.hashCode())) * 31) + this.reserveFee.hashCode()) * 31) + this.tvl.hashCode();
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
        return "InvestRedeemInitialInfo(chainId=" + this.chainId + ", investType=" + this.investType + ", investmentId=" + this.investmentId + ", investmentName=" + this.investmentName + ", isSupportSwap=" + this.isSupportSwap + ", mySupply=" + this.mySupply + ", network=" + this.network + ", networkLogo=" + this.networkLogo + ", platformLogo=" + this.platformLogo + ", platformName=" + this.platformName + ", receiveTokenList=" + this.receiveTokenList + ", redeemMethod=" + this.redeemMethod + ", underlyingTokenList=" + this.underlyingTokenList + ", lpTokenInfo=" + this.lpTokenInfo + ", analysisPlatformId=" + this.analysisPlatformId + ", isSupportLock=" + this.isSupportLock + ", lockRedeemTip=" + this.lockRedeemTip + ", promptInformation=" + this.promptInformation + ", inputPrecision=" + this.inputPrecision + ", isSingleValidator=" + this.isSingleValidator + ", validatorName=" + this.validatorName + ", investOrderList=" + this.investOrderList + ", mode=" + this.mode + ", disableInput=" + this.disableInput + ", remainingRepayment=" + this.remainingRepayment + ", collateralRatioInfo=" + this.collateralRatioInfo + ", estUnbondTime=" + this.estUnbondTime + ", btcMode=" + this.btcMode + ", borrowed=" + this.borrowed + ", reserveFee=" + this.reserveFee + ", tvl=" + this.tvl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.chainId);
        parcel.writeString(this.investType.name());
        parcel.writeLong(this.investmentId);
        parcel.writeString(this.investmentName);
        parcel.writeInt(this.isSupportSwap ? 1 : 0);
        this.mySupply.writeToParcel(parcel, i);
        parcel.writeString(this.network);
        parcel.writeString(this.networkLogo);
        parcel.writeString(this.platformLogo);
        parcel.writeString(this.platformName);
        List<InvestTokenWithAmount> list = this.receiveTokenList;
        parcel.writeInt(list.size());
        Iterator<InvestTokenWithAmount> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.redeemMethod.name());
        List<InvestTokenWithAmount> list2 = this.underlyingTokenList;
        parcel.writeInt(list2.size());
        Iterator<InvestTokenWithAmount> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        InvestTokenWithAmount investTokenWithAmount = this.lpTokenInfo;
        if (investTokenWithAmount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTokenWithAmount.writeToParcel(parcel, i);
        }
        Long l = this.analysisPlatformId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
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
        List<InvestOrder> list3 = this.investOrderList;
        parcel.writeInt(list3.size());
        Iterator<InvestOrder> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        Integer num2 = this.mode;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Boolean bool = this.disableInput;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        InvestTokenWithAmount investTokenWithAmount2 = this.remainingRepayment;
        if (investTokenWithAmount2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTokenWithAmount2.writeToParcel(parcel, i);
        }
        CollateralRatioInfo collateralRatioInfo = this.collateralRatioInfo;
        if (collateralRatioInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            collateralRatioInfo.writeToParcel(parcel, i);
        }
        Integer num3 = this.estUnbondTime;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        BTCMode bTCMode = this.btcMode;
        if (bTCMode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bTCMode.name());
        }
        BorrowedInfo borrowedInfo = this.borrowed;
        if (borrowedInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            borrowedInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.reserveFee);
        parcel.writeString(this.tvl);
    }

    public /* synthetic */ InvestRedeemInitialInfo(int i, long j, InvestType investType, long j2, String str, boolean z, InvestTokenWithAmount investTokenWithAmount, String str2, String str3, String str4, String str5, List list, TransactionMethod transactionMethod, List list2, InvestTokenWithAmount investTokenWithAmount2, Long l, boolean z2, String str6, PromptInformation promptInformation, Integer num, boolean z3, String str7, List list3, Integer num2, Boolean bool, InvestTokenWithAmount investTokenWithAmount3, CollateralRatioInfo collateralRatioInfo, Integer num3, BTCMode bTCMode, BorrowedInfo borrowedInfo, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if ((i & 1) == 0) {
            this.chainId = 0L;
        } else {
            this.chainId = j;
        }
        this.investType = (i & 2) == 0 ? InvestType.Save : investType;
        if ((i & 4) == 0) {
            this.investmentId = 0L;
        } else {
            this.investmentId = j2;
        }
        if ((i & 8) == 0) {
            this.investmentName = "";
        } else {
            this.investmentName = str;
        }
        this.isSupportSwap = (i & 16) == 0 ? true : z;
        this.mySupply = (i & 32) == 0 ? new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null) : investTokenWithAmount;
        if ((i & 64) == 0) {
            this.network = "";
        } else {
            this.network = str2;
        }
        if ((i & 128) == 0) {
            this.networkLogo = "";
        } else {
            this.networkLogo = str3;
        }
        if ((i & 256) == 0) {
            this.platformLogo = "";
        } else {
            this.platformLogo = str4;
        }
        if ((i & 512) == 0) {
            this.platformName = "";
        } else {
            this.platformName = str5;
        }
        this.receiveTokenList = (i & 1024) == 0 ? new ArrayList() : list;
        this.redeemMethod = (i & 2048) == 0 ? TransactionMethod.UNKNOWN : transactionMethod;
        this.underlyingTokenList = (i & 4096) == 0 ? new ArrayList() : list2;
        if ((i & 8192) == 0) {
            this.lpTokenInfo = null;
        } else {
            this.lpTokenInfo = investTokenWithAmount2;
        }
        if ((i & 16384) == 0) {
            this.analysisPlatformId = null;
        } else {
            this.analysisPlatformId = l;
        }
        if ((32768 & i) == 0) {
            this.isSupportLock = false;
        } else {
            this.isSupportLock = z2;
        }
        if ((65536 & i) == 0) {
            this.lockRedeemTip = "";
        } else {
            this.lockRedeemTip = str6;
        }
        if ((131072 & i) == 0) {
            this.promptInformation = null;
        } else {
            this.promptInformation = promptInformation;
        }
        if ((262144 & i) == 0) {
            this.inputPrecision = null;
        } else {
            this.inputPrecision = num;
        }
        if ((524288 & i) == 0) {
            this.isSingleValidator = false;
        } else {
            this.isSingleValidator = z3;
        }
        if ((1048576 & i) == 0) {
            this.validatorName = "";
        } else {
            this.validatorName = str7;
        }
        this.investOrderList = (2097152 & i) == 0 ? new ArrayList() : list3;
        if ((4194304 & i) == 0) {
            this.mode = null;
        } else {
            this.mode = num2;
        }
        if ((8388608 & i) == 0) {
            this.disableInput = null;
        } else {
            this.disableInput = bool;
        }
        if ((16777216 & i) == 0) {
            this.remainingRepayment = null;
        } else {
            this.remainingRepayment = investTokenWithAmount3;
        }
        if ((33554432 & i) == 0) {
            this.collateralRatioInfo = null;
        } else {
            this.collateralRatioInfo = collateralRatioInfo;
        }
        if ((67108864 & i) == 0) {
            this.estUnbondTime = null;
        } else {
            this.estUnbondTime = num3;
        }
        this.btcMode = (134217728 & i) == 0 ? BTCMode.DEFAULT : bTCMode;
        this.borrowed = (268435456 & i) != 0 ? borrowedInfo : null;
        if ((536870912 & i) == 0) {
            this.reserveFee = "";
        } else {
            this.reserveFee = str8;
        }
        if ((i & 1073741824) == 0) {
            this.tvl = "";
        } else {
            this.tvl = str9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [799=8] */
    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestRedeemInitialInfo investRedeemInitialInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investRedeemInitialInfo.chainId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, investRedeemInitialInfo.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investRedeemInitialInfo.investType != InvestType.Save) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], investRedeemInitialInfo.investType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investRedeemInitialInfo.investmentId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 2, investRedeemInitialInfo.investmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) investRedeemInitialInfo.investmentName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, investRedeemInitialInfo.investmentName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !investRedeemInitialInfo.isSupportSwap) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, investRedeemInitialInfo.isSupportSwap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(investRedeemInitialInfo.mySupply, new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, InvestTokenWithAmount$$serializer.INSTANCE, investRedeemInitialInfo.mySupply);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) investRedeemInitialInfo.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, investRedeemInitialInfo.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) investRedeemInitialInfo.networkLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, investRedeemInitialInfo.networkLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) investRedeemInitialInfo.platformLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, investRedeemInitialInfo.platformLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) investRedeemInitialInfo.platformName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, investRedeemInitialInfo.platformName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(investRedeemInitialInfo.receiveTokenList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], investRedeemInitialInfo.receiveTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || investRedeemInitialInfo.redeemMethod != TransactionMethod.UNKNOWN) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], investRedeemInitialInfo.redeemMethod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd(investRedeemInitialInfo.underlyingTokenList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], investRedeemInitialInfo.underlyingTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || investRedeemInitialInfo.lpTokenInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, InvestTokenWithAmount$$serializer.INSTANCE, investRedeemInitialInfo.lpTokenInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || investRedeemInitialInfo.analysisPlatformId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, LongSerializer.INSTANCE, investRedeemInitialInfo.analysisPlatformId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || investRedeemInitialInfo.isSupportLock) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 15, investRedeemInitialInfo.isSupportLock);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) investRedeemInitialInfo.lockRedeemTip, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, investRedeemInitialInfo.lockRedeemTip);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || investRedeemInitialInfo.promptInformation != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, PromptInformation$$serializer.INSTANCE, investRedeemInitialInfo.promptInformation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || investRedeemInitialInfo.inputPrecision != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, IntSerializer.INSTANCE, investRedeemInitialInfo.inputPrecision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || investRedeemInitialInfo.isSingleValidator) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 19, investRedeemInitialInfo.isSingleValidator);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) investRedeemInitialInfo.validatorName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, investRedeemInitialInfo.validatorName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd(investRedeemInitialInfo.investOrderList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 21, kSerializerArr[21], investRedeemInitialInfo.investOrderList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || investRedeemInitialInfo.mode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, IntSerializer.INSTANCE, investRedeemInitialInfo.mode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || investRedeemInitialInfo.disableInput != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, BooleanSerializer.INSTANCE, investRedeemInitialInfo.disableInput);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || investRedeemInitialInfo.remainingRepayment != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, InvestTokenWithAmount$$serializer.INSTANCE, investRedeemInitialInfo.remainingRepayment);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || investRedeemInitialInfo.collateralRatioInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, CollateralRatioInfo$$serializer.INSTANCE, investRedeemInitialInfo.collateralRatioInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || investRedeemInitialInfo.estUnbondTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, IntSerializer.INSTANCE, investRedeemInitialInfo.estUnbondTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || investRedeemInitialInfo.btcMode != BTCMode.DEFAULT) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, kSerializerArr[27], investRedeemInitialInfo.btcMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || investRedeemInitialInfo.borrowed != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, BorrowedInfo$$serializer.INSTANCE, investRedeemInitialInfo.borrowed);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) investRedeemInitialInfo.reserveFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, investRedeemInitialInfo.reserveFee);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) && Intrinsics.EZpvd((Object) investRedeemInitialInfo.tvl, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 30, investRedeemInitialInfo.tvl);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01c2: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r76v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r43v0 long))
  (wrap:com.okinc.business.invest_biz.data.models.InvestType:?: TERNARY null = ((wrap:int:0x000c: ARITH (r76v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0010: SGET  A[WRAPPED] (LINE:804) com.okinc.business.invest_biz.data.models.InvestType.Save com.okinc.business.invest_biz.data.models.InvestType) : (r45v0 com.okinc.business.invest_biz.data.models.InvestType))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0015: ARITH (r76v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r46v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r76v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0026: ARITH (r76v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r49v0 boolean))
  (wrap:com.okinc.business.invest_biz.data.models.InvestTokenWithAmount:?: TERNARY null = ((wrap:int:0x002e: ARITH (r76v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006f: CONSTRUCTOR 
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
 A[MD:(long, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.okinc.business.invest_biz.data.bean.ButtonType, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestTokenType, java.lang.Long, java.lang.Long, int, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:808) call: com.okinc.business.invest_biz.data.models.InvestTokenWithAmount.<init>(long, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.okinc.business.invest_biz.data.bean.ButtonType, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestTokenType, java.lang.Long, java.lang.Long, int, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r50v0 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0075: ARITH (r76v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r76v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0085: ARITH (r76v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r76v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0095: ARITH (r76v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x009b: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:813) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r55v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.bean.TransactionMethod:?: TERNARY null = ((wrap:int:0x00a1: ARITH (r76v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00a5: SGET  A[WRAPPED] (LINE:814) com.okinc.business.invest_biz.data.bean.TransactionMethod.UNKNOWN com.okinc.business.invest_biz.data.bean.TransactionMethod) : (r56v0 com.okinc.business.invest_biz.data.bean.TransactionMethod))
  (wrap:java.util.List:0x00b8: TERNARY null = ((wrap:int:0x00ac: ARITH (r76v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00b2: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:815) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r57v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.models.InvestTokenWithAmount:0x00c5: TERNARY null = ((wrap:int:0x00ba: ARITH (r76v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.models.InvestTokenWithAmount) : (r58v0 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x00c7: ARITH (r76v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r59v0 java.lang.Long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00d3: ARITH (r76v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? false : (r60v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e0: ARITH (r76v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.PromptInformation:?: TERNARY null = ((wrap:int:0x00eb: ARITH (r76v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.PromptInformation) : (r62v0 com.okinc.business.invest_biz.data.bean.PromptInformation))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00f6: ARITH (r76v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r63v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0101: ARITH (r76v0 int) & (524288 int) A[WRAPPED]) == (0 int)) ? (r64v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010a: ARITH (r76v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0115: ARITH (r76v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x011b: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:824) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r66v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0123: ARITH (r76v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r67v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x012e: ARITH (r76v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r68v0 java.lang.Boolean))
  (wrap:com.okinc.business.invest_biz.data.models.InvestTokenWithAmount:?: TERNARY null = ((wrap:int:0x0139: ARITH (r76v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.models.InvestTokenWithAmount) : (r69v0 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount))
  (wrap:com.okinc.business.invest_biz.data.bean.CollateralRatioInfo:?: TERNARY null = ((wrap:int:0x0144: ARITH (r76v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.CollateralRatioInfo) : (r70v0 com.okinc.business.invest_biz.data.bean.CollateralRatioInfo))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x014f: ARITH (r76v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r71v0 java.lang.Integer))
  (wrap:com.okinc.business.invest_biz.data.contants.BTCMode:?: TERNARY null = ((wrap:int:0x015a: ARITH (r76v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x015e: SGET  A[WRAPPED] (LINE:830) com.okinc.business.invest_biz.data.contants.BTCMode.DEFAULT com.okinc.business.invest_biz.data.contants.BTCMode) : (r72v0 com.okinc.business.invest_biz.data.contants.BTCMode))
  (wrap:com.okinc.business.invest_biz.data.bean.BorrowedInfo:?: TERNARY null = ((wrap:int:0x0165: ARITH (r76v0 int) & (268435456 int) A[WRAPPED]) == (0 int)) ? (r73v0 com.okinc.business.invest_biz.data.bean.BorrowedInfo) : (null com.okinc.business.invest_biz.data.bean.BorrowedInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x016e: ARITH (r76v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r74v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0179: ARITH (r76v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r75v0 java.lang.String))
 A[MD:(long, com.okinc.business.invest_biz.data.models.InvestType, long, java.lang.String, boolean, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, com.okinc.business.invest_biz.data.bean.TransactionMethod, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, java.lang.Long, boolean, java.lang.String, com.okinc.business.invest_biz.data.bean.PromptInformation, java.lang.Integer, boolean, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.InvestOrder>, java.lang.Integer, java.lang.Boolean, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, com.okinc.business.invest_biz.data.bean.CollateralRatioInfo, java.lang.Integer, com.okinc.business.invest_biz.data.contants.BTCMode, com.okinc.business.invest_biz.data.bean.BorrowedInfo, java.lang.String, java.lang.String):void (m)] (LINE:802) call: com.okinc.business.invest_biz.data.bean.InvestRedeemInitialInfo.<init>(long, com.okinc.business.invest_biz.data.models.InvestType, long, java.lang.String, boolean, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.business.invest_biz.data.bean.TransactionMethod, java.util.List, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, java.lang.Long, boolean, java.lang.String, com.okinc.business.invest_biz.data.bean.PromptInformation, java.lang.Integer, boolean, java.lang.String, java.util.List, java.lang.Integer, java.lang.Boolean, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, com.okinc.business.invest_biz.data.bean.CollateralRatioInfo, java.lang.Integer, com.okinc.business.invest_biz.data.contants.BTCMode, com.okinc.business.invest_biz.data.bean.BorrowedInfo, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InvestRedeemInitialInfo(long j, InvestType investType, long j2, String str, boolean z, InvestTokenWithAmount investTokenWithAmount, String str2, String str3, String str4, String str5, List list, TransactionMethod transactionMethod, List list2, InvestTokenWithAmount investTokenWithAmount2, Long l, boolean z2, String str6, PromptInformation promptInformation, Integer num, boolean z3, String str7, List list3, Integer num2, Boolean bool, InvestTokenWithAmount investTokenWithAmount3, CollateralRatioInfo collateralRatioInfo, Integer num3, BTCMode bTCMode, BorrowedInfo borrowedInfo, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? InvestType.Save : investType, (i & 4) == 0 ? j2 : 0L, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? true : z, (i & 32) != 0 ? new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null) : investTokenWithAmount, (i & 64) != 0 ? "" : str2, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? "" : str4, (i & 512) != 0 ? "" : str5, (i & 1024) != 0 ? new ArrayList() : list, (i & 2048) != 0 ? TransactionMethod.UNKNOWN : transactionMethod, (i & 4096) != 0 ? new ArrayList() : list2, (i & 8192) != 0 ? null : investTokenWithAmount2, (i & 16384) != 0 ? null : l, (i & 32768) != 0 ? false : z2, (i & 65536) != 0 ? "" : str6, (i & 131072) != 0 ? null : promptInformation, (i & 262144) != 0 ? null : num, (i & 524288) == 0 ? z3 : false, (i & 1048576) != 0 ? "" : str7, (i & 2097152) != 0 ? new ArrayList() : list3, (i & 4194304) != 0 ? null : num2, (i & 8388608) != 0 ? null : bool, (i & 16777216) != 0 ? null : investTokenWithAmount3, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : collateralRatioInfo, (i & 67108864) != 0 ? null : num3, (i & 134217728) != 0 ? BTCMode.DEFAULT : bTCMode, (i & 268435456) == 0 ? borrowedInfo : null, (i & 536870912) != 0 ? "" : str8, (i & 1073741824) != 0 ? "" : str9);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestRedeemInitialInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InvestRedeemInitialInfo> serializer() {
            return InvestRedeemInitialInfo$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestRedeemInitialInfo(long j, @NotNull InvestType investType, long j2, @NotNull String str, boolean z, @NotNull InvestTokenWithAmount investTokenWithAmount, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull List<InvestTokenWithAmount> list, @NotNull TransactionMethod transactionMethod, @NotNull List<InvestTokenWithAmount> list2, InvestTokenWithAmount investTokenWithAmount2, Long l, boolean z2, @NotNull String str6, PromptInformation promptInformation, Integer num, boolean z3, @NotNull String str7, @NotNull List<InvestOrder> list3, Integer num2, Boolean bool, InvestTokenWithAmount investTokenWithAmount3, CollateralRatioInfo collateralRatioInfo, Integer num3, BTCMode bTCMode, BorrowedInfo borrowedInfo, @NotNull String str8, @NotNull String str9) {
        super(null);
        Intrinsics.checkNotNullParameter(investType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(transactionMethod, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.chainId = j;
        this.investType = investType;
        this.investmentId = j2;
        this.investmentName = str;
        this.isSupportSwap = z;
        this.mySupply = investTokenWithAmount;
        this.network = str2;
        this.networkLogo = str3;
        this.platformLogo = str4;
        this.platformName = str5;
        this.receiveTokenList = list;
        this.redeemMethod = transactionMethod;
        this.underlyingTokenList = list2;
        this.lpTokenInfo = investTokenWithAmount2;
        this.analysisPlatformId = l;
        this.isSupportLock = z2;
        this.lockRedeemTip = str6;
        this.promptInformation = promptInformation;
        this.inputPrecision = num;
        this.isSingleValidator = z3;
        this.validatorName = str7;
        this.investOrderList = list3;
        this.mode = num2;
        this.disableInput = bool;
        this.remainingRepayment = investTokenWithAmount3;
        this.collateralRatioInfo = collateralRatioInfo;
        this.estUnbondTime = num3;
        this.btcMode = bTCMode;
        this.borrowed = borrowedInfo;
        this.reserveFee = str8;
        this.tvl = str9;
    }

    static {
        InvestTokenWithAmount$$serializer investTokenWithAmount$$serializer = InvestTokenWithAmount$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, InvestType.Companion.serializer(), null, null, null, null, null, null, null, null, new ArrayListSerializer(investTokenWithAmount$$serializer), TransactionMethod.Companion.serializer(), new ArrayListSerializer(investTokenWithAmount$$serializer), null, null, null, null, null, null, null, null, new ArrayListSerializer(InvestOrder$$serializer.INSTANCE), null, null, null, null, null, BTCMode.Companion.serializer(), null, null, null};
    }
}
