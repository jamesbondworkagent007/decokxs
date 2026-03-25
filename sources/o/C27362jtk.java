package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.invest_biz.data.bean.InvestmentLogoData;
import com.okinc.business.invest_biz.ui.widget.defi_dashboard.binder.RecommendTokenItemBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jtk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27362jtk extends AbstractC27119jpF<C27375jtx, C23774iIv> {
    public final Function1<C27375jtx, Unit> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.jtx, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C27362jtk(@NotNull Function1<? super C27375jtx, Unit> function1) {
        super(RecommendTokenItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C23774iIv c23774iIv, @NotNull C27375jtx c27375jtx) {
        Intrinsics.checkNotNullParameter(c23774iIv, "");
        Intrinsics.checkNotNullParameter(c27375jtx, "");
        C27538jxA c27538jxA = C27538jxA.EZpvd;
        android.content.Context context = c23774iIv.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c27538jxA.KWHzl(context, c23774iIv.EZpvd, new InvestmentLogoData(C56402yEa.EZpvd(c27375jtx.valueOf()), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, c27375jtx.AEQbTJ(), 14, (DefaultConstructorMarker) null), 32.0f, 16.0f, (96 & 32) != 0 ? C32113mPz.ActionBar.fJNWhG : C52761wXj.Activity.zuBGHE, (96 & 64) != 0 ? 1.0f : 0.0f);
        c23774iIv.AYXKKw.setText(c27375jtx.AYXKKw());
        c23774iIv.KWHzl.setText(c27375jtx.KWHzl());
        android.widget.TextView textView = c23774iIv.KWHzl;
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        android.content.Context context2 = c23774iIv.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        textView.setTextColor(C33512mxp.tradeRiseDefault$default(c33512mxp, context2, 0.0f, 2, null));
        android.widget.TextView textView2 = c23774iIv.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c27375jtx.gEmmrt()) ? 0 : 8);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) c27375jtx.gEmmrt())) {
            C27586jxw c27586jxw = C27586jxw.OLrzqt;
            c23774iIv.AEQbTJ.setText(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C25493ixk.FragmentManager.fFgQHt), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C27586jxw.localizeCryptoAmount$default(c27586jxw, C33129mqd.EZpvd(c27375jtx.gEmmrt()), 0, c27586jxw.OLrzqt(java.lang.Long.valueOf(c27375jtx.EZpvd()), c27375jtx.AhwBna()), null, null, null, 58, null)))));
        }
        ConstraintLayout root = c23774iIv.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, this, c27375jtx));
    }

    /* JADX INFO: renamed from: o.jtk$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C27362jtk AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C27375jtx copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C27362jtk c27362jtk, C27375jtx c27375jtx) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = c27362jtk;
            this.copydefault = c27375jtx;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.KWHzl.invoke(this.copydefault);
            }
        }
    }
}
