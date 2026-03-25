package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.viewmodel;

import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter.EscapedStatusUIData;
import kotlin.Result;
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
public final class EscapePassKeyWalletStatusViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements yHO<FlowCollector<? super Result<? extends EscapedStatusUIData>>, C9767bbm, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ EscapePassKeyWalletStatusViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EscapePassKeyWalletStatusViewModel$special$$inlined$flatMapLatest$1(Continuation continuation, EscapePassKeyWalletStatusViewModel escapePassKeyWalletStatusViewModel) {
        super(3, continuation);
        this.this$0 = escapePassKeyWalletStatusViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super Result<? extends EscapedStatusUIData>> flowCollector, C9767bbm c9767bbm, Continuation<? super Unit> continuation) {
        EscapePassKeyWalletStatusViewModel$special$$inlined$flatMapLatest$1 escapePassKeyWalletStatusViewModel$special$$inlined$flatMapLatest$1 = new EscapePassKeyWalletStatusViewModel$special$$inlined$flatMapLatest$1(continuation, this.this$0);
        escapePassKeyWalletStatusViewModel$special$$inlined$flatMapLatest$1.L$0 = flowCollector;
        escapePassKeyWalletStatusViewModel$special$$inlined$flatMapLatest$1.L$1 = c9767bbm;
        return escapePassKeyWalletStatusViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        Flow flowFlowOf;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            if (this.this$0.EZpvd().contains(C56443yFo.KWHzl(C33129mqd.valueOf(((C9767bbm) this.L$1).EZpvd())))) {
                EscapePassKeyWalletStatusViewModel escapePassKeyWalletStatusViewModel = this.this$0;
                this.L$0 = flowCollector;
                this.label = 1;
                obj = escapePassKeyWalletStatusViewModel.AEQbTJ((Continuation<? super Flow<Result<EscapedStatusUIData>>>) this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                flowFlowOf = FlowKt.flowOf((Object) null);
                this.L$0 = null;
                this.label = 2;
                if (FlowKt.emitAll(flowCollector, flowFlowOf, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        flowFlowOf = (Flow) obj;
        this.L$0 = null;
        this.label = 2;
        if (FlowKt.emitAll(flowCollector, flowFlowOf, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
