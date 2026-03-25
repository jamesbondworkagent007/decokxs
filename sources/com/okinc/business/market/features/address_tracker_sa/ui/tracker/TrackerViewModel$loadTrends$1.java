package com.okinc.business.market.features.address_tracker_sa.ui.tracker;

import com.okinc.business.market.features.address_tracker.domain.TrackingAddressAlias;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendItem;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendRequest;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendResponse;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendUIModel;
import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C25746jEv;
import o.C25750jEz;
import o.C27634jyr;
import o.C28586kda;
import o.C33129mqd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56548yJl;
import o.jAH;
import o.jDZ;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerViewModel$loadTrends$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isShowLoading;
    final /* synthetic */ boolean $isTabSwitch;
    Object L$0;
    int label;
    final /* synthetic */ TrackerViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerViewModel$loadTrends$1(TrackerViewModel trackerViewModel, boolean z, boolean z2, Continuation<? super TrackerViewModel$loadTrends$1> continuation) {
        super(2, continuation);
        this.this$0 = trackerViewModel;
        this.$isShowLoading = z;
        this.$isTabSwitch = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerViewModel$loadTrends$1(this.this$0, this.$isShowLoading, this.$isTabSwitch, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerViewModel$loadTrends$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7 A[Catch: all -> 0x00df, LOOP:3: B:31:0x00c1->B:33:0x00c7, LOOP_END, TryCatch #0 {all -> 0x00df, blocks: (B:15:0x0043, B:30:0x009a, B:31:0x00c1, B:33:0x00c7, B:34:0x00d6, B:27:0x0083), top: B:82:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        TrackerTrendRequest trackerTrendRequest;
        Object objCopydefault;
        Map<String, String> map;
        Object objM7386unboximpl;
        Throwable thM7380exceptionOrNullimpl;
        jDZ jdz;
        TrackerViewModel trackerViewModel;
        Object objOLrzqt;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        Object obj2 = null;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objEZpvd = C56391yDq.EZpvd(th);
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.AkhnZx;
            if (this.$isShowLoading) {
                jdz = jDZ.TaskDescription.EZpvd;
            } else {
                jdz = jDZ.Activity.OLrzqt;
            }
            mutableStateFlow.setValue(jdz);
            C28586kda c28586kda = this.this$0.AuCTel;
            this.label = 1;
            objEZpvd = c28586kda.OLrzqt(this);
            if (objEZpvd == objCopydefault2) {
                return objCopydefault2;
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        } else if (i == 2) {
            trackerViewModel = (TrackerViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
            C56391yDq.AEQbTJ(objOLrzqt);
            List list = (List) objOLrzqt;
            trackerViewModel.values.clear();
            Map map2 = trackerViewModel.values;
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
            for (Object obj3 : list) {
                linkedHashMap.put(((TrackingAddressAlias) obj3).getCollectAddress(), obj3);
            }
            map2.putAll(linkedHashMap);
            Result.m7377constructorimpl(Unit.INSTANCE);
            TrackerViewModel trackerViewModel2 = this.this$0;
            this.L$0 = null;
            this.label = 3;
            obj = trackerViewModel2.EZpvd(this);
            if (obj == objCopydefault2) {
                return objCopydefault2;
            }
            trackerTrendRequest = (TrackerTrendRequest) obj;
            C27634jyr c27634jyr = this.this$0.fARcdN;
            this.L$0 = trackerTrendRequest;
            this.label = 4;
            obj = C27634jyr.getEmojiAddressMapping$default(c27634jyr, false, this, 1, null);
            if (obj == objCopydefault2) {
            }
            Map<String, String> map3 = (Map) obj;
            C25750jEz c25750jEz = this.this$0.sSMYrx;
            this.L$0 = map3;
            this.label = 5;
            objCopydefault = c25750jEz.copydefault(trackerTrendRequest, this);
            if (objCopydefault == objCopydefault2) {
            }
        } else {
            if (i != 3) {
                if (i == 4) {
                    trackerTrendRequest = (TrackerTrendRequest) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    Map<String, String> map32 = (Map) obj;
                    C25750jEz c25750jEz2 = this.this$0.sSMYrx;
                    this.L$0 = map32;
                    this.label = 5;
                    objCopydefault = c25750jEz2.copydefault(trackerTrendRequest, this);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    map = map32;
                    objM7386unboximpl = objCopydefault;
                    TrackerViewModel trackerViewModel3 = this.this$0;
                    boolean z = this.$isTabSwitch;
                    if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                    }
                    TrackerViewModel trackerViewModel4 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map = (Map) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                TrackerViewModel trackerViewModel32 = this.this$0;
                boolean z2 = this.$isTabSwitch;
                if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                    List<TrackerTrendItem> listAEQbTJ = ((TrackerTrendResponse) objM7386unboximpl).AEQbTJ();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : listAEQbTJ) {
                        TrackerTrendItem trackerTrendItem = (TrackerTrendItem) obj4;
                        String strAhwBna = trackerViewModel32.OLrzqt().getValue().OLrzqt().AhwBna();
                        if (StringsKt__StringsKt.fARcdN((CharSequence) strAhwBna) || trackerTrendItem.valueOf() >= C33129mqd.AhwBna(strAhwBna)) {
                            arrayList.add(obj4);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(C25746jEv.AEQbTJ.OLrzqt((TrackerTrendItem) it.next(), map, trackerViewModel32.values, trackerViewModel32.AubY));
                    }
                    trackerViewModel32.AkhnZx.setValue(new jDZ.PendingIntent(arrayList2, z2));
                    TrackerTrendUIModel trackerTrendUIModel = (TrackerTrendUIModel) trackerViewModel32.gEmmrt.getValue();
                    if (trackerTrendUIModel != null) {
                        Iterator it2 = arrayList2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            if (Intrinsics.EZpvd((Object) ((TrackerTrendUIModel) next).djBIcL(), (Object) trackerTrendUIModel.djBIcL())) {
                                obj2 = next;
                                break;
                            }
                        }
                        trackerViewModel32.gEmmrt.setValue((TrackerTrendUIModel) obj2);
                    }
                    trackerViewModel32.AEQbTJ();
                    trackerViewModel32.AubY();
                }
                TrackerViewModel trackerViewModel42 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableStateFlow mutableStateFlow2 = trackerViewModel42.AkhnZx;
                    String message = thM7380exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "Unknown error";
                    }
                    mutableStateFlow2.setValue(new jDZ.Application(message));
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            trackerTrendRequest = (TrackerTrendRequest) obj;
            C27634jyr c27634jyr2 = this.this$0.fARcdN;
            this.L$0 = trackerTrendRequest;
            this.label = 4;
            obj = C27634jyr.getEmojiAddressMapping$default(c27634jyr2, false, this, 1, null);
            if (obj == objCopydefault2) {
                return objCopydefault2;
            }
            Map<String, String> map322 = (Map) obj;
            C25750jEz c25750jEz22 = this.this$0.sSMYrx;
            this.L$0 = map322;
            this.label = 5;
            objCopydefault = c25750jEz22.copydefault(trackerTrendRequest, this);
            if (objCopydefault == objCopydefault2) {
            }
        }
        trackerViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            Result.Application application2 = Result.Companion;
            jAH jah = trackerViewModel.ejfBZ;
            String strEZpvd = ((DexUserIdentity) objEZpvd).EZpvd();
            this.L$0 = trackerViewModel;
            this.label = 2;
            objOLrzqt = jah.OLrzqt(strEZpvd, this);
            if (objOLrzqt == objCopydefault2) {
                return objCopydefault2;
            }
            C56391yDq.AEQbTJ(objOLrzqt);
            List list2 = (List) objOLrzqt;
            trackerViewModel.values.clear();
            Map map22 = trackerViewModel.values;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list2, 10)), 16));
            while (r12.hasNext()) {
            }
            map22.putAll(linkedHashMap2);
            Result.m7377constructorimpl(Unit.INSTANCE);
            TrackerViewModel trackerViewModel22 = this.this$0;
            this.L$0 = null;
            this.label = 3;
            obj = trackerViewModel22.EZpvd(this);
            if (obj == objCopydefault2) {
            }
            trackerTrendRequest = (TrackerTrendRequest) obj;
            C27634jyr c27634jyr22 = this.this$0.fARcdN;
            this.L$0 = trackerTrendRequest;
            this.label = 4;
            obj = C27634jyr.getEmojiAddressMapping$default(c27634jyr22, false, this, 1, null);
            if (obj == objCopydefault2) {
            }
            Map<String, String> map3222 = (Map) obj;
            C25750jEz c25750jEz222 = this.this$0.sSMYrx;
            this.L$0 = map3222;
            this.label = 5;
            objCopydefault = c25750jEz222.copydefault(trackerTrendRequest, this);
            if (objCopydefault == objCopydefault2) {
            }
        }
        Result.m7377constructorimpl(objEZpvd);
        TrackerViewModel trackerViewModel222 = this.this$0;
        this.L$0 = null;
        this.label = 3;
        obj = trackerViewModel222.EZpvd(this);
        if (obj == objCopydefault2) {
        }
        trackerTrendRequest = (TrackerTrendRequest) obj;
        C27634jyr c27634jyr222 = this.this$0.fARcdN;
        this.L$0 = trackerTrendRequest;
        this.label = 4;
        obj = C27634jyr.getEmojiAddressMapping$default(c27634jyr222, false, this, 1, null);
        if (obj == objCopydefault2) {
        }
        Map<String, String> map32222 = (Map) obj;
        C25750jEz c25750jEz2222 = this.this$0.sSMYrx;
        this.L$0 = map32222;
        this.label = 5;
        objCopydefault = c25750jEz2222.copydefault(trackerTrendRequest, this);
        if (objCopydefault == objCopydefault2) {
        }
    }
}
