package com.okinc.im.usecase.group.invite;

import com.okinc.im.usecase.group.invite.CheckIsAllowGroupInvitationUseCase;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC31257lqc;
import o.nTM;
import o.oDL;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class CheckIsAllowGroupInvitationUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus>, Object> {
    final /* synthetic */ String $invitationId;
    int label;
    final /* synthetic */ CheckIsAllowGroupInvitationUseCase this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckIsAllowGroupInvitationUseCase$execute$2(String str, CheckIsAllowGroupInvitationUseCase checkIsAllowGroupInvitationUseCase, Continuation<? super CheckIsAllowGroupInvitationUseCase$execute$2> continuation) {
        super(2, continuation);
        this.$invitationId = str;
        this.this$0 = checkIsAllowGroupInvitationUseCase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheckIsAllowGroupInvitationUseCase$execute$2(this.$invitationId, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus> continuation) {
        return ((CheckIsAllowGroupInvitationUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus checkIsAllGroupInvitationStatus;
        CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus checkIsAllGroupInvitationStatus2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$invitationId != null) {
                oDL odl = this.this$0.KWHzl;
                String str = this.$invitationId;
                this.label = 1;
                obj = odl.copydefault(str, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                return new CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus(CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus.Status.UNKNOWN, null, 2, null);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        oDL.ActionBar actionBar = (oDL.ActionBar) obj;
        if (actionBar instanceof oDL.ActionBar.Activity) {
            oDL.ActionBar.Activity activity = (oDL.ActionBar.Activity) actionBar;
            int iEZpvd = activity.EZpvd();
            if (iEZpvd == 2013) {
                checkIsAllGroupInvitationStatus2 = new CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus(CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus.Status.GROUP_DISBANDED, null, 2, null);
            } else if (iEZpvd == 2016) {
                checkIsAllGroupInvitationStatus2 = new CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus(CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus.Status.BEING_KICKED, null, 2, null);
            } else if (iEZpvd == 2026) {
                checkIsAllGroupInvitationStatus2 = new CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus(CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus.Status.COR_RESTRICTED, null, 2, null);
            } else {
                throw activity.KWHzl();
            }
        } else {
            if (!(actionBar instanceof oDL.ActionBar.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            oDL.ActionBar.Application application = (oDL.ActionBar.Application) actionBar;
            long jValueOf = application.EZpvd().valueOf();
            if (nTM.copydefault(application.EZpvd())) {
                checkIsAllGroupInvitationStatus = new CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus(CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus.Status.PENDING_APPROVAL, C56443yFo.KWHzl(jValueOf));
            } else if (application.EZpvd().copydefault()) {
                checkIsAllGroupInvitationStatus = new CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus(CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus.Status.VIEW_GROUP, C56443yFo.KWHzl(jValueOf));
            } else if (nTM.valueOf(application.EZpvd()) && !((InterfaceC31257lqc) C43251rlk.copydefault(InterfaceC31257lqc.class)).AEQbTJ()) {
                checkIsAllGroupInvitationStatus = new CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus(CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus.Status.MISSING_PAY_FUNCTION, C56443yFo.KWHzl(jValueOf));
            } else {
                checkIsAllGroupInvitationStatus = new CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus(CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus.Status.JOIN_GROUP, C56443yFo.KWHzl(jValueOf));
            }
            checkIsAllGroupInvitationStatus2 = checkIsAllGroupInvitationStatus;
        }
        pUU.KWHzl("CheckIsAllowGroupInvitationUseCase", "checkStatus:" + checkIsAllGroupInvitationStatus2);
        return checkIsAllGroupInvitationStatus2;
    }
}
