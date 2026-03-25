package com.okinc.okex.common.usecase;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.article.bean.ArticleListResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C45347soA;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44921sfz;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportCenterFaqUseCase$getArticleList$result$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<ArticleListResponse>>, Object> {
    final /* synthetic */ Integer $page;
    final /* synthetic */ String $sectionIds;
    final /* synthetic */ Integer $size;
    final /* synthetic */ String $sort;
    final /* synthetic */ String $tagIds;
    final /* synthetic */ C45347soA $this_runOrErrorResponse;
    final /* synthetic */ String $transactionType;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportCenterFaqUseCase$getArticleList$result$1$1$1(C45347soA c45347soA, String str, String str2, String str3, String str4, Integer num, Integer num2, Continuation<? super SupportCenterFaqUseCase$getArticleList$result$1$1$1> continuation) {
        super(2, continuation);
        this.$this_runOrErrorResponse = c45347soA;
        this.$tagIds = str;
        this.$sectionIds = str2;
        this.$transactionType = str3;
        this.$sort = str4;
        this.$page = num;
        this.$size = num2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportCenterFaqUseCase$getArticleList$result$1$1$1(this.$this_runOrErrorResponse, this.$tagIds, this.$sectionIds, this.$transactionType, this.$sort, this.$page, this.$size, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<ArticleListResponse>> continuation) {
        return ((SupportCenterFaqUseCase$getArticleList$result$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC44921sfz interfaceC44921sfz = this.$this_runOrErrorResponse.copydefault;
            String str = this.$tagIds;
            String str2 = this.$sectionIds;
            String str3 = this.$transactionType;
            String str4 = this.$sort;
            Integer num = this.$page;
            Integer num2 = this.$size;
            this.label = 1;
            obj = interfaceC44921sfz.copydefault(str, str2, str3, str4, num, num2, this);
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
