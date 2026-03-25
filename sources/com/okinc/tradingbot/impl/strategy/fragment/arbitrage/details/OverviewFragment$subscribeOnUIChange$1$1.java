package com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details;

import android.view.View;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C48172uHq;
import o.C55804xqp;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.uSF;

/* JADX INFO: loaded from: classes19.dex */
public final class OverviewFragment$subscribeOnUIChange$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C55804xqp<StrategyDetailsResponse> $it;
    Object L$0;
    int label;
    final /* synthetic */ OverviewFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverviewFragment$subscribeOnUIChange$1$1(OverviewFragment overviewFragment, C55804xqp<StrategyDetailsResponse> c55804xqp, Continuation<? super OverviewFragment$subscribeOnUIChange$1$1> continuation) {
        super(2, continuation);
        this.this$0 = overviewFragment;
        this.$it = c55804xqp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OverviewFragment$subscribeOnUIChange$1$1(this.this$0, this.$it, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OverviewFragment$subscribeOnUIChange$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, this.this$0, objectRef2, null);
            this.L$0 = objectRef2;
            this.label = 1;
            if (BuildersKt.withContext(io2, anonymousClass1, this) == objCopydefault) {
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
        OverviewFragment overviewFragment = this.this$0;
        TacticsData tacticsData = (TacticsData) CollectionsKt___CollectionsKt.firstOrNull((List) objectRef.element);
        if (tacticsData == null) {
            tacticsData = new TacticsData(null, null, null, null, null, null, false, null, null, 0, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, 3, null);
        }
        overviewFragment.fARcdN = tacticsData;
        uSF usf = this.this$0.AhwBna;
        if (usf != null) {
            OverviewFragment overviewFragment2 = this.this$0;
            View root = usf.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            overviewFragment2.EZpvd(root, usf, overviewFragment2.fARcdN);
        }
        OverviewFragment overviewFragment3 = this.this$0;
        overviewFragment3.AEQbTJ(overviewFragment3.fARcdN, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.OverviewFragment$subscribeOnUIChange$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<List<TacticsData>> $dataList;
        final /* synthetic */ C55804xqp<StrategyDetailsResponse> $it;
        int label;
        final /* synthetic */ OverviewFragment this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C55804xqp<StrategyDetailsResponse> c55804xqp, OverviewFragment overviewFragment, Ref.ObjectRef<List<TacticsData>> objectRef, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$it = c55804xqp;
            this.this$0 = overviewFragment;
            this.$dataList = objectRef;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$it, this.this$0, this.$dataList, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [T, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.$it.copydefault().isHistory();
                this.this$0.fJNWhG = C48172uHq.AEQbTJ(this.$it.copydefault(), this.this$0.fJNWhG);
                OverviewFragment overviewFragment = this.this$0;
                overviewFragment.AEQbTJ(overviewFragment.fJNWhG);
                this.$dataList.element = this.this$0.AEQbTJ((C55804xqp<List<StrategyDetailsResponse>>) new C55804xqp("", C56402yEa.EZpvd(this.$it.copydefault()), null, null, 12, null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
