package com.okinc.im.usecase.banner;

import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C36551odB;
import o.C56391yDq;
import o.C56442yFn;
import o.oBI;

/* JADX INFO: loaded from: classes8.dex */
public final class RecordGroupAnnouncementBannerShowAlreadyUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C36551odB $groupAnnouncementBanner;
    final /* synthetic */ GroupInfo $groupInfo;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordGroupAnnouncementBannerShowAlreadyUseCase$execute$2(GroupInfo groupInfo, C36551odB c36551odB, Continuation<? super RecordGroupAnnouncementBannerShowAlreadyUseCase$execute$2> continuation) {
        super(2, continuation);
        this.$groupInfo = groupInfo;
        this.$groupAnnouncementBanner = c36551odB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecordGroupAnnouncementBannerShowAlreadyUseCase$execute$2(this.$groupInfo, this.$groupAnnouncementBanner, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecordGroupAnnouncementBannerShowAlreadyUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String groupId = this.$groupInfo.getGroupId();
            Long lAEQbTJ = this.$groupAnnouncementBanner.AEQbTJ();
            if (lAEQbTJ != null) {
                oBI.AEQbTJ.EZpvd(groupId, this.$groupInfo.getGroupNoticeId(), lAEQbTJ.longValue());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
