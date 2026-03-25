package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fhT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C18387fhT extends RecyclerView.ViewHolder {
    public final C16793eqd EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C16793eqd KWHzl() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18387fhT(@NotNull C16793eqd c16793eqd) {
        super(c16793eqd.getRoot());
        Intrinsics.checkNotNullParameter(c16793eqd, "");
        this.EZpvd = c16793eqd;
    }
}
