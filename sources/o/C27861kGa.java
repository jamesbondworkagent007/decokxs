package o;

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
import o.C27861kGa;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kGa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C27861kGa extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public C42911rfO AEQbTJ;
    public int EZpvd;
    public Application KWHzl;
    public ChargeGroupData copydefault;
    public java.util.ArrayList<ChargeGroupData> valueOf;

    /* JADX INFO: renamed from: o.kGa$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kGa.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C27861kGa copydefault() {
            return new C27861kGa();
        }
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.KWHzl().setVisibility(0);
        wxq.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.kFY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27861kGa.OLrzqt(this.KWHzl, view);
            }
        });
        wxq.setStyle(2);
        java.lang.String string = getString(qZH.PendingIntent.pause);
        Intrinsics.checkNotNullExpressionValue(string, "");
        wxq.setTitle(string);
        wxq.AEQbTJ().setVisibility(8);
    }

    public static final void OLrzqt(C27861kGa c27861kGa, android.view.View view) {
        c27861kGa.dismissAllowingStateLoss();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            this.EZpvd = arguments.getInt("key.select_index");
        }
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            this.valueOf = BundleCompat.getParcelableArrayList(arguments2, "key.group_data", ChargeGroupData.class);
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        ChargeGroupData chargeGroupData;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        java.util.ArrayList<ChargeGroupData> arrayList = this.valueOf;
        if (arrayList == null || arrayList.isEmpty()) {
            dismiss();
            return;
        }
        java.util.ArrayList<ChargeGroupData> arrayList2 = this.valueOf;
        if (arrayList2 == null || (chargeGroupData = (ChargeGroupData) CollectionsKt___CollectionsKt.AkhnZx(arrayList2, this.EZpvd)) == null) {
            java.util.ArrayList<ChargeGroupData> arrayList3 = this.valueOf;
            chargeGroupData = arrayList3 != null ? (ChargeGroupData) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList3) : null;
        }
        this.copydefault = chargeGroupData;
        C42911rfO c42911rfOEZpvd = C42911rfO.EZpvd(getLayoutInflater(), constraintLayout, true);
        this.AEQbTJ = c42911rfOEZpvd;
        if (c42911rfOEZpvd != null) {
            java.util.ArrayList<ChargeGroupData> arrayList4 = this.valueOf;
            if (arrayList4 == null) {
                arrayList4 = new java.util.ArrayList<>();
            }
            this.KWHzl = new Application(this, arrayList4);
            c42911rfOEZpvd.OLrzqt.setLayoutManager(new GridLayoutManager(getContext(), 2));
            c42911rfOEZpvd.OLrzqt.setAdapter(this.KWHzl);
            c42911rfOEZpvd.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.kFW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C27861kGa.KWHzl(this.OLrzqt, view);
                }
            });
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void KWHzl(C27861kGa c27861kGa, android.view.View view) {
        java.util.ArrayList<ChargeGroupData> arrayList = c27861kGa.valueOf;
        c27861kGa.EZpvd = arrayList != null ? CollectionsKt___CollectionsKt.copydefault((java.util.List<? extends ChargeGroupData>) ((java.util.List<? extends java.lang.Object>) arrayList), c27861kGa.copydefault) : 0;
        c27861kGa.dismiss();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("key.request_key_spot")) != null) {
            FragmentKt.setFragmentResult(this, string, BundleKt.bundleOf(C56390yDp.OLrzqt("key.select_index", java.lang.Integer.valueOf(this.EZpvd)), C56390yDp.OLrzqt("key.select_data", this.copydefault)));
        }
        super.onDismiss(dialogInterface);
    }

    /* JADX INFO: renamed from: o.kGa$Application */
    public final class Application extends RecyclerView.Adapter<C0866Application> {
        public final java.util.ArrayList<ChargeGroupData> AEQbTJ;
        public final /* synthetic */ C27861kGa OLrzqt;

        public Application(@NotNull C27861kGa c27861kGa, java.util.ArrayList<ChargeGroupData> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.OLrzqt = c27861kGa;
            this.AEQbTJ = arrayList;
        }

        /* JADX INFO: renamed from: o.kGa$Application$Application, reason: collision with other inner class name */
        public final class C0866Application extends RecyclerView.ViewHolder {
            public final C54984xbQ AEQbTJ;
            public final /* synthetic */ Application EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C54984xbQ copydefault() {
                return this.AEQbTJ;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0866Application(@NotNull Application application, android.view.View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "");
                this.EZpvd = application;
                android.view.View viewFindViewById = view.findViewById(qZH.StateListAnimator.zHQtTQ);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
                this.AEQbTJ = (C54984xbQ) viewFindViewById;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public C0866Application onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = android.view.LayoutInflater.from(this.OLrzqt.getContext()).inflate(qZH.ActionBar.GCXiNH, viewGroup, false);
            Intrinsics.copydefault(viewInflate);
            return new C0866Application(this, viewInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C0866Application c0866Application, final int i) {
            Intrinsics.checkNotNullParameter(c0866Application, "");
            C54984xbQ c54984xbQCopydefault = c0866Application.copydefault();
            C27861kGa c27861kGa = this.OLrzqt;
            ChargeGroupData chargeGroupData = this.AEQbTJ.get(i);
            Intrinsics.checkNotNullExpressionValue(chargeGroupData, "");
            c54984xbQCopydefault.setText(c27861kGa.KWHzl(chargeGroupData));
            java.lang.String name = this.AEQbTJ.get(i).getName();
            ChargeGroupData chargeGroupData2 = this.OLrzqt.copydefault;
            if (Intrinsics.EZpvd((java.lang.Object) name, (java.lang.Object) (chargeGroupData2 != null ? chargeGroupData2.getName() : null))) {
                c0866Application.copydefault().setSelectedStyle(true, 3);
            } else {
                c0866Application.copydefault().setSelectedStyle(false, 3);
            }
            android.view.View view = c0866Application.itemView;
            final C27861kGa c27861kGa2 = this.OLrzqt;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.kFX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C27861kGa.Application.EZpvd(c27861kGa2, this, i, view2);
                }
            });
        }

        public static final void EZpvd(C27861kGa c27861kGa, Application application, int i, android.view.View view) {
            c27861kGa.copydefault = application.AEQbTJ.get(i);
            application.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.AEQbTJ.size();
        }
    }

    public final java.lang.String KWHzl(ChargeGroupData chargeGroupData) {
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
        java.lang.String displayName = chargeGroupData.getDisplayName();
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) displayName)) {
            displayName = null;
        }
        return displayName == null ? chargeGroupData.getName() : displayName;
    }
}
