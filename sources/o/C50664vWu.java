package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vWu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C50664vWu extends RecyclerView.ViewHolder {
    public final uRA KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final uRA KWHzl() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50664vWu(@NotNull uRA ura) {
        super(ura.getRoot());
        Intrinsics.checkNotNullParameter(ura, "");
        this.KWHzl = ura;
    }
}
