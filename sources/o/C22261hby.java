package o;

import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hby, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22261hby extends AbstractC31189lpN<C20061gZl, hCP> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC31189lpN
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public hCP KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        hCP hcpEZpvd = hCP.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hcpEZpvd, "");
        return hcpEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC31189lpN
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull hCP hcp, @NotNull C20061gZl c20061gZl) {
        Intrinsics.checkNotNullParameter(hcp, "");
        Intrinsics.checkNotNullParameter(c20061gZl, "");
        hcp.EZpvd.setText(C33069mpW.copydefault(C23274hvD.Fragment.fromPlaybackState, C56423yEv.EZpvd(C56390yDp.OLrzqt("numOrders", C23322hvz.toLocalizedNumber$default(java.lang.String.valueOf(c20061gZl.AEQbTJ()), false, (RoundingMode) null, false, false, 15, (java.lang.Object) null)))));
    }
}
