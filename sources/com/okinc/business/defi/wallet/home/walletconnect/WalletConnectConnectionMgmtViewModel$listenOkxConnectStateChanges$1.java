package com.okinc.business.defi.wallet.home.walletconnect;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C16061ecn;
import o.C18345fge;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletConnectConnectionMgmtViewModel$listenOkxConnectStateChanges$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C18345fge this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletConnectConnectionMgmtViewModel$listenOkxConnectStateChanges$1(C18345fge c18345fge, Continuation<? super WalletConnectConnectionMgmtViewModel$listenOkxConnectStateChanges$1> continuation) {
        super(2, continuation);
        this.this$0 = c18345fge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletConnectConnectionMgmtViewModel$listenOkxConnectStateChanges$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletConnectConnectionMgmtViewModel$listenOkxConnectStateChanges$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow<C16061ecn> flowKWHzl = this.this$0.EZpvd.KWHzl();
            final C18345fge c18345fge = this.this$0;
            FlowCollector<? super C16061ecn> flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.wallet.home.walletconnect.WalletConnectConnectionMgmtViewModel$listenOkxConnectStateChanges$1.2
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: kotlinx.coroutines.flow.MutableStateFlow */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                public final Object emit(C16061ecn c16061ecn, Continuation<? super Unit> continuation) {
                    ArrayList arrayList;
                    Object value;
                    if (c16061ecn.EZpvd()) {
                        List<WalletConnectedData> value2 = c18345fge.copydefault().getValue();
                        if (value2 != null) {
                            arrayList = new ArrayList();
                            for (T t : value2) {
                                if (!Intrinsics.EZpvd((Object) ((WalletConnectedData) t).getTopicOrClientId(), (Object) c16061ecn.copydefault())) {
                                    arrayList.add(t);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        MutableStateFlow mutableStateFlow = c18345fge.copydefault;
                        do {
                            value = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.compareAndSet(value, arrayList));
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowKWHzl.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
