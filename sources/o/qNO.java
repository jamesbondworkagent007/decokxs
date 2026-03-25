package o;

import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class qNO extends AbstractC40510qYn<C40240qOn, C42848reE> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42848reE AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42848reE c42848reECopydefault = C42848reE.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42848reECopydefault, "");
        return c42848reECopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42848reE c42848reE, int i, @NotNull C40240qOn c40240qOn) {
        Intrinsics.checkNotNullParameter(c42848reE, "");
        Intrinsics.checkNotNullParameter(c40240qOn, "");
        c42848reE.getRoot().setText(qZH.PendingIntent.DKtBnz);
    }
}
