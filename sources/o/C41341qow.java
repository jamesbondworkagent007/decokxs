package o;

import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.market.discover.features.root.DiscoverSubPage;
import com.okinc.market.time.filter.PeriodEnum;
import com.okinc.rxutils.RxBus;
import com.okinc.unify_trade.biz.DexInstrument;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C32113mPz;
import o.C52761wXj;
import o.C6814aWV;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qow, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C41341qow extends AbstractC41342qox implements InterfaceC38466pZv {
    public C42768rce DbNXlk;
    public TabLayoutMediator fetchVPNInfo;
    public final /* synthetic */ C38447pZc AYXKKw = new C38447pZc();
    public boolean AkhnZx = true;
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.qoB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C41341qow.AEQbTJ(this.OLrzqt);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC38466pZv
    public void AEQbTJ() {
        this.AYXKKw.AEQbTJ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.AYXKKw.OLrzqt(fragment);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC38466pZv
    public void AEQbTJ(@NotNull TradeCoinInfo tradeCoinInfo, int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(tradeCoinInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw.AEQbTJ(tradeCoinInfo, i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC38466pZv
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AYXKKw.AEQbTJ(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC38466pZv
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AYXKKw.AEQbTJ(str, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC38466pZv
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.AYXKKw.AEQbTJ(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC38466pZv
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, java.lang.String str6, PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.AYXKKw.AEQbTJ(str, str2, str3, str4, str5, str6, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC38466pZv
    public void AEQbTJ(boolean z) {
        this.AYXKKw.AEQbTJ(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AhwBna() {
        this.AYXKKw.KWHzl();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC38466pZv
    public void EZpvd() {
        this.AYXKKw.EZpvd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC38466pZv
    public void EZpvd(@NotNull DexInstrument dexInstrument, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw.EZpvd(dexInstrument, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC38466pZv
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw.KWHzl(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC38466pZv
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.AYXKKw.KWHzl(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC38466pZv
    public java.lang.Object OLrzqt(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull Continuation<? super Unit> continuation) {
        return this.AYXKKw.OLrzqt(str, str2, str3, z, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC38466pZv
    public void OLrzqt() {
        this.AYXKKw.OLrzqt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC38466pZv
    public void copydefault(@NotNull DexInstrument dexInstrument, int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AYXKKw.copydefault(dexInstrument, i, str, str2, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC38466pZv
    public void copydefault(@NotNull DexInstrument dexInstrument, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AYXKKw.copydefault(dexInstrument, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC38466pZv
    public void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw.copydefault(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC38466pZv
    public void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.AYXKKw.copydefault(str, str2, i, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.DGUQLIDGUQLI;
    }

    public static final C41302qoJ AEQbTJ(C41341qow c41341qow) {
        return new C41302qoJ(c41341qow);
    }

    public final C41302qoJ djBIcL() {
        return (C41302qoJ) this.djBIcL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C46688tbr.registerTradeFragmentTrack$default(C46688tbr.KWHzl, this, "MarketDiscoverRootFragment", new kotlin.Pair[0], null, 4, null);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        TabLayout tabLayout;
        Intrinsics.checkNotNullParameter(view, "");
        C42768rce c42768rceEZpvd = C42768rce.EZpvd(view);
        Intrinsics.copydefault(c42768rceEZpvd);
        AEQbTJ(c42768rceEZpvd);
        this.DbNXlk = c42768rceEZpvd;
        jSA.OLrzqt(this, true);
        C42768rce c42768rce = this.DbNXlk;
        if (c42768rce == null || (tabLayout = c42768rce.AYXKKw) == null) {
            return;
        }
        EZpvd(C33129mqd.gEmmrt(djBIcL().AEQbTJ(tabLayout.getSelectedTabPosition())));
    }

    public final void AEQbTJ(C42768rce c42768rce) {
        c42768rce.valueOf.setAdapter(djBIcL());
        c42768rce.valueOf.registerOnPageChangeCallback(new Activity());
        c42768rce.valueOf.setCurrentItem(C41306qoN.copydefault.DbNXlk(), false);
        if (C27563jxZ.OLrzqt.fetchVPNInfo()) {
            android.view.View view = c42768rce.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(8);
        }
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(c42768rce.AYXKKw, c42768rce.valueOf, true, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.qoE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                C41341qow.OLrzqt(this.KWHzl, tab, i);
            }
        });
        tabLayoutMediator.attach();
        this.fetchVPNInfo = tabLayoutMediator;
        TabLayout tabLayout = c42768rce.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(tabLayout, "");
        AEQbTJ(tabLayout);
        c42768rce.AYXKKw.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new StateListAnimator());
        C38420pYc c38420pYc = c42768rce.copydefault;
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        int iEZpvd = djBIcL().EZpvd(DiscoverSubPage.FEED);
        ViewPager2 viewPager2 = c42768rce.valueOf;
        Intrinsics.checkNotNullExpressionValue(viewPager2, "");
        c38420pYc.setupDiscoverRootViewPagerScrollListener$OKMarket_market_impl(lifecycle, iEZpvd, viewPager2);
        OLrzqt(c42768rce, djBIcL());
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.qow$Activity */
    public static final class Activity extends ViewPager2.OnPageChangeCallback {
        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            C41306qoN.copydefault.copydefault(i);
        }
    }

    public static final void OLrzqt(C41341qow c41341qow, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        DiscoverSubPage discoverSubPageAhwBna = c41341qow.djBIcL().AhwBna(i);
        Intrinsics.copydefault(discoverSubPageAhwBna, "");
        java.lang.CharSequence charSequenceAEQbTJ = c41341qow.djBIcL().AEQbTJ(i);
        tab.setText(charSequenceAEQbTJ);
        tab.setTag(charSequenceAEQbTJ);
        tab.setContentDescription(discoverSubPageAhwBna.getContentDescriptionId());
    }

    /* JADX INFO: renamed from: o.qow$StateListAnimator */
    public static final class StateListAnimator implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        public StateListAnimator() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            InterfaceC38466pZv interfaceC38466pZvCopydefault = C38470pZz.copydefault(C41341qow.this);
            if (interfaceC38466pZvCopydefault != null) {
                interfaceC38466pZvCopydefault.AEQbTJ(C41341qow.this.djBIcL().EZpvd(tab != null ? tab.getPosition() : 0).toString(), "", "", "tab");
            }
            C41341qow c41341qow = C41341qow.this;
            java.lang.Object tag = tab != null ? tab.getTag() : null;
            c41341qow.EZpvd(tag instanceof java.lang.String ? (java.lang.String) tag : null);
            C41341qow.this.copydefault(tab, true);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            C41341qow.this.copydefault(tab, false);
        }
    }

    public void OLrzqt(@NotNull C42768rce c42768rce, @NotNull C41302qoJ c41302qoJ) {
        Intrinsics.checkNotNullParameter(c42768rce, "");
        Intrinsics.checkNotNullParameter(c41302qoJ, "");
        c41302qoJ.OLrzqt(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(yDV.gHZMYf(DiscoverSubPage.values())));
    }

    @Override // o.AbstractC41342qox, androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        AEQbTJ((androidx.fragment.app.Fragment) this);
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
    }

    public final void EZpvd(java.lang.String str) {
        FragmentContainerView fragmentContainerView;
        qBX qbx;
        C42768rce c42768rce = this.DbNXlk;
        if (c42768rce == null || (fragmentContainerView = c42768rce.AEQbTJ) == null || (qbx = (qBX) fragmentContainerView.getFragment()) == null) {
            return;
        }
        qbx.AEQbTJ(str);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.AkhnZx) {
            AbstractC58185ywX abstractC58185ywXAEQbTJ = RxBus.AEQbTJ(C6814aWV.class, "");
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
            C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this).subscribe(new RxBus.EventCallback<C6814aWV>() { // from class: com.okinc.market.discover.features.root.MarketDiscoverRootFragment$onResume$1
                {
                    super(this.this$0);
                }

                /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
                @Override // com.okinc.rxutils.RxBus.EventCallback
                public void onEvent(C6814aWV c6814aWV) {
                    Intrinsics.checkNotNullParameter(c6814aWV, "");
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.this$0), null, null, new MarketDiscoverRootFragment$onResume$1$onEvent$1(this.this$0, c6814aWV, null), 3, null);
                }

                @Override // com.okinc.rxutils.BaseSubscriber, o.InterfaceC60097zve
                public void onComplete() {
                    super.onComplete();
                    this.this$0.AkhnZx = true;
                }

                @Override // com.okinc.rxutils.BaseSubscriber, o.InterfaceC58217yxC
                public void dispose() {
                    super.dispose();
                    this.this$0.AkhnZx = true;
                }
            });
            this.AkhnZx = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        AhwBna();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void copydefault(C6814aWV c6814aWV) {
        ViewPager2 viewPager2;
        ViewPager2 viewPager22;
        java.lang.String strEZpvd = c6814aWV.EZpvd();
        switch (strEZpvd.hashCode()) {
            case -1844697638:
                if (!strEZpvd.equals("main/market/dex")) {
                    return;
                }
                break;
            case -1844695842:
                if (!strEZpvd.equals("main/market/fav")) {
                    return;
                }
                break;
            case -1350594657:
                if (!strEZpvd.equals("main/market/spot")) {
                    return;
                }
                break;
            case -1350588368:
                if (!strEZpvd.equals("main/market/swap")) {
                    return;
                }
                break;
            case -1208749792:
                if (!strEZpvd.equals("main/market/future")) {
                    return;
                }
                break;
            case -955716654:
                if (!strEZpvd.equals("main/market/option")) {
                    return;
                }
                break;
            case 505812346:
                if (strEZpvd.equals("main/market/opportunities/feeds")) {
                    RxBus.AEQbTJ(C6814aWV.class);
                    C42768rce c42768rce = this.DbNXlk;
                    if (c42768rce == null || (viewPager22 = c42768rce.valueOf) == null) {
                        return;
                    }
                    viewPager22.setCurrentItem(DiscoverSubPage.FEED.ordinal());
                    return;
                }
                return;
            default:
                return;
        }
        RxBus.AEQbTJ(C6814aWV.class);
        C42768rce c42768rce2 = this.DbNXlk;
        if (c42768rce2 == null || (viewPager2 = c42768rce2.valueOf) == null) {
            return;
        }
        viewPager2.setCurrentItem(DiscoverSubPage.MARKETS.ordinal());
    }

    public final void AEQbTJ(final TabLayout tabLayout) {
        tabLayout.post(new java.lang.Runnable() { // from class: o.qoA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C41341qow.AEQbTJ(tabLayout, this);
            }
        });
    }

    public static final void AEQbTJ(TabLayout tabLayout, C41341qow c41341qow) {
        int tabCount = tabLayout.getTabCount();
        int i = 0;
        while (i < tabCount) {
            TabLayout.Tab tabAt = tabLayout.getTabAt(i);
            if (tabAt != null) {
                c41341qow.copydefault(tabAt, i == tabLayout.getSelectedTabPosition());
            }
            i++;
        }
    }

    public final void copydefault(TabLayout.Tab tab, boolean z) {
        android.widget.TextView textViewAEQbTJ;
        if (tab == null || (textViewAEQbTJ = AEQbTJ(tab)) == null) {
            return;
        }
        if (z) {
            textViewAEQbTJ.setTextAppearance(C52761wXj.LoaderManager.hrNTAI);
            textViewAEQbTJ.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.FQMcgEfQMcgE));
        } else {
            textViewAEQbTJ.setTextAppearance(C32113mPz.Dialog.ORxRYg);
            textViewAEQbTJ.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.zDGrpR));
        }
    }

    public final android.widget.TextView AEQbTJ(TabLayout.Tab tab) {
        TabLayout.TabView tabView = tab.view;
        Intrinsics.checkNotNullExpressionValue(tabView, "");
        int childCount = tabView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = tabView.getChildAt(i);
            if (childAt instanceof android.widget.TextView) {
                return (android.widget.TextView) childAt;
            }
        }
        return null;
    }
}
