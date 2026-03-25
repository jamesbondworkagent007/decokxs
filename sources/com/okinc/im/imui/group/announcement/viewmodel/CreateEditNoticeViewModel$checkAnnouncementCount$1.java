package com.okinc.im.imui.group.announcement.viewmodel;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35793oDx;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes8.dex */
public final class CreateEditNoticeViewModel$checkAnnouncementCount$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $groupId;
    int label;
    final /* synthetic */ CreateEditNoticeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateEditNoticeViewModel$checkAnnouncementCount$1(CreateEditNoticeViewModel createEditNoticeViewModel, String str, Continuation<? super CreateEditNoticeViewModel$checkAnnouncementCount$1> continuation) {
        super(2, continuation);
        this.this$0 = createEditNoticeViewModel;
        this.$groupId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateEditNoticeViewModel$checkAnnouncementCount$1(this.this$0, this.$groupId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateEditNoticeViewModel$checkAnnouncementCount$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        String message;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C35793oDx c35793oDx = this.this$0.fetchVPNInfo;
            String str = this.$groupId;
            this.label = 1;
            objCopydefault = c35793oDx.copydefault(str, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        CreateEditNoticeViewModel createEditNoticeViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objCopydefault)) {
            createEditNoticeViewModel.copydefault.tryEmit(C56443yFo.AEQbTJ(((C35793oDx.StateListAnimator) objCopydefault).copydefault().size()));
        }
        CreateEditNoticeViewModel createEditNoticeViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
        if (thM7380exceptionOrNullimpl != null && (message = thM7380exceptionOrNullimpl.getMessage()) != null) {
            createEditNoticeViewModel2.KWHzl.tryEmit(message);
        }
        return Unit.INSTANCE;
    }
}
