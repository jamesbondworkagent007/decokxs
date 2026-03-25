package o;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sNd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C44366sNd implements InterfaceC44367sNe {
    public final android.content.Context copydefault;

    @yCM
    public C44366sNd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = context;
    }

    @Override // o.InterfaceC44367sNe
    public void OLrzqt() {
        java.lang.Object systemService = this.copydefault.getSystemService(RemoteMessageConst.NOTIFICATION);
        Intrinsics.copydefault(systemService, "");
        ((android.app.NotificationManager) systemService).cancelAll();
    }

    @Override // o.InterfaceC44367sNe
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ(C33129mqd.AhwBna(str));
    }

    public final void AEQbTJ(int i) {
        java.lang.Object systemService = this.copydefault.getSystemService(RemoteMessageConst.NOTIFICATION);
        Intrinsics.copydefault(systemService, "");
        ((android.app.NotificationManager) systemService).cancel(i);
    }
}
