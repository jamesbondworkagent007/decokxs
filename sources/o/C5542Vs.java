package o;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: o.Vs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5542Vs {
    public final java.lang.Object KWHzl = new java.lang.Object();
    public final java.util.Map<SoftReference<C5536Vm>, java.lang.Boolean> copydefault = new ConcurrentHashMap();
    public final ReferenceQueue<C5536Vm> AEQbTJ = new ReferenceQueue<>();

    public static C5542Vs KWHzl() {
        return TaskDescription.KWHzl;
    }

    public SoftReference<C5536Vm> OLrzqt(C5536Vm c5536Vm) {
        SoftReference<C5536Vm> softReference = new SoftReference<>(c5536Vm, this.AEQbTJ);
        this.copydefault.put(softReference, java.lang.Boolean.TRUE);
        copydefault();
        return softReference;
    }

    public final void copydefault() {
        while (true) {
            SoftReference softReference = (SoftReference) this.AEQbTJ.poll();
            if (softReference == null) {
                return;
            } else {
                this.copydefault.remove(softReference);
            }
        }
    }

    /* JADX INFO: renamed from: o.Vs$TaskDescription */
    public static final class TaskDescription {
        public static final C5542Vs KWHzl = new C5542Vs();

        private TaskDescription() {
        }
    }
}
