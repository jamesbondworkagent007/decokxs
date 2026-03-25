package com.okinc.tradingbot.impl.strategy.fragment.detail;

import androidx.lifecycle.FlowLiveDataConversions;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C33129mqd;
import o.C54507xKz;
import o.C55804xqp;
import o.C55887xsS;
import o.C56235xyw;
import o.C56391yDq;
import o.C56442yFn;
import o.xKK;

/* JADX INFO: loaded from: classes19.dex */
public final class TacticsDetailPresenter$queryBotDetails$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ TacticsDetailPresenter this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TacticsDetailPresenter$queryBotDetails$2(TacticsDetailPresenter tacticsDetailPresenter, Continuation<? super TacticsDetailPresenter$queryBotDetails$2> continuation) {
        super(2, continuation);
        this.this$0 = tacticsDetailPresenter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TacticsDetailPresenter$queryBotDetails$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TacticsDetailPresenter$queryBotDetails$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter$queryBotDetails$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C55804xqp<StrategyDetailsResponse>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TacticsDetailPresenter this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TacticsDetailPresenter tacticsDetailPresenter, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = tacticsDetailPresenter;
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
        public final Object invoke(C55804xqp<StrategyDetailsResponse> c55804xqp, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(c55804xqp, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C55804xqp c55804xqp = (C55804xqp) this.L$0;
                if (Intrinsics.EZpvd((Object) c55804xqp.OLrzqt(), (Object) "http")) {
                    this.this$0.AkhnZx = ((StrategyDetailsResponse) c55804xqp.copydefault()).getCcy();
                    this.this$0.KWHzl = ((StrategyDetailsResponse) c55804xqp.copydefault()).getAccountId();
                }
                if (this.this$0.OLrzqt(((StrategyDetailsResponse) c55804xqp.copydefault()).getOrdType())) {
                    TacticsDetailPresenter tacticsDetailPresenter = this.this$0;
                    String strOLrzqt = tacticsDetailPresenter.OLrzqt(tacticsDetailPresenter.AhwBna());
                    C56235xyw c56235xyw = this.this$0.fIwbmz;
                    TacticsDetailPresenter tacticsDetailPresenter2 = this.this$0;
                    c56235xyw.KWHzl(((StrategyDetailsResponse) c55804xqp.copydefault()).getOrdType());
                    c56235xyw.AEQbTJ(((StrategyDetailsResponse) c55804xqp.copydefault()).getInstId());
                    if (C33129mqd.OLrzqt((CharSequence) strOLrzqt)) {
                        c56235xyw.EZpvd(strOLrzqt);
                    }
                    C55887xsS c55887xsS = tacticsDetailPresenter2.AhwBna;
                    if (c55887xsS == null) {
                        Intrinsics.gEmmrt("");
                        c55887xsS = null;
                    }
                    c56235xyw.OLrzqt(c55887xsS.AEQbTJ(((StrategyDetailsResponse) c55804xqp.copydefault()).getOrdType()));
                    c56235xyw.OLrzqt(tacticsDetailPresenter2.valueOf(), new C54507xKz());
                    xKK.Activity.execute$default(c56235xyw, 0L, 1, null);
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
            Flow flowAsFlow = FlowLiveDataConversions.asFlow(this.this$0.getNewProxyInstance());
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowAsFlow, anonymousClass1, this) == objCopydefault) {
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
