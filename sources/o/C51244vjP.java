package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51244vjP extends RecyclerView.ViewHolder {
    public final RecyclerView EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecyclerView OLrzqt() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51244vjP(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.PlaybackStateCompatApi22);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.EZpvd = (RecyclerView) viewFindViewById;
    }
}
