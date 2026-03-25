package o;

import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zgO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59401zgO<T> extends AbstractC59400zgN<T> implements java.util.Iterator<T>, Continuation<Unit>, InterfaceC56535yIz {
    public int AEQbTJ;
    public Continuation<? super Unit> KWHzl;
    public java.util.Iterator<? extends T> OLrzqt;
    public T copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Continuation<? super Unit> continuation) {
        this.KWHzl = continuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws java.lang.Throwable {
        while (true) {
            int i = this.AEQbTJ;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw copydefault();
                }
                java.util.Iterator<? extends T> it = this.OLrzqt;
                Intrinsics.copydefault(it);
                if (it.hasNext()) {
                    this.AEQbTJ = 2;
                    return true;
                }
                this.OLrzqt = null;
            }
            this.AEQbTJ = 5;
            Continuation<? super Unit> continuation = this.KWHzl;
            Intrinsics.copydefault(continuation);
            this.KWHzl = null;
            Result.Application application = Result.Companion;
            continuation.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // java.util.Iterator
    public T next() throws java.lang.Throwable {
        int i = this.AEQbTJ;
        if (i == 0 || i == 1) {
            return KWHzl();
        }
        if (i == 2) {
            this.AEQbTJ = 1;
            java.util.Iterator<? extends T> it = this.OLrzqt;
            Intrinsics.copydefault(it);
            return it.next();
        }
        if (i != 3) {
            throw copydefault();
        }
        this.AEQbTJ = 0;
        T t = this.copydefault;
        this.copydefault = null;
        return t;
    }

    public final T KWHzl() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    public final java.lang.Throwable copydefault() {
        int i = this.AEQbTJ;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new java.lang.IllegalStateException("Iterator has failed.");
        }
        return new java.lang.IllegalStateException("Unexpected state of the iterator: " + this.AEQbTJ);
    }

    @Override // o.AbstractC59400zgN
    public java.lang.Object KWHzl(T t, @NotNull Continuation<? super Unit> continuation) {
        this.copydefault = t;
        this.AEQbTJ = 3;
        this.KWHzl = continuation;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        if (objCopydefault == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
    }

    @Override // o.AbstractC59400zgN
    public java.lang.Object KWHzl(@NotNull java.util.Iterator<? extends T> it, @NotNull Continuation<? super Unit> continuation) {
        if (!it.hasNext()) {
            return Unit.INSTANCE;
        }
        this.OLrzqt = it;
        this.AEQbTJ = 2;
        this.KWHzl = continuation;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        if (objCopydefault == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull java.lang.Object obj) throws java.lang.Throwable {
        C56391yDq.AEQbTJ(obj);
        this.AEQbTJ = 4;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }
}
