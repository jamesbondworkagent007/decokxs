package com.okinc.business.defi.biz.net.loader;

import com.okinc.business.defi.biz.net.bean.CoinInfoBean;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C13934dbu;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC13915dbb;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletLoader$getAddressCoinInformation$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<CoinInfoBean>>, Object> {
    final /* synthetic */ long $chainId;
    final /* synthetic */ C13934dbu $this_runOptionalOrErrorResponse;
    final /* synthetic */ String $tokenAddress;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletLoader$getAddressCoinInformation$2$1(C13934dbu c13934dbu, long j, String str, Continuation<? super WalletLoader$getAddressCoinInformation$2$1> continuation) {
        super(2, continuation);
        this.$this_runOptionalOrErrorResponse = c13934dbu;
        this.$chainId = j;
        this.$tokenAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletLoader$getAddressCoinInformation$2$1(this.$this_runOptionalOrErrorResponse, this.$chainId, this.$tokenAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<CoinInfoBean>> continuation) {
        return ((WalletLoader$getAddressCoinInformation$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC13915dbb interfaceC13915dbbEZpvd = this.$this_runOptionalOrErrorResponse.EZpvd();
            long j = this.$chainId;
            String str = this.$tokenAddress;
            this.label = 1;
            obj = interfaceC13915dbbEZpvd.copydefault(j, str, this);
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
