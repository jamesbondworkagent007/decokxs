package com.okinc.unified.shared;

import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.unified.data.CeFiData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class CeDeFiSharedViewModel$updateCeFiData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MarketCoinInfo $marketCoinInfo;
    int label;
    final /* synthetic */ CeDeFiSharedViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CeDeFiSharedViewModel$updateCeFiData$1(CeDeFiSharedViewModel ceDeFiSharedViewModel, MarketCoinInfo marketCoinInfo, Continuation<? super CeDeFiSharedViewModel$updateCeFiData$1> continuation) {
        super(2, continuation);
        this.this$0 = ceDeFiSharedViewModel;
        this.$marketCoinInfo = marketCoinInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CeDeFiSharedViewModel$updateCeFiData$1(this.this$0, this.$marketCoinInfo, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CeDeFiSharedViewModel$updateCeFiData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CeFiData ceFiData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CeFiData ceFiData2 = (CeFiData) this.this$0.AEQbTJ.getValue();
            if (ceFiData2 == null || (ceFiData = ceFiData2.copydefault((2046 & 1) != 0 ? ceFiData2.djBIcL : this.$marketCoinInfo, (2046 & 2) != 0 ? ceFiData2.KWHzl : null, (2046 & 4) != 0 ? ceFiData2.AYXKKw : null, (2046 & 8) != 0 ? ceFiData2.OLrzqt : null, (2046 & 16) != 0 ? ceFiData2.AEQbTJ : null, (2046 & 32) != 0 ? ceFiData2.copydefault : null, (2046 & 64) != 0 ? ceFiData2.AhwBna : false, (2046 & 128) != 0 ? ceFiData2.gEmmrt : false, (2046 & 256) != 0 ? ceFiData2.isConnected : null, (2046 & 512) != 0 ? ceFiData2.valueOf : null, (2046 & 1024) != 0 ? ceFiData2.AkhnZx : null)) == null) {
                ceFiData = new CeFiData(this.$marketCoinInfo, null, null, null, null, null, false, false, null, null, null, 2046, null);
            }
            MutableStateFlow mutableStateFlow = this.this$0.AEQbTJ;
            this.label = 1;
            if (mutableStateFlow.emit(ceFiData, this) == objCopydefault) {
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
