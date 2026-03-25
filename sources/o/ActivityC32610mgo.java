package o;

import android.os.Build;
import androidx.appcompat.app.AppCompatDelegate;
import com.okinc.core.util.SPUtils;
import com.okinc.lib.dionysus.crash.bean.CrashReportBody;
import com.okinc.lib.dionysus.crash.bean.ManagedCrashLog;
import com.okinc.lib.dionysus.crash.bean.StackFrame;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import o.C32549mfg;
import o.C32982mnp;
import o.C38002pIp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mgo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class ActivityC32610mgo extends ActivityC52757wXf {
    @Override // o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
        SPUtils.init(this);
        AppCompatDelegate.setDefaultNightMode(C33492mxV.EZpvd());
    }

    @Override // o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        C38002pIp.Application application;
        ManagedCrashLog managedCrashLog;
        java.util.ArrayList<ManagedCrashLog> logs;
        setTheme(C32982mnp.TaskDescription.copydefault);
        super.onCreate(bundle);
        try {
            try {
                C33567myr.AEQbTJ((android.app.Activity) this, true);
                application = C38002pIp.Companion;
                if (!application.ejfBZ()) {
                    setContentView(C32549mfg.TaskDescription.EZpvd);
                    android.widget.ImageView imageView = (android.widget.ImageView) findViewById(C32549mfg.ActionBar.AEQbTJ);
                    android.graphics.drawable.Drawable applicationIcon = C38052pKl.AEQbTJ().getApplicationIcon(C38052pKl.OLrzqt());
                    Intrinsics.checkNotNullExpressionValue(applicationIcon, "");
                    imageView.setImageDrawable(applicationIcon);
                    ((android.widget.TextView) findViewById(C32549mfg.ActionBar.AhwBna)).setText(C38052pKl.copydefault() + "(" + C38052pKl.KWHzl() + ")");
                } else {
                    setContentView(C32549mfg.TaskDescription.KWHzl);
                    android.widget.TextView textView = (android.widget.TextView) findViewById(C32549mfg.ActionBar.valueOf);
                    CrashReportBody crashReportBodyValueOf = application.valueOf();
                    if (crashReportBodyValueOf == null || (logs = crashReportBodyValueOf.getLogs()) == null) {
                        managedCrashLog = null;
                    } else if (true ^ logs.isEmpty()) {
                        managedCrashLog = logs.get(0);
                    } else {
                        managedCrashLog = new ManagedCrashLog();
                    }
                    textView.setText(EZpvd(this, managedCrashLog));
                    textView.setMovementMethod(android.text.method.ScrollingMovementMethod.getInstance());
                }
            } catch (java.lang.Exception e) {
                application = C38002pIp.Companion;
                application.iwGUEr().copydefault("DefaultErrorActivity", "error:" + e.getMessage(), e);
            }
            application.EZpvd();
        } catch (java.lang.Throwable th) {
            C38002pIp.Companion.EZpvd();
            throw th;
        }
    }

    public final java.lang.String EZpvd(@NotNull android.content.Context context, ManagedCrashLog managedCrashLog) {
        com.okinc.lib.dionysus.crash.bean.Exception exception;
        java.util.List<com.okinc.lib.dionysus.crash.bean.Exception> innerExceptions;
        com.okinc.lib.dionysus.crash.bean.Exception exception2;
        java.util.List<StackFrame> frames;
        com.okinc.lib.dionysus.crash.bean.Exception exception3;
        com.okinc.lib.dionysus.crash.bean.Exception exception4;
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append("\n" + ((managedCrashLog == null || (exception4 = managedCrashLog.getException()) == null) ? null : exception4.getType()) + ":" + ((managedCrashLog == null || (exception3 = managedCrashLog.getException()) == null) ? null : exception3.getMessage()));
        if (managedCrashLog != null && (exception2 = managedCrashLog.getException()) != null && (frames = exception2.getFrames()) != null) {
            java.util.Iterator<T> it = frames.iterator();
            while (it.hasNext()) {
                stringBuffer.append("\n\tat " + ((StackFrame) it.next()));
            }
        }
        if (managedCrashLog != null && (exception = managedCrashLog.getException()) != null && (innerExceptions = exception.getInnerExceptions()) != null) {
            for (com.okinc.lib.dionysus.crash.bean.Exception exception5 : innerExceptions) {
                stringBuffer.append("\n" + exception5.getType() + ":" + exception5.getMessage());
                java.util.List<StackFrame> frames2 = exception5.getFrames();
                if (frames2 != null) {
                    java.util.Iterator<T> it2 = frames2.iterator();
                    while (it2.hasNext()) {
                        stringBuffer.append("\n\tat " + ((StackFrame) it2.next()));
                    }
                }
            }
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", java.util.Locale.US);
        java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
        stringBuffer2.append("\nApp Version Name: " + C38052pKl.copydefault());
        stringBuffer2.append("\nApp Version Code: " + C38052pKl.KWHzl());
        stringBuffer2.append("\nCurrent date: " + simpleDateFormat.format(date));
        stringBuffer2.append("\nProcessName: " + (managedCrashLog != null ? managedCrashLog.getProcessName() : null) + " " + (managedCrashLog != null ? managedCrashLog.getProcessId() : null));
        stringBuffer2.append("\npackageName: " + C38052pKl.OLrzqt() + " ");
        stringBuffer2.append("\nVersionName: " + C38052pKl.copydefault() + " ");
        stringBuffer2.append("\nVersionCode: " + C38052pKl.KWHzl() + " ");
        stringBuffer2.append("\nDevice: " + copydefault() + " ");
        stringBuffer2.append("\nOS version: Android " + Build.VERSION.RELEASE + " (SDK " + Build.VERSION.SDK_INT + ") ");
        stringBuffer2.append("\nStack trace:  \n");
        stringBuffer2.append(stringBuffer.toString());
        stringBuffer2.append("\n\n\n\n\n\n");
        java.lang.String string = stringBuffer2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final java.lang.String copydefault() {
        java.lang.String str = android.os.Build.MANUFACTURER;
        java.lang.String str2 = android.os.Build.MODEL;
        Intrinsics.copydefault((java.lang.Object) str2);
        Intrinsics.copydefault((java.lang.Object) str);
        if (C59449zhJ.startsWith$default(str2, str, false, 2, null)) {
            return AEQbTJ(str2);
        }
        return AEQbTJ(str) + " " + str2;
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        char cCharAt = str.charAt(0);
        if (java.lang.Character.isUpperCase(cCharAt)) {
            return str;
        }
        char upperCase = java.lang.Character.toUpperCase(cCharAt);
        java.lang.String strSubstring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return upperCase + strSubstring;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        pIF.log$default("--->DefaultErrorActivity:<--- onNewIntent", true, null, null, 6, null);
    }

    public final void postLog(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C38002pIp.Application application = C38002pIp.Companion;
        pIB pibOLrzqt = application.OLrzqt();
        if (pibOLrzqt != null) {
            pIA piaGEmmrt = application.gEmmrt();
            pibOLrzqt.KWHzl(piaGEmmrt != null ? piaGEmmrt.KWHzl() : null, this);
        }
    }

    public final void exportLog(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C38002pIp.Application application = C38002pIp.Companion;
        pIB pibOLrzqt = application.OLrzqt();
        if (pibOLrzqt != null) {
            pIA piaGEmmrt = application.gEmmrt();
            pibOLrzqt.AEQbTJ(piaGEmmrt != null ? piaGEmmrt.KWHzl() : null, this);
        }
    }

    @Override // o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
