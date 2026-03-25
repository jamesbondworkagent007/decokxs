package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tAT extends RecyclerView.Adapter<TaskDescription> {
    public final java.util.List<C46501tWr> OLrzqt = new java.util.ArrayList();

    public final void EZpvd(java.util.List<C46501tWr> list) {
        this.OLrzqt.clear();
        if (list != null) {
            this.OLrzqt.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.OLrzqt.size();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        tMZ tmzKWHzl = tMZ.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(tmzKWHzl, "");
        return new TaskDescription(tmzKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, int i) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        taskDescription.EZpvd(this.OLrzqt.get(i));
    }

    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final tMZ copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull tMZ tmz) {
            super(tmz.getRoot());
            Intrinsics.checkNotNullParameter(tmz, "");
            this.copydefault = tmz;
        }

        public final void EZpvd(@NotNull C46501tWr c46501tWr) {
            Intrinsics.checkNotNullParameter(c46501tWr, "");
            this.copydefault.copydefault.setText(c46501tWr.OLrzqt());
            this.copydefault.KWHzl.setText(c46501tWr.copydefault());
            this.copydefault.EZpvd.setBackgroundTintList(android.content.res.ColorStateList.valueOf(c46501tWr.KWHzl()));
        }
    }
}
