package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class iSZ extends RecyclerView.ViewHolder {
    public final AbstractC23757iIe OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC23757iIe copydefault() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iSZ(@NotNull AbstractC23757iIe abstractC23757iIe) {
        super(abstractC23757iIe.getRoot());
        Intrinsics.checkNotNullParameter(abstractC23757iIe, "");
        this.OLrzqt = abstractC23757iIe;
    }
}
