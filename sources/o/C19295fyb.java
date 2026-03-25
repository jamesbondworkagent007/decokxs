package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fyb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19295fyb extends RecyclerView.ViewHolder {
    public final android.widget.TextView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView copydefault() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19295fyb(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C13754dXa.ActionBar.CheckResult);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.OLrzqt = (android.widget.TextView) viewFindViewById;
    }
}
