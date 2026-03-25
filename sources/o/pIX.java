package o;

import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;
import com.okinc.lib.dionysus.crash.bean.CrashReportBody;
import com.okinc.lib.dionysus.crash.bean.ManagedCrashLog;
import com.okinc.lib.dionysus.crash.bean.StackFrame;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import o.C38002pIp;
import o.pIG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pIX extends AppCompatActivity {
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        ManagedCrashLog managedCrashLog;
        java.util.ArrayList<ManagedCrashLog> logs;
        super.onCreate(bundle);
        C38002pIp.Application application = C38002pIp.Companion;
        application.iwGUEr().OLrzqt("DefaultErrorActivity", "onCreate start");
        try {
            try {
                if (!application.ejfBZ()) {
                    setContentView(pIG.ActionBar.copydefault);
                } else {
                    setContentView(pIG.ActionBar.AEQbTJ);
                    android.widget.TextView textView = (android.widget.TextView) findViewById(pIG.Activity.OLrzqt);
                    CrashReportBody crashReportBodyValueOf = application.valueOf();
                    if (crashReportBodyValueOf == null || (logs = crashReportBodyValueOf.getLogs()) == null) {
                        managedCrashLog = null;
                    } else if (!logs.isEmpty()) {
                        managedCrashLog = logs.get(0);
                    } else {
                        managedCrashLog = new ManagedCrashLog();
                    }
                    textView.setText(OLrzqt(this, managedCrashLog));
                    textView.setMovementMethod(android.text.method.ScrollingMovementMethod.getInstance());
                }
                application.EZpvd();
            } catch (java.lang.Exception e) {
                C38002pIp.Application application2 = C38002pIp.Companion;
                application2.iwGUEr().copydefault("DefaultErrorActivity", "error:" + e.getMessage(), e);
                application2.EZpvd();
            }
            C38002pIp.Companion.iwGUEr().OLrzqt("DefaultErrorActivity", "onCreate end");
        } catch (java.lang.Throwable th) {
            C38002pIp.Companion.EZpvd();
            throw th;
        }
    }

    public final java.lang.String OLrzqt(@NotNull android.content.Context context, ManagedCrashLog managedCrashLog) {
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
        java.lang.String strEZpvd = EZpvd(context);
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        stringBuffer2.append("\nBuild version: " + strEZpvd + " \n");
        stringBuffer2.append("\nCurrent date: " + simpleDateFormat.format(date));
        stringBuffer2.append("\nProcessName: " + (managedCrashLog != null ? managedCrashLog.getProcessName() : null) + " " + (managedCrashLog != null ? managedCrashLog.getProcessId() : null));
        stringBuffer2.append("\npackageName: " + C38052pKl.OLrzqt() + " ");
        stringBuffer2.append("\nVersionName: " + C38052pKl.copydefault() + " ");
        stringBuffer2.append("\nVersionCode: " + C38052pKl.KWHzl() + " ");
        stringBuffer2.append("\nDevice: " + KWHzl() + " ");
        stringBuffer2.append("\nOS version: Android " + Build.VERSION.RELEASE + " (SDK " + Build.VERSION.SDK_INT + ") ");
        stringBuffer2.append("\nStack trace:  \n");
        stringBuffer2.append(stringBuffer.toString());
        stringBuffer2.append("\n\n\n\n\n\n");
        java.lang.String string = stringBuffer2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final java.lang.String EZpvd(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (java.lang.Exception unused) {
            return "Unknown";
        }
    }

    private final java.lang.String KWHzl() {
        java.lang.String str = android.os.Build.MANUFACTURER;
        java.lang.String str2 = android.os.Build.MODEL;
        Intrinsics.copydefault((java.lang.Object) str2);
        Intrinsics.copydefault((java.lang.Object) str);
        if (C59449zhJ.startsWith$default(str2, str, false, 2, null)) {
            return AEQbTJ(str2);
        }
        return AEQbTJ(str) + " " + str2;
    }

    private final java.lang.String AEQbTJ(java.lang.String str) {
        if (str.length() == 0) {
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

    public final void postLog(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C38002pIp.Application application = C38002pIp.Companion;
        application.iwGUEr().OLrzqt(true);
        pIB pibOLrzqt = application.OLrzqt();
        if (pibOLrzqt != null) {
            pIA piaGEmmrt = application.gEmmrt();
            pibOLrzqt.KWHzl(piaGEmmrt != null ? piaGEmmrt.KWHzl() : null, this);
        }
    }

    public final void exportLog(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C38002pIp.Application application = C38002pIp.Companion;
        application.iwGUEr().OLrzqt(true);
        pIB pibOLrzqt = application.OLrzqt();
        if (pibOLrzqt != null) {
            pIA piaGEmmrt = application.gEmmrt();
            pibOLrzqt.AEQbTJ(piaGEmmrt != null ? piaGEmmrt.KWHzl() : null, this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
