package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wNd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52485wNd extends RecyclerView.ViewHolder {
    public final AbstractC48443uRp AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC48443uRp copydefault() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52485wNd(@NotNull AbstractC48443uRp abstractC48443uRp) {
        super(abstractC48443uRp.getRoot());
        Intrinsics.checkNotNullParameter(abstractC48443uRp, "");
        this.AEQbTJ = abstractC48443uRp;
    }
}
