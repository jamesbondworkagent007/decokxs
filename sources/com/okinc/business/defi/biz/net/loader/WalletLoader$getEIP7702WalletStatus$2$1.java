package com.okinc.business.defi.biz.net.loader;

import com.okinc.business.defi.biz.net.bean.EIP7702WalletStatusReq;
import com.okinc.business.defi.biz.net.bean.EIP7702WalletStatusResp;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
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
public final class WalletLoader$getEIP7702WalletStatus$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<List<? extends EIP7702WalletStatusResp>>>, Object> {
    final /* synthetic */ C13934dbu $this_runOrErrorResponse;
    final /* synthetic */ List<String> $walletIds;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletLoader$getEIP7702WalletStatus$2$1(C13934dbu c13934dbu, List<String> list, Continuation<? super WalletLoader$getEIP7702WalletStatus$2$1> continuation) {
        super(2, continuation);
        this.$this_runOrErrorResponse = c13934dbu;
        this.$walletIds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletLoader$getEIP7702WalletStatus$2$1(this.$this_runOrErrorResponse, this.$walletIds, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<List<? extends EIP7702WalletStatusResp>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super ResponseData<List<EIP7702WalletStatusResp>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super ResponseData<List<EIP7702WalletStatusResp>>> continuation) {
        return ((WalletLoader$getEIP7702WalletStatus$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC13915dbb interfaceC13915dbbEZpvd = this.$this_runOrErrorResponse.EZpvd();
            EIP7702WalletStatusReq eIP7702WalletStatusReq = new EIP7702WalletStatusReq(this.$walletIds);
            this.label = 1;
            obj = interfaceC13915dbbEZpvd.OLrzqt(eIP7702WalletStatusReq, this);
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
