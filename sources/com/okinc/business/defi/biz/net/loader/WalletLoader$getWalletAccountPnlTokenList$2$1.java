package com.okinc.business.defi.biz.net.loader;

import com.okinc.business.defi.biz.net.bean.WalletPnlTokenListResponse;
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
public final class WalletLoader$getWalletAccountPnlTokenList$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<WalletPnlTokenListResponse>>, Object> {
    final /* synthetic */ String $accountId;
    final /* synthetic */ Long $chainIndex;
    final /* synthetic */ boolean $isAsc;
    final /* synthetic */ int $limit;
    final /* synthetic */ int $offset;
    final /* synthetic */ int $sortType;
    final /* synthetic */ C13934dbu $this_runOrErrorResponse;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletLoader$getWalletAccountPnlTokenList$2$1(C13934dbu c13934dbu, String str, Long l, int i, boolean z, int i2, int i3, Continuation<? super WalletLoader$getWalletAccountPnlTokenList$2$1> continuation) {
        super(2, continuation);
        this.$this_runOrErrorResponse = c13934dbu;
        this.$accountId = str;
        this.$chainIndex = l;
        this.$sortType = i;
        this.$isAsc = z;
        this.$offset = i2;
        this.$limit = i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletLoader$getWalletAccountPnlTokenList$2$1(this.$this_runOrErrorResponse, this.$accountId, this.$chainIndex, this.$sortType, this.$isAsc, this.$offset, this.$limit, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<WalletPnlTokenListResponse>> continuation) {
        return ((WalletLoader$getWalletAccountPnlTokenList$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC13915dbb interfaceC13915dbbEZpvd = this.$this_runOrErrorResponse.EZpvd();
            String str = this.$accountId;
            Long l = this.$chainIndex;
            int i2 = this.$sortType;
            boolean z = this.$isAsc;
            int i3 = this.$offset;
            int i4 = this.$limit;
            this.label = 1;
            obj = interfaceC13915dbbEZpvd.AEQbTJ(str, l, i2, z, i3, i4, this);
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
