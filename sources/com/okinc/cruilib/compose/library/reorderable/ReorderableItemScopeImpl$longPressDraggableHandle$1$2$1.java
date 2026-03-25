package com.okinc.cruilib.compose.library.reorderable;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.mEA;
import o.mEL;

/* JADX INFO: loaded from: classes23.dex */
public final class ReorderableItemScopeImpl$longPressDraggableHandle$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.FloatRef $handleOffset;
    final /* synthetic */ Ref.IntRef $handleSize;
    int label;
    final /* synthetic */ mEA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderableItemScopeImpl$longPressDraggableHandle$1$2$1(Ref.FloatRef floatRef, mEA mea, Ref.IntRef intRef, Continuation<? super ReorderableItemScopeImpl$longPressDraggableHandle$1$2$1> continuation) {
        super(2, continuation);
        this.$handleOffset = floatRef;
        this.this$0 = mea;
        this.$handleSize = intRef;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReorderableItemScopeImpl$longPressDraggableHandle$1$2$1(this.$handleOffset, this.this$0, this.$handleSize, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReorderableItemScopeImpl$longPressDraggableHandle$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            float f = this.$handleOffset.element;
            float fFloatValue = ((Number) this.this$0.OLrzqt.invoke()).floatValue();
            float f2 = this.$handleSize.element / 2.0f;
            mEL mel = this.this$0.copydefault;
            Object obj2 = this.this$0.AEQbTJ;
            this.label = 1;
            if (mel.EZpvd(obj2, (f - fFloatValue) + f2, this) == objCopydefault) {
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
