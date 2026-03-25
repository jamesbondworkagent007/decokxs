package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.reown.android.pulse.model.EventType;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C57652ymU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ymU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57652ymU extends C57644ymM {
    public RecyclerView AYXKKw;
    public java.util.List<Activity> AhwBna;
    public StateListAnimator djBIcL;
    public Activity gEmmrt;
    public Function1<? super Activity, Unit> valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57652ymU(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.AhwBna = new java.util.ArrayList();
    }

    public static /* synthetic */ void setSelectedData$default(C57652ymU c57652ymU, Activity activity, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSelectedData");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        c57652ymU.setSelectedData(activity, z);
    }

    public final void setSelectedData(Activity activity, boolean z) {
        Function1<? super Activity, Unit> function1;
        this.gEmmrt = activity;
        if (activity == null || !z || (function1 = this.valueOf) == null) {
            return;
        }
        function1.invoke(activity);
    }

    public final void setSelectFinishListener(@NotNull Function1<? super Activity, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        if (this.valueOf != null) {
            C57587ylI.EZpvd(new java.lang.Exception("重复设置完成回调,可能会调用多次"), EventType.ERROR);
            return;
        }
        this.valueOf = function1;
        Activity activity = this.gEmmrt;
        if (activity != null) {
            function1.invoke(activity);
        }
    }

    public static /* synthetic */ void initSelectData$default(C57652ymU c57652ymU, Activity activity, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initSelectData");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        c57652ymU.KWHzl(activity, z);
    }

    public final void KWHzl(@NotNull Activity activity, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "");
        setSelectedData$default(this, null, false, 2, null);
        setSelectedData(activity, z);
        copydefault().setText(activity.KWHzl());
    }

    public static /* synthetic */ void initData$default(C57652ymU c57652ymU, java.util.List list, Activity activity, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initData");
        }
        if ((i & 4) != 0) {
            z = true;
        }
        c57652ymU.copydefault(list, activity, z);
    }

    public final void copydefault(@NotNull final java.util.List<Activity> list, @NotNull Activity activity, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(activity, "");
        this.AhwBna = list;
        KWHzl(activity, z);
        post(new java.lang.Runnable() { // from class: o.ymT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C57652ymU.OLrzqt(this.OLrzqt, list);
            }
        });
    }

    public static final void OLrzqt(C57652ymU c57652ymU, java.util.List list) {
        StateListAnimator stateListAnimator;
        C33584mzH c33584mzHAEQbTJ = c57652ymU.AEQbTJ();
        if (c33584mzHAEQbTJ == null || !c33584mzHAEQbTJ.isShowing() || (stateListAnimator = c57652ymU.djBIcL) == null) {
            return;
        }
        stateListAnimator.OLrzqt(list);
    }

    public static final Unit KWHzl(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.ymU */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showData$default(C57652ymU c57652ymU, Activity activity, java.util.ArrayList arrayList, Function1 function1, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showData");
        }
        if ((i & 1) != 0) {
            activity = null;
        }
        if ((i & 2) != 0) {
            arrayList = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: o.ymR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C57652ymU.KWHzl((C57652ymU.Activity) obj2);
                }
            };
        }
        c57652ymU.AEQbTJ(activity, arrayList, function1);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:18:0x0059 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.ArrayList<o.ymU$Activity>, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List, java.util.List<o.ymU$Activity>] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List<o.ymU$Activity>] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.view.View, o.ymM, o.ymU] */
    public final void AEQbTJ(Activity activity, java.util.ArrayList<Activity> arrayList, @NotNull Function1<? super Activity, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        RecyclerView recyclerView = (RecyclerView) android.view.LayoutInflater.from(getContext()).inflate(C32113mPz.Fragment.OcIXYQ, (android.view.ViewGroup) null);
        this.AYXKKw = recyclerView;
        if (recyclerView != null) {
            C57644ymM.show$default(this, recyclerView, 0.0f, 2, null);
        }
        RecyclerView recyclerView2 = this.AYXKKw;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        if (activity == null && (activity = this.gEmmrt) == null) {
            activity = arrayList != 0 ? (Activity) CollectionsKt___CollectionsKt.firstOrNull(arrayList) : null;
            if (activity == null && (activity = (Activity) CollectionsKt___CollectionsKt.firstOrNull(this.AhwBna)) == null) {
                activity = new Activity("", null, null, 6, null);
            }
        }
        if (arrayList == 0) {
            arrayList = this.AhwBna;
        }
        this.AhwBna = arrayList;
        copydefault(arrayList, activity, false);
        StateListAnimator stateListAnimator = new StateListAnimator(this, this.AhwBna, activity, function1);
        this.djBIcL = stateListAnimator;
        RecyclerView recyclerView3 = this.AYXKKw;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(stateListAnimator);
        }
    }

    /* JADX INFO: renamed from: o.ymU$StateListAnimator */
    /* JADX INFO: loaded from: classes17.dex */
    public final class StateListAnimator extends RecyclerView.Adapter<TaskDescription> {
        public final Activity AEQbTJ;
        public final /* synthetic */ C57652ymU EZpvd;
        public java.util.List<Activity> KWHzl;
        public final Function1<Activity, Unit> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super o.ymU$Activity, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(@NotNull C57652ymU c57652ymU, java.util.List<Activity> list, @NotNull Activity activity, Function1<? super Activity, Unit> function1) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = c57652ymU;
            this.KWHzl = list;
            this.AEQbTJ = activity;
            this.copydefault = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public TaskDescription onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = android.view.LayoutInflater.from(this.EZpvd.getContext()).inflate(C32113mPz.Fragment.QOLQEE, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return new TaskDescription(this, viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.KWHzl.size();
        }

        public final void OLrzqt(@NotNull java.util.List<Activity> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = list;
            notifyDataSetChanged();
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull TaskDescription taskDescription, int i) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            final Activity activity = this.KWHzl.get(i);
            taskDescription.AEQbTJ().setText(activity.KWHzl());
            android.widget.TextView textViewAEQbTJ = taskDescription.AEQbTJ();
            Activity activity2 = this.AEQbTJ;
            textViewAEQbTJ.setSelected(activity2 != null ? Intrinsics.EZpvd(activity, activity2) : i == 0);
            if (taskDescription.AEQbTJ().isSelected()) {
                taskDescription.OLrzqt().setVisibility(0);
            } else {
                taskDescription.OLrzqt().setVisibility(4);
            }
            ViewGroup.LayoutParams layoutParams = taskDescription.OLrzqt().getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            C55296xhK.AEQbTJ((RelativeLayout.LayoutParams) layoutParams, 0, 0, C33052mpF.dp2px$default(16.0f, null, 1, null), 0);
            android.view.View view = taskDescription.itemView;
            final C57652ymU c57652ymU = this.EZpvd;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.ymV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C57652ymU.StateListAnimator.AEQbTJ(c57652ymU, activity, this, view2);
                }
            });
        }

        public static final void AEQbTJ(C57652ymU c57652ymU, Activity activity, StateListAnimator stateListAnimator, android.view.View view) {
            C57652ymU.initSelectData$default(c57652ymU, activity, false, 2, null);
            stateListAnimator.copydefault.invoke(activity);
            c57652ymU.AYXKKw();
        }

        /* JADX INFO: renamed from: o.ymU$StateListAnimator$TaskDescription */
        /* JADX INFO: loaded from: classes24.dex */
        public final class TaskDescription extends RecyclerView.ViewHolder {
            public final /* synthetic */ StateListAnimator EZpvd;
            public final android.widget.ImageView KWHzl;
            public final android.widget.TextView copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.TextView AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.ImageView OLrzqt() {
                return this.KWHzl;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull StateListAnimator stateListAnimator, android.view.View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "");
                this.EZpvd = stateListAnimator;
                android.view.View viewFindViewById = view.findViewById(C32113mPz.FragmentManager.iZzfmt);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
                this.copydefault = (android.widget.TextView) viewFindViewById;
                android.view.View viewFindViewById2 = view.findViewById(C32113mPz.FragmentManager.fFgQHt);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
                this.KWHzl = (android.widget.ImageView) viewFindViewById2;
            }
        }
    }

    /* JADX INFO: renamed from: o.ymU$Activity */
    public static final class Activity {
        public java.lang.Object EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = activity.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = activity.OLrzqt;
            }
            if ((i & 4) != 0) {
                obj = activity.EZpvd;
            }
            return activity.copydefault(str, str2, obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Activity(str, str2, obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            int iHashCode2 = this.OLrzqt.hashCode();
            java.lang.Object obj = this.EZpvd;
            return (((iHashCode * 31) + iHashCode2) * 31) + (obj == null ? 0 : obj.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Data(title=" + this.KWHzl + ", uniqueKey=" + this.OLrzqt + ", tag=" + this.EZpvd + ")";
        }

        public Activity(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.KWHzl = str;
            this.OLrzqt = str2;
            this.EZpvd = obj;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (r1v0 java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r3v0 java.lang.Object))
 A[MD:(java.lang.String, java.lang.String, java.lang.Object):void (m)] (LINE:137) call: o.ymU.Activity.<init>(java.lang.String, java.lang.String, java.lang.Object):void type: THIS */
        public /* synthetic */ Activity(java.lang.String str, java.lang.String str2, java.lang.Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? str : str2, (i & 4) != 0 ? null : obj);
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof Activity) && Intrinsics.EZpvd((java.lang.Object) ((Activity) obj).OLrzqt, (java.lang.Object) this.OLrzqt);
        }
    }
}
