package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vvf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C51896vvf extends RecyclerView.ViewHolder {
    public static final int copydefault;
    public final C55258xgZ EZpvd;
    public final C55258xgZ OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        int i = C55258xgZ.gEmmrt;
        copydefault = i | i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55258xgZ AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55258xgZ EZpvd() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51896vvf(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.onApplyWindowInsets);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.EZpvd = (C55258xgZ) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.EmptySuper);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.OLrzqt = (C55258xgZ) viewFindViewById2;
    }
}
