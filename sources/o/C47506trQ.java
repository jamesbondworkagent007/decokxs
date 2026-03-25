package o;

import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.trQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C47506trQ extends C59534zip {
    public final AsyncListDiffer<InterfaceC47500trK> AEQbTJ;

    public C47506trQ(@NotNull DiffUtil.ItemCallback<InterfaceC47500trK> itemCallback) {
        Intrinsics.checkNotNullParameter(itemCallback, "");
        this.AEQbTJ = new AsyncListDiffer<>(this, itemCallback);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.trQ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void submitList$default(C47506trQ c47506trQ, java.util.List list, Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitList");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        c47506trQ.OLrzqt(list, function0);
    }

    public final void OLrzqt(final java.util.List<? extends InterfaceC47500trK> list, final Function0<Unit> function0) {
        if (list == null) {
            list = yDY.AhwBna();
        }
        this.AEQbTJ.submitList((java.util.List<InterfaceC47500trK>) list, new java.lang.Runnable() { // from class: o.trO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C47506trQ.KWHzl(this.OLrzqt, list, function0);
            }
        });
    }

    public static final void KWHzl(C47506trQ c47506trQ, java.util.List list, Function0 function0) {
        c47506trQ.setItems(list);
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void AEQbTJ(@NotNull InterfaceC47500trK interfaceC47500trK) {
        Intrinsics.checkNotNullParameter(interfaceC47500trK, "");
        submitList$default(this, C56402yEa.EZpvd(interfaceC47500trK), null, 2, null);
    }
}
