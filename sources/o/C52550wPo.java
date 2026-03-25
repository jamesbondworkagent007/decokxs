package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wPo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52550wPo extends RecyclerView.ViewHolder {
    public android.widget.TextView AEQbTJ;
    public android.widget.TextView EZpvd;
    public RecyclerView KWHzl;
    public android.widget.TextView OLrzqt;
    public android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecyclerView EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView copydefault() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52550wPo(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.onNothingSelected);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.AEQbTJ = (android.widget.TextView) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.createCheckedTextView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.copydefault = (android.widget.TextView) viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(C48033uCm.Application.flushMarshmallows);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        this.OLrzqt = (android.widget.TextView) viewFindViewById3;
        android.view.View viewFindViewById4 = view.findViewById(C48033uCm.Application.detect);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
        this.EZpvd = (android.widget.TextView) viewFindViewById4;
        android.view.View viewFindViewById5 = view.findViewById(C48033uCm.Application.IResultReceiverStub);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
        this.KWHzl = (RecyclerView) viewFindViewById5;
    }
}
