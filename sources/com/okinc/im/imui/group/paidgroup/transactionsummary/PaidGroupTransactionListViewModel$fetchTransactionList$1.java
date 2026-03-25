package com.okinc.im.imui.group.paidgroup.transactionsummary;

import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.group.paidgroup.transactionsummary.PaidGroupTransactionListViewModel;
import com.okinc.network.okg.response.OKServerException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC43419rot;
import o.C44266sJl;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class PaidGroupTransactionListViewModel$fetchTransactionList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $lastTransactionId;
    final /* synthetic */ Integer $pageSize;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PaidGroupTransactionListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaidGroupTransactionListViewModel$fetchTransactionList$1(PaidGroupTransactionListViewModel paidGroupTransactionListViewModel, String str, Integer num, Continuation<? super PaidGroupTransactionListViewModel$fetchTransactionList$1> continuation) {
        super(2, continuation);
        this.this$0 = paidGroupTransactionListViewModel;
        this.$lastTransactionId = str;
        this.$pageSize = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PaidGroupTransactionListViewModel$fetchTransactionList$1 paidGroupTransactionListViewModel$fetchTransactionList$1 = new PaidGroupTransactionListViewModel$fetchTransactionList$1(this.this$0, this.$lastTransactionId, this.$pageSize, continuation);
        paidGroupTransactionListViewModel$fetchTransactionList$1.L$0 = obj;
        return paidGroupTransactionListViewModel$fetchTransactionList$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PaidGroupTransactionListViewModel$fetchTransactionList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        PaidGroupTransactionListViewModel paidGroupTransactionListViewModel;
        Object objLaunch$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            paidGroupTransactionListViewModel = this.this$0;
            String str = this.$lastTransactionId;
            Integer num = this.$pageSize;
            Result.Application application2 = Result.Companion;
            C44266sJl c44266sJl = paidGroupTransactionListViewModel.gEmmrt;
            long jAhwBna = paidGroupTransactionListViewModel.AhwBna();
            this.L$0 = paidGroupTransactionListViewModel;
            this.label = 1;
            obj = c44266sJl.copydefault(jAhwBna, str, num, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objLaunch$default = Unit.INSTANCE;
                Result.m7377constructorimpl(objLaunch$default);
                return Unit.INSTANCE;
            }
            paidGroupTransactionListViewModel = (PaidGroupTransactionListViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            pUU.copydefault("PaidGroupTransactionListViewModel", "API Error: " + ((OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()).getMessage());
            MutableStateFlow mutableStateFlow = paidGroupTransactionListViewModel.EZpvd;
            PaidGroupTransactionListViewModel.Application.ActionBar actionBar = PaidGroupTransactionListViewModel.Application.ActionBar.KWHzl;
            this.L$0 = null;
            this.label = 2;
            if (mutableStateFlow.emit(actionBar, this) == objCopydefault) {
                return objCopydefault;
            }
            objLaunch$default = Unit.INSTANCE;
            Result.m7377constructorimpl(objLaunch$default);
            return Unit.INSTANCE;
        }
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            objLaunch$default = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(paidGroupTransactionListViewModel), null, null, new PaidGroupTransactionListViewModel$fetchTransactionList$1$1$1(abstractC43419rot, paidGroupTransactionListViewModel, null), 3, null);
            Result.m7377constructorimpl(objLaunch$default);
            return Unit.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
