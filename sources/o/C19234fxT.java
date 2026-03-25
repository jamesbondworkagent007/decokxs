package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fxT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19234fxT extends RecyclerView.ViewHolder {
    public final android.view.View EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.view.View AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19234fxT(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C13754dXa.ActionBar.Size);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.EZpvd = viewFindViewById;
    }
}
