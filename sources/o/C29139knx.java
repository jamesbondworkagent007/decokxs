package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.market.data.model.position_pnl.PnLExtraParams;
import com.okinc.business.market.data.model.position_pnl.PnLTransactionData;
import com.okinc.business.market.data.model.position_pnl.PnLTransactionResponse;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.business.market.features.position.repo.PnLTransactionRepositoryImpl$checkAndGetTokenInfo$2;
import com.okinc.business.market.features.position.repo.PnLTransactionRepositoryImpl$load$2;
import com.okinc.business.market.features.position.repo.PnLTransactionRepositoryImpl$subscribeHistoryUpdates$$inlined$mapNotNull$1$2$1;
import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.knx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29139knx implements InterfaceC29132knq {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final C27640jyx AEQbTJ;
    public final InterfaceC27595jyE KWHzl;
    public final C29137knv OLrzqt;

    /* JADX INFO: renamed from: o.knx$ActionBar */
    public static final class ActionBar implements Flow<java.util.List<? extends PnLTransactionData>> {
        public final /* synthetic */ C29139knx KWHzl;
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.knx$ActionBar$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ C29139knx KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, C29139knx c29139knx) {
                this.AEQbTJ = flowCollector;
                this.KWHzl = c29139knx;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                PnLTransactionRepositoryImpl$subscribeHistoryUpdates$$inlined$mapNotNull$1$2$1 pnLTransactionRepositoryImpl$subscribeHistoryUpdates$$inlined$mapNotNull$1$2$1;
                if (continuation instanceof PnLTransactionRepositoryImpl$subscribeHistoryUpdates$$inlined$mapNotNull$1$2$1) {
                    pnLTransactionRepositoryImpl$subscribeHistoryUpdates$$inlined$mapNotNull$1$2$1 = (PnLTransactionRepositoryImpl$subscribeHistoryUpdates$$inlined$mapNotNull$1$2$1) continuation;
                    int i = pnLTransactionRepositoryImpl$subscribeHistoryUpdates$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        pnLTransactionRepositoryImpl$subscribeHistoryUpdates$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        pnLTransactionRepositoryImpl$subscribeHistoryUpdates$$inlined$mapNotNull$1$2$1 = new PnLTransactionRepositoryImpl$subscribeHistoryUpdates$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = pnLTransactionRepositoryImpl$subscribeHistoryUpdates$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = pnLTransactionRepositoryImpl$subscribeHistoryUpdates$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    java.util.List<PnLTransactionData> listAEQbTJ = this.KWHzl.OLrzqt.AEQbTJ((java.lang.String) obj);
                    if (listAEQbTJ != null) {
                        pnLTransactionRepositoryImpl$subscribeHistoryUpdates$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(listAEQbTJ, pnLTransactionRepositoryImpl$subscribeHistoryUpdates$$inlined$mapNotNull$1$2$1) == objCopydefault) {
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

        public ActionBar(Flow flow, C29139knx c29139knx) {
            this.copydefault = flow;
            this.KWHzl = c29139knx;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends PnLTransactionData>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass4(flowCollector, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @yCM
    public C29139knx(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull C27640jyx c27640jyx, @NotNull C29137knv c29137knv) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(c29137knv, "");
        this.KWHzl = interfaceC27595jyE;
        this.AEQbTJ = c27640jyx;
        this.OLrzqt = c29137knv;
    }

    /* JADX INFO: renamed from: o.knx$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.knx.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.InterfaceC29132knq
    public java.lang.Object copydefault(long j, boolean z, @NotNull TokenFilter tokenFilter, @NotNull Continuation<? super AbstractC43419rot<PnLTransactionResponse, OKServerException>> continuation) {
        return kAB.EZpvd(new PnLTransactionRepositoryImpl$load$2(tokenFilter, j, z, this, null), continuation);
    }

    @Override // o.InterfaceC29132knq
    public java.lang.Object AEQbTJ(@NotNull PnLExtraParams pnLExtraParams, @NotNull Continuation<? super Flow<? extends java.util.List<PnLTransactionData>>> continuation) {
        return new ActionBar(this.AEQbTJ.KWHzl("dex-market-pnl-history", yDY.copydefault(new WsArgV5ForWeb3("dex-market-pnl-history", null, null, null, this.OLrzqt.OLrzqt(pnLExtraParams), 14, null))), this);
    }

    @Override // o.InterfaceC29132knq
    public java.lang.Object OLrzqt(boolean z, @NotNull Continuation<? super Unit> continuation) {
        SPUtils.put("dex_balance_private", C56443yFo.KWHzl(z), "dex_market");
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC29132knq
    public java.lang.Object OLrzqt(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return C56443yFo.KWHzl(SPUtils.getBoolean("dex_balance_private", false, "dex_market"));
    }

    @Override // o.InterfaceC29132knq
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull Continuation<? super AbstractC43419rot<DexMultiTokenInfoBean, OKServerException>> continuation) {
        return kAB.EZpvd(new PnLTransactionRepositoryImpl$checkAndGetTokenInfo$2(str, str2, str3, str4, str5, this, null), continuation);
    }

    @Override // o.InterfaceC29132knq
    public java.lang.Object copydefault(@NotNull Continuation<? super Result<Unit>> continuation) {
        try {
            Result.Application application = Result.Companion;
            this.AEQbTJ.AEQbTJ();
            return Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
