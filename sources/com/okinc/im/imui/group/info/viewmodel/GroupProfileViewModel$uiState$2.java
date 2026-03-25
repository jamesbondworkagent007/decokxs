package com.okinc.im.imui.group.info.viewmodel;

import com.okinc.im.imui.group.info.viewmodel.GroupProfileViewModel;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C36553odD;
import o.C36554odE;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.oDF;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupProfileViewModel$uiState$2 extends SuspendLambda implements Function2<Triple<? extends oDF.StateListAnimator, ? extends C36554odE, ? extends C36553odD>, Continuation<? super GroupProfileViewModel.TaskDescription>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GroupProfileViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupProfileViewModel$uiState$2(GroupProfileViewModel groupProfileViewModel, Continuation<? super GroupProfileViewModel$uiState$2> continuation) {
        super(2, continuation);
        this.this$0 = groupProfileViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GroupProfileViewModel$uiState$2 groupProfileViewModel$uiState$2 = new GroupProfileViewModel$uiState$2(this.this$0, continuation);
        groupProfileViewModel$uiState$2.L$0 = obj;
        return groupProfileViewModel$uiState$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Triple<? extends oDF.StateListAnimator, ? extends C36554odE, ? extends C36553odD> triple, Continuation<? super GroupProfileViewModel.TaskDescription> continuation) {
        return invoke2((Triple<oDF.StateListAnimator, C36554odE, C36553odD>) triple, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Triple<oDF.StateListAnimator, C36554odE, C36553odD> triple, Continuation<? super GroupProfileViewModel.TaskDescription> continuation) {
        return ((GroupProfileViewModel$uiState$2) create(triple, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                return GroupProfileViewModel.TaskDescription.StateListAnimator.AEQbTJ;
            }
            if (i == 2) {
                C56391yDq.AEQbTJ(obj);
                return GroupProfileViewModel.TaskDescription.StateListAnimator.AEQbTJ;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return (GroupProfileViewModel.TaskDescription) obj;
        }
        C56391yDq.AEQbTJ(obj);
        Triple triple = (Triple) this.L$0;
        oDF.StateListAnimator stateListAnimator = (oDF.StateListAnimator) triple.component1();
        C36554odE c36554odE = (C36554odE) triple.component2();
        C36553odD c36553odD = (C36553odD) triple.component3();
        pUU.KWHzl("GroupProfileViewModel", "Group ID: " + stateListAnimator.KWHzl().getGroupId() + ", isNoDisturb: " + stateListAnimator.AEQbTJ().isNoDisturb() + ", isPinned: " + stateListAnimator.AEQbTJ().isTop() + ", isKicked: " + (c36554odE != null) + ", disbanded: " + (c36553odD != null));
        if (c36553odD != null) {
            MutableSharedFlow mutableSharedFlow = this.this$0.AYXKKw;
            GroupProfileViewModel.Application.StateListAnimator stateListAnimator2 = GroupProfileViewModel.Application.StateListAnimator.OLrzqt;
            this.label = 1;
            if (mutableSharedFlow.emit(stateListAnimator2, this) == objCopydefault) {
                return objCopydefault;
            }
            return GroupProfileViewModel.TaskDescription.StateListAnimator.AEQbTJ;
        }
        if (c36554odE != null || stateListAnimator.KWHzl().getUserSettingInfo() == null) {
            MutableSharedFlow mutableSharedFlow2 = this.this$0.AYXKKw;
            GroupProfileViewModel.Application.Activity activity = GroupProfileViewModel.Application.Activity.OLrzqt;
            this.label = 2;
            if (mutableSharedFlow2.emit(activity, this) == objCopydefault) {
                return objCopydefault;
            }
            return GroupProfileViewModel.TaskDescription.StateListAnimator.AEQbTJ;
        }
        this.this$0.fARcdN.set("KEY_GROUP_INFO", stateListAnimator.KWHzl());
        this.this$0.AhwBna = stateListAnimator.copydefault();
        this.this$0.fARcdN.set("KEY_CONVERSATION", stateListAnimator.AEQbTJ());
        this.this$0.fARcdN.set("KEY_DO_NOT_DISTURB", C56443yFo.KWHzl(stateListAnimator.AEQbTJ().isNoDisturb()));
        this.this$0.fARcdN.set("KEY_PIN_TO_TOP", C56443yFo.KWHzl(stateListAnimator.AEQbTJ().isTop()));
        GroupProfileViewModel groupProfileViewModel = this.this$0;
        this.label = 3;
        obj = groupProfileViewModel.AEQbTJ(stateListAnimator, (Continuation<? super GroupProfileViewModel.TaskDescription>) this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        return (GroupProfileViewModel.TaskDescription) obj;
    }
}
