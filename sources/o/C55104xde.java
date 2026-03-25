package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xde, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55104xde<Binding extends ViewBinding> extends RecyclerView.ViewHolder {
    public final Binding AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Binding OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55104xde(@NotNull Binding binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "");
        this.AEQbTJ = binding;
    }
}
