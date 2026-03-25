package o;

import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qNM extends AbstractC40510qYn<C40242qOp, C42846reC> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C42846reC AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42846reC c42846reCAEQbTJ = C42846reC.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42846reCAEQbTJ, "");
        return c42846reCAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    public void AEQbTJ(@NotNull C42846reC c42846reC, int i, @NotNull C40242qOp c40242qOp) {
        Intrinsics.checkNotNullParameter(c42846reC, "");
        Intrinsics.checkNotNullParameter(c40242qOp, "");
        c42846reC.AEQbTJ.setEmptyTypeImage(6);
        c42846reC.AEQbTJ.setTitle(C33070mpX.AYXKKw(qZH.PendingIntent.getPostValueLengthLimit));
        c42846reC.AEQbTJ.setSubTitle((java.lang.CharSequence) "");
    }
}
