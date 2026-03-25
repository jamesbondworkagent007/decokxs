package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dpf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14661dpf<VB extends ViewBinding> extends RecyclerView.ViewHolder {
    public final VB AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VB KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14661dpf(@NotNull VB vb) {
        super(vb.getRoot());
        Intrinsics.checkNotNullParameter(vb, "");
        this.AEQbTJ = vb;
    }
}
