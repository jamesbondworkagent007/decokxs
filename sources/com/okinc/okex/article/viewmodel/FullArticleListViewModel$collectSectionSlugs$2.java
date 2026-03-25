package com.okinc.okex.article.viewmodel;

import com.okinc.okex.article.bean.SupportFaqArticle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class FullArticleListViewModel$collectSectionSlugs$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ List<SupportFaqArticle> $this_collectSectionSlugs;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullArticleListViewModel$collectSectionSlugs$2(List<SupportFaqArticle> list, Continuation<? super FullArticleListViewModel$collectSectionSlugs$2> continuation) {
        super(2, continuation);
        this.$this_collectSectionSlugs = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FullArticleListViewModel$collectSectionSlugs$2(this.$this_collectSectionSlugs, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((FullArticleListViewModel$collectSectionSlugs$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List<SupportFaqArticle> list = this.$this_collectSectionSlugs;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String sectionSlug = ((SupportFaqArticle) it.next()).getSectionSlug();
                if (sectionSlug != null) {
                    arrayList.add(sectionSlug);
                }
            }
            return CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.QbewEr(arrayList), ",", null, null, 0, null, null, 62, null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
