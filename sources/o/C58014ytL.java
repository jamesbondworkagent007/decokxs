package o;

import android.app.ActivityManager;
import com.engagelab.privates.common.constants.MTCommonConstants;
import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.ytL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58014ytL {
    public static java.lang.String AEQbTJ;
    public static java.lang.String OLrzqt;
    public static char[] KWHzl = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final java.lang.ThreadLocal<MessageDigest> EZpvd = new java.lang.ThreadLocal<MessageDigest>() { // from class: o.ytL.3
        /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public MessageDigest initialValue() {
            try {
                return MessageDigest.getInstance("MD5");
            } catch (java.security.NoSuchAlgorithmException e) {
                throw new java.lang.RuntimeException("Initialize MD5 failed.", e);
            }
        }
    };
    public static final java.lang.ThreadLocal<MessageDigest> copydefault = new java.lang.ThreadLocal<MessageDigest>() { // from class: o.ytL.1
        /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public MessageDigest initialValue() {
            try {
                return MessageDigest.getInstance("SHA-256");
            } catch (java.security.NoSuchAlgorithmException e) {
                throw new java.lang.RuntimeException("Initialize SHA256-DIGEST failed.", e);
            }
        }
    };

    private C58014ytL() {
    }

    public static boolean AEQbTJ(android.content.Context context) throws java.lang.Throwable {
        java.lang.String packageName = context.getPackageName();
        java.lang.String strOLrzqt = OLrzqt(context);
        if (strOLrzqt == null || strOLrzqt.length() == 0) {
            strOLrzqt = "";
        }
        return packageName.equals(strOLrzqt);
    }

    public static java.lang.String copydefault(android.content.Context context) {
        java.lang.String str = OLrzqt;
        if (str != null) {
            return str;
        }
        java.lang.String packageName = context.getPackageName();
        OLrzqt = packageName;
        return packageName;
    }

    public static java.lang.String OLrzqt(android.content.Context context) throws java.lang.Throwable {
        java.lang.String str = AEQbTJ;
        if (str != null) {
            return str;
        }
        java.lang.String strKWHzl = KWHzl(context);
        AEQbTJ = strKWHzl;
        return strKWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [161=4] */
    public static java.lang.String KWHzl(android.content.Context context) throws java.lang.Throwable {
        java.io.FileInputStream fileInputStream;
        java.util.List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager.RunningAppProcessInfo next;
        int iMyPid = android.os.Process.myPid();
        if (context == null || iMyPid <= 0) {
            return "";
        }
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
        java.io.FileInputStream fileInputStream2 = null;
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            try {
                java.util.Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (next.pid == iMyPid) {
                        break;
                    }
                }
            } catch (java.lang.Exception e) {
                e.getMessage();
            }
            next = null;
            if (next != null) {
                return next.processName;
            }
        }
        byte[] bArr = new byte[128];
        try {
            try {
                try {
                    fileInputStream = new java.io.FileInputStream("/proc/" + iMyPid + "/cmdline");
                    try {
                        int i = fileInputStream.read(bArr);
                        if (i > 0) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= i) {
                                    break;
                                }
                                if (bArr[i2] <= 0) {
                                    i = i2;
                                    break;
                                }
                                i2++;
                            }
                            java.lang.String str = new java.lang.String(bArr, 0, i, java.nio.charset.Charset.forName(com.google.android.exoplayer2.C.UTF8_NAME));
                            try {
                                fileInputStream.close();
                            } catch (java.lang.Exception e2) {
                                e2.getMessage();
                            }
                            return str;
                        }
                        fileInputStream.close();
                    } catch (java.lang.Exception e3) {
                        e = e3;
                        fileInputStream2 = fileInputStream;
                        e.getMessage();
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        return "";
                    } catch (java.lang.Throwable th) {
                        th = th;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (java.lang.Exception e4) {
                                e4.getMessage();
                            }
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                }
            } catch (java.lang.Exception e5) {
                e = e5;
            }
        } catch (java.lang.Exception e6) {
            e6.getMessage();
        }
        return "";
    }

    public static java.lang.String AEQbTJ(java.lang.Exception exc) {
        java.lang.StackTraceElement[] stackTrace = exc.getStackTrace();
        if (stackTrace == null) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(exc.toString());
        for (int i = 2; i < stackTrace.length; i++) {
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb.append(stackTrace[i].getClassName());
            sb.append(AbstractJsonLexerKt.COLON);
            sb.append(stackTrace[i].getMethodName());
            sb.append("(" + stackTrace[i].getLineNumber() + ")]");
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void KWHzl(java.lang.String str, java.lang.String str2) throws java.io.IOException {
        java.io.BufferedReader bufferedReader;
        try {
            bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(new java.io.File(str2)), com.google.android.exoplayer2.C.UTF8_NAME));
            while (true) {
                try {
                    java.lang.String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    } else {
                        C58013ytK.EZpvd(str, line, new java.lang.Object[0]);
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    try {
                        C58013ytK.OLrzqt(str, "printFileByLine failed e : " + th.getMessage(), new java.lang.Object[0]);
                        if (bufferedReader == null) {
                            return;
                        }
                    } finally {
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [388=5, 389=5] */
    public static java.lang.String copydefault() {
        android.util.ArrayMap arrayMap;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.app.ActivityThread");
            java.lang.Object objInvoke = cls.getMethod("currentActivityThread", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
            java.lang.reflect.Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            arrayMap = (android.util.ArrayMap) declaredField.get(objInvoke);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        } finally {
            C58013ytK.copydefault("Matrix.MatrixUtil", "[getTopActivityName] Cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
        }
        if (arrayMap.size() < 1) {
            return null;
        }
        for (java.lang.Object obj : arrayMap.values()) {
            java.lang.Class<?> cls2 = obj.getClass();
            java.lang.reflect.Field declaredField2 = cls2.getDeclaredField("paused");
            declaredField2.setAccessible(true);
            if (!declaredField2.getBoolean(obj)) {
                java.lang.reflect.Field declaredField3 = cls2.getDeclaredField(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
                declaredField3.setAccessible(true);
                return ((android.app.Activity) declaredField3.get(obj)).getClass().getName();
            }
        }
        return null;
    }
}
