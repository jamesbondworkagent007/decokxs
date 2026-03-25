package com.okinc.im.imui.group.join.viewmodel;

import com.okinc.im.imui.group.join.viewmodel.JoinGroupViewModel;
import com.okinc.okimcore.model.remote.GroupEntryVerifyAsset;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC44414sOy;
import o.C33129mqd;
import o.C44124sEe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.oDD;

/* JADX INFO: loaded from: classes8.dex */
public final class JoinGroupViewModel$verifyAssetsRequirement$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $approvalRequired;
    int label;
    final /* synthetic */ JoinGroupViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinGroupViewModel$verifyAssetsRequirement$1(JoinGroupViewModel joinGroupViewModel, boolean z, Continuation<? super JoinGroupViewModel$verifyAssetsRequirement$1> continuation) {
        super(2, continuation);
        this.this$0 = joinGroupViewModel;
        this.$approvalRequired = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new JoinGroupViewModel$verifyAssetsRequirement$1(this.this$0, this.$approvalRequired, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((JoinGroupViewModel$verifyAssetsRequirement$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC44414sOy abstractC44414sOy;
        MutableSharedFlow mutableSharedFlow;
        JoinGroupViewModel.Application.StateListAnimator stateListAnimator;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C44124sEe.imLogGroup$default("JoinGroupViewModel=>verifyAssetsRequirement: groupId=" + this.this$0.gEmmrt() + ", approvalRequired=" + this.$approvalRequired, null, 2, null);
            MutableSharedFlow mutableSharedFlow2 = this.this$0.copydefault;
            JoinGroupViewModel.Application.C0422Application c0422Application = JoinGroupViewModel.Application.C0422Application.copydefault;
            this.label = 1;
            if (mutableSharedFlow2.emit(c0422Application, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    C56391yDq.AEQbTJ(obj);
                    mutableSharedFlow = this.this$0.copydefault;
                    stateListAnimator = JoinGroupViewModel.Application.StateListAnimator.KWHzl;
                    this.label = 5;
                    if (mutableSharedFlow.emit(stateListAnimator, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                abstractC44414sOy = (AbstractC44414sOy) obj;
                C44124sEe.imLogGroup$default("JoinGroupViewModel=>verifyAssetsRequirement: verification result=" + abstractC44414sOy, null, 2, null);
                if (!(abstractC44414sOy instanceof AbstractC44414sOy.Activity)) {
                    this.label = 3;
                    if (this.this$0.KWHzl((AbstractC44414sOy.Activity) abstractC44414sOy, (Continuation<? super Unit>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (Intrinsics.EZpvd(abstractC44414sOy, AbstractC44414sOy.Application.copydefault)) {
                    JoinGroupViewModel joinGroupViewModel = this.this$0;
                    boolean z = this.$approvalRequired;
                    this.label = 4;
                    if (joinGroupViewModel.KWHzl(z, (Continuation<? super Unit>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                mutableSharedFlow = this.this$0.copydefault;
                stateListAnimator = JoinGroupViewModel.Application.StateListAnimator.KWHzl;
                this.label = 5;
                if (mutableSharedFlow.emit(stateListAnimator, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        oDD odd = this.this$0.fIwbmz;
        GroupEntryVerifyAsset groupEntryVerifyAsset = new GroupEntryVerifyAsset(C33129mqd.valueOf(C56443yFo.KWHzl(this.this$0.gEmmrt())));
        this.label = 2;
        obj = odd.AEQbTJ(groupEntryVerifyAsset, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        abstractC44414sOy = (AbstractC44414sOy) obj;
        C44124sEe.imLogGroup$default("JoinGroupViewModel=>verifyAssetsRequirement: verification result=" + abstractC44414sOy, null, 2, null);
        if (!(abstractC44414sOy instanceof AbstractC44414sOy.Activity)) {
        }
        mutableSharedFlow = this.this$0.copydefault;
        stateListAnimator = JoinGroupViewModel.Application.StateListAnimator.KWHzl;
        this.label = 5;
        if (mutableSharedFlow.emit(stateListAnimator, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
