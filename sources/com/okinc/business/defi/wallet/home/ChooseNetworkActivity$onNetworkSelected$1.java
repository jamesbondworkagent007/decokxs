package com.okinc.business.defi.wallet.home;

import com.okinc.business.defi.wallet.bean.SelectedNetworkData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC12782ctV;
import o.C10614brl;
import o.C56391yDq;
import o.C56442yFn;
import o.eLT;

/* JADX INFO: loaded from: classes18.dex */
public final class ChooseNetworkActivity$onNetworkSelected$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SelectedNetworkData $networkData;
    int label;
    final /* synthetic */ eLT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseNetworkActivity$onNetworkSelected$1(SelectedNetworkData selectedNetworkData, eLT elt, Continuation<? super ChooseNetworkActivity$onNetworkSelected$1> continuation) {
        super(2, continuation);
        this.$networkData = selectedNetworkData;
        this.this$0 = elt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChooseNetworkActivity$onNetworkSelected$1(this.$networkData, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChooseNetworkActivity$onNetworkSelected$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strDbNXlk;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            ChooseNetworkActivity$onNetworkSelected$1$result$1 chooseNetworkActivity$onNetworkSelected$1$result$1 = new ChooseNetworkActivity$onNetworkSelected$1$result$1(null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, chooseNetworkActivity$onNetworkSelected$1$result$1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj;
        C10614brl instance$default = C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null);
        if (abstractC12782ctV == null || (strDbNXlk = abstractC12782ctV.DbNXlk()) == null) {
            return Unit.INSTANCE;
        }
        instance$default.KWHzl(strDbNXlk, String.valueOf(this.$networkData.copydefault()), String.valueOf(this.$networkData.KWHzl()), this.$networkData.AhwBna(), this.$networkData.EZpvd(), this.$networkData.AEQbTJ());
        this.this$0.finish();
        return Unit.INSTANCE;
    }
}
