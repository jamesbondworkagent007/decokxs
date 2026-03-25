package com.okinc.tradingbot.impl.strategy.fragment.detail;

import com.okinc.unify_trade.biz.StrategyProfitResponse;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C33129mqd;
import o.C54121wyQ;
import o.C56390yDp;
import o.C56391yDq;
import o.C56405yEd;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class BenefitDetailsFragment$refreshChart$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<StrategyProfitResponse> $it;
    Object L$0;
    int label;
    final /* synthetic */ C54121wyQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitDetailsFragment$refreshChart$1$1(C54121wyQ c54121wyQ, List<StrategyProfitResponse> list, Continuation<? super BenefitDetailsFragment$refreshChart$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c54121wyQ;
        this.$it = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BenefitDetailsFragment$refreshChart$1$1(this.this$0, this.$it, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BenefitDetailsFragment$refreshChart$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        Pair pairOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(objectRef2, this.$it, null);
            this.L$0 = objectRef2;
            this.label = 1;
            if (BuildersKt.withContext(coroutineDispatcher, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
            objectRef = objectRef2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (((List) objectRef.element).isEmpty()) {
            pairOLrzqt = C56390yDp.OLrzqt("", "");
        } else {
            StrategyProfitResponse strategyProfitResponse = (StrategyProfitResponse) CollectionsKt___CollectionsKt.AubY((List) objectRef.element);
            if (C33129mqd.OLrzqt((CharSequence) strategyProfitResponse.getSourceCcy())) {
                pairOLrzqt = C56390yDp.OLrzqt(strategyProfitResponse.getTotalPnlInSourceCcy(), strategyProfitResponse.getPnlRatioInSourceCcy());
            } else {
                pairOLrzqt = C56390yDp.OLrzqt(strategyProfitResponse.getTotalPnl(), strategyProfitResponse.getPnlRatio());
            }
        }
        this.this$0.gGvvIC().AhwBna.setData((List) objectRef.element, null, (String) pairOLrzqt.component1(), (String) pairOLrzqt.component2());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.strategy.fragment.detail.BenefitDetailsFragment$refreshChart$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<StrategyProfitResponse> $it;
        final /* synthetic */ Ref.ObjectRef<List<StrategyProfitResponse>> $list;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<List<StrategyProfitResponse>> objectRef, List<StrategyProfitResponse> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$list = objectRef;
            this.$it = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$list, this.$it, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            this.$list.element = C56405yEd.hDKMBd(this.$it);
            return Unit.INSTANCE;
        }
    }
}
