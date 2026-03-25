package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oWL implements java.lang.Runnable {
    public int AEQbTJ;
    public volatile boolean EZpvd;
    public oWN KWHzl;
    public final android.widget.Scroller OLrzqt;
    public final C36250oUv copydefault;

    public oWL(@NotNull C36250oUv c36250oUv) {
        Intrinsics.checkNotNullParameter(c36250oUv, "");
        this.copydefault = c36250oUv;
        this.OLrzqt = new android.widget.Scroller(c36250oUv.getContext());
    }

    public final boolean OLrzqt() {
        boolean z;
        synchronized (this) {
            z = this.EZpvd;
        }
        return z;
    }

    public final void KWHzl(int i, int i2) {
        this.KWHzl = C36246oUr.copydefault().DCJXGO().get(this.copydefault.fIwbmz());
        this.AEQbTJ = i;
        this.EZpvd = false;
        this.OLrzqt.fling(this.AEQbTJ, 0, i2, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
        this.copydefault.post(this);
    }

    public final void EZpvd() {
        if (!this.OLrzqt.isFinished()) {
            this.OLrzqt.abortAnimation();
        }
        this.EZpvd = true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.OLrzqt.computeScrollOffset()) {
            this.EZpvd = true;
            return;
        }
        if (!C36246oUr.copydefault().uzCIH()) {
            this.EZpvd = true;
            return;
        }
        float currX = this.OLrzqt.getCurrX() - this.AEQbTJ;
        if (currX != 0.0f && !this.OLrzqt.isFinished()) {
            oWN own = this.KWHzl;
            if (own != null) {
                own.AhwBna(currX);
            }
            this.AEQbTJ = this.OLrzqt.getCurrX();
            this.copydefault.postInvalidate();
            AEQbTJ();
            this.copydefault.post(this);
            return;
        }
        AEQbTJ();
        this.EZpvd = true;
        EZpvd();
    }

    public final void AEQbTJ() {
        oWN own = this.KWHzl;
        if (own != null) {
            if (!C36246oUr.copydefault().UlJrfe() && own.isConnected() == 0) {
                this.copydefault.DTwDnp();
            }
            C36246oUr.copydefault().ixgjPv();
            own.ejfBZ();
            own.AuCTel();
            if (C36246oUr.copydefault().ixgjPv() || own.ejfBZ() != own.AuCTel()) {
                return;
            }
            this.copydefault.ORxRYg();
        }
    }
}
