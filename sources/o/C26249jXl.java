package o;

import com.okinc.business.market.features.filter.domain.PriceRangeFilter;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.business.market.features.history.domain.TrxHistoryUseCase$checkForTimeFormat$1;
import com.okinc.business.market.features.history.domain.TrxHistoryUseCase$getTimeDisplay$1;
import com.okinc.business.market.features.history.domain.TrxHistoryUseCase$getTimeDisplayIoAF18A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.history.domain.TrxHistoryUseCase$invoke$1;
import com.okinc.business.market.features.history.domain.TrxHistoryUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.history.domain.TrxHistoryUseCase$loadPriceRangeOptions$1;
import com.okinc.business.market.features.history.domain.TrxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1;
import com.okinc.business.market.features.history.domain.TrxHistoryUseCase$toggleDisplayDateTimeFormat$1;
import com.okinc.business.market.features.history.domain.TrxHistoryUseCase$updateTimeDisplay$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.history.domain.TrxHistoryUseCase$updateTimeDisplay$1;
import com.okinc.business.market.features.history.domain.model.HistoryChange;
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

/* JADX INFO: renamed from: o.jXl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26249jXl {
    public final MutableStateFlow<java.util.List<C26277jYm>> AEQbTJ;
    public final StateFlow<java.util.List<C26277jYm>> EZpvd;
    public final C26253jXp KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final C26252jXo copydefault;
    public final CoroutineScope djBIcL;
    public final C26250jXm valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.util.List<C26277jYm>> AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public C26249jXl(@NotNull C26250jXm c26250jXm, @NotNull C26252jXo c26252jXo, @NotNull C26253jXp c26253jXp, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c26250jXm, "");
        Intrinsics.checkNotNullParameter(c26252jXo, "");
        Intrinsics.checkNotNullParameter(c26253jXp, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.valueOf = c26250jXm;
        this.copydefault = c26252jXo;
        this.KWHzl = c26253jXp;
        this.OLrzqt = coroutineDispatcher;
        MutableStateFlow<java.util.List<C26277jYm>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow);
        this.djBIcL = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
    }

    /* JADX INFO: renamed from: invoke-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8643invokeBWLJW6A$default(C26249jXl c26249jXl, java.lang.String str, TokenFilter tokenFilter, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return c26249jXl.KWHzl(str, tokenFilter, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull TokenFilter tokenFilter, boolean z, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) {
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
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
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

    /* JADX INFO: renamed from: o.jXl$TaskDescription */
    public static final class TaskDescription implements Flow<C26277jYm> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ C26249jXl OLrzqt;
        public final /* synthetic */ boolean copydefault;

        /* JADX INFO: renamed from: o.jXl$TaskDescription$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ C26249jXl AEQbTJ;
            public final /* synthetic */ FlowCollector EZpvd;
            public final /* synthetic */ boolean OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, boolean z, C26249jXl c26249jXl) {
                this.EZpvd = flowCollector;
                this.OLrzqt = z;
                this.AEQbTJ = c26249jXl;
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
                C26277jYm c26277jYm;
                FlowCollector flowCollector2;
                java.lang.Object objM7386unboximpl;
                C26277jYm c26277jYm2;
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
                    flowCollector = this.EZpvd;
                    HistoryChange historyChange = (HistoryChange) obj;
                    if (historyChange == null) {
                        c26277jYm = null;
                        trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1.L$0 = null;
                        trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1.label = 3;
                        if (flowCollector.emit(c26277jYm, trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                    if (this.OLrzqt) {
                        C26250jXm c26250jXm = this.AEQbTJ.valueOf;
                        trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1.L$0 = flowCollector;
                        trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1.label = 1;
                        java.lang.Object objKWHzl = c26250jXm.KWHzl(historyChange, trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1);
                        if (objKWHzl == objCopydefault) {
                            return objCopydefault;
                        }
                        objM7386unboximpl = objKWHzl;
                        flowCollector2 = flowCollector;
                        if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                        }
                        c26277jYm2 = (C26277jYm) objM7386unboximpl;
                    } else {
                        C26249jXl c26249jXl = this.AEQbTJ;
                        trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1.L$0 = flowCollector;
                        trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1.label = 2;
                        java.lang.Object objOLrzqt = c26249jXl.OLrzqt(historyChange, trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1);
                        if (objOLrzqt == objCopydefault) {
                            return objCopydefault;
                        }
                        obj2 = objOLrzqt;
                        flowCollector2 = flowCollector;
                        c26277jYm2 = (C26277jYm) obj2;
                    }
                } else if (i2 == 1) {
                    flowCollector2 = (FlowCollector) trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    objM7386unboximpl = ((Result) obj2).m7386unboximpl();
                    if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                        objM7386unboximpl = null;
                    }
                    c26277jYm2 = (C26277jYm) objM7386unboximpl;
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
                    c26277jYm2 = (C26277jYm) obj2;
                }
                C26277jYm c26277jYm3 = c26277jYm2;
                flowCollector = flowCollector2;
                c26277jYm = c26277jYm3;
                trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1.L$0 = null;
                trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1.label = 3;
                if (flowCollector.emit(c26277jYm, trxHistoryUseCase$subscribeWs$lambda$4$$inlined$map$1$2$1) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
        }

        public TaskDescription(Flow flow, boolean z, C26249jXl c26249jXl) {
            this.AEQbTJ = flow;
            this.copydefault = z;
            this.OLrzqt = c26249jXl;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super C26277jYm> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass3(flowCollector, this.copydefault, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Flow subscribeWs$default(C26249jXl c26249jXl, TokenFilter tokenFilter, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            str = "dex-market-trade-history";
        }
        return c26249jXl.EZpvd(tokenFilter, z, str);
    }

    public final Flow<C26277jYm> EZpvd(@NotNull TokenFilter tokenFilter, boolean z, @NotNull java.lang.String str) {
        Flow<HistoryChange> flowEZpvd;
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl();
        if (C22416heu.ejfBZ()) {
            return FlowKt.emptyFlow();
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "dex-market-trade-history-pub")) {
            flowEZpvd = this.copydefault.KWHzl(tokenFilter);
        } else {
            flowEZpvd = this.copydefault.EZpvd(tokenFilter);
        }
        return new TaskDescription(flowEZpvd, z, this);
    }

    public final void KWHzl() {
        JobKt__JobKt.cancelChildren$default(this.djBIcL.getCoroutineContext(), (CancellationException) null, 1, (java.lang.Object) null);
        this.copydefault.EZpvd();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull HistoryChange historyChange, @NotNull Continuation<? super C26277jYm> continuation) throws java.lang.Throwable {
        TrxHistoryUseCase$checkForTimeFormat$1 trxHistoryUseCase$checkForTimeFormat$1;
        java.lang.Object objKWHzl;
        C26249jXl c26249jXl;
        C26277jYm c26277jYm;
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
            C26250jXm c26250jXm = this.valueOf;
            trxHistoryUseCase$checkForTimeFormat$1.L$0 = this;
            trxHistoryUseCase$checkForTimeFormat$1.label = 1;
            objKWHzl = c26250jXm.KWHzl(historyChange, trxHistoryUseCase$checkForTimeFormat$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c26249jXl = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C26277jYm c26277jYm2 = (C26277jYm) trxHistoryUseCase$checkForTimeFormat$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                c26277jYm = c26277jYm2;
                java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(false);
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                    objM7386unboximpl = boolKWHzl;
                }
                boolean zBooleanValue = ((java.lang.Boolean) objM7386unboximpl).booleanValue();
                if (c26277jYm == null) {
                    return c26277jYm.AEQbTJ((6143 & 1) != 0 ? c26277jYm.AEQbTJ : null, (6143 & 2) != 0 ? c26277jYm.AhwBna : null, (6143 & 4) != 0 ? c26277jYm.copydefault : null, (6143 & 8) != 0 ? c26277jYm.djBIcL : null, (6143 & 16) != 0 ? c26277jYm.fetchVPNInfo : null, (6143 & 32) != 0 ? c26277jYm.values : null, (6143 & 64) != 0 ? c26277jYm.OLrzqt : null, (6143 & 128) != 0 ? c26277jYm.EZpvd : null, (6143 & 256) != 0 ? c26277jYm.valueOf : null, (6143 & 512) != 0 ? c26277jYm.isConnected : null, (6143 & 1024) != 0 ? c26277jYm.KWHzl : null, (6143 & 2048) != 0 ? c26277jYm.gEmmrt : zBooleanValue, (6143 & 4096) != 0 ? c26277jYm.AYXKKw : null);
                }
                return null;
            }
            c26249jXl = (C26249jXl) trxHistoryUseCase$checkForTimeFormat$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objKWHzl)) {
            objKWHzl = null;
        }
        C26277jYm c26277jYm3 = (C26277jYm) objKWHzl;
        trxHistoryUseCase$checkForTimeFormat$1.L$0 = c26277jYm3;
        trxHistoryUseCase$checkForTimeFormat$1.label = 2;
        java.lang.Object objOLrzqt = c26249jXl.OLrzqt(trxHistoryUseCase$checkForTimeFormat$1);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        c26277jYm = c26277jYm3;
        objM7386unboximpl = objOLrzqt;
        java.lang.Boolean boolKWHzl2 = C56443yFo.KWHzl(false);
        if (Result.m7383isFailureimpl(objM7386unboximpl)) {
        }
        boolean zBooleanValue2 = ((java.lang.Boolean) objM7386unboximpl).booleanValue();
        if (c26277jYm == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        TrxHistoryUseCase$toggleDisplayDateTimeFormat$1 trxHistoryUseCase$toggleDisplayDateTimeFormat$1;
        java.lang.Object objOLrzqt;
        C26249jXl c26249jXl;
        C26249jXl c26249jXl2;
        java.util.List<C26277jYm> listFJNWhG;
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
            objOLrzqt = OLrzqt(trxHistoryUseCase$toggleDisplayDateTimeFormat$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c26249jXl = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c26249jXl2 = (C26249jXl) trxHistoryUseCase$toggleDisplayDateTimeFormat$1.L$0;
                C56391yDq.AEQbTJ(obj);
                java.util.List<C26277jYm> value = c26249jXl2.EZpvd.getValue();
                java.util.ArrayList arrayList = null;
                listFJNWhG = value == null ? CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) value) : null;
                if (listFJNWhG != null) {
                    arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listFJNWhG, 10));
                    for (C26277jYm c26277jYm : listFJNWhG) {
                        arrayList.add(c26277jYm.AEQbTJ((6143 & 1) != 0 ? c26277jYm.AEQbTJ : null, (6143 & 2) != 0 ? c26277jYm.AhwBna : null, (6143 & 4) != 0 ? c26277jYm.copydefault : null, (6143 & 8) != 0 ? c26277jYm.djBIcL : null, (6143 & 16) != 0 ? c26277jYm.fetchVPNInfo : null, (6143 & 32) != 0 ? c26277jYm.values : null, (6143 & 64) != 0 ? c26277jYm.OLrzqt : null, (6143 & 128) != 0 ? c26277jYm.EZpvd : null, (6143 & 256) != 0 ? c26277jYm.valueOf : null, (6143 & 512) != 0 ? c26277jYm.isConnected : null, (6143 & 1024) != 0 ? c26277jYm.KWHzl : null, (6143 & 2048) != 0 ? c26277jYm.gEmmrt : !c26277jYm.valueOf(), (6143 & 4096) != 0 ? c26277jYm.AYXKKw : null));
                    }
                }
                c26249jXl2.AEQbTJ.setValue(arrayList);
                return Unit.INSTANCE;
            }
            c26249jXl = (C26249jXl) trxHistoryUseCase$toggleDisplayDateTimeFormat$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(false);
        if (Result.m7383isFailureimpl(objOLrzqt)) {
            objOLrzqt = boolKWHzl;
        }
        boolean zBooleanValue = ((java.lang.Boolean) objOLrzqt).booleanValue();
        trxHistoryUseCase$toggleDisplayDateTimeFormat$1.L$0 = c26249jXl;
        trxHistoryUseCase$toggleDisplayDateTimeFormat$1.label = 2;
        if (c26249jXl.OLrzqt(!zBooleanValue, trxHistoryUseCase$toggleDisplayDateTimeFormat$1) == objCopydefault) {
            return objCopydefault;
        }
        c26249jXl2 = c26249jXl;
        java.util.List<C26277jYm> value2 = c26249jXl2.EZpvd.getValue();
        java.util.ArrayList arrayList2 = null;
        if (value2 == null) {
        }
        if (listFJNWhG != null) {
        }
        c26249jXl2.AEQbTJ.setValue(arrayList2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(boolean z, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
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
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
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
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Result<java.lang.Boolean>> continuation) {
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
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
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
    public final java.lang.Object EZpvd(@NotNull Continuation<? super Result<? extends java.util.List<PriceRangeFilter>>> continuation) {
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
        C26253jXp c26253jXp = this.KWHzl;
        trxHistoryUseCase$loadPriceRangeOptions$1.label = 1;
        java.lang.Object objAEQbTJ = c26253jXp.AEQbTJ(trxHistoryUseCase$loadPriceRangeOptions$1);
        return objAEQbTJ == objCopydefault ? objCopydefault : objAEQbTJ;
    }
}
