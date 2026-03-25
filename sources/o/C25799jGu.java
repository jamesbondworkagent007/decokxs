package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jGu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25799jGu extends RecyclerView.Adapter<jGD> {
    public final Function1<C55276xgr, Unit> AEQbTJ;
    public final java.util.List<C55276xgr> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.xgr, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C25799jGu(@NotNull java.util.List<C55276xgr> list, @NotNull Function1<? super C55276xgr, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = list;
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public jGD onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return jGD.Companion.EZpvd(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.KWHzl.size();
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull jGD jgd, int i) {
        Intrinsics.checkNotNullParameter(jgd, "");
        final C55276xgr c55276xgr = this.KWHzl.get(i);
        jgd.KWHzl().OLrzqt.setText(c55276xgr.AhwBna());
        jgd.KWHzl().AEQbTJ.setVisibility(c55276xgr.AEQbTJ() ? 0 : 4);
        jgd.KWHzl().getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.jGA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C25799jGu.OLrzqt(this.AEQbTJ, c55276xgr, view);
            }
        });
    }

    public static final void OLrzqt(C25799jGu c25799jGu, C55276xgr c55276xgr, android.view.View view) {
        c25799jGu.AEQbTJ.invoke(c55276xgr);
    }
}
