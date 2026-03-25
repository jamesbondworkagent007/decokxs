package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo;
import com.okinc.business.invest_biz.ui.page.order.details.viewbinder.InvestOrderDetailsTwoColumnLineInfoBinder$1;
import kotlin.jvm.internal.Intrinsics;
import o.iVX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iWo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C24145iWo extends AbstractC27119jpF<iVX.PendingIntent, iIY> {
    public static final C24145iWo OLrzqt = new C24145iWo();

    private C24145iWo() {
        super(InvestOrderDetailsTwoColumnLineInfoBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    public void KWHzl(@NotNull iIY iiy, @NotNull iVX.PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(iiy, "");
        Intrinsics.checkNotNullParameter(pendingIntent, "");
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        InvestOrderDetailsInfoVo.InvestLineInfo investLineInfoKWHzl = pendingIntent.KWHzl();
        android.content.Context context = iiy.OLrzqt.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        android.widget.TextView textView = iiy.OLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        android.widget.TextView textView2 = iiy.OLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        Group group = iiy.OLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(group, "");
        android.widget.ImageView imageView = iiy.OLrzqt.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        c27569jxf.copydefault(investLineInfoKWHzl, context, textView, textView2, group, imageView);
        if (pendingIntent.EZpvd() != null && !InvestOrderDetailsInfoVo.InvestLineInfo.Companion.EZpvd(pendingIntent.EZpvd())) {
            ConstraintLayout root = iiy.copydefault.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            root.setVisibility(0);
            InvestOrderDetailsInfoVo.InvestLineInfo investLineInfoEZpvd = pendingIntent.EZpvd();
            android.content.Context context2 = iiy.copydefault.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            android.widget.TextView textView3 = iiy.copydefault.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            android.widget.TextView textView4 = iiy.copydefault.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            Group group2 = iiy.copydefault.KWHzl;
            Intrinsics.checkNotNullExpressionValue(group2, "");
            android.widget.ImageView imageView2 = iiy.copydefault.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            c27569jxf.copydefault(investLineInfoEZpvd, context2, textView3, textView4, group2, imageView2);
            return;
        }
        ConstraintLayout root2 = iiy.copydefault.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        root2.setVisibility(4);
    }
}
