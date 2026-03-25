package o;

import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uzg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50028uzg {
    public static final C50028uzg copydefault = new C50028uzg();

    private C50028uzg() {
    }

    public final void KWHzl(@NotNull android.content.Context context, long j) {
        Intrinsics.checkNotNullParameter(context, "");
        if (Build.VERSION.SDK_INT >= 26) {
            java.lang.Object systemService = context.getSystemService("vibrator");
            Intrinsics.copydefault(systemService, "");
            ((android.os.Vibrator) systemService).vibrate(android.os.VibrationEffect.createOneShot(j, -1));
        } else {
            java.lang.Object systemService2 = context.getSystemService("vibrator");
            Intrinsics.copydefault(systemService2, "");
            ((android.os.Vibrator) systemService2).vibrate(j);
        }
    }

    public final void OLrzqt(@NotNull android.content.Context context, long j) {
        Intrinsics.checkNotNullParameter(context, "");
        InterfaceC46554tYq interfaceC46554tYq = (InterfaceC46554tYq) C43251rlk.OLrzqt(InterfaceC46554tYq.class);
        if (interfaceC46554tYq == null || !interfaceC46554tYq.copydefault()) {
            return;
        }
        KWHzl(context, j);
    }
}
