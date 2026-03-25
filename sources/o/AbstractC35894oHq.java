package o;

import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oHq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC35894oHq<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    public final AsyncListDiffer<T> valueOf = new AsyncListDiffer<>(this, new StateListAnimator(this));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Object AEQbTJ(@NotNull T t, @NotNull T t2) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(t2, "");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AsyncListDiffer<T> KWHzl() {
        return this.valueOf;
    }

    public abstract boolean KWHzl(T t, T t2);

    public abstract boolean OLrzqt(T t, T t2);

    public final void KWHzl(@NotNull java.util.List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.valueOf.submitList(list);
    }

    public final void OLrzqt(@NotNull java.util.List<? extends T> list, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.valueOf.submitList(list, new java.lang.Runnable() { // from class: o.oHu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC35894oHq.copydefault(function0);
            }
        });
    }

    public static final void copydefault(Function0 function0) {
        function0.invoke();
    }

    public final void EZpvd(@NotNull final RecyclerView recyclerView, @NotNull java.util.List<? extends T> list) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(list, "");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        final android.os.Parcelable parcelableOnSaveInstanceState = layoutManager != null ? layoutManager.onSaveInstanceState() : null;
        this.valueOf.submitList(list, new java.lang.Runnable() { // from class: o.oHm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC35894oHq.OLrzqt(recyclerView, parcelableOnSaveInstanceState);
            }
        });
    }

    public static final void OLrzqt(RecyclerView recyclerView, android.os.Parcelable parcelable) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.onRestoreInstanceState(parcelable);
        }
    }

    /* JADX INFO: renamed from: o.oHq$StateListAnimator */
    public static final class StateListAnimator extends DiffUtil.ItemCallback<T> {
        public final /* synthetic */ AbstractC35894oHq<T, VH> EZpvd;

        public StateListAnimator(AbstractC35894oHq<T, VH> abstractC35894oHq) {
            this.EZpvd = abstractC35894oHq;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(T t, T t2) {
            Intrinsics.checkNotNullParameter(t, "");
            Intrinsics.checkNotNullParameter(t2, "");
            return this.EZpvd.OLrzqt(t, t2);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(T t, T t2) {
            Intrinsics.checkNotNullParameter(t, "");
            Intrinsics.checkNotNullParameter(t2, "");
            return this.EZpvd.KWHzl(t, t2);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public java.lang.Object getChangePayload(T t, T t2) {
            Intrinsics.checkNotNullParameter(t, "");
            Intrinsics.checkNotNullParameter(t2, "");
            return this.EZpvd.AEQbTJ(t, t2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.valueOf.getCurrentList().size();
    }
}
