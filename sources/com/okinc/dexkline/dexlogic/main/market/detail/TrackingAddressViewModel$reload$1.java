package com.okinc.dexkline.dexlogic.main.market.detail;

import com.okinc.dexkline.market.features.address_tracker.domain.TrackingAddressAlias;
import com.okinc.dexkline.market.features.identity.domain.DexUserIdentity;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C34377nat;
import o.C34587ner;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.C56548yJl;
import o.mVN;
import o.mVO;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes8.dex */
public final class TrackingAddressViewModel$reload$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $shouldRefresh;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    boolean Z$0;
    int label;
    final /* synthetic */ TrackingAddressViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingAddressViewModel$reload$1(TrackingAddressViewModel trackingAddressViewModel, boolean z, Continuation<? super TrackingAddressViewModel$reload$1> continuation) {
        super(2, continuation);
        this.this$0 = trackingAddressViewModel;
        this.$shouldRefresh = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackingAddressViewModel$reload$1(this.this$0, this.$shouldRefresh, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackingAddressViewModel$reload$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00f0 A[Catch: all -> 0x01ab, TryCatch #0 {all -> 0x01ab, blocks: (B:9:0x001c, B:48:0x0178, B:52:0x0183, B:54:0x0195, B:55:0x01a4, B:51:0x017f, B:14:0x0051, B:36:0x0121, B:39:0x012d, B:41:0x0135, B:43:0x0149, B:30:0x00ea, B:32:0x00f0, B:44:0x014f, B:42:0x0145, B:17:0x0068, B:29:0x00bd, B:25:0x009c), top: B:65:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0135 A[Catch: all -> 0x01ab, TryCatch #0 {all -> 0x01ab, blocks: (B:9:0x001c, B:48:0x0178, B:52:0x0183, B:54:0x0195, B:55:0x01a4, B:51:0x017f, B:14:0x0051, B:36:0x0121, B:39:0x012d, B:41:0x0135, B:43:0x0149, B:30:0x00ea, B:32:0x00f0, B:44:0x014f, B:42:0x0145, B:17:0x0068, B:29:0x00bd, B:25:0x009c), top: B:65:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0145 A[Catch: all -> 0x01ab, TryCatch #0 {all -> 0x01ab, blocks: (B:9:0x001c, B:48:0x0178, B:52:0x0183, B:54:0x0195, B:55:0x01a4, B:51:0x017f, B:14:0x0051, B:36:0x0121, B:39:0x012d, B:41:0x0135, B:43:0x0149, B:30:0x00ea, B:32:0x00f0, B:44:0x014f, B:42:0x0145, B:17:0x0068, B:29:0x00bd, B:25:0x009c), top: B:65:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014f A[Catch: all -> 0x01ab, TryCatch #0 {all -> 0x01ab, blocks: (B:9:0x001c, B:48:0x0178, B:52:0x0183, B:54:0x0195, B:55:0x01a4, B:51:0x017f, B:14:0x0051, B:36:0x0121, B:39:0x012d, B:41:0x0135, B:43:0x0149, B:30:0x00ea, B:32:0x00f0, B:44:0x014f, B:42:0x0145, B:17:0x0068, B:29:0x00bd, B:25:0x009c), top: B:65:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017f A[Catch: all -> 0x01ab, TryCatch #0 {all -> 0x01ab, blocks: (B:9:0x001c, B:48:0x0178, B:52:0x0183, B:54:0x0195, B:55:0x01a4, B:51:0x017f, B:14:0x0051, B:36:0x0121, B:39:0x012d, B:41:0x0135, B:43:0x0149, B:30:0x00ea, B:32:0x00f0, B:44:0x014f, B:42:0x0145, B:17:0x0068, B:29:0x00bd, B:25:0x009c), top: B:65:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0195 A[Catch: all -> 0x01ab, TryCatch #0 {all -> 0x01ab, blocks: (B:9:0x001c, B:48:0x0178, B:52:0x0183, B:54:0x0195, B:55:0x01a4, B:51:0x017f, B:14:0x0051, B:36:0x0121, B:39:0x012d, B:41:0x0135, B:43:0x0149, B:30:0x00ea, B:32:0x00f0, B:44:0x014f, B:42:0x0145, B:17:0x0068, B:29:0x00bd, B:25:0x009c), top: B:65:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x011e -> B:36:0x0121). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        Object objEZpvd;
        TrackingAddressViewModel trackingAddressViewModel;
        DexUserIdentity dexUserIdentity;
        boolean z;
        Object objM7386unboximpl;
        DexUserIdentity dexUserIdentity2;
        Map linkedHashMap;
        Map map;
        Iterator it;
        Object objEZpvd2;
        boolean z2;
        TrackingAddressViewModel trackingAddressViewModel2;
        String collectAddress;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C34377nat c34377nat = this.this$0.AYXKKw;
            this.label = 1;
            objEZpvd = c34377nat.EZpvd(this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        } else if (i == 2) {
            z = this.Z$0;
            dexUserIdentity = (DexUserIdentity) this.L$1;
            trackingAddressViewModel = (TrackingAddressViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
            C56391yDq.AEQbTJ(objM7386unboximpl);
            List list = (List) objM7386unboximpl;
            trackingAddressViewModel.copydefault.clear();
            Map map2 = trackingAddressViewModel.copydefault;
            dexUserIdentity2 = dexUserIdentity;
            linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
            map = map2;
            it = list.iterator();
            if (!it.hasNext()) {
            }
        } else {
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z2 = this.Z$0;
                trackingAddressViewModel2 = (TrackingAddressViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd2 = ((Result) obj).m7386unboximpl();
                if (Result.m7380exceptionOrNullimpl(objEZpvd2) == null) {
                    objEZpvd2 = yDY.AhwBna();
                }
                trackingAddressViewModel2.valueOf.clear();
                trackingAddressViewModel2.valueOf.addAll((List) objEZpvd2);
                if (z2) {
                    trackingAddressViewModel2.AEQbTJ.setValue(C56443yFo.KWHzl(System.currentTimeMillis()));
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.KWHzl(thM7380exceptionOrNullimpl);
                }
                return Unit.INSTANCE;
            }
            z = this.Z$0;
            linkedHashMap = (Map) this.L$7;
            TrackingAddressAlias trackingAddressAlias = (TrackingAddressAlias) this.L$6;
            Object next = this.L$5;
            it = (Iterator) this.L$4;
            Map map3 = (Map) this.L$3;
            map = (Map) this.L$2;
            dexUserIdentity2 = (DexUserIdentity) this.L$1;
            TrackingAddressViewModel trackingAddressViewModel3 = (TrackingAddressViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            Object objEZpvd3 = ((Result) obj).m7386unboximpl();
            Boolean boolKWHzl = C56443yFo.KWHzl(false);
            if (Result.m7383isFailureimpl(objEZpvd3)) {
                objEZpvd3 = boolKWHzl;
            }
            if (!((Boolean) objEZpvd3).booleanValue()) {
                collectAddress = trackingAddressAlias.getCollectAddress().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(collectAddress, "");
            } else {
                collectAddress = trackingAddressAlias.getCollectAddress();
            }
            linkedHashMap.put(collectAddress, next);
            linkedHashMap = map3;
            trackingAddressViewModel = trackingAddressViewModel3;
            if (!it.hasNext()) {
                next = it.next();
                TrackingAddressAlias trackingAddressAlias2 = (TrackingAddressAlias) next;
                C34587ner c34587ner = trackingAddressViewModel.AhwBna;
                String strCopydefault = trackingAddressViewModel.gEmmrt.copydefault();
                this.L$0 = trackingAddressViewModel;
                this.L$1 = dexUserIdentity2;
                this.L$2 = map;
                this.L$3 = linkedHashMap;
                this.L$4 = it;
                this.L$5 = next;
                this.L$6 = trackingAddressAlias2;
                this.L$7 = linkedHashMap;
                this.Z$0 = z;
                this.label = 3;
                objEZpvd3 = c34587ner.EZpvd(strCopydefault, this);
                if (objEZpvd3 == objCopydefault) {
                    return objCopydefault;
                }
                trackingAddressViewModel3 = trackingAddressViewModel;
                trackingAddressAlias = trackingAddressAlias2;
                map3 = linkedHashMap;
                Boolean boolKWHzl2 = C56443yFo.KWHzl(false);
                if (Result.m7383isFailureimpl(objEZpvd3)) {
                }
                if (!((Boolean) objEZpvd3).booleanValue()) {
                }
                linkedHashMap.put(collectAddress, next);
                linkedHashMap = map3;
                trackingAddressViewModel = trackingAddressViewModel3;
                if (!it.hasNext()) {
                    map.putAll(linkedHashMap);
                    mVN mvn = trackingAddressViewModel.OLrzqt;
                    String strOLrzqt = dexUserIdentity2.OLrzqt();
                    this.L$0 = trackingAddressViewModel;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.Z$0 = z;
                    this.label = 4;
                    objEZpvd2 = mvn.EZpvd(strOLrzqt, this);
                    if (objEZpvd2 == objCopydefault) {
                        return objCopydefault;
                    }
                    z2 = z;
                    trackingAddressViewModel2 = trackingAddressViewModel;
                    if (Result.m7380exceptionOrNullimpl(objEZpvd2) == null) {
                    }
                    trackingAddressViewModel2.valueOf.clear();
                    trackingAddressViewModel2.valueOf.addAll((List) objEZpvd2);
                    if (z2) {
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
            }
        }
        trackingAddressViewModel = this.this$0;
        boolean z3 = this.$shouldRefresh;
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            Result.Application application2 = Result.Companion;
            DexUserIdentity dexUserIdentity3 = (DexUserIdentity) objEZpvd;
            mVO mvo = trackingAddressViewModel.KWHzl;
            String strOLrzqt2 = dexUserIdentity3.OLrzqt();
            this.L$0 = trackingAddressViewModel;
            this.L$1 = dexUserIdentity3;
            this.Z$0 = z3;
            this.label = 2;
            Object objKWHzl = mvo.KWHzl(strOLrzqt2, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            dexUserIdentity = dexUserIdentity3;
            z = z3;
            objM7386unboximpl = objKWHzl;
            C56391yDq.AEQbTJ(objM7386unboximpl);
            List list2 = (List) objM7386unboximpl;
            trackingAddressViewModel.copydefault.clear();
            Map map22 = trackingAddressViewModel.copydefault;
            dexUserIdentity2 = dexUserIdentity;
            linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list2, 10)), 16));
            map = map22;
            it = list2.iterator();
            if (!it.hasNext()) {
            }
        } else {
            objM7377constructorimpl = Result.m7377constructorimpl(objEZpvd);
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        }
    }
}
