package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import com.okinc.market.quotation.ui.model.OptionsCategoryGroupVo;
import com.okinc.market.quotation.ui.model.OptionsDirection;
import com.okinc.market.search.features.navigation.options.model.NavSearchOptionsQuotePageVo;
import com.okinc.market.search.features.navigation.result.adapter.binders.NavSearchDerivativesSectionBinder$setupOptionsFilterSorterView$1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C40239qOm;
import o.qZH;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qNH extends AbstractC40510qYn<C40239qOm, C42893rex> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C42893rex AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42893rex c42893rexOLrzqt = C42893rex.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42893rexOLrzqt, "");
        return c42893rexOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    public void AEQbTJ(@NotNull C42893rex c42893rex, int i, @NotNull C40239qOm c40239qOm) {
        C40239qOm.ActionBar actionBarEZpvd;
        Intrinsics.checkNotNullParameter(c42893rex, "");
        Intrinsics.checkNotNullParameter(c40239qOm, "");
        c42893rex.gEmmrt.setText(qZH.PendingIntent.getPriority);
        C40239qOm.ActionBar.C0923ActionBar c0923ActionBarOLrzqt = c40239qOm.OLrzqt();
        if (c0923ActionBarOLrzqt != null && c0923ActionBarOLrzqt.KWHzl()) {
            actionBarEZpvd = c40239qOm.OLrzqt();
        } else {
            C40239qOm.ActionBar.Application applicationEZpvd = c40239qOm.EZpvd();
            actionBarEZpvd = (applicationEZpvd == null || !applicationEZpvd.KWHzl()) ? null : c40239qOm.EZpvd();
        }
        C40239qOm.ActionBar actionBar = actionBarEZpvd;
        android.widget.TextView textView = c42893rex.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(c40239qOm.OLrzqt() != null ? 0 : 8);
        android.widget.TextView textView2 = c42893rex.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(c40239qOm.EZpvd() != null ? 0 : 8);
        android.widget.TextView textView3 = c42893rex.djBIcL;
        textView3.setOnClickListener(new StateListAnimator(textView3, 1000L, c42893rex, c40239qOm));
        android.widget.TextView textView4 = c42893rex.AYXKKw;
        textView4.setOnClickListener(new TaskDescription(textView4, 1000L, c42893rex, c40239qOm));
        if (actionBar instanceof C40239qOm.ActionBar.C0923ActionBar) {
            ConstraintLayout root = c42893rex.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            root.setVisibility(0);
            c42893rex.djBIcL.setSelected(true);
            c42893rex.AYXKKw.setSelected(false);
            C55244xgL c55244xgL = c42893rex.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55244xgL, "");
            c55244xgL.setVisibility(8);
            C55244xgL c55244xgL2 = c42893rex.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55244xgL2, "");
            c55244xgL2.setVisibility(8);
            qSV qsv = c42893rex.EZpvd;
            Intrinsics.checkNotNullExpressionValue(qsv, "");
            qsv.setVisibility(8);
            return;
        }
        if (actionBar instanceof C40239qOm.ActionBar.Application) {
            ConstraintLayout root2 = c42893rex.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "");
            root2.setVisibility(0);
            c42893rex.djBIcL.setSelected(false);
            c42893rex.AYXKKw.setSelected(true);
            C55244xgL c55244xgL3 = c42893rex.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55244xgL3, "");
            C40239qOm.ActionBar.Application application = (C40239qOm.ActionBar.Application) actionBar;
            c55244xgL3.setVisibility(application.copydefault().size() > 1 ? 0 : 8);
            qSV qsv2 = c42893rex.EZpvd;
            Intrinsics.checkNotNullExpressionValue(qsv2, "");
            qsv2.setVisibility(0);
            C55244xgL c55244xgL4 = c42893rex.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55244xgL4, "");
            if (c55244xgL4.getVisibility() == 0) {
                AEQbTJ(c42893rex, c40239qOm, application);
            }
            OLrzqt(c42893rex, c40239qOm, application);
            KWHzl(c42893rex, c40239qOm, application);
            return;
        }
        ConstraintLayout root3 = c42893rex.getRoot();
        Intrinsics.checkNotNullExpressionValue(root3, "");
        root3.setVisibility(8);
    }

    public final void AEQbTJ(C42893rex c42893rex, C40239qOm c40239qOm, C40239qOm.ActionBar.Application application) {
        c42893rex.AEQbTJ.fetchVPNInfo();
        for (NavSearchOptionsQuotePageVo navSearchOptionsQuotePageVo : application.copydefault()) {
            TabLayout.Tab tabValues = c42893rex.AEQbTJ.values();
            tabValues.setText(navSearchOptionsQuotePageVo.AEQbTJ());
            c42893rex.AEQbTJ.AEQbTJ(tabValues);
        }
        c42893rex.AEQbTJ.AEQbTJ(application.AEQbTJ());
        c42893rex.AEQbTJ.KWHzl();
        c42893rex.AEQbTJ.copydefault(new Activity(c42893rex, c40239qOm));
    }

    public static final class Activity implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ C42893rex EZpvd;
        public final /* synthetic */ C40239qOm KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
        }

        public Activity(C42893rex c42893rex, C40239qOm c40239qOm) {
            this.EZpvd = c42893rex;
            this.KWHzl = c40239qOm;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
            ConstraintLayout root = this.EZpvd.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            InterfaceC40230qOd interfaceC40230qOdCopydefault = C40227qOa.copydefault(root);
            if (interfaceC40230qOdCopydefault != null) {
                C40239qOm.ActionBar.C0923ActionBar c0923ActionBarOLrzqt = this.KWHzl.OLrzqt();
                C40239qOm.ActionBar.Application applicationEZpvd = this.KWHzl.EZpvd();
                interfaceC40230qOdCopydefault.KWHzl(c0923ActionBarOLrzqt, applicationEZpvd != null ? C40239qOm.ActionBar.Application.copy$default(applicationEZpvd, false, null, tab.getPosition(), 0, null, null, null, 123, null) : null);
            }
        }
    }

    public final void OLrzqt(C42893rex c42893rex, C40239qOm c40239qOm, C40239qOm.ActionBar.Application application) {
        C55244xgL c55244xgL = c42893rex.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55244xgL, "");
        int i = 0;
        c55244xgL.setVisibility(0);
        NavSearchOptionsQuotePageVo navSearchOptionsQuotePageVo = (NavSearchOptionsQuotePageVo) CollectionsKt___CollectionsKt.AkhnZx(application.copydefault(), application.AEQbTJ());
        if (navSearchOptionsQuotePageVo != null) {
            java.util.List<java.lang.String> listKWHzl = navSearchOptionsQuotePageVo.KWHzl();
            while (listKWHzl.size() != c42893rex.KWHzl.AhwBna()) {
                if (c42893rex.KWHzl.AhwBna() < listKWHzl.size()) {
                    C55244xgL c55244xgL2 = c42893rex.KWHzl;
                    c55244xgL2.AEQbTJ(c55244xgL2.values());
                } else {
                    c42893rex.KWHzl.AYXKKw().removeTabAt(c42893rex.KWHzl.AhwBna() - 1);
                }
            }
            for (java.lang.Object obj : listKWHzl) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                java.lang.String str = (java.lang.String) obj;
                TabLayout.Tab tabKWHzl = c42893rex.KWHzl.KWHzl(i);
                if (tabKWHzl != null) {
                    tabKWHzl.setText(str);
                }
                i++;
            }
            c42893rex.KWHzl.AEQbTJ(application.OLrzqt());
            c42893rex.KWHzl.KWHzl();
            c42893rex.KWHzl.copydefault(new ActionBar(c42893rex, c40239qOm));
            AppCompatTextView appCompatTextView = c42893rex.AhwBna;
            appCompatTextView.setOnClickListener(new Application(appCompatTextView, 1000L, c42893rex, navSearchOptionsQuotePageVo));
        }
    }

    public static final class ActionBar implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ C40239qOm KWHzl;
        public final /* synthetic */ C42893rex OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
        }

        public ActionBar(C42893rex c42893rex, C40239qOm c40239qOm) {
            this.OLrzqt = c42893rex;
            this.KWHzl = c40239qOm;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
            ConstraintLayout root = this.OLrzqt.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            InterfaceC40230qOd interfaceC40230qOdCopydefault = C40227qOa.copydefault(root);
            if (interfaceC40230qOdCopydefault != null) {
                C40239qOm.ActionBar.C0923ActionBar c0923ActionBarOLrzqt = this.KWHzl.OLrzqt();
                C40239qOm.ActionBar.Application applicationEZpvd = this.KWHzl.EZpvd();
                interfaceC40230qOdCopydefault.KWHzl(c0923ActionBarOLrzqt, applicationEZpvd != null ? C40239qOm.ActionBar.Application.copy$default(applicationEZpvd, false, null, 0, tab.getPosition(), null, null, null, 119, null) : null);
            }
        }
    }

    public final void KWHzl(final C42893rex c42893rex, final C40239qOm c40239qOm, C40239qOm.ActionBar.Application application) {
        NavSearchOptionsQuotePageVo navSearchOptionsQuotePageVo = (NavSearchOptionsQuotePageVo) CollectionsKt___CollectionsKt.AkhnZx(application.copydefault(), application.AEQbTJ());
        OptionsCategoryGroupVo optionsCategoryGroupVoOLrzqt = navSearchOptionsQuotePageVo != null ? navSearchOptionsQuotePageVo.OLrzqt() : null;
        java.util.List<java.lang.String> listKWHzl = navSearchOptionsQuotePageVo != null ? navSearchOptionsQuotePageVo.KWHzl() : null;
        c42893rex.EZpvd.setStrikeFilterData(new NavSearchDerivativesSectionBinder$setupOptionsFilterSorterView$1(c42893rex, optionsCategoryGroupVoOLrzqt, listKWHzl != null ? (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(listKWHzl, application.OLrzqt()) : null, null));
        c42893rex.EZpvd.setListener(new yHO() { // from class: o.qNF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return qNH.KWHzl(c42893rex, c40239qOm, (java.lang.String) obj, (OptionsDirection) obj2, (kotlin.Pair) obj3);
            }
        });
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ NavSearchOptionsQuotePageVo AEQbTJ;
        public final /* synthetic */ C42893rex EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C42893rex c42893rex, NavSearchOptionsQuotePageVo navSearchOptionsQuotePageVo) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = c42893rex;
            this.AEQbTJ = navSearchOptionsQuotePageVo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                ConstraintLayout root = this.EZpvd.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                qPL qplAEQbTJ = qPS.AEQbTJ(root);
                if (qplAEQbTJ != null) {
                    android.content.Context context = this.EZpvd.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    qplAEQbTJ.OLrzqt(context, C44585sZg.AEQbTJ(this.AEQbTJ.OLrzqt().AEQbTJ()));
                }
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C40239qOm KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C42893rex copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C42893rex c42893rex, C40239qOm c40239qOm) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = c42893rex;
            this.KWHzl = c40239qOm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                ConstraintLayout root = this.copydefault.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                InterfaceC40230qOd interfaceC40230qOdCopydefault = C40227qOa.copydefault(root);
                if (interfaceC40230qOdCopydefault != null) {
                    C40239qOm.ActionBar.C0923ActionBar c0923ActionBarOLrzqt = this.KWHzl.OLrzqt();
                    C40239qOm.ActionBar.C0923ActionBar c0923ActionBarKWHzl = c0923ActionBarOLrzqt != null ? c0923ActionBarOLrzqt.KWHzl(true) : null;
                    C40239qOm.ActionBar.Application applicationEZpvd = this.KWHzl.EZpvd();
                    interfaceC40230qOdCopydefault.KWHzl(c0923ActionBarKWHzl, applicationEZpvd != null ? C40239qOm.ActionBar.Application.copy$default(applicationEZpvd, false, null, 0, 0, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null) : null);
                }
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C40239qOm OLrzqt;
        public final /* synthetic */ C42893rex copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C42893rex c42893rex, C40239qOm c40239qOm) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = c42893rex;
            this.OLrzqt = c40239qOm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ConstraintLayout root = this.copydefault.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                InterfaceC40230qOd interfaceC40230qOdCopydefault = C40227qOa.copydefault(root);
                if (interfaceC40230qOdCopydefault != null) {
                    C40239qOm.ActionBar.C0923ActionBar c0923ActionBarOLrzqt = this.OLrzqt.OLrzqt();
                    C40239qOm.ActionBar.C0923ActionBar c0923ActionBarKWHzl = c0923ActionBarOLrzqt != null ? c0923ActionBarOLrzqt.KWHzl(false) : null;
                    C40239qOm.ActionBar.Application applicationEZpvd = this.OLrzqt.EZpvd();
                    interfaceC40230qOdCopydefault.KWHzl(c0923ActionBarKWHzl, applicationEZpvd != null ? C40239qOm.ActionBar.Application.copy$default(applicationEZpvd, true, null, 0, 0, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null) : null);
                }
            }
        }
    }

    public static final Unit KWHzl(C42893rex c42893rex, C40239qOm c40239qOm, java.lang.String str, OptionsDirection optionsDirection, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(optionsDirection, "");
        Intrinsics.checkNotNullParameter(pair, "");
        ConstraintLayout root = c42893rex.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        InterfaceC40230qOd interfaceC40230qOdCopydefault = C40227qOa.copydefault(root);
        if (interfaceC40230qOdCopydefault != null) {
            C40239qOm.ActionBar.C0923ActionBar c0923ActionBarOLrzqt = c40239qOm.OLrzqt();
            C40239qOm.ActionBar.Application applicationEZpvd = c40239qOm.EZpvd();
            interfaceC40230qOdCopydefault.KWHzl(c0923ActionBarOLrzqt, applicationEZpvd != null ? C40239qOm.ActionBar.Application.copy$default(applicationEZpvd, false, null, 0, 0, str, optionsDirection, pair, 15, null) : null);
        }
        return Unit.INSTANCE;
    }
}
