package com.okinc.okex.search.usecase;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.center.bean.enums.CategorySlug;
import com.okinc.okex.search.bean.SearchHintResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44055sBr;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC45301snH;

/* JADX INFO: loaded from: classes10.dex */
public final class SearchHintsUseCase$getSearchHints$result$1$response$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<SearchHintResponse>>, Object> {
    final /* synthetic */ Integer $articleCount;
    final /* synthetic */ List<CategorySlug> $categories;
    final /* synthetic */ Integer $intentCount;
    final /* synthetic */ boolean $isWeb3;
    final /* synthetic */ String $searchTerm;
    final /* synthetic */ C44055sBr $this_runOrErrorResponse;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.okinc.okex.center.bean.enums.CategorySlug> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SearchHintsUseCase$getSearchHints$result$1$response$1$1(C44055sBr c44055sBr, String str, List<? extends CategorySlug> list, Integer num, Integer num2, boolean z, Continuation<? super SearchHintsUseCase$getSearchHints$result$1$response$1$1> continuation) {
        super(2, continuation);
        this.$this_runOrErrorResponse = c44055sBr;
        this.$searchTerm = str;
        this.$categories = list;
        this.$articleCount = num;
        this.$intentCount = num2;
        this.$isWeb3 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchHintsUseCase$getSearchHints$result$1$response$1$1(this.$this_runOrErrorResponse, this.$searchTerm, this.$categories, this.$articleCount, this.$intentCount, this.$isWeb3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<SearchHintResponse>> continuation) {
        return ((SearchHintsUseCase$getSearchHints$result$1$response$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC45301snH interfaceC45301snH = this.$this_runOrErrorResponse.EZpvd;
            String str = this.$searchTerm;
            List<CategorySlug> list = this.$categories;
            String strJoinToString$default = list != null ? CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new Function1() { // from class: o.sBt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return ((CategorySlug) obj2).getValue();
                }
            }, 30, null) : null;
            Integer num = this.$articleCount;
            Integer num2 = this.$intentCount;
            Boolean boolKWHzl = C56443yFo.KWHzl(this.$isWeb3);
            this.label = 1;
            obj = interfaceC45301snH.AEQbTJ(str, strJoinToString$default, num, num2, boolKWHzl, this);
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
