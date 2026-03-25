package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51280vjz extends RecyclerView.ViewHolder {
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.TextView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.LinearLayout KWHzl() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51280vjz(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.MediaControllerCompatApi21Callback);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.EZpvd = (android.widget.LinearLayout) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.QhYuFg);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.OLrzqt = (android.widget.TextView) viewFindViewById2;
    }
}
