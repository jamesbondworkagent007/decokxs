package o;

import android.app.ActivityManager;
import com.engagelab.privates.common.constants.MTCommonConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.tkT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47141tkT {
    public static final int AEQbTJ;
    public static final JSONObject EZpvd;
    public static final C47141tkT copydefault;

    private C47141tkT() {
    }

    static {
        C47141tkT c47141tkT = new C47141tkT();
        copydefault = c47141tkT;
        EZpvd = c47141tkT.EZpvd();
        AEQbTJ = 8;
    }

    public final java.lang.String OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
        Intrinsics.copydefault(systemService, "");
        return java.lang.String.valueOf(((android.app.ActivityManager) systemService).getRunningAppProcesses().size());
    }

    public final java.lang.String AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
        Intrinsics.copydefault(systemService, "");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((android.app.ActivityManager) systemService).getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory ? "1" : "0";
    }

    public final java.lang.String AEQbTJ() {
        return java.lang.String.valueOf(java.lang.Runtime.getRuntime().availableProcessors());
    }

    public final java.lang.String copydefault() {
        return java.lang.String.valueOf(java.lang.Runtime.getRuntime().freeMemory());
    }

    public final java.lang.String KWHzl() {
        return java.lang.String.valueOf(java.lang.Runtime.getRuntime().totalMemory());
    }

    public final java.lang.String EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
        Intrinsics.copydefault(systemService, "");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((android.app.ActivityManager) systemService).getMemoryInfo(memoryInfo);
        return java.lang.String.valueOf(memoryInfo.availMem);
    }

    public final java.lang.String copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
        Intrinsics.copydefault(systemService, "");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((android.app.ActivityManager) systemService).getMemoryInfo(memoryInfo);
        return java.lang.String.valueOf(memoryInfo.totalMem);
    }

    public final JSONObject EZpvd() {
        JSONObject jSONObject = new JSONObject();
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader("/proc/cpuinfo"));
            for (java.lang.String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) line, new java.lang.String[]{":"}, false, 0, 6, (java.lang.Object) null);
                if (listSplit$default.size() == 2) {
                    jSONObject.put(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) listSplit$default.get(0)).toString(), StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) listSplit$default.get(1)).toString());
                }
            }
            bufferedReader.close();
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    public final java.lang.String OLrzqt() {
        java.lang.String strOptString = EZpvd.optString("Hardware", "");
        Intrinsics.checkNotNullExpressionValue(strOptString, "");
        return strOptString;
    }

    public final java.lang.String gEmmrt() {
        java.lang.String strOptString = EZpvd.optString("Processor", "");
        Intrinsics.checkNotNullExpressionValue(strOptString, "");
        return strOptString;
    }
}
