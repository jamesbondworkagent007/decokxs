package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import com.okinc.business.invest_biz.data.bean.InvestTag;
import com.okinc.business.invest_biz.ui.screens.eventpage.InvestMultiTabEventPageProductDataBinder$1;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C26422jby;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jbz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26423jbz extends AbstractC27121jpH<C26422jby.Activity, iIN> {
    public C26423jbz() {
        super(InvestMultiTabEventPageProductDataBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C27120jpG<iIN> c27120jpG, @NotNull final C26422jby.Activity activity) {
        java.lang.String platformName;
        Intrinsics.checkNotNullParameter(c27120jpG, "");
        Intrinsics.checkNotNullParameter(activity, "");
        final iIN iin = (iIN) c27120jpG.KWHzl();
        iin.AYXKKw.setText(activity.copydefault().getInvestmentName());
        if (C33129mqd.OLrzqt((java.lang.CharSequence) activity.copydefault().getInvestmentClassify())) {
            android.content.Context context = iin.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            platformName = C33069mpW.KWHzl(context, C25493ixk.FragmentManager.DsrFlB, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("protocolName", activity.copydefault().getPlatformName()), C56390yDp.OLrzqt("protocolType", activity.copydefault().getInvestmentClassify())));
        } else {
            platformName = activity.copydefault().getPlatformName();
        }
        iin.djBIcL.setText(platformName);
        iin.AhwBna.setText(C27586jxw.OLrzqt.AEQbTJ(C33129mqd.EZpvd(activity.copydefault().getRate()), (38 & 2) != 0 ? 0 : 0, (38 & 4) != 0 ? 2 : 0, (38 & 8) == 0, (38 & 16) != 0 ? DisplaySign.EXCEPT_ZERO : DisplaySign.AUTO, (38 & 32) != 0 ? RoundingMode.DOWN : null));
        iin.valueOf.setText(activity.copydefault().getRateTypeDesc());
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        android.content.Context context2 = iin.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        C27569jxf.setSDAvatarLayout$default(c27569jxf, context2, iin.OLrzqt, activity.copydefault().getInvestLogo(), 0, 0.0f, 24, (java.lang.Object) null);
        android.widget.ImageView imageView = iin.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(activity.copydefault().getHasBonus() ? 0 : 8);
        iin.AhwBna.setTextColor(ContextCompat.getColor(iin.getRoot().getContext(), activity.copydefault().getHasBonus() ? C25493ixk.TaskDescription.AhwBna : C52761wXj.Activity.fdOvFl));
        iin.valueOf.setTextColor(ContextCompat.getColor(iin.getRoot().getContext(), activity.copydefault().getHasBonus() ? C25493ixk.TaskDescription.AhwBna : C52761wXj.Activity.fdOvFl));
        C55251xgS c55251xgS = iin.AEQbTJ;
        Intrinsics.copydefault(c55251xgS);
        c55251xgS.setVisibility(activity.copydefault().getInvestTagList().isEmpty() ^ true ? 0 : 8);
        InvestTag investTag = (InvestTag) CollectionsKt___CollectionsKt.firstOrNull(activity.copydefault().getInvestTagList());
        if (investTag != null) {
            c55251xgS.setText(investTag.OLrzqt());
            c55251xgS.setOKDSStyle(investTag.copydefault() == 2 ? 7 : 0);
        }
        iin.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.jbA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C26423jbz.copydefault(iin, activity, view);
            }
        });
    }

    public static final void copydefault(iIN iin, C26422jby.Activity activity, android.view.View view) {
        C27508jwX c27508jwX = C27508jwX.AEQbTJ;
        android.content.Context context = iin.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C27508jwX.toInvestDetail$default(c27508jwX, context, java.lang.Long.valueOf(activity.copydefault().getInvestmentId()), null, 0, 4, null);
    }
}
