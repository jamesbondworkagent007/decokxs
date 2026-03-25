package com.okinc.im.imui.group.create.viewmodel;

import com.okinc.im.imui.group.create.viewmodel.SelectMembershipFeeViewModel;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C44264sJj;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.sOZ;

/* JADX INFO: loaded from: classes8.dex */
public final class SelectMembershipFeeViewModel$loadBillingConfig$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SelectMembershipFeeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectMembershipFeeViewModel$loadBillingConfig$1(SelectMembershipFeeViewModel selectMembershipFeeViewModel, Continuation<? super SelectMembershipFeeViewModel$loadBillingConfig$1> continuation) {
        super(2, continuation);
        this.this$0 = selectMembershipFeeViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SelectMembershipFeeViewModel$loadBillingConfig$1 selectMembershipFeeViewModel$loadBillingConfig$1 = new SelectMembershipFeeViewModel$loadBillingConfig$1(this.this$0, continuation);
        selectMembershipFeeViewModel$loadBillingConfig$1.L$0 = obj;
        return selectMembershipFeeViewModel$loadBillingConfig$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SelectMembershipFeeViewModel$loadBillingConfig$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object obj2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SelectMembershipFeeViewModel selectMembershipFeeViewModel = this.this$0;
            Result.Application application2 = Result.Companion;
            C44264sJj c44264sJj = selectMembershipFeeViewModel.AhwBna;
            this.label = 1;
            obj = c44264sJj.copydefault(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                SelectMembershipFeeViewModel selectMembershipFeeViewModel2 = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                    List list = (List) obj2;
                    selectMembershipFeeViewModel2.OLrzqt.setValue(list);
                    SelectMembershipFeeViewModel.ActionBar.Application application3 = new SelectMembershipFeeViewModel.ActionBar.Application(list);
                    MutableSharedFlow mutableSharedFlow = selectMembershipFeeViewModel2.gEmmrt;
                    this.L$0 = obj2;
                    this.label = 3;
                    if (mutableSharedFlow.emit(application3, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        sOZ soz = (sOZ) obj;
        if (soz instanceof sOZ.Activity) {
            objM7377constructorimpl = Result.m7377constructorimpl(((sOZ.Activity) soz).EZpvd().getSupportedCurrencies());
            obj2 = objM7377constructorimpl;
            SelectMembershipFeeViewModel selectMembershipFeeViewModel3 = this.this$0;
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("SelectMembershipFeeViewModel", "Failed to load billing config", thM7380exceptionOrNullimpl);
                String message = thM7380exceptionOrNullimpl.getMessage();
                if (message != null && (!StringsKt__StringsKt.fARcdN((CharSequence) message))) {
                    SelectMembershipFeeViewModel.ActionBar.TaskDescription taskDescription = new SelectMembershipFeeViewModel.ActionBar.TaskDescription(message);
                    MutableSharedFlow mutableSharedFlow2 = selectMembershipFeeViewModel3.gEmmrt;
                    this.L$0 = obj2;
                    this.label = 2;
                    if (mutableSharedFlow2.emit(taskDescription, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            }
            SelectMembershipFeeViewModel selectMembershipFeeViewModel22 = this.this$0;
            if (Result.m7384isSuccessimpl(obj2)) {
            }
            return Unit.INSTANCE;
        }
        if (!(soz instanceof sOZ.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        throw ((sOZ.ActionBar) soz).copydefault();
    }
}
