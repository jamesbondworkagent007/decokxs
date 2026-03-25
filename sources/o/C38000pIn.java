package o;

import android.os.Build;
import android.os.Handler;
import com.okinc.lib.dionysus.crash.bean.CrashData;
import java.lang.Thread;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C38002pIp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pIn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38000pIn implements Thread.UncaughtExceptionHandler {
    public pIK AEQbTJ;
    public final pIA KWHzl;
    public final android.content.Context OLrzqt;
    public Thread.UncaughtExceptionHandler copydefault;

    public C38000pIn(@NotNull android.content.Context context, @NotNull pIA pia) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(pia, "");
        this.OLrzqt = context;
        this.KWHzl = pia;
    }

    public final void AEQbTJ() {
        if (C38002pIp.Companion.AuCTel()) {
            copydefault();
        }
        if (java.lang.Thread.getDefaultUncaughtExceptionHandler() != this) {
            this.copydefault = java.lang.Thread.getDefaultUncaughtExceptionHandler();
            java.lang.Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NotNull java.lang.Thread thread, @NotNull java.lang.Throwable th) {
        java.lang.String str;
        CrashData crashData;
        Intrinsics.checkNotNullParameter(thread, "");
        Intrinsics.checkNotNullParameter(th, "");
        C38002pIp.Application application = C38002pIp.Companion;
        application.EZpvd(true);
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - application.copydefault();
        pIB pibOLrzqt = application.OLrzqt();
        boolean zCopydefault = pibOLrzqt != null ? pibOLrzqt.copydefault(th) : false;
        application.iwGUEr().OLrzqt("Dionysus", "isExceptionFromGuard:" + zCopydefault + " isStartUpFinish:" + application.getNewProxyInstance() + " isDebug:" + application.ejfBZ() + " appUseTime:" + jElapsedRealtime);
        if (!application.ejfBZ() && (!application.getNewProxyInstance() || zCopydefault)) {
            java.lang.String strValues = application.values();
            if (zCopydefault) {
                strValues = strValues + "_guard";
            }
            UUID uuidOLrzqt = pII.OLrzqt(strValues, thread, th, true);
            application.iwGUEr().OLrzqt("Dionysus", "startup crash:" + uuidOLrzqt);
            java.io.File fileAYXKKw = pIW.AYXKKw();
            try {
                java.lang.String strAEQbTJ = C38057pKq.AEQbTJ(fileAYXKKw);
                if (android.text.TextUtils.isEmpty(strAEQbTJ)) {
                    crashData = new CrashData();
                } else {
                    Intrinsics.copydefault((java.lang.Object) strAEQbTJ);
                    crashData = (CrashData) C33490mxT.EZpvd(strAEQbTJ, CrashData.class);
                    if (crashData == null) {
                        return;
                    }
                }
                try {
                    crashData.getCrashList().add(new CrashData.CrashInfo(java.lang.System.currentTimeMillis(), jElapsedRealtime, true, false, 0L));
                    java.lang.String strOLrzqt = C33490mxT.OLrzqt(crashData);
                    C38057pKq.KWHzl(fileAYXKKw);
                    C38057pKq.copydefault(fileAYXKKw, strOLrzqt);
                    str = "Dionysus";
                    try {
                        application.iwGUEr().OLrzqt(str, "uncaughtException record crashData:" + strOLrzqt);
                        Unit unit = Unit.INSTANCE;
                    } catch (java.lang.Exception e) {
                        e = e;
                        C38002pIp.Companion.iwGUEr().copydefault(str, "CrashHandler uncaughtException ", e);
                        C38057pKq.KWHzl(pIW.AYXKKw());
                    }
                } catch (java.lang.Exception e2) {
                    e = e2;
                    str = "Dionysus";
                }
            } catch (java.lang.Exception e3) {
                e = e3;
                str = "Dionysus";
            }
        } else {
            UUID uuidOLrzqt2 = pII.OLrzqt(application.values(), thread, th, false);
            application.iwGUEr().OLrzqt("Dionysus", "uncaughtException normal crash:" + uuidOLrzqt2);
        }
        pIA pia = this.KWHzl;
        if (pia != null) {
            Intrinsics.copydefault(pia);
            pia.AEQbTJ(thread, th);
        }
        if (thread == android.os.Looper.getMainLooper().getThread()) {
            AEQbTJ(th);
            EZpvd(thread, th);
        }
    }

    public final void copydefault() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.AEQbTJ = new pIL();
        } else if (i >= 26) {
            this.AEQbTJ = new pIH();
        } else if (i == 25) {
            this.AEQbTJ = new pID();
        }
        try {
            KWHzl();
        } catch (java.lang.Throwable unused) {
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:10:0x0011 */
    public final void AEQbTJ(java.lang.Throwable th) {
        java.lang.StackTraceElement[] stackTrace;
        if (th == null || this.KWHzl == null || (stackTrace = th.getStackTrace()) == null) {
            return;
        }
        int length = stackTrace.length;
        while (true) {
            length--;
            if (-1 >= length || stackTrace.length - length > 20) {
                return;
            }
            java.lang.StackTraceElement stackTraceElement = stackTrace[length];
            if (Intrinsics.EZpvd((java.lang.Object) "android.view.Choreographer", (java.lang.Object) stackTraceElement.getClassName()) && Intrinsics.EZpvd((java.lang.Object) "Choreographer.java", (java.lang.Object) stackTraceElement.getFileName()) && Intrinsics.EZpvd((java.lang.Object) "doFrame", (java.lang.Object) stackTraceElement.getMethodName())) {
                pIA pia = this.KWHzl;
                Intrinsics.copydefault(pia);
                pia.AYXKKw(th);
                return;
            }
        }
    }

    public final void KWHzl() throws java.lang.Exception {
        java.lang.Class<?> cls = java.lang.Class.forName("android.app.ActivityThread");
        java.lang.Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        java.lang.reflect.Field declaredField = cls.getDeclaredField("mH");
        Intrinsics.checkNotNullExpressionValue(declaredField, "");
        declaredField.setAccessible(true);
        java.lang.Object obj = declaredField.get(objInvoke);
        Intrinsics.copydefault(obj, "");
        android.os.Handler handler = (android.os.Handler) obj;
        java.lang.reflect.Field declaredField2 = android.os.Handler.class.getDeclaredField("mCallback");
        Intrinsics.checkNotNullExpressionValue(declaredField2, "");
        declaredField2.setAccessible(true);
        declaredField2.set(handler, new Activity(handler, this, 100, 107, 102, 101, 104, 109));
    }

    /* JADX INFO: renamed from: o.pIn$Activity */
    public static final class Activity implements Handler.Callback {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ int copydefault;
        public final /* synthetic */ int djBIcL;
        public final /* synthetic */ android.os.Handler gEmmrt;
        public final /* synthetic */ C38000pIn valueOf;

        public Activity(android.os.Handler handler, C38000pIn c38000pIn, int i, int i2, int i3, int i4, int i5, int i6) {
            this.gEmmrt = handler;
            this.valueOf = c38000pIn;
            this.copydefault = i;
            this.AEQbTJ = i2;
            this.KWHzl = i3;
            this.EZpvd = i4;
            this.djBIcL = i5;
            this.OLrzqt = i6;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            Intrinsics.checkNotNullParameter(message, "");
            if (Build.VERSION.SDK_INT >= 28) {
                if (message.what != 159) {
                    return false;
                }
                try {
                    this.gEmmrt.handleMessage(message);
                } catch (java.lang.Throwable th) {
                    pIK pik = this.valueOf.AEQbTJ;
                    Intrinsics.copydefault(pik);
                    pik.AEQbTJ(message);
                    this.valueOf.copydefault(th);
                }
                return true;
            }
            int i = message.what;
            if (i == this.copydefault) {
                try {
                    this.gEmmrt.handleMessage(message);
                } catch (java.lang.Throwable th2) {
                    pIK pik2 = this.valueOf.AEQbTJ;
                    Intrinsics.copydefault(pik2);
                    pik2.AEQbTJ(message);
                    this.valueOf.copydefault(th2);
                }
                return true;
            }
            if (i == this.AEQbTJ) {
                try {
                    this.gEmmrt.handleMessage(message);
                } catch (java.lang.Throwable th3) {
                    pIK pik3 = this.valueOf.AEQbTJ;
                    Intrinsics.copydefault(pik3);
                    pik3.copydefault(message);
                    this.valueOf.copydefault(th3);
                }
                return true;
            }
            if (i == this.KWHzl) {
                try {
                    this.gEmmrt.handleMessage(message);
                } catch (java.lang.Throwable th4) {
                    pIK pik4 = this.valueOf.AEQbTJ;
                    Intrinsics.copydefault(pik4);
                    pik4.OLrzqt(message);
                    this.valueOf.copydefault(th4);
                }
                return true;
            }
            if (i == this.EZpvd) {
                try {
                    this.gEmmrt.handleMessage(message);
                } catch (java.lang.Throwable th5) {
                    pIK pik5 = this.valueOf.AEQbTJ;
                    Intrinsics.copydefault(pik5);
                    pik5.OLrzqt(message);
                    this.valueOf.copydefault(th5);
                }
                return true;
            }
            if (i != this.djBIcL) {
                if (i != this.OLrzqt) {
                    return false;
                }
                try {
                    this.gEmmrt.handleMessage(message);
                } catch (java.lang.Throwable th6) {
                    this.valueOf.copydefault(th6);
                }
                return true;
            }
            try {
                this.gEmmrt.handleMessage(message);
            } catch (java.lang.Throwable th7) {
                pIK pik6 = this.valueOf.AEQbTJ;
                Intrinsics.copydefault(pik6);
                pik6.EZpvd(message);
                this.valueOf.copydefault(th7);
            }
            return true;
        }
    }

    public final void copydefault(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        pIF.log$default("======> notifyException: " + th.getMessage(), true, null, null, 6, null);
        if (this.KWHzl == null) {
            return;
        }
        C38002pIp.Application application = C38002pIp.Companion;
        if (application.ejfBZ()) {
            UUID uuidOLrzqt = pII.OLrzqt(application.values(), java.lang.Thread.currentThread(), th, false);
            application.iwGUEr().OLrzqt("Dionysus", "notifyException normal crash:" + uuidOLrzqt);
        }
        if (application.fJNWhG()) {
            pIA pia = this.KWHzl;
            Intrinsics.copydefault(pia);
            pia.copydefault(th);
        } else {
            pIA pia2 = this.KWHzl;
            Intrinsics.copydefault(pia2);
            pia2.AEQbTJ(android.os.Looper.getMainLooper().getThread(), th);
            EZpvd(null, th);
        }
    }

    public final void EZpvd(java.lang.Thread thread, java.lang.Throwable th) {
        C38002pIp.Application application = C38002pIp.Companion;
        pIF.log$default("---> safeMode <--- enable=" + application.AuCTel() + ", message: " + th.getMessage(), true, null, null, 6, null);
        if (!application.AuCTel()) {
            if (thread != null) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.copydefault;
                if (uncaughtExceptionHandler == null) {
                    copydefault(10);
                    return;
                } else {
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        application.OLrzqt(true);
        this.KWHzl.AEQbTJ(th);
        while (true) {
            try {
                android.os.Looper.loop();
            } catch (java.lang.Throwable th2) {
                AEQbTJ(th2);
                if (this.KWHzl != null) {
                    pIA pia = this.KWHzl;
                    Intrinsics.copydefault(pia);
                    pia.copydefault(th2);
                }
            }
        }
    }

    public final void copydefault(int i) {
        android.os.Process.killProcess(android.os.Process.myPid());
        java.lang.System.exit(i);
        throw new java.lang.RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
