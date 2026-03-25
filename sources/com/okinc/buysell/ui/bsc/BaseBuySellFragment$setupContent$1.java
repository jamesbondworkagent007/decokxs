package com.okinc.buysell.ui.bsc;

import com.okinc.crcore.shared.net.responsebean.bsc.DefaultCurrencyBean;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.lyR;

/* JADX INFO: loaded from: classes15.dex */
public final class BaseBuySellFragment$setupContent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BaseBuySellFragment<T> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseBuySellFragment$setupContent$1(BaseBuySellFragment<T> baseBuySellFragment, Continuation<? super BaseBuySellFragment$setupContent$1> continuation) {
        super(2, continuation);
        this.this$0 = baseBuySellFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseBuySellFragment$setupContent$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseBuySellFragment$setupContent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String sell;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            lyR lyrFARcdN = this.this$0.AuCTel().fARcdN();
            this.label = 1;
            obj = lyR.invoke$default(lyrFARcdN, null, this, 1, null);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        BaseBuySellFragment<T> baseBuySellFragment = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            DefaultCurrencyBean defaultCurrencyBean = (DefaultCurrencyBean) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            BaseBuySellViewModel baseBuySellViewModelAuCTel = baseBuySellFragment.AuCTel();
            if (baseBuySellFragment.AuCTel().flVtFt() == TradeType.BUY) {
                sell = defaultCurrencyBean.getBuy();
            } else {
                sell = defaultCurrencyBean.getSell();
            }
            baseBuySellViewModelAuCTel.EZpvd(sell);
        }
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }
}
