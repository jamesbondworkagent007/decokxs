package o;

import android.view.View;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.tradingbot.impl.market_place.my_bot.MyBotHostFragment$onResume$1;
import com.okinc.tradingbot.impl.market_place.my_bot.MyBotHostFragment$onRetryClicked$1;
import com.okinc.tradingbot.impl.market_place.my_bot.MyBotHostFragment$onViewCreated$2;
import com.okinc.tradingbot.impl.market_place.my_bot.TabType;
import com.okinc.tradingbot.impl.market_place.my_bot.presenter.MyBotPresenter;
import com.okinc.unify_trade.biz.OrderPositionData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vrM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51665vrM extends AbstractC51687vri<AbstractC48307uMq, MyBotPresenter> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AYXKKw = 8;
    public boolean AhwBna = true;
    public java.lang.String gEmmrt = "";
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.vrX
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C51665vrM.isConnected(this.EZpvd));
        }
    });
    public final int valueOf = C48033uCm.Activity.gEmmrt;

    /* JADX INFO: renamed from: o.vrM$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    public static final boolean AEQbTJ(android.view.View view) {
        return true;
    }

    @Override // o.AbstractC54505xKx
    public boolean bv_() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.valueOf;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0004: CHECK_CAST (com.okinc.tradingbot.impl.market_place.my_bot.presenter.MyBotPresenter) (wrap:Presenter:0x0000: INVOKE (r0v0 o.vrM) VIRTUAL call: o.xKx.dxcTrN():com.okinc.unify_trade.refactor.presenter.AbsPresenter A[MD:():Presenter extends com.okinc.unify_trade.refactor.presenter.AbsPresenter (m), WRAPPED] (LINE:34)) */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ MyBotPresenter AEQbTJ(C51665vrM c51665vrM) {
        return (MyBotPresenter) c51665vrM.dxcTrN();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0004: CHECK_CAST (o.uMq) (wrap:Binding:0x0000: INVOKE (r0v0 o.vrM) VIRTUAL call: o.xKx.gGvvIC():androidx.databinding.ViewDataBinding A[MD:():Binding extends androidx.databinding.ViewDataBinding (m), WRAPPED] (LINE:34)) */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbstractC48307uMq OLrzqt(C51665vrM c51665vrM) {
        return (AbstractC48307uMq) c51665vrM.gGvvIC();
    }

    /* JADX INFO: renamed from: o.vrM$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vrM.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ C51665vrM newInstance$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            if ((i & 4) != 0) {
                str3 = "";
            }
            if ((i & 8) != 0) {
                str4 = "";
            }
            if ((i & 16) != 0) {
                z = false;
            }
            return stateListAnimator.AEQbTJ(str, str2, str3, str4, z);
        }

        public final C51665vrM AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, boolean z) {
            Intrinsics.checkNotNullParameter(str4, "");
            C51665vrM c51665vrM = new C51665vrM();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, str);
            bundle.putString("bot_total_assets", str2);
            bundle.putString("location", str3);
            bundle.putString(AppsFlyerProperties.CHANNEL, str4);
            bundle.putBoolean("from_cr_activity", z);
            c51665vrM.setArguments(bundle);
            return c51665vrM;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isConnected() {
        return ((java.lang.Boolean) this.djBIcL.getValue()).booleanValue();
    }

    public static final boolean isConnected(C51665vrM c51665vrM) {
        android.os.Bundle arguments = c51665vrM.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("from_cr_activity", false);
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC56129xww, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AbstractC48307uMq abstractC48307uMq = (AbstractC48307uMq) gGvvIC();
        if (isConnected()) {
            abstractC48307uMq.EZpvd(false);
            abstractC48307uMq.KWHzl(true);
            abstractC48307uMq.OLrzqt(false);
            abstractC48307uMq.copydefault(false);
        } else {
            abstractC48307uMq.EZpvd(true);
            abstractC48307uMq.KWHzl(true);
            abstractC48307uMq.OLrzqt(true);
            abstractC48307uMq.copydefault(false);
        }
        ejfBZ();
        fJNWhG();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MyBotHostFragment$onViewCreated$2(this, null), 3, null);
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C43453rpa c43453rpa = C43453rpa.AEQbTJ;
        android.content.Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        if (c43453rpa.KWHzl(applicationContext)) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MyBotHostFragment$onResume$1(this, null), 3, null);
        } else {
            gEmmrt();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fetchVPNInfo() {
        C56071xvr c56071xvr = C56071xvr.gEmmrt;
        AppCompatImageView appCompatImageView = ((AbstractC48307uMq) gGvvIC()).AYXKKw;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        wPQ.EZpvd(appCompatImageView, c56071xvr.isConnected(), 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AYXKKw() {
        if (!isAdded() || getView() == null || getChildFragmentManager().isStateSaved()) {
            return;
        }
        getChildFragmentManager().beginTransaction().replace(C48033uCm.Application.dUDNAs, C51685vrg.Companion.copydefault(((MyBotPresenter) dxcTrN()).gEmmrt(), ((MyBotPresenter) dxcTrN()).AEQbTJ(), java.lang.Boolean.valueOf(isConnected())), "assets_fragment").commit();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void values() {
        AppCompatImageView appCompatImageView = ((AbstractC48307uMq) gGvvIC()).AYXKKw;
        appCompatImageView.setOnClickListener(new Application(appCompatImageView, 1000L, this));
        ((AbstractC48307uMq) gGvvIC()).AkhnZx.OLrzqt(new InterfaceC57903yrG() { // from class: o.vrP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                C51665vrM.AEQbTJ(this.KWHzl, interfaceC57934yrl);
            }
        });
        ((AbstractC48307uMq) gGvvIC()).fetchVPNInfo.setOnClickListener(new View.OnClickListener() { // from class: o.vrO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51665vrM.EZpvd(this.EZpvd, view);
            }
        });
    }

    public static final void AEQbTJ(C51665vrM c51665vrM, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        android.os.Bundle bundle = new android.os.Bundle();
        c51665vrM.getChildFragmentManager().setFragmentResult("refresh_assets_action", bundle);
        c51665vrM.getChildFragmentManager().setFragmentResult("refresh_bot_action", bundle);
    }

    public static final void EZpvd(C51665vrM c51665vrM, android.view.View view) {
        c51665vrM.valueOf();
    }

    private final void ejfBZ() {
        if (isAdded()) {
            getChildFragmentManager().setFragmentResultListener("refresh_done", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vrV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.fragment.app.FragmentResultListener
                public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                    C51665vrM.KWHzl(this.OLrzqt, str, bundle);
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(C51665vrM c51665vrM, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (c51665vrM.getView() != null) {
            ((AbstractC48307uMq) c51665vrM.gGvvIC()).AkhnZx.AEQbTJ();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fJNWhG() {
        TradeLiveData<OrderPositionData> tradeLiveDataCopydefault = ((MyBotPresenter) dxcTrN()).copydefault();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataCopydefault.observe(viewLifecycleOwner, new Activity(new Function1() { // from class: o.vrQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51665vrM.EZpvd(this.copydefault, (OrderPositionData) obj);
            }
        }));
        if (isConnected()) {
            ((MyBotPresenter) dxcTrN()).getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.vrS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51665vrM.OLrzqt(this.KWHzl, (androidx.core.util.Pair) obj);
                }
            }));
        }
    }

    public static final Unit EZpvd(C51665vrM c51665vrM, OrderPositionData orderPositionData) {
        Intrinsics.checkNotNullParameter(orderPositionData, "");
        c51665vrM.djBIcL();
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Integer.valueOf(orderPositionData.getBotAmtData().getTotalAmt()));
        if (!C33129mqd.OLrzqt(c51665vrM.gEmmrt, strGEmmrt)) {
            c51665vrM.gEmmrt = strGEmmrt;
            c51665vrM.KWHzl(strGEmmrt);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vrM$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C51665vrM KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C51665vrM c51665vrM) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c51665vrM;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            OnBackPressedDispatcher onBackPressedDispatcher;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ActivityResultCaller parentFragment = this.KWHzl.getParentFragment();
                InterfaceC51662vrJ interfaceC51662vrJ = parentFragment instanceof InterfaceC51662vrJ ? (InterfaceC51662vrJ) parentFragment : null;
                if (interfaceC51662vrJ != null) {
                    interfaceC51662vrJ.OLrzqt();
                    return;
                }
                FragmentActivity activity = this.KWHzl.getActivity();
                if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
                    return;
                }
                onBackPressedDispatcher.onBackPressed();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C51665vrM c51665vrM, androidx.core.util.Pair pair) {
        if (Intrinsics.EZpvd(pair.first, (java.lang.Object) ((MyBotPresenter) c51665vrM.dxcTrN()).EZpvd().bB_())) {
            C43453rpa c43453rpa = C43453rpa.AEQbTJ;
            android.content.Context contextRequireContext = c51665vrM.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            if (c43453rpa.KWHzl(contextRequireContext)) {
                C55326xho.toast$default(((java.lang.Exception) pair.second).getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            } else {
                c51665vrM.gEmmrt();
            }
        } else {
            C43453rpa c43453rpa2 = C43453rpa.AEQbTJ;
            android.content.Context contextRequireContext2 = c51665vrM.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            if (!c43453rpa2.KWHzl(contextRequireContext2)) {
                c51665vrM.gEmmrt();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void gEmmrt() {
        ((AbstractC48307uMq) gGvvIC()).copydefault(true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void djBIcL() {
        ((AbstractC48307uMq) gGvvIC()).copydefault(false);
    }

    public final void valueOf() {
        if (isConnected()) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MyBotHostFragment$onRetryClicked$1(this, null), 3, null);
            android.os.Bundle bundle = new android.os.Bundle();
            getChildFragmentManager().setFragmentResult("refresh_assets_action", bundle);
            getChildFragmentManager().setFragmentResult("refresh_bot_action", bundle);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(java.lang.String str) {
        TabLayout.Tab tabCopydefault = ((AbstractC48307uMq) gGvvIC()).gEmmrt.copydefault(0);
        if (tabCopydefault != null) {
            tabCopydefault.setText(((MyBotPresenter) dxcTrN()).OLrzqt(((MyBotPresenter) dxcTrN()).KWHzl().get(0).EZpvd(), str));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fIwbmz() {
        ((MyBotPresenter) dxcTrN()).AYXKKw();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Binding */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AkhnZx() {
        if (isAdded()) {
            ((AbstractC48307uMq) gGvvIC()).AhwBna.setAdapter(new C47976uAj(getChildFragmentManager(), ((MyBotPresenter) dxcTrN()).KWHzl(), getViewLifecycleOwner().getLifecycle(), null, 8, null));
            new TabLayoutMediator(((AbstractC48307uMq) gGvvIC()).gEmmrt.copydefault(), ((AbstractC48307uMq) gGvvIC()).AhwBna, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.vrK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i) {
                    C51665vrM.AEQbTJ(this.AEQbTJ, tab, i);
                }
            }).attach();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(C51665vrM c51665vrM, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.view.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.vrR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C51665vrM.AEQbTJ(view);
            }
        });
        TabType tabTypeEZpvd = ((MyBotPresenter) c51665vrM.dxcTrN()).KWHzl().get(i).EZpvd();
        tab.setText(((MyBotPresenter) c51665vrM.dxcTrN()).OLrzqt(tabTypeEZpvd, c51665vrM.gEmmrt));
        tab.setContentDescription(((MyBotPresenter) c51665vrM.dxcTrN()).OLrzqt(tabTypeEZpvd));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v18, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v9, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(java.lang.String str) {
        final int i = 1;
        if (((MyBotPresenter) dxcTrN()).OLrzqt().length() > 0) {
            java.lang.String strOLrzqt = ((MyBotPresenter) dxcTrN()).OLrzqt();
            if (!Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "history")) {
                i = Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "signal") ? 2 : 0;
            }
        } else if (!C33129mqd.OLrzqt((java.lang.Object) str, (java.lang.Object) 0) || !C33129mqd.AEQbTJ(java.lang.Integer.valueOf(((MyBotPresenter) dxcTrN()).KWHzl().size()), 1)) {
        }
        if (this.AhwBna && C33129mqd.AEQbTJ(java.lang.Integer.valueOf(((MyBotPresenter) dxcTrN()).KWHzl().size()), java.lang.Integer.valueOf(i))) {
            ((AbstractC48307uMq) gGvvIC()).gEmmrt.post(new java.lang.Runnable() { // from class: o.vrW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C51665vrM.AEQbTJ(this.AEQbTJ, i);
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(C51665vrM c51665vrM, int i) {
        c51665vrM.AhwBna = false;
        TabLayout.Tab tabCopydefault = ((AbstractC48307uMq) c51665vrM.gGvvIC()).gEmmrt.copydefault(i);
        if (tabCopydefault != null) {
            tabCopydefault.select();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C56058xve.Companion.copydefault().AEQbTJ(((MyBotPresenter) dxcTrN()).AEQbTJ());
    }
}
