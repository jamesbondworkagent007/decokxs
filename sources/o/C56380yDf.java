package o;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yDf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56380yDf<T, R> extends AbstractC56383yDi<T, R> implements Continuation<R> {
    public yHO<? super AbstractC56383yDi<?, ?>, java.lang.Object, ? super Continuation<java.lang.Object>, ? extends java.lang.Object> AEQbTJ;
    public java.lang.Object EZpvd;
    public Continuation<java.lang.Object> KWHzl;
    public java.lang.Object OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull java.lang.Object obj) {
        this.KWHzl = null;
        this.OLrzqt = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.yHO<? super o.yDi<T, R>, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C56380yDf(@NotNull yHO<? super AbstractC56383yDi<T, R>, ? super T, ? super Continuation<? super R>, ? extends java.lang.Object> yho, T t) {
        super(null);
        Intrinsics.checkNotNullParameter(yho, "");
        this.AEQbTJ = yho;
        this.EZpvd = t;
        Intrinsics.copydefault(this, "");
        this.KWHzl = this;
        this.OLrzqt = C56382yDh.copydefault;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // o.AbstractC56383yDi
    public java.lang.Object copydefault(T t, @NotNull Continuation<? super R> continuation) {
        Intrinsics.copydefault(continuation, "");
        this.KWHzl = continuation;
        this.EZpvd = t;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        if (objCopydefault == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objCopydefault;
    }

    public final R copydefault() throws java.lang.Throwable {
        while (true) {
            R r = (R) this.OLrzqt;
            Continuation<java.lang.Object> continuation = this.KWHzl;
            if (continuation == null) {
                C56391yDq.AEQbTJ(r);
                return r;
            }
            if (Result.m7379equalsimpl0(C56382yDh.copydefault, r)) {
                try {
                    yHO<? super AbstractC56383yDi<?, ?>, java.lang.Object, ? super Continuation<java.lang.Object>, ? extends java.lang.Object> yho = this.AEQbTJ;
                    java.lang.Object obj = this.EZpvd;
                    java.lang.Object objCopydefault = !(yho instanceof BaseContinuationImpl) ? C56441yFm.copydefault(yho, this, obj, continuation) : ((yHO) C56532yIw.KWHzl(yho, 3)).invoke(this, obj, continuation);
                    if (objCopydefault != C56442yFn.copydefault()) {
                        Result.Application application = Result.Companion;
                        continuation.resumeWith(Result.m7377constructorimpl(objCopydefault));
                    }
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    continuation.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(th)));
                }
            } else {
                this.OLrzqt = C56382yDh.copydefault;
                continuation.resumeWith(r);
            }
        }
    }
}
