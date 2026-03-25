package com.okinc.business.defi.biz.net.loader;

import com.okinc.business.defi.biz.net.bean.SingleTeeStatus;
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
public final class WalletLoader$getTeeWalletsStatus$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<SingleTeeStatus>>, Object> {
    final /* synthetic */ String $accountId;
    final /* synthetic */ boolean $eip7702Status;
    final /* synthetic */ boolean $needChainList;
    final /* synthetic */ String $teeId;
    final /* synthetic */ C13934dbu $this_runOrErrorResponse;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletLoader$getTeeWalletsStatus$2$1(C13934dbu c13934dbu, String str, String str2, boolean z, boolean z2, Continuation<? super WalletLoader$getTeeWalletsStatus$2$1> continuation) {
        super(2, continuation);
        this.$this_runOrErrorResponse = c13934dbu;
        this.$teeId = str;
        this.$accountId = str2;
        this.$eip7702Status = z;
        this.$needChainList = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletLoader$getTeeWalletsStatus$2$1(this.$this_runOrErrorResponse, this.$teeId, this.$accountId, this.$eip7702Status, this.$needChainList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<SingleTeeStatus>> continuation) {
        return ((WalletLoader$getTeeWalletsStatus$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC13915dbb interfaceC13915dbbEZpvd = this.$this_runOrErrorResponse.EZpvd();
            String str = this.$teeId;
            String str2 = this.$accountId;
            boolean z = this.$eip7702Status;
            boolean z2 = this.$needChainList;
            this.label = 1;
            obj = InterfaceC13915dbb.Application.getTeeStatus$default(interfaceC13915dbbEZpvd, str, str2, z, z2, null, this, 16, null);
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
