package o;

import androidx.core.content.ContextCompat;
import com.okinc.business.invest_biz.data.bean.InvestLogo;
import com.okinc.business.invest_biz.data.bean.InvestLogoBaseVo;
import com.okinc.business.invest_biz.ui.page.order.details.viewbinder.InvestOrderDetailsAssetBinder$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.iVX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iWl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C24142iWl extends AbstractC27119jpF<iVX.StateListAnimator, iIP> {
    public static final C24142iWl copydefault = new C24142iWl();

    private C24142iWl() {
        super(InvestOrderDetailsAssetBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    public void KWHzl(@NotNull iIP iip, @NotNull iVX.StateListAnimator stateListAnimator) {
        InvestLogo investLogo;
        int color;
        Intrinsics.checkNotNullParameter(iip, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        android.content.Context context = iip.getRoot().getContext();
        java.lang.String tokenLogo = stateListAnimator.copydefault().getTokenLogo();
        java.lang.String tokenSymbol = stateListAnimator.copydefault().getTokenSymbol();
        if (tokenLogo == null || tokenLogo.length() == 0 || tokenSymbol == null || tokenSymbol.length() == 0) {
            investLogo = new InvestLogo((java.util.List) null, C56402yEa.EZpvd(new InvestLogoBaseVo("placeHolder", (java.lang.String) null, 2, (DefaultConstructorMarker) null)), (java.util.List) null, (java.util.List) null, 13, (DefaultConstructorMarker) null);
        } else {
            investLogo = new InvestLogo((java.util.List) null, C56402yEa.EZpvd(new InvestLogoBaseVo(tokenLogo, tokenSymbol)), (java.util.List) null, (java.util.List) null, 13, (DefaultConstructorMarker) null);
        }
        InvestLogo investLogo2 = investLogo;
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        Intrinsics.copydefault(context);
        C27569jxf.setSDAvatarLayout$default(c27569jxf, context, iip.AEQbTJ, investLogo2, 0, 0.0f, 24, (java.lang.Object) null);
        java.lang.String amount = stateListAnimator.copydefault().getAmount();
        if (amount == null || amount.length() == 0) {
            if (stateListAnimator.OLrzqt()) {
                android.widget.TextView textView = iip.KWHzl;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(8);
                C55113xdn.showLoading$default(iip.EZpvd, 0L, 1, null);
            } else {
                android.widget.TextView textView2 = iip.KWHzl;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(0);
                iip.KWHzl.setText("--");
                iip.EZpvd.copydefault();
            }
        } else {
            android.widget.TextView textView3 = iip.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(0);
            java.lang.String strEZpvd = C27492jwH.OLrzqt.EZpvd(stateListAnimator.copydefault().getDirection(), amount);
            android.widget.TextView textView4 = iip.KWHzl;
            java.lang.String tokenSymbol2 = stateListAnimator.copydefault().getTokenSymbol();
            textView4.setText(strEZpvd + " " + (tokenSymbol2 != null ? tokenSymbol2 : ""));
            iip.EZpvd.copydefault();
        }
        android.widget.TextView textView5 = iip.KWHzl;
        java.lang.Integer direction = stateListAnimator.copydefault().getDirection();
        if (direction != null && direction.intValue() == 1) {
            color = C33512mxp.getRiseUpColor$default(C33512mxp.AEQbTJ, 0.0f, 1, null);
        } else {
            color = ContextCompat.getColor(context, C52761wXj.Activity.gLWkOL);
        }
        textView5.setTextColor(color);
    }
}
