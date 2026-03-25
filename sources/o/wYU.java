package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.wYS;
import o.wYU;
import o.wYX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wYU extends RecyclerView.Adapter<Activity> {
    public wYX.TaskDescription AEQbTJ;
    public wYX.ActionBar KWHzl;
    public final java.util.List<wYO> OLrzqt = new java.util.ArrayList();
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(wYX.ActionBar actionBar) {
        this.KWHzl = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(wYX.TaskDescription taskDescription) {
        this.AEQbTJ = taskDescription;
    }

    public wYU(int i) {
        this.copydefault = i;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        wYS wys = new wYS(context, null, 2, null);
        wys.setTextMaxLines(this.copydefault);
        return new Activity(wys);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "");
        activity.copydefault(this.OLrzqt.get(i), this.KWHzl, this.AEQbTJ);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.OLrzqt.size();
    }

    public final void EZpvd(@NotNull java.util.List<wYO> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt.clear();
        this.OLrzqt.addAll(list);
        notifyDataSetChanged();
    }

    public static final class Activity extends RecyclerView.ViewHolder {
        public final wYS OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull wYS wys) {
            super(wys);
            Intrinsics.checkNotNullParameter(wys, "");
            this.OLrzqt = wys;
        }

        public final void copydefault(@NotNull wYO wyo, final wYX.ActionBar actionBar, wYX.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(wyo, "");
            this.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.wYV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    wYU.Activity.EZpvd(actionBar, this, view);
                }
            });
            this.OLrzqt.setOnSelectedStateChangeListener(new TaskDescription(wyo, taskDescription));
            this.OLrzqt.setText(wyo.EZpvd());
            this.OLrzqt.setSelectionChipSize(wyo.KWHzl());
            this.OLrzqt.setSelected(wyo.OLrzqt());
            this.OLrzqt.setEnabled(wyo.copydefault());
        }

        public static final void EZpvd(wYX.ActionBar actionBar, Activity activity, android.view.View view) {
            if (actionBar != null) {
                actionBar.OLrzqt(activity.OLrzqt);
            }
        }

        public static final class TaskDescription implements wYS.Application {
            public final /* synthetic */ wYO KWHzl;
            public final /* synthetic */ wYX.TaskDescription copydefault;

            public TaskDescription(wYO wyo, wYX.TaskDescription taskDescription) {
                this.KWHzl = wyo;
                this.copydefault = taskDescription;
            }

            @Override // o.wYS.Application
            public void KWHzl(wYS wys, boolean z) {
                Intrinsics.checkNotNullParameter(wys, "");
                this.KWHzl.KWHzl(z);
                wYX.TaskDescription taskDescription = this.copydefault;
                if (taskDescription != null) {
                    taskDescription.copydefault(wys, this.KWHzl, z);
                }
            }
        }
    }
}
