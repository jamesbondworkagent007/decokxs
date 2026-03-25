package o;

import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.market.quotation.ui.model.OptionsCategoryGroupVo;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.quotation.ui.model.dex.DexChainGroupVo;
import com.okinc.market.quotation.ui.model.dex.DexPeriodEnum;
import com.okinc.market.quotation.ui.model.dex.DexSortByEnum;
import com.okinc.market.search.features.navigation.result.domain.SubscribeNavSearchResultUseCase$getDexFlow$1;
import com.okinc.market.search.features.navigation.result.domain.SubscribeNavSearchResultUseCase$getFuturesFlow$$inlined$flatMapLatest$1;
import com.okinc.market.search.features.navigation.result.domain.SubscribeNavSearchResultUseCase$getFuturesFlow$$inlined$map$1$2$1;
import com.okinc.market.search.features.navigation.result.domain.SubscribeNavSearchResultUseCase$getFuturesFlow$lambda$6$$inlined$map$1$2$1;
import com.okinc.market.search.features.navigation.result.domain.SubscribeNavSearchResultUseCase$getOptionsFlow$$inlined$flatMapLatest$1;
import com.okinc.market.search.features.navigation.result.domain.SubscribeNavSearchResultUseCase$getOptionsFlow$$inlined$map$1$2$1;
import com.okinc.market.search.features.navigation.result.domain.SubscribeNavSearchResultUseCase$getOptionsFlow$lambda$10$$inlined$map$1$2$1;
import com.okinc.market.search.features.navigation.result.domain.SubscribeNavSearchResultUseCase$getSpotFlow$$inlined$flatMapLatest$1;
import com.okinc.market.search.features.navigation.result.domain.SubscribeNavSearchResultUseCase$getSpotFlow$$inlined$map$1$2$1;
import com.okinc.market.search.features.navigation.result.domain.SubscribeNavSearchResultUseCase$getSpotFlow$lambda$3$$inlined$map$1$2$1;
import com.okinc.market.search.features.navigation.result.domain.SubscribeNavSearchResultUseCase$onExecute$1;
import com.okinc.market.search.features.navigation.result.domain.SubscribeNavSearchResultUseCase$onExecute$resultFlow$1;
import com.okinc.market.search.features.navigation.result.domain.SubscribeNavSearchResultUseCase$onExecute$suspendImpl$$inlined$map$1$2$1;
import com.okinc.market.search.features.navigation.result.domain.SubscribeNavSearchResultUseCase$toSearchResultFlow$$inlined$map$1$2$1;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C40239qOm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qOh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C40234qOh extends AbstractC49400uno<C40233qOg, Flow<? extends kotlin.Pair<? extends java.lang.String, ? extends java.util.List<? extends InterfaceC40237qOk>>>> {
    private static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final C41499qrv AEQbTJ;
    public final C41603qtt AYXKKw;
    public final C41546qsp AhwBna;
    public final CoroutineDispatcher EZpvd;
    public final C40235qOi KWHzl;
    public final C41508qsD valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Object OLrzqt(@NotNull C40233qOg c40233qOg, @NotNull Continuation<? super Flow<? extends kotlin.Pair<java.lang.String, ? extends java.util.List<? extends InterfaceC40237qOk>>>> continuation) {
        return EZpvd(this, c40233qOg, continuation);
    }

    /* JADX INFO: renamed from: o.qOh$ActionBar */
    public static final class ActionBar implements Flow<C40239qOm.ActionBar.Application> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: o.qOh$ActionBar$4, reason: invalid class name */
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
                SubscribeNavSearchResultUseCase$getOptionsFlow$$inlined$map$1$2$1 subscribeNavSearchResultUseCase$getOptionsFlow$$inlined$map$1$2$1;
                if (continuation instanceof SubscribeNavSearchResultUseCase$getOptionsFlow$$inlined$map$1$2$1) {
                    subscribeNavSearchResultUseCase$getOptionsFlow$$inlined$map$1$2$1 = (SubscribeNavSearchResultUseCase$getOptionsFlow$$inlined$map$1$2$1) continuation;
                    int i = subscribeNavSearchResultUseCase$getOptionsFlow$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeNavSearchResultUseCase$getOptionsFlow$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeNavSearchResultUseCase$getOptionsFlow$$inlined$map$1$2$1 = new SubscribeNavSearchResultUseCase$getOptionsFlow$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeNavSearchResultUseCase$getOptionsFlow$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeNavSearchResultUseCase$getOptionsFlow$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    C40244qOr c40244qOr = (C40244qOr) obj;
                    C40375qTn.AEQbTJ.copydefault("SubscribeNavSearchResultUseCase", "getOptionsFlow() - options config: " + c40244qOr.KWHzl());
                    C40239qOm.ActionBar.Application applicationKWHzl = c40244qOr.KWHzl();
                    subscribeNavSearchResultUseCase$getOptionsFlow$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(applicationKWHzl, subscribeNavSearchResultUseCase$getOptionsFlow$$inlined$map$1$2$1) == objCopydefault) {
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

        public ActionBar(Flow flow) {
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super C40239qOm.ActionBar.Application> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.qOh$Activity */
    public static final class Activity implements Flow<kotlin.Pair<? extends java.util.List<? extends InterfaceC40237qOk>, ? extends C40239qOm.ActionBar.Application>> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ C40239qOm.ActionBar.Application OLrzqt;

        /* JADX INFO: renamed from: o.qOh$Activity$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ C40239qOm.ActionBar.Application EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector, C40239qOm.ActionBar.Application application) {
                this.AEQbTJ = flowCollector;
                this.EZpvd = application;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SubscribeNavSearchResultUseCase$getOptionsFlow$lambda$10$$inlined$map$1$2$1 subscribeNavSearchResultUseCase$getOptionsFlow$lambda$10$$inlined$map$1$2$1;
                if (continuation instanceof SubscribeNavSearchResultUseCase$getOptionsFlow$lambda$10$$inlined$map$1$2$1) {
                    subscribeNavSearchResultUseCase$getOptionsFlow$lambda$10$$inlined$map$1$2$1 = (SubscribeNavSearchResultUseCase$getOptionsFlow$lambda$10$$inlined$map$1$2$1) continuation;
                    int i = subscribeNavSearchResultUseCase$getOptionsFlow$lambda$10$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeNavSearchResultUseCase$getOptionsFlow$lambda$10$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeNavSearchResultUseCase$getOptionsFlow$lambda$10$$inlined$map$1$2$1 = new SubscribeNavSearchResultUseCase$getOptionsFlow$lambda$10$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeNavSearchResultUseCase$getOptionsFlow$lambda$10$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeNavSearchResultUseCase$getOptionsFlow$lambda$10$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt((java.util.List) obj, this.EZpvd);
                    subscribeNavSearchResultUseCase$getOptionsFlow$lambda$10$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(pairOLrzqt, subscribeNavSearchResultUseCase$getOptionsFlow$lambda$10$$inlined$map$1$2$1) == objCopydefault) {
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

        public Activity(Flow flow, C40239qOm.ActionBar.Application application) {
            this.AEQbTJ = flow;
            this.OLrzqt = application;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super kotlin.Pair<? extends java.util.List<? extends InterfaceC40237qOk>, ? extends C40239qOm.ActionBar.Application>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass1(flowCollector, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.qOh$Application */
    public static final class Application implements Flow<C40239qOm.ActionBar.C0923ActionBar> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: o.qOh$Application$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SubscribeNavSearchResultUseCase$getFuturesFlow$$inlined$map$1$2$1 subscribeNavSearchResultUseCase$getFuturesFlow$$inlined$map$1$2$1;
                if (continuation instanceof SubscribeNavSearchResultUseCase$getFuturesFlow$$inlined$map$1$2$1) {
                    subscribeNavSearchResultUseCase$getFuturesFlow$$inlined$map$1$2$1 = (SubscribeNavSearchResultUseCase$getFuturesFlow$$inlined$map$1$2$1) continuation;
                    int i = subscribeNavSearchResultUseCase$getFuturesFlow$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeNavSearchResultUseCase$getFuturesFlow$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeNavSearchResultUseCase$getFuturesFlow$$inlined$map$1$2$1 = new SubscribeNavSearchResultUseCase$getFuturesFlow$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeNavSearchResultUseCase$getFuturesFlow$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeNavSearchResultUseCase$getFuturesFlow$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    C40244qOr c40244qOr = (C40244qOr) obj;
                    C40375qTn.AEQbTJ.copydefault("SubscribeNavSearchResultUseCase", "getFuturesFlow() - futures config: " + c40244qOr.AEQbTJ());
                    C40239qOm.ActionBar.C0923ActionBar c0923ActionBarAEQbTJ = c40244qOr.AEQbTJ();
                    subscribeNavSearchResultUseCase$getFuturesFlow$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(c0923ActionBarAEQbTJ, subscribeNavSearchResultUseCase$getFuturesFlow$$inlined$map$1$2$1) == objCopydefault) {
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

        public Application(Flow flow) {
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super C40239qOm.ActionBar.C0923ActionBar> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.qOh$Dialog */
    public static final class Dialog implements Flow<java.lang.Boolean> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: o.qOh$Dialog$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SubscribeNavSearchResultUseCase$getSpotFlow$$inlined$map$1$2$1 subscribeNavSearchResultUseCase$getSpotFlow$$inlined$map$1$2$1;
                if (continuation instanceof SubscribeNavSearchResultUseCase$getSpotFlow$$inlined$map$1$2$1) {
                    subscribeNavSearchResultUseCase$getSpotFlow$$inlined$map$1$2$1 = (SubscribeNavSearchResultUseCase$getSpotFlow$$inlined$map$1$2$1) continuation;
                    int i = subscribeNavSearchResultUseCase$getSpotFlow$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeNavSearchResultUseCase$getSpotFlow$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeNavSearchResultUseCase$getSpotFlow$$inlined$map$1$2$1 = new SubscribeNavSearchResultUseCase$getSpotFlow$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeNavSearchResultUseCase$getSpotFlow$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeNavSearchResultUseCase$getSpotFlow$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    C40244qOr c40244qOr = (C40244qOr) obj;
                    C40375qTn.AEQbTJ.copydefault("SubscribeNavSearchResultUseCase", "getSpotFlow() - spot config: isShowAllSpotList=" + c40244qOr.EZpvd());
                    java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(c40244qOr.EZpvd());
                    subscribeNavSearchResultUseCase$getSpotFlow$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(boolKWHzl, subscribeNavSearchResultUseCase$getSpotFlow$$inlined$map$1$2$1) == objCopydefault) {
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

        public Dialog(Flow flow) {
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.lang.Boolean> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.qOh$Fragment */
    public static final class Fragment implements Flow<java.util.List<? extends InterfaceC40237qOk>> {
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: o.qOh$Fragment$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.AEQbTJ = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SubscribeNavSearchResultUseCase$toSearchResultFlow$$inlined$map$1$2$1 subscribeNavSearchResultUseCase$toSearchResultFlow$$inlined$map$1$2$1;
                if (continuation instanceof SubscribeNavSearchResultUseCase$toSearchResultFlow$$inlined$map$1$2$1) {
                    subscribeNavSearchResultUseCase$toSearchResultFlow$$inlined$map$1$2$1 = (SubscribeNavSearchResultUseCase$toSearchResultFlow$$inlined$map$1$2$1) continuation;
                    int i = subscribeNavSearchResultUseCase$toSearchResultFlow$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeNavSearchResultUseCase$toSearchResultFlow$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeNavSearchResultUseCase$toSearchResultFlow$$inlined$map$1$2$1 = new SubscribeNavSearchResultUseCase$toSearchResultFlow$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeNavSearchResultUseCase$toSearchResultFlow$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeNavSearchResultUseCase$toSearchResultFlow$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (T t : (java.util.List) obj) {
                        if (t instanceof InterfaceC40237qOk) {
                            arrayList.add(t);
                        }
                    }
                    subscribeNavSearchResultUseCase$toSearchResultFlow$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(arrayList, subscribeNavSearchResultUseCase$toSearchResultFlow$$inlined$map$1$2$1) == objCopydefault) {
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

        public Fragment(Flow flow) {
            this.KWHzl = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends InterfaceC40237qOk>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.qOh$FragmentManager */
    public static final class FragmentManager implements Flow<kotlin.Pair<? extends java.lang.String, ? extends java.util.List<? extends InterfaceC40237qOk>>> {
        public final /* synthetic */ Flow KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;

        /* JADX INFO: renamed from: o.qOh$FragmentManager$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;
            public final /* synthetic */ java.lang.String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, java.lang.String str) {
                this.KWHzl = flowCollector;
                this.copydefault = str;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SubscribeNavSearchResultUseCase$onExecute$suspendImpl$$inlined$map$1$2$1 subscribeNavSearchResultUseCase$onExecute$suspendImpl$$inlined$map$1$2$1;
                if (continuation instanceof SubscribeNavSearchResultUseCase$onExecute$suspendImpl$$inlined$map$1$2$1) {
                    subscribeNavSearchResultUseCase$onExecute$suspendImpl$$inlined$map$1$2$1 = (SubscribeNavSearchResultUseCase$onExecute$suspendImpl$$inlined$map$1$2$1) continuation;
                    int i = subscribeNavSearchResultUseCase$onExecute$suspendImpl$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeNavSearchResultUseCase$onExecute$suspendImpl$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeNavSearchResultUseCase$onExecute$suspendImpl$$inlined$map$1$2$1 = new SubscribeNavSearchResultUseCase$onExecute$suspendImpl$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeNavSearchResultUseCase$onExecute$suspendImpl$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeNavSearchResultUseCase$onExecute$suspendImpl$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    kotlin.Pair pair = new kotlin.Pair(this.copydefault, (java.util.List) obj);
                    subscribeNavSearchResultUseCase$onExecute$suspendImpl$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(pair, subscribeNavSearchResultUseCase$onExecute$suspendImpl$$inlined$map$1$2$1) == objCopydefault) {
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

        public FragmentManager(Flow flow, java.lang.String str) {
            this.KWHzl = flow;
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super kotlin.Pair<? extends java.lang.String, ? extends java.util.List<? extends InterfaceC40237qOk>>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass4(flowCollector, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.qOh$PendingIntent */
    public static final class PendingIntent implements Flow<kotlin.Pair<? extends java.util.List<? extends InterfaceC40237qOk>, ? extends java.lang.Boolean>> {
        public final /* synthetic */ boolean KWHzl;
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.qOh$PendingIntent$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;
            public final /* synthetic */ boolean copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, boolean z) {
                this.EZpvd = flowCollector;
                this.copydefault = z;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SubscribeNavSearchResultUseCase$getSpotFlow$lambda$3$$inlined$map$1$2$1 subscribeNavSearchResultUseCase$getSpotFlow$lambda$3$$inlined$map$1$2$1;
                if (continuation instanceof SubscribeNavSearchResultUseCase$getSpotFlow$lambda$3$$inlined$map$1$2$1) {
                    subscribeNavSearchResultUseCase$getSpotFlow$lambda$3$$inlined$map$1$2$1 = (SubscribeNavSearchResultUseCase$getSpotFlow$lambda$3$$inlined$map$1$2$1) continuation;
                    int i = subscribeNavSearchResultUseCase$getSpotFlow$lambda$3$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeNavSearchResultUseCase$getSpotFlow$lambda$3$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeNavSearchResultUseCase$getSpotFlow$lambda$3$$inlined$map$1$2$1 = new SubscribeNavSearchResultUseCase$getSpotFlow$lambda$3$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeNavSearchResultUseCase$getSpotFlow$lambda$3$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeNavSearchResultUseCase$getSpotFlow$lambda$3$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt((java.util.List) obj, C56443yFo.KWHzl(this.copydefault));
                    subscribeNavSearchResultUseCase$getSpotFlow$lambda$3$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(pairOLrzqt, subscribeNavSearchResultUseCase$getSpotFlow$lambda$3$$inlined$map$1$2$1) == objCopydefault) {
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

        public PendingIntent(Flow flow, boolean z) {
            this.copydefault = flow;
            this.KWHzl = z;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super kotlin.Pair<? extends java.util.List<? extends InterfaceC40237qOk>, ? extends java.lang.Boolean>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass4(flowCollector, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.qOh$StateListAnimator */
    public static final class StateListAnimator implements Flow<kotlin.Pair<? extends java.util.List<? extends InterfaceC40237qOk>, ? extends C40239qOm.ActionBar.C0923ActionBar>> {
        public final /* synthetic */ C40239qOm.ActionBar.C0923ActionBar AEQbTJ;
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: o.qOh$StateListAnimator$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;
            public final /* synthetic */ C40239qOm.ActionBar.C0923ActionBar copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector, C40239qOm.ActionBar.C0923ActionBar c0923ActionBar) {
                this.EZpvd = flowCollector;
                this.copydefault = c0923ActionBar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SubscribeNavSearchResultUseCase$getFuturesFlow$lambda$6$$inlined$map$1$2$1 subscribeNavSearchResultUseCase$getFuturesFlow$lambda$6$$inlined$map$1$2$1;
                if (continuation instanceof SubscribeNavSearchResultUseCase$getFuturesFlow$lambda$6$$inlined$map$1$2$1) {
                    subscribeNavSearchResultUseCase$getFuturesFlow$lambda$6$$inlined$map$1$2$1 = (SubscribeNavSearchResultUseCase$getFuturesFlow$lambda$6$$inlined$map$1$2$1) continuation;
                    int i = subscribeNavSearchResultUseCase$getFuturesFlow$lambda$6$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeNavSearchResultUseCase$getFuturesFlow$lambda$6$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeNavSearchResultUseCase$getFuturesFlow$lambda$6$$inlined$map$1$2$1 = new SubscribeNavSearchResultUseCase$getFuturesFlow$lambda$6$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeNavSearchResultUseCase$getFuturesFlow$lambda$6$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeNavSearchResultUseCase$getFuturesFlow$lambda$6$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt((java.util.List) obj, this.copydefault);
                    subscribeNavSearchResultUseCase$getFuturesFlow$lambda$6$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(pairOLrzqt, subscribeNavSearchResultUseCase$getFuturesFlow$lambda$6$$inlined$map$1$2$1) == objCopydefault) {
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

        public StateListAnimator(Flow flow, C40239qOm.ActionBar.C0923ActionBar c0923ActionBar) {
            this.EZpvd = flow;
            this.AEQbTJ = c0923ActionBar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super kotlin.Pair<? extends java.util.List<? extends InterfaceC40237qOk>, ? extends C40239qOm.ActionBar.C0923ActionBar>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass2(flowCollector, this.AEQbTJ), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return OLrzqt((C40233qOg) obj, (Continuation<? super Flow<? extends kotlin.Pair<java.lang.String, ? extends java.util.List<? extends InterfaceC40237qOk>>>>) continuation);
    }

    @yCM
    public C40234qOh(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41603qtt c41603qtt, @NotNull C41546qsp c41546qsp, @NotNull C41508qsD c41508qsD, @NotNull C41499qrv c41499qrv, @NotNull C40235qOi c40235qOi) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41603qtt, "");
        Intrinsics.checkNotNullParameter(c41546qsp, "");
        Intrinsics.checkNotNullParameter(c41508qsD, "");
        Intrinsics.checkNotNullParameter(c41499qrv, "");
        Intrinsics.checkNotNullParameter(c40235qOi, "");
        this.EZpvd = coroutineDispatcher;
        this.AYXKKw = c41603qtt;
        this.AhwBna = c41546qsp;
        this.valueOf = c41508qsD;
        this.AEQbTJ = c41499qrv;
        this.KWHzl = c40235qOi;
    }

    /* JADX INFO: renamed from: o.qOh$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qOh.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [79=5] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0174 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0194 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object EZpvd(C40234qOh c40234qOh, C40233qOg c40233qOg, Continuation<? super Flow<? extends kotlin.Pair<java.lang.String, ? extends java.util.List<? extends InterfaceC40237qOk>>>> continuation) throws java.lang.Throwable {
        SubscribeNavSearchResultUseCase$onExecute$1 subscribeNavSearchResultUseCase$onExecute$1;
        Quartet<java.lang.String, java.util.List<InterfaceC41641que>, java.util.List<CategoryGroupVo>, java.util.List<ChargeGroupVo>> quartetComponent2;
        kotlin.Pair<java.lang.String, C41467qrP> pairComponent3;
        Triple<java.lang.String, java.util.List<DexChainGroupVo>, java.util.List<InterfaceC41655qus>> tripleComponent5;
        java.lang.Object objOLrzqt;
        Flow<C40244qOr> flow;
        java.lang.String str;
        Triple<java.lang.String, java.util.Map<OptionsCategoryGroupVo, java.util.Map<java.lang.String, java.util.List<InterfaceC41642quf>>>, java.lang.Integer> triple;
        C40234qOh c40234qOh2;
        Flow flow2;
        Quartet<java.lang.String, java.util.List<InterfaceC41641que>, java.util.List<CategoryGroupVo>, java.util.List<ChargeGroupVo>> quartet;
        java.lang.String str2;
        Triple<java.lang.String, java.util.List<DexChainGroupVo>, java.util.List<InterfaceC41655qus>> triple2;
        kotlin.Pair<java.lang.String, C41467qrP> pair;
        Flow<C40244qOr> flow3;
        java.lang.Object objEZpvd;
        C40234qOh c40234qOh3;
        Triple<java.lang.String, java.util.List<DexChainGroupVo>, java.util.List<InterfaceC41655qus>> triple3;
        Flow flow4;
        java.lang.Object objEZpvd2;
        Triple<java.lang.String, java.util.Map<OptionsCategoryGroupVo, java.util.Map<java.lang.String, java.util.List<InterfaceC41642quf>>>, java.lang.Integer> triple4;
        kotlin.Pair<java.lang.String, C41467qrP> pair2;
        Quartet<java.lang.String, java.util.List<InterfaceC41641que>, java.util.List<CategoryGroupVo>, java.util.List<ChargeGroupVo>> quartet2;
        Flow flow5;
        Flow flow6;
        if (continuation instanceof SubscribeNavSearchResultUseCase$onExecute$1) {
            subscribeNavSearchResultUseCase$onExecute$1 = (SubscribeNavSearchResultUseCase$onExecute$1) continuation;
            int i = subscribeNavSearchResultUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeNavSearchResultUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeNavSearchResultUseCase$onExecute$1 = new SubscribeNavSearchResultUseCase$onExecute$1(c40234qOh, continuation);
            }
        }
        java.lang.Object obj = subscribeNavSearchResultUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeNavSearchResultUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C40375qTn.AEQbTJ.copydefault("SubscribeNavSearchResultUseCase", "onExecute() start with input: " + c40233qOg);
            Quintet<java.lang.String, Quartet<java.lang.String, java.util.List<InterfaceC41641que>, java.util.List<CategoryGroupVo>, java.util.List<ChargeGroupVo>>, kotlin.Pair<java.lang.String, C41467qrP>, Triple<java.lang.String, java.util.Map<OptionsCategoryGroupVo, java.util.Map<java.lang.String, java.util.List<InterfaceC41642quf>>>, java.lang.Integer>, Triple<java.lang.String, java.util.List<DexChainGroupVo>, java.util.List<InterfaceC41655qus>>> quintetKWHzl = c40233qOg.KWHzl();
            Flow<C40244qOr> flowEZpvd = c40233qOg.EZpvd();
            java.lang.String strComponent1 = quintetKWHzl.component1();
            quartetComponent2 = quintetKWHzl.component2();
            pairComponent3 = quintetKWHzl.component3();
            Triple<java.lang.String, java.util.Map<OptionsCategoryGroupVo, java.util.Map<java.lang.String, java.util.List<InterfaceC41642quf>>>, java.lang.Integer> tripleComponent4 = quintetKWHzl.component4();
            tripleComponent5 = quintetKWHzl.component5();
            subscribeNavSearchResultUseCase$onExecute$1.L$0 = c40234qOh;
            subscribeNavSearchResultUseCase$onExecute$1.L$1 = flowEZpvd;
            subscribeNavSearchResultUseCase$onExecute$1.L$2 = strComponent1;
            subscribeNavSearchResultUseCase$onExecute$1.L$3 = quartetComponent2;
            subscribeNavSearchResultUseCase$onExecute$1.L$4 = pairComponent3;
            subscribeNavSearchResultUseCase$onExecute$1.L$5 = tripleComponent4;
            subscribeNavSearchResultUseCase$onExecute$1.L$6 = tripleComponent5;
            subscribeNavSearchResultUseCase$onExecute$1.label = 1;
            objOLrzqt = c40234qOh.OLrzqt(flowEZpvd, quartetComponent2, subscribeNavSearchResultUseCase$onExecute$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            flow = flowEZpvd;
            str = strComponent1;
            triple = tripleComponent4;
        } else if (i2 == 1) {
            Triple<java.lang.String, java.util.List<DexChainGroupVo>, java.util.List<InterfaceC41655qus>> triple5 = (Triple) subscribeNavSearchResultUseCase$onExecute$1.L$6;
            Triple<java.lang.String, java.util.Map<OptionsCategoryGroupVo, java.util.Map<java.lang.String, java.util.List<InterfaceC41642quf>>>, java.lang.Integer> triple6 = (Triple) subscribeNavSearchResultUseCase$onExecute$1.L$5;
            kotlin.Pair<java.lang.String, C41467qrP> pair3 = (kotlin.Pair) subscribeNavSearchResultUseCase$onExecute$1.L$4;
            Quartet<java.lang.String, java.util.List<InterfaceC41641que>, java.util.List<CategoryGroupVo>, java.util.List<ChargeGroupVo>> quartet3 = (Quartet) subscribeNavSearchResultUseCase$onExecute$1.L$3;
            java.lang.String str3 = (java.lang.String) subscribeNavSearchResultUseCase$onExecute$1.L$2;
            Flow<C40244qOr> flow7 = (Flow) subscribeNavSearchResultUseCase$onExecute$1.L$1;
            C40234qOh c40234qOh4 = (C40234qOh) subscribeNavSearchResultUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            tripleComponent5 = triple5;
            c40234qOh = c40234qOh4;
            flow = flow7;
            pairComponent3 = pair3;
            triple = triple6;
            str = str3;
            quartetComponent2 = quartet3;
            objOLrzqt = obj;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flow6 = (Flow) subscribeNavSearchResultUseCase$onExecute$1.L$7;
                    flow4 = (Flow) subscribeNavSearchResultUseCase$onExecute$1.L$6;
                    Flow flow8 = (Flow) subscribeNavSearchResultUseCase$onExecute$1.L$5;
                    Triple<java.lang.String, java.util.Map<OptionsCategoryGroupVo, java.util.Map<java.lang.String, java.util.List<InterfaceC41642quf>>>, java.lang.Integer> triple7 = (Triple) subscribeNavSearchResultUseCase$onExecute$1.L$4;
                    pair2 = (kotlin.Pair) subscribeNavSearchResultUseCase$onExecute$1.L$3;
                    Quartet<java.lang.String, java.util.List<InterfaceC41641que>, java.util.List<CategoryGroupVo>, java.util.List<ChargeGroupVo>> quartet4 = (Quartet) subscribeNavSearchResultUseCase$onExecute$1.L$2;
                    java.lang.String str4 = (java.lang.String) subscribeNavSearchResultUseCase$onExecute$1.L$1;
                    C40234qOh c40234qOh5 = (C40234qOh) subscribeNavSearchResultUseCase$onExecute$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    c40234qOh3 = c40234qOh5;
                    flow5 = flow8;
                    str2 = str4;
                    triple4 = triple7;
                    quartet2 = quartet4;
                    return FlowKt.flowOn(new FragmentManager(FlowKt.combine(flow5, flow4, flow6, (Flow) obj, new SubscribeNavSearchResultUseCase$onExecute$resultFlow$1(c40234qOh3, quartet2, pair2, triple4, null)), str2), c40234qOh3.AEQbTJ());
                }
                Flow flow9 = (Flow) subscribeNavSearchResultUseCase$onExecute$1.L$7;
                Flow flow10 = (Flow) subscribeNavSearchResultUseCase$onExecute$1.L$6;
                Triple<java.lang.String, java.util.List<DexChainGroupVo>, java.util.List<InterfaceC41655qus>> triple8 = (Triple) subscribeNavSearchResultUseCase$onExecute$1.L$5;
                Triple<java.lang.String, java.util.Map<OptionsCategoryGroupVo, java.util.Map<java.lang.String, java.util.List<InterfaceC41642quf>>>, java.lang.Integer> triple9 = (Triple) subscribeNavSearchResultUseCase$onExecute$1.L$4;
                pair = (kotlin.Pair) subscribeNavSearchResultUseCase$onExecute$1.L$3;
                quartet = (Quartet) subscribeNavSearchResultUseCase$onExecute$1.L$2;
                str2 = (java.lang.String) subscribeNavSearchResultUseCase$onExecute$1.L$1;
                c40234qOh3 = (C40234qOh) subscribeNavSearchResultUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(obj);
                flow4 = flow9;
                flow2 = flow10;
                triple3 = triple8;
                triple = triple9;
                Flow flow11 = (Flow) obj;
                subscribeNavSearchResultUseCase$onExecute$1.L$0 = c40234qOh3;
                subscribeNavSearchResultUseCase$onExecute$1.L$1 = str2;
                subscribeNavSearchResultUseCase$onExecute$1.L$2 = quartet;
                subscribeNavSearchResultUseCase$onExecute$1.L$3 = pair;
                subscribeNavSearchResultUseCase$onExecute$1.L$4 = triple;
                subscribeNavSearchResultUseCase$onExecute$1.L$5 = flow2;
                subscribeNavSearchResultUseCase$onExecute$1.L$6 = flow4;
                subscribeNavSearchResultUseCase$onExecute$1.L$7 = flow11;
                subscribeNavSearchResultUseCase$onExecute$1.label = 4;
                objEZpvd2 = c40234qOh3.EZpvd((Triple<java.lang.String, ? extends java.util.List<DexChainGroupVo>, ? extends java.util.List<? extends InterfaceC41655qus>>) triple3, (Continuation<? super Flow<? extends java.util.List<? extends InterfaceC40237qOk>>>) subscribeNavSearchResultUseCase$onExecute$1);
                if (objEZpvd2 != objCopydefault) {
                    return objCopydefault;
                }
                triple4 = triple;
                pair2 = pair;
                quartet2 = quartet;
                flow5 = flow2;
                flow6 = flow11;
                obj = objEZpvd2;
                return FlowKt.flowOn(new FragmentManager(FlowKt.combine(flow5, flow4, flow6, (Flow) obj, new SubscribeNavSearchResultUseCase$onExecute$resultFlow$1(c40234qOh3, quartet2, pair2, triple4, null)), str2), c40234qOh3.AEQbTJ());
            }
            flow2 = (Flow) subscribeNavSearchResultUseCase$onExecute$1.L$7;
            triple2 = (Triple) subscribeNavSearchResultUseCase$onExecute$1.L$6;
            triple = (Triple) subscribeNavSearchResultUseCase$onExecute$1.L$5;
            pair = (kotlin.Pair) subscribeNavSearchResultUseCase$onExecute$1.L$4;
            quartet = (Quartet) subscribeNavSearchResultUseCase$onExecute$1.L$3;
            str2 = (java.lang.String) subscribeNavSearchResultUseCase$onExecute$1.L$2;
            flow3 = (Flow) subscribeNavSearchResultUseCase$onExecute$1.L$1;
            c40234qOh2 = (C40234qOh) subscribeNavSearchResultUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            Flow flow12 = (Flow) obj;
            subscribeNavSearchResultUseCase$onExecute$1.L$0 = c40234qOh2;
            subscribeNavSearchResultUseCase$onExecute$1.L$1 = str2;
            subscribeNavSearchResultUseCase$onExecute$1.L$2 = quartet;
            subscribeNavSearchResultUseCase$onExecute$1.L$3 = pair;
            subscribeNavSearchResultUseCase$onExecute$1.L$4 = triple;
            subscribeNavSearchResultUseCase$onExecute$1.L$5 = triple2;
            subscribeNavSearchResultUseCase$onExecute$1.L$6 = flow2;
            subscribeNavSearchResultUseCase$onExecute$1.L$7 = flow12;
            subscribeNavSearchResultUseCase$onExecute$1.label = 3;
            objEZpvd = c40234qOh2.EZpvd(flow3, triple, subscribeNavSearchResultUseCase$onExecute$1);
            if (objEZpvd != objCopydefault) {
                return objCopydefault;
            }
            c40234qOh3 = c40234qOh2;
            triple3 = triple2;
            flow4 = flow12;
            obj = objEZpvd;
            Flow flow112 = (Flow) obj;
            subscribeNavSearchResultUseCase$onExecute$1.L$0 = c40234qOh3;
            subscribeNavSearchResultUseCase$onExecute$1.L$1 = str2;
            subscribeNavSearchResultUseCase$onExecute$1.L$2 = quartet;
            subscribeNavSearchResultUseCase$onExecute$1.L$3 = pair;
            subscribeNavSearchResultUseCase$onExecute$1.L$4 = triple;
            subscribeNavSearchResultUseCase$onExecute$1.L$5 = flow2;
            subscribeNavSearchResultUseCase$onExecute$1.L$6 = flow4;
            subscribeNavSearchResultUseCase$onExecute$1.L$7 = flow112;
            subscribeNavSearchResultUseCase$onExecute$1.label = 4;
            objEZpvd2 = c40234qOh3.EZpvd((Triple<java.lang.String, ? extends java.util.List<DexChainGroupVo>, ? extends java.util.List<? extends InterfaceC41655qus>>) triple3, (Continuation<? super Flow<? extends java.util.List<? extends InterfaceC40237qOk>>>) subscribeNavSearchResultUseCase$onExecute$1);
            if (objEZpvd2 != objCopydefault) {
            }
        }
        Flow flow13 = (Flow) objOLrzqt;
        subscribeNavSearchResultUseCase$onExecute$1.L$0 = c40234qOh;
        subscribeNavSearchResultUseCase$onExecute$1.L$1 = flow;
        subscribeNavSearchResultUseCase$onExecute$1.L$2 = str;
        subscribeNavSearchResultUseCase$onExecute$1.L$3 = quartetComponent2;
        subscribeNavSearchResultUseCase$onExecute$1.L$4 = pairComponent3;
        subscribeNavSearchResultUseCase$onExecute$1.L$5 = triple;
        subscribeNavSearchResultUseCase$onExecute$1.L$6 = tripleComponent5;
        subscribeNavSearchResultUseCase$onExecute$1.L$7 = flow13;
        subscribeNavSearchResultUseCase$onExecute$1.label = 2;
        java.lang.Object objEZpvd3 = c40234qOh.EZpvd(flow, pairComponent3, subscribeNavSearchResultUseCase$onExecute$1);
        if (objEZpvd3 == objCopydefault) {
            return objCopydefault;
        }
        Flow<C40244qOr> flow14 = flow;
        c40234qOh2 = c40234qOh;
        flow2 = flow13;
        quartet = quartetComponent2;
        str2 = str;
        triple2 = tripleComponent5;
        obj = objEZpvd3;
        pair = pairComponent3;
        flow3 = flow14;
        Flow flow122 = (Flow) obj;
        subscribeNavSearchResultUseCase$onExecute$1.L$0 = c40234qOh2;
        subscribeNavSearchResultUseCase$onExecute$1.L$1 = str2;
        subscribeNavSearchResultUseCase$onExecute$1.L$2 = quartet;
        subscribeNavSearchResultUseCase$onExecute$1.L$3 = pair;
        subscribeNavSearchResultUseCase$onExecute$1.L$4 = triple;
        subscribeNavSearchResultUseCase$onExecute$1.L$5 = triple2;
        subscribeNavSearchResultUseCase$onExecute$1.L$6 = flow2;
        subscribeNavSearchResultUseCase$onExecute$1.L$7 = flow122;
        subscribeNavSearchResultUseCase$onExecute$1.label = 3;
        objEZpvd = c40234qOh2.EZpvd(flow3, triple, subscribeNavSearchResultUseCase$onExecute$1);
        if (objEZpvd != objCopydefault) {
        }
    }

    public final java.lang.Object OLrzqt(Flow<C40244qOr> flow, Quartet<java.lang.String, ? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.List<CategoryGroupVo>, ? extends java.util.List<ChargeGroupVo>> quartet, Continuation<? super Flow<? extends kotlin.Pair<? extends java.util.List<? extends InterfaceC40237qOk>, java.lang.Boolean>>> continuation) {
        if (quartet == null) {
            return FlowKt.flowOf(C56390yDp.OLrzqt(yDY.AhwBna(), C56443yFo.KWHzl(false)));
        }
        Dialog dialog = new Dialog(flow);
        C40375qTn.AEQbTJ.copydefault("SubscribeNavSearchResultUseCase", "getSpotFlow() - spotConfigFlow: " + dialog + ", spotSearchResult: " + quartet);
        return FlowKt.transformLatest(dialog, new SubscribeNavSearchResultUseCase$getSpotFlow$$inlined$flatMapLatest$1(null, quartet, this));
    }

    public final java.lang.Object EZpvd(Flow<C40244qOr> flow, kotlin.Pair<java.lang.String, C41467qrP> pair, Continuation<? super Flow<? extends kotlin.Pair<? extends java.util.List<? extends InterfaceC40237qOk>, C40239qOm.ActionBar.C0923ActionBar>>> continuation) {
        if (pair == null) {
            return FlowKt.flowOf(C56390yDp.OLrzqt(yDY.AhwBna(), null));
        }
        Application application = new Application(flow);
        C40375qTn.AEQbTJ.copydefault("SubscribeNavSearchResultUseCase", "getFuturesFlow() - futuresConfigFlow: " + application + ", futuresSearchResult: " + pair);
        return FlowKt.transformLatest(application, new SubscribeNavSearchResultUseCase$getFuturesFlow$$inlined$flatMapLatest$1(null, pair, this));
    }

    public final java.lang.Object EZpvd(Flow<C40244qOr> flow, Triple<java.lang.String, ? extends java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>, java.lang.Integer> triple, Continuation<? super Flow<? extends kotlin.Pair<? extends java.util.List<? extends InterfaceC40237qOk>, C40239qOm.ActionBar.Application>>> continuation) {
        if (triple == null) {
            return FlowKt.flowOf(C56390yDp.OLrzqt(yDY.AhwBna(), null));
        }
        ActionBar actionBar = new ActionBar(flow);
        C40375qTn.AEQbTJ.copydefault("SubscribeNavSearchResultUseCase", "getOptionsFlow() - optionsConfigFlow: " + actionBar + ", searchOptionsResult: " + triple);
        return FlowKt.transformLatest(actionBar, new SubscribeNavSearchResultUseCase$getOptionsFlow$$inlined$flatMapLatest$1(null, triple, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(Triple<java.lang.String, ? extends java.util.List<DexChainGroupVo>, ? extends java.util.List<? extends InterfaceC41655qus>> triple, Continuation<? super Flow<? extends java.util.List<? extends InterfaceC40237qOk>>> continuation) throws java.lang.Throwable {
        SubscribeNavSearchResultUseCase$getDexFlow$1 subscribeNavSearchResultUseCase$getDexFlow$1;
        C40234qOh c40234qOh;
        if (continuation instanceof SubscribeNavSearchResultUseCase$getDexFlow$1) {
            subscribeNavSearchResultUseCase$getDexFlow$1 = (SubscribeNavSearchResultUseCase$getDexFlow$1) continuation;
            int i = subscribeNavSearchResultUseCase$getDexFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeNavSearchResultUseCase$getDexFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeNavSearchResultUseCase$getDexFlow$1 = new SubscribeNavSearchResultUseCase$getDexFlow$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = subscribeNavSearchResultUseCase$getDexFlow$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeNavSearchResultUseCase$getDexFlow$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            if (triple == null) {
                return FlowKt.flowOf(yDY.AhwBna());
            }
            C40375qTn.AEQbTJ.copydefault("SubscribeNavSearchResultUseCase", "getDexFlow() - dexSearchResult: " + triple);
            C41500qrw c41500qrw = new C41500qrw(triple.component1(), null, triple.component3(), DexChainGroupVo.Companion.copydefault(), DexPeriodEnum.ONE_DAY, C56390yDp.OLrzqt(DexSortByEnum.NONE, SortOrder.NONE), C40128qKj.Companion.OLrzqt(), false, 128, null);
            C41499qrv c41499qrv = this.AEQbTJ;
            subscribeNavSearchResultUseCase$getDexFlow$1.L$0 = this;
            subscribeNavSearchResultUseCase$getDexFlow$1.label = 1;
            objEZpvd = c41499qrv.EZpvd(c41500qrw, subscribeNavSearchResultUseCase$getDexFlow$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c40234qOh = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c40234qOh = (C40234qOh) subscribeNavSearchResultUseCase$getDexFlow$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        return c40234qOh.EZpvd((Flow) objEZpvd);
    }

    public final <T extends InterfaceC41645qui<T>> Flow<java.util.List<InterfaceC40237qOk>> EZpvd(Flow<? extends java.util.List<? extends T>> flow) {
        return new Fragment(flow);
    }
}
