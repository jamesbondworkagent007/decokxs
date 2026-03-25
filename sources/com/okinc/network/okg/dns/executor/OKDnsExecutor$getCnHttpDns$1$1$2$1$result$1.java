package com.okinc.network.okg.dns.executor;

import com.okinc.network.okg.dns.DohPingInfo;
import com.okinc.network.okg.dns.model.CnDecryptionNode;
import com.okinc.network.okg.dns.model.CnDnsEncryption;
import com.okinc.network.okg.response.BaseResp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43365rns;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes9.dex */
public final class OKDnsExecutor$getCnHttpDns$1$1$2$1$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DohPingInfo>, Object> {
    final /* synthetic */ BaseResp<CnDnsEncryption> $bean;
    final /* synthetic */ CnDecryptionNode $it;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKDnsExecutor$getCnHttpDns$1$1$2$1$result$1(BaseResp<CnDnsEncryption> baseResp, CnDecryptionNode cnDecryptionNode, Continuation<? super OKDnsExecutor$getCnHttpDns$1$1$2$1$result$1> continuation) {
        super(2, continuation);
        this.$bean = baseResp;
        this.$it = cnDecryptionNode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKDnsExecutor$getCnHttpDns$1$1$2$1$result$1(this.$bean, this.$it, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DohPingInfo> continuation) {
        return ((OKDnsExecutor$getCnHttpDns$1$1$2$1$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CnDnsEncryption cnDnsEncryption;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            BaseResp<CnDnsEncryption> baseResp = this.$bean;
            int delay = (baseResp == null || (cnDnsEncryption = baseResp.data) == null) ? -1 : cnDnsEncryption.getDelay();
            C43365rns c43365rns = C43365rns.OLrzqt;
            CnDecryptionNode cnDecryptionNode = this.$it;
            this.label = 1;
            obj = c43365rns.AEQbTJ(cnDecryptionNode, delay, this);
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
