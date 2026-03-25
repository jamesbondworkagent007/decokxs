package o;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.avE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C8036avE extends RecyclerView.AdapterDataObserver {
    public AbstractC8041avJ KWHzl;
    public C8037avF copydefault;

    public C8036avE(C8037avF c8037avF) {
        this.copydefault = c8037avF;
        if (c8037avF.AEQbTJ() instanceof AbstractC8041avJ) {
            this.KWHzl = (AbstractC8041avJ) c8037avF.AEQbTJ();
        }
    }

    public final boolean OLrzqt(int i) {
        AbstractC8041avJ abstractC8041avJ = this.KWHzl;
        return abstractC8041avJ != null && (i < abstractC8041avJ.KWHzl() || i >= this.KWHzl.KWHzl() + this.KWHzl.EZpvd());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeChanged(int i, int i2) {
        super.onItemRangeChanged(i, i2);
        if (OLrzqt(i)) {
            return;
        }
        AEQbTJ();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeInserted(int i, int i2) {
        super.onItemRangeInserted(i, i2);
        if (OLrzqt(i)) {
            return;
        }
        AEQbTJ();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeRemoved(int i, int i2) {
        super.onItemRangeRemoved(i, i2);
        if (OLrzqt(i)) {
            return;
        }
        AEQbTJ();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeMoved(int i, int i2, int i3) {
        super.onItemRangeMoved(i, i2, i3);
        AEQbTJ();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onChanged() {
        super.onChanged();
        AEQbTJ();
    }

    public final void AEQbTJ() {
        int itemCount;
        if (this.copydefault.AEQbTJ() instanceof AbstractC8041avJ) {
            AbstractC8041avJ abstractC8041avJ = (AbstractC8041avJ) this.copydefault.AEQbTJ();
            itemCount = ((abstractC8041avJ.EZpvd() + abstractC8041avJ.KWHzl()) + abstractC8041avJ.copydefault()) - (abstractC8041avJ.valueOf() ? 1 : 0);
        } else {
            itemCount = this.copydefault.AEQbTJ().getItemCount();
        }
        if (itemCount == 0) {
            this.copydefault.KWHzl();
        } else {
            this.copydefault.valueOf();
        }
    }
}
