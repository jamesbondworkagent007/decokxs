package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iTz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24075iTz extends RecyclerView.ViewHolder {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24075iTz(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C25493ixk.ActionBar.ITrustedWebActivityCallbackStub);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.copydefault = (android.widget.TextView) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C25493ixk.ActionBar.sVvuFk);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.AEQbTJ = (android.widget.ImageView) viewFindViewById2;
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.setText(str);
    }

    public final void KWHzl(@androidx.annotation.DrawableRes int i) {
        this.AEQbTJ.setImageResource(i);
    }
}
