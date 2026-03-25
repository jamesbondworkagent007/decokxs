package o;

import com.okinc.business.invest_biz.data.models.InvestType;
import com.okinc.business.invest_biz.ui.screens.transaction.itembinder.InvestEstDailyYieldItemBinder$1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC24178iXu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jhb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26717jhb extends AbstractC27119jpF<InterfaceC24178iXu.StateListAnimator, C23905iNr> {
    public final boolean KWHzl;

    public C26717jhb(boolean z) {
        super(InvestEstDailyYieldItemBinder$1.INSTANCE);
        this.KWHzl = z;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C23905iNr c23905iNr, @NotNull InterfaceC24178iXu.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(c23905iNr, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        c23905iNr.copydefault.AEQbTJ(this.KWHzl);
        if (stateListAnimator.KWHzl() == InvestType.Borrow.getValue()) {
            c23905iNr.getRoot().setPadding(c23905iNr.getRoot().getPaddingLeft(), 0, c23905iNr.getRoot().getPaddingRight(), c23905iNr.getRoot().getPaddingBottom());
        } else {
            c23905iNr.getRoot().setPadding(c23905iNr.getRoot().getPaddingLeft(), c23905iNr.getRoot().getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.QbewEr), c23905iNr.getRoot().getPaddingRight(), c23905iNr.getRoot().getPaddingBottom());
        }
        C27138jpY.setData$default(c23905iNr.copydefault, stateListAnimator.OLrzqt(), stateListAnimator.KWHzl(), false, false, stateListAnimator.copydefault(), 8, null);
    }
}
