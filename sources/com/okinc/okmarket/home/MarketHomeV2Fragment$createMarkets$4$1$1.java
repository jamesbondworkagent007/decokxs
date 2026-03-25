package com.okinc.okmarket.home;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.okmarket.home.MarketHomeV2Fragment$createMarkets$4$1$1;
import com.okinc.okmarket.ui.market.data.UserGroupVo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C33070mpX;
import o.C33129mqd;
import o.C55244xgL;
import o.C56391yDq;
import o.C56442yFn;
import o.qZH;
import o.rVN;
import o.sZU;

/* JADX INFO: loaded from: classes10.dex */
public final class MarketHomeV2Fragment$createMarkets$4$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentStateAdapter $adapter;
    final /* synthetic */ UserGroupVo $currentUserGroupVo;
    final /* synthetic */ Function1<Continuation<? super Unit>, Object> $onTabsCreated;
    final /* synthetic */ C55244xgL $tabs;
    final /* synthetic */ ViewPager2 $vp;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MarketHomeV2Fragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MarketHomeV2Fragment$createMarkets$4$1$1(MarketHomeV2Fragment marketHomeV2Fragment, C55244xgL c55244xgL, ViewPager2 viewPager2, FragmentStateAdapter fragmentStateAdapter, UserGroupVo userGroupVo, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super MarketHomeV2Fragment$createMarkets$4$1$1> continuation) {
        super(2, continuation);
        this.this$0 = marketHomeV2Fragment;
        this.$tabs = c55244xgL;
        this.$vp = viewPager2;
        this.$adapter = fragmentStateAdapter;
        this.$currentUserGroupVo = userGroupVo;
        this.$onTabsCreated = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketHomeV2Fragment$createMarkets$4$1$1(this.this$0, this.$tabs, this.$vp, this.$adapter, this.$currentUserGroupVo, this.$onTabsCreated, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketHomeV2Fragment$createMarkets$4$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MarketHomeV2Fragment marketHomeV2Fragment;
        TabLayoutMediator tabLayoutMediator;
        MarketHomeV2Fragment marketHomeV2Fragment2;
        TabLayoutMediator tabLayoutMediator2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            TabLayoutMediator tabLayoutMediator3 = this.this$0.iwGUEr;
            if (tabLayoutMediator3 != null) {
                tabLayoutMediator3.detach();
            }
            marketHomeV2Fragment = this.this$0;
            TabLayout tabLayoutAYXKKw = this.$tabs.AYXKKw();
            ViewPager2 viewPager2 = this.$vp;
            final FragmentStateAdapter fragmentStateAdapter = this.$adapter;
            final MarketHomeV2Fragment marketHomeV2Fragment3 = this.this$0;
            final UserGroupVo userGroupVo = this.$currentUserGroupVo;
            tabLayoutMediator = new TabLayoutMediator(tabLayoutAYXKKw, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.tas
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i2) {
                    MarketHomeV2Fragment$createMarkets$4$1$1.invokeSuspend$lambda$2(fragmentStateAdapter, marketHomeV2Fragment3, userGroupVo, tab, i2);
                }
            });
            Function1<Continuation<? super Unit>, Object> function1 = this.$onTabsCreated;
            tabLayoutMediator.attach();
            if (function1 != null) {
                this.L$0 = tabLayoutMediator;
                this.L$1 = marketHomeV2Fragment;
                this.label = 1;
                if (function1.invoke(this) == objCopydefault) {
                    return objCopydefault;
                }
                marketHomeV2Fragment2 = marketHomeV2Fragment;
                tabLayoutMediator2 = tabLayoutMediator;
            }
            marketHomeV2Fragment.iwGUEr = tabLayoutMediator;
            rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        marketHomeV2Fragment2 = (MarketHomeV2Fragment) this.L$1;
        tabLayoutMediator2 = (TabLayoutMediator) this.L$0;
        C56391yDq.AEQbTJ(obj);
        marketHomeV2Fragment = marketHomeV2Fragment2;
        tabLayoutMediator = tabLayoutMediator2;
        marketHomeV2Fragment.iwGUEr = tabLayoutMediator;
        rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(FragmentStateAdapter fragmentStateAdapter, MarketHomeV2Fragment marketHomeV2Fragment, UserGroupVo userGroupVo, TabLayout.Tab tab, int i) {
        String strAYXKKw;
        sZU szu = fragmentStateAdapter instanceof sZU ? (sZU) fragmentStateAdapter : null;
        if (szu != null) {
            tab.view.setBackgroundColor(0);
            tab.setTag(Integer.valueOf(szu.KWHzl(i)));
            tab.setContentDescription(szu.AEQbTJ(i));
            if (i == szu.getItemCount() - 1 && C33129mqd.AEQbTJ(Integer.valueOf(i), 0)) {
                tab.setText(szu.EZpvd(i));
                TabLayout.TabView tabView = tab.view;
                Intrinsics.checkNotNullExpressionValue(tabView, "");
                TextView textViewOLrzqt = marketHomeV2Fragment.OLrzqt(tabView);
                if (textViewOLrzqt != null) {
                    Drawable drawableKWHzl = C33070mpX.KWHzl(qZH.Activity.uzCIH);
                    if (drawableKWHzl != null) {
                        drawableKWHzl.setBounds(0, 0, C33070mpX.OLrzqt(qZH.Application.EZpvd), C33070mpX.OLrzqt(qZH.Application.EZpvd));
                        Unit unit = Unit.INSTANCE;
                    } else {
                        drawableKWHzl = null;
                    }
                    textViewOLrzqt.setCompoundDrawables(null, null, drawableKWHzl, null);
                }
            } else if (i == 0) {
                if (userGroupVo != null && !Intrinsics.EZpvd((Object) userGroupVo.getUserGroup().getGroupName(), (Object) "ALL")) {
                    strAYXKKw = marketHomeV2Fragment.EZpvd(userGroupVo.getUserGroup().getTranslatedGroupName());
                } else {
                    strAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.QKVWgx);
                }
                tab.setText(strAYXKKw);
            } else {
                tab.setText(szu.EZpvd(i));
            }
        }
        Intrinsics.copydefault(tab);
        marketHomeV2Fragment.AEQbTJ(tab);
    }
}
