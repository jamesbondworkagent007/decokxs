package o;

import com.okinc.lib.dionysus.crash.DeviceInfoHelper;
import com.okinc.lib.dionysus.crash.bean.CrashReportBody;
import com.okinc.lib.dionysus.crash.bean.ManagedCrashLog;
import com.okinc.lib.dionysus.crash.bean.StackFrame;
import com.okinc.lib.utils.OkUtils;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.Map;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C38002pIp;
import org.json.JSONException;

/* JADX INFO: loaded from: classes9.dex */
public final class pII {
    public static final java.lang.String EZpvd = "CrashLogHelper";

    private pII() {
    }

    public static UUID OLrzqt(java.lang.String str, java.lang.Thread thread, java.lang.Throwable th, boolean z) {
        return EZpvd(th, KWHzl(OkUtils.copydefault(), str, thread, KWHzl(th, z), java.lang.Thread.getAllStackTraces(), C38002pIp.Companion.KWHzl(), true), z);
    }

    public static com.okinc.lib.dionysus.crash.bean.Exception KWHzl(@androidx.annotation.NonNull java.lang.Throwable th, boolean z) {
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.add(th);
            th = th.getCause();
        }
        if (linkedList.size() > 16) {
            C38002pIp.Companion.iwGUEr().KWHzl(EZpvd, "Crash causes truncated from " + linkedList.size() + " to 16 causes.");
            linkedList.subList(8, linkedList.size() - 8).clear();
        }
        com.okinc.lib.dionysus.crash.bean.Exception exception = null;
        int i = 0;
        com.okinc.lib.dionysus.crash.bean.Exception exception2 = null;
        while (i < linkedList.size()) {
            java.lang.Throwable th2 = (java.lang.Throwable) linkedList.get(i);
            com.okinc.lib.dionysus.crash.bean.Exception exception3 = new com.okinc.lib.dionysus.crash.bean.Exception();
            exception3.setType(th2.getClass().getName());
            exception3.setMessage(th2.getMessage());
            exception3.setFrames(copydefault(th2));
            if (exception == null) {
                exception = exception3;
            } else {
                exception2.setInnerExceptions(Collections.singletonList(exception3));
            }
            i++;
            exception2 = exception3;
        }
        return exception;
    }

    public static java.util.List<StackFrame> copydefault(@androidx.annotation.NonNull java.lang.Throwable th) {
        java.lang.StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace.length > 256) {
            java.lang.StackTraceElement[] stackTraceElementArr = new java.lang.StackTraceElement[256];
            java.lang.System.arraycopy(stackTrace, 0, stackTraceElementArr, 0, 128);
            java.lang.System.arraycopy(stackTrace, stackTrace.length - 128, stackTraceElementArr, 128, 128);
            th.setStackTrace(stackTraceElementArr);
            C38002pIp.Companion.iwGUEr().KWHzl(EZpvd, "Crash frames truncated from " + stackTrace.length + " to 256 frames.");
            stackTrace = stackTraceElementArr;
        }
        return AEQbTJ(stackTrace);
    }

    public static java.util.List<StackFrame> AEQbTJ(@androidx.annotation.NonNull java.lang.StackTraceElement[] stackTraceElementArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(copydefault(stackTraceElement));
        }
        return arrayList;
    }

    public static StackFrame copydefault(java.lang.StackTraceElement stackTraceElement) {
        StackFrame stackFrame = new StackFrame();
        stackFrame.setClassName(stackTraceElement.getClassName());
        stackFrame.setMethodName(stackTraceElement.getMethodName());
        stackFrame.setLineNumber(java.lang.Integer.valueOf(stackTraceElement.getLineNumber()));
        stackFrame.setFileName(stackTraceElement.getFileName());
        return stackFrame;
    }

    public static UUID EZpvd(java.lang.Throwable th, ManagedCrashLog managedCrashLog, boolean z) {
        java.io.File fileEZpvd = pIW.EZpvd();
        if (z) {
            fileEZpvd = pIW.fetchVPNInfo();
        }
        UUID id = managedCrashLog.getId();
        java.lang.String string = id.toString();
        C38002pIp.Application application = C38002pIp.Companion;
        InterfaceC38050pKj interfaceC38050pKjIwGUEr = application.iwGUEr();
        java.lang.String str = EZpvd;
        interfaceC38050pKjIwGUEr.OLrzqt(str, "Saving uncaught exception.crashStorageDirectory:" + fileEZpvd.getAbsolutePath());
        java.io.File file = new java.io.File(fileEZpvd, string + ".json");
        CrashReportBody crashReportBody = new CrashReportBody();
        java.util.ArrayList<ManagedCrashLog> arrayList = new java.util.ArrayList<>();
        arrayList.add(managedCrashLog);
        crashReportBody.setLogs(arrayList);
        C38057pKq.copydefault(file, C33490mxT.OLrzqt(crashReportBody));
        application.iwGUEr().OLrzqt(str, "Saved JSON content for ingestion into file path:" + file);
        return id;
    }

    public static ManagedCrashLog KWHzl(@androidx.annotation.NonNull android.content.Context context, java.lang.String str, @androidx.annotation.NonNull java.lang.Thread thread, @androidx.annotation.NonNull com.okinc.lib.dionysus.crash.bean.Exception exception, @androidx.annotation.NonNull java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> map, long j, boolean z) {
        ManagedCrashLog managedCrashLog = new ManagedCrashLog();
        managedCrashLog.setId(UUID.randomUUID());
        try {
            managedCrashLog.setTimestamp(C38020pJg.EZpvd(new Date()));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        managedCrashLog.setUserId(str);
        try {
            managedCrashLog.setDevice(DeviceInfoHelper.KWHzl(context));
        } catch (DeviceInfoHelper.DeviceInfoException e2) {
            C38002pIp.Companion.iwGUEr().copydefault(EZpvd, "Could not attach device properties snapshot to error log, will attach at sending time", e2);
        }
        managedCrashLog.setProcessId(java.lang.Integer.valueOf(android.os.Process.myPid()));
        managedCrashLog.setProcessName(C38059pKs.copydefault());
        if (android.text.TextUtils.isEmpty(managedCrashLog.getProcessName())) {
            managedCrashLog.setProcessName(AbstractJsonLexerKt.NULL);
        }
        managedCrashLog.setArchitecture(copydefault());
        managedCrashLog.setErrorThreadId(java.lang.Long.valueOf(thread.getId()));
        managedCrashLog.setErrorThreadName(thread.getName());
        managedCrashLog.setFatal(java.lang.Boolean.valueOf(z));
        try {
            managedCrashLog.setAppLaunchTimestamp(C38020pJg.EZpvd(new Date(j)));
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        managedCrashLog.setException(exception);
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (Map.Entry<java.lang.Thread, java.lang.StackTraceElement[]> entry : map.entrySet()) {
            com.okinc.lib.dionysus.crash.bean.Thread thread2 = new com.okinc.lib.dionysus.crash.bean.Thread();
            thread2.setId(entry.getKey().getId());
            thread2.setName(entry.getKey().getName());
            thread2.setFrames(AEQbTJ(entry.getValue()));
            arrayList.add(thread2);
        }
        managedCrashLog.setThreads(arrayList);
        return managedCrashLog;
    }

    public static java.lang.String copydefault() {
        return android.os.Build.SUPPORTED_ABIS[0];
    }
}
