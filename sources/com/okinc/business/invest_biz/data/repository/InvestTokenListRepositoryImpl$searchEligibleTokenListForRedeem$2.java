package com.okinc.business.invest_biz.data.repository;

import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25472ixP;
import o.iBL;
import o.iDB;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestTokenListRepositoryImpl$searchEligibleTokenListForRedeem$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends InvestTokenWithAmount>>, Object> {
    final /* synthetic */ long $investmentId;
    final /* synthetic */ String $searchTerm;
    final /* synthetic */ String $walletId;
    int label;
    final /* synthetic */ iDB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestTokenListRepositoryImpl$searchEligibleTokenListForRedeem$2(iDB idb, long j, String str, String str2, Continuation<? super InvestTokenListRepositoryImpl$searchEligibleTokenListForRedeem$2> continuation) {
        super(1, continuation);
        this.this$0 = idb;
        this.$investmentId = j;
        this.$walletId = str;
        this.$searchTerm = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new InvestTokenListRepositoryImpl$searchEligibleTokenListForRedeem$2(this.this$0, this.$investmentId, this.$walletId, this.$searchTerm, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends InvestTokenWithAmount>> continuation) {
        return invoke2((Continuation<? super List<InvestTokenWithAmount>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super List<InvestTokenWithAmount>> continuation) {
        return ((InvestTokenListRepositoryImpl$searchEligibleTokenListForRedeem$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC25472ixP interfaceC25472ixPOLrzqt = this.this$0.copydefault.OLrzqt();
            long j = this.$investmentId;
            String str = this.$walletId;
            String str2 = this.$searchTerm;
            this.label = 1;
            obj = interfaceC25472ixPOLrzqt.copydefault(j, str, str2, this);
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
