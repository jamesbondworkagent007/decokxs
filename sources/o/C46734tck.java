package o;

import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46734tck extends ItemTouchHelper.Callback {
    public final Function0<Unit> AEQbTJ;
    public final boolean EZpvd;
    public final Function2<java.lang.Integer, java.lang.Integer, Unit> KWHzl;
    public final Function0<Unit> OLrzqt;

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isItemViewSwipeEnabled() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isLongPressDragEnabled() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 kotlin.jvm.functions.Function2)
  (r2v0 kotlin.jvm.functions.Function0)
  (r3v0 kotlin.jvm.functions.Function0)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:boolean:0x0006: INVOKE (null android.content.Context), (1 int), (null java.lang.Object) STATIC call: o.xnE.isLogin$default(android.content.Context, int, java.lang.Object):boolean A[MD:(android.content.Context, int, java.lang.Object):boolean (m), WRAPPED] (LINE:14)) : (r4v0 boolean))
 A[MD:(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean):void (m)] (LINE:10) call: o.tck.<init>(kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean):void type: THIS */
    public /* synthetic */ C46734tck(Function2 function2, Function0 function0, Function0 function02, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, function0, function02, (i & 8) != 0 ? C55608xnE.isLogin$default(null, 1, null) : z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C46734tck(@NotNull Function2<? super java.lang.Integer, ? super java.lang.Integer, Unit> function2, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, boolean z) {
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        this.KWHzl = function2;
        this.AEQbTJ = function0;
        this.OLrzqt = function02;
        this.EZpvd = z;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(viewHolder, "");
        return ItemTouchHelper.Callback.makeMovementFlags(3, 0);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, @NotNull RecyclerView.ViewHolder viewHolder2) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(viewHolder2, "");
        if (!this.EZpvd) {
            return true;
        }
        this.KWHzl.invoke(java.lang.Integer.valueOf(viewHolder.getBindingAdapterPosition()), java.lang.Integer.valueOf(viewHolder2.getBindingAdapterPosition()));
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
}
