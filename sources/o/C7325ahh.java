package o;

import com.immomo.mls.adapter.MLSThreadAdapter;
import o.C8010aue;

/* JADX INFO: renamed from: o.ahh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7325ahh {
    public InterfaceC7340ahw EZpvd;
    public final C8010aue djBIcL;
    public int AhwBna = 0;
    public boolean KWHzl = false;
    public int OLrzqt = 0;
    public final java.util.List<C8010aue.AssistContent> values = new java.util.ArrayList();
    public final java.util.List<C8010aue.LoaderManager> AYXKKw = new java.util.ArrayList();
    public final java.util.List<java.lang.Class> AEQbTJ = new java.util.ArrayList();
    public final java.util.List<Application> AkhnZx = new java.util.ArrayList();
    public final java.util.List<TaskDescription> copydefault = new java.util.ArrayList();
    public final java.util.List<C8010aue.Fragment> gEmmrt = new java.util.ArrayList();
    public final java.util.List<C8010aue.TaskDescription> valueOf = new java.util.ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7325ahh AEQbTJ(InterfaceC7340ahw interfaceC7340ahw) {
        this.EZpvd = interfaceC7340ahw;
        return this;
    }

    public C7325ahh(C8010aue c8010aue) {
        this.djBIcL = c8010aue;
    }

    public C7325ahh KWHzl(InterfaceC7298ahG interfaceC7298ahG) {
        C7323ahf.KWHzl(interfaceC7298ahG);
        return this;
    }

    public C7325ahh AEQbTJ(InterfaceC7855arh interfaceC7855arh) {
        C7323ahf.AEQbTJ(interfaceC7855arh);
        return this;
    }

    public C7325ahh KWHzl(C8010aue.Fragment... fragmentArr) {
        this.gEmmrt.addAll(java.util.Arrays.asList(fragmentArr));
        return this;
    }

    public C7325ahh AEQbTJ(C8010aue.AssistContent... assistContentArr) {
        this.values.addAll(java.util.Arrays.asList(assistContentArr));
        return this;
    }

    public C7325ahh AEQbTJ(C8010aue.LoaderManager... loaderManagerArr) {
        this.AYXKKw.addAll(java.util.Arrays.asList(loaderManagerArr));
        return this;
    }

    public C7325ahh KWHzl(java.lang.Class... clsArr) {
        this.AEQbTJ.addAll(java.util.Arrays.asList(clsArr));
        return this;
    }

    public C7325ahh EZpvd(Application... applicationArr) {
        this.AkhnZx.addAll(java.util.Arrays.asList(applicationArr));
        return this;
    }

    public C7325ahh EZpvd(TaskDescription... taskDescriptionArr) {
        this.copydefault.addAll(java.util.Arrays.asList(taskDescriptionArr));
        return this;
    }

    public C7325ahh AEQbTJ(C7791aqW c7791aqW) {
        C7788aqT.copydefault(c7791aqW);
        return this;
    }

    public C7325ahh copydefault(boolean z) {
        C7330ahm.AhwBna = z;
        return this;
    }

    public void AEQbTJ(boolean z) {
        if (z) {
            OLrzqt();
        } else {
            C7323ahf.isConnected().KWHzl(MLSThreadAdapter.Priority.HIGH, new java.lang.Runnable() { // from class: o.ahh.4
                @Override // java.lang.Runnable
                public void run() {
                    C7325ahh.this.OLrzqt();
                }
            });
        }
    }

    public final void OLrzqt() {
        C7326ahi.OLrzqt(this);
        if (this.KWHzl) {
            this.djBIcL.OLrzqt();
            C8017aul.AEQbTJ();
            return;
        }
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        java.util.Iterator<C8010aue.AssistContent> it = this.values.iterator();
        while (it.hasNext()) {
            this.djBIcL.AEQbTJ(it.next());
        }
        java.util.Iterator<C8010aue.Fragment> it2 = this.gEmmrt.iterator();
        while (it2.hasNext()) {
            this.djBIcL.OLrzqt(it2.next());
        }
        java.util.Iterator<C8010aue.TaskDescription> it3 = this.valueOf.iterator();
        while (it3.hasNext()) {
            this.djBIcL.copydefault(it3.next());
        }
        java.util.Iterator<C8010aue.LoaderManager> it4 = this.AYXKKw.iterator();
        while (it4.hasNext()) {
            this.djBIcL.AEQbTJ(it4.next());
        }
        java.util.Iterator<java.lang.Class> it5 = this.AEQbTJ.iterator();
        while (it5.hasNext()) {
            this.djBIcL.OLrzqt(it5.next());
        }
        for (Application application : this.AkhnZx) {
            this.djBIcL.AEQbTJ(application.AEQbTJ, application.KWHzl, application.EZpvd);
        }
        for (TaskDescription taskDescription : this.copydefault) {
            if (taskDescription.KWHzl) {
                C8017aul.KWHzl(taskDescription.EZpvd);
            } else {
                InterfaceC8012aug interfaceC8012aug = taskDescription.AEQbTJ;
                if (interfaceC8012aug != null) {
                    C8017aul.OLrzqt(taskDescription.EZpvd, interfaceC8012aug);
                }
            }
            if (taskDescription.copydefault) {
                C8017aul.copydefault(taskDescription.EZpvd);
            } else {
                InterfaceC8009aud interfaceC8009aud = taskDescription.OLrzqt;
                if (interfaceC8009aud != null) {
                    C8017aul.copydefault(taskDescription.EZpvd, interfaceC8009aud);
                }
            }
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: o.ahh.3
            @Override // java.lang.Runnable
            public void run() {
                long jUptimeMillis2 = android.os.SystemClock.uptimeMillis();
                if (C7337aht.KWHzl() == 0) {
                    C7337aht.copydefault(C7325ahh.this.AhwBna);
                }
                if (C7326ahi.EZpvd) {
                    C7323ahf.AEQbTJ().EZpvd("MLSBuilder", "pre init globals cast: %d", java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis() - jUptimeMillis2));
                }
                if (C7325ahh.this.EZpvd != null) {
                    C7325ahh.this.EZpvd.OLrzqt();
                }
            }
        };
        int i = this.OLrzqt;
        if (i <= 0) {
            C7840arS.copydefault(runnable);
        } else {
            C7840arS.KWHzl(this, runnable, i);
        }
        if (C7326ahi.EZpvd) {
            C7323ahf.AEQbTJ().EZpvd("MLSBuilder", "build cast: %d", java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis() - jUptimeMillis));
        }
    }

    /* JADX INFO: renamed from: o.ahh$Application */
    public static class Application {
        public java.lang.String AEQbTJ;
        public boolean EZpvd;
        public java.lang.Class KWHzl;

        public Application(java.lang.String str, java.lang.Class cls) {
            this.AEQbTJ = str;
            this.KWHzl = cls;
        }

        public Application(java.lang.String str, java.lang.Class cls, boolean z) {
            this.AEQbTJ = str;
            this.KWHzl = cls;
            this.EZpvd = z;
        }
    }

    /* JADX INFO: renamed from: o.ahh$TaskDescription */
    public static class TaskDescription {
        public InterfaceC8012aug AEQbTJ;
        public java.lang.Class EZpvd;
        public boolean KWHzl;
        public InterfaceC8009aud OLrzqt;
        public boolean copydefault;

        public TaskDescription(java.lang.Class cls, InterfaceC8012aug interfaceC8012aug, InterfaceC8009aud interfaceC8009aud) {
            this.EZpvd = cls;
            this.OLrzqt = interfaceC8009aud;
            this.AEQbTJ = interfaceC8012aug;
            this.KWHzl = false;
            this.copydefault = false;
        }

        public TaskDescription(java.lang.Class cls) {
            this.KWHzl = true;
            this.copydefault = true;
            this.EZpvd = cls;
        }

        public TaskDescription(java.lang.Class cls, InterfaceC8012aug interfaceC8012aug, boolean z) {
            this(cls, interfaceC8012aug, (InterfaceC8009aud) null);
            this.copydefault = z;
        }

        public TaskDescription(java.lang.Class cls, InterfaceC8009aud interfaceC8009aud, boolean z) {
            this(cls, (InterfaceC8012aug) null, interfaceC8009aud);
            this.KWHzl = z;
        }
    }
}
