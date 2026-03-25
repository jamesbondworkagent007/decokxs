package com.okinc.okex.center.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.okinc.okex.center.bean.RecommendTopicPageData;
import com.okinc.okex.center.bean.TopicListItem;
import com.okinc.okex.center.viewmodel.SupportRecommendTopicViewModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C45398soz;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportRecommendTopicViewModel$fetchData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SupportRecommendTopicViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportRecommendTopicViewModel$fetchData$1(SupportRecommendTopicViewModel supportRecommendTopicViewModel, Continuation<? super SupportRecommendTopicViewModel$fetchData$1> continuation) {
        super(2, continuation);
        this.this$0 = supportRecommendTopicViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SupportRecommendTopicViewModel$fetchData$1 supportRecommendTopicViewModel$fetchData$1 = new SupportRecommendTopicViewModel$fetchData$1(this.this$0, continuation);
        supportRecommendTopicViewModel$fetchData$1.L$0 = obj;
        return supportRecommendTopicViewModel$fetchData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportRecommendTopicViewModel$fetchData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SupportRecommendTopicViewModel supportRecommendTopicViewModel = this.this$0;
                Result.Application application = Result.Companion;
                C45398soz c45398soz = supportRecommendTopicViewModel.valueOf;
                this.label = 1;
                objCopydefault = c45398soz.copydefault(this);
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
            C56391yDq.AEQbTJ(objCopydefault);
            objM7377constructorimpl = Result.m7377constructorimpl((RecommendTopicPageData) objCopydefault);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        SupportRecommendTopicViewModel supportRecommendTopicViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            RecommendTopicPageData recommendTopicPageData = (RecommendTopicPageData) objM7377constructorimpl;
            if (recommendTopicPageData.getTopicList().isEmpty()) {
                supportRecommendTopicViewModel2.KWHzl.setValue(SupportRecommendTopicViewModel.StateListAnimator.C0543StateListAnimator.OLrzqt);
            } else {
                supportRecommendTopicViewModel2.KWHzl.setValue(new SupportRecommendTopicViewModel.StateListAnimator.Application(recommendTopicPageData.getTopicList()));
                MutableLiveData mutableLiveData = supportRecommendTopicViewModel2.AEQbTJ;
                TopicListItem.TopicItem topicItem = (TopicListItem.TopicItem) CollectionsKt___CollectionsKt.firstOrNull(recommendTopicPageData.getTopicList());
                mutableLiveData.setValue(topicItem != null ? topicItem.getSlug() : null);
            }
            supportRecommendTopicViewModel2.AEQbTJ().setValue(recommendTopicPageData.getRatingResult());
        }
        SupportRecommendTopicViewModel supportRecommendTopicViewModel3 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            supportRecommendTopicViewModel3.KWHzl.setValue(SupportRecommendTopicViewModel.StateListAnimator.ActionBar.AEQbTJ);
        }
        return Unit.INSTANCE;
    }
}
