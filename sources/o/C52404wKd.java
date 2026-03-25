package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wKd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52404wKd extends RecyclerView.ViewHolder {
    public final android.widget.TextView AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView copydefault() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52404wKd(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.AEQbTJ = (android.widget.TextView) view;
    }
}
