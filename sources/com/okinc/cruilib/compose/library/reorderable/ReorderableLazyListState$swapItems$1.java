package com.okinc.cruilib.compose.library.reorderable;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.mEL;

/* JADX INFO: loaded from: classes23.dex */
public final class ReorderableLazyListState$swapItems$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListItemInfo $draggingItem;
    final /* synthetic */ Integer $scrollToIndex;
    final /* synthetic */ LazyListItemInfo $targetItem;
    int label;
    final /* synthetic */ mEL this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderableLazyListState$swapItems$1(mEL mel, Integer num, LazyListItemInfo lazyListItemInfo, LazyListItemInfo lazyListItemInfo2, Continuation<? super ReorderableLazyListState$swapItems$1> continuation) {
        super(2, continuation);
        this.this$0 = mel;
        this.$scrollToIndex = num;
        this.$draggingItem = lazyListItemInfo;
        this.$targetItem = lazyListItemInfo2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReorderableLazyListState$swapItems$1(this.this$0, this.$scrollToIndex, this.$draggingItem, this.$targetItem, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReorderableLazyListState$swapItems$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            LazyListState lazyListState = this.this$0.ejfBZ;
            int iIntValue = this.$scrollToIndex.intValue();
            int firstVisibleItemScrollOffset = this.this$0.ejfBZ.getFirstVisibleItemScrollOffset();
            this.label = 1;
            if (lazyListState.scrollToItem(iIntValue, firstVisibleItemScrollOffset, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        ((Function2) this.this$0.gEmmrt.getValue()).invoke(this.$draggingItem, this.$targetItem);
        return Unit.INSTANCE;
    }
}
