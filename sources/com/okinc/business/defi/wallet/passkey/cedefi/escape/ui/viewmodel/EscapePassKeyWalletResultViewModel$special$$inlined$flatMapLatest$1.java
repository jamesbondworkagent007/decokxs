package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.viewmodel;

import com.okinc.business.defi.api.bean.passkeywallet.cedefi.OrderStatus;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C9767bbm;
import o.yHO;

/* JADX INFO: loaded from: classes5.dex */
public final class EscapePassKeyWalletResultViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements yHO<FlowCollector<? super Boolean>, C9767bbm, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ EscapePassKeyWalletResultViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EscapePassKeyWalletResultViewModel$special$$inlined$flatMapLatest$1(Continuation continuation, EscapePassKeyWalletResultViewModel escapePassKeyWalletResultViewModel) {
        super(3, continuation);
        this.this$0 = escapePassKeyWalletResultViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super Boolean> flowCollector, C9767bbm c9767bbm, Continuation<? super Unit> continuation) {
        EscapePassKeyWalletResultViewModel$special$$inlined$flatMapLatest$1 escapePassKeyWalletResultViewModel$special$$inlined$flatMapLatest$1 = new EscapePassKeyWalletResultViewModel$special$$inlined$flatMapLatest$1(continuation, this.this$0);
        escapePassKeyWalletResultViewModel$special$$inlined$flatMapLatest$1.L$0 = flowCollector;
        escapePassKeyWalletResultViewModel$special$$inlined$flatMapLatest$1.L$1 = c9767bbm;
        return escapePassKeyWalletResultViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Flow flowFlowOf;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            C9767bbm c9767bbm = (C9767bbm) this.L$1;
            long jValueOf = C33129mqd.valueOf(c9767bbm.EZpvd());
            boolean z = false;
            if (this.this$0.KWHzl.containsKey(C56443yFo.KWHzl(jValueOf))) {
                this.this$0.KWHzl.put(C56443yFo.KWHzl(jValueOf), C56443yFo.KWHzl(c9767bbm.OLrzqt() == OrderStatus.SUCCESS));
                Collection collectionValues = this.this$0.AEQbTJ().values();
                if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        if (!((Boolean) it.next()).booleanValue()) {
                            break;
                        }
                    }
                    z = true;
                    flowFlowOf = FlowKt.flowOf(C56443yFo.KWHzl(z));
                } else {
                    z = true;
                    flowFlowOf = FlowKt.flowOf(C56443yFo.KWHzl(z));
                }
            } else {
                flowFlowOf = FlowKt.flowOf(C56443yFo.KWHzl(false));
            }
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowFlowOf, this) == objCopydefault) {
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
