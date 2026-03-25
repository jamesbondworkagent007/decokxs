package com.okinc.business.invest_biz.ui.screens.univ3;

import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C27019jnL;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestUniv3SubscribeActivity$refreshInputAmountUponPriceChange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ InvestUniv3SubscribeActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3SubscribeActivity$refreshInputAmountUponPriceChange$1(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, Continuation<? super InvestUniv3SubscribeActivity$refreshInputAmountUponPriceChange$1> continuation) {
        super(2, continuation);
        this.this$0 = investUniv3SubscribeActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3SubscribeActivity$refreshInputAmountUponPriceChange$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUniv3SubscribeActivity$refreshInputAmountUponPriceChange$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InvestUniv3SubscribeActivity.AmountInputIndex amountInputIndex;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.isConnected().OcIXYQ()) {
                if (this.this$0.isConnected().ffGIBT()) {
                    this.this$0.isConnected().DXXBbs().setValue(new C27019jnL(true));
                } else {
                    this.this$0.isConnected().DCJXGO().setValue(new C27019jnL(true));
                }
                return Unit.INSTANCE;
            }
            boolean z = this.this$0.isConnected().AxsJAYaxsJAY().EZpvd().compareTo(this.this$0.isConnected().ejfBZ().getValue()) >= 0;
            boolean z2 = this.this$0.isConnected().AxsJAY().EZpvd().compareTo(this.this$0.isConnected().ejfBZ().getValue()) <= 0;
            if (!z) {
                InvestUniv3SubscribeActivity investUniv3SubscribeActivity = this.this$0;
                amountInputIndex = InvestUniv3SubscribeActivity.AmountInputIndex.Second;
                investUniv3SubscribeActivity.AuCTel = amountInputIndex;
                if (!this.this$0.ejfBZ()) {
                    amountInputIndex = InvestUniv3SubscribeActivity.AmountInputIndex.First;
                }
            } else if (z2) {
                InvestUniv3SubscribeActivity.AmountInputIndex amountInputIndex2 = this.this$0.AuCTel;
                amountInputIndex = InvestUniv3SubscribeActivity.AmountInputIndex.First;
                if (amountInputIndex2 == amountInputIndex) {
                    if (!this.this$0.ejfBZ()) {
                        amountInputIndex = InvestUniv3SubscribeActivity.AmountInputIndex.Second;
                    }
                } else if (this.this$0.ejfBZ()) {
                    amountInputIndex = InvestUniv3SubscribeActivity.AmountInputIndex.Second;
                }
            } else {
                InvestUniv3SubscribeActivity investUniv3SubscribeActivity2 = this.this$0;
                amountInputIndex = InvestUniv3SubscribeActivity.AmountInputIndex.First;
                investUniv3SubscribeActivity2.AuCTel = amountInputIndex;
                if (!this.this$0.ejfBZ()) {
                    amountInputIndex = InvestUniv3SubscribeActivity.AmountInputIndex.Second;
                }
            }
            this.this$0.OLrzqt(amountInputIndex == InvestUniv3SubscribeActivity.AmountInputIndex.First ? this.this$0.isConnected().AwvSrB().getValue().OLrzqt() : this.this$0.isConnected().zuBGHE().getValue().OLrzqt(), amountInputIndex);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
