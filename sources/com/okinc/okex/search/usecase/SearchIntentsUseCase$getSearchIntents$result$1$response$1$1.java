package com.okinc.okex.search.usecase;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.search.bean.SearchIntentResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC45301snH;
import o.sBA;

/* JADX INFO: loaded from: classes10.dex */
public final class SearchIntentsUseCase$getSearchIntents$result$1$response$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<SearchIntentResponse>>, Object> {
    final /* synthetic */ String $intentId;
    final /* synthetic */ sBA $this_runOrErrorResponse;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchIntentsUseCase$getSearchIntents$result$1$response$1$1(sBA sba, String str, Continuation<? super SearchIntentsUseCase$getSearchIntents$result$1$response$1$1> continuation) {
        super(2, continuation);
        this.$this_runOrErrorResponse = sba;
        this.$intentId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchIntentsUseCase$getSearchIntents$result$1$response$1$1(this.$this_runOrErrorResponse, this.$intentId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<SearchIntentResponse>> continuation) {
        return ((SearchIntentsUseCase$getSearchIntents$result$1$response$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC45301snH interfaceC45301snH = this.$this_runOrErrorResponse.EZpvd;
            String str = this.$intentId;
            this.label = 1;
            obj = interfaceC45301snH.OLrzqt(str, this);
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
