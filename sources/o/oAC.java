package o;

import androidx.databinding.ViewDataBinding;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class oAC<B extends ViewDataBinding, CB extends ViewDataBinding> extends oGY<B> {
    public CB EZpvd;
    public B OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull CB cb) {
        Intrinsics.checkNotNullParameter(cb, "");
        this.EZpvd = cb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull B b) {
        Intrinsics.checkNotNullParameter(b, "");
        this.OLrzqt = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oAC(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
    }

    public final CB EZpvd() {
        CB cb = this.EZpvd;
        if (cb != null) {
            return cb;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final B AEQbTJ() {
        B b = this.OLrzqt;
        if (b != null) {
            return b;
        }
        Intrinsics.gEmmrt("");
        return null;
    }
}
