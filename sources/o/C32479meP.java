package o;

import android.app.ActivityManager;
import com.engagelab.privates.common.constants.MTCommonConstants;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.meP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32479meP {
    public static final android.os.Handler AEQbTJ;
    public static final int KWHzl;
    public static java.lang.String OLrzqt;
    public static InterfaceC32485meV copydefault;
    public static final ScheduledExecutorService gEmmrt;
    public static final C32479meP EZpvd = new C32479meP();
    public static final java.util.HashSet<java.lang.String> AhwBna = new java.util.HashSet<>();

    private C32479meP() {
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "");
        gEmmrt = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        AEQbTJ = new android.os.Handler(android.os.Looper.getMainLooper());
        KWHzl = 8;
    }

    public final void copydefault(@NotNull final android.content.Context context, InterfaceC32485meV interfaceC32485meV) {
        Intrinsics.checkNotNullParameter(context, "");
        copydefault = interfaceC32485meV;
        OLrzqt(context);
        gEmmrt.scheduleWithFixedDelay(new java.lang.Runnable() { // from class: o.meN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C32479meP.KWHzl(context);
            }
        }, 0L, 1L, java.util.concurrent.TimeUnit.SECONDS);
    }

    public static final void KWHzl(android.content.Context context) {
        try {
            EZpvd.valueOf(context);
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }

    public final void OLrzqt(android.content.Context context) {
        java.util.HashSet<java.lang.String> hashSet = AhwBna;
        hashSet.add(context.getPackageName());
        hashSet.add("com.android.email");
        hashSet.add("com.sina.weibo");
        hashSet.add("com.qiyi.video");
        hashSet.add("com.tencent.mobileqq");
        hashSet.add("com.tencent.qqlite");
        hashSet.add("com.taobao.taobao");
        hashSet.add("com.tencent.mm");
        hashSet.add("com.facebook.katana");
        hashSet.add("com.twitter.android");
        hashSet.add("org.telegram.messenger");
        hashSet.add("com.whatsapp");
        hashSet.add("com.facebook.orca");
        hashSet.add("com.xiaomi.channel");
        hashSet.add("com.dewmobile.kuaiya");
        hashSet.add("com.netease.newsreader.activity");
        hashSet.add("com.ss.android.article.lite");
        hashSet.add("com.ss.android.article.news");
        hashSet.add("com.baidu.tieba");
        hashSet.add("com.qihoo.appstore");
        hashSet.add("com.qzone");
        hashSet.add("com.eg.android.AlipayGphone");
        hashSet.add("com.alibaba.android.rimet");
        hashSet.add("com.sohu.newsclient");
        hashSet.add("com.sohu.inputmethod.sogou");
        hashSet.add("com.tencent.wework");
    }

    public final void valueOf(final android.content.Context context) {
        java.lang.String strAhwBna = AhwBna(context);
        if (strAhwBna == null || strAhwBna.length() == 0 || Intrinsics.EZpvd((java.lang.Object) strAhwBna, (java.lang.Object) OLrzqt)) {
            return;
        }
        OLrzqt = strAhwBna;
        if (copydefault(context, strAhwBna) || AhwBna.contains(strAhwBna)) {
            return;
        }
        android.os.Handler handler = AEQbTJ;
        handler.removeCallbacksAndMessages(null);
        handler.post(new java.lang.Runnable() { // from class: o.meO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C32479meP.EZpvd(context);
            }
        });
    }

    public static final void EZpvd(android.content.Context context) {
        InterfaceC32485meV interfaceC32485meV = copydefault;
        android.widget.Toast.makeText(context, interfaceC32485meV != null ? interfaceC32485meV.EZpvd(context) : null, 1).show();
    }

    public final java.lang.String AhwBna(android.content.Context context) {
        android.content.ComponentName componentName;
        java.lang.Object systemService = context.getSystemService(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
        Intrinsics.copydefault(systemService, "");
        java.util.List<ActivityManager.RunningTaskInfo> runningTasks = ((android.app.ActivityManager) systemService).getRunningTasks(1);
        if (!C33129mqd.KWHzl((java.util.Collection) runningTasks) || (componentName = runningTasks.get(0).topActivity) == null) {
            return null;
        }
        return componentName.getPackageName();
    }

    public final boolean copydefault(android.content.Context context, java.lang.String str) {
        android.content.pm.PackageInfo packageInfo;
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "");
            packageInfo = packageManager.getPackageInfo(str, 0);
        } catch (java.lang.Throwable unused) {
            packageInfo = null;
        }
        if (packageInfo == null) {
            return false;
        }
        android.content.pm.ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        return (applicationInfo != null && (applicationInfo.flags & 1) == 1) || (applicationInfo != null && (applicationInfo.flags & 128) == 1);
    }
}
