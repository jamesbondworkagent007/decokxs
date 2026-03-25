package com.okinc.business.market.features.meme.filter.ui;

import com.okinc.business.market.features.meme.filter.domain.TokenAgeType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C28666kfA;
import o.C28717kfz;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeFilterViewModel$updateTokenAge$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $max;
    final /* synthetic */ String $min;
    final /* synthetic */ TokenAgeType $tokenAgeType;
    int label;
    final /* synthetic */ MemeFilterViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeFilterViewModel$updateTokenAge$1(String str, String str2, MemeFilterViewModel memeFilterViewModel, TokenAgeType tokenAgeType, Continuation<? super MemeFilterViewModel$updateTokenAge$1> continuation) {
        super(2, continuation);
        this.$min = str;
        this.$max = str2;
        this.this$0 = memeFilterViewModel;
        this.$tokenAgeType = tokenAgeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeFilterViewModel$updateTokenAge$1(this.$min, this.$max, this.this$0, this.$tokenAgeType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeFilterViewModel$updateTokenAge$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C28717kfz c28717kfzCopydefault = C28717kfz.Companion.copydefault(this.$min, this.$max);
            MutableStateFlow mutableStateFlow = this.this$0.DbNXlk;
            TokenAgeType tokenAgeType = this.$tokenAgeType;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, new C28666kfA(tokenAgeType, c28717kfzCopydefault)));
            this.this$0.zLjUOn();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
