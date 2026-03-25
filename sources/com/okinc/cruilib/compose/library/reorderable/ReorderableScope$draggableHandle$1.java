package com.okinc.cruilib.compose.library.reorderable;

import androidx.compose.ui.geometry.Offset;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes23.dex */
public final class ReorderableScope$draggableHandle$1 extends SuspendLambda implements yHO<CoroutineScope, Offset, Continuation<? super Unit>, Object> {
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ReorderableScope$draggableHandle$1(Continuation<? super ReorderableScope$draggableHandle$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(CoroutineScope coroutineScope, Offset offset, Continuation<? super Unit> continuation) {
        return m6699invoked4ec7I(coroutineScope, offset.m2920unboximpl(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m6699invoked4ec7I(CoroutineScope coroutineScope, long j, Continuation<? super Unit> continuation) {
        return new ReorderableScope$draggableHandle$1(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        return Unit.INSTANCE;
    }
}
