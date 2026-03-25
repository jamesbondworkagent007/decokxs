package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gRQ extends RecyclerView.ItemDecoration {
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.gRR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(gRQ.djBIcL());
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.gRW
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(gRQ.EZpvd());
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.gRT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(gRQ.valueOf());
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.gRU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(gRQ.gEmmrt());
        }
    });

    public final int isConnected() {
        return ((java.lang.Number) this.copydefault.getValue()).intValue();
    }

    public static final int djBIcL() {
        return C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null);
    }

    public final int AhwBna() {
        return ((java.lang.Number) this.AEQbTJ.getValue()).intValue();
    }

    public static final int EZpvd() {
        return C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null);
    }

    public final int AYXKKw() {
        return ((java.lang.Number) this.KWHzl.getValue()).intValue();
    }

    public static final int valueOf() {
        return C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null);
    }

    public final int DbNXlk() {
        return ((java.lang.Number) this.EZpvd.getValue()).intValue();
    }

    public static final int gEmmrt() {
        return C55298xhM.dpInt$default(40, (android.content.Context) null, 1, (java.lang.Object) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        RecyclerView.Adapter adapter;
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1 || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        int itemCount = adapter.getItemCount();
        rect.left = AYXKKw();
        rect.right = AYXKKw();
        if (childAdapterPosition == 0) {
            rect.top = AhwBna();
            rect.bottom = isConnected();
        } else if (childAdapterPosition == itemCount - 1) {
            rect.top = isConnected();
            rect.bottom = DbNXlk();
        } else {
            rect.top = isConnected();
            rect.bottom = isConnected();
        }
    }
}
