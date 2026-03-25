package o;

import java.util.LinkedList;

/* JADX INFO: renamed from: o.ytv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@java.lang.Deprecated
public class C58050ytv {
    public static final LinkedList<Application> AEQbTJ = new LinkedList<>();
    public long EZpvd;
    public int KWHzl;
    public java.util.concurrent.Executor OLrzqt;
    public final java.util.List<Application> copydefault = new LinkedList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.concurrent.Executor AEQbTJ() {
        return this.OLrzqt;
    }

    public void KWHzl(java.util.List<Application> list) {
    }

    public int OLrzqt() {
        return 0;
    }

    @java.lang.Deprecated
    public void OLrzqt(java.lang.String str, long j, long j2, int i, boolean z) {
    }

    @java.lang.Deprecated
    public void copydefault(java.lang.String str, long j, long j2, int i, boolean z) {
    }

    /* JADX INFO: renamed from: o.ytv$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application {
        public int AEQbTJ;
        public long AhwBna;
        public long EZpvd;
        public long KWHzl;
        public java.lang.String OLrzqt;
        public long copydefault;
        public boolean djBIcL;
        public long gEmmrt;
        public long valueOf;

        public void OLrzqt() {
            if (C58050ytv.AEQbTJ.size() <= 1000) {
                this.OLrzqt = "";
                this.AhwBna = 0L;
                this.copydefault = 0L;
                this.AEQbTJ = 0;
                this.djBIcL = false;
                this.gEmmrt = 0L;
                this.EZpvd = 0L;
                this.KWHzl = 0L;
                this.valueOf = 0L;
                synchronized (C58050ytv.AEQbTJ) {
                    C58050ytv.AEQbTJ.add(this);
                }
            }
        }

        public static Application copydefault() {
            Application application;
            synchronized (C58050ytv.AEQbTJ) {
                application = (Application) C58050ytv.AEQbTJ.poll();
            }
            return application == null ? new Application() : application;
        }
    }

    public C58050ytv() {
        this.KWHzl = 0;
        this.KWHzl = OLrzqt();
    }

    public void OLrzqt(java.lang.String str, long j, long j2, int i, boolean z, long j3, long j4, long j5, long j6) {
        Application applicationCopydefault = Application.copydefault();
        applicationCopydefault.OLrzqt = str;
        applicationCopydefault.AhwBna = j;
        applicationCopydefault.copydefault = j2;
        applicationCopydefault.AEQbTJ = i;
        applicationCopydefault.djBIcL = z;
        applicationCopydefault.gEmmrt = j3;
        applicationCopydefault.EZpvd = j4;
        applicationCopydefault.KWHzl = j5;
        applicationCopydefault.valueOf = j6;
        this.copydefault.add(applicationCopydefault);
        if (this.copydefault.size() < this.KWHzl || AEQbTJ() == null) {
            return;
        }
        final LinkedList linkedList = new LinkedList(this.copydefault);
        this.copydefault.clear();
        AEQbTJ().execute(new java.lang.Runnable() { // from class: o.ytv.1
            @Override // java.lang.Runnable
            public void run() {
                C58050ytv.this.KWHzl(linkedList);
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    ((Application) it.next()).OLrzqt();
                }
            }
        });
    }

    public void AEQbTJ(java.lang.String str, long j, long j2, int i, boolean z, long j3, long j4, long j5, long j6) {
        long j7 = (j2 - j3) / 1000000;
        copydefault(str, j7, j7, i, z);
    }

    public void EZpvd(java.lang.String str, long j, long j2, int i, boolean z, long j3, long j4, long j5, long j6) {
        long j7 = (j2 - j3) / 1000000;
        OLrzqt(str, j7, j7, i, z);
    }
}
