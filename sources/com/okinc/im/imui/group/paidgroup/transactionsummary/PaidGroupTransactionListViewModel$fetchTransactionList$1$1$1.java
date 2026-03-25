package com.okinc.im.imui.group.paidgroup.transactionsummary;

import com.okinc.im.imui.group.paidgroup.transactionsummary.PaidGroupTransactionListViewModel;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.remote.PaidGroupTransactionHistoryDetail;
import com.okinc.okimcore.model.remote.PaidGroupTransactionsListResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC43419rot;
import o.C33129mqd;
import o.C44157sFk;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.nZL;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class PaidGroupTransactionListViewModel$fetchTransactionList$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC43419rot<PaidGroupTransactionsListResponse, OKServerException> $result;
    int label;
    final /* synthetic */ PaidGroupTransactionListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaidGroupTransactionListViewModel$fetchTransactionList$1$1$1(AbstractC43419rot<PaidGroupTransactionsListResponse, OKServerException> abstractC43419rot, PaidGroupTransactionListViewModel paidGroupTransactionListViewModel, Continuation<? super PaidGroupTransactionListViewModel$fetchTransactionList$1$1$1> continuation) {
        super(2, continuation);
        this.$result = abstractC43419rot;
        this.this$0 = paidGroupTransactionListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaidGroupTransactionListViewModel$fetchTransactionList$1$1$1(this.$result, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PaidGroupTransactionListViewModel$fetchTransactionList$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x011c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String nickname;
        MutableSharedFlow mutableSharedFlow;
        PaidGroupTransactionListViewModel.StateListAnimator.TaskDescription taskDescription;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.EZpvd("PaidGroupTransactionListViewModel", "Transactions List fetched successfully");
            List<PaidGroupTransactionHistoryDetail> items = ((PaidGroupTransactionsListResponse) ((AbstractC43419rot.StateListAnimator) this.$result).KWHzl()).getItems();
            PaidGroupTransactionListViewModel paidGroupTransactionListViewModel = this.this$0;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(items, 10));
            for (PaidGroupTransactionHistoryDetail paidGroupTransactionHistoryDetail : items) {
                GroupMemberInfo groupMemberInfoOLrzqt = paidGroupTransactionListViewModel.AYXKKw.OLrzqt(C33129mqd.gEmmrt(paidGroupTransactionHistoryDetail.getGroupId()), C33129mqd.gEmmrt(paidGroupTransactionHistoryDetail.getMemberUid()));
                if (groupMemberInfoOLrzqt == null || (nickname = C44157sFk.EZpvd(groupMemberInfoOLrzqt)) == null) {
                    nickname = paidGroupTransactionHistoryDetail.getNickname();
                }
                arrayList.add(nZL.OLrzqt(paidGroupTransactionHistoryDetail.copy((3967 & 1) != 0 ? paidGroupTransactionHistoryDetail.transactionId : null, (3967 & 2) != 0 ? paidGroupTransactionHistoryDetail.groupId : null, (3967 & 4) != 0 ? paidGroupTransactionHistoryDetail.memberUid : null, (3967 & 8) != 0 ? paidGroupTransactionHistoryDetail.amount : null, (3967 & 16) != 0 ? paidGroupTransactionHistoryDetail.decimalPoint : null, (3967 & 32) != 0 ? paidGroupTransactionHistoryDetail.currencyId : null, (3967 & 64) != 0 ? paidGroupTransactionHistoryDetail.currencySymbol : null, (3967 & 128) != 0 ? paidGroupTransactionHistoryDetail.nickname : nickname, (3967 & 256) != 0 ? paidGroupTransactionHistoryDetail.createTime : null, (3967 & 512) != 0 ? paidGroupTransactionHistoryDetail.updateTime : null, (3967 & 1024) != 0 ? paidGroupTransactionHistoryDetail.transactionStatus : null, (3967 & 2048) != 0 ? paidGroupTransactionHistoryDetail.paymentTime : null), groupMemberInfoOLrzqt != null ? groupMemberInfoOLrzqt.getAvatar() : null));
            }
            this.this$0.valueOf.addAll(arrayList);
            MutableStateFlow mutableStateFlow = this.this$0.copydefault;
            Boolean boolKWHzl = C56443yFo.KWHzl(((PaidGroupTransactionsListResponse) ((AbstractC43419rot.StateListAnimator) this.$result).KWHzl()).getHasOlderRecords());
            this.label = 1;
            if (mutableStateFlow.emit(boolKWHzl, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow = this.this$0.AEQbTJ;
                taskDescription = new PaidGroupTransactionListViewModel.StateListAnimator.TaskDescription(this.this$0.valueOf);
                this.label = 3;
                if (mutableSharedFlow.emit(taskDescription, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (!((PaidGroupTransactionsListResponse) ((AbstractC43419rot.StateListAnimator) this.$result).KWHzl()).getItems().isEmpty()) {
            MutableStateFlow mutableStateFlow2 = this.this$0.EZpvd;
            PaidGroupTransactionListViewModel.Application.C0449Application c0449Application = PaidGroupTransactionListViewModel.Application.C0449Application.AEQbTJ;
            this.label = 2;
            if (mutableStateFlow2.emit(c0449Application, this) == objCopydefault) {
                return objCopydefault;
            }
            mutableSharedFlow = this.this$0.AEQbTJ;
            taskDescription = new PaidGroupTransactionListViewModel.StateListAnimator.TaskDescription(this.this$0.valueOf);
            this.label = 3;
            if (mutableSharedFlow.emit(taskDescription, this) == objCopydefault) {
            }
            return Unit.INSTANCE;
        }
        MutableStateFlow mutableStateFlow3 = this.this$0.EZpvd;
        PaidGroupTransactionListViewModel.Application.StateListAnimator stateListAnimator = PaidGroupTransactionListViewModel.Application.StateListAnimator.KWHzl;
        this.label = 4;
        if (mutableStateFlow3.emit(stateListAnimator, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
