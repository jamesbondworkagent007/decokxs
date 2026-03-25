package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wNF extends RecyclerView.ViewHolder {
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView OLrzqt() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wNF(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.setStyle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.EZpvd = (android.widget.TextView) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.hasPanelItems);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.copydefault = (android.widget.TextView) viewFindViewById2;
    }
}
