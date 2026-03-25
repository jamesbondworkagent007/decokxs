package o;

import android.view.ViewGroup;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tHt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46098tHt extends androidx.recyclerview.widget.ListAdapter<InterfaceC46104tHz, C46101tHw> {
    public final boolean AEQbTJ;
    public final int KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C46098tHt() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r1v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.Activity.EZpvd int) : (r2v0 int))
 A[MD:(boolean, int):void (m)] (LINE:50) call: o.tHt.<init>(boolean, int):void type: THIS */
    public /* synthetic */ C46098tHt(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? C52761wXj.Activity.EZpvd : i);
    }

    public C46098tHt(boolean z, @androidx.annotation.ColorRes int i) {
        super(C46129tIx.copydefault);
        this.AEQbTJ = z;
        this.KWHzl = i;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C46101tHw onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        boolean z = this.AEQbTJ;
        C46471tVo c46471tVo = new C46471tVo(context, null, 0, java.lang.Boolean.valueOf(z), this.KWHzl, 6, null);
        c46471tVo.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new C46101tHw(c46471tVo);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C46101tHw c46101tHw, int i) {
        Intrinsics.checkNotNullParameter(c46101tHw, "");
        InterfaceC46104tHz item = getItem(i);
        Intrinsics.checkNotNullExpressionValue(item, "");
        c46101tHw.KWHzl(item);
    }
}
