package o;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.widget.data.TradeMenuItemBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C57664ymg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ymg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57664ymg extends C57662yme {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public Function0<Unit> AEQbTJ;
    public boolean AYXKKw;
    public RecyclerView AhwBna;
    public android.widget.TextView AkhnZx;
    public android.widget.LinearLayout EZpvd;
    public android.widget.ImageView KWHzl;
    public StateListAnimator djBIcL;
    public android.view.View fJNWhG;
    public android.widget.TextView gEmmrt;
    public android.view.View valueOf;
    public final java.util.ArrayList<TradeMenuItemBean> copydefault = new java.util.ArrayList<>();
    public java.lang.String DbNXlk = "";

    /* JADX INFO: renamed from: o.ymg$StateListAnimator */
    public interface StateListAnimator {
        void EZpvd(@NotNull TradeMenuItemBean tradeMenuItemBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.valueOf = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(StateListAnimator stateListAnimator) {
        this.djBIcL = stateListAnimator;
    }

    public void KWHzl() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function0<Unit> function0) {
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        this.gEmmrt = textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<TradeMenuItemBean> copydefault() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: o.ymg$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ymg.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ C57664ymg newInstance$default(Application application, java.util.List list, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return application.copydefault(list, str, z);
        }

        public final C57664ymg copydefault(@NotNull java.util.List<TradeMenuItemBean> list, @NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            C57664ymg c57664ymg = new C57664ymg();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("title", str);
            bundle.putBoolean("isHideTitleAndCancel", z);
            c57664ymg.setArguments(bundle);
            c57664ymg.copydefault().clear();
            c57664ymg.copydefault().addAll(list);
            return c57664ymg;
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

    public final android.view.View OLrzqt() {
        android.view.View view = this.valueOf;
        if (view != null) {
            return view;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        android.view.View viewInflate = layoutInflater.inflate(C32113mPz.Fragment.gHZMYf, (android.view.ViewGroup) null, false);
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("title", "")) != null) {
            str = string;
        }
        this.DbNXlk = str;
        android.os.Bundle arguments2 = getArguments();
        java.lang.Boolean boolValueOf = arguments2 != null ? java.lang.Boolean.valueOf(arguments2.getBoolean("isHideTitleAndCancel", false)) : null;
        OLrzqt((android.widget.TextView) viewInflate.findViewById(C32113mPz.FragmentManager.copydefault));
        EZpvd(viewInflate.findViewById(C32113mPz.FragmentManager.AkhnZx));
        this.AhwBna = (RecyclerView) viewInflate.findViewById(C32113mPz.FragmentManager.RcXXUw);
        this.EZpvd = (android.widget.LinearLayout) viewInflate.findViewById(C32113mPz.FragmentManager.accept);
        this.AkhnZx = (android.widget.TextView) viewInflate.findViewById(C32113mPz.FragmentManager.gwTjWJ);
        this.KWHzl = (android.widget.ImageView) viewInflate.findViewById(C32113mPz.FragmentManager.zsXlph);
        this.fJNWhG = viewInflate.findViewById(C32113mPz.FragmentManager.QKudOq);
        AEQbTJ().setText(C33070mpX.AYXKKw(C33087mpo.KWHzl.AEQbTJ()));
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.DbNXlk)) {
            android.widget.LinearLayout linearLayout = this.EZpvd;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            android.widget.TextView textView = this.AkhnZx;
            if (textView != null) {
                textView.setText(this.DbNXlk);
            }
            AEQbTJ().setVisibility(8);
        }
        if (boolValueOf != null && boolValueOf.booleanValue()) {
            android.widget.LinearLayout linearLayout2 = this.EZpvd;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
            AEQbTJ().setVisibility(8);
            OLrzqt().setVisibility(8);
        }
        RecyclerView recyclerView = this.AhwBna;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(viewInflate.getContext(), 1, false));
        }
        RecyclerView recyclerView2 = this.AhwBna;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(new ActionBar());
        }
        AEQbTJ().setOnClickListener(new View.OnClickListener() { // from class: o.ymh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C57664ymg.copydefault(this.AEQbTJ, view);
            }
        });
        android.widget.ImageView imageView = this.KWHzl;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o.ymd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C57664ymg.KWHzl(this.EZpvd, view);
                }
            });
        }
        KWHzl();
        return viewInflate;
    }

    public static final void copydefault(C57664ymg c57664ymg, android.view.View view) {
        c57664ymg.dismiss();
    }

    public static final void KWHzl(C57664ymg c57664ymg, android.view.View view) {
        c57664ymg.dismiss();
    }

    @Override // o.C57662yme, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        if (!this.AYXKKw && (function0 = this.AEQbTJ) != null) {
            function0.invoke();
        }
        this.AYXKKw = false;
        super.onDismiss(dialogInterface);
    }

    /* JADX INFO: renamed from: o.ymg$ActionBar */
    public final class ActionBar extends RecyclerView.Adapter<Activity> {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public Activity onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C57664ymg c57664ymg = C57664ymg.this;
            android.view.View viewInflate = android.view.LayoutInflater.from(c57664ymg.getContext()).inflate(C32113mPz.Fragment.values, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return new Activity(c57664ymg, viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return C57664ymg.this.copydefault().size();
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull Activity activity, final int i) {
            TradeMenuItemBean tradeMenuItemBean;
            TradeMenuItemBean tradeMenuItemBean2;
            TradeMenuItemBean tradeMenuItemBean3;
            TradeMenuItemBean tradeMenuItemBean4;
            java.lang.String title;
            java.lang.String str = "";
            Intrinsics.checkNotNullParameter(activity, "");
            android.widget.TextView textViewAEQbTJ = activity.AEQbTJ();
            java.util.ArrayList<TradeMenuItemBean> arrayListCopydefault = C57664ymg.this.copydefault();
            if (arrayListCopydefault != null && (tradeMenuItemBean4 = arrayListCopydefault.get(i)) != null && (title = tradeMenuItemBean4.getTitle()) != null) {
                str = title;
            }
            textViewAEQbTJ.setText(str);
            android.widget.ImageView imageViewEZpvd = activity.EZpvd();
            java.util.ArrayList<TradeMenuItemBean> arrayListCopydefault2 = C57664ymg.this.copydefault();
            java.lang.Boolean boolValueOf = (arrayListCopydefault2 == null || (tradeMenuItemBean3 = arrayListCopydefault2.get(i)) == null) ? null : java.lang.Boolean.valueOf(tradeMenuItemBean3.isSelect());
            Intrinsics.copydefault(boolValueOf);
            imageViewEZpvd.setVisibility(boolValueOf.booleanValue() ? 0 : 4);
            android.view.View view = activity.itemView;
            java.util.ArrayList<TradeMenuItemBean> arrayListCopydefault3 = C57664ymg.this.copydefault();
            boolean enable = true;
            view.setEnabled((arrayListCopydefault3 == null || (tradeMenuItemBean2 = arrayListCopydefault3.get(i)) == null) ? true : tradeMenuItemBean2.getEnable());
            android.widget.TextView textViewAEQbTJ2 = activity.AEQbTJ();
            java.util.ArrayList<TradeMenuItemBean> arrayListCopydefault4 = C57664ymg.this.copydefault();
            if (arrayListCopydefault4 != null && (tradeMenuItemBean = arrayListCopydefault4.get(i)) != null) {
                enable = tradeMenuItemBean.getEnable();
            }
            textViewAEQbTJ2.setEnabled(enable);
            activity.KWHzl().setText(C57664ymg.this.copydefault().get(i).getDescription());
            activity.KWHzl().setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) C57664ymg.this.copydefault().get(i).getDescription()) ? 0 : 8);
            android.view.View view2 = activity.itemView;
            final C57664ymg c57664ymg = C57664ymg.this;
            view2.setOnClickListener(new View.OnClickListener() { // from class: o.ymm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view3) {
                    C57664ymg.ActionBar.OLrzqt(c57664ymg, i, this, view3);
                }
            });
        }

        public static final void OLrzqt(C57664ymg c57664ymg, int i, ActionBar actionBar, android.view.View view) {
            TradeMenuItemBean tradeMenuItemBean;
            TradeMenuItemBean tradeMenuItemBean2;
            TradeMenuItemBean tradeMenuItemBean3;
            StateListAnimator stateListAnimator;
            java.util.ArrayList<TradeMenuItemBean> arrayListCopydefault = c57664ymg.copydefault();
            if (arrayListCopydefault != null && (tradeMenuItemBean3 = arrayListCopydefault.get(i)) != null && (stateListAnimator = c57664ymg.djBIcL) != null) {
                stateListAnimator.EZpvd(tradeMenuItemBean3);
            }
            java.util.ArrayList<TradeMenuItemBean> arrayListCopydefault2 = c57664ymg.copydefault();
            java.lang.Integer numValueOf = arrayListCopydefault2 != null ? java.lang.Integer.valueOf(arrayListCopydefault2.size()) : null;
            Intrinsics.copydefault(numValueOf);
            int iIntValue = numValueOf.intValue();
            for (int i2 = 0; i2 < iIntValue; i2++) {
                java.util.ArrayList<TradeMenuItemBean> arrayListCopydefault3 = c57664ymg.copydefault();
                if (arrayListCopydefault3 != null && (tradeMenuItemBean2 = arrayListCopydefault3.get(i2)) != null) {
                    tradeMenuItemBean2.setSelect(false);
                }
            }
            java.util.ArrayList<TradeMenuItemBean> arrayListCopydefault4 = c57664ymg.copydefault();
            if (arrayListCopydefault4 != null && (tradeMenuItemBean = arrayListCopydefault4.get(i)) != null) {
                tradeMenuItemBean.setSelect(true);
            }
            actionBar.notifyDataSetChanged();
            c57664ymg.AYXKKw = true;
            c57664ymg.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.ymg$Activity */
    public final class Activity extends RecyclerView.ViewHolder {
        public final android.widget.TextView AEQbTJ;
        public final android.widget.ImageView EZpvd;
        public final android.widget.TextView KWHzl;
        public final /* synthetic */ C57664ymg OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView KWHzl() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C57664ymg c57664ymg, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.OLrzqt = c57664ymg;
            android.view.View viewFindViewById = view.findViewById(C32113mPz.FragmentManager.OBJEWx);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.AEQbTJ = (android.widget.TextView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C32113mPz.FragmentManager.AuCTelauCTel);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.EZpvd = (android.widget.ImageView) viewFindViewById2;
            android.view.View viewFindViewById3 = view.findViewById(C32113mPz.FragmentManager.QSBOWP);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.KWHzl = (android.widget.TextView) viewFindViewById3;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ymg */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setOnDismissListener$default(C57664ymg c57664ymg, Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOnDismissListener");
        }
        if ((i & 1) != 0) {
            function0 = null;
        }
        c57664ymg.KWHzl((Function0<Unit>) function0);
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
