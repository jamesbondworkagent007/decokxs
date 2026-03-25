package com.okinc.business.market.features.address_tracker_sa.ui.tracker;

import com.okinc.business.market.features.address_tracker.domain.TrackingAddressAlias;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerActivityRequest;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerActivityResponse;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C25745jEu;
import o.C25750jEz;
import o.C27634jyr;
import o.C28586kda;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56548yJl;
import o.jAH;
import o.jDZ;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerViewModel$loadActivity$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isShowLoading;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ TrackerViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerViewModel$loadActivity$1(TrackerViewModel trackerViewModel, boolean z, Continuation<? super TrackerViewModel$loadActivity$1> continuation) {
        super(2, continuation);
        this.this$0 = trackerViewModel;
        this.$isShowLoading = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerViewModel$loadActivity$1(this.this$0, this.$isShowLoading, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerViewModel$loadActivity$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9 A[Catch: all -> 0x00e1, LOOP:1: B:31:0x00c3->B:33:0x00c9, LOOP_END, TryCatch #0 {all -> 0x00e1, blocks: (B:15:0x0045, B:30:0x009c, B:31:0x00c3, B:33:0x00c9, B:34:0x00d8, B:27:0x0085), top: B:64:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0141 A[LOOP:0: B:52:0x013b->B:54:0x0141, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object objEZpvd2;
        TrackerViewModel trackerViewModel;
        List list;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Iterator it;
        jDZ jdz;
        TrackerViewModel trackerViewModel2;
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
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
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    trackerViewModel2 = (TrackerViewModel) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objOLrzqt = ((Result) obj).m7386unboximpl();
                    C56391yDq.AEQbTJ(objOLrzqt);
                    List list2 = (List) objOLrzqt;
                    trackerViewModel2.values.clear();
                    Map map = trackerViewModel2.values;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list2, 10)), 16));
                    for (Object obj3 : list2) {
                        linkedHashMap.put(((TrackingAddressAlias) obj3).getCollectAddress(), obj3);
                    }
                    map.putAll(linkedHashMap);
                    Result.m7377constructorimpl(Unit.INSTANCE);
                    TrackerViewModel trackerViewModel3 = this.this$0;
                    this.L$0 = null;
                    this.label = 3;
                    obj = trackerViewModel3.OLrzqt(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    C25750jEz c25750jEz = this.this$0.sSMYrx;
                    this.label = 4;
                    objEZpvd2 = c25750jEz.EZpvd((TrackerActivityRequest) obj, this);
                    if (objEZpvd2 == objCopydefault) {
                    }
                    trackerViewModel = this.this$0;
                    if (Result.m7384isSuccessimpl(objEZpvd2)) {
                    }
                    TrackerViewModel trackerViewModel4 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd2);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i == 3) {
                    C56391yDq.AEQbTJ(obj);
                    C25750jEz c25750jEz2 = this.this$0.sSMYrx;
                    this.label = 4;
                    objEZpvd2 = c25750jEz2.EZpvd((TrackerActivityRequest) obj, this);
                    if (objEZpvd2 == objCopydefault) {
                        return objCopydefault;
                    }
                    trackerViewModel = this.this$0;
                    if (Result.m7384isSuccessimpl(objEZpvd2)) {
                    }
                    TrackerViewModel trackerViewModel42 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd2);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) this.L$2;
                    trackerViewModel = (TrackerViewModel) this.L$1;
                    obj2 = this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    Map<String, String> map2 = (Map) obj;
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(C25745jEu.AEQbTJ.OLrzqt((TrackerActivityResponse) it.next(), trackerViewModel.fIwbmz(), map2, trackerViewModel.values, trackerViewModel.AubY));
                    }
                    trackerViewModel.AkhnZx.setValue(new jDZ.StateListAnimator(arrayList));
                    trackerViewModel.AEQbTJ();
                    trackerViewModel.zLjUOn();
                    trackerViewModel.wlaJM();
                    objEZpvd2 = obj2;
                    TrackerViewModel trackerViewModel422 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd2);
                    if (thM7380exceptionOrNullimpl != null) {
                        MutableStateFlow mutableStateFlow2 = trackerViewModel422.AkhnZx;
                        String message = thM7380exceptionOrNullimpl.getMessage();
                        if (message == null) {
                            message = "Unknown error";
                        }
                        mutableStateFlow2.setValue(new jDZ.Application(message));
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objEZpvd2 = ((Result) obj).m7386unboximpl();
                trackerViewModel = this.this$0;
                if (Result.m7384isSuccessimpl(objEZpvd2)) {
                    List list3 = (List) objEZpvd2;
                    C27634jyr c27634jyr = trackerViewModel.fARcdN;
                    this.L$0 = objEZpvd2;
                    this.L$1 = trackerViewModel;
                    this.L$2 = list3;
                    this.label = 5;
                    Object emojiAddressMapping$default = C27634jyr.getEmojiAddressMapping$default(c27634jyr, false, this, 1, null);
                    if (emojiAddressMapping$default == objCopydefault) {
                        return objCopydefault;
                    }
                    list = list3;
                    obj2 = objEZpvd2;
                    obj = emojiAddressMapping$default;
                    Map<String, String> map22 = (Map) obj;
                    ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                    }
                    trackerViewModel.AkhnZx.setValue(new jDZ.StateListAnimator(arrayList2));
                    trackerViewModel.AEQbTJ();
                    trackerViewModel.zLjUOn();
                    trackerViewModel.wlaJM();
                    objEZpvd2 = obj2;
                }
                TrackerViewModel trackerViewModel4222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        trackerViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            Result.Application application2 = Result.Companion;
            jAH jah = trackerViewModel2.ejfBZ;
            String strEZpvd = ((DexUserIdentity) objEZpvd).EZpvd();
            this.L$0 = trackerViewModel2;
            this.label = 2;
            objOLrzqt = jah.OLrzqt(strEZpvd, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            C56391yDq.AEQbTJ(objOLrzqt);
            List list22 = (List) objOLrzqt;
            trackerViewModel2.values.clear();
            Map map3 = trackerViewModel2.values;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list22, 10)), 16));
            while (r13.hasNext()) {
            }
            map3.putAll(linkedHashMap2);
            Result.m7377constructorimpl(Unit.INSTANCE);
            TrackerViewModel trackerViewModel32 = this.this$0;
            this.L$0 = null;
            this.label = 3;
            obj = trackerViewModel32.OLrzqt(this);
            if (obj == objCopydefault) {
            }
            C25750jEz c25750jEz22 = this.this$0.sSMYrx;
            this.label = 4;
            objEZpvd2 = c25750jEz22.EZpvd((TrackerActivityRequest) obj, this);
            if (objEZpvd2 == objCopydefault) {
            }
            trackerViewModel = this.this$0;
            if (Result.m7384isSuccessimpl(objEZpvd2)) {
            }
            TrackerViewModel trackerViewModel42222 = this.this$0;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd2);
            if (thM7380exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        }
        Result.m7377constructorimpl(objEZpvd);
        TrackerViewModel trackerViewModel322 = this.this$0;
        this.L$0 = null;
        this.label = 3;
        obj = trackerViewModel322.OLrzqt(this);
        if (obj == objCopydefault) {
        }
        C25750jEz c25750jEz222 = this.this$0.sSMYrx;
        this.label = 4;
        objEZpvd2 = c25750jEz222.EZpvd((TrackerActivityRequest) obj, this);
        if (objEZpvd2 == objCopydefault) {
        }
        trackerViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objEZpvd2)) {
        }
        TrackerViewModel trackerViewModel422222 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd2);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
