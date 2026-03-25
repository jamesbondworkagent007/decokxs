package o;

import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mkX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C32805mkX {
    public static boolean OLrzqt;
    public static final C32805mkX EZpvd = new C32805mkX();
    public static final int copydefault = 8;

    private C32805mkX() {
    }

    public final void OLrzqt(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (SPUtils.getBoolean("sp_root_check_not_remind", false) || OLrzqt) {
            return;
        }
        OLrzqt = true;
        C34702nhN.OLrzqt.copydefault();
    }
}
