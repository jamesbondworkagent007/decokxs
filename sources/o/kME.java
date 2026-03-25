package o;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public abstract class kME extends RecyclerView.OnScrollListener {
    public boolean AEQbTJ;
    public int EZpvd;
    public final Function0<LinearLayoutManager> KWHzl;
    public final int OLrzqt;

    public abstract void AEQbTJ();

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends androidx.recyclerview.widget.LinearLayoutManager> */
    /* JADX WARN: Multi-variable type inference failed */
    public kME(int i, @NotNull Function0<? extends LinearLayoutManager> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt = i;
        this.KWHzl = function0;
        this.AEQbTJ = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        LinearLayoutManager linearLayoutManagerInvoke = this.KWHzl.invoke();
        if (linearLayoutManagerInvoke == null) {
            return;
        }
        int itemCount = linearLayoutManagerInvoke.getItemCount();
        int iFindLastVisibleItemPosition = linearLayoutManagerInvoke.findLastVisibleItemPosition();
        if (itemCount < this.EZpvd) {
            this.EZpvd = itemCount;
            if (itemCount == 0) {
                this.AEQbTJ = true;
            }
        }
        if (this.AEQbTJ && itemCount > this.EZpvd) {
            this.AEQbTJ = false;
            this.EZpvd = itemCount;
        }
        if (this.AEQbTJ || iFindLastVisibleItemPosition + this.OLrzqt < itemCount) {
            return;
        }
        AEQbTJ();
        this.AEQbTJ = true;
    }
}
