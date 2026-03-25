package com.okinc.cruilib.compose.library.reorderable;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.mEA;
import o.yHO;

/* JADX INFO: loaded from: classes23.dex */
public final class ReorderableItemScopeImpl$draggableHandle$1$4$1 extends SuspendLambda implements yHO<CoroutineScope, Float, Continuation<? super Unit>, Object> {
    final /* synthetic */ yHO<CoroutineScope, Float, Continuation<? super Unit>, Object> $onDragStopped;
    /* synthetic */ float F$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ mEA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yHO<? super kotlinx.coroutines.CoroutineScope, ? super java.lang.Float, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReorderableItemScopeImpl$draggableHandle$1$4$1(mEA mea, yHO<? super CoroutineScope, ? super Float, ? super Continuation<? super Unit>, ? extends Object> yho, Continuation<? super ReorderableItemScopeImpl$draggableHandle$1$4$1> continuation) {
        super(3, continuation);
        this.this$0 = mea;
        this.$onDragStopped = yho;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(CoroutineScope coroutineScope, Float f, Continuation<? super Unit> continuation) {
        return invoke(coroutineScope, f.floatValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(CoroutineScope coroutineScope, float f, Continuation<? super Unit> continuation) {
        ReorderableItemScopeImpl$draggableHandle$1$4$1 reorderableItemScopeImpl$draggableHandle$1$4$1 = new ReorderableItemScopeImpl$draggableHandle$1$4$1(this.this$0, this.$onDragStopped, continuation);
        reorderableItemScopeImpl$draggableHandle$1$4$1.L$0 = coroutineScope;
        reorderableItemScopeImpl$draggableHandle$1$4$1.F$0 = f;
        return reorderableItemScopeImpl$draggableHandle$1$4$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            float f = this.F$0;
            this.this$0.copydefault.isConnected();
            yHO<CoroutineScope, Float, Continuation<? super Unit>, Object> yho = this.$onDragStopped;
            Float fOLrzqt = C56443yFo.OLrzqt(f);
            this.label = 1;
            if (yho.invoke(coroutineScope, fOLrzqt, this) == objCopydefault) {
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
