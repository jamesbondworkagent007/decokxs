package o;

import aws.smithy.kotlin.runtime.util.LazyAsyncValueImpl$get$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class HF<T> implements HH<T> {
    public java.lang.Object AEQbTJ;
    public final Mutex KWHzl;
    public Function1<? super Continuation<? super T>, ? extends java.lang.Object> OLrzqt;

    public HF(@NotNull Function1<? super Continuation<? super T>, ? extends java.lang.Object> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = MutexKt.Mutex$default(false, 1, null);
        this.OLrzqt = function1;
        this.AEQbTJ = HO.EZpvd;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:35:0x0023 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlinx.coroutines.sync.Mutex] */
    @Override // o.HH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Continuation<? super T> continuation) throws java.lang.Throwable {
        LazyAsyncValueImpl$get$1 lazyAsyncValueImpl$get$1;
        HF<T> hf;
        Mutex mutex;
        HF<T> hf2;
        HF<T> hf3;
        Mutex mutex2;
        if (continuation instanceof LazyAsyncValueImpl$get$1) {
            lazyAsyncValueImpl$get$1 = (LazyAsyncValueImpl$get$1) continuation;
            int i = lazyAsyncValueImpl$get$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                lazyAsyncValueImpl$get$1.label = i - Integer.MIN_VALUE;
            } else {
                lazyAsyncValueImpl$get$1 = new LazyAsyncValueImpl$get$1(this, continuation);
            }
        }
        java.lang.Object objInvoke = lazyAsyncValueImpl$get$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        ?? r2 = lazyAsyncValueImpl$get$1.label;
        try {
            if (r2 == 0) {
                C56391yDq.AEQbTJ(objInvoke);
                Mutex mutex3 = this.KWHzl;
                lazyAsyncValueImpl$get$1.L$0 = this;
                lazyAsyncValueImpl$get$1.L$1 = mutex3;
                lazyAsyncValueImpl$get$1.label = 1;
                if (mutex3.lock(null, lazyAsyncValueImpl$get$1) == objCopydefault) {
                    return objCopydefault;
                }
                hf = this;
                mutex = mutex3;
            } else {
                if (r2 != 1) {
                    if (r2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hf3 = (HF) lazyAsyncValueImpl$get$1.L$2;
                    Mutex mutex4 = (Mutex) lazyAsyncValueImpl$get$1.L$1;
                    hf2 = (HF) lazyAsyncValueImpl$get$1.L$0;
                    C56391yDq.AEQbTJ(objInvoke);
                    mutex2 = mutex4;
                    hf3.AEQbTJ = objInvoke;
                    hf2.OLrzqt = null;
                    hf = hf2;
                    r2 = mutex2;
                    return hf.AEQbTJ;
                }
                Mutex mutex5 = (Mutex) lazyAsyncValueImpl$get$1.L$1;
                hf = (HF) lazyAsyncValueImpl$get$1.L$0;
                C56391yDq.AEQbTJ(objInvoke);
                mutex = mutex5;
            }
            r2 = mutex;
            if (hf.AEQbTJ == HO.EZpvd) {
                Function1<? super Continuation<? super T>, ? extends java.lang.Object> function1 = hf.OLrzqt;
                Intrinsics.copydefault(function1);
                lazyAsyncValueImpl$get$1.L$0 = hf;
                lazyAsyncValueImpl$get$1.L$1 = mutex;
                lazyAsyncValueImpl$get$1.L$2 = hf;
                lazyAsyncValueImpl$get$1.label = 2;
                objInvoke = function1.invoke(lazyAsyncValueImpl$get$1);
                if (objInvoke == objCopydefault) {
                    return objCopydefault;
                }
                hf2 = hf;
                hf3 = hf2;
                mutex2 = mutex;
                hf3.AEQbTJ = objInvoke;
                hf2.OLrzqt = null;
                hf = hf2;
                r2 = mutex2;
            }
            return hf.AEQbTJ;
        } finally {
            r2.unlock(null);
        }
    }
}
