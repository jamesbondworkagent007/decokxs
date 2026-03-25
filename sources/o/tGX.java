package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tGX extends tGG<C46091tHm, C46253tNm> {
    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC47825txS
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C46253tNm copydefault(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C46253tNm c46253tNmCopydefault = C46253tNm.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c46253tNmCopydefault, "");
        return c46253tNmCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/txV;)V */
    @Override // o.AbstractC47825txS
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C46253tNm c46253tNm, int i, @NotNull C46091tHm c46091tHm) {
        Intrinsics.checkNotNullParameter(c46253tNm, "");
        Intrinsics.checkNotNullParameter(c46091tHm, "");
        c46253tNm.KWHzl.setText(c46091tHm.AEQbTJ());
    }
}
