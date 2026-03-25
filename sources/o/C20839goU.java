package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.goU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20839goU extends RecyclerView.ViewHolder {
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.view.View OLrzqt() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20839goU(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C13754dXa.ActionBar.OAhWiU);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.copydefault = viewFindViewById;
    }
}
