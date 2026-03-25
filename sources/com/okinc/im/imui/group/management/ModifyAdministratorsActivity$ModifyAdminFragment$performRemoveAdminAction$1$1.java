package com.okinc.im.imui.group.management;

import com.okinc.okimcore.model.other.GroupMemberInfo;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C44157sFk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.nVU;

/* JADX INFO: loaded from: classes18.dex */
public final class ModifyAdministratorsActivity$ModifyAdminFragment$performRemoveAdminAction$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<GroupMemberInfo> $list;
    final /* synthetic */ InterfaceC35180nqU $okimService;
    final /* synthetic */ Function0<Unit> $success;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ nVU.StateListAnimator this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifyAdministratorsActivity$ModifyAdminFragment$performRemoveAdminAction$1$1(nVU.StateListAnimator stateListAnimator, InterfaceC35180nqU interfaceC35180nqU, List<GroupMemberInfo> list, Function0<Unit> function0, Continuation<? super ModifyAdministratorsActivity$ModifyAdminFragment$performRemoveAdminAction$1$1> continuation) {
        super(2, continuation);
        this.this$0 = stateListAnimator;
        this.$okimService = interfaceC35180nqU;
        this.$list = list;
        this.$success = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ModifyAdministratorsActivity$ModifyAdminFragment$performRemoveAdminAction$1$1 modifyAdministratorsActivity$ModifyAdminFragment$performRemoveAdminAction$1$1 = new ModifyAdministratorsActivity$ModifyAdminFragment$performRemoveAdminAction$1$1(this.this$0, this.$okimService, this.$list, this.$success, continuation);
        modifyAdministratorsActivity$ModifyAdminFragment$performRemoveAdminAction$1$1.L$0 = obj;
        return modifyAdministratorsActivity$ModifyAdminFragment$performRemoveAdminAction$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModifyAdministratorsActivity$ModifyAdminFragment$performRemoveAdminAction$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                nVU.StateListAnimator stateListAnimator = this.this$0;
                List<GroupMemberInfo> list = this.$list;
                Result.Application application = Result.Companion;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                ModifyAdministratorsActivity$ModifyAdminFragment$performRemoveAdminAction$1$1$1$1 modifyAdministratorsActivity$ModifyAdminFragment$performRemoveAdminAction$1$1$1$1 = new ModifyAdministratorsActivity$ModifyAdminFragment$performRemoveAdminAction$1$1$1$1(interfaceC35180nqU, stateListAnimator, list, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, modifyAdministratorsActivity$ModifyAdminFragment$performRemoveAdminAction$1$1$1$1, this) == objCopydefault) {
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
        nVU.StateListAnimator stateListAnimator2 = this.this$0;
        Function0<Unit> function0 = this.$success;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            stateListAnimator2.dismissLoading();
            function0.invoke();
        }
        nVU.StateListAnimator stateListAnimator3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            stateListAnimator3.dismissLoading();
            C44157sFk.KWHzl(thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
