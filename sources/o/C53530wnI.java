package o;

import com.okinc.unify_trade.biz.TradeMenuItemBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47978uAl;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wnI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53530wnI extends AbstractC50047uzz {
    public java.util.List<TradeMenuItemBean> AYXKKw;
    public androidx.fragment.app.FragmentManager AhwBna;
    public Function1<? super TradeMenuItemBean, Unit> djBIcL;
    public Function0<Unit> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53530wnI(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53530wnI(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnItemClickCallback(Function0<Unit> function0) {
        this.gEmmrt = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:18) call: o.wnI.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53530wnI(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53530wnI(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setTitleAppearance(C52761wXj.LoaderManager.dHguZz);
        setTitleColor(C52761wXj.Activity.Dff);
        setHintText("");
        setArrowColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.wnI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setTypeMenu$default(C53530wnI c53530wnI, java.util.List list, androidx.fragment.app.FragmentManager fragmentManager, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        c53530wnI.setTypeMenu(list, fragmentManager, function1);
    }

    public final void setTypeMenu(@NotNull java.util.List<TradeMenuItemBean> list, @NotNull androidx.fragment.app.FragmentManager fragmentManager, Function1<? super TradeMenuItemBean, Unit> function1) {
        java.lang.Object next;
        java.lang.String title;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.AYXKKw = list;
        this.AhwBna = fragmentManager;
        this.djBIcL = function1;
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((TradeMenuItemBean) next).isSelect()) {
                    break;
                }
            }
        }
        TradeMenuItemBean tradeMenuItemBean = (TradeMenuItemBean) next;
        if (tradeMenuItemBean != null && (title = tradeMenuItemBean.getTitle()) != null) {
            str = title;
        }
        AbstractC50047uzz.setTypeText$default(this, str, false, 2, null);
        if (C33129mqd.valueOf(java.lang.Integer.valueOf(list.size()), 1)) {
            setDrawableEnd(null);
        }
    }

    @Override // o.AbstractC50047uzz
    public void KWHzl() {
        Function0<Unit> function0 = this.gEmmrt;
        if (function0 != null) {
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        java.util.List<TradeMenuItemBean> list = this.AYXKKw;
        if (C33129mqd.valueOf(list != null ? java.lang.Integer.valueOf(list.size()) : null, 1)) {
            return;
        }
        C47978uAl.Application application = C47978uAl.Companion;
        java.util.List<TradeMenuItemBean> listAhwBna = this.AYXKKw;
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        C47978uAl c47978uAlNewInstance$default = C47978uAl.Application.newInstance$default(application, listAhwBna, null, false, null, 0, 30, null);
        c47978uAlNewInstance$default.KWHzl(new ActionBar());
        androidx.fragment.app.FragmentManager fragmentManager = this.AhwBna;
        if (fragmentManager == null) {
            return;
        }
        c47978uAlNewInstance$default.show(fragmentManager, "");
    }

    /* JADX INFO: renamed from: o.wnI$ActionBar */
    public static final class ActionBar implements C47978uAl.StateListAnimator {
        public ActionBar() {
        }

        @Override // o.C47978uAl.StateListAnimator
        public void copydefault(TradeMenuItemBean tradeMenuItemBean) {
            Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
            C53530wnI.this.AEQbTJ(tradeMenuItemBean);
        }
    }

    public final void AEQbTJ(TradeMenuItemBean tradeMenuItemBean) {
        if (tradeMenuItemBean == null) {
            return;
        }
        java.util.List<TradeMenuItemBean> list = this.AYXKKw;
        if (list != null) {
            for (TradeMenuItemBean tradeMenuItemBean2 : list) {
                tradeMenuItemBean2.setSelect(Intrinsics.EZpvd((java.lang.Object) tradeMenuItemBean2.getTitle(), (java.lang.Object) tradeMenuItemBean.getTitle()));
            }
        }
        AbstractC50047uzz.setTypeText$default(this, tradeMenuItemBean.getTitle(), false, 2, null);
        Function1<? super TradeMenuItemBean, Unit> function1 = this.djBIcL;
        if (function1 != null) {
            function1.invoke(tradeMenuItemBean);
        }
    }
}
