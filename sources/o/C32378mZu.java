package o;

import com.okinc.core.util.SPUtils;
import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import com.okinc.dexkline.market.features.history.domian.models.HistoryChange;
import com.okinc.dexkline.market.features.history.repo.HistoryChangeRepo$load$1;
import com.okinc.dexkline.market.features.history.repo.HistoryChangeRepo$load0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.dexkline.market.features.history.repo.HistoryChangeRepo$subscribePrivateChannel$$inlined$mapNotNull$1$2$1;
import com.okinc.dexkline.market.features.history.repo.HistoryChangeRepo$subscribePublicChannel$$inlined$mapNotNull$1$2$1;
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

/* JADX INFO: renamed from: o.mZu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C32378mZu {
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC32260mVk EZpvd;
    public final C32261mVl KWHzl;
    public final C32374mZq copydefault;

    @yCM
    public C32378mZu(@NotNull InterfaceC32260mVk interfaceC32260mVk, @NotNull C32374mZq c32374mZq, @NotNull C32261mVl c32261mVl, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC32260mVk, "");
        Intrinsics.checkNotNullParameter(c32374mZq, "");
        Intrinsics.checkNotNullParameter(c32261mVl, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = interfaceC32260mVk;
        this.copydefault = c32374mZq;
        this.KWHzl = c32261mVl;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull TokenFilter tokenFilter, @NotNull Continuation<? super Result<? extends kotlin.Pair<? extends java.util.List<HistoryChange>, java.lang.Boolean>>> continuation) throws java.lang.Throwable {
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
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
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

    /* JADX INFO: renamed from: o.mZu$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application implements Flow<HistoryChange> {
        public final /* synthetic */ Flow OLrzqt;
        public final /* synthetic */ C32378mZu copydefault;

        /* JADX INFO: renamed from: o.mZu$Application$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ C32378mZu EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, C32378mZu c32378mZu) {
                this.AEQbTJ = flowCollector;
                this.EZpvd = c32378mZu;
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
                    FlowCollector flowCollector = this.AEQbTJ;
                    HistoryChange historyChangeAEQbTJ = this.EZpvd.copydefault.AEQbTJ((java.lang.String) obj);
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

        public Application(Flow flow, C32378mZu c32378mZu) {
            this.OLrzqt = flow;
            this.copydefault = c32378mZu;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super HistoryChange> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass5(flowCollector, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.mZu$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator implements Flow<HistoryChange> {
        public final /* synthetic */ C32378mZu AEQbTJ;
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.mZu$StateListAnimator$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ C32378mZu KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, C32378mZu c32378mZu) {
                this.AEQbTJ = flowCollector;
                this.KWHzl = c32378mZu;
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
                    FlowCollector flowCollector = this.AEQbTJ;
                    HistoryChange historyChangeKWHzl = this.KWHzl.copydefault.KWHzl((java.lang.String) obj);
                    if (historyChangeKWHzl != null) {
                        historyChangeRepo$subscribePublicChannel$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(historyChangeKWHzl, historyChangeRepo$subscribePublicChannel$$inlined$mapNotNull$1$2$1) == objCopydefault) {
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

        public StateListAnimator(Flow flow, C32378mZu c32378mZu) {
            this.copydefault = flow;
            this.AEQbTJ = c32378mZu;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super HistoryChange> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass4(flowCollector, this.AEQbTJ), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final Flow<HistoryChange> OLrzqt(@NotNull TokenFilter tokenFilter) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        this.KWHzl.KWHzl("dex-market-trade-history-pub", yDY.copydefault(new WsArgV5ForWeb3("dex-market-trade-history-pub", null, tokenFilter.KWHzl(), tokenFilter.DbNXlk(), null, 18, null)));
        return new StateListAnimator(this.KWHzl.copydefault(), this);
    }

    public final Flow<HistoryChange> KWHzl(@NotNull TokenFilter tokenFilter) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        this.KWHzl.KWHzl("dex-market-trade-history", yDY.copydefault(new WsArgV5ForWeb3("dex-market-trade-history", null, null, null, this.copydefault.EZpvd(tokenFilter), 14, null)));
        return new Application(this.KWHzl.copydefault(), this);
    }

    public final void AEQbTJ() {
        this.KWHzl.EZpvd();
    }

    public final void OLrzqt(boolean z) {
        SPUtils.put("dex_market_history_selected_is_calendar", java.lang.Boolean.valueOf(z), "dex_market");
    }

    public final boolean EZpvd() {
        return SPUtils.getBoolean("dex_market_history_selected_is_calendar", false, "dex_market");
    }
}
