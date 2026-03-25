package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.market.ranking.features.main.ui.RankingSubPage;
import com.okinc.market.ranking.features.main.ui.sub.pager.BaseRankingSubPagerFragment$pagerAdapter$2$1$1;
import com.okinc.market.ranking.features.main.ui.sub.pager.BaseRankingSubPagerFragment$pagerAdapter$2$1$2;
import com.okinc.market.ranking.features.main.ui.sub.pager.BaseRankingSubPagerFragment$setDefaultTabPosition$1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC41702qvm;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qwV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC41738qwV extends AbstractC41741qwY {
    public C42833rdq EZpvd;
    public final int KWHzl = qZH.ActionBar.invokespecialDPHOMC;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.qxb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC41738qwV.copydefault(this.EZpvd);
        }
    });
    public TabLayoutMediator copydefault;

    public abstract RankingSubPage AEQbTJ();

    /* JADX DEBUG: Possible override for method o.qwY.EZpvd()V */
    public abstract androidx.fragment.app.Fragment EZpvd();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C42833rdq OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    public abstract androidx.fragment.app.Fragment gEmmrt();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.KWHzl;
    }

    public final C41679qvP KWHzl() {
        return (C41679qvP) this.OLrzqt.getValue();
    }

    public static final C41679qvP copydefault(AbstractC41738qwV abstractC41738qwV) {
        C41679qvP c41679qvP = new C41679qvP(abstractC41738qwV, abstractC41738qwV.AEQbTJ());
        c41679qvP.AEQbTJ(yDY.gEmmrt(new AbstractC41702qvm.TaskDescription(new BaseRankingSubPagerFragment$pagerAdapter$2$1$1(abstractC41738qwV)), new AbstractC41702qvm.Application(new BaseRankingSubPagerFragment$pagerAdapter$2$1$2(abstractC41738qwV))));
        return c41679qvP;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C42833rdq c42833rdqKWHzl = C42833rdq.KWHzl(view);
        c42833rdqKWHzl.AEQbTJ.setAdapter(KWHzl());
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(c42833rdqKWHzl.KWHzl.AYXKKw(), c42833rdqKWHzl.AEQbTJ, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.qwZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                AbstractC41738qwV.OLrzqt(this.KWHzl, tab, i);
            }
        });
        tabLayoutMediator.attach();
        this.copydefault = tabLayoutMediator;
        c42833rdqKWHzl.KWHzl.copydefault(new ActionBar());
        AYXKKw();
        this.EZpvd = c42833rdqKWHzl;
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void OLrzqt(AbstractC41738qwV abstractC41738qwV, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(abstractC41738qwV.KWHzl().EZpvd(i));
        tab.setContentDescription(abstractC41738qwV.KWHzl().OLrzqt(i));
    }

    /* JADX INFO: renamed from: o.qwV$ActionBar */
    public static final class ActionBar implements TabLayout.OnTabSelectedListener {
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

        public ActionBar() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
            java.lang.String str = tab.getPosition() == 0 ? "spot" : "futures";
            AbstractC41738qwV abstractC41738qwV = AbstractC41738qwV.this;
            InterfaceC41634quX interfaceC41634quXEZpvd = C41701qvl.EZpvd(abstractC41738qwV);
            if (interfaceC41634quXEZpvd != null) {
                interfaceC41634quXEZpvd.OLrzqt(abstractC41738qwV.AEQbTJ().getTrackSubType(), str);
            }
            abstractC41738qwV.OLrzqt(str);
        }
    }

    public final void AYXKKw() {
        android.content.Intent intent;
        FragmentActivity activity = getActivity();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BaseRankingSubPagerFragment$setDefaultTabPosition$1(this, Intrinsics.EZpvd((java.lang.Object) ((activity == null || (intent = activity.getIntent()) == null) ? null : intent.getStringExtra("ranking_biz_type")), (java.lang.Object) "SWAP") ? 1 : 0, null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        ViewPager2 viewPager2;
        TabLayoutMediator tabLayoutMediator = this.copydefault;
        if (tabLayoutMediator != null) {
            tabLayoutMediator.detach();
        }
        C42833rdq c42833rdq = this.EZpvd;
        if (c42833rdq != null && (viewPager2 = c42833rdq.AEQbTJ) != null) {
            viewPager2.setAdapter(null);
        }
        super.onDestroyView();
    }
}
