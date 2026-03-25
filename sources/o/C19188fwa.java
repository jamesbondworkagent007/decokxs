package o;

import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fwa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C19188fwa<T> extends C59534zip {
    public final AsyncListDiffer<T> AEQbTJ;

    public C19188fwa(@NotNull DiffUtil.ItemCallback<T> itemCallback) {
        Intrinsics.checkNotNullParameter(itemCallback, "");
        this.AEQbTJ = new AsyncListDiffer<>(this, itemCallback);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.fwa */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void submitList$default(C19188fwa c19188fwa, java.util.List list, Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitList");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        c19188fwa.OLrzqt(list, function0);
    }

    public final void OLrzqt(final java.util.List<? extends T> list, final Function0<Unit> function0) {
        if (list == null) {
            list = yDY.AhwBna();
        }
        this.AEQbTJ.submitList(list, new java.lang.Runnable() { // from class: o.fvZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C19188fwa.KWHzl(this.AEQbTJ, list, function0);
            }
        });
    }

    public static final void KWHzl(C19188fwa c19188fwa, java.util.List list, Function0 function0) {
        c19188fwa.setItems(list);
        if (function0 != null) {
            function0.invoke();
        }
    }
}
