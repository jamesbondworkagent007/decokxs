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
import com.okinc.business.dexui.main.swap.widget.mev.MinimumReceivedParam;
import com.okinc.business.dexui.main.swap.widget.mev.simple.MevSimpleParam;
import com.okinc.business.dexui.main.swap.widget.slippage.DynamicParam;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageViewParam;
import com.okinc.business.trade.features.home.advance.limit.viewmodel.AdvanceLimitSlippageViewModel;
import com.okinc.business.trade.features.home.ui.advanced.limit.slippage.AdvanceLimitSlippageCache;
import com.okinc.business.trade.features.home.ui.advanced.swap.slippage.AdvanceSlippageParams;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lcc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C30515lcc extends AbstractC30520lch<C21609hFs> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.lce
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C30515lcc.KWHzl(this.OLrzqt);
        }
    });

    /* JADX INFO: renamed from: o.lcc$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    public C30515lcc() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.trade.features.home.ui.advanced.limit.slippage.AdvanceLimitSlippageFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.advanced.limit.slippage.AdvanceLimitSlippageFragment$special$$inlined$viewModels$default$2
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
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AdvanceLimitSlippageViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.advanced.limit.slippage.AdvanceLimitSlippageFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.advanced.limit.slippage.AdvanceLimitSlippageFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.advanced.limit.slippage.AdvanceLimitSlippageFragment$special$$inlined$viewModels$default$5
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

    /* JADX INFO: renamed from: o.lcc$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lcc.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C30515lcc KWHzl(@NotNull java.lang.String str, AdvanceSlippageParams advanceSlippageParams, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("data", advanceSlippageParams);
            C31200lpY.EZpvd(bundle, str);
            bundle.putString("slipPage", str2);
            C30515lcc c30515lcc = new C30515lcc();
            c30515lcc.setArguments(bundle);
            return c30515lcc;
        }
    }

    /* JADX DEBUG: Possible override for method o.lch.KWHzl()V */
    public final AdvanceSlippageParams KWHzl() {
        return (AdvanceSlippageParams) this.copydefault.getValue();
    }

    public static final AdvanceSlippageParams KWHzl(C30515lcc c30515lcc) {
        AdvanceSlippageParams advanceSlippageParams;
        android.os.Bundle arguments = c30515lcc.getArguments();
        return (arguments == null || (advanceSlippageParams = (AdvanceSlippageParams) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "data", AdvanceSlippageParams.class))) == null) ? new AdvanceSlippageParams(null, null, null, null, 15, null) : advanceSlippageParams;
    }

    public final AdvanceLimitSlippageViewModel AEQbTJ() {
        return (AdvanceLimitSlippageViewModel) this.KWHzl.getValue();
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
        AhwBna();
        valueOf();
        android.view.View view = getView();
        if (view != null) {
            view.post(new java.lang.Runnable() { // from class: o.lcf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C30515lcc.copydefault(this.copydefault);
                }
            });
        }
    }

    public static final void copydefault(C30515lcc c30515lcc) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c30515lcc, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AhwBna() {
        DynamicParam dynamicParamCopydefault;
        final C21609hFs c21609hFs = (C21609hFs) fARcdN();
        if (c21609hFs != null) {
            SlippageViewParam slippageViewParamAEQbTJ = KWHzl().AEQbTJ();
            C25024ios c25024ios = new C25024ios(AEQbTJ(), KWHzl().KWHzl(), (slippageViewParamAEQbTJ == null || (dynamicParamCopydefault = slippageViewParamAEQbTJ.copydefault()) == null) ? null : dynamicParamCopydefault.valueOf());
            java.lang.String strAuCTel = AuCTel();
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            C25018iom c25018iom = new C25018iom(strAuCTel, childFragmentManager);
            wYF wyf = c21609hFs.KWHzl;
            wyf.setType(14);
            wyf.setOKDSSize(52);
            wyf.setPrimaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.DGgnkA));
            C52794wYp c52794wYpCopydefault = wyf.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setOnClickListener(new Application(c52794wYpCopydefault, 1000L, c25024ios, this));
            }
            C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
            if (c52794wYpCopydefault2 != null) {
                c52794wYpCopydefault2.setContentDescription("web3_dex_trade_setting_confirm_button");
            }
            C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setVisibility(8);
            }
            SlippageViewParam slippageViewParamAEQbTJ2 = KWHzl().AEQbTJ();
            if (slippageViewParamAEQbTJ2 != null) {
                c21609hFs.EZpvd.setData(slippageViewParamAEQbTJ2);
                c21609hFs.EZpvd.setListener(c25024ios);
                DynamicParam dynamicParamCopydefault2 = slippageViewParamAEQbTJ2.copydefault();
                java.lang.String strAEQbTJ = dynamicParamCopydefault2 != null ? dynamicParamCopydefault2.AEQbTJ() : null;
                EZpvd(strAEQbTJ != null ? strAEQbTJ : "");
            }
            MevSimpleParam mevSimpleParamCopydefault = KWHzl().copydefault();
            if (mevSimpleParamCopydefault != null) {
                c21609hFs.OLrzqt.setData(mevSimpleParamCopydefault);
            }
            c21609hFs.OLrzqt.setListener(c25018iom);
            AEQbTJ().OLrzqt().observe(this, new StateListAnimator(new Function1() { // from class: o.lcg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C30515lcc.EZpvd(this.OLrzqt, c21609hFs, (C25301iuD) obj);
                }
            }));
        }
    }

    public static final Unit EZpvd(C30515lcc c30515lcc, C21609hFs c21609hFs, C25301iuD c25301iuD) {
        c30515lcc.EZpvd(c25301iuD.OLrzqt());
        C52794wYp c52794wYpCopydefault = c21609hFs.KWHzl.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setEnabled(!c25301iuD.gEmmrt());
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void EZpvd(java.lang.String str) {
        C21609hFs c21609hFs;
        C25345iuv c25345iuv;
        MinimumReceivedParam minimumReceivedParamEZpvd = KWHzl().EZpvd();
        java.lang.String strEZpvd = minimumReceivedParamEZpvd != null ? minimumReceivedParamEZpvd.EZpvd() : null;
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        MinimumReceivedParam minimumReceivedParamEZpvd2 = KWHzl().EZpvd();
        java.lang.String strOLrzqt = minimumReceivedParamEZpvd2 != null ? minimumReceivedParamEZpvd2.OLrzqt() : null;
        java.lang.String str2 = strOLrzqt != null ? strOLrzqt : "";
        MinimumReceivedParam minimumReceivedParamEZpvd3 = KWHzl().EZpvd();
        if (minimumReceivedParamEZpvd3 != null) {
            minimumReceivedParamEZpvd3.EZpvd(AEQbTJ().EZpvd(C33129mqd.gEmmrt(str), strEZpvd, str2));
        }
        MinimumReceivedParam minimumReceivedParamEZpvd4 = KWHzl().EZpvd();
        if (minimumReceivedParamEZpvd4 == null || (c21609hFs = (C21609hFs) fARcdN()) == null || (c25345iuv = c21609hFs.AEQbTJ) == null) {
            return;
        }
        c25345iuv.setData(minimumReceivedParamEZpvd4);
    }

    private final void valueOf() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        C59541ziw.EZpvd(fragmentActivityRequireActivity, this, new InterfaceC59496ziD() { // from class: o.lcl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59496ziD
            public final void OLrzqt(boolean z) {
                C30515lcc.EZpvd(this.copydefault, z);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(C30515lcc c30515lcc, boolean z) {
        C25308iuK c25308iuK;
        C55008xbo c55008xboAEQbTJ;
        C25308iuK c25308iuK2;
        C55008xbo c55008xboEZpvd;
        if (z) {
            return;
        }
        C21609hFs c21609hFs = (C21609hFs) c30515lcc.fARcdN();
        if (c21609hFs != null && (c25308iuK2 = c21609hFs.EZpvd) != null && (c55008xboEZpvd = c25308iuK2.EZpvd()) != null) {
            c55008xboEZpvd.clearFocus();
        }
        C21609hFs c21609hFs2 = (C21609hFs) c30515lcc.fARcdN();
        if (c21609hFs2 == null || (c25308iuK = c21609hFs2.EZpvd) == null || (c55008xboAEQbTJ = c25308iuK.AEQbTJ()) == null) {
            return;
        }
        c55008xboAEQbTJ.clearFocus();
    }

    /* JADX INFO: renamed from: o.lcc$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C30515lcc AEQbTJ;
        public final /* synthetic */ C25024ios EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C25024ios c25024ios, C30515lcc c30515lcc) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = c25024ios;
            this.AEQbTJ = c30515lcc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C25301iuD c25301iuDCopydefault = this.EZpvd.copydefault();
                if (c25301iuDCopydefault != null) {
                    java.lang.String strOLrzqt = c25301iuDCopydefault.OLrzqt();
                    if (strOLrzqt == null) {
                        strOLrzqt = "";
                    }
                    SlippageMode slippageModeCopydefault = c25301iuDCopydefault.copydefault();
                    java.lang.String strAEQbTJ = c25301iuDCopydefault.AEQbTJ();
                    AdvanceLimitSlippageCache advanceLimitSlippageCache = new AdvanceLimitSlippageCache(strOLrzqt, slippageModeCopydefault, strAEQbTJ != null ? strAEQbTJ : "", c25301iuDCopydefault.KWHzl());
                    FragmentActivity activity = this.AEQbTJ.getActivity();
                    if (activity != null) {
                        activity.setResult(-1, new android.content.Intent().putExtra("data", advanceLimitSlippageCache));
                    }
                    FragmentActivity activity2 = this.AEQbTJ.getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                    }
                }
            }
        }
    }
}
