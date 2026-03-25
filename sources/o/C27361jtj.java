package o;

import com.okinc.business.invest_biz.ui.widget.defi_dashboard.binder.ProtocolModeDetailTitleItemBinder$1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jtj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27361jtj extends AbstractC27119jpF<C27376jty, C23766iIn> {
    public C27361jtj() {
        super(ProtocolModeDetailTitleItemBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C23766iIn c23766iIn, @NotNull C27376jty c27376jty) {
        Intrinsics.checkNotNullParameter(c23766iIn, "");
        Intrinsics.checkNotNullParameter(c27376jty, "");
        c23766iIn.KWHzl.setText(c27376jty.EZpvd());
        c23766iIn.copydefault.setText(c27376jty.KWHzl());
        C27127jpN c27127jpN = c23766iIn.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c27127jpN, "");
        c27127jpN.setVisibility(c27376jty.copydefault() != null ? 0 : 8);
        if (c27376jty.copydefault() != null) {
            c23766iIn.AEQbTJ.setHealthRate(c27376jty.copydefault().copydefault(), c27376jty.copydefault().KWHzl());
        }
    }
}
