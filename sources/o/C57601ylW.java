package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ylW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57601ylW implements InterfaceC54816xWj {
    public static android.app.Application AEQbTJ;
    public static final C57601ylW KWHzl = new C57601ylW();
    public static final int OLrzqt = 8;
    public static boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean AEQbTJ() {
        return copydefault;
    }

    @Override // o.InterfaceC54816xWj
    public void KWHzl() {
    }

    private C57601ylW() {
    }

    public static final void OLrzqt(@NotNull android.app.Application application, boolean z) {
        Intrinsics.checkNotNullParameter(application, "");
        AEQbTJ = application;
        copydefault = z;
        C52762wXk.init$default(application, z, 0, 4, null);
        C54819xWm.KWHzl().AEQbTJ(KWHzl);
    }

    public static final android.app.Application OLrzqt() {
        android.app.Application application = AEQbTJ;
        if (application != null) {
            return application;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void OLrzqt(boolean z) {
        C52762wXk.AEQbTJ.KWHzl(z);
    }

    public final boolean AhwBna() {
        return C52762wXk.AEQbTJ.OLrzqt();
    }

    @Override // o.InterfaceC54816xWj
    public void EZpvd() {
        super.EZpvd();
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            C33570myu.KWHzl(activityAEQbTJ);
        }
    }
}
