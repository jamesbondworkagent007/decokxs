package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51265vjk extends RecyclerView.ViewHolder {
    public RecyclerView AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecyclerView KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51265vjk(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.AEQbTJ = (RecyclerView) view.findViewById(C48033uCm.Application.RbVjfb);
    }
}
