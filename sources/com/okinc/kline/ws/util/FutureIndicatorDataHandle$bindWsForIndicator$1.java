package com.okinc.kline.ws.util;

import com.okinc.kline.data.KLineTradeSubIndicatorBean;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes9.dex */
public final class FutureIndicatorDataHandle$bindWsForIndicator$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ KLineTradeSubIndicatorBean $data;
    final /* synthetic */ String $indicators;
    final /* synthetic */ String $instId;
    final /* synthetic */ String $timeLine;
    final /* synthetic */ int $unit;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FutureIndicatorDataHandle$bindWsForIndicator$1(String str, String str2, KLineTradeSubIndicatorBean kLineTradeSubIndicatorBean, String str3, int i, Continuation<? super FutureIndicatorDataHandle$bindWsForIndicator$1> continuation) {
        super(2, continuation);
        this.$indicators = str;
        this.$timeLine = str2;
        this.$data = kLineTradeSubIndicatorBean;
        this.$instId = str3;
        this.$unit = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FutureIndicatorDataHandle$bindWsForIndicator$1 futureIndicatorDataHandle$bindWsForIndicator$1 = new FutureIndicatorDataHandle$bindWsForIndicator$1(this.$indicators, this.$timeLine, this.$data, this.$instId, this.$unit, continuation);
        futureIndicatorDataHandle$bindWsForIndicator$1.L$0 = obj;
        return futureIndicatorDataHandle$bindWsForIndicator$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FutureIndicatorDataHandle$bindWsForIndicator$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [53=5] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0059  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        String str;
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        List<String> listSplit$default = StringsKt__StringsKt.split$default((CharSequence) this.$indicators, new String[]{","}, false, 0, 6, (Object) null);
        String str2 = this.$timeLine;
        KLineTradeSubIndicatorBean kLineTradeSubIndicatorBean = this.$data;
        String str3 = this.$instId;
        int i2 = this.$unit;
        for (String str4 : listSplit$default) {
            String str5 = "indicator-" + str4 + "-" + str2;
            switch (str4.hashCode()) {
                case -1402178299:
                    i = i2;
                    str = str3;
                    if (str4.equals("LSAccountRatio")) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getDefault(), null, new FutureIndicatorDataHandle$bindWsForIndicator$1$1$4(kLineTradeSubIndicatorBean, str5, str, null), 2, null);
                    }
                    break;
                case 3546:
                    i = i2;
                    if (str4.equals("oi")) {
                        str = str3;
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getDefault(), null, new FutureIndicatorDataHandle$bindWsForIndicator$1$1$1(kLineTradeSubIndicatorBean, str5, str3, i, null), 2, null);
                    } else {
                        str = str3;
                    }
                    break;
                case 82720230:
                    if (str4.equals("takerBuySellVol")) {
                        CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                        i = i2;
                        FutureIndicatorDataHandle$bindWsForIndicator$1$1$5 futureIndicatorDataHandle$bindWsForIndicator$1$1$5 = new FutureIndicatorDataHandle$bindWsForIndicator$1$1$5(kLineTradeSubIndicatorBean, str5, str3, i2, null);
                        str3 = str3;
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, coroutineDispatcher, null, futureIndicatorDataHandle$bindWsForIndicator$1$1$5, 2, null);
                    } else {
                        i = i2;
                    }
                    str = str3;
                    break;
                case 1122020791:
                    if (str4.equals("eliteLSOIRatio")) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getDefault(), null, new FutureIndicatorDataHandle$bindWsForIndicator$1$1$3(kLineTradeSubIndicatorBean, str5, str3, null), 2, null);
                    }
                    i = i2;
                    str = str3;
                    break;
                case 2105929304:
                    if (str4.equals("eliteLSAccountRatio")) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getDefault(), null, new FutureIndicatorDataHandle$bindWsForIndicator$1$1$2(kLineTradeSubIndicatorBean, str5, str3, null), 2, null);
                    }
                    i = i2;
                    str = str3;
                    break;
            }
            str3 = str;
            i2 = i;
        }
        return Unit.INSTANCE;
    }
}
