package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vsG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51712vsG extends RecyclerView.ViewHolder {
    public static final int AEQbTJ = C55239xgG.copydefault | C55258xgZ.gEmmrt;
    public final C55258xgZ KWHzl;
    public final C55239xgG copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55239xgG KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55258xgZ copydefault() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51712vsG(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.MediaBrowserCompatMediaBrowserImplApi212);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.KWHzl = (C55258xgZ) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.ColorInt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.copydefault = (C55239xgG) viewFindViewById2;
    }
}
