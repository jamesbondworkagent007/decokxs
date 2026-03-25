package com.okinc.buysell.ui.bsc;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.okinc.buysell.ui.bsc.BaseBuySellFragment$runPreCheck$1;
import com.okinc.buysell.ui.bsc.BaseBuySellViewModel;
import com.okinc.okpaymentapi.data.remote.model.experience.BuySellCurrency;
import com.okinc.okpaymentapi.data.remote.model.management.Account;
import com.okinc.okpaymentapi.data.remote.model.management.Channel;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okx.paymentapi.uv.PreCheckStatus;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.C31661lzi;
import o.C33129mqd;
import o.C43251rlk;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC47251tmX;
import o.mHA;

/* JADX INFO: loaded from: classes15.dex */
public final class BaseBuySellFragment$runPreCheck$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BaseBuySellFragment<T> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseBuySellFragment$runPreCheck$1(BaseBuySellFragment<T> baseBuySellFragment, Continuation<? super BaseBuySellFragment$runPreCheck$1> continuation) {
        super(2, continuation);
        this.this$0 = baseBuySellFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseBuySellFragment$runPreCheck$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseBuySellFragment$runPreCheck$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Pair pair = (Pair) mHA.OLrzqt.AEQbTJ(this.this$0.AuCTel().sSMYrx());
            if (pair != null) {
                final BaseBuySellFragment<T> baseBuySellFragment = this.this$0;
                Channel channel = (Channel) pair.getFirst();
                PaymentMethod paymentMethod = (PaymentMethod) pair.getSecond();
                InterfaceC47251tmX interfaceC47251tmX = (InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class);
                FragmentActivity fragmentActivityRequireActivity = baseBuySellFragment.requireActivity();
                Intrinsics.copydefault(fragmentActivityRequireActivity, "");
                AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) fragmentActivityRequireActivity;
                Context contextRequireContext = baseBuySellFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                FragmentManager parentFragmentManager = baseBuySellFragment.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                TradeType tradeTypeFlVtFt = baseBuySellFragment.AuCTel().flVtFt();
                String depositName = channel.getDepositName();
                String depositPlatformCode = channel.getDepositPlatformCode();
                String paymentMethodId = paymentMethod.getPaymentMethodId();
                String quoteCurrency = channel.getQuoteCurrency();
                String baseCurrency = channel.getBaseCurrency();
                String quoteAmount = channel.getQuoteAmount();
                String baseAmount = channel.getBaseAmount();
                Account account = paymentMethod.getAccount();
                String paymentAccountId = account != null ? account.getPaymentAccountId() : null;
                Function1 function1 = new Function1() { // from class: o.lAz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return BaseBuySellFragment$runPreCheck$1.invokeSuspend$lambda$1$lambda$0(baseBuySellFragment, (PreCheckStatus) obj2);
                    }
                };
                this.label = 1;
                if (InterfaceC47251tmX.StateListAnimator.runPrecheckForBuySell$default(interfaceC47251tmX, abstractActivityC33041mov, contextRequireContext, parentFragmentManager, tradeTypeFlVtFt, depositName, depositPlatformCode, paymentMethodId, quoteCurrency, baseCurrency, quoteAmount, baseAmount, false, paymentAccountId, function1, this, 2048, null) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(BaseBuySellFragment baseBuySellFragment, PreCheckStatus preCheckStatus) {
        BuySellCurrency buySellCurrencyAEQbTJ;
        if (!Intrinsics.EZpvd(preCheckStatus, PreCheckStatus.ApiFinishedLoad.copydefault)) {
            int scale = 0;
            if (Intrinsics.EZpvd(preCheckStatus, PreCheckStatus.NotSuccess.copydefault)) {
                baseBuySellFragment.AuCTel().AYXKKw(false);
            } else if (preCheckStatus instanceof PreCheckStatus.Success) {
                baseBuySellFragment.AuCTel().AYXKKw(false);
                BaseBuySellViewModel baseBuySellViewModelAuCTel = baseBuySellFragment.AuCTel();
                String strOLrzqt = C33129mqd.OLrzqt((Object) baseBuySellFragment.ejfBZ().OLrzqt());
                String strUzCIH = baseBuySellFragment.ejfBZ().uzCIH();
                BaseBuySellViewModel.ActionBar actionBar = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(baseBuySellFragment.AuCTel().QOLQEE());
                if (actionBar != null && (buySellCurrencyAEQbTJ = actionBar.AEQbTJ()) != null) {
                    scale = buySellCurrencyAEQbTJ.getScale();
                }
                baseBuySellViewModelAuCTel.EZpvd(strOLrzqt, C31661lzi.OLrzqt(strUzCIH, scale), baseBuySellFragment.ejfBZ().fetchVPNInfo());
            } else {
                if (!(preCheckStatus instanceof PreCheckStatus.ApiFailed)) {
                    throw new NoWhenBranchMatchedException();
                }
                baseBuySellFragment.AuCTel().AYXKKw(false);
                C55326xho.toast$default(((PreCheckStatus.ApiFailed) preCheckStatus).KWHzl(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }
}
