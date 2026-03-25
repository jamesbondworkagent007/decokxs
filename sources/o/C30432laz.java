package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.laz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30432laz extends AbstractC31189lpN<C28384kZk, C22320hdD> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC31189lpN
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C22320hdD KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C22320hdD c22320hdDCopydefault = C22320hdD.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c22320hdDCopydefault, "");
        return c22320hdDCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC31189lpN
    public void KWHzl(@NotNull C22320hdD c22320hdD, @NotNull C28384kZk c28384kZk) {
        Intrinsics.checkNotNullParameter(c22320hdD, "");
        Intrinsics.checkNotNullParameter(c28384kZk, "");
        c22320hdD.EZpvd.setText(c28384kZk.copydefault());
    }
}
