package com.okinc.lib.monitor;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.util.Printer;
import java.util.Objects;
import o.C58020ytR;
import o.pUU;

/* JADX INFO: loaded from: classes9.dex */
public class LooperMonitor implements MessageQueue.IdleHandler {
    public static boolean OLrzqt = false;
    public static volatile LooperMonitor copydefault;
    public long AEQbTJ = 0;
    public long AYXKKw = 0;
    public Looper EZpvd;
    public Activity KWHzl;
    public Application gEmmrt;

    public interface Activity {
        void OLrzqt(Throwable th);

        void copydefault(String str, long j);
    }

    public void AEQbTJ(Looper looper, Activity activity) {
        Objects.requireNonNull(looper);
        this.EZpvd = looper;
        this.KWHzl = activity;
        copydefault();
    }

    private LooperMonitor() {
    }

    public static LooperMonitor OLrzqt() {
        if (copydefault == null) {
            synchronized (LooperMonitor.class) {
                if (copydefault == null) {
                    copydefault = new LooperMonitor();
                }
            }
        }
        return copydefault;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        if (SystemClock.uptimeMillis() - this.AEQbTJ < 60000) {
            return true;
        }
        copydefault();
        this.AEQbTJ = SystemClock.uptimeMillis();
        return true;
    }

    public final void OLrzqt(boolean z, String str) {
        if (z) {
            this.AYXKKw = System.currentTimeMillis();
        } else {
            KWHzl(str, System.currentTimeMillis() - this.AYXKKw);
        }
    }

    public final void KWHzl(String str, long j) {
        Activity activity = this.KWHzl;
        if (activity != null) {
            activity.copydefault(str, j);
        }
    }

    public void copydefault() {
        Printer printer;
        synchronized (this) {
            try {
                if (OLrzqt) {
                    printer = null;
                } else {
                    printer = (Printer) C58020ytR.KWHzl(this.EZpvd.getClass(), "mLogging", (Object) this.EZpvd);
                    Application application = this.gEmmrt;
                    if (printer == application && application != null) {
                        return;
                    }
                    if (printer != null && application != null && printer.getClass().getName().equals(this.gEmmrt.getClass().getName())) {
                        pUU.valueOf("Monitor.Looper", "LooperPrinter might be loaded by different classloader, my = " + this.gEmmrt.getClass().getClassLoader() + ", other = " + printer.getClass().getClassLoader());
                        return;
                    }
                }
                if (this.gEmmrt != null) {
                    pUU.valueOf("Monitor.Looper", String.format("maybe thread:%s printer[%s] was replace other[%s]!", this.EZpvd.getThread().getName(), this.gEmmrt, printer));
                }
                Looper looper = this.EZpvd;
                Application application2 = new Application(printer);
                this.gEmmrt = application2;
                looper.setMessageLogging(application2);
                if (printer != null) {
                    pUU.KWHzl("Monitor.Looper", String.format("reset printer, originPrinter[%s] in %s", printer, this.EZpvd.getThread().getName()));
                }
            } catch (Exception e) {
                OLrzqt = true;
                pUU.AEQbTJ("Monitor.Looper", "[resetPrinter] Reflect Logging fail error:", e);
                Activity activity = this.KWHzl;
                if (activity != null) {
                    activity.OLrzqt(new ReflectLoggingError(String.format("%s[ %s ]", e.getClass().getName(), e.getMessage())));
                }
            }
        }
    }

    public static class ReflectLoggingError extends Exception {
        public ReflectLoggingError(String str) {
            super(str);
        }
    }

    public class Application implements Printer {
        public Printer copydefault;
        public boolean KWHzl = false;
        public boolean AEQbTJ = false;

        public Application(Printer printer) {
            this.copydefault = printer;
        }

        @Override // android.util.Printer
        public void println(String str) {
            Printer printer = this.copydefault;
            if (printer != null) {
                printer.println(str);
                if (this.copydefault == this) {
                    throw new RuntimeException("Monitor.Looper origin == this");
                }
            }
            if (!this.KWHzl) {
                boolean z = str.charAt(0) == '>' || str.charAt(0) == '<';
                this.AEQbTJ = z;
                this.KWHzl = true;
                if (!z) {
                    pUU.copydefault("Monitor.Looper", "[println] Printer is inValid! x:" + str);
                }
            }
            if (this.AEQbTJ) {
                LooperMonitor.this.OLrzqt(str.charAt(0) == '>', str);
            }
        }
    }
}
