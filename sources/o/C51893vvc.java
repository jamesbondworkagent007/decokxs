package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vvc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51893vvc extends RecyclerView.ViewHolder {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final C55251xgS EZpvd;
    public final C55251xgS KWHzl;
    public final C55251xgS OLrzqt;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55251xgS AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55251xgS EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55251xgS copydefault() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51893vvc(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.RIuxYh);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.AYXKKw = (android.widget.TextView) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.DcMfJK);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.OLrzqt = (C55251xgS) viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(C48033uCm.Application.setCustomTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        this.KWHzl = (C55251xgS) viewFindViewById3;
        android.view.View viewFindViewById4 = view.findViewById(C48033uCm.Application.bindView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
        this.EZpvd = (C55251xgS) viewFindViewById4;
        android.view.View viewFindViewById5 = view.findViewById(C48033uCm.Application.sendMetadata);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
        this.AEQbTJ = (android.widget.TextView) viewFindViewById5;
        android.view.View viewFindViewById6 = view.findViewById(C48033uCm.Application.GiPPlL);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
        this.copydefault = (android.widget.TextView) viewFindViewById6;
    }
}
