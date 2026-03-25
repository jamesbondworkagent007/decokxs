package com.okinc.cruilib.compose.composable.cryptolist;

import androidx.compose.runtime.MutableState;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.AbstractC31795mEe;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class OKCRCryptoListKt$OKCRCryptoList$4$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC31795mEe $item;
    final /* synthetic */ MutableState<Set<String>> $itemIdsToReset;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKCRCryptoListKt$OKCRCryptoList$4$2$1$1(MutableState<Set<String>> mutableState, AbstractC31795mEe abstractC31795mEe, Continuation<? super OKCRCryptoListKt$OKCRCryptoList$4$2$1$1> continuation) {
        super(2, continuation);
        this.$itemIdsToReset = mutableState;
        this.$item = abstractC31795mEe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKCRCryptoListKt$OKCRCryptoList$4$2$1$1(this.$itemIdsToReset, this.$item, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKCRCryptoListKt$OKCRCryptoList$4$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.label = 1;
            if (DelayKt.delay(250L, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        MutableState<Set<String>> mutableState = this.$itemIdsToReset;
        Set setDXXBbs = CollectionsKt___CollectionsKt.DXXBbs(mutableState.getValue());
        setDXXBbs.add(this.$item.AEQbTJ());
        mutableState.setValue(CollectionsKt___CollectionsKt.OqFWZa(setDXXBbs));
        return Unit.INSTANCE;
    }
}
