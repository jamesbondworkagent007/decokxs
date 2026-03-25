package com.okinc.planet.biz_plugin.spot;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.planet.biz_plugin.spot.SpotHoldingsViewModel$loadSpotHoldings$1;
import com.okinc.planet.biz_plugin.spot.data.SpotHoldingBean;
import com.okinc.tradeshare.api.TradeAssetPlanetBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C32866mlf;
import o.C33129mqd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.tBX;
import o.tDE;
import o.yDY;

/* JADX INFO: loaded from: classes19.dex */
public final class SpotHoldingsViewModel$loadSpotHoldings$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ tDE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotHoldingsViewModel$loadSpotHoldings$1(tDE tde, Continuation<? super SpotHoldingsViewModel$loadSpotHoldings$1> continuation) {
        super(2, continuation);
        this.this$0 = tde;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotHoldingsViewModel$loadSpotHoldings$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotHoldingsViewModel$loadSpotHoldings$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        tDE.TaskDescription taskDescription;
        String message;
        Object value2;
        Object objAEQbTJ;
        Object value3;
        Object value4;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MutableStateFlow mutableStateFlow = this.this$0.EZpvd;
                do {
                    value2 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value2, tDE.TaskDescription.copy$default((tDE.TaskDescription) value2, true, false, null, null, null, null, null, false, 62, null)));
                tBX tbx = this.this$0.OLrzqt;
                this.label = 1;
                objAEQbTJ = tbx.AEQbTJ(this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = obj;
            }
            Pair pair = (Pair) objAEQbTJ;
            Pair pair2 = (Pair) pair.component1();
            if (!((Boolean) pair.component2()).booleanValue()) {
                MutableStateFlow mutableStateFlow2 = this.this$0.EZpvd;
                do {
                    value3 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value3, tDE.TaskDescription.copy$default((tDE.TaskDescription) value3, false, false, null, null, null, null, "Failed to load spot holdings", true, 62, null)));
            } else {
                Iterable iterable = (Iterable) pair2.getFirst();
                final ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(new SpotHoldingBean((TradeAssetPlanetBean) it.next(), false, (String) pair2.getSecond(), yDY.AhwBna(), false));
                }
                C32866mlf.onEvent$default("Feeds_Whole_PluginCardSelect_View", (TrackChannel[]) null, new Function1() { // from class: o.tDJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return SpotHoldingsViewModel$loadSpotHoldings$1.invokeSuspend$lambda$2(arrayList, (EventParamsList) obj2);
                    }
                }, 1, (Object) null);
                MutableStateFlow mutableStateFlow3 = this.this$0.EZpvd;
                do {
                    value4 = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.compareAndSet(value4, tDE.TaskDescription.copy$default((tDE.TaskDescription) value4, false, false, arrayList, arrayList, null, null, null, false, 2, null)));
            }
        } catch (Exception e) {
            MutableStateFlow mutableStateFlow4 = this.this$0.EZpvd;
            do {
                value = mutableStateFlow4.getValue();
                taskDescription = (tDE.TaskDescription) value;
                message = e.getMessage();
                if (message == null) {
                    message = "Unknown error occurred";
                }
            } while (!mutableStateFlow4.compareAndSet(value, tDE.TaskDescription.copy$default(taskDescription, false, false, null, null, null, null, message, true, 62, null)));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(List list, EventParamsList eventParamsList) {
        eventParamsList.put("plugin_type", "spot_position", true);
        eventParamsList.put("no_data", C33129mqd.KWHzl((Collection) list) ? "false" : "true", false);
        return Unit.INSTANCE;
    }
}
