package com.okinc.business.market.features.smart_money.signal.repo;

import com.okinc.business.market.data.model.smart_money.SignalAlertResponse;
import com.okinc.network.okg.response.ResponseData;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C29467kuG;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.InterfaceC27595jyE;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalRepositoryImpl$getSignalAlerts$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<SignalAlertResponse>>, Object> {
    final /* synthetic */ String $walletAddress;
    int label;
    final /* synthetic */ C29467kuG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalRepositoryImpl$getSignalAlerts$2(String str, C29467kuG c29467kuG, Continuation<? super SignalRepositoryImpl$getSignalAlerts$2> continuation) {
        super(1, continuation);
        this.$walletAddress = str;
        this.this$0 = c29467kuG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new SignalRepositoryImpl$getSignalAlerts$2(this.$walletAddress, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<SignalAlertResponse>> continuation) {
        return ((SignalRepositoryImpl$getSignalAlerts$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Map<String, Object> mapEZpvd = C56423yEv.EZpvd(C56390yDp.OLrzqt("walletAddress", this.$walletAddress));
            InterfaceC27595jyE interfaceC27595jyE = this.this$0.OLrzqt;
            this.label = 1;
            obj = interfaceC27595jyE.AEQbTJ(mapEZpvd, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
