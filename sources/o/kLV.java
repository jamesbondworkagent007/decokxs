package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class kLV<B extends ViewBinding> extends RecyclerView.ViewHolder {
    public final B OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final B EZpvd() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kLV(@NotNull B b) {
        super(b.getRoot());
        Intrinsics.checkNotNullParameter(b, "");
        this.OLrzqt = b;
    }
}
