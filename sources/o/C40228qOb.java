package o;

import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.market.quotation.ui.model.OptionsCategoryGroupVo;
import com.okinc.market.quotation.ui.model.dex.DexChainGroupVo;
import com.okinc.market.search.features.navigation.dex.viewmodel.NavSearchDexGroupViewModel;
import com.okinc.market.search.features.navigation.futures.viewmodel.NavSearchFuturesGroupViewModel;
import com.okinc.market.search.features.navigation.options.viewmodel.NavSearchOptionsQuoteGroupViewModel;
import com.okinc.market.search.features.navigation.result.domain.AggregateNavSearchResultUseCase$filterMapResult$$inlined$filter$1$2$1;
import com.okinc.market.search.features.navigation.result.domain.AggregateNavSearchResultUseCase$filterMapResult$$inlined$map$1$2$1;
import com.okinc.market.search.features.navigation.result.domain.AggregateNavSearchResultUseCase$onExecute$$inlined$map$1$2$1;
import com.okinc.market.search.features.navigation.result.domain.AggregateNavSearchResultUseCase$onExecute$$inlined$map$2$2$1;
import com.okinc.market.search.features.navigation.result.domain.AggregateNavSearchResultUseCase$onExecute$$inlined$map$3$2$1;
import com.okinc.market.search.features.navigation.result.domain.AggregateNavSearchResultUseCase$onExecute$$inlined$map$4$2$1;
import com.okinc.market.search.features.navigation.result.domain.AggregateNavSearchResultUseCase$onExecute$6;
import com.okinc.market.search.features.navigation.result.domain.AggregateNavSearchResultUseCase$onExecute$7;
import com.okinc.market.search.features.navigation.result.domain.AggregateNavSearchResultUseCase$onExecute$8;
import com.okinc.market.search.features.navigation.result.domain.AggregateNavSearchResultUseCase$onExecute$9;
import com.okinc.market.search.features.navigation.spot.viewmodel.NavSearchSpotGroupViewModel;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import java.util.concurrent.CancellationException;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.InterfaceC49371unL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qOb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40228qOb extends AbstractC49400uno<Quartet<? extends Flow<? extends NavSearchSpotGroupViewModel.Application>, ? extends Flow<? extends NavSearchFuturesGroupViewModel.Application>, ? extends Flow<? extends NavSearchOptionsQuoteGroupViewModel.TaskDescription>, ? extends Flow<? extends NavSearchDexGroupViewModel.ActionBar>>, Flow<? extends Quintet<? extends java.lang.String, ? extends Quartet<? extends java.lang.String, ? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.List<? extends CategoryGroupVo>, ? extends java.util.List<? extends ChargeGroupVo>>, ? extends kotlin.Pair<? extends java.lang.String, ? extends C41467qrP>, ? extends Triple<? extends java.lang.String, ? extends java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>, ? extends java.lang.Integer>, ? extends Triple<? extends java.lang.String, ? extends java.util.List<? extends DexChainGroupVo>, ? extends java.util.List<? extends InterfaceC41655qus>>>>> {
    private static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final CoroutineDispatcher AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd((Quartet<? extends Flow<NavSearchSpotGroupViewModel.Application>, ? extends Flow<NavSearchFuturesGroupViewModel.Application>, ? extends Flow<NavSearchOptionsQuoteGroupViewModel.TaskDescription>, ? extends Flow<NavSearchDexGroupViewModel.ActionBar>>) obj, (Continuation<? super Flow<? extends Quintet<java.lang.String, ? extends Quartet<java.lang.String, ? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.List<CategoryGroupVo>, ? extends java.util.List<ChargeGroupVo>>, kotlin.Pair<java.lang.String, C41467qrP>, ? extends Triple<java.lang.String, ? extends java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>, java.lang.Integer>, ? extends Triple<java.lang.String, ? extends java.util.List<DexChainGroupVo>, ? extends java.util.List<? extends InterfaceC41655qus>>>>>) continuation);
    }

    @yCM
    public C40228qOb(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.qOb$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qOb.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.Object EZpvd(@NotNull Quartet<? extends Flow<NavSearchSpotGroupViewModel.Application>, ? extends Flow<NavSearchFuturesGroupViewModel.Application>, ? extends Flow<NavSearchOptionsQuoteGroupViewModel.TaskDescription>, ? extends Flow<NavSearchDexGroupViewModel.ActionBar>> quartet, @NotNull Continuation<? super Flow<? extends Quintet<java.lang.String, ? extends Quartet<java.lang.String, ? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.List<CategoryGroupVo>, ? extends java.util.List<ChargeGroupVo>>, kotlin.Pair<java.lang.String, C41467qrP>, ? extends Triple<java.lang.String, ? extends java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>, java.lang.Integer>, ? extends Triple<java.lang.String, ? extends java.util.List<DexChainGroupVo>, ? extends java.util.List<? extends InterfaceC41655qus>>>>> continuation) {
        return FlowKt.flowOn(FlowKt.onEach(FlowKt.m7441catch(FlowKt.onStart(FlowKt.filterNotNull(FlowKt.combine(EZpvd(new TaskDescription(quartet.component1())), EZpvd(new StateListAnimator(quartet.component2())), EZpvd(new LoaderManager(quartet.component3())), EZpvd(new FragmentManager(quartet.component4())), new AggregateNavSearchResultUseCase$onExecute$6(this, null))), new AggregateNavSearchResultUseCase$onExecute$7(quartet, null)), new AggregateNavSearchResultUseCase$onExecute$8(null)), new AggregateNavSearchResultUseCase$onExecute$9(null)), AEQbTJ());
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: o.qOb$ActionBar */
    public static final class ActionBar<T> implements Flow<InterfaceC49371unL<? extends T>> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: o.qOb$ActionBar$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.AEQbTJ = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                AggregateNavSearchResultUseCase$filterMapResult$$inlined$filter$1$2$1 aggregateNavSearchResultUseCase$filterMapResult$$inlined$filter$1$2$1;
                if (continuation instanceof AggregateNavSearchResultUseCase$filterMapResult$$inlined$filter$1$2$1) {
                    aggregateNavSearchResultUseCase$filterMapResult$$inlined$filter$1$2$1 = (AggregateNavSearchResultUseCase$filterMapResult$$inlined$filter$1$2$1) continuation;
                    int i = aggregateNavSearchResultUseCase$filterMapResult$$inlined$filter$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aggregateNavSearchResultUseCase$filterMapResult$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        aggregateNavSearchResultUseCase$filterMapResult$$inlined$filter$1$2$1 = new AggregateNavSearchResultUseCase$filterMapResult$$inlined$filter$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = aggregateNavSearchResultUseCase$filterMapResult$$inlined$filter$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = aggregateNavSearchResultUseCase$filterMapResult$$inlined$filter$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) obj;
                    if ((interfaceC49371unL instanceof InterfaceC49371unL.Activity) || (interfaceC49371unL instanceof InterfaceC49371unL.TaskDescription) || ((interfaceC49371unL instanceof InterfaceC49371unL.Application) && !(((InterfaceC49371unL.Application) interfaceC49371unL).AEQbTJ() instanceof CancellationException))) {
                        aggregateNavSearchResultUseCase$filterMapResult$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, aggregateNavSearchResultUseCase$filterMapResult$$inlined$filter$1$2$1) == objCopydefault) {
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

        public ActionBar(Flow flow) {
            this.OLrzqt = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: o.qOb$Application */
    public static final class Application<T> implements Flow<T> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: o.qOb$Application$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: kotlinx.coroutines.flow.FlowCollector */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                AggregateNavSearchResultUseCase$filterMapResult$$inlined$map$1$2$1 aggregateNavSearchResultUseCase$filterMapResult$$inlined$map$1$2$1;
                java.lang.Object objCopydefault;
                if (continuation instanceof AggregateNavSearchResultUseCase$filterMapResult$$inlined$map$1$2$1) {
                    aggregateNavSearchResultUseCase$filterMapResult$$inlined$map$1$2$1 = (AggregateNavSearchResultUseCase$filterMapResult$$inlined$map$1$2$1) continuation;
                    int i = aggregateNavSearchResultUseCase$filterMapResult$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aggregateNavSearchResultUseCase$filterMapResult$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        aggregateNavSearchResultUseCase$filterMapResult$$inlined$map$1$2$1 = new AggregateNavSearchResultUseCase$filterMapResult$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = aggregateNavSearchResultUseCase$filterMapResult$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault2 = C56442yFn.copydefault();
                int i2 = aggregateNavSearchResultUseCase$filterMapResult$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) obj;
                    if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
                        objCopydefault = ((InterfaceC49371unL.Application) interfaceC49371unL).EZpvd();
                    } else if (interfaceC49371unL instanceof InterfaceC49371unL.TaskDescription) {
                        objCopydefault = ((InterfaceC49371unL.TaskDescription) interfaceC49371unL).AEQbTJ();
                    } else {
                        objCopydefault = interfaceC49371unL instanceof InterfaceC49371unL.Activity ? ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault() : null;
                    }
                    aggregateNavSearchResultUseCase$filterMapResult$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(objCopydefault, aggregateNavSearchResultUseCase$filterMapResult$$inlined$map$1$2$1) == objCopydefault2) {
                        return objCopydefault2;
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

        public Application(Flow flow) {
            this.AEQbTJ = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.qOb$FragmentManager */
    public static final class FragmentManager implements Flow<InterfaceC49371unL<? extends Triple<? extends java.lang.String, ? extends java.util.List<? extends DexChainGroupVo>, ? extends java.util.List<? extends InterfaceC41655qus>>>> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.qOb$FragmentManager$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                AggregateNavSearchResultUseCase$onExecute$$inlined$map$4$2$1 aggregateNavSearchResultUseCase$onExecute$$inlined$map$4$2$1;
                if (continuation instanceof AggregateNavSearchResultUseCase$onExecute$$inlined$map$4$2$1) {
                    aggregateNavSearchResultUseCase$onExecute$$inlined$map$4$2$1 = (AggregateNavSearchResultUseCase$onExecute$$inlined$map$4$2$1) continuation;
                    int i = aggregateNavSearchResultUseCase$onExecute$$inlined$map$4$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aggregateNavSearchResultUseCase$onExecute$$inlined$map$4$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        aggregateNavSearchResultUseCase$onExecute$$inlined$map$4$2$1 = new AggregateNavSearchResultUseCase$onExecute$$inlined$map$4$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = aggregateNavSearchResultUseCase$onExecute$$inlined$map$4$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = aggregateNavSearchResultUseCase$onExecute$$inlined$map$4$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    InterfaceC49371unL<Triple<java.lang.String, java.util.List<DexChainGroupVo>, java.util.List<InterfaceC41655qus>>> interfaceC49371unLKWHzl = ((NavSearchDexGroupViewModel.ActionBar) obj).KWHzl();
                    aggregateNavSearchResultUseCase$onExecute$$inlined$map$4$2$1.label = 1;
                    if (flowCollector.emit(interfaceC49371unLKWHzl, aggregateNavSearchResultUseCase$onExecute$$inlined$map$4$2$1) == objCopydefault) {
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

        public FragmentManager(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super InterfaceC49371unL<? extends Triple<? extends java.lang.String, ? extends java.util.List<? extends DexChainGroupVo>, ? extends java.util.List<? extends InterfaceC41655qus>>>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.qOb$LoaderManager */
    public static final class LoaderManager implements Flow<InterfaceC49371unL<? extends Triple<? extends java.lang.String, ? extends java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>, ? extends java.lang.Integer>>> {
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: o.qOb$LoaderManager$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                AggregateNavSearchResultUseCase$onExecute$$inlined$map$3$2$1 aggregateNavSearchResultUseCase$onExecute$$inlined$map$3$2$1;
                if (continuation instanceof AggregateNavSearchResultUseCase$onExecute$$inlined$map$3$2$1) {
                    aggregateNavSearchResultUseCase$onExecute$$inlined$map$3$2$1 = (AggregateNavSearchResultUseCase$onExecute$$inlined$map$3$2$1) continuation;
                    int i = aggregateNavSearchResultUseCase$onExecute$$inlined$map$3$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aggregateNavSearchResultUseCase$onExecute$$inlined$map$3$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        aggregateNavSearchResultUseCase$onExecute$$inlined$map$3$2$1 = new AggregateNavSearchResultUseCase$onExecute$$inlined$map$3$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = aggregateNavSearchResultUseCase$onExecute$$inlined$map$3$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = aggregateNavSearchResultUseCase$onExecute$$inlined$map$3$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    InterfaceC49371unL<Triple<java.lang.String, java.util.Map<OptionsCategoryGroupVo, java.util.Map<java.lang.String, java.util.List<InterfaceC41642quf>>>, java.lang.Integer>> interfaceC49371unLEZpvd = ((NavSearchOptionsQuoteGroupViewModel.TaskDescription) obj).EZpvd();
                    aggregateNavSearchResultUseCase$onExecute$$inlined$map$3$2$1.label = 1;
                    if (flowCollector.emit(interfaceC49371unLEZpvd, aggregateNavSearchResultUseCase$onExecute$$inlined$map$3$2$1) == objCopydefault) {
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

        public LoaderManager(Flow flow) {
            this.KWHzl = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super InterfaceC49371unL<? extends Triple<? extends java.lang.String, ? extends java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>, ? extends java.lang.Integer>>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.qOb$StateListAnimator */
    public static final class StateListAnimator implements Flow<InterfaceC49371unL<? extends kotlin.Pair<? extends java.lang.String, ? extends C41467qrP>>> {
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: o.qOb$StateListAnimator$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                AggregateNavSearchResultUseCase$onExecute$$inlined$map$2$2$1 aggregateNavSearchResultUseCase$onExecute$$inlined$map$2$2$1;
                if (continuation instanceof AggregateNavSearchResultUseCase$onExecute$$inlined$map$2$2$1) {
                    aggregateNavSearchResultUseCase$onExecute$$inlined$map$2$2$1 = (AggregateNavSearchResultUseCase$onExecute$$inlined$map$2$2$1) continuation;
                    int i = aggregateNavSearchResultUseCase$onExecute$$inlined$map$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aggregateNavSearchResultUseCase$onExecute$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        aggregateNavSearchResultUseCase$onExecute$$inlined$map$2$2$1 = new AggregateNavSearchResultUseCase$onExecute$$inlined$map$2$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = aggregateNavSearchResultUseCase$onExecute$$inlined$map$2$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = aggregateNavSearchResultUseCase$onExecute$$inlined$map$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    InterfaceC49371unL<kotlin.Pair<java.lang.String, C41467qrP>> interfaceC49371unLEZpvd = ((NavSearchFuturesGroupViewModel.Application) obj).EZpvd();
                    aggregateNavSearchResultUseCase$onExecute$$inlined$map$2$2$1.label = 1;
                    if (flowCollector.emit(interfaceC49371unLEZpvd, aggregateNavSearchResultUseCase$onExecute$$inlined$map$2$2$1) == objCopydefault) {
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

        public StateListAnimator(Flow flow) {
            this.KWHzl = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super InterfaceC49371unL<? extends kotlin.Pair<? extends java.lang.String, ? extends C41467qrP>>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.qOb$TaskDescription */
    public static final class TaskDescription implements Flow<InterfaceC49371unL<? extends Quartet<? extends java.lang.String, ? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.List<? extends CategoryGroupVo>, ? extends java.util.List<? extends ChargeGroupVo>>>> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.qOb$TaskDescription$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                AggregateNavSearchResultUseCase$onExecute$$inlined$map$1$2$1 aggregateNavSearchResultUseCase$onExecute$$inlined$map$1$2$1;
                if (continuation instanceof AggregateNavSearchResultUseCase$onExecute$$inlined$map$1$2$1) {
                    aggregateNavSearchResultUseCase$onExecute$$inlined$map$1$2$1 = (AggregateNavSearchResultUseCase$onExecute$$inlined$map$1$2$1) continuation;
                    int i = aggregateNavSearchResultUseCase$onExecute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aggregateNavSearchResultUseCase$onExecute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        aggregateNavSearchResultUseCase$onExecute$$inlined$map$1$2$1 = new AggregateNavSearchResultUseCase$onExecute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = aggregateNavSearchResultUseCase$onExecute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = aggregateNavSearchResultUseCase$onExecute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    InterfaceC49371unL<Quartet<java.lang.String, java.util.List<InterfaceC41641que>, java.util.List<CategoryGroupVo>, java.util.List<ChargeGroupVo>>> interfaceC49371unLCopydefault = ((NavSearchSpotGroupViewModel.Application) obj).copydefault();
                    aggregateNavSearchResultUseCase$onExecute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(interfaceC49371unLCopydefault, aggregateNavSearchResultUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
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

        public TaskDescription(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super InterfaceC49371unL<? extends Quartet<? extends java.lang.String, ? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.List<? extends CategoryGroupVo>, ? extends java.util.List<? extends ChargeGroupVo>>>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final Quintet<java.lang.String, Quartet<java.lang.String, java.util.List<InterfaceC41641que>, java.util.List<CategoryGroupVo>, java.util.List<ChargeGroupVo>>, kotlin.Pair<java.lang.String, C41467qrP>, Triple<java.lang.String, java.util.Map<OptionsCategoryGroupVo, java.util.Map<java.lang.String, java.util.List<InterfaceC41642quf>>>, java.lang.Integer>, Triple<java.lang.String, java.util.List<DexChainGroupVo>, java.util.List<InterfaceC41655qus>>> AEQbTJ(Quartet<java.lang.String, ? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.List<CategoryGroupVo>, ? extends java.util.List<ChargeGroupVo>> quartet, kotlin.Pair<java.lang.String, C41467qrP> pair, Triple<java.lang.String, ? extends java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>, java.lang.Integer> triple, Triple<java.lang.String, ? extends java.util.List<DexChainGroupVo>, ? extends java.util.List<? extends InterfaceC41655qus>> triple2) {
        java.lang.String first = quartet != null ? quartet.getFirst() : null;
        java.lang.String first2 = pair != null ? pair.getFirst() : null;
        java.lang.String first3 = triple != null ? triple.getFirst() : null;
        java.lang.String first4 = triple2 != null ? triple2.getFirst() : null;
        boolean z = true;
        boolean z2 = Intrinsics.EZpvd((java.lang.Object) first, (java.lang.Object) first2) && Intrinsics.EZpvd((java.lang.Object) first2, (java.lang.Object) first3) && Intrinsics.EZpvd((java.lang.Object) first4, (java.lang.Object) first3);
        if ((first != null && first.length() != 0) || ((first2 != null && first2.length() != 0) || ((first3 != null && first3.length() != 0) || (first4 != null && first4.length() != 0)))) {
            z = false;
        }
        if (z2 || z) {
            return new Quintet<>(quartet != null ? quartet.getFirst() : null, quartet, pair, triple, triple2);
        }
        return null;
    }

    public final <T> Flow<T> EZpvd(Flow<? extends InterfaceC49371unL<? extends T>> flow) {
        return new Application(new ActionBar(flow));
    }
}
