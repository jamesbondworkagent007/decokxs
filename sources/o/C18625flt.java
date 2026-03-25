package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.okinc.business.appupdate.api.AppUpdateService;
import com.okinc.business.defi.wallet.mine.WalletMineFragment$collectViewState$1;
import com.okinc.business.defi.wallet.mine.WalletMineFragment$handleJudgeForbiddenCheck$1;
import com.okinc.business.defi.wallet.mine.viewmodel.PageType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.glide.ImageSize;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.productmatrix.api.bean.Product;
import com.okinc.productmatrix.api.bean.ProductGroup;
import com.okinc.productmatrix.api.bean.ProductMatrixScene;
import com.okinc.rxutils.RxBus;
import com.okinc.uilab.stateful.StatefulData;
import com.okinc.wallet.api.bean.EnterWalletMainBean;
import com.okinc.wallet.api.bean.UnsupportedWalletType;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C12827cuN;
import o.C13754dXa;
import o.C15714eSo;
import o.C18588flI;
import o.InterfaceC9739bbK;
import o.eLN;
import o.tZL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.flt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C18625flt extends AbstractC32996moC implements InterfaceC33040mou, tZL.StateListAnimator, tZL.TaskDescription {
    public C17177exq AhwBna;
    public TaskDescription EZpvd;
    public Product KWHzl;
    public boolean copydefault;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public final int OLrzqt = C13754dXa.TaskDescription.fRNHEq;
    public final InterfaceC8107awW AEQbTJ = (InterfaceC8107awW) C43251rlk.OLrzqt(InterfaceC8107awW.class);
    public final java.lang.String AYXKKw = "productMatrixFragment";

    /* JADX INFO: renamed from: o.flt$TaskDescription */
    /* JADX INFO: loaded from: classes5.dex */
    public interface TaskDescription {
        wYC KWHzl();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(TaskDescription taskDescription) {
        this.EZpvd = taskDescription;
    }

    @Override // o.InterfaceC33040mou
    public boolean AhwBna() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.OLrzqt;
    }

    public C18625flt() {
        Function0 function0 = new Function0() { // from class: o.flu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C18625flt.isConnected(this.copydefault);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.mine.WalletMineFragment$special$$inlined$viewModels$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.mine.WalletMineFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        final Function0 function03 = null;
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C19307fyn.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.mine.WalletMineFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.mine.WalletMineFragment$special$$inlined$viewModels$default$4
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
                Function0 function04 = function03;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function0);
        final Function0<androidx.fragment.app.Fragment> function04 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.mine.WalletMineFragment$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.mine.WalletMineFragment$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function04.invoke();
            }
        });
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C19629gJl.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.mine.WalletMineFragment$special$$inlined$viewModels$default$8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.mine.WalletMineFragment$special$$inlined$viewModels$default$9
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
                Function0 function05 = function03;
                if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.mine.WalletMineFragment$special$$inlined$viewModels$default$10
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    public final C19307fyn EZpvd() {
        return (C19307fyn) this.valueOf.getValue();
    }

    public static final C19307fyn EZpvd(C18625flt c18625flt, CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new C19307fyn(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), c18625flt.AEQbTJ, (AppUpdateService) C43248rlh.KWHzl.AEQbTJ(AppUpdateService.class));
    }

    public final C19629gJl AYXKKw() {
        return (C19629gJl) this.gEmmrt.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AhwBna = C17177exq.copydefault(view);
        valueOf();
        OLrzqt();
        gEmmrt();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AhwBna = null;
    }

    public final void gEmmrt() {
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXH.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, viewLifecycleOwner);
        final Function1 function1 = new Function1() { // from class: o.flE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18625flt.KWHzl(this.KWHzl, (xXH) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.flL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C18625flt.KWHzl(function1, obj);
            }
        });
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C18625flt c18625flt, xXH xxh) {
        c18625flt.EZpvd().KWHzl();
        return Unit.INSTANCE;
    }

    public final void valueOf() {
        android.widget.LinearLayout linearLayout;
        android.widget.TextView textView;
        java.lang.String string;
        C17177exq c17177exq = this.AhwBna;
        if (c17177exq != null && (textView = c17177exq.OLrzqt) != null) {
            if (C34703nhO.copydefault()) {
                string = getString(C13754dXa.FragmentManager.onNavigationItemSelected);
            } else {
                string = getString(C13754dXa.FragmentManager.setTabListener);
            }
            textView.setText(string);
        }
        C17177exq c17177exq2 = this.AhwBna;
        if (c17177exq2 == null || (linearLayout = c17177exq2.AEQbTJ) == null) {
            return;
        }
        linearLayout.setOnClickListener(new ActionBar(linearLayout, 1000L, this));
    }

    public final void OLrzqt() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new WalletMineFragment$collectViewState$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.flt$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C18625flt KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C18625flt c18625flt) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = c18625flt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (this.KWHzl.getContext() != null) {
                    this.KWHzl.OLrzqt("about_okx");
                    this.KWHzl.startActivity(new android.content.Intent(this.KWHzl.getContext(), (java.lang.Class<?>) ActivityC18633fmA.class));
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.flt$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C18625flt EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C18625flt c18625flt) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = c18625flt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Web3WalletSetting_Top_Button_Click", (TrackChannel[]) null, Activity.OLrzqt, 1, (java.lang.Object) null);
                tZJ tzj = (tZJ) C43248rlh.KWHzl.AEQbTJ(tZJ.class);
                FragmentActivity fragmentActivityRequireActivity = this.EZpvd.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                ProductMatrixScene productMatrixScene = ProductMatrixScene.WEB3;
                Product product = this.EZpvd.KWHzl;
                Intrinsics.copydefault(product);
                tzj.OLrzqt(fragmentActivityRequireActivity, productMatrixScene, product, null);
            }
        }
    }

    public final void KWHzl() {
        AYXKKw().copydefault().observe(getViewLifecycleOwner(), new C18588flI.Activity(new Function1() { // from class: o.flA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18625flt.EZpvd(this.copydefault, (AbstractC12782ctV) obj);
            }
        }));
    }

    public static final Unit EZpvd(C18625flt c18625flt, AbstractC12782ctV abstractC12782ctV) {
        dZK dzk = dZK.AEQbTJ;
        FragmentActivity activity = c18625flt.getActivity();
        if (activity == null) {
            return Unit.INSTANCE;
        }
        dzk.AEQbTJ(activity, new EnterWalletMainBean((java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, 127, (DefaultConstructorMarker) null));
        return Unit.INSTANCE;
    }

    public final void OLrzqt(final java.lang.String str) {
        C32866mlf.onEvent$default("Web3WalletSetting_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.flx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18625flt.AEQbTJ(str, this, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, C18625flt c18625flt, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, str, true));
        PageType pageTypeCopydefault = c18625flt.EZpvd().copydefault();
        java.lang.String trackingValue = pageTypeCopydefault != null ? pageTypeCopydefault.getTrackingValue() : null;
        eventParamsList.add(new EventParam(EopTrackEvent.KEY_PAGE_TYPE, trackingValue != null ? trackingValue : "", true));
        return Unit.INSTANCE;
    }

    public final void EZpvd(Function0<Unit> function0) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new WalletMineFragment$handleJudgeForbiddenCheck$1(function0, null), 3, null);
    }

    public final void AkhnZx() {
        eLN elnNewInstance$default = eLN.TaskDescription.newInstance$default(eLN.Companion, new Function0() { // from class: o.fls
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C18625flt.AkhnZx(this.EZpvd);
            }
        }, new Function0() { // from class: o.fly
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C18625flt.DbNXlk(this.OLrzqt);
            }
        }, 0, true, C56402yEa.EZpvd(UnsupportedWalletType.MPCWallet), null, 36, null);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        elnNewInstance$default.show(childFragmentManager);
    }

    public static final Unit AkhnZx(C18625flt c18625flt) {
        c18625flt.KWHzl("create_mpc");
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(C18625flt c18625flt) {
        c18625flt.KWHzl("create");
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        KWHzl(new Function1() { // from class: o.flF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18625flt.OLrzqt(this.AEQbTJ, (Unit) obj);
            }
        });
    }

    public static final Unit OLrzqt(C18625flt c18625flt, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        C14616don c14616donKWHzl = C14616don.Companion.KWHzl((226 & 1) != 0 ? 1 : 0, (226 & 2) != 0 ? false : true, (226 & 4) != 0 ? null : null, (226 & 8) != 0 ? yDY.AhwBna() : null, (226 & 16) == 0, (226 & 32) != 0 ? null : null, (226 & 64) != 0 ? new java.util.ArrayList() : null, (226 & 128) == 0 ? null : null);
        androidx.fragment.app.FragmentManager childFragmentManager = c18625flt.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c14616donKWHzl.show(childFragmentManager);
        return Unit.INSTANCE;
    }

    public final void KWHzl(final java.lang.String str) {
        KWHzl(new Function1() { // from class: o.flD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18625flt.EZpvd(this.OLrzqt, str, (Unit) obj);
            }
        });
    }

    public static final Unit EZpvd(final C18625flt c18625flt, final java.lang.String str, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        androidx.fragment.app.FragmentManager childFragmentManager = c18625flt.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        new C14469dlz(childFragmentManager, c18625flt.getContext(), BundleKt.bundleOf(C56390yDp.OLrzqt("from", str)), null, new Function1() { // from class: o.flH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18625flt.copydefault(this.EZpvd, str, (java.lang.String) obj);
            }
        }, new Function0() { // from class: o.flw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C18625flt.copydefault();
            }
        }, null, null, 200, null).EZpvd();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C18625flt c18625flt, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        FragmentActivity activity = c18625flt.getActivity();
        if (activity == null) {
            return Unit.INSTANCE;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "create")) {
            C19629gJl c19629gJlAYXKKw = c18625flt.AYXKKw();
            androidx.fragment.app.FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            C19629gJl.createHDWallet$default(c19629gJlAYXKKw, str2, supportFragmentManager, 1, null, 8, null);
        } else {
            C15714eSo.TaskDescription.step$default(C15714eSo.Companion, activity, str2, 0, false, true, 12, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    private final void KWHzl(final Function1<? super Unit, Unit> function1) {
        if (this.copydefault) {
            function1.invoke(Unit.INSTANCE);
        } else {
            showLoading();
            C33024moe.subscribeOnIO$default(C58156yvv.OLrzqt(InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null), this, Lifecycle.Event.ON_DESTROY), new Function1() { // from class: o.flB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18625flt.EZpvd(this.EZpvd, (java.lang.Throwable) obj);
                }
            }, new Function0() { // from class: o.flz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C18625flt.OLrzqt(this.copydefault, function1);
                }
            }, (Function1) null, 4, (java.lang.Object) null);
        }
    }

    public static final Unit EZpvd(C18625flt c18625flt, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C55326xho.toast$default(th.getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        c18625flt.dismissLoading();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C18625flt c18625flt, Function1 function1) {
        c18625flt.copydefault = true;
        Unit unit = Unit.INSTANCE;
        function1.invoke(unit);
        c18625flt.dismissLoading();
        return unit;
    }

    @Override // o.tZL.TaskDescription
    public void AEQbTJ(@NotNull StatefulData.Status status, java.util.List<ProductGroup> list) {
        wYC wycKWHzl;
        Intrinsics.checkNotNullParameter(status, "");
        if (status == StatefulData.Status.SUCCESS) {
            if (list != null) {
                java.util.Iterator<T> it = list.iterator();
                loop0: while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    for (Product product : ((ProductGroup) it.next()).getProducts()) {
                        if (product.getProductId() == 2015) {
                            this.KWHzl = product;
                            break loop0;
                        }
                    }
                }
            }
            TaskDescription taskDescription = this.EZpvd;
            if (taskDescription == null || (wycKWHzl = taskDescription.KWHzl()) == null) {
                return;
            }
            if (this.KWHzl == null) {
                wycKWHzl.setVisibility(8);
                wycKWHzl.setOnClickListener(null);
                return;
            }
            wycKWHzl.setVisibility(0);
            androidx.fragment.app.Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag(this.AYXKKw);
            tZL tzl = fragmentFindFragmentByTag instanceof tZL ? (tZL) fragmentFindFragmentByTag : null;
            if (tzl != null) {
                Product product2 = this.KWHzl;
                Intrinsics.copydefault(product2);
                ImageSize imageSizeCreate = ImageSize.create(C33570myu.EZpvd(C32979mnm.EZpvd.OLrzqt(), 24));
                Intrinsics.checkNotNullExpressionValue(imageSizeCreate, "");
                tZL.loadIconByProduct$default(tzl, product2, wycKWHzl, imageSizeCreate, null, null, 16, null);
            }
            wycKWHzl.setOnClickListener(new Application(wycKWHzl, 1000L, this));
        }
    }

    /* JADX INFO: renamed from: o.flt$Activity */
    public static final class Activity implements Function1<EventParamsList, Unit> {
        public static final Activity OLrzqt = new Activity();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            copydefault(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void copydefault(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, "support_center", false));
        }
    }

    @Override // o.tZL.StateListAnimator
    public void AEQbTJ(@NotNull Product product, @NotNull android.view.View view, boolean z) {
        Intrinsics.checkNotNullParameter(product, "");
        Intrinsics.checkNotNullParameter(view, "");
        if (product.getProductId() == 2016) {
            C32866mlf.onEvent$default("DexReferral_EntryPoint_Default_Click", (TrackChannel[]) null, new Function1() { // from class: o.flC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18625flt.copydefault(this.AEQbTJ, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit copydefault(C18625flt c18625flt, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        AbstractC12782ctV abstractC12782ctVEZpvd = c18625flt.EZpvd().EZpvd();
        java.lang.String strDbNXlk = abstractC12782ctVEZpvd != null ? abstractC12782ctVEZpvd.DbNXlk() : null;
        eventParamsList.add(new EventParam("wallet_id", strDbNXlk != null ? strDbNXlk : "", false));
        return Unit.INSTANCE;
    }

    public static final ViewModelProvider.Factory isConnected(final C18625flt c18625flt) {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(C19307fyn.class), new Function1() { // from class: o.flG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18625flt.EZpvd(this.OLrzqt, (CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }
}
