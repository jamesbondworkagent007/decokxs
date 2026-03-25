package com.okinc.business.defi.wallet.eip7702.ui.viewmodel;

import com.okinc.business.defi.biz.net.bean.EIP7702ChainStatusResp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.eCH;

/* JADX INFO: loaded from: classes5.dex */
public final class EIP7702UpgradeViewModel$init$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EIP7702ChainStatusResp.ChainStatusItem $chainStatusItem;
    int label;
    final /* synthetic */ eCH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EIP7702UpgradeViewModel$init$1(eCH ech, EIP7702ChainStatusResp.ChainStatusItem chainStatusItem, Continuation<? super EIP7702UpgradeViewModel$init$1> continuation) {
        super(2, continuation);
        this.this$0 = ech;
        this.$chainStatusItem = chainStatusItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EIP7702UpgradeViewModel$init$1(this.this$0, this.$chainStatusItem, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EIP7702UpgradeViewModel$init$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow = this.this$0.AEQbTJ;
            EIP7702ChainStatusResp.ChainStatusItem chainStatusItem = this.$chainStatusItem;
            this.label = 1;
            if (mutableSharedFlow.emit(chainStatusItem, this) == objCopydefault) {
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
