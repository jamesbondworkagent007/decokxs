package o;

import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.business.market.utils.MarketHomeTabType;
import com.okinc.find_ui.ranking.newcoin.adapter.MarketNewCoinSubPage;
import com.okinc.find_ui.ranking.newcoin.home.MarketHomeNewCoinFragment$checkIsShowRedDot$1;
import com.okinc.find_ui.ranking.newcoin.home.MarketHomeNewCoinFragment$displayRedDot$1;
import com.okinc.okmarket.home.MarketHomeV2Fragment;
import com.okinc.okmarket.home.NewCoinInfo;
import com.okinc.rxutils.RxBus;
import com.okinc.unify_find.viewmodel.NewCoinRankingViewModel;
import com.okinc.unify_find.viewmodel.RankModel;
import com.okinc.unify_trade.biz.DexInstrument;
import java.util.Arrays;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC58185ywX;
import o.C35047nnu;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nnu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35047nnu extends AbstractC34904nlJ implements InterfaceC27808kEb {
    public final InterfaceC56387yDm AuCTelauCTel;
    public C42789rcz fIwbmz;
    public C46689tbs getFieldNames;
    public boolean hDKMBd;
    public InterfaceC58217yxC wlaJM;
    public final InterfaceC56387yDm zLjUOn;
    public final /* synthetic */ kDL AuCTel = new kDL();
    public final int getNewProxyInstance = qZH.ActionBar.cBPFI;
    public final boolean uzCIH = true;
    public final boolean iwGUEr = true;

    /* JADX INFO: renamed from: o.nnu$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
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
    @Override // o.InterfaceC27808kEb
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AuCTel.AEQbTJ(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AuCTel.AEQbTJ(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.AuCTel.AEQbTJ(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC34904nlJ
    public java.lang.String AkhnZx() {
        return "Home_Rank_New";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void EZpvd(@NotNull DexInstrument dexInstrument, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AuCTel.EZpvd(dexInstrument, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void EZpvd(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AuCTel.EZpvd(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.AuCTel.EZpvd(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void OLrzqt() {
        this.AuCTel.OLrzqt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void OLrzqt(@NotNull DexInstrument dexInstrument, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AuCTel.OLrzqt(dexInstrument, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void OLrzqt(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AuCTel.OLrzqt(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void aZ_() {
        this.AuCTel.aZ_();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void ba_() {
        this.AuCTel.ba_();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void copydefault(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AuCTel.copydefault(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void copydefault(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.lang.String str6, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.AuCTel.copydefault(str, str2, str3, str4, str5, str6, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC34904nlJ
    public boolean fARcdN() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC34904nlJ
    public boolean fJNWhG() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.getNewProxyInstance;
    }

    public boolean zsXlph() {
        return true;
    }

    public C35047nnu() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.find_ui.ranking.newcoin.home.MarketHomeNewCoinFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.find_ui.ranking.newcoin.home.MarketHomeNewCoinFragment$special$$inlined$viewModels$default$2
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
        this.zLjUOn = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(NewCoinRankingViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.find_ui.ranking.newcoin.home.MarketHomeNewCoinFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.find_ui.ranking.newcoin.home.MarketHomeNewCoinFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.find_ui.ranking.newcoin.home.MarketHomeNewCoinFragment$special$$inlined$viewModels$default$5
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
        this.AuCTelauCTel = C56392yDr.copydefault(new Function0() { // from class: o.nnx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35047nnu.EZpvd(this.OLrzqt);
            }
        });
    }

    @Override // o.AbstractC34904nlJ
    public RankModel fIwbmz() {
        return AxsJAY();
    }

    private final NewCoinRankingViewModel AxsJAY() {
        return (NewCoinRankingViewModel) this.zLjUOn.getValue();
    }

    public final C35045nns zLjUOn() {
        return (C35045nns) this.AuCTelauCTel.getValue();
    }

    public static final C35045nns EZpvd(C35047nnu c35047nnu) {
        return new C35045nns(c35047nnu);
    }

    @Override // o.AbstractC34904nlJ, o.AbstractC27793kDo, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        C42789rcz c42789rczEZpvd = C42789rcz.EZpvd(view);
        ViewPager2 viewPager2 = c42789rczEZpvd.valueOf;
        Intrinsics.checkNotNullExpressionValue(viewPager2, "");
        C46689tbs c46689tbs = new C46689tbs(viewPager2);
        this.getFieldNames = c46689tbs;
        c46689tbs.KWHzl(zLjUOn());
        new TabLayoutMediator(c42789rczEZpvd.EZpvd.AYXKKw(), c42789rczEZpvd.valueOf, true, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.nnA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                C35047nnu.copydefault(this.EZpvd, tab, i);
            }
        }).attach();
        c42789rczEZpvd.EZpvd.copydefault(new StateListAnimator());
        this.fIwbmz = c42789rczEZpvd;
        gHZMYf();
        NewCoinRankingViewModel newCoinRankingViewModelAxsJAY = AxsJAY();
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        newCoinRankingViewModelAxsJAY.KWHzl(lifecycle);
        final java.lang.String[] strArr = {NewCoinInfo.class.getSimpleName()};
        getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.find_ui.ranking.newcoin.home.MarketHomeNewCoinFragment$initView$$inlined$repeatListenRxEventOnResume$1
            public InterfaceC58217yxC copydefault;

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                super.onResume(lifecycleOwner);
                String[] strArr2 = strArr;
                AbstractC58185ywX<String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ((String[]) Arrays.copyOf(strArr2, strArr2.length));
                final C35047nnu c35047nnu = this;
                this.copydefault = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM(new Function1<String, Unit>() { // from class: com.okinc.find_ui.ranking.newcoin.home.MarketHomeNewCoinFragment$initView$$inlined$repeatListenRxEventOnResume$1.2
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(String str) {
                        KWHzl(str);
                        return Unit.INSTANCE;
                    }

                    public final void KWHzl(String str) {
                        Intrinsics.copydefault((Object) str);
                        c35047nnu.AubY();
                    }
                }) { // from class: o.jSA.FragmentManager
                    public final /* synthetic */ Function1 AEQbTJ;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.AEQbTJ = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final /* synthetic */ void accept(java.lang.Object obj) {
                        this.AEQbTJ.invoke(obj);
                    }
                }, new InterfaceC58227yxM(new Function1<Throwable, Unit>() { // from class: com.okinc.find_ui.ranking.newcoin.home.MarketHomeNewCoinFragment$initView$$inlined$repeatListenRxEventOnResume$1.1
                    public final void KWHzl(Throwable th) {
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(Throwable th) {
                        KWHzl(th);
                        return Unit.INSTANCE;
                    }
                }) { // from class: o.jSA.FragmentManager
                    public final /* synthetic */ Function1 AEQbTJ;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.AEQbTJ = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final /* synthetic */ void accept(java.lang.Object obj) {
                        this.AEQbTJ.invoke(obj);
                    }
                });
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                InterfaceC58217yxC interfaceC58217yxC = this.copydefault;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                super.onPause(lifecycleOwner);
            }
        });
    }

    public static final void copydefault(C35047nnu c35047nnu, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(c35047nnu.zLjUOn().copydefault(i));
        tab.setContentDescription(c35047nnu.zLjUOn().AEQbTJ(i));
    }

    /* JADX INFO: renamed from: o.nnu$StateListAnimator */
    public static final class StateListAnimator implements TabLayout.OnTabSelectedListener {
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

        public StateListAnimator() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
            C35047nnu.this.AEQbTJ(tab.getPosition());
            InterfaceC27808kEb interfaceC27808kEbEZpvd = C27807kEa.EZpvd(C35047nnu.this);
            if (interfaceC27808kEbEZpvd != null) {
                interfaceC27808kEbEZpvd.EZpvd(OtpEventTracker.OTP_EVENT_VALUE_NEW, C35047nnu.this.wlaJM());
            }
        }
    }

    private final void gHZMYf() {
        AxsJAY().AEQbTJ().observe(this, new TaskDescription(new Function1() { // from class: o.nnz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C35047nnu.copydefault(this.EZpvd, (Unit) obj);
            }
        }));
    }

    public static final Unit copydefault(C35047nnu c35047nnu, Unit unit) {
        boolean z;
        C55244xgL c55244xgL;
        ViewPager2 viewPager2;
        C55244xgL c55244xgL2;
        pUU.EZpvd("NewCoin", "eHotConcernDataChange observe");
        c35047nnu.EZpvd(false);
        if (!c35047nnu.gEmmrt()) {
            c35047nnu.EZpvd(c35047nnu.getView(), MarketHomeTabType.NEW_COIN);
        }
        if ((!c35047nnu.AxsJAY().OLrzqt().isEmpty()) || (!c35047nnu.AxsJAY().AYXKKw().isEmpty())) {
            z = c35047nnu.zLjUOn().getItemCount() == 2;
            C42789rcz c42789rcz = c35047nnu.fIwbmz;
            if (c42789rcz != null && (c55244xgL = c42789rcz.EZpvd) != null) {
                c55244xgL.setVisibility(0);
            }
            c35047nnu.zLjUOn().copydefault(yDV.AwvSrB(MarketNewCoinSubPage.values()));
            if (!z) {
                c35047nnu.AubY();
            }
        } else {
            z = c35047nnu.zLjUOn().getItemCount() == 1;
            C42789rcz c42789rcz2 = c35047nnu.fIwbmz;
            if (c42789rcz2 != null && (c55244xgL2 = c42789rcz2.EZpvd) != null) {
                c55244xgL2.setVisibility(8);
            }
            C42789rcz c42789rcz3 = c35047nnu.fIwbmz;
            if (c42789rcz3 != null && (viewPager2 = c42789rcz3.valueOf) != null) {
                viewPager2.setCurrentItem(0, false);
            }
            c35047nnu.zLjUOn().copydefault(C56402yEa.EZpvd(MarketNewCoinSubPage.SPOT));
            if (!z) {
                c35047nnu.copydefault();
            }
        }
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        C46689tbs c46689tbs = this.getFieldNames;
        if (c46689tbs != null) {
            c46689tbs.KWHzl();
        }
    }

    @Override // o.AbstractC34904nlJ
    public boolean iwGUEr() {
        return AxsJAY().AhwBna().isEmpty() && AxsJAY().EZpvd().isEmpty() && AxsJAY().OLrzqt().isEmpty();
    }

    @Override // o.AbstractC34904nlJ, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C46688tbr.registerTradeFragmentTrack$default(C46688tbr.KWHzl, this, "MarketHomeNewCoinFragment", new kotlin.Pair[0], null, 4, null);
    }

    @Override // o.AbstractC34904nlJ, o.AbstractC32998moE
    public void onVisible() {
        if (valueOf()) {
            OLrzqt(C33129mqd.divS$default(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 1000, null, null, null, 14, null));
            OLrzqt(false);
        }
        super.onVisible();
        InterfaceC58217yxC interfaceC58217yxC = this.wlaJM;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        if (zsXlph()) {
            AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("event_home_page_refresh");
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
            AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this);
            final Function1 function1 = new Function1() { // from class: o.nny
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C35047nnu.OLrzqt(this.OLrzqt, (java.lang.String) obj);
                }
            };
            this.wlaJM = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.nnw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C35047nnu.KWHzl(function1, obj);
                }
            });
        }
        if (!this.hDKMBd) {
            this.hDKMBd = true;
            EZpvd(true);
        }
        AwvSrB();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C35047nnu c35047nnu, java.lang.String str) {
        c35047nnu.AwvSrB();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        InterfaceC58217yxC interfaceC58217yxC = this.wlaJM;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AxsJAY().bA_();
    }

    public final void AwvSrB() {
        if (isDetached()) {
            return;
        }
        AxsJAY().EZpvd(java.lang.Boolean.valueOf(zsXlph()));
    }

    @Override // o.AbstractC34904nlJ
    public void hDKMBd() {
        super.hDKMBd();
        AxsJAY().AEQbTJ(C55633xnd.getStableText$default(null, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(int i) {
        ActivityResultCaller activityResultCaller;
        if (i == MarketNewCoinSubPage.FUTURES.ordinal()) {
            if (this instanceof MarketHomeV2Fragment) {
                activityResultCaller = this;
            } else {
                androidx.fragment.app.Fragment parentFragment = getParentFragment();
                while (parentFragment != null && !(parentFragment instanceof MarketHomeV2Fragment)) {
                    parentFragment = parentFragment.getParentFragment();
                }
                if (!(parentFragment instanceof MarketHomeV2Fragment)) {
                    parentFragment = null;
                }
                activityResultCaller = (MarketHomeV2Fragment) parentFragment;
            }
            MarketHomeV2Fragment marketHomeV2Fragment = (MarketHomeV2Fragment) activityResultCaller;
            if (marketHomeV2Fragment != null) {
                marketHomeV2Fragment.getFieldNames();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        MarketHomeNewCoinFragment$checkIsShowRedDot$1 marketHomeNewCoinFragment$checkIsShowRedDot$1;
        ActivityResultCaller activityResultCaller;
        if (continuation instanceof MarketHomeNewCoinFragment$checkIsShowRedDot$1) {
            marketHomeNewCoinFragment$checkIsShowRedDot$1 = (MarketHomeNewCoinFragment$checkIsShowRedDot$1) continuation;
            int i = marketHomeNewCoinFragment$checkIsShowRedDot$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketHomeNewCoinFragment$checkIsShowRedDot$1.label = i - Integer.MIN_VALUE;
            } else {
                marketHomeNewCoinFragment$checkIsShowRedDot$1 = new MarketHomeNewCoinFragment$checkIsShowRedDot$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = marketHomeNewCoinFragment$checkIsShowRedDot$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketHomeNewCoinFragment$checkIsShowRedDot$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            if (this instanceof MarketHomeV2Fragment) {
                activityResultCaller = this;
            } else {
                androidx.fragment.app.Fragment parentFragment = getParentFragment();
                while (parentFragment != null && !(parentFragment instanceof MarketHomeV2Fragment)) {
                    parentFragment = parentFragment.getParentFragment();
                }
                if (!(parentFragment instanceof MarketHomeV2Fragment)) {
                    parentFragment = null;
                }
                activityResultCaller = (MarketHomeV2Fragment) parentFragment;
            }
            MarketHomeV2Fragment marketHomeV2Fragment = (MarketHomeV2Fragment) activityResultCaller;
            if (marketHomeV2Fragment != null) {
                marketHomeNewCoinFragment$checkIsShowRedDot$1.label = 1;
                objKWHzl = marketHomeV2Fragment.KWHzl(marketHomeNewCoinFragment$checkIsShowRedDot$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            }
            return C56443yFo.KWHzl(z);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(objKWHzl);
        boolean z = ((java.lang.Boolean) objKWHzl).booleanValue();
        return C56443yFo.KWHzl(z);
    }

    public final boolean AuCTelauCTel() {
        return !AxsJAY().OLrzqt().isEmpty();
    }

    public final java.lang.String wlaJM() {
        C55244xgL c55244xgL;
        C42789rcz c42789rcz = this.fIwbmz;
        return (c42789rcz == null || (c55244xgL = c42789rcz.EZpvd) == null || c55244xgL.gEmmrt() != 1) ? "spot" : "futures";
    }

    public final void AubY() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new MarketHomeNewCoinFragment$displayRedDot$1(this, null), 3, null);
    }
}
