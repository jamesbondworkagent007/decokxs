package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import o.oPY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oPX extends androidx.recyclerview.widget.ListAdapter<oPY, TaskDescription> {
    public static final ActionBar Companion = new ActionBar(null);
    public final Function1<oPY.ActionBar, Unit> AEQbTJ;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.oPY$ActionBar, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oPX(@NotNull Function1<? super oPY.ActionBar, Unit> function1) {
        super(oPV.EZpvd);
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oPX.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final class TaskDescription extends RecyclerView.ViewHolder {
        public final android.widget.ImageView AEQbTJ;
        public final /* synthetic */ oPX EZpvd;
        public final android.widget.TextView KWHzl;
        public final android.widget.TextView OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView copydefault() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull oPX opx, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.EZpvd = opx;
            android.view.View viewFindViewById = view.findViewById(C35964oKf.StateListAnimator.sIqKDg);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.OLrzqt = (android.widget.TextView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C35964oKf.StateListAnimator.zDGrpR);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.KWHzl = (android.widget.TextView) viewFindViewById2;
            android.view.View viewFindViewById3 = view.findViewById(C35964oKf.StateListAnimator.KWHzl);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.AEQbTJ = (android.widget.ImageView) viewFindViewById3;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C35964oKf.Application.fdOvFl, viewGroup, false);
        Intrinsics.copydefault(viewInflate);
        return new TaskDescription(this, viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, int i) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        oPY item = getItem(i);
        android.content.Context context = taskDescription.itemView.getContext();
        android.widget.TextView textViewCopydefault = taskDescription.copydefault();
        textViewCopydefault.setText(item.EZpvd());
        textViewCopydefault.setTextColor(ContextCompat.getColor(context, C52761wXj.Activity.QwvEab));
        Intrinsics.copydefault(item);
        OLrzqt(taskDescription, item);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, int i, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            super.onBindViewHolder(taskDescription, i, list);
            return;
        }
        for (java.lang.Object obj : list) {
            if (obj instanceof oPZ) {
                taskDescription.AEQbTJ().setText(((oPZ) obj).EZpvd());
            }
        }
    }

    public final void OLrzqt(TaskDescription taskDescription, final oPY opy) {
        android.content.Context context = taskDescription.itemView.getContext();
        if (opy.AEQbTJ() != null) {
            taskDescription.AEQbTJ().setVisibility(8);
            taskDescription.OLrzqt().setVisibility(0);
            taskDescription.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.oPU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    oPX.OLrzqt(this.AEQbTJ, opy, view);
                }
            });
            return;
        }
        taskDescription.AEQbTJ().setVisibility(0);
        taskDescription.OLrzqt().setVisibility(8);
        taskDescription.itemView.setOnClickListener(null);
        taskDescription.OLrzqt().setOnClickListener(null);
        android.widget.TextView textViewAEQbTJ = taskDescription.AEQbTJ();
        textViewAEQbTJ.setText(opy.KWHzl());
        textViewAEQbTJ.setTextColor(ContextCompat.getColor(context, C52761wXj.Activity.fdOvFl));
        textViewAEQbTJ.setOnClickListener(null);
    }

    public static final void OLrzqt(oPX opx, oPY opy, android.view.View view) {
        opx.AEQbTJ.invoke(opy.AEQbTJ());
    }

    @Override // androidx.recyclerview.widget.ListAdapter
    public void submitList(java.util.List<oPY> list) {
        pUU.KWHzl("ContractInfoAdapter", "submitList called with " + (list != null ? list.size() : 0) + " items");
        super.submitList(list);
    }
}
