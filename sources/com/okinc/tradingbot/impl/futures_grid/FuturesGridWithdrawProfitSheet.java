package com.okinc.tradingbot.impl.futures_grid;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Checkable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.okinc.tradeuilib.imgs.CdnResourceType;
import com.okinc.tradingbot.impl.futures_grid.FuturesGridWithdrawProfitSheet;
import com.okinc.tradingbot.impl.futures_grid.dto.MarginBalanceType;
import com.okinc.tradingbot.impl.share.BotPreShareBottomSheet;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC54531xLw;
import o.C33054mpH;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C43246rlf;
import o.C48033uCm;
import o.C49662usl;
import o.C49722uts;
import o.C50964veA;
import o.C50979veP;
import o.C51045vfc;
import o.C51052vfj;
import o.C51053vfk;
import o.C52680wUj;
import o.C52794wYp;
import o.C53769wrj;
import o.C54536xML;
import o.C54589xNz;
import o.C55296xhK;
import o.C55326xho;
import o.C55688xof;
import o.C56033xvF;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56423yEv;
import o.C56442yFn;
import o.C56524yIo;
import o.C56548yJl;
import o.C58114yvF;
import o.InterfaceC51009vet;
import o.InterfaceC54581xNr;
import o.InterfaceC56387yDm;
import o.wXQ;
import o.wXX;
import o.wYF;
import o.xMV;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class FuturesGridWithdrawProfitSheet extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public Function1<? super TacticsData, Unit> AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm KWHzl;
    public final boolean OLrzqt;

    @yCM
    public C51053vfk adjustPositionMarginBalanceUseCase;
    public final InterfaceC56387yDm copydefault;

    @yCM
    public CoroutineDispatcher defaultDispatcher;
    public final InterfaceC56387yDm djBIcL;

    @yCM
    public C51052vfj fetchPositionMarginBalanceUseCase;
    public final InterfaceC56387yDm gEmmrt;

    @yCM
    public CoroutineDispatcher ioDispatcher;
    public final InterfaceC56387yDm valueOf;

    @yCM
    public C52680wUj webSocketManager;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.OLrzqt;
    }

    public FuturesGridWithdrawProfitSheet() {
        Function0 function0 = new Function0() { // from class: o.veH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return FuturesGridWithdrawProfitSheet.getFieldNames(this.OLrzqt);
            }
        };
        final Function0<Fragment> function02 = new Function0<Fragment>() { // from class: com.okinc.tradingbot.impl.futures_grid.FuturesGridWithdrawProfitSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.futures_grid.FuturesGridWithdrawProfitSheet$special$$inlined$viewModels$default$2
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C51045vfc.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.futures_grid.FuturesGridWithdrawProfitSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.futures_grid.FuturesGridWithdrawProfitSheet$special$$inlined$viewModels$default$4
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
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.veI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return FuturesGridWithdrawProfitSheet.ejfBZ(this.EZpvd);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.veG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return FuturesGridWithdrawProfitSheet.fJNWhG(this.AEQbTJ);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.veF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return FuturesGridWithdrawProfitSheet.fetchVPNInfo(this.copydefault);
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.veM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return FuturesGridWithdrawProfitSheet.fIwbmz(this.OLrzqt);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.veK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return FuturesGridWithdrawProfitSheet.fARcdN(this.KWHzl);
            }
        });
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.veN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return FuturesGridWithdrawProfitSheet.AuCTel(this.OLrzqt);
            }
        });
        this.OLrzqt = true;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.futures_grid.FuturesGridWithdrawProfitSheet.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final FuturesGridWithdrawProfitSheet copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull TacticsData tacticsData, Function1<? super TacticsData, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(tacticsData, "");
            FuturesGridWithdrawProfitSheet futuresGridWithdrawProfitSheet = new FuturesGridWithdrawProfitSheet();
            futuresGridWithdrawProfitSheet.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("bot_inst_id", str2), C56390yDp.OLrzqt("bot_inst_type", str3), C56390yDp.OLrzqt("bot_algo_id", str), C56390yDp.OLrzqt("data", tacticsData)));
            futuresGridWithdrawProfitSheet.AYXKKw = function1;
            return futuresGridWithdrawProfitSheet;
        }
    }

    public final C51052vfj OLrzqt() {
        C51052vfj c51052vfj = this.fetchPositionMarginBalanceUseCase;
        if (c51052vfj != null) {
            return c51052vfj;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C51053vfk AEQbTJ() {
        C51053vfk c51053vfk = this.adjustPositionMarginBalanceUseCase;
        if (c51053vfk != null) {
            return c51053vfk;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final CoroutineDispatcher KWHzl() {
        CoroutineDispatcher coroutineDispatcher = this.defaultDispatcher;
        if (coroutineDispatcher != null) {
            return coroutineDispatcher;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final CoroutineDispatcher EZpvd() {
        CoroutineDispatcher coroutineDispatcher = this.ioDispatcher;
        if (coroutineDispatcher != null) {
            return coroutineDispatcher;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C51045vfc djBIcL() {
        return (C51045vfc) this.gEmmrt.getValue();
    }

    public static final C51045vfc AEQbTJ(FuturesGridWithdrawProfitSheet futuresGridWithdrawProfitSheet, CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new C51045vfc(futuresGridWithdrawProfitSheet.OLrzqt(), futuresGridWithdrawProfitSheet.AEQbTJ(), futuresGridWithdrawProfitSheet.KWHzl(), futuresGridWithdrawProfitSheet.EZpvd(), SavedStateHandleSupport.createSavedStateHandle(creationExtras));
    }

    private final String valueOf() {
        return (String) this.copydefault.getValue();
    }

    public static final String ejfBZ(FuturesGridWithdrawProfitSheet futuresGridWithdrawProfitSheet) {
        Bundle arguments = futuresGridWithdrawProfitSheet.getArguments();
        String string = arguments != null ? arguments.getString("bot_inst_id") : null;
        return string == null ? "" : string;
    }

    private final String gEmmrt() {
        return (String) this.valueOf.getValue();
    }

    public static final String fJNWhG(FuturesGridWithdrawProfitSheet futuresGridWithdrawProfitSheet) {
        Bundle arguments = futuresGridWithdrawProfitSheet.getArguments();
        String string = arguments != null ? arguments.getString("bot_inst_type") : null;
        return string == null ? "" : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String AYXKKw() {
        return (String) this.KWHzl.getValue();
    }

    public static final String fetchVPNInfo(FuturesGridWithdrawProfitSheet futuresGridWithdrawProfitSheet) {
        Bundle arguments = futuresGridWithdrawProfitSheet.getArguments();
        String string = arguments != null ? arguments.getString("bot_algo_id") : null;
        return string == null ? "" : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TacticsData fetchVPNInfo() {
        return (TacticsData) this.AhwBna.getValue();
    }

    public static final TacticsData fIwbmz(FuturesGridWithdrawProfitSheet futuresGridWithdrawProfitSheet) {
        TacticsData tacticsData = (TacticsData) BundleCompat.getParcelable(futuresGridWithdrawProfitSheet.requireArguments(), "data", TacticsData.class);
        return tacticsData == null ? new TacticsData(null, null, null, null, null, null, false, null, null, 0, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, 3, null) : tacticsData;
    }

    public final BizInstrument copydefault() {
        return (BizInstrument) this.AEQbTJ.getValue();
    }

    public static final BizInstrument fARcdN(FuturesGridWithdrawProfitSheet futuresGridWithdrawProfitSheet) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            return InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, futuresGridWithdrawProfitSheet.gEmmrt(), futuresGridWithdrawProfitSheet.valueOf(), null, null, 12, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xMV AkhnZx() {
        return (xMV) this.djBIcL.getValue();
    }

    public static final xMV AuCTel(FuturesGridWithdrawProfitSheet futuresGridWithdrawProfitSheet) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt(futuresGridWithdrawProfitSheet.gEmmrt()) : null;
        BizInstrument bizInstrumentCopydefault = futuresGridWithdrawProfitSheet.copydefault();
        String instFamily = bizInstrumentCopydefault != null ? bizInstrumentCopydefault.getInstFamily() : null;
        if (abstractC54531xLwOLrzqt == null) {
            return null;
        }
        if (instFamily == null) {
            instFamily = "";
        }
        return AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, null, 2, null);
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ FuturesGridWithdrawProfitSheet AEQbTJ;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, FuturesGridWithdrawProfitSheet futuresGridWithdrawProfitSheet) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = futuresGridWithdrawProfitSheet;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.djBIcL().copydefault(new C51045vfc.Application.ActionBar(this.AEQbTJ.AYXKKw(), MarginBalanceType.Withdraw));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String isConnected() {
        xMV xmvAkhnZx = AkhnZx();
        return C50964veA.KWHzl(xmvAkhnZx != null ? xmvAkhnZx.EZpvd() : null);
    }

    public final String AhwBna() {
        return C56033xvF.EZpvd(copydefault());
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        ((InterfaceC51009vet) C58114yvF.OLrzqt(C43246rlf.OLrzqt.valueOf(), InterfaceC51009vet.class)).AEQbTJ(this);
        super.onAttach(context);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setCloseVisibility(true);
        wxq.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.veO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                FuturesGridWithdrawProfitSheet.KWHzl(this.KWHzl, view);
            }
        });
        wxq.AEQbTJ().setVisibility(8);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C55688xof.Application.setDisplayShowHomeEnabled));
    }

    public static final void KWHzl(FuturesGridWithdrawProfitSheet futuresGridWithdrawProfitSheet, View view) {
        futuresGridWithdrawProfitSheet.dismiss();
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C55688xof.Application.PipHintTrackerKt));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(wyf, null), 3, null);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new Application(c52794wYpCopydefault, 1000L, this));
        }
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.futures_grid.FuturesGridWithdrawProfitSheet$onFooterCreated$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ wYF $buttonbox;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(wYF wyf, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$buttonbox = wyf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FuturesGridWithdrawProfitSheet.this.new AnonymousClass1(this.$buttonbox, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.futures_grid.FuturesGridWithdrawProfitSheet$onFooterCreated$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C06411 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ wYF $buttonbox;
            int label;
            final /* synthetic */ FuturesGridWithdrawProfitSheet this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06411(FuturesGridWithdrawProfitSheet futuresGridWithdrawProfitSheet, wYF wyf, Continuation<? super C06411> continuation) {
                super(2, continuation);
                this.this$0 = futuresGridWithdrawProfitSheet;
                this.$buttonbox = wyf;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06411(this.this$0, this.$buttonbox, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    StateFlow<C51045vfc.StateListAnimator> stateFlowOLrzqt = this.this$0.djBIcL().OLrzqt();
                    final wYF wyf = this.$buttonbox;
                    FlowCollector<? super C51045vfc.StateListAnimator> flowCollector = new FlowCollector() { // from class: com.okinc.tradingbot.impl.futures_grid.FuturesGridWithdrawProfitSheet.onFooterCreated.1.1.4
                        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                        public final Object emit(C51045vfc.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
                            C52794wYp c52794wYpCopydefault = wyf.copydefault();
                            if (c52794wYpCopydefault != null) {
                                c52794wYpCopydefault.setEnabled(stateListAnimator.AEQbTJ() && !stateListAnimator.copydefault());
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (stateFlowOLrzqt.collect(flowCollector, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                FuturesGridWithdrawProfitSheet futuresGridWithdrawProfitSheet = FuturesGridWithdrawProfitSheet.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                C06411 c06411 = new C06411(futuresGridWithdrawProfitSheet, this.$buttonbox, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(futuresGridWithdrawProfitSheet, state, c06411, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C53769wrj.AEQbTJ.AEQbTJ();
        djBIcL().copydefault(new C51045vfc.Application.Activity(AYXKKw(), MarginBalanceType.Withdraw));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C17501(view, null), 3, null);
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.futures_grid.FuturesGridWithdrawProfitSheet$onViewCreated$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17501 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ View $view;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17501(View view, Continuation<? super C17501> continuation) {
            super(2, continuation);
            this.$view = view;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FuturesGridWithdrawProfitSheet.this.new C17501(this.$view, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.futures_grid.FuturesGridWithdrawProfitSheet$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C06421 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ View $view;
            int label;
            final /* synthetic */ FuturesGridWithdrawProfitSheet this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06421(FuturesGridWithdrawProfitSheet futuresGridWithdrawProfitSheet, View view, Continuation<? super C06421> continuation) {
                super(2, continuation);
                this.this$0 = futuresGridWithdrawProfitSheet;
                this.$view = view;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06421(this.this$0, this.$view, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: com.okinc.tradingbot.impl.futures_grid.FuturesGridWithdrawProfitSheet$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C06431 extends SuspendLambda implements Function2<C51045vfc.TaskDescription, Continuation<? super Unit>, Object> {
                final /* synthetic */ View $view;
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesGridWithdrawProfitSheet this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C06431(FuturesGridWithdrawProfitSheet futuresGridWithdrawProfitSheet, View view, Continuation<? super C06431> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresGridWithdrawProfitSheet;
                    this.$view = view;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C06431 c06431 = new C06431(this.this$0, this.$view, continuation);
                    c06431.L$0 = obj;
                    return c06431;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(C51045vfc.TaskDescription taskDescription, Continuation<? super Unit> continuation) {
                    return ((C06431) create(taskDescription, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        C51045vfc.TaskDescription taskDescription = (C51045vfc.TaskDescription) this.L$0;
                        if (taskDescription instanceof C51045vfc.TaskDescription.ActionBar) {
                            Context context = this.this$0.getContext();
                            if (context != null) {
                                C33054mpH.OLrzqt(context, this.$view);
                            }
                        } else if (taskDescription instanceof C51045vfc.TaskDescription.Application) {
                            this.this$0.dismissAllowingStateLoss();
                        } else {
                            if (taskDescription instanceof C51045vfc.TaskDescription.StateListAnimator) {
                                C55326xho.toastWithFailedIcon$default(((C51045vfc.TaskDescription.StateListAnimator) taskDescription).copydefault(), 0, 1, (Object) null);
                            } else {
                                if (!(taskDescription instanceof C51045vfc.TaskDescription.Activity)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Context context2 = this.this$0.getContext();
                                String strOLrzqt = context2 != null ? C49722uts.OLrzqt("lottie/tradingbot/bot_withdraw_profit.lottie", context2, CdnResourceType.Lottie, true) : null;
                                BotPreShareBottomSheet.ActionBar actionBar = BotPreShareBottomSheet.Companion;
                                BotPreShareBottomSheet.UiParam uiParam = new BotPreShareBottomSheet.UiParam(C33070mpX.AYXKKw(C48033uCm.Fragment.onProviderDisabled), C33069mpW.copydefault(C48033uCm.Fragment.onStatusChanged, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", this.this$0.isConnected()))), C56033xvF.copydefault(((C51045vfc.TaskDescription.Activity) taskDescription).EZpvd(), this.this$0.isConnected(), (88 & 4) != 0 ? false : false, (88 & 8) != 0 ? null : null, (88 & 16) != 0 ? false : false, (88 & 32) == 0, (88 & 64) == 0 ? null : null), this.this$0.fetchVPNInfo(), null, strOLrzqt, 16, null);
                                final FuturesGridWithdrawProfitSheet futuresGridWithdrawProfitSheet = this.this$0;
                                Function1<? super TacticsData, Unit> function1 = new Function1() { // from class: o.veQ
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj2) {
                                        return FuturesGridWithdrawProfitSheet.C17501.C06421.C06431.invokeSuspend$lambda$2(futuresGridWithdrawProfitSheet, (TacticsData) obj2);
                                    }
                                };
                                final FuturesGridWithdrawProfitSheet futuresGridWithdrawProfitSheet2 = this.this$0;
                                BotPreShareBottomSheet botPreShareBottomSheetOLrzqt = actionBar.OLrzqt(uiParam, function1, new Function0() { // from class: o.veR
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return FuturesGridWithdrawProfitSheet.C17501.C06421.C06431.invokeSuspend$lambda$3(futuresGridWithdrawProfitSheet2);
                                    }
                                });
                                FragmentManager childFragmentManager = this.this$0.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                                C49662usl.EZpvd(botPreShareBottomSheetOLrzqt, childFragmentManager, "BotPreShareBottomSheet");
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invokeSuspend$lambda$2(FuturesGridWithdrawProfitSheet futuresGridWithdrawProfitSheet, TacticsData tacticsData) {
                    Function1 function1 = futuresGridWithdrawProfitSheet.AYXKKw;
                    if (function1 != null) {
                        function1.invoke(tacticsData);
                    }
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invokeSuspend$lambda$3(FuturesGridWithdrawProfitSheet futuresGridWithdrawProfitSheet) {
                    futuresGridWithdrawProfitSheet.dismiss();
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    SharedFlow<C51045vfc.TaskDescription> sharedFlowFJNWhG = this.this$0.djBIcL().fJNWhG();
                    C06431 c06431 = new C06431(this.this$0, this.$view, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlowFJNWhG, c06431, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                FuturesGridWithdrawProfitSheet futuresGridWithdrawProfitSheet = FuturesGridWithdrawProfitSheet.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                C06421 c06421 = new C06421(futuresGridWithdrawProfitSheet, this.$view, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(futuresGridWithdrawProfitSheet, state, c06421, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1068673759, true, new Activity()));
        constraintLayout.addView(composeView);
    }

    public static final class Activity implements Function2<Composer, Integer, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, Integer num) {
            KWHzl(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.veP.copydefault(o.vfc, kotlin.jvm.functions.Function1, java.lang.String, androidx.compose.runtime.Composer, int):void */
        public final void KWHzl(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1068673759, i, -1, "com.okinc.tradingbot.impl.futures_grid.FuturesGridWithdrawProfitSheet.onCreateContent.<anonymous>.<anonymous> (FuturesGridWithdrawProfitSheet.kt:305)");
                }
                C51045vfc c51045vfcDjBIcL = FuturesGridWithdrawProfitSheet.this.djBIcL();
                String strAhwBna = FuturesGridWithdrawProfitSheet.this.AhwBna();
                composer.startReplaceableGroup(-7488854);
                boolean zChangedInstance = composer.changedInstance(FuturesGridWithdrawProfitSheet.this);
                final FuturesGridWithdrawProfitSheet futuresGridWithdrawProfitSheet = FuturesGridWithdrawProfitSheet.this;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: o.veS
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return FuturesGridWithdrawProfitSheet.Activity.KWHzl(futuresGridWithdrawProfitSheet, (java.lang.String) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                C50979veP.AEQbTJ(c51045vfcDjBIcL, (Function1) objRememberedValue, strAhwBna, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        public static final String KWHzl(FuturesGridWithdrawProfitSheet futuresGridWithdrawProfitSheet, String str) {
            C54536xML c54536xMLCopydefault;
            C54536xML c54536xMLCopydefault2;
            C54536xML c54536xMLFetchVPNInfo;
            if (str == null || StringsKt__StringsKt.fARcdN((CharSequence) str)) {
                return "--";
            }
            xMV xmvAkhnZx = futuresGridWithdrawProfitSheet.AkhnZx();
            String safeString$default = null;
            int iCopydefault = C56548yJl.copydefault(C33129mqd.AhwBna(xmvAkhnZx != null ? xmvAkhnZx.copydefault() : null), 4);
            xMV xmvAkhnZx2 = futuresGridWithdrawProfitSheet.AkhnZx();
            xMV xmvKWHzl = xmvAkhnZx2 != null ? xmvAkhnZx2.KWHzl(xmvAkhnZx2.EZpvd(), String.valueOf(iCopydefault)) : null;
            if (xmvKWHzl != null && (c54536xMLCopydefault = xmvKWHzl.copydefault(str)) != null && (c54536xMLCopydefault2 = c54536xMLCopydefault.copydefault()) != null && (c54536xMLFetchVPNInfo = c54536xMLCopydefault2.fetchVPNInfo()) != null) {
                safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null);
            }
            return C50964veA.KWHzl(safeString$default);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        djBIcL().copydefault(C51045vfc.Application.C0984Application.EZpvd);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        djBIcL().copydefault(C51045vfc.Application.C0984Application.EZpvd);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        djBIcL().AEQbTJ(getViewLifecycleOwner().getLifecycle());
    }

    public static final ViewModelProvider.Factory getFieldNames(final FuturesGridWithdrawProfitSheet futuresGridWithdrawProfitSheet) {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(C51045vfc.class), new Function1() { // from class: o.veL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return FuturesGridWithdrawProfitSheet.AEQbTJ(this.OLrzqt, (CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }
}
