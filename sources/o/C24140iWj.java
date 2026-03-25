package o;

import com.okinc.business.invest_biz.ui.page.order.details.viewbinder.InvestOrderDetailsInvestmentTokenBinder$1;
import kotlin.jvm.internal.Intrinsics;
import o.iVX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iWj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C24140iWj extends AbstractC27119jpF<iVX.TaskDescription, iIX> {
    public static final C24140iWj copydefault = new C24140iWj();

    private C24140iWj() {
        super(InvestOrderDetailsInvestmentTokenBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull iIX iix, @NotNull iVX.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(iix, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        android.widget.ImageView imageView = iix.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        java.lang.String tokenLogo = taskDescription.EZpvd().getTokenLogo();
        c27569jxf.AEQbTJ(imageView, tokenLogo != null ? tokenLogo : "", c27569jxf.OLrzqt());
        java.lang.String amount = taskDescription.EZpvd().getAmount();
        if (amount == null || amount.length() == 0) {
            iix.KWHzl.setText("--");
            iix.EZpvd.setText("--");
        } else {
            iix.KWHzl.setText(taskDescription.EZpvd().getTokenSymbol());
            iix.EZpvd.setText(C27492jwH.OLrzqt.EZpvd(taskDescription.EZpvd().getDirection(), taskDescription.EZpvd().getAmount()));
        }
    }
}
