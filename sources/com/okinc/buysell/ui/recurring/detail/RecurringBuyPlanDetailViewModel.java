package com.okinc.buysell.ui.recurring.detail;

import androidx.lifecycle.ViewModelKt;
import com.okinc.buysell.ui.paymentmethod.data.BuySellParameter;
import com.okinc.buysell.ui.paymentmethod.data.SelectPaymentMethodParameter;
import com.okinc.okpaymentapi.data.remote.model.management.Account;
import com.okinc.okpaymentapi.data.remote.model.management.B2CExtCollectInfo;
import com.okinc.okpaymentapi.data.remote.model.management.BankingHours;
import com.okinc.okpaymentapi.data.remote.model.management.BillingAddress;
import com.okinc.okpaymentapi.data.remote.model.management.Channel;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import com.okinc.okpaymentapi.data.remote.model.management.EarnOption;
import com.okinc.okpaymentapi.data.remote.model.management.InformationBox;
import com.okinc.okpaymentapi.data.remote.model.management.LimitInfo;
import com.okinc.okpaymentapi.data.remote.model.management.Localization;
import com.okinc.okpaymentapi.data.remote.model.management.LocalizationHighlightStyle;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethodCategory;
import com.okinc.okpaymentapi.data.remote.model.management.SellerReceiptAccount;
import com.okinc.okpaymentapi.data.remote.model.management.SupportCurrencyInfo;
import com.okinc.okpaymentapi.data.remote.model.management.TermContentChannel;
import com.okinc.okpaymentapi.data.remote.model.management.TradeLimit;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okpaymentapi.data.remote.model.management.TradingAgentInfo;
import com.okinc.okpaymentapi.data.remote.model.management.UiFlowControl;
import com.okinc.okx.paymentapi.service.DexTokenParameters;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C31943mJr;
import o.C33129mqd;
import o.C3722ArM;
import o.C3766AsD;
import o.C3817AtB;
import o.C3819AtD;
import o.InterfaceC3825AtJ;
import o.lMD;
import o.lyI;
import o.lzE;
import o.yCM;
import org.jetbrains.annotations.NotNull;
import uniffi.buy_sell.RecurringBuyPlanDetailStatusChangeType;

/* JADX INFO: loaded from: classes7.dex */
public final class RecurringBuyPlanDetailViewModel extends C31943mJr {
    public final MutableStateFlow<C3819AtD> AEQbTJ;
    public final SharedFlow<RecurringBuyPlanDetailStatusChangeType> AYXKKw;
    public final StateFlow<C3819AtD> AhwBna;
    public final MutableSharedFlow<RecurringBuyPlanDetailStatusChangeType> EZpvd;
    public final lyI KWHzl;
    public final MutableSharedFlow<Pair<Channel, lMD<PaymentMethod, Exception>>> OLrzqt;
    public final SharedFlow<Pair<Channel, lMD<PaymentMethod, Exception>>> copydefault;
    public final StateListAnimator djBIcL;
    public final C3766AsD gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<RecurringBuyPlanDetailStatusChangeType> AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C3819AtD> KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Pair<Channel, lMD<PaymentMethod, Exception>>> OLrzqt() {
        return this.copydefault;
    }

    @yCM
    public RecurringBuyPlanDetailViewModel(@NotNull C3766AsD c3766AsD, @NotNull lyI lyi, @NotNull lzE lze) {
        Intrinsics.checkNotNullParameter(c3766AsD, "");
        Intrinsics.checkNotNullParameter(lyi, "");
        Intrinsics.checkNotNullParameter(lze, "");
        this.gEmmrt = c3766AsD;
        this.KWHzl = lyi;
        C3722ArM.registerFormatter(lze);
        MutableStateFlow<C3819AtD> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow;
        this.AhwBna = MutableStateFlow;
        MutableSharedFlow<RecurringBuyPlanDetailStatusChangeType> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.AYXKKw = mutableSharedFlowMutableSharedFlow$default;
        MutableSharedFlow<Pair<Channel, lMD<PaymentMethod, Exception>>> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default2;
        this.copydefault = mutableSharedFlowMutableSharedFlow$default2;
        StateListAnimator stateListAnimator = new StateListAnimator();
        this.djBIcL = stateListAnimator;
        c3766AsD.AEQbTJ(stateListAnimator);
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class StateListAnimator implements InterfaceC3825AtJ {
        public StateListAnimator() {
        }

        @Override // o.InterfaceC3825AtJ
        public void EZpvd(C3819AtD c3819AtD) {
            Intrinsics.checkNotNullParameter(c3819AtD, "");
            RecurringBuyPlanDetailStatusChangeType recurringBuyPlanDetailStatusChangeTypeKWHzl = c3819AtD.KWHzl();
            if (recurringBuyPlanDetailStatusChangeTypeKWHzl != null) {
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(RecurringBuyPlanDetailViewModel.this), null, null, new RecurringBuyPlanDetailViewModel$stateObserver$1$onStateChanged$1(RecurringBuyPlanDetailViewModel.this, recurringBuyPlanDetailStatusChangeTypeKWHzl, null), 3, null);
            }
            RecurringBuyPlanDetailViewModel.this.AEQbTJ.setValue(c3819AtD);
        }
    }

    public final void EZpvd(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt.copydefault(str, z);
    }

    public final void EZpvd(boolean z) {
        this.gEmmrt.copydefault(z);
    }

    public final void copydefault(String str, String str2, String str3, String str4, String str5) {
        this.gEmmrt.copydefault(str, str2, str3, str4, str5);
    }

    public final void copydefault() {
        this.gEmmrt.EZpvd();
    }

    public final void valueOf() {
        this.gEmmrt.KWHzl();
    }

    public final void AhwBna() {
        this.gEmmrt.valueOf();
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt.OLrzqt(str);
    }

    public final void EZpvd() {
        this.gEmmrt.OLrzqt();
    }

    public final void gEmmrt() {
        this.gEmmrt.copydefault();
    }

    public final void AYXKKw() {
        this.gEmmrt.AEQbTJ();
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
    }

    public final void KWHzl(@NotNull Channel channel, @NotNull PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(channel, "");
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new RecurringBuyPlanDetailViewModel$removePaymentMethod$1(this, channel, paymentMethod, null), 3, null);
    }

    public final SelectPaymentMethodParameter copydefault(@NotNull C3817AtB c3817AtB) {
        ChannelCategoryCode channelCategoryCode;
        PaymentMethodCategory paymentMethodCategory;
        Intrinsics.checkNotNullParameter(c3817AtB, "");
        int iCopydefault = c3817AtB.copydefault();
        if (iCopydefault == 2) {
            channelCategoryCode = ChannelCategoryCode.THIRD_PARTY;
        } else if (iCopydefault != 3 && iCopydefault == 4) {
            channelCategoryCode = ChannelCategoryCode.NATIVE;
        } else {
            channelCategoryCode = ChannelCategoryCode.BALANCE;
        }
        ChannelCategoryCode channelCategoryCode2 = channelCategoryCode;
        int iValueOf = c3817AtB.valueOf();
        if (iValueOf == 0) {
            paymentMethodCategory = PaymentMethodCategory.CASH;
        } else if (iValueOf == 1) {
            paymentMethodCategory = PaymentMethodCategory.STABLECOIN;
        } else if (iValueOf == 2) {
            paymentMethodCategory = PaymentMethodCategory.CRYPTO;
        } else {
            paymentMethodCategory = PaymentMethodCategory.CASH;
        }
        return new SelectPaymentMethodParameter((String) null, (String) null, (String) null, TradeType.BUY, new BuySellParameter(c3817AtB.EZpvd(), c3817AtB.AYXKKw(), (String) null, (String) null, (String) null, (Integer) null, 60, (DefaultConstructorMarker) null), 0, false, false, (List) null, true, true, new Channel((TradingAgentInfo) null, (String) null, false, (String) null, channelCategoryCode2, false, (String) null, (String) null, C33129mqd.gEmmrt(Integer.valueOf(c3817AtB.OLrzqt())), 0, (String) null, (String) null, (String) null, (String) null, (String) null, false, (B2CExtCollectInfo) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (List) null, false, paymentMethodCategory, (List) null, (List) null, (String) null, (List) null, (String) null, (List) null, (TermContentChannel) null, (Integer) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, false, (Localization) null, (LocalizationHighlightStyle) null, (LimitInfo) null, (InformationBox) null, (BankingHours) null, (UiFlowControl) null, false, (String) null, (String) null, (TradeLimit) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, false, c3817AtB.AYXKKw(), false, (SupportCurrencyInfo) null, (Integer) null, (EarnOption) null, (List) null, (String) null, false, false, -536871185, -1, 16351, (DefaultConstructorMarker) null), new PaymentMethod((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, false, false, new Account(c3817AtB.gEmmrt(), (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BillingAddress) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, false, -2, 63, (DefaultConstructorMarker) null), (String) null, (String) null, (String) null, (List) null, false, (String) null, false, (SellerReceiptAccount) null, (String) null, (String) null, (String) null, false, (List) null, 0, 536854527, (DefaultConstructorMarker) null), (List) null, (DexTokenParameters) null, 16871, (DefaultConstructorMarker) null);
    }
}
