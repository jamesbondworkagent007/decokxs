package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vlY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51359vlY extends RecyclerView.ViewHolder {
    public final AbstractC50845vbo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC50845vbo EZpvd() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51359vlY(@NotNull AbstractC50845vbo abstractC50845vbo) {
        super(abstractC50845vbo.getRoot());
        Intrinsics.checkNotNullParameter(abstractC50845vbo, "");
        this.copydefault = abstractC50845vbo;
    }
}
