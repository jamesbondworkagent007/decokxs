package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sxu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC45801sxu<E, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    public final java.util.List<E> AEQbTJ;
    public final java.util.List<E> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<E> AEQbTJ() {
        return this.AEQbTJ;
    }

    public AbstractC45801sxu() {
        java.util.List<E> listSynchronizedList = Collections.synchronizedList(new java.util.ArrayList());
        Intrinsics.checkNotNullExpressionValue(listSynchronizedList, "");
        this.OLrzqt = listSynchronizedList;
        this.AEQbTJ = listSynchronizedList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.AEQbTJ.size();
    }

    public final void copydefault(@NotNull java.util.List<? extends E> list) {
        Intrinsics.checkNotNullParameter(list, "");
        synchronized (this.OLrzqt) {
            this.OLrzqt.clear();
            this.OLrzqt.addAll(list);
        }
    }
}
