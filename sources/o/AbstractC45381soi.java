package o;

import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.soi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC45381soi<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    public final AsyncListDiffer<T> AYXKKw = new AsyncListDiffer<>(this, new Activity(this));

    public abstract boolean KWHzl(T t, T t2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AsyncListDiffer<T> copydefault() {
        return this.AYXKKw;
    }

    public abstract boolean copydefault(T t, T t2);

    public void AEQbTJ(@NotNull java.util.List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AYXKKw.submitList(list);
    }

    public final void copydefault(@NotNull final RecyclerView recyclerView, @NotNull java.util.List<? extends T> list) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(list, "");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        final android.os.Parcelable parcelableOnSaveInstanceState = layoutManager != null ? layoutManager.onSaveInstanceState() : null;
        this.AYXKKw.submitList(list, new java.lang.Runnable() { // from class: o.som
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC45381soi.KWHzl(recyclerView, parcelableOnSaveInstanceState);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KWHzl(final RecyclerView recyclerView, android.os.Parcelable parcelable) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.onRestoreInstanceState(parcelable);
        }
        recyclerView.post(new java.lang.Runnable() { // from class: o.soj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC45381soi.EZpvd(recyclerView);
            }
        });
    }

    public static final void EZpvd(RecyclerView recyclerView) {
        recyclerView.invalidateItemDecorations();
    }

    /* JADX INFO: renamed from: o.soi$Activity */
    public static final class Activity extends DiffUtil.ItemCallback<T> {
        public final /* synthetic */ AbstractC45381soi<T, VH> OLrzqt;

        public Activity(AbstractC45381soi<T, VH> abstractC45381soi) {
            this.OLrzqt = abstractC45381soi;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(T t, T t2) {
            Intrinsics.checkNotNullParameter(t, "");
            Intrinsics.checkNotNullParameter(t2, "");
            return this.OLrzqt.KWHzl(t, t2);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(T t, T t2) {
            Intrinsics.checkNotNullParameter(t, "");
            Intrinsics.checkNotNullParameter(t2, "");
            return this.OLrzqt.copydefault(t, t2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.AYXKKw.getCurrentList().size();
    }
}
