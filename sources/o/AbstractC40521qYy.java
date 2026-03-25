package o;

import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qYy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC40521qYy<T> extends C59534zip {
    public final InterfaceC56387yDm KWHzl;

    public AbstractC40521qYy(@NotNull final DiffUtil.ItemCallback<T> itemCallback) {
        Intrinsics.checkNotNullParameter(itemCallback, "");
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.qYC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC40521qYy.AEQbTJ(this.copydefault, itemCallback);
            }
        });
    }

    private final AsyncListDiffer<T> copydefault() {
        return (AsyncListDiffer) this.KWHzl.getValue();
    }

    public static final AsyncListDiffer AEQbTJ(AbstractC40521qYy abstractC40521qYy, DiffUtil.ItemCallback itemCallback) {
        return new AsyncListDiffer(abstractC40521qYy, itemCallback);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qYy */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void submitList$default(AbstractC40521qYy abstractC40521qYy, java.util.List list, Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitList");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        abstractC40521qYy.EZpvd(list, function0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public void EZpvd(java.util.List<? extends T> list, final Function0<Unit> function0) {
        java.util.List<?> arrayList;
        if (list == 0 || (arrayList = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list)) == null) {
            arrayList = new java.util.ArrayList<>();
        }
        setItems(arrayList);
        copydefault().submitList(list, function0 != null ? new java.lang.Runnable() { // from class: o.qYz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC40521qYy.OLrzqt(function0);
            }
        } : null);
    }

    public static final void OLrzqt(Function0 function0) {
        function0.invoke();
    }

    public final java.util.List<T> EZpvd() {
        java.util.List<T> currentList = copydefault().getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        return currentList;
    }

    public final T copydefault(int i) {
        return (T) CollectionsKt___CollectionsKt.AkhnZx(EZpvd(), i);
    }
}
