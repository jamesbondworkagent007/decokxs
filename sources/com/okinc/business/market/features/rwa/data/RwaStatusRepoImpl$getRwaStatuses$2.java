package com.okinc.business.market.features.rwa.data;

import com.okinc.business.market.data.model.TagMetaData;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C29161koS;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27595jyE;

/* JADX INFO: loaded from: classes7.dex */
public final class RwaStatusRepoImpl$getRwaStatuses$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<List<? extends TagMetaData>>>, Object> {
    final /* synthetic */ String $rwaPlatformId;
    int label;
    final /* synthetic */ C29161koS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RwaStatusRepoImpl$getRwaStatuses$2(C29161koS c29161koS, String str, Continuation<? super RwaStatusRepoImpl$getRwaStatuses$2> continuation) {
        super(1, continuation);
        this.this$0 = c29161koS;
        this.$rwaPlatformId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new RwaStatusRepoImpl$getRwaStatuses$2(this.this$0, this.$rwaPlatformId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super ResponseData<List<? extends TagMetaData>>> continuation) {
        return invoke2((Continuation<? super ResponseData<List<TagMetaData>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super ResponseData<List<TagMetaData>>> continuation) {
        return ((RwaStatusRepoImpl$getRwaStatuses$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC27595jyE interfaceC27595jyE = this.this$0.KWHzl;
            String str = this.$rwaPlatformId;
            this.label = 1;
            obj = interfaceC27595jyE.copydefault(str, this);
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
