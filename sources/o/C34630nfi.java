package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nfi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34630nfi extends RecyclerView.ViewHolder {
    public final ViewBinding copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ViewBinding KWHzl() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34630nfi(@NotNull ViewBinding viewBinding) {
        super(viewBinding.getRoot());
        Intrinsics.checkNotNullParameter(viewBinding, "");
        this.copydefault = viewBinding;
    }
}
