package com.okinc.kline.features.positiontier.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.features.positiontier.ui.viewmodel.KlinePositionTierViewModel$loadPositionTier$1;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C36180oSf;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.InterfaceC49425uoM;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;
import o.xBL;
import o.xKK;

/* JADX INFO: loaded from: classes8.dex */
public final class KlinePositionTierViewModel$loadPositionTier$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MarketCoinInfo $marketCoinInfo;
    int label;
    final /* synthetic */ KlinePositionTierViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlinePositionTierViewModel$loadPositionTier$1(KlinePositionTierViewModel klinePositionTierViewModel, MarketCoinInfo marketCoinInfo, Continuation<? super KlinePositionTierViewModel$loadPositionTier$1> continuation) {
        super(2, continuation);
        this.this$0 = klinePositionTierViewModel;
        this.$marketCoinInfo = marketCoinInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlinePositionTierViewModel$loadPositionTier$1(this.this$0, this.$marketCoinInfo, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KlinePositionTierViewModel$loadPositionTier$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        BizInstrument suggestedInstrument$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            KlinePositionTierViewModel klinePositionTierViewModel = this.this$0;
            AnonymousClass1 anonymousClass1 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.features.positiontier.ui.viewmodel.KlinePositionTierViewModel$loadPositionTier$1.1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((C36180oSf) obj2).EZpvd();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((C36180oSf) obj2).AEQbTJ((InterfaceC49371unL) obj3);
                }
            };
            InterfaceC49371unL.ActionBar actionBar = new InterfaceC49371unL.ActionBar(null, 1, null);
            this.label = 1;
            if (klinePositionTierViewModel.KWHzl(anonymousClass1, actionBar, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        String instrumentType = this.$marketCoinInfo.getInstrumentType();
        String instrumentId = this.$marketCoinInfo.getInstrumentId();
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        String instFamily = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrCopydefault = interfaceC54577xNn.copydefault()) == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault, this.$marketCoinInfo.getInstrumentType(), this.$marketCoinInfo.getInstrumentId(), null, null, 12, null)) == null) ? null : suggestedInstrument$default.getInstFamily();
        xBL xbl = this.this$0.EZpvd;
        final KlinePositionTierViewModel klinePositionTierViewModel2 = this.this$0;
        xbl.copydefault(instrumentType);
        xbl.KWHzl(instrumentId);
        xbl.OLrzqt(instFamily);
        xbl.AEQbTJ(instFamily);
        xbl.KWHzl(new Function1() { // from class: o.oSh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return KlinePositionTierViewModel$loadPositionTier$1.invokeSuspend$lambda$1$lambda$0(klinePositionTierViewModel2, (ResponseData) obj2);
            }
        });
        xKK.Activity.execute$default(xbl, 0L, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(KlinePositionTierViewModel klinePositionTierViewModel, ResponseData responseData) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(klinePositionTierViewModel), null, null, new KlinePositionTierViewModel$loadPositionTier$1$2$1$1(responseData, klinePositionTierViewModel, null), 3, null);
        return Unit.INSTANCE;
    }
}
