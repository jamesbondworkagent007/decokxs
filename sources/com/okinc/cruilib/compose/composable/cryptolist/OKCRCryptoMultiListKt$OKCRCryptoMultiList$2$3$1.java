package com.okinc.cruilib.compose.composable.cryptolist;

import androidx.compose.foundation.pager.PagerState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class OKCRCryptoMultiListKt$OKCRCryptoMultiList$2$3$1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
    final /* synthetic */ PagerState $pagerState;
    /* synthetic */ int I$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKCRCryptoMultiListKt$OKCRCryptoMultiList$2$3$1(PagerState pagerState, Continuation<? super OKCRCryptoMultiListKt$OKCRCryptoMultiList$2$3$1> continuation) {
        super(2, continuation);
        this.$pagerState = pagerState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKCRCryptoMultiListKt$OKCRCryptoMultiList$2$3$1 oKCRCryptoMultiListKt$OKCRCryptoMultiList$2$3$1 = new OKCRCryptoMultiListKt$OKCRCryptoMultiList$2$3$1(this.$pagerState, continuation);
        oKCRCryptoMultiListKt$OKCRCryptoMultiList$2$3$1.I$0 = ((Number) obj).intValue();
        return oKCRCryptoMultiListKt$OKCRCryptoMultiList$2$3$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(int i, Continuation<? super Unit> continuation) {
        return ((OKCRCryptoMultiListKt$OKCRCryptoMultiList$2$3$1) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
        return invoke(num.intValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            int i2 = this.I$0;
            PagerState pagerState = this.$pagerState;
            this.label = 1;
            if (PagerState.scrollToPage$default(pagerState, i2, 0.0f, this, 2, null) == objCopydefault) {
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
