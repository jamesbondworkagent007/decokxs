package com.okinc.core.common;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import o.C33077mpe;
import o.C56391yDq;
import o.C56441yFm;
import o.C56442yFn;
import o.C56447yFs;
import o.pUU;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes7.dex */
public final class OkRustFutureWrapper$execute$2<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ C33077mpe<T, E> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.mpe<T, ? extends E> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OkRustFutureWrapper$execute$2(C33077mpe<T, ? extends E> c33077mpe, Continuation<? super OkRustFutureWrapper$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = c33077mpe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OkRustFutureWrapper$execute$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
        return ((OkRustFutureWrapper$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C33077mpe<T, E> c33077mpe = this.this$0;
            this.L$0 = c33077mpe;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(this), 1);
            cancellableContinuationImpl.initCancellability();
            try {
                c33077mpe.OLrzqt.invoke(new C33077mpe.ActionBar(c33077mpe, c33077mpe.KWHzl, c33077mpe.AEQbTJ, cancellableContinuationImpl));
                cancellableContinuationImpl.invokeOnCancellation(new TaskDescription(c33077mpe));
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                cancellableContinuationImpl.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(th)));
            }
            obj = cancellableContinuationImpl.getResult();
            if (obj == C56442yFn.copydefault()) {
                C56447yFs.copydefault(this);
            }
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }

    public static final class TaskDescription implements Function1<Throwable, Unit> {
        public final /* synthetic */ C33077mpe<T, E> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.mpe<T, ? extends E> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(C33077mpe<T, ? extends E> c33077mpe) {
            this.AEQbTJ = c33077mpe;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Throwable th) {
            AEQbTJ(th);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(Throwable th) {
            try {
                this.AEQbTJ.copydefault.invoke();
            } catch (Throwable th2) {
                pUU.AEQbTJ("OkRustFutureWrapper", "Exception on cancel", th2);
            }
        }
    }
}
