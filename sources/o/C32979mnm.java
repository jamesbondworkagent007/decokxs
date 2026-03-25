package o;

import java.lang.ref.WeakReference;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mnm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32979mnm {
    public static java.lang.String OLrzqt;
    public static android.app.Application copydefault;
    public static final C32979mnm EZpvd = new C32979mnm();
    public static java.util.List<WeakReference<android.app.Activity>> KWHzl = new LinkedList();
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull android.app.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        copydefault = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<WeakReference<android.app.Activity>> KWHzl() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt = str;
    }

    private C32979mnm() {
    }

    public final android.app.Application OLrzqt() {
        android.app.Application application = copydefault;
        if (application != null) {
            return application;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final java.lang.String EZpvd() {
        java.lang.String str = OLrzqt;
        if (str != null) {
            return str;
        }
        Intrinsics.gEmmrt("");
        return null;
    }
}
