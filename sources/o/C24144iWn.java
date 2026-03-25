package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo;
import com.okinc.business.invest_biz.ui.page.order.details.viewbinder.InvestOrderDetailsSingleColumnLineInfoBinder$1;
import kotlin.jvm.internal.Intrinsics;
import o.iVX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iWn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C24144iWn extends AbstractC27119jpF<iVX.LoaderManager, iIU> {
    public static final C24144iWn EZpvd = new C24144iWn();

    private C24144iWn() {
        super(InvestOrderDetailsSingleColumnLineInfoBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull iIU iiu, @NotNull iVX.LoaderManager loaderManager) {
        Intrinsics.checkNotNullParameter(iiu, "");
        Intrinsics.checkNotNullParameter(loaderManager, "");
        android.content.Context context = iiu.getRoot().getContext();
        ConstraintLayout root = iiu.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        int iOLrzqt = loaderManager.OLrzqt();
        Intrinsics.copydefault(context);
        root.setPaddingRelative(root.getPaddingStart(), C55298xhM.OLrzqt(iOLrzqt, context), root.getPaddingEnd(), root.getPaddingBottom());
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        InvestOrderDetailsInfoVo.InvestLineInfo investLineInfoEZpvd = loaderManager.EZpvd();
        android.widget.TextView textView = iiu.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        android.widget.TextView textView2 = iiu.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        android.widget.ImageView imageView = iiu.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        android.widget.ImageView imageView2 = iiu.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        c27569jxf.copydefault(investLineInfoEZpvd, context, textView, textView2, imageView, imageView2);
    }
}
