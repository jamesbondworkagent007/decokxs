package o;

import com.okinc.business.invest_biz.ui.screens.eventpage.InvestMultiTabEventPageSectionDataBinder$1;
import kotlin.jvm.internal.Intrinsics;
import o.C26422jby;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jbF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26377jbF extends AbstractC27121jpH<C26422jby.StateListAnimator, iIK> {
    public C26377jbF() {
        super(InvestMultiTabEventPageSectionDataBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C27120jpG<iIK> c27120jpG, @NotNull C26422jby.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(c27120jpG, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        ((iIK) c27120jpG.KWHzl()).copydefault.setText(stateListAnimator.KWHzl());
    }
}
