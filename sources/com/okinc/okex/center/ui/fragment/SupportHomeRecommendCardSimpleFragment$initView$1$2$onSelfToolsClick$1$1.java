package com.okinc.okex.center.ui.fragment;

import androidx.fragment.app.FragmentActivity;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C45397soy;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class SupportHomeRecommendCardSimpleFragment$initView$1$2$onSelfToolsClick$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Object $additionalExtra;
    final /* synthetic */ SelfServiceToolBean $item;
    final /* synthetic */ FragmentActivity $this_apply;
    int label;
    final /* synthetic */ SupportHomeRecommendCardSimpleFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportHomeRecommendCardSimpleFragment$initView$1$2$onSelfToolsClick$1$1(SupportHomeRecommendCardSimpleFragment supportHomeRecommendCardSimpleFragment, FragmentActivity fragmentActivity, SelfServiceToolBean selfServiceToolBean, Object obj, Continuation<? super SupportHomeRecommendCardSimpleFragment$initView$1$2$onSelfToolsClick$1$1> continuation) {
        super(2, continuation);
        this.this$0 = supportHomeRecommendCardSimpleFragment;
        this.$this_apply = fragmentActivity;
        this.$item = selfServiceToolBean;
        this.$additionalExtra = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportHomeRecommendCardSimpleFragment$initView$1$2$onSelfToolsClick$1$1(this.this$0, this.$this_apply, this.$item, this.$additionalExtra, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportHomeRecommendCardSimpleFragment$initView$1$2$onSelfToolsClick$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C45397soy c45397soyAhwBna = this.this$0.AhwBna();
            FragmentActivity fragmentActivity = this.$this_apply;
            SelfServiceToolBean selfServiceToolBean = this.$item;
            Object obj2 = this.$additionalExtra;
            this.label = 1;
            if (c45397soyAhwBna.KWHzl(fragmentActivity, selfServiceToolBean, obj2, this) == objCopydefault) {
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
