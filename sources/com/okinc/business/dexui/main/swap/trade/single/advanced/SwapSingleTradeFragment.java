package com.okinc.business.dexui.main.swap.trade.single.advanced;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dex.api.bean.TradeParam;
import com.okinc.business.dex.trade.component.orderandposition.event.OrderAndPositionEventViewModel;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.SwapBottomParamsBean;
import com.okinc.business.dexlogic.bean.track.ButtonType;
import com.okinc.business.dexlogic.bean.track.EventPageNameType;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import com.okinc.business.dexlogic.bean.track.TrackOrderType;
import com.okinc.business.dexlogic.bean.track.TrackTransactionDirection;
import com.okinc.business.dexlogic.main.swap.trade.bean.CurrentChain;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexlogic.track.enums.BusinessType;
import com.okinc.business.dexlogic.track.enums.DexSwapFullClick;
import com.okinc.business.dexui.main.swap.trade.TriggeredFrom;
import com.okinc.business.dexui.main.swap.trade.single.advanced.SwapSingleTradeFragment;
import com.okinc.business.trade.features.home.ui.DexHomeFragment;
import com.okinc.business.trade.features.home.ui.viewmodel.DexHomeViewModel;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.rxutils.SubHelper;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC22407hel;
import o.AbstractC23101hrq;
import o.AbstractC24863ilp;
import o.AbstractC58260yxt;
import o.C19680gLi;
import o.C19812gQf;
import o.C21603hFm;
import o.C21847hOn;
import o.C22372heC;
import o.C22380heK;
import o.C22400hee;
import o.C22806hmM;
import o.C22831hml;
import o.C22873hna;
import o.C22877hne;
import o.C23122hsK;
import o.C23263hut;
import o.C23274hvD;
import o.C23304hvh;
import o.C23314hvr;
import o.C23317hvu;
import o.C24473ieW;
import o.C25046ipN;
import o.C25248itD;
import o.C25295ity;
import o.C25333iuj;
import o.C25352ivB;
import o.C25390ivn;
import o.C25452iww;
import o.C31200lpY;
import o.C33050mpD;
import o.C33070mpX;
import o.C52761wXj;
import o.C55173xeu;
import o.C55296xhK;
import o.C56390yDp;
import o.C56392yDr;
import o.C56424yEw;
import o.C56524yIo;
import o.C57600ylV;
import o.C58156yvv;
import o.C59405zgS;
import o.InterfaceC19679gLh;
import o.InterfaceC22598hiQ;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC58227yxM;
import o.InterfaceC9738bbJ;
import o.pUU;
import o.rVN;
import o.yCM;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes6.dex */
public final class SwapSingleTradeFragment extends AbstractC24863ilp<C21603hFm> implements C22806hmM.Activity, InterfaceC19679gLh {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int valueOf = 8;
    public final InterfaceC56387yDm AhwBna;
    public C25046ipN AkhnZx;
    public SwapSingleTradeContentFragment AuCTel;
    public Function1<? super Boolean, Unit> fARcdN;
    public C25333iuj fIwbmz;
    public String gEmmrt;

    @yCM
    public C25452iww handleSwapEventTrackUtils;
    public Function1<? super Boolean, Unit> isConnected;
    public final InterfaceC56387yDm values;
    public final Object AYXKKw = new Object();
    public final InterfaceC56387yDm DbNXlk = C19812gQf.OLrzqt(this);
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.inQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SwapSingleTradeFragment.fetchVPNInfo(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.iod
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SwapSingleTradeFragment.AYXKKw(this.AEQbTJ);
        }
    });

    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String isConnected() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.AbstractC24860ilm
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C21603hFm c21603hFm, Bundle bundle) {
        Intrinsics.checkNotNullParameter(c21603hFm, "");
    }

    @Override // o.AbstractC24860ilm, o.AbstractC32996moC
    public int getLayoutId() {
        return -1;
    }

    public SwapSingleTradeFragment() {
        final Function0 function0 = new Function0() { // from class: o.iob
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapSingleTradeFragment.AhwBna(this.AEQbTJ);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dexui.main.swap.trade.single.advanced.SwapSingleTradeFragment$special$$inlined$viewModels$default$1
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
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(DexHomeViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.swap.trade.single.advanced.SwapSingleTradeFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.swap.trade.single.advanced.SwapSingleTradeFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.swap.trade.single.advanced.SwapSingleTradeFragment$special$$inlined$viewModels$default$4
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
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.ioa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapSingleTradeFragment.gEmmrt(this.OLrzqt);
            }
        });
        this.gEmmrt = "";
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexui.main.swap.trade.single.advanced.SwapSingleTradeFragment.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ SwapSingleTradeFragment newInstance$default(StateListAnimator stateListAnimator, String str, TradeParam tradeParam, Function1 function1, int i, Object obj) {
            if ((i & 2) != 0) {
                tradeParam = null;
            }
            return stateListAnimator.AEQbTJ(str, tradeParam, function1);
        }

        public final SwapSingleTradeFragment AEQbTJ(@NotNull String str, TradeParam tradeParam, @NotNull Function1<? super Boolean, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            SwapSingleTradeFragment swapSingleTradeFragment = new SwapSingleTradeFragment();
            swapSingleTradeFragment.fARcdN = function1;
            Bundle bundle = new Bundle();
            C31200lpY.EZpvd(bundle, str);
            bundle.putParcelable("trade_data", tradeParam);
            swapSingleTradeFragment.setArguments(bundle);
            return swapSingleTradeFragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderAndPositionEventViewModel fARcdN() {
        return (OrderAndPositionEventViewModel) this.DbNXlk.getValue();
    }

    public static final class Activity implements ViewModelProvider.Factory {
        public Activity() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return new C23122hsK(SwapSingleTradeFragment.this.zuBGHE(), SwapSingleTradeFragment.this.gHZMYf(), null, 4, null);
        }
    }

    private final C23122hsK AkhnZx() {
        return (C23122hsK) this.fetchVPNInfo.getValue();
    }

    public static final C23122hsK fetchVPNInfo(SwapSingleTradeFragment swapSingleTradeFragment) {
        return (C23122hsK) new ViewModelProvider(swapSingleTradeFragment, swapSingleTradeFragment.new Activity()).get(C23122hsK.class);
    }

    /* JADX DEBUG: Possible override for method o.ilp.KWHzl()V */
    public final C25452iww KWHzl() {
        C25452iww c25452iww = this.handleSwapEventTrackUtils;
        if (c25452iww != null) {
            return c25452iww;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    private final C22831hml fetchVPNInfo() {
        return (C22831hml) this.djBIcL.getValue();
    }

    public static final C22831hml AYXKKw(SwapSingleTradeFragment swapSingleTradeFragment) {
        Fragment fragmentRequireParentFragment = swapSingleTradeFragment.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return (C22831hml) new ViewModelProvider(fragmentRequireParentFragment).get(C22831hml.class);
    }

    private final DexHomeViewModel values() {
        return (DexHomeViewModel) this.values.getValue();
    }

    public static final ViewModelStoreOwner AhwBna(SwapSingleTradeFragment swapSingleTradeFragment) {
        Object next;
        Iterator it = C59405zgS.EZpvd(swapSingleTradeFragment.getParentFragment(), (Function1<? super Fragment, ? extends Fragment>) ((Function1<? super Object, ? extends Object>) new Function1() { // from class: o.inS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeFragment.copydefault((androidx.fragment.app.Fragment) obj);
            }
        })).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Fragment) next) instanceof DexHomeFragment) {
                break;
            }
        }
        Fragment fragment = (Fragment) next;
        if (fragment != null) {
            return fragment;
        }
        FragmentActivity fragmentActivityRequireActivity = swapSingleTradeFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return fragmentActivityRequireActivity;
    }

    public static final Fragment copydefault(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return fragment.getParentFragment();
    }

    private final C19680gLi DbNXlk() {
        return (C19680gLi) this.AhwBna.getValue();
    }

    public static final C19680gLi gEmmrt(SwapSingleTradeFragment swapSingleTradeFragment) {
        return new C19680gLi(swapSingleTradeFragment);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC24860ilm
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C21603hFm EZpvd(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21603hFm c21603hFmCopydefault = C21603hFm.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21603hFmCopydefault, "");
        return c21603hFmCopydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.String] */
    @Override // o.AbstractC32998moE
    public void onVisible() {
        C23317hvu.valueOf("swap");
        C25295ity.AEQbTJ("swap", "swap", C25295ity.copydefault(C22372heC.EZpvd(zuBGHE())), DexTrackEventParameter.AEQbTJ.OLrzqt(zuBGHE()));
        DbNXlk().EZpvd();
        if (AkhnZx().AEQbTJ().getValue() == null) {
            KWHzl(true);
            AkhnZx().valueOf();
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? walletAddress$default = C23122hsK.getWalletAddress$default(AkhnZx(), null, 1, null);
        objectRef.element = walletAddress$default;
        if (((CharSequence) walletAddress$default).length() == 0) {
            AbstractC58260yxt abstractC58260yxtKWHzl = C58156yvv.KWHzl(C22380heK.OLrzqt.copydefault(zuBGHE()).fARcdN().OLrzqt(), this);
            final Function1 function1 = new Function1() { // from class: o.inY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SwapSingleTradeFragment.AEQbTJ(objectRef, this, (InterfaceC9738bbJ) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.inW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    SwapSingleTradeFragment.EZpvd(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.inX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SwapSingleTradeFragment.KWHzl((java.lang.Throwable) obj);
                }
            };
            Intrinsics.copydefault(abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.inZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    SwapSingleTradeFragment.AEQbTJ(function12, obj);
                }
            }));
        } else {
            OLrzqt((String) objectRef.element);
        }
        AkhnZx().AhwBna();
        fetchVPNInfo().EZpvd().setValue(Boolean.TRUE);
        C25333iuj c25333iuj = this.fIwbmz;
        if (c25333iuj != null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            c25333iuj.EZpvd(fragmentActivityRequireActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EZpvd(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.okinc.business.dexui.main.swap.trade.single.advanced.SwapSingleTradeFragment */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.String] */
    public static final Unit AEQbTJ(Ref.ObjectRef objectRef, SwapSingleTradeFragment swapSingleTradeFragment, InterfaceC9738bbJ interfaceC9738bbJ) {
        ?? AEQbTJ = swapSingleTradeFragment.AkhnZx().AEQbTJ(interfaceC9738bbJ);
        objectRef.element = AEQbTJ;
        swapSingleTradeFragment.OLrzqt((String) AEQbTJ);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AEQbTJ(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(Throwable th) {
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC19679gLh
    public View copydefault() {
        C25333iuj c25333iuj = this.fIwbmz;
        if (c25333iuj != null) {
            return c25333iuj;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        this.fIwbmz = new C25333iuj(contextRequireContext, null, true, values().fARcdN(), values().isConnected(), 2, null);
        fIwbmz();
        return this.fIwbmz;
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ SwapSingleTradeFragment OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, SwapSingleTradeFragment swapSingleTradeFragment) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = swapSingleTradeFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.djBIcL();
            }
        }
    }

    public final void OLrzqt(String str) {
        String strOLrzqt;
        if (C21847hOn.valueOf()) {
            C21847hOn.KWHzl(false);
            strOLrzqt = "MARKET";
        } else {
            strOLrzqt = DexTrackEventParameter.AEQbTJ.OLrzqt(zuBGHE());
        }
        C22877hne.OLrzqt.KWHzl(zuBGHE(), strOLrzqt, BusinessType.SWAP.getValue(), str);
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        DbNXlk().OLrzqt();
        Function1<? super Boolean, Unit> function1 = this.isConnected;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        AYXKKw();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void ejfBZ() {
        ViewStub viewStub;
        ViewStub viewStub2;
        C21603hFm c21603hFm = (C21603hFm) AwvSrB();
        if (c21603hFm == null || (viewStub = c21603hFm.OLrzqt) == null || viewStub.isInLayout() || this.AkhnZx != null) {
            return;
        }
        C21603hFm c21603hFm2 = (C21603hFm) AwvSrB();
        View viewInflate = (c21603hFm2 == null || (viewStub2 = c21603hFm2.OLrzqt) == null) ? null : viewStub2.inflate();
        C25046ipN c25046ipN = viewInflate instanceof C25046ipN ? (C25046ipN) viewInflate : null;
        this.AkhnZx = c25046ipN;
        if (c25046ipN != null) {
            c25046ipN.setPaddingRelative(c25046ipN.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit), c25046ipN.getPaddingEnd(), c25046ipN.getPaddingBottom());
            try {
                FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
                int id = c25046ipN.AEQbTJ().getId();
                SwapSingleTradeContentFragment swapSingleTradeContentFragmentValueOf = valueOf();
                swapSingleTradeContentFragmentValueOf.KWHzl(this);
                Unit unit = Unit.INSTANCE;
                fragmentTransactionBeginTransaction.replace(id, swapSingleTradeContentFragmentValueOf).commitNowAllowingStateLoss();
            } catch (IllegalStateException e) {
                pUU.copydefault("SwapSingleTradeFragment", "Failed to perform transaction: " + e.getMessage());
            }
        }
        gEmmrt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(boolean z) {
        C25333iuj c25333iuj = this.fIwbmz;
        if (c25333iuj != null) {
            c25333iuj.KWHzl(z);
        }
    }

    private final void fIwbmz() {
        C25333iuj c25333iuj = this.fIwbmz;
        if (c25333iuj != null) {
            c25333iuj.setOnKlineIconClick(new Function0() { // from class: o.iof
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return SwapSingleTradeFragment.AkhnZx(this.copydefault);
                }
            });
            c25333iuj.setOnMoreIconClick(new Function1() { // from class: o.ioi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SwapSingleTradeFragment.AEQbTJ(this.KWHzl, ((java.lang.Integer) obj).intValue());
                }
            });
        }
    }

    public static final Unit AkhnZx(SwapSingleTradeFragment swapSingleTradeFragment) {
        swapSingleTradeFragment.djBIcL();
        swapSingleTradeFragment.KWHzl().OLrzqt(new AbstractC22407hel.ActionBar(swapSingleTradeFragment.AkhnZx().OLrzqt(), EventPageNameType.SWAP.getPageName(), BusinessType.SWAP.getValue(), TrackTransactionDirection.NA.getValue(), TrackOrderType.SWAP.getType(), C56424yEw.gEmmrt(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, TrackButtonName.K_LINE.getButtonName()), C56390yDp.OLrzqt("button_type", ButtonType.GENERAL.getType()))));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(SwapSingleTradeFragment swapSingleTradeFragment, int i) {
        swapSingleTradeFragment.AhwBna();
        swapSingleTradeFragment.copydefault(i);
        return Unit.INSTANCE;
    }

    private final void copydefault(int i) {
        AbstractC23101hrq abstractC23101hrqDbNXlk = valueOf().DbNXlk();
        C22873hna c22873hnaQUSxYX = abstractC23101hrqDbNXlk != null ? abstractC23101hrqDbNXlk.QUSxYX() : null;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = c22873hnaQUSxYX != null ? c22873hnaQUSxYX.copydefault() : null;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = c22873hnaQUSxYX != null ? c22873hnaQUSxYX.valueOf() : null;
        if ((dexMultiTokenInfoBeanCopydefault == null || !dexMultiTokenInfoBeanCopydefault.isHoneypotToken()) && (dexMultiTokenInfoBeanValueOf == null || !dexMultiTokenInfoBeanValueOf.isHoneypotToken())) {
            InterfaceC22598hiQ interfaceC22598hiQDjBIcL = C22380heK.OLrzqt.copydefault(zuBGHE()).djBIcL();
            String chainId = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainId() : null;
            if (chainId == null) {
                chainId = "";
            }
            DefiChainInfo defiChainInfoKWHzl = interfaceC22598hiQDjBIcL.KWHzl(chainId);
            if (defiChainInfoKWHzl != null) {
                defiChainInfoKWHzl.m6496isSupportBlinksShareUrl();
            }
        }
        C24473ieW.StateListAnimator stateListAnimator = C24473ieW.Companion;
        String strZuBGHE = zuBGHE();
        String strZuBGHE2 = zuBGHE();
        String chainId2 = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainId() : null;
        String str = chainId2 == null ? "" : chainId2;
        String chainName = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainName() : null;
        String str2 = chainName == null ? "" : chainName;
        String tokenSymbol = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getTokenSymbol() : null;
        String str3 = tokenSymbol == null ? "" : tokenSymbol;
        String tokenContractAddress = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getTokenContractAddress() : null;
        String str4 = tokenContractAddress == null ? "" : tokenContractAddress;
        String tokenSymbol2 = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getTokenSymbol() : null;
        String str5 = tokenSymbol2 == null ? "" : tokenSymbol2;
        String tokenContractAddress2 = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getTokenContractAddress() : null;
        String str6 = tokenContractAddress2 == null ? "" : tokenContractAddress2;
        Boolean boolKWHzl = AkhnZx().KWHzl();
        C24473ieW c24473ieWAEQbTJ = stateListAnimator.AEQbTJ(strZuBGHE, new SwapBottomParamsBean(true, false, null, false, strZuBGHE2, str, str2, false, str3, str4, str5, str6, boolKWHzl != null ? boolKWHzl.booleanValue() : false, i, true, "advanced", CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA, null), true, TriggeredFrom.SwapMarket);
        c24473ieWAEQbTJ.KWHzl(new Function1() { // from class: o.ioc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeFragment.OLrzqt(this.EZpvd, (java.lang.String) obj);
            }
        });
        C25452iww c25452iwwKWHzl = KWHzl();
        EventPageNameType eventPageNameType = EventPageNameType.HOME_GENERAL;
        String pageName = eventPageNameType.getPageName();
        String strOLrzqt = AkhnZx().OLrzqt();
        BusinessType businessType = BusinessType.SWAP;
        String value = businessType.getValue();
        TrackTransactionDirection trackTransactionDirection = TrackTransactionDirection.NA;
        String value2 = trackTransactionDirection.getValue();
        TrackOrderType trackOrderType = TrackOrderType.SWAP;
        c25452iwwKWHzl.OLrzqt(new AbstractC22407hel.ActionBar(strOLrzqt, pageName, value, value2, trackOrderType.getType(), C56424yEw.gEmmrt(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, TrackButtonName.GENERAL_INFO.getButtonName()), C56390yDp.OLrzqt("button_type", ButtonType.GENERAL.getType()))));
        KWHzl().OLrzqt(new AbstractC22407hel.PendingIntent(AkhnZx().OLrzqt(), eventPageNameType.getPageName(), businessType.getValue(), trackTransactionDirection.getValue(), trackOrderType.getType(), null, null, 96, null));
        c24473ieWAEQbTJ.show(getChildFragmentManager(), C24473ieW.class.getName());
        copydefault(DexTrackEventParameter.ButtonName.MORE.getValue());
    }

    public static final Unit OLrzqt(SwapSingleTradeFragment swapSingleTradeFragment, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        swapSingleTradeFragment.KWHzl().OLrzqt(new AbstractC22407hel.ActionBar(swapSingleTradeFragment.AkhnZx().OLrzqt(), EventPageNameType.HOME_TRADE.getPageName(), BusinessType.SWAP.getValue(), TrackTransactionDirection.NA.getValue(), TrackOrderType.SWAP.getType(), C56424yEw.gEmmrt(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, str), C56390yDp.OLrzqt("button_type", ButtonType.GENERAL.getType()))));
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf;
        String chainId;
        String tokenName;
        String tokenSymbol;
        String chainBWLogoUrl;
        String chainLogoUrl;
        String tokenLogoUrl;
        String originContractAddress;
        C22873hna c22873hnaQUSxYX;
        AbstractC23101hrq abstractC23101hrqDbNXlk = valueOf().DbNXlk();
        if (abstractC23101hrqDbNXlk == null || (c22873hnaQUSxYX = abstractC23101hrqDbNXlk.QUSxYX()) == null || (dexMultiTokenInfoBeanValueOf = c22873hnaQUSxYX.valueOf()) == null) {
            dexMultiTokenInfoBeanValueOf = C22380heK.OLrzqt.copydefault(zuBGHE()).fJNWhG().valueOf();
        }
        Context context = getContext();
        if (context != null) {
            String strZuBGHE = zuBGHE();
            if (dexMultiTokenInfoBeanValueOf == null || (chainId = dexMultiTokenInfoBeanValueOf.getChainId()) == null) {
                chainId = "1";
            }
            String str = chainId;
            String chainName = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getChainName() : null;
            C25352ivB.openMarketDetailPage$default(context, strZuBGHE, new TokenBase(str, (dexMultiTokenInfoBeanValueOf == null || (originContractAddress = dexMultiTokenInfoBeanValueOf.getOriginContractAddress()) == null) ? "" : originContractAddress, (dexMultiTokenInfoBeanValueOf == null || (tokenLogoUrl = dexMultiTokenInfoBeanValueOf.getTokenLogoUrl()) == null) ? "" : tokenLogoUrl, (dexMultiTokenInfoBeanValueOf == null || (chainLogoUrl = dexMultiTokenInfoBeanValueOf.getChainLogoUrl()) == null) ? "" : chainLogoUrl, (dexMultiTokenInfoBeanValueOf == null || (chainBWLogoUrl = dexMultiTokenInfoBeanValueOf.getChainBWLogoUrl()) == null) ? "" : chainBWLogoUrl, (dexMultiTokenInfoBeanValueOf == null || (tokenSymbol = dexMultiTokenInfoBeanValueOf.getTokenSymbol()) == null) ? "" : tokenSymbol, (dexMultiTokenInfoBeanValueOf == null || (tokenName = dexMultiTokenInfoBeanValueOf.getTokenName()) == null) ? "" : tokenName, -1, 0, 0, 0, null, "view_details", null, "type_swap", chainName == null ? "" : chainName, null, 0, 0, false, null, null, false, true, null, null, null, 0, false, null, null, false, -8442112, null), "trade_swap", null, new int[0], 8, null);
        }
        copydefault(DexTrackEventParameter.ButtonName.KLINE.getValue());
        KWHzl().OLrzqt(new AbstractC22407hel.ActionBar(AkhnZx().OLrzqt(), EventPageNameType.HOME_GENERAL.getPageName(), BusinessType.SWAP.getValue(), TrackTransactionDirection.NA.getValue(), TrackOrderType.SWAP.getType(), C56424yEw.gEmmrt(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, TrackButtonName.K_LINE.getButtonName()), C56390yDp.OLrzqt("button_type", ButtonType.GENERAL.getType()))));
    }

    public final void AhwBna() {
        C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, zuBGHE(), DexSwapFullClick.MORE.getValue(), false, null, 12, null);
    }

    public final SwapSingleTradeContentFragment valueOf() {
        if (this.AuCTel == null) {
            this.AuCTel = SwapSingleTradeContentFragment.Companion.AEQbTJ(zuBGHE(), gHZMYf(), this.fARcdN, new SwapSingleTradeFragment$getTradeFragment$1(this));
        }
        SwapSingleTradeContentFragment swapSingleTradeContentFragment = this.AuCTel;
        Intrinsics.copydefault(swapSingleTradeContentFragment);
        return swapSingleTradeContentFragment;
    }

    private final void gEmmrt() {
        C25046ipN c25046ipN = this.AkhnZx;
        if (c25046ipN != null) {
            C25390ivn.EZpvd(this, fARcdN().gEmmrt(), Lifecycle.State.RESUMED, new ActionBar());
            C25248itD c25248itDOLrzqt = c25046ipN.OLrzqt();
            c25248itDOLrzqt.setOnClickListener(new Application(c25248itDOLrzqt, 1000L, this));
        }
        values().EZpvd().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.inV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeFragment.EZpvd(this.OLrzqt, (C22400hee) obj);
            }
        }));
    }

    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
            final SwapSingleTradeFragment swapSingleTradeFragment = SwapSingleTradeFragment.this;
            swapSingleTradeFragment.KWHzl((Function1<? super Boolean, Unit>) new Function1() { // from class: o.ioo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SwapSingleTradeFragment.ActionBar.KWHzl(swapSingleTradeFragment, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(SwapSingleTradeFragment swapSingleTradeFragment, boolean z) {
            swapSingleTradeFragment.fARcdN().KWHzl();
            return Unit.INSTANCE;
        }
    }

    public static final Unit EZpvd(SwapSingleTradeFragment swapSingleTradeFragment, C22400hee c22400hee) {
        if (Intrinsics.EZpvd((Object) swapSingleTradeFragment.fetchVPNInfo().KWHzl().getValue(), (Object) "swap")) {
            if (Intrinsics.EZpvd((Object) c22400hee.EZpvd(), (Object) "DEXTrade_Home_FullPage_Click")) {
                swapSingleTradeFragment.KWHzl().OLrzqt(new AbstractC22407hel.ActionBar(swapSingleTradeFragment.AkhnZx().OLrzqt(), EventPageNameType.HOME_GENERAL.getPageName(), BusinessType.SWAP.getValue(), TrackTransactionDirection.NA.getValue(), TrackOrderType.SWAP.getType(), C56424yEw.gEmmrt(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, c22400hee.copydefault()), C56390yDp.OLrzqt("button_type", c22400hee.AEQbTJ()), C56390yDp.OLrzqt("mode_select", c22400hee.copydefault()))));
            } else if (Intrinsics.EZpvd((Object) c22400hee.EZpvd(), (Object) "DEXTrade_Home_FullPage_View")) {
                swapSingleTradeFragment.KWHzl().OLrzqt(new AbstractC22407hel.PendingIntent(swapSingleTradeFragment.AkhnZx().OLrzqt(), c22400hee.KWHzl(), BusinessType.SWAP.getValue(), TrackTransactionDirection.NA.getValue(), TrackOrderType.SWAP.getType(), null, null, 96, null));
            }
        }
        return Unit.INSTANCE;
    }

    private final void AYXKKw() {
        MutableLiveData<Boolean> mutableLiveDataGEmmrt;
        C23263hut c23263hutDjBIcL = C22380heK.OLrzqt.djBIcL();
        if (c23263hutDjBIcL != null && (mutableLiveDataGEmmrt = c23263hutDjBIcL.gEmmrt()) != null) {
            mutableLiveDataGEmmrt.observe(this, new TaskDescription(new Function1() { // from class: o.ioj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SwapSingleTradeFragment.EZpvd(this.OLrzqt, (java.lang.Boolean) obj);
                }
            }));
        }
        AkhnZx().copydefault().observe(this, new TaskDescription(new Function1() { // from class: o.ioh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeFragment.OLrzqt(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        C23314hvr<CurrentChain> c23314hvrAEQbTJ = AkhnZx().AEQbTJ();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c23314hvrAEQbTJ.observe(viewLifecycleOwner, new TaskDescription(new Function1() { // from class: o.inR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeFragment.KWHzl(this.OLrzqt, (CurrentChain) obj);
            }
        }));
    }

    public static final Unit EZpvd(SwapSingleTradeFragment swapSingleTradeFragment, Boolean bool) {
        swapSingleTradeFragment.AkhnZx().EZpvd(swapSingleTradeFragment.AkhnZx().OLrzqt());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(SwapSingleTradeFragment swapSingleTradeFragment, boolean z) {
        C25333iuj c25333iuj = swapSingleTradeFragment.fIwbmz;
        if (c25333iuj != null) {
            c25333iuj.setVisibility(z ? 8 : 0);
        }
        swapSingleTradeFragment.OLrzqt(z);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(SwapSingleTradeFragment swapSingleTradeFragment, CurrentChain currentChain) {
        Intrinsics.checkNotNullParameter(currentChain, "");
        swapSingleTradeFragment.gEmmrt = currentChain.getData().getChainName();
        swapSingleTradeFragment.fetchVPNInfo().copydefault(currentChain.getData().getChainName());
        swapSingleTradeFragment.AkhnZx().EZpvd(currentChain.getData().getChainId());
        swapSingleTradeFragment.ejfBZ();
        swapSingleTradeFragment.KWHzl(false);
        rVN.reportFullyDrawn$default((Fragment) swapSingleTradeFragment, true, (String) null, 2, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexui.main.swap.trade.single.advanced.SwapSingleTradeFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void refresh$default(SwapSingleTradeFragment swapSingleTradeFragment, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        swapSingleTradeFragment.KWHzl((Function1<? super Boolean, Unit>) function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(final Function1<? super Boolean, Unit> function1) {
        this.isConnected = function1;
        values().KWHzl();
        SwapSingleTradeContentFragment swapSingleTradeContentFragment = this.AuCTel;
        if (swapSingleTradeContentFragment != null) {
            swapSingleTradeContentFragment.AEQbTJ(new Function1() { // from class: o.ioe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SwapSingleTradeFragment.copydefault(function1, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
    }

    public static final Unit copydefault(Function1 function1, boolean z) {
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.fIwbmz = null;
        this.AuCTel = null;
        this.isConnected = null;
        this.fARcdN = null;
        C33050mpD.OLrzqt(this.AYXKKw);
        SubHelper.AEQbTJ(this);
    }

    @Override // o.C22806hmM.Activity
    public void AEQbTJ(DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C25046ipN c25046ipN = this.AkhnZx;
        if (c25046ipN != null) {
            C25248itD c25248itDOLrzqt = c25046ipN.OLrzqt();
            if (c25248itDOLrzqt != null) {
                c25248itDOLrzqt.setCoinInfo(dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getTokenSymbol() : null);
            }
            C25248itD c25248itDOLrzqt2 = c25046ipN.OLrzqt();
            if (c25248itDOLrzqt2 != null) {
                c25248itDOLrzqt2.copydefault(str, str2);
            }
        }
    }

    @Override // o.C22806hmM.Activity
    public void EZpvd(@NotNull Throwable th) {
        C25248itD c25248itDOLrzqt;
        Intrinsics.checkNotNullParameter(th, "");
        C25046ipN c25046ipN = this.AkhnZx;
        if (c25046ipN == null || (c25248itDOLrzqt = c25046ipN.OLrzqt()) == null) {
            return;
        }
        c25248itDOLrzqt.copydefault("", "");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OLrzqt(boolean z) {
        C55173xeu c55173xeu;
        C55173xeu c55173xeu2;
        if (z) {
            C21603hFm c21603hFm = (C21603hFm) AwvSrB();
            if (c21603hFm != null && (c55173xeu2 = c21603hFm.copydefault) != null) {
                c55173xeu2.setVisibility(0);
                c55173xeu2.setEmptyTypeImage(8);
                c55173xeu2.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultKt));
                c55173xeu2.setSubTitle((CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.UscePu));
                c55173xeu2.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.EZpvd));
                c55173xeu2.setRetryClickListener(new View.OnClickListener() { // from class: o.iog
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        SwapSingleTradeFragment.KWHzl(this.AEQbTJ, view);
                    }
                });
            }
            KWHzl(false);
            return;
        }
        C21603hFm c21603hFm2 = (C21603hFm) AwvSrB();
        if (c21603hFm2 == null || (c55173xeu = c21603hFm2.copydefault) == null) {
            return;
        }
        c55173xeu.setVisibility(8);
    }

    public static final void KWHzl(SwapSingleTradeFragment swapSingleTradeFragment, View view) {
        swapSingleTradeFragment.KWHzl(true);
        swapSingleTradeFragment.AkhnZx().valueOf();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void KWHzl(boolean z) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        if (z) {
            C21603hFm c21603hFm = (C21603hFm) AwvSrB();
            if (c21603hFm == null || (frameLayout2 = c21603hFm.EZpvd) == null) {
                return;
            }
            C23304hvh.EZpvd(frameLayout2);
            return;
        }
        C21603hFm c21603hFm2 = (C21603hFm) AwvSrB();
        if (c21603hFm2 == null || (frameLayout = c21603hFm2.EZpvd) == null) {
            return;
        }
        C57600ylV.AEQbTJ(frameLayout);
    }

    private final void copydefault(String str) {
        C25295ity.KWHzl("swap", "advanced", C25295ity.copydefault(C22372heC.EZpvd(zuBGHE())), str, isConnected());
    }
}
