package com.okinc.kline.ws.util;

import androidx.camera.video.AudioStats;
import com.okinc.kline.data.KLineTradeSubIndicatorBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C33129mqd;
import o.C37970pHl;
import o.C37979pHu;
import o.C37982pHx;
import o.C56391yDq;
import o.C56442yFn;
import o.oUF;

/* JADX INFO: loaded from: classes9.dex */
public final class FutureIndicatorDataHandle$bindWsForIndicator$1$1$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channel;
    final /* synthetic */ KLineTradeSubIndicatorBean $data;
    final /* synthetic */ String $instId;
    final /* synthetic */ int $unit;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FutureIndicatorDataHandle$bindWsForIndicator$1$1$5(KLineTradeSubIndicatorBean kLineTradeSubIndicatorBean, String str, String str2, int i, Continuation<? super FutureIndicatorDataHandle$bindWsForIndicator$1$1$5> continuation) {
        super(2, continuation);
        this.$data = kLineTradeSubIndicatorBean;
        this.$channel = str;
        this.$instId = str2;
        this.$unit = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FutureIndicatorDataHandle$bindWsForIndicator$1$1$5(this.$data, this.$channel, this.$instId, this.$unit, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FutureIndicatorDataHandle$bindWsForIndicator$1$1$5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final ArrayList arrayList = new ArrayList();
            Iterator<T> it = this.$data.getTakerBuySellVol().iterator();
            while (it.hasNext()) {
                List list = (List) it.next();
                if (list.size() >= 3) {
                    arrayList.add(new oUF((String) list.get(0), null, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, (String) list.get(1), (String) list.get(2), C33129mqd.AEQbTJ(list.get(1)) + C33129mqd.AEQbTJ(list.get(2)), 16382, null));
                }
            }
            C37979pHu.AEQbTJ.EZpvd().postValue(arrayList);
            Flow flowKWHzl = C37970pHl.copydefault.KWHzl(this.$channel, this.$instId, new AnonymousClass2(C37982pHx.Companion));
            final int i2 = this.$unit;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.kline.ws.util.FutureIndicatorDataHandle$bindWsForIndicator$1$1$5.3
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                public final Object emit(List<C37982pHx> list2, Continuation<? super Unit> continuation) {
                    List listQfsBiF = CollectionsKt___CollectionsKt.QfsBiF(list2);
                    if (C33129mqd.KWHzl((Collection) listQfsBiF)) {
                        C37979pHu.AEQbTJ.EZpvd((List<C37982pHx>) listQfsBiF, i2, (List<oUF>) arrayList);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowKWHzl.collect(flowCollector, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.kline.ws.util.FutureIndicatorDataHandle$bindWsForIndicator$1$1$5$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<String, C37982pHx> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Object obj) {
            super(1, obj, C37982pHx.ActionBar.class, "jsonConvertSingle", "jsonConvertSingle(Ljava/lang/String;)Lcom/okinc/kline/ws/bean/TakerBuySellVolData;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final C37982pHx invoke(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return ((C37982pHx.ActionBar) this.receiver).copydefault(str);
        }
    }
}
