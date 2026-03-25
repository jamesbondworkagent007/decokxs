package com.okinc.find_ui.ranking.stock.viewmodel;

import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C35069noP;
import o.C40429qVn;
import o.C40430qVo;
import o.C49380unU;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketHomeStockContainerViewModel$loadAndSubscribeData$lambda$2$$inlined$executeAsyncTasks$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends Pair<? extends List<? extends C35069noP>, ? extends List<? extends C35069noP>>, ? extends Map<String, ? extends TickersData>>>, Object> {
    final /* synthetic */ int $pageSize$inlined;
    final /* synthetic */ MarketHomeStockContainerViewModel $this_runCatching$inlined;
    final /* synthetic */ MarketHomeStockContainerViewModel $this_runCatching$inlined$1;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeStockContainerViewModel$loadAndSubscribeData$lambda$2$$inlined$executeAsyncTasks$1(Continuation continuation, MarketHomeStockContainerViewModel marketHomeStockContainerViewModel, int i, MarketHomeStockContainerViewModel marketHomeStockContainerViewModel2) {
        super(2, continuation);
        this.$this_runCatching$inlined = marketHomeStockContainerViewModel;
        this.$pageSize$inlined = i;
        this.$this_runCatching$inlined$1 = marketHomeStockContainerViewModel2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketHomeStockContainerViewModel$loadAndSubscribeData$lambda$2$$inlined$executeAsyncTasks$1 marketHomeStockContainerViewModel$loadAndSubscribeData$lambda$2$$inlined$executeAsyncTasks$1 = new MarketHomeStockContainerViewModel$loadAndSubscribeData$lambda$2$$inlined$executeAsyncTasks$1(continuation, this.$this_runCatching$inlined, this.$pageSize$inlined, this.$this_runCatching$inlined$1);
        marketHomeStockContainerViewModel$loadAndSubscribeData$lambda$2$$inlined$executeAsyncTasks$1.L$0 = obj;
        return marketHomeStockContainerViewModel$loadAndSubscribeData$lambda$2$$inlined$executeAsyncTasks$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends Pair<? extends List<? extends C35069noP>, ? extends List<? extends C35069noP>>, ? extends Map<String, ? extends TickersData>>> continuation) {
        return ((MarketHomeStockContainerViewModel$loadAndSubscribeData$lambda$2$$inlined$executeAsyncTasks$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.find_ui.ranking.stock.viewmodel.MarketHomeStockContainerViewModel$loadAndSubscribeData$lambda$2$$inlined$executeAsyncTasks$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends List<? extends C35069noP>, ? extends List<? extends C35069noP>>>, Object> {
        final /* synthetic */ int $pageSize$inlined;
        final /* synthetic */ MarketHomeStockContainerViewModel $this_runCatching$inlined;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, MarketHomeStockContainerViewModel marketHomeStockContainerViewModel, int i) {
            super(2, continuation);
            this.$this_runCatching$inlined = marketHomeStockContainerViewModel;
            this.$pageSize$inlined = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation, this.$this_runCatching$inlined, this.$pageSize$inlined);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends List<? extends C35069noP>, ? extends List<? extends C35069noP>>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MarketHomeStockContainerViewModel marketHomeStockContainerViewModel = this.$this_runCatching$inlined;
                int i2 = this.$pageSize$inlined;
                this.label = 1;
                obj = marketHomeStockContainerViewModel.EZpvd(i2, (Continuation<? super Pair<? extends List<C35069noP>, ? extends List<C35069noP>>>) this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return obj;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Deferred deferred;
        Object obj2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new AnonymousClass1(null, this.$this_runCatching$inlined, this.$pageSize$inlined), 3, null);
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new AnonymousClass2(null, this.$this_runCatching$inlined$1), 3, null);
            this.L$0 = deferredAsync$default2;
            this.label = 1;
            Object objAwait = deferredAsync$default.await(this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            deferred = deferredAsync$default2;
            obj = objAwait;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                return C49380unU.OLrzqt(obj2, obj);
            }
            deferred = (Deferred) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        this.L$0 = obj;
        this.label = 2;
        Object objAwait2 = deferred.await(this);
        if (objAwait2 == objCopydefault) {
            return objCopydefault;
        }
        obj2 = obj;
        obj = objAwait2;
        return C49380unU.OLrzqt(obj2, obj);
    }

    /* JADX INFO: renamed from: com.okinc.find_ui.ranking.stock.viewmodel.MarketHomeStockContainerViewModel$loadAndSubscribeData$lambda$2$$inlined$executeAsyncTasks$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends TickersData>>, Object> {
        final /* synthetic */ MarketHomeStockContainerViewModel $this_runCatching$inlined;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Continuation continuation, MarketHomeStockContainerViewModel marketHomeStockContainerViewModel) {
            super(2, continuation);
            this.$this_runCatching$inlined = marketHomeStockContainerViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(continuation, this.$this_runCatching$inlined);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends TickersData>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C40430qVo c40430qVo = this.$this_runCatching$inlined.KWHzl;
                C40429qVn c40429qVn = new C40429qVn(null, C56402yEa.EZpvd("USDT"), false, 4, null);
                this.label = 1;
                obj = c40430qVo.EZpvd(c40429qVn, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return obj;
        }
    }
}
