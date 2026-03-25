package com.okinc.im.imui.group.join.viewmodel;

import com.okinc.im.imui.group.join.model.JoinGroupDisplayModel;
import com.okinc.im.imui.group.join.viewmodel.JoinGroupViewModel;
import com.okinc.okimcore.model.remote.GroupInvitationInfoResponse;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C33070mpX;
import o.C35399nuc;
import o.C44124sEe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.nTK;
import o.nTM;
import o.nTN;
import o.oDL;

/* JADX INFO: loaded from: classes8.dex */
public final class JoinGroupViewModel$refreshInviteInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $autoEnter;
    final /* synthetic */ boolean $isLongPolling;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ JoinGroupViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinGroupViewModel$refreshInviteInfo$1(JoinGroupViewModel joinGroupViewModel, boolean z, boolean z2, Continuation<? super JoinGroupViewModel$refreshInviteInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = joinGroupViewModel;
        this.$autoEnter = z;
        this.$isLongPolling = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        JoinGroupViewModel$refreshInviteInfo$1 joinGroupViewModel$refreshInviteInfo$1 = new JoinGroupViewModel$refreshInviteInfo$1(this.this$0, this.$autoEnter, this.$isLongPolling, continuation);
        joinGroupViewModel$refreshInviteInfo$1.L$0 = obj;
        return joinGroupViewModel$refreshInviteInfo$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((JoinGroupViewModel$refreshInviteInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x020d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0271  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        Deferred deferredAsync$default;
        Object objAwait;
        oDL.ActionBar actionBar;
        JoinGroupDisplayModel joinGroupDisplayModelEZpvd;
        nTK ntkKWHzl;
        MutableStateFlow mutableStateFlow;
        nTN.Activity activity;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                C44124sEe.imLogGroup$default("JoinGroupViewModel=>refreshInviteInfo: inviteId=" + this.this$0.djBIcL() + ", groupId=" + this.this$0.gEmmrt() + ", autoEnter=" + this.$autoEnter + ", isLongPolling=" + this.$isLongPolling, null, 2, null);
                if (!this.$isLongPolling) {
                    MutableSharedFlow mutableSharedFlow = this.this$0.copydefault;
                    JoinGroupViewModel.Application.C0422Application c0422Application = JoinGroupViewModel.Application.C0422Application.copydefault;
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    if (mutableSharedFlow.emit(c0422Application, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new JoinGroupViewModel$refreshInviteInfo$1$asyncResult$1(this.this$0, null), 3, null);
                deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new JoinGroupViewModel$refreshInviteInfo$1$asyncKycCheck$1(this.this$0, null), 3, null);
                this.L$0 = deferredAsync$default;
                this.label = 2;
                obj = deferredAsync$default2.await(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                oDL.ActionBar actionBar2 = (oDL.ActionBar) obj;
                this.L$0 = actionBar2;
                this.label = 3;
                objAwait = deferredAsync$default.await(this);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
                actionBar = actionBar2;
                obj = objAwait;
                Boolean bool = (Boolean) obj;
                C44124sEe.imLogGroup$default("JoinGroupViewModel=>refreshInviteInfo: KYC check result=" + bool, null, 2, null);
                if (!(actionBar instanceof oDL.ActionBar.Application)) {
                    joinGroupDisplayModelEZpvd = ((oDL.ActionBar.Application) actionBar).EZpvd();
                    C44124sEe.imLogGroup$default("JoinGroupViewModel=>refreshInviteInfo: Success - groupId=" + joinGroupDisplayModelEZpvd.valueOf() + ", isPaidGroup=" + nTM.valueOf(joinGroupDisplayModelEZpvd) + ", alreadyInGroup=" + joinGroupDisplayModelEZpvd.copydefault() + ", paymentStatus=" + nTM.AYXKKw(joinGroupDisplayModelEZpvd), null, 2, null);
                    this.this$0.getFieldNames.set("KEY_GROUP_ID", C56443yFo.KWHzl(joinGroupDisplayModelEZpvd.valueOf()));
                    this.this$0.getFieldNames.set("KEY_DISPLAY_MODEL", joinGroupDisplayModelEZpvd);
                    GroupInvitationInfoResponse.GroupOwnerInfo groupOwnerInfoAhwBna = joinGroupDisplayModelEZpvd.AhwBna();
                    if (groupOwnerInfoAhwBna != null) {
                        this.this$0.copydefault(groupOwnerInfoAhwBna, joinGroupDisplayModelEZpvd.fetchVPNInfo());
                    }
                    if (!Intrinsics.EZpvd(bool, C56443yFo.KWHzl(true))) {
                        C44124sEe.imLogGroup$default("JoinGroupViewModel=>refreshInviteInfo: KYC required", null, 2, null);
                        ntkKWHzl = nTK.FragmentManager.AEQbTJ;
                    } else if (joinGroupDisplayModelEZpvd.copydefault()) {
                        C44124sEe.imLogGroup$default("JoinGroupViewModel=>refreshInviteInfo: Already in group, autoEnter=" + this.$autoEnter, null, 2, null);
                        ntkKWHzl = new nTK.TaskDescription(this.$autoEnter);
                    } else if (nTM.valueOf(joinGroupDisplayModelEZpvd)) {
                        C44124sEe.imLogGroup$default("JoinGroupViewModel=>refreshInviteInfo: Paid group detected, paymentRequired=" + nTM.djBIcL(joinGroupDisplayModelEZpvd), null, 2, null);
                        if (nTM.djBIcL(joinGroupDisplayModelEZpvd)) {
                            JoinGroupViewModel joinGroupViewModel = this.this$0;
                            this.L$0 = joinGroupDisplayModelEZpvd;
                            this.label = 4;
                            obj = joinGroupViewModel.copydefault(joinGroupDisplayModelEZpvd, (Continuation<? super nTK>) this);
                            if (obj == objCopydefault) {
                                return objCopydefault;
                            }
                            ntkKWHzl = (nTK) obj;
                        } else {
                            ntkKWHzl = this.this$0.KWHzl(joinGroupDisplayModelEZpvd);
                        }
                    } else {
                        C44124sEe.imLogGroup$default("JoinGroupViewModel=>refreshInviteInfo: Regular group", null, 2, null);
                        ntkKWHzl = this.this$0.KWHzl(joinGroupDisplayModelEZpvd);
                    }
                    C44124sEe.imLogGroup$default("JoinGroupViewModel=>refreshInviteInfo: Final join status=" + ntkKWHzl, null, 2, null);
                    mutableStateFlow = this.this$0.AYXKKw;
                    activity = new nTN.Activity(joinGroupDisplayModelEZpvd, ntkKWHzl);
                    this.L$0 = null;
                    this.label = 5;
                    if (mutableStateFlow.emit(activity, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    if (!this.$isLongPolling) {
                        MutableSharedFlow mutableSharedFlow2 = this.this$0.copydefault;
                        JoinGroupViewModel.Application.StateListAnimator stateListAnimator = JoinGroupViewModel.Application.StateListAnimator.KWHzl;
                        this.L$0 = null;
                        this.label = 8;
                        if (mutableSharedFlow2.emit(stateListAnimator, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (!(actionBar instanceof oDL.ActionBar.Activity)) {
                    if (actionBar != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    JoinGroupViewModel joinGroupViewModel2 = this.this$0;
                    IllegalStateException illegalStateException = new IllegalStateException(C33070mpX.AYXKKw(C35399nuc.LoaderManager.iUnTnt));
                    this.L$0 = null;
                    this.label = 7;
                    if (joinGroupViewModel2.OLrzqt((Integer) null, illegalStateException, (Continuation<? super Unit>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                    if (!this.$isLongPolling) {
                    }
                    return Unit.INSTANCE;
                }
                JoinGroupViewModel joinGroupViewModel3 = this.this$0;
                oDL.ActionBar.Activity activity2 = (oDL.ActionBar.Activity) actionBar;
                Integer numAEQbTJ = C56443yFo.AEQbTJ(activity2.EZpvd());
                Throwable thKWHzl = activity2.KWHzl();
                this.L$0 = actionBar;
                this.label = 6;
                if (joinGroupViewModel3.OLrzqt(numAEQbTJ, thKWHzl, (Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
                oDL.ActionBar.Activity activity3 = (oDL.ActionBar.Activity) actionBar;
                C44124sEe.AYXKKw("Failed to get invite info: " + activity3.KWHzl().getMessage(), activity3.KWHzl());
                if (!this.$isLongPolling) {
                }
                return Unit.INSTANCE;
            case 1:
                coroutineScope = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                Deferred deferredAsync$default22 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new JoinGroupViewModel$refreshInviteInfo$1$asyncResult$1(this.this$0, null), 3, null);
                deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new JoinGroupViewModel$refreshInviteInfo$1$asyncKycCheck$1(this.this$0, null), 3, null);
                this.L$0 = deferredAsync$default;
                this.label = 2;
                obj = deferredAsync$default22.await(this);
                if (obj == objCopydefault) {
                }
                oDL.ActionBar actionBar22 = (oDL.ActionBar) obj;
                this.L$0 = actionBar22;
                this.label = 3;
                objAwait = deferredAsync$default.await(this);
                if (objAwait == objCopydefault) {
                }
                break;
            case 2:
                deferredAsync$default = (Deferred) this.L$0;
                C56391yDq.AEQbTJ(obj);
                oDL.ActionBar actionBar222 = (oDL.ActionBar) obj;
                this.L$0 = actionBar222;
                this.label = 3;
                objAwait = deferredAsync$default.await(this);
                if (objAwait == objCopydefault) {
                }
                break;
            case 3:
                actionBar = (oDL.ActionBar) this.L$0;
                C56391yDq.AEQbTJ(obj);
                Boolean bool2 = (Boolean) obj;
                C44124sEe.imLogGroup$default("JoinGroupViewModel=>refreshInviteInfo: KYC check result=" + bool2, null, 2, null);
                if (!(actionBar instanceof oDL.ActionBar.Application)) {
                }
                break;
            case 4:
                joinGroupDisplayModelEZpvd = (JoinGroupDisplayModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                ntkKWHzl = (nTK) obj;
                C44124sEe.imLogGroup$default("JoinGroupViewModel=>refreshInviteInfo: Final join status=" + ntkKWHzl, null, 2, null);
                mutableStateFlow = this.this$0.AYXKKw;
                activity = new nTN.Activity(joinGroupDisplayModelEZpvd, ntkKWHzl);
                this.L$0 = null;
                this.label = 5;
                if (mutableStateFlow.emit(activity, this) == objCopydefault) {
                }
                if (!this.$isLongPolling) {
                }
                return Unit.INSTANCE;
            case 5:
            case 7:
                C56391yDq.AEQbTJ(obj);
                if (!this.$isLongPolling) {
                }
                return Unit.INSTANCE;
            case 6:
                actionBar = (oDL.ActionBar) this.L$0;
                C56391yDq.AEQbTJ(obj);
                oDL.ActionBar.Activity activity32 = (oDL.ActionBar.Activity) actionBar;
                C44124sEe.AYXKKw("Failed to get invite info: " + activity32.KWHzl().getMessage(), activity32.KWHzl());
                if (!this.$isLongPolling) {
                }
                return Unit.INSTANCE;
            case 8:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
