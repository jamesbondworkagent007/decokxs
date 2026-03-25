package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wNP extends RecyclerView.ViewHolder {
    public final uWW copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final uWW AEQbTJ() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wNP(@NotNull uWW uww) {
        super(uww.getRoot());
        Intrinsics.checkNotNullParameter(uww, "");
        this.copydefault = uww;
    }
}
