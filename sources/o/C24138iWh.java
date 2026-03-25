package o;

import android.view.ViewGroup;
import com.okinc.business.invest_biz.ui.page.order.details.viewbinder.InvestOrderDetailsDividerBinder$1;
import kotlin.jvm.internal.Intrinsics;
import o.iVX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iWh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C24138iWh extends AbstractC27119jpF<iVX.Activity, iIS> {
    public static final C24138iWh KWHzl = new C24138iWh();

    private C24138iWh() {
        super(InvestOrderDetailsDividerBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull iIS iis, @NotNull iVX.Activity activity) {
        Intrinsics.checkNotNullParameter(iis, "");
        Intrinsics.checkNotNullParameter(activity, "");
        android.view.View root = iis.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            android.content.Context context = iis.getRoot().getContext();
            int iAEQbTJ = activity.AEQbTJ();
            Intrinsics.copydefault(context);
            int iOLrzqt = C55298xhM.OLrzqt(iAEQbTJ, context);
            marginLayoutParams.setMarginStart(iOLrzqt);
            marginLayoutParams.setMarginEnd(iOLrzqt);
            marginLayoutParams.topMargin = C55298xhM.OLrzqt(activity.OLrzqt(), context);
            root.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
