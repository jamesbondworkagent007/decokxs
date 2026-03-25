package o;

import com.okinc.business.invest_biz.data.bean.InvestmentLogoData;
import com.okinc.business.invest_biz.ui.widget.product_details.binder.BonusDailyRewardsContentBinder$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jvb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C27459jvb extends AbstractC27119jpF<C27463jvf, C23804iJy> {
    public C27459jvb() {
        super(BonusDailyRewardsContentBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C23804iJy c23804iJy, @NotNull C27463jvf c27463jvf) {
        Intrinsics.checkNotNullParameter(c23804iJy, "");
        Intrinsics.checkNotNullParameter(c27463jvf, "");
        c23804iJy.getRoot().setPadding(c23804iJy.getRoot().getPaddingStart(), c23804iJy.getRoot().getTop(), c23804iJy.getRoot().getPaddingEnd(), c23804iJy.getRoot().getPaddingBottom() + C55298xhM.dp2px$default(8.0f, null, 1, null));
        C27538jxA c27538jxA = C27538jxA.EZpvd;
        android.content.Context context = c23804iJy.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c27538jxA.OLrzqt(context, c23804iJy.EZpvd, new InvestmentLogoData(C56402yEa.EZpvd(c27463jvf.EZpvd()), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 30, (DefaultConstructorMarker) null), 16.0f, (48 & 16) != 0 ? C32113mPz.ActionBar.fJNWhG : 0, (48 & 32) != 0 ? 0.5f : 0.0f, (48 & 64) != 0 ? C27569jxf.OLrzqt.EZpvd() : 0);
        c23804iJy.AEQbTJ.setHelperLabelType(2);
        c23804iJy.AEQbTJ.setTextValue(c27463jvf.KWHzl() + " " + c27463jvf.OLrzqt());
        c23804iJy.copydefault.setText(c27463jvf.copydefault());
        android.widget.TextView textView = c23804iJy.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
    }
}
