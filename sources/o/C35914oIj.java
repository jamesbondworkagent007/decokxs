package o;

import android.view.View;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.widgets.bottomsheet.model.ReactionTab;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35914oIj;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oIj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C35914oIj extends androidx.recyclerview.widget.ListAdapter<ReactionTab, TaskDescription> {
    public int EZpvd;
    public RecyclerView OLrzqt;
    public final Function1<java.lang.Integer, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C35914oIj(@NotNull Function1<? super java.lang.Integer, Unit> function1) {
        super(new Activity());
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        nNJ nnjAEQbTJ = nNJ.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(nnjAEQbTJ, "");
        return new TaskDescription(nnjAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, final int i) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        ReactionTab item = getItem(i);
        Intrinsics.copydefault(item);
        taskDescription.OLrzqt(item, i == this.EZpvd, new Function1() { // from class: o.oIg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C35914oIj.KWHzl(this.AEQbTJ, i, (ReactionTab) obj);
            }
        });
    }

    public static final Unit KWHzl(C35914oIj c35914oIj, int i, ReactionTab reactionTab) {
        Intrinsics.checkNotNullParameter(reactionTab, "");
        c35914oIj.copydefault.invoke(java.lang.Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.OLrzqt = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        this.OLrzqt = null;
    }

    public final void AEQbTJ(int i) {
        int i2 = this.EZpvd;
        this.EZpvd = i;
        if (i2 >= 0) {
            notifyItemChanged(i2);
        }
        int i3 = this.EZpvd;
        if (i3 >= 0) {
            notifyItemChanged(i3);
            copydefault(this.EZpvd);
        }
    }

    public final void copydefault(int i) {
        RecyclerView recyclerView = this.OLrzqt;
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                if (i < iFindFirstVisibleItemPosition || i > iFindLastVisibleItemPosition) {
                    recyclerView.smoothScrollToPosition(i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.oIj$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final nNJ AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull nNJ nnj) {
            super(nnj.getRoot());
            Intrinsics.checkNotNullParameter(nnj, "");
            this.AEQbTJ = nnj;
        }

        public final void OLrzqt(@NotNull final ReactionTab reactionTab, boolean z, @NotNull final Function1<? super ReactionTab, Unit> function1) {
            Intrinsics.checkNotNullParameter(reactionTab, "");
            Intrinsics.checkNotNullParameter(function1, "");
            nNJ nnj = this.AEQbTJ;
            nnj.OLrzqt.setText(reactionTab.KWHzl());
            android.widget.TextView textView = nnj.EZpvd;
            int iAEQbTJ = reactionTab.AEQbTJ();
            textView.setText(pTB.formatICUCompact$default(java.lang.Integer.valueOf(iAEQbTJ), null, C38307pTy.Companion.EZpvd(0), null, null, 13, null));
            nnj.getRoot().setSelected(z);
            if (z) {
                nnj.OLrzqt.setTextColor(nnj.getRoot().getContext().getColor(C52761wXj.Activity.htlTjW));
                nnj.EZpvd.setTextColor(nnj.getRoot().getContext().getColor(C52761wXj.Activity.htlTjW));
            } else {
                nnj.OLrzqt.setTextColor(nnj.getRoot().getContext().getColor(C52761wXj.Activity.QwvEab));
                nnj.EZpvd.setTextColor(nnj.getRoot().getContext().getColor(C52761wXj.Activity.QwvEab));
            }
            nnj.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.oIh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C35914oIj.TaskDescription.KWHzl(function1, reactionTab, view);
                }
            });
        }

        public static final void KWHzl(Function1 function1, ReactionTab reactionTab, android.view.View view) {
            function1.invoke(reactionTab);
        }
    }

    /* JADX INFO: renamed from: o.oIj$Activity */
    public static final class Activity extends DiffUtil.ItemCallback<ReactionTab> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(@NotNull ReactionTab reactionTab, @NotNull ReactionTab reactionTab2) {
            Intrinsics.checkNotNullParameter(reactionTab, "");
            Intrinsics.checkNotNullParameter(reactionTab2, "");
            return Intrinsics.EZpvd((java.lang.Object) reactionTab.KWHzl(), (java.lang.Object) reactionTab2.KWHzl());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(@NotNull ReactionTab reactionTab, @NotNull ReactionTab reactionTab2) {
            Intrinsics.checkNotNullParameter(reactionTab, "");
            Intrinsics.checkNotNullParameter(reactionTab2, "");
            return Intrinsics.EZpvd(reactionTab, reactionTab2);
        }
    }
}
