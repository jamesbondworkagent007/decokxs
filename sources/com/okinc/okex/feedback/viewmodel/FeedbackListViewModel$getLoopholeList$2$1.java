package com.okinc.okex.feedback.viewmodel;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.feedback.net.FeedbackApiService;
import com.okinc.okex.feedback.net.bean.LoopholeListResp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class FeedbackListViewModel$getLoopholeList$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<LoopholeListResp>>, Object> {
    final /* synthetic */ int $dateOrder;
    final /* synthetic */ int $listSize;
    final /* synthetic */ int $pageSize;
    final /* synthetic */ boolean $reset;
    final /* synthetic */ Integer $status;
    final /* synthetic */ FeedbackListViewModel $this_runOrErrorResponse;
    final /* synthetic */ int $type;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackListViewModel$getLoopholeList$2$1(FeedbackListViewModel feedbackListViewModel, int i, int i2, Integer num, boolean z, int i3, int i4, Continuation<? super FeedbackListViewModel$getLoopholeList$2$1> continuation) {
        super(2, continuation);
        this.$this_runOrErrorResponse = feedbackListViewModel;
        this.$dateOrder = i;
        this.$type = i2;
        this.$status = num;
        this.$reset = z;
        this.$listSize = i3;
        this.$pageSize = i4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FeedbackListViewModel$getLoopholeList$2$1(this.$this_runOrErrorResponse, this.$dateOrder, this.$type, this.$status, this.$reset, this.$listSize, this.$pageSize, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<LoopholeListResp>> continuation) {
        return ((FeedbackListViewModel$getLoopholeList$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FeedbackApiService feedbackApiService = this.$this_runOrErrorResponse.KWHzl;
            int i2 = this.$dateOrder;
            int i3 = this.$type;
            Integer num = this.$status;
            int i4 = this.$reset ? 0 : this.$listSize;
            int i5 = this.$pageSize;
            this.label = 1;
            obj = feedbackApiService.getLoopholeList(i2, i3, num, i4, i5, this);
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
