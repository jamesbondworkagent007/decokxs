package o;

import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jUk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26167jUk extends ItemTouchHelper.Callback {
    public final Function0<Unit> AEQbTJ;
    public final Function2<java.lang.Integer, java.lang.Integer, Unit> EZpvd;
    public final Function1<java.lang.Integer, InterfaceC40516qYt> KWHzl;
    public final Function0<Unit> OLrzqt;

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isItemViewSwipeEnabled() {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isLongPressDragEnabled() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends o.qYt> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C26167jUk(@NotNull Function1<? super java.lang.Integer, ? extends InterfaceC40516qYt> function1, @NotNull Function2<? super java.lang.Integer, ? super java.lang.Integer, Unit> function2, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        this.KWHzl = function1;
        this.EZpvd = function2;
        this.AEQbTJ = function0;
        this.OLrzqt = function02;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(viewHolder, "");
        if (EZpvd(viewHolder.getBindingAdapterPosition()) != null) {
            return ItemTouchHelper.Callback.makeMovementFlags(3, 0);
        }
        return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, @NotNull RecyclerView.ViewHolder viewHolder2) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(viewHolder2, "");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        int bindingAdapterPosition2 = viewHolder2.getBindingAdapterPosition();
        if (EZpvd(bindingAdapterPosition2) == null) {
            return false;
        }
        this.EZpvd.invoke(java.lang.Integer.valueOf(bindingAdapterPosition), java.lang.Integer.valueOf(bindingAdapterPosition2));
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onChildDraw(@NotNull android.graphics.Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(viewHolder, "");
        super.onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, z);
        android.view.View view = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        if (z) {
            view.setBackgroundResource(qZH.Activity.isConnected);
        } else {
            view.setBackground(null);
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
        super.onSelectedChanged(viewHolder, i);
        if (i == 0) {
            this.OLrzqt.invoke();
        } else {
            if (i != 2) {
                return;
            }
            this.AEQbTJ.invoke();
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void clearView(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(viewHolder, "");
        super.clearView(recyclerView, viewHolder);
        ViewCompat.setElevation(viewHolder.itemView, 0.0f);
        viewHolder.itemView.setBackground(null);
    }

    public final C26175jUs EZpvd(int i) {
        InterfaceC40516qYt interfaceC40516qYtInvoke = this.KWHzl.invoke(java.lang.Integer.valueOf(i));
        if (interfaceC40516qYtInvoke instanceof C26175jUs) {
            return (C26175jUs) interfaceC40516qYtInvoke;
        }
        return null;
    }
}
