package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.tradingbot.impl.botList.domain.model.BacktestFilter;
import com.okinc.tradingbot.impl.botList.domain.model.SignalSelectionConfig;
import com.okinc.tradingbot.impl.botList.domain.model.SignalType;
import com.okinc.tradingbot.impl.botList.dto.BacktestListPreviewDto;
import com.okinc.tradingbot.impl.botList.ui.signals.SignalContainerFragment$observeBacktestData$1;
import com.okinc.tradingbot.impl.strategy.fragment.tactics_trade.BotOrderListPresenter;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.uLK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class uLE extends uLG {
    public final InterfaceC56387yDm AhwBna;
    public C51742vsk fetchVPNInfo;
    public C48418uQt gEmmrt;
    public uJV valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AYXKKw = 8;
    public SignalType DbNXlk = SignalType.AI_BACKTESTS;
    public BacktestFilter isConnected = BacktestFilter.ALL;
    public final int djBIcL = C48033uCm.Activity.fXHmeK;

    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SignalType.values().length];
            try {
                iArr[SignalType.AI_BACKTESTS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SignalType.BOT_SIGNALS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[BacktestFilter.values().length];
            try {
                iArr2[BacktestFilter.ALL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[BacktestFilter.RUNNING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[BacktestFilter.COMPLETED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            copydefault = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.djBIcL;
    }

    public uLE() {
        final Function0 function0 = null;
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BotOrderListPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.botList.ui.signals.SignalContainerFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.botList.ui.signals.SignalContainerFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.botList.ui.signals.SignalContainerFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: loaded from: classes19.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uLE.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ uLE newInstance$default(StateListAnimator stateListAnimator, SignalType signalType, BacktestFilter backtestFilter, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                signalType = SignalType.AI_BACKTESTS;
            }
            if ((i & 2) != 0) {
                backtestFilter = BacktestFilter.ALL;
            }
            return stateListAnimator.OLrzqt(signalType, backtestFilter);
        }

        public final uLE OLrzqt(@NotNull SignalType signalType, @NotNull BacktestFilter backtestFilter) {
            Intrinsics.checkNotNullParameter(signalType, "");
            Intrinsics.checkNotNullParameter(backtestFilter, "");
            uLE ule = new uLE();
            ule.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("selectedSignalType", signalType), C56390yDp.OLrzqt("selectedBacktestFilter", backtestFilter)));
            return ule;
        }
    }

    private final BotOrderListPresenter isConnected() {
        return (BotOrderListPresenter) this.AhwBna.getValue();
    }

    /* JADX DEBUG: Possible override for method o.uLG.OLrzqt()V */
    public final C48418uQt OLrzqt() {
        C48418uQt c48418uQt = this.gEmmrt;
        Intrinsics.copydefault(c48418uQt);
        return c48418uQt;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    @Override // o.AbstractC32996moC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        SignalType signalType;
        BacktestFilter backtestFilter;
        java.lang.String string;
        java.lang.Object objM7377constructorimpl;
        java.lang.String string2;
        java.lang.Object objM7377constructorimpl2;
        Intrinsics.checkNotNullParameter(view, "");
        this.gEmmrt = C48418uQt.copydefault(view);
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (string2 = arguments.getString("selectedSignalType")) != null) {
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(SignalType.valueOf(string2));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
                objM7377constructorimpl2 = null;
            }
            signalType = (SignalType) objM7377constructorimpl2;
            if (signalType == null) {
            }
        } else {
            signalType = SignalType.AI_BACKTESTS;
        }
        this.DbNXlk = signalType;
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("selectedBacktestFilter")) != null) {
            try {
                Result.Application application3 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(BacktestFilter.valueOf(string));
            } catch (java.lang.Throwable th2) {
                Result.Application application4 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
            }
            backtestFilter = (BacktestFilter) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
            if (backtestFilter == null) {
            }
        } else {
            backtestFilter = BacktestFilter.ALL;
        }
        this.isConnected = backtestFilter;
        AYXKKw();
        AkhnZx();
        DbNXlk();
        AhwBna();
        OLrzqt(this.DbNXlk);
        fetchVPNInfo();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.gEmmrt = null;
    }

    public final void OLrzqt(SignalType signalType) {
        android.view.View view;
        uJV ujv = this.valueOf;
        boolean z = ujv != null && ujv.isAdded();
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        int[] iArr = TaskDescription.KWHzl;
        int i = iArr[signalType.ordinal()];
        if (i == 1) {
            uJV ujvValueOf = valueOf();
            if (!ujvValueOf.isAdded()) {
                fragmentTransactionBeginTransaction.add(C48033uCm.Application.RjCdvpRjCdvp, ujvValueOf, "BacktestFragmentTag");
            }
            fragmentTransactionBeginTransaction.show(ujvValueOf);
            C51742vsk c51742vsk = this.fetchVPNInfo;
            if (c51742vsk != null) {
                fragmentTransactionBeginTransaction.hide(c51742vsk);
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            C51742vsk c51742vskGEmmrt = gEmmrt();
            if (!c51742vskGEmmrt.isAdded()) {
                fragmentTransactionBeginTransaction.add(C48033uCm.Application.RjCdvpRjCdvp, c51742vskGEmmrt, "SignalFragmentTag");
            }
            fragmentTransactionBeginTransaction.show(c51742vskGEmmrt);
            uJV ujv2 = this.valueOf;
            if (ujv2 != null) {
                fragmentTransactionBeginTransaction.hide(ujv2);
            }
        }
        fragmentTransactionBeginTransaction.commit();
        int i2 = iArr[signalType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (!z || (view = getView()) == null) {
                return;
            }
            view.post(new java.lang.Runnable() { // from class: o.uLH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    uLE.AhwBna(this.EZpvd);
                }
            });
        }
    }

    public static final void AhwBna(uLE ule) {
        uJV ujv = ule.valueOf;
        if (ujv != null) {
            if (!ujv.isAdded()) {
                ujv = null;
            }
            if (ujv != null) {
                ujv.EZpvd();
            }
        }
    }

    public final uJV valueOf() {
        uJV ujv = this.valueOf;
        if (ujv != null) {
            return ujv;
        }
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("BacktestFragmentTag");
        uJV ujv2 = fragmentFindFragmentByTag instanceof uJV ? (uJV) fragmentFindFragmentByTag : null;
        if (ujv2 != null) {
            return ujv2;
        }
        uJV ujvKWHzl = uJV.Companion.KWHzl(this.isConnected);
        this.valueOf = ujvKWHzl;
        return ujvKWHzl;
    }

    public final C51742vsk gEmmrt() {
        C51742vsk c51742vsk = this.fetchVPNInfo;
        if (c51742vsk != null) {
            return c51742vsk;
        }
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("SignalFragmentTag");
        C51742vsk c51742vsk2 = fragmentFindFragmentByTag instanceof C51742vsk ? (C51742vsk) fragmentFindFragmentByTag : null;
        if (c51742vsk2 != null) {
            return c51742vsk2;
        }
        C51742vsk c51742vskOLrzqt = C51742vsk.Companion.OLrzqt(false);
        this.fetchVPNInfo = c51742vskOLrzqt;
        return c51742vskOLrzqt;
    }

    public final void AYXKKw() {
        OLrzqt().KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.uLD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                uLE.copydefault(this.EZpvd, view);
            }
        });
        OLrzqt().AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.uLM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                uLE.OLrzqt(this.KWHzl, view);
            }
        });
    }

    public static final void copydefault(uLE ule, android.view.View view) {
        ule.values();
    }

    public static final void OLrzqt(uLE ule, android.view.View view) {
        ule.djBIcL();
    }

    public final void values() {
        BacktestListPreviewDto value = isConnected().OLrzqt().getValue();
        uLK.StateListAnimator stateListAnimator = uLK.Companion;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        stateListAnimator.KWHzl(childFragmentManager, SignalSelectionConfig.Companion.KWHzl(value != null ? value.AEQbTJ() : 0, this.DbNXlk), new Function1() { // from class: o.uLF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return uLE.OLrzqt(this.EZpvd, (SignalType) obj);
            }
        });
    }

    public static final Unit OLrzqt(uLE ule, SignalType signalType) {
        Intrinsics.checkNotNullParameter(signalType, "");
        if (signalType != ule.DbNXlk) {
            ule.DbNXlk = signalType;
            ule.AkhnZx();
            ule.fetchVPNInfo();
            ule.OLrzqt(signalType);
        }
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        BacktestListPreviewDto value = isConnected().OLrzqt().getValue();
        uLK.StateListAnimator stateListAnimator = uLK.Companion;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        stateListAnimator.EZpvd(childFragmentManager, SignalSelectionConfig.Companion.AEQbTJ(value != null ? value.AEQbTJ() : 0, value != null ? value.EZpvd() : 0, value != null ? value.copydefault() : 0, this.isConnected), new Function1() { // from class: o.uLI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return uLE.copydefault(this.OLrzqt, (BacktestFilter) obj);
            }
        });
    }

    public static final Unit copydefault(uLE ule, BacktestFilter backtestFilter) {
        Intrinsics.checkNotNullParameter(backtestFilter, "");
        if (backtestFilter != ule.isConnected) {
            ule.isConnected = backtestFilter;
            ule.DbNXlk();
            uJV ujv = ule.valueOf;
            if (ujv != null) {
                ujv.copydefault(backtestFilter);
            }
        }
        return Unit.INSTANCE;
    }

    public final void fetchVPNInfo() {
        C55052xcf c55052xcf = OLrzqt().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55052xcf, "");
        androidx.transition.Fade fade = new androidx.transition.Fade();
        fade.setDuration(230L);
        androidx.transition.TransitionManager.beginDelayedTransition(c55052xcf, fade);
        C55052xcf c55052xcf2 = OLrzqt().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55052xcf2, "");
        c55052xcf2.setVisibility(this.DbNXlk == SignalType.AI_BACKTESTS ? 0 : 8);
    }

    public final void AhwBna() {
        C52692wUv.flowAndCollect$default(isConnected().OLrzqt(), this, null, new SignalContainerFragment$observeBacktestData$1(this, null), 2, null);
    }

    public final void AkhnZx() {
        int i = TaskDescription.KWHzl[this.DbNXlk.ordinal()];
        if (i != 1 && i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(this.DbNXlk.getLabel());
        OLrzqt().KWHzl.setTitle(strAYXKKw);
    }

    public final void DbNXlk() {
        if (this.DbNXlk != SignalType.AI_BACKTESTS) {
            return;
        }
        int i = TaskDescription.copydefault[this.isConnected.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(this.isConnected.getLabel());
        OLrzqt().AEQbTJ.setTitle(strAYXKKw);
    }
}
