package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fxb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19242fxb extends RecyclerView.ViewHolder {
    public final android.widget.TextView EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19242fxb(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C13754dXa.ActionBar.removeOnNewIntentListener);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.EZpvd = (android.widget.TextView) viewFindViewById;
    }
}
