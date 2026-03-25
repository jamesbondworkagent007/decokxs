package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MemeTokenInfo;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.dexlogic.bean.track.ButtonType;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import com.okinc.business.dexlogic.bean.track.TrackOrderType;
import com.okinc.business.dexlogic.main.swap.trade.input.helper.CoinAssetsHandle;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexui.main.swap.mememode.dialog.MemeModeInstructionBottomSheet;
import com.okinc.business.dexui.main.swap.mememode.dialog.adapter.MemeIntroType;
import com.okinc.business.trade.features.home.meme.viewmodel.transaction.MemeModeTransactionViewModel;
import com.okinc.business.trade.features.home.meme.viewmodel.transaction.MemeTransactionViewModel;
import com.okinc.business.trade.features.home.ui.meme.BaseNewTransactionFragment$initCommonListener$3;
import com.okinc.business.trade.features.home.ui.meme.data.MemeStrategyType;
import com.okinc.business.trade.features.home.ui.meme.track.MemeQuickPopUpSource;
import com.okinc.liveness.lca.EopTrackEvent;
import java.math.RoundingMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C31176lpA;
import o.C52761wXj;
import o.kXY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.liW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC30827liW extends AbstractC30896ljm<C23500hzR> {
    public C58216yxB AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm valueOf;
    public final C25412iwI AhwBna = new C25412iwI();
    public MemeStrategyType copydefault = MemeStrategyType.BuyNow;
    public final CoinAssetsHandle OLrzqt = new CoinAssetsHandle();

    /* JADX INFO: renamed from: o.liW$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TransactionType.values().length];
            try {
                iArr[TransactionType.Buy.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionType.Sell.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX INFO: renamed from: o.liW$TaskDescription */
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

    public abstract TransactionType AkhnZx();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Possible override for method o.ljm.EZpvd()V */
    public final C58216yxB EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeStrategyType KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return "DEX";
    }

    public abstract C25266itV fJNWhG();

    public AbstractC30827liW() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.trade.features.home.ui.meme.BaseNewTransactionFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.meme.BaseNewTransactionFragment$special$$inlined$viewModels$default$2
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MemeTransactionViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.meme.BaseNewTransactionFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.meme.BaseNewTransactionFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.meme.BaseNewTransactionFragment$special$$inlined$viewModels$default$5
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
        this.AEQbTJ = new C58216yxB();
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.ljl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC30827liW.values(this.AEQbTJ);
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.ljc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC30827liW.valueOf(this.copydefault);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.ljb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC30827liW.AkhnZx(this.KWHzl);
            }
        });
        final Function0 function03 = new Function0() { // from class: o.liZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC30827liW.DbNXlk(this.OLrzqt);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.meme.BaseNewTransactionFragment$special$$inlined$viewModels$default$6
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
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MemeModeTransactionViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.meme.BaseNewTransactionFragment$special$$inlined$viewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.meme.BaseNewTransactionFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.meme.BaseNewTransactionFragment$special$$inlined$viewModels$default$9
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

    public final MemeTransactionViewModel isConnected() {
        return (MemeTransactionViewModel) this.djBIcL.getValue();
    }

    public final TokenBase values() {
        return (TokenBase) this.AYXKKw.getValue();
    }

    public static final TokenBase values(AbstractC30827liW abstractC30827liW) {
        TokenBase tokenBase;
        android.os.Bundle arguments = abstractC30827liW.getArguments();
        return (arguments == null || (tokenBase = (TokenBase) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "transaction_token", TokenBase.class))) == null) ? new TokenBase(null, null, null, null, null, null, null, 0, 0, 0, 0, null, null, null, null, null, null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -1, null) : tokenBase;
    }

    public final java.lang.String valueOf() {
        return (java.lang.String) this.EZpvd.getValue();
    }

    public static final java.lang.String valueOf(AbstractC30827liW abstractC30827liW) {
        java.lang.String string;
        android.os.Bundle arguments = abstractC30827liW.getArguments();
        return (arguments == null || (string = arguments.getString("transaction_amount", "")) == null) ? "" : string;
    }

    public final MemeStrategyType fetchVPNInfo() {
        return (MemeStrategyType) this.valueOf.getValue();
    }

    public static final MemeStrategyType AkhnZx(AbstractC30827liW abstractC30827liW) {
        return MemeStrategyType.Companion.copydefault(abstractC30827liW.AkhnZx());
    }

    public final MemeModeTransactionViewModel AhwBna() {
        return (MemeModeTransactionViewModel) this.KWHzl.getValue();
    }

    public static final ViewModelStoreOwner DbNXlk(AbstractC30827liW abstractC30827liW) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = abstractC30827liW.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(MemeStrategyType memeStrategyType) {
        android.widget.FrameLayout frameLayout;
        AppCompatTextView appCompatTextView;
        LinearLayoutCompat linearLayoutCompat;
        this.copydefault = memeStrategyType;
        C23500hzR c23500hzR = (C23500hzR) fARcdN();
        if (c23500hzR != null && (linearLayoutCompat = c23500hzR.OLrzqt) != null) {
            linearLayoutCompat.setVisibility(8);
        }
        C23500hzR c23500hzR2 = (C23500hzR) fARcdN();
        if (c23500hzR2 != null && (appCompatTextView = c23500hzR2.gEmmrt) != null) {
            appCompatTextView.setText(C33070mpX.AYXKKw(this.copydefault.getTitle()));
        }
        C23500hzR c23500hzR3 = (C23500hzR) fARcdN();
        if (c23500hzR3 == null || (frameLayout = c23500hzR3.EZpvd) == null) {
            return;
        }
        getChildFragmentManager().beginTransaction().replace(frameLayout.getId(), memeStrategyType.obtainFragment(new C30925lkO(values(), AkhnZx(), valueOf(), memeStrategyType, C31125loC.KWHzl(this), null))).commitAllowingStateLoss();
    }

    @Override // o.hTH, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AEQbTJ = new C58216yxB();
        super.onViewCreated(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.liU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC30827liW.AYXKKw(this.OLrzqt);
            }
        });
    }

    public static final void AYXKKw(AbstractC30827liW abstractC30827liW) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) abstractC30827liW, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(@NotNull TokenBase tokenBase) {
        AppCompatTextView appCompatTextView;
        Intrinsics.checkNotNullParameter(tokenBase, "");
        getFieldNames();
        AEQbTJ(tokenBase);
        C23500hzR c23500hzR = (C23500hzR) fARcdN();
        if (c23500hzR != null && (appCompatTextView = c23500hzR.AEQbTJ) != null) {
            C25352ivB.KWHzl(appCompatTextView, C52761wXj.TaskDescription.QSLkRj, C33070mpX.OLrzqt(C52761wXj.StateListAnimator.gHZMYf), AkhnZx() == TransactionType.Buy, java.lang.Integer.valueOf(C52761wXj.Activity.QwvEab));
        }
        copydefault(fetchVPNInfo());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void getFieldNames() {
        AppCompatTextView appCompatTextView;
        LinearLayoutCompat linearLayoutCompat;
        C23500hzR c23500hzR = (C23500hzR) fARcdN();
        if (c23500hzR != null && (linearLayoutCompat = c23500hzR.OLrzqt) != null) {
            linearLayoutCompat.setVisibility(8);
        }
        C23500hzR c23500hzR2 = (C23500hzR) fARcdN();
        if (c23500hzR2 == null || (appCompatTextView = c23500hzR2.gEmmrt) == null) {
            return;
        }
        appCompatTextView.setText(C33070mpX.AYXKKw(this.copydefault.getTitle()));
    }

    public final void AEQbTJ(final TokenBase tokenBase) {
        if (!C31172lox.KWHzl(C31125loC.KWHzl(this), C31172lox.Companion.KWHzl())) {
            C25266itV c25266itVFJNWhG = fJNWhG();
            if (c25266itVFJNWhG != null) {
                c25266itVFJNWhG.setVisibility(8);
                return;
            }
            return;
        }
        C25266itV c25266itVFJNWhG2 = fJNWhG();
        if (c25266itVFJNWhG2 != null) {
            c25266itVFJNWhG2.setVisibility(0);
        }
        C25266itV c25266itVFJNWhG3 = fJNWhG();
        if (c25266itVFJNWhG3 != null) {
            c25266itVFJNWhG3.setBaseTokenInfo(tokenBase);
        }
        C25266itV c25266itVFJNWhG4 = fJNWhG();
        if (c25266itVFJNWhG4 != null) {
            c25266itVFJNWhG4.EZpvd(new Function0() { // from class: o.lja
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC30827liW.AEQbTJ(this.KWHzl, tokenBase);
                }
            });
        }
        C25266itV c25266itVFJNWhG5 = fJNWhG();
        if (c25266itVFJNWhG5 != null) {
            c25266itVFJNWhG5.OLrzqt(new Function0() { // from class: o.liY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC30827liW.KWHzl(this.EZpvd, tokenBase);
                }
            });
        }
        C25266itV c25266itVFJNWhG6 = fJNWhG();
        if (c25266itVFJNWhG6 != null) {
            c25266itVFJNWhG6.KWHzl(new Function0() { // from class: o.lje
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC30827liW.valueOf(this.copydefault, tokenBase);
                }
            });
        }
    }

    public static final Unit AEQbTJ(AbstractC30827liW abstractC30827liW, TokenBase tokenBase) {
        java.lang.String str;
        java.lang.CharSequence charSequenceDjBIcL = C25352ivB.djBIcL();
        if (charSequenceDjBIcL.length() == 0) {
            C55326xho.toast$default(C33070mpX.AYXKKw(C23274hvD.Fragment.applyOptions), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        } else if (C22416heu.hDKMBd()) {
            java.lang.String strKWHzl = C31256lqb.KWHzl(charSequenceDjBIcL.toString());
            pUU.KWHzl("BaseNewTransactionFragment", strKWHzl);
            abstractC30827liW.AhwBna().gEmmrt().setValue(strKWHzl);
        } else {
            pUU.KWHzl("BaseNewTransactionFragment", charSequenceDjBIcL.toString());
            abstractC30827liW.AhwBna().gEmmrt().setValue(charSequenceDjBIcL.toString());
        }
        C24371ica c24371ica = C24371ica.OLrzqt;
        java.lang.String tokenContractAddress = tokenBase.getTokenContractAddress();
        int i = Activity.OLrzqt[abstractC30827liW.AkhnZx().ordinal()];
        if (i == 1) {
            str = "buy";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "sell";
        }
        c24371ica.OLrzqt("copy", tokenContractAddress, str, abstractC30827liW.djBIcL(), tokenBase.getEventSource(), abstractC30827liW.copydefault);
        MemeModeTransactionViewModel.trackDexTradeHomeFullPageClick$default(abstractC30827liW.AhwBna(), tokenBase.getChainId(), abstractC30827liW.AhwBna().OLrzqt(C31125loC.KWHzl(abstractC30827liW)), abstractC30827liW.AhwBna().KWHzl(C31125loC.KWHzl(abstractC30827liW)), null, C56424yEw.gEmmrt(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, TrackButtonName.CA_PASTE.getButtonName()), C56390yDp.OLrzqt("button_type", ButtonType.OTHERS.getType()), C56390yDp.OLrzqt("popup_source", abstractC30827liW.gEmmrt())), 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.liW$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ AbstractC30827liW EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, AbstractC30827liW abstractC30827liW) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = abstractC30827liW;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String str;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C24371ica c24371ica = C24371ica.OLrzqt;
                java.lang.String tokenContractAddress = this.EZpvd.values().getTokenContractAddress();
                int i = Activity.OLrzqt[this.EZpvd.AkhnZx().ordinal()];
                if (i == 1) {
                    str = "buy";
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "sell";
                }
                c24371ica.OLrzqt("change_order_type", tokenContractAddress, str, this.EZpvd.djBIcL(), this.EZpvd.values().getEventSource(), this.EZpvd.copydefault);
                C31176lpA.StateListAnimator stateListAnimator = C31176lpA.Companion;
                androidx.fragment.app.FragmentManager childFragmentManager = this.EZpvd.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                java.util.List<MemeStrategyType> listOLrzqt = MemeStrategyType.Companion.OLrzqt(this.EZpvd.AkhnZx());
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
                for (MemeStrategyType memeStrategyType : listOLrzqt) {
                    arrayList.add(new C31176lpA.ActionBar(C33070mpX.AYXKKw(memeStrategyType.getTitle()), memeStrategyType, memeStrategyType.getContentDesc()));
                }
                stateListAnimator.AEQbTJ(childFragmentManager, new C31176lpA.Activity(arrayList, this.EZpvd.copydefault, null, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), null, 0, 52, null), this.EZpvd.new StateListAnimator());
                MemeModeTransactionViewModel memeModeTransactionViewModelAhwBna = this.EZpvd.AhwBna();
                java.lang.String chainId = this.EZpvd.values().getChainId();
                java.lang.String strAEQbTJ = TrackOrderType.Companion.AEQbTJ(this.EZpvd.fetchVPNInfo());
                memeModeTransactionViewModelAhwBna.OLrzqt(chainId, this.EZpvd.AhwBna().OLrzqt(C31125loC.KWHzl(this.EZpvd)), this.EZpvd.AhwBna().KWHzl(C31125loC.KWHzl(this.EZpvd)), strAEQbTJ, C56424yEw.gEmmrt(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, TrackButtonName.ORDER_TYPE_SELECT.getButtonName()), C56390yDp.OLrzqt("button_type", ButtonType.TRADE.getType()), C56390yDp.OLrzqt("popup_source", this.EZpvd.gEmmrt())));
            }
        }
    }

    public static final Unit KWHzl(AbstractC30827liW abstractC30827liW, TokenBase tokenBase) {
        android.content.Context context = abstractC30827liW.getContext();
        if (context != null) {
            C25352ivB.openMarketDetailPage$default(context, abstractC30827liW.AuCTel(), tokenBase.copy(((-8392705) & 1) != 0 ? tokenBase.chainId : null, ((-8392705) & 2) != 0 ? tokenBase.tokenContractAddress : null, ((-8392705) & 4) != 0 ? tokenBase.tokenLogoUrl : null, ((-8392705) & 8) != 0 ? tokenBase.chainLogoUrl : null, ((-8392705) & 16) != 0 ? tokenBase.chainBWLogoUrl : null, ((-8392705) & 32) != 0 ? tokenBase.tokenSymbol : null, ((-8392705) & 64) != 0 ? tokenBase.tokenName : null, ((-8392705) & 128) != 0 ? tokenBase.isCollected : 0, ((-8392705) & 256) != 0 ? tokenBase.decimals : 0, ((-8392705) & 512) != 0 ? tokenBase.isCustomToken : 0, ((-8392705) & 1024) != 0 ? tokenBase.isSubscribe : 0, ((-8392705) & 2048) != 0 ? tokenBase.uniqueId : null, ((-8392705) & 4096) != 0 ? tokenBase.source : "meme_mode", ((-8392705) & 8192) != 0 ? tokenBase.tokenSource : null, ((-8392705) & 16384) != 0 ? tokenBase.type : null, ((-8392705) & 32768) != 0 ? tokenBase.chainName : null, ((-8392705) & 65536) != 0 ? tokenBase.isLeveraged : null, ((-8392705) & 131072) != 0 ? tokenBase.isSafeMoonToken : 0, ((-8392705) & 262144) != 0 ? tokenBase.isHoneypot : 0, ((-8392705) & 524288) != 0 ? tokenBase.localIsNeedRequestNet : false, ((-8392705) & 1048576) != 0 ? tokenBase.eventSource : null, ((-8392705) & 2097152) != 0 ? tokenBase.marketTabName : null, ((-8392705) & 4194304) != 0 ? tokenBase.showSourceAlert : false, ((-8392705) & 8388608) != 0 ? tokenBase.fromTrading : true, ((-8392705) & 16777216) != 0 ? tokenBase.moduleNameEnglish : null, ((-8392705) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tokenBase.moduleId : null, ((-8392705) & 67108864) != 0 ? tokenBase.sourcePageName : null, ((-8392705) & 134217728) != 0 ? tokenBase.srcType : 0, ((-8392705) & 268435456) != 0 ? tokenBase.isHighRisk : false, ((-8392705) & 536870912) != 0 ? tokenBase.referralCode : null, ((-8392705) & 1073741824) != 0 ? tokenBase.isNativeToken : null, ((-8392705) & Integer.MIN_VALUE) != 0 ? tokenBase.isMarketDetailEntry : false), "trade_meme_mode", null, new int[0], 8, null);
        }
        C25295ity.KWHzl("swap", "advanced", C25295ity.copydefault(C22372heC.EZpvd(abstractC30827liW.AuCTel())), DexTrackEventParameter.ButtonName.KLINE.getValue(), tokenBase.getChainName());
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(AbstractC30827liW abstractC30827liW, TokenBase tokenBase) {
        java.lang.String str;
        java.lang.String buttonName;
        abstractC30827liW.AhwBna().AhwBna().setValue(tokenBase);
        C24371ica c24371ica = C24371ica.OLrzqt;
        java.lang.String tokenContractAddress = tokenBase.getTokenContractAddress();
        int i = Activity.OLrzqt[abstractC30827liW.AkhnZx().ordinal()];
        if (i == 1) {
            str = "buy";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "sell";
        }
        c24371ica.OLrzqt("tokenlist", tokenContractAddress, str, abstractC30827liW.djBIcL(), tokenBase.getEventSource(), abstractC30827liW.copydefault);
        if (abstractC30827liW.AkhnZx() == TransactionType.Buy) {
            buttonName = TrackButtonName.TOKEN_TO.getButtonName();
        } else {
            buttonName = TrackButtonName.TOKEN_FROM.getButtonName();
        }
        MemeModeTransactionViewModel memeModeTransactionViewModelAhwBna = abstractC30827liW.AhwBna();
        java.lang.String chainId = tokenBase.getChainId();
        java.lang.String strAEQbTJ = TrackOrderType.Companion.AEQbTJ(abstractC30827liW.fetchVPNInfo());
        memeModeTransactionViewModelAhwBna.OLrzqt(chainId, abstractC30827liW.AhwBna().OLrzqt(C31125loC.KWHzl(abstractC30827liW)), abstractC30827liW.AhwBna().KWHzl(C31125loC.KWHzl(abstractC30827liW)), strAEQbTJ, C56424yEw.gEmmrt(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, buttonName), C56390yDp.OLrzqt("button_type", ButtonType.TRADE.getType()), C56390yDp.OLrzqt("popup_source", abstractC30827liW.gEmmrt())));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32996moC
    public void setListener() {
        LinearLayoutCompat linearLayoutCompat;
        C23500hzR c23500hzR = (C23500hzR) fARcdN();
        if (c23500hzR == null || (linearLayoutCompat = c23500hzR.OLrzqt) == null) {
            return;
        }
        linearLayoutCompat.setOnClickListener(new Application(linearLayoutCompat, 1000L, this));
    }

    /* JADX INFO: renamed from: o.liW$StateListAnimator */
    public static final class StateListAnimator implements Function1<C31176lpA.ActionBar<MemeStrategyType>, Unit> {

        /* JADX INFO: renamed from: o.liW$StateListAnimator$Activity */
        public final /* synthetic */ class Activity {
            public static final /* synthetic */ int[] AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[TransactionType.values().length];
                try {
                    iArr[TransactionType.Buy.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[TransactionType.Sell.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                AEQbTJ = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(C31176lpA.ActionBar<MemeStrategyType> actionBar) {
            EZpvd(actionBar);
            return Unit.INSTANCE;
        }

        public final void EZpvd(C31176lpA.ActionBar<MemeStrategyType> actionBar) {
            java.lang.String str;
            Intrinsics.checkNotNullParameter(actionBar, "");
            C24371ica c24371ica = C24371ica.OLrzqt;
            java.lang.String strKWHzl = c24371ica.KWHzl(actionBar.AEQbTJ());
            java.lang.String tokenContractAddress = AbstractC30827liW.this.values().getTokenContractAddress();
            int i = Activity.AEQbTJ[AbstractC30827liW.this.AkhnZx().ordinal()];
            if (i == 1) {
                str = "buy";
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "sell";
            }
            c24371ica.OLrzqt(strKWHzl, tokenContractAddress, str, AbstractC30827liW.this.djBIcL(), AbstractC30827liW.this.values().getEventSource(), AbstractC30827liW.this.copydefault);
            AbstractC30827liW.this.isConnected().KWHzl();
            AbstractC30827liW.this.copydefault(actionBar.AEQbTJ());
            MemeModeTransactionViewModel.trackDexTradeHomeFullPageClick$default(AbstractC30827liW.this.AhwBna(), AbstractC30827liW.this.values().getChainId(), AbstractC30827liW.this.AhwBna().OLrzqt(C31125loC.KWHzl(AbstractC30827liW.this)), AbstractC30827liW.this.AhwBna().KWHzl(C31125loC.KWHzl(AbstractC30827liW.this)), null, C56424yEw.gEmmrt(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, AbstractC30827liW.this.AYXKKw()), C56390yDp.OLrzqt("button_type", ButtonType.TRADE.getType()), C56390yDp.OLrzqt("popup_source", AbstractC30827liW.this.gEmmrt())), 8, null);
        }
    }

    public final java.lang.String AYXKKw() {
        return TrackButtonName.ORDER_TYPE_MARKET.getButtonName();
    }

    public final void iwGUEr() {
        if (C31172lox.KWHzl(C31125loC.KWHzl(this), C31172lox.Companion.KWHzl()) && C22416heu.sSMYrx()) {
            MemeModeInstructionBottomSheet memeModeInstructionBottomSheetAEQbTJ = MemeModeInstructionBottomSheet.Companion.OLrzqt(MemeIntroType.MEME_MODE).AEQbTJ(new Function0() { // from class: o.lji
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC30827liW.AEQbTJ();
                }
            });
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            memeModeInstructionBottomSheetAEQbTJ.show(childFragmentManager);
        }
    }

    public static final Unit AEQbTJ() {
        C23317hvu.valueOf(false);
        C24371ica.OLrzqt.KWHzl();
        return Unit.INSTANCE;
    }

    public final void uzCIH() {
        isConnected().EZpvd().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.ljg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC30827liW.copydefault(this.EZpvd, (kXY) obj);
            }
        }));
        AhwBna().AkhnZx().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.ljh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC30827liW.EZpvd(this.KWHzl, (MemeTokenInfo) obj);
            }
        }));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new BaseNewTransactionFragment$initCommonListener$3(this, null), 3, null);
        AhwBna().valueOf().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.ljf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC30827liW.AEQbTJ(this.OLrzqt, (C9860bdZ) obj);
            }
        }));
        AhwBna().djBIcL().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.ljd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC30827liW.OLrzqt(this.copydefault, (C9860bdZ) obj);
            }
        }));
    }

    public static final Unit copydefault(AbstractC30827liW abstractC30827liW, kXY kxy) {
        Intrinsics.copydefault(kxy);
        abstractC30827liW.EZpvd(kxy);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(AbstractC30827liW abstractC30827liW, MemeTokenInfo memeTokenInfo) {
        C25266itV c25266itVFJNWhG = abstractC30827liW.fJNWhG();
        if (c25266itVFJNWhG != null) {
            c25266itVFJNWhG.EZpvd(memeTokenInfo.getPrice());
        }
        C25266itV c25266itVFJNWhG2 = abstractC30827liW.fJNWhG();
        if (c25266itVFJNWhG2 != null) {
            c25266itVFJNWhG2.copydefault(memeTokenInfo.getMarketCap());
        }
        C25266itV c25266itVFJNWhG3 = abstractC30827liW.fJNWhG();
        if (c25266itVFJNWhG3 != null) {
            c25266itVFJNWhG3.OLrzqt(memeTokenInfo.getPoolLiquidity());
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractC30827liW abstractC30827liW, C9860bdZ c9860bdZ) {
        if (abstractC30827liW.AhwBna().fetchVPNInfo().getValue() == TransactionType.Buy) {
            MutableLiveData<kXY> mutableLiveDataEZpvd = abstractC30827liW.isConnected().EZpvd();
            java.lang.String strAEQbTJ = c9860bdZ.AEQbTJ();
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
            mutableLiveDataEZpvd.setValue(new kXY.ActionBar(strAEQbTJ));
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(AbstractC30827liW abstractC30827liW, C9860bdZ c9860bdZ) {
        abstractC30827liW.values();
        if (abstractC30827liW.AhwBna().fetchVPNInfo().getValue() == TransactionType.Sell) {
            MutableLiveData<kXY> mutableLiveDataEZpvd = abstractC30827liW.isConnected().EZpvd();
            java.lang.String strAEQbTJ = c9860bdZ.AEQbTJ();
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
            mutableLiveDataEZpvd.setValue(new kXY.ActionBar(strAEQbTJ));
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r11v14, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r11v29, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r11v32, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r11v6, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(@NotNull kXY kxy) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        java.lang.String strCopydefault;
        AppCompatTextView appCompatTextView4;
        AppCompatTextView appCompatTextView5;
        AppCompatTextView appCompatTextView6;
        java.lang.String tokenSymbol = "";
        Intrinsics.checkNotNullParameter(kxy, "");
        if (Intrinsics.EZpvd(kxy, kXY.StateListAnimator.KWHzl)) {
            C23500hzR c23500hzR = (C23500hzR) fARcdN();
            if (c23500hzR == null || (appCompatTextView6 = c23500hzR.AEQbTJ) == null) {
                return;
            }
            appCompatTextView6.setText(C23274hvD.Fragment.fXHmeK);
            appCompatTextView6.setTextColor(ContextCompat.getColor(appCompatTextView6.getContext(), C52761wXj.Activity.QwvEab));
            appCompatTextView6.setCompoundDrawables(null, null, null, null);
            return;
        }
        if (Intrinsics.EZpvd(kxy, kXY.Activity.OLrzqt) || Intrinsics.EZpvd(kxy, kXY.Application.KWHzl)) {
            C23500hzR c23500hzR2 = (C23500hzR) fARcdN();
            if (c23500hzR2 == null || (appCompatTextView = c23500hzR2.AEQbTJ) == null) {
                return;
            }
            appCompatTextView.setText("--");
            appCompatTextView.setTextColor(ContextCompat.getColor(appCompatTextView.getContext(), C52761wXj.Activity.QwvEab));
            appCompatTextView.setCompoundDrawables(null, null, null, null);
            return;
        }
        if (!(kxy instanceof kXY.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        java.lang.String strKWHzl = ((kXY.ActionBar) kxy).KWHzl();
        C23500hzR c23500hzR3 = (C23500hzR) fARcdN();
        if (c23500hzR3 != null && (appCompatTextView4 = c23500hzR3.AEQbTJ) != null) {
            if (AkhnZx() == TransactionType.Buy) {
                C25352ivB.KWHzl(appCompatTextView4, C52761wXj.TaskDescription.QSLkRj, C33070mpX.OLrzqt(C52761wXj.StateListAnimator.gHZMYf), true, java.lang.Integer.valueOf(C52761wXj.Activity.QwvEab));
            } else {
                C23500hzR c23500hzR4 = (C23500hzR) fARcdN();
                if (c23500hzR4 != null && (appCompatTextView5 = c23500hzR4.AEQbTJ) != null) {
                    appCompatTextView5.setCompoundDrawables(null, null, null, null);
                }
            }
        }
        int i = Activity.OLrzqt[AkhnZx().ordinal()];
        if (i == 1) {
            DexMultiTokenInfoBean dexMultiTokenInfoBeanEZpvd = isConnected().EZpvd(values().getChainId(), values().getTokenContractAddress());
            java.lang.String tokenSymbol2 = dexMultiTokenInfoBeanEZpvd != null ? dexMultiTokenInfoBeanEZpvd.getTokenSymbol() : null;
            if (tokenSymbol2 != null) {
                tokenSymbol = tokenSymbol2;
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            tokenSymbol = values().getTokenSymbol();
        }
        java.lang.String localizedNumber$default = C23322hvz.toLocalizedNumber$default(strKWHzl, false, (RoundingMode) null, false, false, 15, (java.lang.Object) null);
        C23500hzR c23500hzR5 = (C23500hzR) fARcdN();
        if (c23500hzR5 != null && (appCompatTextView3 = c23500hzR5.AEQbTJ) != null) {
            if (AkhnZx() == TransactionType.Buy) {
                strCopydefault = C33069mpW.copydefault(C23274hvD.Fragment.MediaMetadataCompatApi21Builder, C56424yEw.gEmmrt(C56390yDp.OLrzqt("value", localizedNumber$default), C56390yDp.OLrzqt("token", tokenSymbol)));
            } else {
                strCopydefault = C33069mpW.copydefault(C23274hvD.Fragment.getMetadata, C56424yEw.gEmmrt(C56390yDp.OLrzqt("value", localizedNumber$default), C56390yDp.OLrzqt("token", tokenSymbol)));
            }
            appCompatTextView3.setText(strCopydefault);
        }
        C23500hzR c23500hzR6 = (C23500hzR) fARcdN();
        if (c23500hzR6 == null || (appCompatTextView2 = c23500hzR6.AEQbTJ) == null) {
            return;
        }
        appCompatTextView2.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.hTH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C23500hzR OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C23500hzR c23500hzRKWHzl = C23500hzR.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c23500hzRKWHzl, "");
        return c23500hzRKWHzl;
    }

    @Override // o.hTH, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.OLrzqt.disposeAssets();
        this.AEQbTJ.dispose();
    }

    public final java.lang.String gEmmrt() {
        return C31172lox.KWHzl(C31125loC.KWHzl(this), C31172lox.Companion.KWHzl()) ? "" : MemeQuickPopUpSource.Companion.EZpvd().getSource();
    }
}
