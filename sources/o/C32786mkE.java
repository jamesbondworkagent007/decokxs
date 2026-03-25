package o;

import android.app.ActivityManager;
import com.engagelab.privates.common.constants.MTCommonConstants;
import java.security.MessageDigest;
import kotlin.Result;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mkE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32786mkE {
    public static final C32786mkE KWHzl = new C32786mkE();

    private C32786mkE() {
    }

    public final android.content.pm.ApplicationInfo OLrzqt(android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (context != null) {
            try {
                android.content.pm.PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    return packageManager.getApplicationInfo(str, 128);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    public final java.lang.String KWHzl(android.content.Context context, java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        if (context == null || str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return null;
        }
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(EZpvd(context.getPackageManager().getApplicationInfo(str, 0).sourceDir));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (java.lang.String) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String EZpvd(java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        java.io.FileInputStream fileInputStream;
        MessageDigest messageDigest;
        byte[] bArr;
        if (str == null) {
            return null;
        }
        try {
            Result.Application application = Result.Companion;
            fileInputStream = new java.io.FileInputStream(str);
            try {
                messageDigest = MessageDigest.getInstance("MD5");
                bArr = new byte[8192];
            } finally {
            }
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        while (true) {
            int i = fileInputStream.read(bArr);
            if (i == -1) {
                break;
            }
            messageDigest.update(bArr, 0, i);
            Result.Application application22 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            return (java.lang.String) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        }
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        java.lang.String strJoinToString$default = yDV.joinToString$default(bArrDigest, (java.lang.CharSequence) "", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, new Function1() { // from class: o.mkF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32786mkE.EZpvd(((java.lang.Byte) obj).byteValue());
            }
        }, 30, (java.lang.Object) null);
        yFA.copydefault(fileInputStream, null);
        objM7377constructorimpl = Result.m7377constructorimpl(strJoinToString$default);
        return (java.lang.String) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    public static final java.lang.CharSequence EZpvd(byte b) {
        java.lang.String str = java.lang.String.format("%02x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final boolean copydefault(android.content.Context context, @NotNull java.lang.String str) {
        android.content.pm.PackageManager packageManager;
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Intent intent = new android.content.Intent().setPackage(str);
        Intrinsics.checkNotNullExpressionValue(intent, "");
        return C33129mqd.KWHzl((java.util.Collection) ((context == null || (packageManager = context.getPackageManager()) == null) ? null : packageManager.queryIntentActivities(intent, 1)));
    }

    public final boolean OLrzqt(android.content.Context context) {
        java.util.List<ActivityManager.RunningServiceInfo> runningServices;
        if (context == null) {
            return false;
        }
        try {
            java.lang.Object systemService = context.getSystemService(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
            android.app.ActivityManager activityManager = systemService instanceof android.app.ActivityManager ? (android.app.ActivityManager) systemService : null;
            if (activityManager != null && (runningServices = activityManager.getRunningServices(Integer.MAX_VALUE)) != null && !runningServices.isEmpty()) {
                java.util.Iterator<T> it = runningServices.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.EZpvd((java.lang.Object) ((ActivityManager.RunningServiceInfo) it.next()).service.getClassName(), (java.lang.Object) ServiceC32756mjb.class.getName())) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
