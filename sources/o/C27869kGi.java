package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.widget.dialog.view.CenterLayoutManager;
import com.reown.android.pulse.model.EventType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C27869kGi;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kGi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27869kGi extends android.widget.FrameLayout {
    public RecyclerView AEQbTJ;
    public java.util.ArrayList<ActionBar> EZpvd;
    public Function1<? super ActionBar, Unit> KWHzl;
    public ActionBar OLrzqt;
    public Activity copydefault;

    public final void setSelectFinishListener(@NotNull Function1<? super ActionBar, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        if (this.KWHzl != null) {
            C57587ylI.EZpvd(new java.lang.Exception("重复设置完成回调,可能会调用多次"), EventType.ERROR);
            return;
        }
        this.KWHzl = function1;
        ActionBar actionBar = this.OLrzqt;
        if (actionBar != null) {
            function1.invoke(actionBar);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27869kGi(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27869kGi(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27869kGi(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = new java.util.ArrayList<>();
        KWHzl();
    }

    public void setData(@NotNull java.util.ArrayList<ActionBar> arrayList, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.clear();
        this.EZpvd.addAll(arrayList);
        if (this.EZpvd.size() > 1 && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "ANY")) {
            this.OLrzqt = this.EZpvd.get(0);
        }
        Activity activity = this.copydefault;
        if (activity != null) {
            activity.notifyDataSetChanged();
        }
    }

    public final void KWHzl() {
        this.AEQbTJ = (RecyclerView) android.view.LayoutInflater.from(getContext()).inflate(qZH.ActionBar.FSMca, this).findViewById(qZH.StateListAnimator.zXhzOT);
        CenterLayoutManager centerLayoutManager = new CenterLayoutManager(getContext(), 0, false);
        RecyclerView recyclerView = this.AEQbTJ;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(centerLayoutManager);
        }
        Activity activity = new Activity();
        this.copydefault = activity;
        RecyclerView recyclerView2 = this.AEQbTJ;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(activity);
        }
    }

    /* JADX INFO: renamed from: o.kGi$Activity */
    /* JADX INFO: loaded from: classes15.dex */
    public final class Activity extends RecyclerView.Adapter<TaskDescription> {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public TaskDescription onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = android.view.LayoutInflater.from(C27869kGi.this.getContext()).inflate(C52761wXj.Fragment.djBIcL, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return new TaskDescription(viewInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull TaskDescription taskDescription, final int i) {
            boolean zEZpvd;
            Intrinsics.checkNotNullParameter(taskDescription, "");
            java.lang.Object obj = C27869kGi.this.EZpvd.get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "");
            final ActionBar actionBar = (ActionBar) obj;
            taskDescription.EZpvd().setText(actionBar.KWHzl());
            android.widget.TextView textViewEZpvd = taskDescription.EZpvd();
            if (C27869kGi.this.OLrzqt != null) {
                zEZpvd = Intrinsics.EZpvd(actionBar, C27869kGi.this.OLrzqt);
            } else {
                zEZpvd = i == 0;
            }
            textViewEZpvd.setSelected(zEZpvd);
            android.view.View view = taskDescription.itemView;
            final C27869kGi c27869kGi = C27869kGi.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.kGg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C27869kGi.Activity.copydefault(c27869kGi, i, actionBar, this, view2);
                }
            });
        }

        public static final void copydefault(C27869kGi c27869kGi, int i, ActionBar actionBar, Activity activity, android.view.View view) {
            Function1 function1;
            RecyclerView recyclerView = c27869kGi.AEQbTJ;
            if (recyclerView != null) {
                recyclerView.smoothScrollToPosition(i);
            }
            c27869kGi.OLrzqt = actionBar;
            ActionBar actionBar2 = c27869kGi.OLrzqt;
            if (actionBar2 != null && (function1 = c27869kGi.KWHzl) != null) {
                function1.invoke(actionBar2);
            }
            activity.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            java.util.ArrayList arrayList = C27869kGi.this.EZpvd;
            java.lang.Integer numValueOf = arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null;
            Intrinsics.copydefault(numValueOf);
            return numValueOf.intValue();
        }
    }

    /* JADX INFO: renamed from: o.kGi$TaskDescription */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final android.widget.TextView EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView EZpvd() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C52761wXj.FragmentManager.WS);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.EZpvd = (android.widget.TextView) viewFindViewById;
        }
    }

    /* JADX INFO: renamed from: o.kGi$ActionBar */
    public static final class ActionBar {
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public java.lang.Object OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = actionBar.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = actionBar.EZpvd;
            }
            if ((i & 4) != 0) {
                obj = actionBar.OLrzqt;
            }
            return actionBar.AEQbTJ(str, str2, obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new ActionBar(str, str2, obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Object copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            int iHashCode2 = this.EZpvd.hashCode();
            java.lang.Object obj = this.OLrzqt;
            return (((iHashCode * 31) + iHashCode2) * 31) + (obj == null ? 0 : obj.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Data(title=" + this.KWHzl + ", type=" + this.EZpvd + ", tag=" + this.OLrzqt + ")";
        }

        public ActionBar(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.KWHzl = str;
            this.EZpvd = str2;
            this.OLrzqt = obj;
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof ActionBar) && Intrinsics.EZpvd((java.lang.Object) ((ActionBar) obj).EZpvd, (java.lang.Object) this.EZpvd);
        }
    }
}
