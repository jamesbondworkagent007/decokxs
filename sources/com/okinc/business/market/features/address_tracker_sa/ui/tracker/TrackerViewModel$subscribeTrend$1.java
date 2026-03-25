package com.okinc.business.market.features.address_tracker_sa.ui.tracker;

import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendItem;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendResponse;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendUIModel;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendWsParam;
import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C25746jEv;
import o.C25750jEz;
import o.C27634jyr;
import o.C28586kda;
import o.C33129mqd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.yDY;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerViewModel$subscribeTrend$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ TrackerViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerViewModel$subscribeTrend$1(TrackerViewModel trackerViewModel, Continuation<? super TrackerViewModel$subscribeTrend$1> continuation) {
        super(2, continuation);
        this.this$0 = trackerViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerViewModel$subscribeTrend$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerViewModel$subscribeTrend$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x028b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02a1 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        TrackerTrendWsParam trackerTrendWsParam;
        Object emojiAddressMapping$default;
        String strEZpvd;
        final Map map;
        Object objAEQbTJ;
        FlowCollector flowCollector;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception unused) {
            this.this$0.sSMYrx.KWHzl();
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28586kda c28586kda = this.this$0.AuCTel;
            this.label = 1;
            objOLrzqt = c28586kda.OLrzqt(this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    map = (Map) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objAEQbTJ = obj;
                    final TrackerViewModel trackerViewModel = this.this$0;
                    flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.tracker.TrackerViewModel$subscribeTrend$1.4
                        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                        public final Object emit(TrackerTrendResponse trackerTrendResponse, Continuation<? super Unit> continuation) {
                            TrackerViewModel trackerViewModel2 = trackerViewModel;
                            Map<String, String> map2 = map;
                            List<TrackerTrendItem> listAEQbTJ = trackerTrendResponse.AEQbTJ();
                            ArrayList arrayList = new ArrayList();
                            for (T t : listAEQbTJ) {
                                TrackerTrendItem trackerTrendItem = (TrackerTrendItem) t;
                                String strAhwBna = trackerViewModel2.OLrzqt().getValue().OLrzqt().AhwBna();
                                if (StringsKt__StringsKt.fARcdN((CharSequence) strAhwBna) || trackerTrendItem.valueOf() >= C33129mqd.AhwBna(strAhwBna)) {
                                    arrayList.add(t);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                            Iterator<T> it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(C25746jEv.AEQbTJ.OLrzqt((TrackerTrendItem) it.next(), map2, trackerViewModel2.values, trackerViewModel2.AubY));
                            }
                            Object objEZpvd = trackerViewModel2.EZpvd((List<TrackerTrendUIModel>) arrayList2, (Continuation<? super Unit>) continuation);
                            return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
                        }
                    };
                    this.L$0 = null;
                    this.label = 4;
                    if (((Flow) objAEQbTJ).collect(flowCollector, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                TrackerTrendWsParam trackerTrendWsParam2 = (TrackerTrendWsParam) this.L$0;
                C56391yDq.AEQbTJ(obj);
                trackerTrendWsParam = trackerTrendWsParam2;
                emojiAddressMapping$default = obj;
                map = (Map) emojiAddressMapping$default;
                C25750jEz c25750jEz = this.this$0.sSMYrx;
                this.L$0 = map;
                this.label = 3;
                objAEQbTJ = c25750jEz.AEQbTJ(trackerTrendWsParam, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                final TrackerViewModel trackerViewModel2 = this.this$0;
                flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.tracker.TrackerViewModel$subscribeTrend$1.4
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                    public final Object emit(TrackerTrendResponse trackerTrendResponse, Continuation<? super Unit> continuation) {
                        TrackerViewModel trackerViewModel22 = trackerViewModel2;
                        Map<String, String> map2 = map;
                        List<TrackerTrendItem> listAEQbTJ = trackerTrendResponse.AEQbTJ();
                        ArrayList arrayList = new ArrayList();
                        for (T t : listAEQbTJ) {
                            TrackerTrendItem trackerTrendItem = (TrackerTrendItem) t;
                            String strAhwBna = trackerViewModel22.OLrzqt().getValue().OLrzqt().AhwBna();
                            if (StringsKt__StringsKt.fARcdN((CharSequence) strAhwBna) || trackerTrendItem.valueOf() >= C33129mqd.AhwBna(strAhwBna)) {
                                arrayList.add(t);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                        Iterator<T> it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(C25746jEv.AEQbTJ.OLrzqt((TrackerTrendItem) it.next(), map2, trackerViewModel22.values, trackerViewModel22.AubY));
                        }
                        Object objEZpvd = trackerViewModel22.EZpvd((List<TrackerTrendUIModel>) arrayList2, (Continuation<? super Unit>) continuation);
                        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
                    }
                };
                this.L$0 = null;
                this.label = 4;
                if (((Flow) objAEQbTJ).collect(flowCollector, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objOLrzqt)) {
            objOLrzqt = null;
        }
        DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
        String str = (dexUserIdentity == null || (strEZpvd = dexUserIdentity.EZpvd()) == null) ? "" : strEZpvd;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strValueOf = this.this$0.OLrzqt().getValue().valueOf();
        int iAhwBna = C33129mqd.AhwBna(this.this$0.AkhnZx().getValue());
        List listAhwBna = yDY.AhwBna();
        List<String> listValues = this.this$0.values();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listValues, 10));
        Iterator<T> it = listValues.iterator();
        while (it.hasNext()) {
            arrayList.add(C56443yFo.AEQbTJ(C33129mqd.AhwBna((String) it.next())));
        }
        List<String> listKWHzl = this.this$0.KWHzl();
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        Iterator<T> it2 = listKWHzl.iterator();
        while (it2.hasNext()) {
            arrayList2.add(C56443yFo.AEQbTJ(C33129mqd.AhwBna((String) it2.next())));
        }
        String strAhwBna = this.this$0.OLrzqt().getValue().KWHzl().AhwBna();
        String strKWHzl = this.this$0.OLrzqt().getValue().copydefault().KWHzl();
        String strMulS$default = C33129mqd.OLrzqt((CharSequence) strKWHzl) ? C33129mqd.mulS$default(strKWHzl, C56443yFo.AEQbTJ(1000), null, null, null, 14, null) : "";
        String strAhwBna2 = this.this$0.OLrzqt().getValue().copydefault().AhwBna();
        String strMulS$default2 = C33129mqd.OLrzqt((CharSequence) strAhwBna2) ? C33129mqd.mulS$default(strAhwBna2, C56443yFo.AEQbTJ(1000), null, null, null, 14, null) : "";
        String strKWHzl2 = this.this$0.OLrzqt().getValue().EZpvd().KWHzl();
        String strMulS$default3 = C33129mqd.OLrzqt((CharSequence) strKWHzl2) ? C33129mqd.mulS$default(strKWHzl2, C56443yFo.AEQbTJ(1000), null, null, null, 14, null) : "";
        String strAhwBna3 = this.this$0.OLrzqt().getValue().EZpvd().AhwBna();
        String strMulS$default4 = C33129mqd.OLrzqt((CharSequence) strAhwBna3) ? C33129mqd.mulS$default(strAhwBna3, C56443yFo.AEQbTJ(1000), null, null, null, 14, null) : "";
        String strKWHzl3 = this.this$0.OLrzqt().getValue().AhwBna().KWHzl();
        String strAhwBna4 = this.this$0.OLrzqt().getValue().AhwBna().AhwBna();
        String strKWHzl4 = this.this$0.OLrzqt().getValue().djBIcL().KWHzl();
        String strValueOf2 = C33129mqd.OLrzqt((CharSequence) strKWHzl4) ? String.valueOf(jCurrentTimeMillis - ((C33129mqd.valueOf(strKWHzl4) * ((long) 60)) * ((long) 1000))) : "";
        String strAhwBna5 = this.this$0.OLrzqt().getValue().djBIcL().AhwBna();
        trackerTrendWsParam = new TrackerTrendWsParam(str, listAhwBna, strAhwBna4, strKWHzl3, strAhwBna, strMulS$default4, strMulS$default3, strMulS$default2, strMulS$default, strValueOf2, C33129mqd.OLrzqt((CharSequence) strAhwBna5) ? String.valueOf(jCurrentTimeMillis - ((C33129mqd.valueOf(strAhwBna5) * ((long) 60)) * ((long) 1000))) : "", strValueOf, iAhwBna, arrayList2, arrayList, 1, 10);
        C27634jyr c27634jyr = this.this$0.fARcdN;
        this.L$0 = trackerTrendWsParam;
        this.label = 2;
        emojiAddressMapping$default = C27634jyr.getEmojiAddressMapping$default(c27634jyr, false, this, 1, null);
        if (emojiAddressMapping$default == objCopydefault) {
            return objCopydefault;
        }
        map = (Map) emojiAddressMapping$default;
        C25750jEz c25750jEz2 = this.this$0.sSMYrx;
        this.L$0 = map;
        this.label = 3;
        objAEQbTJ = c25750jEz2.AEQbTJ(trackerTrendWsParam, this);
        if (objAEQbTJ == objCopydefault) {
        }
        final TrackerViewModel trackerViewModel22 = this.this$0;
        flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.tracker.TrackerViewModel$subscribeTrend$1.4
            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public final Object emit(TrackerTrendResponse trackerTrendResponse, Continuation<? super Unit> continuation) {
                TrackerViewModel trackerViewModel222 = trackerViewModel22;
                Map<String, String> map2 = map;
                List<TrackerTrendItem> listAEQbTJ = trackerTrendResponse.AEQbTJ();
                ArrayList arrayList3 = new ArrayList();
                for (T t : listAEQbTJ) {
                    TrackerTrendItem trackerTrendItem = (TrackerTrendItem) t;
                    String strAhwBna6 = trackerViewModel222.OLrzqt().getValue().OLrzqt().AhwBna();
                    if (StringsKt__StringsKt.fARcdN((CharSequence) strAhwBna6) || trackerTrendItem.valueOf() >= C33129mqd.AhwBna(strAhwBna6)) {
                        arrayList3.add(t);
                    }
                }
                ArrayList arrayList22 = new ArrayList(C56403yEb.AYXKKw(arrayList3, 10));
                Iterator<T> it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    arrayList22.add(C25746jEv.AEQbTJ.OLrzqt((TrackerTrendItem) it3.next(), map2, trackerViewModel222.values, trackerViewModel222.AubY));
                }
                Object objEZpvd = trackerViewModel222.EZpvd((List<TrackerTrendUIModel>) arrayList22, (Continuation<? super Unit>) continuation);
                return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
            }
        };
        this.L$0 = null;
        this.label = 4;
        if (((Flow) objAEQbTJ).collect(flowCollector, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
