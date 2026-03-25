package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51266vjl extends RecyclerView.ViewHolder {
    public final android.widget.ImageView EZpvd;
    public final C55258xgZ KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final C55258xgZ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55258xgZ AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.ImageView EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55258xgZ KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.FrameLayout copydefault() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51266vjl(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.sSi);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.KWHzl = (C55258xgZ) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.identifier);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.copydefault = (C55258xgZ) viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(C48033uCm.Application.QDqgQU);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        this.EZpvd = (android.widget.ImageView) viewFindViewById3;
        android.view.View viewFindViewById4 = view.findViewById(C48033uCm.Application.QIZEnU);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
        this.OLrzqt = (android.widget.FrameLayout) viewFindViewById4;
    }
}
