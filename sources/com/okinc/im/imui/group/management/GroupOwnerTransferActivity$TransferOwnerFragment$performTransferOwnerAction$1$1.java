package com.okinc.im.imui.group.management;

import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC34206nVj;
import o.C33069mpW;
import o.C35399nuc;
import o.C44157sFk;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.sDN;

/* JADX INFO: loaded from: classes18.dex */
public final class GroupOwnerTransferActivity$TransferOwnerFragment$performTransferOwnerAction$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $cb;
    final /* synthetic */ GroupInfo $groupInfo;
    final /* synthetic */ GroupMemberInfo $memberInfo;
    final /* synthetic */ InterfaceC35180nqU $okimService;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC34206nVj.StateListAnimator this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupOwnerTransferActivity$TransferOwnerFragment$performTransferOwnerAction$1$1(ActivityC34206nVj.StateListAnimator stateListAnimator, InterfaceC35180nqU interfaceC35180nqU, GroupInfo groupInfo, GroupMemberInfo groupMemberInfo, Function0<Unit> function0, Continuation<? super GroupOwnerTransferActivity$TransferOwnerFragment$performTransferOwnerAction$1$1> continuation) {
        super(2, continuation);
        this.this$0 = stateListAnimator;
        this.$okimService = interfaceC35180nqU;
        this.$groupInfo = groupInfo;
        this.$memberInfo = groupMemberInfo;
        this.$cb = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GroupOwnerTransferActivity$TransferOwnerFragment$performTransferOwnerAction$1$1 groupOwnerTransferActivity$TransferOwnerFragment$performTransferOwnerAction$1$1 = new GroupOwnerTransferActivity$TransferOwnerFragment$performTransferOwnerAction$1$1(this.this$0, this.$okimService, this.$groupInfo, this.$memberInfo, this.$cb, continuation);
        groupOwnerTransferActivity$TransferOwnerFragment$performTransferOwnerAction$1$1.L$0 = obj;
        return groupOwnerTransferActivity$TransferOwnerFragment$performTransferOwnerAction$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupOwnerTransferActivity$TransferOwnerFragment$performTransferOwnerAction$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.showLoading();
                InterfaceC35180nqU interfaceC35180nqU = this.$okimService;
                GroupInfo groupInfo = this.$groupInfo;
                GroupMemberInfo groupMemberInfo = this.$memberInfo;
                Result.Application application = Result.Companion;
                CoroutineDispatcher coroutineDispatcherCopydefault = sDN.copydefault.copydefault();
                GroupOwnerTransferActivity$TransferOwnerFragment$performTransferOwnerAction$1$1$1$1 groupOwnerTransferActivity$TransferOwnerFragment$performTransferOwnerAction$1$1$1$1 = new GroupOwnerTransferActivity$TransferOwnerFragment$performTransferOwnerAction$1$1$1$1(interfaceC35180nqU, groupInfo, groupMemberInfo, null);
                this.label = 1;
                if (BuildersKt.withContext(coroutineDispatcherCopydefault, groupOwnerTransferActivity$TransferOwnerFragment$performTransferOwnerAction$1$1$1$1, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        ActivityC34206nVj.StateListAnimator stateListAnimator = this.this$0;
        Function0<Unit> function0 = this.$cb;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            stateListAnimator.dismissLoading();
            function0.invoke();
        }
        ActivityC34206nVj.StateListAnimator stateListAnimator2 = this.this$0;
        GroupMemberInfo groupMemberInfo2 = this.$memberInfo;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            stateListAnimator2.dismissLoading();
            Integer numOLrzqt = C44157sFk.OLrzqt(thM7380exceptionOrNullimpl);
            if (numOLrzqt != null && numOLrzqt.intValue() == 2024) {
                C55326xho.toastWithFailedIcon$default(C33069mpW.copydefault(C35399nuc.LoaderManager.fWSAZA, C56423yEv.EZpvd(C56390yDp.OLrzqt("user", C44157sFk.EZpvd(groupMemberInfo2)))), 0, 1, (Object) null);
            } else {
                C44157sFk.KWHzl(thM7380exceptionOrNullimpl);
            }
        }
        return Unit.INSTANCE;
    }
}
