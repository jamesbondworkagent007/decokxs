package o;

import android.view.View;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C47978uAl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vFl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50196vFl extends android.widget.FrameLayout {
    public java.util.List<TradeMenuItemBean> AEQbTJ;
    public Function1<? super TradeMenuItemBean, Unit> EZpvd;
    public androidx.fragment.app.FragmentManager OLrzqt;
    public final AbstractC49530uqL copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50196vFl(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        AbstractC49530uqL abstractC49530uqLCopydefault = AbstractC49530uqL.copydefault(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(abstractC49530uqLCopydefault, "");
        this.copydefault = abstractC49530uqLCopydefault;
        C55052xcf c55052xcf = abstractC49530uqLCopydefault.AEQbTJ;
        c55052xcf.setOnClickListener(new Application(c55052xcf, 1000L, this));
    }

    /* JADX INFO: renamed from: o.vFl$StateListAnimator */
    public static final class StateListAnimator implements C47978uAl.StateListAnimator {
        public StateListAnimator() {
        }

        @Override // o.C47978uAl.StateListAnimator
        public void copydefault(TradeMenuItemBean tradeMenuItemBean) {
            Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
            java.util.List<TradeMenuItemBean> list = C50196vFl.this.AEQbTJ;
            if (list != null) {
                for (TradeMenuItemBean tradeMenuItemBean2 : list) {
                    tradeMenuItemBean2.setSelect(Intrinsics.EZpvd((java.lang.Object) tradeMenuItemBean2.getTitle(), (java.lang.Object) tradeMenuItemBean.getTitle()));
                }
            }
            C50196vFl.this.copydefault.AEQbTJ.setTitle(tradeMenuItemBean.getTitle());
            Function1 function1 = C50196vFl.this.EZpvd;
            if (function1 != null) {
                function1.invoke(tradeMenuItemBean);
            }
            C50196vFl.this.setSelected(false);
        }
    }

    /* JADX INFO: renamed from: o.vFl$TaskDescription */
    public static final class TaskDescription implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            EZpvd();
            return Unit.INSTANCE;
        }

        public final void EZpvd() {
            C50196vFl.this.setSelected(false);
        }
    }

    public final void setData(@NotNull java.util.List<TradeMenuItemBean> list, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Function1<? super TradeMenuItemBean, Unit> function1) {
        java.lang.Object next;
        java.lang.String title;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = list;
        this.OLrzqt = fragmentManager;
        this.EZpvd = function1;
        C55052xcf c55052xcf = this.copydefault.AEQbTJ;
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
        c55052xcf.setTitle(str);
    }

    public final TradeMenuItemBean OLrzqt() {
        java.util.List<TradeMenuItemBean> list = this.AEQbTJ;
        java.lang.Object obj = null;
        if (list == null) {
            return null;
        }
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((TradeMenuItemBean) next).isSelect()) {
                obj = next;
                break;
            }
        }
        return (TradeMenuItemBean) obj;
    }

    /* JADX INFO: renamed from: o.vFl$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C50196vFl EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C50196vFl c50196vFl) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c50196vFl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                java.util.List list = this.EZpvd.AEQbTJ;
                if (list == null || list.isEmpty()) {
                    return;
                }
                this.EZpvd.setSelected(true);
                C47978uAl.Application application = C47978uAl.Companion;
                java.util.List listAhwBna = this.EZpvd.AEQbTJ;
                if (listAhwBna == null) {
                    listAhwBna = yDY.AhwBna();
                }
                C47978uAl c47978uAlNewInstance$default = C47978uAl.Application.newInstance$default(application, listAhwBna, null, false, null, 0, 30, null);
                c47978uAlNewInstance$default.KWHzl(this.EZpvd.new StateListAnimator());
                c47978uAlNewInstance$default.copydefault(this.EZpvd.new TaskDescription());
                androidx.fragment.app.FragmentManager fragmentManager = this.EZpvd.OLrzqt;
                if (fragmentManager == null) {
                    return;
                }
                c47978uAlNewInstance$default.show(fragmentManager, "BotSelectShareTypeView");
            }
        }
    }
}
