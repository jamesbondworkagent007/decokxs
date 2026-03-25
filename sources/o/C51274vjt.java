package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51274vjt extends RecyclerView.ViewHolder {
    public final AbstractC48569uWg AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC48569uWg copydefault() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51274vjt(@NotNull AbstractC48569uWg abstractC48569uWg) {
        super(abstractC48569uWg.getRoot());
        Intrinsics.checkNotNullParameter(abstractC48569uWg, "");
        this.AEQbTJ = abstractC48569uWg;
    }
}
