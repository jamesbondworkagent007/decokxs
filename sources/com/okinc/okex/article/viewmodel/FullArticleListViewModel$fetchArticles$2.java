package com.okinc.okex.article.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.okinc.okex.article.bean.ArticleListResponse;
import com.okinc.okex.article.bean.SupportFaqArticle;
import com.okinc.okex.rating.bean.GetSupportRatingBean;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32989mnw;
import o.C44760scx;
import o.C45347soA;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.sxK;

/* JADX INFO: loaded from: classes10.dex */
public final class FullArticleListViewModel$fetchArticles$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C45347soA.ActionBar $result;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ FullArticleListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullArticleListViewModel$fetchArticles$2(C45347soA.ActionBar actionBar, FullArticleListViewModel fullArticleListViewModel, Continuation<? super FullArticleListViewModel$fetchArticles$2> continuation) {
        super(2, continuation);
        this.$result = actionBar;
        this.this$0 = fullArticleListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FullArticleListViewModel$fetchArticles$2(this.$result, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FullArticleListViewModel$fetchArticles$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.StringBuilder] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FullArticleListViewModel fullArticleListViewModel;
        ?? r0;
        MutableLiveData mutableLiveData;
        ArticleListResponse articleListResponse;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C45347soA.ActionBar actionBar = this.$result;
            if (actionBar instanceof C45347soA.ActionBar.TaskDescription) {
                ArticleListResponse articleListResponseEZpvd = ((C45347soA.ActionBar.TaskDescription) actionBar).EZpvd();
                fullArticleListViewModel = this.this$0;
                ?? r1 = articleListResponseEZpvd.getPageNum() * articleListResponseEZpvd.getPageSize() < articleListResponseEZpvd.getTotal() ? 1 : 0;
                C44760scx.log$default("fetchArticles success: pageNum[" + articleListResponseEZpvd.getPageNum() + "] pageSize[" + articleListResponseEZpvd.getPageSize() + "] total[" + articleListResponseEZpvd.getTotal() + "]", null, 2, null);
                ?? sb = new StringBuilder();
                sb.append("fetchArticles success: hasMorePages[");
                sb.append(r1);
                sb.append("]");
                C44760scx.log$default(sb.toString(), null, 2, null);
                fullArticleListViewModel.EZpvd.setValue(C56443yFo.AEQbTJ(articleListResponseEZpvd.getPageNum()));
                fullArticleListViewModel.OLrzqt.setValue(articleListResponseEZpvd.getList());
                MutableLiveData mutableLiveData2 = fullArticleListViewModel.DbNXlk;
                List<SupportFaqArticle> list = articleListResponseEZpvd.getList();
                this.L$0 = fullArticleListViewModel;
                this.L$1 = articleListResponseEZpvd;
                this.L$2 = mutableLiveData2;
                this.I$0 = r1;
                this.label = 1;
                Object objKWHzl = fullArticleListViewModel.KWHzl((List<SupportFaqArticle>) list, (Continuation<? super String>) this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                r0 = r1;
                mutableLiveData = mutableLiveData2;
                articleListResponse = articleListResponseEZpvd;
                obj = objKWHzl;
            } else {
                if (!(actionBar instanceof C45347soA.ActionBar.Application)) {
                    throw new NoWhenBranchMatchedException();
                }
                C44760scx.log$default("fetchArticles failed: " + ((C45347soA.ActionBar.Application) actionBar).copydefault().getMessage(), null, 2, null);
                this.this$0.AYXKKw.setValue(C56443yFo.KWHzl(false));
                this.this$0.copydefault.setValue(new C32989mnw(((C45347soA.ActionBar.Application) this.$result).copydefault()));
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = this.I$0;
            mutableLiveData = (MutableLiveData) this.L$2;
            articleListResponse = (ArticleListResponse) this.L$1;
            fullArticleListViewModel = (FullArticleListViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            r0 = i2;
        }
        mutableLiveData.setValue(obj);
        fullArticleListViewModel.AYXKKw.setValue(C56443yFo.KWHzl(r0 != 0));
        MutableLiveData mutableLiveData3 = fullArticleListViewModel.isConnected;
        GetSupportRatingBean rating = articleListResponse.getRating();
        mutableLiveData3.setValue(rating != null ? sxK.toRatingResult$default(sxK.copydefault, rating, null, null, null, 7, null) : null);
        return Unit.INSTANCE;
    }
}
