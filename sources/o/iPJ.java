package o;

import android.view.View;
import com.okinc.business.invest_biz.ui.finality_provider.FinalityProviderItemBinder$1;
import com.okinc.business.invest_biz.ui.finality_provider.InvestFinalityProviderItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class iPJ extends AbstractC27119jpF<InvestFinalityProviderItem, iIH> {
    public final Function1<InvestFinalityProviderItem, Unit> AEQbTJ;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.invest_biz.ui.finality_provider.InvestFinalityProviderItem, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public iPJ(@NotNull Function1<? super InvestFinalityProviderItem, Unit> function1) {
        super(FinalityProviderItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull iIH iih, @NotNull InvestFinalityProviderItem investFinalityProviderItem) {
        Intrinsics.checkNotNullParameter(iih, "");
        Intrinsics.checkNotNullParameter(investFinalityProviderItem, "");
        iih.copydefault.setText(investFinalityProviderItem.getValidatorName());
        C55251xgS c55251xgS = iih.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        c55251xgS.setVisibility(investFinalityProviderItem.getRecommended() ? 0 : 8);
        iih.gEmmrt.setText(investFinalityProviderItem.getTotalDelegations());
        iih.EZpvd.setText(C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, investFinalityProviderItem.getCommission(), false, 2, null));
        iih.getRoot().setSelected(investFinalityProviderItem.isSelected());
        android.view.View root = iih.getRoot();
        root.setOnClickListener(new Activity(root, 1000L, this, investFinalityProviderItem));
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ InvestFinalityProviderItem KWHzl;
        public final /* synthetic */ iPJ OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, iPJ ipj, InvestFinalityProviderItem investFinalityProviderItem) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = ipj;
            this.KWHzl = investFinalityProviderItem;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.AEQbTJ.invoke(this.KWHzl);
            }
        }
    }
}
