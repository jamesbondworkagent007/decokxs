package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fwR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19179fwR extends RecyclerView.ViewHolder {
    public final android.widget.TextView EZpvd;
    public final android.widget.ImageView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.ImageView KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView copydefault() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19179fwR(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C13754dXa.ActionBar.zAGdSp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.OLrzqt = (android.widget.ImageView) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C13754dXa.ActionBar.isAttachedToWindow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.EZpvd = (android.widget.TextView) viewFindViewById2;
    }
}
