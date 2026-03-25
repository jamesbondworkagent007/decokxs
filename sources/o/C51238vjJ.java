package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51238vjJ extends RecyclerView.ViewHolder {
    public final android.widget.TextView AEQbTJ;
    public final RecyclerView EZpvd;
    public final android.widget.ImageView KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.ImageView EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecyclerView copydefault() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51238vjJ(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.PlaybackStateCompatApi22);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.EZpvd = (RecyclerView) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.sanitizeWindowFeatureId);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.AEQbTJ = (android.widget.TextView) viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(C48033uCm.Application.rsEnD);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        this.KWHzl = (android.widget.ImageView) viewFindViewById3;
    }
}
