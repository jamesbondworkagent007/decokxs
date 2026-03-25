package o;

import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tdl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C46788tdl extends ItemTouchHelper.Callback {
    public final boolean EZpvd;
    public final InterfaceC46791tdo OLrzqt;
    public final InterfaceC46789tdm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
    }

    public C46788tdl(@NotNull InterfaceC46789tdm interfaceC46789tdm, @NotNull InterfaceC46791tdo interfaceC46791tdo) {
        Intrinsics.checkNotNullParameter(interfaceC46789tdm, "");
        Intrinsics.checkNotNullParameter(interfaceC46791tdo, "");
        this.copydefault = interfaceC46789tdm;
        this.OLrzqt = interfaceC46791tdo;
        this.EZpvd = C33492mxV.OLrzqt();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isLongPressDragEnabled() {
        return this.OLrzqt.copydefault();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: androidx.recyclerview.widget.RecyclerView$ViewHolder */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(viewHolder, "");
        return ItemTouchHelper.Callback.makeMovementFlags((!(viewHolder instanceof InterfaceC46795tds) || ((InterfaceC46795tds) viewHolder).AEQbTJ()) ? 3 : 0, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: androidx.recyclerview.widget.RecyclerView$ViewHolder */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, @NotNull RecyclerView.ViewHolder viewHolder2) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(viewHolder2, "");
        if ((viewHolder2 instanceof InterfaceC46795tds) && !((InterfaceC46795tds) viewHolder2).AEQbTJ()) {
            return false;
        }
        this.copydefault.AEQbTJ(viewHolder.getBindingAdapterPosition(), viewHolder2.getBindingAdapterPosition());
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
        super.onSelectedChanged(viewHolder, i);
        this.OLrzqt.OLrzqt(i, viewHolder != null ? java.lang.Integer.valueOf(viewHolder.getBindingAdapterPosition()) : null);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void clearView(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(viewHolder, "");
        super.clearView(recyclerView, viewHolder);
        android.view.View view = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        ViewCompat.setElevation(view, 0.0f);
        view.setBackground(null);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onChildDraw(@NotNull android.graphics.Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        float fMax;
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(viewHolder, "");
        super.onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, z);
        android.view.View view = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        if (z) {
            ViewCompat.setElevation(view, 32.0f);
            view.setBackgroundResource(qZH.Activity.isConnected);
        } else {
            view.setBackground(null);
        }
        float top = viewHolder.itemView.getTop();
        float height = recyclerView.getHeight() - viewHolder.itemView.getBottom();
        recyclerView.getHeight();
        if (f2 >= 0.0f) {
            fMax = java.lang.Math.min(height, f2);
        } else {
            fMax = java.lang.Math.max(-top, f2);
        }
        view.setTranslationY(fMax);
    }
}
