package o;

import com.okinc.business.defi.api.bean.passkeywallet.cedefi.OrderStatus;
import com.okinc.business.defi.wallet.passkey.common.usecase.SubscribeTxStatusWsUseCase$getTxStatusFlow$$inlined$map$1$2$1;
import com.okinc.business.defi.wallet.passkey.common.ws.bean.TxStatusSubResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fNi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17654fNi {
    public final C17663fNr copydefault;

    @yCM
    public C17654fNi(@NotNull C17663fNr c17663fNr) {
        Intrinsics.checkNotNullParameter(c17663fNr, "");
        this.copydefault = c17663fNr;
    }

    public final Flow<C9767bbm> OLrzqt() {
        return new Activity(this.copydefault.OLrzqt());
    }

    /* JADX INFO: renamed from: o.fNi$Activity */
    public static final class Activity implements Flow<C9767bbm> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: o.fNi$Activity$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SubscribeTxStatusWsUseCase$getTxStatusFlow$$inlined$map$1$2$1 subscribeTxStatusWsUseCase$getTxStatusFlow$$inlined$map$1$2$1;
                if (continuation instanceof SubscribeTxStatusWsUseCase$getTxStatusFlow$$inlined$map$1$2$1) {
                    subscribeTxStatusWsUseCase$getTxStatusFlow$$inlined$map$1$2$1 = (SubscribeTxStatusWsUseCase$getTxStatusFlow$$inlined$map$1$2$1) continuation;
                    int i = subscribeTxStatusWsUseCase$getTxStatusFlow$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeTxStatusWsUseCase$getTxStatusFlow$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeTxStatusWsUseCase$getTxStatusFlow$$inlined$map$1$2$1 = new SubscribeTxStatusWsUseCase$getTxStatusFlow$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeTxStatusWsUseCase$getTxStatusFlow$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeTxStatusWsUseCase$getTxStatusFlow$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    TxStatusSubResponse txStatusSubResponse = (TxStatusSubResponse) obj;
                    C9767bbm c9767bbm = new C9767bbm(txStatusSubResponse.getOrderId(), txStatusSubResponse.getParentOrderId(), OrderStatus.Companion.OLrzqt(txStatusSubResponse.getStatus()), txStatusSubResponse.getUopHash());
                    subscribeTxStatusWsUseCase$getTxStatusFlow$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(c9767bbm, subscribeTxStatusWsUseCase$getTxStatusFlow$$inlined$map$1$2$1) == objCopydefault) {
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

        public Activity(Flow flow) {
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super C9767bbm> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
