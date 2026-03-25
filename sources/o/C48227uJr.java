package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.biz.TacticsType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.tradingbot.impl.botDetail.ui.overview.LLMOverviewFragment$observePresenter$$inlined$map$1$2$1;
import com.okinc.tradingbot.impl.botDetail.ui.overview.LLMOverviewFragment$observePresenter$$inlined$mapNotNull$1$2$1;
import com.okinc.tradingbot.impl.botDetail.ui.overview.LLMOverviewFragment$observePresenter$1;
import com.okinc.tradingbot.impl.botDetail.ui.overview.LLMOverviewFragment$observePresenter$3;
import com.okinc.tradingbot.impl.botDetail.ui.overview.LLMOverviewFragment$setupComposeView$1$1$1$4$1$1;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.tradingbot.impl.strategy.view.helper.BotOperatorButtonDisposer;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.bot.AiBotDto;
import com.okinc.unify_trade.biz.bot.BacktestDto;
import com.okinc.unify_trade.bot.data.MpStgyCopyProfitChangeData;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.list.CardStyle;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C48033uCm;
import o.C48208uIz;
import o.C48227uJr;
import o.InterfaceC52662wTs;
import o.uII;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.uJr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C48227uJr extends AbstractC48226uJq implements InterfaceC52662wTs, uHJ {
    public final InterfaceC56387yDm AYXKKw;
    public C48496uTo AhwBna;
    public final StateFlow<TacticsData> AkhnZx;
    public java.util.List<StrategyProfitResponse> DbNXlk;
    public final InterfaceC56387yDm djBIcL;
    public final int gEmmrt;
    public final MutableStateFlow<TacticsData> valueOf;
    public final C55936xtO values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.gEmmrt;
    }

    /* JADX INFO: renamed from: o.uJr$StateListAnimator */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class StateListAnimator implements Flow<C48208uIz.Activity> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: o.uJr$StateListAnimator$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: java.lang.String */
            /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: kotlinx.coroutines.flow.FlowCollector */
            /* JADX DEBUG: Multi-variable search result rejected for r23v0, resolved type: java.lang.String */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                LLMOverviewFragment$observePresenter$$inlined$mapNotNull$1$2$1 lLMOverviewFragment$observePresenter$$inlined$mapNotNull$1$2$1;
                java.lang.Object activity;
                BotVo bot;
                BacktestDto backtest;
                BacktestDto backtest2;
                if (continuation instanceof LLMOverviewFragment$observePresenter$$inlined$mapNotNull$1$2$1) {
                    lLMOverviewFragment$observePresenter$$inlined$mapNotNull$1$2$1 = (LLMOverviewFragment$observePresenter$$inlined$mapNotNull$1$2$1) continuation;
                    int i = lLMOverviewFragment$observePresenter$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        lLMOverviewFragment$observePresenter$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        lLMOverviewFragment$observePresenter$$inlined$mapNotNull$1$2$1 = new LLMOverviewFragment$observePresenter$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = lLMOverviewFragment$observePresenter$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = lLMOverviewFragment$observePresenter$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    TacticsData tacticsData = (TacticsData) obj;
                    if (tacticsData != null) {
                        BotVo bot2 = tacticsData.getBot();
                        if ((bot2 != null ? bot2.getBacktest() : null) != null) {
                            java.lang.String algoId = tacticsData.getAlgoId();
                            BotVo bot3 = tacticsData.getBot();
                            long jValueOf = C33129mqd.valueOf((bot3 == null || (backtest2 = bot3.getBacktest()) == null) ? null : backtest2.getStartTime());
                            if (tacticsData.getHistory() && (bot = tacticsData.getBot()) != null && (backtest = bot.getBacktest()) != null) {
                                finishTime = backtest.getFinishTime();
                            }
                            activity = new C48208uIz.Activity(algoId, jValueOf, finishTime, null, C56443yFo.AEQbTJ(C48033uCm.Fragment.RJOkX), C56443yFo.AEQbTJ(C48033uCm.Fragment.QbewEr), C56443yFo.AEQbTJ(C48033uCm.Fragment.QfsBiF), 8, null);
                        } else {
                            activity = new C48208uIz.Activity(tacticsData.getAlgoId(), tacticsData.getCTimeStamp(), tacticsData.getHistory() ? tacticsData.getUTime() : null, null, null, null, null, 8, null);
                        }
                        finishTime = activity;
                    }
                    if (finishTime != null) {
                        lLMOverviewFragment$observePresenter$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(finishTime, lLMOverviewFragment$observePresenter$$inlined$mapNotNull$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public StateListAnimator(Flow flow) {
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super C48208uIz.Activity> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.uJr$TaskDescription */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskDescription implements Flow<TacticsData> {
        public final /* synthetic */ C48227uJr AEQbTJ;
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: o.uJr$TaskDescription$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ C48227uJr AEQbTJ;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, C48227uJr c48227uJr) {
                this.copydefault = flowCollector;
                this.AEQbTJ = c48227uJr;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r13v2, resolved type: kotlinx.coroutines.flow.FlowCollector */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                LLMOverviewFragment$observePresenter$$inlined$map$1$2$1 lLMOverviewFragment$observePresenter$$inlined$map$1$2$1;
                if (continuation instanceof LLMOverviewFragment$observePresenter$$inlined$map$1$2$1) {
                    lLMOverviewFragment$observePresenter$$inlined$map$1$2$1 = (LLMOverviewFragment$observePresenter$$inlined$map$1$2$1) continuation;
                    int i = lLMOverviewFragment$observePresenter$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        lLMOverviewFragment$observePresenter$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        lLMOverviewFragment$observePresenter$$inlined$map$1$2$1 = new LLMOverviewFragment$observePresenter$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = lLMOverviewFragment$observePresenter$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = lLMOverviewFragment$observePresenter$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    C55804xqp c55804xqp = (C55804xqp) obj;
                    ((StrategyDetailsResponse) c55804xqp.copydefault()).setHistory(this.AEQbTJ.AkhnZx().isHistory());
                    this.AEQbTJ.DbNXlk = C48172uHq.AEQbTJ((StrategyDetailsResponse) c55804xqp.copydefault(), this.AEQbTJ.DbNXlk);
                    java.lang.Object objFirstOrNull = CollectionsKt___CollectionsKt.firstOrNull(this.AEQbTJ.values.EZpvd(new C55804xqp<>("", C56402yEa.EZpvd(c55804xqp.copydefault()), null, null, 12, null)));
                    lLMOverviewFragment$observePresenter$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(objFirstOrNull, lLMOverviewFragment$observePresenter$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public TaskDescription(Flow flow, C48227uJr c48227uJr) {
            this.EZpvd = flow;
            this.AEQbTJ = c48227uJr;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super TacticsData> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass5(flowCollector, this.AEQbTJ), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // o.InterfaceC52662wTs
    public void DbNXlk() {
        InterfaceC52662wTs.TaskDescription.AEQbTJ(this);
    }

    public C48227uJr() {
        final Function0 function0 = null;
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsDetailPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.overview.LLMOverviewFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.overview.LLMOverviewFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.overview.LLMOverviewFragment$special$$inlined$activityViewModels$default$3
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
        MutableStateFlow<TacticsData> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.valueOf = MutableStateFlow;
        this.AkhnZx = FlowKt.asStateFlow(MutableStateFlow);
        this.DbNXlk = new java.util.ArrayList();
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.uJn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48227uJr.valueOf(this.EZpvd);
            }
        });
        this.values = new C55936xtO();
        this.gEmmrt = C48033uCm.Activity.deregisterUser;
    }

    private final TacticsDetailPresenter values() {
        return (TacticsDetailPresenter) this.AYXKKw.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StrategyDetailsResponse AkhnZx() {
        return values().AhwBna();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BotOperatorButtonDisposer ejfBZ() {
        return (BotOperatorButtonDisposer) this.djBIcL.getValue();
    }

    public static final BotOperatorButtonDisposer valueOf(C48227uJr c48227uJr) {
        return new BotOperatorButtonDisposer(c48227uJr, false);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AhwBna = C48496uTo.copydefault(view);
        isConnected();
        fetchVPNInfo();
        valueOf();
    }

    public final void isConnected() {
        ComposeView composeView;
        C48496uTo c48496uTo = this.AhwBna;
        if (c48496uTo == null || (composeView = c48496uTo.copydefault) == null) {
            return;
        }
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-673993415, true, new ActionBar()));
    }

    /* JADX INFO: renamed from: o.uJr$ActionBar */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class ActionBar implements Function2<Composer, java.lang.Integer, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        public static final TacticsData copydefault(TacticsData tacticsData) {
            return tacticsData;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, java.lang.Integer num) {
            copydefault(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void copydefault(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-673993415, i, -1, "com.okinc.tradingbot.impl.botDetail.ui.overview.LLMOverviewFragment.setupComposeView.<anonymous>.<anonymous> (LLMOverviewFragment.kt:107)");
                }
                androidx.compose.runtime.State stateOLrzqt = C52737wWm.OLrzqt(C48227uJr.this.AkhnZx, null, null, null, composer, 0, 7);
                java.lang.Object objKWHzl = KWHzl(stateOLrzqt);
                composer.startReplaceableGroup(1396293545);
                boolean zChanged = composer.changed(objKWHzl);
                java.lang.Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = C48235uJz.EZpvd.EZpvd(KWHzl(stateOLrzqt), true);
                    composer.updateRememberedValue(objRememberedValue);
                }
                final uJO ujo = (uJO) objRememberedValue;
                composer.endReplaceableGroup();
                final TacticsData tacticsDataKWHzl = KWHzl(stateOLrzqt);
                if (tacticsDataKWHzl != null) {
                    final C48227uJr c48227uJr = C48227uJr.this;
                    CardStyle cardStyle = CardStyle.DETAILED;
                    composer.startReplaceableGroup(-1082028146);
                    boolean zChanged2 = composer.changed(tacticsDataKWHzl);
                    java.lang.Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: o.uJw
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C48227uJr.ActionBar.copydefault(tacticsDataKWHzl);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    Function0 function0 = (Function0) objRememberedValue2;
                    composer.endReplaceableGroup();
                    composer.startReplaceableGroup(-1082023265);
                    java.lang.Object objRememberedValue3 = composer.rememberedValue();
                    Composer.Companion companion = Composer.Companion;
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: o.uJu
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C48227uJr.ActionBar.OLrzqt();
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    Function0 function02 = (Function0) objRememberedValue3;
                    composer.endReplaceableGroup();
                    composer.startReplaceableGroup(-1082019801);
                    boolean zChanged3 = composer.changed(ujo);
                    boolean zChangedInstance = composer.changedInstance(c48227uJr);
                    java.lang.Object objRememberedValue4 = composer.rememberedValue();
                    if ((zChanged3 | zChangedInstance) || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: o.uJv
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C48227uJr.ActionBar.EZpvd(ujo, c48227uJr);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue4);
                    }
                    Function0 function03 = (Function0) objRememberedValue4;
                    composer.endReplaceableGroup();
                    composer.startReplaceableGroup(-1081985103);
                    boolean zChangedInstance2 = composer.changedInstance(c48227uJr);
                    java.lang.Object objRememberedValue5 = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new yHO() { // from class: o.uJs
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.yHO
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                                return C48227uJr.ActionBar.EZpvd(c48227uJr, (java.lang.String) obj, (TacticsData) obj2, (Function0) obj3);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue5);
                    }
                    yHO yho = (yHO) objRememberedValue5;
                    composer.endReplaceableGroup();
                    composer.startReplaceableGroup(-1081972139);
                    boolean zChangedInstance3 = composer.changedInstance(c48227uJr);
                    java.lang.Object objRememberedValue6 = composer.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new Function2() { // from class: o.uJt
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return C48227uJr.ActionBar.copydefault(c48227uJr, (java.lang.String) obj, (TacticsData) obj2);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue6);
                    }
                    composer.endReplaceableGroup();
                    C48261uKy.EZpvd(ujo, function0, false, null, false, cardStyle, function02, null, function03, yho, (Function2) objRememberedValue6, composer, 1794432, 0, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        public static final Unit OLrzqt() {
            return Unit.INSTANCE;
        }

        public static final Unit EZpvd(uJO ujo, C48227uJr c48227uJr) {
            uJL ujlCopydefault = ujo.copydefault();
            if (ujlCopydefault == null) {
                return Unit.INSTANCE;
            }
            C43056riA c43056riA = C43056riA.AEQbTJ;
            android.content.Context contextRequireContext = c48227uJr.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            float fEZpvd = ujlCopydefault.EZpvd();
            c43056riA.OLrzqt(contextRequireContext, "okluatradingeco", "/bot/ai/backtest-progress-info", C56424yEw.gEmmrt(C56390yDp.OLrzqt("progress", pTB.formatICUPercent$default(java.lang.Float.valueOf(fEZpvd), null, C38307pTy.Companion.EZpvd(0), null, java.lang.Double.valueOf(100.0d), null, 21, null)), C56390yDp.OLrzqt("timeSpent", wUB.OLrzqt(ujlCopydefault.AEQbTJ())), C56390yDp.OLrzqt("timeLeft", wUB.OLrzqt(ujlCopydefault.OLrzqt()))));
            return Unit.INSTANCE;
        }

        public static final Unit EZpvd(C48227uJr c48227uJr, java.lang.String str, TacticsData tacticsData, Function0 function0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(tacticsData, "");
            BotOperatorButtonDisposer.dispose$default(c48227uJr.ejfBZ(), str, tacticsData, function0, new LLMOverviewFragment$setupComposeView$1$1$1$4$1$1(c48227uJr), null, null, 48, null);
            return Unit.INSTANCE;
        }

        public static final Unit copydefault(C48227uJr c48227uJr, java.lang.String str, TacticsData tacticsData) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(tacticsData, "");
            BotOperatorButtonDisposer.disposeDisableClick$default(c48227uJr.ejfBZ(), str, null, 2, null);
            return Unit.INSTANCE;
        }

        public static final TacticsData KWHzl(androidx.compose.runtime.State<TacticsData> state) {
            return state.getValue();
        }
    }

    public final void fetchVPNInfo() {
        Flow flowFlowOn = FlowKt.flowOn(new TaskDescription(FlowLiveDataConversions.asFlow(values().getNewProxyInstance()), this), Dispatchers.getDefault());
        Lifecycle.State state = Lifecycle.State.STARTED;
        C52692wUv.copydefault(flowFlowOn, this, state, new LLMOverviewFragment$observePresenter$1(this, null));
        C52692wUv.copydefault(FlowKt.distinctUntilChanged(new StateListAnimator(flowFlowOn)), this, state, new LLMOverviewFragment$observePresenter$3(this, null));
    }

    public final void valueOf() {
        C48208uIz.Activity activity;
        FragmentContainerView fragmentContainerView;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        C48208uIz c48208uIz;
        BotVo bot = AkhnZx().getBot();
        BacktestDto backtest = bot != null ? bot.getBacktest() : null;
        if (backtest != null) {
            activity = new C48208uIz.Activity(AkhnZx().getAlgoId(), C33129mqd.valueOf(backtest.getStartTime()), AkhnZx().isHistory() ? backtest.getFinishTime() : null, null, java.lang.Integer.valueOf(C48033uCm.Fragment.RJOkX), java.lang.Integer.valueOf(C48033uCm.Fragment.QbewEr), java.lang.Integer.valueOf(C48033uCm.Fragment.QfsBiF), 8, null);
        } else {
            activity = new C48208uIz.Activity(AkhnZx().getAlgoId(), C33129mqd.valueOf(AkhnZx().getCTime()), AkhnZx().isHistory() ? AkhnZx().getPTime() : null, null, null, null, null, 120, null);
        }
        C48496uTo c48496uTo = this.AhwBna;
        if (c48496uTo != null && (c48208uIz = c48496uTo.AEQbTJ) != null) {
            c48208uIz.OLrzqt(activity);
        }
        if (backtest == null) {
            uIG uigDjBIcL = djBIcL();
            if (uigDjBIcL != null) {
                uigDjBIcL.OLrzqt(AkhnZx().getAlgoId(), AkhnZx().getOrderType(), AkhnZx().isHistory(), true);
                return;
            }
            return;
        }
        C48496uTo c48496uTo2 = this.AhwBna;
        if (c48496uTo2 != null && (textView2 = c48496uTo2.KWHzl) != null) {
            textView2.setVisibility(0);
        }
        C48496uTo c48496uTo3 = this.AhwBna;
        if (c48496uTo3 != null && (textView = c48496uTo3.EZpvd) != null) {
            textView.setVisibility(8);
        }
        C48496uTo c48496uTo4 = this.AhwBna;
        if (c48496uTo4 == null || (fragmentContainerView = c48496uTo4.OLrzqt) == null) {
            return;
        }
        fragmentContainerView.setVisibility(8);
    }

    public final void AEQbTJ(TacticsData tacticsData) {
        uII uii;
        AiBotDto ai;
        AiBotDto ai2;
        AiBotDto ai3;
        java.util.List<java.lang.String> instIds;
        AiBotDto ai4;
        uII uii2;
        this.valueOf.setValue(tacticsData);
        java.util.List<StrategyProfitResponse> profitSnapshots = tacticsData.getProfitSnapshots();
        if (profitSnapshots == null) {
            profitSnapshots = yDY.AhwBna();
        }
        java.lang.String totalPnl = null;
        if (profitSnapshots.isEmpty()) {
            MpStgyCopyProfitChangeData profitData = tacticsData.getProfitData();
            profitSnapshots = profitData != null ? profitData.getProfitList() : null;
            if (profitSnapshots == null) {
                profitSnapshots = yDY.AhwBna();
            }
        }
        java.util.List<StrategyProfitResponse> list = profitSnapshots;
        C48496uTo c48496uTo = this.AhwBna;
        if (c48496uTo != null && (uii2 = c48496uTo.AhwBna) != null) {
            uii2.KWHzl();
        }
        C48496uTo c48496uTo2 = this.AhwBna;
        if (c48496uTo2 == null || (uii = c48496uTo2.AhwBna) == null) {
            return;
        }
        BotVo bot = tacticsData.getBot();
        java.lang.String totalPnlRate = (bot == null || (ai4 = bot.getAi()) == null) ? null : ai4.getTotalPnlRate();
        java.lang.String str = totalPnlRate == null ? "" : totalPnlRate;
        BotVo bot2 = tacticsData.getBot();
        java.lang.String str2 = (bot2 == null || (ai3 = bot2.getAi()) == null || (instIds = ai3.getInstIds()) == null) ? null : (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(instIds);
        java.lang.String str3 = str2 == null ? "" : str2;
        java.lang.String instType = tacticsData.getInstType();
        BotVo bot3 = tacticsData.getBot();
        java.lang.String investCcy = (bot3 == null || (ai2 = bot3.getAi()) == null) ? null : ai2.getInvestCcy();
        java.lang.String str4 = investCcy == null ? "" : investCcy;
        java.lang.String orderType = tacticsData.getOrderType();
        BotVo bot4 = tacticsData.getBot();
        if (bot4 != null && (ai = bot4.getAi()) != null) {
            totalPnl = ai.getTotalPnl();
        }
        uii.KWHzl(new uII.Activity(str, list, new C48264uLa(str3, instType, str4, orderType, totalPnl == null ? "" : totalPnl, false, 6, 32, null), 0, TacticsType.TACTICS_LLM_BOT, 8, null));
    }

    public final uIG djBIcL() {
        androidx.fragment.app.Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(C48033uCm.Application.DPHsZd);
        if (fragmentFindFragmentById instanceof uIG) {
            return (uIG) fragmentFindFragmentById;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.AhwBna = null;
        super.onDestroyView();
    }

    /* JADX DEBUG: Possible override for method o.uJq.OLrzqt()V */
    @Override // o.InterfaceC52662wTs
    public TradeLiveData<java.util.ArrayList<java.lang.Object>> OLrzqt() {
        return new TradeLiveData<>(yDY.copydefault(values().zLjUOn()));
    }

    @Override // o.InterfaceC52662wTs
    public void copydefault(@NotNull java.lang.String str, int i, boolean z) {
        android.view.View root;
        android.view.View view;
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Context context = getContext();
        if (context != null) {
            androidx.fragment.app.Fragment parentFragment = getParentFragment();
            if (parentFragment == null || (view = parentFragment.getView()) == null || (root = view.getRootView()) == null) {
                C48496uTo c48496uTo = this.AhwBna;
                root = c48496uTo != null ? c48496uTo.getRoot() : null;
                if (root == null) {
                    return;
                }
            }
            C55284xgz c55284xgzAEQbTJ = C55284xgz.Companion.AEQbTJ(context, root, str);
            if (c55284xgzAEQbTJ != null) {
                c55284xgzAEQbTJ.isConnected(i);
                c55284xgzAEQbTJ.hDKMBd();
            }
        }
    }

    @Override // o.InterfaceC52662wTs
    public void EZpvd(@NotNull TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        AhwBna();
    }

    public final void AhwBna() {
        final TacticsData value = this.valueOf.getValue();
        if (value == null) {
            return;
        }
        C32866mlf.onEvent$default("TradingBot_SharePoster_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.uJp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48227uJr.EZpvd(value, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        FragmentActivity activity = getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            C53772wrm.shareAiBot$default(value, abstractActivityC33041mov, false, false, 6, null);
        }
    }

    public static final Unit EZpvd(TacticsData tacticsData, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", tacticsData.getHistory() ? "history" : "pendding", true);
        EventParamsList.put$default(eventParamsList, "bot_type", tacticsData.getOrderType(), false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC52662wTs
    public void fARcdN() {
        TacticsDetailPresenter.queryBotDetails$default(values(), false, 1, null);
    }

    @Override // o.InterfaceC52662wTs
    public void bz_() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // o.InterfaceC52662wTs
    public void gEmmrt() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // o.InterfaceC52662wTs
    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        values().valueOf(str2);
    }
}
