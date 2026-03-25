package o;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.avB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8033avB<M> extends RecyclerView.ViewHolder {
    public void OLrzqt(M m) {
    }

    public AbstractC8033avB(android.view.View view) {
        super(view);
    }

    public AbstractC8033avB(android.view.ViewGroup viewGroup, @androidx.annotation.LayoutRes int i) {
        super(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }

    public <T extends android.view.View> T AEQbTJ(@androidx.annotation.IdRes int i) {
        return (T) this.itemView.findViewById(i);
    }

    public android.content.Context KWHzl() {
        return this.itemView.getContext();
    }
}
