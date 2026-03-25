package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51267vjm extends RecyclerView.ViewHolder {
    public static final int OLrzqt;
    public final C55258xgZ AEQbTJ;
    public final C55258xgZ KWHzl;
    public final C55258xgZ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        int i = C55258xgZ.gEmmrt;
        OLrzqt = i | i | i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55258xgZ AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55258xgZ EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55258xgZ KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51267vjm(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.sSi);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.copydefault = (C55258xgZ) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.GQzpsZgQzpsZ);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.AEQbTJ = (C55258xgZ) viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(C48033uCm.Application.fQQVvf);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        this.KWHzl = (C55258xgZ) viewFindViewById3;
    }
}
