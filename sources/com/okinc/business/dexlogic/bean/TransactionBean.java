package com.okinc.business.dexlogic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo$$serializer;
import com.okinc.business.dex.trade.core.domain.model.common.TeeSaStatus;
import com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.OrderIdTypeData;
import com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.OrderIdTypeData$$serializer;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C23274hvD;
import o.C33070mpX;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class TransactionBean implements Parcelable {
    private final AccountInfo accountInfo;
    private final String balanceBracket;
    private final String bridgeSelection;
    private final MergeCallData callData;
    private final Boolean customPriorityFee;
    private final boolean dexAutoConfirmEnabled;
    private final long expireTime;
    private final String fromCoinAmountBalance;
    private final String gasPrice;
    private final String gasPriceRate;
    private boolean isCustomSlippage;
    private String maxSlippage;
    private final String mevInfo;
    private final boolean openMev;
    private final OrderIdTypeData orderIdTypeData;
    private final String priorityFee;
    private final String priorityFeeType;
    private QuotePriceRes quotePriceRes;
    private final String receiveWalletAddress;
    private final String reservedAmount;
    private final PresetRouteType routerModeType;
    private final ServiceFeeInfo serviceFeeInfo;
    private String signedTx;
    private SlippageFeeType slippageFeeType;
    private SlippageMode slippageMode;
    private String spSlipPage;
    private final boolean supportMev;
    private final SwapType swapType;
    private final TeeSaStatus teeSaStatus;
    private final String transactionString;
    private final com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.TransactionType transactionType;
    private final String unSignedTx;
    private final Integer walletAddressType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TransactionBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.TransactionType.Companion.serializer(), null, null, null, null, null, null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.business.dexlogic.bean.TransactionBean.SwapType", SwapType.values()), null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode", SlippageMode.values()), null, EnumsKt.createSimpleEnumSerializer("com.okinc.business.dexlogic.bean.SlippageFeeType", SlippageFeeType.values()), null, null, null, null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.business.dexlogic.bean.PresetRouteType", PresetRouteType.values()), EnumsKt.createSimpleEnumSerializer("com.okinc.business.dex.trade.core.domain.model.common.TeeSaStatus", TeeSaStatus.values()), null};

    public static final class Creator implements Parcelable.Creator<TransactionBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionBean createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            QuotePriceRes quotePriceResCreateFromParcel = parcel.readInt() == 0 ? null : QuotePriceRes.CREATOR.createFromParcel(parcel);
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.TransactionType transactionTypeCreateFromParcel = com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.TransactionType.CREATOR.createFromParcel(parcel);
            OrderIdTypeData orderIdTypeDataCreateFromParcel = OrderIdTypeData.CREATOR.createFromParcel(parcel);
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            long j = parcel.readLong();
            String string10 = parcel.readString();
            SwapType swapTypeValueOf = SwapType.valueOf(parcel.readString());
            MergeCallData mergeCallDataCreateFromParcel = parcel.readInt() == 0 ? null : MergeCallData.CREATOR.createFromParcel(parcel);
            ServiceFeeInfo serviceFeeInfoCreateFromParcel = parcel.readInt() == 0 ? null : ServiceFeeInfo.CREATOR.createFromParcel(parcel);
            SlippageMode slippageModeValueOf = parcel.readInt() == 0 ? null : SlippageMode.valueOf(parcel.readString());
            String string11 = parcel.readString();
            SlippageFeeType slippageFeeTypeValueOf = parcel.readInt() == 0 ? null : SlippageFeeType.valueOf(parcel.readString());
            String string12 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TransactionBean(string, string2, z, string3, string4, quotePriceResCreateFromParcel, string5, string6, string7, transactionTypeCreateFromParcel, orderIdTypeDataCreateFromParcel, string8, string9, numValueOf, z2, z3, j, string10, swapTypeValueOf, mergeCallDataCreateFromParcel, serviceFeeInfoCreateFromParcel, slippageModeValueOf, string11, slippageFeeTypeValueOf, string12, boolValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AccountInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PresetRouteType.valueOf(parcel.readString()), TeeSaStatus.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionBean[] newArray(int i) {
            return new TransactionBean[i];
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SwapType.values().length];
            try {
                iArr[SwapType.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SwapType.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SwapType.ADVANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.receiveWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.TransactionType component10() {
        return this.transactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderIdTypeData component11() {
        return this.orderIdTypeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.transactionString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.signedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component14() {
        return this.walletAddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component15() {
        return this.openMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component16() {
        return this.supportMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component17() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.unSignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwapType component19() {
        return this.swapType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.spSlipPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MergeCallData component20() {
        return this.callData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo component21() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageMode component22() {
        return this.slippageMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageFeeType component24() {
        return this.slippageFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component26() {
        return this.customPriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.priorityFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.mevInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isCustomSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountInfo component30() {
        return this.accountInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PresetRouteType component31() {
        return this.routerModeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeSaStatus component32() {
        return this.teeSaStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component33() {
        return this.dexAutoConfirmEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fromCoinAmountBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.reservedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuotePriceRes component6() {
        return this.quotePriceRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.balanceBracket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.gasPriceRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.bridgeSelection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionBean copy(String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4, QuotePriceRes quotePriceRes, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.TransactionType transactionType, @NotNull OrderIdTypeData orderIdTypeData, @NotNull String str8, @NotNull String str9, Integer num, boolean z2, boolean z3, long j, @NotNull String str10, @NotNull SwapType swapType, MergeCallData mergeCallData, ServiceFeeInfo serviceFeeInfo, SlippageMode slippageMode, String str11, SlippageFeeType slippageFeeType, String str12, Boolean bool, String str13, @NotNull String str14, String str15, AccountInfo accountInfo, PresetRouteType presetRouteType, @NotNull TeeSaStatus teeSaStatus, boolean z4) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(orderIdTypeData, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(swapType, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(teeSaStatus, "");
        return new TransactionBean(str, str2, z, str3, str4, quotePriceRes, str5, str6, str7, transactionType, orderIdTypeData, str8, str9, num, z2, z3, j, str10, swapType, mergeCallData, serviceFeeInfo, slippageMode, str11, slippageFeeType, str12, bool, str13, str14, str15, accountInfo, presetRouteType, teeSaStatus, z4);
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
        if (!(obj instanceof TransactionBean)) {
            return false;
        }
        TransactionBean transactionBean = (TransactionBean) obj;
        return Intrinsics.EZpvd((Object) this.receiveWalletAddress, (Object) transactionBean.receiveWalletAddress) && Intrinsics.EZpvd((Object) this.spSlipPage, (Object) transactionBean.spSlipPage) && this.isCustomSlippage == transactionBean.isCustomSlippage && Intrinsics.EZpvd((Object) this.fromCoinAmountBalance, (Object) transactionBean.fromCoinAmountBalance) && Intrinsics.EZpvd((Object) this.reservedAmount, (Object) transactionBean.reservedAmount) && Intrinsics.EZpvd(this.quotePriceRes, transactionBean.quotePriceRes) && Intrinsics.EZpvd((Object) this.balanceBracket, (Object) transactionBean.balanceBracket) && Intrinsics.EZpvd((Object) this.gasPriceRate, (Object) transactionBean.gasPriceRate) && Intrinsics.EZpvd((Object) this.bridgeSelection, (Object) transactionBean.bridgeSelection) && this.transactionType == transactionBean.transactionType && Intrinsics.EZpvd(this.orderIdTypeData, transactionBean.orderIdTypeData) && Intrinsics.EZpvd((Object) this.transactionString, (Object) transactionBean.transactionString) && Intrinsics.EZpvd((Object) this.signedTx, (Object) transactionBean.signedTx) && Intrinsics.EZpvd(this.walletAddressType, transactionBean.walletAddressType) && this.openMev == transactionBean.openMev && this.supportMev == transactionBean.supportMev && this.expireTime == transactionBean.expireTime && Intrinsics.EZpvd((Object) this.unSignedTx, (Object) transactionBean.unSignedTx) && this.swapType == transactionBean.swapType && Intrinsics.EZpvd(this.callData, transactionBean.callData) && Intrinsics.EZpvd(this.serviceFeeInfo, transactionBean.serviceFeeInfo) && this.slippageMode == transactionBean.slippageMode && Intrinsics.EZpvd((Object) this.maxSlippage, (Object) transactionBean.maxSlippage) && this.slippageFeeType == transactionBean.slippageFeeType && Intrinsics.EZpvd((Object) this.priorityFee, (Object) transactionBean.priorityFee) && Intrinsics.EZpvd(this.customPriorityFee, transactionBean.customPriorityFee) && Intrinsics.EZpvd((Object) this.priorityFeeType, (Object) transactionBean.priorityFeeType) && Intrinsics.EZpvd((Object) this.mevInfo, (Object) transactionBean.mevInfo) && Intrinsics.EZpvd((Object) this.gasPrice, (Object) transactionBean.gasPrice) && Intrinsics.EZpvd(this.accountInfo, transactionBean.accountInfo) && this.routerModeType == transactionBean.routerModeType && this.teeSaStatus == transactionBean.teeSaStatus && this.dexAutoConfirmEnabled == transactionBean.dexAutoConfirmEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountInfo getAccountInfo() {
        return this.accountInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalanceBracket() {
        return this.balanceBracket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBridgeSelection() {
        return this.bridgeSelection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MergeCallData getCallData() {
        return this.callData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCustomPriorityFee() {
        return this.customPriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDexAutoConfirmEnabled() {
        return this.dexAutoConfirmEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getExpireTime() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromCoinAmountBalance() {
        return this.fromCoinAmountBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPriceRate() {
        return this.gasPriceRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSlippage() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMevInfo() {
        return this.mevInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getOpenMev() {
        return this.openMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderIdTypeData getOrderIdTypeData() {
        return this.orderIdTypeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFee() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFeeType() {
        return this.priorityFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuotePriceRes getQuotePriceRes() {
        return this.quotePriceRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceiveWalletAddress() {
        return this.receiveWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReservedAmount() {
        return this.reservedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PresetRouteType getRouterModeType() {
        return this.routerModeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo getServiceFeeInfo() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignedTx() {
        return this.signedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageFeeType getSlippageFeeType() {
        return this.slippageFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageMode getSlippageMode() {
        return this.slippageMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpSlipPage() {
        return this.spSlipPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportMev() {
        return this.supportMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwapType getSwapType() {
        return this.swapType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeSaStatus getTeeSaStatus() {
        return this.teeSaStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransactionString() {
        return this.transactionString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.TransactionType getTransactionType() {
        return this.transactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnSignedTx() {
        return this.unSignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getWalletAddressType() {
        return this.walletAddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.receiveWalletAddress;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.spSlipPage.hashCode();
        int iHashCode3 = Boolean.hashCode(this.isCustomSlippage);
        int iHashCode4 = this.fromCoinAmountBalance.hashCode();
        int iHashCode5 = this.reservedAmount.hashCode();
        QuotePriceRes quotePriceRes = this.quotePriceRes;
        int iHashCode6 = quotePriceRes == null ? 0 : quotePriceRes.hashCode();
        int iHashCode7 = this.balanceBracket.hashCode();
        int iHashCode8 = this.gasPriceRate.hashCode();
        int iHashCode9 = this.bridgeSelection.hashCode();
        int iHashCode10 = this.transactionType.hashCode();
        int iHashCode11 = this.orderIdTypeData.hashCode();
        int iHashCode12 = this.transactionString.hashCode();
        int iHashCode13 = this.signedTx.hashCode();
        Integer num = this.walletAddressType;
        int iHashCode14 = num == null ? 0 : num.hashCode();
        int iHashCode15 = Boolean.hashCode(this.openMev);
        int iHashCode16 = Boolean.hashCode(this.supportMev);
        int i = iHashCode14;
        int iHashCode17 = Long.hashCode(this.expireTime);
        int iHashCode18 = this.unSignedTx.hashCode();
        int iHashCode19 = this.swapType.hashCode();
        MergeCallData mergeCallData = this.callData;
        int iHashCode20 = mergeCallData == null ? 0 : mergeCallData.hashCode();
        ServiceFeeInfo serviceFeeInfo = this.serviceFeeInfo;
        int iHashCode21 = serviceFeeInfo == null ? 0 : serviceFeeInfo.hashCode();
        SlippageMode slippageMode = this.slippageMode;
        int iHashCode22 = slippageMode == null ? 0 : slippageMode.hashCode();
        String str2 = this.maxSlippage;
        int iHashCode23 = str2 == null ? 0 : str2.hashCode();
        SlippageFeeType slippageFeeType = this.slippageFeeType;
        int iHashCode24 = slippageFeeType == null ? 0 : slippageFeeType.hashCode();
        String str3 = this.priorityFee;
        int iHashCode25 = str3 == null ? 0 : str3.hashCode();
        Boolean bool = this.customPriorityFee;
        int iHashCode26 = bool == null ? 0 : bool.hashCode();
        String str4 = this.priorityFeeType;
        int iHashCode27 = str4 == null ? 0 : str4.hashCode();
        int iHashCode28 = this.mevInfo.hashCode();
        String str5 = this.gasPrice;
        int iHashCode29 = str5 == null ? 0 : str5.hashCode();
        AccountInfo accountInfo = this.accountInfo;
        int iHashCode30 = accountInfo == null ? 0 : accountInfo.hashCode();
        PresetRouteType presetRouteType = this.routerModeType;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + i) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + (presetRouteType == null ? 0 : presetRouteType.hashCode())) * 31) + this.teeSaStatus.hashCode()) * 31) + Boolean.hashCode(this.dexAutoConfirmEnabled);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCustomSlippage() {
        return this.isCustomSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCustomSlippage(boolean z) {
        this.isCustomSlippage = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxSlippage(String str) {
        this.maxSlippage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuotePriceRes(QuotePriceRes quotePriceRes) {
        this.quotePriceRes = quotePriceRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignedTx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.signedTx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlippageFeeType(SlippageFeeType slippageFeeType) {
        this.slippageFeeType = slippageFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlippageMode(SlippageMode slippageMode) {
        this.slippageMode = slippageMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpSlipPage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.spSlipPage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionBean(receiveWalletAddress=" + this.receiveWalletAddress + ", spSlipPage=" + this.spSlipPage + ", isCustomSlippage=" + this.isCustomSlippage + ", fromCoinAmountBalance=" + this.fromCoinAmountBalance + ", reservedAmount=" + this.reservedAmount + ", quotePriceRes=" + this.quotePriceRes + ", balanceBracket=" + this.balanceBracket + ", gasPriceRate=" + this.gasPriceRate + ", bridgeSelection=" + this.bridgeSelection + ", transactionType=" + this.transactionType + ", orderIdTypeData=" + this.orderIdTypeData + ", transactionString=" + this.transactionString + ", signedTx=" + this.signedTx + ", walletAddressType=" + this.walletAddressType + ", openMev=" + this.openMev + ", supportMev=" + this.supportMev + ", expireTime=" + this.expireTime + ", unSignedTx=" + this.unSignedTx + ", swapType=" + this.swapType + ", callData=" + this.callData + ", serviceFeeInfo=" + this.serviceFeeInfo + ", slippageMode=" + this.slippageMode + ", maxSlippage=" + this.maxSlippage + ", slippageFeeType=" + this.slippageFeeType + ", priorityFee=" + this.priorityFee + ", customPriorityFee=" + this.customPriorityFee + ", priorityFeeType=" + this.priorityFeeType + ", mevInfo=" + this.mevInfo + ", gasPrice=" + this.gasPrice + ", accountInfo=" + this.accountInfo + ", routerModeType=" + this.routerModeType + ", teeSaStatus=" + this.teeSaStatus + ", dexAutoConfirmEnabled=" + this.dexAutoConfirmEnabled + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.receiveWalletAddress);
        parcel.writeString(this.spSlipPage);
        parcel.writeInt(this.isCustomSlippage ? 1 : 0);
        parcel.writeString(this.fromCoinAmountBalance);
        parcel.writeString(this.reservedAmount);
        QuotePriceRes quotePriceRes = this.quotePriceRes;
        if (quotePriceRes == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            quotePriceRes.writeToParcel(parcel, i);
        }
        parcel.writeString(this.balanceBracket);
        parcel.writeString(this.gasPriceRate);
        parcel.writeString(this.bridgeSelection);
        this.transactionType.writeToParcel(parcel, i);
        this.orderIdTypeData.writeToParcel(parcel, i);
        parcel.writeString(this.transactionString);
        parcel.writeString(this.signedTx);
        Integer num = this.walletAddressType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.openMev ? 1 : 0);
        parcel.writeInt(this.supportMev ? 1 : 0);
        parcel.writeLong(this.expireTime);
        parcel.writeString(this.unSignedTx);
        parcel.writeString(this.swapType.name());
        MergeCallData mergeCallData = this.callData;
        if (mergeCallData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mergeCallData.writeToParcel(parcel, i);
        }
        ServiceFeeInfo serviceFeeInfo = this.serviceFeeInfo;
        if (serviceFeeInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serviceFeeInfo.writeToParcel(parcel, i);
        }
        SlippageMode slippageMode = this.slippageMode;
        if (slippageMode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(slippageMode.name());
        }
        parcel.writeString(this.maxSlippage);
        SlippageFeeType slippageFeeType = this.slippageFeeType;
        if (slippageFeeType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(slippageFeeType.name());
        }
        parcel.writeString(this.priorityFee);
        Boolean bool = this.customPriorityFee;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.priorityFeeType);
        parcel.writeString(this.mevInfo);
        parcel.writeString(this.gasPrice);
        AccountInfo accountInfo = this.accountInfo;
        if (accountInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountInfo.writeToParcel(parcel, i);
        }
        PresetRouteType presetRouteType = this.routerModeType;
        if (presetRouteType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(presetRouteType.name());
        }
        parcel.writeString(this.teeSaStatus.name());
        parcel.writeInt(this.dexAutoConfirmEnabled ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.TransactionBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TransactionBean> serializer() {
            return TransactionBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TransactionBean(int i, int i2, String str, String str2, boolean z, String str3, String str4, QuotePriceRes quotePriceRes, String str5, String str6, String str7, com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.TransactionType transactionType, OrderIdTypeData orderIdTypeData, String str8, String str9, Integer num, boolean z2, boolean z3, long j, String str10, SwapType swapType, MergeCallData mergeCallData, ServiceFeeInfo serviceFeeInfo, SlippageMode slippageMode, String str11, SlippageFeeType slippageFeeType, String str12, Boolean bool, String str13, String str14, String str15, AccountInfo accountInfo, PresetRouteType presetRouteType, TeeSaStatus teeSaStatus, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.throwArrayMissingFieldException(new int[]{i, i2}, new int[]{0, 1}, TransactionBean$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.receiveWalletAddress = null;
        } else {
            this.receiveWalletAddress = str;
        }
        if ((i & 2) == 0) {
            this.spSlipPage = "";
        } else {
            this.spSlipPage = str2;
        }
        if ((i & 4) == 0) {
            this.isCustomSlippage = false;
        } else {
            this.isCustomSlippage = z;
        }
        if ((i & 8) == 0) {
            this.fromCoinAmountBalance = "";
        } else {
            this.fromCoinAmountBalance = str3;
        }
        if ((i & 16) == 0) {
            this.reservedAmount = "";
        } else {
            this.reservedAmount = str4;
        }
        if ((i & 32) == 0) {
            this.quotePriceRes = null;
        } else {
            this.quotePriceRes = quotePriceRes;
        }
        if ((i & 64) == 0) {
            this.balanceBracket = "";
        } else {
            this.balanceBracket = str5;
        }
        if ((i & 128) == 0) {
            this.gasPriceRate = "";
        } else {
            this.gasPriceRate = str6;
        }
        if ((i & 256) == 0) {
            this.bridgeSelection = "";
        } else {
            this.bridgeSelection = str7;
        }
        this.transactionType = (i & 512) == 0 ? com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.TransactionType.INQUIRY_TYPE : transactionType;
        this.orderIdTypeData = (i & 1024) == 0 ? new OrderIdTypeData((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : orderIdTypeData;
        if ((i & 2048) == 0) {
            this.transactionString = "";
        } else {
            this.transactionString = str8;
        }
        if ((i & 4096) == 0) {
            this.signedTx = "";
        } else {
            this.signedTx = str9;
        }
        if ((i & 8192) == 0) {
            this.walletAddressType = null;
        } else {
            this.walletAddressType = num;
        }
        if ((i & 16384) == 0) {
            this.openMev = false;
        } else {
            this.openMev = z2;
        }
        if ((32768 & i) == 0) {
            this.supportMev = false;
        } else {
            this.supportMev = z3;
        }
        this.expireTime = (65536 & i) == 0 ? 0L : j;
        if ((131072 & i) == 0) {
            this.unSignedTx = "";
        } else {
            this.unSignedTx = str10;
        }
        this.swapType = (262144 & i) == 0 ? SwapType.ADVANCE : swapType;
        if ((524288 & i) == 0) {
            this.callData = null;
        } else {
            this.callData = mergeCallData;
        }
        if ((1048576 & i) == 0) {
            this.serviceFeeInfo = null;
        } else {
            this.serviceFeeInfo = serviceFeeInfo;
        }
        if ((2097152 & i) == 0) {
            this.slippageMode = null;
        } else {
            this.slippageMode = slippageMode;
        }
        if ((4194304 & i) == 0) {
            this.maxSlippage = null;
        } else {
            this.maxSlippage = str11;
        }
        if ((8388608 & i) == 0) {
            this.slippageFeeType = null;
        } else {
            this.slippageFeeType = slippageFeeType;
        }
        if ((16777216 & i) == 0) {
            this.priorityFee = null;
        } else {
            this.priorityFee = str12;
        }
        if ((33554432 & i) == 0) {
            this.customPriorityFee = null;
        } else {
            this.customPriorityFee = bool;
        }
        if ((67108864 & i) == 0) {
            this.priorityFeeType = null;
        } else {
            this.priorityFeeType = str13;
        }
        if ((134217728 & i) == 0) {
            this.mevInfo = "";
        } else {
            this.mevInfo = str14;
        }
        if ((268435456 & i) == 0) {
            this.gasPrice = null;
        } else {
            this.gasPrice = str15;
        }
        if ((536870912 & i) == 0) {
            this.accountInfo = null;
        } else {
            this.accountInfo = accountInfo;
        }
        if ((1073741824 & i) == 0) {
            this.routerModeType = null;
        } else {
            this.routerModeType = presetRouteType;
        }
        this.teeSaStatus = (i & Integer.MIN_VALUE) == 0 ? TeeSaStatus.NON_TEE_ACTIVE_AND_EXPIRED : teeSaStatus;
        this.dexAutoConfirmEnabled = z4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [379=5] */
    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TransactionBean transactionBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || transactionBean.receiveWalletAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, transactionBean.receiveWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) transactionBean.spSlipPage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, transactionBean.spSlipPage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || transactionBean.isCustomSlippage) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, transactionBean.isCustomSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) transactionBean.fromCoinAmountBalance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, transactionBean.fromCoinAmountBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) transactionBean.reservedAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, transactionBean.reservedAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || transactionBean.quotePriceRes != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, QuotePriceRes$$serializer.INSTANCE, transactionBean.quotePriceRes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) transactionBean.balanceBracket, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, transactionBean.balanceBracket);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) transactionBean.gasPriceRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, transactionBean.gasPriceRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) transactionBean.bridgeSelection, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, transactionBean.bridgeSelection);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || transactionBean.transactionType != com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.TransactionType.INQUIRY_TYPE) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], transactionBean.transactionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(transactionBean.orderIdTypeData, new OrderIdTypeData((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, OrderIdTypeData$$serializer.INSTANCE, transactionBean.orderIdTypeData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) transactionBean.transactionString, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, transactionBean.transactionString);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) transactionBean.signedTx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, transactionBean.signedTx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || transactionBean.walletAddressType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, transactionBean.walletAddressType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || transactionBean.openMev) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 14, transactionBean.openMev);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || transactionBean.supportMev) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 15, transactionBean.supportMev);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || transactionBean.expireTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 16, transactionBean.expireTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) transactionBean.unSignedTx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, transactionBean.unSignedTx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || transactionBean.swapType != SwapType.ADVANCE) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 18, kSerializerArr[18], transactionBean.swapType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || transactionBean.callData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, MergeCallData$$serializer.INSTANCE, transactionBean.callData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || transactionBean.serviceFeeInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, ServiceFeeInfo$$serializer.INSTANCE, transactionBean.serviceFeeInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || transactionBean.slippageMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, kSerializerArr[21], transactionBean.slippageMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || transactionBean.maxSlippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, transactionBean.maxSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || transactionBean.slippageFeeType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, kSerializerArr[23], transactionBean.slippageFeeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || transactionBean.priorityFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, transactionBean.priorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || transactionBean.customPriorityFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, BooleanSerializer.INSTANCE, transactionBean.customPriorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || transactionBean.priorityFeeType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, transactionBean.priorityFeeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) transactionBean.mevInfo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, transactionBean.mevInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || transactionBean.gasPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, StringSerializer.INSTANCE, transactionBean.gasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || transactionBean.accountInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, AccountInfo$$serializer.INSTANCE, transactionBean.accountInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || transactionBean.routerModeType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, kSerializerArr[30], transactionBean.routerModeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || transactionBean.teeSaStatus != TeeSaStatus.NON_TEE_ACTIVE_AND_EXPIRED) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 31, kSerializerArr[31], transactionBean.teeSaStatus);
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 32, transactionBean.dexAutoConfirmEnabled);
    }

    public TransactionBean(String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4, QuotePriceRes quotePriceRes, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.TransactionType transactionType, @NotNull OrderIdTypeData orderIdTypeData, @NotNull String str8, @NotNull String str9, Integer num, boolean z2, boolean z3, long j, @NotNull String str10, @NotNull SwapType swapType, MergeCallData mergeCallData, ServiceFeeInfo serviceFeeInfo, SlippageMode slippageMode, String str11, SlippageFeeType slippageFeeType, String str12, Boolean bool, String str13, @NotNull String str14, String str15, AccountInfo accountInfo, PresetRouteType presetRouteType, @NotNull TeeSaStatus teeSaStatus, boolean z4) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(orderIdTypeData, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(swapType, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(teeSaStatus, "");
        this.receiveWalletAddress = str;
        this.spSlipPage = str2;
        this.isCustomSlippage = z;
        this.fromCoinAmountBalance = str3;
        this.reservedAmount = str4;
        this.quotePriceRes = quotePriceRes;
        this.balanceBracket = str5;
        this.gasPriceRate = str6;
        this.bridgeSelection = str7;
        this.transactionType = transactionType;
        this.orderIdTypeData = orderIdTypeData;
        this.transactionString = str8;
        this.signedTx = str9;
        this.walletAddressType = num;
        this.openMev = z2;
        this.supportMev = z3;
        this.expireTime = j;
        this.unSignedTx = str10;
        this.swapType = swapType;
        this.callData = mergeCallData;
        this.serviceFeeInfo = serviceFeeInfo;
        this.slippageMode = slippageMode;
        this.maxSlippage = str11;
        this.slippageFeeType = slippageFeeType;
        this.priorityFee = str12;
        this.customPriorityFee = bool;
        this.priorityFeeType = str13;
        this.mevInfo = str14;
        this.gasPrice = str15;
        this.accountInfo = accountInfo;
        this.routerModeType = presetRouteType;
        this.teeSaStatus = teeSaStatus;
        this.dexAutoConfirmEnabled = z4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0152: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r73v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r73v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r73v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r41v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r73v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r73v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.QuotePriceRes:?: TERNARY null = ((wrap:int:0x002d: ARITH (r73v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.QuotePriceRes) : (r44v0 com.okinc.business.dexlogic.bean.QuotePriceRes))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r73v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r73v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r73v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.TransactionType:?: TERNARY null = ((wrap:int:0x004d: ARITH (r73v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0051: SGET  A[WRAPPED] (LINE:392) com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.TransactionType.INQUIRY_TYPE com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.TransactionType) : (r48v0 com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.TransactionType))
  (wrap:com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.OrderIdTypeData:?: TERNARY null = ((wrap:int:0x0056: ARITH (r73v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0075: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:393) call: com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.OrderIdTypeData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r49v0 com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.OrderIdTypeData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007b: ARITH (r73v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0083: ARITH (r73v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x008c: ARITH (r73v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r52v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0095: ARITH (r73v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? false : (r53v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00a1: ARITH (32768 int) & (r73v0 int) A[WRAPPED]) != (0 int)) ? false : (r54v0 boolean))
  (wrap:long:?: TERNARY null = ((wrap:int:0x00ab: ARITH (65536 int) & (r73v0 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r55v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b5: ARITH (131072 int) & (r73v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.TransactionBean$SwapType:?: TERNARY null = ((wrap:int:0x00bf: ARITH (262144 int) & (r73v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00c4: SGET  A[WRAPPED] (LINE:401) com.okinc.business.dexlogic.bean.TransactionBean.SwapType.ADVANCE com.okinc.business.dexlogic.bean.TransactionBean$SwapType) : (r58v0 com.okinc.business.dexlogic.bean.TransactionBean$SwapType))
  (wrap:com.okinc.business.dexlogic.bean.MergeCallData:?: TERNARY null = ((wrap:int:0x00cb: ARITH (524288 int) & (r73v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.MergeCallData) : (r59v0 com.okinc.business.dexlogic.bean.MergeCallData))
  (wrap:com.okinc.business.dexlogic.bean.ServiceFeeInfo:?: TERNARY null = ((wrap:int:0x00d5: ARITH (1048576 int) & (r73v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.ServiceFeeInfo) : (r60v0 com.okinc.business.dexlogic.bean.ServiceFeeInfo))
  (wrap:com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode:?: TERNARY null = ((wrap:int:0x00df: ARITH (2097152 int) & (r73v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode) : (r61v0 com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e9: ARITH (4194304 int) & (r73v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r62v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.SlippageFeeType:?: TERNARY null = ((wrap:int:0x00f3: ARITH (8388608 int) & (r73v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.SlippageFeeType) : (r63v0 com.okinc.business.dexlogic.bean.SlippageFeeType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fd: ARITH (16777216 int) & (r73v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r64v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0107: ARITH (33554432 int) & (r73v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r65v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0111: ARITH (67108864 int) & (r73v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011b: ARITH (134217728 int) & (r73v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0125: ARITH (268435456 int) & (r73v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r68v0 java.lang.String))
  (wrap:com.okinc.business.dex.trade.core.domain.model.common.AccountInfo:?: TERNARY null = ((wrap:int:0x012f: ARITH (536870912 int) & (r73v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.common.AccountInfo) : (r69v0 com.okinc.business.dex.trade.core.domain.model.common.AccountInfo))
  (wrap:com.okinc.business.dexlogic.bean.PresetRouteType:?: TERNARY null = ((wrap:int:0x0139: ARITH (1073741824 int) & (r73v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.PresetRouteType) : (r70v0 com.okinc.business.dexlogic.bean.PresetRouteType))
  (wrap:com.okinc.business.dex.trade.core.domain.model.common.TeeSaStatus:?: TERNARY null = ((wrap:int:0x0143: ARITH (r73v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0148: SGET  A[WRAPPED] (LINE:417) com.okinc.business.dex.trade.core.domain.model.common.TeeSaStatus.NON_TEE_ACTIVE_AND_EXPIRED com.okinc.business.dex.trade.core.domain.model.common.TeeSaStatus) : (r71v0 com.okinc.business.dex.trade.core.domain.model.common.TeeSaStatus))
  (r72v0 boolean)
 A[MD:(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.QuotePriceRes, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.TransactionType, com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.OrderIdTypeData, java.lang.String, java.lang.String, java.lang.Integer, boolean, boolean, long, java.lang.String, com.okinc.business.dexlogic.bean.TransactionBean$SwapType, com.okinc.business.dexlogic.bean.MergeCallData, com.okinc.business.dexlogic.bean.ServiceFeeInfo, com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode, java.lang.String, com.okinc.business.dexlogic.bean.SlippageFeeType, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.trade.core.domain.model.common.AccountInfo, com.okinc.business.dexlogic.bean.PresetRouteType, com.okinc.business.dex.trade.core.domain.model.common.TeeSaStatus, boolean):void (m)] (LINE:382) call: com.okinc.business.dexlogic.bean.TransactionBean.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.QuotePriceRes, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.TransactionType, com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.OrderIdTypeData, java.lang.String, java.lang.String, java.lang.Integer, boolean, boolean, long, java.lang.String, com.okinc.business.dexlogic.bean.TransactionBean$SwapType, com.okinc.business.dexlogic.bean.MergeCallData, com.okinc.business.dexlogic.bean.ServiceFeeInfo, com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode, java.lang.String, com.okinc.business.dexlogic.bean.SlippageFeeType, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.trade.core.domain.model.common.AccountInfo, com.okinc.business.dexlogic.bean.PresetRouteType, com.okinc.business.dex.trade.core.domain.model.common.TeeSaStatus, boolean):void type: THIS */
    public /* synthetic */ TransactionBean(String str, String str2, boolean z, String str3, String str4, QuotePriceRes quotePriceRes, String str5, String str6, String str7, com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.TransactionType transactionType, OrderIdTypeData orderIdTypeData, String str8, String str9, Integer num, boolean z2, boolean z3, long j, String str10, SwapType swapType, MergeCallData mergeCallData, ServiceFeeInfo serviceFeeInfo, SlippageMode slippageMode, String str11, SlippageFeeType slippageFeeType, String str12, Boolean bool, String str13, String str14, String str15, AccountInfo accountInfo, PresetRouteType presetRouteType, TeeSaStatus teeSaStatus, boolean z4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : quotePriceRes, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.TransactionType.INQUIRY_TYPE : transactionType, (i & 1024) != 0 ? new OrderIdTypeData((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : orderIdTypeData, (i & 2048) != 0 ? "" : str8, (i & 4096) != 0 ? "" : str9, (i & 8192) != 0 ? null : num, (i & 16384) != 0 ? false : z2, (32768 & i) != 0 ? false : z3, (65536 & i) != 0 ? 0L : j, (131072 & i) != 0 ? "" : str10, (262144 & i) != 0 ? SwapType.ADVANCE : swapType, (524288 & i) != 0 ? null : mergeCallData, (1048576 & i) != 0 ? null : serviceFeeInfo, (2097152 & i) != 0 ? null : slippageMode, (4194304 & i) != 0 ? null : str11, (8388608 & i) != 0 ? null : slippageFeeType, (16777216 & i) != 0 ? null : str12, (33554432 & i) != 0 ? null : bool, (67108864 & i) != 0 ? null : str13, (134217728 & i) != 0 ? "" : str14, (268435456 & i) != 0 ? null : str15, (536870912 & i) != 0 ? null : accountInfo, (1073741824 & i) != 0 ? null : presetRouteType, (i & Integer.MIN_VALUE) != 0 ? TeeSaStatus.NON_TEE_ACTIVE_AND_EXPIRED : teeSaStatus, z4);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SwapType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ SwapType[] $VALUES;
        public static final SwapType BUY = new SwapType("BUY", 0);
        public static final SwapType SELL = new SwapType("SELL", 1);
        public static final SwapType ADVANCE = new SwapType("ADVANCE", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ SwapType[] $values() {
            return new SwapType[]{BUY, SELL, ADVANCE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<SwapType> getEntries() {
            return $ENTRIES;
        }

        private SwapType(String str, int i) {
        }

        static {
            SwapType[] swapTypeArr$values = $values();
            $VALUES = swapTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(swapTypeArr$values);
        }

        public static SwapType valueOf(String str) {
            return (SwapType) Enum.valueOf(SwapType.class, str);
        }

        public static SwapType[] values() {
            return (SwapType[]) $VALUES.clone();
        }
    }

    public final String getPayText() {
        int i = StateListAnimator.AEQbTJ[this.swapType.ordinal()];
        if (i == 1) {
            return C33070mpX.AYXKKw(C23274hvD.Fragment.IMediaControllerCallbackStub);
        }
        if (i == 2) {
            return C33070mpX.AYXKKw(C23274hvD.Fragment.getLaunchPendingIntent);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return C33070mpX.AYXKKw(C23274hvD.Fragment.ReportDrawnCompositionobserveReporter1);
    }

    public final String getSwapButtonText() {
        int i = StateListAnimator.AEQbTJ[this.swapType.ordinal()];
        if (i == 1) {
            return C33070mpX.AYXKKw(C23274hvD.Fragment.onRepeatModeChanged);
        }
        if (i == 2) {
            return C33070mpX.AYXKKw(C23274hvD.Fragment.onSessionDestroyed);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return C33070mpX.AYXKKw(C23274hvD.Fragment.fXYAwm);
    }

    public final TradeMode getTradeMode() {
        return TradeMode.SwapMode;
    }

    public final int getTradeModeValue() {
        return TradeMode.SwapMode.getType();
    }
}
