package o;

import androidx.recyclerview.widget.AdapterListUpdateCallback;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public abstract class iSE<T> extends C59534zip {
    public final AsyncListDiffer<T> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull java.util.List<? extends T> list, @NotNull java.util.List<? extends T> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
    }

    public iSE(@NotNull DiffUtil.ItemCallback<T> itemCallback) {
        Intrinsics.checkNotNullParameter(itemCallback, "");
        AsyncListDiffer<T> asyncListDiffer = new AsyncListDiffer<>(new AdapterListUpdateCallback(this), new AsyncDifferConfig.Builder(itemCallback).build());
        this.OLrzqt = asyncListDiffer;
        asyncListDiffer.addListListener(new AsyncListDiffer.ListListener() { // from class: o.iSL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.recyclerview.widget.AsyncListDiffer.ListListener
            public final void onCurrentListChanged(java.util.List list, java.util.List list2) {
                this.copydefault.AEQbTJ(list, list2);
            }
        });
    }

    public final java.util.List<T> EZpvd() {
        java.util.List<T> currentList = this.OLrzqt.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        return currentList;
    }

    public static /* synthetic */ void submitList$default(iSE ise, java.util.List list, java.lang.Runnable runnable, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitList");
        }
        if ((i & 2) != 0) {
            runnable = null;
        }
        ise.copydefault(list, runnable);
    }

    public final void copydefault(@NotNull java.util.List<? extends T> list, java.lang.Runnable runnable) {
        Intrinsics.checkNotNullParameter(list, "");
        super.setItems(list);
        this.OLrzqt.submitList(list, runnable);
    }

    @Override // o.C59534zip
    public java.util.List<T> getItems() {
        java.util.List<T> list = (java.util.List<T>) super.getItems();
        Intrinsics.copydefault(list, "");
        return list;
    }

    @Override // o.C59534zip
    public void setItems(@NotNull java.util.List<?> list) {
        Intrinsics.checkNotNullParameter(list, "");
        submitList$default(this, list, null, 2, null);
    }
}
