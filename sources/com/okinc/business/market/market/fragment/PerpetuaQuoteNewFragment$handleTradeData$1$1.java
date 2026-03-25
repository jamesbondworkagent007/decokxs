package com.okinc.business.market.market.fragment;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC54646xQb;
import o.C55608xnE;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54581xNr;
import o.kHI;
import o.qTI;
import o.qTT;

/* JADX INFO: loaded from: classes18.dex */
public final class PerpetuaQuoteNewFragment$handleTradeData$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ qTI $cupTickerRepo;
    final /* synthetic */ InterfaceC54581xNr $mTrade;
    final /* synthetic */ MutableLiveData<SourceResp<AbstractC54646xQb>> $this_apply;
    final /* synthetic */ qTT $tickerRepo;
    int label;
    final /* synthetic */ kHI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerpetuaQuoteNewFragment$handleTradeData$1$1(InterfaceC54581xNr interfaceC54581xNr, MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData, kHI khi, qTI qti, qTT qtt, Continuation<? super PerpetuaQuoteNewFragment$handleTradeData$1$1> continuation) {
        super(2, continuation);
        this.$mTrade = interfaceC54581xNr;
        this.$this_apply = mutableLiveData;
        this.this$0 = khi;
        this.$cupTickerRepo = qti;
        this.$tickerRepo = qtt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PerpetuaQuoteNewFragment$handleTradeData$1$1(this.$mTrade, this.$this_apply, this.this$0, this.$cupTickerRepo, this.$tickerRepo, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PerpetuaQuoteNewFragment$handleTradeData$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54581xNr interfaceC54581xNr = this.$mTrade;
            MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData = this.$this_apply;
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.this$0);
            qTI qti = this.$cupTickerRepo;
            qTT qtt = this.$tickerRepo;
            this.label = 1;
            if (C55608xnE.KWHzl(interfaceC54581xNr, (224 & 1) != 0 ? false : true, mutableLiveData, lifecycleScope, qti, qtt, (224 & 32) != 0 ? new Function1() { // from class: o.xnF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(C55608xnE.EZpvd((BizInstrument) obj2));
                }
            } : null, (224 & 64) != 0 ? "unknown" : null, (224 & 128) != 0 ? false : false, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
