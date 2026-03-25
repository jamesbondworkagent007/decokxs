package o;

import com.okinc.dexkline.market.features.filter.domain.PriceRangeFilter;
import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import com.okinc.dexkline.market.features.history.domian.TrxHistoryUseCase$checkForTimeFormat$1;
import com.okinc.dexkline.market.features.history.domian.TrxHistoryUseCase$getTimeDisplay$1;
import com.okinc.dexkline.market.features.history.domian.TrxHistoryUseCase$getTimeDisplayIoAF18A$$inlined$dexRunCatching$1;
import com.okinc.dexkline.market.features.history.domian.TrxHistoryUseCase$invoke$1;
import com.okinc.dexkline.market.features.history.domian.TrxHistoryUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1;
import com.okinc.dexkline.market.features.history.domian.TrxHistoryUseCase$loadPriceRangeOptions$1;
import com.okinc.dexkline.market.features.history.domian.TrxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1;
import com.okinc.dexkline.market.features.history.domian.TrxHistoryUseCase$toggleDisplayDateTimeFormat$1;
import com.okinc.dexkline.market.features.history.domian.TrxHistoryUseCase$updateTimeDisplay$$inlined$dexRunCatching$1;
import com.okinc.dexkline.market.features.history.domian.TrxHistoryUseCase$updateTimeDisplay$1;
import com.okinc.dexkline.market.features.history.domian.models.HistoryChange;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mZw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C32380mZw {
    public final C32378mZu AEQbTJ;
    public final C32377mZt AhwBna;
    public final MutableStateFlow<java.util.List<C34371nan>> EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final StateFlow<java.util.List<C34371nan>> OLrzqt;
    public final C32381mZx copydefault;
    public final CoroutineScope valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.util.List<C34371nan>> AEQbTJ() {
        return this.OLrzqt;
    }

    @yCM
    public C32380mZw(@NotNull C32377mZt c32377mZt, @NotNull C32378mZu c32378mZu, @NotNull C32381mZx c32381mZx, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c32377mZt, "");
        Intrinsics.checkNotNullParameter(c32378mZu, "");
        Intrinsics.checkNotNullParameter(c32381mZx, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AhwBna = c32377mZt;
        this.AEQbTJ = c32378mZu;
        this.copydefault = c32381mZx;
        this.KWHzl = coroutineDispatcher;
        MutableStateFlow<java.util.List<C34371nan>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = MutableStateFlow;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow);
        this.valueOf = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
    }

    /* JADX INFO: renamed from: invoke-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8689invokeBWLJW6A$default(C32380mZw c32380mZw, java.lang.String str, TokenFilter tokenFilter, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return c32380mZw.AEQbTJ(str, tokenFilter, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull TokenFilter tokenFilter, boolean z, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) {
        TrxHistoryUseCase$invoke$1 trxHistoryUseCase$invoke$1;
        if (continuation instanceof TrxHistoryUseCase$invoke$1) {
            trxHistoryUseCase$invoke$1 = (TrxHistoryUseCase$invoke$1) continuation;
            int i = trxHistoryUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trxHistoryUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                trxHistoryUseCase$invoke$1 = new TrxHistoryUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = trxHistoryUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trxHistoryUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            TrxHistoryUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 trxHistoryUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 = new TrxHistoryUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(null, str, this, tokenFilter, z);
            trxHistoryUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, trxHistoryUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1, trxHistoryUseCase$invoke$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX INFO: renamed from: o.mZw$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity implements Flow<C34371nan> {
        public final /* synthetic */ C32380mZw AEQbTJ;
        public final /* synthetic */ Flow KWHzl;
        public final /* synthetic */ boolean copydefault;

        /* JADX INFO: renamed from: o.mZw$Activity$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ C32380mZw KWHzl;
            public final /* synthetic */ boolean OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, boolean z, C32380mZw c32380mZw) {
                this.AEQbTJ = flowCollector;
                this.OLrzqt = z;
                this.KWHzl = c32380mZw;
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x009b A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                TrxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1 trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1;
                FlowCollector flowCollector;
                C34371nan c34371nan;
                FlowCollector flowCollector2;
                java.lang.Object objM7386unboximpl;
                C34371nan c34371nan2;
                if (continuation instanceof TrxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1) {
                    trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1 = (TrxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1) continuation;
                    int i = trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1 = new TrxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    flowCollector = this.AEQbTJ;
                    HistoryChange historyChange = (HistoryChange) obj;
                    if (historyChange == null) {
                        c34371nan = null;
                        trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1.L$0 = null;
                        trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1.label = 3;
                        if (flowCollector.emit(c34371nan, trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                    if (this.OLrzqt) {
                        C32377mZt c32377mZt = this.KWHzl.AhwBna;
                        trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1.L$0 = flowCollector;
                        trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1.label = 1;
                        java.lang.Object objAEQbTJ = c32377mZt.AEQbTJ(historyChange, trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1);
                        if (objAEQbTJ == objCopydefault) {
                            return objCopydefault;
                        }
                        objM7386unboximpl = objAEQbTJ;
                        flowCollector2 = flowCollector;
                        if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                        }
                        c34371nan2 = (C34371nan) objM7386unboximpl;
                    } else {
                        C32380mZw c32380mZw = this.KWHzl;
                        trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1.L$0 = flowCollector;
                        trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1.label = 2;
                        java.lang.Object objOLrzqt = c32380mZw.OLrzqt(historyChange, trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1);
                        if (objOLrzqt == objCopydefault) {
                            return objCopydefault;
                        }
                        obj2 = objOLrzqt;
                        flowCollector2 = flowCollector;
                        c34371nan2 = (C34371nan) obj2;
                    }
                } else if (i2 == 1) {
                    flowCollector2 = (FlowCollector) trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    objM7386unboximpl = ((Result) obj2).m7386unboximpl();
                    if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                        objM7386unboximpl = null;
                    }
                    c34371nan2 = (C34371nan) objM7386unboximpl;
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                        return Unit.INSTANCE;
                    }
                    flowCollector2 = (FlowCollector) trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    c34371nan2 = (C34371nan) obj2;
                }
                C34371nan c34371nan3 = c34371nan2;
                flowCollector = flowCollector2;
                c34371nan = c34371nan3;
                trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1.L$0 = null;
                trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1.label = 3;
                if (flowCollector.emit(c34371nan, trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
        }

        public Activity(Flow flow, boolean z, C32380mZw c32380mZw) {
            this.KWHzl = flow;
            this.copydefault = z;
            this.AEQbTJ = c32380mZw;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super C34371nan> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass4(flowCollector, this.copydefault, this.AEQbTJ), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Flow subscribeWs$default(C32380mZw c32380mZw, TokenFilter tokenFilter, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            str = "dex-market-trade-history";
        }
        return c32380mZw.OLrzqt(tokenFilter, z, str);
    }

    public final Flow<C34371nan> OLrzqt(@NotNull TokenFilter tokenFilter, boolean z, @NotNull java.lang.String str) {
        Flow<HistoryChange> flowKWHzl;
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd();
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "dex-market-trade-history-pub")) {
            flowKWHzl = this.AEQbTJ.OLrzqt(tokenFilter);
        } else {
            flowKWHzl = this.AEQbTJ.KWHzl(tokenFilter);
        }
        return new Activity(flowKWHzl, z, this);
    }

    public final void EZpvd() {
        JobKt__JobKt.cancelChildren$default(this.valueOf.getCoroutineContext(), (CancellationException) null, 1, (java.lang.Object) null);
        this.AEQbTJ.AEQbTJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull HistoryChange historyChange, @NotNull Continuation<? super C34371nan> continuation) throws java.lang.Throwable {
        TrxHistoryUseCase$checkForTimeFormat$1 trxHistoryUseCase$checkForTimeFormat$1;
        java.lang.Object objAEQbTJ;
        C32380mZw c32380mZw;
        C34371nan c34371nan;
        java.lang.Object objM7386unboximpl;
        if (continuation instanceof TrxHistoryUseCase$checkForTimeFormat$1) {
            trxHistoryUseCase$checkForTimeFormat$1 = (TrxHistoryUseCase$checkForTimeFormat$1) continuation;
            int i = trxHistoryUseCase$checkForTimeFormat$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trxHistoryUseCase$checkForTimeFormat$1.label = i - Integer.MIN_VALUE;
            } else {
                trxHistoryUseCase$checkForTimeFormat$1 = new TrxHistoryUseCase$checkForTimeFormat$1(this, continuation);
            }
        }
        java.lang.Object obj = trxHistoryUseCase$checkForTimeFormat$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trxHistoryUseCase$checkForTimeFormat$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C32377mZt c32377mZt = this.AhwBna;
            trxHistoryUseCase$checkForTimeFormat$1.L$0 = this;
            trxHistoryUseCase$checkForTimeFormat$1.label = 1;
            objAEQbTJ = c32377mZt.AEQbTJ(historyChange, trxHistoryUseCase$checkForTimeFormat$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c32380mZw = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C34371nan c34371nan2 = (C34371nan) trxHistoryUseCase$checkForTimeFormat$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                c34371nan = c34371nan2;
                java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(false);
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                    objM7386unboximpl = boolKWHzl;
                }
                boolean zBooleanValue = ((java.lang.Boolean) objM7386unboximpl).booleanValue();
                if (c34371nan == null) {
                    return c34371nan.EZpvd((6143 & 1) != 0 ? c34371nan.AEQbTJ : null, (6143 & 2) != 0 ? c34371nan.valueOf : null, (6143 & 4) != 0 ? c34371nan.KWHzl : null, (6143 & 8) != 0 ? c34371nan.djBIcL : null, (6143 & 16) != 0 ? c34371nan.fetchVPNInfo : null, (6143 & 32) != 0 ? c34371nan.values : null, (6143 & 64) != 0 ? c34371nan.copydefault : null, (6143 & 128) != 0 ? c34371nan.OLrzqt : null, (6143 & 256) != 0 ? c34371nan.AYXKKw : null, (6143 & 512) != 0 ? c34371nan.DbNXlk : null, (6143 & 1024) != 0 ? c34371nan.EZpvd : null, (6143 & 2048) != 0 ? c34371nan.AhwBna : zBooleanValue, (6143 & 4096) != 0 ? c34371nan.gEmmrt : null);
                }
                return null;
            }
            c32380mZw = (C32380mZw) trxHistoryUseCase$checkForTimeFormat$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objAEQbTJ)) {
            objAEQbTJ = null;
        }
        C34371nan c34371nan3 = (C34371nan) objAEQbTJ;
        trxHistoryUseCase$checkForTimeFormat$1.L$0 = c34371nan3;
        trxHistoryUseCase$checkForTimeFormat$1.label = 2;
        java.lang.Object objAEQbTJ2 = c32380mZw.AEQbTJ(trxHistoryUseCase$checkForTimeFormat$1);
        if (objAEQbTJ2 == objCopydefault) {
            return objCopydefault;
        }
        c34371nan = c34371nan3;
        objM7386unboximpl = objAEQbTJ2;
        java.lang.Boolean boolKWHzl2 = C56443yFo.KWHzl(false);
        if (Result.m7383isFailureimpl(objM7386unboximpl)) {
        }
        boolean zBooleanValue2 = ((java.lang.Boolean) objM7386unboximpl).booleanValue();
        if (c34371nan == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        TrxHistoryUseCase$toggleDisplayDateTimeFormat$1 trxHistoryUseCase$toggleDisplayDateTimeFormat$1;
        java.lang.Object objAEQbTJ;
        C32380mZw c32380mZw;
        C32380mZw c32380mZw2;
        java.util.List<C34371nan> listFJNWhG;
        if (continuation instanceof TrxHistoryUseCase$toggleDisplayDateTimeFormat$1) {
            trxHistoryUseCase$toggleDisplayDateTimeFormat$1 = (TrxHistoryUseCase$toggleDisplayDateTimeFormat$1) continuation;
            int i = trxHistoryUseCase$toggleDisplayDateTimeFormat$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trxHistoryUseCase$toggleDisplayDateTimeFormat$1.label = i - Integer.MIN_VALUE;
            } else {
                trxHistoryUseCase$toggleDisplayDateTimeFormat$1 = new TrxHistoryUseCase$toggleDisplayDateTimeFormat$1(this, continuation);
            }
        }
        java.lang.Object obj = trxHistoryUseCase$toggleDisplayDateTimeFormat$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trxHistoryUseCase$toggleDisplayDateTimeFormat$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            trxHistoryUseCase$toggleDisplayDateTimeFormat$1.L$0 = this;
            trxHistoryUseCase$toggleDisplayDateTimeFormat$1.label = 1;
            objAEQbTJ = AEQbTJ(trxHistoryUseCase$toggleDisplayDateTimeFormat$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c32380mZw = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c32380mZw2 = (C32380mZw) trxHistoryUseCase$toggleDisplayDateTimeFormat$1.L$0;
                C56391yDq.AEQbTJ(obj);
                java.util.List<C34371nan> value = c32380mZw2.OLrzqt.getValue();
                java.util.ArrayList arrayList = null;
                listFJNWhG = value == null ? CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) value) : null;
                if (listFJNWhG != null) {
                    arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listFJNWhG, 10));
                    for (C34371nan c34371nan : listFJNWhG) {
                        arrayList.add(c34371nan.EZpvd((6143 & 1) != 0 ? c34371nan.AEQbTJ : null, (6143 & 2) != 0 ? c34371nan.valueOf : null, (6143 & 4) != 0 ? c34371nan.KWHzl : null, (6143 & 8) != 0 ? c34371nan.djBIcL : null, (6143 & 16) != 0 ? c34371nan.fetchVPNInfo : null, (6143 & 32) != 0 ? c34371nan.values : null, (6143 & 64) != 0 ? c34371nan.copydefault : null, (6143 & 128) != 0 ? c34371nan.OLrzqt : null, (6143 & 256) != 0 ? c34371nan.AYXKKw : null, (6143 & 512) != 0 ? c34371nan.DbNXlk : null, (6143 & 1024) != 0 ? c34371nan.EZpvd : null, (6143 & 2048) != 0 ? c34371nan.AhwBna : !c34371nan.valueOf(), (6143 & 4096) != 0 ? c34371nan.gEmmrt : null));
                    }
                }
                c32380mZw2.EZpvd.setValue(arrayList);
                return Unit.INSTANCE;
            }
            c32380mZw = (C32380mZw) trxHistoryUseCase$toggleDisplayDateTimeFormat$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(false);
        if (Result.m7383isFailureimpl(objAEQbTJ)) {
            objAEQbTJ = boolKWHzl;
        }
        boolean zBooleanValue = ((java.lang.Boolean) objAEQbTJ).booleanValue();
        trxHistoryUseCase$toggleDisplayDateTimeFormat$1.L$0 = c32380mZw;
        trxHistoryUseCase$toggleDisplayDateTimeFormat$1.label = 2;
        if (c32380mZw.KWHzl(!zBooleanValue, trxHistoryUseCase$toggleDisplayDateTimeFormat$1) == objCopydefault) {
            return objCopydefault;
        }
        c32380mZw2 = c32380mZw;
        java.util.List<C34371nan> value2 = c32380mZw2.OLrzqt.getValue();
        java.util.ArrayList arrayList2 = null;
        if (value2 == null) {
        }
        if (listFJNWhG != null) {
        }
        c32380mZw2.EZpvd.setValue(arrayList2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(boolean z, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        TrxHistoryUseCase$updateTimeDisplay$1 trxHistoryUseCase$updateTimeDisplay$1;
        if (continuation instanceof TrxHistoryUseCase$updateTimeDisplay$1) {
            trxHistoryUseCase$updateTimeDisplay$1 = (TrxHistoryUseCase$updateTimeDisplay$1) continuation;
            int i = trxHistoryUseCase$updateTimeDisplay$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trxHistoryUseCase$updateTimeDisplay$1.label = i - Integer.MIN_VALUE;
            } else {
                trxHistoryUseCase$updateTimeDisplay$1 = new TrxHistoryUseCase$updateTimeDisplay$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = trxHistoryUseCase$updateTimeDisplay$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trxHistoryUseCase$updateTimeDisplay$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            TrxHistoryUseCase$updateTimeDisplay$$inlined$dexRunCatching$1 trxHistoryUseCase$updateTimeDisplay$$inlined$dexRunCatching$1 = new TrxHistoryUseCase$updateTimeDisplay$$inlined$dexRunCatching$1(null, this, z);
            trxHistoryUseCase$updateTimeDisplay$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, trxHistoryUseCase$updateTimeDisplay$$inlined$dexRunCatching$1, trxHistoryUseCase$updateTimeDisplay$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        ((Result) objWithContext).m7386unboximpl();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Result<java.lang.Boolean>> continuation) {
        TrxHistoryUseCase$getTimeDisplay$1 trxHistoryUseCase$getTimeDisplay$1;
        if (continuation instanceof TrxHistoryUseCase$getTimeDisplay$1) {
            trxHistoryUseCase$getTimeDisplay$1 = (TrxHistoryUseCase$getTimeDisplay$1) continuation;
            int i = trxHistoryUseCase$getTimeDisplay$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trxHistoryUseCase$getTimeDisplay$1.label = i - Integer.MIN_VALUE;
            } else {
                trxHistoryUseCase$getTimeDisplay$1 = new TrxHistoryUseCase$getTimeDisplay$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = trxHistoryUseCase$getTimeDisplay$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trxHistoryUseCase$getTimeDisplay$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            TrxHistoryUseCase$getTimeDisplayIoAF18A$$inlined$dexRunCatching$1 trxHistoryUseCase$getTimeDisplayIoAF18A$$inlined$dexRunCatching$1 = new TrxHistoryUseCase$getTimeDisplayIoAF18A$$inlined$dexRunCatching$1(null, this);
            trxHistoryUseCase$getTimeDisplay$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, trxHistoryUseCase$getTimeDisplayIoAF18A$$inlined$dexRunCatching$1, trxHistoryUseCase$getTimeDisplay$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super Result<? extends java.util.List<PriceRangeFilter>>> continuation) {
        TrxHistoryUseCase$loadPriceRangeOptions$1 trxHistoryUseCase$loadPriceRangeOptions$1;
        if (continuation instanceof TrxHistoryUseCase$loadPriceRangeOptions$1) {
            trxHistoryUseCase$loadPriceRangeOptions$1 = (TrxHistoryUseCase$loadPriceRangeOptions$1) continuation;
            int i = trxHistoryUseCase$loadPriceRangeOptions$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trxHistoryUseCase$loadPriceRangeOptions$1.label = i - Integer.MIN_VALUE;
            } else {
                trxHistoryUseCase$loadPriceRangeOptions$1 = new TrxHistoryUseCase$loadPriceRangeOptions$1(this, continuation);
            }
        }
        java.lang.Object obj = trxHistoryUseCase$loadPriceRangeOptions$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trxHistoryUseCase$loadPriceRangeOptions$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C32381mZx c32381mZx = this.copydefault;
        trxHistoryUseCase$loadPriceRangeOptions$1.label = 1;
        java.lang.Object objCopydefault2 = c32381mZx.copydefault(trxHistoryUseCase$loadPriceRangeOptions$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }
}
