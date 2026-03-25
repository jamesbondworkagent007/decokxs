package com.okinc.im.usecase.group.announcement;

import com.okinc.okimcore.model.utility.GroupAnnouncementInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35789oDt;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.sIR;

/* JADX INFO: loaded from: classes8.dex */
public final class CreateGroupAnnouncementUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends GroupAnnouncementInfo>>, Object> {
    final /* synthetic */ String $content;
    final /* synthetic */ String $groupId;
    final /* synthetic */ int $pinStatus;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C35789oDt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateGroupAnnouncementUseCase$invoke$2(C35789oDt c35789oDt, String str, String str2, int i, Continuation<? super CreateGroupAnnouncementUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c35789oDt;
        this.$groupId = str;
        this.$content = str2;
        this.$pinStatus = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CreateGroupAnnouncementUseCase$invoke$2 createGroupAnnouncementUseCase$invoke$2 = new CreateGroupAnnouncementUseCase$invoke$2(this.this$0, this.$groupId, this.$content, this.$pinStatus, continuation);
        createGroupAnnouncementUseCase$invoke$2.L$0 = obj;
        return createGroupAnnouncementUseCase$invoke$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends GroupAnnouncementInfo>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<GroupAnnouncementInfo>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<GroupAnnouncementInfo>> continuation) {
        return ((CreateGroupAnnouncementUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C35789oDt c35789oDt = this.this$0;
                String str = this.$groupId;
                String str2 = this.$content;
                int i2 = this.$pinStatus;
                Result.Application application = Result.Companion;
                sIR sir = c35789oDt.KWHzl;
                Integer numAEQbTJ = C56443yFo.AEQbTJ(i2);
                this.label = 1;
                obj = sir.OLrzqt(str, str2, numAEQbTJ, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((GroupAnnouncementInfo) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
