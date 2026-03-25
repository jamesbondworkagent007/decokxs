package o;

import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.market.quotation.domain.options.GetAllOptionsVosUseCase$loadAllOptionsInstrumentVos$1;
import com.okinc.market.quotation.domain.options.GetAllOptionsVosUseCase$loadOptionsCategoryGroup$1;
import com.okinc.market.quotation.domain.options.GetAllOptionsVosUseCase$onExecute$$inlined$executeAsyncTasks$1;
import com.okinc.market.quotation.domain.options.GetAllOptionsVosUseCase$onExecute$1;
import com.okinc.market.quotation.ui.model.OptionsCategoryGroupVo;
import com.okinc.unify_trade.biz.OptionInstrument;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import o.InterfaceC54577xNn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qsu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41551qsu extends AbstractC49400uno<InterfaceC41647quk, java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>> {
    public final InterfaceC54577xNn KWHzl;
    public final C41555qsy OLrzqt;
    public final CoroutineDispatcher copydefault;
    private static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @yCM
    public C41551qsu(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC54577xNn interfaceC54577xNn, @NotNull C41555qsy c41555qsy) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41555qsy, "");
        this.copydefault = coroutineDispatcher;
        this.KWHzl = interfaceC54577xNn;
        this.OLrzqt = c41555qsy;
    }

    /* JADX INFO: renamed from: o.qsu$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qsu.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull InterfaceC41647quk interfaceC41647quk, @NotNull Continuation<? super java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>> continuation) throws java.lang.Throwable {
        GetAllOptionsVosUseCase$onExecute$1 getAllOptionsVosUseCase$onExecute$1;
        InterfaceC41647quk interfaceC41647quk2;
        C41551qsu c41551qsu;
        java.lang.Object objM8790ensureInitialize0E7RQCE$default;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        if (continuation instanceof GetAllOptionsVosUseCase$onExecute$1) {
            getAllOptionsVosUseCase$onExecute$1 = (GetAllOptionsVosUseCase$onExecute$1) continuation;
            int i = getAllOptionsVosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAllOptionsVosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getAllOptionsVosUseCase$onExecute$1 = new GetAllOptionsVosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objCoroutineScope = getAllOptionsVosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getAllOptionsVosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCoroutineScope);
            C41434qqj.KWHzl.KWHzl("GetAllOptionsVosUseCase", "get all options vos");
            InterfaceC54577xNn interfaceC54577xNn2 = this.KWHzl;
            if (interfaceC54577xNn2 != null) {
                getAllOptionsVosUseCase$onExecute$1.L$0 = this;
                interfaceC41647quk2 = interfaceC41647quk;
                getAllOptionsVosUseCase$onExecute$1.L$1 = interfaceC41647quk2;
                getAllOptionsVosUseCase$onExecute$1.label = 1;
                objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNn2, false, null, getAllOptionsVosUseCase$onExecute$1, 3, null);
                if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
                c41551qsu = this;
            } else {
                interfaceC41647quk2 = interfaceC41647quk;
                c41551qsu = this;
                InterfaceC41647quk interfaceC41647quk3 = interfaceC41647quk2;
                interfaceC54577xNn = c41551qsu.KWHzl;
                if (interfaceC54577xNn != null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
                    throw new java.lang.RuntimeException("GetAllOptionsVosUseCase error, tradeCore is null");
                }
                interfaceC54581xNrOLrzqt.AxsJAY();
                GetAllOptionsVosUseCase$onExecute$$inlined$executeAsyncTasks$1 getAllOptionsVosUseCase$onExecute$$inlined$executeAsyncTasks$1 = new GetAllOptionsVosUseCase$onExecute$$inlined$executeAsyncTasks$1(null, c41551qsu, interfaceC41647quk3, c41551qsu, interfaceC54581xNrOLrzqt);
                getAllOptionsVosUseCase$onExecute$1.L$0 = null;
                getAllOptionsVosUseCase$onExecute$1.L$1 = null;
                getAllOptionsVosUseCase$onExecute$1.label = 2;
                objCoroutineScope = CoroutineScopeKt.coroutineScope(getAllOptionsVosUseCase$onExecute$$inlined$executeAsyncTasks$1, getAllOptionsVosUseCase$onExecute$1);
                if (objCoroutineScope == objCopydefault) {
                    return objCopydefault;
                }
                kotlin.Pair pair = (kotlin.Pair) objCoroutineScope;
                java.util.Map map = (java.util.Map) pair.component1();
                java.util.List<OptionsCategoryGroupVo> list = (java.util.List) pair.component2();
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                while (r1.hasNext()) {
                }
                kotlin.Pair[] pairArr = (kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0]);
                LinkedHashMap linkedHashMapAhwBna = C56424yEw.AhwBna((kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length));
                C41434qqj.KWHzl.KWHzl("GetAllOptionsVosUseCase", "get all options vos result, size=" + linkedHashMapAhwBna.size());
                return linkedHashMapAhwBna;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCoroutineScope);
                kotlin.Pair pair2 = (kotlin.Pair) objCoroutineScope;
                java.util.Map map2 = (java.util.Map) pair2.component1();
                java.util.List<OptionsCategoryGroupVo> list2 = (java.util.List) pair2.component2();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
                for (OptionsCategoryGroupVo optionsCategoryGroupVo : list2) {
                    java.util.Map mapKWHzl = (java.util.Map) map2.get(optionsCategoryGroupVo.AEQbTJ());
                    if (mapKWHzl == null) {
                        mapKWHzl = C56424yEw.KWHzl();
                    }
                    arrayList2.add(C56390yDp.OLrzqt(optionsCategoryGroupVo, mapKWHzl));
                }
                kotlin.Pair[] pairArr2 = (kotlin.Pair[]) arrayList2.toArray(new kotlin.Pair[0]);
                LinkedHashMap linkedHashMapAhwBna2 = C56424yEw.AhwBna((kotlin.Pair[]) java.util.Arrays.copyOf(pairArr2, pairArr2.length));
                C41434qqj.KWHzl.KWHzl("GetAllOptionsVosUseCase", "get all options vos result, size=" + linkedHashMapAhwBna2.size());
                return linkedHashMapAhwBna2;
            }
            InterfaceC41647quk interfaceC41647quk4 = (InterfaceC41647quk) getAllOptionsVosUseCase$onExecute$1.L$1;
            c41551qsu = (C41551qsu) getAllOptionsVosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objCoroutineScope);
            objM8790ensureInitialize0E7RQCE$default = ((Result) objCoroutineScope).m7386unboximpl();
            interfaceC41647quk2 = interfaceC41647quk4;
        }
        Result.m7376boximpl(objM8790ensureInitialize0E7RQCE$default);
        InterfaceC41647quk interfaceC41647quk32 = interfaceC41647quk2;
        interfaceC54577xNn = c41551qsu.KWHzl;
        if (interfaceC54577xNn != null) {
        }
        throw new java.lang.RuntimeException("GetAllOptionsVosUseCase error, tradeCore is null");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(final InterfaceC41647quk interfaceC41647quk, Continuation<? super java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>> continuation) throws java.lang.Throwable {
        GetAllOptionsVosUseCase$loadAllOptionsInstrumentVos$1 getAllOptionsVosUseCase$loadAllOptionsInstrumentVos$1;
        if (continuation instanceof GetAllOptionsVosUseCase$loadAllOptionsInstrumentVos$1) {
            getAllOptionsVosUseCase$loadAllOptionsInstrumentVos$1 = (GetAllOptionsVosUseCase$loadAllOptionsInstrumentVos$1) continuation;
            int i = getAllOptionsVosUseCase$loadAllOptionsInstrumentVos$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAllOptionsVosUseCase$loadAllOptionsInstrumentVos$1.label = i - Integer.MIN_VALUE;
            } else {
                getAllOptionsVosUseCase$loadAllOptionsInstrumentVos$1 = new GetAllOptionsVosUseCase$loadAllOptionsInstrumentVos$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = getAllOptionsVosUseCase$loadAllOptionsInstrumentVos$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getAllOptionsVosUseCase$loadAllOptionsInstrumentVos$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            C41555qsy c41555qsy = this.OLrzqt;
            Unit unit = Unit.INSTANCE;
            getAllOptionsVosUseCase$loadAllOptionsInstrumentVos$1.L$0 = interfaceC41647quk;
            getAllOptionsVosUseCase$loadAllOptionsInstrumentVos$1.label = 1;
            objOLrzqt = c41555qsy.OLrzqt((java.lang.Object) unit, (Continuation) getAllOptionsVosUseCase$loadAllOptionsInstrumentVos$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC41647quk = (InterfaceC41647quk) getAllOptionsVosUseCase$loadAllOptionsInstrumentVos$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        java.util.List list = (java.util.List) objOLrzqt;
        if (list == null) {
            throw new java.lang.RuntimeException("GetAllOptionsVosUseCase error, rawOptionsInstrumentList is null");
        }
        java.util.List listEZpvd = C41389qpr.EZpvd(list, new Function1() { // from class: o.qss
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41551qsu.EZpvd(interfaceC41647quk, (OptionInstrument) obj);
            }
        });
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : listEZpvd) {
            java.lang.String instFly = ((InterfaceC41642quf) obj).OLrzqt().getInstFly();
            java.lang.Object arrayList = linkedHashMap.get(instFly);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(instFly, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56423yEv.copydefault(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.Object key = entry.getKey();
            java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (java.lang.Object obj2 : iterable) {
                java.lang.String expTime = ((InterfaceC41642quf) obj2).OLrzqt().getExpTime();
                java.lang.Object arrayList2 = linkedHashMap3.get(expTime);
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList();
                    linkedHashMap3.put(expTime, arrayList2);
                }
                ((java.util.List) arrayList2).add(obj2);
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(C56423yEv.copydefault(linkedHashMap3.size()));
            for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                linkedHashMap4.put(C56443yFo.KWHzl(C33129mqd.valueOf(entry2.getKey())), entry2.getValue());
            }
            SortedMap sortedMapGEmmrt = C56423yEv.gEmmrt(linkedHashMap4);
            LinkedHashMap linkedHashMap5 = new LinkedHashMap(C56423yEv.copydefault(sortedMapGEmmrt.size()));
            for (Map.Entry entry3 : sortedMapGEmmrt.entrySet()) {
                java.lang.Object key2 = entry3.getKey();
                Intrinsics.checkNotNullExpressionValue(key2, "");
                linkedHashMap5.put(pTA.formatDate$default(new Date(((java.lang.Number) key2).longValue()), OKDateEnum.DATE_FORMAT_SIMPLE, null, null, 6, null), entry3.getValue());
            }
            linkedHashMap2.put(key, linkedHashMap5);
        }
        return linkedHashMap2;
    }

    public static final InterfaceC41642quf EZpvd(InterfaceC41647quk interfaceC41647quk, OptionInstrument optionInstrument) {
        Intrinsics.checkNotNullParameter(optionInstrument, "");
        return interfaceC41647quk.OLrzqt(optionInstrument);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(InterfaceC54581xNr interfaceC54581xNr, Continuation<? super java.util.List<OptionsCategoryGroupVo>> continuation) throws java.lang.Throwable {
        GetAllOptionsVosUseCase$loadOptionsCategoryGroup$1 getAllOptionsVosUseCase$loadOptionsCategoryGroup$1;
        if (continuation instanceof GetAllOptionsVosUseCase$loadOptionsCategoryGroup$1) {
            getAllOptionsVosUseCase$loadOptionsCategoryGroup$1 = (GetAllOptionsVosUseCase$loadOptionsCategoryGroup$1) continuation;
            int i = getAllOptionsVosUseCase$loadOptionsCategoryGroup$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAllOptionsVosUseCase$loadOptionsCategoryGroup$1.label = i - Integer.MIN_VALUE;
            } else {
                getAllOptionsVosUseCase$loadOptionsCategoryGroup$1 = new GetAllOptionsVosUseCase$loadOptionsCategoryGroup$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getAllOptionsVosUseCase$loadOptionsCategoryGroup$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getAllOptionsVosUseCase$loadOptionsCategoryGroup$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            getAllOptionsVosUseCase$loadOptionsCategoryGroup$1.label = 1;
            objEZpvd = interfaceC54581xNr.EZpvd("OPTION", getAllOptionsVosUseCase$loadOptionsCategoryGroup$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        xLJ xlj = objEZpvd instanceof xLJ ? (xLJ) objEZpvd : null;
        if (xlj == null) {
            throw new java.lang.RuntimeException("GetAllOptionsVosUseCase error, optionsBiz is null");
        }
        java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> listZsXlph = xlj.zsXlph();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listZsXlph, 10));
        java.util.Iterator<T> it = listZsXlph.iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) ((kotlin.Pair) it.next()).getFirst());
        }
        java.util.List<java.lang.String> listOLrzqt = C41428qqd.OLrzqt.OLrzqt(arrayList);
        java.util.ArrayList<kotlin.Pair> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : listZsXlph) {
            if (listOLrzqt.contains(((kotlin.Pair) obj).getFirst())) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
        for (kotlin.Pair pair : arrayList2) {
            arrayList3.add(new OptionsCategoryGroupVo((java.lang.String) pair.getFirst(), (java.lang.String) pair.getSecond()));
        }
        return arrayList3;
    }
}
