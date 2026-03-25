package o;

import com.okinc.unify_trade.biz.HomeStrategyCardInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC51545voz;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.voS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51512voS extends AbstractC51545voz {
    public final boolean gEmmrt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (r7v0 boolean)
  (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function2) : (r8v0 kotlin.jvm.functions.Function2))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r9v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function2) : (r10v0 kotlin.jvm.functions.Function2))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r13v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r12v0 java.lang.String) : (null java.lang.String))
 A[MD:(boolean, kotlin.jvm.functions.Function2<? super com.okinc.unify_trade.biz.HomeStrategyCardInfo, ? super java.lang.Integer, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function2<? super com.okinc.unify_trade.biz.HomeStrategyCardInfo, ? super java.lang.Integer, kotlin.Unit>, boolean, java.lang.String):void (m)] (LINE:417) call: o.voS.<init>(boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ C51512voS(boolean z, Function2 function2, Function1 function1, Function2 function22, boolean z2, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : function2, (i & 4) != 0 ? null : function1, (i & 8) != 0 ? null : function22, (i & 16) != 0 ? false : z2, (i & 32) == 0 ? str : null);
    }

    public C51512voS(boolean z, Function2<? super HomeStrategyCardInfo, ? super java.lang.Integer, Unit> function2, Function1<? super java.lang.String, Unit> function1, Function2<? super HomeStrategyCardInfo, ? super java.lang.Integer, Unit> function22, boolean z2, java.lang.String str) {
        super(z, function2, function1, function22, str);
        this.gEmmrt = z2;
    }

    /* JADX DEBUG: Method merged with bridge method: onViewDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(@NotNull AbstractC51545voz.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        super.onViewDetachedFromWindow(actionBar);
        if (actionBar.uzCIH().isAnimating()) {
            actionBar.uzCIH().clearAnimation();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull AbstractC51545voz.ActionBar actionBar, @NotNull HomeStrategyCardInfo homeStrategyCardInfo) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(homeStrategyCardInfo, "");
        if (this.gEmmrt) {
            wPQ.AEQbTJ(actionBar.fARcdN());
        }
        KWHzl(actionBar, homeStrategyCardInfo);
        actionBar.DbNXlk().setText(homeStrategyCardInfo.getUsername());
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.apHBvG, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new StateListAnimator(viewInflate);
    }

    /* JADX INFO: renamed from: o.voS$StateListAnimator */
    public static final class StateListAnimator extends AbstractC51545voz.ActionBar {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
        }
    }
}
