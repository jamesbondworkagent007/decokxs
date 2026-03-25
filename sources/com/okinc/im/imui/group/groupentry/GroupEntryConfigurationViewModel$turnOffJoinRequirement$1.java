package com.okinc.im.imui.group.groupentry;

import com.okinc.im.imui.group.groupentry.GroupEntryConfigurationViewModel;
import com.okinc.okimcore.model.im.group.GroupEntryAssetVerificationType;
import com.okinc.okimcore.model.im.group.GroupEntryAssetsVerificationStatus;
import com.okinc.okimcore.model.remote.GroupEntryAssetVerification;
import com.okinc.okimcore.model.remote.GroupEntryCreateVerificationRequestResponse;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC44414sOy;
import o.C32962mnV;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.oDC;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupEntryConfigurationViewModel$turnOffJoinRequirement$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GroupEntryConfigurationViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupEntryConfigurationViewModel$turnOffJoinRequirement$1(GroupEntryConfigurationViewModel groupEntryConfigurationViewModel, Continuation<? super GroupEntryConfigurationViewModel$turnOffJoinRequirement$1> continuation) {
        super(2, continuation);
        this.this$0 = groupEntryConfigurationViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GroupEntryConfigurationViewModel$turnOffJoinRequirement$1 groupEntryConfigurationViewModel$turnOffJoinRequirement$1 = new GroupEntryConfigurationViewModel$turnOffJoinRequirement$1(this.this$0, continuation);
        groupEntryConfigurationViewModel$turnOffJoinRequirement$1.L$0 = obj;
        return groupEntryConfigurationViewModel$turnOffJoinRequirement$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupEntryConfigurationViewModel$turnOffJoinRequirement$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0142 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        AbstractC44414sOy abstractC44414sOy;
        GroupEntryConfigurationViewModel groupEntryConfigurationViewModel;
        GroupEntryConfigurationViewModel.Fragment.StateListAnimator stateListAnimator;
        Object value;
        GroupEntryAssetVerification groupEntryAssetVerification;
        Object value2;
        GroupEntryCreateVerificationRequestResponse groupEntryCreateVerificationRequestResponse;
        MutableSharedFlow mutableSharedFlow;
        GroupEntryConfigurationViewModel.Application.ActionBar actionBar;
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            GroupEntryConfigurationViewModel groupEntryConfigurationViewModel2 = this.this$0;
            GroupEntryConfigurationViewModel.Fragment.Application application2 = GroupEntryConfigurationViewModel.Fragment.Application.copydefault;
            this.L$0 = coroutineScope;
            this.label = 1;
            if (groupEntryConfigurationViewModel2.AEQbTJ(application2, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    abstractC44414sOy = (AbstractC44414sOy) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    mutableSharedFlow = this.this$0.gEmmrt;
                    actionBar = new GroupEntryConfigurationViewModel.Application.ActionBar(abstractC44414sOy);
                    this.L$0 = null;
                    this.label = 4;
                    if (mutableSharedFlow.emit(actionBar, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objKWHzl = obj;
                objM7377constructorimpl = Result.m7377constructorimpl((AbstractC44414sOy) objKWHzl);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    Integer numAEQbTJ = C32962mnV.AEQbTJ(thM7380exceptionOrNullimpl);
                    objM7377constructorimpl = new AbstractC44414sOy.Activity(numAEQbTJ != null ? numAEQbTJ.intValue() : -1, thM7380exceptionOrNullimpl);
                }
                abstractC44414sOy = (AbstractC44414sOy) objM7377constructorimpl;
                if (abstractC44414sOy instanceof AbstractC44414sOy.Application) {
                    MutableStateFlow mutableStateFlow = this.this$0.AEQbTJ;
                    do {
                        value = mutableStateFlow.getValue();
                        groupEntryAssetVerification = (GroupEntryAssetVerification) value;
                    } while (!mutableStateFlow.compareAndSet(value, groupEntryAssetVerification != null ? GroupEntryAssetVerification.copy$default(groupEntryAssetVerification, GroupEntryAssetsVerificationStatus.DISABLED, null, null, null, null, 30, null) : null));
                    MutableStateFlow mutableStateFlow2 = this.this$0.djBIcL;
                    GroupEntryConfigurationViewModel groupEntryConfigurationViewModel3 = this.this$0;
                    do {
                        value2 = mutableStateFlow2.getValue();
                        groupEntryCreateVerificationRequestResponse = (GroupEntryCreateVerificationRequestResponse) value2;
                    } while (!mutableStateFlow2.compareAndSet(value2, groupEntryCreateVerificationRequestResponse != null ? GroupEntryCreateVerificationRequestResponse.copy$default(groupEntryCreateVerificationRequestResponse, null, null, (GroupEntryAssetVerification) groupEntryConfigurationViewModel3.AEQbTJ.getValue(), null, 11, null) : null));
                    this.this$0.OLrzqt.setValue(C56443yFo.KWHzl(false));
                }
                groupEntryConfigurationViewModel = this.this$0;
                stateListAnimator = GroupEntryConfigurationViewModel.Fragment.StateListAnimator.copydefault;
                this.L$0 = abstractC44414sOy;
                this.label = 3;
                if (groupEntryConfigurationViewModel.AEQbTJ(stateListAnimator, this) == objCopydefault) {
                    return objCopydefault;
                }
                mutableSharedFlow = this.this$0.gEmmrt;
                actionBar = new GroupEntryConfigurationViewModel.Application.ActionBar(abstractC44414sOy);
                this.L$0 = null;
                this.label = 4;
                if (mutableSharedFlow.emit(actionBar, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        GroupEntryAssetVerification groupEntryAssetVerification2 = new GroupEntryAssetVerification(GroupEntryAssetsVerificationStatus.DISABLED, (GroupEntryAssetVerificationType) null, (Integer) null, (String) null, (String) null, 30, (DefaultConstructorMarker) null);
        GroupEntryConfigurationViewModel groupEntryConfigurationViewModel4 = this.this$0;
        Result.Application application3 = Result.Companion;
        oDC odc = groupEntryConfigurationViewModel4.values;
        long jGEmmrt = groupEntryConfigurationViewModel4.gEmmrt();
        this.L$0 = null;
        this.label = 2;
        objKWHzl = odc.KWHzl(jGEmmrt, 1, (8 & 4) != 0 ? null : groupEntryAssetVerification2, (8 & 8) != 0 ? null : null, this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl((AbstractC44414sOy) objKWHzl);
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        abstractC44414sOy = (AbstractC44414sOy) objM7377constructorimpl;
        if (abstractC44414sOy instanceof AbstractC44414sOy.Application) {
        }
        groupEntryConfigurationViewModel = this.this$0;
        stateListAnimator = GroupEntryConfigurationViewModel.Fragment.StateListAnimator.copydefault;
        this.L$0 = abstractC44414sOy;
        this.label = 3;
        if (groupEntryConfigurationViewModel.AEQbTJ(stateListAnimator, this) == objCopydefault) {
        }
        mutableSharedFlow = this.this$0.gEmmrt;
        actionBar = new GroupEntryConfigurationViewModel.Application.ActionBar(abstractC44414sOy);
        this.L$0 = null;
        this.label = 4;
        if (mutableSharedFlow.emit(actionBar, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
