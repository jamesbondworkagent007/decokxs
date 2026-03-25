package com.okinc.business.invest_biz.data.repository;

import com.okinc.business.invest_biz.data.bean.SearchHeaderInfoResponse;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23634iDq;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25472ixP;
import o.iBL;

/* JADX INFO: loaded from: classes6.dex */
public final class DexEntranceUseRepositoryImpl$getDexEarnEntranceHeader$2 extends SuspendLambda implements Function1<Continuation<? super SearchHeaderInfoResponse>, Object> {
    final /* synthetic */ long $chainId;
    final /* synthetic */ String $tokenAddress;
    int label;
    final /* synthetic */ C23634iDq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexEntranceUseRepositoryImpl$getDexEarnEntranceHeader$2(C23634iDq c23634iDq, long j, String str, Continuation<? super DexEntranceUseRepositoryImpl$getDexEarnEntranceHeader$2> continuation) {
        super(1, continuation);
        this.this$0 = c23634iDq;
        this.$chainId = j;
        this.$tokenAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DexEntranceUseRepositoryImpl$getDexEarnEntranceHeader$2(this.this$0, this.$chainId, this.$tokenAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super SearchHeaderInfoResponse> continuation) {
        return ((DexEntranceUseRepositoryImpl$getDexEarnEntranceHeader$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC25472ixP interfaceC25472ixPOLrzqt = this.this$0.OLrzqt.OLrzqt();
            long j = this.$chainId;
            String str = this.$tokenAddress;
            this.label = 1;
            obj = interfaceC25472ixPOLrzqt.copydefault(j, str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        Object objUnwrapResponseData$default = iBL.unwrapResponseData$default((ResponseData) obj, null, 1, null);
        Intrinsics.copydefault(objUnwrapResponseData$default);
        return objUnwrapResponseData$default;
    }
}
