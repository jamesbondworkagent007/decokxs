package com.okinc.okex.search.usecase;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.center.bean.enums.CategorySlug;
import com.okinc.okex.search.bean.SearchArticleResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44059sBv;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC44921sfz;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: loaded from: classes10.dex */
public final class SearchArticlesUseCase$getSearchArticles$result$1$response$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<SearchArticleResponse>>, Object> {
    final /* synthetic */ List<CategorySlug> $categories;
    final /* synthetic */ String $keyword;
    final /* synthetic */ int $page;
    final /* synthetic */ int $pageSize;
    final /* synthetic */ List<String> $sectionIds;
    final /* synthetic */ C44059sBv $this_runOrErrorResponse;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.okinc.okex.center.bean.enums.CategorySlug> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SearchArticlesUseCase$getSearchArticles$result$1$response$1$1(C44059sBv c44059sBv, String str, List<? extends CategorySlug> list, List<String> list2, int i, int i2, Continuation<? super SearchArticlesUseCase$getSearchArticles$result$1$response$1$1> continuation) {
        super(2, continuation);
        this.$this_runOrErrorResponse = c44059sBv;
        this.$keyword = str;
        this.$categories = list;
        this.$sectionIds = list2;
        this.$page = i;
        this.$pageSize = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchArticlesUseCase$getSearchArticles$result$1$response$1$1(this.$this_runOrErrorResponse, this.$keyword, this.$categories, this.$sectionIds, this.$page, this.$pageSize, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<SearchArticleResponse>> continuation) {
        return ((SearchArticlesUseCase$getSearchArticles$result$1$response$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return obj;
        }
        C56391yDq.AEQbTJ(obj);
        InterfaceC44921sfz interfaceC44921sfz = this.$this_runOrErrorResponse.AEQbTJ;
        String str = this.$keyword;
        List<CategorySlug> list = this.$categories;
        String strJoinToString$default = list != null ? CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new Function1() { // from class: o.sBs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return ((CategorySlug) obj2).getValue();
            }
        }, 30, null) : null;
        List<String> list2 = this.$sectionIds;
        String strJoinToString$default2 = list2 != null ? CollectionsKt___CollectionsKt.joinToString$default(list2, ",", null, null, 0, null, null, 62, null) : null;
        Integer numAEQbTJ = C56443yFo.AEQbTJ(this.$page);
        Integer numAEQbTJ2 = C56443yFo.AEQbTJ(this.$pageSize);
        this.label = 1;
        Object searchArticles$default = InterfaceC44921sfz.Activity.getSearchArticles$default(interfaceC44921sfz, str, strJoinToString$default, strJoinToString$default2, null, numAEQbTJ, numAEQbTJ2, null, null, null, this, MLKEMEngine.KyberPolyBytes, null);
        return searchArticles$default == objCopydefault ? objCopydefault : searchArticles$default;
    }
}
