package com.okinc.business.market.features.address_tracker_sa.ui.user_management;

import com.okinc.business.market.data.constant.AddressTrackerSortType;
import com.okinc.business.market.data.model.GetTrackingAddressListResponse;
import com.okinc.business.market.features.address_tracker.domain.TrackingAddressAlias;
import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC25772jFu;
import o.C25749jEy;
import o.C28586kda;
import o.C33129mqd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.C56548yJl;
import o.jAH;
import o.jEJ;
import o.pUU;
import o.xVW;
import o.yDY;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerAddressManagementViewModel$loadAddresses$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isAsc;
    final /* synthetic */ boolean $showLoading;
    final /* synthetic */ AddressTrackerSortType $sortType;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ TrackerAddressManagementViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerAddressManagementViewModel$loadAddresses$1(boolean z, TrackerAddressManagementViewModel trackerAddressManagementViewModel, AddressTrackerSortType addressTrackerSortType, boolean z2, Continuation<? super TrackerAddressManagementViewModel$loadAddresses$1> continuation) {
        super(2, continuation);
        this.$showLoading = z;
        this.this$0 = trackerAddressManagementViewModel;
        this.$sortType = addressTrackerSortType;
        this.$isAsc = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerAddressManagementViewModel$loadAddresses$1(this.$showLoading, this.this$0, this.$sortType, this.$isAsc, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerAddressManagementViewModel$loadAddresses$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6 A[Catch: Exception -> 0x0065, TryCatch #0 {Exception -> 0x0065, blocks: (B:9:0x0024, B:52:0x013c, B:54:0x0144, B:61:0x0163, B:57:0x0152, B:62:0x017f, B:64:0x0187, B:67:0x0197, B:14:0x0041, B:36:0x00bf, B:40:0x00ca, B:41:0x00e5, B:43:0x00eb, B:44:0x00fa, B:48:0x0126, B:47:0x0114, B:39:0x00c6, B:17:0x0053, B:32:0x00a7, B:18:0x0059, B:29:0x0095, B:26:0x0086), top: B:76:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb A[Catch: Exception -> 0x0065, LOOP:0: B:41:0x00e5->B:43:0x00eb, LOOP_END, TryCatch #0 {Exception -> 0x0065, blocks: (B:9:0x0024, B:52:0x013c, B:54:0x0144, B:61:0x0163, B:57:0x0152, B:62:0x017f, B:64:0x0187, B:67:0x0197, B:14:0x0041, B:36:0x00bf, B:40:0x00ca, B:41:0x00e5, B:43:0x00eb, B:44:0x00fa, B:48:0x0126, B:47:0x0114, B:39:0x00c6, B:17:0x0053, B:32:0x00a7, B:18:0x0059, B:29:0x0095, B:26:0x0086), top: B:76:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0114 A[Catch: Exception -> 0x0065, TryCatch #0 {Exception -> 0x0065, blocks: (B:9:0x0024, B:52:0x013c, B:54:0x0144, B:61:0x0163, B:57:0x0152, B:62:0x017f, B:64:0x0187, B:67:0x0197, B:14:0x0041, B:36:0x00bf, B:40:0x00ca, B:41:0x00e5, B:43:0x00eb, B:44:0x00fa, B:48:0x0126, B:47:0x0114, B:39:0x00c6, B:17:0x0053, B:32:0x00a7, B:18:0x0059, B:29:0x0095, B:26:0x0086), top: B:76:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0139 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0144 A[Catch: Exception -> 0x0065, TryCatch #0 {Exception -> 0x0065, blocks: (B:9:0x0024, B:52:0x013c, B:54:0x0144, B:61:0x0163, B:57:0x0152, B:62:0x017f, B:64:0x0187, B:67:0x0197, B:14:0x0041, B:36:0x00bf, B:40:0x00ca, B:41:0x00e5, B:43:0x00eb, B:44:0x00fa, B:48:0x0126, B:47:0x0114, B:39:0x00c6, B:17:0x0053, B:32:0x00a7, B:18:0x0059, B:29:0x0095, B:26:0x0086), top: B:76:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0187 A[Catch: Exception -> 0x0065, TryCatch #0 {Exception -> 0x0065, blocks: (B:9:0x0024, B:52:0x013c, B:54:0x0144, B:61:0x0163, B:57:0x0152, B:62:0x017f, B:64:0x0187, B:67:0x0197, B:14:0x0041, B:36:0x00bf, B:40:0x00ca, B:41:0x00e5, B:43:0x00eb, B:44:0x00fa, B:48:0x0126, B:47:0x0114, B:39:0x00c6, B:17:0x0053, B:32:0x00a7, B:18:0x0059, B:29:0x0095, B:26:0x0086), top: B:76:0x0012 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        DexUserIdentity dexUserIdentity;
        Object objAEQbTJ;
        Object objEZpvd;
        Map<String, String> map;
        Object objAhwBna;
        DexUserIdentity dexUserIdentity2;
        Object objOLrzqt2;
        Map<String, String> map2;
        Map<String, TrackingAddressAlias> map3;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception e) {
            pUU.AEQbTJ("TrackerAddressManagementViewModel", "Failed to load addresses", e);
            MutableStateFlow mutableStateFlow = this.this$0.values;
            String message = e.getMessage();
            mutableStateFlow.setValue(new AbstractC25772jFu.Application(message != null ? message : "Unknown error"));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$showLoading) {
                this.this$0.values.setValue(AbstractC25772jFu.StateListAnimator.KWHzl);
            } else {
                this.this$0.values.setValue(AbstractC25772jFu.ActionBar.EZpvd);
            }
            C28586kda c28586kdaOLrzqt = this.this$0.OLrzqt();
            this.label = 1;
            objOLrzqt = c28586kdaOLrzqt.OLrzqt(this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    map3 = (Map) this.L$1;
                    map2 = (Map) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objOLrzqt2 = ((Result) obj).m7386unboximpl();
                    TrackerAddressManagementViewModel trackerAddressManagementViewModel = this.this$0;
                    if (Result.m7384isSuccessimpl(objOLrzqt2)) {
                        GetTrackingAddressListResponse getTrackingAddressListResponse = (GetTrackingAddressListResponse) objOLrzqt2;
                        trackerAddressManagementViewModel.values.setValue(new AbstractC25772jFu.Activity(jEJ.copydefault.EZpvd(getTrackingAddressListResponse.KWHzl(), trackerAddressManagementViewModel.AkhnZx, map2, map3), !(getTrackingAddressListResponse.copydefault().length() == 0 || Intrinsics.EZpvd((Object) xVW.copydefault(), (Object) getTrackingAddressListResponse.copydefault()))));
                    }
                    TrackerAddressManagementViewModel trackerAddressManagementViewModel2 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objOLrzqt2);
                    if (thM7380exceptionOrNullimpl != null) {
                        pUU.AEQbTJ("TrackerAddressManagementViewModel", "Failed to load addresses", thM7380exceptionOrNullimpl);
                        MutableStateFlow mutableStateFlow2 = trackerAddressManagementViewModel2.values;
                        String message2 = thM7380exceptionOrNullimpl.getMessage();
                        if (message2 == null) {
                            message2 = "Unknown error";
                        }
                        mutableStateFlow2.setValue(new AbstractC25772jFu.Application(message2));
                    }
                    return Unit.INSTANCE;
                }
                Map<String, String> map4 = (Map) this.L$1;
                dexUserIdentity2 = (DexUserIdentity) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAhwBna = ((Result) obj).m7386unboximpl();
                map = map4;
                if (Result.m7380exceptionOrNullimpl(objAhwBna) == null) {
                    objAhwBna = yDY.AhwBna();
                }
                List list = (List) objAhwBna;
                LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
                for (Object obj2 : list) {
                    linkedHashMap.put(((TrackingAddressAlias) obj2).getCollectAddress(), obj2);
                }
                C25749jEy c25749jEyAEQbTJ = this.this$0.AEQbTJ();
                String strEZpvd = dexUserIdentity2.EZpvd();
                AddressTrackerSortType addressTrackerSortType = this.$sortType;
                Long lKWHzl = this.this$0.EZpvd() != -1 ? null : C56443yFo.KWHzl(C33129mqd.valueOf(C56443yFo.KWHzl(this.this$0.EZpvd())));
                boolean z = this.$isAsc;
                this.L$0 = map;
                this.L$1 = linkedHashMap;
                this.label = 4;
                objOLrzqt2 = c25749jEyAEQbTJ.OLrzqt(strEZpvd, 1, addressTrackerSortType, lKWHzl, z, this);
                if (objOLrzqt2 != objCopydefault) {
                    return objCopydefault;
                }
                map2 = map;
                map3 = linkedHashMap;
                TrackerAddressManagementViewModel trackerAddressManagementViewModel3 = this.this$0;
                if (Result.m7384isSuccessimpl(objOLrzqt2)) {
                }
                TrackerAddressManagementViewModel trackerAddressManagementViewModel22 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objOLrzqt2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            dexUserIdentity = (DexUserIdentity) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = obj;
            Map<String, String> map5 = (Map) objAEQbTJ;
            jAH jah = this.this$0.isConnected;
            this.L$0 = dexUserIdentity;
            this.L$1 = map5;
            this.label = 3;
            objEZpvd = jah.EZpvd(this);
            if (objEZpvd != objCopydefault) {
                return objCopydefault;
            }
            map = map5;
            objAhwBna = objEZpvd;
            dexUserIdentity2 = dexUserIdentity;
            if (Result.m7380exceptionOrNullimpl(objAhwBna) == null) {
            }
            List list2 = (List) objAhwBna;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list2, 10)), 16));
            while (r1.hasNext()) {
            }
            C25749jEy c25749jEyAEQbTJ2 = this.this$0.AEQbTJ();
            String strEZpvd2 = dexUserIdentity2.EZpvd();
            AddressTrackerSortType addressTrackerSortType2 = this.$sortType;
            if (this.this$0.EZpvd() != -1) {
            }
            boolean z2 = this.$isAsc;
            this.L$0 = map;
            this.L$1 = linkedHashMap2;
            this.label = 4;
            objOLrzqt2 = c25749jEyAEQbTJ2.OLrzqt(strEZpvd2, 1, addressTrackerSortType2, lKWHzl, z2, this);
            if (objOLrzqt2 != objCopydefault) {
            }
        }
        C56391yDq.AEQbTJ(objOLrzqt);
        dexUserIdentity = (DexUserIdentity) objOLrzqt;
        TrackerAddressManagementViewModel trackerAddressManagementViewModel4 = this.this$0;
        this.L$0 = dexUserIdentity;
        this.label = 2;
        objAEQbTJ = trackerAddressManagementViewModel4.AEQbTJ(this);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        Map<String, String> map52 = (Map) objAEQbTJ;
        jAH jah2 = this.this$0.isConnected;
        this.L$0 = dexUserIdentity;
        this.L$1 = map52;
        this.label = 3;
        objEZpvd = jah2.EZpvd(this);
        if (objEZpvd != objCopydefault) {
        }
    }
}
