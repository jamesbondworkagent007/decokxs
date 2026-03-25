package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51242vjN extends RecyclerView.ViewHolder {
    public final AbstractC48647uZd OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC48647uZd copydefault() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51242vjN(@NotNull AbstractC48647uZd abstractC48647uZd) {
        super(abstractC48647uZd.getRoot());
        Intrinsics.checkNotNullParameter(abstractC48647uZd, "");
        this.OLrzqt = abstractC48647uZd;
    }
}
