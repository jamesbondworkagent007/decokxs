package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.widget.data.TradeMenuItemBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C39402pre;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pre, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C39402pre extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public android.view.View AYXKKw;
    public TaskDescription AhwBna;
    public android.view.View AkhnZx;
    public Function0<Unit> EZpvd;
    public android.widget.LinearLayout OLrzqt;
    public android.widget.ImageView copydefault;
    public boolean djBIcL;
    public android.widget.TextView gEmmrt;
    public RecyclerView valueOf;
    public android.widget.TextView values;
    public final java.util.ArrayList<TradeMenuItemBean> AEQbTJ = new java.util.ArrayList<>();
    public java.lang.String fetchVPNInfo = "";

    /* JADX INFO: renamed from: o.pre$TaskDescription */
    public interface TaskDescription {
        void KWHzl(@NotNull TradeMenuItemBean tradeMenuItemBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<TradeMenuItemBean> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function0<Unit> function0) {
        this.EZpvd = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(TaskDescription taskDescription) {
        this.AhwBna = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        this.gEmmrt = textView;
    }

    public void copydefault() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AYXKKw = view;
    }

    /* JADX INFO: renamed from: o.pre$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pre.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C39402pre newInstance$default(ActionBar actionBar, java.util.List list, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                z = true;
            }
            return actionBar.AEQbTJ(list, str, z);
        }

        public final C39402pre AEQbTJ(@NotNull java.util.List<TradeMenuItemBean> list, @NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            C39402pre c39402pre = new C39402pre();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("title", str);
            bundle.putBoolean("isHideTitleAndCancel", z);
            c39402pre.setArguments(bundle);
            c39402pre.EZpvd().clear();
            c39402pre.EZpvd().addAll(list);
            return c39402pre;
        }
    }

    public final android.widget.TextView AEQbTJ() {
        android.widget.TextView textView = this.gEmmrt;
        if (textView != null) {
            return textView;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final android.view.View KWHzl() {
        android.view.View view = this.AYXKKw;
        if (view != null) {
            return view;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        java.lang.String string;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("title", "")) != null) {
            str = string;
        }
        this.fetchVPNInfo = str;
        wxq.setStyle(6);
        if (this.fetchVPNInfo.length() > 0) {
            wxq.AYXKKw().setGravity(17);
            wxq.setTitle(this.fetchVPNInfo);
            wxq.setDividerVisibility(false);
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        mPP.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.gasjUx));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        ConstraintLayout constraintLayout;
        android.view.View rootView;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        java.lang.Boolean boolValueOf = arguments != null ? java.lang.Boolean.valueOf(arguments.getBoolean("isHideTitleAndCancel", false)) : null;
        C54946xaf binding = getBinding();
        if (binding != null && (constraintLayout = binding.AEQbTJ) != null && (rootView = constraintLayout.getRootView()) != null) {
            OLrzqt((android.widget.TextView) rootView.findViewById(C32113mPz.FragmentManager.copydefault));
            copydefault(rootView.findViewById(C32113mPz.FragmentManager.AkhnZx));
            this.valueOf = (RecyclerView) rootView.findViewById(C32113mPz.FragmentManager.RcXXUw);
            this.OLrzqt = (android.widget.LinearLayout) rootView.findViewById(C32113mPz.FragmentManager.accept);
            RecyclerView recyclerView = this.valueOf;
            if (recyclerView != null) {
                recyclerView.setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.GhqvEQ));
            }
            this.values = (android.widget.TextView) rootView.findViewById(C32113mPz.FragmentManager.gwTjWJ);
            this.copydefault = (android.widget.ImageView) rootView.findViewById(C32113mPz.FragmentManager.zsXlph);
            this.AkhnZx = rootView.findViewById(C32113mPz.FragmentManager.QKudOq);
            AEQbTJ().setText(C33070mpX.AYXKKw(C33087mpo.KWHzl.AEQbTJ()));
            if (Intrinsics.EZpvd(boolValueOf, java.lang.Boolean.TRUE)) {
                android.widget.LinearLayout linearLayout = this.OLrzqt;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                KWHzl().setVisibility(8);
                AEQbTJ().setVisibility(8);
            }
            RecyclerView recyclerView2 = this.valueOf;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(new LinearLayoutManager(rootView.getContext(), 1, false));
            }
            RecyclerView recyclerView3 = this.valueOf;
            if (recyclerView3 != null) {
                recyclerView3.setAdapter(new StateListAnimator());
            }
            AEQbTJ().setOnClickListener(new View.OnClickListener() { // from class: o.prd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C39402pre.OLrzqt(this.KWHzl, view2);
                }
            });
            android.widget.ImageView imageView = this.copydefault;
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: o.prc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        C39402pre.AEQbTJ(this.EZpvd, view2);
                    }
                });
            }
            copydefault();
        }
        view.post(new java.lang.Runnable() { // from class: o.pra
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C39402pre.OLrzqt(this.EZpvd);
            }
        });
    }

    public static final void OLrzqt(C39402pre c39402pre, android.view.View view) {
        c39402pre.dismiss();
    }

    public static final void AEQbTJ(C39402pre c39402pre, android.view.View view) {
        c39402pre.dismiss();
    }

    public static final void OLrzqt(C39402pre c39402pre) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c39402pre, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        if (!this.djBIcL && (function0 = this.EZpvd) != null) {
            function0.invoke();
        }
        this.djBIcL = false;
        super.onDismiss(dialogInterface);
    }

    /* JADX INFO: renamed from: o.pre$StateListAnimator */
    public final class StateListAnimator extends RecyclerView.Adapter<Application> {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public Application onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C39402pre c39402pre = C39402pre.this;
            android.view.View viewInflate = android.view.LayoutInflater.from(c39402pre.getContext()).inflate(C32113mPz.Fragment.values, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return new Application(c39402pre, viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return C39402pre.this.EZpvd().size();
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull Application application, final int i) {
            TradeMenuItemBean tradeMenuItemBean;
            TradeMenuItemBean tradeMenuItemBean2;
            TradeMenuItemBean tradeMenuItemBean3;
            TradeMenuItemBean tradeMenuItemBean4;
            java.lang.String title;
            java.lang.String str = "";
            Intrinsics.checkNotNullParameter(application, "");
            android.widget.TextView textViewEZpvd = application.EZpvd();
            java.util.ArrayList<TradeMenuItemBean> arrayListEZpvd = C39402pre.this.EZpvd();
            if (arrayListEZpvd != null && (tradeMenuItemBean4 = arrayListEZpvd.get(i)) != null && (title = tradeMenuItemBean4.getTitle()) != null) {
                str = title;
            }
            textViewEZpvd.setText(str);
            android.widget.ImageView imageViewAEQbTJ = application.AEQbTJ();
            java.util.ArrayList<TradeMenuItemBean> arrayListEZpvd2 = C39402pre.this.EZpvd();
            java.lang.Boolean boolValueOf = (arrayListEZpvd2 == null || (tradeMenuItemBean3 = arrayListEZpvd2.get(i)) == null) ? null : java.lang.Boolean.valueOf(tradeMenuItemBean3.isSelect());
            Intrinsics.copydefault(boolValueOf);
            imageViewAEQbTJ.setVisibility(boolValueOf.booleanValue() ? 0 : 4);
            android.view.View view = application.itemView;
            java.util.ArrayList<TradeMenuItemBean> arrayListEZpvd3 = C39402pre.this.EZpvd();
            boolean enable = true;
            view.setEnabled((arrayListEZpvd3 == null || (tradeMenuItemBean2 = arrayListEZpvd3.get(i)) == null) ? true : tradeMenuItemBean2.getEnable());
            android.widget.TextView textViewEZpvd2 = application.EZpvd();
            java.util.ArrayList<TradeMenuItemBean> arrayListEZpvd4 = C39402pre.this.EZpvd();
            if (arrayListEZpvd4 != null && (tradeMenuItemBean = arrayListEZpvd4.get(i)) != null) {
                enable = tradeMenuItemBean.getEnable();
            }
            textViewEZpvd2.setEnabled(enable);
            application.OLrzqt().setText(C39402pre.this.EZpvd().get(i).getDescription());
            application.OLrzqt().setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) C39402pre.this.EZpvd().get(i).getDescription()) ? 0 : 8);
            android.view.View view2 = application.itemView;
            final C39402pre c39402pre = C39402pre.this;
            view2.setOnClickListener(new View.OnClickListener() { // from class: o.prg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view3) {
                    C39402pre.StateListAnimator.EZpvd(c39402pre, i, this, view3);
                }
            });
        }

        public static final void EZpvd(C39402pre c39402pre, int i, StateListAnimator stateListAnimator, android.view.View view) {
            TradeMenuItemBean tradeMenuItemBean;
            TradeMenuItemBean tradeMenuItemBean2;
            TradeMenuItemBean tradeMenuItemBean3;
            TaskDescription taskDescription;
            java.util.ArrayList<TradeMenuItemBean> arrayListEZpvd = c39402pre.EZpvd();
            if (arrayListEZpvd != null && (tradeMenuItemBean3 = arrayListEZpvd.get(i)) != null && (taskDescription = c39402pre.AhwBna) != null) {
                taskDescription.KWHzl(tradeMenuItemBean3);
            }
            java.util.ArrayList<TradeMenuItemBean> arrayListEZpvd2 = c39402pre.EZpvd();
            java.lang.Integer numValueOf = arrayListEZpvd2 != null ? java.lang.Integer.valueOf(arrayListEZpvd2.size()) : null;
            Intrinsics.copydefault(numValueOf);
            int iIntValue = numValueOf.intValue();
            for (int i2 = 0; i2 < iIntValue; i2++) {
                java.util.ArrayList<TradeMenuItemBean> arrayListEZpvd3 = c39402pre.EZpvd();
                if (arrayListEZpvd3 != null && (tradeMenuItemBean2 = arrayListEZpvd3.get(i2)) != null) {
                    tradeMenuItemBean2.setSelect(false);
                }
            }
            java.util.ArrayList<TradeMenuItemBean> arrayListEZpvd4 = c39402pre.EZpvd();
            if (arrayListEZpvd4 != null && (tradeMenuItemBean = arrayListEZpvd4.get(i)) != null) {
                tradeMenuItemBean.setSelect(true);
            }
            stateListAnimator.notifyDataSetChanged();
            c39402pre.djBIcL = true;
            c39402pre.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.pre$Application */
    public final class Application extends RecyclerView.ViewHolder {
        public final android.widget.ImageView AEQbTJ;
        public final android.widget.TextView KWHzl;
        public final /* synthetic */ C39402pre OLrzqt;
        public final android.widget.TextView copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView OLrzqt() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C39402pre c39402pre, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.OLrzqt = c39402pre;
            android.view.View viewFindViewById = view.findViewById(C32113mPz.FragmentManager.OBJEWx);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.KWHzl = (android.widget.TextView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C32113mPz.FragmentManager.AuCTelauCTel);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.AEQbTJ = (android.widget.ImageView) viewFindViewById2;
            android.view.View viewFindViewById3 = view.findViewById(C32113mPz.FragmentManager.QSBOWP);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.copydefault = (android.widget.TextView) viewFindViewById3;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pre */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setOnDismissListener$default(C39402pre c39402pre, Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOnDismissListener");
        }
        if ((i & 1) != 0) {
            function0 = null;
        }
        c39402pre.EZpvd((Function0<Unit>) function0);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(@NotNull androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        try {
            if (isAdded()) {
                dismiss();
            } else {
                super.show(fragmentManager, str);
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
