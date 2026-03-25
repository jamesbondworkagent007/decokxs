package com.okinc.kline.features.kline.indexcomponents.data.repo;

import com.okinc.kline.features.kline.indexcomponents.data.model.IndexComponentsResp;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.oRA;
import o.oRD;

/* JADX INFO: loaded from: classes8.dex */
public final class IndexComponentsRepository$getIndexComponents$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super IndexComponentsResp>, Object> {
    final /* synthetic */ String $index;
    int label;
    final /* synthetic */ oRD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndexComponentsRepository$getIndexComponents$2(oRD ord, String str, Continuation<? super IndexComponentsRepository$getIndexComponents$2> continuation) {
        super(2, continuation);
        this.this$0 = ord;
        this.$index = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IndexComponentsRepository$getIndexComponents$2(this.this$0, this.$index, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super IndexComponentsResp> continuation) {
        return ((IndexComponentsRepository$getIndexComponents$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            oRA ora = this.this$0.KWHzl;
            String str = this.$index;
            this.label = 1;
            obj = ora.KWHzl(str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return ((ResponseData) obj).getData();
    }
}
