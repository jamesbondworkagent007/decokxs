package com.okinc.business.trade.features.home.ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dex.api.bean.LimitParam;
import com.okinc.business.dex.api.bean.TradeParam;
import com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingCreateParams;
import com.okinc.business.dex.trade.copytrading.home.data.CopyTradingHomeParams;
import com.okinc.business.dexlogic.bean.MemeTransactionParams;
import com.okinc.business.dexlogic.bean.TradeMode;
import com.okinc.business.dexlogic.bean.track.ButtonType;
import com.okinc.business.dexlogic.bean.track.EventPageNameType;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.trade.features.home.domain.model.TradingType;
import com.okinc.business.trade.features.home.ui.DexHomeFragment;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedModeParams;
import com.okinc.business.trade.features.home.ui.viewmodel.DexHomeViewModel;
import com.okinc.business.trade.widget.TradeGuideType;
import com.okinc.rxutils.RxBus;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC22421hez;
import o.AbstractC30450lbQ;
import o.AbstractC58185ywX;
import o.C21464hAi;
import o.C22001hUf;
import o.C22004hUi;
import o.C22354hdl;
import o.C22372heC;
import o.C22380heK;
import o.C22400hee;
import o.C22416heu;
import o.C22877hne;
import o.C23317hvu;
import o.C25295ity;
import o.C25352ivB;
import o.C28111kPh;
import o.C28251kUm;
import o.C30393laM;
import o.C30484lby;
import o.C31183lpH;
import o.C31200lpY;
import o.C33129mqd;
import o.C43251rlk;
import o.C56390yDp;
import o.C56392yDr;
import o.C56524yIo;
import o.C57656ymY;
import o.InterfaceC19682gLk;
import o.InterfaceC28107kPd;
import o.InterfaceC28261kUw;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC9738bbJ;
import o.gSN;
import o.gTI;
import o.pUU;
import o.rVN;
import o.xWN;
import o.xXG;
import o.xXJ;
import o.xXO;
import o.yBK;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class DexHomeFragment extends AbstractC30450lbQ implements InterfaceC19682gLk {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public C31183lpH AEQbTJ;
    public TradeParam AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public C30484lby KWHzl;
    public C21464hAi OLrzqt;

    @yCM
    public InterfaceC28107kPd activityScopeCache;
    public InterfaceC9738bbJ copydefault;
    public final InterfaceC56387yDm djBIcL;

    @yCM
    public gTI editStrategyNavigator;
    public final ActivityResultLauncher<gSN.Application> gEmmrt;
    public final InterfaceC56387yDm valueOf;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TradingType.values().length];
            try {
                iArr[TradingType.Meme.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TradingType.Advanced.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TradingType.Bridge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TradingType.CopyTrading.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TradingType.Swap.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TradingType.None.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            AEQbTJ = iArr;
        }
    }

    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    public static final void AEQbTJ(gSN.StateListAnimator stateListAnimator) {
    }

    public DexHomeFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.okinc.business.trade.features.home.ui.DexHomeFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.DexHomeFragment$special$$inlined$viewModels$default$2
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(DexHomeViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.DexHomeFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.DexHomeFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.DexHomeFragment$special$$inlined$viewModels$default$5
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
        this.valueOf = C31200lpY.copydefault(this);
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.lbg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(DexHomeFragment.EZpvd(this.EZpvd));
            }
        });
        ActivityResultLauncher<gSN.Application> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new gSN(), new ActivityResultCallback() { // from class: o.lbs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                DexHomeFragment.AEQbTJ((gSN.StateListAnimator) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.gEmmrt = activityResultLauncherRegisterForActivityResult;
    }

    public final DexHomeViewModel AhwBna() {
        return (DexHomeViewModel) this.AhwBna.getValue();
    }

    private final String values() {
        return (String) this.valueOf.getValue();
    }

    public final boolean gEmmrt() {
        return ((Boolean) this.djBIcL.getValue()).booleanValue();
    }

    public static final boolean EZpvd(DexHomeFragment dexHomeFragment) {
        Bundle arguments = dexHomeFragment.getArguments();
        return arguments != null && arguments.getBoolean("extra_transaction_dialog_style");
    }

    /* JADX DEBUG: Possible override for method o.lbQ.AEQbTJ()V */
    public final InterfaceC28107kPd AEQbTJ() {
        InterfaceC28107kPd interfaceC28107kPd = this.activityScopeCache;
        if (interfaceC28107kPd != null) {
            return interfaceC28107kPd;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final gTI EZpvd() {
        gTI gti = this.editStrategyNavigator;
        if (gti != null) {
            return gti;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.DexHomeFragment.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ DexHomeFragment newInstance$default(Activity activity, String str, TradeParam tradeParam, Bundle bundle, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                tradeParam = null;
            }
            if ((i & 4) != 0) {
                bundle = null;
            }
            if ((i & 8) != 0) {
                z = false;
            }
            return activity.KWHzl(str, tradeParam, bundle, z);
        }

        public final DexHomeFragment KWHzl(@NotNull String str, TradeParam tradeParam, Bundle bundle, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            DexHomeFragment dexHomeFragment = new DexHomeFragment();
            Bundle bundle2 = new Bundle();
            C31200lpY.EZpvd(bundle2, str);
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("extra_transaction_dialog_style", z);
            bundle2.putBundle("extra_bundle_common", bundle);
            bundle2.putBoolean("extra_transaction_dialog_style", z);
            if (tradeParam != null) {
                bundle2.putParcelable("trade_data", tradeParam);
            }
            dexHomeFragment.setArguments(bundle2);
            return dexHomeFragment;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.AYXKKw = arguments != null ? (TradeParam) ((Parcelable) BundleCompat.getParcelable(arguments, "trade_data", TradeParam.class)) : null;
        InterfaceC28107kPd interfaceC28107kPdAEQbTJ = AEQbTJ();
        C28111kPh c28111kPh = interfaceC28107kPdAEQbTJ instanceof C28111kPh ? (C28111kPh) interfaceC28107kPdAEQbTJ : null;
        if (c28111kPh != null) {
            c28111kPh.OLrzqt(values());
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21464hAi c21464hAiCopydefault = C21464hAi.copydefault(layoutInflater, viewGroup, false);
        this.OLrzqt = c21464hAiCopydefault;
        if (c21464hAiCopydefault != null) {
            return c21464hAiCopydefault.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC31214lpm
    public void OLrzqt() {
        FrameLayout frameLayout;
        if (C22416heu.ejfBZ()) {
            C57656ymY.OLrzqt.valueOf();
        }
        if (C22372heC.KWHzl(values())) {
            C22380heK.OLrzqt.AEQbTJ(values());
        }
        C30484lby c30484lbyAEQbTJ = C30484lby.Companion.AEQbTJ(values(), gEmmrt());
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        C21464hAi c21464hAi = this.OLrzqt;
        fragmentTransactionBeginTransaction.replace((c21464hAi == null || (frameLayout = c21464hAi.OLrzqt) == null) ? 0 : frameLayout.getId(), c30484lbyAEQbTJ).commitAllowingStateLoss();
        this.KWHzl = c30484lbyAEQbTJ;
        C23317hvu.EZpvd("");
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXG.class, new String[0]);
        final Function1 function1 = new Function1() { // from class: o.lbu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexHomeFragment.copydefault((xXG) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.lba
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DexHomeFragment.ejfBZ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.lbk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexHomeFragment.AhwBna((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.lbm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DexHomeFragment.AuCTel(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, gasjUx());
        AbstractC58185ywX abstractC58185ywXKWHzl2 = RxBus.KWHzl(C22001hUf.class, new String[0]);
        final Function1 function13 = new Function1() { // from class: o.lbn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexHomeFragment.AEQbTJ(this.KWHzl, (C22001hUf) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.lbl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DexHomeFragment.fIwbmz(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.lbj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexHomeFragment.valueOf((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ2 = abstractC58185ywXKWHzl2.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.lbr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DexHomeFragment.DbNXlk(function14, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ2, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ2, gasjUx());
        AhwBna().AkhnZx().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.lbp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexHomeFragment.EZpvd(this.copydefault, (TradingType) obj);
            }
        }));
        AbstractC58185ywX abstractC58185ywXKWHzl3 = RxBus.KWHzl(C22004hUi.class, new String[0]);
        final Function1 function15 = new Function1() { // from class: o.lbo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexHomeFragment.EZpvd(this.KWHzl, (C22004hUi) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM3 = new InterfaceC58227yxM() { // from class: o.lbv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DexHomeFragment.fJNWhG(function15, obj);
            }
        };
        final Function1 function16 = new Function1() { // from class: o.lbw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexHomeFragment.gEmmrt((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ3 = abstractC58185ywXKWHzl3.AEQbTJ(interfaceC58227yxM3, new InterfaceC58227yxM() { // from class: o.lbt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DexHomeFragment.fetchVPNInfo(function16, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ3, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ3, gasjUx());
        AbstractC58185ywX abstractC58185ywXKWHzl4 = RxBus.KWHzl(xXO.class, new String[0]);
        final Function1 function17 = new Function1() { // from class: o.lbx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexHomeFragment.copydefault(this.copydefault, (xXO) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM4 = new InterfaceC58227yxM() { // from class: o.lbz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DexHomeFragment.fARcdN(function17, obj);
            }
        };
        final Function1 function18 = new Function1() { // from class: o.laX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexHomeFragment.djBIcL((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ4 = abstractC58185ywXKWHzl4.AEQbTJ(interfaceC58227yxM4, new InterfaceC58227yxM() { // from class: o.laW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DexHomeFragment.isConnected(function18, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ4, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ4, gasjUx());
        AbstractC58185ywX abstractC58185ywXKWHzl5 = RxBus.KWHzl(xXJ.class, new String[0]);
        final Function1 function19 = new Function1() { // from class: o.laV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexHomeFragment.EZpvd(this.OLrzqt, (xXJ) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM5 = new InterfaceC58227yxM() { // from class: o.laU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DexHomeFragment.values(function19, obj);
            }
        };
        final Function1 function110 = new Function1() { // from class: o.laY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexHomeFragment.AYXKKw((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ5 = abstractC58185ywXKWHzl5.AEQbTJ(interfaceC58227yxM5, new InterfaceC58227yxM() { // from class: o.lbd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DexHomeFragment.AkhnZx(function110, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ5, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ5, gasjUx());
        C22380heK c22380heK = C22380heK.OLrzqt;
        c22380heK.copydefault(values()).EZpvd(false).valueOf().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.lbc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexHomeFragment.copydefault(this.copydefault, (TradeParam) obj);
            }
        }));
        c22380heK.copydefault(values()).EZpvd(true).valueOf().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.laZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexHomeFragment.KWHzl(this.AEQbTJ, (TradeParam) obj);
            }
        }));
        c22380heK.copydefault(values()).AhwBna().OLrzqt().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.lbb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexHomeFragment.KWHzl(this.EZpvd, (LimitParam) obj);
            }
        }));
        c22380heK.copydefault("default_trade").values().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.lbi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexHomeFragment.AEQbTJ(this.EZpvd, (MemeTransactionParams) obj);
            }
        }));
        c22380heK.copydefault("default_trade").EZpvd().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.lbh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexHomeFragment.OLrzqt(this.AEQbTJ, (AdvancedModeParams) obj);
            }
        }));
        c22380heK.copydefault("default_trade").KWHzl().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.lbe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexHomeFragment.OLrzqt(this.AEQbTJ, (CopyTradingHomeParams) obj);
            }
        }));
        c22380heK.copydefault("default_trade").AEQbTJ().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.lbf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexHomeFragment.copydefault(this.copydefault, (CopyTradingCreateParams) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ejfBZ(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(xXG xxg) {
        AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.StateListAnimator.OLrzqt);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AuCTel(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fIwbmz(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(DexHomeFragment dexHomeFragment, C22001hUf c22001hUf) {
        if (C22372heC.AEQbTJ(dexHomeFragment.values())) {
            C22380heK.OLrzqt.copydefault(dexHomeFragment.values()).fJNWhG().AhwBna().KWHzl();
            DexHomeViewModel.updateTradeType$default(dexHomeFragment.AhwBna(), dexHomeFragment.AhwBna().DbNXlk(), false, true, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DbNXlk(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit valueOf(Throwable th) {
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(DexHomeFragment dexHomeFragment, TradingType tradingType) {
        TrackButtonName trackButtonName;
        if (tradingType == TradingType.None) {
            return Unit.INSTANCE;
        }
        Intrinsics.copydefault(tradingType);
        dexHomeFragment.copydefault(tradingType);
        rVN.reportFullyDrawn$default((Fragment) dexHomeFragment, true, (String) null, 2, (Object) null);
        int i = Application.AEQbTJ[tradingType.ordinal()];
        if (i == 1) {
            trackButtonName = TrackButtonName.MODE_SELECT_MEME;
        } else if (i == 2) {
            trackButtonName = TrackButtonName.MODE_SELECT_SWAP;
        } else if (i == 3) {
            trackButtonName = TrackButtonName.MODE_SELECT_BRIDGE;
        } else if (i == 4) {
            trackButtonName = TrackButtonName.COPY_TRADE;
        } else {
            return Unit.INSTANCE;
        }
        dexHomeFragment.AhwBna().EZpvd(new C22400hee("DEXTrade_Home_FullPage_Click", EventPageNameType.HOME_TRADE.getPageName(), ButtonType.TRADE.getType(), trackButtonName.getButtonName()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fJNWhG(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(DexHomeFragment dexHomeFragment, C22004hUi c22004hUi) {
        if (!Intrinsics.EZpvd((Object) dexHomeFragment.values(), (Object) c22004hUi.OLrzqt())) {
            return Unit.INSTANCE;
        }
        DexHomeViewModel.updateTradeType$default(dexHomeFragment.AhwBna(), c22004hUi.AEQbTJ(), false, false, 6, null);
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fARcdN(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(DexHomeFragment dexHomeFragment, xXO xxo) {
        TradingType tradingType;
        InterfaceC9738bbJ interfaceC9738bbJ;
        InterfaceC9738bbJ interfaceC9738bbJDjBIcL = dexHomeFragment.AhwBna().djBIcL();
        int i = Application.AEQbTJ[dexHomeFragment.AhwBna().OLrzqt().ordinal()];
        if (i != 1) {
            if (i == 5) {
                if ((interfaceC9738bbJDjBIcL != null && interfaceC9738bbJDjBIcL.getFieldNames()) || ((interfaceC9738bbJ = dexHomeFragment.copydefault) != null && interfaceC9738bbJ.getFieldNames())) {
                    DexHomeViewModel.updateTradeType$default(dexHomeFragment.AhwBna(), TradingType.Swap, false, true, 2, null);
                }
                dexHomeFragment.copydefault = interfaceC9738bbJDjBIcL;
            }
        } else if (interfaceC9738bbJDjBIcL != null && interfaceC9738bbJDjBIcL.getFieldNames() && (tradingType = (TradingType) CollectionsKt___CollectionsKt.firstOrNull(TradingType.Companion.OLrzqt())) != null) {
            DexHomeViewModel.updateTradeType$default(dexHomeFragment.AhwBna(), tradingType, false, false, 6, null);
        }
        return Unit.INSTANCE;
    }

    public static final void isConnected(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(Throwable th) {
        Intrinsics.copydefault(th);
        pUU.KWHzl(th);
        return Unit.INSTANCE;
    }

    public static final void values(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(DexHomeFragment dexHomeFragment, xXJ xxj) {
        dexHomeFragment.valueOf();
        dexHomeFragment.AhwBna().EZpvd(new C22400hee("DEXTrade_Home_FullPage_Click", EventPageNameType.HOME_TRADE.getPageName(), ButtonType.TRADE.getType(), TrackButtonName.MODE_SELECT.getButtonName()));
        return Unit.INSTANCE;
    }

    public static final void AkhnZx(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(Throwable th) {
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(DexHomeFragment dexHomeFragment, TradeParam tradeParam) {
        if (!Intrinsics.EZpvd(tradeParam, TradeParam.Companion.AEQbTJ())) {
            dexHomeFragment.AYXKKw = tradeParam;
            DexHomeViewModel.updateTradeType$default(dexHomeFragment.AhwBna(), TradingType.Bridge, false, false, 6, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit KWHzl(DexHomeFragment dexHomeFragment, TradeParam tradeParam) {
        TradingType tradingType;
        if (tradeParam == null || Intrinsics.EZpvd(tradeParam, TradeParam.Companion.AEQbTJ())) {
            return Unit.INSTANCE;
        }
        dexHomeFragment.AYXKKw = tradeParam;
        String swapType = tradeParam.getSwapType();
        if (swapType != null && swapType.length() > 0) {
            String swapType2 = tradeParam.getSwapType();
            if (!Intrinsics.EZpvd((Object) swapType2, (Object) "type_swap") && Intrinsics.EZpvd((Object) swapType2, (Object) "type_meme")) {
                tradingType = TradingType.Meme;
            } else {
                tradingType = TradingType.Swap;
            }
        } else {
            String tradeMode = tradeParam.getTradeMode();
            Integer numValueOf = null;
            if (tradeMode != null) {
                if (tradeMode.length() == 0) {
                    tradeMode = null;
                }
                if (tradeMode != null) {
                    numValueOf = Integer.valueOf(C33129mqd.AhwBna(tradeMode));
                }
            }
            int type = TradeMode.SimpleBuyMode.getType();
            if (numValueOf != null && numValueOf.intValue() == type) {
                tradingType = TradingType.Swap;
            } else {
                int type2 = TradeMode.SimpleSellMode.getType();
                if (numValueOf == null || numValueOf.intValue() != type2) {
                    int type3 = TradeMode.SwapMode.getType();
                    if (numValueOf != null && numValueOf.intValue() == type3) {
                        tradingType = TradingType.Swap;
                    } else {
                        tradingType = TradingType.Swap;
                    }
                }
            }
        }
        DexHomeViewModel.updateTradeType$default(dexHomeFragment.AhwBna(), tradingType, false, false, 6, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(DexHomeFragment dexHomeFragment, LimitParam limitParam) {
        if (Intrinsics.EZpvd(limitParam, LimitParam.Companion.AEQbTJ())) {
            return Unit.INSTANCE;
        }
        InterfaceC9738bbJ interfaceC9738bbJValueOf = C22380heK.OLrzqt.copydefault(dexHomeFragment.values()).fARcdN().valueOf();
        if (interfaceC9738bbJValueOf != null && interfaceC9738bbJValueOf.getFieldNames()) {
            Context context = dexHomeFragment.getContext();
            if (context != null) {
                C25352ivB.KWHzl(context, false);
            }
            return Unit.INSTANCE;
        }
        TradingType tradingTypeOLrzqt = dexHomeFragment.AhwBna().OLrzqt();
        TradingType tradingType = TradingType.Swap;
        if (tradingTypeOLrzqt == tradingType) {
            return Unit.INSTANCE;
        }
        DexHomeViewModel.updateTradeType$default(dexHomeFragment.AhwBna(), tradingType, false, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.trade.features.home.ui.viewmodel.DexHomeViewModel.updateTradeType$default(com.okinc.business.trade.features.home.ui.viewmodel.DexHomeViewModel, com.okinc.business.trade.features.home.domain.model.TradingType, boolean, boolean, int, java.lang.Object):void */
    public static final Unit AEQbTJ(DexHomeFragment dexHomeFragment, MemeTransactionParams memeTransactionParams) {
        if (!Intrinsics.EZpvd(memeTransactionParams, MemeTransactionParams.Companion.EZpvd())) {
            DexHomeViewModel.updateTradeType$default(dexHomeFragment.AhwBna(), TradingType.Meme, false, false, 6, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(DexHomeFragment dexHomeFragment, AdvancedModeParams advancedModeParams) {
        if (!Intrinsics.EZpvd(advancedModeParams, AdvancedModeParams.Companion.copydefault())) {
            DexHomeViewModel.updateTradeType$default(dexHomeFragment.AhwBna(), TradingType.Advanced, false, false, 6, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(DexHomeFragment dexHomeFragment, CopyTradingHomeParams copyTradingHomeParams) {
        Bundle bundleBundleOf;
        Bundle arguments = dexHomeFragment.getArguments();
        if (arguments == null || (bundleBundleOf = arguments.getBundle("extra_bundle_common")) == null) {
            bundleBundleOf = BundleKt.bundleOf();
        }
        bundleBundleOf.putInt("tab", copyTradingHomeParams.OLrzqt());
        Bundle arguments2 = dexHomeFragment.getArguments();
        if (arguments2 != null) {
            arguments2.putBundle("extra_bundle_common", bundleBundleOf);
        }
        DexHomeViewModel.updateTradeType$default(dexHomeFragment.AhwBna(), TradingType.CopyTrading, false, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.gTI.navigateToCreate$default(o.gTI, kotlinx.coroutines.CoroutineScope, androidx.activity.result.ActivityResultLauncher, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.track.DexTrackEventParameter$EditStrategyFrom, java.lang.Integer, int, java.lang.Object):void */
    public static final Unit copydefault(DexHomeFragment dexHomeFragment, CopyTradingCreateParams copyTradingCreateParams) {
        if (!TradingType.Companion.AEQbTJ().contains(TradingType.CopyTrading)) {
            return Unit.INSTANCE;
        }
        dexHomeFragment.EZpvd().EZpvd(LifecycleOwnerKt.getLifecycleScope(dexHomeFragment), dexHomeFragment.gEmmrt, (64 & 4) != 0 ? null : null, (64 & 8) != 0 ? null : copyTradingCreateParams.getStrategyId(), (64 & 16) != 0 ? null : copyTradingCreateParams.getCopyFrom(), (64 & 32) != 0 ? DexTrackEventParameter.EditStrategyFrom.DASHBOARD : DexTrackEventParameter.EditStrategyFrom.DEEPLINK, (64 & 64) != 0 ? null : null);
        return Unit.INSTANCE;
    }

    public final void valueOf() {
        C25295ity.KWHzl(C22877hne.getBusinessType$default(C22877hne.OLrzqt, values(), false, 2, null), AhwBna().KWHzl(AhwBna().OLrzqt()), C22372heC.AEQbTJ(values()) ? "no" : "yes", "switch", "");
        C22354hdl.Activity activity = C22354hdl.Companion;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        activity.EZpvd(fragmentActivityRequireActivity, AhwBna().OLrzqt(), AhwBna(), new Function1() { // from class: o.laP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexHomeFragment.OLrzqt(this.EZpvd, (TradingType) obj);
            }
        });
        AhwBna().EZpvd(new C22400hee("DEXTrade_Home_FullPage_View", EventPageNameType.HOME_TRADE.getPageName(), "", ""));
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.hne.getBusinessType$default(o.hne, java.lang.String, boolean, int, java.lang.Object):java.lang.String */
    public static final Unit OLrzqt(DexHomeFragment dexHomeFragment, TradingType tradingType) {
        String str;
        Intrinsics.checkNotNullParameter(tradingType, "");
        switch (Application.AEQbTJ[tradingType.ordinal()]) {
            case 1:
                str = "to_meme";
                break;
            case 2:
                str = "to_cefi";
                break;
            case 3:
                str = "to_bridge";
                break;
            case 4:
                str = "to_copy_trading";
                break;
            case 5:
                str = "to_advance";
                break;
            case 6:
                str = "";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        C25295ity.KWHzl(C22877hne.getBusinessType$default(C22877hne.OLrzqt, dexHomeFragment.values(), false, 2, null), dexHomeFragment.AhwBna().KWHzl(tradingType), C22372heC.AEQbTJ(dexHomeFragment.values()) ? "no" : "yes", str, "");
        DexHomeViewModel.updateTradeType$default(dexHomeFragment.AhwBna(), tradingType, false, false, 6, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC19682gLk
    public LinearLayoutCompat copydefault() {
        C30484lby c30484lby = this.KWHzl;
        if (c30484lby != null) {
            return c30484lby.copydefault();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void djBIcL() {
        Pair pairOLrzqt;
        TradingType tradingTypeDbNXlk;
        TradeParam tradeParam = this.AYXKKw;
        if (tradeParam != null) {
            String swapType = tradeParam.getSwapType();
            if (swapType == null) {
                if (Intrinsics.EZpvd((Object) tradeParam.getFromCoinInfo().getChainId(), (Object) "0") || Intrinsics.EZpvd((Object) tradeParam.getToCoinInfo().getChainId(), (Object) "0")) {
                    tradingTypeDbNXlk = TradingType.Bridge;
                } else {
                    tradingTypeDbNXlk = AhwBna().DbNXlk();
                }
                pairOLrzqt = C56390yDp.OLrzqt(tradingTypeDbNXlk, Boolean.TRUE);
                if (pairOLrzqt == null) {
                }
            } else {
                int iHashCode = swapType.hashCode();
                if (iHashCode == 390159406) {
                    if (swapType.equals("type_bridge")) {
                        pairOLrzqt = C56390yDp.OLrzqt(TradingType.Bridge, Boolean.valueOf(Intrinsics.EZpvd(tradeParam.getRecordSwapTypeCache(), Boolean.TRUE)));
                    }
                    if (pairOLrzqt == null) {
                    }
                } else if (iHashCode != 519156501) {
                    if (iHashCode == 519352184 && swapType.equals("type_swap")) {
                        pairOLrzqt = C56390yDp.OLrzqt(TradingType.Swap, Boolean.valueOf(Intrinsics.EZpvd(tradeParam.getRecordSwapTypeCache(), Boolean.TRUE)));
                    }
                    if (pairOLrzqt == null) {
                    }
                } else {
                    if (swapType.equals("type_meme")) {
                        pairOLrzqt = C56390yDp.OLrzqt(TradingType.Meme, Boolean.valueOf(Intrinsics.EZpvd(tradeParam.getRecordSwapTypeCache(), Boolean.TRUE)));
                    }
                    if (pairOLrzqt == null) {
                    }
                }
            }
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(AhwBna().DbNXlk(), Boolean.TRUE);
        }
        TradingType tradingType = (TradingType) pairOLrzqt.component1();
        boolean zBooleanValue = ((Boolean) pairOLrzqt.component2()).booleanValue();
        if (gEmmrt() && tradingType == TradingType.CopyTrading) {
            DexHomeViewModel.updateTradeType$default(AhwBna(), TradingType.Swap, zBooleanValue, false, 4, null);
        } else {
            DexHomeViewModel.updateTradeType$default(AhwBna(), tradingType, zBooleanValue, false, 4, null);
        }
    }

    @Override // o.AbstractC31214lpm
    public void bc_() {
        AhwBna().KWHzl();
        AhwBna().AYXKKw();
        AhwBna().values().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.lbq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexHomeFragment.AEQbTJ(this.KWHzl, (java.lang.String) obj);
            }
        }));
        djBIcL();
    }

    public static final Unit AEQbTJ(DexHomeFragment dexHomeFragment, String str) {
        InterfaceC28107kPd interfaceC28107kPdAEQbTJ = dexHomeFragment.AEQbTJ();
        C28111kPh c28111kPh = interfaceC28107kPdAEQbTJ instanceof C28111kPh ? (C28111kPh) interfaceC28107kPdAEQbTJ : null;
        if (c28111kPh != null) {
            c28111kPh.EZpvd(str);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(TradingType tradingType) {
        Fragment fragmentCopydefault;
        FrameLayout frameLayout;
        if (AhwBna().EZpvd(tradingType)) {
            fragmentCopydefault = C30393laM.Companion.AEQbTJ(values());
        } else {
            InterfaceC28261kUw tradingModeProvider = tradingType.getTradingModeProvider();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            String strValues = values();
            TradeParam tradeParam = this.AYXKKw;
            Bundle arguments = getArguments();
            fragmentCopydefault = tradingModeProvider.copydefault(contextRequireContext, new C28251kUm(strValues, arguments != null ? arguments.getBundle("extra_bundle_common") : null, tradeParam));
        }
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        C21464hAi c21464hAi = this.OLrzqt;
        fragmentTransactionBeginTransaction.replace((c21464hAi == null || (frameLayout = c21464hAi.AEQbTJ) == null) ? 0 : frameLayout.getId(), fragmentCopydefault).commitAllowingStateLoss();
        this.AYXKKw = null;
    }

    @Override // o.AbstractC31214lpm, androidx.fragment.app.Fragment
    public void onDestroyView() {
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "");
        Iterator<T> it = fragments.iterator();
        while (it.hasNext()) {
            getChildFragmentManager().beginTransaction().remove((Fragment) it.next()).commitNowAllowingStateLoss();
        }
        this.OLrzqt = null;
        C31183lpH c31183lpH = this.AEQbTJ;
        if (c31183lpH != null) {
            c31183lpH.KWHzl();
        }
        this.AEQbTJ = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (C22372heC.KWHzl(values())) {
            C22380heK.OLrzqt.OLrzqt(values());
        }
        AhwBna().fJNWhG();
        this.KWHzl = null;
        this.copydefault = null;
        this.AYXKKw = null;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.lpH.StateListAnimator.show$default(o.lpH$StateListAnimator, android.app.Activity, com.okinc.business.trade.widget.TradeGuideType, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, java.lang.Object):o.lpH */
    @Override // o.AbstractC31214lpm, o.AbstractC32998moE
    public void onVisible() {
        ((xWN) C43251rlk.copydefault(xWN.class)).EZpvd(true);
        ((xWN) C43251rlk.copydefault(xWN.class)).KWHzl(true);
        if (C22416heu.zuBGHE() && !gEmmrt() && AhwBna().ejfBZ()) {
            C31183lpH.StateListAnimator stateListAnimator = C31183lpH.Companion;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            this.AEQbTJ = C31183lpH.StateListAnimator.show$default(stateListAnimator, fragmentActivityRequireActivity, TradeGuideType.MODE_SWITCH, null, null, new Function0() { // from class: o.laQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return DexHomeFragment.OLrzqt(this.copydefault);
                }
            }, 12, null);
        }
    }

    public static final Unit OLrzqt(DexHomeFragment dexHomeFragment) {
        dexHomeFragment.AhwBna().EZpvd(true);
        dexHomeFragment.valueOf();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC31214lpm, o.AbstractC32998moE
    public void onInvisible() {
        C31183lpH c31183lpH = this.AEQbTJ;
        if (c31183lpH != null) {
            c31183lpH.KWHzl();
        }
        this.AEQbTJ = null;
    }
}
