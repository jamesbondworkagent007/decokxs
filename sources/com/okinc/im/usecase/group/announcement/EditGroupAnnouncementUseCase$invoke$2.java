package com.okinc.im.usecase.group.announcement;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35791oDv;
import o.C56391yDq;
import o.C56442yFn;
import o.sIR;

/* JADX INFO: loaded from: classes8.dex */
public final class EditGroupAnnouncementUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ long $announcementId;
    final /* synthetic */ String $content;
    final /* synthetic */ String $groupId;
    final /* synthetic */ Boolean $pinStatus;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C35791oDv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditGroupAnnouncementUseCase$invoke$2(C35791oDv c35791oDv, String str, long j, String str2, Boolean bool, Continuation<? super EditGroupAnnouncementUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c35791oDv;
        this.$groupId = str;
        this.$announcementId = j;
        this.$content = str2;
        this.$pinStatus = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EditGroupAnnouncementUseCase$invoke$2 editGroupAnnouncementUseCase$invoke$2 = new EditGroupAnnouncementUseCase$invoke$2(this.this$0, this.$groupId, this.$announcementId, this.$content, this.$pinStatus, continuation);
        editGroupAnnouncementUseCase$invoke$2.L$0 = obj;
        return editGroupAnnouncementUseCase$invoke$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
        return ((EditGroupAnnouncementUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C35791oDv c35791oDv = this.this$0;
                String str = this.$groupId;
                long j = this.$announcementId;
                String str2 = this.$content;
                Boolean bool = this.$pinStatus;
                Result.Application application = Result.Companion;
                sIR sir = c35791oDv.EZpvd;
                this.label = 1;
                if (sir.OLrzqt(str, j, str2, bool, this) == objCopydefault) {
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
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
