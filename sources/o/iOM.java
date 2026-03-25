package o;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.invest_api.bean.DeFiApyDataInfoData;
import com.okinc.business.invest_biz.ui.page.dialog.InvestRecommendedInvestmentDialog;
import io.reactivex.BackpressureStrategy;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@yCR
public final class iOM extends AbstractC43215rlA implements InterfaceC25424iwU {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final MutableStateFlow<java.util.List<DeFiApyDataInfoData>> AEQbTJ = StateFlowKt.MutableStateFlow(yDY.AhwBna());
    public final java.util.Map<java.lang.String, DeFiApyDataInfoData> copydefault = new LinkedHashMap();
    public final MutableSharedFlow<Unit> KWHzl = SharedFlowKt.MutableSharedFlow(1, 0, BufferOverflow.DROP_OLDEST);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC25424iwU
    public SharedFlow<Unit> OLrzqt() {
        return this.KWHzl;
    }

    @yCM
    public iOM() {
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iOM.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.InterfaceC25424iwU
    public DeFiApyDataInfoData AEQbTJ(long j) {
        java.lang.Object next;
        java.util.Iterator<T> it = this.AEQbTJ.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            DeFiApyDataInfoData deFiApyDataInfoData = (DeFiApyDataInfoData) next;
            if (deFiApyDataInfoData.getCoinId() == j && deFiApyDataInfoData.getShowOnHomepage()) {
                break;
            }
        }
        return (DeFiApyDataInfoData) next;
    }

    @Override // o.InterfaceC25424iwU
    public DeFiApyDataInfoData EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.Long> list, @NotNull java.util.List<java.lang.Long> list2) {
        DeFiApyDataInfoData deFiApyDataInfoData;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        pUU.copydefault("zxf", "symbol:" + str + ", " + list + " " + list2);
        java.lang.Object next2 = null;
        if (this.copydefault.containsKey(str)) {
            DeFiApyDataInfoData deFiApyDataInfoData2 = this.copydefault.get(str);
            if (deFiApyDataInfoData2 == null) {
                return null;
            }
            if (list.contains(java.lang.Long.valueOf(deFiApyDataInfoData2.getCoinId())) || list2.contains(java.lang.Long.valueOf(deFiApyDataInfoData2.getCoinId()))) {
                return deFiApyDataInfoData2;
            }
        }
        java.util.Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(list);
        java.util.Set setOqFWZa2 = CollectionsKt___CollectionsKt.OqFWZa(list2);
        java.util.Set setKWHzl = yEJ.KWHzl(setOqFWZa, setOqFWZa2);
        java.util.List<DeFiApyDataInfoData> value = this.AEQbTJ.getValue();
        if (!(value instanceof java.util.Collection) || !value.isEmpty()) {
            for (DeFiApyDataInfoData deFiApyDataInfoData3 : value) {
                if (setKWHzl.contains(java.lang.Long.valueOf(deFiApyDataInfoData3.getCoinId())) && deFiApyDataInfoData3.getShowOnHomepage()) {
                    if (!setOqFWZa.isEmpty()) {
                        java.util.List<DeFiApyDataInfoData> value2 = this.AEQbTJ.getValue();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (java.lang.Object obj : value2) {
                            if (setOqFWZa.contains(java.lang.Long.valueOf(((DeFiApyDataInfoData) obj).getCoinId()))) {
                                arrayList.add(obj);
                            }
                        }
                        java.util.Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            next = it.next();
                            if (it.hasNext()) {
                                java.lang.String maxApy = ((DeFiApyDataInfoData) next).getMaxApy();
                                do {
                                    java.lang.Object next3 = it.next();
                                    java.lang.String maxApy2 = ((DeFiApyDataInfoData) next3).getMaxApy();
                                    if (maxApy.compareTo(maxApy2) < 0) {
                                        next = next3;
                                        maxApy = maxApy2;
                                    }
                                } while (it.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        deFiApyDataInfoData = (DeFiApyDataInfoData) next;
                    } else {
                        deFiApyDataInfoData = null;
                    }
                    if (deFiApyDataInfoData == null && (!setOqFWZa2.isEmpty())) {
                        java.util.List<DeFiApyDataInfoData> value3 = this.AEQbTJ.getValue();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (java.lang.Object obj2 : value3) {
                            if (setOqFWZa2.contains(java.lang.Long.valueOf(((DeFiApyDataInfoData) obj2).getCoinId()))) {
                                arrayList2.add(obj2);
                            }
                        }
                        java.util.Iterator it2 = arrayList2.iterator();
                        if (it2.hasNext()) {
                            next2 = it2.next();
                            if (it2.hasNext()) {
                                java.lang.String maxApy3 = ((DeFiApyDataInfoData) next2).getMaxApy();
                                do {
                                    java.lang.Object next4 = it2.next();
                                    java.lang.String maxApy4 = ((DeFiApyDataInfoData) next4).getMaxApy();
                                    if (maxApy3.compareTo(maxApy4) < 0) {
                                        next2 = next4;
                                        maxApy3 = maxApy4;
                                    }
                                } while (it2.hasNext());
                            }
                        }
                        deFiApyDataInfoData = (DeFiApyDataInfoData) next2;
                    }
                    this.copydefault.put(str, deFiApyDataInfoData);
                    return deFiApyDataInfoData;
                }
            }
        }
        this.copydefault.put(str, null);
        return null;
    }

    @Override // o.InterfaceC25424iwU
    public DeFiApyDataInfoData OLrzqt(@NotNull java.util.List<java.lang.Long> list) {
        java.lang.Object obj;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.List<DeFiApyDataInfoData> value = this.AEQbTJ.getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : value) {
            if (list.contains(java.lang.Long.valueOf(((DeFiApyDataInfoData) obj2).getCoinId()))) {
                arrayList.add(obj2);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            java.lang.Object next = it.next();
            if (it.hasNext()) {
                java.lang.String maxApy = ((DeFiApyDataInfoData) next).getMaxApy();
                do {
                    java.lang.Object next2 = it.next();
                    java.lang.String maxApy2 = ((DeFiApyDataInfoData) next2).getMaxApy();
                    if (maxApy.compareTo(maxApy2) < 0) {
                        next = next2;
                        maxApy = maxApy2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (DeFiApyDataInfoData) obj;
    }

    public static final class Activity<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(C33129mqd.EZpvd(((DeFiApyDataInfoData) t2).getMaxApy()), C33129mqd.EZpvd(((DeFiApyDataInfoData) t).getMaxApy()));
        }
    }

    @Override // o.InterfaceC25424iwU
    public AbstractC58185ywX<java.util.List<DeFiApyDataInfoData>> OLrzqt(@NotNull final java.util.List<java.lang.Long> list, @NotNull final java.util.List<java.lang.Long> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        AbstractC58185ywX abstractC58185ywXAEQbTJ = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.iOX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                iOM.OLrzqt(this.OLrzqt, list, list2, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).AEQbTJ(yDY.AhwBna());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return C33527myD.KWHzl(abstractC58185ywXAEQbTJ);
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(iOM iom, InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        iom.copydefault(yDY.AhwBna());
        interfaceC58184ywW.onError(th);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC25424iwU
    public java.lang.Object copydefault(@NotNull Continuation<? super Unit> continuation) {
        if (new C25535iyZ().AEQbTJ()) {
            C56443yFo.KWHzl(this.AEQbTJ.tryEmit(yDY.AhwBna()));
        } else {
            AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(C25592izd.getTokenApyData$default(C25592izd.OLrzqt, false, 1, null), (Function1) null, 1, (java.lang.Object) null);
            final Function1 function1 = new Function1() { // from class: o.iOP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return iOM.OLrzqt(this.KWHzl, (java.util.HashMap) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.iOO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    iOM.copydefault(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.iOQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return iOM.copydefault(this.KWHzl, (java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.iOT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    iOM.AYXKKw(function12, obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(iOM iom, java.lang.Throwable th) {
        iom.copydefault(yDY.AhwBna());
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC25424iwU
    public boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt = ((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).gEmmrt().OLrzqt(str);
        if (interfaceC9738bbJOLrzqt != null && interfaceC9738bbJOLrzqt.getFieldNames()) {
            return true;
        }
        if (interfaceC9738bbJOLrzqt != null && interfaceC9738bbJOLrzqt.AubY()) {
            return true;
        }
        if (interfaceC9738bbJOLrzqt == null || !interfaceC9738bbJOLrzqt.AwvSrB()) {
            return interfaceC9738bbJOLrzqt != null && interfaceC9738bbJOLrzqt.ORxRYg();
        }
        return true;
    }

    @Override // o.InterfaceC25424iwU
    public void AEQbTJ() {
        this.copydefault.clear();
    }

    public final void copydefault(@NotNull java.util.List<DeFiApyDataInfoData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault.clear();
        this.AEQbTJ.tryEmit(list);
        this.KWHzl.tryEmit(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC25424iwU
    public void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull android.content.Context context, @NotNull java.util.List<DeFiApyDataInfoData> list) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            DeFiApyDataInfoData deFiApyDataInfoData = (DeFiApyDataInfoData) obj;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) deFiApyDataInfoData.getMaxApy()) && C33129mqd.OLrzqt((java.lang.CharSequence) deFiApyDataInfoData.getMinApy())) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() == 1) {
            DeFiApyDataInfoData deFiApyDataInfoData2 = (DeFiApyDataInfoData) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList);
            LifecycleCoroutineScope lifecycleScope = ((context instanceof AbstractC32996moC) || (context instanceof AbstractActivityC33041mov)) ? LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) context) : null;
            if (lifecycleScope == null) {
                return;
            }
            iNI.KWHzl(context).QKVWgx().copydefault(context, fragmentManager, deFiApyDataInfoData2.getInvestmentId(), !deFiApyDataInfoData2.getMaxApy().contentEquals(deFiApyDataInfoData2.getMinApy()), lifecycleScope);
            return;
        }
        InvestRecommendedInvestmentDialog.Companion.EZpvd(new java.util.ArrayList<>(arrayList)).show(fragmentManager, "InvestRecommendedInvestmentDialog");
    }

    public static final Unit OLrzqt(iOM iom, InterfaceC58184ywW interfaceC58184ywW, java.util.List list, java.util.List list2, java.util.HashMap map) {
        if (map == null) {
            iom.copydefault(yDY.AhwBna());
            interfaceC58184ywW.onNext(yDY.AhwBna());
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) ((DeFiApyDataInfoData) entry.getValue()).getMaxApy()) && C33129mqd.OLrzqt((java.lang.CharSequence) ((DeFiApyDataInfoData) entry.getValue()).getMinApy())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                java.lang.String str = (java.lang.String) entry2.getKey();
                DeFiApyDataInfoData deFiApyDataInfoData = (DeFiApyDataInfoData) entry2.getValue();
                arrayList.add(deFiApyDataInfoData.copy((30 & 1) != 0 ? deFiApyDataInfoData.coinId : C33129mqd.valueOf(str), (30 & 2) != 0 ? deFiApyDataInfoData.minApy : null, (30 & 4) != 0 ? deFiApyDataInfoData.maxApy : null, (30 & 8) != 0 ? deFiApyDataInfoData.investmentId : 0L, (30 & 16) != 0 ? deFiApyDataInfoData.showOnHomepage : false));
            }
            iom.copydefault(arrayList);
            java.util.List arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (list.contains(java.lang.Long.valueOf(((DeFiApyDataInfoData) obj).getCoinId()))) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj2 : arrayList) {
                    if (list2.contains(java.lang.Long.valueOf(((DeFiApyDataInfoData) obj2).getCoinId()))) {
                        arrayList3.add(obj2);
                    }
                }
                arrayList2 = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) CollectionsKt___CollectionsKt.EZpvd(arrayList3, new Activity()), 7);
            }
            interfaceC58184ywW.onNext(arrayList2);
        }
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(final iOM iom, final java.util.List list, final java.util.List list2, final InterfaceC58184ywW interfaceC58184ywW) {
        java.lang.Object objAEQbTJ;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        try {
            Result.Application application = Result.Companion;
            if (new C25535iyZ().AEQbTJ()) {
                iom.AEQbTJ.tryEmit(yDY.AhwBna());
                interfaceC58184ywW.onNext(yDY.AhwBna());
                interfaceC58184ywW.onComplete();
                objAEQbTJ = Unit.INSTANCE;
            } else {
                AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(C25592izd.getTokenApyData$default(C25592izd.OLrzqt, false, 1, null), (Function1) null, 1, (java.lang.Object) null);
                final Function1 function1 = new Function1() { // from class: o.iOS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return iOM.OLrzqt(this.KWHzl, interfaceC58184ywW, list, list2, (java.util.HashMap) obj);
                    }
                };
                InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.iOR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        iOM.valueOf(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.iOV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return iOM.copydefault(this.EZpvd, interfaceC58184ywW, (java.lang.Throwable) obj);
                    }
                };
                objAEQbTJ = abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.iOU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        iOM.djBIcL(function12, obj);
                    }
                });
            }
            Result.m7377constructorimpl(objAEQbTJ);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public static final Unit OLrzqt(iOM iom, java.util.HashMap map) {
        if (map == null) {
            iom.copydefault(yDY.AhwBna());
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) ((DeFiApyDataInfoData) entry.getValue()).getMaxApy()) && C33129mqd.OLrzqt((java.lang.CharSequence) ((DeFiApyDataInfoData) entry.getValue()).getMinApy())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                java.lang.String str = (java.lang.String) entry2.getKey();
                DeFiApyDataInfoData deFiApyDataInfoData = (DeFiApyDataInfoData) entry2.getValue();
                arrayList.add(deFiApyDataInfoData.copy((30 & 1) != 0 ? deFiApyDataInfoData.coinId : C33129mqd.valueOf(str), (30 & 2) != 0 ? deFiApyDataInfoData.minApy : null, (30 & 4) != 0 ? deFiApyDataInfoData.maxApy : null, (30 & 8) != 0 ? deFiApyDataInfoData.investmentId : 0L, (30 & 16) != 0 ? deFiApyDataInfoData.showOnHomepage : false));
            }
            iom.copydefault(arrayList);
        }
        return Unit.INSTANCE;
    }
}
