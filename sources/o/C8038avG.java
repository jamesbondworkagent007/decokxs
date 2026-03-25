package o;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.avG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8038avG extends RecyclerView.AdapterDataObserver {
    public RecyclerView AEQbTJ;

    public C8038avG(RecyclerView recyclerView) {
        this.AEQbTJ = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeInserted(int i, int i2) {
        if (this.AEQbTJ.getAdapter() instanceof AbstractC8041avJ) {
            AbstractC8041avJ abstractC8041avJ = (AbstractC8041avJ) this.AEQbTJ.getAdapter();
            if (abstractC8041avJ.copydefault() <= 0 || abstractC8041avJ.EZpvd() != i2) {
                return;
            }
            this.AEQbTJ.scrollToPosition(0);
        }
    }
}
