package o;

import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oUp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC36244oUp<T> extends C59534zip {
    public final DiffUtil.ItemCallback<T> AEQbTJ;
    public final InterfaceC56387yDm OLrzqt;

    public AbstractC36244oUp(@NotNull DiffUtil.ItemCallback<T> itemCallback) {
        Intrinsics.checkNotNullParameter(itemCallback, "");
        this.AEQbTJ = itemCallback;
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.oUo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC36244oUp.OLrzqt(this.AEQbTJ);
            }
        });
    }

    public static final AsyncListDiffer OLrzqt(AbstractC36244oUp abstractC36244oUp) {
        return new AsyncListDiffer(abstractC36244oUp, abstractC36244oUp.AEQbTJ);
    }

    public final AsyncListDiffer<T> OLrzqt() {
        return (AsyncListDiffer) this.OLrzqt.getValue();
    }

    public static /* synthetic */ void submitList$default(AbstractC36244oUp abstractC36244oUp, java.util.List list, java.lang.Runnable runnable, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitList");
        }
        if ((i & 2) != 0) {
            runnable = null;
        }
        abstractC36244oUp.OLrzqt(list, runnable);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(@NotNull java.util.List<? extends T> list, java.lang.Runnable runnable) {
        Intrinsics.checkNotNullParameter(list, "");
        setItems(list);
        OLrzqt().submitList(list, runnable);
    }

    public final java.util.List<T> EZpvd() {
        java.util.List<T> currentList = OLrzqt().getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        return currentList;
    }

    public final T copydefault(int i) {
        return EZpvd().get(i);
    }
}
