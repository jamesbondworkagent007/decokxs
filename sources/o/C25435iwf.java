package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iwf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25435iwf<VB extends ViewBinding> extends RecyclerView.ViewHolder {
    public final VB KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VB EZpvd() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25435iwf(@NotNull VB vb) {
        super(vb.getRoot());
        Intrinsics.checkNotNullParameter(vb, "");
        this.KWHzl = vb;
    }
}
