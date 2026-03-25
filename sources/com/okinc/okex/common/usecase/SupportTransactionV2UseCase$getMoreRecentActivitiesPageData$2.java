package com.okinc.okex.common.usecase;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.center.bean.MoreTransactionListV2Response;
import com.okinc.okex.center.bean.enums.TransactionType;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModelV2;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C43401rob;
import o.C43422row;
import o.C44851sei;
import o.C44906sfk;
import o.C45351soE;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC44921sfz;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportTransactionV2UseCase$getMoreRecentActivitiesPageData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Pair<? extends Boolean, ? extends List<? extends TransactionDisplayModelV2>>>>, Object> {
    final /* synthetic */ int $page;
    final /* synthetic */ int $size;
    final /* synthetic */ TransactionType $type;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C45351soE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportTransactionV2UseCase$getMoreRecentActivitiesPageData$2(C45351soE c45351soE, int i, int i2, TransactionType transactionType, Continuation<? super SupportTransactionV2UseCase$getMoreRecentActivitiesPageData$2> continuation) {
        super(2, continuation);
        this.this$0 = c45351soE;
        this.$page = i;
        this.$size = i2;
        this.$type = transactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SupportTransactionV2UseCase$getMoreRecentActivitiesPageData$2 supportTransactionV2UseCase$getMoreRecentActivitiesPageData$2 = new SupportTransactionV2UseCase$getMoreRecentActivitiesPageData$2(this.this$0, this.$page, this.$size, this.$type, continuation);
        supportTransactionV2UseCase$getMoreRecentActivitiesPageData$2.L$0 = obj;
        return supportTransactionV2UseCase$getMoreRecentActivitiesPageData$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Pair<? extends Boolean, ? extends List<? extends TransactionDisplayModelV2>>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<? extends Pair<Boolean, ? extends List<TransactionDisplayModelV2>>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<? extends Pair<Boolean, ? extends List<TransactionDisplayModelV2>>>> continuation) {
        return ((SupportTransactionV2UseCase$getMoreRecentActivitiesPageData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C45351soE c45351soE = this.this$0;
                int i2 = this.$page;
                int i3 = this.$size;
                TransactionType transactionType = this.$type;
                String strOLrzqt = C44906sfk.OLrzqt.OLrzqt();
                InterfaceC44921sfz interfaceC44921sfz = c45351soE.AEQbTJ;
                Integer numAEQbTJ = C56443yFo.AEQbTJ(i2);
                Integer numAEQbTJ2 = C56443yFo.AEQbTJ(i3);
                this.label = 1;
                obj = interfaceC44921sfz.EZpvd(numAEQbTJ, numAEQbTJ2, transactionType, strOLrzqt, this);
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
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C44851sei.copydefault((MoreTransactionListV2Response) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl()));
        } else {
            if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd((Throwable) ((AbstractC43419rot.ActionBar) actionBar).KWHzl()));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
