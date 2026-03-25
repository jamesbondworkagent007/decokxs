package com.okinc.business.defi.biz.net.loader;

import com.okinc.business.defi.biz.net.bean.SyncRespBatch;
import com.okinc.business.defi.biz.net.bean.SyncWalletReqs;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C13894dbG;
import o.C13934dbu;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC13915dbb;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletLoader$syncWalletBatch$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<SyncRespBatch>>, Object> {
    final /* synthetic */ String $privKey;
    final /* synthetic */ String $pubKey;
    final /* synthetic */ SyncWalletReqs $reqs;
    final /* synthetic */ C13934dbu $this_runOrErrorResponse;
    final /* synthetic */ String $walletId;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletLoader$syncWalletBatch$2$1(C13934dbu c13934dbu, String str, String str2, String str3, SyncWalletReqs syncWalletReqs, Continuation<? super WalletLoader$syncWalletBatch$2$1> continuation) {
        super(2, continuation);
        this.$this_runOrErrorResponse = c13934dbu;
        this.$privKey = str;
        this.$walletId = str2;
        this.$pubKey = str3;
        this.$reqs = syncWalletReqs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletLoader$syncWalletBatch$2$1(this.$this_runOrErrorResponse, this.$privKey, this.$walletId, this.$pubKey, this.$reqs, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<SyncRespBatch>> continuation) {
        return ((WalletLoader$syncWalletBatch$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC13915dbb interfaceC13915dbbEZpvd = this.$this_runOrErrorResponse.EZpvd();
            C13894dbG c13894dbG = new C13894dbG(this.$privKey, this.$walletId, this.$pubKey);
            SyncWalletReqs syncWalletReqs = this.$reqs;
            this.label = 1;
            obj = interfaceC13915dbbEZpvd.KWHzl(c13894dbG, syncWalletReqs, this);
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
