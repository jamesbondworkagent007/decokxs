package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.nhN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34702nhN {
    public static java.lang.Boolean copydefault;
    public static final C34702nhN OLrzqt = new C34702nhN();
    public static final int KWHzl = 8;

    private C34702nhN() {
    }

    public final boolean copydefault() {
        if (copydefault == null) {
            copydefault = java.lang.Boolean.valueOf(AEQbTJ() || KWHzl());
        }
        java.lang.Boolean bool = copydefault;
        Intrinsics.copydefault(bool);
        return bool.booleanValue();
    }

    public final boolean AEQbTJ() throws java.io.IOException {
        java.lang.Process processExec;
        java.io.BufferedReader bufferedReader;
        java.io.BufferedReader bufferedReader2 = null;
        try {
            processExec = java.lang.Runtime.getRuntime().exec(new java.lang.String[]{"which", "su"});
            try {
                bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(processExec.getInputStream()));
            } catch (java.lang.Throwable unused) {
            }
        } catch (java.lang.Throwable unused2) {
            processExec = null;
        }
        try {
            if (bufferedReader.readLine() != null) {
                bufferedReader.close();
                processExec.destroy();
                return true;
            }
            bufferedReader.close();
            processExec.destroy();
            return false;
        } catch (java.lang.Throwable unused3) {
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                bufferedReader2.close();
            }
            if (processExec != null) {
                processExec.destroy();
            }
            return false;
        }
    }

    public final boolean KWHzl() {
        java.lang.String[] strArr = {"/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i = 0; i < 9; i++) {
            try {
                if (new java.io.File(strArr[i]).exists()) {
                    return true;
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        return false;
    }
}
