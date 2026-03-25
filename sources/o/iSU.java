package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class iSU extends RecyclerView.Adapter<ActionBar> {
    public final java.util.List<C23964iPw> OLrzqt;

    public iSU(@NotNull java.util.List<C23964iPw> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = list;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C23849iLp c23849iLpKWHzl = C23849iLp.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c23849iLpKWHzl, "");
        return new ActionBar(c23849iLpKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, int i) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        actionBar.EZpvd(this.OLrzqt.get(i).OLrzqt(), this.OLrzqt.size() > 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.OLrzqt.size();
    }

    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final C23849iLp AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C23849iLp c23849iLp) {
            super(c23849iLp.getRoot());
            Intrinsics.checkNotNullParameter(c23849iLp, "");
            this.AEQbTJ = c23849iLp;
        }

        public static /* synthetic */ void bindData$default(ActionBar actionBar, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            actionBar.EZpvd(str, z);
        }

        public final void EZpvd(@NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ.AEQbTJ.setText(str);
            android.view.View view = this.AEQbTJ.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(z ? 0 : 8);
        }
    }
}
