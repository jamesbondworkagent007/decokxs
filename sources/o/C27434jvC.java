package o;

import android.view.ViewGroup;
import com.okinc.business.invest_biz.ui.widget.recyclerview.binder.InvestDividerBinder$1;
import com.okinc.business.invest_biz.ui.widget.recyclerview.binder.Orientation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jvC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27434jvC extends AbstractC27119jpF<C27437jvF, iHZ> {
    public C27434jvC() {
        super(InvestDividerBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull iHZ ihz, @NotNull C27437jvF c27437jvF) {
        Intrinsics.checkNotNullParameter(ihz, "");
        Intrinsics.checkNotNullParameter(c27437jvF, "");
        android.view.View view = ihz.EZpvd;
        Intrinsics.checkNotNullExpressionValue(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            if (c27437jvF.OLrzqt() == Orientation.HORIZONTAL) {
                layoutParams.height = C55298xhM.dpInt$default(c27437jvF.KWHzl(), (android.content.Context) null, 1, (java.lang.Object) null);
                layoutParams.width = -1;
            } else {
                layoutParams.height = -1;
                layoutParams.width = C55298xhM.dpInt$default(c27437jvF.KWHzl(), (android.content.Context) null, 1, (java.lang.Object) null);
            }
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
