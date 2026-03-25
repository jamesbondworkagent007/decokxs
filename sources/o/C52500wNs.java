package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wNs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52500wNs extends RecyclerView.ViewHolder {
    public android.widget.TextView AEQbTJ;
    public android.widget.TextView EZpvd;
    public android.widget.TextView KWHzl;
    public RecyclerView OLrzqt;
    public android.view.View copydefault;
    public C55251xgS djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecyclerView KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55251xgS copydefault() {
        return this.djBIcL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52500wNs(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.onNothingSelected);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.EZpvd = (android.widget.TextView) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.flushMarshmallows);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.djBIcL = (C55251xgS) viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(C48033uCm.Application.detect);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        this.AEQbTJ = (android.widget.TextView) viewFindViewById3;
        android.view.View viewFindViewById4 = view.findViewById(C48033uCm.Application.ensureSubDecor);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
        this.KWHzl = (android.widget.TextView) viewFindViewById4;
        android.view.View viewFindViewById5 = view.findViewById(C48033uCm.Application.IResultReceiverStub);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
        this.OLrzqt = (RecyclerView) viewFindViewById5;
        android.view.View viewFindViewById6 = view.findViewById(C48033uCm.Application.updateStateFromTypedArray);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
        this.copydefault = viewFindViewById6;
    }
}
