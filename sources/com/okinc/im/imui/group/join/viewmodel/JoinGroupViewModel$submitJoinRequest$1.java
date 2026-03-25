package com.okinc.im.imui.group.join.viewmodel;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44124sEe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.oDN;
import o.sOA;

/* JADX INFO: loaded from: classes8.dex */
public final class JoinGroupViewModel$submitJoinRequest$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $reason;
    int label;
    final /* synthetic */ JoinGroupViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinGroupViewModel$submitJoinRequest$1(JoinGroupViewModel joinGroupViewModel, String str, Continuation<? super JoinGroupViewModel$submitJoinRequest$1> continuation) {
        super(2, continuation);
        this.this$0 = joinGroupViewModel;
        this.$reason = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new JoinGroupViewModel$submitJoinRequest$1(this.this$0, this.$reason, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((JoinGroupViewModel$submitJoinRequest$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C44124sEe.imLogGroup$default("JoinGroupViewModel=>submitJoinRequest: inviteId=" + this.this$0.djBIcL() + ", groupId=" + this.this$0.gEmmrt() + ", reason=" + this.$reason, null, 2, null);
            oDN odn = this.this$0.AuCTelauCTel;
            String strDjBIcL = this.this$0.djBIcL();
            long jGEmmrt = this.this$0.gEmmrt();
            String str = this.$reason;
            this.label = 1;
            obj = odn.OLrzqt(strDjBIcL, jGEmmrt, str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        sOA soa = (sOA) obj;
        C44124sEe.imLogGroup$default("JoinGroupViewModel=>submitJoinRequest: result=" + soa, null, 2, null);
        if (soa instanceof sOA.Application) {
            C44124sEe.imLogGroup$default("JoinGroupViewModel=>submitJoinRequest: Success, refreshing invite info", null, 2, null);
            JoinGroupViewModel.refreshInviteInfo$default(this.this$0, false, false, 3, null);
        } else {
            if (!(soa instanceof sOA.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            sOA.Activity activity = (sOA.Activity) soa;
            C44124sEe.AYXKKw("JoinGroupViewModel=>submitJoinRequest: Failed with code=" + activity.OLrzqt() + ", error=" + activity.EZpvd().getMessage(), activity.EZpvd());
            JoinGroupViewModel joinGroupViewModel = this.this$0;
            Integer numAEQbTJ = C56443yFo.AEQbTJ(activity.OLrzqt());
            Throwable thEZpvd = activity.EZpvd();
            this.label = 2;
            if (joinGroupViewModel.OLrzqt(numAEQbTJ, thEZpvd, (Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
