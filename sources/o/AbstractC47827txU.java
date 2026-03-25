package o;

import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.txU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47827txU<T> extends C59534zip {
    public final InterfaceC56387yDm AEQbTJ;

    public AbstractC47827txU(@NotNull final DiffUtil.ItemCallback<T> itemCallback) {
        Intrinsics.checkNotNullParameter(itemCallback, "");
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.tya
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC47827txU.OLrzqt(this.OLrzqt, itemCallback);
            }
        });
    }

    private final AsyncListDiffer<T> EZpvd() {
        return (AsyncListDiffer) this.AEQbTJ.getValue();
    }

    public static final AsyncListDiffer OLrzqt(AbstractC47827txU abstractC47827txU, DiffUtil.ItemCallback itemCallback) {
        return new AsyncListDiffer(abstractC47827txU, itemCallback);
    }

    public static /* synthetic */ void submitList$default(AbstractC47827txU abstractC47827txU, java.util.List list, java.lang.Runnable runnable, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitList");
        }
        if ((i & 2) != 0) {
            runnable = null;
        }
        abstractC47827txU.copydefault(list, runnable);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public void copydefault(java.util.List<? extends T> list, java.lang.Runnable runnable) {
        java.util.List<?> arrayList;
        if (list == 0 || (arrayList = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list)) == null) {
            arrayList = new java.util.ArrayList<>();
        }
        setItems(arrayList);
        EZpvd().submitList(list, runnable);
    }
}
