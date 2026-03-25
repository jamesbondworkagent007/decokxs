package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* JADX INFO: renamed from: o.sol, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC45384sol<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    public boolean gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.gEmmrt ? 1 : 0;
    }

    public final void AEQbTJ(boolean z) {
        if (this.gEmmrt != z) {
            this.gEmmrt = z;
            if (z) {
                notifyItemInserted(0);
            } else {
                notifyItemRemoved(0);
            }
        }
    }
}
