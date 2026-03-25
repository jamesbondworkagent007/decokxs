package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wPd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52539wPd extends RecyclerView.ViewHolder {
    public android.widget.TextView KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52539wPd(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.getIconAttributeResId);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.KWHzl = (android.widget.TextView) viewFindViewById;
    }
}
