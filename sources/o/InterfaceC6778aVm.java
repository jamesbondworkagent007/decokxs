package o;

import com.okinc.base.thread.TPM;
import com.okinc.base.thread.pool.PoolType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aVm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC6778aVm {
    public static final TaskDescription Companion = TaskDescription.KWHzl;

    InterfaceExecutorC6747aVH KWHzl(@NotNull TPM.Application application, @NotNull java.lang.String str, @NotNull PoolType poolType, @NotNull TPM.Priority priority);

    /* JADX INFO: renamed from: o.aVm$TaskDescription */
    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription KWHzl = new TaskDescription();

        private TaskDescription() {
        }

        public final InterfaceC6778aVm KWHzl(@NotNull TPM.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            C6780aVo c6780aVo = new C6780aVo(taskDescription, null, null, 6, null);
            c6780aVo.OLrzqt();
            pUU.KWHzl("Monitor.TPM", "Initializing " + taskDescription);
            return c6780aVo;
        }
    }
}
