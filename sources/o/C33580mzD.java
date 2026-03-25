package o;

/* JADX INFO: renamed from: o.mzD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33580mzD {
    public final java.lang.String EZpvd = "PermissionPageManager";
    public android.content.Context OLrzqt;
    public java.lang.String copydefault;

    public C33580mzD(android.content.Context context) {
        this.OLrzqt = context;
        this.copydefault = context.getPackageName();
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x005e: MOVE (r5 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:31:0x005e */
    public static java.lang.String EZpvd() throws java.lang.Throwable {
        java.lang.Throwable th;
        java.lang.Process processExec;
        java.io.IOException e;
        java.io.BufferedReader bufferedReader;
        java.io.BufferedReader bufferedReader2;
        java.io.BufferedReader bufferedReader3 = null;
        try {
            try {
                processExec = java.lang.Runtime.getRuntime().exec("getprop ro.miui.ui.version.name");
                try {
                    bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(processExec.getInputStream()), 1024);
                } catch (java.io.IOException e2) {
                    e = e2;
                    bufferedReader = null;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    try {
                        bufferedReader3.close();
                    } catch (java.lang.Exception e3) {
                        android.util.Log.getStackTraceString(e3);
                    }
                    if (processExec != null) {
                        processExec.destroy();
                        throw th;
                    }
                    throw th;
                }
            } catch (java.io.IOException e4) {
                e = e4;
                processExec = null;
                bufferedReader = null;
            } catch (java.lang.Throwable th3) {
                th = th3;
                processExec = null;
            }
            try {
                java.lang.String line = bufferedReader.readLine();
                try {
                    bufferedReader.close();
                } catch (java.lang.Exception e5) {
                    android.util.Log.getStackTraceString(e5);
                }
                processExec.destroy();
                return line;
            } catch (java.io.IOException e6) {
                e = e6;
                e.printStackTrace();
                try {
                    bufferedReader.close();
                } catch (java.lang.Exception e7) {
                    android.util.Log.getStackTraceString(e7);
                }
                if (processExec != null) {
                    processExec.destroy();
                }
                return null;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            bufferedReader3 = bufferedReader2;
        }
    }

    public void copydefault() {
        android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(android.net.Uri.fromParts("package", this.OLrzqt.getPackageName(), null));
        try {
            this.OLrzqt.startActivity(intent);
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }
}
