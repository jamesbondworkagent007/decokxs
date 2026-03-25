package o;

import android.view.View;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.tradingbot.impl.botDetail.ui.llmSignal.LLMSignalDetailsFragment$observeEvents$1;
import com.okinc.tradingbot.impl.botDetail.ui.llmSignal.LLMSignalDetailsFragment$setupComposeView$1$2$1$1;
import com.okinc.tradingbot.impl.botDetail.ui.llmSignal.LLMSignalDetailsFragment$setupComposeView$1$2$2$1;
import com.okinc.tradingbot.impl.botDetail.ui.llmSignal.LLMSignalDetailsFragment$setupComposeView$1$2$3$1;
import com.okinc.tradingbot.impl.botDetail.ui.llmSignal.LLMSignalDetailsFragment$setupComposeView$1$2$4$1;
import com.okinc.tradingbot.impl.botDetail.ui.llmSignal.LLMSignalDetailsFragment$setupComposeView$1$2$5$1;
import com.okinc.tradingbot.impl.botDetail.ui.llmSignal.LLMSignalDetailsViewModel;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.tradingbot.impl.strategy.view.helper.BotOperatorButtonDisposer;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;
import o.C48033uCm;
import o.C48098uEx;
import o.C48213uJd;
import o.C55688xof;
import o.InterfaceC52662wTs;
import o.uIJ;
import o.uLU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uJd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C48213uJd extends uIM implements InterfaceC52662wTs {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int valueOf = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final int DbNXlk = C48033uCm.Activity.DGgnkA;
    public uPS djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public C48174uHs gEmmrt;
    public final InterfaceC56387yDm isConnected;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC52662wTs
    public void EZpvd(@NotNull TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
    }

    @Override // o.InterfaceC52662wTs
    public void fARcdN() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.DbNXlk;
    }

    @Override // o.InterfaceC52662wTs
    public void DbNXlk() {
        InterfaceC52662wTs.TaskDescription.AEQbTJ(this);
    }

    @Override // o.InterfaceC52662wTs
    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        InterfaceC52662wTs.TaskDescription.EZpvd(this, str, str2);
    }

    @Override // o.InterfaceC52662wTs
    public void bz_() {
        InterfaceC52662wTs.TaskDescription.KWHzl(this);
    }

    public C48213uJd() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.llmSignal.LLMSignalDetailsFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.llmSignal.LLMSignalDetailsFragment$special$$inlined$viewModels$default$2
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
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(LLMSignalDetailsViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.llmSignal.LLMSignalDetailsFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.llmSignal.LLMSignalDetailsFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.llmSignal.LLMSignalDetailsFragment$special$$inlined$viewModels$default$5
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsDetailPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.llmSignal.LLMSignalDetailsFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.llmSignal.LLMSignalDetailsFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.llmSignal.LLMSignalDetailsFragment$special$$inlined$activityViewModels$default$3
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
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.uJg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48213uJd.DbNXlk(this.EZpvd);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.uJe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C48213uJd.isConnected(this.EZpvd));
            }
        });
    }

    /* JADX INFO: renamed from: o.uJd$ActionBar */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uJd.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C48213uJd copydefault(@NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            C48213uJd c48213uJd = new C48213uJd();
            c48213uJd.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("algoId", str), C56390yDp.OLrzqt("isBacktest", java.lang.Boolean.valueOf(z))));
            return c48213uJd;
        }
    }

    public final LLMSignalDetailsViewModel djBIcL() {
        return (LLMSignalDetailsViewModel) this.fetchVPNInfo.getValue();
    }

    public final TacticsDetailPresenter AhwBna() {
        return (TacticsDetailPresenter) this.isConnected.getValue();
    }

    private final BotOperatorButtonDisposer AuCTel() {
        return (BotOperatorButtonDisposer) this.AhwBna.getValue();
    }

    public static final BotOperatorButtonDisposer DbNXlk(C48213uJd c48213uJd) {
        return new BotOperatorButtonDisposer(c48213uJd, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean fJNWhG() {
        return ((java.lang.Boolean) this.AYXKKw.getValue()).booleanValue();
    }

    public static final boolean isConnected(C48213uJd c48213uJd) {
        android.os.Bundle arguments = c48213uJd.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("isBacktest");
        }
        return false;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        uPS upsCopydefault = uPS.copydefault(view);
        this.djBIcL = upsCopydefault;
        if (upsCopydefault != null) {
            KWHzl(upsCopydefault);
        }
        uPS ups = this.djBIcL;
        if (ups != null) {
            AEQbTJ(ups);
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        djBIcL().AEQbTJ(LLMSignalDetailsViewModel.StateListAnimator.C0637StateListAnimator.OLrzqt);
    }

    /* JADX INFO: renamed from: o.uJd$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity implements Function2<Composer, java.lang.Integer, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, java.lang.Integer num) {
            OLrzqt(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void OLrzqt(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(467497258, i, -1, "com.okinc.tradingbot.impl.botDetail.ui.llmSignal.LLMSignalDetailsFragment.setupComposeView.<anonymous> (LLMSignalDetailsFragment.kt:92)");
                }
                final androidx.compose.runtime.State stateCollectAsState = SnapshotStateKt.collectAsState(C48213uJd.this.djBIcL().OLrzqt(), null, composer, 0, 1);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
                uLU<C48174uHs> uluAEQbTJ = AEQbTJ((androidx.compose.runtime.State<? extends uLU<C48174uHs>>) stateCollectAsState);
                composer.startReplaceableGroup(55664877);
                boolean zChangedInstance = composer.changedInstance(C48213uJd.this);
                final C48213uJd c48213uJd = C48213uJd.this;
                java.lang.Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: o.uJk
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C48213uJd.Activity.OLrzqt(c48213uJd);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                final C48213uJd c48213uJd2 = C48213uJd.this;
                wWN.copydefault(modifierFillMaxSize$default, null, null, uluAEQbTJ, (Function0) objRememberedValue, ComposableLambdaKt.composableLambda(composer, -92300764, true, new yHO<BoxScope, Composer, java.lang.Integer, Unit>() { // from class: o.uJd.Activity.1
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // o.yHO
                    public /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, java.lang.Integer num) {
                        OLrzqt(boxScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void OLrzqt(BoxScope boxScope, Composer composer2, int i2) {
                        C48174uHs c48174uHs;
                        Intrinsics.checkNotNullParameter(boxScope, "");
                        if ((i2 & 17) != 16 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-92300764, i2, -1, "com.okinc.tradingbot.impl.botDetail.ui.llmSignal.LLMSignalDetailsFragment.setupComposeView.<anonymous>.<anonymous> (LLMSignalDetailsFragment.kt:99)");
                            }
                            uLU uluAEQbTJ2 = Activity.AEQbTJ(stateCollectAsState);
                            uLU.ActionBar actionBar = uluAEQbTJ2 instanceof uLU.ActionBar ? (uLU.ActionBar) uluAEQbTJ2 : null;
                            if (actionBar != null && (c48174uHs = (C48174uHs) actionBar.KWHzl()) != null) {
                                c48213uJd2.gEmmrt = c48174uHs;
                                boolean zAubY = c48213uJd2.AhwBna().AubY();
                                boolean zFJNWhG = c48213uJd2.fJNWhG();
                                boolean history = c48213uJd2.AhwBna().zLjUOn().getHistory();
                                C48213uJd c48213uJd3 = c48213uJd2;
                                composer2.startReplaceableGroup(-501362241);
                                boolean zChangedInstance2 = composer2.changedInstance(c48213uJd3);
                                java.lang.Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                    objRememberedValue2 = new LLMSignalDetailsFragment$setupComposeView$1$2$1$1(c48213uJd3);
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                Function0 function0 = (Function0) ((InterfaceC56555yJs) objRememberedValue2);
                                C48213uJd c48213uJd4 = c48213uJd2;
                                composer2.startReplaceableGroup(-501360192);
                                boolean zChangedInstance3 = composer2.changedInstance(c48213uJd4);
                                java.lang.Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChangedInstance3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                                    objRememberedValue3 = new LLMSignalDetailsFragment$setupComposeView$1$2$2$1(c48213uJd4);
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                composer2.endReplaceableGroup();
                                Function0 function02 = (Function0) ((InterfaceC56555yJs) objRememberedValue3);
                                C48213uJd c48213uJd5 = c48213uJd2;
                                composer2.startReplaceableGroup(-501357881);
                                boolean zChangedInstance4 = composer2.changedInstance(c48213uJd5);
                                java.lang.Object objRememberedValue4 = composer2.rememberedValue();
                                if (zChangedInstance4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                                    objRememberedValue4 = new LLMSignalDetailsFragment$setupComposeView$1$2$3$1(c48213uJd5);
                                    composer2.updateRememberedValue(objRememberedValue4);
                                }
                                composer2.endReplaceableGroup();
                                Function0 function03 = (Function0) ((InterfaceC56555yJs) objRememberedValue4);
                                C48213uJd c48213uJd6 = c48213uJd2;
                                composer2.startReplaceableGroup(-501355749);
                                boolean zChangedInstance5 = composer2.changedInstance(c48213uJd6);
                                java.lang.Object objRememberedValue5 = composer2.rememberedValue();
                                if (zChangedInstance5 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                                    objRememberedValue5 = new LLMSignalDetailsFragment$setupComposeView$1$2$4$1(c48213uJd6);
                                    composer2.updateRememberedValue(objRememberedValue5);
                                }
                                composer2.endReplaceableGroup();
                                Function0 function04 = (Function0) ((InterfaceC56555yJs) objRememberedValue5);
                                C48213uJd c48213uJd7 = c48213uJd2;
                                composer2.startReplaceableGroup(-501353791);
                                boolean zChangedInstance6 = composer2.changedInstance(c48213uJd7);
                                java.lang.Object objRememberedValue6 = composer2.rememberedValue();
                                if (zChangedInstance6 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                                    objRememberedValue6 = new LLMSignalDetailsFragment$setupComposeView$1$2$5$1(c48213uJd7);
                                    composer2.updateRememberedValue(objRememberedValue6);
                                }
                                composer2.endReplaceableGroup();
                                uIN.copydefault(null, c48174uHs, !zAubY, zFJNWhG, history, function0, function02, function03, function04, (Function0) ((InterfaceC56555yJs) objRememberedValue6), composer2, 0, 1);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), composer, 196614, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        public static final Unit OLrzqt(C48213uJd c48213uJd) {
            c48213uJd.djBIcL().AEQbTJ(LLMSignalDetailsViewModel.StateListAnimator.C0637StateListAnimator.OLrzqt);
            return Unit.INSTANCE;
        }

        public static final uLU<C48174uHs> AEQbTJ(androidx.compose.runtime.State<? extends uLU<C48174uHs>> state) {
            return state.getValue();
        }
    }

    public final void KWHzl(uPS ups) {
        ups.KWHzl.setContent(ComposableLambdaKt.composableLambdaInstance(467497258, true, new Activity()));
    }

    public final void AEQbTJ(uPS ups) {
        SharedFlow<LLMSignalDetailsViewModel.ActionBar> sharedFlowFJNWhG = djBIcL().fJNWhG();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C52692wUv.copydefault(sharedFlowFJNWhG, viewLifecycleOwner, Lifecycle.State.STARTED, new LLMSignalDetailsFragment$observeEvents$1(null));
    }

    public final void isConnected() {
        C48174uHs c48174uHs = this.gEmmrt;
        if (c48174uHs == null) {
            return;
        }
        C48098uEx.Activity activity = C48098uEx.Companion;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        java.util.List<C48178uHw> listDjBIcL = c48174uHs.djBIcL();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listDjBIcL, 10));
        java.util.Iterator<T> it = listDjBIcL.iterator();
        while (it.hasNext()) {
            arrayList.add(((C48178uHw) it.next()).EZpvd());
        }
        activity.AEQbTJ(childFragmentManager, arrayList, c48174uHs.copydefault());
    }

    public final void fetchVPNInfo() {
        java.lang.String strAYXKKw;
        C48174uHs c48174uHs = this.gEmmrt;
        if (c48174uHs == null || (strAYXKKw = c48174uHs.AYXKKw()) == null || strAYXKKw.length() == 0) {
            return;
        }
        uIJ.StateListAnimator stateListAnimator = uIJ.Companion;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        stateListAnimator.KWHzl(childFragmentManager, strAYXKKw);
    }

    public final void AkhnZx() {
        java.lang.String strValueOf;
        C48174uHs c48174uHs = this.gEmmrt;
        if (c48174uHs == null || (strValueOf = c48174uHs.valueOf()) == null || strValueOf.length() == 0) {
            return;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.QSBOWP));
        viewOnClickListenerC54939xaY.EZpvd(strValueOf);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.onCreate), new View.OnClickListener() { // from class: o.uJh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C48213uJd.AEQbTJ(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void values() {
        BotVo bot = AhwBna().zLjUOn().getBot();
        if ((bot != null ? bot.getBacktest() : null) == null) {
            AuCTel().AEQbTJ("StopAiBot", AhwBna().zLjUOn());
            return;
        }
        uCZ ucz = uCZ.copydefault;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ucz.copydefault(contextRequireContext, this, AhwBna().zLjUOn().getAlgoId(), new Function0() { // from class: o.uJf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48213uJd.fetchVPNInfo(this.copydefault);
            }
        }, new Function1() { // from class: o.uJi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48213uJd.KWHzl((java.lang.String) obj);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025 A[PHI: r1
  0x0025: PHI (r1v2 android.view.View) = (r1v1 android.view.View), (r1v4 android.view.View) binds: [B:15:0x0023, B:9:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit fetchVPNInfo(C48213uJd c48213uJd) {
        android.view.View view;
        android.content.Context context = c48213uJd.getContext();
        if (context != null) {
            androidx.fragment.app.Fragment parentFragment = c48213uJd.getParentFragment();
            if (parentFragment == null || (view = parentFragment.getView()) == null || (root = view.getRootView()) == null) {
                uPS ups = c48213uJd.djBIcL;
                android.view.View root = ups != null ? ups.getRoot() : null;
                if (root != null) {
                    C55284xgz c55284xgzAEQbTJ = C55284xgz.Companion.AEQbTJ(context, root, C33070mpX.AYXKKw(C48033uCm.Fragment.djSkpj));
                    if (c55284xgzAEQbTJ != null) {
                        c55284xgzAEQbTJ.isConnected(3);
                        c55284xgzAEQbTJ.hDKMBd();
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55326xho.toastWithFailedIcon$default(str, 0, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void valueOf() {
        AuCTel().AEQbTJ("RunBacktestAgain", AhwBna().zLjUOn());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.djBIcL = null;
        this.gEmmrt = null;
    }

    /* JADX DEBUG: Possible override for method o.uIM.OLrzqt()V */
    @Override // o.InterfaceC52662wTs
    public TradeLiveData<java.util.ArrayList<java.lang.Object>> OLrzqt() {
        return new TradeLiveData<>(yDY.copydefault(AhwBna().zLjUOn()));
    }

    @Override // o.InterfaceC52662wTs
    public void copydefault(@NotNull java.lang.String str, int i, boolean z) {
        android.view.View root;
        android.view.View view;
        Intrinsics.checkNotNullParameter(str, "");
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        if (parentFragment == null || (view = parentFragment.getView()) == null || (root = view.getRootView()) == null) {
            uPS ups = this.djBIcL;
            root = ups != null ? ups.getRoot() : null;
            if (root == null) {
                return;
            }
        }
        C55284xgz c55284xgzAEQbTJ = C55284xgz.Companion.AEQbTJ(requireContext(), root, str);
        if (c55284xgzAEQbTJ != null) {
            c55284xgzAEQbTJ.isConnected(i);
            c55284xgzAEQbTJ.hDKMBd();
        }
    }

    @Override // o.InterfaceC52662wTs
    public void gEmmrt() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
