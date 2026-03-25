package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class wMV extends RecyclerView.ViewHolder {
    public static final int OLrzqt;
    public final C55258xgZ AEQbTJ;
    public final C55258xgZ KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        int i = C55258xgZ.gEmmrt;
        OLrzqt = i | i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55258xgZ KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55258xgZ copydefault() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wMV(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.RXxsjQ);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.KWHzl = (C55258xgZ) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.QgUVrU);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.AEQbTJ = (C55258xgZ) viewFindViewById2;
    }
}
