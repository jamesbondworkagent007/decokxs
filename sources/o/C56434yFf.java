package o;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yFf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56434yFf<T> implements Continuation<T>, CoroutineStackFrame {
    private static final TaskDescription AEQbTJ = new TaskDescription(null);
    public static final AtomicReferenceFieldUpdater<C56434yFf<?>, java.lang.Object> copydefault = AtomicReferenceFieldUpdater.newUpdater(C56434yFf.class, java.lang.Object.class, "result");
    public final Continuation<T> OLrzqt;
    private volatile java.lang.Object result;

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public java.lang.StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.coroutines.Continuation<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C56434yFf(@NotNull Continuation<? super T> continuation, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(continuation, "");
        this.OLrzqt = continuation;
        this.result = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C56434yFf(@NotNull Continuation<? super T> continuation) {
        this(continuation, CoroutineSingletons.UNDECIDED);
        Intrinsics.checkNotNullParameter(continuation, "");
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.OLrzqt.getContext();
    }

    /* JADX INFO: renamed from: o.yFf$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yFf.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull java.lang.Object obj) {
        while (true) {
            java.lang.Object obj2 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
            if (obj2 == coroutineSingletons) {
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(copydefault, this, coroutineSingletons, obj)) {
                    return;
                }
            } else {
                if (obj2 != C56442yFn.copydefault()) {
                    throw new java.lang.IllegalStateException("Already resumed");
                }
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(copydefault, this, C56442yFn.copydefault(), CoroutineSingletons.RESUMED)) {
                    this.OLrzqt.resumeWith(obj);
                    return;
                }
            }
        }
    }

    public final java.lang.Object KWHzl() {
        java.lang.Object obj = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
        if (obj == coroutineSingletons) {
            if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(copydefault, this, coroutineSingletons, C56442yFn.copydefault())) {
                return C56442yFn.copydefault();
            }
            obj = this.result;
        }
        if (obj == CoroutineSingletons.RESUMED) {
            return C56442yFn.copydefault();
        }
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.OLrzqt;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    public java.lang.String toString() {
        return "SafeContinuation for " + this.OLrzqt;
    }
}
