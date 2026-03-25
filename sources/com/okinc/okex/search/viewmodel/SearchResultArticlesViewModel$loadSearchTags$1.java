package com.okinc.okex.search.viewmodel;

import com.okinc.okex.center.bean.enums.CategorySlug;
import com.okinc.okex.search.ui.displaymodels.SearchSectionDisplayModel;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C44061sBx;
import o.C45426spa;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class SearchResultArticlesViewModel$loadSearchTags$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CategorySlug $category;
    int label;
    final /* synthetic */ SearchResultArticlesViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultArticlesViewModel$loadSearchTags$1(SearchResultArticlesViewModel searchResultArticlesViewModel, CategorySlug categorySlug, Continuation<? super SearchResultArticlesViewModel$loadSearchTags$1> continuation) {
        super(2, continuation);
        this.this$0 = searchResultArticlesViewModel;
        this.$category = categorySlug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchResultArticlesViewModel$loadSearchTags$1(this.this$0, this.$category, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchResultArticlesViewModel$loadSearchTags$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C44061sBx c44061sBx = this.this$0.gEmmrt;
            CategorySlug categorySlug = this.$category;
            this.label = 1;
            obj = c44061sBx.AEQbTJ(categorySlug, this);
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
        Iterable<SearchSectionDisplayModel> iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
        for (SearchSectionDisplayModel searchSectionDisplayModel : iterable) {
            arrayList.add(new C45426spa.TaskDescription(searchSectionDisplayModel.getId(), searchSectionDisplayModel.getTitle(), false, searchSectionDisplayModel, 4, null));
        }
        this.this$0.AYXKKw.put(this.$category, arrayList);
        MutableStateFlow mutableStateFlow = this.this$0.EZpvd;
        Pair pairOLrzqt = C56390yDp.OLrzqt(this.$category, arrayList);
        this.label = 2;
        if (mutableStateFlow.emit(pairOLrzqt, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
