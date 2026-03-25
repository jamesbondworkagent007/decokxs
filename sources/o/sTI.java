package o;

import androidx.camera.video.AudioStats;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.okinc.oklive.app.data.repository.remote.TradingCardPriceUpdateUseCaseProtocolImpl$canTrade$2;
import com.okinc.oklive.app.data.repository.remote.TradingCardPriceUpdateUseCaseProtocolImpl$convertTickerToTradingCard$1;
import com.okinc.oklive.app.data.repository.remote.TradingCardPriceUpdateUseCaseProtocolImpl$createChargeConvertor$1;
import com.okinc.oklive.app.data.repository.remote.TradingCardPriceUpdateUseCaseProtocolImpl$fetchInitialTickerData$1;
import com.okinc.oklive.app.data.repository.remote.TradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1;
import com.okinc.oklive.app.data.repository.remote.TradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$2;
import com.okinc.oklive.app.data.repository.remote.TradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$3;
import com.okinc.oklive.app.data.repository.remote.TradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$$inlined$map$1$2$1;
import com.okinc.oklive.app.data.repository.remote.TradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$1;
import com.okinc.oklive.app.data.repository.remote.TradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$3;
import com.okinc.oklive.app.domain.model.PriceChangeDirection;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class sTI implements sTG {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public boolean AEQbTJ;
    public Job AYXKKw;
    public final MutableStateFlow<sTV> EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public final CoroutineScope gEmmrt;
    public final StateFlow<sTV> valueOf;
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.sTH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return sTI.copydefault();
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.sTJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return sTI.AEQbTJ(this.OLrzqt);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sTG
    public StateFlow<sTV> OLrzqt() {
        return this.valueOf;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application implements Flow<sTV> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ sTI EZpvd;
        public final /* synthetic */ java.lang.String OLrzqt;

        /* JADX INFO: renamed from: o.sTI$Application$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;
            public final /* synthetic */ java.lang.String OLrzqt;
            public final /* synthetic */ sTI copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, sTI sti, java.lang.String str) {
                this.EZpvd = flowCollector;
                this.copydefault = sti;
                this.OLrzqt = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00ae A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Exception {
                TradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$$inlined$map$1$2$1 tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$$inlined$map$1$2$1;
                FlowCollector flowCollector;
                sTV stv;
                FlowCollector flowCollector2;
                if (continuation instanceof TradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$$inlined$map$1$2$1) {
                    tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$$inlined$map$1$2$1 = (TradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$$inlined$map$1$2$1) continuation;
                    int i = tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$$inlined$map$1$2$1 = new TradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    flowCollector = this.EZpvd;
                    java.util.List list = (java.util.List) obj;
                    if (!(!list.isEmpty())) {
                        stv = (sTV) this.copydefault.EZpvd.getValue();
                        if (stv == null) {
                            throw new java.lang.Exception("No ticker data available");
                        }
                        tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$$inlined$map$1$2$1.L$0 = null;
                        tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$$inlined$map$1$2$1.label = 2;
                        if (flowCollector.emit(stv, tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$$inlined$map$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                    TickersData tickersData = (TickersData) ((kotlin.Pair) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).component2();
                    sTI sti = this.copydefault;
                    java.lang.String str = this.OLrzqt;
                    tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$$inlined$map$1$2$1.L$0 = flowCollector;
                    tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$$inlined$map$1$2$1.label = 1;
                    java.lang.Object objAEQbTJ = sti.AEQbTJ(tickersData, str, tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$$inlined$map$1$2$1);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    obj2 = objAEQbTJ;
                    flowCollector2 = flowCollector;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                        return Unit.INSTANCE;
                    }
                    flowCollector2 = (FlowCollector) tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$$inlined$map$1$2$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                }
                sTV stv2 = (sTV) obj2;
                pUU.EZpvd("TradingCardPriceUpdate", "Received ticker update: price=" + stv2.AEQbTJ() + ", change=" + stv2.KWHzl());
                flowCollector = flowCollector2;
                stv = stv2;
                tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$$inlined$map$1$2$1.L$0 = null;
                tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$$inlined$map$1$2$1.label = 2;
                if (flowCollector.emit(stv, tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$$inlined$map$1$2$1) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
        }

        public Application(Flow flow, sTI sti, java.lang.String str) {
            this.AEQbTJ = flow;
            this.EZpvd = sti;
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super sTV> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass4(flowCollector, this.EZpvd, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @yCM
    public sTI() {
        MutableStateFlow<sTV> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
        this.gEmmrt = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null)));
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sTI.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final qTB valueOf() {
        return (qTB) this.AhwBna.getValue();
    }

    public static final qTB copydefault() {
        return (qTB) C43251rlk.OLrzqt(qTB.class);
    }

    public final InterfaceC43032rhd EZpvd() {
        return (InterfaceC43032rhd) this.djBIcL.getValue();
    }

    public static final InterfaceC43032rhd AEQbTJ(sTI sti) {
        qTB qtbValueOf = sti.valueOf();
        if (qtbValueOf != null) {
            return qtbValueOf.OLrzqt();
        }
        return null;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:26:0x006f */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: o.sTI */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0141 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0146 A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:14:0x0037, B:64:0x0142, B:66:0x0146, B:67:0x0175, B:61:0x0133, B:53:0x010e, B:55:0x011a, B:58:0x0124), top: B:77:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0175 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #1 {all -> 0x003c, blocks: (B:14:0x0037, B:64:0x0142, B:66:0x0146, B:67:0x0175, B:61:0x0133, B:53:0x010e, B:55:0x011a, B:58:0x0124), top: B:77:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    @Override // o.sTG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        TradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1 tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1;
        sTI sti;
        java.lang.String str3;
        sTI sti2;
        Flow flow;
        Job job;
        if (continuation instanceof TradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1) {
            tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1 = (TradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1) continuation;
            int i = tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1.label = i - Integer.MIN_VALUE;
            } else {
                tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1 = new TradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        sTI sti3 = tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1.label;
        try {
            if (sti3 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                if (Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) str) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) str2) && (job = this.AYXKKw) != null && job.isActive()) {
                    pUU.EZpvd("TradingCardPriceUpdate", "Already monitoring instId: " + str + ", skipping restart");
                    return Unit.INSTANCE;
                }
                if (this.AEQbTJ) {
                    pUU.valueOf("TradingCardPriceUpdate", "⚠️ startMonitoring already in progress for " + this.KWHzl + ", ignoring new call for " + str);
                    return Unit.INSTANCE;
                }
                try {
                    this.AEQbTJ = true;
                    pUU.EZpvd("TradingCardPriceUpdate", "Starting monitoring for instId: " + str + ", bizType: " + str2);
                    Job job2 = this.AYXKKw;
                    if (job2 != null) {
                        Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (java.lang.Object) null);
                    }
                    Job job3 = this.AYXKKw;
                    if (job3 != null) {
                        tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1.L$0 = this;
                        tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1.L$1 = str;
                        tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1.L$2 = str2;
                        tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1.label = 1;
                        if (job3.join(tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        sti = this;
                        str3 = str2;
                        sti2 = sti;
                    } else {
                        str3 = str2;
                        sti2 = this;
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    sti3 = this;
                    sti3.AEQbTJ = false;
                    throw th;
                }
            } else {
                try {
                    if (sti3 != 1) {
                        if (sti3 != 2) {
                            if (sti3 != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str = (java.lang.String) tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1.L$1;
                            sti2 = (sTI) tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1.L$0;
                            C56391yDq.AEQbTJ(objAEQbTJ);
                            flow = (Flow) objAEQbTJ;
                            if (flow != null) {
                                sti2.AYXKKw = FlowKt.launchIn(FlowKt.m7441catch(FlowKt.onEach(flow, new TradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$2(str, sti2, null)), new TradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$3(str, null)), sti2.gEmmrt);
                                pUU.EZpvd("TradingCardPriceUpdate", "✅ Successfully started monitoring for " + str);
                            } else {
                                pUU.copydefault("TradingCardPriceUpdate", "Failed to start ticker subscription for " + str);
                            }
                            sti2.AEQbTJ = false;
                            return Unit.INSTANCE;
                        }
                        java.lang.String str4 = (java.lang.String) tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1.L$2;
                        java.lang.String str5 = (java.lang.String) tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1.L$1;
                        sTI sti4 = (sTI) tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1.L$0;
                        C56391yDq.AEQbTJ(objAEQbTJ);
                        str3 = str4;
                        str = str5;
                        sti2 = sti4;
                        tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1.L$0 = sti2;
                        tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1.L$1 = str;
                        tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1.L$2 = null;
                        tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1.label = 3;
                        objAEQbTJ = sti2.AEQbTJ(str, str3, tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1);
                        if (objAEQbTJ == objCopydefault) {
                            return objCopydefault;
                        }
                        flow = (Flow) objAEQbTJ;
                        if (flow != null) {
                        }
                        sti2.AEQbTJ = false;
                        return Unit.INSTANCE;
                    }
                    java.lang.String str6 = (java.lang.String) tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1.L$2;
                    java.lang.String str7 = (java.lang.String) tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1.L$1;
                    sti = (sTI) tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1.L$0;
                    C56391yDq.AEQbTJ(objAEQbTJ);
                    str2 = str6;
                    str = str7;
                    str3 = str2;
                    sti2 = sti;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    sti3.AEQbTJ = false;
                    throw th;
                }
            }
            sti2.AYXKKw = null;
            sti2.KWHzl = str;
            sti2.OLrzqt = str3;
            if (sti2.EZpvd() == null) {
                pUU.copydefault("TradingCardPriceUpdate", "MarketDataApiService not available");
                Unit unit = Unit.INSTANCE;
                sti2.AEQbTJ = false;
                return unit;
            }
            tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1.L$0 = sti2;
            tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1.L$1 = str;
            tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1.L$2 = str3;
            tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1.label = 2;
            if (sti2.OLrzqt(str, str3, tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1) == objCopydefault) {
                return objCopydefault;
            }
            tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1.L$0 = sti2;
            tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1.L$1 = str;
            tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1.L$2 = null;
            tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1.label = 3;
            objAEQbTJ = sti2.AEQbTJ(str, str3, tradingCardPriceUpdateUseCaseProtocolImpl$startMonitoring$1);
            if (objAEQbTJ == objCopydefault) {
            }
            flow = (Flow) objAEQbTJ;
            if (flow != null) {
            }
            sti2.AEQbTJ = false;
            return Unit.INSTANCE;
        } catch (java.lang.Throwable th3) {
            th = th3;
            sti3 = str2;
        }
    }

    @Override // o.sTG
    public void AEQbTJ() {
        pUU.EZpvd("TradingCardPriceUpdate", "Stopping monitoring for instId: " + this.KWHzl);
        java.lang.String str = this.KWHzl;
        Job job = this.AYXKKw;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.AYXKKw = null;
        this.KWHzl = null;
        this.OLrzqt = null;
        this.AEQbTJ = false;
        this.EZpvd.setValue(null);
        pUU.EZpvd("TradingCardPriceUpdate", "✅ Stopped monitoring for instId: " + str);
    }

    @Override // o.sTG
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new TradingCardPriceUpdateUseCaseProtocolImpl$canTrade$2(str, str2, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.lang.String str, java.lang.String str2, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        TradingCardPriceUpdateUseCaseProtocolImpl$fetchInitialTickerData$1 tradingCardPriceUpdateUseCaseProtocolImpl$fetchInitialTickerData$1;
        java.lang.String str3;
        java.util.List list;
        sTI sti;
        sTI sti2;
        if (continuation instanceof TradingCardPriceUpdateUseCaseProtocolImpl$fetchInitialTickerData$1) {
            tradingCardPriceUpdateUseCaseProtocolImpl$fetchInitialTickerData$1 = (TradingCardPriceUpdateUseCaseProtocolImpl$fetchInitialTickerData$1) continuation;
            int i = tradingCardPriceUpdateUseCaseProtocolImpl$fetchInitialTickerData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tradingCardPriceUpdateUseCaseProtocolImpl$fetchInitialTickerData$1.label = i - Integer.MIN_VALUE;
            } else {
                tradingCardPriceUpdateUseCaseProtocolImpl$fetchInitialTickerData$1 = new TradingCardPriceUpdateUseCaseProtocolImpl$fetchInitialTickerData$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = tradingCardPriceUpdateUseCaseProtocolImpl$fetchInitialTickerData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tradingCardPriceUpdateUseCaseProtocolImpl$fetchInitialTickerData$1.label;
        try {
        } catch (java.lang.Exception e) {
            e = e;
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            pUU.EZpvd("TradingCardPriceUpdate", "Fetching initial ticker data for: " + str);
            InterfaceC43032rhd interfaceC43032rhdEZpvd = EZpvd();
            if (interfaceC43032rhdEZpvd != null) {
                LifecycleOwner lifecycleOwner = ProcessLifecycleOwner.Companion.get();
                java.util.List<java.lang.String> listEZpvd = C56402yEa.EZpvd(str);
                tradingCardPriceUpdateUseCaseProtocolImpl$fetchInitialTickerData$1.L$0 = this;
                tradingCardPriceUpdateUseCaseProtocolImpl$fetchInitialTickerData$1.L$1 = str;
                tradingCardPriceUpdateUseCaseProtocolImpl$fetchInitialTickerData$1.L$2 = str2;
                tradingCardPriceUpdateUseCaseProtocolImpl$fetchInitialTickerData$1.label = 1;
                objAEQbTJ = interfaceC43032rhdEZpvd.AEQbTJ(lifecycleOwner, listEZpvd, false, tradingCardPriceUpdateUseCaseProtocolImpl$fetchInitialTickerData$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                sti2 = this;
            } else {
                str3 = str2;
                list = null;
                sti = this;
                if (list != null && !list.isEmpty()) {
                    TickersData tickersData = (TickersData) ((kotlin.Pair) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).component2();
                    tradingCardPriceUpdateUseCaseProtocolImpl$fetchInitialTickerData$1.L$0 = sti;
                    tradingCardPriceUpdateUseCaseProtocolImpl$fetchInitialTickerData$1.L$1 = str;
                    tradingCardPriceUpdateUseCaseProtocolImpl$fetchInitialTickerData$1.L$2 = null;
                    tradingCardPriceUpdateUseCaseProtocolImpl$fetchInitialTickerData$1.label = 2;
                    objAEQbTJ = sti.AEQbTJ(tickersData, str3, tradingCardPriceUpdateUseCaseProtocolImpl$fetchInitialTickerData$1);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    sTV stv = (sTV) objAEQbTJ;
                    sti.EZpvd.setValue(stv);
                    pUU.EZpvd("TradingCardPriceUpdate", "Initial ticker data loaded: price=" + stv.AEQbTJ());
                    return Unit.INSTANCE;
                }
                pUU.valueOf("TradingCardPriceUpdate", "No initial ticker data found for: " + str);
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sti = (sTI) tradingCardPriceUpdateUseCaseProtocolImpl$fetchInitialTickerData$1.L$0;
                C56391yDq.AEQbTJ(objAEQbTJ);
                sTV stv2 = (sTV) objAEQbTJ;
                sti.EZpvd.setValue(stv2);
                pUU.EZpvd("TradingCardPriceUpdate", "Initial ticker data loaded: price=" + stv2.AEQbTJ());
                return Unit.INSTANCE;
            }
            java.lang.String str4 = (java.lang.String) tradingCardPriceUpdateUseCaseProtocolImpl$fetchInitialTickerData$1.L$2;
            java.lang.String str5 = (java.lang.String) tradingCardPriceUpdateUseCaseProtocolImpl$fetchInitialTickerData$1.L$1;
            sti2 = (sTI) tradingCardPriceUpdateUseCaseProtocolImpl$fetchInitialTickerData$1.L$0;
            try {
                C56391yDq.AEQbTJ(objAEQbTJ);
                str2 = str4;
                str = str5;
            } catch (java.lang.Exception e2) {
                e = e2;
                str = str5;
                pUU.AEQbTJ("TradingCardPriceUpdate", "Error fetching initial ticker data for " + str, e);
            }
        }
        java.util.List list2 = (java.util.List) objAEQbTJ;
        str3 = str2;
        sti = sti2;
        list = list2;
        if (list != null) {
            TickersData tickersData2 = (TickersData) ((kotlin.Pair) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).component2();
            tradingCardPriceUpdateUseCaseProtocolImpl$fetchInitialTickerData$1.L$0 = sti;
            tradingCardPriceUpdateUseCaseProtocolImpl$fetchInitialTickerData$1.L$1 = str;
            tradingCardPriceUpdateUseCaseProtocolImpl$fetchInitialTickerData$1.L$2 = null;
            tradingCardPriceUpdateUseCaseProtocolImpl$fetchInitialTickerData$1.label = 2;
            objAEQbTJ = sti.AEQbTJ(tickersData2, str3, tradingCardPriceUpdateUseCaseProtocolImpl$fetchInitialTickerData$1);
            if (objAEQbTJ == objCopydefault) {
            }
            sTV stv22 = (sTV) objAEQbTJ;
            sti.EZpvd.setValue(stv22);
            pUU.EZpvd("TradingCardPriceUpdate", "Initial ticker data loaded: price=" + stv22.AEQbTJ());
            return Unit.INSTANCE;
        }
        pUU.valueOf("TradingCardPriceUpdate", "No initial ticker data found for: " + str);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(java.lang.String str, java.lang.String str2, Continuation<? super Flow<sTV>> continuation) throws java.lang.Throwable {
        TradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$1 tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$1;
        sTI sti;
        Flow flow;
        if (continuation instanceof TradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$1) {
            tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$1 = (TradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$1) continuation;
            int i = tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$1.label = i - Integer.MIN_VALUE;
            } else {
                tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$1 = new TradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            pUU.EZpvd("TradingCardPriceUpdate", "Subscribing to ticker updates for: " + str);
            InterfaceC43032rhd interfaceC43032rhdEZpvd = EZpvd();
            if (interfaceC43032rhdEZpvd == null) {
                sti = this;
                flow = null;
                if (flow == null) {
                    return FlowKt.m7441catch(new Application(flow, sti, str2), new TradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$3(str, sti, null));
                }
                return null;
            }
            LifecycleOwner lifecycleOwner = ProcessLifecycleOwner.Companion.get();
            java.util.List<java.lang.String> listEZpvd = C56402yEa.EZpvd(str);
            tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$1.L$0 = this;
            tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$1.L$1 = str;
            tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$1.L$2 = str2;
            tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$1.label = 1;
            objOLrzqt = interfaceC43032rhdEZpvd.OLrzqt(lifecycleOwner, listEZpvd, false, tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            sti = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (java.lang.String) tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$1.L$2;
            str = (java.lang.String) tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$1.L$1;
            sti = (sTI) tradingCardPriceUpdateUseCaseProtocolImpl$subscribeToTickerUpdates$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        flow = (Flow) objOLrzqt;
        if (flow == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(TickersData tickersData, java.lang.String str, Continuation<? super sTV> continuation) throws java.lang.Throwable {
        TradingCardPriceUpdateUseCaseProtocolImpl$convertTickerToTradingCard$1 tradingCardPriceUpdateUseCaseProtocolImpl$convertTickerToTradingCard$1;
        PriceChangeDirection priceChangeDirection;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLAEQbTJ;
        java.lang.String safeString$default;
        if (continuation instanceof TradingCardPriceUpdateUseCaseProtocolImpl$convertTickerToTradingCard$1) {
            tradingCardPriceUpdateUseCaseProtocolImpl$convertTickerToTradingCard$1 = (TradingCardPriceUpdateUseCaseProtocolImpl$convertTickerToTradingCard$1) continuation;
            int i = tradingCardPriceUpdateUseCaseProtocolImpl$convertTickerToTradingCard$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tradingCardPriceUpdateUseCaseProtocolImpl$convertTickerToTradingCard$1.label = i - Integer.MIN_VALUE;
            } else {
                tradingCardPriceUpdateUseCaseProtocolImpl$convertTickerToTradingCard$1 = new TradingCardPriceUpdateUseCaseProtocolImpl$convertTickerToTradingCard$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = tradingCardPriceUpdateUseCaseProtocolImpl$convertTickerToTradingCard$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tradingCardPriceUpdateUseCaseProtocolImpl$convertTickerToTradingCard$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            java.lang.String instId = tickersData.getInstId();
            tradingCardPriceUpdateUseCaseProtocolImpl$convertTickerToTradingCard$1.L$0 = tickersData;
            tradingCardPriceUpdateUseCaseProtocolImpl$convertTickerToTradingCard$1.label = 1;
            objEZpvd = EZpvd(instId, str, tradingCardPriceUpdateUseCaseProtocolImpl$convertTickerToTradingCard$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tickersData = (TickersData) tradingCardPriceUpdateUseCaseProtocolImpl$convertTickerToTradingCard$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        xMS xms = (xMS) objEZpvd;
        java.lang.String localizedWithMinPrecision$default = null;
        if (xms != null && (c54536xMLAYXKKw = xms.AYXKKw(tickersData.getLast())) != null && (c54536xMLAEQbTJ = c54536xMLAYXKKw.AEQbTJ(true)) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLAEQbTJ, false, 1, null)) != null) {
            localizedWithMinPrecision$default = pTB.formatLocalizedWithMinPrecision$default(safeString$default, 1, null, 2, null);
        }
        kotlin.Pair<java.lang.Double, java.lang.String> pairAEQbTJ = C54789xVj.EZpvd.AEQbTJ(tickersData.getLast(), tickersData.getOpen24h(), tickersData.getSodUtc0(), tickersData.getSodUtc8());
        java.lang.String second = pairAEQbTJ.getSecond();
        if (pairAEQbTJ.getFirst().doubleValue() > AudioStats.AUDIO_AMPLITUDE_NONE) {
            priceChangeDirection = PriceChangeDirection.Positive;
        } else {
            priceChangeDirection = pairAEQbTJ.getFirst().doubleValue() < AudioStats.AUDIO_AMPLITUDE_NONE ? PriceChangeDirection.Negative : PriceChangeDirection.Zero;
        }
        return new sTV(localizedWithMinPrecision$default, second, priceChangeDirection);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.lang.String str, java.lang.String str2, Continuation<? super xMS> continuation) throws java.lang.Throwable {
        TradingCardPriceUpdateUseCaseProtocolImpl$createChargeConvertor$1 tradingCardPriceUpdateUseCaseProtocolImpl$createChargeConvertor$1;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.lang.String str3;
        java.lang.Object obj;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        InterfaceC54581xNr interfaceC54581xNr;
        java.lang.String instFamily;
        BizInstrument suggestedInstrument$default;
        java.lang.String str4 = str2;
        if (continuation instanceof TradingCardPriceUpdateUseCaseProtocolImpl$createChargeConvertor$1) {
            tradingCardPriceUpdateUseCaseProtocolImpl$createChargeConvertor$1 = (TradingCardPriceUpdateUseCaseProtocolImpl$createChargeConvertor$1) continuation;
            int i = tradingCardPriceUpdateUseCaseProtocolImpl$createChargeConvertor$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tradingCardPriceUpdateUseCaseProtocolImpl$createChargeConvertor$1.label = i - Integer.MIN_VALUE;
            } else {
                tradingCardPriceUpdateUseCaseProtocolImpl$createChargeConvertor$1 = new TradingCardPriceUpdateUseCaseProtocolImpl$createChargeConvertor$1(this, continuation);
            }
        }
        java.lang.Object obj2 = tradingCardPriceUpdateUseCaseProtocolImpl$createChargeConvertor$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tradingCardPriceUpdateUseCaseProtocolImpl$createChargeConvertor$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj2);
                interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                if (interfaceC54581xNrOLrzqt != null) {
                    tradingCardPriceUpdateUseCaseProtocolImpl$createChargeConvertor$1.L$0 = str;
                    tradingCardPriceUpdateUseCaseProtocolImpl$createChargeConvertor$1.L$1 = str4;
                    tradingCardPriceUpdateUseCaseProtocolImpl$createChargeConvertor$1.L$2 = interfaceC54581xNrOLrzqt;
                    tradingCardPriceUpdateUseCaseProtocolImpl$createChargeConvertor$1.label = 1;
                    java.lang.Object objEZpvd = interfaceC54581xNrOLrzqt.EZpvd(str4, tradingCardPriceUpdateUseCaseProtocolImpl$createChargeConvertor$1);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    obj = objEZpvd;
                    str3 = str;
                } else {
                    str3 = str;
                    abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt == null ? interfaceC54581xNrOLrzqt.OLrzqt(str4) : null;
                    if (abstractC54531xLwOLrzqt == null) {
                        return null;
                    }
                    java.lang.String str5 = str4;
                    interfaceC54581xNr = interfaceC54581xNrOLrzqt;
                    if (interfaceC54581xNr != null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNr, str5, str3, null, null, 12, null)) == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
                        instFamily = "";
                    }
                    return abstractC54531xLwOLrzqt.gEmmrt(instFamily);
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC54581xNr interfaceC54581xNr2 = (InterfaceC54581xNr) tradingCardPriceUpdateUseCaseProtocolImpl$createChargeConvertor$1.L$2;
                java.lang.String str6 = (java.lang.String) tradingCardPriceUpdateUseCaseProtocolImpl$createChargeConvertor$1.L$1;
                str3 = (java.lang.String) tradingCardPriceUpdateUseCaseProtocolImpl$createChargeConvertor$1.L$0;
                C56391yDq.AEQbTJ(obj2);
                interfaceC54581xNrOLrzqt = interfaceC54581xNr2;
                str4 = str6;
                obj = obj2;
            }
            return abstractC54531xLwOLrzqt.gEmmrt(instFamily);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("TradingCardPriceUpdate", "Failed to create charge converter for instId: " + str3, e);
            return null;
        }
        abstractC54531xLwOLrzqt = (AbstractC54531xLw) obj;
        if (abstractC54531xLwOLrzqt == null) {
            if (interfaceC54581xNrOLrzqt == null) {
            }
            if (abstractC54531xLwOLrzqt == null) {
            }
        }
        java.lang.String str52 = str4;
        interfaceC54581xNr = interfaceC54581xNrOLrzqt;
        if (interfaceC54581xNr != null) {
            instFamily = "";
        }
    }
}
