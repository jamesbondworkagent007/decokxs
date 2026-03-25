package com.okinc.dexkline.market.common.marketconfig.domain;

import com.okinc.dexkline.market.data.model.MarketConfigData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32254mVe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC32256mVg;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketConfigUseCase$isExpandV2DataSupportedChain$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $chainId;
    int label;
    final /* synthetic */ C32254mVe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketConfigUseCase$isExpandV2DataSupportedChain$2(C32254mVe c32254mVe, String str, Continuation<? super MarketConfigUseCase$isExpandV2DataSupportedChain$2> continuation) {
        super(2, continuation);
        this.this$0 = c32254mVe;
        this.$chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketConfigUseCase$isExpandV2DataSupportedChain$2(this.this$0, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((MarketConfigUseCase$isExpandV2DataSupportedChain$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC32256mVg interfaceC32256mVg = this.this$0.AEQbTJ;
            this.label = 1;
            obj = interfaceC32256mVg.KWHzl(false, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return C56443yFo.KWHzl(((MarketConfigData) obj).EZpvd().EZpvd().contains(this.$chainId));
    }
}
