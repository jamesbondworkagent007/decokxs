package com.okinc.okimcore.feature.group.manager;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.feature.group.repository.remote.InHouseIMGroupService;
import com.okinc.okimcore.model.remote.DeleteGroupAnnouncementsReq;
import com.okinc.okimcore.model.remote.InHouseIMDeleteGroupAnnouncementsResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44261sJg;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMGroupManagerImpl$deleteGroupAnnouncements$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<InHouseIMDeleteGroupAnnouncementsResponse>>, Object> {
    final /* synthetic */ List<Long> $announcementIds;
    final /* synthetic */ long $groupId;
    int label;
    final /* synthetic */ C44261sJg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMGroupManagerImpl$deleteGroupAnnouncements$2(long j, List<Long> list, C44261sJg c44261sJg, Continuation<? super InHouseIMGroupManagerImpl$deleteGroupAnnouncements$2> continuation) {
        super(2, continuation);
        this.$groupId = j;
        this.$announcementIds = list;
        this.this$0 = c44261sJg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InHouseIMGroupManagerImpl$deleteGroupAnnouncements$2(this.$groupId, this.$announcementIds, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<InHouseIMDeleteGroupAnnouncementsResponse>> continuation) {
        return ((InHouseIMGroupManagerImpl$deleteGroupAnnouncements$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            DeleteGroupAnnouncementsReq deleteGroupAnnouncementsReq = new DeleteGroupAnnouncementsReq(this.$groupId, this.$announcementIds);
            InHouseIMGroupService inHouseIMGroupService = this.this$0.AEQbTJ;
            this.label = 1;
            obj = inHouseIMGroupService.deleteGroupAnnouncements(deleteGroupAnnouncementsReq, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
