package o;

import com.okinc.ok_kyc_core.service.EopImageInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ruJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C43701ruJ {
    public static boolean AEQbTJ;
    public static java.lang.Integer KWHzl;
    public static final C43701ruJ EZpvd = new C43701ruJ();
    public static java.util.ArrayList<EopImageInfo> copydefault = new java.util.ArrayList<>();
    public static final int OLrzqt = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ() {
        copydefault = null;
        KWHzl = null;
        AEQbTJ = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.util.ArrayList<EopImageInfo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        copydefault = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<EopImageInfo> KWHzl() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.lang.Integer num) {
        KWHzl = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return AEQbTJ;
    }

    private C43701ruJ() {
    }
}
