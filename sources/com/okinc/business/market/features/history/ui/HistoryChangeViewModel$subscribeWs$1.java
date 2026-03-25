package com.okinc.business.market.features.history.ui;

import com.okinc.business.market.features.filter.domain.TokenFilter;
import java.util.Collection;
import java.util.Comparator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C26249jXl;
import o.C26277jYm;
import o.C31199lpX;
import o.C56391yDq;
import o.C56442yFn;
import o.yET;

/* JADX INFO: loaded from: classes7.dex */
public final class HistoryChangeViewModel$subscribeWs$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TokenFilter $filter;
    int label;
    final /* synthetic */ HistoryChangeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryChangeViewModel$subscribeWs$1(HistoryChangeViewModel historyChangeViewModel, TokenFilter tokenFilter, Continuation<? super HistoryChangeViewModel$subscribeWs$1> continuation) {
        super(2, continuation);
        this.this$0 = historyChangeViewModel;
        this.$filter = tokenFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HistoryChangeViewModel$subscribeWs$1(this.this$0, this.$filter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HistoryChangeViewModel$subscribeWs$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowAEQbTJ = C31199lpX.AEQbTJ(FlowKt.onEach(C26249jXl.subscribeWs$default(this.this$0.iwGUEr, this.$filter, false, this.this$0.hDKMBd() ? "dex-market-trade-history-pub" : "dex-market-trade-history", 2, null), new AnonymousClass1(this.this$0, null)), 1000L);
            final HistoryChangeViewModel historyChangeViewModel = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.history.ui.HistoryChangeViewModel$subscribeWs$1.3

                /* JADX INFO: renamed from: com.okinc.business.market.features.history.ui.HistoryChangeViewModel$subscribeWs$1$3$Application */
                public static final class Application<T> implements Comparator {
                    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
                    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(((C26277jYm) t2).gEmmrt());
                        long jLongValue = fieldNames != null ? fieldNames.longValue() : 0L;
                        Long fieldNames2 = StringsKt__StringNumberConversionsKt.getFieldNames(((C26277jYm) t).gEmmrt());
                        return yET.KWHzl(Long.valueOf(jLongValue), Long.valueOf(fieldNames2 != null ? fieldNames2.longValue() : 0L));
                    }
                }

                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                public final Object emit(C26277jYm c26277jYm, Continuation<? super Unit> continuation) {
                    Collection<C26277jYm> collectionValues = historyChangeViewModel.valueOf().values();
                    Intrinsics.checkNotNullExpressionValue(collectionValues, "");
                    Object objEmit = historyChangeViewModel.AYXKKw.emit(CollectionsKt___CollectionsKt.EZpvd(collectionValues, new Application()), continuation);
                    return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowAEQbTJ.collect(flowCollector, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.market.features.history.ui.HistoryChangeViewModel$subscribeWs$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C26277jYm, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ HistoryChangeViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HistoryChangeViewModel historyChangeViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = historyChangeViewModel;
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
        public final Object invoke(C26277jYm c26277jYm, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(c26277jYm, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C26277jYm c26277jYm = (C26277jYm) this.L$0;
                if (c26277jYm == null) {
                    return Unit.INSTANCE;
                }
                this.this$0.valueOf().put(c26277jYm.AEQbTJ(), c26277jYm);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
