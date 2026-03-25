package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51231vjC extends RecyclerView.ViewHolder {
    public final AbstractC50947vdk copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC50947vdk OLrzqt() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51231vjC(@NotNull AbstractC50947vdk abstractC50947vdk) {
        super(abstractC50947vdk.getRoot());
        Intrinsics.checkNotNullParameter(abstractC50947vdk, "");
        this.copydefault = abstractC50947vdk;
    }
}
