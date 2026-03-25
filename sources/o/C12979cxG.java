package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cxG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12979cxG<T> {
    public final Function0<Deferred<T>> AEQbTJ;
    public Function1<? super java.lang.Throwable, Unit> EZpvd;
    public Deferred<? extends T> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull Function1<? super java.lang.Throwable, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function0<? extends kotlinx.coroutines.Deferred<? extends T>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C12979cxG(@NotNull Function0<? extends Deferred<? extends T>> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ = function0;
    }

    public final Deferred<T> KWHzl() {
        Deferred<? extends T> deferred = this.OLrzqt;
        if (deferred != null) {
            Intrinsics.copydefault(deferred);
            return deferred;
        }
        EZpvd();
        Deferred<? extends T> deferred2 = this.OLrzqt;
        Intrinsics.copydefault(deferred2);
        return deferred2;
    }

    public final void EZpvd() {
        if (this.OLrzqt != null) {
            return;
        }
        Deferred<T> deferredInvoke = this.AEQbTJ.invoke();
        deferredInvoke.invokeOnCompletion(new Function1() { // from class: o.cxF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12979cxG.KWHzl(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        });
        this.OLrzqt = deferredInvoke;
    }

    public static final Unit KWHzl(C12979cxG c12979cxG, java.lang.Throwable th) {
        Function1<? super java.lang.Throwable, Unit> function1 = c12979cxG.EZpvd;
        if (function1 != null) {
            function1.invoke(th);
        }
        return Unit.INSTANCE;
    }

    public final java.lang.Object EZpvd(@NotNull Continuation<? super T> continuation) {
        Deferred<? extends T> deferred;
        if (this.OLrzqt == null) {
            EZpvd();
        }
        Deferred<? extends T> deferred2 = this.OLrzqt;
        if (deferred2 != null && deferred2.isCompleted()) {
            Deferred<? extends T> deferred3 = this.OLrzqt;
            if (deferred3 != null) {
                return deferred3.getCompleted();
            }
            return null;
        }
        Deferred<? extends T> deferred4 = this.OLrzqt;
        Intrinsics.copydefault(deferred4);
        if (deferred4.isCancelled() || (deferred = this.OLrzqt) == null) {
            return null;
        }
        return deferred.await(continuation);
    }
}
