package o;

import com.okinc.business.market.data.model.position_pnl.LatestPnLData;
import com.okinc.business.market.data.model.position_pnl.PnLExtraParams;
import com.okinc.business.market.features.position.repo.LatestPnLRepositoryImpl$getLatestPnL$2;
import com.okinc.business.market.features.position.repo.LatestPnLRepositoryImpl$subscribePnLUpdates$$inlined$mapNotNull$1$2$1;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kns, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29134kns implements InterfaceC29133knr {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final C27640jyx AEQbTJ;
    public final C29135knt KWHzl;
    public final InterfaceC27595jyE copydefault;

    @yCM
    public C29134kns(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull C27640jyx c27640jyx, @NotNull C29135knt c29135knt) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(c29135knt, "");
        this.copydefault = interfaceC27595jyE;
        this.AEQbTJ = c27640jyx;
        this.KWHzl = c29135knt;
    }

    /* JADX INFO: renamed from: o.kns$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kns.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.InterfaceC29133knr
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<LatestPnLData, OKServerException>> continuation) {
        return kAB.EZpvd(new LatestPnLRepositoryImpl$getLatestPnL$2(str2, str, str3, this, null), continuation);
    }

    /* JADX INFO: renamed from: o.kns$StateListAnimator */
    public static final class StateListAnimator implements Flow<LatestPnLData> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: o.kns$StateListAnimator$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                LatestPnLRepositoryImpl$subscribePnLUpdates$$inlined$mapNotNull$1$2$1 latestPnLRepositoryImpl$subscribePnLUpdates$$inlined$mapNotNull$1$2$1;
                LatestPnLData latestPnLData;
                if (continuation instanceof LatestPnLRepositoryImpl$subscribePnLUpdates$$inlined$mapNotNull$1$2$1) {
                    latestPnLRepositoryImpl$subscribePnLUpdates$$inlined$mapNotNull$1$2$1 = (LatestPnLRepositoryImpl$subscribePnLUpdates$$inlined$mapNotNull$1$2$1) continuation;
                    int i = latestPnLRepositoryImpl$subscribePnLUpdates$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        latestPnLRepositoryImpl$subscribePnLUpdates$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        latestPnLRepositoryImpl$subscribePnLUpdates$$inlined$mapNotNull$1$2$1 = new LatestPnLRepositoryImpl$subscribePnLUpdates$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = latestPnLRepositoryImpl$subscribePnLUpdates$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = latestPnLRepositoryImpl$subscribePnLUpdates$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    java.lang.String str = (java.lang.String) obj;
                    try {
                        Json jsonKWHzl = C43284rmQ.KWHzl();
                        jsonKWHzl.getSerializersModule();
                        latestPnLData = (LatestPnLData) jsonKWHzl.decodeFromString(LatestPnLData.Companion.serializer(), str);
                    } catch (java.lang.Exception unused) {
                        latestPnLData = null;
                    }
                    if (latestPnLData != null) {
                        latestPnLRepositoryImpl$subscribePnLUpdates$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(latestPnLData, latestPnLRepositoryImpl$subscribePnLUpdates$$inlined$mapNotNull$1$2$1) == objCopydefault) {
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
        public java.lang.Object collect(FlowCollector<? super LatestPnLData> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // o.InterfaceC29133knr
    public java.lang.Object OLrzqt(@NotNull PnLExtraParams pnLExtraParams, @NotNull Continuation<? super Flow<LatestPnLData>> continuation) {
        this.AEQbTJ.copydefault("dex-market-pnl-latest", yDY.copydefault(new WsArgV5ForWeb3("dex-market-pnl-latest", null, null, null, this.KWHzl.KWHzl(pnLExtraParams), 14, null)));
        return new StateListAnimator(this.AEQbTJ.OLrzqt());
    }

    @Override // o.InterfaceC29133knr
    public void EZpvd() {
        this.AEQbTJ.AEQbTJ();
    }
}
