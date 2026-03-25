package com.okinc.tradingbot.impl.widget.compose;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import com.okinc.tradingbot.impl.widget.compose.PagingListHandlerKt$rememberPagingListHandler$1$1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C56391yDq;
import o.C56442yFn;
import o.wWG;

/* JADX INFO: loaded from: classes19.dex */
public final class PagingListHandlerKt$rememberPagingListHandler$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $buffer;
    final /* synthetic */ State<Function0<Unit>> $currentOnLoadMore$delegate;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ LazyListState $listState;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function0<kotlin.Unit>> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PagingListHandlerKt$rememberPagingListHandler$1$1(boolean z, LazyListState lazyListState, int i, State<? extends Function0<Unit>> state, Continuation<? super PagingListHandlerKt$rememberPagingListHandler$1$1> continuation) {
        super(2, continuation);
        this.$enabled = z;
        this.$listState = lazyListState;
        this.$buffer = i;
        this.$currentOnLoadMore$delegate = state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PagingListHandlerKt$rememberPagingListHandler$1$1(this.$enabled, this.$listState, this.$buffer, this.$currentOnLoadMore$delegate, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PagingListHandlerKt$rememberPagingListHandler$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!this.$enabled) {
                return Unit.INSTANCE;
            }
            final LazyListState lazyListState = this.$listState;
            final int i2 = this.$buffer;
            TaskDescription taskDescription = new TaskDescription(FlowKt.distinctUntilChanged(SnapshotStateKt.snapshotFlow(new Function0() { // from class: o.wWI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(PagingListHandlerKt$rememberPagingListHandler$1$1.invokeSuspend$lambda$0(lazyListState, i2));
                }
            })));
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$currentOnLoadMore$delegate, null);
            this.label = 1;
            if (FlowKt.collectLatest(taskDescription, anonymousClass3, this) == objCopydefault) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(LazyListState lazyListState, int i) {
        LazyListLayoutInfo layoutInfo = lazyListState.getLayoutInfo();
        int totalItemsCount = layoutInfo.getTotalItemsCount();
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt___CollectionsKt.wlaJM(layoutInfo.getVisibleItemsInfo());
        return (lazyListItemInfo == null || totalItemsCount == 0 || (totalItemsCount - 1) - lazyListItemInfo.getIndex() > i) ? false : true;
    }

    public static final class TaskDescription implements Flow<Boolean> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.widget.compose.PagingListHandlerKt$rememberPagingListHandler$1$1$TaskDescription$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                PagingListHandlerKt$rememberPagingListHandler$1$1$invokeSuspend$$inlined$filter$1$2$1 pagingListHandlerKt$rememberPagingListHandler$1$1$invokeSuspend$$inlined$filter$1$2$1;
                if (continuation instanceof PagingListHandlerKt$rememberPagingListHandler$1$1$invokeSuspend$$inlined$filter$1$2$1) {
                    pagingListHandlerKt$rememberPagingListHandler$1$1$invokeSuspend$$inlined$filter$1$2$1 = (PagingListHandlerKt$rememberPagingListHandler$1$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                    int i = pagingListHandlerKt$rememberPagingListHandler$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        pagingListHandlerKt$rememberPagingListHandler$1$1$invokeSuspend$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        pagingListHandlerKt$rememberPagingListHandler$1$1$invokeSuspend$$inlined$filter$1$2$1 = new PagingListHandlerKt$rememberPagingListHandler$1$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    }
                }
                Object obj2 = pagingListHandlerKt$rememberPagingListHandler$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = pagingListHandlerKt$rememberPagingListHandler$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    if (((Boolean) obj).booleanValue()) {
                        pagingListHandlerKt$rememberPagingListHandler$1$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, pagingListHandlerKt$rememberPagingListHandler$1$1$invokeSuspend$$inlined$filter$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public TaskDescription(Flow flow) {
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
            Object objCollect = this.AEQbTJ.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.widget.compose.PagingListHandlerKt$rememberPagingListHandler$1$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final /* synthetic */ State<Function0<Unit>> $currentOnLoadMore$delegate;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function0<kotlin.Unit>> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(State<? extends Function0<Unit>> state, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$currentOnLoadMore$delegate = state;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$currentOnLoadMore$delegate, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                wWG.EZpvd(this.$currentOnLoadMore$delegate).invoke();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
