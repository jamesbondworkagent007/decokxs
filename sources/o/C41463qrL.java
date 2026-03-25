package o;

import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.FuturesTypeEnum;
import com.okinc.market.quotation.ui.model.FuturesUnitVo;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qrL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41463qrL extends AbstractC49400uno<Quartet<? extends CategoryGroupVo, ? extends FuturesTypeEnum, ? extends FuturesUnitVo, ? extends C41467qrP>, java.util.List<? extends InterfaceC41638qub>> {
    private static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final InterfaceC54577xNn AEQbTJ;
    public final CoroutineDispatcher KWHzl;

    /* JADX INFO: renamed from: o.qrL$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[FuturesTypeEnum.values().length];
            try {
                iArr[FuturesTypeEnum.ALL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[FuturesTypeEnum.PERPETUAL_AND_EXPIRY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[FuturesTypeEnum.PERPETUAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[FuturesTypeEnum.EXPIRY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((Quartet<CategoryGroupVo, ? extends FuturesTypeEnum, FuturesUnitVo, C41467qrP>) obj, (Continuation<? super java.util.List<? extends InterfaceC41638qub>>) continuation);
    }

    @yCM
    public C41463qrL(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC54577xNn interfaceC54577xNn) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = coroutineDispatcher;
        this.AEQbTJ = interfaceC54577xNn;
    }

    /* JADX INFO: renamed from: o.qrL$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qrL.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.Object KWHzl(@NotNull Quartet<CategoryGroupVo, ? extends FuturesTypeEnum, FuturesUnitVo, C41467qrP> quartet, @NotNull Continuation<? super java.util.List<? extends InterfaceC41638qub>> continuation) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.util.HashMap<java.lang.String, TradeCoinInfo> mapDjBIcL;
        java.util.List listDjBIcL;
        InterfaceC54577xNn interfaceC54577xNn = this.AEQbTJ;
        if (interfaceC54577xNn == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (mapDjBIcL = interfaceC54581xNrOLrzqt.djBIcL()) == null) {
            return null;
        }
        CategoryGroupVo categoryGroupVoComponent1 = quartet.component1();
        FuturesTypeEnum futuresTypeEnumComponent2 = quartet.component2();
        FuturesUnitVo futuresUnitVoComponent3 = quartet.component3();
        C41467qrP c41467qrPComponent4 = quartet.component4();
        C41434qqj.KWHzl.KWHzl("FilterFuturesVosUseCase", "filter futures vos, category=" + categoryGroupVoComponent1.AhwBna() + ", type=" + futuresTypeEnumComponent2 + ", unit=" + (futuresUnitVoComponent3 != null ? futuresUnitVoComponent3.KWHzl() : null));
        java.util.List<InterfaceC41638qub> listCopydefault = c41467qrPComponent4.copydefault();
        java.util.List<InterfaceC41638qub> listAEQbTJ = c41467qrPComponent4.AEQbTJ();
        java.util.List<InterfaceC41638qub> listKWHzl = c41467qrPComponent4.KWHzl();
        CategoryGroupVo.TaskDescription taskDescription = CategoryGroupVo.Companion;
        boolean z = Intrinsics.EZpvd(categoryGroupVoComponent1, taskDescription.copydefault()) || Intrinsics.EZpvd(categoryGroupVoComponent1, taskDescription.OLrzqt());
        int i = TaskDescription.copydefault[futuresTypeEnumComponent2.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (listCopydefault == null) {
                    listCopydefault = yDY.AhwBna();
                }
                if (listAEQbTJ == null) {
                    listAEQbTJ = yDY.AhwBna();
                }
                listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listCopydefault, (java.lang.Iterable) listAEQbTJ);
            } else if (i == 3) {
                if (listKWHzl == null) {
                    listKWHzl = yDY.AhwBna();
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : listKWHzl) {
                    if (Intrinsics.EZpvd((java.lang.Object) ((InterfaceC41638qub) obj).values().getInstType(), (java.lang.Object) "SWAP")) {
                        arrayList.add(obj);
                    }
                }
                if (z) {
                    if (listCopydefault == null) {
                        listCopydefault = yDY.AhwBna();
                    }
                    listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listCopydefault, (java.lang.Iterable) arrayList);
                } else {
                    if (listCopydefault == null) {
                        listCopydefault = yDY.AhwBna();
                    }
                    listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) arrayList, (java.lang.Iterable) listCopydefault);
                }
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (listKWHzl == null) {
                    listKWHzl = yDY.AhwBna();
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : listKWHzl) {
                    if (Intrinsics.EZpvd((java.lang.Object) ((InterfaceC41638qub) obj2).values().getInstType(), (java.lang.Object) "FUTURES")) {
                        arrayList2.add(obj2);
                    }
                }
                if (z) {
                    if (listAEQbTJ == null) {
                        listAEQbTJ = yDY.AhwBna();
                    }
                    listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listAEQbTJ, (java.lang.Iterable) arrayList2);
                } else {
                    if (listAEQbTJ == null) {
                        listAEQbTJ = yDY.AhwBna();
                    }
                    listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) arrayList2, (java.lang.Iterable) listAEQbTJ);
                }
            }
        } else if (z) {
            if (listCopydefault == null) {
                listCopydefault = yDY.AhwBna();
            }
            if (listAEQbTJ == null) {
                listAEQbTJ = yDY.AhwBna();
            }
            java.util.List listDjBIcL2 = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listCopydefault, (java.lang.Iterable) listAEQbTJ);
            if (listKWHzl == null) {
                listKWHzl = yDY.AhwBna();
            }
            listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listDjBIcL2, (java.lang.Iterable) listKWHzl);
        } else {
            if (listKWHzl == null) {
                listKWHzl = yDY.AhwBna();
            }
            if (listCopydefault == null) {
                listCopydefault = yDY.AhwBna();
            }
            java.util.List listDjBIcL3 = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listKWHzl, (java.lang.Iterable) listCopydefault);
            if (listAEQbTJ == null) {
                listAEQbTJ = yDY.AhwBna();
            }
            listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listDjBIcL3, (java.lang.Iterable) listAEQbTJ);
        }
        if (listDjBIcL == null) {
            return null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj3 : listDjBIcL) {
            InterfaceC41638qub interfaceC41638qub = (InterfaceC41638qub) obj3;
            if (copydefault(interfaceC41638qub, mapDjBIcL, categoryGroupVoComponent1) && AEQbTJ(interfaceC41638qub, futuresUnitVoComponent3)) {
                arrayList3.add(obj3);
            }
        }
        java.util.List<InterfaceC41638qub> listEZpvd = EZpvd(arrayList3, futuresUnitVoComponent3);
        C41434qqj.KWHzl.KWHzl("FilterFuturesVosUseCase", "filter futures vos result: " + listEZpvd.size() + " items");
        return listEZpvd;
    }

    public final boolean AEQbTJ(InterfaceC41638qub interfaceC41638qub, FuturesUnitVo futuresUnitVo) {
        if (futuresUnitVo == null) {
            return true;
        }
        return Intrinsics.EZpvd((java.lang.Object) interfaceC41638qub.copydefault(), (java.lang.Object) futuresUnitVo.EZpvd());
    }

    public final boolean copydefault(InterfaceC41638qub interfaceC41638qub, java.util.Map<java.lang.String, TradeCoinInfo> map, CategoryGroupVo categoryGroupVo) {
        java.util.ArrayList<java.lang.String> groups;
        if (CategoryGroupVo.Companion.EZpvd(categoryGroupVo)) {
            return true;
        }
        TradeCoinInfo tradeCoinInfo = map.get(interfaceC41638qub.ejfBZ());
        return C41388qpq.KWHzl((tradeCoinInfo == null || (groups = tradeCoinInfo.getGroups()) == null) ? null : java.lang.Boolean.valueOf(CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) groups), categoryGroupVo.gEmmrt().getId())));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends o.qub> */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.List<InterfaceC41638qub> EZpvd(java.util.List<? extends InterfaceC41638qub> list, FuturesUnitVo futuresUnitVo) {
        if (!Intrinsics.EZpvd((java.lang.Object) (futuresUnitVo != null ? futuresUnitVo.EZpvd() : null), (java.lang.Object) "USD") || !C41388qpq.KWHzl(java.lang.Boolean.valueOf(futuresUnitVo.OLrzqt()))) {
            return list;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : list) {
            java.lang.String strEjfBZ = ((InterfaceC41638qub) obj).ejfBZ();
            java.lang.Object arrayList = linkedHashMap.get(strEjfBZ);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(strEjfBZ, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        java.util.Set setEntrySet = linkedHashMap.entrySet();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            arrayList2.addAll((java.util.Collection) ((Map.Entry) it.next()).getValue());
        }
        return arrayList2;
    }
}
