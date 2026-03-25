package com.okinc.business.defi.biz.net.loader;

import com.okinc.business.defi.biz.net.bean.TeeAnd7702WalletStatusReq;
import com.okinc.business.defi.biz.net.bean.TeeAnd7702WalletStatusResp;
import com.okinc.business.defi.biz.net.bean.TeeAndEip7702Item;
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
public final class WalletLoader$getTeeAnd7702WalletsStatus$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<TeeAnd7702WalletStatusResp>>, Object> {
    final /* synthetic */ boolean $eip7702Status;
    final /* synthetic */ List<TeeAndEip7702Item> $reqs;
    final /* synthetic */ C13934dbu $this_runOrErrorResponse;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletLoader$getTeeAnd7702WalletsStatus$2$1(C13934dbu c13934dbu, boolean z, List<TeeAndEip7702Item> list, Continuation<? super WalletLoader$getTeeAnd7702WalletsStatus$2$1> continuation) {
        super(2, continuation);
        this.$this_runOrErrorResponse = c13934dbu;
        this.$eip7702Status = z;
        this.$reqs = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletLoader$getTeeAnd7702WalletsStatus$2$1(this.$this_runOrErrorResponse, this.$eip7702Status, this.$reqs, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<TeeAnd7702WalletStatusResp>> continuation) {
        return ((WalletLoader$getTeeAnd7702WalletsStatus$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC13915dbb interfaceC13915dbbEZpvd = this.$this_runOrErrorResponse.EZpvd();
            TeeAnd7702WalletStatusReq teeAnd7702WalletStatusReq = new TeeAnd7702WalletStatusReq(this.$eip7702Status, this.$reqs);
            this.label = 1;
            obj = InterfaceC13915dbb.Application.getTeeAnd7702WalletsStatusBatch$default(interfaceC13915dbbEZpvd, teeAnd7702WalletStatusReq, null, this, 2, null);
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
