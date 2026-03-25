package com.okinc.kline.features.settings.sub.ui;

import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.oTB;
import o.oTH;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineSettingActivity$segmentClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ oTB.StateListAnimator $item;
    int label;
    final /* synthetic */ oTH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineSettingActivity$segmentClick$1(oTB.StateListAnimator stateListAnimator, oTH oth, Continuation<? super KlineSettingActivity$segmentClick$1> continuation) {
        super(2, continuation);
        this.$item = stateListAnimator;
        this.this$0 = oth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlineSettingActivity$segmentClick$1(this.$item, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KlineSettingActivity$segmentClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z = this.$item.AhwBna() == 0;
            if (Intrinsics.EZpvd((Object) this.this$0.AYXKKw().AEQbTJ().getMode(), (Object) "defi_mode_dex")) {
                SPUtils.put("key_kline_market_is_column_chart", C56443yFo.KWHzl(z), "dex_market");
            }
            SPUtils.put("kline_zoom_type_column_chart", C56443yFo.KWHzl(z));
            this.this$0.AYXKKw().AEQbTJ().setColumnChart(z);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
