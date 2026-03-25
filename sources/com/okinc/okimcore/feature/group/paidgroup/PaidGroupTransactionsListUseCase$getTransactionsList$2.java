package com.okinc.okimcore.feature.group.paidgroup;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.feature.group.repository.remote.InHouseIMGroupService;
import com.okinc.okimcore.model.remote.PaidGroupTransactionsListResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C43401rob;
import o.C43422row;
import o.C44266sJl;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class PaidGroupTransactionsListUseCase$getTransactionsList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends PaidGroupTransactionsListResponse, ? extends OKServerException>>, Object> {
    final /* synthetic */ long $groupId;
    final /* synthetic */ String $lastTransactionId;
    final /* synthetic */ Integer $pageSize;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44266sJl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaidGroupTransactionsListUseCase$getTransactionsList$2(C44266sJl c44266sJl, long j, String str, Integer num, Continuation<? super PaidGroupTransactionsListUseCase$getTransactionsList$2> continuation) {
        super(2, continuation);
        this.this$0 = c44266sJl;
        this.$groupId = j;
        this.$lastTransactionId = str;
        this.$pageSize = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PaidGroupTransactionsListUseCase$getTransactionsList$2 paidGroupTransactionsListUseCase$getTransactionsList$2 = new PaidGroupTransactionsListUseCase$getTransactionsList$2(this.this$0, this.$groupId, this.$lastTransactionId, this.$pageSize, continuation);
        paidGroupTransactionsListUseCase$getTransactionsList$2.L$0 = obj;
        return paidGroupTransactionsListUseCase$getTransactionsList$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends PaidGroupTransactionsListResponse, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<PaidGroupTransactionsListResponse, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<PaidGroupTransactionsListResponse, OKServerException>> continuation) {
        return ((PaidGroupTransactionsListUseCase$getTransactionsList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C44266sJl c44266sJl = this.this$0;
                long j = this.$groupId;
                String str = this.$lastTransactionId;
                Integer num = this.$pageSize;
                InHouseIMGroupService inHouseIMGroupService = c44266sJl.KWHzl;
                this.label = 1;
                obj = inHouseIMGroupService.getPaidGroupTransactionsList(j, str, num, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            ResponseData responseData = (ResponseData) obj;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }
}
