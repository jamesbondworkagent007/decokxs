package o;

import android.content.DialogInterface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.biz.ChargeGroupData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C27862kGb;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kGb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C27862kGb extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public DialogInterface.OnDismissListener AEQbTJ;
    public java.lang.String AYXKKw;
    public java.util.List<java.lang.String> AhwBna;
    public java.util.ArrayList<ChargeGroupData> DbNXlk;
    public Activity EZpvd;
    public C42913rfQ KWHzl;
    public int OLrzqt;
    public int djBIcL;
    public ChargeGroupData gEmmrt;
    public TaskDescription valueOf;

    /* JADX INFO: renamed from: o.kGb$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kGb.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C27862kGb KWHzl() {
            return new C27862kGb();
        }
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.KWHzl().setVisibility(0);
        wxq.setStyle(2);
        java.lang.String string = getString(qZH.PendingIntent.fhUrPt);
        Intrinsics.checkNotNullExpressionValue(string, "");
        wxq.setTitle(string);
        wxq.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.kGe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27862kGb.KWHzl(this.KWHzl, view);
            }
        });
        wxq.AEQbTJ().setVisibility(8);
    }

    public static final void KWHzl(C27862kGb c27862kGb, android.view.View view) {
        c27862kGb.dismissAllowingStateLoss();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.util.ArrayList<java.lang.String> stringArrayList;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            this.djBIcL = arguments.getInt("key.select_unit_index");
        }
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            this.OLrzqt = arguments2.getInt("key.select_type_index");
        }
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 != null && (stringArrayList = arguments3.getStringArrayList("key_select_type_data_list")) != null) {
            this.AhwBna = stringArrayList;
        }
        android.os.Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            this.DbNXlk = BundleCompat.getParcelableArrayList(arguments4, "key_select_unit_data_list", ChargeGroupData.class);
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.util.List<java.lang.String> list;
        ChargeGroupData chargeGroupData;
        java.lang.String str;
        C52794wYp c52794wYp;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        java.util.ArrayList<ChargeGroupData> arrayList = this.DbNXlk;
        if (arrayList == null || arrayList.isEmpty() || (list = this.AhwBna) == null || list.isEmpty()) {
            dismiss();
            return;
        }
        java.util.ArrayList<ChargeGroupData> arrayList2 = this.DbNXlk;
        if (arrayList2 == null || (chargeGroupData = (ChargeGroupData) CollectionsKt___CollectionsKt.AkhnZx(arrayList2, this.djBIcL)) == null) {
            java.util.ArrayList<ChargeGroupData> arrayList3 = this.DbNXlk;
            chargeGroupData = arrayList3 != null ? (ChargeGroupData) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList3) : null;
        }
        this.gEmmrt = chargeGroupData;
        java.util.List<java.lang.String> list2 = this.AhwBna;
        if (list2 == null || (str = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(list2, this.OLrzqt)) == null) {
            java.util.List<java.lang.String> list3 = this.AhwBna;
            str = list3 != null ? (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(list3) : null;
        }
        this.AYXKKw = str;
        C42913rfQ c42913rfQAEQbTJ = C42913rfQ.AEQbTJ(getLayoutInflater(), constraintLayout, true);
        this.KWHzl = c42913rfQAEQbTJ;
        if (c42913rfQAEQbTJ != null && (recyclerView4 = c42913rfQAEQbTJ.OLrzqt) != null) {
            recyclerView4.setLayoutManager(new GridLayoutManager(getContext(), 3));
        }
        java.util.ArrayList<ChargeGroupData> arrayList4 = this.DbNXlk;
        TaskDescription taskDescription = arrayList4 != null ? new TaskDescription(this, arrayList4) : null;
        this.valueOf = taskDescription;
        C42913rfQ c42913rfQ = this.KWHzl;
        if (c42913rfQ != null && (recyclerView3 = c42913rfQ.OLrzqt) != null) {
            recyclerView3.setAdapter(taskDescription);
        }
        C42913rfQ c42913rfQ2 = this.KWHzl;
        if (c42913rfQ2 != null && (recyclerView2 = c42913rfQ2.EZpvd) != null) {
            recyclerView2.setLayoutManager(new GridLayoutManager(getContext(), 3));
        }
        java.util.List<java.lang.String> list4 = this.AhwBna;
        Activity activity = list4 != null ? new Activity(this, list4) : null;
        this.EZpvd = activity;
        C42913rfQ c42913rfQ3 = this.KWHzl;
        if (c42913rfQ3 != null && (recyclerView = c42913rfQ3.EZpvd) != null) {
            recyclerView.setAdapter(activity);
        }
        TaskDescription taskDescription2 = this.valueOf;
        if (taskDescription2 != null) {
            taskDescription2.notifyDataSetChanged();
        }
        C42913rfQ c42913rfQ4 = this.KWHzl;
        if (c42913rfQ4 != null && (c52794wYp = c42913rfQ4.KWHzl) != null) {
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.kGf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C27862kGb.copydefault(this.OLrzqt, view);
                }
            });
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void copydefault(C27862kGb c27862kGb, android.view.View view) {
        java.util.ArrayList<ChargeGroupData> arrayList = c27862kGb.DbNXlk;
        c27862kGb.djBIcL = arrayList != null ? CollectionsKt___CollectionsKt.copydefault((java.util.List<? extends ChargeGroupData>) ((java.util.List<? extends java.lang.Object>) arrayList), c27862kGb.gEmmrt) : 0;
        java.util.List<java.lang.String> list = c27862kGb.AhwBna;
        c27862kGb.OLrzqt = list != null ? CollectionsKt___CollectionsKt.copydefault((java.util.List<? extends java.lang.String>) ((java.util.List<? extends java.lang.Object>) list), c27862kGb.AYXKKw) : 0;
        c27862kGb.dismiss();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("key.request_key_perpetual_type")) != null) {
            FragmentKt.setFragmentResult(this, string, BundleKt.bundleOf(C56390yDp.OLrzqt("key.select_unit_index", java.lang.Integer.valueOf(this.djBIcL)), C56390yDp.OLrzqt("key.select_unit_data", this.gEmmrt), C56390yDp.OLrzqt("key.select_type_index", java.lang.Integer.valueOf(this.OLrzqt)), C56390yDp.OLrzqt("key.select_type_data", this.AYXKKw)));
        }
        DialogInterface.OnDismissListener onDismissListener = this.AEQbTJ;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    /* JADX INFO: renamed from: o.kGb$Activity */
    public final class Activity extends RecyclerView.Adapter<StateListAnimator> {
        public final java.util.List<java.lang.String> AEQbTJ;
        public final /* synthetic */ C27862kGb OLrzqt;

        public Activity(@NotNull C27862kGb c27862kGb, java.util.List<java.lang.String> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = c27862kGb;
            this.AEQbTJ = list;
        }

        /* JADX INFO: renamed from: o.kGb$Activity$StateListAnimator */
        public final class StateListAnimator extends RecyclerView.ViewHolder {
            public final C54984xbQ EZpvd;
            public final /* synthetic */ Activity OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C54984xbQ OLrzqt() {
                return this.EZpvd;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull Activity activity, android.view.View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "");
                this.OLrzqt = activity;
                android.view.View viewFindViewById = view.findViewById(qZH.StateListAnimator.zHQtTQ);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
                this.EZpvd = (C54984xbQ) viewFindViewById;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = android.view.LayoutInflater.from(this.OLrzqt.getContext()).inflate(qZH.ActionBar.GCXiNH, viewGroup, false);
            Intrinsics.copydefault(viewInflate);
            return new StateListAnimator(this, viewInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, final int i) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            stateListAnimator.OLrzqt().setText(this.AEQbTJ.get(i));
            if (Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ.get(i), (java.lang.Object) this.OLrzqt.AYXKKw)) {
                stateListAnimator.OLrzqt().setSelectedStyle(true, 3);
            } else {
                stateListAnimator.OLrzqt().setSelectedStyle(false, 3);
            }
            android.view.View view = stateListAnimator.itemView;
            final C27862kGb c27862kGb = this.OLrzqt;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.kGc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C27862kGb.Activity.OLrzqt(c27862kGb, this, i, view2);
                }
            });
        }

        public static final void OLrzqt(C27862kGb c27862kGb, Activity activity, int i, android.view.View view) {
            c27862kGb.AYXKKw = activity.AEQbTJ.get(i);
            activity.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.AEQbTJ.size();
        }
    }

    /* JADX INFO: renamed from: o.kGb$TaskDescription */
    public final class TaskDescription extends RecyclerView.Adapter<Application> {
        public final /* synthetic */ C27862kGb OLrzqt;
        public final java.util.ArrayList<ChargeGroupData> copydefault;

        public TaskDescription(@NotNull C27862kGb c27862kGb, java.util.ArrayList<ChargeGroupData> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.OLrzqt = c27862kGb;
            this.copydefault = arrayList;
        }

        /* JADX INFO: renamed from: o.kGb$TaskDescription$Application */
        public final class Application extends RecyclerView.ViewHolder {
            public final C54984xbQ EZpvd;
            public final /* synthetic */ TaskDescription copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C54984xbQ EZpvd() {
                return this.EZpvd;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull TaskDescription taskDescription, android.view.View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "");
                this.copydefault = taskDescription;
                android.view.View viewFindViewById = view.findViewById(qZH.StateListAnimator.zHQtTQ);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
                this.EZpvd = (C54984xbQ) viewFindViewById;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public Application onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = android.view.LayoutInflater.from(this.OLrzqt.getContext()).inflate(qZH.ActionBar.GCXiNH, viewGroup, false);
            Intrinsics.copydefault(viewInflate);
            return new Application(this, viewInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull Application application, final int i) {
            Intrinsics.checkNotNullParameter(application, "");
            C54984xbQ c54984xbQEZpvd = application.EZpvd();
            C27862kGb c27862kGb = this.OLrzqt;
            ChargeGroupData chargeGroupData = this.copydefault.get(i);
            Intrinsics.checkNotNullExpressionValue(chargeGroupData, "");
            c54984xbQEZpvd.setText(c27862kGb.AEQbTJ(chargeGroupData));
            java.lang.String name = this.copydefault.get(i).getName();
            ChargeGroupData chargeGroupData2 = this.OLrzqt.gEmmrt;
            if (Intrinsics.EZpvd((java.lang.Object) name, (java.lang.Object) (chargeGroupData2 != null ? chargeGroupData2.getName() : null))) {
                application.EZpvd().setSelectedStyle(true, 3);
            } else {
                application.EZpvd().setSelectedStyle(false, 3);
            }
            android.view.View view = application.itemView;
            final C27862kGb c27862kGb2 = this.OLrzqt;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.kGd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C27862kGb.TaskDescription.EZpvd(c27862kGb2, this, i, view2);
                }
            });
        }

        public static final void EZpvd(C27862kGb c27862kGb, TaskDescription taskDescription, int i, android.view.View view) {
            c27862kGb.gEmmrt = taskDescription.copydefault.get(i);
            taskDescription.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.copydefault.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String AEQbTJ(ChargeGroupData chargeGroupData) {
        java.lang.String id = chargeGroupData.getId();
        int iHashCode = id.hashCode();
        if (iHashCode != 84326) {
            if (iHashCode != 2614173) {
                if (iHashCode == 2614190 && id.equals("USDT")) {
                    return C33070mpX.AYXKKw(qZH.PendingIntent.GiPPlLQAswws);
                }
            } else if (id.equals("USDC")) {
                return C33070mpX.AYXKKw(qZH.PendingIntent.setLocationManually);
            }
        } else if (id.equals("USD")) {
            return C33070mpX.AYXKKw(qZH.PendingIntent.sElUiK);
        }
        return chargeGroupData.getName();
    }
}
