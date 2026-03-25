package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.business.invest_biz.data.bean.InvestClickActionType;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.ui.widget.product_details.ProductDetailsClickAction;
import com.okinc.business.invest_biz.ui.widget.product_details.binder.BonusRulesContentBinder$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jve, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C27462jve extends AbstractC27119jpF<C27460jvc, iIA> {
    public final InterfaceC27395juQ EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C27462jve() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.juQ:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.juQ) : (r1v0 o.juQ))
 A[MD:(o.juQ):void (m)] (LINE:12) call: o.jve.<init>(o.juQ):void type: THIS */
    public /* synthetic */ C27462jve(InterfaceC27395juQ interfaceC27395juQ, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : interfaceC27395juQ);
    }

    public C27462jve(InterfaceC27395juQ interfaceC27395juQ) {
        super(BonusRulesContentBinder$1.INSTANCE);
        this.EZpvd = interfaceC27395juQ;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull iIA iia, @NotNull C27460jvc c27460jvc) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(iia, "");
        Intrinsics.checkNotNullParameter(c27460jvc, "");
        iia.copydefault.setText(c27460jvc.copydefault());
        android.widget.TextView textView = iia.EZpvd;
        if (c27460jvc.AEQbTJ()) {
            str = "";
        } else {
            str = c27460jvc.EZpvd() + ". ";
        }
        textView.setText(str);
        android.widget.TextView textView2 = iia.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(c27460jvc.AEQbTJ() ^ true ? 0 : 8);
        android.widget.ImageView imageView = iia.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(c27460jvc.KWHzl() != null ? 0 : 8);
        InvestTipInfoVo investTipInfoVoKWHzl = c27460jvc.KWHzl();
        iia.copydefault.setTextAppearance((investTipInfoVoKWHzl != null ? investTipInfoVoKWHzl.getClickAction() : null) != InvestClickActionType.NO_ACTION ? C52761wXj.LoaderManager.zuBGHE : C52761wXj.LoaderManager.valueOf);
        InvestTipInfoVo investTipInfoVoKWHzl2 = c27460jvc.KWHzl();
        if (investTipInfoVoKWHzl2 != null) {
            LinearLayoutCompat root = iia.getRoot();
            root.setOnClickListener(new ActionBar(root, 1000L, this, investTipInfoVoKWHzl2));
        }
    }

    /* JADX INFO: renamed from: o.jve$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ InvestTipInfoVo KWHzl;
        public final /* synthetic */ C27462jve copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C27462jve c27462jve, InvestTipInfoVo investTipInfoVo) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = c27462jve;
            this.KWHzl = investTipInfoVo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                InterfaceC27395juQ interfaceC27395juQ = this.copydefault.EZpvd;
                if (interfaceC27395juQ != null) {
                    interfaceC27395juQ.KWHzl(new ProductDetailsClickAction.PendingIntent(this.KWHzl));
                }
            }
        }
    }
}
