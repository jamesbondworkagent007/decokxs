package o;

import com.okinc.base.thread.TPM;
import com.okinc.base.thread.pool.PoolType;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aVG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractCallableC6746aVG<T> implements Callable<T> {
    public final TPM.Application AEQbTJ;
    public final long AYXKKw;
    public final TPM.Priority AhwBna;
    public final AtomicBoolean OLrzqt;
    public final AtomicReference<Future<T>> copydefault;
    public final PoolType djBIcL;
    public final java.lang.String valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public static final AtomicLong EZpvd = new AtomicLong(1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PoolType EZpvd() {
        return this.djBIcL;
    }

    public void KWHzl() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TPM.Priority copydefault() {
        return this.AhwBna;
    }

    public boolean gEmmrt() {
        return true;
    }

    public AbstractCallableC6746aVG(@NotNull TPM.Application application, @NotNull java.lang.String str, @NotNull PoolType poolType, @NotNull TPM.Priority priority) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(poolType, "");
        Intrinsics.checkNotNullParameter(priority, "");
        this.AEQbTJ = application;
        this.valueOf = str;
        this.djBIcL = poolType;
        this.AhwBna = priority;
        this.AYXKKw = java.lang.System.currentTimeMillis();
        this.OLrzqt = new AtomicBoolean(false);
        this.copydefault = new AtomicReference<>(null);
    }

    public final void OLrzqt(@NotNull Future<T> future) {
        Intrinsics.checkNotNullParameter(future, "");
        this.copydefault.set(future);
        if (this.OLrzqt.get()) {
            future.cancel(true);
        }
    }

    public java.lang.String OLrzqt() {
        return "[" + this.AEQbTJ.EZpvd() + "_" + EZpvd.getAndIncrement() + "]";
    }

    public java.lang.String toString() {
        return OLrzqt() + "[" + this.djBIcL + "_" + this.AhwBna + "][" + this.valueOf + "]";
    }

    /* JADX INFO: renamed from: o.aVG$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aVG.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ AbstractCallableC6746aVG create$default(ActionBar actionBar, TPM.Application application, java.lang.String str, PoolType poolType, TPM.Priority priority, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            java.lang.String str2 = str;
            if ((i & 4) != 0) {
                poolType = PoolType.IO;
            }
            PoolType poolType2 = poolType;
            if ((i & 8) != 0) {
                priority = TPM.Priority.NORMAL;
            }
            return actionBar.EZpvd(application, str2, poolType2, priority, function0);
        }

        /* JADX INFO: renamed from: o.aVG$ActionBar$Application */
        public static final class Application extends AbstractCallableC6746aVG<T> {
            public final /* synthetic */ Function0<T> gEmmrt;

            /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function0<? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Application(TPM.Application application, java.lang.String str, PoolType poolType, TPM.Priority priority, Function0<? extends T> function0) {
                super(application, str, poolType, priority);
                this.gEmmrt = function0;
            }

            @Override // java.util.concurrent.Callable
            public T call() {
                return this.gEmmrt.invoke();
            }
        }

        public final <T> AbstractCallableC6746aVG<T> EZpvd(@NotNull TPM.Application application, @NotNull java.lang.String str, @NotNull PoolType poolType, @NotNull TPM.Priority priority, @NotNull Function0<? extends T> function0) {
            Intrinsics.checkNotNullParameter(application, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(poolType, "");
            Intrinsics.checkNotNullParameter(priority, "");
            Intrinsics.checkNotNullParameter(function0, "");
            return new Application(application, str, poolType, priority, function0);
        }
    }
}
