package com.okinc.business.defi.biz.net.loader;

import com.okinc.business.defi.biz.net.bean.WalletPnlShareInfoResponse;
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
public final class WalletLoader$getTokenShareInfo$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<WalletPnlShareInfoResponse>>, Object> {
    final /* synthetic */ String $accountId;
    final /* synthetic */ String $chainId;
    final /* synthetic */ C13934dbu $this_runOrErrorResponse;
    final /* synthetic */ String $tokenContractAddress;
    final /* synthetic */ String $walletAddress;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletLoader$getTokenShareInfo$2$1(C13934dbu c13934dbu, String str, String str2, String str3, String str4, Continuation<? super WalletLoader$getTokenShareInfo$2$1> continuation) {
        super(2, continuation);
        this.$this_runOrErrorResponse = c13934dbu;
        this.$chainId = str;
        this.$tokenContractAddress = str2;
        this.$accountId = str3;
        this.$walletAddress = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletLoader$getTokenShareInfo$2$1(this.$this_runOrErrorResponse, this.$chainId, this.$tokenContractAddress, this.$accountId, this.$walletAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<WalletPnlShareInfoResponse>> continuation) {
        return ((WalletLoader$getTokenShareInfo$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC13915dbb interfaceC13915dbbEZpvd = this.$this_runOrErrorResponse.EZpvd();
            String str = this.$chainId;
            String str2 = this.$tokenContractAddress;
            String str3 = this.$accountId;
            String str4 = this.$walletAddress;
            this.label = 1;
            obj = interfaceC13915dbbEZpvd.AEQbTJ(str, str2, str3, str4, this);
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
