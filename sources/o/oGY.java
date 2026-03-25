package o;

import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public class oGY<B extends ViewDataBinding> extends RecyclerView.ViewHolder {
    public B copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull B b) {
        Intrinsics.checkNotNullParameter(b, "");
        this.copydefault = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oGY(android.view.View view) {
        super(view);
        Intrinsics.copydefault(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oGY(android.view.View view, @NotNull B b) {
        super(view);
        Intrinsics.checkNotNullParameter(b, "");
        Intrinsics.copydefault(view);
        OLrzqt(b);
    }

    public final B copydefault() {
        B b = this.copydefault;
        if (b != null) {
            return b;
        }
        Intrinsics.gEmmrt("");
        return null;
    }
}
