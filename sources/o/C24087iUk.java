package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iUk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C24087iUk extends RecyclerView.ViewHolder {
    public final C23774iIv EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23774iIv copydefault() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24087iUk(@NotNull C23774iIv c23774iIv) {
        super(c23774iIv.getRoot());
        Intrinsics.checkNotNullParameter(c23774iIv, "");
        this.EZpvd = c23774iIv;
    }
}
