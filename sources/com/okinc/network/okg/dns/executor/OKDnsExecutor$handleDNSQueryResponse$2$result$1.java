package com.okinc.network.okg.dns.executor;

import com.okinc.network.okg.dns.model.DynamicCnameHostBean;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43365rns;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes9.dex */
public final class OKDnsExecutor$handleDNSQueryResponse$2$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ArrayList<C43365rns.Activity>>, Object> {
    final /* synthetic */ ArrayList<DynamicCnameHostBean> $dynamicResultList;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKDnsExecutor$handleDNSQueryResponse$2$result$1(ArrayList<DynamicCnameHostBean> arrayList, Continuation<? super OKDnsExecutor$handleDNSQueryResponse$2$result$1> continuation) {
        super(2, continuation);
        this.$dynamicResultList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKDnsExecutor$handleDNSQueryResponse$2$result$1(this.$dynamicResultList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ArrayList<C43365rns.Activity>> continuation) {
        return ((OKDnsExecutor$handleDNSQueryResponse$2$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C43365rns c43365rns = C43365rns.OLrzqt;
            ArrayList<DynamicCnameHostBean> arrayList = this.$dynamicResultList;
            this.label = 1;
            obj = c43365rns.copydefault(arrayList, this);
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
