package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wfN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53111wfN extends RecyclerView.ViewHolder {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.ImageView OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53111wfN(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.gVEiQJ);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.OLrzqt = (android.widget.ImageView) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.gbIfDn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.copydefault = (android.widget.TextView) viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(C48033uCm.Application.sVvuFk);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        this.AEQbTJ = (android.widget.TextView) viewFindViewById3;
    }
}
