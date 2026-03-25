package com.okinc.cruilib.compose.library.reorderable;

import androidx.compose.ui.geometry.Offset;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.mEV;
import o.yHO;

/* JADX INFO: loaded from: classes23.dex */
public final class ReorderableScopeImpl$draggableHandle$1 extends SuspendLambda implements yHO<CoroutineScope, Offset, Continuation<? super Unit>, Object> {
    final /* synthetic */ yHO<CoroutineScope, Offset, Continuation<? super Unit>, Object> $onDragStarted;
    /* synthetic */ long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ mEV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yHO<? super kotlinx.coroutines.CoroutineScope, ? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReorderableScopeImpl$draggableHandle$1(mEV mev, yHO<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> yho, Continuation<? super ReorderableScopeImpl$draggableHandle$1> continuation) {
        super(3, continuation);
        this.this$0 = mev;
        this.$onDragStarted = yho;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(CoroutineScope coroutineScope, Offset offset, Continuation<? super Unit> continuation) {
        return m6700invoked4ec7I(coroutineScope, offset.m2920unboximpl(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m6700invoked4ec7I(CoroutineScope coroutineScope, long j, Continuation<? super Unit> continuation) {
        ReorderableScopeImpl$draggableHandle$1 reorderableScopeImpl$draggableHandle$1 = new ReorderableScopeImpl$draggableHandle$1(this.this$0, this.$onDragStarted, continuation);
        reorderableScopeImpl$draggableHandle$1.L$0 = coroutineScope;
        reorderableScopeImpl$draggableHandle$1.J$0 = j;
        return reorderableScopeImpl$draggableHandle$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            long j = this.J$0;
            this.this$0.KWHzl.KWHzl(this.this$0.EZpvd);
            yHO<CoroutineScope, Offset, Continuation<? super Unit>, Object> yho = this.$onDragStarted;
            Offset offsetM2899boximpl = Offset.m2899boximpl(j);
            this.label = 1;
            if (yho.invoke(coroutineScope, offsetM2899boximpl, this) == objCopydefault) {
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
