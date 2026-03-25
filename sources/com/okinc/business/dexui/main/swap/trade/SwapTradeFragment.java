package com.okinc.business.dexui.main.swap.trade;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dex.api.bean.TradeParam;
import com.okinc.business.dex.trade.order.domain.model.BridgeOrderSubStatus;
import com.okinc.business.dex.trade.order.ui.viewmodel.BridgePagerViewModel;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.SwapBottomParamsBean;
import com.okinc.business.dexlogic.bean.track.ButtonType;
import com.okinc.business.dexlogic.bean.track.EventPageNameType;
import com.okinc.business.dexlogic.bean.track.EventTrackingAmountEnterBy;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import com.okinc.business.dexlogic.bean.track.TrackOrderType;
import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import com.okinc.business.dexlogic.main.swap.trade.bean.CurrentChain;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexlogic.track.enums.BusinessType;
import com.okinc.business.dexlogic.track.enums.DexSwapFullClick;
import com.okinc.business.dexui.main.swap.trade.SwapTradeFragment;
import com.okinc.business.trade.features.home.ui.DexHomeFragment;
import com.okinc.business.trade.features.home.ui.viewmodel.DexHomeViewModel;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.rxutils.SubHelper;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC22410heo;
import o.AbstractC23101hrq;
import o.AbstractC24470ieT;
import o.AbstractC58260yxt;
import o.C19680gLi;
import o.C20066gZq;
import o.C21847hOn;
import o.C22194hak;
import o.C22206haw;
import o.C22372heC;
import o.C22380heK;
import o.C22400hee;
import o.C22806hmM;
import o.C22873hna;
import o.C22877hne;
import o.C23138hsa;
import o.C23263hut;
import o.C23274hvD;
import o.C23304hvh;
import o.C23314hvr;
import o.C23317hvu;
import o.C23328hwE;
import o.C24473ieW;
import o.C25045ipM;
import o.C25248itD;
import o.C25295ity;
import o.C25333iuj;
import o.C25352ivB;
import o.C25445iwp;
import o.C31200lpY;
import o.C33050mpD;
import o.C33070mpX;
import o.C33546myW;
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
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC57901yrE;
import o.InterfaceC57934yrl;
import o.InterfaceC58227yxM;
import o.InterfaceC9738bbJ;
import o.hFV;
import o.pUU;
import o.rVN;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class SwapTradeFragment extends AbstractC24470ieT implements C22806hmM.Activity, InterfaceC19679gLh {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int gEmmrt = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public String DbNXlk;
    public SwapTradeContentFragment ejfBZ;
    public C25333iuj fARcdN;
    public C25045ipM fIwbmz;
    public Function1<? super Boolean, Unit> fJNWhG;
    public Function1<? super Boolean, Unit> getNewProxyInstance;

    @yCM
    public C25445iwp handleBridgeEventTrackUtils;
    public final InterfaceC56387yDm isConnected;
    public hFV values;
    public final Object fetchVPNInfo = new Object();
    public final InterfaceC56387yDm AuCTel = C56392yDr.copydefault(new Function0() { // from class: o.ihl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SwapTradeFragment.ejfBZ(this.AEQbTJ);
        }
    });

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
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
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C23274hvD.Activity.DVmcag;
    }

    public SwapTradeFragment() {
        final Function0 function0 = new Function0() { // from class: o.iho
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapTradeFragment.DbNXlk(this.KWHzl);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dexui.main.swap.trade.SwapTradeFragment$special$$inlined$viewModels$default$1
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(DexHomeViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.swap.trade.SwapTradeFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.swap.trade.SwapTradeFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.swap.trade.SwapTradeFragment$special$$inlined$viewModels$default$4
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
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.ihq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapTradeFragment.values(this.AEQbTJ);
            }
        });
        this.DbNXlk = "";
        final Function0<Fragment> function03 = new Function0<Fragment>() { // from class: com.okinc.business.dexui.main.swap.trade.SwapTradeFragment$special$$inlined$viewModels$default$5
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dexui.main.swap.trade.SwapTradeFragment$special$$inlined$viewModels$default$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BridgePagerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.swap.trade.SwapTradeFragment$special$$inlined$viewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.swap.trade.SwapTradeFragment$special$$inlined$viewModels$default$8
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
                Function0 function04 = function02;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.swap.trade.SwapTradeFragment$special$$inlined$viewModels$default$9
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
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.ihs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapTradeFragment.fetchVPNInfo(this.AEQbTJ);
            }
        });
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexui.main.swap.trade.SwapTradeFragment.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ SwapTradeFragment newInstance$default(TaskDescription taskDescription, String str, TradeParam tradeParam, Function1 function1, int i, Object obj) {
            if ((i & 2) != 0) {
                tradeParam = null;
            }
            return taskDescription.AEQbTJ(str, tradeParam, function1);
        }

        public final SwapTradeFragment AEQbTJ(@NotNull String str, TradeParam tradeParam, @NotNull Function1<? super Boolean, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            SwapTradeFragment swapTradeFragment = new SwapTradeFragment();
            swapTradeFragment.getNewProxyInstance = function1;
            Bundle bundle = new Bundle();
            C31200lpY.EZpvd(bundle, str);
            bundle.putParcelable("trade_data", tradeParam);
            swapTradeFragment.setArguments(bundle);
            return swapTradeFragment;
        }
    }

    public static final class StateListAnimator implements ViewModelProvider.Factory {
        public StateListAnimator() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return new C23138hsa(C23328hwE.Companion.OLrzqt(), SwapTradeFragment.this.AEQbTJ(), SwapTradeFragment.this.EZpvd());
        }
    }

    private final C23138hsa fARcdN() {
        return (C23138hsa) this.AuCTel.getValue();
    }

    public static final C23138hsa ejfBZ(SwapTradeFragment swapTradeFragment) {
        return (C23138hsa) new ViewModelProvider(swapTradeFragment, swapTradeFragment.new StateListAnimator()).get(C23138hsa.class);
    }

    private final DexHomeViewModel fJNWhG() {
        return (DexHomeViewModel) this.isConnected.getValue();
    }

    public static final ViewModelStoreOwner DbNXlk(SwapTradeFragment swapTradeFragment) {
        Object next;
        Iterator it = C59405zgS.EZpvd(swapTradeFragment.getParentFragment(), (Function1<? super Fragment, ? extends Fragment>) ((Function1<? super Object, ? extends Object>) new Function1() { // from class: o.ihx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeFragment.KWHzl((androidx.fragment.app.Fragment) obj);
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
        FragmentActivity fragmentActivityRequireActivity = swapTradeFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return fragmentActivityRequireActivity;
    }

    public static final Fragment KWHzl(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return fragment.getParentFragment();
    }

    public final C25445iwp valueOf() {
        C25445iwp c25445iwp = this.handleBridgeEventTrackUtils;
        if (c25445iwp != null) {
            return c25445iwp;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final C19680gLi values(SwapTradeFragment swapTradeFragment) {
        return new C19680gLi(swapTradeFragment);
    }

    public final C19680gLi AYXKKw() {
        return (C19680gLi) this.AYXKKw.getValue();
    }

    public final BridgePagerViewModel djBIcL() {
        return (BridgePagerViewModel) this.AkhnZx.getValue();
    }

    /* JADX DEBUG: Possible override for method o.ieT.AhwBna()V */
    public final C22194hak AhwBna() {
        return (C22194hak) this.AhwBna.getValue();
    }

    public static final C22194hak fetchVPNInfo(SwapTradeFragment swapTradeFragment) {
        LifecycleOwner viewLifecycleOwner = swapTradeFragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        return new C22194hak(true, viewLifecycleOwner);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v12, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.String] */
    @Override // o.AbstractC23346hwW, o.AbstractC32998moE
    public void onVisible() {
        final String strOLrzqt;
        super.onVisible();
        C23317hvu.valueOf(TabTitleInfo.KEY_BRIDGE);
        AYXKKw().EZpvd();
        djBIcL().OLrzqt(BridgeOrderSubStatus.Pending);
        if (fARcdN().copydefault().getValue() == null) {
            EZpvd(true);
            fARcdN().valueOf();
        }
        fARcdN().AhwBna();
        if (C22372heC.AEQbTJ(AEQbTJ())) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = C23138hsa.getWalletAddress$default(fARcdN(), null, 1, null);
            if (C21847hOn.valueOf()) {
                C21847hOn.KWHzl(false);
                strOLrzqt = "MARKET";
            } else {
                strOLrzqt = DexTrackEventParameter.AEQbTJ.OLrzqt(AEQbTJ());
            }
            if (((CharSequence) objectRef.element).length() == 0) {
                AbstractC58260yxt abstractC58260yxtKWHzl = C58156yvv.KWHzl(C22380heK.OLrzqt.copydefault(AEQbTJ()).fARcdN().OLrzqt(), this);
                final Function1 function1 = new Function1() { // from class: o.ihn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return SwapTradeFragment.KWHzl(objectRef, this, strOLrzqt, (InterfaceC9738bbJ) obj);
                    }
                };
                InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ihw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        SwapTradeFragment.KWHzl(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.iht
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return SwapTradeFragment.OLrzqt((java.lang.Throwable) obj);
                    }
                };
                Intrinsics.copydefault(abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ihv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        SwapTradeFragment.OLrzqt(function12, obj);
                    }
                }));
            } else {
                C22877hne.OLrzqt.KWHzl(AEQbTJ(), strOLrzqt, BusinessType.BRIDGE.getValue(), (String) objectRef.element);
            }
        }
        C25295ity.AEQbTJ(TabTitleInfo.KEY_BRIDGE, "", C25295ity.copydefault(C22372heC.EZpvd(AEQbTJ())), DexTrackEventParameter.AEQbTJ.OLrzqt(AEQbTJ()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KWHzl(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.String] */
    public static final Unit KWHzl(Ref.ObjectRef objectRef, SwapTradeFragment swapTradeFragment, String str, InterfaceC9738bbJ interfaceC9738bbJ) {
        objectRef.element = swapTradeFragment.fARcdN().copydefault(interfaceC9738bbJ);
        C22877hne.OLrzqt.KWHzl(swapTradeFragment.AEQbTJ(), str, BusinessType.BRIDGE.getValue(), (String) objectRef.element);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OLrzqt(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ SwapTradeFragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(View view, long j, SwapTradeFragment swapTradeFragment) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = swapTradeFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.ejfBZ();
            }
        }
    }

    @Override // o.AbstractC23346hwW, o.AbstractC32998moE
    public void onInvisible() {
        AYXKKw().OLrzqt();
        Function1<? super Boolean, Unit> function1 = this.fJNWhG;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
    }

    @Override // o.AbstractC23346hwW, o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        this.values = hFV.AEQbTJ(view);
        EventTrackingAmountEnterBy.Companion.AEQbTJ(EventTrackingAmountEnterBy.Application.KWHzl);
        AuCTel();
    }

    public final void values() {
        ViewStub viewStub;
        ViewStub viewStub2;
        hFV hfv = this.values;
        if (hfv == null || (viewStub = hfv.EZpvd) == null || viewStub.isInLayout() || this.fIwbmz != null) {
            return;
        }
        hFV hfv2 = this.values;
        View viewInflate = (hfv2 == null || (viewStub2 = hfv2.EZpvd) == null) ? null : viewStub2.inflate();
        C25045ipM c25045ipM = viewInflate instanceof C25045ipM ? (C25045ipM) viewInflate : null;
        this.fIwbmz = c25045ipM;
        if (c25045ipM != null) {
            C25248itD c25248itDOLrzqt = c25045ipM.OLrzqt();
            if (c25248itDOLrzqt != null) {
                c25248itDOLrzqt.setVisibility(8);
            }
            try {
                FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
                FrameLayout frameLayoutAYXKKw = c25045ipM.AYXKKw();
                int id = frameLayoutAYXKKw != null ? frameLayoutAYXKKw.getId() : 0;
                SwapTradeContentFragment swapTradeContentFragmentAkhnZx = AkhnZx();
                swapTradeContentFragmentAkhnZx.OLrzqt(this);
                Unit unit = Unit.INSTANCE;
                fragmentTransactionBeginTransaction.replace(id, swapTradeContentFragmentAkhnZx).commitNowAllowingStateLoss();
                isConnected();
            } catch (IllegalStateException e) {
                pUU.copydefault("SwapTradeFragment", "Failed to perform transaction: " + e.getMessage());
            }
        }
        fIwbmz();
        fARcdN().AYXKKw();
    }

    public final void isConnected() {
        RecyclerView recyclerViewEZpvd;
        C25045ipM c25045ipM = this.fIwbmz;
        if (c25045ipM == null || (recyclerViewEZpvd = c25045ipM.EZpvd()) == null) {
            return;
        }
        recyclerViewEZpvd.setLayoutManager(new LinearLayoutManager(requireActivity()));
        recyclerViewEZpvd.setNestedScrollingEnabled(false);
        AhwBna().AEQbTJ();
        recyclerViewEZpvd.setAdapter(AhwBna());
        AhwBna().AEQbTJ(new Function1() { // from class: o.ihr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeFragment.EZpvd(this.KWHzl, (C20066gZq) obj);
            }
        });
        djBIcL().valueOf();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SwapTradeFragment$initBridgeHistoryRecyclerView$1$2(this, null), 3, null);
    }

    public static final Unit EZpvd(SwapTradeFragment swapTradeFragment, C20066gZq c20066gZq) {
        Intrinsics.checkNotNullParameter(c20066gZq, "");
        C22206haw c22206haw = C22206haw.copydefault;
        FragmentActivity fragmentActivityRequireActivity = swapTradeFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        c22206haw.AEQbTJ(fragmentActivityRequireActivity, c20066gZq, "");
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC19679gLh
    public View copydefault() {
        C25333iuj c25333iuj = this.fARcdN;
        if (c25333iuj != null) {
            return c25333iuj;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        this.fARcdN = new C25333iuj(contextRequireContext, null, false, false, false, 30, null);
        DbNXlk();
        return this.fARcdN;
    }

    public final void OLrzqt(boolean z) {
        C25333iuj c25333iuj = this.fARcdN;
        if (c25333iuj != null) {
            c25333iuj.KWHzl(z);
        }
    }

    public final void DbNXlk() {
        C25333iuj c25333iuj = this.fARcdN;
        if (c25333iuj != null) {
            c25333iuj.setOnKlineIconClick(new Function0() { // from class: o.ihm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return SwapTradeFragment.AkhnZx(this.OLrzqt);
                }
            });
            c25333iuj.setOnMoreIconClick(new Function1() { // from class: o.ihj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SwapTradeFragment.EZpvd(this.copydefault, ((java.lang.Integer) obj).intValue());
                }
            });
        }
    }

    public static final Unit AkhnZx(SwapTradeFragment swapTradeFragment) {
        swapTradeFragment.fetchVPNInfo();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(SwapTradeFragment swapTradeFragment, int i) {
        C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, swapTradeFragment.AEQbTJ(), DexSwapFullClick.MORE.getValue(), false, null, 12, null);
        swapTradeFragment.EZpvd(i);
        return Unit.INSTANCE;
    }

    public final void fetchVPNInfo() {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAuCTel;
        String chainId;
        String tokenName;
        String tokenSymbol;
        String chainBWLogoUrl;
        String chainLogoUrl;
        String tokenLogoUrl;
        String originContractAddress;
        C22873hna c22873hnaQUSxYX;
        AbstractC23101hrq abstractC23101hrqAhwBna = AkhnZx().AhwBna();
        if (abstractC23101hrqAhwBna == null || (c22873hnaQUSxYX = abstractC23101hrqAhwBna.QUSxYX()) == null || (dexMultiTokenInfoBeanAuCTel = c22873hnaQUSxYX.valueOf()) == null) {
            dexMultiTokenInfoBeanAuCTel = C23317hvu.AuCTel();
        }
        Context context = getContext();
        if (context != null) {
            String strAEQbTJ = AEQbTJ();
            if (dexMultiTokenInfoBeanAuCTel == null || (chainId = dexMultiTokenInfoBeanAuCTel.getChainId()) == null) {
                chainId = "1";
            }
            String str = chainId;
            String chainName = dexMultiTokenInfoBeanAuCTel != null ? dexMultiTokenInfoBeanAuCTel.getChainName() : null;
            C25352ivB.openMarketDetailPage$default(context, strAEQbTJ, new TokenBase(str, (dexMultiTokenInfoBeanAuCTel == null || (originContractAddress = dexMultiTokenInfoBeanAuCTel.getOriginContractAddress()) == null) ? "" : originContractAddress, (dexMultiTokenInfoBeanAuCTel == null || (tokenLogoUrl = dexMultiTokenInfoBeanAuCTel.getTokenLogoUrl()) == null) ? "" : tokenLogoUrl, (dexMultiTokenInfoBeanAuCTel == null || (chainLogoUrl = dexMultiTokenInfoBeanAuCTel.getChainLogoUrl()) == null) ? "" : chainLogoUrl, (dexMultiTokenInfoBeanAuCTel == null || (chainBWLogoUrl = dexMultiTokenInfoBeanAuCTel.getChainBWLogoUrl()) == null) ? "" : chainBWLogoUrl, (dexMultiTokenInfoBeanAuCTel == null || (tokenSymbol = dexMultiTokenInfoBeanAuCTel.getTokenSymbol()) == null) ? "" : tokenSymbol, (dexMultiTokenInfoBeanAuCTel == null || (tokenName = dexMultiTokenInfoBeanAuCTel.getTokenName()) == null) ? "" : tokenName, -1, 0, 0, 0, null, "view_details", null, "type_swap", chainName == null ? "" : chainName, null, 0, 0, false, null, null, false, true, null, null, null, 0, false, null, null, false, -8442112, null), "trade_bridge", null, new int[0], 8, null);
        }
        AEQbTJ(DexTrackEventParameter.ButtonName.KLINE.getValue());
        fJNWhG().EZpvd(new C22400hee("DEXTrade_Home_FullPage_Click", EventPageNameType.HOME_GENERAL.getPageName(), ButtonType.GENERAL.getType(), TrackButtonName.K_LINE.getButtonName()));
    }

    public final void EZpvd(int i) {
        String strEZpvd;
        C22873hna c22873hnaQUSxYX;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault;
        C24473ieW.StateListAnimator stateListAnimator = C24473ieW.Companion;
        String strAEQbTJ = AEQbTJ();
        String strAEQbTJ2 = AEQbTJ();
        AbstractC23101hrq abstractC23101hrqAhwBna = AkhnZx().AhwBna();
        if (abstractC23101hrqAhwBna == null || (c22873hnaQUSxYX = abstractC23101hrqAhwBna.QUSxYX()) == null || (dexMultiTokenInfoBeanCopydefault = c22873hnaQUSxYX.copydefault()) == null || (strEZpvd = dexMultiTokenInfoBeanCopydefault.getChainId()) == null) {
            strEZpvd = fARcdN().EZpvd();
        }
        String str = strEZpvd;
        Boolean boolGEmmrt = fARcdN().gEmmrt();
        C24473ieW c24473ieWAEQbTJ = stateListAnimator.AEQbTJ(strAEQbTJ, new SwapBottomParamsBean(true, false, null, false, strAEQbTJ2, str, null, false, null, null, null, null, boolGEmmrt != null ? boolGEmmrt.booleanValue() : false, i, true, null, 36804, null), false, TriggeredFrom.Bridge);
        c24473ieWAEQbTJ.KWHzl(new Function1() { // from class: o.ihk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeFragment.KWHzl(this.copydefault, (java.lang.String) obj);
            }
        });
        c24473ieWAEQbTJ.show(getChildFragmentManager(), C24473ieW.class.getName());
        AEQbTJ(DexTrackEventParameter.ButtonName.MORE.getValue());
        EventPageNameType eventPageNameType = EventPageNameType.HOME_GENERAL;
        copydefault(eventPageNameType.getPageName());
        EZpvd(eventPageNameType.getPageName(), ButtonType.GENERAL.getType(), TrackButtonName.K_LINE.getButtonName());
    }

    public static final Unit KWHzl(SwapTradeFragment swapTradeFragment, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        swapTradeFragment.EZpvd(EventPageNameType.HOME_TRADE.getPageName(), ButtonType.GENERAL.getType(), str);
        return Unit.INSTANCE;
    }

    public final void EZpvd(String str, String str2, String str3) {
        valueOf().AEQbTJ(new AbstractC22410heo.ActionBar(fARcdN().EZpvd(), str, BusinessType.BRIDGE.getValue(), "NA", TrackOrderType.BRIDGE.getType(), C56424yEw.gEmmrt(C56390yDp.OLrzqt("button_type", str2), C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, str3))));
    }

    public final void copydefault(String str) {
        valueOf().AEQbTJ(new AbstractC22410heo.Application(fARcdN().EZpvd(), str, BusinessType.BRIDGE.getValue(), "NA", TrackOrderType.BRIDGE.getType(), null, null, 96, null));
    }

    public final void ejfBZ() {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAuCTel;
        String chainId;
        String tokenName;
        String tokenSymbol;
        String chainBWLogoUrl;
        String chainLogoUrl;
        String tokenLogoUrl;
        String originContractAddress;
        C22873hna c22873hnaQUSxYX;
        AbstractC23101hrq abstractC23101hrqAhwBna = AkhnZx().AhwBna();
        if (abstractC23101hrqAhwBna == null || (c22873hnaQUSxYX = abstractC23101hrqAhwBna.QUSxYX()) == null || (dexMultiTokenInfoBeanAuCTel = c22873hnaQUSxYX.valueOf()) == null) {
            dexMultiTokenInfoBeanAuCTel = C23317hvu.AuCTel();
        }
        Context context = getContext();
        if (context != null) {
            String strAEQbTJ = AEQbTJ();
            if (dexMultiTokenInfoBeanAuCTel == null || (chainId = dexMultiTokenInfoBeanAuCTel.getChainId()) == null) {
                chainId = "1";
            }
            String str = chainId;
            String chainName = dexMultiTokenInfoBeanAuCTel != null ? dexMultiTokenInfoBeanAuCTel.getChainName() : null;
            C25352ivB.openMarketDetailPage$default(context, strAEQbTJ, new TokenBase(str, (dexMultiTokenInfoBeanAuCTel == null || (originContractAddress = dexMultiTokenInfoBeanAuCTel.getOriginContractAddress()) == null) ? "" : originContractAddress, (dexMultiTokenInfoBeanAuCTel == null || (tokenLogoUrl = dexMultiTokenInfoBeanAuCTel.getTokenLogoUrl()) == null) ? "" : tokenLogoUrl, (dexMultiTokenInfoBeanAuCTel == null || (chainLogoUrl = dexMultiTokenInfoBeanAuCTel.getChainLogoUrl()) == null) ? "" : chainLogoUrl, (dexMultiTokenInfoBeanAuCTel == null || (chainBWLogoUrl = dexMultiTokenInfoBeanAuCTel.getChainBWLogoUrl()) == null) ? "" : chainBWLogoUrl, (dexMultiTokenInfoBeanAuCTel == null || (tokenSymbol = dexMultiTokenInfoBeanAuCTel.getTokenSymbol()) == null) ? "" : tokenSymbol, (dexMultiTokenInfoBeanAuCTel == null || (tokenName = dexMultiTokenInfoBeanAuCTel.getTokenName()) == null) ? "" : tokenName, -1, 0, 0, 0, null, "view_details", null, "type_swap", chainName == null ? "" : chainName, null, 0, 0, false, null, null, false, true, null, null, null, 0, false, null, null, false, -8442112, null), "trade_swap", null, new int[0], 8, null);
        }
        AEQbTJ(DexTrackEventParameter.ButtonName.KLINE.getValue());
    }

    public final SwapTradeContentFragment AkhnZx() {
        if (this.ejfBZ == null) {
            this.ejfBZ = SwapTradeContentFragment.Companion.copydefault(AEQbTJ(), EZpvd(), this.getNewProxyInstance, new SwapTradeFragment$getTradeFragment$1(this));
        }
        SwapTradeContentFragment swapTradeContentFragment = this.ejfBZ;
        Intrinsics.copydefault(swapTradeContentFragment);
        return swapTradeContentFragment;
    }

    private final void fIwbmz() {
        C25045ipM c25045ipM = this.fIwbmz;
        if (c25045ipM != null) {
            C33546myW c33546myWCopydefault = c25045ipM.copydefault();
            if (c33546myWCopydefault != null) {
                c33546myWCopydefault.setNoMoreDataEffective(false);
            }
            C33546myW c33546myWCopydefault2 = c25045ipM.copydefault();
            if (c33546myWCopydefault2 != null) {
                c33546myWCopydefault2.AhwBna(false);
            }
            C33546myW c33546myWCopydefault3 = c25045ipM.copydefault();
            if (c33546myWCopydefault3 != null) {
                c33546myWCopydefault3.OLrzqt((InterfaceC57901yrE) new Activity(c25045ipM));
            }
            C25248itD c25248itDOLrzqt = c25045ipM.OLrzqt();
            if (c25248itDOLrzqt != null) {
                c25248itDOLrzqt.setOnClickListener(new ActionBar(c25248itDOLrzqt, 1000L, this));
            }
        }
    }

    public static final class Activity implements InterfaceC57901yrE {
        public final /* synthetic */ C25045ipM AEQbTJ;

        public Activity(C25045ipM c25045ipM) {
            this.AEQbTJ = c25045ipM;
        }

        @Override // o.InterfaceC57903yrG
        public void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
            SwapTradeFragment swapTradeFragment = SwapTradeFragment.this;
            final C25045ipM c25045ipM = this.AEQbTJ;
            swapTradeFragment.KWHzl((Function1<? super Boolean, Unit>) new Function1() { // from class: o.ihA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SwapTradeFragment.Activity.OLrzqt(c25045ipM, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            SwapTradeFragment.this.djBIcL().KWHzl(true);
        }

        public static final Unit OLrzqt(C25045ipM c25045ipM, boolean z) {
            C33546myW c33546myWCopydefault = c25045ipM.copydefault();
            if (c33546myWCopydefault != null) {
                c33546myWCopydefault.AEQbTJ();
            }
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC57900yrD
        public void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
            SwapTradeFragment.this.djBIcL().AEQbTJ();
        }
    }

    private final void AuCTel() {
        MutableLiveData<Boolean> mutableLiveDataGEmmrt;
        C23263hut c23263hutDjBIcL = C22380heK.OLrzqt.djBIcL();
        if (c23263hutDjBIcL != null && (mutableLiveDataGEmmrt = c23263hutDjBIcL.gEmmrt()) != null) {
            mutableLiveDataGEmmrt.observe(this, new Application(new Function1() { // from class: o.ihB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SwapTradeFragment.KWHzl(this.OLrzqt, (java.lang.Boolean) obj);
                }
            }));
        }
        fARcdN().KWHzl().observe(this, new Application(new Function1() { // from class: o.ihy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeFragment.KWHzl(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        C23314hvr<CurrentChain> c23314hvrCopydefault = fARcdN().copydefault();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c23314hvrCopydefault.observe(viewLifecycleOwner, new Application(new Function1() { // from class: o.ihC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeFragment.KWHzl(this.copydefault, (CurrentChain) obj);
            }
        }));
        fARcdN().djBIcL().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.ihz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeFragment.AEQbTJ(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final Unit KWHzl(SwapTradeFragment swapTradeFragment, Boolean bool) {
        swapTradeFragment.fARcdN().KWHzl(swapTradeFragment.fARcdN().EZpvd());
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(SwapTradeFragment swapTradeFragment, boolean z) {
        C25333iuj c25333iuj = swapTradeFragment.fARcdN;
        if (c25333iuj != null) {
            c25333iuj.setVisibility(z ? 8 : 0);
        }
        swapTradeFragment.copydefault(z);
        swapTradeFragment.copydefault(EventPageNameType.BRIDGE.getPageName());
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(SwapTradeFragment swapTradeFragment, CurrentChain currentChain) {
        Intrinsics.checkNotNullParameter(currentChain, "");
        swapTradeFragment.DbNXlk = currentChain.getData().getChainName();
        swapTradeFragment.fARcdN().KWHzl(currentChain.getData().getChainId());
        swapTradeFragment.values();
        swapTradeFragment.EZpvd(false);
        rVN.reportFullyDrawn$default((Fragment) swapTradeFragment, true, (String) null, 2, (Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(SwapTradeFragment swapTradeFragment, Boolean bool) {
        View viewKWHzl;
        pUU.EZpvd("SwapTradeFragment", "Bridge history container visibility: " + bool);
        C25045ipM c25045ipM = swapTradeFragment.fIwbmz;
        if (c25045ipM != null && (viewKWHzl = c25045ipM.KWHzl()) != null) {
            viewKWHzl.setVisibility(bool.booleanValue() ? 0 : 8);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexui.main.swap.trade.SwapTradeFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void refresh$default(SwapTradeFragment swapTradeFragment, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        swapTradeFragment.KWHzl((Function1<? super Boolean, Unit>) function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(final Function1<? super Boolean, Unit> function1) {
        this.fJNWhG = function1;
        fJNWhG().KWHzl();
        SwapTradeContentFragment swapTradeContentFragment = this.ejfBZ;
        if (swapTradeContentFragment != null) {
            swapTradeContentFragment.copydefault(new Function1() { // from class: o.ihp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SwapTradeFragment.OLrzqt(function1, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
    }

    public static final Unit OLrzqt(Function1 function1, boolean z) {
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        djBIcL().gEmmrt();
        this.fARcdN = null;
        this.values = null;
        this.ejfBZ = null;
        this.fJNWhG = null;
        this.getNewProxyInstance = null;
        fARcdN().fetchVPNInfo();
        C33050mpD.OLrzqt(this.fetchVPNInfo);
        SubHelper.AEQbTJ(this);
    }

    @Override // o.C22806hmM.Activity
    public void AEQbTJ(DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C25045ipM c25045ipM = this.fIwbmz;
        if (c25045ipM != null) {
            C25248itD c25248itDOLrzqt = c25045ipM.OLrzqt();
            if (c25248itDOLrzqt != null) {
                c25248itDOLrzqt.setCoinInfo(dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getTokenSymbol() : null);
            }
            C25248itD c25248itDOLrzqt2 = c25045ipM.OLrzqt();
            if (c25248itDOLrzqt2 != null) {
                c25248itDOLrzqt2.copydefault(str, str2);
            }
        }
    }

    @Override // o.C22806hmM.Activity
    public void EZpvd(@NotNull Throwable th) {
        C25248itD c25248itDOLrzqt;
        Intrinsics.checkNotNullParameter(th, "");
        C25045ipM c25045ipM = this.fIwbmz;
        if (c25045ipM == null || (c25248itDOLrzqt = c25045ipM.OLrzqt()) == null) {
            return;
        }
        c25248itDOLrzqt.copydefault("", "");
    }

    public final void copydefault(boolean z) {
        C55173xeu c55173xeu;
        C55173xeu c55173xeu2;
        if (!z) {
            hFV hfv = this.values;
            if (hfv == null || (c55173xeu = hfv.OLrzqt) == null) {
                return;
            }
            c55173xeu.setVisibility(8);
            return;
        }
        hFV hfv2 = this.values;
        if (hfv2 != null && (c55173xeu2 = hfv2.OLrzqt) != null) {
            c55173xeu2.setVisibility(0);
            c55173xeu2.setEmptyTypeImage(8);
            c55173xeu2.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultKt));
            c55173xeu2.setSubTitle((CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.UscePu));
            c55173xeu2.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.EZpvd));
            c55173xeu2.setRetryClickListener(new View.OnClickListener() { // from class: o.ihu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    SwapTradeFragment.OLrzqt(this.OLrzqt, view);
                }
            });
        }
        EZpvd(false);
    }

    public static final void OLrzqt(SwapTradeFragment swapTradeFragment, View view) {
        swapTradeFragment.EZpvd(true);
        swapTradeFragment.fARcdN().valueOf();
    }

    private final void EZpvd(boolean z) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        if (z) {
            hFV hfv = this.values;
            if (hfv == null || (frameLayout2 = hfv.KWHzl) == null) {
                return;
            }
            C23304hvh.EZpvd(frameLayout2);
            return;
        }
        hFV hfv2 = this.values;
        if (hfv2 == null || (frameLayout = hfv2.KWHzl) == null) {
            return;
        }
        C57600ylV.AEQbTJ(frameLayout);
    }

    public final void AEQbTJ(String str) {
        C25295ity.KWHzl(TabTitleInfo.KEY_BRIDGE, "", C25295ity.copydefault(C22372heC.EZpvd(AEQbTJ())), str, this.DbNXlk);
    }
}
