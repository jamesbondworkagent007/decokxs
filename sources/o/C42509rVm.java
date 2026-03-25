package o;

import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rVm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42509rVm {
    public static boolean OLrzqt;
    public static final C42509rVm copydefault = new C42509rVm();
    public static final ConcurrentLinkedQueue<java.lang.String> EZpvd = new ConcurrentLinkedQueue<>();
    public static final int KWHzl = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        OLrzqt = z;
    }

    private C42509rVm() {
    }

    public final void AEQbTJ(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        EZpvd.addAll(list);
    }

    public final void copydefault() {
        EZpvd.clear();
        OLrzqt = false;
    }

    public final int EZpvd() {
        return EZpvd.size();
    }
}
