package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class mUU<VB extends ViewBinding> extends RecyclerView.ViewHolder {
    public final VB copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VB KWHzl() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mUU(@NotNull VB vb) {
        super(vb.getRoot());
        Intrinsics.checkNotNullParameter(vb, "");
        this.copydefault = vb;
    }
}
