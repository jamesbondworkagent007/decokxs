package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: o.Di, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5064Di {
    public volatile /* synthetic */ int OLrzqt;
    public final int djBIcL;
    public static final /* synthetic */ AtomicIntegerFieldUpdater KWHzl = AtomicIntegerFieldUpdater.newUpdater(C5064Di.class, "copydefault");
    public static final /* synthetic */ AtomicIntegerFieldUpdater EZpvd = AtomicIntegerFieldUpdater.newUpdater(C5064Di.class, "OLrzqt");
    public static final /* synthetic */ AtomicIntegerFieldUpdater AEQbTJ = AtomicIntegerFieldUpdater.newUpdater(C5064Di.class, "AhwBna");
    public volatile /* synthetic */ int copydefault = 0;
    public volatile /* synthetic */ int AhwBna = 0;

    public C5064Di(int i) {
        this.djBIcL = i;
        this.OLrzqt = i;
    }

    public java.lang.String toString() {
        return "BufferCapacity(availableForRead: " + this.copydefault + ", availableForWrite: " + this.OLrzqt + ", pendingFlush: " + this.AhwBna + ", capacity: " + this.djBIcL + ')';
    }

    public final boolean OLrzqt() {
        int andSet = AEQbTJ.getAndSet(this, 0);
        return andSet == 0 ? this.copydefault > 0 : KWHzl.addAndGet(this, andSet) > 0;
    }

    public final void OLrzqt(int i) {
        EZpvd.getAndAdd(this, -i);
        AEQbTJ.getAndAdd(this, i);
    }

    public final void EZpvd(int i) {
        KWHzl.getAndAdd(this, -i);
        EZpvd.getAndAdd(this, i);
    }
}
