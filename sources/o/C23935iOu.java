package o;

import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iOu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23935iOu {
    public static FragmentActivity KWHzl;
    public static C23936iOv copydefault;
    public static final C23935iOu OLrzqt = new C23935iOu();
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ() {
        copydefault = null;
        KWHzl = null;
    }

    private C23935iOu() {
    }

    public final C23936iOv OLrzqt(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        if (!Intrinsics.EZpvd(KWHzl, fragmentActivity)) {
            copydefault = null;
            KWHzl = fragmentActivity;
        }
        if (copydefault == null) {
            copydefault = new C23936iOv(fragmentActivity, ((InterfaceC23937iOw) C58114yvF.KWHzl(fragmentActivity, InterfaceC23937iOw.class)).AEQbTJ());
        }
        C23936iOv c23936iOv = copydefault;
        Intrinsics.copydefault(c23936iOv);
        return c23936iOv;
    }
}
