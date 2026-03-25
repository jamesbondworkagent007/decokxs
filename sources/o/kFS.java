package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kFS extends RecyclerView.ViewHolder {
    public C57682ymy AEQbTJ;
    public android.widget.TextView EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57682ymy EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kFS(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.EZpvd = (android.widget.TextView) view.findViewById(qZH.StateListAnimator.invokespecialhrnhsO);
        this.AEQbTJ = (C57682ymy) view.findViewById(qZH.StateListAnimator.avCqka);
    }
}
