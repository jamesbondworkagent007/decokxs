package com.okinc.business.trade.features.home.ui.meme;

import com.okinc.business.dexlogic.main.swap.ws.bean.MarketTxWsInfoItemBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC30827liW;
import o.C25266itV;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class BaseNewTransactionFragment$initCommonListener$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AbstractC30827liW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseNewTransactionFragment$initCommonListener$3(AbstractC30827liW abstractC30827liW, Continuation<? super BaseNewTransactionFragment$initCommonListener$3> continuation) {
        super(2, continuation);
        this.this$0 = abstractC30827liW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseNewTransactionFragment$initCommonListener$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseNewTransactionFragment$initCommonListener$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.trade.features.home.ui.meme.BaseNewTransactionFragment$initCommonListener$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<MarketTxWsInfoItemBean, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AbstractC30827liW this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC30827liW abstractC30827liW, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = abstractC30827liW;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MarketTxWsInfoItemBean marketTxWsInfoItemBean, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(marketTxWsInfoItemBean, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                MarketTxWsInfoItemBean marketTxWsInfoItemBean = (MarketTxWsInfoItemBean) this.L$0;
                C25266itV c25266itVFJNWhG = this.this$0.fJNWhG();
                if (c25266itVFJNWhG != null) {
                    c25266itVFJNWhG.EZpvd(marketTxWsInfoItemBean != null ? marketTxWsInfoItemBean.fIwbmz() : null);
                }
                C25266itV c25266itVFJNWhG2 = this.this$0.fJNWhG();
                if (c25266itVFJNWhG2 != null) {
                    c25266itVFJNWhG2.copydefault(marketTxWsInfoItemBean != null ? marketTxWsInfoItemBean.values() : null);
                }
                C25266itV c25266itVFJNWhG3 = this.this$0.fJNWhG();
                if (c25266itVFJNWhG3 != null) {
                    c25266itVFJNWhG3.OLrzqt(marketTxWsInfoItemBean != null ? marketTxWsInfoItemBean.DbNXlk() : null);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow<MarketTxWsInfoItemBean> mutableStateFlowAYXKKw = this.this$0.AhwBna().AYXKKw();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(mutableStateFlowAYXKKw, anonymousClass1, this) == objCopydefault) {
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
