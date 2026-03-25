package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bkR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10223bkR extends RecyclerView.ViewHolder {
    public final AbstractC16845erc KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10223bkR(@NotNull AbstractC16845erc abstractC16845erc) {
        super(abstractC16845erc.getRoot());
        Intrinsics.checkNotNullParameter(abstractC16845erc, "");
        this.KWHzl = abstractC16845erc;
    }

    public final void AEQbTJ(@NotNull C10219bkN c10219bkN, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c10219bkN, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.OLrzqt(c10219bkN);
        this.KWHzl.KWHzl(java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) c10219bkN.AEQbTJ().DbNXlk(), (java.lang.Object) str)));
        AppCompatImageView appCompatImageView = this.KWHzl.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C33054mpH.KWHzl(appCompatImageView, c10219bkN.AEQbTJ().fetchVPNInfo());
    }
}
