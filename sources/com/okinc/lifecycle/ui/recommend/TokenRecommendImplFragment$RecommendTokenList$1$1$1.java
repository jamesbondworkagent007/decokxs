package com.okinc.lifecycle.ui.recommend;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes9.dex */
public final class TokenRecommendImplFragment$RecommendTokenList$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $listState;
    int label;
    final /* synthetic */ TokenRecommendImplFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenRecommendImplFragment$RecommendTokenList$1$1$1(LazyListState lazyListState, TokenRecommendImplFragment tokenRecommendImplFragment, Continuation<? super TokenRecommendImplFragment$RecommendTokenList$1$1$1> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.this$0 = tokenRecommendImplFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenRecommendImplFragment$RecommendTokenList$1$1$1(this.$listState, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TokenRecommendImplFragment$RecommendTokenList$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final LazyListState lazyListState = this.$listState;
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: o.pQa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Integer.valueOf(lazyListState.getFirstVisibleItemScrollOffset());
                }
            });
            final TokenRecommendImplFragment tokenRecommendImplFragment = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.lifecycle.ui.recommend.TokenRecommendImplFragment$RecommendTokenList$1$1$1.4
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return copydefault(((Number) obj2).intValue(), continuation);
                }

                public final Object copydefault(int i2, Continuation<? super Unit> continuation) {
                    if (!tokenRecommendImplFragment.copydefault) {
                        tokenRecommendImplFragment.KWHzl().EZpvd();
                        tokenRecommendImplFragment.copydefault = true;
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowSnapshotFlow.collect(flowCollector, this) == objCopydefault) {
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
