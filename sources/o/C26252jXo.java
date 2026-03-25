package o;

import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.business.market.features.history.domain.model.HistoryChange;
import com.okinc.business.market.features.history.repo.HistoryChangeRepo$load$1;
import com.okinc.business.market.features.history.repo.HistoryChangeRepo$load0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.history.repo.HistoryChangeRepo$subscribePrivateChannel$$inlined$mapNotNull$1$2$1;
import com.okinc.business.market.features.history.repo.HistoryChangeRepo$subscribePublicChannel$$inlined$mapNotNull$1$2$1;
import com.okinc.core.util.SPUtils;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jXo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26252jXo {
    public final InterfaceC27595jyE AEQbTJ;
    public final C27640jyx EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final C26244jXg copydefault;

    @yCM
    public C26252jXo(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull C26244jXg c26244jXg, @NotNull C27640jyx c27640jyx, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(c26244jXg, "");
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = interfaceC27595jyE;
        this.copydefault = c26244jXg;
        this.EZpvd = c27640jyx;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull TokenFilter tokenFilter, @NotNull Continuation<? super Result<? extends kotlin.Pair<? extends java.util.List<HistoryChange>, java.lang.Boolean>>> continuation) throws java.lang.Throwable {
        HistoryChangeRepo$load$1 historyChangeRepo$load$1;
        if (continuation instanceof HistoryChangeRepo$load$1) {
            historyChangeRepo$load$1 = (HistoryChangeRepo$load$1) continuation;
            int i = historyChangeRepo$load$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                historyChangeRepo$load$1.label = i - Integer.MIN_VALUE;
            } else {
                historyChangeRepo$load$1 = new HistoryChangeRepo$load$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = historyChangeRepo$load$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = historyChangeRepo$load$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            HistoryChangeRepo$load0E7RQCE$$inlined$dexRunCatching$1 historyChangeRepo$load0E7RQCE$$inlined$dexRunCatching$1 = new HistoryChangeRepo$load0E7RQCE$$inlined$dexRunCatching$1(null, this, tokenFilter, str);
            historyChangeRepo$load$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, historyChangeRepo$load0E7RQCE$$inlined$dexRunCatching$1, historyChangeRepo$load$1);
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

    /* JADX INFO: renamed from: o.jXo$ActionBar */
    public static final class ActionBar implements Flow<HistoryChange> {
        public final /* synthetic */ C26252jXo AEQbTJ;
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.jXo$ActionBar$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;
            public final /* synthetic */ C26252jXo copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, C26252jXo c26252jXo) {
                this.OLrzqt = flowCollector;
                this.copydefault = c26252jXo;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                HistoryChangeRepo$subscribePrivateChannel$$inlined$mapNotNull$1$2$1 historyChangeRepo$subscribePrivateChannel$$inlined$mapNotNull$1$2$1;
                if (continuation instanceof HistoryChangeRepo$subscribePrivateChannel$$inlined$mapNotNull$1$2$1) {
                    historyChangeRepo$subscribePrivateChannel$$inlined$mapNotNull$1$2$1 = (HistoryChangeRepo$subscribePrivateChannel$$inlined$mapNotNull$1$2$1) continuation;
                    int i = historyChangeRepo$subscribePrivateChannel$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        historyChangeRepo$subscribePrivateChannel$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        historyChangeRepo$subscribePrivateChannel$$inlined$mapNotNull$1$2$1 = new HistoryChangeRepo$subscribePrivateChannel$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = historyChangeRepo$subscribePrivateChannel$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = historyChangeRepo$subscribePrivateChannel$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    HistoryChange historyChangeAEQbTJ = this.copydefault.copydefault.AEQbTJ((java.lang.String) obj);
                    if (historyChangeAEQbTJ != null) {
                        historyChangeRepo$subscribePrivateChannel$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(historyChangeAEQbTJ, historyChangeRepo$subscribePrivateChannel$$inlined$mapNotNull$1$2$1) == objCopydefault) {
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

        public ActionBar(Flow flow, C26252jXo c26252jXo) {
            this.copydefault = flow;
            this.AEQbTJ = c26252jXo;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super HistoryChange> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass5(flowCollector, this.AEQbTJ), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.jXo$Application */
    public static final class Application implements Flow<HistoryChange> {
        public final /* synthetic */ Flow OLrzqt;
        public final /* synthetic */ C26252jXo copydefault;

        /* JADX INFO: renamed from: o.jXo$Application$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;
            public final /* synthetic */ C26252jXo OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, C26252jXo c26252jXo) {
                this.KWHzl = flowCollector;
                this.OLrzqt = c26252jXo;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                HistoryChangeRepo$subscribePublicChannel$$inlined$mapNotNull$1$2$1 historyChangeRepo$subscribePublicChannel$$inlined$mapNotNull$1$2$1;
                if (continuation instanceof HistoryChangeRepo$subscribePublicChannel$$inlined$mapNotNull$1$2$1) {
                    historyChangeRepo$subscribePublicChannel$$inlined$mapNotNull$1$2$1 = (HistoryChangeRepo$subscribePublicChannel$$inlined$mapNotNull$1$2$1) continuation;
                    int i = historyChangeRepo$subscribePublicChannel$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        historyChangeRepo$subscribePublicChannel$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        historyChangeRepo$subscribePublicChannel$$inlined$mapNotNull$1$2$1 = new HistoryChangeRepo$subscribePublicChannel$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = historyChangeRepo$subscribePublicChannel$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = historyChangeRepo$subscribePublicChannel$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    HistoryChange historyChangeOLrzqt = this.OLrzqt.copydefault.OLrzqt((java.lang.String) obj);
                    if (historyChangeOLrzqt != null) {
                        historyChangeRepo$subscribePublicChannel$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(historyChangeOLrzqt, historyChangeRepo$subscribePublicChannel$$inlined$mapNotNull$1$2$1) == objCopydefault) {
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

        public Application(Flow flow, C26252jXo c26252jXo) {
            this.OLrzqt = flow;
            this.copydefault = c26252jXo;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super HistoryChange> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass3(flowCollector, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final Flow<HistoryChange> KWHzl(@NotNull TokenFilter tokenFilter) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        return new Application(this.EZpvd.KWHzl("dex-market-trade-history-pub", yDY.copydefault(new WsArgV5ForWeb3("dex-market-trade-history-pub", null, tokenFilter.KWHzl(), tokenFilter.isConnected(), null, 18, null))), this);
    }

    public final Flow<HistoryChange> EZpvd(@NotNull TokenFilter tokenFilter) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        return new ActionBar(this.EZpvd.KWHzl("dex-market-trade-history", yDY.copydefault(new WsArgV5ForWeb3("dex-market-trade-history", null, null, null, this.copydefault.AEQbTJ(tokenFilter), 14, null))), this);
    }

    public final void EZpvd() {
        this.EZpvd.AEQbTJ();
    }

    public final void KWHzl(boolean z) {
        SPUtils.put("dex_market_history_selected_is_calendar", java.lang.Boolean.valueOf(z), "dex_market");
    }

    public final boolean AEQbTJ() {
        return SPUtils.getBoolean("dex_market_history_selected_is_calendar", false, "dex_market");
    }
}
