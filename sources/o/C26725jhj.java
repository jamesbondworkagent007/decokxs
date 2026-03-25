package o;

import com.okinc.business.invest_biz.ui.screens.transaction.itembinder.PriceRangeItemBinder$1;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.InterfaceC24178iXu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jhj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26725jhj extends AbstractC27119jpF<InterfaceC24178iXu.TaskStackBuilder, C23910iNw> {
    public C26725jhj() {
        super(PriceRangeItemBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C23910iNw c23910iNw, @NotNull InterfaceC24178iXu.TaskStackBuilder taskStackBuilder) {
        Intrinsics.checkNotNullParameter(c23910iNw, "");
        Intrinsics.checkNotNullParameter(taskStackBuilder, "");
        c23910iNw.EZpvd.setText(taskStackBuilder.KWHzl());
        android.widget.TextView textView = c23910iNw.OLrzqt;
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int i = C25493ixk.FragmentManager.invokespecialhOMIpD;
        C27492jwH c27492jwH = C27492jwH.OLrzqt;
        textView.setText(C33069mpW.KWHzl(context, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("num1", c27492jwH.valueOf(taskStackBuilder.copydefault())), C56390yDp.OLrzqt("num2", c27492jwH.valueOf(taskStackBuilder.AhwBna())), C56390yDp.OLrzqt("token1", taskStackBuilder.OLrzqt()), C56390yDp.OLrzqt("token2", taskStackBuilder.AEQbTJ()))));
        c23910iNw.copydefault.setTagPaint(1);
        if (taskStackBuilder.valueOf()) {
            C55251xgS c55251xgS = c23910iNw.copydefault;
            c55251xgS.setText(c55251xgS.getContext().getString(C25493ixk.FragmentManager.RihMUf));
            c23910iNw.copydefault.setOKDSStyle(7);
        } else {
            C55251xgS c55251xgS2 = c23910iNw.copydefault;
            c55251xgS2.setText(c55251xgS2.getContext().getString(C25493ixk.FragmentManager.resume));
            c23910iNw.copydefault.setOKDSStyle(11);
        }
    }
}
