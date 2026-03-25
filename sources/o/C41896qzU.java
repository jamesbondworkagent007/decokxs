package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.market.search.features.kline.formula.model.FormulaSearchData;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C41896qzU;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qzU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41896qzU extends AbstractC39853qAe {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public C39864qAp AEQbTJ;
    public boolean AYXKKw;
    public boolean AhwBna;
    public C42910rfN EZpvd;
    public C39871qAw KWHzl;
    public android.view.View OLrzqt;
    public boolean djBIcL;
    public final int gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC40285qQe
    public int EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC40285qQe
    public void copydefault(@NotNull java.util.Set<? extends BizInstrument> set) {
        Intrinsics.checkNotNullParameter(set, "");
    }

    /* JADX INFO: renamed from: o.qzU$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qzU.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull final yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(yho, "");
            C41896qzU c41896qzU = new C41896qzU();
            jSA.KWHzl(c41896qzU, fragmentManager, "FormulaNavSearchRootFragment", new Function2() { // from class: o.qAb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C41896qzU.Application.AEQbTJ(yho, (java.lang.String) obj, (android.os.Bundle) obj2);
                }
            });
            c41896qzU.show(fragmentManager, "FormulaNavSearchRootFragment");
        }

        public static final Unit AEQbTJ(yHO yho, java.lang.String str, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(bundle, "");
            java.lang.String string = bundle.getString("key.formula_name");
            if (string == null) {
                return Unit.INSTANCE;
            }
            FormulaSearchData formulaSearchData = (FormulaSearchData) BundleCompat.getParcelable(bundle, "key.formula_data", FormulaSearchData.class);
            if (formulaSearchData == null) {
                return Unit.INSTANCE;
            }
            yho.invoke(string, formulaSearchData.getCalcExpression(), formulaSearchData.getInstIdArray());
            return Unit.INSTANCE;
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        final android.view.View viewFindViewById;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.app.Dialog dialog = getDialog();
        if (dialog == null || (viewFindViewById = dialog.findViewById(qZH.StateListAnimator.TarCU)) == null) {
            return;
        }
        ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.qzY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view2, WindowInsetsCompat windowInsetsCompat) {
                return C41896qzU.AEQbTJ(viewFindViewById, view2, windowInsetsCompat);
            }
        });
    }

    public static final WindowInsetsCompat AEQbTJ(android.view.View view, android.view.View view2, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view2, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).bottom);
        return windowInsetsCompat;
    }

    @Override // o.AbstractC40285qQe, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        qSQ root;
        qXN qxn;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C42821rde c42821rdeFetchVPNInfo = super.fetchVPNInfo();
        if (c42821rdeFetchVPNInfo != null && (qxn = c42821rdeFetchVPNInfo.AEQbTJ) != null) {
            qxn.setAutoHideKeyboardEnable(false);
        }
        C42821rde c42821rdeFetchVPNInfo2 = super.fetchVPNInfo();
        if (c42821rdeFetchVPNInfo2 == null || (root = c42821rdeFetchVPNInfo2.getRoot()) == null) {
            return;
        }
        root.setAutoHideKeyboardByScrollingEnable$OKMarket_market_impl(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C39871qAw c39871qAw = this.KWHzl;
        if (c39871qAw != null) {
            c39871qAw.postDelayed(new TaskDescription(), 200L);
        }
    }

    @Override // o.AbstractC40285qQe
    public void KWHzl(@NotNull android.widget.FrameLayout frameLayout) {
        Intrinsics.checkNotNullParameter(frameLayout, "");
        android.content.Context context = frameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C39871qAw c39871qAw = new C39871qAw(context, null, 0, 6, null);
        frameLayout.addView(c39871qAw);
        c39871qAw.setListener(new Activity());
        this.KWHzl = c39871qAw;
        android.view.ViewParent parent = frameLayout.getParent();
        Intrinsics.copydefault(parent, "");
        AEQbTJ((android.view.ViewGroup) parent);
    }

    /* JADX INFO: renamed from: o.qzU$Activity */
    public static final class Activity implements qAJ {
        public Activity() {
        }

        @Override // o.qAJ
        public void OLrzqt(int i) {
            C41896qzU.this.OLrzqt(i);
        }

        @Override // o.qAJ
        public void KWHzl(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C40375qTn.AEQbTJ.KWHzl(C41896qzU.this.getTag(), "Search keyword changed: " + str);
            C41896qzU.this.AEQbTJ(str);
            C41896qzU.this.OLrzqt(str);
            C41896qzU.this.copydefault(str);
        }

        @Override // o.qAJ
        public void EZpvd() {
            C41896qzU.this.OLrzqt();
        }

        @Override // o.qAJ
        public void OLrzqt(java.lang.String str, FormulaSearchData formulaSearchData) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(formulaSearchData, "");
            C41896qzU.this.getParentFragmentManager().setFragmentResult("FormulaNavSearchRootFragment", BundleKt.bundleOf(C56390yDp.OLrzqt("key.formula_name", str), C56390yDp.OLrzqt("key.formula_data", formulaSearchData)));
            C41896qzU.this.dismissAllowingStateLoss();
        }
    }

    /* JADX INFO: renamed from: o.qzU$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C41896qzU AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C41896qzU c41896qzU) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = c41896qzU;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C39871qAw c39871qAw = this.AEQbTJ.KWHzl;
                if (c39871qAw != null) {
                    c39871qAw.OLrzqt();
                }
            }
        }
    }

    public final void AEQbTJ(android.view.ViewGroup viewGroup) {
        qSQ root;
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C39864qAp c39864qAp = new C39864qAp(context, null, 0, 6, null);
        c39864qAp.setId(qZH.StateListAnimator.Dff);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        layoutParams.bottomToBottom = 0;
        c39864qAp.setPaddingRelative(0, 0, 0, C55298xhM.dpInt$default(6, (android.content.Context) null, 1, (java.lang.Object) null));
        c39864qAp.setListener(new ActionBar());
        viewGroup.addView(c39864qAp, layoutParams);
        c39864qAp.setVisibility(8);
        this.AEQbTJ = c39864qAp;
        android.view.View view = new android.view.View(viewGroup.getContext());
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-1, 0);
        layoutParams2.topToTop = qZH.StateListAnimator.DQzvGNdrmXxu;
        layoutParams2.bottomToTop = qZH.StateListAnimator.Dff;
        Unit unit = Unit.INSTANCE;
        viewGroup.addView(view, layoutParams2);
        C42821rde c42821rdeFetchVPNInfo = fetchVPNInfo();
        if (c42821rdeFetchVPNInfo != null && (root = c42821rdeFetchVPNInfo.getRoot()) != null) {
            root.setNestedFindingIgnoreViews$OKMarket_market_impl(view);
        }
        this.OLrzqt = view;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewCompat.setOnApplyWindowInsetsListener(activity.getWindow().getDecorView(), new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.qAa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(android.view.View view2, WindowInsetsCompat windowInsetsCompat) {
                    return C41896qzU.OLrzqt(this.KWHzl, view2, windowInsetsCompat);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.qzU$ActionBar */
    public static final class ActionBar implements InterfaceC39865qAq {
        public ActionBar() {
        }

        @Override // o.InterfaceC39865qAq
        public void EZpvd(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C39871qAw c39871qAw = C41896qzU.this.KWHzl;
            if (c39871qAw != null) {
                c39871qAw.copydefault(str);
            }
        }

        @Override // o.InterfaceC39865qAq
        public void AEQbTJ() {
            C39871qAw c39871qAw = C41896qzU.this.KWHzl;
            if (c39871qAw != null) {
                c39871qAw.EZpvd(false);
            }
        }
    }

    public static final WindowInsetsCompat OLrzqt(C41896qzU c41896qzU, android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        int i = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()).bottom - windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).bottom;
        C39864qAp c39864qAp = c41896qzU.AEQbTJ;
        if (c39864qAp != null) {
            ViewGroup.LayoutParams layoutParams = c39864qAp.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = i;
                c39864qAp.setLayoutParams(layoutParams2);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        boolean z = i > 0;
        c41896qzU.djBIcL = z;
        C39864qAp c39864qAp2 = c41896qzU.AEQbTJ;
        if (c39864qAp2 != null) {
            c39864qAp2.setVisibility(z ? 0 : 8);
        }
        if (c41896qzU.AhwBna && !c41896qzU.AYXKKw && c41896qzU.djBIcL) {
            c41896qzU.KWHzl();
        }
        return WindowInsetsCompat.CONSUMED;
    }

    @Override // o.AbstractC40285qQe
    public void EZpvd(@NotNull android.widget.FrameLayout frameLayout) {
        C52794wYp c52794wYp;
        Intrinsics.checkNotNullParameter(frameLayout, "");
        this.EZpvd = C42910rfN.OLrzqt(getLayoutInflater(), frameLayout, true);
        OLrzqt(0);
        C42910rfN c42910rfN = this.EZpvd;
        if (c42910rfN == null || (c52794wYp = c42910rfN.KWHzl) == null) {
            return;
        }
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
    }

    public final void OLrzqt(int i) {
        android.widget.TextView textView;
        C42910rfN c42910rfN = this.EZpvd;
        if (c42910rfN == null || (textView = c42910rfN.OLrzqt) == null) {
            return;
        }
        textView.setText(C33069mpW.copydefault(this, qZH.PendingIntent.dlRikr, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, java.lang.Integer.valueOf(i)), C56390yDp.OLrzqt("maxNumber", 10))));
    }

    @Override // o.AbstractC40285qQe
    public void AEQbTJ(kotlin.Pair<? extends BizInstrument, java.lang.Long> pair) {
        BizInstrument first;
        super.AEQbTJ(pair);
        C39871qAw c39871qAw = this.KWHzl;
        if (c39871qAw == null || pair == null || (first = pair.getFirst()) == null) {
            return;
        }
        c39871qAw.AEQbTJ(first);
    }

    public final void OLrzqt() {
        if (this.AYXKKw) {
            return;
        }
        this.AhwBna = true;
        if (this.djBIcL) {
            KWHzl();
            return;
        }
        C39871qAw c39871qAw = this.KWHzl;
        if (c39871qAw != null) {
            c39871qAw.EZpvd(true);
        }
    }

    public final void KWHzl() {
        android.view.View viewAEQbTJ;
        C52794wYp c52794wYp;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.AYXKKw = true;
            C39851qAc c39851qAc = C39851qAc.KWHzl;
            android.view.View view = this.OLrzqt;
            if (view == null) {
                this.AYXKKw = false;
                C40375qTn.AEQbTJ.copydefault("FormulaNavSearchRootFragment", "Anchor view is null, cannot show tutorial");
            } else {
                C39864qAp c39864qAp = this.AEQbTJ;
                if (c39864qAp == null || (viewAEQbTJ = c39864qAp.AEQbTJ()) == null) {
                    this.AYXKKw = false;
                    C40375qTn.AEQbTJ.copydefault("FormulaNavSearchRootFragment", "Operator layout is null, cannot show tutorial");
                } else {
                    C42910rfN c42910rfN = this.EZpvd;
                    if (c42910rfN != null && (c52794wYp = c42910rfN.KWHzl) != null) {
                        c39851qAc.AEQbTJ(activity, view, viewAEQbTJ, c52794wYp, new Function1() { // from class: o.qzX
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C41896qzU.KWHzl(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
                            }
                        }, new Function0() { // from class: o.qzZ
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C41896qzU.KWHzl(this.EZpvd);
                            }
                        });
                    } else {
                        this.AYXKKw = false;
                        C40375qTn.AEQbTJ.copydefault("FormulaNavSearchRootFragment", "Confirm button is null, cannot show tutorial");
                    }
                }
            }
        }
        this.AhwBna = false;
    }

    public static final Unit KWHzl(C41896qzU c41896qzU, boolean z) {
        C39871qAw c39871qAw = c41896qzU.KWHzl;
        if (c39871qAw != null) {
            c39871qAw.EZpvd(z);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C41896qzU c41896qzU) {
        C39871qAw c39871qAw = c41896qzU.KWHzl;
        if (c39871qAw != null) {
            c39871qAw.EZpvd(true);
        }
        c41896qzU.AYXKKw = false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.qzU$TaskDescription */
    public static final class TaskDescription implements java.lang.Runnable {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C39871qAw c39871qAw = C41896qzU.this.KWHzl;
            if (c39871qAw != null) {
                c39871qAw.EZpvd(true);
            }
        }
    }
}
