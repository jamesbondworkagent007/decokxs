package o;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vmi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51422vmi extends AbstractC59533zio<C51938vwU, C51424vmk> {
    public final Function1<C51484vnr, Unit> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C51422vmi() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super o.vnr, kotlin.Unit>):void (m)] (LINE:12) call: o.vmi.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C51422vmi(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super o.vnr, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C51422vmi(Function1<? super C51484vnr, Unit> function1) {
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C51424vmk onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C51428vmo c51428vmo = new C51428vmo(context, null, 0, 6, null);
        c51428vmo.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new C51424vmk(c51428vmo);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C51424vmk c51424vmk, @NotNull C51938vwU c51938vwU) {
        Intrinsics.checkNotNullParameter(c51424vmk, "");
        Intrinsics.checkNotNullParameter(c51938vwU, "");
        android.view.View view = c51424vmk.itemView;
        C51428vmo c51428vmo = view instanceof C51428vmo ? (C51428vmo) view : null;
        if (c51428vmo != null) {
            c51428vmo.setChildClickListener(this.AEQbTJ);
            c51428vmo.KWHzl(c51938vwU);
        }
    }
}
