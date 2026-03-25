package com.okinc.kline.ui.earn;

import android.graphics.drawable.Drawable;
import android.widget.Toast;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C39417pru;
import o.C55328xhq;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class CoinEarnViewModel$getCoinInfo$result$1$content$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Toast>, Object> {
    final /* synthetic */ ResponseData<List<C39417pru>> $result;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinEarnViewModel$getCoinInfo$result$1$content$2(ResponseData<List<C39417pru>> responseData, Continuation<? super CoinEarnViewModel$getCoinInfo$result$1$content$2> continuation) {
        super(2, continuation);
        this.$result = responseData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoinEarnViewModel$getCoinInfo$result$1$content$2(this.$result, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Toast> continuation) {
        return ((CoinEarnViewModel$getCoinInfo$result$1$content$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return C55328xhq.show$default(C55328xhq.OLrzqt, this.$result.getErrorMsg(), (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
