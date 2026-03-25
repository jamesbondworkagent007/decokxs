package com.okinc.business.market.features.address_tracker_sa.ui.tracker;

import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerAddressGroup;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerAddressLabel;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerAddressSourceResponse;
import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C25750jEz;
import o.C28586kda;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C56442yFn;
import o.jDG;
import o.jDZ;
import o.yDY;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerViewModel$loadAddressSourceList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isShowLoading;
    int label;
    final /* synthetic */ TrackerViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerViewModel$loadAddressSourceList$1(TrackerViewModel trackerViewModel, boolean z, Continuation<? super TrackerViewModel$loadAddressSourceList$1> continuation) {
        super(2, continuation);
        this.this$0 = trackerViewModel;
        this.$isShowLoading = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerViewModel$loadAddressSourceList$1(this.this$0, this.$isShowLoading, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerViewModel$loadAddressSourceList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [362=4, 364=4] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        String strEZpvd;
        Object objKWHzl;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
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
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
                TrackerViewModel trackerViewModel = this.this$0;
                boolean z = this.$isShowLoading;
                if (Result.m7384isSuccessimpl(objKWHzl)) {
                    TrackerAddressSourceResponse trackerAddressSourceResponse = (TrackerAddressSourceResponse) objKWHzl;
                    trackerViewModel.AEQbTJ.setValue(trackerAddressSourceResponse);
                    if ((!trackerViewModel.getFieldNames().isEmpty()) || (!trackerViewModel.getNewProxyInstance().isEmpty())) {
                        List<String> fieldNames = trackerViewModel.getFieldNames();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : fieldNames) {
                            String str = (String) obj2;
                            List<jDG> listDjBIcL = trackerViewModel.djBIcL();
                            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listDjBIcL, 10));
                            Iterator<T> it = listDjBIcL.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((jDG) it.next()).copydefault());
                            }
                            if (arrayList2.contains(str)) {
                                arrayList.add(obj2);
                            }
                        }
                        trackerViewModel.copydefault(arrayList);
                        List<String> newProxyInstance = trackerViewModel.getNewProxyInstance();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : newProxyInstance) {
                            String str2 = (String) obj3;
                            List<jDG> listAhwBna = trackerViewModel.AhwBna();
                            ArrayList arrayList4 = new ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
                            Iterator<T> it2 = listAhwBna.iterator();
                            while (it2.hasNext()) {
                                arrayList4.add(((jDG) it2.next()).copydefault());
                            }
                            if (arrayList4.contains(str2)) {
                                arrayList3.add(obj3);
                            }
                        }
                        trackerViewModel.EZpvd(arrayList3);
                        if (trackerViewModel.values().size() + trackerViewModel.KWHzl().size() == 0) {
                            if (trackerAddressSourceResponse.AEQbTJ().size() > 0) {
                                trackerViewModel.copydefault(yDY.AhwBna());
                                List<TrackerAddressGroup> listAEQbTJ = trackerAddressSourceResponse.AEQbTJ();
                                ArrayList arrayList5 = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
                                Iterator<T> it3 = listAEQbTJ.iterator();
                                while (it3.hasNext()) {
                                    arrayList5.add(String.valueOf(((TrackerAddressGroup) it3.next()).AEQbTJ()));
                                }
                                trackerViewModel.EZpvd(C56402yEa.EZpvd(CollectionsKt___CollectionsKt.AuCTelauCTel(CollectionsKt___CollectionsKt.QbewEr(arrayList5))));
                            } else {
                                List listQOLQEE = C56403yEb.QOLQEE(trackerAddressSourceResponse.copydefault().values());
                                ArrayList arrayList6 = new ArrayList(C56403yEb.AYXKKw(listQOLQEE, 10));
                                Iterator it4 = listQOLQEE.iterator();
                                while (it4.hasNext()) {
                                    arrayList6.add(((TrackerAddressLabel) it4.next()).AEQbTJ());
                                }
                                trackerViewModel.copydefault(C56402yEa.EZpvd(CollectionsKt___CollectionsKt.AuCTelauCTel(CollectionsKt___CollectionsKt.QbewEr(arrayList6))));
                                trackerViewModel.EZpvd(yDY.AhwBna());
                            }
                        }
                        trackerViewModel.AuCTelauCTel();
                        TrackerViewModel.loadCurrentPage$default(trackerViewModel, false, z, 1, null);
                    }
                }
                TrackerViewModel trackerViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableStateFlow mutableStateFlow = trackerViewModel2.AkhnZx;
                    String message = thM7380exceptionOrNullimpl.getMessage();
                    mutableStateFlow.setValue(new jDZ.Application(message != null ? message : ""));
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
        if (dexUserIdentity == null || (strEZpvd = dexUserIdentity.EZpvd()) == null) {
            strEZpvd = "";
        }
        C25750jEz c25750jEz = this.this$0.sSMYrx;
        this.label = 2;
        objKWHzl = c25750jEz.KWHzl(strEZpvd, this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        TrackerViewModel trackerViewModel3 = this.this$0;
        boolean z2 = this.$isShowLoading;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
        }
        TrackerViewModel trackerViewModel22 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
