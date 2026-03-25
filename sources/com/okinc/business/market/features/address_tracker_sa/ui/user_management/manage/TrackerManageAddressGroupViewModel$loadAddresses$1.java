package com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage;

import com.okinc.business.market.data.constant.AddressTrackerSortType;
import com.okinc.business.market.data.model.GetTrackingAddressListResponse;
import com.okinc.business.market.data.model.TrackingAddressData;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC25781jGc;
import o.C25749jEy;
import o.C28586kda;
import o.C33129mqd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerManageAddressGroupViewModel$loadAddresses$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $showLoading;
    Object L$0;
    int label;
    final /* synthetic */ TrackerManageAddressGroupViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerManageAddressGroupViewModel$loadAddresses$1(boolean z, TrackerManageAddressGroupViewModel trackerManageAddressGroupViewModel, Continuation<? super TrackerManageAddressGroupViewModel$loadAddresses$1> continuation) {
        super(2, continuation);
        this.$showLoading = z;
        this.this$0 = trackerManageAddressGroupViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerManageAddressGroupViewModel$loadAddresses$1(this.$showLoading, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerManageAddressGroupViewModel$loadAddresses$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098 A[Catch: Exception -> 0x012a, TryCatch #0 {Exception -> 0x012a, blocks: (B:8:0x001c, B:34:0x00c0, B:36:0x00c8, B:37:0x00de, B:39:0x00e4, B:40:0x00f2, B:41:0x010b, B:43:0x0113, B:46:0x0123, B:13:0x0035, B:25:0x007a, B:30:0x00ab, B:29:0x0098, B:14:0x003b, B:22:0x0068, B:19:0x0059), top: B:56:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8 A[Catch: Exception -> 0x012a, TryCatch #0 {Exception -> 0x012a, blocks: (B:8:0x001c, B:34:0x00c0, B:36:0x00c8, B:37:0x00de, B:39:0x00e4, B:40:0x00f2, B:41:0x010b, B:43:0x0113, B:46:0x0123, B:13:0x0035, B:25:0x007a, B:30:0x00ab, B:29:0x0098, B:14:0x003b, B:22:0x0068, B:19:0x0059), top: B:56:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0113 A[Catch: Exception -> 0x012a, TryCatch #0 {Exception -> 0x012a, blocks: (B:8:0x001c, B:34:0x00c0, B:36:0x00c8, B:37:0x00de, B:39:0x00e4, B:40:0x00f2, B:41:0x010b, B:43:0x0113, B:46:0x0123, B:13:0x0035, B:25:0x007a, B:30:0x00ab, B:29:0x0098, B:14:0x003b, B:22:0x0068, B:19:0x0059), top: B:56:0x0010 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        DexUserIdentity dexUserIdentity;
        Object objAEQbTJ;
        Object objOLrzqt2;
        Map map;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception e) {
            pUU.AEQbTJ("TrackerManageAddressGroupViewModel", "Failed to load addresses", e);
            MutableStateFlow mutableStateFlow = this.this$0.ejfBZ;
            String message = e.getMessage();
            mutableStateFlow.setValue(new AbstractC25781jGc.TaskDescription(message != null ? message : "Unknown error"));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$showLoading) {
                this.this$0.ejfBZ.setValue(AbstractC25781jGc.ActionBar.copydefault);
            }
            C28586kda c28586kdaOLrzqt = this.this$0.OLrzqt();
            this.label = 1;
            objOLrzqt = c28586kdaOLrzqt.OLrzqt(this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    dexUserIdentity = (DexUserIdentity) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objAEQbTJ = obj;
                    Map map2 = (Map) objAEQbTJ;
                    C25749jEy c25749jEyAEQbTJ = this.this$0.AEQbTJ();
                    String strEZpvd = dexUserIdentity.EZpvd();
                    AddressTrackerSortType addressTrackerSortType = AddressTrackerSortType.TrackedTime;
                    Long lKWHzl = this.this$0.EZpvd() != -1 ? null : C56443yFo.KWHzl(C33129mqd.valueOf(C56443yFo.KWHzl(this.this$0.EZpvd())));
                    this.L$0 = map2;
                    this.label = 3;
                    objOLrzqt2 = c25749jEyAEQbTJ.OLrzqt(strEZpvd, 1, addressTrackerSortType, lKWHzl, false, this);
                    if (objOLrzqt2 != objCopydefault) {
                        return objCopydefault;
                    }
                    map = map2;
                    TrackerManageAddressGroupViewModel trackerManageAddressGroupViewModel = this.this$0;
                    if (Result.m7384isSuccessimpl(objOLrzqt2)) {
                    }
                    TrackerManageAddressGroupViewModel trackerManageAddressGroupViewModel2 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objOLrzqt2);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map = (Map) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt2 = ((Result) obj).m7386unboximpl();
                TrackerManageAddressGroupViewModel trackerManageAddressGroupViewModel3 = this.this$0;
                if (Result.m7384isSuccessimpl(objOLrzqt2)) {
                    List<TrackingAddressData> listKWHzl = ((GetTrackingAddressListResponse) objOLrzqt2).KWHzl();
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
                    Iterator<T> it = listKWHzl.iterator();
                    while (it.hasNext()) {
                        arrayList.add(trackerManageAddressGroupViewModel3.copydefault((TrackingAddressData) it.next(), (Map<String, String>) map));
                    }
                    trackerManageAddressGroupViewModel3.AkhnZx.setValue(arrayList);
                    trackerManageAddressGroupViewModel3.ejfBZ.setValue(AbstractC25781jGc.Activity.KWHzl);
                    trackerManageAddressGroupViewModel3.fJNWhG();
                    trackerManageAddressGroupViewModel3.AYXKKw();
                    trackerManageAddressGroupViewModel3.gEmmrt();
                }
                TrackerManageAddressGroupViewModel trackerManageAddressGroupViewModel22 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objOLrzqt2);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("TrackerManageAddressGroupViewModel", "Failed to load addresses", thM7380exceptionOrNullimpl);
                    MutableStateFlow mutableStateFlow2 = trackerManageAddressGroupViewModel22.ejfBZ;
                    String message2 = thM7380exceptionOrNullimpl.getMessage();
                    if (message2 == null) {
                        message2 = "Unknown error";
                    }
                    mutableStateFlow2.setValue(new AbstractC25781jGc.TaskDescription(message2));
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objOLrzqt);
        dexUserIdentity = (DexUserIdentity) objOLrzqt;
        TrackerManageAddressGroupViewModel trackerManageAddressGroupViewModel4 = this.this$0;
        this.L$0 = dexUserIdentity;
        this.label = 2;
        objAEQbTJ = trackerManageAddressGroupViewModel4.AEQbTJ(this);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        Map map22 = (Map) objAEQbTJ;
        C25749jEy c25749jEyAEQbTJ2 = this.this$0.AEQbTJ();
        String strEZpvd2 = dexUserIdentity.EZpvd();
        AddressTrackerSortType addressTrackerSortType2 = AddressTrackerSortType.TrackedTime;
        Long lKWHzl2 = this.this$0.EZpvd() != -1 ? null : C56443yFo.KWHzl(C33129mqd.valueOf(C56443yFo.KWHzl(this.this$0.EZpvd())));
        this.L$0 = map22;
        this.label = 3;
        objOLrzqt2 = c25749jEyAEQbTJ2.OLrzqt(strEZpvd2, 1, addressTrackerSortType2, lKWHzl2, false, this);
        if (objOLrzqt2 != objCopydefault) {
        }
    }
}
