package com.okinc.business.market.features.meme.aped_together.ui;

import com.okinc.business.market.features.address_tracker.domain.TrackingAddressAlias;
import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import java.util.ArrayList;
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
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C28586kda;
import o.C28653keo;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.C56548yJl;
import o.InterfaceC28618keF;
import o.jAH;
import o.jAO;
import o.kKG;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class ApedTogetherViewModel$loadAliases$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ ApedTogetherViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApedTogetherViewModel$loadAliases$1(ApedTogetherViewModel apedTogetherViewModel, String str, Continuation<? super ApedTogetherViewModel$loadAliases$1> continuation) {
        super(2, continuation);
        this.this$0 = apedTogetherViewModel;
        this.$chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ApedTogetherViewModel$loadAliases$1(this.this$0, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ApedTogetherViewModel$loadAliases$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00fa A[Catch: all -> 0x020a, TryCatch #0 {all -> 0x020a, blocks: (B:9:0x001c, B:48:0x0178, B:52:0x0183, B:54:0x01a1, B:55:0x01bb, B:57:0x01c1, B:59:0x01d8, B:62:0x01e2, B:61:0x01de, B:63:0x01fc, B:64:0x0203, B:51:0x017f, B:14:0x0053, B:36:0x0123, B:39:0x012f, B:41:0x0137, B:43:0x014b, B:30:0x00f4, B:32:0x00fa, B:44:0x0150, B:42:0x0147, B:17:0x0072, B:29:0x00c6, B:25:0x00a6), top: B:74:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0137 A[Catch: all -> 0x020a, TryCatch #0 {all -> 0x020a, blocks: (B:9:0x001c, B:48:0x0178, B:52:0x0183, B:54:0x01a1, B:55:0x01bb, B:57:0x01c1, B:59:0x01d8, B:62:0x01e2, B:61:0x01de, B:63:0x01fc, B:64:0x0203, B:51:0x017f, B:14:0x0053, B:36:0x0123, B:39:0x012f, B:41:0x0137, B:43:0x014b, B:30:0x00f4, B:32:0x00fa, B:44:0x0150, B:42:0x0147, B:17:0x0072, B:29:0x00c6, B:25:0x00a6), top: B:74:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0147 A[Catch: all -> 0x020a, TryCatch #0 {all -> 0x020a, blocks: (B:9:0x001c, B:48:0x0178, B:52:0x0183, B:54:0x01a1, B:55:0x01bb, B:57:0x01c1, B:59:0x01d8, B:62:0x01e2, B:61:0x01de, B:63:0x01fc, B:64:0x0203, B:51:0x017f, B:14:0x0053, B:36:0x0123, B:39:0x012f, B:41:0x0137, B:43:0x014b, B:30:0x00f4, B:32:0x00fa, B:44:0x0150, B:42:0x0147, B:17:0x0072, B:29:0x00c6, B:25:0x00a6), top: B:74:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0150 A[Catch: all -> 0x020a, TryCatch #0 {all -> 0x020a, blocks: (B:9:0x001c, B:48:0x0178, B:52:0x0183, B:54:0x01a1, B:55:0x01bb, B:57:0x01c1, B:59:0x01d8, B:62:0x01e2, B:61:0x01de, B:63:0x01fc, B:64:0x0203, B:51:0x017f, B:14:0x0053, B:36:0x0123, B:39:0x012f, B:41:0x0137, B:43:0x014b, B:30:0x00f4, B:32:0x00fa, B:44:0x0150, B:42:0x0147, B:17:0x0072, B:29:0x00c6, B:25:0x00a6), top: B:74:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017f A[Catch: all -> 0x020a, TryCatch #0 {all -> 0x020a, blocks: (B:9:0x001c, B:48:0x0178, B:52:0x0183, B:54:0x01a1, B:55:0x01bb, B:57:0x01c1, B:59:0x01d8, B:62:0x01e2, B:61:0x01de, B:63:0x01fc, B:64:0x0203, B:51:0x017f, B:14:0x0053, B:36:0x0123, B:39:0x012f, B:41:0x0137, B:43:0x014b, B:30:0x00f4, B:32:0x00fa, B:44:0x0150, B:42:0x0147, B:17:0x0072, B:29:0x00c6, B:25:0x00a6), top: B:74:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a1 A[Catch: all -> 0x020a, TryCatch #0 {all -> 0x020a, blocks: (B:9:0x001c, B:48:0x0178, B:52:0x0183, B:54:0x01a1, B:55:0x01bb, B:57:0x01c1, B:59:0x01d8, B:62:0x01e2, B:61:0x01de, B:63:0x01fc, B:64:0x0203, B:51:0x017f, B:14:0x0053, B:36:0x0123, B:39:0x012f, B:41:0x0137, B:43:0x014b, B:30:0x00f4, B:32:0x00fa, B:44:0x0150, B:42:0x0147, B:17:0x0072, B:29:0x00c6, B:25:0x00a6), top: B:74:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0220  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0120 -> B:36:0x0123). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        Object objOLrzqt;
        ApedTogetherViewModel apedTogetherViewModel;
        DexUserIdentity dexUserIdentity;
        Object objM7386unboximpl;
        String str;
        Iterator it;
        String str2;
        Map map;
        DexUserIdentity dexUserIdentity2;
        Map map2;
        Object objAEQbTJ;
        ApedTogetherViewModel apedTogetherViewModel2;
        String collectAddress;
        InterfaceC28618keF value;
        String strAYXKKw;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28586kda c28586kda = this.this$0.djBIcL;
            this.label = 1;
            objOLrzqt = c28586kda.OLrzqt(this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        } else if (i == 2) {
            dexUserIdentity = (DexUserIdentity) this.L$2;
            str = (String) this.L$1;
            apedTogetherViewModel = (ApedTogetherViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
            C56391yDq.AEQbTJ(objM7386unboximpl);
            List list = (List) objM7386unboximpl;
            apedTogetherViewModel.EZpvd.clear();
            Map map3 = apedTogetherViewModel.EZpvd;
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
            it = list.iterator();
            str2 = str;
            map = map3;
            dexUserIdentity2 = dexUserIdentity;
            map2 = linkedHashMap;
            if (!it.hasNext()) {
            }
        } else {
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apedTogetherViewModel2 = (ApedTogetherViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
                if (Result.m7380exceptionOrNullimpl(objAEQbTJ) == null) {
                    objAEQbTJ = yDY.AhwBna();
                }
                apedTogetherViewModel2.AhwBna.clear();
                apedTogetherViewModel2.AhwBna.addAll((List) objAEQbTJ);
                value = apedTogetherViewModel2.AEQbTJ().getValue();
                if (value instanceof InterfaceC28618keF.ActionBar) {
                    MutableStateFlow<InterfaceC28618keF> mutableStateFlowKWHzl = apedTogetherViewModel2.KWHzl();
                    InterfaceC28618keF.ActionBar actionBar = (InterfaceC28618keF.ActionBar) value;
                    List<C28653keo> listEZpvd = ((InterfaceC28618keF.ActionBar) value).EZpvd();
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
                    for (C28653keo c28653keo : listEZpvd) {
                        TrackingAddressAlias trackingAddressAlias = (TrackingAddressAlias) apedTogetherViewModel2.EZpvd.get(c28653keo.AhwBna());
                        if (trackingAddressAlias == null || (strAYXKKw = trackingAddressAlias.getAddressAlias()) == null) {
                            strAYXKKw = c28653keo.AYXKKw();
                        }
                        arrayList.add(c28653keo.AEQbTJ((2043 & 1) != 0 ? c28653keo.KWHzl : null, (2043 & 2) != 0 ? c28653keo.DbNXlk : null, (2043 & 4) != 0 ? c28653keo.djBIcL : strAYXKKw, (2043 & 8) != 0 ? c28653keo.EZpvd : null, (2043 & 16) != 0 ? c28653keo.OLrzqt : null, (2043 & 32) != 0 ? c28653keo.valueOf : null, (2043 & 64) != 0 ? c28653keo.AYXKKw : null, (2043 & 128) != 0 ? c28653keo.AhwBna : null, (2043 & 256) != 0 ? c28653keo.gEmmrt : null, (2043 & 512) != 0 ? c28653keo.AEQbTJ : null, (2043 & 1024) != 0 ? c28653keo.copydefault : null));
                    }
                    mutableStateFlowKWHzl.setValue(actionBar.OLrzqt(arrayList));
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.KWHzl(thM7380exceptionOrNullimpl);
                }
                return Unit.INSTANCE;
            }
            Map map4 = (Map) this.L$8;
            TrackingAddressAlias trackingAddressAlias2 = (TrackingAddressAlias) this.L$7;
            Object obj2 = this.L$6;
            it = (Iterator) this.L$5;
            Map map5 = (Map) this.L$4;
            map = (Map) this.L$3;
            dexUserIdentity2 = (DexUserIdentity) this.L$2;
            str2 = (String) this.L$1;
            ApedTogetherViewModel apedTogetherViewModel3 = (ApedTogetherViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            Object objEZpvd = ((Result) obj).m7386unboximpl();
            Map map6 = map4;
            map2 = map5;
            TrackingAddressAlias trackingAddressAlias3 = trackingAddressAlias2;
            Boolean boolKWHzl = C56443yFo.KWHzl(false);
            if (Result.m7383isFailureimpl(objEZpvd)) {
                objEZpvd = boolKWHzl;
            }
            if (!((Boolean) objEZpvd).booleanValue()) {
                collectAddress = trackingAddressAlias3.getCollectAddress().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(collectAddress, "");
            } else {
                collectAddress = trackingAddressAlias3.getCollectAddress();
            }
            map6.put(collectAddress, obj2);
            apedTogetherViewModel = apedTogetherViewModel3;
            if (!it.hasNext()) {
                Object next = it.next();
                trackingAddressAlias3 = (TrackingAddressAlias) next;
                kKG kkg = apedTogetherViewModel.gEmmrt;
                this.L$0 = apedTogetherViewModel;
                this.L$1 = str2;
                this.L$2 = dexUserIdentity2;
                this.L$3 = map;
                this.L$4 = map2;
                this.L$5 = it;
                this.L$6 = next;
                this.L$7 = trackingAddressAlias3;
                this.L$8 = map2;
                this.label = 3;
                objEZpvd = kkg.EZpvd(str2, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                apedTogetherViewModel3 = apedTogetherViewModel;
                obj2 = next;
                map6 = map2;
                Boolean boolKWHzl2 = C56443yFo.KWHzl(false);
                if (Result.m7383isFailureimpl(objEZpvd)) {
                }
                if (!((Boolean) objEZpvd).booleanValue()) {
                }
                map6.put(collectAddress, obj2);
                apedTogetherViewModel = apedTogetherViewModel3;
                if (!it.hasNext()) {
                    map.putAll(map2);
                    jAO jao = apedTogetherViewModel.AYXKKw;
                    String strEZpvd = dexUserIdentity2.EZpvd();
                    this.L$0 = apedTogetherViewModel;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.label = 4;
                    objAEQbTJ = jao.AEQbTJ(strEZpvd, this);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    apedTogetherViewModel2 = apedTogetherViewModel;
                    if (Result.m7380exceptionOrNullimpl(objAEQbTJ) == null) {
                    }
                    apedTogetherViewModel2.AhwBna.clear();
                    apedTogetherViewModel2.AhwBna.addAll((List) objAEQbTJ);
                    value = apedTogetherViewModel2.AEQbTJ().getValue();
                    if (value instanceof InterfaceC28618keF.ActionBar) {
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
            }
        }
        apedTogetherViewModel = this.this$0;
        String str3 = this.$chainId;
        if (Result.m7384isSuccessimpl(objOLrzqt)) {
            Result.Application application2 = Result.Companion;
            dexUserIdentity = (DexUserIdentity) objOLrzqt;
            jAH jah = apedTogetherViewModel.AEQbTJ;
            String strEZpvd2 = dexUserIdentity.EZpvd();
            this.L$0 = apedTogetherViewModel;
            this.L$1 = str3;
            this.L$2 = dexUserIdentity;
            this.label = 2;
            Object objOLrzqt2 = jah.OLrzqt(strEZpvd2, this);
            if (objOLrzqt2 == objCopydefault) {
                return objCopydefault;
            }
            objM7386unboximpl = objOLrzqt2;
            str = str3;
            C56391yDq.AEQbTJ(objM7386unboximpl);
            List list2 = (List) objM7386unboximpl;
            apedTogetherViewModel.EZpvd.clear();
            Map map32 = apedTogetherViewModel.EZpvd;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list2, 10)), 16));
            it = list2.iterator();
            str2 = str;
            map = map32;
            dexUserIdentity2 = dexUserIdentity;
            map2 = linkedHashMap2;
            if (!it.hasNext()) {
            }
        } else {
            objM7377constructorimpl = Result.m7377constructorimpl(objOLrzqt);
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        }
    }
}
