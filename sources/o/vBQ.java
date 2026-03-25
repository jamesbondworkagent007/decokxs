package o;

import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradeuilib.utils.E2EUtils;
import com.okinc.tradingbot.impl.order.strategy.botTradeContainer.BotTradeContainerPresenter;
import com.okinc.tradingbot.impl.order.strategy.botTradeContainer.BotTradeTabType;
import com.okinc.unify_trade.biz.AIData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52812wZg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class vBQ extends AbstractC54505xKx<AbstractC48388uPq, BotTradeContainerPresenter> implements InterfaceC49856uwT {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public C47976uAj<BotTradeTabType> EZpvd;
    public final int copydefault = C48033uCm.Activity.DGOPHZ;
    public boolean KWHzl = true;

    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BotTradeTabType.values().length];
            try {
                iArr[BotTradeTabType.AI.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[BotTradeTabType.MANUAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    public static final boolean OLrzqt(android.view.View view) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    public static final /* synthetic */ AbstractC48388uPq AEQbTJ(vBQ vbq) {
        return vbq.gGvvIC();
    }

    public static final /* synthetic */ BotTradeContainerPresenter OLrzqt(vBQ vbq) {
        return vbq.dxcTrN();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vBQ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ vBQ newInstance$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            return actionBar.KWHzl(str, str2);
        }

        public final vBQ KWHzl(@NotNull java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            vBQ vbq = new vBQ();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("bot_type", str);
            bundle.putString(OtcExtraKeys.ORDER, str2);
            vbq.setArguments(bundle);
            return vbq;
        }
    }

    @Override // o.InterfaceC49856uwT
    public int KWHzl() {
        AbstractC48388uPq abstractC48388uPqGGvvIC = gGvvIC();
        C47976uAj<BotTradeTabType> c47976uAj = this.EZpvd;
        java.lang.Long lValueOf = c47976uAj != null ? java.lang.Long.valueOf(c47976uAj.getItemId(abstractC48388uPqGGvvIC.AEQbTJ.getCurrentItem())) : null;
        ActivityResultCaller activityResultCallerFindFragmentByTag = getChildFragmentManager().findFragmentByTag("f" + lValueOf);
        if (activityResultCallerFindFragmentByTag instanceof InterfaceC49856uwT) {
            return ((InterfaceC49856uwT) activityResultCallerFindFragmentByTag).KWHzl() + abstractC48388uPqGGvvIC.OLrzqt.getBottom();
        }
        return 0;
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(view, "");
        C55249xgQ c55249xgQ = gGvvIC().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55249xgQ, "");
        wPQ.copydefault(c55249xgQ);
        BotTradeContainerPresenter botTradeContainerPresenterDxcTrN = dxcTrN();
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("bot_type")) == null) {
            string = "grid";
        }
        botTradeContainerPresenterDxcTrN.copydefault(string);
        copydefault();
        djBIcL();
        EZpvd();
        view.postDelayed(new java.lang.Runnable() { // from class: o.vBT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                vBQ.KWHzl(this.copydefault);
            }
        }, 300L);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void KWHzl(vBQ vbq) {
        vbq.AEQbTJ();
    }

    private final void djBIcL() {
        getParentFragmentManager().setFragmentResultListener("bot_one_click_copy", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vBO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                vBQ.AEQbTJ(this.KWHzl, str, bundle);
            }
        });
        getChildFragmentManager().setFragmentResultListener("copy_to_manual_data", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vBR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                vBQ.EZpvd(this.AEQbTJ, str, bundle);
            }
        });
        gGvvIC().OLrzqt.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new Activity());
    }

    public static final void AEQbTJ(vBQ vbq, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        vbq.EZpvd(bundle);
    }

    public static final void EZpvd(vBQ vbq, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        vbq.AEQbTJ(bundle);
    }

    public static final class Activity implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Activity() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (C33129mqd.AEQbTJ(tab != null ? java.lang.Integer.valueOf(tab.getPosition()) : null, java.lang.Integer.valueOf(vBQ.OLrzqt(vBQ.this).EZpvd().size() - 1))) {
                return;
            }
            android.content.Context context = vBQ.this.getContext();
            if (context != null) {
                C33054mpH.OLrzqt(context, vBQ.this.getView());
            }
            vBQ vbq = vBQ.this;
            vbq.KWHzl(vBQ.OLrzqt(vbq).EZpvd().get(tab != null ? tab.getPosition() : 0));
            if (C33129mqd.AhwBna(tab != null ? java.lang.Integer.valueOf(tab.getPosition()) : null) == 0) {
                SPUtils.put("bot_ai_contain_tab", BotTradeTabType.AI.getType());
            } else {
                SPUtils.put("bot_ai_contain_tab", BotTradeTabType.MANUAL.getType());
            }
            vBQ.AEQbTJ(vBQ.this).AEQbTJ.setCurrentItem(tab != null ? tab.getPosition() : 0, false);
        }
    }

    public final void KWHzl(BotTradeTabType botTradeTabType) {
        if (this.KWHzl) {
            this.KWHzl = false;
            return;
        }
        int i = Application.EZpvd[botTradeTabType.ordinal()];
        if (i == 1) {
            C32866mlf.onEvent$default("BotPlaceOrder_Recommended_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.vBX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return vBQ.AEQbTJ(this.copydefault, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            C32866mlf.onEvent$default("BotPlaceOrder_Recommended_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.vBW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return vBQ.KWHzl(this.copydefault, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit AEQbTJ(vBQ vbq, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", vbq.dxcTrN().OLrzqt(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "button", "recommend", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(vBQ vbq, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", vbq.dxcTrN().OLrzqt(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "button", "manual", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(android.os.Bundle bundle) {
        valueOf();
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            android.os.Parcelable parcelable = bundle.getParcelable("bot_copy_req");
            arguments.putParcelable("bot_copy_req", parcelable instanceof AIData ? (AIData) parcelable : null);
        }
        getChildFragmentManager().setFragmentResult("recommend_data", bundle);
    }

    public final void EZpvd(android.os.Bundle bundle) {
        valueOf();
        getChildFragmentManager().setFragmentResult("bot_one_click_copy", bundle);
    }

    public final void valueOf() {
        TabLayout.Tab tabAt;
        java.lang.String strAEQbTJ = dxcTrN().AEQbTJ(BotTradeTabType.MANUAL.getType());
        if (!C33129mqd.valueOf(strAEQbTJ, java.lang.Integer.valueOf(dxcTrN().EZpvd().size() - 1)) || (tabAt = gGvvIC().OLrzqt.getTabAt(C33129mqd.AhwBna(strAEQbTJ))) == null) {
            return;
        }
        tabAt.select();
    }

    public final void EZpvd() {
        java.lang.String strAEQbTJ;
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString(OtcExtraKeys.ORDER) : null;
        BotTradeContainerPresenter botTradeContainerPresenterDxcTrN = dxcTrN();
        if (string == null || string.length() == 0) {
            java.lang.String string2 = SPUtils.getString("bot_ai_contain_tab", BotTradeTabType.AI.getType());
            BotTradeContainerPresenter botTradeContainerPresenterDxcTrN2 = dxcTrN();
            Intrinsics.copydefault((java.lang.Object) string2);
            strAEQbTJ = botTradeContainerPresenterDxcTrN2.AEQbTJ(string2);
        } else {
            android.os.Bundle arguments2 = getArguments();
            if (Intrinsics.EZpvd((java.lang.Object) (arguments2 != null ? arguments2.getString(OtcExtraKeys.ORDER) : null), (java.lang.Object) "4")) {
                strAEQbTJ = dxcTrN().AEQbTJ(BotTradeTabType.AI.getType());
            } else {
                strAEQbTJ = dxcTrN().AEQbTJ(BotTradeTabType.MANUAL.getType());
            }
        }
        botTradeContainerPresenterDxcTrN.EZpvd(strAEQbTJ);
        int iAhwBna = C33129mqd.valueOf(dxcTrN().copydefault(), java.lang.Integer.valueOf(dxcTrN().EZpvd().size() + (-1))) ? C33129mqd.AhwBna(dxcTrN().copydefault()) : 0;
        TabLayout.Tab tabAt = gGvvIC().OLrzqt.getTabAt(iAhwBna);
        if (tabAt != null) {
            tabAt.select();
        }
        gGvvIC().AEQbTJ.setCurrentItem(iAhwBna, false);
    }

    public final void copydefault() {
        AbstractC48388uPq abstractC48388uPqGGvvIC = gGvvIC();
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        java.util.List<BotTradeTabType> listEZpvd = dxcTrN().EZpvd();
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        C47976uAj<BotTradeTabType> c47976uAj = new C47976uAj<>(childFragmentManager, listEZpvd, lifecycle, C56390yDp.OLrzqt(dxcTrN().OLrzqt(), getArguments()));
        this.EZpvd = c47976uAj;
        abstractC48388uPqGGvvIC.AEQbTJ.setAdapter(c47976uAj);
        abstractC48388uPqGGvvIC.AEQbTJ.setUserInputEnabled(false);
        android.view.View childAt = abstractC48388uPqGGvvIC.AEQbTJ.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(2);
        }
        new TabLayoutMediator(abstractC48388uPqGGvvIC.OLrzqt, abstractC48388uPqGGvvIC.AEQbTJ, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.vBV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                vBQ.OLrzqt(this.copydefault, tab, i);
            }
        }).attach();
    }

    public static final void OLrzqt(vBQ vbq, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.view.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.vBU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return vBQ.OLrzqt(view);
            }
        });
        kotlin.Pair<java.lang.String, java.lang.String> pairAEQbTJ = BotTradeTabType.Companion.AEQbTJ(vbq.dxcTrN().EZpvd().get(i));
        java.lang.String strComponent1 = pairAEQbTJ.component1();
        java.lang.String strComponent2 = pairAEQbTJ.component2();
        tab.setText(strComponent1);
        tab.setContentDescription(strComponent2);
    }

    public final void AEQbTJ() {
        if (((InterfaceC49317umK) C43251rlk.copydefault(InterfaceC49317umK.class)).djBIcL() && !C56071xvr.gEmmrt.ejfBZ() && SPUtils.getBoolean("lead_bot_migrated_tip", true)) {
            SPUtils.put("lead_bot_migrated_tip", java.lang.Boolean.FALSE);
            android.content.Context context = getContext();
            if (context != null) {
                C52812wZg c52812wZg = new C52812wZg(context);
                android.view.View view = gGvvIC().copydefault;
                Intrinsics.checkNotNullExpressionValue(view, "");
                C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(view);
                stateListAnimator.EZpvd(1);
                stateListAnimator.AEQbTJ(C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null));
                stateListAnimator.AEQbTJ(C33070mpX.AYXKKw(C48033uCm.Fragment.cBPFI));
                stateListAnimator.OLrzqt(C33070mpX.AYXKKw(C48033uCm.Fragment.hrjNmC));
                c52812wZg.AEQbTJ(stateListAnimator);
                c52812wZg.OLrzqt(0);
                E2EUtils.OLrzqt.AEQbTJ(c52812wZg, E2EUtils.FeatureFlag.BotCommon);
            }
        }
    }
}
