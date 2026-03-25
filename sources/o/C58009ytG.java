package o;

import com.tencent.matrix.util.DeviceUtil;

/* JADX INFO: renamed from: o.ytG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C58009ytG {
    public static java.lang.String AEQbTJ() {
        return AEQbTJ(new java.lang.Throwable().getStackTrace());
    }

    public static java.lang.String AEQbTJ(java.lang.StackTraceElement[] stackTraceElementArr) {
        return copydefault(stackTraceElementArr, "", -1);
    }

    public static java.lang.String copydefault(java.lang.StackTraceElement[] stackTraceElementArr, java.lang.String str, int i) {
        if (stackTraceElementArr == null || stackTraceElementArr.length < 3) {
            return "";
        }
        if (i < 0) {
            i = Integer.MAX_VALUE;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(" \n");
        for (int i2 = 3; i2 < stackTraceElementArr.length - 3 && i2 < i; i2++) {
            sb.append(str);
            sb.append("at ");
            sb.append(stackTraceElementArr[i2].getClassName());
            sb.append(":");
            sb.append(stackTraceElementArr[i2].getMethodName());
            sb.append("(" + stackTraceElementArr[i2].getLineNumber() + ")");
            sb.append("\n");
        }
        return sb.toString();
    }

    public static java.lang.String copydefault(java.lang.StackTraceElement[] stackTraceElementArr, java.lang.String str) {
        if (stackTraceElementArr == null || stackTraceElementArr.length < 3) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(" \n");
        for (int i = 0; i < stackTraceElementArr.length; i++) {
            sb.append(str);
            sb.append("at ");
            sb.append(stackTraceElementArr[i].getClassName());
            sb.append(":");
            sb.append(stackTraceElementArr[i].getMethodName());
            sb.append("(" + stackTraceElementArr[i].getLineNumber() + ")");
            sb.append("\n");
        }
        return sb.toString();
    }

    public static java.lang.String OLrzqt(java.lang.StackTraceElement[] stackTraceElementArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb.append(stackTraceElement.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public static java.lang.String OLrzqt() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.StackTraceElement stackTraceElement : android.os.Looper.getMainLooper().getThread().getStackTrace()) {
            sb.append(stackTraceElement.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public static int[] EZpvd(int i) {
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MAX_VALUE;
        try {
            java.lang.String[] strArrSplit = DeviceUtil.AEQbTJ(java.lang.String.format("/proc/%s/stat", java.lang.Integer.valueOf(i))).trim().split(" ");
            if (strArrSplit.length >= 19) {
                i2 = java.lang.Integer.parseInt(strArrSplit[17].trim());
                i3 = java.lang.Integer.parseInt(strArrSplit[18].trim());
            }
            return new int[]{i2, i3};
        } catch (java.lang.Exception unused) {
            return new int[]{i2, Integer.MAX_VALUE};
        }
    }
}
