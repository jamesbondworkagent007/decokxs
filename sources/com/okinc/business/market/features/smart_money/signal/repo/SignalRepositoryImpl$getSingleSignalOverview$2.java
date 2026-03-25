package com.okinc.business.market.features.smart_money.signal.repo;

import com.okinc.business.market.data.model.smart_money.SignalOverviewResponse;
import com.okinc.network.okg.response.ResponseData;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C29467kuG;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.InterfaceC27595jyE;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalRepositoryImpl$getSingleSignalOverview$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<SignalOverviewResponse>>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenContractAddress;
    int label;
    final /* synthetic */ C29467kuG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalRepositoryImpl$getSingleSignalOverview$2(C29467kuG c29467kuG, String str, String str2, Continuation<? super SignalRepositoryImpl$getSingleSignalOverview$2> continuation) {
        super(1, continuation);
        this.this$0 = c29467kuG;
        this.$chainId = str;
        this.$tokenContractAddress = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new SignalRepositoryImpl$getSingleSignalOverview$2(this.this$0, this.$chainId, this.$tokenContractAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<SignalOverviewResponse>> continuation) {
        return ((SignalRepositoryImpl$getSingleSignalOverview$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC27595jyE interfaceC27595jyE = this.this$0.OLrzqt;
            Map<String, String> mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("chainId", this.$chainId), C56390yDp.OLrzqt("tokenContractAddress", this.$tokenContractAddress));
            this.label = 1;
            obj = interfaceC27595jyE.gEmmrt(mapGEmmrt, this);
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
