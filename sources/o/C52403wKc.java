package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wKc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52403wKc extends RecyclerView.ViewHolder {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52403wKc(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.onNothingSelected);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.AEQbTJ = (android.widget.TextView) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.initializePanelContent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.EZpvd = (android.widget.TextView) viewFindViewById2;
    }
}
