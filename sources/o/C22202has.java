package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexui.widget.DexEmptyData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.has, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22202has extends RecyclerView.ItemDecoration {
    public final boolean AEQbTJ;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.hay
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C22202has.AYXKKw());
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.haA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C22202has.AhwBna());
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.hax
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C22202has.copydefault());
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.haz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C22202has.valueOf());
        }
    });

    public C22202has(boolean z) {
        this.AEQbTJ = z;
    }

    public final int djBIcL() {
        return ((java.lang.Number) this.OLrzqt.getValue()).intValue();
    }

    public static final int AYXKKw() {
        return C55298xhM.dpInt$default(64, (android.content.Context) null, 1, (java.lang.Object) null);
    }

    private final int AkhnZx() {
        return ((java.lang.Number) this.EZpvd.getValue()).intValue();
    }

    public static final int AhwBna() {
        return C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null);
    }

    public final int gEmmrt() {
        return ((java.lang.Number) this.KWHzl.getValue()).intValue();
    }

    public static final int copydefault() {
        return C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null);
    }

    private final int values() {
        return ((java.lang.Number) this.copydefault.getValue()).intValue();
    }

    public static final int valueOf() {
        return C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        int iAkhnZx = 0;
        if (childAdapterPosition == 0) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            C43316rmw c43316rmw = adapter instanceof C43316rmw ? (C43316rmw) adapter : null;
            if ((c43316rmw != null ? c43316rmw.AEQbTJ(childAdapterPosition) : null) instanceof DexEmptyData) {
                rect.top = 0;
            } else {
                rect.top = this.AEQbTJ ? values() : gEmmrt();
            }
            rect.bottom = 0;
            return;
        }
        rect.top = AkhnZx();
        if (childAdapterPosition == (recyclerView.getAdapter() != null ? r5.getItemCount() : 0) - 1) {
            if (this.AEQbTJ) {
                iAkhnZx = djBIcL();
            } else {
                iAkhnZx = AkhnZx();
            }
        }
        rect.bottom = iAkhnZx;
    }
}
