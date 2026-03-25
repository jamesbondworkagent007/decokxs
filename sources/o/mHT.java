package o;

import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class mHT<T> extends C59534zip {
    public final InterfaceC56387yDm EZpvd;
    public final ActionBar OLrzqt;
    public boolean valueOf;

    public mHT(@NotNull final DiffUtil.ItemCallback<T> itemCallback) {
        Intrinsics.checkNotNullParameter(itemCallback, "");
        this.OLrzqt = new ActionBar(this);
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.mHS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return mHT.OLrzqt(this.KWHzl, itemCallback);
            }
        });
    }

    public static final class ActionBar implements ListUpdateCallback {
        public final /* synthetic */ mHT<T> OLrzqt;

        public ActionBar(mHT<T> mht) {
            this.OLrzqt = mht;
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onInserted(int i, int i2) {
            if (this.OLrzqt.valueOf) {
                return;
            }
            this.OLrzqt.notifyItemRangeInserted(i, i2);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onRemoved(int i, int i2) {
            if (this.OLrzqt.valueOf) {
                return;
            }
            this.OLrzqt.notifyItemRangeRemoved(i, i2);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onMoved(int i, int i2) {
            if (this.OLrzqt.valueOf) {
                return;
            }
            this.OLrzqt.notifyItemMoved(i, i2);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onChanged(int i, int i2, java.lang.Object obj) {
            if (this.OLrzqt.valueOf) {
                return;
            }
            this.OLrzqt.notifyItemRangeChanged(i, i2, obj);
        }
    }

    private final AsyncListDiffer<T> EZpvd() {
        return (AsyncListDiffer) this.EZpvd.getValue();
    }

    public static final AsyncListDiffer OLrzqt(mHT mht, DiffUtil.ItemCallback itemCallback) {
        return new AsyncListDiffer(mht.OLrzqt, new AsyncDifferConfig.Builder(itemCallback).build());
    }

    public static /* synthetic */ void submitList$default(mHT mht, java.util.List list, java.lang.Runnable runnable, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitList");
        }
        if ((i & 2) != 0) {
            runnable = null;
        }
        mht.copydefault(list, runnable);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(java.util.List<? extends T> list, java.lang.Runnable runnable) {
        java.util.List<?> arrayList;
        if (list == 0 || (arrayList = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list)) == null) {
            arrayList = new java.util.ArrayList<>();
        }
        setItems(arrayList);
        EZpvd().submitList(list, runnable);
    }

    public static /* synthetic */ void submitListSafe$default(mHT mht, java.util.List list, java.lang.Runnable runnable, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitListSafe");
        }
        if ((i & 2) != 0) {
            runnable = null;
        }
        mht.KWHzl(list, runnable);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(java.util.List<? extends T> list, final java.lang.Runnable runnable) {
        final java.util.List arrayList;
        if (list == 0 || (arrayList = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list)) == null) {
            arrayList = new java.util.ArrayList();
        }
        EZpvd().submitList(list, new java.lang.Runnable() { // from class: o.mHW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                mHT.OLrzqt(this.EZpvd, arrayList, runnable);
            }
        });
    }

    public static final void OLrzqt(mHT mht, java.util.List list, java.lang.Runnable runnable) {
        mht.setItems(list);
        if (runnable != null) {
            runnable.run();
        }
    }

    public final java.util.List<T> copydefault() {
        java.util.List<T> currentList = EZpvd().getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        return currentList;
    }
}
