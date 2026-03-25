package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC10168bjP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bjI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10161bjI extends RecyclerView.ViewHolder {
    public final AbstractC17001euZ OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull AbstractC10168bjP.LoaderManager loaderManager) {
        Intrinsics.checkNotNullParameter(loaderManager, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10161bjI(@NotNull AbstractC17001euZ abstractC17001euZ) {
        super(abstractC17001euZ.getRoot());
        Intrinsics.checkNotNullParameter(abstractC17001euZ, "");
        this.OLrzqt = abstractC17001euZ;
    }
}
