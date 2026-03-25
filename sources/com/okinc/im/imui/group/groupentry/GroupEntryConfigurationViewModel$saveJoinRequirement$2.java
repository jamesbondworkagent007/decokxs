package com.okinc.im.imui.group.groupentry;

import com.okinc.im.imui.group.groupentry.GroupEntryConfigurationViewModel;
import com.okinc.okimcore.model.remote.GroupEntryAssetVerification;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC44414sOy;
import o.C32962mnV;
import o.C56391yDq;
import o.C56442yFn;
import o.oDC;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupEntryConfigurationViewModel$saveJoinRequirement$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GroupEntryAssetVerification $assetVerification;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GroupEntryConfigurationViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupEntryConfigurationViewModel$saveJoinRequirement$2(GroupEntryConfigurationViewModel groupEntryConfigurationViewModel, GroupEntryAssetVerification groupEntryAssetVerification, Continuation<? super GroupEntryConfigurationViewModel$saveJoinRequirement$2> continuation) {
        super(2, continuation);
        this.this$0 = groupEntryConfigurationViewModel;
        this.$assetVerification = groupEntryAssetVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GroupEntryConfigurationViewModel$saveJoinRequirement$2 groupEntryConfigurationViewModel$saveJoinRequirement$2 = new GroupEntryConfigurationViewModel$saveJoinRequirement$2(this.this$0, this.$assetVerification, continuation);
        groupEntryConfigurationViewModel$saveJoinRequirement$2.L$0 = obj;
        return groupEntryConfigurationViewModel$saveJoinRequirement$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupEntryConfigurationViewModel$saveJoinRequirement$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3 A[RETURN] */
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
        MutableSharedFlow mutableSharedFlow;
        GroupEntryConfigurationViewModel.Application.C0419Application c0419Application;
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
                        this.this$0.KWHzl(this.$assetVerification);
                        return Unit.INSTANCE;
                    }
                    abstractC44414sOy = (AbstractC44414sOy) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    mutableSharedFlow = this.this$0.gEmmrt;
                    c0419Application = new GroupEntryConfigurationViewModel.Application.C0419Application(abstractC44414sOy);
                    this.L$0 = null;
                    this.label = 4;
                    if (mutableSharedFlow.emit(c0419Application, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    this.this$0.KWHzl(this.$assetVerification);
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
                groupEntryConfigurationViewModel = this.this$0;
                stateListAnimator = GroupEntryConfigurationViewModel.Fragment.StateListAnimator.copydefault;
                this.L$0 = abstractC44414sOy;
                this.label = 3;
                if (groupEntryConfigurationViewModel.AEQbTJ(stateListAnimator, this) == objCopydefault) {
                    return objCopydefault;
                }
                mutableSharedFlow = this.this$0.gEmmrt;
                c0419Application = new GroupEntryConfigurationViewModel.Application.C0419Application(abstractC44414sOy);
                this.L$0 = null;
                this.label = 4;
                if (mutableSharedFlow.emit(c0419Application, this) == objCopydefault) {
                }
                this.this$0.KWHzl(this.$assetVerification);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        GroupEntryConfigurationViewModel groupEntryConfigurationViewModel3 = this.this$0;
        GroupEntryAssetVerification groupEntryAssetVerification = this.$assetVerification;
        Result.Application application3 = Result.Companion;
        oDC odc = groupEntryConfigurationViewModel3.values;
        long jGEmmrt = groupEntryConfigurationViewModel3.gEmmrt();
        this.L$0 = null;
        this.label = 2;
        objKWHzl = odc.KWHzl(jGEmmrt, 1, (8 & 4) != 0 ? null : groupEntryAssetVerification, (8 & 8) != 0 ? null : null, this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl((AbstractC44414sOy) objKWHzl);
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        abstractC44414sOy = (AbstractC44414sOy) objM7377constructorimpl;
        groupEntryConfigurationViewModel = this.this$0;
        stateListAnimator = GroupEntryConfigurationViewModel.Fragment.StateListAnimator.copydefault;
        this.L$0 = abstractC44414sOy;
        this.label = 3;
        if (groupEntryConfigurationViewModel.AEQbTJ(stateListAnimator, this) == objCopydefault) {
        }
        mutableSharedFlow = this.this$0.gEmmrt;
        c0419Application = new GroupEntryConfigurationViewModel.Application.C0419Application(abstractC44414sOy);
        this.L$0 = null;
        this.label = 4;
        if (mutableSharedFlow.emit(c0419Application, this) == objCopydefault) {
        }
        this.this$0.KWHzl(this.$assetVerification);
        return Unit.INSTANCE;
    }
}
