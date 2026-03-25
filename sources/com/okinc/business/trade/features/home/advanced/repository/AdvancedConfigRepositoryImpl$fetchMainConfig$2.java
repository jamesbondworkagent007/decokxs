package com.okinc.business.trade.features.home.advanced.repository;

import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedMainConfig;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C28147kQq;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23234huQ;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedConfigRepositoryImpl$fetchMainConfig$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<List<? extends AdvancedMainConfig>>>, Object> {
    int label;
    final /* synthetic */ C28147kQq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedConfigRepositoryImpl$fetchMainConfig$2(C28147kQq c28147kQq, Continuation<? super AdvancedConfigRepositoryImpl$fetchMainConfig$2> continuation) {
        super(1, continuation);
        this.this$0 = c28147kQq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new AdvancedConfigRepositoryImpl$fetchMainConfig$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super ResponseData<List<? extends AdvancedMainConfig>>> continuation) {
        return invoke2((Continuation<? super ResponseData<List<AdvancedMainConfig>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super ResponseData<List<AdvancedMainConfig>>> continuation) {
        return ((AdvancedConfigRepositoryImpl$fetchMainConfig$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23234huQ interfaceC23234huQ = this.this$0.AEQbTJ;
            this.label = 1;
            obj = interfaceC23234huQ.EZpvd(this);
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
