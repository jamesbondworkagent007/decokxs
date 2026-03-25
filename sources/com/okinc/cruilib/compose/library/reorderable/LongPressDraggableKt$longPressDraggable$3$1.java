package com.okinc.cruilib.compose.library.reorderable;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.okinc.cruilib.compose.library.reorderable.LongPressDraggableKt$longPressDraggable$3$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class LongPressDraggableKt$longPressDraggable$3$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.BooleanRef $dragStarted;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;
    final /* synthetic */ Function1<Offset, Unit> $onDragStarted;
    final /* synthetic */ Function0<Unit> $onDragStopped;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LongPressDraggableKt$longPressDraggable$3$1(boolean z, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Ref.BooleanRef booleanRef, Function1<? super Offset, Unit> function1, Function0<Unit> function0, Continuation<? super LongPressDraggableKt$longPressDraggable$3$1> continuation) {
        super(2, continuation);
        this.$enabled = z;
        this.$onDrag = function2;
        this.$dragStarted = booleanRef;
        this.$onDragStarted = function1;
        this.$onDragStopped = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LongPressDraggableKt$longPressDraggable$3$1 longPressDraggableKt$longPressDraggable$3$1 = new LongPressDraggableKt$longPressDraggable$3$1(this.$enabled, this.$onDrag, this.$dragStarted, this.$onDragStarted, this.$onDragStopped, continuation);
        longPressDraggableKt$longPressDraggable$3$1.L$0 = obj;
        return longPressDraggableKt$longPressDraggable$3$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((LongPressDraggableKt$longPressDraggable$3$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            if (this.$enabled) {
                final Ref.BooleanRef booleanRef = this.$dragStarted;
                final Function1<Offset, Unit> function1 = this.$onDragStarted;
                Function1 function12 = new Function1() { // from class: o.mEp
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return LongPressDraggableKt$longPressDraggable$3$1.invokeSuspend$lambda$0(booleanRef, function1, (Offset) obj2);
                    }
                };
                final Ref.BooleanRef booleanRef2 = this.$dragStarted;
                final Function0<Unit> function0 = this.$onDragStopped;
                Function0 function02 = new Function0() { // from class: o.mEq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return LongPressDraggableKt$longPressDraggable$3$1.invokeSuspend$lambda$1(booleanRef2, function0);
                    }
                };
                final Ref.BooleanRef booleanRef3 = this.$dragStarted;
                final Function0<Unit> function03 = this.$onDragStopped;
                Function0 function04 = new Function0() { // from class: o.mEu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return LongPressDraggableKt$longPressDraggable$3$1.invokeSuspend$lambda$2(booleanRef3, function03);
                    }
                };
                Function2<PointerInputChange, Offset, Unit> function2 = this.$onDrag;
                this.label = 1;
                if (DragGestureDetectorKt.detectDragGesturesAfterLongPress(pointerInputScope, function12, function02, function04, function2, this) == objCopydefault) {
                    return objCopydefault;
                }
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
    public static final Unit invokeSuspend$lambda$0(Ref.BooleanRef booleanRef, Function1 function1, Offset offset) {
        booleanRef.element = true;
        function1.invoke(offset);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(Ref.BooleanRef booleanRef, Function0 function0) {
        if (booleanRef.element) {
            function0.invoke();
        }
        booleanRef.element = false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(Ref.BooleanRef booleanRef, Function0 function0) {
        if (booleanRef.element) {
            function0.invoke();
        }
        booleanRef.element = false;
        return Unit.INSTANCE;
    }
}
