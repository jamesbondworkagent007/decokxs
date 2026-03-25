package com.okinc.okex.article.viewmodel;

import com.okinc.okex.center.bean.enums.TopCategory;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class FullArticleListViewModel$fetchNextPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ FullArticleListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullArticleListViewModel$fetchNextPage$1(FullArticleListViewModel fullArticleListViewModel, Continuation<? super FullArticleListViewModel$fetchNextPage$1> continuation) {
        super(2, continuation);
        this.this$0 = fullArticleListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FullArticleListViewModel$fetchNextPage$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FullArticleListViewModel$fetchNextPage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            TopCategory topCategory = (TopCategory) this.this$0.AEQbTJ.getValue();
            if (topCategory != null) {
                FullArticleListViewModel fullArticleListViewModel = this.this$0;
                Integer num = (Integer) fullArticleListViewModel.EZpvd.getValue();
                if (num != null) {
                    int iIntValue = num.intValue();
                    this.label = 1;
                    if (fullArticleListViewModel.copydefault(topCategory, iIntValue + 1, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
