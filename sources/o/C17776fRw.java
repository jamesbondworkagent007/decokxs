package o;

import com.okinc.business.defi.wallet.switchComponent.utils.CacheOnSuccess$getOrAwait$2;
import com.okinc.business.defi.wallet.switchComponent.utils.CacheOnSuccess$safeAwait$1;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fRw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17776fRw<T> {
    public volatile Deferred<? extends T> AEQbTJ;
    public final Mutex EZpvd;
    public final Function1<Continuation<? super T>, java.lang.Object> KWHzl;
    public final Function1<Continuation<? super T>, java.lang.Object> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt() {
        this.AEQbTJ = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public C17776fRw(Function1<? super Continuation<? super T>, ? extends java.lang.Object> function1, @NotNull Function1<? super Continuation<? super T>, ? extends java.lang.Object> function12) {
        Intrinsics.checkNotNullParameter(function12, "");
        this.OLrzqt = function1;
        this.KWHzl = function12;
        this.EZpvd = MutexKt.Mutex$default(false, 1, null);
    }

    public final java.lang.Object copydefault(@NotNull Continuation<? super T> continuation) {
        return SupervisorKt.supervisorScope(new CacheOnSuccess$getOrAwait$2(this, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d A[Catch: all -> 0x00b0, TryCatch #0 {all -> 0x00b0, blocks: (B:33:0x0085, B:35:0x008d, B:36:0x008f), top: B:50:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(Deferred<? extends T> deferred, Continuation<? super T> continuation) throws java.lang.Throwable {
        CacheOnSuccess$safeAwait$1 cacheOnSuccess$safeAwait$1;
        C17776fRw<T> c17776fRw;
        java.lang.Throwable th;
        Mutex mutex;
        Deferred<? extends T> deferred2;
        Mutex mutex2;
        Function1<Continuation<? super T>, java.lang.Object> function1;
        if (continuation instanceof CacheOnSuccess$safeAwait$1) {
            cacheOnSuccess$safeAwait$1 = (CacheOnSuccess$safeAwait$1) continuation;
            int i = cacheOnSuccess$safeAwait$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cacheOnSuccess$safeAwait$1.label = i - Integer.MIN_VALUE;
            } else {
                cacheOnSuccess$safeAwait$1 = new CacheOnSuccess$safeAwait$1(this, continuation);
            }
        }
        java.lang.Object objAwait = cacheOnSuccess$safeAwait$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = cacheOnSuccess$safeAwait$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwait);
                try {
                    cacheOnSuccess$safeAwait$1.L$0 = this;
                    cacheOnSuccess$safeAwait$1.L$1 = deferred;
                    cacheOnSuccess$safeAwait$1.label = 1;
                    objAwait = deferred.await(cacheOnSuccess$safeAwait$1);
                    return objAwait == objCopydefault ? objCopydefault : objAwait;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    c17776fRw = this;
                    th = th;
                    mutex = c17776fRw.EZpvd;
                    cacheOnSuccess$safeAwait$1.L$0 = c17776fRw;
                    cacheOnSuccess$safeAwait$1.L$1 = deferred;
                    cacheOnSuccess$safeAwait$1.L$2 = th;
                    cacheOnSuccess$safeAwait$1.L$3 = mutex;
                    cacheOnSuccess$safeAwait$1.label = 2;
                    if (mutex.lock(null, cacheOnSuccess$safeAwait$1) != objCopydefault) {
                    }
                }
            } else {
                if (i2 == 1) {
                    deferred = (Deferred) cacheOnSuccess$safeAwait$1.L$1;
                    C17776fRw<T> c17776fRw2 = (C17776fRw) cacheOnSuccess$safeAwait$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(objAwait);
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        c17776fRw = c17776fRw2;
                        th = th;
                        mutex = c17776fRw.EZpvd;
                        cacheOnSuccess$safeAwait$1.L$0 = c17776fRw;
                        cacheOnSuccess$safeAwait$1.L$1 = deferred;
                        cacheOnSuccess$safeAwait$1.L$2 = th;
                        cacheOnSuccess$safeAwait$1.L$3 = mutex;
                        cacheOnSuccess$safeAwait$1.label = 2;
                        if (mutex.lock(null, cacheOnSuccess$safeAwait$1) != objCopydefault) {
                            return objCopydefault;
                        }
                        deferred2 = deferred;
                        mutex2 = mutex;
                        if (Intrinsics.EZpvd(c17776fRw.AEQbTJ, deferred2)) {
                        }
                        Unit unit = Unit.INSTANCE;
                        mutex2.unlock(null);
                        if (th instanceof CancellationException) {
                            throw th;
                        }
                        throw th;
                    }
                }
                if (i2 != 2) {
                    if (i2 == 3) {
                        C56391yDq.AEQbTJ(objAwait);
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) cacheOnSuccess$safeAwait$1.L$3;
                th = (java.lang.Throwable) cacheOnSuccess$safeAwait$1.L$2;
                deferred2 = (Deferred) cacheOnSuccess$safeAwait$1.L$1;
                c17776fRw = (C17776fRw) cacheOnSuccess$safeAwait$1.L$0;
                C56391yDq.AEQbTJ(objAwait);
            }
            if (Intrinsics.EZpvd(c17776fRw.AEQbTJ, deferred2)) {
                c17776fRw.AEQbTJ = null;
            }
            Unit unit2 = Unit.INSTANCE;
            mutex2.unlock(null);
            if ((th instanceof CancellationException) || (function1 = c17776fRw.OLrzqt) == null) {
                throw th;
            }
            cacheOnSuccess$safeAwait$1.L$0 = null;
            cacheOnSuccess$safeAwait$1.L$1 = null;
            cacheOnSuccess$safeAwait$1.L$2 = null;
            cacheOnSuccess$safeAwait$1.L$3 = null;
            cacheOnSuccess$safeAwait$1.label = 3;
            objAwait = function1.invoke(cacheOnSuccess$safeAwait$1);
            return objAwait == objCopydefault ? objCopydefault : objAwait;
        } catch (java.lang.Throwable th4) {
            mutex2.unlock(null);
            throw th4;
        }
    }
}
