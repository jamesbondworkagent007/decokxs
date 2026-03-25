package com.okinc.im.imui.search.viewmodel;

import com.okinc.im.bean.SearchResultData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes8.dex */
public final class FeedChatSearchViewModel$loadInitialData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<SearchResultData> $resultList;
    int label;
    final /* synthetic */ FeedChatSearchViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.im.bean.SearchResultData> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FeedChatSearchViewModel$loadInitialData$1(FeedChatSearchViewModel feedChatSearchViewModel, List<? extends SearchResultData> list, Continuation<? super FeedChatSearchViewModel$loadInitialData$1> continuation) {
        super(2, continuation);
        this.this$0 = feedChatSearchViewModel;
        this.$resultList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FeedChatSearchViewModel$loadInitialData$1(this.this$0, this.$resultList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FeedChatSearchViewModel$loadInitialData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.KWHzl;
            Boolean boolKWHzl = C56443yFo.KWHzl(false);
            this.label = 1;
            if (mutableStateFlow.emit(boolKWHzl, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                this.this$0.copydefault((List<? extends SearchResultData>) this.$resultList);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        MutableStateFlow mutableStateFlow2 = this.this$0.EZpvd;
        Boolean boolKWHzl2 = C56443yFo.KWHzl(false);
        this.label = 2;
        if (mutableStateFlow2.emit(boolKWHzl2, this) == objCopydefault) {
            return objCopydefault;
        }
        this.this$0.copydefault((List<? extends SearchResultData>) this.$resultList);
        return Unit.INSTANCE;
    }
}
