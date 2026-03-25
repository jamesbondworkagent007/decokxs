package o;

import android.view.ViewGroup;
import com.okinc.business.invest_biz.ui.widget.recyclerview.binder.InvestSpacingBinder$1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jvD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27435jvD extends AbstractC27119jpF<C27433jvB, C23803iJx> {
    public C27435jvD() {
        super(InvestSpacingBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C23803iJx c23803iJx, @NotNull C27433jvB c27433jvB) {
        Intrinsics.checkNotNullParameter(c23803iJx, "");
        Intrinsics.checkNotNullParameter(c27433jvB, "");
        android.view.View root = c23803iJx.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = C55298xhM.dpInt$default(c27433jvB.KWHzl(), (android.content.Context) null, 1, (java.lang.Object) null);
            root.setLayoutParams(layoutParams);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
