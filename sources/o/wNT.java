package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wNT extends RecyclerView.ViewHolder {
    public final android.widget.ImageView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.ImageView AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView OLrzqt() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wNT(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.onNothingSelected);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.KWHzl = (android.widget.TextView) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.initializePanelContent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.copydefault = (android.widget.TextView) viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(C48033uCm.Application.disconnect);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        this.EZpvd = (android.widget.ImageView) viewFindViewById3;
    }
}
