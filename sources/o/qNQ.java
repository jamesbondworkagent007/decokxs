package o;

import com.google.android.material.tabs.TabLayout;
import com.okinc.market.quotation.ui.model.OptionsCategoryGroupVo;
import com.okinc.market.quotation.ui.model.OptionsDirection;
import com.okinc.market.search.features.navigation.options.model.NavSearchOptionsQuotePageVo;
import com.okinc.market.search.features.navigation.result.adapter.binders.NavSearchOptionsSectionBinderKt$setupOptionsFilterSorterView$1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C40239qOm;

/* JADX INFO: loaded from: classes9.dex */
public final class qNQ {
    public static final void KWHzl(C42847reD c42847reD, C40239qOm.ActionBar.Application application) {
        c42847reD.copydefault.fetchVPNInfo();
        for (NavSearchOptionsQuotePageVo navSearchOptionsQuotePageVo : application.copydefault()) {
            TabLayout.Tab tabValues = c42847reD.copydefault.values();
            tabValues.setText(navSearchOptionsQuotePageVo.AEQbTJ());
            c42847reD.copydefault.AEQbTJ(tabValues);
        }
        c42847reD.copydefault.AEQbTJ(application.AEQbTJ());
        c42847reD.copydefault.KWHzl();
        c42847reD.copydefault.copydefault(new ActionBar(c42847reD, application));
    }

    public static final class ActionBar implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ C40239qOm.ActionBar.Application AEQbTJ;
        public final /* synthetic */ C42847reD KWHzl;

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

        public ActionBar(C42847reD c42847reD, C40239qOm.ActionBar.Application application) {
            this.KWHzl = c42847reD;
            this.AEQbTJ = application;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
            android.widget.LinearLayout root = this.KWHzl.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            InterfaceC40230qOd interfaceC40230qOdCopydefault = C40227qOa.copydefault(root);
            if (interfaceC40230qOdCopydefault != null) {
                interfaceC40230qOdCopydefault.KWHzl(null, C40239qOm.ActionBar.Application.copy$default(this.AEQbTJ, false, null, tab.getPosition(), 0, null, null, null, 123, null));
            }
        }
    }

    public static final void AhwBna(C42847reD c42847reD, C40239qOm.ActionBar.Application application) {
        C55244xgL c55244xgL = c42847reD.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55244xgL, "");
        int i = 0;
        c55244xgL.setVisibility(0);
        NavSearchOptionsQuotePageVo navSearchOptionsQuotePageVo = (NavSearchOptionsQuotePageVo) CollectionsKt___CollectionsKt.AkhnZx(application.copydefault(), application.AEQbTJ());
        if (navSearchOptionsQuotePageVo != null) {
            java.util.List<java.lang.String> listKWHzl = navSearchOptionsQuotePageVo.KWHzl();
            while (listKWHzl.size() != c42847reD.EZpvd.AhwBna()) {
                if (c42847reD.EZpvd.AhwBna() < listKWHzl.size()) {
                    C55244xgL c55244xgL2 = c42847reD.EZpvd;
                    c55244xgL2.AEQbTJ(c55244xgL2.values());
                } else {
                    c42847reD.EZpvd.AYXKKw().removeTabAt(c42847reD.EZpvd.AhwBna() - 1);
                }
            }
            for (java.lang.Object obj : listKWHzl) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                java.lang.String str = (java.lang.String) obj;
                TabLayout.Tab tabKWHzl = c42847reD.EZpvd.KWHzl(i);
                if (tabKWHzl != null) {
                    tabKWHzl.setText(str);
                }
                i++;
            }
            c42847reD.EZpvd.AEQbTJ(application.OLrzqt());
            c42847reD.EZpvd.KWHzl();
            c42847reD.EZpvd.copydefault(new Activity(c42847reD, application));
        }
    }

    public static final class Activity implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ C40239qOm.ActionBar.Application EZpvd;
        public final /* synthetic */ C42847reD copydefault;

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

        public Activity(C42847reD c42847reD, C40239qOm.ActionBar.Application application) {
            this.copydefault = c42847reD;
            this.EZpvd = application;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
            android.widget.LinearLayout root = this.copydefault.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            InterfaceC40230qOd interfaceC40230qOdCopydefault = C40227qOa.copydefault(root);
            if (interfaceC40230qOdCopydefault != null) {
                interfaceC40230qOdCopydefault.KWHzl(null, C40239qOm.ActionBar.Application.copy$default(this.EZpvd, false, null, 0, tab.getPosition(), null, null, null, 119, null));
            }
        }
    }

    public static final void EZpvd(final C42847reD c42847reD, final C40239qOm.ActionBar.Application application) {
        NavSearchOptionsQuotePageVo navSearchOptionsQuotePageVo = (NavSearchOptionsQuotePageVo) CollectionsKt___CollectionsKt.AkhnZx(application.copydefault(), application.AEQbTJ());
        OptionsCategoryGroupVo optionsCategoryGroupVoOLrzqt = navSearchOptionsQuotePageVo != null ? navSearchOptionsQuotePageVo.OLrzqt() : null;
        java.util.List<java.lang.String> listKWHzl = navSearchOptionsQuotePageVo != null ? navSearchOptionsQuotePageVo.KWHzl() : null;
        c42847reD.OLrzqt.setStrikeFilterData(new NavSearchOptionsSectionBinderKt$setupOptionsFilterSorterView$1(c42847reD, optionsCategoryGroupVoOLrzqt, listKWHzl != null ? (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(listKWHzl, application.OLrzqt()) : null, null));
        c42847reD.OLrzqt.setListener(new yHO() { // from class: o.qNR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return qNQ.OLrzqt(c42847reD, application, (java.lang.String) obj, (OptionsDirection) obj2, (kotlin.Pair) obj3);
            }
        });
    }

    public static final Unit OLrzqt(C42847reD c42847reD, C40239qOm.ActionBar.Application application, java.lang.String str, OptionsDirection optionsDirection, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(optionsDirection, "");
        Intrinsics.checkNotNullParameter(pair, "");
        android.widget.LinearLayout root = c42847reD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        InterfaceC40230qOd interfaceC40230qOdCopydefault = C40227qOa.copydefault(root);
        if (interfaceC40230qOdCopydefault != null) {
            interfaceC40230qOdCopydefault.KWHzl(null, C40239qOm.ActionBar.Application.copy$default(application, false, null, 0, 0, str, optionsDirection, pair, 15, null));
        }
        return Unit.INSTANCE;
    }
}
