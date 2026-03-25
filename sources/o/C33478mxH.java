package o;

import android.os.Build;
import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mxH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33478mxH {
    public static final C33478mxH KWHzl = new C33478mxH();
    public static final java.lang.String copydefault = C33478mxH.class.getSimpleName();

    private C33478mxH() {
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        byte[] bArrAEQbTJ = AEQbTJ(str);
        if (bArrAEQbTJ == null) {
            return null;
        }
        return C33572myw.EZpvd(bArrAEQbTJ);
    }

    public final byte[] AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return copydefault(new java.io.File(str));
    }

    public final byte[] copydefault(@NotNull java.io.File file) throws java.lang.Throwable {
        java.io.BufferedInputStream bufferedInputStream;
        MessageDigest messageDigest;
        byte[] bArr;
        Intrinsics.checkNotNullParameter(file, "");
        java.io.BufferedInputStream bufferedInputStream2 = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(file));
        } catch (java.lang.Exception e) {
            e = e;
            bufferedInputStream = null;
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            try {
                bArr = new byte[1024];
            } catch (java.lang.Throwable th2) {
                th = th2;
                bufferedInputStream2 = bufferedInputStream;
            }
            while (true) {
                int i = bufferedInputStream.read(bArr);
                if (i == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i);
                th = th2;
                bufferedInputStream2 = bufferedInputStream;
                if (bufferedInputStream2 != null) {
                    try {
                        bufferedInputStream2.close();
                    } catch (java.lang.Exception e2) {
                        pUU.AEQbTJ("tag", e2);
                    }
                }
                throw th;
            }
            bufferedInputStream.close();
            byte[] bArrDigest = messageDigest.digest();
            try {
                bufferedInputStream.close();
            } catch (java.lang.Exception e3) {
                pUU.AEQbTJ("tag", e3);
            }
            return bArrDigest;
        } catch (java.lang.Exception e4) {
            e = e4;
            pUU.AEQbTJ("tag", e);
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (java.lang.Exception e5) {
                    pUU.AEQbTJ("tag", e5);
                }
            }
            return null;
        }
    }

    public final java.lang.String AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strCopydefault = null;
        try {
            java.lang.Object systemService = context.getApplicationContext().getSystemService("storage");
            Intrinsics.copydefault(systemService);
            java.lang.reflect.Method method = systemService.getClass().getMethod("getVolumeList", null);
            int i = 0;
            java.lang.reflect.Method method2 = systemService.getClass().getMethod("getVolumeState", java.lang.String.class);
            java.lang.Object objInvoke = method.invoke(systemService, null);
            Intrinsics.copydefault(objInvoke, "");
            java.lang.Object[] objArr = (java.lang.Object[]) objInvoke;
            java.lang.reflect.Method method3 = objArr[0].getClass().getMethod("getPath", null);
            int length = objArr.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                java.lang.Object objInvoke2 = method3.invoke(objArr[i], null);
                Intrinsics.copydefault(objInvoke2, "");
                java.lang.String str2 = (java.lang.String) objInvoke2;
                if (Intrinsics.EZpvd("mounted", method2.invoke(systemService, str2))) {
                    strCopydefault = str2;
                    break;
                }
                i++;
            }
        } catch (java.lang.Exception unused) {
        }
        if (strCopydefault == null && Intrinsics.EZpvd((java.lang.Object) "mounted", (java.lang.Object) android.os.Environment.getExternalStorageState())) {
            strCopydefault = copydefault(context);
        }
        if (!android.text.TextUtils.isEmpty(strCopydefault)) {
            return strCopydefault + java.io.File.separator + str;
        }
        return "/sdcard/" + str;
    }

    public final java.lang.String copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (Build.VERSION.SDK_INT >= 29) {
            java.io.File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                return externalFilesDir.getAbsolutePath();
            }
            return null;
        }
        java.io.File externalStorageDirectory = android.os.Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            return externalStorageDirectory.getAbsolutePath();
        }
        return null;
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) throws java.lang.Throwable {
        java.lang.Throwable th;
        java.io.BufferedReader bufferedReader;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        try {
            java.io.FileReader fileReader = new java.io.FileReader(str);
            try {
                bufferedReader = new java.io.BufferedReader(fileReader);
            } catch (java.lang.Exception unused) {
                bufferedReader = null;
            } catch (java.lang.Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
            try {
                for (java.lang.String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    str2 = str2 + line;
                }
                AEQbTJ(fileReader);
                AEQbTJ(bufferedReader);
                return str2;
            } catch (java.lang.Exception unused2) {
                AEQbTJ(fileReader);
                AEQbTJ(bufferedReader);
                return null;
            } catch (java.lang.Throwable th3) {
                th = th3;
                AEQbTJ(fileReader);
                AEQbTJ(bufferedReader);
                throw th;
            }
        } catch (java.io.FileNotFoundException unused3) {
        }
    }

    public final void AEQbTJ(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public final java.io.File EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (Intrinsics.EZpvd((java.lang.Object) "mounted", (java.lang.Object) android.os.Environment.getExternalStorageState()) || !android.os.Environment.isExternalStorageRemovable()) {
            return context.getExternalCacheDir();
        }
        return context.getCacheDir();
    }
}
