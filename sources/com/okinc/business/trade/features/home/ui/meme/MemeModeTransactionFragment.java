package com.okinc.business.trade.features.home.ui.meme;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.camera.video.AudioStats;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleCompat;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.tabs.TabLayout;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dex.trade.component.orderandposition.event.OrderAndPositionEventViewModel;
import com.okinc.business.dex.trade.component.orderandposition.ordertab.OrderAndPositionTabComponentFragment;
import com.okinc.business.dex.utils.CDNSourceManager;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MemeTransactionParams;
import com.okinc.business.dexlogic.bean.SwapBottomParamsBean;
import com.okinc.business.dexlogic.bean.TokenInfoForApp;
import com.okinc.business.dexlogic.bean.TransactionDirection;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.dexlogic.bean.track.ButtonType;
import com.okinc.business.dexlogic.bean.track.EventPageNameType;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import com.okinc.business.dexlogic.bean.track.TrackOrderType;
import com.okinc.business.dexlogic.bean.track.TrackTransactionDirection;
import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.SwapState;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexui.main.swap.trade.TriggeredFrom;
import com.okinc.business.trade.features.home.domain.model.TradingBizType;
import com.okinc.business.trade.features.home.domain.model.TradingType;
import com.okinc.business.trade.features.home.meme.viewmodel.transaction.MemeModeTransactionViewModel;
import com.okinc.business.trade.features.home.ui.DexHomeFragment;
import com.okinc.business.trade.features.home.ui.meme.MemeModeTransactionFragment;
import com.okinc.business.trade.features.home.ui.meme.buy.MemeModeBuyNewFragment;
import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import com.okinc.business.trade.features.home.ui.meme.data.MemeStrategyType;
import com.okinc.business.trade.features.home.ui.uistate.SearchMemeUiState;
import com.okinc.business.trade.features.home.ui.uistate.preset.MemePresetConfigAndToken;
import com.okinc.business.trade.features.home.ui.viewmodel.DexHomeViewModel;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC22401hef;
import o.AbstractC22421hez;
import o.AbstractC30827liW;
import o.AbstractC30893ljj;
import o.AbstractC43238rlX;
import o.AbstractC58185ywX;
import o.C19680gLi;
import o.C19816gQj;
import o.C19818gQl;
import o.C21588hEy;
import o.C22281hcR;
import o.C22372heC;
import o.C22374heE;
import o.C22380heK;
import o.C22416heu;
import o.C22830hmk;
import o.C23274hvD;
import o.C23311hvo;
import o.C23314hvr;
import o.C23317hvu;
import o.C24371ica;
import o.C24473ieW;
import o.C25295ity;
import o.C25333iuj;
import o.C25352ivB;
import o.C25390ivn;
import o.C25444iwo;
import o.C25446iwq;
import o.C25632jAp;
import o.C28385kZl;
import o.C30922lkL;
import o.C30957lku;
import o.C31055lmm;
import o.C31123loA;
import o.C31125loC;
import o.C31172lox;
import o.C31200lpY;
import o.C31204lpc;
import o.C33050mpD;
import o.C43251rlk;
import o.C52761wXj;
import o.C55173xeu;
import o.C55296xhK;
import o.C55298xhM;
import o.C55326xho;
import o.C56390yDp;
import o.C56392yDr;
import o.C56402yEa;
import o.C56423yEv;
import o.C56424yEw;
import o.C56524yIo;
import o.C57600ylV;
import o.C58156yvv;
import o.C59405zgS;
import o.C9706bae;
import o.C9860bdZ;
import o.InterfaceC19679gLh;
import o.InterfaceC19811gQe;
import o.InterfaceC22672hjl;
import o.InterfaceC28223kTl;
import o.InterfaceC28268kVc;
import o.InterfaceC43294rma;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.gKZ;
import o.hEJ;
import o.kVW;
import o.pUU;
import o.rVN;
import o.xXO;
import o.yCM;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeModeTransactionFragment extends AbstractC30893ljj<C21588hEy> implements InterfaceC19679gLh, InterfaceC19811gQe {
    public static final Activity Companion = new Activity(null);
    public static final int valueOf = 8;
    public final InterfaceC56387yDm AYXKKw;
    public TokenBase AhwBna;
    public Function1<? super TransactionType, Unit> AkhnZx;
    public Object AuCTel;
    public C25333iuj AuCTelauCTel;
    public TokenBase AubY;
    public final InterfaceC56387yDm DbNXlk;

    @yCM
    public C9706bae deeplinkReferralCodeHandler;
    public final MemeModeTransactionFragment$checkMemeUnavailableObserver$1 djBIcL;
    public C55173xeu fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm getFieldNames;
    public MemeModeBuyNewFragment getNewProxyInstance;
    public final PendingIntent hDKMBd;

    @yCM
    public C25446iwq handleMemeEventTrackUtils;
    public final boolean isConnected;
    public C31055lmm iwGUEr;
    public final InterfaceC56387yDm uzCIH;
    public long values;
    public int wlaJM;
    public InterfaceC58217yxC zLjUOn;
    public final String zsXlph;

    public static final /* synthetic */ class Fragment implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(Function1 function1) {
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

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TradingType.values().length];
            try {
                iArr[TradingType.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TradingType.Meme.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TradingType.Bridge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ C21588hEy valueOf(MemeModeTransactionFragment memeModeTransactionFragment) {
        return (C21588hEy) memeModeTransactionFragment.fARcdN();
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [com.okinc.business.trade.features.home.ui.meme.MemeModeTransactionFragment$checkMemeUnavailableObserver$1] */
    public MemeModeTransactionFragment() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.trade.features.home.ui.meme.MemeModeTransactionFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.meme.MemeModeTransactionFragment$special$$inlined$viewModels$default$2
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
        this.uzCIH = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MemeModeTransactionViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.meme.MemeModeTransactionFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.meme.MemeModeTransactionFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.meme.MemeModeTransactionFragment$special$$inlined$viewModels$default$5
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
        final Function0 function03 = new Function0() { // from class: o.ljX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MemeModeTransactionFragment.fIwbmz(this.AEQbTJ);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.meme.MemeModeTransactionFragment$special$$inlined$viewModels$default$6
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(DexHomeViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.meme.MemeModeTransactionFragment$special$$inlined$viewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.meme.MemeModeTransactionFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.meme.MemeModeTransactionFragment$special$$inlined$viewModels$default$9
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
        this.AuCTel = new Object();
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.ljZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MemeModeTransactionFragment.fetchVPNInfo(this.KWHzl);
            }
        });
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.ljW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MemeModeTransactionFragment.fARcdN(this.AEQbTJ);
            }
        });
        this.isConnected = true;
        final Function0<androidx.fragment.app.Fragment> function04 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.trade.features.home.ui.meme.MemeModeTransactionFragment$special$$inlined$viewModels$default$10
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd3 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.meme.MemeModeTransactionFragment$special$$inlined$viewModels$default$11
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
        this.getFieldNames = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(OrderAndPositionEventViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.meme.MemeModeTransactionFragment$special$$inlined$viewModels$default$12
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.meme.MemeModeTransactionFragment$special$$inlined$viewModels$default$13
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
                Function0 function05 = function02;
                if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.meme.MemeModeTransactionFragment$special$$inlined$viewModels$default$14
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.zsXlph = "meme_mode_asset_push";
        this.djBIcL = new LifecycleEventObserver() { // from class: com.okinc.business.trade.features.home.ui.meme.MemeModeTransactionFragment$checkMemeUnavailableObserver$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                Intrinsics.checkNotNullParameter(event, "");
                if (event == Lifecycle.Event.ON_RESUME) {
                    lifecycleOwner.getLifecycle().removeObserver(this);
                    if (this.KWHzl.fetchVPNInfo().getFieldNames()) {
                        this.KWHzl.values();
                    }
                }
            }
        };
        this.hDKMBd = new PendingIntent();
    }

    public final MemeModeTransactionViewModel fetchVPNInfo() {
        return (MemeModeTransactionViewModel) this.uzCIH.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DexHomeViewModel getFieldNames() {
        return (DexHomeViewModel) this.gEmmrt.getValue();
    }

    public static final ViewModelStoreOwner fIwbmz(MemeModeTransactionFragment memeModeTransactionFragment) {
        Object next;
        Intrinsics.copydefault(memeModeTransactionFragment, "");
        Iterator it = C59405zgS.EZpvd(memeModeTransactionFragment, (Function1<? super MemeModeTransactionFragment, ? extends MemeModeTransactionFragment>) ((Function1<? super Object, ? extends Object>) new Function1() { // from class: o.ljy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeModeTransactionFragment.OLrzqt((androidx.fragment.app.Fragment) obj);
            }
        })).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((androidx.fragment.app.Fragment) next) instanceof DexHomeFragment) {
                break;
            }
        }
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
        if (fragment != null) {
            return fragment;
        }
        FragmentActivity fragmentActivityRequireActivity = memeModeTransactionFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return fragmentActivityRequireActivity;
    }

    public static final androidx.fragment.app.Fragment OLrzqt(androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return fragment.getParentFragment();
    }

    public static final C19680gLi fetchVPNInfo(MemeModeTransactionFragment memeModeTransactionFragment) {
        return new C19680gLi(memeModeTransactionFragment);
    }

    private final C19680gLi getNewProxyInstance() {
        return (C19680gLi) this.AYXKKw.getValue();
    }

    private final String zsXlph() {
        return (String) this.DbNXlk.getValue();
    }

    public static final String fARcdN(MemeModeTransactionFragment memeModeTransactionFragment) {
        String string;
        Bundle arguments = memeModeTransactionFragment.getArguments();
        return (arguments == null || (string = arguments.getString("transaction_amount", "")) == null) ? "" : string;
    }

    public final C25446iwq AhwBna() {
        C25446iwq c25446iwq = this.handleMemeEventTrackUtils;
        if (c25446iwq != null) {
            return c25446iwq;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C9706bae AYXKKw() {
        C9706bae c9706bae = this.deeplinkReferralCodeHandler;
        if (c9706bae != null) {
            return c9706bae;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC19811gQe
    public ViewPager2 KWHzl() {
        C21588hEy c21588hEy = (C21588hEy) fARcdN();
        if (c21588hEy != null) {
            return c21588hEy.DbNXlk;
        }
        return null;
    }

    public OrderAndPositionEventViewModel AkhnZx() {
        return (OrderAndPositionEventViewModel) this.getFieldNames.getValue();
    }

    /* JADX DEBUG: Possible override for method o.ljj.OLrzqt()V */
    @Override // o.InterfaceC19811gQe
    public C19818gQl OLrzqt() {
        return zLjUOn();
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ MemeModeTransactionFragment EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, MemeModeTransactionFragment memeModeTransactionFragment) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = memeModeTransactionFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.values();
                androidx.fragment.app.Fragment parentFragment = this.EZpvd.getParentFragment();
                TokenBase tokenBase = null;
                C31204lpc c31204lpc = parentFragment instanceof C31204lpc ? (C31204lpc) parentFragment : null;
                if (c31204lpc != null) {
                    c31204lpc.dismiss();
                }
                C25446iwq c25446iwqAhwBna = this.EZpvd.AhwBna();
                String pageName = EventPageNameType.QUICK.getPageName();
                String strEZpvd = C25444iwo.EZpvd(C31125loC.KWHzl(this.EZpvd));
                TokenBase tokenBase2 = this.EZpvd.AubY;
                if (tokenBase2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    tokenBase = tokenBase2;
                }
                c25446iwqAhwBna.copydefault(new AbstractC22401hef.TaskDescription(tokenBase.getChainId(), pageName, strEZpvd, (this.EZpvd.fetchVPNInfo().fetchVPNInfo().getValue() == TransactionType.Buy ? TrackTransactionDirection.BUY : TrackTransactionDirection.SELL).getValue(), AbstractC22421hez.Companion.KWHzl(), C56424yEw.gEmmrt(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, DexTrackEventParameter.ButtonName.GOTOADVANCED_MODE.getValue()), C56390yDp.OLrzqt("button_type", ButtonType.TRADE.getType()), C56390yDp.OLrzqt("popup_source", this.EZpvd.fetchVPNInfo().AEQbTJ(C31125loC.KWHzl(this.EZpvd)))), null, 64, null));
            }
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.meme.MemeModeTransactionFragment.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final MemeModeTransactionFragment KWHzl(@NotNull String str, TokenBase tokenBase, int i, @NotNull String str2, @NotNull String str3, int i2, TokenBase tokenBase2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Bundle bundle = new Bundle();
            C31200lpY.EZpvd(bundle, str);
            bundle.putParcelable("transaction_token", tokenBase);
            bundle.putInt("index", i);
            bundle.putString("transaction_amount", str2);
            bundle.putString("limit_strategy_type", str3);
            C31125loC.copydefault(bundle, i2);
            bundle.putParcelable("currency_token", tokenBase2);
            MemeModeTransactionFragment memeModeTransactionFragment = new MemeModeTransactionFragment();
            memeModeTransactionFragment.setArguments(bundle);
            return memeModeTransactionFragment;
        }
    }

    @Override // o.hTH, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fetchVPNInfo().copydefault(C31125loC.KWHzl(this));
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.hTH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C21588hEy OLrzqt(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21588hEy c21588hEyAEQbTJ = C21588hEy.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21588hEyAEQbTJ, "");
        return c21588hEyAEQbTJ;
    }

    private final int wlaJM() {
        Bundle arguments = getArguments();
        Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt("index")) : null;
        C22380heK c22380heK = C22380heK.OLrzqt;
        MemeTransactionParams value = c22380heK.copydefault(AuCTel()).values().getValue();
        Integer numValueOf2 = value != null ? Integer.valueOf(value.getTransaction_direction()) : null;
        if ((numValueOf2 == null || numValueOf2.intValue() != -1) && numValueOf2 != null) {
            return numValueOf2.intValue();
        }
        if ((numValueOf == null || numValueOf.intValue() != -1) && numValueOf != null) {
            return numValueOf.intValue();
        }
        return c22380heK.copydefault(AuCTel()).fetchVPNInfo().isConnected();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void isConnected() {
        C31123loA c31123loA;
        fetchVPNInfo().fetchVPNInfo().setValue(this.wlaJM == 0 ? TransactionType.Buy : TransactionType.Sell);
        C21588hEy c21588hEy = (C21588hEy) fARcdN();
        if (c21588hEy != null && (c31123loA = c21588hEy.AkhnZx) != null) {
            c31123loA.setVisibility(0);
        }
        fJNWhG();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fJNWhG() {
        C22281hcR c22281hcR;
        if (C31172lox.KWHzl(C31125loC.KWHzl(this), C31172lox.Companion.OLrzqt())) {
            C21588hEy c21588hEy = (C21588hEy) fARcdN();
            if (c21588hEy == null || (c22281hcR = c21588hEy.OLrzqt) == null) {
                return;
            }
            c22281hcR.setStickyVisible(false);
            return;
        }
        getChildFragmentManager().beginTransaction().replace(C23274hvD.Application.DcMfJKgMxgjU, OrderAndPositionTabComponentFragment.Companion.EZpvd(), OrderAndPositionTabComponentFragment.class.getName()).commitAllowingStateLoss();
    }

    public static /* synthetic */ void updateTokenInfo$default(MemeModeTransactionFragment memeModeTransactionFragment, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, int i, Object obj) {
        if ((i & 2) != 0) {
            dexMultiTokenInfoBean2 = null;
        }
        memeModeTransactionFragment.OLrzqt(dexMultiTokenInfoBean, dexMultiTokenInfoBean2);
    }

    public final void OLrzqt(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2) {
        TokenBase tokenBase;
        MemeModeTransactionViewModel memeModeTransactionViewModelFetchVPNInfo = fetchVPNInfo();
        String strAuCTel = AuCTel();
        TokenBase tokenBase2 = this.AubY;
        TokenBase tokenBase3 = null;
        if (tokenBase2 == null) {
            Intrinsics.gEmmrt("");
            tokenBase2 = null;
        }
        String source = tokenBase2.getSource();
        TokenBase tokenBase4 = this.AubY;
        if (tokenBase4 == null) {
            Intrinsics.gEmmrt("");
            tokenBase4 = null;
        }
        this.AubY = memeModeTransactionViewModelFetchVPNInfo.AEQbTJ(dexMultiTokenInfoBean, strAuCTel, source, tokenBase4.getEventSource(), C31172lox.KWHzl(C31125loC.KWHzl(this), C31172lox.Companion.KWHzl()));
        AkhnZx().AEQbTJ(C56402yEa.EZpvd(dexMultiTokenInfoBean));
        C23317hvu.OLrzqt(dexMultiTokenInfoBean);
        if (dexMultiTokenInfoBean2 != null) {
            this.AhwBna = DexMultiTokenInfoBean.transTokenBase$default(dexMultiTokenInfoBean2, "meme_mode", null, null, false, 14, null);
            MemeModeTransactionViewModel memeModeTransactionViewModelFetchVPNInfo2 = fetchVPNInfo();
            String chainId = dexMultiTokenInfoBean2.getChainId();
            String tokenContractAddress = dexMultiTokenInfoBean2.getTokenContractAddress();
            TokenBase tokenBase5 = this.AubY;
            if (tokenBase5 == null) {
                Intrinsics.gEmmrt("");
                tokenBase5 = null;
            }
            memeModeTransactionViewModelFetchVPNInfo2.EZpvd(chainId, tokenContractAddress, tokenBase5.getTokenContractAddress());
        }
        TransactionType value = fetchVPNInfo().fetchVPNInfo().getValue();
        if (value != null) {
            resetBuySellFragment$default(this, value, DexMultiTokenInfoBean.transTokenBase$default(dexMultiTokenInfoBean, "meme_mode", null, null, false, 14, null), false, 4, null);
            kVW kvw = kVW.EZpvd;
            String strAuCTel2 = AuCTel();
            TokenBase tokenBase6 = this.AubY;
            if (tokenBase6 == null) {
                Intrinsics.gEmmrt("");
                tokenBase = null;
            } else {
                tokenBase = tokenBase6;
            }
            MemeModeTransactionViewModel memeModeTransactionViewModelFetchVPNInfo3 = fetchVPNInfo();
            TokenBase tokenBase7 = this.AubY;
            if (tokenBase7 == null) {
                Intrinsics.gEmmrt("");
                tokenBase7 = null;
            }
            String chainId2 = tokenBase7.getChainId();
            TokenBase tokenBase8 = this.AubY;
            if (tokenBase8 == null) {
                Intrinsics.gEmmrt("");
            } else {
                tokenBase3 = tokenBase8;
            }
            kvw.OLrzqt(strAuCTel2, value, tokenBase, memeModeTransactionViewModelFetchVPNInfo3.OLrzqt(chainId2, tokenBase3.getTokenContractAddress()), C31125loC.KWHzl(this));
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.hTH
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C21588hEy c21588hEy, Bundle bundle) {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf;
        MutableLiveData<MemeTransactionParams> mutableLiveData;
        String tokenSymbol;
        TokenBase tokenBase;
        TokenBase tokenBase2;
        Intrinsics.checkNotNullParameter(c21588hEy, "");
        this.values = System.currentTimeMillis();
        int iKWHzl = C31125loC.KWHzl(this);
        C31172lox.TaskDescription taskDescription = C31172lox.Companion;
        if (C31172lox.KWHzl(iKWHzl, taskDescription.KWHzl())) {
            this.fetchVPNInfo = c21588hEy.EZpvd;
        } else if (C31172lox.KWHzl(iKWHzl, taskDescription.OLrzqt())) {
            c21588hEy.getRoot().setMinHeight(getResources().getDimensionPixelSize(C23274hvD.TaskDescription.EZpvd));
            hEJ.EZpvd(getLayoutInflater(), c21588hEy.OLrzqt, true);
            C31123loA c31123loA = c21588hEy.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(c31123loA, "");
            ViewGroup.LayoutParams layoutParams = c31123loA.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                Context context = c21588hEy.AkhnZx.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                marginLayoutParams.topMargin = C55298xhM.OLrzqt(14, context);
                c31123loA.setLayoutParams(marginLayoutParams);
                this.fetchVPNInfo = c21588hEy.AYXKKw;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        C22281hcR c22281hcR = c21588hEy.OLrzqt;
        c22281hcR.setEnableRefresh(C31172lox.KWHzl(C31125loC.KWHzl(this), taskDescription.KWHzl()));
        c22281hcR.setEnableLoadMore(false);
        C23317hvu.valueOf(TabTitleInfo.KEY_MEME);
        this.wlaJM = wlaJM();
        C22374heE c22374heECopydefault = C22380heK.OLrzqt.copydefault(AuCTel());
        InterfaceC22672hjl interfaceC22672hjlFetchVPNInfo = c22374heECopydefault.fetchVPNInfo();
        interfaceC22672hjlFetchVPNInfo.KWHzl(this.wlaJM);
        MutableLiveData<MemeTransactionParams> mutableLiveDataValues = c22374heECopydefault.values();
        MemeTransactionParams value = mutableLiveDataValues.getValue();
        TokenBase tokenBase3 = value != null ? value.getTokenBase() : null;
        MemeTransactionParams value2 = mutableLiveDataValues.getValue();
        if (value2 != null) {
            value2.getStrategyType();
        }
        MemeTransactionParams value3 = mutableLiveDataValues.getValue();
        TokenBase currencyToken = value3 != null ? value3.getCurrencyToken() : null;
        Bundle arguments = getArguments();
        TokenBase tokenBase4 = arguments != null ? (TokenBase) ((Parcelable) BundleCompat.getParcelable(arguments, "transaction_token", TokenBase.class)) : null;
        Bundle arguments2 = getArguments();
        TokenBase tokenBase5 = arguments2 != null ? (TokenBase) ((Parcelable) BundleCompat.getParcelable(arguments2, "currency_token", TokenBase.class)) : null;
        C22830hmk c22830hmkFJNWhG = c22374heECopydefault.fJNWhG();
        TradingType tradingTypeAhwBna = getFieldNames().AhwBna();
        int i = StateListAnimator.EZpvd[tradingTypeAhwBna.ordinal()];
        int iIsConnected = (i == 1 || i == 2 || i == 3) ? interfaceC22672hjlFetchVPNInfo.isConnected() : this.wlaJM;
        if (iIsConnected == TransactionDirection.TransactionBuy.getValue()) {
            dexMultiTokenInfoBeanAEQbTJ = c22830hmkFJNWhG.valueOf();
            dexMultiTokenInfoBeanValueOf = c22830hmkFJNWhG.AEQbTJ();
        } else {
            dexMultiTokenInfoBeanAEQbTJ = c22830hmkFJNWhG.AEQbTJ();
            dexMultiTokenInfoBeanValueOf = c22830hmkFJNWhG.valueOf();
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean = dexMultiTokenInfoBeanValueOf;
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = dexMultiTokenInfoBeanAEQbTJ;
        TokenBase tokenBaseTransTokenBase$default = dexMultiTokenInfoBean2 != null ? DexMultiTokenInfoBean.transTokenBase$default(dexMultiTokenInfoBean2, "meme_mode", AubY(), null, false, 12, null) : null;
        TokenBase tokenBaseTransTokenBase$default2 = dexMultiTokenInfoBean != null ? DexMultiTokenInfoBean.transTokenBase$default(dexMultiTokenInfoBean, "meme_mode", AubY(), null, false, 12, null) : null;
        String tag = getTAG();
        String tokenSymbol2 = tokenBaseTransTokenBase$default != null ? tokenBaseTransTokenBase$default.getTokenSymbol() : null;
        if (tokenBaseTransTokenBase$default2 != null) {
            mutableLiveData = mutableLiveDataValues;
            tokenSymbol = tokenBaseTransTokenBase$default2.getTokenSymbol();
        } else {
            mutableLiveData = mutableLiveDataValues;
            tokenSymbol = null;
        }
        pUU.KWHzl(tag, "cacheToken=" + tokenSymbol2 + ", cacheCurrency=" + tokenSymbol);
        if (tokenBase3 != null && ((tokenBase3.getTokenContractAddress().length() > 0 || tokenBase3.getChainId().length() > 0) && C31172lox.KWHzl(C31125loC.KWHzl(this), taskDescription.KWHzl()))) {
            this.AubY = tokenBase3;
            this.AhwBna = currencyToken;
            OLrzqt("deeplink", tradingTypeAhwBna, iIsConnected);
        } else if (tokenBase4 != null && (tokenBase4.getTokenContractAddress().length() > 0 || tokenBase4.getChainId().length() > 0)) {
            this.AubY = tokenBase4;
            this.AhwBna = tokenBase5;
            OLrzqt("arguments", tradingTypeAhwBna, iIsConnected);
        } else {
            if (C31172lox.KWHzl(C31125loC.KWHzl(this), taskDescription.OLrzqt())) {
                pUU.copydefault(getTAG(), "quick buy but argument isn't used, fallback to cache to ensure tokenInfoBean is initialized");
            }
            if (tokenBaseTransTokenBase$default == null) {
                tokenBaseTransTokenBase$default = new TokenBase(null, null, null, null, null, null, null, 0, 0, 0, 0, null, null, null, null, null, null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -1, null);
            }
            this.AubY = tokenBaseTransTokenBase$default;
            if (tokenBaseTransTokenBase$default2 == null || !AEQbTJ(tradingTypeAhwBna)) {
                tokenBaseTransTokenBase$default2 = null;
            }
            this.AhwBna = tokenBaseTransTokenBase$default2;
            OLrzqt("cache", tradingTypeAhwBna, iIsConnected);
        }
        TokenBase tokenBase6 = this.AhwBna;
        if (tokenBase6 != null) {
            MemeModeTransactionViewModel memeModeTransactionViewModelFetchVPNInfo = fetchVPNInfo();
            String chainId = tokenBase6.getChainId();
            String tokenContractAddress = tokenBase6.getTokenContractAddress();
            TokenBase tokenBase7 = this.AubY;
            if (tokenBase7 == null) {
                Intrinsics.gEmmrt("");
                tokenBase7 = null;
            }
            memeModeTransactionViewModelFetchVPNInfo.EZpvd(chainId, tokenContractAddress, tokenBase7.getTokenContractAddress());
            kVW kvw = kVW.EZpvd;
            String strAuCTel = AuCTel();
            TransactionType value4 = fetchVPNInfo().fetchVPNInfo().getValue();
            if (value4 == null) {
                value4 = TransactionType.Buy;
            }
            TransactionType transactionType = value4;
            TokenBase tokenBase8 = this.AubY;
            if (tokenBase8 == null) {
                Intrinsics.gEmmrt("");
                tokenBase2 = null;
            } else {
                tokenBase2 = tokenBase8;
            }
            MemeModeTransactionViewModel memeModeTransactionViewModelFetchVPNInfo2 = fetchVPNInfo();
            TokenBase tokenBase9 = this.AubY;
            if (tokenBase9 == null) {
                Intrinsics.gEmmrt("");
                tokenBase9 = null;
            }
            String chainId2 = tokenBase9.getChainId();
            TokenBase tokenBase10 = this.AubY;
            if (tokenBase10 == null) {
                Intrinsics.gEmmrt("");
                tokenBase10 = null;
            }
            kvw.OLrzqt(strAuCTel, transactionType, tokenBase2, memeModeTransactionViewModelFetchVPNInfo2.OLrzqt(chainId2, tokenBase10.getTokenContractAddress()), C31125loC.KWHzl(this));
        }
        AxsJAY();
        TextView textView = c21588hEy.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        OLrzqt(textView);
        OLrzqt(bundle);
        OLrzqt(c21588hEy, bundle);
        MemeTransactionParams value5 = mutableLiveData.getValue();
        MemeTransactionParams.Companion companion = MemeTransactionParams.Companion;
        if (!Intrinsics.EZpvd(value5, companion.EZpvd())) {
            mutableLiveData.setValue(companion.EZpvd());
        }
        OrderAndPositionEventViewModel orderAndPositionEventViewModelAkhnZx = AkhnZx();
        TokenBase tokenBase11 = this.AubY;
        if (tokenBase11 == null) {
            Intrinsics.gEmmrt("");
            tokenBase11 = null;
        }
        String chainId3 = tokenBase11.getChainId();
        TokenBase tokenBase12 = this.AubY;
        if (tokenBase12 == null) {
            Intrinsics.gEmmrt("");
            tokenBase = null;
        } else {
            tokenBase = tokenBase12;
        }
        orderAndPositionEventViewModelAkhnZx.AEQbTJ(C56402yEa.EZpvd(new DexMultiTokenInfoBean((String) null, chainId3, (String) null, (String) null, (String) null, (String) null, tokenBase.getTokenContractAddress(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -67, 134217727, (DefaultConstructorMarker) null)));
    }

    public final void OLrzqt(String str, TradingType tradingType, int i) {
        String tag = getTAG();
        TokenBase tokenBase = this.AubY;
        if (tokenBase == null) {
            Intrinsics.gEmmrt("");
            tokenBase = null;
        }
        String chainId = tokenBase.getChainId();
        TokenBase tokenBase2 = this.AubY;
        if (tokenBase2 == null) {
            Intrinsics.gEmmrt("");
            tokenBase2 = null;
        }
        String tokenSymbol = tokenBase2.getTokenSymbol();
        TokenBase tokenBase3 = this.AubY;
        if (tokenBase3 == null) {
            Intrinsics.gEmmrt("");
            tokenBase3 = null;
        }
        String tokenContractAddress = tokenBase3.getTokenContractAddress();
        TokenBase tokenBase4 = this.AhwBna;
        String tokenSymbol2 = tokenBase4 != null ? tokenBase4.getTokenSymbol() : null;
        TokenBase tokenBase5 = this.AhwBna;
        pUU.KWHzl(tag, "initializing from " + str + ": lastTradingType=" + tradingType + ", position=" + i + ", chainId=" + chainId + ", transactionToken=" + tokenSymbol + ":" + tokenContractAddress + ", currencyToken=" + tokenSymbol2 + ":" + (tokenBase5 != null ? tokenBase5.getTokenContractAddress() : null));
    }

    public final boolean AEQbTJ(TradingType tradingType) {
        return tradingType == TradingType.None || tradingType == TradingType.Meme || tradingType == TradingType.Advanced || tradingType == TradingType.Swap;
    }

    public final void OLrzqt(final C21588hEy c21588hEy, final Bundle bundle) {
        if (C31172lox.KWHzl(C31125loC.KWHzl(this), C31172lox.Companion.KWHzl())) {
            AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C30922lkL.class, new String[0]);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, viewLifecycleOwner);
            final Function1 function1 = new Function1() { // from class: o.ljv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MemeModeTransactionFragment.copydefault(this.AEQbTJ, (C30922lkL) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ljF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    MemeModeTransactionFragment.djBIcL(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.ljP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MemeModeTransactionFragment.OLrzqt((java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ljO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    MemeModeTransactionFragment.gEmmrt(function12, obj);
                }
            });
        }
        AbstractC58185ywX abstractC58185ywXKWHzl2 = RxBus.KWHzl(xXO.class, new String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        AbstractC58185ywX abstractC58185ywXEZpvd2 = C58156yvv.EZpvd(abstractC58185ywXKWHzl2, viewLifecycleOwner2);
        final Function1 function13 = new Function1() { // from class: o.ljQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeModeTransactionFragment.AEQbTJ(this.AEQbTJ, (xXO) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.ljS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MemeModeTransactionFragment.AYXKKw(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.ljR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeModeTransactionFragment.EZpvd((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd2.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.ljU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MemeModeTransactionFragment.AkhnZx(function14, obj);
            }
        });
        c21588hEy.OLrzqt.setOnRefreshListener(new Function0() { // from class: o.ljT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MemeModeTransactionFragment.ejfBZ(this.OLrzqt);
            }
        });
        C23314hvr<Boolean> c23314hvrFJNWhG = fetchVPNInfo().fJNWhG();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c23314hvrFJNWhG.observe(viewLifecycleOwner3, new Fragment(new Function1() { // from class: o.ljV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeModeTransactionFragment.KWHzl(c21588hEy, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        fetchVPNInfo().hDKMBd().observe(getViewLifecycleOwner(), new Fragment(new Function1() { // from class: o.ljw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeModeTransactionFragment.AEQbTJ(this.OLrzqt, c21588hEy, (SwapState) obj);
            }
        }));
        fetchVPNInfo().fetchVPNInfo().observe(getViewLifecycleOwner(), new Fragment(new Function1() { // from class: o.lju
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeModeTransactionFragment.copydefault(this.AEQbTJ, (TransactionType) obj);
            }
        }));
        fetchVPNInfo().EZpvd().observe(getViewLifecycleOwner(), new Fragment(new Function1() { // from class: o.ljz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeModeTransactionFragment.OLrzqt(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        fetchVPNInfo().OLrzqt().observe(getViewLifecycleOwner(), new Fragment(new Function1() { // from class: o.ljA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeModeTransactionFragment.OLrzqt(c21588hEy, this, bundle, (java.lang.Boolean) obj);
            }
        }));
        fetchVPNInfo().gEmmrt().observe(getViewLifecycleOwner(), new Fragment(new Function1() { // from class: o.ljB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeModeTransactionFragment.AEQbTJ(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        fetchVPNInfo().AhwBna().observe(getViewLifecycleOwner(), new Fragment(new Function1() { // from class: o.ljx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeModeTransactionFragment.AEQbTJ(this.KWHzl, (TokenBase) obj);
            }
        }));
        fetchVPNInfo().values().observe(getViewLifecycleOwner(), new Fragment(new Function1() { // from class: o.ljE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeModeTransactionFragment.EZpvd(this.AEQbTJ, (SearchMemeUiState) obj);
            }
        }));
        C22380heK.OLrzqt.copydefault("default_trade").values().observe(getViewLifecycleOwner(), new ActionBar(c21588hEy, this));
        AbstractC58185ywX<String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("save_valuation_current_symbol");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        Lifecycle.Event event = Lifecycle.Event.ON_DESTROY;
        AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(abstractC58185ywXAEQbTJ, this, event);
        final Function1 function15 = new Function1() { // from class: o.ljC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeModeTransactionFragment.valueOf(this.EZpvd, (java.lang.String) obj);
            }
        };
        abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58227yxM() { // from class: o.ljG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MemeModeTransactionFragment.fetchVPNInfo(function15, obj);
            }
        });
        AbstractC58185ywX<String> abstractC58185ywXAEQbTJ2 = RxBus.AEQbTJ("NOTIFY_COIN_CHANGE");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        AbstractC58185ywX abstractC58185ywXOLrzqt2 = C58156yvv.OLrzqt(abstractC58185ywXAEQbTJ2, this, event);
        final Function1 function16 = new Function1() { // from class: o.ljD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeModeTransactionFragment.gEmmrt(this.KWHzl, (java.lang.String) obj);
            }
        };
        abstractC58185ywXOLrzqt2.AEQbTJ(new InterfaceC58227yxM() { // from class: o.ljJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MemeModeTransactionFragment.DbNXlk(function16, obj);
            }
        });
        fetchVPNInfo().iwGUEr().observe(getViewLifecycleOwner(), new Fragment(new Function1() { // from class: o.ljK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeModeTransactionFragment.copydefault(this.AEQbTJ, (Unit) obj);
            }
        }));
        fetchVPNInfo().fIwbmz().observe(getViewLifecycleOwner(), new Fragment(new Function1() { // from class: o.ljI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeModeTransactionFragment.AEQbTJ(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        fetchVPNInfo().AEQbTJ().observe(getViewLifecycleOwner(), new Fragment(new Function1() { // from class: o.ljL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeModeTransactionFragment.KWHzl(this.OLrzqt, (MemePresetConfigAndToken) obj);
            }
        }));
        fetchVPNInfo().ejfBZ().observe(getViewLifecycleOwner(), new Fragment(new Function1() { // from class: o.ljM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeModeTransactionFragment.AEQbTJ(this.AEQbTJ, (DexPresetResultVO) obj);
            }
        }));
        fetchVPNInfo().fARcdN().observe(getViewLifecycleOwner(), new Fragment(new Function1() { // from class: o.ljN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeModeTransactionFragment.AYXKKw(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        C25390ivn.collectOnViewLifecycle$default(this, AkhnZx().EZpvd(), null, new TaskDescription(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, fetchVPNInfo().KWHzl(), null, new Dialog(), 2, null);
    }

    public static final void djBIcL(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(MemeModeTransactionFragment memeModeTransactionFragment, C30922lkL c30922lkL) {
        memeModeTransactionFragment.AEQbTJ(c30922lkL.KWHzl(), c30922lkL.copydefault());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void AYXKKw(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(MemeModeTransactionFragment memeModeTransactionFragment, xXO xxo) {
        memeModeTransactionFragment.fetchVPNInfo().copydefault();
        MemeModeTransactionViewModel memeModeTransactionViewModelFetchVPNInfo = memeModeTransactionFragment.fetchVPNInfo();
        TokenBase tokenBase = memeModeTransactionFragment.AubY;
        TokenBase tokenBase2 = null;
        if (tokenBase == null) {
            Intrinsics.gEmmrt("");
            tokenBase = null;
        }
        memeModeTransactionViewModelFetchVPNInfo.AEQbTJ(tokenBase.getChainId());
        MemeModeTransactionViewModel memeModeTransactionViewModelFetchVPNInfo2 = memeModeTransactionFragment.fetchVPNInfo();
        TokenBase tokenBase3 = memeModeTransactionFragment.AubY;
        if (tokenBase3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            tokenBase2 = tokenBase3;
        }
        memeModeTransactionViewModelFetchVPNInfo2.EZpvd(tokenBase2.getChainId());
        memeModeTransactionFragment.getViewLifecycleOwner().getLifecycle().removeObserver(memeModeTransactionFragment.djBIcL);
        memeModeTransactionFragment.getViewLifecycleOwner().getLifecycle().addObserver(memeModeTransactionFragment.djBIcL);
        return Unit.INSTANCE;
    }

    public static final void AkhnZx(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(Throwable th) {
        Intrinsics.copydefault(th);
        pUU.KWHzl(th);
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(MemeModeTransactionFragment memeModeTransactionFragment) {
        memeModeTransactionFragment.fetchVPNInfo().uzCIH();
        memeModeTransactionFragment.AkhnZx().fetchVPNInfo();
        MemeModeTransactionViewModel memeModeTransactionViewModelFetchVPNInfo = memeModeTransactionFragment.fetchVPNInfo();
        TokenBase tokenBase = memeModeTransactionFragment.AubY;
        if (tokenBase == null) {
            Intrinsics.gEmmrt("");
            tokenBase = null;
        }
        memeModeTransactionViewModelFetchVPNInfo.EZpvd(tokenBase.getChainId());
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C21588hEy c21588hEy, boolean z) {
        c21588hEy.OLrzqt.KWHzl();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(MemeModeTransactionFragment memeModeTransactionFragment, C21588hEy c21588hEy, SwapState swapState) {
        c21588hEy.OLrzqt.setStickyVisible(C31172lox.KWHzl(C31125loC.KWHzl(memeModeTransactionFragment), C31172lox.Companion.KWHzl()));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(MemeModeTransactionFragment memeModeTransactionFragment, TransactionType transactionType) {
        TokenBase tokenBase;
        String value;
        TransactionType transactionType2 = TransactionType.Buy;
        C22380heK.OLrzqt.copydefault(memeModeTransactionFragment.AuCTel()).fetchVPNInfo().KWHzl((transactionType == transactionType2 ? transactionType2 : TransactionType.Sell).getType());
        kVW kvw = kVW.EZpvd;
        String strAuCTel = memeModeTransactionFragment.AuCTel();
        Intrinsics.copydefault(transactionType);
        TokenBase tokenBase2 = memeModeTransactionFragment.AubY;
        TokenBase tokenBase3 = null;
        if (tokenBase2 == null) {
            Intrinsics.gEmmrt("");
            tokenBase = null;
        } else {
            tokenBase = tokenBase2;
        }
        MemeModeTransactionViewModel memeModeTransactionViewModelFetchVPNInfo = memeModeTransactionFragment.fetchVPNInfo();
        TokenBase tokenBase4 = memeModeTransactionFragment.AubY;
        if (tokenBase4 == null) {
            Intrinsics.gEmmrt("");
            tokenBase4 = null;
        }
        String chainId = tokenBase4.getChainId();
        TokenBase tokenBase5 = memeModeTransactionFragment.AubY;
        if (tokenBase5 == null) {
            Intrinsics.gEmmrt("");
            tokenBase5 = null;
        }
        kvw.OLrzqt(strAuCTel, transactionType, tokenBase, memeModeTransactionViewModelFetchVPNInfo.OLrzqt(chainId, tokenBase5.getTokenContractAddress()), C31125loC.KWHzl(memeModeTransactionFragment));
        memeModeTransactionFragment.KWHzl(transactionType);
        AbstractC30827liW abstractC30827liWValueOf = memeModeTransactionFragment.valueOf();
        if (abstractC30827liWValueOf != null) {
            if (!abstractC30827liWValueOf.isAdded()) {
                abstractC30827liWValueOf = null;
            }
            if (abstractC30827liWValueOf != null) {
                abstractC30827liWValueOf.KWHzl();
            }
        }
        C24371ica c24371ica = C24371ica.OLrzqt;
        TokenBase tokenBase6 = memeModeTransactionFragment.AubY;
        if (tokenBase6 == null) {
            Intrinsics.gEmmrt("");
            tokenBase6 = null;
        }
        String tokenContractAddress = tokenBase6.getTokenContractAddress();
        if (transactionType == transactionType2) {
            value = DexTrackEventParameter.ButtonName.BUY.getValue();
        } else {
            value = DexTrackEventParameter.ButtonName.SELL.getValue();
        }
        String str = value;
        String strAubY = memeModeTransactionFragment.AubY();
        TokenBase tokenBase7 = memeModeTransactionFragment.AubY;
        if (tokenBase7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            tokenBase3 = tokenBase7;
        }
        c24371ica.KWHzl(tokenContractAddress, str, strAubY, tokenBase3.getEventSource(), DexTrackEventParameter.AEQbTJ.KWHzl(memeModeTransactionFragment.fetchVPNInfo().fetchVPNInfo().getValue()));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(MemeModeTransactionFragment memeModeTransactionFragment, Boolean bool) {
        if (bool.booleanValue()) {
            memeModeTransactionFragment.iwGUEr();
        } else {
            memeModeTransactionFragment.gEmmrt();
            memeModeTransactionFragment.AuCTelauCTel();
            memeModeTransactionFragment.uzCIH();
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) memeModeTransactionFragment, true, (String) null, 2, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C21588hEy c21588hEy, final MemeModeTransactionFragment memeModeTransactionFragment, final Bundle bundle, Boolean bool) {
        c21588hEy.OLrzqt.setEnableRefresh(!bool.booleanValue());
        Intrinsics.copydefault(bool);
        memeModeTransactionFragment.EZpvd(bool.booleanValue(), new Function0() { // from class: o.lka
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MemeModeTransactionFragment.copydefault(this.OLrzqt, bundle);
            }
        });
        if (bool.booleanValue()) {
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) memeModeTransactionFragment, false, (String) null, 2, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(MemeModeTransactionFragment memeModeTransactionFragment, Bundle bundle) {
        memeModeTransactionFragment.OLrzqt(bundle);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(MemeModeTransactionFragment memeModeTransactionFragment, String str) {
        MemeModeTransactionViewModel memeModeTransactionViewModelFetchVPNInfo = memeModeTransactionFragment.fetchVPNInfo();
        Intrinsics.copydefault((Object) str);
        memeModeTransactionViewModelFetchVPNInfo.OLrzqt(str);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(final MemeModeTransactionFragment memeModeTransactionFragment, TokenBase tokenBase) {
        TransactionType value = memeModeTransactionFragment.fetchVPNInfo().fetchVPNInfo().getValue();
        if (value == null) {
            value = TransactionType.Buy;
        }
        C25632jAp c25632jAp = C25632jAp.KWHzl;
        FragmentManager childFragmentManager = memeModeTransactionFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        TradingBizType tradingBizType = TradingBizType.Meme;
        TokenBase tokenBase2 = memeModeTransactionFragment.AubY;
        TokenBase tokenBase3 = null;
        if (tokenBase2 == null) {
            Intrinsics.gEmmrt("");
            tokenBase2 = null;
        }
        String chainId = tokenBase2.getChainId();
        TokenBase tokenBase4 = memeModeTransactionFragment.AubY;
        if (tokenBase4 == null) {
            Intrinsics.gEmmrt("");
            tokenBase4 = null;
        }
        String chainId2 = tokenBase4.getChainId();
        boolean z = value == TransactionType.Sell;
        TokenBase tokenBase5 = memeModeTransactionFragment.AubY;
        if (tokenBase5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            tokenBase3 = tokenBase5;
        }
        c25632jAp.copydefault(childFragmentManager, new C28385kZl(tradingBizType, chainId, chainId2, z, true, tokenBase3.getTokenContractAddress(), null, null, 192, null), new Function1() { // from class: o.ljp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeModeTransactionFragment.EZpvd(this.copydefault, (DexMultiTokenInfoBean) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(MemeModeTransactionFragment memeModeTransactionFragment, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        C22380heK.OLrzqt.copydefault(memeModeTransactionFragment.AuCTel()).EZpvd(true).gEmmrt().AEQbTJ();
        memeModeTransactionFragment.KWHzl(dexMultiTokenInfoBean, memeModeTransactionFragment.fetchVPNInfo().OLrzqt(dexMultiTokenInfoBean.getChainId(), dexMultiTokenInfoBean.getTokenContractAddress()));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(MemeModeTransactionFragment memeModeTransactionFragment, SearchMemeUiState searchMemeUiState) {
        if (searchMemeUiState.isLoading()) {
            memeModeTransactionFragment.showLoading();
        } else {
            memeModeTransactionFragment.dismissLoading();
            memeModeTransactionFragment.AuCTelauCTel();
        }
        if (searchMemeUiState.isError()) {
            C55326xho.toast$default(searchMemeUiState.getErrorMessage(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        } else {
            DexMultiTokenInfoBean tokenInfo = searchMemeUiState.getTokenInfo();
            if (tokenInfo != null) {
                memeModeTransactionFragment.KWHzl(tokenInfo, searchMemeUiState.getCurrencyTokenInfo());
            }
            List<DexMultiTokenInfoBean> tokensList = searchMemeUiState.getTokensList();
            if (tokensList != null) {
                if (!(!tokensList.isEmpty())) {
                    tokensList = null;
                }
                if (tokensList != null) {
                    if (tokensList.size() == 1) {
                        memeModeTransactionFragment.KWHzl((DexMultiTokenInfoBean) CollectionsKt___CollectionsKt.AuCTelauCTel(tokensList), searchMemeUiState.getCurrencyTokenInfo());
                    } else {
                        memeModeTransactionFragment.copydefault(tokensList);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements Observer<MemeTransactionParams> {
        public final /* synthetic */ MemeModeTransactionFragment KWHzl;
        public final /* synthetic */ C21588hEy OLrzqt;

        public ActionBar(C21588hEy c21588hEy, MemeModeTransactionFragment memeModeTransactionFragment) {
            this.OLrzqt = c21588hEy;
            this.KWHzl = memeModeTransactionFragment;
        }

        /* JADX DEBUG: Method merged with bridge method: onChanged(Ljava/lang/Object;)V */
        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onChanged(MemeTransactionParams memeTransactionParams) {
            if (memeTransactionParams == null) {
                return;
            }
            MemeTransactionParams.Companion companion = MemeTransactionParams.Companion;
            if (Intrinsics.EZpvd(memeTransactionParams, companion.EZpvd())) {
                return;
            }
            if (memeTransactionParams.getTransaction_direction() != -1 && memeTransactionParams.getTransaction_direction() < 2) {
                C31123loA c31123loA = this.OLrzqt.AkhnZx;
                c31123loA.selectTab(c31123loA.getTabAt(memeTransactionParams.getTransaction_direction()), true);
            }
            MemeModeTransactionViewModel memeModeTransactionViewModelFetchVPNInfo = this.KWHzl.fetchVPNInfo();
            String tokenContractAddress = memeTransactionParams.getTokenBase().getTokenContractAddress();
            String chainId = memeTransactionParams.getTokenBase().getChainId();
            TokenBase currencyToken = memeTransactionParams.getCurrencyToken();
            memeModeTransactionViewModelFetchVPNInfo.KWHzl(tokenContractAddress, chainId, currencyToken != null ? currencyToken.getTokenContractAddress() : null);
            MutableLiveData<MemeTransactionParams> mutableLiveDataValues = C22380heK.OLrzqt.copydefault("default_trade").values();
            mutableLiveDataValues.removeObserver(this);
            mutableLiveDataValues.setValue(companion.EZpvd());
            mutableLiveDataValues.observe(this.KWHzl.getViewLifecycleOwner(), this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchVPNInfo(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit valueOf(MemeModeTransactionFragment memeModeTransactionFragment, String str) {
        if (memeModeTransactionFragment.fetchVPNInfo().fetchVPNInfo().getValue() != null) {
            memeModeTransactionFragment.fetchVPNInfo().iwGUEr().setValue(Unit.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    public static final void DbNXlk(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(MemeModeTransactionFragment memeModeTransactionFragment, String str) {
        if (memeModeTransactionFragment.fetchVPNInfo().fetchVPNInfo().getValue() != null) {
            memeModeTransactionFragment.fetchVPNInfo().iwGUEr().setValue(Unit.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(MemeModeTransactionFragment memeModeTransactionFragment, Unit unit) {
        TransactionType value = memeModeTransactionFragment.fetchVPNInfo().fetchVPNInfo().getValue();
        if (value != null) {
            TokenBase tokenBase = memeModeTransactionFragment.AubY;
            if (tokenBase == null) {
                Intrinsics.gEmmrt("");
                tokenBase = null;
            }
            resetBuySellFragment$default(memeModeTransactionFragment, value, tokenBase, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(MemeModeTransactionFragment memeModeTransactionFragment, Boolean bool) {
        if (bool.booleanValue()) {
            memeModeTransactionFragment.showLoading();
        } else {
            memeModeTransactionFragment.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(final MemeModeTransactionFragment memeModeTransactionFragment, final MemePresetConfigAndToken memePresetConfigAndToken) {
        if (memePresetConfigAndToken.getState()) {
            memeModeTransactionFragment.fetchVPNInfo().copydefault(memePresetConfigAndToken.getDexMultiTokenInfoBean().getChainId(), memeModeTransactionFragment.fetchVPNInfo().EZpvd(memePresetConfigAndToken.getPresetResultVO()));
            updateTokenInfo$default(memeModeTransactionFragment, memePresetConfigAndToken.getDexMultiTokenInfoBean(), null, 2, null);
        } else {
            memeModeTransactionFragment.EZpvd(true, new Function0() { // from class: o.ljH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MemeModeTransactionFragment.EZpvd(this.AEQbTJ, memePresetConfigAndToken);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(MemeModeTransactionFragment memeModeTransactionFragment, MemePresetConfigAndToken memePresetConfigAndToken) {
        memeModeTransactionFragment.fetchVPNInfo().AEQbTJ(memePresetConfigAndToken.getDexMultiTokenInfoBean());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(MemeModeTransactionFragment memeModeTransactionFragment, DexPresetResultVO dexPresetResultVO) {
        TokenBase tokenBase;
        MemeModeTransactionViewModel memeModeTransactionViewModelFetchVPNInfo = memeModeTransactionFragment.fetchVPNInfo();
        TokenBase tokenBase2 = memeModeTransactionFragment.AubY;
        if (tokenBase2 == null) {
            Intrinsics.gEmmrt("");
            tokenBase2 = null;
        }
        memeModeTransactionViewModelFetchVPNInfo.copydefault(tokenBase2.getChainId(), memeModeTransactionFragment.fetchVPNInfo().EZpvd(dexPresetResultVO));
        TransactionType value = memeModeTransactionFragment.fetchVPNInfo().fetchVPNInfo().getValue();
        if (value == null) {
            value = TransactionType.Buy;
        }
        TransactionType transactionType = value;
        TokenBase tokenBase3 = memeModeTransactionFragment.AubY;
        if (tokenBase3 == null) {
            Intrinsics.gEmmrt("");
            tokenBase = null;
        } else {
            tokenBase = tokenBase3;
        }
        resetBuySellFragment$default(memeModeTransactionFragment, transactionType, tokenBase, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(final MemeModeTransactionFragment memeModeTransactionFragment, Boolean bool) {
        if (!bool.booleanValue()) {
            memeModeTransactionFragment.EZpvd(!bool.booleanValue(), new Function0() { // from class: o.lkd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MemeModeTransactionFragment.AuCTel(this.EZpvd);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit AuCTel(MemeModeTransactionFragment memeModeTransactionFragment) {
        MemeModeTransactionViewModel memeModeTransactionViewModelFetchVPNInfo = memeModeTransactionFragment.fetchVPNInfo();
        TokenBase tokenBase = memeModeTransactionFragment.AubY;
        if (tokenBase == null) {
            Intrinsics.gEmmrt("");
            tokenBase = null;
        }
        memeModeTransactionViewModelFetchVPNInfo.AEQbTJ(tokenBase.getChainId());
        return Unit.INSTANCE;
    }

    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Object emit(C19816gQj c19816gQj, Continuation<? super Unit> continuation) {
            MemeModeTransactionFragment.this.fetchVPNInfo().copydefault(c19816gQj.copydefault(), c19816gQj.AEQbTJ(), c19816gQj.OLrzqt());
            return Unit.INSTANCE;
        }
    }

    public static final class Dialog<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Object emit(InterfaceC28223kTl interfaceC28223kTl, Continuation<? super Unit> continuation) {
            MemeModeTransactionFragment.this.copydefault(interfaceC28223kTl);
            return Unit.INSTANCE;
        }
    }

    public final void AEQbTJ(DexMultiTokenInfoBean dexMultiTokenInfoBean, String str) {
        if (this.AubY != null) {
            String chainId = dexMultiTokenInfoBean.getChainId();
            TokenBase tokenBase = this.AubY;
            TokenBase tokenBase2 = null;
            if (tokenBase == null) {
                Intrinsics.gEmmrt("");
                tokenBase = null;
            }
            if (Intrinsics.EZpvd((Object) chainId, (Object) tokenBase.getChainId())) {
                TokenBase tokenBase3 = this.AubY;
                if (tokenBase3 == null) {
                    Intrinsics.gEmmrt("");
                    tokenBase3 = null;
                }
                if (Intrinsics.EZpvd((Object) tokenBase3.getTokenContractAddress(), (Object) dexMultiTokenInfoBean.getTokenContractAddress())) {
                    MemeModeTransactionViewModel memeModeTransactionViewModelFetchVPNInfo = fetchVPNInfo();
                    TokenBase tokenBase4 = this.AubY;
                    if (tokenBase4 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        tokenBase2 = tokenBase4;
                    }
                    DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ = memeModeTransactionViewModelFetchVPNInfo.AEQbTJ(tokenBase2.getChainId(), str);
                    if (dexMultiTokenInfoBeanAEQbTJ == null) {
                        return;
                    }
                    try {
                        OLrzqt(dexMultiTokenInfoBeanAEQbTJ, dexMultiTokenInfoBean);
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(InterfaceC28223kTl interfaceC28223kTl) {
        C22281hcR c22281hcR;
        NestedScrollView nestedScrollViewAYXKKw;
        if ((interfaceC28223kTl instanceof InterfaceC28223kTl.ActionBar) || (interfaceC28223kTl instanceof InterfaceC28223kTl.TaskDescription)) {
            return;
        }
        if (interfaceC28223kTl instanceof InterfaceC28223kTl.Activity) {
            C55326xho.toast$default(((InterfaceC28223kTl.Activity) interfaceC28223kTl).copydefault(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            return;
        }
        if (!(interfaceC28223kTl instanceof InterfaceC28223kTl.StateListAnimator)) {
            throw new NoWhenBranchMatchedException();
        }
        AkhnZx().values();
        C21588hEy c21588hEy = (C21588hEy) fARcdN();
        if (c21588hEy != null && (c22281hcR = c21588hEy.OLrzqt) != null && (nestedScrollViewAYXKKw = c22281hcR.AYXKKw()) != null) {
            nestedScrollViewAYXKKw.smoothScrollTo(0, 0);
        }
        KWHzl(((InterfaceC28223kTl.StateListAnimator) interfaceC28223kTl).OLrzqt(), (DexMultiTokenInfoBean) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.bae.handleIfNeeded$default(o.bae, kotlinx.coroutines.CoroutineScope, androidx.fragment.app.FragmentActivity, java.lang.String, java.util.Map, int, java.lang.Object):void */
    private final void AuCTelauCTel() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C9706bae c9706baeAYXKKw = AYXKKw();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            C9706bae.handleIfNeeded$default(c9706baeAYXKKw, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), activity, "dex/meme/swap", null, 8, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(boolean z, final Function0<Unit> function0) {
        C21588hEy c21588hEy;
        FrameLayout frameLayout;
        final C55173xeu c55173xeu = this.fetchVPNInfo;
        if (c55173xeu != null) {
            c55173xeu.setVisibility(z ? 0 : 8);
            c55173xeu.setEmptyTypeImage(9);
            String string = getString(C23274hvD.Fragment.onConnected);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c55173xeu.setTitle(string);
            String string2 = getString(C23274hvD.Fragment.onConnectionFailed);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            c55173xeu.setSubTitle((CharSequence) string2);
            String string3 = getString(C23274hvD.Fragment.fARcdN);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            c55173xeu.setRetry(string3);
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.ljr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    MemeModeTransactionFragment.EZpvd(c55173xeu, function0, view);
                }
            });
        }
        if (!C31172lox.KWHzl(C31125loC.KWHzl(this), C31172lox.Companion.OLrzqt()) || (c21588hEy = (C21588hEy) fARcdN()) == null || (frameLayout = c21588hEy.djBIcL) == null) {
            return;
        }
        frameLayout.setVisibility(z ^ true ? 4 : 0);
    }

    public static final void EZpvd(C55173xeu c55173xeu, Function0 function0, View view) {
        c55173xeu.setVisibility(8);
        function0.invoke();
    }

    public final void copydefault(List<DexMultiTokenInfoBean> list) {
        C30957lku c30957lkuCopydefault = C30957lku.Companion.copydefault(list);
        c30957lkuCopydefault.show(getParentFragmentManager(), "javaClass");
        c30957lkuCopydefault.OLrzqt(new Function1() { // from class: o.ljs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeModeTransactionFragment.AEQbTJ(this.OLrzqt, (DexMultiTokenInfoBean) obj);
            }
        });
    }

    public static final Unit AEQbTJ(MemeModeTransactionFragment memeModeTransactionFragment, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        memeModeTransactionFragment.KWHzl(dexMultiTokenInfoBean, memeModeTransactionFragment.fetchVPNInfo().OLrzqt(dexMultiTokenInfoBean.getChainId(), dexMultiTokenInfoBean.getTokenContractAddress()));
        return Unit.INSTANCE;
    }

    public final void KWHzl(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2) {
        if (dexMultiTokenInfoBean == null) {
            return;
        }
        TokenBase tokenBase = this.AubY;
        if (tokenBase == null) {
            Intrinsics.gEmmrt("");
            tokenBase = null;
        }
        if (!Intrinsics.EZpvd((Object) tokenBase.getChainId(), (Object) dexMultiTokenInfoBean.getChainId())) {
            fetchVPNInfo().AEQbTJ(dexMultiTokenInfoBean);
            fetchVPNInfo().EZpvd(dexMultiTokenInfoBean.getChainId());
        } else {
            OLrzqt(dexMultiTokenInfoBean, dexMultiTokenInfoBean2);
        }
        AkhnZx().AEQbTJ(C56402yEa.EZpvd(dexMultiTokenInfoBean));
    }

    public final void OLrzqt(final Bundle bundle) {
        MemeModeTransactionViewModel memeModeTransactionViewModelFetchVPNInfo = fetchVPNInfo();
        String strAuCTel = AuCTel();
        TokenBase tokenBase = this.AubY;
        if (tokenBase == null) {
            Intrinsics.gEmmrt("");
            tokenBase = null;
        }
        memeModeTransactionViewModelFetchVPNInfo.KWHzl(strAuCTel, tokenBase, this.AhwBna, C31172lox.KWHzl(C31125loC.KWHzl(this), C31172lox.Companion.KWHzl()), new yHO() { // from class: o.lkc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return MemeModeTransactionFragment.OLrzqt(this.EZpvd, bundle, (TokenBase) obj, (TokenBase) obj2, (java.lang.String) obj3);
            }
        });
    }

    public static final Unit OLrzqt(MemeModeTransactionFragment memeModeTransactionFragment, Bundle bundle, TokenBase tokenBase, TokenBase tokenBase2, String str) {
        TokenBase tokenBase3;
        Intrinsics.checkNotNullParameter(tokenBase, "");
        Intrinsics.checkNotNullParameter(str, "");
        memeModeTransactionFragment.AubY = tokenBase;
        TokenBase tokenBase4 = null;
        if (tokenBase2 != null) {
            if (C31172lox.KWHzl(C31125loC.KWHzl(memeModeTransactionFragment), C31172lox.Companion.OLrzqt()) && !Intrinsics.EZpvd((Object) str, (Object) tokenBase2.getTokenContractAddress())) {
                RxBus.AEQbTJ(new C30922lkL(DexMultiTokenInfoBean.Companion.OLrzqt(tokenBase2), str));
            }
            memeModeTransactionFragment.AhwBna = tokenBase2;
            MemeModeTransactionViewModel memeModeTransactionViewModelFetchVPNInfo = memeModeTransactionFragment.fetchVPNInfo();
            String chainId = tokenBase2.getChainId();
            String tokenContractAddress = tokenBase2.getTokenContractAddress();
            TokenBase tokenBase5 = memeModeTransactionFragment.AubY;
            if (tokenBase5 == null) {
                Intrinsics.gEmmrt("");
                tokenBase5 = null;
            }
            memeModeTransactionViewModelFetchVPNInfo.EZpvd(chainId, tokenContractAddress, tokenBase5.getTokenContractAddress());
            kVW kvw = kVW.EZpvd;
            String strAuCTel = memeModeTransactionFragment.AuCTel();
            TransactionType value = memeModeTransactionFragment.fetchVPNInfo().fetchVPNInfo().getValue();
            if (value == null) {
                value = TransactionType.Buy;
            }
            TransactionType transactionType = value;
            TokenBase tokenBase6 = memeModeTransactionFragment.AubY;
            if (tokenBase6 == null) {
                Intrinsics.gEmmrt("");
                tokenBase3 = null;
            } else {
                tokenBase3 = tokenBase6;
            }
            MemeModeTransactionViewModel memeModeTransactionViewModelFetchVPNInfo2 = memeModeTransactionFragment.fetchVPNInfo();
            TokenBase tokenBase7 = memeModeTransactionFragment.AubY;
            if (tokenBase7 == null) {
                Intrinsics.gEmmrt("");
                tokenBase7 = null;
            }
            String chainId2 = tokenBase7.getChainId();
            TokenBase tokenBase8 = memeModeTransactionFragment.AubY;
            if (tokenBase8 == null) {
                Intrinsics.gEmmrt("");
                tokenBase8 = null;
            }
            kvw.OLrzqt(strAuCTel, transactionType, tokenBase3, memeModeTransactionViewModelFetchVPNInfo2.OLrzqt(chainId2, tokenBase8.getTokenContractAddress()), C31125loC.KWHzl(memeModeTransactionFragment));
        }
        if (bundle == null) {
            MemeModeBuyNewFragment.ActionBar actionBar = MemeModeBuyNewFragment.Companion;
            String strAuCTel2 = memeModeTransactionFragment.AuCTel();
            TokenBase tokenBase9 = memeModeTransactionFragment.AubY;
            if (tokenBase9 == null) {
                Intrinsics.gEmmrt("");
                tokenBase9 = null;
            }
            memeModeTransactionFragment.getNewProxyInstance = actionBar.OLrzqt(strAuCTel2, tokenBase9, memeModeTransactionFragment.zsXlph(), C31125loC.KWHzl(memeModeTransactionFragment));
            C31055lmm.StateListAnimator stateListAnimator = C31055lmm.Companion;
            String strAuCTel3 = memeModeTransactionFragment.AuCTel();
            TokenBase tokenBase10 = memeModeTransactionFragment.AubY;
            if (tokenBase10 == null) {
                Intrinsics.gEmmrt("");
                tokenBase10 = null;
            }
            memeModeTransactionFragment.iwGUEr = stateListAnimator.AEQbTJ(strAuCTel3, tokenBase10, memeModeTransactionFragment.zsXlph(), C31125loC.KWHzl(memeModeTransactionFragment));
        } else {
            androidx.fragment.app.Fragment fragmentFindFragmentByTag = memeModeTransactionFragment.getChildFragmentManager().findFragmentByTag("memeModeBuyFragment");
            memeModeTransactionFragment.getNewProxyInstance = fragmentFindFragmentByTag instanceof MemeModeBuyNewFragment ? (MemeModeBuyNewFragment) fragmentFindFragmentByTag : null;
            androidx.fragment.app.Fragment fragmentFindFragmentByTag2 = memeModeTransactionFragment.getChildFragmentManager().findFragmentByTag("memeModeSellFragment");
            memeModeTransactionFragment.iwGUEr = fragmentFindFragmentByTag2 instanceof C31055lmm ? (C31055lmm) fragmentFindFragmentByTag2 : null;
        }
        memeModeTransactionFragment.isConnected();
        memeModeTransactionFragment.AwvSrB();
        boolean zKWHzl = C31172lox.KWHzl(C31125loC.KWHzl(memeModeTransactionFragment), C31172lox.Companion.KWHzl());
        if (zKWHzl) {
            MemeModeTransactionViewModel memeModeTransactionViewModelFetchVPNInfo3 = memeModeTransactionFragment.fetchVPNInfo();
            String strAuCTel4 = memeModeTransactionFragment.AuCTel();
            TokenBase tokenBase11 = memeModeTransactionFragment.AubY;
            if (tokenBase11 == null) {
                Intrinsics.gEmmrt("");
                tokenBase11 = null;
            }
            String chainId3 = tokenBase11.getChainId();
            TokenBase tokenBase12 = memeModeTransactionFragment.AubY;
            if (tokenBase12 == null) {
                Intrinsics.gEmmrt("");
                tokenBase12 = null;
            }
            memeModeTransactionViewModelFetchVPNInfo3.OLrzqt(strAuCTel4, chainId3, tokenBase12.getTokenContractAddress());
        }
        MemeModeTransactionViewModel memeModeTransactionViewModelFetchVPNInfo4 = memeModeTransactionFragment.fetchVPNInfo();
        String strAuCTel5 = memeModeTransactionFragment.AuCTel();
        TokenBase tokenBase13 = memeModeTransactionFragment.AubY;
        if (tokenBase13 == null) {
            Intrinsics.gEmmrt("");
            tokenBase13 = null;
        }
        String tokenContractAddress2 = tokenBase13.getTokenContractAddress();
        TokenBase tokenBase14 = memeModeTransactionFragment.AubY;
        if (tokenBase14 == null) {
            Intrinsics.gEmmrt("");
            tokenBase14 = null;
        }
        memeModeTransactionViewModelFetchVPNInfo4.copydefault(strAuCTel5, tokenContractAddress2, tokenBase14.getChainId());
        if (zKWHzl) {
            memeModeTransactionFragment.fetchVPNInfo().getNewProxyInstance();
        }
        MemeModeTransactionViewModel memeModeTransactionViewModelFetchVPNInfo5 = memeModeTransactionFragment.fetchVPNInfo();
        TokenBase tokenBase15 = memeModeTransactionFragment.AubY;
        if (tokenBase15 == null) {
            Intrinsics.gEmmrt("");
        } else {
            tokenBase4 = tokenBase15;
        }
        MemeModeTransactionViewModel.trackDexTradeHomeFullPageView$default(memeModeTransactionViewModelFetchVPNInfo5, tokenBase4.getChainId(), null, memeModeTransactionFragment.fetchVPNInfo().OLrzqt(C31125loC.KWHzl(memeModeTransactionFragment)), memeModeTransactionFragment.fetchVPNInfo().KWHzl(C31125loC.KWHzl(memeModeTransactionFragment)), C56423yEv.EZpvd(C56390yDp.OLrzqt("popup_source", memeModeTransactionFragment.fetchVPNInfo().AEQbTJ(C31125loC.KWHzl(memeModeTransactionFragment)))), C56402yEa.EZpvd("popup_source"), 2, null);
        return Unit.INSTANCE;
    }

    public static final class PendingIntent implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public PendingIntent() {
        }

        /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.trade.features.home.meme.viewmodel.transaction.MemeModeTransactionViewModel.trackDexTradeHomeFullPageClick$default(com.okinc.business.trade.features.home.meme.viewmodel.transaction.MemeModeTransactionViewModel, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, int, java.lang.Object):void */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00fc  */
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onTabSelected(TabLayout.Tab tab) {
            MemeStrategyType memeStrategyTypeFetchVPNInfo;
            C31123loA c31123loA;
            Intrinsics.checkNotNullParameter(tab, "");
            C22380heK.OLrzqt.copydefault(MemeModeTransactionFragment.this.AuCTel()).EZpvd(true).gEmmrt().AEQbTJ();
            C21588hEy c21588hEyValueOf = MemeModeTransactionFragment.valueOf(MemeModeTransactionFragment.this);
            TokenBase tokenBase = null;
            Integer numValueOf = (c21588hEyValueOf == null || (c31123loA = c21588hEyValueOf.AkhnZx) == null) ? null : Integer.valueOf(c31123loA.getSelectedTabPosition());
            MemeModeTransactionFragment.this.getFieldNames().AEQbTJ(tab.getPosition());
            MemeModeTransactionFragment.this.fetchVPNInfo().fetchVPNInfo().setValue((numValueOf != null && numValueOf.intValue() == 0) ? TransactionType.Buy : TransactionType.Sell);
            String strKWHzl = C25295ity.KWHzl(tab.getPosition());
            String strCopydefault = C25295ity.copydefault(C22372heC.EZpvd(MemeModeTransactionFragment.this.AuCTel()));
            String strAEQbTJ = C25295ity.AEQbTJ(tab.getPosition());
            TokenBase tokenBase2 = MemeModeTransactionFragment.this.AubY;
            if (tokenBase2 == null) {
                Intrinsics.gEmmrt("");
                tokenBase2 = null;
            }
            C25295ity.KWHzl(TabTitleInfo.KEY_MEME, strKWHzl, strCopydefault, strAEQbTJ, tokenBase2.getChainName());
            C24371ica c24371ica = C24371ica.OLrzqt;
            String value = ((numValueOf != null && numValueOf.intValue() == 0) ? DexTrackEventParameter.ButtonName.BUY : DexTrackEventParameter.ButtonName.SELL).getValue();
            TokenBase tokenBase3 = MemeModeTransactionFragment.this.AubY;
            if (tokenBase3 == null) {
                Intrinsics.gEmmrt("");
                tokenBase3 = null;
            }
            String tokenContractAddress = tokenBase3.getTokenContractAddress();
            TransactionType transactionType = TransactionType.Buy;
            String value2 = (transactionType == MemeModeTransactionFragment.this.fetchVPNInfo().fetchVPNInfo().getValue() ? DexTrackEventParameter.ButtonName.BUY : DexTrackEventParameter.ButtonName.SELL).getValue();
            String strAubY = MemeModeTransactionFragment.this.AubY();
            TokenBase tokenBase4 = MemeModeTransactionFragment.this.AubY;
            if (tokenBase4 == null) {
                Intrinsics.gEmmrt("");
                tokenBase4 = null;
            }
            String eventSource = tokenBase4.getEventSource();
            AbstractC30827liW abstractC30827liWValueOf = MemeModeTransactionFragment.this.valueOf();
            if (abstractC30827liWValueOf == null) {
                memeStrategyTypeFetchVPNInfo = null;
            } else {
                if (!abstractC30827liWValueOf.isAdded()) {
                    abstractC30827liWValueOf = null;
                }
                if (abstractC30827liWValueOf != null) {
                    memeStrategyTypeFetchVPNInfo = abstractC30827liWValueOf.fetchVPNInfo();
                }
            }
            c24371ica.OLrzqt(value, tokenContractAddress, value2, strAubY, eventSource, memeStrategyTypeFetchVPNInfo);
            String buttonName = (transactionType == MemeModeTransactionFragment.this.fetchVPNInfo().fetchVPNInfo().getValue() ? TrackButtonName.BUY_TAB : TrackButtonName.SELL_TAB).getButtonName();
            MemeModeTransactionViewModel memeModeTransactionViewModelFetchVPNInfo = MemeModeTransactionFragment.this.fetchVPNInfo();
            TokenBase tokenBase5 = MemeModeTransactionFragment.this.AubY;
            if (tokenBase5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                tokenBase = tokenBase5;
            }
            MemeModeTransactionViewModel.trackDexTradeHomeFullPageClick$default(memeModeTransactionViewModelFetchVPNInfo, tokenBase.getChainId(), MemeModeTransactionFragment.this.fetchVPNInfo().OLrzqt(C31125loC.KWHzl(MemeModeTransactionFragment.this)), MemeModeTransactionFragment.this.fetchVPNInfo().KWHzl(C31125loC.KWHzl(MemeModeTransactionFragment.this)), null, C56424yEw.gEmmrt(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, buttonName), C56390yDp.OLrzqt("button_type", ButtonType.TRADE.getType()), C56390yDp.OLrzqt("popup_source", MemeModeTransactionFragment.this.fetchVPNInfo().AEQbTJ(C31125loC.KWHzl(MemeModeTransactionFragment.this)))), 8, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AxsJAY() {
        C31123loA c31123loA;
        C31123loA c31123loA2;
        C31123loA c31123loA3;
        C31123loA c31123loA4;
        C31123loA c31123loA5;
        C21588hEy c21588hEy = (C21588hEy) fARcdN();
        if (c21588hEy != null && (c31123loA5 = c21588hEy.AkhnZx) != null) {
            c31123loA5.m8684setStylePwt5vo(C31172lox.Companion.OLrzqt());
        }
        C21588hEy c21588hEy2 = (C21588hEy) fARcdN();
        if (c21588hEy2 != null && (c31123loA4 = c21588hEy2.AkhnZx) != null) {
            c31123loA4.removeOnTabSelectedListener((TabLayout.OnTabSelectedListener) this.hDKMBd);
        }
        C21588hEy c21588hEy3 = (C21588hEy) fARcdN();
        if (c21588hEy3 != null && (c31123loA3 = c21588hEy3.AkhnZx) != null) {
            c31123loA3.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) this.hDKMBd);
        }
        C21588hEy c21588hEy4 = (C21588hEy) fARcdN();
        if (c21588hEy4 == null || (c31123loA = c21588hEy4.AkhnZx) == null) {
            return;
        }
        C21588hEy c21588hEy5 = (C21588hEy) fARcdN();
        c31123loA.selectTab((c21588hEy5 == null || (c31123loA2 = c21588hEy5.AkhnZx) == null) ? null : c31123loA2.getTabAt(this.wlaJM), true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void uzCIH() {
        TextView textView;
        C21588hEy c21588hEy = (C21588hEy) fARcdN();
        if (c21588hEy == null || (textView = c21588hEy.KWHzl) == null) {
            return;
        }
        if (C31172lox.KWHzl(C31125loC.KWHzl(this), C31172lox.Companion.KWHzl()) || !C22416heu.gEmmrt()) {
            textView.setVisibility(4);
            return;
        }
        textView.setVisibility(0);
        MemeModeTransactionViewModel memeModeTransactionViewModelFetchVPNInfo = fetchVPNInfo();
        String strAuCTel = AuCTel();
        TokenBase tokenBase = this.AubY;
        if (tokenBase == null) {
            Intrinsics.gEmmrt("");
            tokenBase = null;
        }
        if (memeModeTransactionViewModelFetchVPNInfo.EZpvd(strAuCTel, tokenBase.getChainId())) {
            textView.setText(C23274hvD.Fragment.getPlaybackInfo);
        } else {
            textView.setText(C23274hvD.Fragment.DrqXHJ);
        }
    }

    public final void OLrzqt(TextView textView) {
        if (C31172lox.KWHzl(C31125loC.KWHzl(this), C31172lox.Companion.KWHzl()) || !C22416heu.gEmmrt()) {
            textView.setVisibility(4);
            return;
        }
        textView.setVisibility(0);
        Drawable drawable = ContextCompat.getDrawable(textView.getContext(), C52761wXj.TaskDescription.onProviderDisabled);
        if (drawable != null) {
            Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iKWHzl = C55298xhM.KWHzl(20.0f, context);
            Context context2 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            drawable.setBounds(0, 0, iKWHzl, C55298xhM.KWHzl(20.0f, context2));
        } else {
            drawable = null;
        }
        TextViewCompat.setCompoundDrawablesRelative(textView, null, null, drawable, null);
        TextViewCompat.setCompoundDrawableTintList(textView, ContextCompat.getColorStateList(textView.getContext(), C52761wXj.Activity.QwvEab));
        textView.setOnClickListener(new Application(textView, 1000L, this));
    }

    public final void values() {
        MemeModeTransactionViewModel memeModeTransactionViewModelFetchVPNInfo = fetchVPNInfo();
        TokenBase tokenBase = this.AubY;
        TokenBase tokenBase2 = null;
        if (tokenBase == null) {
            Intrinsics.gEmmrt("");
            tokenBase = null;
        }
        Pair<InterfaceC28268kVc, InterfaceC28268kVc> pairKWHzl = memeModeTransactionViewModelFetchVPNInfo.KWHzl(tokenBase);
        TransactionType value = fetchVPNInfo().fetchVPNInfo().getValue();
        if (value == null) {
            value = TransactionType.Buy;
        }
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        String strAEQbTJ = gKZ.EZpvd.AEQbTJ(value == TransactionType.Buy ? "dex/advanced/buy" : "dex/advanced/sell");
        Pair[] pairArr = new Pair[6];
        TokenBase tokenBase3 = this.AubY;
        if (tokenBase3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            tokenBase2 = tokenBase3;
        }
        pairArr[0] = C56390yDp.OLrzqt("chainId", tokenBase2.getChainId());
        pairArr[1] = C56390yDp.OLrzqt("buyTokenContractAddress", pairKWHzl.getSecond().copydefault());
        pairArr[2] = C56390yDp.OLrzqt("payTokenContractAddress", pairKWHzl.getFirst().copydefault());
        pairArr[3] = C56390yDp.OLrzqt("sellTokenContractAddress", pairKWHzl.getFirst().copydefault());
        pairArr[4] = C56390yDp.OLrzqt("forTokenContractAddress", pairKWHzl.getSecond().copydefault());
        pairArr[5] = C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, "");
        interfaceC43294rma.KWHzl(fragmentActivityRequireActivity, strAEQbTJ, C56424yEw.gEmmrt(pairArr), new Function1() { // from class: o.ljt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeModeTransactionFragment.KWHzl((AbstractC43238rlX) obj);
            }
        });
    }

    public static final Unit KWHzl(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void resetBuySellFragment$default(MemeModeTransactionFragment memeModeTransactionFragment, TransactionType transactionType, TokenBase tokenBase, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        memeModeTransactionFragment.copydefault(transactionType, tokenBase, z);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.trade.features.home.ui.meme.buy.MemeModeBuyNewFragment.ActionBar.newInstance-OT9-yGk$default(com.okinc.business.trade.features.home.ui.meme.buy.MemeModeBuyNewFragment$ActionBar, java.lang.String, com.okinc.business.dex.api.bean.TokenBase, java.lang.String, int, int, java.lang.Object):com.okinc.business.trade.features.home.ui.meme.buy.MemeModeBuyNewFragment */
    /* JADX DEBUG: Class process forced to load method for inline: o.lmm.StateListAnimator.newInstance-OT9-yGk$default(o.lmm$StateListAnimator, java.lang.String, com.okinc.business.dex.api.bean.TokenBase, java.lang.String, int, int, java.lang.Object):o.lmm */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(TransactionType transactionType, TokenBase tokenBase, boolean z) {
        boolean z2;
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        MemeModeBuyNewFragment memeModeBuyNewFragment = this.getNewProxyInstance;
        if (memeModeBuyNewFragment == null || !memeModeBuyNewFragment.isAdded()) {
            z2 = false;
        } else {
            MemeModeBuyNewFragment memeModeBuyNewFragment2 = this.getNewProxyInstance;
            Intrinsics.copydefault(memeModeBuyNewFragment2);
            fragmentTransactionBeginTransaction.remove(memeModeBuyNewFragment2);
            z2 = true;
        }
        C31055lmm c31055lmm = this.iwGUEr;
        if (c31055lmm != null && c31055lmm.isAdded()) {
            C31055lmm c31055lmm2 = this.iwGUEr;
            Intrinsics.copydefault(c31055lmm2);
            fragmentTransactionBeginTransaction.remove(c31055lmm2);
        } else {
            if (z2) {
            }
            this.getNewProxyInstance = MemeModeBuyNewFragment.ActionBar.m6638newInstanceOT9yGk$default(MemeModeBuyNewFragment.Companion, AuCTel(), tokenBase, null, C31125loC.KWHzl(this), 4, null);
            this.iwGUEr = C31055lmm.StateListAnimator.m8683newInstanceOT9yGk$default(C31055lmm.Companion, AuCTel(), tokenBase, null, C31125loC.KWHzl(this), 4, null);
            if (z) {
                KWHzl(transactionType);
                return;
            }
            return;
        }
        fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        this.getNewProxyInstance = MemeModeBuyNewFragment.ActionBar.m6638newInstanceOT9yGk$default(MemeModeBuyNewFragment.Companion, AuCTel(), tokenBase, null, C31125loC.KWHzl(this), 4, null);
        this.iwGUEr = C31055lmm.StateListAnimator.m8683newInstanceOT9yGk$default(C31055lmm.Companion, AuCTel(), tokenBase, null, C31125loC.KWHzl(this), 4, null);
        if (z) {
        }
    }

    public final void KWHzl(TransactionType transactionType) {
        C31055lmm c31055lmm;
        MemeModeBuyNewFragment memeModeBuyNewFragment = this.getNewProxyInstance;
        if (memeModeBuyNewFragment == null || (c31055lmm = this.iwGUEr) == null) {
            return;
        }
        if (transactionType == TransactionType.Buy) {
            if (memeModeBuyNewFragment.isAdded()) {
                FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
                Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
                fragmentTransactionBeginTransaction.show(memeModeBuyNewFragment);
                if (c31055lmm.isAdded()) {
                    fragmentTransactionBeginTransaction.hide(c31055lmm);
                }
                fragmentTransactionBeginTransaction.commitAllowingStateLoss();
                return;
            }
            FragmentTransaction fragmentTransactionBeginTransaction2 = getChildFragmentManager().beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction2, "");
            fragmentTransactionBeginTransaction2.add(C23274hvD.Application.hNurIN, memeModeBuyNewFragment, "memeModeBuyFragment");
            if (c31055lmm.isAdded()) {
                fragmentTransactionBeginTransaction2.hide(c31055lmm);
            }
            fragmentTransactionBeginTransaction2.commitNowAllowingStateLoss();
            return;
        }
        if (c31055lmm.isAdded()) {
            FragmentTransaction fragmentTransactionBeginTransaction3 = getChildFragmentManager().beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction3, "");
            fragmentTransactionBeginTransaction3.show(c31055lmm);
            if (memeModeBuyNewFragment.isAdded()) {
                fragmentTransactionBeginTransaction3.hide(memeModeBuyNewFragment);
            }
            fragmentTransactionBeginTransaction3.commitAllowingStateLoss();
            return;
        }
        FragmentTransaction fragmentTransactionBeginTransaction4 = getChildFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction4, "");
        fragmentTransactionBeginTransaction4.add(C23274hvD.Application.hNurIN, c31055lmm, "memeModeSellFragment");
        if (memeModeBuyNewFragment.isAdded()) {
            fragmentTransactionBeginTransaction4.hide(memeModeBuyNewFragment);
        }
        fragmentTransactionBeginTransaction4.commitNowAllowingStateLoss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void iwGUEr() {
        LottieAnimationView lottieAnimationView;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        int iKWHzl = C31125loC.KWHzl(this);
        C31172lox.TaskDescription taskDescription = C31172lox.Companion;
        if (C31172lox.KWHzl(iKWHzl, taskDescription.KWHzl())) {
            C21588hEy c21588hEy = (C21588hEy) fARcdN();
            if (c21588hEy == null || (frameLayout2 = c21588hEy.valueOf) == null) {
                return;
            }
            C25352ivB.AEQbTJ(frameLayout2, CDNSourceManager.LottieSource.DEX_MEME_LOADING);
            return;
        }
        if (C31172lox.KWHzl(iKWHzl, taskDescription.OLrzqt())) {
            C21588hEy c21588hEy2 = (C21588hEy) fARcdN();
            if (c21588hEy2 != null && (frameLayout = c21588hEy2.djBIcL) != null) {
                frameLayout.setVisibility(0);
            }
            C21588hEy c21588hEy3 = (C21588hEy) fARcdN();
            if (c21588hEy3 == null || (lottieAnimationView = c21588hEy3.gEmmrt) == null) {
                return;
            }
            lottieAnimationView.setVisibility(0);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void gEmmrt() {
        C21588hEy c21588hEy;
        LottieAnimationView lottieAnimationView;
        FrameLayout frameLayout;
        int iKWHzl = C31125loC.KWHzl(this);
        C31172lox.TaskDescription taskDescription = C31172lox.Companion;
        if (C31172lox.KWHzl(iKWHzl, taskDescription.KWHzl())) {
            C21588hEy c21588hEy2 = (C21588hEy) fARcdN();
            if (c21588hEy2 == null || (frameLayout = c21588hEy2.valueOf) == null) {
                return;
            }
            C57600ylV.AEQbTJ(frameLayout);
            return;
        }
        if (!C31172lox.KWHzl(iKWHzl, taskDescription.OLrzqt()) || (c21588hEy = (C21588hEy) fARcdN()) == null || (lottieAnimationView = c21588hEy.gEmmrt) == null) {
            return;
        }
        lottieAnimationView.setVisibility(8);
    }

    private final void AwvSrB() {
        InterfaceC58217yxC interfaceC58217yxC = this.zLjUOn;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX<C9860bdZ> abstractC58185ywXEZpvd = C22380heK.OLrzqt.copydefault(AuCTel()).fARcdN().EZpvd(this.zsXlph + this);
        final Function1 function1 = new Function1() { // from class: o.ljq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeModeTransactionFragment.AEQbTJ(this.EZpvd, (C9860bdZ) obj);
            }
        };
        this.zLjUOn = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.ljn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MemeModeTransactionFragment.values(function1, obj);
            }
        });
    }

    public static final void values(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(MemeModeTransactionFragment memeModeTransactionFragment, C9860bdZ c9860bdZ) {
        String lowerCase;
        MemeModeTransactionViewModel memeModeTransactionViewModelFetchVPNInfo = memeModeTransactionFragment.fetchVPNInfo();
        TokenBase tokenBase = memeModeTransactionFragment.AubY;
        if (tokenBase == null) {
            Intrinsics.gEmmrt("");
            tokenBase = null;
        }
        String strKWHzl = memeModeTransactionViewModelFetchVPNInfo.KWHzl(tokenBase.getChainId());
        Locale locale = Locale.ROOT;
        String lowerCase2 = strKWHzl.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        String strCopydefault = c9860bdZ.copydefault();
        if (strCopydefault != null) {
            lowerCase = strCopydefault.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        } else {
            lowerCase = null;
        }
        if (Intrinsics.EZpvd((Object) lowerCase2, (Object) lowerCase)) {
            String strValueOf = String.valueOf(c9860bdZ.OLrzqt());
            TokenBase tokenBase2 = memeModeTransactionFragment.AubY;
            if (tokenBase2 == null) {
                Intrinsics.gEmmrt("");
                tokenBase2 = null;
            }
            if (Intrinsics.EZpvd((Object) strValueOf, (Object) tokenBase2.getChainId())) {
                TokenBase tokenBase3 = memeModeTransactionFragment.AubY;
                if (tokenBase3 == null) {
                    Intrinsics.gEmmrt("");
                    tokenBase3 = null;
                }
                String chainId = tokenBase3.getChainId();
                TokenBase tokenBase4 = memeModeTransactionFragment.AubY;
                if (tokenBase4 == null) {
                    Intrinsics.gEmmrt("");
                    tokenBase4 = null;
                }
                boolean z = false;
                String strEZpvd = C23311hvo.EZpvd(chainId, tokenBase4.getTokenContractAddress(), false);
                MemeModeTransactionViewModel memeModeTransactionViewModelFetchVPNInfo2 = memeModeTransactionFragment.fetchVPNInfo();
                TokenBase tokenBase5 = memeModeTransactionFragment.AubY;
                if (tokenBase5 == null) {
                    Intrinsics.gEmmrt("");
                    tokenBase5 = null;
                }
                String chainId2 = tokenBase5.getChainId();
                TokenBase tokenBase6 = memeModeTransactionFragment.AubY;
                if (tokenBase6 == null) {
                    Intrinsics.gEmmrt("");
                    tokenBase6 = null;
                }
                DexMultiTokenInfoBean dexMultiTokenInfoBeanOLrzqt = memeModeTransactionViewModelFetchVPNInfo2.OLrzqt(chainId2, tokenBase6.getTokenContractAddress());
                TokenBase tokenBase7 = memeModeTransactionFragment.AubY;
                if (tokenBase7 == null) {
                    Intrinsics.gEmmrt("");
                    tokenBase7 = null;
                }
                String chainId3 = tokenBase7.getChainId();
                String tokenContractAddress = dexMultiTokenInfoBeanOLrzqt != null ? dexMultiTokenInfoBeanOLrzqt.getTokenContractAddress() : null;
                if (tokenContractAddress == null) {
                    tokenContractAddress = "";
                }
                if (dexMultiTokenInfoBeanOLrzqt != null && dexMultiTokenInfoBeanOLrzqt.isMainChainCoin()) {
                    z = true;
                }
                String strEZpvd2 = C23311hvo.EZpvd(chainId3, tokenContractAddress, z);
                String strValueOf2 = String.valueOf(c9860bdZ.OLrzqt());
                String strAhwBna = c9860bdZ.AhwBna();
                String strEZpvd3 = C23311hvo.EZpvd(strValueOf2, strAhwBna != null ? strAhwBna : "", Intrinsics.EZpvd(c9860bdZ.AYXKKw(), Boolean.TRUE));
                if (Intrinsics.EZpvd((Object) strEZpvd3, (Object) strEZpvd)) {
                    memeModeTransactionFragment.fetchVPNInfo().djBIcL().postValue(c9860bdZ);
                } else if (Intrinsics.EZpvd((Object) strEZpvd3, (Object) strEZpvd2)) {
                    memeModeTransactionFragment.fetchVPNInfo().valueOf().postValue(c9860bdZ);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.hTH, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C31123loA c31123loA;
        InterfaceC58217yxC interfaceC58217yxC;
        fetchVPNInfo().wlaJM();
        if (this.zLjUOn != null && (!r0.isDisposed()) && (interfaceC58217yxC = this.zLjUOn) != null) {
            interfaceC58217yxC.dispose();
        }
        this.zLjUOn = null;
        C21588hEy c21588hEy = (C21588hEy) fARcdN();
        if (c21588hEy != null && (c31123loA = c21588hEy.AkhnZx) != null) {
            c31123loA.removeOnTabSelectedListener((TabLayout.OnTabSelectedListener) this.hDKMBd);
        }
        C33050mpD.OLrzqt(this.AuCTel);
        Function1<? super TransactionType, Unit> function1 = this.AkhnZx;
        if (function1 != null) {
            TransactionType value = fetchVPNInfo().fetchVPNInfo().getValue();
            if (value == null) {
                value = TransactionType.Buy;
            }
            function1.invoke(value);
        }
        this.AkhnZx = null;
        this.fetchVPNInfo = null;
        this.AuCTelauCTel = null;
        this.getNewProxyInstance = null;
        this.iwGUEr = null;
        try {
            getLifecycle().removeObserver(this.djBIcL);
        } catch (Exception unused) {
        }
        super.onDestroyView();
    }

    @Override // o.hTH, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        getNewProxyInstance().EZpvd();
        C25333iuj c25333iuj = this.AuCTelauCTel;
        if (c25333iuj != null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            c25333iuj.EZpvd(fragmentActivityRequireActivity);
        }
    }

    @Override // o.hTH, o.AbstractC32998moE
    public void onInvisible() {
        super.onInvisible();
        getNewProxyInstance().OLrzqt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String AubY() {
        return C31172lox.KWHzl(C31125loC.KWHzl(this), C31172lox.Companion.OLrzqt()) ? "MARKET" : "DEX";
    }

    @Override // o.InterfaceC19679gLh
    public View copydefault() {
        C25333iuj c25333iuj = this.AuCTelauCTel;
        if (c25333iuj != null) {
            return c25333iuj;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        this.AuCTelauCTel = new C25333iuj(contextRequireContext, null, true, getFieldNames().fARcdN(), getFieldNames().isConnected(), 2, null);
        zuBGHE();
        return this.AuCTelauCTel;
    }

    private final void zuBGHE() {
        C25333iuj c25333iuj = this.AuCTelauCTel;
        if (c25333iuj != null) {
            c25333iuj.setOnKlineIconClick(new Function0() { // from class: o.lkf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MemeModeTransactionFragment.fJNWhG(this.copydefault);
                }
            });
        }
        C25333iuj c25333iuj2 = this.AuCTelauCTel;
        if (c25333iuj2 != null) {
            c25333iuj2.setOnMoreIconClick(new Function1() { // from class: o.lke
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MemeModeTransactionFragment.copydefault(this.KWHzl, ((java.lang.Integer) obj).intValue());
                }
            });
        }
    }

    public static final Unit fJNWhG(MemeModeTransactionFragment memeModeTransactionFragment) {
        TokenBase tokenBase;
        TokenBase tokenBase2 = null;
        if (memeModeTransactionFragment.getHost() != null) {
            Context context = memeModeTransactionFragment.getContext();
            if (context != null) {
                String strAuCTel = memeModeTransactionFragment.AuCTel();
                TokenBase tokenBase3 = memeModeTransactionFragment.AubY;
                if (tokenBase3 == null) {
                    Intrinsics.gEmmrt("");
                    tokenBase = null;
                } else {
                    tokenBase = tokenBase3;
                }
                C25352ivB.openMarketDetailPage$default(context, strAuCTel, tokenBase.copy(((-8392705) & 1) != 0 ? tokenBase.chainId : null, ((-8392705) & 2) != 0 ? tokenBase.tokenContractAddress : null, ((-8392705) & 4) != 0 ? tokenBase.tokenLogoUrl : null, ((-8392705) & 8) != 0 ? tokenBase.chainLogoUrl : null, ((-8392705) & 16) != 0 ? tokenBase.chainBWLogoUrl : null, ((-8392705) & 32) != 0 ? tokenBase.tokenSymbol : null, ((-8392705) & 64) != 0 ? tokenBase.tokenName : null, ((-8392705) & 128) != 0 ? tokenBase.isCollected : 0, ((-8392705) & 256) != 0 ? tokenBase.decimals : 0, ((-8392705) & 512) != 0 ? tokenBase.isCustomToken : 0, ((-8392705) & 1024) != 0 ? tokenBase.isSubscribe : 0, ((-8392705) & 2048) != 0 ? tokenBase.uniqueId : null, ((-8392705) & 4096) != 0 ? tokenBase.source : "meme_mode", ((-8392705) & 8192) != 0 ? tokenBase.tokenSource : null, ((-8392705) & 16384) != 0 ? tokenBase.type : null, ((-8392705) & 32768) != 0 ? tokenBase.chainName : null, ((-8392705) & 65536) != 0 ? tokenBase.isLeveraged : null, ((-8392705) & 131072) != 0 ? tokenBase.isSafeMoonToken : 0, ((-8392705) & 262144) != 0 ? tokenBase.isHoneypot : 0, ((-8392705) & 524288) != 0 ? tokenBase.localIsNeedRequestNet : false, ((-8392705) & 1048576) != 0 ? tokenBase.eventSource : null, ((-8392705) & 2097152) != 0 ? tokenBase.marketTabName : null, ((-8392705) & 4194304) != 0 ? tokenBase.showSourceAlert : false, ((-8392705) & 8388608) != 0 ? tokenBase.fromTrading : true, ((-8392705) & 16777216) != 0 ? tokenBase.moduleNameEnglish : null, ((-8392705) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tokenBase.moduleId : null, ((-8392705) & 67108864) != 0 ? tokenBase.sourcePageName : null, ((-8392705) & 134217728) != 0 ? tokenBase.srcType : 0, ((-8392705) & 268435456) != 0 ? tokenBase.isHighRisk : false, ((-8392705) & 536870912) != 0 ? tokenBase.referralCode : null, ((-8392705) & 1073741824) != 0 ? tokenBase.isNativeToken : null, ((-8392705) & Integer.MIN_VALUE) != 0 ? tokenBase.isMarketDetailEntry : false), "trade_meme_mode", null, new int[0], 8, null);
            }
            String strCopydefault = C25295ity.copydefault(C22372heC.EZpvd(memeModeTransactionFragment.AuCTel()));
            String value = DexTrackEventParameter.ButtonName.KLINE.getValue();
            TokenBase tokenBase4 = memeModeTransactionFragment.AubY;
            if (tokenBase4 == null) {
                Intrinsics.gEmmrt("");
                tokenBase4 = null;
            }
            C25295ity.KWHzl("swap", "advanced", strCopydefault, value, tokenBase4.getChainName());
        }
        MemeModeTransactionViewModel memeModeTransactionViewModelFetchVPNInfo = memeModeTransactionFragment.fetchVPNInfo();
        TokenBase tokenBase5 = memeModeTransactionFragment.AubY;
        if (tokenBase5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            tokenBase2 = tokenBase5;
        }
        MemeModeTransactionViewModel.trackDexTradeHomeFullPageClick$default(memeModeTransactionViewModelFetchVPNInfo, tokenBase2.getChainId(), memeModeTransactionFragment.fetchVPNInfo().OLrzqt(C31125loC.KWHzl(memeModeTransactionFragment)), memeModeTransactionFragment.fetchVPNInfo().KWHzl(C31125loC.KWHzl(memeModeTransactionFragment)), null, C56424yEw.gEmmrt(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, TrackButtonName.K_LINE.getButtonName()), C56390yDp.OLrzqt("button_type", ButtonType.GENERAL.getType())), 8, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(MemeModeTransactionFragment memeModeTransactionFragment, int i) {
        memeModeTransactionFragment.KWHzl(i);
        return Unit.INSTANCE;
    }

    public final AbstractC30827liW valueOf() {
        return getFieldNames().valueOf() == TransactionDirection.TransactionBuy.getValue() ? this.getNewProxyInstance : this.iwGUEr;
    }

    private final void KWHzl(int i) {
        C24473ieW c24473ieWAEQbTJ = C24473ieW.Companion.AEQbTJ(AuCTel(), new SwapBottomParamsBean(true, false, null, false, AuCTel(), null, null, false, null, null, null, null, false, i, true, "advanced", 8166, null), true, TriggeredFrom.MemeMarket);
        c24473ieWAEQbTJ.KWHzl(new Function1() { // from class: o.ljY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeModeTransactionFragment.djBIcL(this.OLrzqt, (java.lang.String) obj);
            }
        });
        MemeModeTransactionViewModel memeModeTransactionViewModelFetchVPNInfo = fetchVPNInfo();
        TokenBase tokenBase = this.AubY;
        TokenBase tokenBase2 = null;
        if (tokenBase == null) {
            Intrinsics.gEmmrt("");
            tokenBase = null;
        }
        String chainId = tokenBase.getChainId();
        EventPageNameType eventPageNameType = EventPageNameType.HOME_GENERAL;
        MemeModeTransactionViewModel.trackDexTradeHomeFullPageView$default(memeModeTransactionViewModelFetchVPNInfo, chainId, null, eventPageNameType.getPageName(), C25444iwo.EZpvd(C31125loC.KWHzl(c24473ieWAEQbTJ)), null, null, 50, null);
        c24473ieWAEQbTJ.show(getChildFragmentManager(), C24473ieW.class.getName());
        MemeModeTransactionViewModel memeModeTransactionViewModelFetchVPNInfo2 = fetchVPNInfo();
        TokenBase tokenBase3 = this.AubY;
        if (tokenBase3 == null) {
            Intrinsics.gEmmrt("");
            tokenBase3 = null;
        }
        MemeModeTransactionViewModel.trackDexTradeHomeFullPageView$default(memeModeTransactionViewModelFetchVPNInfo2, tokenBase3.getChainId(), null, eventPageNameType.getPageName(), null, null, null, 58, null);
        MemeModeTransactionViewModel memeModeTransactionViewModelFetchVPNInfo3 = fetchVPNInfo();
        TokenBase tokenBase4 = this.AubY;
        if (tokenBase4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            tokenBase2 = tokenBase4;
        }
        MemeModeTransactionViewModel.trackDexTradeHomeFullPageClick$default(memeModeTransactionViewModelFetchVPNInfo3, tokenBase2.getChainId(), eventPageNameType.getPageName(), null, null, C56424yEw.gEmmrt(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, TrackButtonName.GENERAL_INFO.getButtonName()), C56390yDp.OLrzqt("button_type", ButtonType.GENERAL.getType())), 12, null);
    }

    public static final Unit djBIcL(MemeModeTransactionFragment memeModeTransactionFragment, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        MemeModeTransactionViewModel memeModeTransactionViewModelFetchVPNInfo = memeModeTransactionFragment.fetchVPNInfo();
        TokenBase tokenBase = memeModeTransactionFragment.AubY;
        if (tokenBase == null) {
            Intrinsics.gEmmrt("");
            tokenBase = null;
        }
        MemeModeTransactionViewModel.trackDexTradeHomeFullPageClick$default(memeModeTransactionViewModelFetchVPNInfo, tokenBase.getChainId(), EventPageNameType.HOME_TRADE.getPageName(), null, null, C56424yEw.gEmmrt(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, str), C56390yDp.OLrzqt("button_type", ButtonType.GENERAL.getType())), 12, null);
        return Unit.INSTANCE;
    }

    private final C19818gQl zLjUOn() {
        return new C19818gQl(C25444iwo.EZpvd(C31125loC.KWHzl(this)), (fetchVPNInfo().fetchVPNInfo().getValue() == TransactionType.Buy ? TrackTransactionDirection.BUY : TrackTransactionDirection.SELL).getValue(), TrackOrderType.SWAP.getType(), null, 8, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void hDKMBd() {
        C21588hEy c21588hEy;
        FrameLayout frameLayout;
        if (!C31172lox.KWHzl(C31125loC.KWHzl(this), C31172lox.Companion.OLrzqt()) || (c21588hEy = (C21588hEy) fARcdN()) == null || (frameLayout = c21588hEy.djBIcL) == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }
}
