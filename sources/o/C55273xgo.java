package o;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xgo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55273xgo implements InterfaceC55196xfQ<C55276xgr, RecyclerView.ViewHolder> {
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C55273xgo() {
        this(false, 1, null);
    }

    public C55273xgo(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:16) call: o.xgo.<init>(boolean):void type: THIS */
    public /* synthetic */ C55273xgo(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    /* JADX INFO: renamed from: o.xgo$ActionBar */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public ActionBar(C55275xgq c55275xgq) {
            super(c55275xgq);
        }
    }

    @Override // o.InterfaceC55196xfQ
    public RecyclerView.ViewHolder AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return new ActionBar(new C55275xgq(context, null, 2, null));
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;ZZ)V */
    @Override // o.InterfaceC55196xfQ
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull C55276xgr c55276xgr, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        android.view.View view = viewHolder.itemView;
        if (view instanceof C55275xgq) {
            C55275xgq c55275xgq = (C55275xgq) view;
            c55275xgq.setText(c55276xgr.AhwBna());
            if (z) {
                if (this.copydefault) {
                    c55275xgq.setSelectedDrawable(ContextCompat.getDrawable(c55275xgq.getContext(), C52761wXj.TaskDescription.fVjYLc));
                } else {
                    c55275xgq.setSelectedDrawable(null);
                }
            }
            c55275xgq.setSelected(z);
            c55275xgq.setEnabled(z2);
            c55275xgq.setContentDescription(c55276xgr.copydefault());
        }
    }
}
