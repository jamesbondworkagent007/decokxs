package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class jGF extends RecyclerView.Adapter<jGG> {
    public final java.util.List<C55276xgr> EZpvd;
    public final Function1<C55276xgr, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.xgr, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public jGF(@NotNull java.util.List<C55276xgr> list, @NotNull Function1<? super C55276xgr, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = list;
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public jGG onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return jGG.Companion.AEQbTJ(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.EZpvd.size();
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull jGG jgg, int i) {
        Intrinsics.checkNotNullParameter(jgg, "");
        final C55276xgr c55276xgr = this.EZpvd.get(i);
        jgg.copydefault().getRoot().setContentDescription(c55276xgr.copydefault());
        jgg.copydefault().copydefault.setText(c55276xgr.AhwBna());
        jgg.copydefault().AEQbTJ.setText(c55276xgr.EZpvd());
        jgg.copydefault().EZpvd.setVisibility(c55276xgr.AEQbTJ() ? 0 : 4);
        jgg.copydefault().getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.jGE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                jGF.copydefault(this.EZpvd, c55276xgr, view);
            }
        });
    }

    public static final void copydefault(jGF jgf, C55276xgr c55276xgr, android.view.View view) {
        jgf.copydefault.invoke(c55276xgr);
    }
}
