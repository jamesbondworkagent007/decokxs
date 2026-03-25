package o;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.akz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7502akz extends RecyclerView.RecycledViewPool {
    public android.util.SparseBooleanArray AEQbTJ = new android.util.SparseBooleanArray();
    public int copydefault;

    public C7502akz(int i) {
        this.copydefault = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public void putRecycledView(RecyclerView.ViewHolder viewHolder) {
        int itemViewType = viewHolder.getItemViewType();
        if (!this.AEQbTJ.get(itemViewType)) {
            setMaxRecycledViews(itemViewType, this.copydefault);
            this.AEQbTJ.put(itemViewType, true);
        }
        super.putRecycledView(viewHolder);
    }
}
