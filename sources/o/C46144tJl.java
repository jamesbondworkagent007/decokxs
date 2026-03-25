package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tJl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C46144tJl extends RecyclerView.ViewHolder {
    public final android.widget.TextView EZpvd;
    public final android.widget.LinearLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.LinearLayout AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView OLrzqt() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46144tJl(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C47501trL.TaskDescription.KDccX);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.EZpvd = (android.widget.TextView) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C47501trL.TaskDescription.FQNKFG);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.copydefault = (android.widget.LinearLayout) viewFindViewById2;
    }
}
