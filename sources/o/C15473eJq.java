package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eJq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C15473eJq extends AbstractC59533zio<C15505eKv, StateListAnimator> {
    public final Function1<C15505eKv, Unit> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.eKv, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C15473eJq(@NotNull Function1<? super C15505eKv, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.hgxRZI, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new StateListAnimator(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull C15505eKv c15505eKv) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(c15505eKv, "");
        stateListAnimator.AEQbTJ(c15505eKv, this.OLrzqt);
    }

    /* JADX INFO: renamed from: o.eJq$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public static final int OLrzqt = wYS.KWHzl;
        public final wYS AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.AEQbTJ = (wYS) this.itemView.findViewById(C13754dXa.ActionBar.NavigationRes);
        }

        public final void AEQbTJ(@NotNull C15505eKv c15505eKv, @NotNull Function1<? super C15505eKv, Unit> function1) {
            Intrinsics.checkNotNullParameter(c15505eKv, "");
            Intrinsics.checkNotNullParameter(function1, "");
            android.view.View view = this.itemView;
            view.setOnClickListener(new TaskDescription(view, 1000L, function1, c15505eKv));
            this.AEQbTJ.setText(c15505eKv.KWHzl());
            this.AEQbTJ.setSelected(c15505eKv.EZpvd());
        }

        /* JADX INFO: renamed from: o.eJq$StateListAnimator$TaskDescription */
        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ C15505eKv AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ Function1 OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, Function1 function1, C15505eKv c15505eKv) {
                this.EZpvd = view;
                this.copydefault = j;
                this.OLrzqt = function1;
                this.AEQbTJ = c15505eKv;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    this.OLrzqt.invoke(this.AEQbTJ);
                }
            }
        }
    }
}
