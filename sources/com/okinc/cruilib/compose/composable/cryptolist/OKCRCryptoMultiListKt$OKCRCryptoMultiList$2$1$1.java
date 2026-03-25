package com.okinc.cruilib.compose.composable.cryptolist;

import androidx.compose.foundation.pager.PagerState;
import com.okinc.cruilib.compose.composable.cryptolist.model.CryptoListType;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C31798mEh;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class OKCRCryptoMultiListKt$OKCRCryptoMultiList$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<C31798mEh> $cryptoMultiListStates;
    final /* synthetic */ Function1<CryptoListType, Unit> $onCryptoListTypeSelect;
    final /* synthetic */ PagerState $pagerState;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.cruilib.compose.composable.cryptolist.model.CryptoListType, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OKCRCryptoMultiListKt$OKCRCryptoMultiList$2$1$1(PagerState pagerState, List<C31798mEh> list, Function1<? super CryptoListType, Unit> function1, Continuation<? super OKCRCryptoMultiListKt$OKCRCryptoMultiList$2$1$1> continuation) {
        super(2, continuation);
        this.$pagerState = pagerState;
        this.$cryptoMultiListStates = list;
        this.$onCryptoListTypeSelect = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKCRCryptoMultiListKt$OKCRCryptoMultiList$2$1$1(this.$pagerState, this.$cryptoMultiListStates, this.$onCryptoListTypeSelect, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKCRCryptoMultiListKt$OKCRCryptoMultiList$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C31798mEh c31798mEh = (C31798mEh) CollectionsKt___CollectionsKt.AkhnZx(this.$cryptoMultiListStates, this.$pagerState.getCurrentPage());
            if (c31798mEh != null) {
                this.$onCryptoListTypeSelect.invoke(c31798mEh.copydefault().AEQbTJ());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
