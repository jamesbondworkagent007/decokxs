package o;

import android.os.MessageQueue;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.ytp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C58044ytp implements MessageQueue.IdleHandler {
    public static final android.os.HandlerThread EZpvd;
    public static boolean OLrzqt;
    public static final android.os.Handler copydefault;
    public Activity fetchVPNInfo;
    public android.os.Looper isConnected;
    public static final java.util.Map<android.os.Looper, C58044ytp> AEQbTJ = new ConcurrentHashMap();
    public static final C58044ytp KWHzl = AEQbTJ(android.os.Looper.getMainLooper());
    public final Queue<ActionBar> gEmmrt = new ConcurrentLinkedQueue();
    public final Queue<ActionBar> fARcdN = new ConcurrentLinkedQueue();
    public long DbNXlk = 0;
    public java.lang.String valueOf = "";
    public long fIwbmz = 0;
    public long fJNWhG = 0;
    public boolean AYXKKw = false;
    public boolean djBIcL = false;

    @java.lang.Deprecated
    public final java.util.HashSet<StateListAnimator> AkhnZx = new java.util.HashSet<>();
    public final java.util.Map<InterfaceC58051ytw, Application> values = new java.util.HashMap();
    public long AhwBna = 0;

    static {
        android.os.HandlerThread handlerThreadAEQbTJ = C58011ytI.AEQbTJ("historyMsgHandlerThread", 5);
        EZpvd = handlerThreadAEQbTJ;
        copydefault = new android.os.Handler(handlerThreadAEQbTJ.getLooper());
        OLrzqt = false;
    }

    /* JADX INFO: renamed from: o.ytp$StateListAnimator */
    @java.lang.Deprecated
    public static abstract class StateListAnimator {
        public boolean EZpvd;
        public boolean OLrzqt;
        public boolean copydefault;

        public void KWHzl() {
        }

        public void OLrzqt() {
        }

        public boolean copydefault() {
            return false;
        }

        public StateListAnimator(boolean z, boolean z2) {
            this.EZpvd = false;
            this.copydefault = z;
            this.OLrzqt = z2;
        }

        public StateListAnimator() {
            this.EZpvd = false;
            this.copydefault = false;
            this.OLrzqt = false;
        }

        public void copydefault(java.lang.String str) {
            if (this.EZpvd) {
                return;
            }
            this.EZpvd = true;
            OLrzqt();
        }

        public void OLrzqt(java.lang.String str) {
            if (this.EZpvd) {
                this.EZpvd = false;
                KWHzl();
            }
        }
    }

    /* JADX INFO: renamed from: o.ytp$Application */
    public static final class Application {
        public final InterfaceC58051ytw EZpvd;
        public long KWHzl;
        public boolean copydefault = false;

        public Application(InterfaceC58051ytw interfaceC58051ytw) {
            this.EZpvd = interfaceC58051ytw;
        }

        public boolean copydefault() {
            return this.EZpvd.OLrzqt();
        }

        public void AEQbTJ(java.lang.String str) {
            if (this.copydefault) {
                return;
            }
            this.copydefault = true;
            this.KWHzl = java.lang.System.nanoTime();
            this.EZpvd.KWHzl(str);
        }

        public void OLrzqt(java.lang.String str) {
            if (this.copydefault) {
                this.copydefault = false;
                this.EZpvd.KWHzl(str, this.KWHzl, java.lang.System.nanoTime());
            }
        }
    }

    public static C58044ytp AEQbTJ(@androidx.annotation.NonNull android.os.Looper looper) {
        java.util.Map<android.os.Looper, C58044ytp> map = AEQbTJ;
        C58044ytp c58044ytp = map.get(looper);
        if (c58044ytp != null) {
            return c58044ytp;
        }
        C58044ytp c58044ytp2 = new C58044ytp(looper);
        map.put(looper, c58044ytp2);
        return c58044ytp2;
    }

    @java.lang.Deprecated
    public static void copydefault(StateListAnimator stateListAnimator) {
        KWHzl.AEQbTJ(stateListAnimator);
    }

    public static void AEQbTJ(InterfaceC58051ytw interfaceC58051ytw) {
        KWHzl.KWHzl(interfaceC58051ytw);
    }

    public static void copydefault(InterfaceC58051ytw interfaceC58051ytw) {
        KWHzl.OLrzqt(interfaceC58051ytw);
    }

    @java.lang.Deprecated
    public void AEQbTJ(StateListAnimator stateListAnimator) {
        synchronized (this.AkhnZx) {
            this.AkhnZx.add(stateListAnimator);
        }
    }

    public void KWHzl(InterfaceC58051ytw interfaceC58051ytw) {
        synchronized (this.values) {
            this.values.put(interfaceC58051ytw, new Application(interfaceC58051ytw));
        }
    }

    public void OLrzqt(InterfaceC58051ytw interfaceC58051ytw) {
        synchronized (this.values) {
            this.values.remove(interfaceC58051ytw);
        }
    }

    public C58044ytp(android.os.Looper looper) {
        Objects.requireNonNull(looper);
        this.isConnected = looper;
        copydefault();
        EZpvd(looper);
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        if (android.os.SystemClock.uptimeMillis() - this.AhwBna < 60000) {
            return true;
        }
        copydefault();
        this.AhwBna = android.os.SystemClock.uptimeMillis();
        return true;
    }

    public final void copydefault() {
        synchronized (this) {
            android.util.Printer printer = null;
            try {
                if (!OLrzqt) {
                    android.util.Printer printer2 = (android.util.Printer) C58020ytR.KWHzl(this.isConnected.getClass(), "mLogging", (java.lang.Object) this.isConnected);
                    try {
                        Activity activity = this.fetchVPNInfo;
                        if (printer2 == activity && activity != null) {
                            return;
                        }
                        if (printer2 != null && activity != null && printer2.getClass().getName().equals(this.fetchVPNInfo.getClass().getName())) {
                            C58013ytK.AEQbTJ("Matrix.LooperMonitor", "LooperPrinter might be loaded by different classloader, my = " + this.fetchVPNInfo.getClass().getClassLoader() + ", other = " + printer2.getClass().getClassLoader(), new java.lang.Object[0]);
                            return;
                        }
                        printer = printer2;
                    } catch (java.lang.Exception unused) {
                        printer = printer2;
                        OLrzqt = true;
                    }
                }
            } catch (java.lang.Exception unused2) {
            }
            if (this.fetchVPNInfo != null) {
                C58013ytK.AEQbTJ("Matrix.LooperMonitor", "maybe thread:%s printer[%s] was replace other[%s]!", this.isConnected.getThread().getName(), this.fetchVPNInfo, printer);
            }
            android.os.Looper looper = this.isConnected;
            Activity activity2 = new Activity(printer);
            this.fetchVPNInfo = activity2;
            looper.setMessageLogging(activity2);
            if (printer != null) {
                C58013ytK.EZpvd("Matrix.LooperMonitor", "reset printer, originPrinter[%s] in %s", printer, this.isConnected.getThread().getName());
            }
        }
    }

    public final void EZpvd(android.os.Looper looper) {
        synchronized (this) {
            looper.getQueue().addIdleHandler(this);
        }
    }

    /* JADX INFO: renamed from: o.ytp$Activity */
    public class Activity implements android.util.Printer {
        public android.util.Printer OLrzqt;
        public boolean KWHzl = false;
        public boolean AEQbTJ = false;

        public Activity(android.util.Printer printer) {
            this.OLrzqt = printer;
        }

        @Override // android.util.Printer
        public void println(java.lang.String str) {
            android.util.Printer printer = this.OLrzqt;
            if (printer != null) {
                printer.println(str);
                if (this.OLrzqt == this) {
                    throw new java.lang.RuntimeException("Matrix.LooperMonitor origin == this");
                }
            }
            if (!this.KWHzl) {
                boolean z = str.charAt(0) == '>' || str.charAt(0) == '<';
                this.AEQbTJ = z;
                this.KWHzl = true;
                if (!z) {
                    C58013ytK.OLrzqt("Matrix.LooperMonitor", "[println] Printer is inValid! x:%s", str);
                }
            }
            if (this.AEQbTJ) {
                C58044ytp.this.copydefault(str.charAt(0) == '>', str);
            }
        }
    }

    public final void copydefault(final java.lang.String str, final long j) {
        android.os.Handler handler = copydefault;
        handler.post(new java.lang.Runnable() { // from class: o.ytp.5
            @Override // java.lang.Runnable
            public void run() {
                C58044ytp.this.copydefault(new ActionBar(str, j));
            }
        });
        if (this.AYXKKw) {
            handler.post(new java.lang.Runnable() { // from class: o.ytp.3
                @Override // java.lang.Runnable
                public void run() {
                    C58044ytp.this.AEQbTJ(new ActionBar(str, j));
                }
            });
        }
    }

    public final void AEQbTJ(ActionBar actionBar) {
        if (this.fARcdN.size() == 5000) {
            this.fARcdN.poll();
        }
        this.fARcdN.offer(actionBar);
        this.fJNWhG += actionBar.KWHzl;
    }

    public final void copydefault(ActionBar actionBar) {
        if (this.gEmmrt.size() == 200) {
            this.gEmmrt.poll();
        }
        this.gEmmrt.offer(actionBar);
    }

    public final void copydefault(boolean z, java.lang.String str) {
        if (z) {
            if (this.djBIcL) {
                this.DbNXlk = java.lang.System.currentTimeMillis();
                this.valueOf = str;
                this.fIwbmz++;
            }
            synchronized (this.AkhnZx) {
                for (StateListAnimator stateListAnimator : this.AkhnZx) {
                    if (stateListAnimator.copydefault()) {
                        stateListAnimator.copydefault(str);
                    }
                }
            }
            synchronized (this.values) {
                for (Application application : this.values.values()) {
                    if (application.copydefault()) {
                        application.AEQbTJ(str);
                    }
                }
            }
            return;
        }
        if (this.djBIcL) {
            copydefault(str, java.lang.System.currentTimeMillis() - this.DbNXlk);
        }
        synchronized (this.AkhnZx) {
            for (StateListAnimator stateListAnimator2 : this.AkhnZx) {
                if (stateListAnimator2.copydefault()) {
                    stateListAnimator2.OLrzqt(str);
                }
            }
        }
        synchronized (this.values) {
            for (Application application2 : this.values.values()) {
                if (application2.copydefault()) {
                    application2.OLrzqt(str);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.ytp$ActionBar */
    /* JADX INFO: loaded from: classes17.dex */
    public static class ActionBar {
        public java.lang.String AEQbTJ;
        public long KWHzl;

        public ActionBar(java.lang.String str, long j) {
            this.AEQbTJ = str;
            this.KWHzl = j;
        }

        public java.lang.String toString() {
            return "{" + this.AEQbTJ + " -> " + this.KWHzl + AbstractJsonLexerKt.END_OBJ;
        }
    }
}
