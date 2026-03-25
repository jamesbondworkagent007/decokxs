package com.okinc.im.imui.group.join.viewmodel;

import com.okinc.im.imui.group.join.model.JoinGroupDisplayModel;
import com.okinc.im.imui.group.join.viewmodel.JoinGroupViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC44395sOf;
import o.C44124sEe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.nTN;
import o.oDE;

/* JADX INFO: loaded from: classes8.dex */
public final class JoinGroupViewModel$acceptInvite$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ JoinGroupViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinGroupViewModel$acceptInvite$1(JoinGroupViewModel joinGroupViewModel, Continuation<? super JoinGroupViewModel$acceptInvite$1> continuation) {
        super(2, continuation);
        this.this$0 = joinGroupViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        JoinGroupViewModel$acceptInvite$1 joinGroupViewModel$acceptInvite$1 = new JoinGroupViewModel$acceptInvite$1(this.this$0, continuation);
        joinGroupViewModel$acceptInvite$1.L$0 = obj;
        return joinGroupViewModel$acceptInvite$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((JoinGroupViewModel$acceptInvite$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017d A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        MutableStateFlow mutableStateFlow;
        nTN.StateListAnimator stateListAnimator;
        AbstractC44395sOf abstractC44395sOf;
        JoinGroupViewModel joinGroupViewModel;
        MutableSharedFlow mutableSharedFlow;
        JoinGroupViewModel.Application.StateListAnimator stateListAnimator2;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                C44124sEe.imLogGroup$default("JoinGroupViewModel=>acceptInvite: inviteId=" + this.this$0.djBIcL() + ", groupId=" + this.this$0.gEmmrt(), null, 2, null);
                MutableSharedFlow mutableSharedFlow2 = this.this$0.copydefault;
                JoinGroupViewModel.Application.C0422Application c0422Application = JoinGroupViewModel.Application.C0422Application.copydefault;
                this.L$0 = coroutineScope;
                this.label = 1;
                if (mutableSharedFlow2.emit(c0422Application, this) == objCopydefault) {
                    return objCopydefault;
                }
                mutableStateFlow = this.this$0.AYXKKw;
                stateListAnimator = nTN.StateListAnimator.copydefault;
                this.L$0 = coroutineScope;
                this.label = 2;
                if (mutableStateFlow.emit(stateListAnimator, this) == objCopydefault) {
                    return objCopydefault;
                }
                oDE ode = this.this$0.djBIcL;
                String strDjBIcL = this.this$0.djBIcL();
                this.L$0 = coroutineScope;
                this.label = 3;
                obj = ode.OLrzqt(strDjBIcL, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                abstractC44395sOf = (AbstractC44395sOf) obj;
                C44124sEe.imLogGroup$default("JoinGroupViewModel=>acceptInvite: result=" + abstractC44395sOf, null, 2, null);
                if (!(abstractC44395sOf instanceof AbstractC44395sOf.StateListAnimator)) {
                    C44124sEe.imLogGroup$default("JoinGroupViewModel=>acceptInvite: Success, navigating to group conversation", null, 2, null);
                    JoinGroupDisplayModel joinGroupDisplayModelAYXKKw = this.this$0.AYXKKw();
                    if (joinGroupDisplayModelAYXKKw != null) {
                        MutableSharedFlow mutableSharedFlow3 = this.this$0.AhwBna;
                        JoinGroupViewModel.Fragment.Activity activity = new JoinGroupViewModel.Fragment.Activity(joinGroupDisplayModelAYXKKw);
                        this.L$0 = coroutineScope;
                        this.label = 4;
                        if (mutableSharedFlow3.emit(activity, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        joinGroupViewModel = this.this$0;
                        IllegalStateException illegalStateException = new IllegalStateException("Group info is null");
                        this.L$0 = joinGroupViewModel;
                        this.label = 5;
                        if (joinGroupViewModel.OLrzqt((Integer) null, illegalStateException, (Continuation<? super Unit>) this) == objCopydefault) {
                            return objCopydefault;
                        }
                        C44124sEe.imLogGroup$default("Group info is null: " + joinGroupViewModel.gEmmrt(), null, 2, null);
                    }
                } else {
                    if (!(abstractC44395sOf instanceof AbstractC44395sOf.Activity)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC44395sOf.Activity activity2 = (AbstractC44395sOf.Activity) abstractC44395sOf;
                    C44124sEe.AYXKKw("JoinGroupViewModel=>acceptInvite: Failed with code=" + activity2.OLrzqt() + ", error=" + activity2.AEQbTJ().getMessage(), activity2.AEQbTJ());
                    JoinGroupViewModel joinGroupViewModel2 = this.this$0;
                    Integer numAEQbTJ = C56443yFo.AEQbTJ(activity2.OLrzqt());
                    Throwable thAEQbTJ = activity2.AEQbTJ();
                    this.L$0 = null;
                    this.label = 6;
                    if (joinGroupViewModel2.OLrzqt(numAEQbTJ, thAEQbTJ, (Continuation<? super Unit>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                mutableSharedFlow = this.this$0.copydefault;
                stateListAnimator2 = JoinGroupViewModel.Application.StateListAnimator.KWHzl;
                this.L$0 = null;
                this.label = 7;
                if (mutableSharedFlow.emit(stateListAnimator2, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            case 1:
                coroutineScope = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableStateFlow = this.this$0.AYXKKw;
                stateListAnimator = nTN.StateListAnimator.copydefault;
                this.L$0 = coroutineScope;
                this.label = 2;
                if (mutableStateFlow.emit(stateListAnimator, this) == objCopydefault) {
                }
                oDE ode2 = this.this$0.djBIcL;
                String strDjBIcL2 = this.this$0.djBIcL();
                this.L$0 = coroutineScope;
                this.label = 3;
                obj = ode2.OLrzqt(strDjBIcL2, this);
                if (obj == objCopydefault) {
                }
                abstractC44395sOf = (AbstractC44395sOf) obj;
                C44124sEe.imLogGroup$default("JoinGroupViewModel=>acceptInvite: result=" + abstractC44395sOf, null, 2, null);
                if (!(abstractC44395sOf instanceof AbstractC44395sOf.StateListAnimator)) {
                }
                mutableSharedFlow = this.this$0.copydefault;
                stateListAnimator2 = JoinGroupViewModel.Application.StateListAnimator.KWHzl;
                this.L$0 = null;
                this.label = 7;
                if (mutableSharedFlow.emit(stateListAnimator2, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 2:
                coroutineScope = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                oDE ode22 = this.this$0.djBIcL;
                String strDjBIcL22 = this.this$0.djBIcL();
                this.L$0 = coroutineScope;
                this.label = 3;
                obj = ode22.OLrzqt(strDjBIcL22, this);
                if (obj == objCopydefault) {
                }
                abstractC44395sOf = (AbstractC44395sOf) obj;
                C44124sEe.imLogGroup$default("JoinGroupViewModel=>acceptInvite: result=" + abstractC44395sOf, null, 2, null);
                if (!(abstractC44395sOf instanceof AbstractC44395sOf.StateListAnimator)) {
                }
                mutableSharedFlow = this.this$0.copydefault;
                stateListAnimator2 = JoinGroupViewModel.Application.StateListAnimator.KWHzl;
                this.L$0 = null;
                this.label = 7;
                if (mutableSharedFlow.emit(stateListAnimator2, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 3:
                coroutineScope = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                abstractC44395sOf = (AbstractC44395sOf) obj;
                C44124sEe.imLogGroup$default("JoinGroupViewModel=>acceptInvite: result=" + abstractC44395sOf, null, 2, null);
                if (!(abstractC44395sOf instanceof AbstractC44395sOf.StateListAnimator)) {
                }
                mutableSharedFlow = this.this$0.copydefault;
                stateListAnimator2 = JoinGroupViewModel.Application.StateListAnimator.KWHzl;
                this.L$0 = null;
                this.label = 7;
                if (mutableSharedFlow.emit(stateListAnimator2, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 4:
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow = this.this$0.copydefault;
                stateListAnimator2 = JoinGroupViewModel.Application.StateListAnimator.KWHzl;
                this.L$0 = null;
                this.label = 7;
                if (mutableSharedFlow.emit(stateListAnimator2, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 5:
                joinGroupViewModel = (JoinGroupViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                C44124sEe.imLogGroup$default("Group info is null: " + joinGroupViewModel.gEmmrt(), null, 2, null);
                mutableSharedFlow = this.this$0.copydefault;
                stateListAnimator2 = JoinGroupViewModel.Application.StateListAnimator.KWHzl;
                this.L$0 = null;
                this.label = 7;
                if (mutableSharedFlow.emit(stateListAnimator2, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 6:
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow = this.this$0.copydefault;
                stateListAnimator2 = JoinGroupViewModel.Application.StateListAnimator.KWHzl;
                this.L$0 = null;
                this.label = 7;
                if (mutableSharedFlow.emit(stateListAnimator2, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 7:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
