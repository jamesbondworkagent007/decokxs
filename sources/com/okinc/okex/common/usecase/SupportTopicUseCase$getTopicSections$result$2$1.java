package com.okinc.okex.common.usecase;

import com.okinc.okex.center.bean.TopicListItem;
import com.okinc.okex.center.bean.TopicSection;
import com.okinc.okex.center.bean.TopicSectionsResponse;
import com.okinc.okex.rating.bean.GetSupportRatingBean;
import com.okinc.okex.rating.net.RatingResult;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C45349soC;
import o.C56391yDq;
import o.C56442yFn;
import o.sxK;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportTopicUseCase$getTopicSections$result$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends List<? extends TopicListItem>, ? extends RatingResult>>, Object> {
    final /* synthetic */ TopicSectionsResponse $response;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportTopicUseCase$getTopicSections$result$2$1(TopicSectionsResponse topicSectionsResponse, Continuation<? super SupportTopicUseCase$getTopicSections$result$2$1> continuation) {
        super(2, continuation);
        this.$response = topicSectionsResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportTopicUseCase$getTopicSections$result$2$1(this.$response, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends List<? extends TopicListItem>, ? extends RatingResult>> continuation) {
        return ((SupportTopicUseCase$getTopicSections$result$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List<TopicSection> list = this.$response.getList();
            List listAEQbTJ = list != null ? C45349soC.AEQbTJ(list) : null;
            GetSupportRatingBean rating = this.$response.getRating();
            return new Pair(listAEQbTJ, rating != null ? sxK.toRatingResult$default(sxK.copydefault, rating, null, null, null, 7, null) : null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
