package o;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.find_ui.ranking.stock.MarketHomeStockRankingContainerFragment$jumpToMarkets$1;
import com.okinc.find_ui.ranking.stock.MarketHomeStockRankingContainerFragment$setListener$1;
import com.okinc.find_ui.ranking.stock.MarketHomeStockRankingContainerFragment$startLoadData$1;
import com.okinc.find_ui.ranking.stock.adapter.MarketStockSubPage;
import com.okinc.find_ui.ranking.stock.viewmodel.MarketHomeStockContainerViewModel;
import com.okinc.rxutils.RxBus;
import com.okinc.unify_trade.biz.DexInstrument;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import o.AbstractC35137npe;
import o.AbstractC58185ywX;
import o.C35095nop;
import o.C41298qoF;
import o.InterfaceC49371unL;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.qXK;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nop, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35095nop extends AbstractC35098nos implements InterfaceC27808kEb {
    public C42826rdj AhwBna;
    public Job AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public TabLayoutMediator ejfBZ;
    public final InterfaceC56387yDm fARcdN;
    public TabLayout.OnTabSelectedListener fIwbmz;
    public C46689tbs isConnected;
    public AbstractC35137npe values;
    public final /* synthetic */ kDL valueOf = new kDL();
    public final int fetchVPNInfo = qZH.ActionBar.UccSpe;

    /* JADX INFO: renamed from: o.nop$TaskDescription */
    public static final class TaskDescription implements TabLayout.OnTabSelectedListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf.AEQbTJ(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.valueOf.AEQbTJ(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.valueOf.AEQbTJ(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void EZpvd(@NotNull DexInstrument dexInstrument, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf.EZpvd(dexInstrument, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void EZpvd(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf.EZpvd(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.valueOf.EZpvd(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void OLrzqt() {
        this.valueOf.OLrzqt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void OLrzqt(@NotNull DexInstrument dexInstrument, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.valueOf.OLrzqt(dexInstrument, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void OLrzqt(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf.OLrzqt(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void aZ_() {
        this.valueOf.aZ_();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void ba_() {
        this.valueOf.ba_();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void copydefault(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf.copydefault(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void copydefault(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.lang.String str6, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.valueOf.copydefault(str, str2, str3, str4, str5, str6, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.fetchVPNInfo;
    }

    public C35095nop() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.find_ui.ranking.stock.MarketHomeStockRankingContainerFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.find_ui.ranking.stock.MarketHomeStockRankingContainerFragment$special$$inlined$viewModels$default$2
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketHomeStockContainerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.find_ui.ranking.stock.MarketHomeStockRankingContainerFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.find_ui.ranking.stock.MarketHomeStockRankingContainerFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.find_ui.ranking.stock.MarketHomeStockRankingContainerFragment$special$$inlined$viewModels$default$5
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
        this.fARcdN = C56392yDr.copydefault(new Function0() { // from class: o.noB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35095nop.values(this.OLrzqt);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MarketHomeStockContainerViewModel AuCTel() {
        return (MarketHomeStockContainerViewModel) this.DbNXlk.getValue();
    }

    public final C35060noG DbNXlk() {
        return (C35060noG) this.fARcdN.getValue();
    }

    public static final C35060noG values(C35095nop c35095nop) {
        return new C35060noG(c35095nop);
    }

    @Override // o.AbstractC27793kDo, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        C42826rdj c42826rdjOLrzqt = C42826rdj.OLrzqt(view);
        ViewPager2 viewPager2 = c42826rdjOLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(viewPager2, "");
        this.isConnected = new C46689tbs(viewPager2);
        C55244xgL c55244xgL = c42826rdjOLrzqt.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55244xgL, "");
        c55244xgL.setVisibility(8);
        this.AhwBna = c42826rdjOLrzqt;
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new MarketHomeStockRankingContainerFragment$setListener$1(this, null), 3, null);
        final java.lang.String[] strArr = {"event_home_page_refresh"};
        getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.find_ui.ranking.stock.MarketHomeStockRankingContainerFragment$setListener$$inlined$repeatListenRxEventOnResume$1
            public InterfaceC58217yxC OLrzqt;

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                super.onResume(lifecycleOwner);
                String[] strArr2 = strArr;
                AbstractC58185ywX<String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ((String[]) Arrays.copyOf(strArr2, strArr2.length));
                final C35095nop c35095nop = this;
                this.OLrzqt = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM(new Function1<String, Unit>() { // from class: com.okinc.find_ui.ranking.stock.MarketHomeStockRankingContainerFragment$setListener$$inlined$repeatListenRxEventOnResume$1.3
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(String str) {
                        copydefault(str);
                        return Unit.INSTANCE;
                    }

                    public final void copydefault(String str) {
                        Intrinsics.copydefault((Object) str);
                        C41298qoF.AEQbTJ.EZpvd(c35095nop.getTAG(), "EVENT_HOME_PAGE_REFRESH received, refreshing data");
                        c35095nop.fJNWhG();
                    }
                }) { // from class: o.jSA.AssistContent
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
                }, new InterfaceC58227yxM(new Function1<Throwable, Unit>() { // from class: com.okinc.find_ui.ranking.stock.MarketHomeStockRankingContainerFragment$setListener$$inlined$repeatListenRxEventOnResume$1.2
                    public final void OLrzqt(Throwable th) {
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(Throwable th) {
                        OLrzqt(th);
                        return Unit.INSTANCE;
                    }
                }) { // from class: o.jSA.AssistContent
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
                InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                super.onPause(lifecycleOwner);
            }
        });
    }

    public final void AEQbTJ(InterfaceC49371unL<? extends AbstractC35137npe> interfaceC49371unL) {
        ViewPager2 viewPager2;
        C35156npx c35156npx;
        ViewPager2 viewPager22;
        C35156npx c35156npx2;
        C35156npx c35156npx3;
        C41298qoF c41298qoF = C41298qoF.AEQbTJ;
        c41298qoF.EZpvd(getTAG(), "handleDisplayModeChange: " + interfaceC49371unL);
        if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
            c41298qoF.EZpvd(getTAG(), "Display mode loading");
            C42826rdj c42826rdj = this.AhwBna;
            if (c42826rdj == null || (c35156npx3 = c42826rdj.copydefault) == null) {
                return;
            }
            qXK.StateListAnimator.showLoadingState$default(c35156npx3, 0L, 1, null);
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
            C42826rdj c42826rdj2 = this.AhwBna;
            if (c42826rdj2 != null && (c35156npx2 = c42826rdj2.copydefault) != null) {
                c35156npx2.values();
            }
            EZpvd((AbstractC35137npe) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault());
            C42826rdj c42826rdj3 = this.AhwBna;
            if (c42826rdj3 == null || (viewPager22 = c42826rdj3.OLrzqt) == null) {
                return;
            }
            viewPager22.post(new java.lang.Runnable() { // from class: o.not
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C35095nop.gEmmrt(this.KWHzl);
                }
            });
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
            c41298qoF.AEQbTJ(getTAG(), "Display mode error", ((InterfaceC49371unL.Application) interfaceC49371unL).AEQbTJ());
            if (fIwbmz()) {
                C42826rdj c42826rdj4 = this.AhwBna;
                if (c42826rdj4 != null && (c35156npx = c42826rdj4.copydefault) != null) {
                    c35156npx.copydefault(C33070mpX.AYXKKw(qZH.PendingIntent.DsL), C33070mpX.AYXKKw(qZH.PendingIntent.djSkpj), C33070mpX.AYXKKw(qZH.PendingIntent.fetchVPNInfo), new Function0() { // from class: o.noq
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C35095nop.valueOf(this.OLrzqt);
                        }
                    });
                }
                C42826rdj c42826rdj5 = this.AhwBna;
                if (c42826rdj5 == null || (viewPager2 = c42826rdj5.OLrzqt) == null) {
                    return;
                }
                viewPager2.post(new java.lang.Runnable() { // from class: o.noy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C35095nop.isConnected(this.OLrzqt);
                    }
                });
            }
        }
    }

    public static final void gEmmrt(C35095nop c35095nop) {
        C46689tbs c46689tbs = c35095nop.isConnected;
        if (c46689tbs != null) {
            c46689tbs.KWHzl();
        }
    }

    public static final Unit valueOf(C35095nop c35095nop) {
        c35095nop.fJNWhG();
        return Unit.INSTANCE;
    }

    public static final void isConnected(C35095nop c35095nop) {
        C46689tbs c46689tbs = c35095nop.isConnected;
        if (c46689tbs != null) {
            c46689tbs.KWHzl();
        }
    }

    public final boolean fIwbmz() {
        ViewPager2 viewPager2;
        C42826rdj c42826rdj = this.AhwBna;
        return ((c42826rdj == null || (viewPager2 = c42826rdj.OLrzqt) == null) ? null : viewPager2.getAdapter()) == null || DbNXlk().getItemCount() == 0;
    }

    public final void EZpvd(AbstractC35137npe abstractC35137npe) {
        if (Intrinsics.EZpvd(this.values, abstractC35137npe)) {
            return;
        }
        this.values = abstractC35137npe;
        C41298qoF.AEQbTJ.EZpvd(getTAG(), "setupUIForDisplayMode: " + abstractC35137npe);
        final C42826rdj c42826rdj = this.AhwBna;
        if (c42826rdj != null) {
            if (Intrinsics.EZpvd(abstractC35137npe, AbstractC35137npe.StateListAnimator.copydefault)) {
                C55244xgL c55244xgL = c42826rdj.EZpvd;
                Intrinsics.checkNotNullExpressionValue(c55244xgL, "");
                c55244xgL.setVisibility(0);
                c42826rdj.OLrzqt.setUserInputEnabled(true);
                EZpvd(true);
                TabLayoutMediator tabLayoutMediator = this.ejfBZ;
                if (tabLayoutMediator != null) {
                    tabLayoutMediator.detach();
                }
                this.ejfBZ = null;
                DbNXlk().OLrzqt(MarketStockSubPage.getEntries(), new Function0() { // from class: o.nov
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C35095nop.OLrzqt(c42826rdj, this);
                    }
                });
                if (this.fIwbmz == null) {
                    TaskDescription taskDescription = new TaskDescription();
                    this.fIwbmz = taskDescription;
                    C55244xgL c55244xgL2 = c42826rdj.EZpvd;
                    Intrinsics.copydefault(taskDescription);
                    c55244xgL2.copydefault(taskDescription);
                    return;
                }
                return;
            }
            if (Intrinsics.EZpvd(abstractC35137npe, AbstractC35137npe.Application.EZpvd)) {
                C55244xgL c55244xgL3 = c42826rdj.EZpvd;
                Intrinsics.checkNotNullExpressionValue(c55244xgL3, "");
                c55244xgL3.setVisibility(8);
                c42826rdj.OLrzqt.setUserInputEnabled(false);
                EZpvd(false);
                TabLayoutMediator tabLayoutMediator2 = this.ejfBZ;
                if (tabLayoutMediator2 != null) {
                    tabLayoutMediator2.detach();
                }
                this.ejfBZ = null;
                DbNXlk().OLrzqt(C56402yEa.EZpvd(MarketStockSubPage.SPOT), new Function0() { // from class: o.nox
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C35095nop.valueOf(c42826rdj, this);
                    }
                });
                return;
            }
            if (!Intrinsics.EZpvd(abstractC35137npe, AbstractC35137npe.TaskDescription.AEQbTJ)) {
                throw new NoWhenBranchMatchedException();
            }
            C55244xgL c55244xgL4 = c42826rdj.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55244xgL4, "");
            c55244xgL4.setVisibility(8);
            c42826rdj.OLrzqt.setUserInputEnabled(false);
            EZpvd(false);
            TabLayoutMediator tabLayoutMediator3 = this.ejfBZ;
            if (tabLayoutMediator3 != null) {
                tabLayoutMediator3.detach();
            }
            this.ejfBZ = null;
            DbNXlk().OLrzqt(C56402yEa.EZpvd(MarketStockSubPage.FUTURES), new Function0() { // from class: o.now
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C35095nop.EZpvd(c42826rdj, this);
                }
            });
        }
    }

    public static final Unit OLrzqt(C42826rdj c42826rdj, final C35095nop c35095nop) {
        if (c42826rdj.OLrzqt.getAdapter() == null) {
            C46689tbs c46689tbs = c35095nop.isConnected;
            if (c46689tbs != null) {
                c46689tbs.KWHzl(c35095nop.DbNXlk());
            }
        } else {
            C46689tbs c46689tbs2 = c35095nop.isConnected;
            if (c46689tbs2 != null) {
                c46689tbs2.KWHzl();
            }
        }
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(c42826rdj.EZpvd.AYXKKw(), c42826rdj.OLrzqt, true, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.nou
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                C35095nop.EZpvd(this.AEQbTJ, tab, i);
            }
        });
        tabLayoutMediator.attach();
        c35095nop.ejfBZ = tabLayoutMediator;
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C35095nop c35095nop, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(c35095nop.DbNXlk().KWHzl(i));
        tab.setContentDescription(c35095nop.DbNXlk().AEQbTJ(i));
    }

    public static final Unit valueOf(C42826rdj c42826rdj, C35095nop c35095nop) {
        if (c42826rdj.OLrzqt.getAdapter() == null) {
            C46689tbs c46689tbs = c35095nop.isConnected;
            if (c46689tbs != null) {
                c46689tbs.KWHzl(c35095nop.DbNXlk());
            }
        } else {
            C46689tbs c46689tbs2 = c35095nop.isConnected;
            if (c46689tbs2 != null) {
                c46689tbs2.KWHzl();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C42826rdj c42826rdj, C35095nop c35095nop) {
        if (c42826rdj.OLrzqt.getAdapter() == null) {
            C46689tbs c46689tbs = c35095nop.isConnected;
            if (c46689tbs != null) {
                c46689tbs.KWHzl(c35095nop.DbNXlk());
            }
        } else {
            C46689tbs c46689tbs2 = c35095nop.isConnected;
            if (c46689tbs2 != null) {
                c46689tbs2.KWHzl();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fJNWhG() {
        Job job = this.AkhnZx;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        this.AkhnZx = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new MarketHomeStockRankingContainerFragment$startLoadData$1(this, null), 3, null);
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        androidx.fragment.app.FragmentManager childFragmentManager;
        InterfaceC27808kEb interfaceC27808kEbEZpvd;
        if (valueOf()) {
            OLrzqt(C33129mqd.divS$default(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 1000, null, null, null, 14, null));
            OLrzqt(false);
        }
        fJNWhG();
        android.view.View view = getView();
        if (view != null && view.isShown() && view.isAttachedToWindow()) {
            if (view.getGlobalVisibleRect(new android.graphics.Rect()) && view.getHeight() > 0 && C33129mqd.copydefault(java.lang.Float.valueOf(r1.height() / view.getHeight()), java.lang.Float.valueOf(0.5f)) && (interfaceC27808kEbEZpvd = C27807kEa.EZpvd(this)) != null) {
                interfaceC27808kEbEZpvd.copydefault("stocks", "futures");
            }
        }
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        if (parentFragment == null || (childFragmentManager = parentFragment.getChildFragmentManager()) == null) {
            return;
        }
        childFragmentManager.setFragmentResultListener("REQUEST_CLICK_ARROW", this, new FragmentResultListener() { // from class: o.noz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C35095nop.EZpvd(this.OLrzqt, str, bundle);
            }
        });
    }

    public static final void EZpvd(C35095nop c35095nop, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (Intrinsics.EZpvd((java.lang.Object) bundle.getString("type"), (java.lang.Object) "stock-rank")) {
            c35095nop.ejfBZ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C46688tbr.registerTradeFragmentTrack$default(C46688tbr.KWHzl, this, "MarketHomeStockRankingContainerFragment", new kotlin.Pair[0], null, 4, null);
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        AuCTel().copydefault();
    }

    public final void fARcdN() {
        fJNWhG();
    }

    public final void fetchVPNInfo() {
        ViewPager2 viewPager2;
        C42826rdj c42826rdj = this.AhwBna;
        if (c42826rdj == null || (viewPager2 = c42826rdj.OLrzqt) == null) {
            return;
        }
        viewPager2.post(new java.lang.Runnable() { // from class: o.noC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C35095nop.AhwBna(this.OLrzqt);
            }
        });
    }

    public static final void AhwBna(C35095nop c35095nop) {
        C46689tbs c46689tbs = c35095nop.isConnected;
        if (c46689tbs != null) {
            c46689tbs.KWHzl();
        }
    }

    public final void EZpvd(boolean z) {
        ViewPager2 viewPager2;
        C42826rdj c42826rdj = this.AhwBna;
        if (c42826rdj == null || (viewPager2 = c42826rdj.OLrzqt) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewPager2.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        if (z) {
            layoutParams2.topToTop = -1;
            layoutParams2.topToBottom = qZH.StateListAnimator.DCUTEIdCUTEI;
        } else {
            layoutParams2.topToBottom = -1;
            layoutParams2.topToTop = 0;
        }
        viewPager2.setLayoutParams(layoutParams2);
        viewPager2.requestLayout();
    }

    @Override // o.AbstractC27793kDo, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C42826rdj c42826rdj;
        C55244xgL c55244xgL;
        super.onDestroyView();
        Job job = this.AkhnZx;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.AkhnZx = null;
        TabLayout.OnTabSelectedListener onTabSelectedListener = this.fIwbmz;
        if (onTabSelectedListener != null && (c42826rdj = this.AhwBna) != null && (c55244xgL = c42826rdj.EZpvd) != null) {
            c55244xgL.EZpvd(onTabSelectedListener);
        }
        this.fIwbmz = null;
        TabLayoutMediator tabLayoutMediator = this.ejfBZ;
        if (tabLayoutMediator != null) {
            tabLayoutMediator.detach();
        }
        this.ejfBZ = null;
        this.AhwBna = null;
    }

    public final void ejfBZ() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketHomeStockRankingContainerFragment$jumpToMarkets$1(this, null), 3, null);
    }
}
