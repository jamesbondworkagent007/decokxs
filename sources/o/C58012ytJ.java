package o;

import com.engagelab.privates.common.constants.MTCommonConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.ytJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C58012ytJ {
    public static final android.app.ActivityManager AEQbTJ;
    public static final int EZpvd;
    public static final C58012ytJ KWHzl = new C58012ytJ();
    public static volatile android.app.Application OLrzqt;
    public static volatile boolean copydefault;
    public static final int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.app.ActivityManager AEQbTJ() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return valueOf;
    }

    private C58012ytJ() {
    }

    static {
        if (!copydefault && !C57911yrO.copydefault()) {
            throw new java.lang.IllegalStateException("Matrix is NOT installed or MemoryInfoFactory is not initialized!!!");
        }
        android.app.Application applicationKWHzl = copydefault ? OLrzqt : C57911yrO.EZpvd().KWHzl();
        java.lang.Object systemService = applicationKWHzl != null ? applicationKWHzl.getSystemService(MTCommonConstants.Lifecycle.KEY_ACTIVITY) : null;
        Intrinsics.copydefault(systemService, "");
        android.app.ActivityManager activityManager = (android.app.ActivityManager) systemService;
        AEQbTJ = activityManager;
        valueOf = activityManager.getMemoryClass();
        EZpvd = activityManager.getLargeMemoryClass();
    }
}
