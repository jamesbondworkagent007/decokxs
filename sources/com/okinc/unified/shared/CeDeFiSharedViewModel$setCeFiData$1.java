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
public final class CeDeFiSharedViewModel$setCeFiData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $firstTab;
    final /* synthetic */ String $fromPageId;
    final /* synthetic */ String $fromScene;
    final /* synthetic */ String $instId;
    final /* synthetic */ String $instType;
    final /* synthetic */ boolean $isAllKline;
    final /* synthetic */ String $isCeDeFiOnline;
    final /* synthetic */ boolean $isShowPriceAlert;
    final /* synthetic */ MarketCoinInfo $marketCoinInfo;
    final /* synthetic */ String $refreshWidget;
    final /* synthetic */ String $tag;
    int label;
    final /* synthetic */ CeDeFiSharedViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CeDeFiSharedViewModel$setCeFiData$1(CeDeFiSharedViewModel ceDeFiSharedViewModel, MarketCoinInfo marketCoinInfo, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, String str6, String str7, String str8, Continuation<? super CeDeFiSharedViewModel$setCeFiData$1> continuation) {
        super(2, continuation);
        this.this$0 = ceDeFiSharedViewModel;
        this.$marketCoinInfo = marketCoinInfo;
        this.$instId = str;
        this.$instType = str2;
        this.$fromPageId = str3;
        this.$fromScene = str4;
        this.$firstTab = str5;
        this.$isAllKline = z;
        this.$isShowPriceAlert = z2;
        this.$refreshWidget = str6;
        this.$isCeDeFiOnline = str7;
        this.$tag = str8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CeDeFiSharedViewModel$setCeFiData$1(this.this$0, this.$marketCoinInfo, this.$instId, this.$instType, this.$fromPageId, this.$fromScene, this.$firstTab, this.$isAllKline, this.$isShowPriceAlert, this.$refreshWidget, this.$isCeDeFiOnline, this.$tag, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CeDeFiSharedViewModel$setCeFiData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.AEQbTJ;
            CeFiData ceFiData = new CeFiData(this.$marketCoinInfo, this.$instId, this.$instType, this.$fromPageId, this.$fromScene, this.$firstTab, this.$isAllKline, this.$isShowPriceAlert, this.$refreshWidget, this.$isCeDeFiOnline, this.$tag);
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
