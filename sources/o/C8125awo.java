package o;

import com.engagelab.privates.push.constants.MTPushConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.awo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8125awo {
    public static final C8125awo OLrzqt = new C8125awo();

    private C8125awo() {
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str) throws java.lang.Throwable {
        java.io.BufferedReader bufferedReader;
        Intrinsics.checkNotNullParameter(str, "");
        java.io.BufferedReader bufferedReader2 = null;
        try {
            java.lang.Process processExec = java.lang.Runtime.getRuntime().exec("getprop " + str);
            Intrinsics.checkNotNullExpressionValue(processExec, "");
            bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(processExec.getInputStream()), 1024);
        } catch (java.lang.Exception unused) {
            bufferedReader = null;
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            java.lang.String line = bufferedReader.readLine();
            Intrinsics.checkNotNullExpressionValue(line, "");
            bufferedReader.close();
            try {
                bufferedReader.close();
            } catch (java.io.IOException unused2) {
            }
            return line;
        } catch (java.lang.Exception unused3) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (java.io.IOException unused4) {
                }
            }
            return null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (java.io.IOException unused5) {
                }
            }
            throw th;
        }
    }

    public final boolean EZpvd() {
        java.lang.String str = android.os.Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(str, "");
        return StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "HUAWEI", false, 2, (java.lang.Object) null);
    }

    public final boolean AEQbTJ() {
        return !android.text.TextUtils.isEmpty(OLrzqt("ro.miui.ui.version.name"));
    }

    public final boolean copydefault() throws java.lang.Throwable {
        java.lang.String strOLrzqt = OLrzqt("ro.build.display.id");
        if (android.text.TextUtils.isEmpty(strOLrzqt)) {
            return false;
        }
        Intrinsics.copydefault((java.lang.Object) strOLrzqt);
        if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) strOLrzqt, (java.lang.CharSequence) "flyme", false, 2, (java.lang.Object) null)) {
            java.lang.String lowerCase = strOLrzqt.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase, (java.lang.CharSequence) "flyme", false, 2, (java.lang.Object) null)) {
                return false;
            }
        }
        return true;
    }

    public final boolean KWHzl() {
        java.lang.String str = android.os.Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(str, "");
        if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "VIVO", false, 2, (java.lang.Object) null)) {
            Intrinsics.checkNotNullExpressionValue(str, "");
            if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) MTPushConstants.Manufacturer.VIVO, false, 2, (java.lang.Object) null)) {
                return false;
            }
        }
        return true;
    }
}
