package com.okinc.im.imui.search.view;

import androidx.fragment.app.Fragment;
import com.okinc.im.bean.SearchResultData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.C33546myW;
import o.C37491ouo;
import o.C56391yDq;
import o.C56442yFn;
import o.nKA;
import o.rVN;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class FeedChatSearchResultFragment$setupObserver$1$1 extends SuspendLambda implements yHO<CoroutineScope, List<? extends SearchResultData>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C37491ouo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedChatSearchResultFragment$setupObserver$1$1(C37491ouo c37491ouo, Continuation<? super FeedChatSearchResultFragment$setupObserver$1$1> continuation) {
        super(3, continuation);
        this.this$0 = c37491ouo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, List<? extends SearchResultData> list, Continuation<? super Unit> continuation) {
        FeedChatSearchResultFragment$setupObserver$1$1 feedChatSearchResultFragment$setupObserver$1$1 = new FeedChatSearchResultFragment$setupObserver$1$1(this.this$0, continuation);
        feedChatSearchResultFragment$setupObserver$1$1.L$0 = list;
        return feedChatSearchResultFragment$setupObserver$1$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C33546myW c33546myW;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.AYXKKw.submitList((List) this.L$0);
            nKA nka = this.this$0.AEQbTJ;
            if (nka != null && (c33546myW = nka.OLrzqt) != null) {
                c33546myW.valueOf();
            }
            rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
