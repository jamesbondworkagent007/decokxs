package o;

import android.view.ViewGroup;
import com.okinc.unify_trade.bot.data.GridPendingEmptyData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wPh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52543wPh extends AbstractC59533zio<GridPendingEmptyData, C52539wPd> {
    public final Function1<java.lang.Integer, Unit> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C52543wPh() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit>):void (m)] (LINE:19) call: o.wPh.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C52543wPh(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C52543wPh(Function1<? super java.lang.Integer, Unit> function1) {
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C52539wPd onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.ORmwhf, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C52539wPd(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C52539wPd c52539wPd, @NotNull GridPendingEmptyData gridPendingEmptyData) {
        Intrinsics.checkNotNullParameter(c52539wPd, "");
        Intrinsics.checkNotNullParameter(gridPendingEmptyData, "");
        c52539wPd.AEQbTJ().setText(gridPendingEmptyData.getDesc());
        if (C33129mqd.AEQbTJ(java.lang.Float.valueOf(gridPendingEmptyData.getMargin()), 0)) {
            ViewGroup.LayoutParams layoutParams = c52539wPd.AEQbTJ().getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (gridPendingEmptyData.isLeft()) {
                marginLayoutParams.rightMargin = C55298xhM.dp2px$default(gridPendingEmptyData.getMargin(), null, 1, null);
            } else {
                marginLayoutParams.leftMargin = C55298xhM.dp2px$default(gridPendingEmptyData.getMargin(), null, 1, null);
            }
            c52539wPd.AEQbTJ().setLayoutParams(marginLayoutParams);
        }
    }
}
