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
import o.C39403prf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.prf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C39403prf extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public android.widget.LinearLayout AEQbTJ;
    public ActionBar AYXKKw;
    public android.view.View AhwBna;
    public android.widget.TextView DbNXlk;
    public Function0<Unit> KWHzl;
    public android.widget.ImageView OLrzqt;
    public android.widget.TextView djBIcL;
    public android.view.View fetchVPNInfo;
    public boolean gEmmrt;
    public RecyclerView valueOf;
    public final java.util.ArrayList<TradeMenuItemBean> EZpvd = new java.util.ArrayList<>();
    public java.lang.String AkhnZx = "";

    /* JADX INFO: renamed from: o.prf$ActionBar */
    public interface ActionBar {
        void EZpvd(@NotNull TradeMenuItemBean tradeMenuItemBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<TradeMenuItemBean> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function0<Unit> function0) {
        this.KWHzl = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(ActionBar actionBar) {
        this.AYXKKw = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AhwBna = view;
    }

    public void copydefault() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        this.djBIcL = textView;
    }

    /* JADX INFO: renamed from: o.prf$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.prf.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ C39403prf newInstance$default(TaskDescription taskDescription, java.util.List list, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                z = true;
            }
            return taskDescription.EZpvd(list, str, z);
        }

        public final C39403prf EZpvd(@NotNull java.util.List<TradeMenuItemBean> list, @NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            C39403prf c39403prf = new C39403prf();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("title", str);
            bundle.putBoolean("isHideTitleAndCancel", z);
            c39403prf.setArguments(bundle);
            c39403prf.AEQbTJ().clear();
            c39403prf.AEQbTJ().addAll(list);
            return c39403prf;
        }
    }

    public final android.widget.TextView EZpvd() {
        android.widget.TextView textView = this.djBIcL;
        if (textView != null) {
            return textView;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final android.view.View OLrzqt() {
        android.view.View view = this.AhwBna;
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
        this.AkhnZx = str;
        wxq.setStyle(6);
        wxq.AYXKKw().setGravity(17);
        wxq.setTitle(this.AkhnZx);
        wxq.setDividerVisibility(false);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        mPP.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
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
            copydefault((android.widget.TextView) rootView.findViewById(C32113mPz.FragmentManager.copydefault));
            OLrzqt(rootView.findViewById(C32113mPz.FragmentManager.AkhnZx));
            RecyclerView recyclerView = (RecyclerView) rootView.findViewById(C32113mPz.FragmentManager.RcXXUw);
            this.valueOf = recyclerView;
            if (recyclerView != null) {
                recyclerView.setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.GhqvEQ));
            }
            this.AEQbTJ = (android.widget.LinearLayout) rootView.findViewById(C32113mPz.FragmentManager.accept);
            this.DbNXlk = (android.widget.TextView) rootView.findViewById(C32113mPz.FragmentManager.gwTjWJ);
            this.OLrzqt = (android.widget.ImageView) rootView.findViewById(C32113mPz.FragmentManager.zsXlph);
            this.fetchVPNInfo = rootView.findViewById(C32113mPz.FragmentManager.QKudOq);
            EZpvd().setText(C33070mpX.AYXKKw(C33087mpo.KWHzl.AEQbTJ()));
            if (Intrinsics.EZpvd(boolValueOf, java.lang.Boolean.TRUE)) {
                android.widget.LinearLayout linearLayout = this.AEQbTJ;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                EZpvd().setVisibility(8);
                OLrzqt().setVisibility(8);
            }
            RecyclerView recyclerView2 = this.valueOf;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(new LinearLayoutManager(rootView.getContext(), 1, false));
            }
            RecyclerView recyclerView3 = this.valueOf;
            if (recyclerView3 != null) {
                recyclerView3.setAdapter(new Application());
            }
            EZpvd().setOnClickListener(new View.OnClickListener() { // from class: o.prh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C39403prf.OLrzqt(this.AEQbTJ, view2);
                }
            });
            android.widget.ImageView imageView = this.OLrzqt;
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: o.pri
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        C39403prf.AEQbTJ(this.OLrzqt, view2);
                    }
                });
            }
            copydefault();
        }
        view.post(new java.lang.Runnable() { // from class: o.prm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C39403prf.OLrzqt(this.copydefault);
            }
        });
    }

    public static final void OLrzqt(C39403prf c39403prf, android.view.View view) {
        c39403prf.dismiss();
    }

    public static final void AEQbTJ(C39403prf c39403prf, android.view.View view) {
        c39403prf.dismiss();
    }

    public static final void OLrzqt(C39403prf c39403prf) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c39403prf, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        if (!this.gEmmrt && (function0 = this.KWHzl) != null) {
            function0.invoke();
        }
        this.gEmmrt = false;
        super.onDismiss(dialogInterface);
    }

    /* JADX INFO: renamed from: o.prf$Application */
    public final class Application extends RecyclerView.Adapter<Activity> {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public Activity onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C39403prf c39403prf = C39403prf.this;
            android.view.View viewInflate = android.view.LayoutInflater.from(c39403prf.getContext()).inflate(C32113mPz.Fragment.values, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return new Activity(c39403prf, viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return C39403prf.this.AEQbTJ().size();
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull Activity activity, final int i) {
            TradeMenuItemBean tradeMenuItemBean;
            TradeMenuItemBean tradeMenuItemBean2;
            TradeMenuItemBean tradeMenuItemBean3;
            TradeMenuItemBean tradeMenuItemBean4;
            java.lang.String title;
            java.lang.String str = "";
            Intrinsics.checkNotNullParameter(activity, "");
            android.widget.TextView textViewEZpvd = activity.EZpvd();
            java.util.ArrayList<TradeMenuItemBean> arrayListAEQbTJ = C39403prf.this.AEQbTJ();
            if (arrayListAEQbTJ != null && (tradeMenuItemBean4 = arrayListAEQbTJ.get(i)) != null && (title = tradeMenuItemBean4.getTitle()) != null) {
                str = title;
            }
            textViewEZpvd.setText(str);
            activity.EZpvd().setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) C39403prf.this.AEQbTJ().get(i).getTitle()) ? 0 : 8);
            android.widget.ImageView imageViewOLrzqt = activity.OLrzqt();
            java.util.ArrayList<TradeMenuItemBean> arrayListAEQbTJ2 = C39403prf.this.AEQbTJ();
            java.lang.Boolean boolValueOf = (arrayListAEQbTJ2 == null || (tradeMenuItemBean3 = arrayListAEQbTJ2.get(i)) == null) ? null : java.lang.Boolean.valueOf(tradeMenuItemBean3.isSelect());
            Intrinsics.copydefault(boolValueOf);
            imageViewOLrzqt.setVisibility(boolValueOf.booleanValue() ? 0 : 4);
            android.view.View view = activity.itemView;
            java.util.ArrayList<TradeMenuItemBean> arrayListAEQbTJ3 = C39403prf.this.AEQbTJ();
            boolean enable = true;
            view.setEnabled((arrayListAEQbTJ3 == null || (tradeMenuItemBean2 = arrayListAEQbTJ3.get(i)) == null) ? true : tradeMenuItemBean2.getEnable());
            android.widget.TextView textViewEZpvd2 = activity.EZpvd();
            java.util.ArrayList<TradeMenuItemBean> arrayListAEQbTJ4 = C39403prf.this.AEQbTJ();
            if (arrayListAEQbTJ4 != null && (tradeMenuItemBean = arrayListAEQbTJ4.get(i)) != null) {
                enable = tradeMenuItemBean.getEnable();
            }
            textViewEZpvd2.setEnabled(enable);
            activity.KWHzl().setText(C39403prf.this.AEQbTJ().get(i).getDescription());
            activity.KWHzl().setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) C39403prf.this.AEQbTJ().get(i).getDescription()) ? 0 : 8);
            android.view.View view2 = activity.itemView;
            final C39403prf c39403prf = C39403prf.this;
            view2.setOnClickListener(new View.OnClickListener() { // from class: o.pro
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view3) {
                    C39403prf.Application.KWHzl(c39403prf, i, this, view3);
                }
            });
        }

        public static final void KWHzl(C39403prf c39403prf, int i, Application application, android.view.View view) {
            TradeMenuItemBean tradeMenuItemBean;
            TradeMenuItemBean tradeMenuItemBean2;
            TradeMenuItemBean tradeMenuItemBean3;
            ActionBar actionBar;
            java.util.ArrayList<TradeMenuItemBean> arrayListAEQbTJ = c39403prf.AEQbTJ();
            if (arrayListAEQbTJ != null && (tradeMenuItemBean3 = arrayListAEQbTJ.get(i)) != null && (actionBar = c39403prf.AYXKKw) != null) {
                actionBar.EZpvd(tradeMenuItemBean3);
            }
            java.util.ArrayList<TradeMenuItemBean> arrayListAEQbTJ2 = c39403prf.AEQbTJ();
            java.lang.Integer numValueOf = arrayListAEQbTJ2 != null ? java.lang.Integer.valueOf(arrayListAEQbTJ2.size()) : null;
            Intrinsics.copydefault(numValueOf);
            int iIntValue = numValueOf.intValue();
            for (int i2 = 0; i2 < iIntValue; i2++) {
                java.util.ArrayList<TradeMenuItemBean> arrayListAEQbTJ3 = c39403prf.AEQbTJ();
                if (arrayListAEQbTJ3 != null && (tradeMenuItemBean2 = arrayListAEQbTJ3.get(i2)) != null) {
                    tradeMenuItemBean2.setSelect(false);
                }
            }
            java.util.ArrayList<TradeMenuItemBean> arrayListAEQbTJ4 = c39403prf.AEQbTJ();
            if (arrayListAEQbTJ4 != null && (tradeMenuItemBean = arrayListAEQbTJ4.get(i)) != null) {
                tradeMenuItemBean.setSelect(true);
            }
            application.notifyDataSetChanged();
            c39403prf.gEmmrt = true;
            c39403prf.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.prf$Activity */
    public final class Activity extends RecyclerView.ViewHolder {
        public final android.widget.ImageView AEQbTJ;
        public final android.widget.TextView EZpvd;
        public final android.widget.TextView KWHzl;
        public final /* synthetic */ C39403prf OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C39403prf c39403prf, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.OLrzqt = c39403prf;
            android.view.View viewFindViewById = view.findViewById(C32113mPz.FragmentManager.OBJEWx);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.KWHzl = (android.widget.TextView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C32113mPz.FragmentManager.AuCTelauCTel);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.AEQbTJ = (android.widget.ImageView) viewFindViewById2;
            android.view.View viewFindViewById3 = view.findViewById(C32113mPz.FragmentManager.QSBOWP);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.EZpvd = (android.widget.TextView) viewFindViewById3;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.prf */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setOnDismissListener$default(C39403prf c39403prf, Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOnDismissListener");
        }
        if ((i & 1) != 0) {
            function0 = null;
        }
        c39403prf.KWHzl((Function0<Unit>) function0);
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
