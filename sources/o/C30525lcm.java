package o;

import android.view.View;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dexlogic.main.swap.trade.viewmodel.util.CacheStatus;
import com.okinc.business.dexui.main.swap.widget.mev.MinimumReceivedParam;
import com.okinc.business.dexui.main.swap.widget.mev.simple.MevSimpleParam;
import com.okinc.business.dexui.main.swap.widget.slippage.DynamicParam;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageViewParam;
import com.okinc.business.trade.features.home.advance.market.viewmodel.AdvanceSlippageViewModel;
import com.okinc.business.trade.features.home.ui.advanced.swap.slippage.AdvanceSlippageCache;
import com.okinc.business.trade.features.home.ui.advanced.swap.slippage.AdvanceSlippageParams;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lcm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C30525lcm extends AbstractC30537lcy<C21609hFs> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.lcs
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C30525lcm.copydefault(this.AEQbTJ);
        }
    });

    /* JADX INFO: renamed from: o.lcm$TaskDescription */
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

    public C30525lcm() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.trade.features.home.ui.advanced.swap.slippage.AdvanceMarketSlippageFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.advanced.swap.slippage.AdvanceMarketSlippageFragment$special$$inlined$viewModels$default$2
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
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AdvanceSlippageViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.advanced.swap.slippage.AdvanceMarketSlippageFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.advanced.swap.slippage.AdvanceMarketSlippageFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.advanced.swap.slippage.AdvanceMarketSlippageFragment$special$$inlined$viewModels$default$5
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
    }

    /* JADX INFO: renamed from: o.lcm$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lcm.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C30525lcm AEQbTJ(@NotNull java.lang.String str, AdvanceSlippageParams advanceSlippageParams) {
            Intrinsics.checkNotNullParameter(str, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("data", advanceSlippageParams);
            C31200lpY.EZpvd(bundle, str);
            C30525lcm c30525lcm = new C30525lcm();
            c30525lcm.setArguments(bundle);
            return c30525lcm;
        }
    }

    private final AdvanceSlippageParams gEmmrt() {
        return (AdvanceSlippageParams) this.EZpvd.getValue();
    }

    public static final AdvanceSlippageParams copydefault(C30525lcm c30525lcm) {
        AdvanceSlippageParams advanceSlippageParams;
        android.os.Bundle arguments = c30525lcm.getArguments();
        return (arguments == null || (advanceSlippageParams = (AdvanceSlippageParams) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "data", AdvanceSlippageParams.class))) == null) ? new AdvanceSlippageParams(null, null, null, null, 15, null) : advanceSlippageParams;
    }

    /* JADX DEBUG: Possible override for method o.lcy.KWHzl()V */
    public final AdvanceSlippageViewModel KWHzl() {
        return (AdvanceSlippageViewModel) this.AEQbTJ.getValue();
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.hTH
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C21609hFs OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21609hFs c21609hFsAEQbTJ = C21609hFs.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21609hFsAEQbTJ, "");
        return c21609hFsAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.hTH
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C21609hFs c21609hFs, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(c21609hFs, "");
        djBIcL();
        valueOf();
        android.view.View view = getView();
        if (view != null) {
            view.post(new java.lang.Runnable() { // from class: o.lct
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C30525lcm.OLrzqt(this.AEQbTJ);
                }
            });
        }
    }

    public static final void OLrzqt(C30525lcm c30525lcm) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c30525lcm, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void djBIcL() {
        DynamicParam dynamicParamCopydefault;
        final C21609hFs c21609hFs = (C21609hFs) fARcdN();
        if (c21609hFs != null) {
            SlippageViewParam slippageViewParamAEQbTJ = gEmmrt().AEQbTJ();
            C25023ior c25023ior = new C25023ior(KWHzl(), gEmmrt().KWHzl(), (slippageViewParamAEQbTJ == null || (dynamicParamCopydefault = slippageViewParamAEQbTJ.copydefault()) == null) ? null : dynamicParamCopydefault.valueOf());
            java.lang.String strAuCTel = AuCTel();
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            C25017iol c25017iol = new C25017iol(strAuCTel, childFragmentManager);
            wYF wyf = c21609hFs.KWHzl;
            wyf.setType(5);
            wyf.setOKDSSize(52);
            wyf.setPrimaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.DGgnkA));
            C52794wYp c52794wYpCopydefault = wyf.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setOnClickListener(new Application(c52794wYpCopydefault, 1000L, c25023ior, c25017iol, this));
            }
            C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
            if (c52794wYpCopydefault2 != null) {
                c52794wYpCopydefault2.setContentDescription("web3_dex_trade_setting_confirm_button");
            }
            C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setVisibility(8);
            }
            SlippageViewParam slippageViewParamAEQbTJ2 = gEmmrt().AEQbTJ();
            if (slippageViewParamAEQbTJ2 != null) {
                c21609hFs.EZpvd.setData(slippageViewParamAEQbTJ2);
                c21609hFs.EZpvd.setListener(c25023ior);
                DynamicParam dynamicParamCopydefault2 = slippageViewParamAEQbTJ2.copydefault();
                java.lang.String strAEQbTJ = dynamicParamCopydefault2 != null ? dynamicParamCopydefault2.AEQbTJ() : null;
                AEQbTJ(strAEQbTJ != null ? strAEQbTJ : "");
            }
            MevSimpleParam mevSimpleParamCopydefault = gEmmrt().copydefault();
            if (mevSimpleParamCopydefault != null) {
                c21609hFs.OLrzqt.setData(mevSimpleParamCopydefault);
            }
            c21609hFs.OLrzqt.setListener(c25017iol);
            KWHzl().copydefault().observe(this, new TaskDescription(new Function1() { // from class: o.lcq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C30525lcm.AEQbTJ(this.AEQbTJ, c21609hFs, (C25301iuD) obj);
                }
            }));
        }
    }

    public static final Unit AEQbTJ(C30525lcm c30525lcm, C21609hFs c21609hFs, C25301iuD c25301iuD) {
        c30525lcm.AEQbTJ(c25301iuD.OLrzqt());
        C52794wYp c52794wYpCopydefault = c21609hFs.KWHzl.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setEnabled(!c25301iuD.gEmmrt());
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AEQbTJ(java.lang.String str) {
        C21609hFs c21609hFs;
        C25345iuv c25345iuv;
        MinimumReceivedParam minimumReceivedParamEZpvd = gEmmrt().EZpvd();
        java.lang.String strEZpvd = minimumReceivedParamEZpvd != null ? minimumReceivedParamEZpvd.EZpvd() : null;
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        MinimumReceivedParam minimumReceivedParamEZpvd2 = gEmmrt().EZpvd();
        java.lang.String strOLrzqt = minimumReceivedParamEZpvd2 != null ? minimumReceivedParamEZpvd2.OLrzqt() : null;
        java.lang.String str2 = strOLrzqt != null ? strOLrzqt : "";
        MinimumReceivedParam minimumReceivedParamEZpvd3 = gEmmrt().EZpvd();
        if (minimumReceivedParamEZpvd3 != null) {
            minimumReceivedParamEZpvd3.EZpvd(KWHzl().EZpvd(C33129mqd.gEmmrt(str), strEZpvd, str2));
        }
        MinimumReceivedParam minimumReceivedParamEZpvd4 = gEmmrt().EZpvd();
        if (minimumReceivedParamEZpvd4 == null || (c21609hFs = (C21609hFs) fARcdN()) == null || (c25345iuv = c21609hFs.AEQbTJ) == null) {
            return;
        }
        c25345iuv.setData(minimumReceivedParamEZpvd4);
    }

    private final void valueOf() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        C59541ziw.EZpvd(fragmentActivityRequireActivity, this, new InterfaceC59496ziD() { // from class: o.lcp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59496ziD
            public final void OLrzqt(boolean z) {
                C30525lcm.EZpvd(this.copydefault, z);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(C30525lcm c30525lcm, boolean z) {
        C25308iuK c25308iuK;
        C55008xbo c55008xboAEQbTJ;
        C25308iuK c25308iuK2;
        C55008xbo c55008xboEZpvd;
        if (z) {
            return;
        }
        C21609hFs c21609hFs = (C21609hFs) c30525lcm.fARcdN();
        if (c21609hFs != null && (c25308iuK2 = c21609hFs.EZpvd) != null && (c55008xboEZpvd = c25308iuK2.EZpvd()) != null) {
            c55008xboEZpvd.clearFocus();
        }
        C21609hFs c21609hFs2 = (C21609hFs) c30525lcm.fARcdN();
        if (c21609hFs2 == null || (c25308iuK = c21609hFs2.EZpvd) == null || (c55008xboAEQbTJ = c25308iuK.AEQbTJ()) == null) {
            return;
        }
        c55008xboAEQbTJ.clearFocus();
    }

    /* JADX INFO: renamed from: o.lcm$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C30525lcm KWHzl;
        public final /* synthetic */ C25023ior OLrzqt;
        public final /* synthetic */ C25017iol copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C25023ior c25023ior, C25017iol c25017iol, C30525lcm c30525lcm) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = c25023ior;
            this.copydefault = c25017iol;
            this.KWHzl = c30525lcm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C25301iuD c25301iuDOLrzqt = this.OLrzqt.OLrzqt();
                if (c25301iuDOLrzqt != null) {
                    CacheStatus cacheStatusKWHzl = this.copydefault.KWHzl();
                    java.lang.String strOLrzqt = c25301iuDOLrzqt.OLrzqt();
                    if (strOLrzqt == null) {
                        strOLrzqt = "";
                    }
                    AdvanceSlippageCache advanceSlippageCache = new AdvanceSlippageCache(cacheStatusKWHzl, strOLrzqt, c25301iuDOLrzqt.copydefault(), c25301iuDOLrzqt.KWHzl(), c25301iuDOLrzqt.AEQbTJ());
                    FragmentActivity activity = this.KWHzl.getActivity();
                    if (activity != null) {
                        activity.setResult(-1, new android.content.Intent().putExtra("data", advanceSlippageCache));
                    }
                    FragmentActivity activity2 = this.KWHzl.getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                    }
                }
            }
        }
    }
}
