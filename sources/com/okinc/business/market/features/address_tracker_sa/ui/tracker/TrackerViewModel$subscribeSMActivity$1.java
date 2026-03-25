package com.okinc.business.market.features.address_tracker_sa.ui.tracker;

import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerActivityResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C25745jEu;
import o.C25750jEz;
import o.C27634jyr;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerViewModel$subscribeSMActivity$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ TrackerViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerViewModel$subscribeSMActivity$1(TrackerViewModel trackerViewModel, Continuation<? super TrackerViewModel$subscribeSMActivity$1> continuation) {
        super(2, continuation);
        this.this$0 = trackerViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerViewModel$subscribeSMActivity$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerViewModel$subscribeSMActivity$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        final Map map;
        FlowCollector flowCollector;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception unused) {
            this.this$0.sSMYrx.copydefault();
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C27634jyr c27634jyr = this.this$0.fARcdN;
            this.label = 1;
            if (C27634jyr.getEmojiAddressMapping$default(c27634jyr, false, this, 1, null) == objCopydefault) {
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
                    final TrackerViewModel trackerViewModel = this.this$0;
                    flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.tracker.TrackerViewModel$subscribeSMActivity$1.1
                        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                        public final Object emit(List<TrackerActivityResponse> list, Continuation<? super Unit> continuation) throws Throwable {
                            TrackerViewModel trackerViewModel2 = trackerViewModel;
                            Map<String, String> map2 = map;
                            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(C25745jEu.AEQbTJ.OLrzqt((TrackerActivityResponse) it.next(), trackerViewModel2.fIwbmz(), map2, trackerViewModel2.values, trackerViewModel2.AubY));
                            }
                            Object objCopydefault2 = trackerViewModel2.copydefault(arrayList, true, continuation);
                            return objCopydefault2 == C56442yFn.copydefault() ? objCopydefault2 : Unit.INSTANCE;
                        }
                    };
                    this.L$0 = null;
                    this.label = 4;
                    if (((Flow) obj).collect(flowCollector, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                map = (Map) obj;
                C25750jEz c25750jEz = this.this$0.sSMYrx;
                this.L$0 = map;
                this.label = 3;
                obj = c25750jEz.AEQbTJ(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                final TrackerViewModel trackerViewModel2 = this.this$0;
                flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.tracker.TrackerViewModel$subscribeSMActivity$1.1
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                    public final Object emit(List<TrackerActivityResponse> list, Continuation<? super Unit> continuation) throws Throwable {
                        TrackerViewModel trackerViewModel22 = trackerViewModel2;
                        Map<String, String> map2 = map;
                        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(C25745jEu.AEQbTJ.OLrzqt((TrackerActivityResponse) it.next(), trackerViewModel22.fIwbmz(), map2, trackerViewModel22.values, trackerViewModel22.AubY));
                        }
                        Object objCopydefault2 = trackerViewModel22.copydefault(arrayList, true, continuation);
                        return objCopydefault2 == C56442yFn.copydefault() ? objCopydefault2 : Unit.INSTANCE;
                    }
                };
                this.L$0 = null;
                this.label = 4;
                if (((Flow) obj).collect(flowCollector, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C27634jyr c27634jyr2 = this.this$0.fARcdN;
        this.label = 2;
        obj = C27634jyr.getEmojiAddressMapping$default(c27634jyr2, false, this, 1, null);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        map = (Map) obj;
        C25750jEz c25750jEz2 = this.this$0.sSMYrx;
        this.L$0 = map;
        this.label = 3;
        obj = c25750jEz2.AEQbTJ(this);
        if (obj == objCopydefault) {
        }
        final TrackerViewModel trackerViewModel22 = this.this$0;
        flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.tracker.TrackerViewModel$subscribeSMActivity$1.1
            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<TrackerActivityResponse> list, Continuation<? super Unit> continuation) throws Throwable {
                TrackerViewModel trackerViewModel222 = trackerViewModel22;
                Map<String, String> map2 = map;
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(C25745jEu.AEQbTJ.OLrzqt((TrackerActivityResponse) it.next(), trackerViewModel222.fIwbmz(), map2, trackerViewModel222.values, trackerViewModel222.AubY));
                }
                Object objCopydefault2 = trackerViewModel222.copydefault(arrayList, true, continuation);
                return objCopydefault2 == C56442yFn.copydefault() ? objCopydefault2 : Unit.INSTANCE;
            }
        };
        this.L$0 = null;
        this.label = 4;
        if (((Flow) obj).collect(flowCollector, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
