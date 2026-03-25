package o;

import com.okinc.business.invest_biz.ui.screens.transaction.itembinder.PriceV3CurrentPriceItemBinder$1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC24178iXu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jhh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26723jhh extends AbstractC27119jpF<InterfaceC24178iXu.AssistContent, C23911iNx> {
    public C26723jhh() {
        super(PriceV3CurrentPriceItemBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C23911iNx c23911iNx, @NotNull InterfaceC24178iXu.AssistContent assistContent) {
        Intrinsics.checkNotNullParameter(c23911iNx, "");
        Intrinsics.checkNotNullParameter(assistContent, "");
        c23911iNx.getRoot().setPadding(c23911iNx.getRoot().getPaddingLeft(), c23911iNx.getRoot().getPaddingTop(), c23911iNx.getRoot().getPaddingRight(), C55298xhM.dp2px$default(20.0f, null, 1, null));
        c23911iNx.EZpvd.setTextColor(c23911iNx.getRoot().getContext().getColor(C52761wXj.Activity.fdOvFl));
        c23911iNx.EZpvd.setText("1 " + assistContent.OLrzqt() + " ≈ " + C27492jwH.limitFmtNoZeroWithKMB$default(C27492jwH.OLrzqt, assistContent.copydefault(), 6, 2, false, false, 24, null) + " " + assistContent.KWHzl());
    }
}
