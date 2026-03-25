package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fxQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19231fxQ extends RecyclerView.ViewHolder {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.ImageView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.ImageView KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.ImageView OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView valueOf() {
        return this.valueOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19231fxQ(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C13754dXa.ActionBar.SqfPTR);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.KWHzl = (android.widget.ImageView) viewFindViewById;
        this.EZpvd = (android.widget.ImageView) view.findViewById(C13754dXa.ActionBar.aSdHwS);
        android.view.View viewFindViewById2 = view.findViewById(C13754dXa.ActionBar.parseResult);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.copydefault = (android.widget.TextView) viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(C13754dXa.ActionBar.ViewTreeFullyDrawnReporterOwnerfindViewTreeFullyDrawnReporterOwner2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        this.AEQbTJ = (android.widget.TextView) viewFindViewById3;
        android.view.View viewFindViewById4 = view.findViewById(C13754dXa.ActionBar.FontRes);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
        this.valueOf = (android.widget.TextView) viewFindViewById4;
        android.view.View viewFindViewById5 = view.findViewById(C13754dXa.ActionBar.FractionRes);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
        this.OLrzqt = (android.widget.TextView) viewFindViewById5;
    }
}
