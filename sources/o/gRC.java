package o;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dex.trade.component.walletorderlist.ui.WalletPageOrderListFragment$setListener$7;
import com.okinc.business.dex.trade.component.walletorderlist.ui.viewmodel.WalletPageOderListViewModel;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gRC extends AbstractC19859gRz<hBW> implements InterfaceC54847xXn {
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.gRA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return gRC.gEmmrt();
        }
    });
    public final InterfaceC56387yDm djBIcL;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0004: CHECK_CAST (o.hBW) (wrap:VB:0x0000: INVOKE (r0v0 o.gRC) VIRTUAL call: o.hTH.fARcdN():androidx.viewbinding.ViewBinding A[MD:():VB extends androidx.viewbinding.ViewBinding (m), WRAPPED] (LINE:29)) */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ hBW EZpvd(gRC grc) {
        return (hBW) grc.fARcdN();
    }

    public gRC() {
        final Function0 function0 = null;
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(WalletPageOderListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.component.walletorderlist.ui.WalletPageOrderListFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.component.walletorderlist.ui.WalletPageOrderListFragment$special$$inlined$activityViewModels$default$2
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
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.component.walletorderlist.ui.WalletPageOrderListFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    public final C19855gRv AYXKKw() {
        return (C19855gRv) this.AhwBna.getValue();
    }

    public static final C19855gRv gEmmrt() {
        return new C19855gRv();
    }

    public final WalletPageOderListViewModel AhwBna() {
        return (WalletPageOderListViewModel) this.djBIcL.getValue();
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.hTH
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public hBW OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hBW hbwAEQbTJ = hBW.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hbwAEQbTJ, "");
        return hbwAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.hTH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull hBW hbw, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(hbw, "");
        hbw.AEQbTJ.djBIcL(false);
        hbw.AEQbTJ.AhwBna(false);
        AYXKKw().EZpvd();
        hbw.valueOf.addItemDecoration(new gRQ());
        hbw.valueOf.setLayoutManager(new LinearLayoutManager(requireContext()));
        hbw.valueOf.setAdapter(AYXKKw());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32996moC
    public void setListener() {
        C33546myW c33546myW;
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXO.class, new java.lang.String[0]);
        final Function1 function1 = new Function1() { // from class: o.gRB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gRC.AEQbTJ(this.copydefault, (xXO) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gRG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gRC.OLrzqt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gRH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gRC.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gRI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gRC.AEQbTJ(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, AhwBna().call());
        AhwBna().OLrzqt();
        AYXKKw().KWHzl(new Function0() { // from class: o.gRF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return gRC.gEmmrt(this.OLrzqt);
            }
        });
        hBW hbw = (hBW) fARcdN();
        if (hbw != null && (c33546myW = hbw.AEQbTJ) != null) {
            c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.gRE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57900yrD
                public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                    gRC.OLrzqt(this.AEQbTJ, interfaceC57934yrl);
                }
            });
        }
        AYXKKw().AEQbTJ(new Function0() { // from class: o.gRN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return gRC.AYXKKw(this.copydefault);
            }
        });
        AYXKKw().KWHzl(new Function1() { // from class: o.gRM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gRC.EZpvd(this.KWHzl, (C20064gZo) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WalletPageOrderListFragment$setListener$7(this, null), 3, null);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(gRC grc, xXO xxo) {
        grc.valueOf();
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(gRC grc) {
        grc.valueOf();
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(gRC grc, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        grc.AhwBna().KWHzl();
    }

    public static final Unit AYXKKw(gRC grc) {
        grc.valueOf();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(gRC grc, C20064gZo c20064gZo) {
        Intrinsics.checkNotNullParameter(c20064gZo, "");
        C22206haw c22206haw = C22206haw.copydefault;
        FragmentActivity fragmentActivityRequireActivity = grc.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        c22206haw.AEQbTJ(fragmentActivityRequireActivity, new C20066gZq(c20064gZo.AYXKKw(), c20064gZo.EZpvd(), c20064gZo.zsXlph(), c20064gZo.djBIcL()), grc.AhwBna().EZpvd(c20064gZo.EZpvd()));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(boolean z) {
        C55113xdn c55113xdn;
        RecyclerView recyclerView;
        hBW hbw = (hBW) fARcdN();
        if (hbw != null && (recyclerView = hbw.valueOf) != null) {
            recyclerView.setVisibility(z ^ true ? 0 : 8);
        }
        hBW hbw2 = (hBW) fARcdN();
        if (hbw2 == null || (c55113xdn = hbw2.copydefault) == null) {
            return;
        }
        c55113xdn.setVisibility(z ? 0 : 8);
    }

    @Override // o.hTH
    public void DbNXlk() {
        valueOf();
    }

    public final void valueOf() {
        if (isAdded()) {
            WalletPageOderListViewModel.loadOrderList$default(AhwBna(), false, 1, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.hTH, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C55113xdn c55113xdn;
        super.onDestroyView();
        hBW hbw = (hBW) fARcdN();
        if (hbw != null && (c55113xdn = hbw.copydefault) != null) {
            c55113xdn.cancelAnimation();
        }
        AhwBna().valueOf();
    }

    @Override // o.InterfaceC54847xXn
    public void KWHzl(long j, long j2, boolean z) {
        if (isAdded()) {
            WalletPageOderListViewModel walletPageOderListViewModelAhwBna = AhwBna();
            java.lang.Long lValueOf = java.lang.Long.valueOf(j2);
            if (!C33129mqd.AhwBna(java.lang.Long.valueOf(lValueOf.longValue()), -1)) {
                lValueOf = null;
            }
            walletPageOderListViewModelAhwBna.AEQbTJ(lValueOf != null ? lValueOf.toString() : null);
        }
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33016moW
    public boolean onRefresh(@NotNull java.lang.Object obj, @NotNull InterfaceC33014moU interfaceC33014moU) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(interfaceC33014moU, "");
        if (isAdded()) {
            valueOf();
        }
        return super.onRefresh(obj, interfaceC33014moU);
    }
}
