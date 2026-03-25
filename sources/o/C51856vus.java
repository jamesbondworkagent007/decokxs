package o;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.github.mikephil.charting.formatter.LargeValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.google.android.material.tabs.TabLayout;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.tradingbot.impl.market_place.presenter.BotLeadOverviewPresenter;
import com.okinc.unify_trade.biz.BotLeadOverviewModel;
import com.okinc.unify_trade.biz.BotLeadProfitChartModel;
import com.okinc.unify_trade.biz.BotLeadProfitOverviewModel;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.bot.market_place.userpage.bean.LeadPnlRange;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import o.C32113mPz;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vus, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C51856vus extends AbstractC32996moC {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public AbstractC48372uPa AEQbTJ;
    public java.lang.String AYXKKw;
    public final LeadPnlRange EZpvd;
    public int KWHzl;
    public final InterfaceC56387yDm copydefault;
    public int gEmmrt;

    /* JADX INFO: renamed from: o.vus$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C48033uCm.Activity.Dmq;
    }

    public C51856vus() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.market_place.userpage.BotLeadOverviewFragment$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.market_place.userpage.BotLeadOverviewFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BotLeadOverviewPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.market_place.userpage.BotLeadOverviewFragment$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.market_place.userpage.BotLeadOverviewFragment$special$$inlined$viewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.market_place.userpage.BotLeadOverviewFragment$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.EZpvd = LeadPnlRange.DAY30;
        this.gEmmrt = 2;
    }

    /* JADX INFO: renamed from: o.vus$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vus.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C51856vus KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C51856vus c51856vus = new C51856vus();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("id", str);
            c51856vus.setArguments(bundle);
            return c51856vus;
        }
    }

    public final AbstractC48372uPa copydefault() {
        AbstractC48372uPa abstractC48372uPa = this.AEQbTJ;
        Intrinsics.copydefault(abstractC48372uPa);
        return abstractC48372uPa;
    }

    public final BotLeadOverviewPresenter KWHzl() {
        return (BotLeadOverviewPresenter) this.copydefault.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        java.lang.String str = "";
        if (arguments != null && (string = arguments.getString("id", "")) != null) {
            str = string;
        }
        this.AYXKKw = str;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AEQbTJ = AbstractC48372uPa.EZpvd(view);
        AYXKKw();
        gEmmrt();
        EZpvd();
        AEQbTJ();
        valueOf();
        OLrzqt();
    }

    public final void AYXKKw() {
        C55249xgQ c55249xgQ = copydefault().values;
        c55249xgQ.addTab(c55249xgQ.newTab().setText(C48033uCm.Fragment.fdOvFl).setTag(0));
        c55249xgQ.addTab(c55249xgQ.newTab().setText(C48033uCm.Fragment.dSJNDS).setTag(1));
        c55249xgQ.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new FragmentManager());
        TabLayout.Tab tabAt = c55249xgQ.getTabAt(0);
        if (tabAt != null) {
            tabAt.select();
        }
    }

    /* JADX INFO: renamed from: o.vus$FragmentManager */
    public static final class FragmentManager implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public FragmentManager() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab != null) {
                C51856vus c51856vus = C51856vus.this;
                c51856vus.KWHzl = C33129mqd.AhwBna(tab.getTag());
                c51856vus.OLrzqt(c51856vus.KWHzl().EZpvd().getValue());
                c51856vus.valueOf();
            }
        }
    }

    private final void gEmmrt() {
        C55258xgZ c55258xgZ = copydefault().wlaJM;
        c55258xgZ.setOnClickListener(new Application(c55258xgZ, 1000L, this));
        C55258xgZ c55258xgZ2 = copydefault().uzCIH;
        c55258xgZ2.setOnClickListener(new ActionBar(c55258xgZ2, 1000L, this));
    }

    public final void EZpvd() {
        C55320xhi c55320xhiKWHzl;
        copydefault().copydefault.KWHzl(C48029uCi.Companion.OLrzqt(), new InterfaceC48026uCf() { // from class: o.vuu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC48026uCf
            public final java.lang.String EZpvd(java.lang.String str, boolean z) {
                return C51856vus.copydefault(this.KWHzl, str, z);
            }
        });
        C55312xha c55312xhaValueOf = copydefault().wlaJM.valueOf();
        if (c55312xhaValueOf == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setText(C33070mpX.AYXKKw(C55688xof.Application.onSkipToPrevious));
    }

    public static final java.lang.String copydefault(C51856vus c51856vus, java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            return pTB.formatICUPercent$default(C33129mqd.EZpvd(str), RoundingMode.HALF_UP, C38307pTy.Companion.EZpvd(2), DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 16, null);
        }
        return pTB.formatLocalized$default(C33129mqd.formatS$default(C33129mqd.gEmmrt(str), java.lang.Integer.valueOf(c51856vus.gEmmrt), java.lang.Boolean.TRUE, null, 4, null), null, 1, null);
    }

    public final void AEQbTJ() {
        copydefault().DbNXlk.setRetryClickListener(new View.OnClickListener() { // from class: o.vut
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51856vus.OLrzqt(this.OLrzqt, view);
            }
        });
    }

    public static final void OLrzqt(C51856vus c51856vus, android.view.View view) {
        c51856vus.KWHzl(true);
        c51856vus.djBIcL();
    }

    public final void valueOf() {
        C55320xhi c55320xhiKWHzl;
        java.lang.String strAYXKKw;
        C55312xha c55312xhaValueOf = copydefault().uzCIH.valueOf();
        if (c55312xhaValueOf == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
            return;
        }
        if (this.KWHzl == 1) {
            strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.HJWChPDXdlte);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.GzAsTt);
        }
        c55320xhiKWHzl.setText(strAYXKKw);
    }

    public final void OLrzqt() {
        AbstractC48372uPa abstractC48372uPaCopydefault = copydefault();
        abstractC48372uPaCopydefault.hDKMBd.setText("--");
        abstractC48372uPaCopydefault.fIwbmz.setText("--");
        abstractC48372uPaCopydefault.AubY.setContent("--");
        abstractC48372uPaCopydefault.fetchVPNInfo.setContent("--");
        abstractC48372uPaCopydefault.djBIcL.setContent("--");
        abstractC48372uPaCopydefault.gEmmrt.setContent("--");
        abstractC48372uPaCopydefault.AEQbTJ.setContent("--");
    }

    /* JADX INFO: renamed from: o.vus$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C51856vus AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C51856vus c51856vus) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c51856vus;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.EZpvd(C33070mpX.AYXKKw(this.AEQbTJ.KWHzl == 1 ? C48033uCm.Fragment.dUDNAs : C48033uCm.Fragment.QwvEab));
            }
        }
    }

    /* JADX INFO: renamed from: o.vus$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C51856vus EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C51856vus c51856vus) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c51856vus;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.validateCustomAction));
            }
        }
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        TradeLiveData<BotLeadOverviewModel> tradeLiveDataAEQbTJ = KWHzl().AEQbTJ();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataAEQbTJ.observe(viewLifecycleOwner, new Activity(new Function1() { // from class: o.vuo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51856vus.OLrzqt(this.KWHzl, (BotLeadOverviewModel) obj);
            }
        }));
        TradeLiveData<BotLeadProfitOverviewModel> tradeLiveDataEZpvd = KWHzl().EZpvd();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataEZpvd.observe(viewLifecycleOwner2, new Activity(new Function1() { // from class: o.vuq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51856vus.AEQbTJ(this.OLrzqt, (BotLeadProfitOverviewModel) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = KWHzl().copydefault().AhwBna();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner3, new Activity(new Function1() { // from class: o.vuv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51856vus.copydefault(this.KWHzl, (java.lang.Exception) obj);
            }
        }));
    }

    public static final Unit OLrzqt(C51856vus c51856vus, BotLeadOverviewModel botLeadOverviewModel) {
        Intrinsics.checkNotNullParameter(botLeadOverviewModel, "");
        c51856vus.EZpvd(botLeadOverviewModel);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C51856vus c51856vus, BotLeadProfitOverviewModel botLeadProfitOverviewModel) {
        Intrinsics.checkNotNullParameter(botLeadProfitOverviewModel, "");
        c51856vus.dismissLoading();
        c51856vus.OLrzqt(botLeadProfitOverviewModel);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c51856vus, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C51856vus c51856vus, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        c51856vus.dismissLoading();
        c51856vus.AhwBna();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c51856vus, false, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        djBIcL();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        dismissLoading();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.AEQbTJ = null;
        super.onDestroyView();
    }

    private final void djBIcL() {
        BotLeadOverviewPresenter botLeadOverviewPresenterKWHzl = KWHzl();
        java.lang.String str = this.AYXKKw;
        java.lang.String str2 = null;
        if (str == null) {
            Intrinsics.gEmmrt("");
            str = null;
        }
        botLeadOverviewPresenterKWHzl.EZpvd(str);
        BotLeadOverviewPresenter botLeadOverviewPresenterKWHzl2 = KWHzl();
        java.lang.String code = this.EZpvd.getCode();
        java.lang.String str3 = this.AYXKKw;
        if (str3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            str2 = str3;
        }
        botLeadOverviewPresenterKWHzl2.KWHzl(code, str2);
    }

    public final void EZpvd(BotLeadOverviewModel botLeadOverviewModel) {
        java.lang.String iCUPercent$default;
        java.lang.String upToMax$default;
        java.lang.String lossCount;
        BigDecimal bigDecimalAEQbTJ;
        BigDecimal bigDecimalAEQbTJ2;
        if (botLeadOverviewModel == null) {
            return;
        }
        AbstractC48372uPa abstractC48372uPaCopydefault = copydefault();
        C52003vxg c52003vxg = abstractC48372uPaCopydefault.AubY;
        java.lang.String localized$default = "--";
        if (C33129mqd.OLrzqt((java.lang.CharSequence) botLeadOverviewModel.getHistoricalWinRate())) {
            java.lang.String historicalWinRate = botLeadOverviewModel.getHistoricalWinRate();
            iCUPercent$default = (historicalWinRate == null || (bigDecimalAEQbTJ2 = pTB.AEQbTJ(historicalWinRate)) == null) ? null : pTB.formatICUPercent$default(bigDecimalAEQbTJ2, RoundingMode.DOWN, C38307pTy.Companion.EZpvd(2), null, java.lang.Double.valueOf(100.0d), null, 20, null);
        } else {
            iCUPercent$default = "--";
        }
        c52003vxg.setContent(iCUPercent$default);
        C52003vxg c52003vxg2 = abstractC48372uPaCopydefault.fetchVPNInfo;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) botLeadOverviewModel.getHistoricalProfitLossRatio())) {
            java.lang.String historicalProfitLossRatio = botLeadOverviewModel.getHistoricalProfitLossRatio();
            upToMax$default = (historicalProfitLossRatio == null || (bigDecimalAEQbTJ = pTB.AEQbTJ(historicalProfitLossRatio)) == null) ? null : pTB.formatUpToMax$default(bigDecimalAEQbTJ, 1, null, 2, null);
        } else {
            upToMax$default = "--";
        }
        c52003vxg2.setContent(upToMax$default);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) botLeadOverviewModel.getProfitCount())) {
            android.widget.TextView textView = abstractC48372uPaCopydefault.hDKMBd;
            java.lang.String profitCount = botLeadOverviewModel.getProfitCount();
            textView.setText(profitCount != null ? pTB.formatLocalized$default(profitCount, null, 1, null) : null);
            abstractC48372uPaCopydefault.hDKMBd.setTextColor(C33129mqd.AEQbTJ(botLeadOverviewModel.getProfitCount(), 0) ? C33512mxp.getRiseUpColor$default(C33512mxp.AEQbTJ, 0.0f, 1, null) : C33070mpX.copydefault(C32113mPz.ActionBar.zLjUOn));
        } else {
            abstractC48372uPaCopydefault.hDKMBd.setText("--");
            abstractC48372uPaCopydefault.hDKMBd.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.aappFQ));
        }
        android.widget.TextView textView2 = abstractC48372uPaCopydefault.fIwbmz;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) botLeadOverviewModel.getLossCount())) {
            java.lang.String lossCount2 = botLeadOverviewModel.getLossCount();
            localized$default = lossCount2 != null ? pTB.formatLocalized$default(lossCount2, null, 1, null) : null;
        }
        textView2.setText(localized$default);
        java.lang.String profitCount2 = botLeadOverviewModel.getProfitCount();
        if (profitCount2 == null || profitCount2.length() == 0 || (lossCount = botLeadOverviewModel.getLossCount()) == null || lossCount.length() == 0) {
            abstractC48372uPaCopydefault.OLrzqt.setProfitRatio(-1.0f);
        } else if (C33129mqd.AhwBna(botLeadOverviewModel.getProfitCount()) == 0 && C33129mqd.AhwBna(botLeadOverviewModel.getLossCount()) == 0) {
            abstractC48372uPaCopydefault.OLrzqt.setProfitRatio(0.5f);
        } else {
            abstractC48372uPaCopydefault.OLrzqt.setProfitRatio((float) C33129mqd.divD$default(botLeadOverviewModel.getProfitCount(), java.lang.Integer.valueOf(C33129mqd.AhwBna(botLeadOverviewModel.getProfitCount()) + C33129mqd.AhwBna(botLeadOverviewModel.getLossCount())), null, null, null, 14, null));
        }
        C52003vxg c52003vxg3 = abstractC48372uPaCopydefault.djBIcL;
        java.lang.String followerTotalProfit = botLeadOverviewModel.getFollowerTotalProfit();
        java.lang.String str = followerTotalProfit == null ? "" : followerTotalProfit;
        java.lang.String profitSharingCcy = botLeadOverviewModel.getProfitSharingCcy();
        c52003vxg3.setContent(C56033xvF.getBotPnl$default("", "", str, profitSharingCcy == null ? "" : profitSharingCcy, false, false, null, false, null, null, null, 2032, null));
        android.content.Context context = getContext();
        if (context != null) {
            int i = C55688xof.Application.onRewind;
            java.lang.String profitSharingCcy2 = botLeadOverviewModel.getProfitSharingCcy();
            if (profitSharingCcy2 == null) {
                profitSharingCcy2 = "";
            }
            java.lang.String strKWHzl = C33069mpW.KWHzl(context, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", profitSharingCcy2)));
            if (strKWHzl != null) {
                abstractC48372uPaCopydefault.djBIcL.setTitle(strKWHzl);
            }
        }
        android.content.Context context2 = getContext();
        if (context2 != null) {
            int i2 = C55688xof.Application.onPlayFromSearch;
            java.lang.String profitSharingCcy3 = botLeadOverviewModel.getProfitSharingCcy();
            if (profitSharingCcy3 == null) {
                profitSharingCcy3 = "";
            }
            java.lang.String strKWHzl2 = C33069mpW.KWHzl(context2, i2, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", profitSharingCcy3)));
            if (strKWHzl2 != null) {
                abstractC48372uPaCopydefault.gEmmrt.setTitle(strKWHzl2);
            }
        }
        C52003vxg c52003vxg4 = abstractC48372uPaCopydefault.gEmmrt;
        java.lang.String followerCount = botLeadOverviewModel.getFollowerCount();
        c52003vxg4.setContent(followerCount != null ? pTB.formatLocalized$default(followerCount, null, 1, null) : null);
        C52003vxg c52003vxg5 = abstractC48372uPaCopydefault.AEQbTJ;
        java.lang.String followerAssets = botLeadOverviewModel.getFollowerAssets();
        c52003vxg5.setContent(followerAssets != null ? C55947xtZ.EZpvd.copydefault(followerAssets, botLeadOverviewModel.getProfitSharingCcy(), false) : null);
        android.content.Context context3 = getContext();
        if (context3 != null) {
            int i3 = C55688xof.Application.MediaSessionCompatCallbackStubApi21;
            java.lang.String profitSharingCcy4 = botLeadOverviewModel.getProfitSharingCcy();
            java.lang.String strKWHzl3 = C33069mpW.KWHzl(context3, i3, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", profitSharingCcy4 != null ? profitSharingCcy4 : "")));
            if (strKWHzl3 != null) {
                abstractC48372uPaCopydefault.AEQbTJ.setTitle(strKWHzl3);
            }
        }
    }

    public final void OLrzqt(BotLeadProfitOverviewModel botLeadProfitOverviewModel) {
        java.util.List<BotLeadProfitChartModel> arrayList;
        if (C33129mqd.KWHzl((java.util.Collection) (botLeadProfitOverviewModel != null ? botLeadProfitOverviewModel.getProfitHistory() : null))) {
            KWHzl(true);
            if (botLeadProfitOverviewModel == null || (arrayList = botLeadProfitOverviewModel.getProfitHistory()) == null) {
                arrayList = new java.util.ArrayList<>();
            }
            AEQbTJ(arrayList, botLeadProfitOverviewModel != null ? botLeadProfitOverviewModel.getProfitSharingCcy() : null);
            EZpvd(botLeadProfitOverviewModel);
            return;
        }
        AhwBna();
    }

    public final void AhwBna() {
        KWHzl(false);
        C51968vwy c51968vwy = copydefault().DbNXlk;
        Intrinsics.checkNotNullExpressionValue(c51968vwy, "");
        AEQbTJ(c51968vwy);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(java.util.List<BotLeadProfitChartModel> list, java.lang.String str) {
        int iAhwBna;
        ValueFormatter stateListAnimator;
        java.lang.Long fieldNames;
        java.lang.String sizeDig;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            iAhwBna = 2;
        } else {
            if (str == null) {
                str = "";
            }
            TradeCoinInfo tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt.AhwBna(str);
            if (tradeCoinInfoAhwBna != null && (sizeDig = tradeCoinInfoAhwBna.getSizeDig()) != null) {
                iAhwBna = C33129mqd.AhwBna(sizeDig);
            }
        }
        this.gEmmrt = C56548yJl.copydefault(iAhwBna, 2);
        boolean z = this.KWHzl == 0;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (BotLeadProfitChartModel botLeadProfitChartModel : list) {
            java.lang.String cTime = botLeadProfitChartModel.getCTime();
            arrayList.add(new C48032uCl((cTime == null || (fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(cTime)) == null) ? 0L : fieldNames.longValue(), java.lang.Float.valueOf(C33129mqd.djBIcL(botLeadProfitChartModel.getTotalPnl())), java.lang.Float.valueOf(C33129mqd.djBIcL(botLeadProfitChartModel.getPnlRatio())), z ? java.lang.Float.valueOf(C33129mqd.djBIcL(botLeadProfitChartModel.getPnlRatio())) : C33129mqd.EZpvd(botLeadProfitChartModel.getTotalPnl())));
        }
        if (z) {
            stateListAnimator = new C56001xua();
        } else {
            stateListAnimator = new StateListAnimator();
        }
        copydefault().copydefault.setData(arrayList, z, stateListAnimator, true);
    }

    /* JADX INFO: renamed from: o.vus$StateListAnimator */
    public static final class StateListAnimator extends LargeValueFormatter {
        public StateListAnimator() {
        }

        @Override // com.github.mikephil.charting.formatter.LargeValueFormatter, com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getFormattedValue(float f) {
            return pTB.formatLocalized$default(C33129mqd.formatS$default(C33129mqd.gEmmrt(java.lang.Float.valueOf(f)), java.lang.Integer.valueOf(C51856vus.this.gEmmrt), java.lang.Boolean.TRUE, null, 4, null), null, 1, null);
        }
    }

    public final void EZpvd(BotLeadProfitOverviewModel botLeadProfitOverviewModel) {
        java.lang.String pnlRatio;
        java.lang.String strPnlFormatTruncate$default;
        java.lang.String orderRatioStr$default;
        java.lang.String profitSharingCcy;
        java.lang.String totalPnl;
        java.lang.String str = "";
        if (this.KWHzl == 1) {
            C55947xtZ c55947xtZ = C55947xtZ.EZpvd;
            if (botLeadProfitOverviewModel == null || (totalPnl = botLeadProfitOverviewModel.getTotalPnl()) == null) {
                totalPnl = "";
            }
            strPnlFormatTruncate$default = C55947xtZ.pnlFormatTruncate$default(c55947xtZ, totalPnl, 0, 2, null);
        } else {
            C55947xtZ c55947xtZ2 = C55947xtZ.EZpvd;
            if (botLeadProfitOverviewModel == null || (pnlRatio = botLeadProfitOverviewModel.getPnlRatio()) == null) {
                pnlRatio = "";
            }
            strPnlFormatTruncate$default = C55947xtZ.pnlFormatTruncate$default(c55947xtZ2, pnlRatio, 0, 2, null);
        }
        java.lang.String str2 = strPnlFormatTruncate$default;
        android.widget.TextView textView = copydefault().fJNWhG;
        textView.setTextColor(OLrzqt(str2));
        if (this.KWHzl == 1) {
            java.lang.String strPnlToFixedFormat$default = C55947xtZ.pnlToFixedFormat$default(C55947xtZ.EZpvd, str2, botLeadProfitOverviewModel != null ? botLeadProfitOverviewModel.getProfitSharingCcy() : null, false, 2, null);
            if (botLeadProfitOverviewModel != null && (profitSharingCcy = botLeadProfitOverviewModel.getProfitSharingCcy()) != null) {
                str = profitSharingCcy;
            }
            orderRatioStr$default = strPnlToFixedFormat$default + " " + str;
        } else {
            orderRatioStr$default = C55947xtZ.getOrderRatioStr$default(C55947xtZ.EZpvd, str2, false, 2, null);
        }
        textView.setText(orderRatioStr$default);
    }

    private final int OLrzqt(java.lang.String str) {
        return C33129mqd.gEmmrt(str, "0") ? C33512mxp.getFallDownColor$default(C33512mxp.AEQbTJ, 0.0f, 1, null) : C33129mqd.AEQbTJ(str, "0") ? C33512mxp.getRiseUpColor$default(C33512mxp.AEQbTJ, 0.0f, 1, null) : C33070mpX.copydefault(C52761wXj.Activity.DeEinT);
    }

    public final void EZpvd(java.lang.String str) {
        android.content.Context context = getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
        viewOnClickListenerC54939xaY.EZpvd(str);
        viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.QWSkGZ, new View.OnClickListener() { // from class: o.vup
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51856vus.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void KWHzl(boolean z) {
        AbstractC48372uPa abstractC48372uPaCopydefault = copydefault();
        C51968vwy c51968vwy = abstractC48372uPaCopydefault.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(c51968vwy, "");
        c51968vwy.setVisibility(z ^ true ? 0 : 8);
        C48031uCk c48031uCk = abstractC48372uPaCopydefault.copydefault;
        Intrinsics.checkNotNullExpressionValue(c48031uCk, "");
        c48031uCk.setVisibility(z ? 0 : 8);
    }

    public final void AEQbTJ(C51968vwy c51968vwy) {
        c51968vwy.setVisibility(0);
        C43453rpa c43453rpa = C43453rpa.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(requireContext(), "");
        if (!c43453rpa.KWHzl(r2)) {
            C51968vwy.setNetworkError$default(c51968vwy, 0, 0, 3, null);
        } else {
            c51968vwy.setEmpty(C55688xof.Application.WorkerThread);
        }
        copydefault().DbNXlk.setPaddingTopRelative(0);
    }
}
