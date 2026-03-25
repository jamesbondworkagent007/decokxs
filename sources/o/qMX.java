package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qMX extends AbstractC40510qYn<C41648qul, C42800rdJ> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C42800rdJ AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42800rdJ c42800rdJKWHzl = C42800rdJ.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42800rdJKWHzl, "");
        return c42800rdJKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42800rdJ c42800rdJ, int i, @NotNull C41648qul c41648qul) {
        Intrinsics.checkNotNullParameter(c42800rdJ, "");
        Intrinsics.checkNotNullParameter(c41648qul, "");
        c42800rdJ.EZpvd.setText(c42800rdJ.getRoot().getContext().getText(c41648qul.EZpvd()));
    }
}
