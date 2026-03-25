package o;

import java.util.Collections;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: o.ytI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C58011ytI {
    public static volatile android.os.HandlerThread AEQbTJ;
    public static volatile android.os.Handler OLrzqt;
    public static volatile android.os.Handler KWHzl = new android.os.Handler(android.os.Looper.getMainLooper());
    public static java.util.HashSet<android.os.HandlerThread> EZpvd = new java.util.HashSet<>();
    public static boolean copydefault = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static android.os.Handler OLrzqt() {
        return KWHzl;
    }

    public static android.os.HandlerThread copydefault() {
        android.os.HandlerThread handlerThread;
        synchronized (C58011ytI.class) {
            if (AEQbTJ == null) {
                AEQbTJ = new android.os.HandlerThread("default_matrix_thread");
                AEQbTJ.start();
                OLrzqt = new android.os.Handler(AEQbTJ.getLooper());
                AEQbTJ.getLooper().setMessageLogging(copydefault ? new ActionBar() : null);
                C58013ytK.AEQbTJ("Matrix.HandlerThread", "create default handler thread, we should use these thread normal, isDebug:%s", java.lang.Boolean.valueOf(copydefault));
            }
            handlerThread = AEQbTJ;
        }
        return handlerThread;
    }

    public static android.os.Handler AEQbTJ() {
        if (OLrzqt == null) {
            copydefault();
        }
        return OLrzqt;
    }

    public static android.os.HandlerThread AEQbTJ(java.lang.String str, int i) {
        android.os.HandlerThread handlerThread;
        synchronized (C58011ytI.class) {
            java.util.Iterator<android.os.HandlerThread> it = EZpvd.iterator();
            while (it.hasNext()) {
                if (!it.next().isAlive()) {
                    it.remove();
                    C58013ytK.AEQbTJ("Matrix.HandlerThread", "warning: remove dead handler thread with name %s", str);
                }
            }
            handlerThread = new android.os.HandlerThread(str);
            handlerThread.setPriority(i);
            handlerThread.start();
            EZpvd.add(handlerThread);
            C58013ytK.AEQbTJ("Matrix.HandlerThread", "warning: create new handler thread with name %s, alive thread size:%d", str, java.lang.Integer.valueOf(EZpvd.size()));
        }
        return handlerThread;
    }

    /* JADX INFO: renamed from: o.ytI$ActionBar */
    public static final class ActionBar implements android.util.Printer, InterfaceC58036yth {
        public boolean AEQbTJ;
        public ConcurrentHashMap<java.lang.String, Application> EZpvd = new ConcurrentHashMap<>();

        public ActionBar() {
            C58001ysz c58001ysz = C58001ysz.AEQbTJ;
            c58001ysz.KWHzl(this);
            this.AEQbTJ = c58001ysz.ejfBZ();
        }

        @Override // android.util.Printer
        public void println(java.lang.String str) {
            if (!this.AEQbTJ && str.charAt(0) == '>') {
                int iIndexOf = str.indexOf("} ");
                int iIndexOf2 = str.indexOf("@", iIndexOf);
                if (iIndexOf < 0 || iIndexOf2 < 0) {
                    return;
                }
                java.lang.String strSubstring = str.substring(iIndexOf, iIndexOf2);
                Application application = this.EZpvd.get(strSubstring);
                if (application == null) {
                    application = new Application();
                    application.AEQbTJ = strSubstring;
                    this.EZpvd.put(strSubstring, application);
                }
                application.OLrzqt++;
            }
        }

        @Override // o.InterfaceC58036yth
        public void copydefault(boolean z) {
            this.AEQbTJ = z;
            if (z) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                LinkedList linkedList = new LinkedList();
                for (Application application : this.EZpvd.values()) {
                    if (application.OLrzqt > 1) {
                        linkedList.add(application);
                    }
                }
                Collections.sort(linkedList, new java.util.Comparator<Application>() { // from class: o.ytI.ActionBar.5
                    /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
                    @Override // java.util.Comparator
                    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                    public int compare(Application application2, Application application3) {
                        return application3.OLrzqt - application2.OLrzqt;
                    }
                });
                this.EZpvd.clear();
                if (linkedList.isEmpty()) {
                    return;
                }
                C58013ytK.EZpvd("Matrix.HandlerThread", "matrix default thread has exec in background! %s cost:%s", linkedList, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
                return;
            }
            this.EZpvd.clear();
        }

        /* JADX INFO: renamed from: o.ytI$ActionBar$Application */
        public class Application {
            public java.lang.String AEQbTJ;
            public int OLrzqt;

            public Application() {
            }

            public java.lang.String toString() {
                return this.AEQbTJ + ":" + this.OLrzqt;
            }
        }
    }
}
