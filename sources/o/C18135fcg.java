package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fcg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18135fcg extends RecyclerView.ViewHolder {
    public final AbstractC16719epI copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC16719epI OLrzqt() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18135fcg(@NotNull AbstractC16719epI abstractC16719epI) {
        super(abstractC16719epI.getRoot());
        Intrinsics.checkNotNullParameter(abstractC16719epI, "");
        this.copydefault = abstractC16719epI;
    }
}
