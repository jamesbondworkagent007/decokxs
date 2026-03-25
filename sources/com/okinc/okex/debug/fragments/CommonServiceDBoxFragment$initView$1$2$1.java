package com.okinc.okex.debug.fragments;

import android.content.Context;
import com.okinc.okex.common.navigator.CommonServiceKey;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC47367toh;
import o.C45300snG;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes16.dex */
public final class CommonServiceDBoxFragment$initView$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CommonServiceKey $selectedKey;
    final /* synthetic */ String $serviceData;
    final /* synthetic */ AbstractC47367toh $this_apply;
    int label;
    final /* synthetic */ CommonServiceDBoxFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonServiceDBoxFragment$initView$1$2$1(CommonServiceDBoxFragment commonServiceDBoxFragment, CommonServiceKey commonServiceKey, AbstractC47367toh abstractC47367toh, String str, Continuation<? super CommonServiceDBoxFragment$initView$1$2$1> continuation) {
        super(2, continuation);
        this.this$0 = commonServiceDBoxFragment;
        this.$selectedKey = commonServiceKey;
        this.$this_apply = abstractC47367toh;
        this.$serviceData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CommonServiceDBoxFragment$initView$1$2$1(this.this$0, this.$selectedKey, this.$this_apply, this.$serviceData, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CommonServiceDBoxFragment$initView$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C45300snG c45300snGKWHzl = this.this$0.KWHzl();
            CommonServiceKey commonServiceKey = this.$selectedKey;
            Context context = this.$this_apply.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            String str = this.$serviceData;
            this.label = 1;
            if (c45300snGKWHzl.copydefault(commonServiceKey, context, str, this) == objCopydefault) {
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
