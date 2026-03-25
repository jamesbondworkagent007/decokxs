package com.okinc.cruilib.compose.library.reorderable;

import androidx.compose.ui.geometry.Offset;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.mEA;
import o.mEL;
import o.yHO;

/* JADX INFO: loaded from: classes23.dex */
public final class ReorderableItemScopeImpl$draggableHandle$1$3 extends SuspendLambda implements yHO<CoroutineScope, Offset, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.FloatRef $handleOffset;
    final /* synthetic */ Ref.IntRef $handleSize;
    final /* synthetic */ yHO<CoroutineScope, Offset, Continuation<? super Unit>, Object> $onDragStarted;
    /* synthetic */ long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ mEA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHO<? super kotlinx.coroutines.CoroutineScope, ? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReorderableItemScopeImpl$draggableHandle$1$3(yHO<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> yho, Ref.FloatRef floatRef, mEA mea, Ref.IntRef intRef, Continuation<? super ReorderableItemScopeImpl$draggableHandle$1$3> continuation) {
        super(3, continuation);
        this.$onDragStarted = yho;
        this.$handleOffset = floatRef;
        this.this$0 = mea;
        this.$handleSize = intRef;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(CoroutineScope coroutineScope, Offset offset, Continuation<? super Unit> continuation) {
        return m6698invoked4ec7I(coroutineScope, offset.m2920unboximpl(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m6698invoked4ec7I(CoroutineScope coroutineScope, long j, Continuation<? super Unit> continuation) {
        ReorderableItemScopeImpl$draggableHandle$1$3 reorderableItemScopeImpl$draggableHandle$1$3 = new ReorderableItemScopeImpl$draggableHandle$1$3(this.$onDragStarted, this.$handleOffset, this.this$0, this.$handleSize, continuation);
        reorderableItemScopeImpl$draggableHandle$1$3.L$0 = coroutineScope;
        reorderableItemScopeImpl$draggableHandle$1$3.J$0 = j;
        return reorderableItemScopeImpl$draggableHandle$1$3.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.cruilib.compose.library.reorderable.ReorderableItemScopeImpl$draggableHandle$1$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.FloatRef $handleOffset;
        final /* synthetic */ Ref.IntRef $handleSize;
        int label;
        final /* synthetic */ mEA this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.FloatRef floatRef, mEA mea, Ref.IntRef intRef, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$handleOffset = floatRef;
            this.this$0 = mea;
            this.$handleSize = intRef;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$handleOffset, this.this$0, this.$handleSize, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            long j = this.J$0;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.$handleOffset, this.this$0, this.$handleSize, null), 3, null);
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
