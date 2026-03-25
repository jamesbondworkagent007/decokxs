package com.okinc.unify_find.viewmodel;

import com.okinc.market.ranking.core.model.po.RankingFuturesType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class MarketHomeFuturesRankingViewModel$loadData$4$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $callSite;
    final /* synthetic */ RankingFuturesType $rankType;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarketHomeFuturesRankingViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeFuturesRankingViewModel$loadData$4$3(MarketHomeFuturesRankingViewModel marketHomeFuturesRankingViewModel, String str, RankingFuturesType rankingFuturesType, Continuation<? super MarketHomeFuturesRankingViewModel$loadData$4$3> continuation) {
        super(2, continuation);
        this.this$0 = marketHomeFuturesRankingViewModel;
        this.$callSite = str;
        this.$rankType = rankingFuturesType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketHomeFuturesRankingViewModel$loadData$4$3 marketHomeFuturesRankingViewModel$loadData$4$3 = new MarketHomeFuturesRankingViewModel$loadData$4$3(this.this$0, this.$callSite, this.$rankType, continuation);
        marketHomeFuturesRankingViewModel$loadData$4$3.L$0 = obj;
        return marketHomeFuturesRankingViewModel$loadData$4$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketHomeFuturesRankingViewModel$loadData$4$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.unify_find.viewmodel.MarketHomeFuturesRankingViewModel$loadData$4$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $callSite;
        final /* synthetic */ RankingFuturesType $rankType;
        int label;
        final /* synthetic */ MarketHomeFuturesRankingViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MarketHomeFuturesRankingViewModel marketHomeFuturesRankingViewModel, String str, RankingFuturesType rankingFuturesType, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = marketHomeFuturesRankingViewModel;
            this.$callSite = str;
            this.$rankType = rankingFuturesType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$callSite, this.$rankType, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MarketHomeFuturesRankingViewModel marketHomeFuturesRankingViewModel = this.this$0;
                String str = this.$callSite;
                RankingFuturesType rankingFuturesType = this.$rankType;
                this.label = 1;
                if (marketHomeFuturesRankingViewModel.EZpvd(str, rankingFuturesType, this) == objCopydefault) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.this$0, this.$callSite, this.$rankType, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.this$0, this.$callSite, this.$rankType, null), 3, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: renamed from: com.okinc.unify_find.viewmodel.MarketHomeFuturesRankingViewModel$loadData$4$3$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $callSite;
        final /* synthetic */ RankingFuturesType $rankType;
        int label;
        final /* synthetic */ MarketHomeFuturesRankingViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MarketHomeFuturesRankingViewModel marketHomeFuturesRankingViewModel, String str, RankingFuturesType rankingFuturesType, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = marketHomeFuturesRankingViewModel;
            this.$callSite = str;
            this.$rankType = rankingFuturesType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$callSite, this.$rankType, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MarketHomeFuturesRankingViewModel marketHomeFuturesRankingViewModel = this.this$0;
                String str = this.$callSite;
                RankingFuturesType rankingFuturesType = this.$rankType;
                this.label = 1;
                if (marketHomeFuturesRankingViewModel.copydefault(str, rankingFuturesType, (Continuation<? super Unit>) this) == objCopydefault) {
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
}
