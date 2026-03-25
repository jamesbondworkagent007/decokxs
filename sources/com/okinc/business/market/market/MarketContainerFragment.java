package com.okinc.business.market.market;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.business.market.market.MarketContainerFragment;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.core.util.format.MatchPattern;
import com.okinc.market.alert.database.MarketAlertDataBase;
import com.okinc.market.common.service.BizMarketService;
import com.okinc.market.search.features.main.root.ui.SearchActivity;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okapm.okqpl.QPLMarker;
import com.okinc.okapm.okqpl.QPLType;
import com.okinc.okuser.data.User;
import com.okinc.rxutils.RxBus;
import com.okinc.rxutils.SubHelper;
import com.okinc.uilab.util.SpanUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC32998moE;
import o.AbstractC33000moG;
import o.AbstractC42536rWm;
import o.AbstractC58185ywX;
import o.C27857kFx;
import o.C27986kKr;
import o.C32866mlf;
import o.C32869mli;
import o.C33024moe;
import o.C33070mpX;
import o.C33485mxO;
import o.C33492mxV;
import o.C33541myR;
import o.C33567myr;
import o.C33570myu;
import o.C33574myy;
import o.C38383pWt;
import o.C38384pWu;
import o.C43035rhg;
import o.C43251rlk;
import o.C43417ror;
import o.C54808xWb;
import o.C55051xce;
import o.C55230xfy;
import o.C55298xhM;
import o.C55608xnE;
import o.C56118xwl;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56403yEb;
import o.C56423yEv;
import o.C56524yIo;
import o.C56548yJl;
import o.C58156yvv;
import o.C6814aWV;
import o.InterfaceC47278tmy;
import o.InterfaceC49317umK;
import o.InterfaceC56387yDm;
import o.kEV;
import o.kFE;
import o.pUU;
import o.pWM;
import o.pWN;
import o.pXK;
import o.qZH;
import o.qZN;
import o.rVN;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public class MarketContainerFragment extends kEV implements pWM {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int valueOf = 8;
    public qZN AkhnZx;
    public Activity gEmmrt;

    @yCM
    public InterfaceC47278tmy userManager;
    public boolean AYXKKw = true;
    public ArrayList<pWN> fetchVPNInfo = C56118xwl.OLrzqt.EZpvd();
    public final Object values = new Object();
    public boolean DbNXlk = true;
    public final BizMarketService djBIcL = (BizMarketService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizMarketService.class));
    public final InterfaceC56387yDm fARcdN = C56392yDr.copydefault(new Function0() { // from class: o.kFf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return MarketContainerFragment.AkhnZx();
        }
    });
    public String ejfBZ = "Watchlist";
    public final int isConnected = qZH.ActionBar.values;
    public Function0<Unit> AhwBna = new Function0() { // from class: o.kFj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return MarketContainerFragment.AhwBna();
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AhwBna = function0;
    }

    @Override // o.pWM
    public void OLrzqt(boolean z) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(String str) {
        this.ejfBZ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.isConnected;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    public final InterfaceC47278tmy isConnected() {
        InterfaceC47278tmy interfaceC47278tmy = this.userManager;
        if (interfaceC47278tmy != null) {
            return interfaceC47278tmy;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.market.MarketContainerFragment.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C38383pWt fetchVPNInfo() {
        return (C38383pWt) this.fARcdN.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C38383pWt AkhnZx() {
        return new C38383pWt(C38384pWu.Companion.copydefault(MarketAlertDataBase.Companion.EZpvd()));
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        ViewPager viewPager;
        C55230xfy c55230xfy;
        C33541myR c33541myR;
        C33541myR c33541myR2;
        ViewPager viewPager2;
        C33541myR c33541myR3;
        Intrinsics.checkNotNullParameter(view, "");
        this.AkhnZx = qZN.AEQbTJ(view);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Activity activity = new Activity(this, childFragmentManager, this, this.fetchVPNInfo);
        this.gEmmrt = activity;
        Activity.updateTabList$default(activity, null, 1, null);
        EZpvd();
        qZN qzn = this.AkhnZx;
        if (qzn != null && (c33541myR3 = qzn.KWHzl) != null) {
            c33541myR3.setItemLayout(qZH.ActionBar.Dap);
        }
        qZN qzn2 = this.AkhnZx;
        if (qzn2 != null && (viewPager2 = qzn2.copydefault) != null) {
            viewPager2.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(qzn2 != null ? qzn2.KWHzl : null));
        }
        ArrayList<pWN> arrayListAEQbTJ = C56118xwl.OLrzqt.AEQbTJ(this.fetchVPNInfo);
        this.fetchVPNInfo = arrayListAEQbTJ;
        qZN qzn3 = this.AkhnZx;
        if (qzn3 != null && (c33541myR2 = qzn3.KWHzl) != null) {
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(arrayListAEQbTJ, 10));
            Iterator<T> it = arrayListAEQbTJ.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((pWN) it.next()).OLrzqt()));
            }
            c33541myR2.setTabs(new ArrayList<>(arrayList), new Function2() { // from class: o.kFw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return MarketContainerFragment.copydefault(this.AEQbTJ, ((java.lang.Integer) obj).intValue(), (android.view.View) obj2);
                }
            }, new Function1() { // from class: o.kFi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketContainerFragment.EZpvd(this.EZpvd, ((java.lang.Integer) obj).intValue());
                }
            }, false);
        }
        qZN qzn4 = this.AkhnZx;
        if (qzn4 != null && (c33541myR = qzn4.KWHzl) != null) {
            c33541myR.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new ActionBar());
        }
        values();
        handleCommunityTab$default(this, false, 1, null);
        qZN qzn5 = this.AkhnZx;
        if (qzn5 != null && (c55230xfy = qzn5.OLrzqt) != null) {
            c55230xfy.setOnClickListener(new View.OnClickListener() { // from class: o.kFk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    MarketContainerFragment.EZpvd(this.copydefault, view2);
                }
            });
        }
        qZN qzn6 = this.AkhnZx;
        if (qzn6 != null && (viewPager = qzn6.copydefault) != null) {
            viewPager.setAdapter(this.gEmmrt);
        }
        rVN.reportFullyDrawn$default((Fragment) this, true, (String) null, 2, (Object) null);
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: o.kFl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                return MarketContainerFragment.AEQbTJ(this.KWHzl);
            }
        });
    }

    public static final Unit copydefault(MarketContainerFragment marketContainerFragment, int i, View view) {
        CharSequence charSequenceDjBIcL;
        Intrinsics.checkNotNullParameter(view, "");
        TextView textView = (TextView) view.findViewById(qZH.StateListAnimator.getNotifyChildrenChangedOptions);
        if (textView != null) {
            textView.setTypeface(C55051xce.OLrzqt.AEQbTJ());
        }
        try {
            Result.Application application = Result.Companion;
            if (textView != null) {
                textView.setTag(marketContainerFragment.fetchVPNInfo.get(i));
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Object tag = textView != null ? textView.getTag() : null;
        if ((tag instanceof pWN) && Intrinsics.EZpvd((Object) ((pWN) tag).AEQbTJ(), (Object) "CHANCE_FIND") && (charSequenceDjBIcL = marketContainerFragment.djBIcL()) != null) {
            textView.setText(charSequenceDjBIcL);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(MarketContainerFragment marketContainerFragment, int i) {
        ViewPager viewPager;
        qZN qzn = marketContainerFragment.AkhnZx;
        if (qzn != null && (viewPager = qzn.copydefault) != null) {
            viewPager.setCurrentItem(i, false);
        }
        try {
            marketContainerFragment.AEQbTJ(i);
            C27986kKr.AEQbTJ.OLrzqt("market_tab_click", C56423yEv.EZpvd(C56390yDp.OLrzqt("isAppDebuggable", marketContainerFragment.fetchVPNInfo.get(i).AEQbTJ())));
        } catch (Exception e) {
            String tag = marketContainerFragment.getTAG();
            e.printStackTrace();
            pUU.copydefault(tag, "handTabClick error: " + Unit.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public ActionBar() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            TabLayout.TabView tabView;
            TextView textView = (tab == null || (tabView = tab.view) == null) ? null : (TextView) tabView.findViewById(qZH.StateListAnimator.getNotifyChildrenChangedOptions);
            Object tag = textView != null ? textView.getTag() : null;
            if ((tag instanceof pWN) && Intrinsics.EZpvd((Object) ((pWN) tag).AEQbTJ(), (Object) "CHANCE_FIND")) {
                if (!SPUtils.getBoolean("Marklet_FEED_USER_VISITED_FEED", false)) {
                    C32866mlf.onEvent$default("Opportunities_Top_RedDot_Click", (TrackChannel[]) null, new Function1() { // from class: o.kFs
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return MarketContainerFragment.ActionBar.EZpvd((EventParamsList) obj);
                        }
                    }, 1, (Object) null);
                }
                SPUtils.put("Marklet_FEED_USER_VISITED_FEED", Boolean.TRUE);
                textView.setText(MarketContainerFragment.this.djBIcL());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit EZpvd(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            return Unit.INSTANCE;
        }
    }

    public static final void EZpvd(MarketContainerFragment marketContainerFragment, View view) {
        qZN qzn;
        ViewPager viewPager;
        Iterator<pWN> it = marketContainerFragment.fetchVPNInfo.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.EZpvd((Object) it.next().AEQbTJ(), (Object) "discover_community")) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0 && (qzn = marketContainerFragment.AkhnZx) != null && (viewPager = qzn.copydefault) != null && i == viewPager.getCurrentItem()) {
            Intent intent = new Intent(marketContainerFragment.getActivity(), (Class<?>) SearchActivity.class);
            intent.putExtra("from", "find_page");
            intent.putExtra("trading_social_trader", "trading_social_trader");
            marketContainerFragment.startActivity(intent);
        } else {
            Intent intent2 = new Intent(marketContainerFragment.getActivity(), (Class<?>) SearchActivity.class);
            intent2.putExtra("from", "find_page");
            marketContainerFragment.startActivity(intent2);
        }
        C32869mli.onNewOKexEventWithParams$default("market_click_search", null, 1, null);
    }

    public static final boolean AEQbTJ(MarketContainerFragment marketContainerFragment) {
        ViewPager viewPager;
        qZN qzn = marketContainerFragment.AkhnZx;
        if (qzn != null && (viewPager = qzn.copydefault) != null) {
            Activity activity = marketContainerFragment.gEmmrt;
            viewPager.setOffscreenPageLimit(C56548yJl.copydefault(3, activity != null ? activity.getCount() : 0));
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C55608xnE.OLrzqt()) {
            return;
        }
        DbNXlk();
    }

    private final void DbNXlk() {
        C33024moe.subscribeOnIO$default(this.djBIcL.getListByInstrument(), (Function1) null, (Function0) null, new Function1() { // from class: o.kFt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MarketContainerFragment.AEQbTJ(this.copydefault, (ResponseData) obj);
            }
        }, 3, (Object) null);
    }

    public final CharSequence djBIcL() {
        String strAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.DarRvM);
        if (SPUtils.getBoolean("Marklet_FEED_USER_VISITED_FEED", false)) {
            return strAYXKKw;
        }
        final Drawable drawableKWHzl = C33070mpX.KWHzl(C43035rhg.ActionBar.OLrzqt);
        if (drawableKWHzl == null) {
            return null;
        }
        return C33574myy.setupSpanStyles$default(strAYXKKw + " ", new String[]{" "}, 0, MatchPattern.LAST_ONLY, false, new Function1() { // from class: o.kFq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MarketContainerFragment.KWHzl(drawableKWHzl, (java.util.List) obj);
            }
        }, 10, null);
    }

    public static final Unit KWHzl(Drawable drawable, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new SpanUtils.Activity(drawable, 3));
        return Unit.INSTANCE;
    }

    public final void values() {
        C33541myR c33541myR;
        C33541myR c33541myR2;
        C33541myR c33541myR3;
        qZN qzn = this.AkhnZx;
        if (((qzn == null || (c33541myR3 = qzn.KWHzl) == null) ? null : c33541myR3.getTabAt(this.fetchVPNInfo.size() - 1)) != null) {
            qZN qzn2 = this.AkhnZx;
            View childAt = (qzn2 == null || (c33541myR2 = qzn2.KWHzl) == null) ? null : c33541myR2.getChildAt(0);
            Intrinsics.copydefault(childAt, "");
            ViewGroup viewGroup = (ViewGroup) childAt;
            qZN qzn3 = this.AkhnZx;
            View childAt2 = viewGroup.getChildAt((qzn3 == null || (c33541myR = qzn3.KWHzl) == null) ? 0 : c33541myR.getTabCount() - 1);
            ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(0, 0, C55298xhM.dp2px$default(16.0f, null, 1, null), 0);
            childAt2.setLayoutParams(marginLayoutParams);
        }
    }

    public void EZpvd(boolean z) {
        C55230xfy c55230xfy;
        C55230xfy c55230xfy2;
        if (z) {
            qZN qzn = this.AkhnZx;
            if (qzn == null || (c55230xfy2 = qzn.OLrzqt) == null) {
                return;
            }
            c55230xfy2.setVisibility(0);
            return;
        }
        qZN qzn2 = this.AkhnZx;
        if (qzn2 == null || (c55230xfy = qzn2.OLrzqt) == null) {
            return;
        }
        c55230xfy.setVisibility(8);
    }

    public void EZpvd() {
        qZN qzn = this.AkhnZx;
        ViewBindingAdapter.setPaddingTop(qzn != null ? qzn.EZpvd : null, C33570myu.OLrzqt());
    }

    public static /* synthetic */ void handleCommunityTab$default(MarketContainerFragment marketContainerFragment, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleCommunityTab");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        marketContainerFragment.AEQbTJ(z);
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        boolean z;
        ViewPager viewPager;
        C33541myR c33541myR;
        C33541myR c33541myR2;
        ViewPager viewPager2;
        ViewPager viewPager3;
        qZN qzn;
        ViewPager viewPager4;
        C33541myR c33541myR3;
        C33541myR c33541myR4;
        ViewPager viewPager5;
        if (isAdded()) {
            int currentItem = 0;
            if (this.DbNXlk) {
                AbstractC58185ywX abstractC58185ywXAEQbTJ = RxBus.AEQbTJ(C6814aWV.class, "");
                Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
                C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this).subscribe(new RxBus.EventCallback<C6814aWV>(this.values) { // from class: com.okinc.business.market.market.MarketContainerFragment.onVisible.1
                    /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
                    @Override // com.okinc.rxutils.RxBus.EventCallback
                    public void onEvent(C6814aWV c6814aWV) {
                        Intrinsics.checkNotNullParameter(c6814aWV, "");
                        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(MarketContainerFragment.this), null, null, new MarketContainerFragment$onVisible$1$onEvent$1(MarketContainerFragment.this, c6814aWV, null), 3, null);
                    }

                    @Override // com.okinc.rxutils.BaseSubscriber, o.InterfaceC60097zve
                    public void onComplete() {
                        super.onComplete();
                        MarketContainerFragment.this.DbNXlk = true;
                    }

                    @Override // com.okinc.rxutils.BaseSubscriber, o.InterfaceC58217yxC
                    public void dispose() {
                        super.dispose();
                        MarketContainerFragment.this.DbNXlk = true;
                    }
                });
                this.DbNXlk = false;
            }
            C33567myr.AEQbTJ(getActivity(), !C33492mxV.OLrzqt());
            ArrayList<pWN> arrayListEZpvd = C56118xwl.OLrzqt.EZpvd();
            boolean zEZpvd = Intrinsics.EZpvd(arrayListEZpvd, this.fetchVPNInfo);
            if (zEZpvd || arrayListEZpvd.size() != this.fetchVPNInfo.size()) {
                z = false;
            } else {
                int i = 0;
                z = true;
                for (Object obj : arrayListEZpvd) {
                    if (i < 0) {
                        yDY.AYXKKw();
                    }
                    if (!Intrinsics.EZpvd((Object) ((pWN) obj).AEQbTJ(), (Object) this.fetchVPNInfo.get(i).AEQbTJ())) {
                        z = false;
                    }
                    i++;
                }
            }
            if (zEZpvd) {
                Activity activity = this.gEmmrt;
                if (activity != null) {
                    activity.notifyDataSetChanged();
                }
            } else if (!z) {
                qZN qzn2 = this.AkhnZx;
                if (qzn2 != null && (viewPager2 = qzn2.copydefault) != null) {
                    viewPager2.removeAllViews();
                }
                this.fetchVPNInfo = arrayListEZpvd;
                Activity activity2 = this.gEmmrt;
                if (activity2 != null) {
                    activity2.EZpvd(arrayListEZpvd);
                }
                qZN qzn3 = this.AkhnZx;
                if (qzn3 != null && (c33541myR2 = qzn3.KWHzl) != null) {
                    c33541myR2.removeAllTabs();
                }
                qZN qzn4 = this.AkhnZx;
                if (qzn4 != null && (c33541myR = qzn4.KWHzl) != null) {
                    ArrayList<pWN> arrayList = this.fetchVPNInfo;
                    ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Integer.valueOf(((pWN) it.next()).OLrzqt()));
                    }
                    C33541myR.setTabs$default(c33541myR, new ArrayList(arrayList2), (Function2) null, new Function1() { // from class: o.kFn
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return MarketContainerFragment.djBIcL(this.copydefault, ((java.lang.Integer) obj2).intValue());
                        }
                    }, false, 2, (Object) null);
                }
                qZN qzn5 = this.AkhnZx;
                if (qzn5 != null && (viewPager = qzn5.copydefault) != null) {
                    viewPager.setAdapter(this.gEmmrt);
                }
                C56118xwl c56118xwl = C56118xwl.OLrzqt;
                InterfaceC49317umK interfaceC49317umK = (InterfaceC49317umK) C43251rlk.OLrzqt(InterfaceC49317umK.class);
                if (c56118xwl.OLrzqt(interfaceC49317umK != null && interfaceC49317umK.AEQbTJ(), this.fetchVPNInfo)) {
                    handleCommunityTab$default(this, false, 1, null);
                }
            } else {
                this.fetchVPNInfo = arrayListEZpvd;
                qZN qzn6 = this.AkhnZx;
                if (qzn6 != null && (c33541myR4 = qzn6.KWHzl) != null) {
                    c33541myR4.removeAllTabs();
                }
                qZN qzn7 = this.AkhnZx;
                if (qzn7 != null && (c33541myR3 = qzn7.KWHzl) != null) {
                    ArrayList<pWN> arrayList3 = this.fetchVPNInfo;
                    ArrayList arrayList4 = new ArrayList(C56403yEb.AYXKKw(arrayList3, 10));
                    Iterator<T> it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(Integer.valueOf(((pWN) it2.next()).OLrzqt()));
                    }
                    C33541myR.setTabs$default(c33541myR3, new ArrayList(arrayList4), (Function2) null, new Function1() { // from class: o.kFp
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return MarketContainerFragment.AEQbTJ(this.AEQbTJ, ((java.lang.Integer) obj2).intValue());
                        }
                    }, false, 2, (Object) null);
                }
                Iterator<pWN> it3 = this.fetchVPNInfo.iterator();
                int i2 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i2 = -1;
                        break;
                    } else if (Intrinsics.EZpvd((Object) it3.next().AEQbTJ(), (Object) "discover_community")) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 >= 0 && (qzn = this.AkhnZx) != null && (viewPager4 = qzn.copydefault) != null && i2 == viewPager4.getCurrentItem()) {
                    AEQbTJ(true);
                } else {
                    AEQbTJ(false);
                }
                qZN qzn8 = this.AkhnZx;
                if (qzn8 != null && (viewPager3 = qzn8.copydefault) != null) {
                    viewPager3.setAdapter(this.gEmmrt);
                }
            }
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: o.kFo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    return MarketContainerFragment.OLrzqt(this.copydefault);
                }
            });
            KWHzl(true);
            valueOf();
            this.AhwBna.invoke();
            if (Intrinsics.EZpvd((Object) this.fetchVPNInfo.get(0).AEQbTJ(), (Object) "Watchlist")) {
                qZN qzn9 = this.AkhnZx;
                if (qzn9 != null && (viewPager5 = qzn9.copydefault) != null) {
                    currentItem = viewPager5.getCurrentItem();
                }
                if (currentItem == -1 || currentItem >= this.fetchVPNInfo.size() || !Intrinsics.EZpvd((Object) this.fetchVPNInfo.get(currentItem).AEQbTJ(), (Object) "Watchlist")) {
                    return;
                }
                C54808xWb.KWHzl();
            }
        }
    }

    public static final Unit AEQbTJ(MarketContainerFragment marketContainerFragment, int i) {
        ViewPager viewPager;
        qZN qzn = marketContainerFragment.AkhnZx;
        if (qzn != null && (viewPager = qzn.copydefault) != null) {
            viewPager.setCurrentItem(i, false);
        }
        try {
            marketContainerFragment.AEQbTJ(i);
        } catch (Exception unused) {
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(MarketContainerFragment marketContainerFragment, int i) {
        ViewPager viewPager;
        qZN qzn = marketContainerFragment.AkhnZx;
        if (qzn != null && (viewPager = qzn.copydefault) != null) {
            viewPager.setCurrentItem(i, false);
        }
        try {
            marketContainerFragment.AEQbTJ(i);
        } catch (Exception unused) {
        }
        return Unit.INSTANCE;
    }

    public static final boolean OLrzqt(MarketContainerFragment marketContainerFragment) {
        ViewPager viewPager;
        qZN qzn = marketContainerFragment.AkhnZx;
        if (qzn != null && (viewPager = qzn.copydefault) != null) {
            Activity activity = marketContainerFragment.gEmmrt;
            viewPager.setOffscreenPageLimit(C56548yJl.copydefault(3, activity != null ? activity.getCount() : 0));
        }
        return false;
    }

    public void KWHzl(boolean z) {
        if (this.AYXKKw) {
            this.AYXKKw = false;
            pUU.EZpvd(getTAG(), "updateLoadState() called with: success = " + z);
            AbstractC42536rWm.addMarker$default(getOkQPL(), QPLType.LIFE_CYCLE, z ? QPLMarker.PAGE_LOADED : QPLMarker.PAGE_NOT_LOADED, getTAG(), 0L, 8, null);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketContainerFragment$updateLoadState$1(null), 3, null);
        }
    }

    public final void AEQbTJ(int i) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        if (Intrinsics.EZpvd((Object) this.fetchVPNInfo.get(i).AEQbTJ(), (Object) "CHANCE_FIND")) {
            objectRef.element = "Opportunities";
            C32869mli.onNewOKexEventWithParams$default("APP_Discover_CLICK", null, 1, null);
        }
        if (Intrinsics.EZpvd((Object) this.fetchVPNInfo.get(i).AEQbTJ(), (Object) "discover_community")) {
            AEQbTJ(true);
            C32866mlf.onEvent$default("app_newdiscover_community_click", "Click", null, null, null, null, 30, null);
        }
        if (Intrinsics.EZpvd((Object) this.fetchVPNInfo.get(i).AEQbTJ(), (Object) "Watchlist")) {
            objectRef.element = "favorites";
            C54808xWb.KWHzl();
        }
        if (Intrinsics.EZpvd((Object) this.fetchVPNInfo.get(i).AEQbTJ(), (Object) "CHANCE_FIND")) {
            objectRef.element = "opportunities";
            C54808xWb.EZpvd();
        }
        if (Intrinsics.EZpvd((Object) this.fetchVPNInfo.get(i).AEQbTJ(), (Object) "COIN_FIND_DATA")) {
            objectRef.element = "data";
            C54808xWb.copydefault();
        }
        if (Intrinsics.EZpvd((Object) this.fetchVPNInfo.get(i).AEQbTJ(), (Object) "market_tab_derivatives")) {
            objectRef.element = "markets";
        }
        if (Intrinsics.EZpvd((Object) this.fetchVPNInfo.get(i).AEQbTJ(), (Object) "discover_community")) {
            objectRef.element = "copy_trading";
        }
        copydefault(this.fetchVPNInfo.get(i).AEQbTJ());
        C32866mlf.onEvent$default("Discover_Top_Header_Click", (TrackChannel[]) null, new Function1() { // from class: o.kFm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MarketContainerFragment.OLrzqt(objectRef, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(Ref.ObjectRef objectRef, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "tab", (String) objectRef.element, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void valueOf() {
        C32869mli.onNewOKexEventWithParams$default("app_page_enter", null, new Function1() { // from class: o.kFr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MarketContainerFragment.OLrzqt(this.AEQbTJ, (EventParamsList) obj);
            }
        }, 1, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(MarketContainerFragment marketContainerFragment, EventParamsList eventParamsList) {
        String str;
        ViewPager viewPager;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page_id", WalletSearchRequest.SEARCH_SOURCE_DISCOVER, false);
        qZN qzn = marketContainerFragment.AkhnZx;
        int currentItem = (qzn == null || (viewPager = qzn.copydefault) == null) ? 0 : viewPager.getCurrentItem();
        if (currentItem >= 0 && currentItem < marketContainerFragment.fetchVPNInfo.size()) {
            String strAEQbTJ = marketContainerFragment.fetchVPNInfo.get(currentItem).AEQbTJ();
            switch (strAEQbTJ.hashCode()) {
                case -1463930849:
                    str = !strAEQbTJ.equals("market_tab_derivatives") ? "spot" : "derivative";
                    break;
                case -1349992894:
                    if (strAEQbTJ.equals("COIN_FIND_DATA")) {
                        str = "data";
                        break;
                    }
                    break;
                case 1272578020:
                    if (strAEQbTJ.equals("CHANCE_FIND")) {
                        str = "opportunity";
                        break;
                    }
                    break;
                case 1724028365:
                    if (strAEQbTJ.equals("Watchlist")) {
                        str = "favorites";
                        break;
                    }
                    break;
            }
            eventParamsList.put("sub_tab", str, false);
        }
        return Unit.INSTANCE;
    }

    public Fragment EZpvd(@NotNull pWN pwn) {
        Intrinsics.checkNotNullParameter(pwn, "");
        return kFE.Companion.EZpvd(pwn);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [534=5] */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void KWHzl(C6814aWV c6814aWV) {
        String strEZpvd = c6814aWV.EZpvd();
        switch (strEZpvd.hashCode()) {
            case -1844699254:
                if (strEZpvd.equals("main/market/bot")) {
                    RxBus.AEQbTJ(C6814aWV.class);
                    this.ejfBZ = "BOTS";
                    EZpvd("BOTS");
                    return;
                }
                return;
            case -1844695842:
                if (strEZpvd.equals("main/market/fav")) {
                    RxBus.AEQbTJ(C6814aWV.class);
                    this.ejfBZ = "Watchlist";
                    EZpvd("Watchlist");
                    return;
                }
                return;
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
            case -1272769473:
                if (strEZpvd.equals("main/market/recommend")) {
                    RxBus.AEQbTJ(C6814aWV.class);
                    InterfaceC49317umK interfaceC49317umK = (InterfaceC49317umK) C43251rlk.OLrzqt(InterfaceC49317umK.class);
                    if (interfaceC49317umK != null) {
                        interfaceC49317umK.EZpvd(true);
                    }
                    AEQbTJ(true);
                    this.ejfBZ = "discover_community";
                    EZpvd("discover_community");
                    return;
                }
                return;
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
            case 552743788:
                if (strEZpvd.equals("main/market/community")) {
                    RxBus.AEQbTJ(C6814aWV.class);
                    AEQbTJ(true);
                    this.ejfBZ = "discover_community";
                    EZpvd("discover_community");
                    return;
                }
                return;
            default:
                return;
        }
        RxBus.AEQbTJ(C6814aWV.class);
        this.ejfBZ = "market_tab_derivatives";
        EZpvd("market_tab_derivatives");
    }

    /* JADX INFO: loaded from: classes18.dex */
    public final class Activity extends AbstractC33000moG {
        public final FragmentManager AEQbTJ;
        public ArrayList<Long> EZpvd;
        public final ArrayList<pWN> KWHzl;
        public final /* synthetic */ MarketContainerFragment copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull MarketContainerFragment marketContainerFragment, @NotNull FragmentManager fragmentManager, @NotNull AbstractC32998moE abstractC32998moE, ArrayList<pWN> arrayList) {
            super(fragmentManager, abstractC32998moE);
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(abstractC32998moE, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.copydefault = marketContainerFragment;
            this.AEQbTJ = fragmentManager;
            this.KWHzl = arrayList;
            this.EZpvd = new ArrayList<>();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.market.MarketContainerFragment$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void updateTabList$default(Activity activity, ArrayList arrayList, int i, Object obj) {
            if ((i & 1) != 0) {
                arrayList = null;
            }
            activity.EZpvd(arrayList);
        }

        public final void EZpvd(ArrayList<pWN> arrayList) {
            if (arrayList != null && (!arrayList.isEmpty())) {
                this.KWHzl.clear();
                this.KWHzl.addAll(arrayList);
            }
            kFE.Companion.AEQbTJ(this.KWHzl, this.EZpvd);
            notifyDataSetChanged();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            pWN pwn = (pWN) CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl, i);
            return pwn == null ? new C27857kFx() : this.copydefault.EZpvd(pwn);
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(@NotNull ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            try {
                Object objInstantiateItem = super.instantiateItem(viewGroup, i);
                Intrinsics.checkNotNullExpressionValue(objInstantiateItem, "");
                return objInstantiateItem;
            } catch (Exception e) {
                pUU.copydefault(this.copydefault.getTAG(), "instantiateItem: " + e.getMessage());
                return new C27857kFx();
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.KWHzl.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public long getItemId(int i) {
            Long l = (Long) CollectionsKt___CollectionsKt.AkhnZx(this.EZpvd, i);
            return l != null ? l.longValue() : i;
        }
    }

    public static final Unit AhwBna() {
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        SubHelper.AEQbTJ(this.values);
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        pXK.copydefault.OLrzqt(pXK.Activity.Application.KWHzl);
        super.onResume();
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        pXK.copydefault.OLrzqt(pXK.Activity.StateListAnimator.copydefault);
        super.onPause();
    }

    public final void AEQbTJ(boolean z) {
        C33541myR c33541myR;
        TabLayout.Tab tabAt;
        View customView;
        View viewFindViewById;
        Iterator<pWN> it = this.fetchVPNInfo.iterator();
        while (it.hasNext() && !Intrinsics.EZpvd((Object) it.next().AEQbTJ(), (Object) "discover_community")) {
        }
        InterfaceC49317umK interfaceC49317umK = (InterfaceC49317umK) C43251rlk.OLrzqt(InterfaceC49317umK.class);
        if (interfaceC49317umK != null && interfaceC49317umK.KWHzl() && isConnected().values()) {
            Context context = getContext();
            User userOLrzqt = isConnected().OLrzqt();
            if (C33485mxO.EZpvd(context, "social_trade", "social_community_entered" + (userOLrzqt != null ? userOLrzqt.getUid() : null), false)) {
                return;
            }
            Iterator<pWN> it2 = this.fetchVPNInfo.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.EZpvd((Object) it2.next().AEQbTJ(), (Object) "discover_community")) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                qZN qzn = this.AkhnZx;
                if (qzn != null && (c33541myR = qzn.KWHzl) != null && (tabAt = c33541myR.getTabAt(i)) != null && (customView = tabAt.getCustomView()) != null && (viewFindViewById = customView.findViewById(qZH.StateListAnimator.OEgNct)) != null) {
                    viewFindViewById.setVisibility(z ? 8 : 0);
                }
                if (z) {
                    Context context2 = getContext();
                    User userOLrzqt2 = isConnected().OLrzqt();
                    C33485mxO.OLrzqt(context2, "social_trade", "social_community_entered" + (userOLrzqt2 != null ? userOLrzqt2.getUid() : null), Boolean.TRUE);
                }
            }
        }
    }

    public final void EZpvd(String str) {
        qZN qzn;
        ViewPager viewPager;
        Iterator<pWN> it = this.fetchVPNInfo.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.EZpvd((Object) str, (Object) it.next().AEQbTJ())) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1 || (qzn = this.AkhnZx) == null || (viewPager = qzn.copydefault) == null) {
            return;
        }
        viewPager.setCurrentItem(i, false);
    }

    public static final Unit AEQbTJ(MarketContainerFragment marketContainerFragment, ResponseData responseData) {
        Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(marketContainerFragment), null, null, new MarketContainerFragment$getAllReminds$1$1$1(responseData, marketContainerFragment, null), 3, null));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        }
        return Unit.INSTANCE;
    }
}
