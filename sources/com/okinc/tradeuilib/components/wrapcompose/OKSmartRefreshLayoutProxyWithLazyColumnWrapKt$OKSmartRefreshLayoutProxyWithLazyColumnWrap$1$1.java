package com.okinc.tradeuilib.components.wrapcompose;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C49556uql;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes24.dex */
public final class OKSmartRefreshLayoutProxyWithLazyColumnWrapKt$OKSmartRefreshLayoutProxyWithLazyColumnWrap$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $canLoadMoreFlag$delegate;
    final /* synthetic */ MutableState<Boolean> $canRefreshFlag$delegate;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ int $totalItemSize;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKSmartRefreshLayoutProxyWithLazyColumnWrapKt$OKSmartRefreshLayoutProxyWithLazyColumnWrap$1$1(LazyListState lazyListState, int i, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super OKSmartRefreshLayoutProxyWithLazyColumnWrapKt$OKSmartRefreshLayoutProxyWithLazyColumnWrap$1$1> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$totalItemSize = i;
        this.$canRefreshFlag$delegate = mutableState;
        this.$canLoadMoreFlag$delegate = mutableState2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKSmartRefreshLayoutProxyWithLazyColumnWrapKt$OKSmartRefreshLayoutProxyWithLazyColumnWrap$1$1(this.$listState, this.$totalItemSize, this.$canRefreshFlag$delegate, this.$canLoadMoreFlag$delegate, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKSmartRefreshLayoutProxyWithLazyColumnWrapKt$OKSmartRefreshLayoutProxyWithLazyColumnWrap$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final LazyListState lazyListState = this.$listState;
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: o.uqp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return lazyListState.getLayoutInfo();
                }
            });
            final LazyListState lazyListState2 = this.$listState;
            final int i2 = this.$totalItemSize;
            final MutableState<Boolean> mutableState = this.$canRefreshFlag$delegate;
            final MutableState<Boolean> mutableState2 = this.$canLoadMoreFlag$delegate;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.tradeuilib.components.wrapcompose.OKSmartRefreshLayoutProxyWithLazyColumnWrapKt$OKSmartRefreshLayoutProxyWithLazyColumnWrap$1$1.5
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public final Object emit(LazyListLayoutInfo lazyListLayoutInfo, Continuation<? super Unit> continuation) {
                    LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt___CollectionsKt.firstOrNull(lazyListLayoutInfo.getVisibleItemsInfo());
                    LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) CollectionsKt___CollectionsKt.wlaJM(lazyListLayoutInfo.getVisibleItemsInfo());
                    boolean z = true;
                    C49556uql.copydefault(mutableState, lazyListItemInfo != null && lazyListItemInfo.getIndex() == 0 && lazyListState2.getFirstVisibleItemScrollOffset() == 0);
                    MutableState<Boolean> mutableState3 = mutableState2;
                    int i3 = i2;
                    if (i3 != 0 && (lazyListItemInfo2 == null || lazyListItemInfo2.getIndex() != i3 - 1 || lazyListItemInfo2.getOffset() + lazyListItemInfo2.getSize() > lazyListLayoutInfo.getViewportEndOffset())) {
                        z = false;
                    }
                    C49556uql.AEQbTJ(mutableState3, z);
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
