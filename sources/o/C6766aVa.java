package o;

import com.google.firebase.crashlytics.internal.common.CrashlyticsUtils;
import com.okinc.components.report.EventAction;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.network.okg.response.OKServerException;
import java.lang.Thread;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aVa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6766aVa implements Thread.UncaughtExceptionHandler {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public Thread.UncaughtExceptionHandler AEQbTJ;
    public final int OLrzqt = 2000;

    /* JADX INFO: renamed from: o.aVa$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aVa.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void AEQbTJ() {
        pUU.KWHzl("CrashHandler", "CrashHandler setUncaughtCrash ");
        if (java.lang.Thread.getDefaultUncaughtExceptionHandler() != this) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = java.lang.Thread.getDefaultUncaughtExceptionHandler();
            this.AEQbTJ = defaultUncaughtExceptionHandler;
            pUU.KWHzl("CrashHandler", "CrashHandler  DefaultCrashHandler before: " + (defaultUncaughtExceptionHandler != null ? defaultUncaughtExceptionHandler.getClass().getName() : null));
            java.lang.Thread.setDefaultUncaughtExceptionHandler(this);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.AEQbTJ;
            pUU.KWHzl("CrashHandler", "CrashHandler  DefaultCrashHandler after: " + (uncaughtExceptionHandler != null ? uncaughtExceptionHandler.getClass().getName() : null));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [74=4, 77=4] */
    /* JADX DEBUG: Incorrect finally slice size: {[IGET, CONST] complete}, expected: {[IGET] complete} */
    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NotNull java.lang.Thread thread, @NotNull java.lang.Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandlerNextUnHandler;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2;
        Intrinsics.checkNotNullParameter(thread, "");
        Intrinsics.checkNotNullParameter(th, "");
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.AEQbTJ;
        pUU.copydefault("CrashHandler", "CrashHandler DefaultCrashHandler=>" + (uncaughtExceptionHandler3 != null ? uncaughtExceptionHandler3.getClass().getName() : null) + " ");
        pUU.copydefault("CrashHandler", "CrashHandler ex=>" + th.getClass().getName() + " ");
        C6769aVd.OLrzqt.values();
        if (AEQbTJ(th)) {
            pUU.valueOf("CrashHandler", "CrashHandler isGMSSecurityException, ignore it.");
            return;
        }
        boolean zKWHzl = C6768aVc.copydefault.KWHzl(th);
        try {
            pUU.copydefault("CrashHandler", "isExceptionFromGuard:" + zKWHzl);
            pUU.copydefault("CrashHandler", "stacktrace:" + OLrzqt(th));
            EZpvd();
            if (!zKWHzl) {
                valueOf(th);
                AYXKKw(th);
            }
            pUU.EZpvd(true);
            uncaughtExceptionHandler2 = this.AEQbTJ;
        } catch (java.lang.Throwable th2) {
            try {
                pUU.copydefault("CrashHandler", "CrashHandler uncaughtException e:" + th2.getMessage());
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = this.AEQbTJ;
                if (uncaughtExceptionHandler4 != null && uncaughtExceptionHandler4 != java.lang.Thread.getDefaultUncaughtExceptionHandler()) {
                    if (!zKWHzl) {
                        Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = this.AEQbTJ;
                        pUU.copydefault("CrashHandler", "delivery next UncaughtExceptionHandler:" + (uncaughtExceptionHandler5 != null ? uncaughtExceptionHandler5.getClass().getName() : null));
                        uncaughtExceptionHandler = this.AEQbTJ;
                        if (uncaughtExceptionHandler == null) {
                            return;
                        }
                        uncaughtExceptionHandler.uncaughtException(thread, copydefault(th));
                        return;
                    }
                    uncaughtExceptionHandlerNextUnHandler = CrashlyticsUtils.nextUnHandler(this.AEQbTJ);
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = this.AEQbTJ;
                    pUU.copydefault("CrashHandler", "UncaughtExceptionHandler:change \n" + (uncaughtExceptionHandler6 != null ? uncaughtExceptionHandler6.getClass().getName() : null) + " \nto \n" + (uncaughtExceptionHandlerNextUnHandler != null ? uncaughtExceptionHandlerNextUnHandler.getClass().getName() : null));
                    if (uncaughtExceptionHandlerNextUnHandler == null) {
                        return;
                    }
                }
                pUU.copydefault("CrashHandler", "stop delivery next UncaughtExceptionHandler");
                EZpvd(10);
            } catch (java.lang.Throwable th3) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = this.AEQbTJ;
                if (uncaughtExceptionHandler7 == null || uncaughtExceptionHandler7 == java.lang.Thread.getDefaultUncaughtExceptionHandler()) {
                    pUU.copydefault("CrashHandler", "stop delivery next UncaughtExceptionHandler");
                    EZpvd(10);
                } else if (zKWHzl) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandlerNextUnHandler2 = CrashlyticsUtils.nextUnHandler(this.AEQbTJ);
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = this.AEQbTJ;
                    pUU.copydefault("CrashHandler", "UncaughtExceptionHandler:change \n" + (uncaughtExceptionHandler8 != null ? uncaughtExceptionHandler8.getClass().getName() : null) + " \nto \n" + (uncaughtExceptionHandlerNextUnHandler2 != null ? uncaughtExceptionHandlerNextUnHandler2.getClass().getName() : null));
                    if (uncaughtExceptionHandlerNextUnHandler2 != null) {
                        uncaughtExceptionHandlerNextUnHandler2.uncaughtException(thread, th);
                    }
                } else {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = this.AEQbTJ;
                    pUU.copydefault("CrashHandler", "delivery next UncaughtExceptionHandler:" + (uncaughtExceptionHandler9 != null ? uncaughtExceptionHandler9.getClass().getName() : null));
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler10 = this.AEQbTJ;
                    if (uncaughtExceptionHandler10 != null) {
                        uncaughtExceptionHandler10.uncaughtException(thread, copydefault(th));
                    }
                }
                throw th3;
            }
        }
        if (uncaughtExceptionHandler2 != null && uncaughtExceptionHandler2 != java.lang.Thread.getDefaultUncaughtExceptionHandler()) {
            if (!zKWHzl) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler11 = this.AEQbTJ;
                pUU.copydefault("CrashHandler", "delivery next UncaughtExceptionHandler:" + (uncaughtExceptionHandler11 != null ? uncaughtExceptionHandler11.getClass().getName() : null));
                uncaughtExceptionHandler = this.AEQbTJ;
                if (uncaughtExceptionHandler == null) {
                    return;
                }
                uncaughtExceptionHandler.uncaughtException(thread, copydefault(th));
                return;
            }
            uncaughtExceptionHandlerNextUnHandler = CrashlyticsUtils.nextUnHandler(this.AEQbTJ);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler12 = this.AEQbTJ;
            pUU.copydefault("CrashHandler", "UncaughtExceptionHandler:change \n" + (uncaughtExceptionHandler12 != null ? uncaughtExceptionHandler12.getClass().getName() : null) + " \nto \n" + (uncaughtExceptionHandlerNextUnHandler != null ? uncaughtExceptionHandlerNextUnHandler.getClass().getName() : null));
            if (uncaughtExceptionHandlerNextUnHandler == null) {
                return;
            }
            uncaughtExceptionHandlerNextUnHandler.uncaughtException(thread, th);
            return;
        }
        pUU.copydefault("CrashHandler", "stop delivery next UncaughtExceptionHandler");
        EZpvd(10);
    }

    public final void EZpvd(@NotNull java.lang.Thread thread, @NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(thread, "");
        Intrinsics.checkNotNullParameter(th, "");
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.AEQbTJ;
        pUU.copydefault("CrashHandler", "CrashHandler DefaultCrashHandler=>" + (uncaughtExceptionHandler != null ? uncaughtExceptionHandler.getClass().getName() : null) + " ");
        pUU.copydefault("CrashHandler", "CrashHandler ex=>" + th.getClass().getName() + " ");
        C6769aVd.OLrzqt.values();
        if (AEQbTJ(th)) {
            pUU.valueOf("CrashHandler", "CrashHandler isGMSSecurityException, ignore it.");
            return;
        }
        boolean zKWHzl = C6768aVc.copydefault.KWHzl(th);
        try {
            pUU.copydefault("CrashHandler", "isExceptionFromGuard:" + zKWHzl);
            pUU.copydefault("CrashHandler", "stacktrace:" + OLrzqt(th));
            EZpvd();
            if (!zKWHzl) {
                valueOf(th);
                AYXKKw(th);
            }
            pUU.EZpvd(true);
        } finally {
            try {
            } finally {
            }
        }
    }

    public final boolean AEQbTJ(@NotNull java.lang.Throwable th) {
        java.lang.String message;
        Intrinsics.checkNotNullParameter(th, "");
        return (th instanceof java.lang.SecurityException) && (message = th.getMessage()) != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "OBSERVE_GRANT_REVOKE_PERMISSIONS", false, 2, (java.lang.Object) null) && EZpvd(th);
    }

    public final boolean EZpvd(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        java.lang.StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "");
        for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
            java.lang.String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "");
            if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) className, (java.lang.CharSequence) "com.google.android.gms", false, 2, (java.lang.Object) null)) {
                java.lang.String fileName = stackTraceElement.getFileName();
                Intrinsics.checkNotNullExpressionValue(fileName, "");
                if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) fileName, (java.lang.CharSequence) "com.google.android.gms", false, 2, (java.lang.Object) null)) {
                    java.lang.String className2 = stackTraceElement.getClassName();
                    Intrinsics.checkNotNullExpressionValue(className2, "");
                    StringsKt__StringsKt.contains$default((java.lang.CharSequence) className2, (java.lang.CharSequence) "dynamite_measurementdynamite", false, 2, (java.lang.Object) null);
                }
            }
            java.lang.String fileName2 = stackTraceElement.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName2, "");
            if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) fileName2, (java.lang.CharSequence) "dynamite_measurementdynamite", false, 2, (java.lang.Object) null)) {
                return true;
            }
        }
        return false;
    }

    public final void EZpvd() {
        java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> allStackTraces = java.lang.Thread.getAllStackTraces();
        java.util.ArrayList arrayList = new java.util.ArrayList(allStackTraces.size());
        java.util.Iterator<T> it = allStackTraces.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            java.lang.Thread thread = (java.lang.Thread) entry.getKey();
            java.lang.StackTraceElement[] stackTraceElementArr = (java.lang.StackTraceElement[]) entry.getValue();
            com.okinc.lib.dionysus.crash.bean.Thread thread2 = new com.okinc.lib.dionysus.crash.bean.Thread();
            thread2.setId(thread.getId());
            thread2.setName(thread.getName());
            Intrinsics.copydefault(stackTraceElementArr);
            thread2.setFrames(pII.AEQbTJ(stackTraceElementArr));
            arrayList.add(thread2);
        }
        Collections.sort(arrayList, new Application());
        pUU.copydefault("CrashHandler", "threads size:" + arrayList.size());
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            KWHzl("CrashHandler", "thread:" + ((com.okinc.lib.dionysus.crash.bean.Thread) it2.next()));
        }
    }

    /* JADX INFO: renamed from: o.aVa$Application */
    public static final class Application implements java.util.Comparator<com.okinc.lib.dionysus.crash.bean.Thread> {
        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public int compare(com.okinc.lib.dionysus.crash.bean.Thread thread, com.okinc.lib.dionysus.crash.bean.Thread thread2) {
            Intrinsics.checkNotNullParameter(thread, "");
            Intrinsics.checkNotNullParameter(thread2, "");
            java.lang.String name = thread.getName();
            java.lang.String name2 = thread2.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "");
            return name.compareTo(name2);
        }
    }

    public final void EZpvd(int i) {
        android.os.Process.killProcess(android.os.Process.myPid());
        java.lang.System.exit(i);
    }

    public final java.lang.String OLrzqt(java.lang.Throwable th) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
        if (th != null) {
            th.printStackTrace(printWriter);
        }
        while (th != null) {
            th = th.getCause();
            if (th != null) {
                th.printStackTrace(printWriter);
            }
        }
        return stringWriter.toString();
    }

    public final java.lang.Throwable copydefault(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (!(th instanceof OKServerException)) {
            return th;
        }
        OKServerException oKServerException = (OKServerException) th;
        if (oKServerException.getRequestUrl() == null) {
            return th;
        }
        return new OKServerException(oKServerException.getCode(), th.getMessage() + " : " + oKServerException.getRequestUrl(), null, null, 12, null);
    }

    public final void valueOf(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (KWHzl(th)) {
            pUU.copydefault("CrashHandler", "isOOMError true");
            EventData eventData = new EventData();
            eventData.setAct(EventAction.APP_OOM.getType());
            ReportManager.AEQbTJ.EZpvd(eventData);
        }
    }

    public final void AYXKKw(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        com.okinc.lib.dionysus.crash.bean.Exception exceptionKWHzl = pII.KWHzl(th, false);
        Intrinsics.checkNotNullExpressionValue(exceptionKWHzl, "");
        EventData eventData = new EventData();
        eventData.setAct(EventAction.APP_CRASH.getType());
        java.util.HashMap map = new java.util.HashMap();
        map.put("type", "1");
        map.put("isDeviceRooted", exceptionKWHzl.getType());
        map.put("isAppDebuggable", exceptionKWHzl.getMessage());
        map.put("isRunningInEmulator", C33490mxT.OLrzqt(exceptionKWHzl));
        eventData.setAttribute(map);
        pUU.copydefault("CrashHandler", "reportGrafanaEvent JavaCrash eventData=>" + eventData + " ");
        ReportManager.AEQbTJ.EZpvd(eventData);
    }

    public final boolean KWHzl(@NotNull java.lang.Throwable th) {
        java.lang.String message;
        Intrinsics.checkNotNullParameter(th, "");
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.add(th);
            th = th.getCause();
        }
        int size = linkedList.size();
        for (int i = 0; i < size; i++) {
            java.lang.Throwable th2 = (java.lang.Throwable) linkedList.get(i);
            java.lang.String name = th2.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) name, (java.lang.CharSequence) "OutOfMemoryError", false, 2, (java.lang.Object) null) || ((message = th2.getMessage()) != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "OOM", false, 2, (java.lang.Object) null))) {
                return true;
            }
        }
        return false;
    }

    public final void KWHzl(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        int length = str2.length();
        int i = this.OLrzqt;
        int i2 = 0;
        int i3 = 0;
        while (i2 < 100) {
            if (length > i) {
                java.lang.String strSubstring = str2.substring(i3, i);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                pUU.copydefault(str, strSubstring);
                i2++;
                i3 = i;
                i = this.OLrzqt + i;
            } else {
                java.lang.String strSubstring2 = str2.substring(i3, length);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                pUU.copydefault(str, strSubstring2);
                return;
            }
        }
    }
}
