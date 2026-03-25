package o;

import com.okinc.base.internal.thread.executor.TaskExecutorImpl$execute$1;
import com.okinc.base.thread.TPM;
import com.okinc.base.thread.pool.PoolType;
import java.util.concurrent.Future;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aVs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6784aVs implements InterfaceExecutorC6747aVH {
    public final InterfaceC6741aVB AEQbTJ;
    public final TPM.Priority EZpvd;
    public final java.lang.String KWHzl;
    public final PoolType OLrzqt;
    public final TPM.Application copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TPM.Priority AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PoolType EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TPM.Application KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String copydefault() {
        return this.KWHzl;
    }

    public C6784aVs(@NotNull TPM.Application application, @NotNull PoolType poolType, @NotNull TPM.Priority priority, @NotNull InterfaceC6741aVB interfaceC6741aVB, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(poolType, "");
        Intrinsics.checkNotNullParameter(priority, "");
        Intrinsics.checkNotNullParameter(interfaceC6741aVB, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = application;
        this.OLrzqt = poolType;
        this.EZpvd = priority;
        this.AEQbTJ = interfaceC6741aVB;
        this.KWHzl = str;
    }

    public <T> Future<T> OLrzqt(@NotNull AbstractCallableC6746aVG<T> abstractCallableC6746aVG) {
        Intrinsics.checkNotNullParameter(abstractCallableC6746aVG, "");
        return this.AEQbTJ.copydefault(abstractCallableC6746aVG);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull java.lang.Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "");
        OLrzqt(AbstractCallableC6746aVG.Companion.EZpvd(KWHzl(), copydefault(), EZpvd(), AEQbTJ(), new TaskExecutorImpl$execute$1(runnable)));
    }
}
