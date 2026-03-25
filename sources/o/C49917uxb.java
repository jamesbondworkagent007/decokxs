package o;

import android.view.View;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47978uAl;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uxb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49917uxb extends android.widget.FrameLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public Function1<? super java.lang.String, Unit> AEQbTJ;
    public java.lang.String EZpvd;
    public androidx.fragment.app.FragmentManager KWHzl;
    public final AbstractC49530uqL copydefault;
    public final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C49917uxb(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C49917uxb(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> */
    public final Function1<java.lang.String, Unit> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final androidx.fragment.app.FragmentManager OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallback(Function1<? super java.lang.String, Unit> function1) {
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFm(androidx.fragment.app.FragmentManager fragmentManager) {
        this.KWHzl = fragmentManager;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.uxb.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C49917uxb(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49917uxb(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> listGEmmrt = yDY.gEmmrt(C56390yDp.OLrzqt("price_from", context.getString(C55688xof.Application.gCNefq)), C56390yDp.OLrzqt("ratio", context.getString(C55688xof.Application.HJWChPRAkuRW)));
        this.djBIcL = listGEmmrt;
        AbstractC49530uqL abstractC49530uqLCopydefault = AbstractC49530uqL.copydefault(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(abstractC49530uqLCopydefault, "");
        this.copydefault = abstractC49530uqLCopydefault;
        C55052xcf c55052xcf = abstractC49530uqLCopydefault.AEQbTJ;
        java.lang.String second = listGEmmrt.get(0).getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "");
        c55052xcf.setTitle(second);
        this.EZpvd = listGEmmrt.get(0).getFirst();
        AEQbTJ(true);
    }

    /* JADX INFO: renamed from: o.uxb$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uxb.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void setCurrentType(@NotNull java.lang.String str, boolean z) {
        java.lang.Object next;
        Function1<? super java.lang.String, Unit> function1;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = this.djBIcL.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.EZpvd(((kotlin.Pair) next).getFirst(), (java.lang.Object) str)) {
                    break;
                }
            }
        }
        kotlin.Pair pair = (kotlin.Pair) next;
        if (pair != null) {
            this.EZpvd = (java.lang.String) pair.getFirst();
            C55052xcf c55052xcf = this.copydefault.AEQbTJ;
            java.lang.Object second = pair.getSecond();
            Intrinsics.checkNotNullExpressionValue(second, "");
            c55052xcf.setTitle((java.lang.CharSequence) second);
            if (!z || (function1 = this.AEQbTJ) == null) {
                return;
            }
            function1.invoke(pair.getFirst());
        }
    }

    public final void AEQbTJ(boolean z) {
        this.copydefault.AEQbTJ.setEnabled(z);
        if (z) {
            C55052xcf c55052xcf = this.copydefault.AEQbTJ;
            c55052xcf.setOnClickListener(new TaskDescription(c55052xcf, 1000L, this));
        } else {
            this.copydefault.AEQbTJ.setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: o.uxb$Application */
    public static final class Application implements C47978uAl.StateListAnimator {
        public Application() {
        }

        @Override // o.C47978uAl.StateListAnimator
        public void copydefault(TradeMenuItemBean tradeMenuItemBean) {
            Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
            C49917uxb.this.copydefault.AEQbTJ.setTitle(tradeMenuItemBean.getTitle());
            java.lang.Object data = tradeMenuItemBean.getData();
            java.lang.String str = data instanceof java.lang.String ? (java.lang.String) data : null;
            if (str != null) {
                C49917uxb c49917uxb = C49917uxb.this;
                c49917uxb.EZpvd = str;
                Function1<java.lang.String, Unit> function1EZpvd = c49917uxb.EZpvd();
                if (function1EZpvd != null) {
                    function1EZpvd.invoke(str);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.uxb$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C49917uxb OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C49917uxb c49917uxb) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c49917uxb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                java.lang.Object second = ((kotlin.Pair) this.OLrzqt.djBIcL.get(0)).getSecond();
                Intrinsics.checkNotNullExpressionValue(second, "");
                TradeMenuItemBean tradeMenuItemBean = new TradeMenuItemBean((java.lang.String) second, Intrinsics.EZpvd(this.OLrzqt.EZpvd, ((kotlin.Pair) this.OLrzqt.djBIcL.get(0)).getFirst()), ((kotlin.Pair) this.OLrzqt.djBIcL.get(0)).getFirst(), null, false, null, null, 0, false, null, 0, false, 0, null, null, 32760, null);
                java.lang.Object second2 = ((kotlin.Pair) this.OLrzqt.djBIcL.get(1)).getSecond();
                Intrinsics.checkNotNullExpressionValue(second2, "");
                C47978uAl c47978uAlNewInstance$default = C47978uAl.Application.newInstance$default(C47978uAl.Companion, yDY.gEmmrt(tradeMenuItemBean, new TradeMenuItemBean((java.lang.String) second2, Intrinsics.EZpvd(this.OLrzqt.EZpvd, ((kotlin.Pair) this.OLrzqt.djBIcL.get(1)).getFirst()), ((kotlin.Pair) this.OLrzqt.djBIcL.get(1)).getFirst(), null, false, null, null, 0, false, null, 0, false, 0, null, null, 32760, null)), null, false, null, 0, 30, null);
                c47978uAlNewInstance$default.KWHzl(this.OLrzqt.new Application());
                androidx.fragment.app.FragmentManager fragmentManagerOLrzqt = this.OLrzqt.OLrzqt();
                if (fragmentManagerOLrzqt == null) {
                    return;
                }
                c47978uAlNewInstance$default.show(fragmentManagerOLrzqt, "PriceWithDepthTypeSwitchView");
            }
        }
    }
}
