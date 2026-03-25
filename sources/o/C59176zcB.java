package o;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zcB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59176zcB extends C59225zcy {
    public final Function1<java.lang.InterruptedException, Unit> AEQbTJ;
    public final java.lang.Runnable copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.InterruptedException, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C59176zcB(@NotNull Lock lock, @NotNull java.lang.Runnable runnable, @NotNull Function1<? super java.lang.InterruptedException, Unit> function1) {
        super(lock);
        Intrinsics.checkNotNullParameter(lock, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = runnable;
        this.AEQbTJ = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C59176zcB(@NotNull java.lang.Runnable runnable, @NotNull Function1<? super java.lang.InterruptedException, Unit> function1) {
        this(new ReentrantLock(), runnable, function1);
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(function1, "");
    }

    @Override // o.C59225zcy, o.InterfaceC59178zcD
    public void EZpvd() {
        while (!copydefault().tryLock(50L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
            try {
                this.copydefault.run();
            } catch (java.lang.InterruptedException e) {
                this.AEQbTJ.invoke(e);
                return;
            }
        }
    }
}
