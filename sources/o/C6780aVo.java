package o;

import com.okinc.base.thread.TPM;
import com.okinc.base.thread.pool.PoolType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aVo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6780aVo implements InterfaceC6778aVm {
    public final InterfaceC6741aVB EZpvd;
    public final TPM.TaskDescription KWHzl;
    public final InterfaceC6785aVt OLrzqt;

    public C6780aVo(@NotNull TPM.TaskDescription taskDescription, @NotNull InterfaceC6785aVt interfaceC6785aVt, @NotNull InterfaceC6741aVB interfaceC6741aVB) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(interfaceC6785aVt, "");
        Intrinsics.checkNotNullParameter(interfaceC6741aVB, "");
        this.KWHzl = taskDescription;
        this.OLrzqt = interfaceC6785aVt;
        this.EZpvd = interfaceC6741aVB;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C6780aVo(TPM.TaskDescription taskDescription, InterfaceC6785aVt interfaceC6785aVt, InterfaceC6741aVB interfaceC6741aVB, int i, DefaultConstructorMarker defaultConstructorMarker) {
        interfaceC6785aVt = (i & 2) != 0 ? new C6786aVu(taskDescription, null, 2, null) : interfaceC6785aVt;
        this(taskDescription, interfaceC6785aVt, (i & 4) != 0 ? new C6782aVq(interfaceC6785aVt) : interfaceC6741aVB);
    }

    public void OLrzqt() {
        this.OLrzqt.KWHzl();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lcom/okinc/base/thread/TPM$Application;Ljava/lang/String;Lcom/okinc/base/thread/pool/PoolType;Lcom/okinc/base/thread/TPM$Priority;)Lo/aVH; */
    @Override // o.InterfaceC6778aVm
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C6784aVs KWHzl(@NotNull TPM.Application application, @NotNull java.lang.String str, @NotNull PoolType poolType, @NotNull TPM.Priority priority) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(poolType, "");
        Intrinsics.checkNotNullParameter(priority, "");
        return new C6784aVs(application, poolType, priority, this.EZpvd, str);
    }
}
