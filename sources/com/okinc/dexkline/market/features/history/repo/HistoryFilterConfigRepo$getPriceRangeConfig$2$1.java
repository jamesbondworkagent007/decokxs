package com.okinc.dexkline.market.features.history.repo;

import com.okinc.dexkline.market.common.constants.TokenAgeType;
import com.okinc.dexkline.market.data.model.PriceRangeConfigData;
import com.okinc.dexkline.market.data.model.history.HistoryFilterConfigResponse;
import com.okinc.dexkline.market.features.filter.domain.PriceRangeFilter;
import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C32381mZx;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC32260mVk;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes8.dex */
public final class HistoryFilterConfigRepo$getPriceRangeConfig$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends PriceRangeFilter>>, Object> {
    int label;
    final /* synthetic */ C32381mZx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryFilterConfigRepo$getPriceRangeConfig$2$1(C32381mZx c32381mZx, Continuation<? super HistoryFilterConfigRepo$getPriceRangeConfig$2$1> continuation) {
        super(2, continuation);
        this.this$0 = c32381mZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HistoryFilterConfigRepo$getPriceRangeConfig$2$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends PriceRangeFilter>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<PriceRangeFilter>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<PriceRangeFilter>> continuation) {
        return ((HistoryFilterConfigRepo$getPriceRangeConfig$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC32260mVk interfaceC32260mVk = this.this$0.OLrzqt;
            this.label = 1;
            obj = interfaceC32260mVk.KWHzl(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        Object data = ((ResponseData) obj).getData();
        Intrinsics.copydefault(data);
        List<PriceRangeConfigData> config = ((HistoryFilterConfigResponse) data).getConfig();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(config, 10));
        Iterator<T> it = config.iterator();
        while (it.hasNext()) {
            arrayList.add(new PriceRangeFilter(((PriceRangeConfigData) it.next()).OLrzqt(), (String) null, (TokenAgeType) null, (String) null, (String) null, (String) null, false, WebSocketProtocol.PAYLOAD_SHORT, (DefaultConstructorMarker) null));
        }
        return arrayList;
    }
}
