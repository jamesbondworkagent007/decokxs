package com.okinc.business.defi.wallet.home.addressDetail.data.resposity;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.eWB;

/* JADX INFO: loaded from: classes5.dex */
public final class ProfilePnlPrefsDataSource$currencyToggleFlow$2 extends SuspendLambda implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ eWB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePnlPrefsDataSource$currencyToggleFlow$2(eWB ewb, Continuation<? super ProfilePnlPrefsDataSource$currencyToggleFlow$2> continuation) {
        super(2, continuation);
        this.this$0 = ewb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ProfilePnlPrefsDataSource$currencyToggleFlow$2 profilePnlPrefsDataSource$currencyToggleFlow$2 = new ProfilePnlPrefsDataSource$currencyToggleFlow$2(this.this$0, continuation);
        profilePnlPrefsDataSource$currencyToggleFlow$2.L$0 = obj;
        return profilePnlPrefsDataSource$currencyToggleFlow$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
        return ((ProfilePnlPrefsDataSource$currencyToggleFlow$2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Boolean boolKWHzl = C56443yFo.KWHzl(this.this$0.KWHzl());
            this.label = 1;
            if (flowCollector.emit(boolKWHzl, this) == objCopydefault) {
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
