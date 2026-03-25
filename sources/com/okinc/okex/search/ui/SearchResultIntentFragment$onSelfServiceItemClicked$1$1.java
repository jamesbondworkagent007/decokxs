package com.okinc.okex.search.ui;

import android.content.Context;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C45397soy;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes16.dex */
public final class SearchResultIntentFragment$onSelfServiceItemClicked$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SelfServiceToolBean $data;
    final /* synthetic */ Context $this_apply;
    int label;
    final /* synthetic */ SearchResultIntentFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultIntentFragment$onSelfServiceItemClicked$1$1(SearchResultIntentFragment searchResultIntentFragment, Context context, SelfServiceToolBean selfServiceToolBean, Continuation<? super SearchResultIntentFragment$onSelfServiceItemClicked$1$1> continuation) {
        super(2, continuation);
        this.this$0 = searchResultIntentFragment;
        this.$this_apply = context;
        this.$data = selfServiceToolBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchResultIntentFragment$onSelfServiceItemClicked$1$1(this.this$0, this.$this_apply, this.$data, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchResultIntentFragment$onSelfServiceItemClicked$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C45397soy c45397soyValues = this.this$0.values();
            Context context = this.$this_apply;
            SelfServiceToolBean selfServiceToolBean = this.$data;
            this.label = 1;
            if (C45397soy.invoke$default(c45397soyValues, context, selfServiceToolBean, null, this, 4, null) == objCopydefault) {
                return objCopydefault;
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
