package com.okinc.business.defi.wallet.common.okxconnect.network;

import com.okinc.core.livelistener.OKWsConnectionState;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C16000ebf;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXConnectNetworkUtils$startObservingWsConnection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C16000ebf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXConnectNetworkUtils$startObservingWsConnection$1(C16000ebf c16000ebf, Continuation<? super OKXConnectNetworkUtils$startObservingWsConnection$1> continuation) {
        super(2, continuation);
        this.this$0 = c16000ebf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKXConnectNetworkUtils$startObservingWsConnection$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKXConnectNetworkUtils$startObservingWsConnection$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.EZpvd("OKXConnectNetworkUtils", "startObservingWsConnection");
            MutableSharedFlow mutableSharedFlow = this.this$0.getNewProxyInstance;
            final C16000ebf c16000ebf = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$startObservingWsConnection$1.3

                /* JADX INFO: renamed from: com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$startObservingWsConnection$1$3$Activity */
                public final /* synthetic */ class Activity {
                    public static final /* synthetic */ int[] OLrzqt;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    static {
                        int[] iArr = new int[OKWsConnectionState.values().length];
                        try {
                            iArr[OKWsConnectionState.OPEN.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[OKWsConnectionState.CLOSED.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[OKWsConnectionState.FAILURE.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        OLrzqt = iArr;
                    }
                }

                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: kotlinx.coroutines.flow.MutableStateFlow */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public final Object emit(OKWsConnectionState oKWsConnectionState, Continuation<? super Unit> continuation) {
                    Object value;
                    int i2 = Activity.OLrzqt[oKWsConnectionState.ordinal()];
                    if (i2 == 1) {
                        c16000ebf.isConnected();
                    } else {
                        if (i2 != 2 && i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        MutableStateFlow mutableStateFlow = c16000ebf.AYXKKw;
                        do {
                            value = mutableStateFlow.getValue();
                            ((Boolean) value).booleanValue();
                        } while (!mutableStateFlow.compareAndSet(value, C56443yFo.KWHzl(false)));
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (mutableSharedFlow.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
