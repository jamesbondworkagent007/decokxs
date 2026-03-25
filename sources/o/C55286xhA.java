package o;

import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xhA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C55286xhA<T> extends ItemTouchHelper.SimpleCallback {
    public final java.util.ArrayList<T> AEQbTJ;
    public final mAJ EZpvd;
    public final mAN OLrzqt;
    public final RecyclerView.Adapter<? extends RecyclerView.ViewHolder> copydefault;

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isLongPressDragEnabled() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, @NotNull RecyclerView.ViewHolder viewHolder2) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(viewHolder2, "");
        return false;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 java.util.ArrayList)
  (r3v0 androidx.recyclerview.widget.RecyclerView$Adapter)
  (wrap:o.mAN:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null o.mAN) : (r4v0 o.mAN))
  (wrap:o.mAJ:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null o.mAJ) : (r5v0 o.mAJ))
 A[MD:(java.util.ArrayList<T>, androidx.recyclerview.widget.RecyclerView$Adapter<? extends androidx.recyclerview.widget.RecyclerView$ViewHolder>, o.mAN, o.mAJ):void (m)] (LINE:8) call: o.xhA.<init>(java.util.ArrayList, androidx.recyclerview.widget.RecyclerView$Adapter, o.mAN, o.mAJ):void type: THIS */
    public /* synthetic */ C55286xhA(java.util.ArrayList arrayList, RecyclerView.Adapter adapter, mAN man, mAJ maj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(arrayList, adapter, (i & 4) != 0 ? null : man, (i & 8) != 0 ? null : maj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55286xhA(@NotNull java.util.ArrayList<T> arrayList, @NotNull RecyclerView.Adapter<? extends RecyclerView.ViewHolder> adapter, mAN man, mAJ maj) {
        super(0, 48);
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(adapter, "");
        this.AEQbTJ = arrayList;
        this.copydefault = adapter;
        this.OLrzqt = man;
        this.EZpvd = maj;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        mAN man;
        Intrinsics.checkNotNullParameter(viewHolder, "");
        int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
        mAJ maj = this.EZpvd;
        if (maj != null) {
            maj.copydefault(absoluteAdapterPosition);
        }
        this.AEQbTJ.remove(absoluteAdapterPosition);
        this.copydefault.notifyItemRemoved(absoluteAdapterPosition);
        if (this.AEQbTJ.size() > 0 || (man = this.OLrzqt) == null) {
            return;
        }
        man.AEQbTJ();
    }
}
