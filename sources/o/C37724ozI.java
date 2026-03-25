package o;

import android.os.Build;
import androidx.core.app.AppOpsManagerCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ozI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37724ozI {
    public static final java.lang.String[] AEQbTJ;
    public static final C37724ozI EZpvd = new C37724ozI();
    public static final int KWHzl;
    public static final java.lang.String[] OLrzqt;
    public static final java.lang.String[] copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        int i = Build.VERSION.SDK_INT;
        OLrzqt = i >= 33 ? new java.lang.String[]{"android.permission.RECORD_AUDIO", "android.permission.READ_PHONE_STATE"} : i >= 29 ? new java.lang.String[]{"android.permission.RECORD_AUDIO", "android.permission.READ_PHONE_STATE", "android.permission.READ_EXTERNAL_STORAGE"} : new java.lang.String[]{"android.permission.RECORD_AUDIO", "android.permission.READ_PHONE_STATE", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        copydefault = i >= 33 ? new java.lang.String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : i >= 29 ? new java.lang.String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.READ_EXTERNAL_STORAGE"} : new java.lang.String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        AEQbTJ = new java.lang.String[]{"android.permission.READ_CONTACTS"};
        KWHzl = 8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String[] AEQbTJ() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String[] EZpvd() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String[] OLrzqt() {
        return OLrzqt;
    }

    private C37724ozI() {
    }

    public static /* synthetic */ boolean requestPermissions$default(C37724ozI c37724ozI, androidx.fragment.app.Fragment fragment, java.lang.String[] strArr, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return c37724ozI.OLrzqt(fragment, strArr, i);
    }

    public final boolean OLrzqt(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String[] strArr, int i) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        if (strArr.length == 0) {
            return true;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            if (!AEQbTJ(fragment.getActivity(), str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() <= 0) {
            return true;
        }
        fragment.requestPermissions((java.lang.String[]) arrayList.toArray(new java.lang.String[0]), i);
        return false;
    }

    public final boolean AEQbTJ(@NotNull android.app.Activity activity, @NotNull java.lang.String[] strArr, int i) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        if (strArr.length == 0) {
            return true;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            if (!AEQbTJ(activity, str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.size();
        activity.requestPermissions((java.lang.String[]) arrayList.toArray(new java.lang.String[0]), i);
        return false;
    }

    public final boolean AEQbTJ(android.content.Context context, java.lang.String str) {
        AppOpsManagerCompat.permissionToOp(str);
        return context != null && context.checkCallingOrSelfPermission(str) == 0;
    }
}
