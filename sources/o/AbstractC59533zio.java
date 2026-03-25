package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* JADX INFO: renamed from: o.zio, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59533zio<T, VH extends RecyclerView.ViewHolder> {
    C59534zip adapter;

    public long getItemId(@androidx.annotation.NonNull T t) {
        return -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void installAdapter(C59534zip c59534zip) {
        this.adapter = c59534zip;
    }

    public abstract void onBindViewHolder(@androidx.annotation.NonNull VH vh, @androidx.annotation.NonNull T t);

    public abstract VH onCreateViewHolder(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup);

    public boolean onFailedToRecycleView(@androidx.annotation.NonNull VH vh) {
        return false;
    }

    public void onViewAttachedToWindow(@androidx.annotation.NonNull VH vh) {
    }

    public void onViewDetachedFromWindow(@androidx.annotation.NonNull VH vh) {
    }

    public void onViewRecycled(@androidx.annotation.NonNull VH vh) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void uninstallAdapter() {
        this.adapter = null;
    }

    public void onBindViewHolder(@androidx.annotation.NonNull VH vh, @androidx.annotation.NonNull T t, @androidx.annotation.NonNull java.util.List<java.lang.Object> list) {
        onBindViewHolder(vh, t);
    }

    public final int getPosition(@androidx.annotation.NonNull RecyclerView.ViewHolder viewHolder) {
        return viewHolder.getAdapterPosition();
    }

    public final C59534zip getAdapter() {
        C59534zip c59534zip = this.adapter;
        if (c59534zip != null) {
            return c59534zip;
        }
        throw new java.lang.IllegalStateException("ItemViewBinder " + this + " not attached to MultiTypeAdapter. You should not call the method before registering the binder.");
    }
}
