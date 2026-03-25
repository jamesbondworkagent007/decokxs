package o;

import com.okinc.dexkline.market.data.model.position_pnl.PnLExtraParams;
import com.okinc.dexkline.market.data.model.position_pnl.PnLTransactionData;
import com.okinc.dexkline.market.data.model.position_pnl.PnLTransactionResponse;
import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import com.okinc.dexkline.market.features.position.repo.PnLTransactionRepositoryImpl$load$2;
import com.okinc.dexkline.market.features.position.repo.PnLTransactionRepositoryImpl$subscribeHistoryUpdates$$inlined$mapNotNull$1$2$1;
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

/* JADX INFO: renamed from: o.ncj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34473ncj implements InterfaceC34475ncl {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final InterfaceC32260mVk AEQbTJ;
    public final C34476ncm EZpvd;
    public final C32261mVl copydefault;

    @yCM
    public C34473ncj(@NotNull InterfaceC32260mVk interfaceC32260mVk, @NotNull C32261mVl c32261mVl, @NotNull C34476ncm c34476ncm) {
        Intrinsics.checkNotNullParameter(interfaceC32260mVk, "");
        Intrinsics.checkNotNullParameter(c32261mVl, "");
        Intrinsics.checkNotNullParameter(c34476ncm, "");
        this.AEQbTJ = interfaceC32260mVk;
        this.copydefault = c32261mVl;
        this.EZpvd = c34476ncm;
    }

    /* JADX INFO: renamed from: o.ncj$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ncj.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.ncj$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator implements Flow<java.util.List<? extends PnLTransactionData>> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ C34473ncj OLrzqt;

        /* JADX INFO: renamed from: o.ncj$StateListAnimator$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ C34473ncj AEQbTJ;
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector, C34473ncj c34473ncj) {
                this.OLrzqt = flowCollector;
                this.AEQbTJ = c34473ncj;
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
                    FlowCollector flowCollector = this.OLrzqt;
                    java.util.List<PnLTransactionData> listAEQbTJ = this.AEQbTJ.EZpvd.AEQbTJ((java.lang.String) obj);
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

        public StateListAnimator(Flow flow, C34473ncj c34473ncj) {
            this.AEQbTJ = flow;
            this.OLrzqt = c34473ncj;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends PnLTransactionData>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass1(flowCollector, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // o.InterfaceC34475ncl
    public java.lang.Object EZpvd(long j, boolean z, @NotNull TokenFilter tokenFilter, @NotNull Continuation<? super AbstractC43419rot<PnLTransactionResponse, OKServerException>> continuation) {
        return C34583nen.AEQbTJ(new PnLTransactionRepositoryImpl$load$2(tokenFilter, j, z, this, null), continuation);
    }

    @Override // o.InterfaceC34475ncl
    public java.lang.Object copydefault(@NotNull PnLExtraParams pnLExtraParams, @NotNull Continuation<? super Flow<? extends java.util.List<PnLTransactionData>>> continuation) {
        this.copydefault.KWHzl("dex-market-pnl-history", yDY.copydefault(new WsArgV5ForWeb3("dex-market-pnl-history", null, null, null, this.EZpvd.copydefault(pnLExtraParams), 14, null)));
        return new StateListAnimator(this.copydefault.copydefault(), this);
    }

    @Override // o.InterfaceC34475ncl
    public java.lang.Object OLrzqt(@NotNull Continuation<? super Result<Unit>> continuation) {
        try {
            Result.Application application = Result.Companion;
            this.copydefault.EZpvd();
            return Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("cedefi", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
