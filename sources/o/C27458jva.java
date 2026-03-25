package o;

import android.view.View;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.ui.widget.product_details.ProductDetailsClickAction;
import com.okinc.business.invest_biz.ui.widget.product_details.binder.BonusApyTitleBinder$1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jva, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C27458jva extends AbstractC27119jpF<C27466jvi, C23799iJt> {
    public final InterfaceC27395juQ KWHzl;

    public C27458jva(InterfaceC27395juQ interfaceC27395juQ) {
        super(BonusApyTitleBinder$1.INSTANCE);
        this.KWHzl = interfaceC27395juQ;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C23799iJt c23799iJt, @NotNull C27466jvi c27466jvi) {
        Intrinsics.checkNotNullParameter(c23799iJt, "");
        Intrinsics.checkNotNullParameter(c27466jvi, "");
        c23799iJt.getRoot().setAlpha(c27466jvi.copydefault() ? 1.0f : 0.1f);
        c23799iJt.KWHzl.setTextValue(c27466jvi.djBIcL());
        c23799iJt.KWHzl.setHelperLabelType(c27466jvi.OLrzqt() != null ? 1 : 2);
        final InvestTipInfoVo investTipInfoVoOLrzqt = c27466jvi.OLrzqt();
        if (investTipInfoVoOLrzqt != null) {
            c23799iJt.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.juY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C27458jva.copydefault(this.OLrzqt, investTipInfoVoOLrzqt, view);
                }
            });
        }
        android.widget.ImageView imageView = c23799iJt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(0);
        android.widget.ImageView imageView2 = c23799iJt.OLrzqt;
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        android.content.Context context = c23799iJt.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        imageView2.setBackground(C27569jxf.generateCircleBackground$default(c27569jxf, context, 6, c27466jvi.KWHzl(), 0.0f, null, 24, null));
        c23799iJt.AEQbTJ.setText(c27466jvi.AEQbTJ());
    }

    public static final void copydefault(C27458jva c27458jva, InvestTipInfoVo investTipInfoVo, android.view.View view) {
        InterfaceC27395juQ interfaceC27395juQ = c27458jva.KWHzl;
        if (interfaceC27395juQ != null) {
            interfaceC27395juQ.KWHzl(new ProductDetailsClickAction.PendingIntent(investTipInfoVo));
        }
    }
}
