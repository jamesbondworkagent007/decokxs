package com.okinc.im.imui.broadcastmessages.leavethischatdialog;

import com.okinc.im.imui.messageV2.model.StringResource;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.oCY;

/* JADX INFO: loaded from: classes8.dex */
public final class LeaveThisChatDialogFragmentViewModel$dismiss$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $doNotShowNextTime;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LeaveThisChatDialogFragmentViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaveThisChatDialogFragmentViewModel$dismiss$1(boolean z, LeaveThisChatDialogFragmentViewModel leaveThisChatDialogFragmentViewModel, Continuation<? super LeaveThisChatDialogFragmentViewModel$dismiss$1> continuation) {
        super(2, continuation);
        this.$doNotShowNextTime = z;
        this.this$0 = leaveThisChatDialogFragmentViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LeaveThisChatDialogFragmentViewModel$dismiss$1 leaveThisChatDialogFragmentViewModel$dismiss$1 = new LeaveThisChatDialogFragmentViewModel$dismiss$1(this.$doNotShowNextTime, this.this$0, continuation);
        leaveThisChatDialogFragmentViewModel$dismiss$1.L$0 = obj;
        return leaveThisChatDialogFragmentViewModel$dismiss$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LeaveThisChatDialogFragmentViewModel$dismiss$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z = this.$doNotShowNextTime;
            LeaveThisChatDialogFragmentViewModel leaveThisChatDialogFragmentViewModel = this.this$0;
            Result.Application application2 = Result.Companion;
            if (z) {
                oCY ocy = leaveThisChatDialogFragmentViewModel.EZpvd;
                this.label = 1;
                if (ocy.copydefault(this) == objCopydefault) {
                    return objCopydefault;
                }
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
                LeaveThisChatDialogFragmentViewModel leaveThisChatDialogFragmentViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableSharedFlow mutableSharedFlow = leaveThisChatDialogFragmentViewModel2.OLrzqt;
                    StringResource.Raw raw = new StringResource.Raw(thM7380exceptionOrNullimpl.getMessage());
                    this.L$0 = obj2;
                    this.label = 3;
                    if (mutableSharedFlow.emit(raw, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        obj2 = objM7377constructorimpl;
        LeaveThisChatDialogFragmentViewModel leaveThisChatDialogFragmentViewModel3 = this.this$0;
        if (Result.m7384isSuccessimpl(obj2)) {
            MutableSharedFlow mutableSharedFlow2 = leaveThisChatDialogFragmentViewModel3.AEQbTJ;
            Unit unit = Unit.INSTANCE;
            this.L$0 = obj2;
            this.label = 2;
            if (mutableSharedFlow2.emit(unit, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        LeaveThisChatDialogFragmentViewModel leaveThisChatDialogFragmentViewModel22 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
