package com.okinc.im.usecase.group.banner;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.feature.group.repository.remote.InHouseIMGroupService;
import com.okinc.okimcore.model.remote.GetGroupBannersReq;
import com.okinc.okimcore.model.remote.GroupBannerList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35792oDw;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class GetGroupBannerListUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<GroupBannerList>>, Object> {
    final /* synthetic */ String $groupId;
    int label;
    final /* synthetic */ C35792oDw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetGroupBannerListUseCase$invoke$2(C35792oDw c35792oDw, String str, Continuation<? super GetGroupBannerListUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c35792oDw;
        this.$groupId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetGroupBannerListUseCase$invoke$2(this.this$0, this.$groupId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<GroupBannerList>> continuation) {
        return ((GetGroupBannerListUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                InHouseIMGroupService inHouseIMGroupService = this.this$0.AEQbTJ;
                GetGroupBannersReq getGroupBannersReq = new GetGroupBannersReq(this.$groupId);
                this.label = 1;
                obj = inHouseIMGroupService.getGroupBanners(getGroupBannersReq, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return (ResponseData) obj;
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Network error";
            }
            return new ResponseData(-1, message, null, null, null, null, 44, null);
        }
    }
}
