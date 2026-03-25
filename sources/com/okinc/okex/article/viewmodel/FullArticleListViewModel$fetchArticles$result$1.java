package com.okinc.okex.article.viewmodel;

import com.okinc.okex.article.ui.FullArticleListActivity;
import com.okinc.okex.center.bean.enums.TopCategory;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C45347soA;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes10.dex */
public final class FullArticleListViewModel$fetchArticles$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C45347soA.ActionBar>, Object> {
    final /* synthetic */ int $page;
    final /* synthetic */ TopCategory $sort;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FullArticleListViewModel this$0;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[FullArticleListActivity.FilterListBy.values().length];
            try {
                iArr[FullArticleListActivity.FilterListBy.SECTIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FullArticleListActivity.FilterListBy.TAGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FullArticleListActivity.FilterListBy.TRANSACTION_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullArticleListViewModel$fetchArticles$result$1(FullArticleListViewModel fullArticleListViewModel, TopCategory topCategory, int i, Continuation<? super FullArticleListViewModel$fetchArticles$result$1> continuation) {
        super(2, continuation);
        this.this$0 = fullArticleListViewModel;
        this.$sort = topCategory;
        this.$page = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FullArticleListViewModel$fetchArticles$result$1 fullArticleListViewModel$fetchArticles$result$1 = new FullArticleListViewModel$fetchArticles$result$1(this.this$0, this.$sort, this.$page, continuation);
        fullArticleListViewModel$fetchArticles$result$1.L$0 = obj;
        return fullArticleListViewModel$fetchArticles$result$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C45347soA.ActionBar> continuation) {
        return ((FullArticleListViewModel$fetchArticles$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C45347soA.ActionBar actionBar;
        Object objEZpvd;
        Object objEZpvd2;
        Object objEZpvd3;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            FullArticleListActivity.FilterListBy filterListBy = (FullArticleListActivity.FilterListBy) this.this$0.valueOf.getValue();
            if (filterListBy != null) {
                FullArticleListViewModel fullArticleListViewModel = this.this$0;
                TopCategory topCategory = this.$sort;
                int i2 = this.$page;
                List list = (List) fullArticleListViewModel.AhwBna.getValue();
                if (list != null) {
                    int i3 = Application.AEQbTJ[filterListBy.ordinal()];
                    if (i3 == 1) {
                        C45347soA c45347soA = fullArticleListViewModel.values;
                        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null);
                        String value = topCategory.getValue();
                        Integer numAEQbTJ = C56443yFo.AEQbTJ(i2);
                        Integer numAEQbTJ2 = C56443yFo.AEQbTJ(12);
                        this.L$0 = coroutineScope;
                        this.label = 1;
                        objEZpvd = c45347soA.EZpvd((3 & 1) != 0 ? null : null, (3 & 2) != 0 ? null : strJoinToString$default, (3 & 4) != 0 ? null : null, (3 & 8) != 0 ? null : value, (3 & 16) != 0 ? null : numAEQbTJ, (3 & 32) != 0 ? null : numAEQbTJ2, this);
                        if (objEZpvd == objCopydefault) {
                            return objCopydefault;
                        }
                        actionBar = (C45347soA.ActionBar) objEZpvd;
                    } else if (i3 == 2) {
                        C45347soA c45347soA2 = fullArticleListViewModel.values;
                        String strJoinToString$default2 = CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null);
                        String value2 = topCategory.getValue();
                        Integer numAEQbTJ3 = C56443yFo.AEQbTJ(i2);
                        Integer numAEQbTJ4 = C56443yFo.AEQbTJ(12);
                        this.L$0 = coroutineScope;
                        this.label = 2;
                        objEZpvd2 = c45347soA2.EZpvd((3 & 1) != 0 ? null : strJoinToString$default2, (3 & 2) != 0 ? null : null, (3 & 4) != 0 ? null : null, (3 & 8) != 0 ? null : value2, (3 & 16) != 0 ? null : numAEQbTJ3, (3 & 32) != 0 ? null : numAEQbTJ4, this);
                        if (objEZpvd2 == objCopydefault) {
                            return objCopydefault;
                        }
                        actionBar = (C45347soA.ActionBar) objEZpvd2;
                    } else if (i3 == 3) {
                        C45347soA c45347soA3 = fullArticleListViewModel.values;
                        String str = (String) CollectionsKt___CollectionsKt.firstOrNull(list);
                        String value3 = topCategory.getValue();
                        Integer numAEQbTJ5 = C56443yFo.AEQbTJ(i2);
                        Integer numAEQbTJ6 = C56443yFo.AEQbTJ(12);
                        this.L$0 = coroutineScope;
                        this.label = 3;
                        objEZpvd3 = c45347soA3.EZpvd((3 & 1) != 0 ? null : null, (3 & 2) != 0 ? null : null, (3 & 4) != 0 ? null : str, (3 & 8) != 0 ? null : value3, (3 & 16) != 0 ? null : numAEQbTJ5, (3 & 32) != 0 ? null : numAEQbTJ6, this);
                        if (objEZpvd3 == objCopydefault) {
                            return objCopydefault;
                        }
                        actionBar = (C45347soA.ActionBar) objEZpvd3;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    actionBar = null;
                }
            }
            return new C45347soA.ActionBar.Application(new Exception("FilterBy or FilterIds is null"));
        }
        if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            objEZpvd = obj;
            actionBar = (C45347soA.ActionBar) objEZpvd;
        } else if (i == 2) {
            C56391yDq.AEQbTJ(obj);
            objEZpvd2 = obj;
            actionBar = (C45347soA.ActionBar) objEZpvd2;
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd3 = obj;
            actionBar = (C45347soA.ActionBar) objEZpvd3;
        }
        if (actionBar != null) {
            return actionBar;
        }
        return new C45347soA.ActionBar.Application(new Exception("FilterBy or FilterIds is null"));
    }
}
