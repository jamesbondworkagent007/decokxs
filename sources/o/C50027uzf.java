package o;

import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uzf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50027uzf<T> extends C59534zip {
    public final AsyncListDiffer<T> copydefault;

    public C50027uzf(@NotNull DiffUtil.ItemCallback<T> itemCallback) {
        Intrinsics.checkNotNullParameter(itemCallback, "");
        this.copydefault = new AsyncListDiffer<>(this, itemCallback);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.uzf */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void submitList$default(C50027uzf c50027uzf, java.util.List list, Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitList");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        c50027uzf.OLrzqt(list, function0);
    }

    public final void OLrzqt(final java.util.List<? extends T> list, final Function0<Unit> function0) {
        if (list == null) {
            list = yDY.AhwBna();
        }
        this.copydefault.submitList(list, new java.lang.Runnable() { // from class: o.uze
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C50027uzf.copydefault(this.KWHzl, list, function0);
            }
        });
    }

    public static final void copydefault(C50027uzf c50027uzf, java.util.List list, Function0 function0) {
        c50027uzf.setItems(list);
        if (function0 != null) {
            function0.invoke();
        }
    }
}
