package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.unify_trade.bot.data.ItemData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.wNH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wGj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52302wGj extends wNH {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C52302wGj() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r2v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r3v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r4v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r5v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.ItemData, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.ItemData, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.ItemData, kotlin.Unit>):void (m)] (LINE:11) call: o.wGj.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C52302wGj(Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : function12, (i & 4) != 0 ? null : function13, (i & 8) != 0 ? null : function14);
    }

    public C52302wGj(Function1<? super ItemData, Unit> function1, Function1<? super ItemData, Unit> function12, Function1<? super java.lang.String, Unit> function13, Function1<? super ItemData, Unit> function14) {
        super(function1, function12, function13, function14, null, 16, null);
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.wNH, o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt */
    public wNH.ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(layoutInflater, C48033uCm.Activity.QYNZmZ, viewGroup, false);
        Intrinsics.copydefault(viewDataBindingInflate, "");
        android.view.View root = ((AbstractC50880vcW) viewDataBindingInflate).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return new wNH.ActionBar(this, root);
    }
}
