package com.okinc.planet.biz_content.leaderboard.viewmodel;

import com.okinc.planet.biz_content.leaderboard.bean.NewsFlashArticle;
import com.okinc.planet.biz_content.leaderboard.bean.NewsFlashListResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C47659tuL;
import o.C47667tuT;
import o.C56391yDq;
import o.C56442yFn;
import o.qTC;

/* JADX INFO: loaded from: classes19.dex */
public final class PlanetLatestNewsViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Integer $size;
    int label;
    final /* synthetic */ C47667tuT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetLatestNewsViewModel$loadData$1(C47667tuT c47667tuT, Integer num, Continuation<? super PlanetLatestNewsViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = c47667tuT;
        this.$size = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetLatestNewsViewModel$loadData$1(this.this$0, this.$size, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetLatestNewsViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C47659tuL c47659tuL = this.this$0.copydefault;
            Integer num = this.$size;
            String strAEQbTJ = qTC.copydefault.AEQbTJ();
            this.label = 1;
            obj = c47659tuL.AEQbTJ(num, strAEQbTJ, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        NewsFlashListResponse newsFlashListResponse = (NewsFlashListResponse) obj;
        MutableSharedFlow mutableSharedFlow = this.this$0.OLrzqt;
        List<NewsFlashArticle> contentDataList = newsFlashListResponse != null ? newsFlashListResponse.getContentDataList() : null;
        this.label = 2;
        if (mutableSharedFlow.emit(contentDataList, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
