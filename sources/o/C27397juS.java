package o;

import android.view.View;
import com.okinc.business.invest_biz.data.bean.InvestPopUpData;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestmentLogoData;
import com.okinc.business.invest_biz.ui.widget.product_details.ProductDetailsClickAction;
import com.okinc.business.invest_biz.ui.widget.product_details.binder.BonusApySubInfoBinder$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.juS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C27397juS extends AbstractC27119jpF<C27468jvk, C23804iJy> {
    public final InterfaceC27395juQ AEQbTJ;

    public C27397juS(InterfaceC27395juQ interfaceC27395juQ) {
        super(BonusApySubInfoBinder$1.INSTANCE);
        this.AEQbTJ = interfaceC27395juQ;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C23804iJy c23804iJy, @NotNull C27468jvk c27468jvk) {
        InvestPopUpData popUpData;
        Intrinsics.checkNotNullParameter(c23804iJy, "");
        Intrinsics.checkNotNullParameter(c27468jvk, "");
        c23804iJy.getRoot().setAlpha(c27468jvk.KWHzl() ? 1.0f : 0.1f);
        C27538jxA c27538jxA = C27538jxA.EZpvd;
        android.content.Context context = c23804iJy.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c27538jxA.OLrzqt(context, c23804iJy.EZpvd, new InvestmentLogoData(C56402yEa.EZpvd(c27468jvk.AEQbTJ()), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 30, (DefaultConstructorMarker) null), 16.0f, (48 & 16) != 0 ? C32113mPz.ActionBar.fJNWhG : 0, (48 & 32) != 0 ? 0.5f : 0.0f, (48 & 64) != 0 ? C27569jxf.OLrzqt.EZpvd() : 0);
        c23804iJy.AEQbTJ.setTextValue(c27468jvk.djBIcL());
        InvestTipInfoVo investTipInfoVoOLrzqt = c27468jvk.OLrzqt();
        c23804iJy.AEQbTJ.setHelperLabelType((((investTipInfoVoOLrzqt == null || (popUpData = investTipInfoVoOLrzqt.getPopUpData()) == null) ? null : popUpData.getActions()) == null || !(C33129mqd.OLrzqt((java.lang.CharSequence) investTipInfoVoOLrzqt.getPopUpData().getTitle()) || C33129mqd.OLrzqt((java.lang.CharSequence) investTipInfoVoOLrzqt.getPopUpData().getContent()))) ? 2 : 1);
        final InvestTipInfoVo investTipInfoVoOLrzqt2 = c27468jvk.OLrzqt();
        if (investTipInfoVoOLrzqt2 != null) {
            c23804iJy.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.juX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C27397juS.KWHzl(this.EZpvd, investTipInfoVoOLrzqt2, view);
                }
            });
        }
        c23804iJy.copydefault.setText(c27468jvk.copydefault());
        android.widget.TextView textView = c23804iJy.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
    }

    public static final void KWHzl(C27397juS c27397juS, InvestTipInfoVo investTipInfoVo, android.view.View view) {
        InterfaceC27395juQ interfaceC27395juQ = c27397juS.AEQbTJ;
        if (interfaceC27395juQ != null) {
            interfaceC27395juQ.KWHzl(new ProductDetailsClickAction.PendingIntent(investTipInfoVo));
        }
    }
}
