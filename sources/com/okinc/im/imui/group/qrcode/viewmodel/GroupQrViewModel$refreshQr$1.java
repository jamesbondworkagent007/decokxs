package com.okinc.im.imui.group.qrcode.viewmodel;

import com.okinc.im.imui.group.qrcode.viewmodel.GroupQrViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C44124sEe;
import o.C56391yDq;
import o.C56442yFn;
import o.oDM;
import o.sOQ;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupQrViewModel$refreshQr$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $groupId;
    int label;
    final /* synthetic */ GroupQrViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupQrViewModel$refreshQr$1(GroupQrViewModel groupQrViewModel, long j, Continuation<? super GroupQrViewModel$refreshQr$1> continuation) {
        super(2, continuation);
        this.this$0 = groupQrViewModel;
        this.$groupId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupQrViewModel$refreshQr$1(this.this$0, this.$groupId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupQrViewModel$refreshQr$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            oDM odm = this.this$0.EZpvd;
            long j = this.$groupId;
            this.label = 1;
            obj = odm.copydefault(j, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        sOQ soq = (sOQ) obj;
        if (soq instanceof sOQ.Application) {
            GroupQrViewModel groupQrViewModel = this.this$0;
            long j2 = this.$groupId;
            this.label = 2;
            if (groupQrViewModel.copydefault(j2, true, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (!(soq instanceof sOQ.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            sOQ.Activity activity = (sOQ.Activity) soq;
            C44124sEe.AYXKKw("Error revoking past invites", activity.EZpvd());
            Throwable thEZpvd = activity.EZpvd();
            String message = activity.EZpvd().getMessage();
            if (message == null) {
                message = "Error";
            }
            GroupQrViewModel.TaskDescription.StateListAnimator stateListAnimator = new GroupQrViewModel.TaskDescription.StateListAnimator(thEZpvd, message);
            MutableStateFlow mutableStateFlow = this.this$0.KWHzl;
            this.label = 3;
            if (mutableStateFlow.emit(stateListAnimator, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
