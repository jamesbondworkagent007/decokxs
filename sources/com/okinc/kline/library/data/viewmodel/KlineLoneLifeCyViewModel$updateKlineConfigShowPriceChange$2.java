package com.okinc.kline.library.data.viewmodel;

import com.okinc.kline.library.data.ChartViewOutSideConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.C56391yDq;
import o.C56442yFn;
import o.oUL;
import o.oUN;

/* JADX INFO: loaded from: classes23.dex */
public final class KlineLoneLifeCyViewModel$updateKlineConfigShowPriceChange$2 extends SuspendLambda implements Function2<ChartViewOutSideConfig, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isShowPriceChange;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ oUN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineLoneLifeCyViewModel$updateKlineConfigShowPriceChange$2(oUN oun, boolean z, Continuation<? super KlineLoneLifeCyViewModel$updateKlineConfigShowPriceChange$2> continuation) {
        super(2, continuation);
        this.this$0 = oun;
        this.$isShowPriceChange = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KlineLoneLifeCyViewModel$updateKlineConfigShowPriceChange$2 klineLoneLifeCyViewModel$updateKlineConfigShowPriceChange$2 = new KlineLoneLifeCyViewModel$updateKlineConfigShowPriceChange$2(this.this$0, this.$isShowPriceChange, continuation);
        klineLoneLifeCyViewModel$updateKlineConfigShowPriceChange$2.L$0 = obj;
        return klineLoneLifeCyViewModel$updateKlineConfigShowPriceChange$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ChartViewOutSideConfig chartViewOutSideConfig, Continuation<? super Unit> continuation) {
        return ((KlineLoneLifeCyViewModel$updateKlineConfigShowPriceChange$2) create(chartViewOutSideConfig, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ChartViewOutSideConfig chartViewOutSideConfig = (ChartViewOutSideConfig) this.L$0;
            oUN oun = this.this$0;
            AnonymousClass1 anonymousClass1 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.library.data.viewmodel.KlineLoneLifeCyViewModel$updateKlineConfigShowPriceChange$2.1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((ChartViewOutSideConfig) obj2).getControlBeanAfterInit();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((ChartViewOutSideConfig) obj2).setControlBeanAfterInit((oUL) obj3);
                }
            };
            oUL oulCopy$default = oUL.copy$default(chartViewOutSideConfig.getControlBeanAfterInit(), false, this.$isShowPriceChange, false, false, 13, null);
            this.label = 1;
            if (oun.KWHzl(anonymousClass1, oulCopy$default, this) == objCopydefault) {
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
