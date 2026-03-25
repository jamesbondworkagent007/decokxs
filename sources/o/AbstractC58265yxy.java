package o;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: o.yxy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC58265yxy implements InterfaceC58217yxC {
    public final AtomicBoolean OLrzqt = new AtomicBoolean();

    public abstract void OLrzqt();

    @Override // o.InterfaceC58217yxC
    public final boolean isDisposed() {
        return this.OLrzqt.get();
    }

    @Override // o.InterfaceC58217yxC
    public final void dispose() {
        if (this.OLrzqt.compareAndSet(false, true)) {
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                OLrzqt();
            } else {
                C58266yxz.OLrzqt().scheduleDirect(new java.lang.Runnable() { // from class: o.yxy.4
                    @Override // java.lang.Runnable
                    public void run() {
                        AbstractC58265yxy.this.OLrzqt();
                    }
                });
            }
        }
    }
}
