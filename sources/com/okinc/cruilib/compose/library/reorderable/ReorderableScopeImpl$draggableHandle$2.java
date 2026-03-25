package com.okinc.cruilib.compose.library.reorderable;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.mEQ;
import o.mEV;
import o.yHO;

/* JADX INFO: loaded from: classes23.dex */
public final class ReorderableScopeImpl$draggableHandle$2 extends SuspendLambda implements yHO<CoroutineScope, Float, Continuation<? super Unit>, Object> {
    final /* synthetic */ yHO<CoroutineScope, Float, Continuation<? super Unit>, Object> $onDragStopped;
    /* synthetic */ float F$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ mEV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHO<? super kotlinx.coroutines.CoroutineScope, ? super java.lang.Float, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReorderableScopeImpl$draggableHandle$2(yHO<? super CoroutineScope, ? super Float, ? super Continuation<? super Unit>, ? extends Object> yho, mEV mev, Continuation<? super ReorderableScopeImpl$draggableHandle$2> continuation) {
        super(3, continuation);
        this.$onDragStopped = yho;
        this.this$0 = mev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(CoroutineScope coroutineScope, Float f, Continuation<? super Unit> continuation) {
        return invoke(coroutineScope, f.floatValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(CoroutineScope coroutineScope, float f, Continuation<? super Unit> continuation) {
        ReorderableScopeImpl$draggableHandle$2 reorderableScopeImpl$draggableHandle$2 = new ReorderableScopeImpl$draggableHandle$2(this.$onDragStopped, this.this$0, continuation);
        reorderableScopeImpl$draggableHandle$2.L$0 = coroutineScope;
        reorderableScopeImpl$draggableHandle$2.F$0 = f;
        return reorderableScopeImpl$draggableHandle$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.cruilib.compose.library.reorderable.ReorderableScopeImpl$draggableHandle$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ float $velocity;
        int label;
        final /* synthetic */ mEV this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(mEV mev, float f, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = mev;
            this.$velocity = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$velocity, continuation);
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
                mEQ meq = this.this$0.KWHzl;
                int i2 = this.this$0.EZpvd;
                float f = this.$velocity;
                this.label = 1;
                if (meq.OLrzqt(i2, f, this) == objCopydefault) {
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
            float f = this.F$0;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.this$0, f, null), 3, null);
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
