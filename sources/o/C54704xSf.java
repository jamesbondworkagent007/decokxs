package o;

import androidx.camera.video.AudioStats;
import com.okinc.core.util.SPUtils;
import com.okinc.oksearch.analytics.FuzzySearchEventSourceEnum;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.biz.OptionInstrument;
import com.okinc.unify_trade.trade.source.search.TradeSearchGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xSf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54704xSf {
    public static final C54704xSf OLrzqt = new C54704xSf();
    public static final Function1<java.lang.Integer, java.lang.Integer> EZpvd = new Function1() { // from class: o.xSl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return java.lang.Integer.valueOf(C54704xSf.KWHzl(((java.lang.Integer) obj).intValue()));
        }
    };
    public static final Function1<java.lang.String, java.lang.Integer> KWHzl = new Function1() { // from class: o.xSj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return java.lang.Integer.valueOf(C54704xSf.AEQbTJ((java.lang.String) obj));
        }
    };
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.xSm
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Double.valueOf(C54704xSf.EZpvd());
        }
    });
    public static final int AEQbTJ = 8;

    public static final int AEQbTJ(int i) {
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean EZpvd(BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        return true;
    }

    public static final int OLrzqt() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean OLrzqt(BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        return true;
    }

    public final boolean AYXKKw(int i) {
        return (i & 2048) > 0;
    }

    public final boolean AhwBna(int i) {
        return (i & 8192) > 0;
    }

    public final int AkhnZx(int i) {
        return i + 2048;
    }

    public final int DbNXlk(int i) {
        return i + 256;
    }

    public final boolean OLrzqt(int i) {
        return (i & 16384) > 0;
    }

    public final boolean djBIcL(int i) {
        return (i & 4096) > 0;
    }

    public final int fARcdN(int i) {
        return i + 16384;
    }

    public final int fJNWhG(int i) {
        return i + 512;
    }

    public final int fetchVPNInfo(int i) {
        return i + 1024;
    }

    public final boolean gEmmrt(int i) {
        return (i & 512) > 0;
    }

    public final boolean isConnected(int i) {
        return (i & 1024) > 0;
    }

    public final boolean valueOf(int i) {
        return (i & 256) > 0;
    }

    public final int values(int i) {
        return i + 8192;
    }

    /* JADX INFO: renamed from: o.xSf$Application */
    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Integer.valueOf(Intrinsics.EZpvd((java.lang.Object) ((C54713xSo) t).copydefault().getInstType(), (java.lang.Object) "FUTURES") ? 1 : 0), java.lang.Integer.valueOf(Intrinsics.EZpvd((java.lang.Object) ((C54713xSo) t2).copydefault().getInstType(), (java.lang.Object) "FUTURES") ? 1 : 0));
        }
    }

    /* JADX INFO: renamed from: o.xSf$Activity */
    public static final class Activity<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Float.valueOf(((C54713xSo) t2).AEQbTJ()), java.lang.Float.valueOf(((C54713xSo) t).AEQbTJ()));
        }
    }

    private C54704xSf() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.xSf */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.util.ArrayList matchingV2$default(C54704xSf c54704xSf, java.util.List list, java.lang.String str, Function1 function1, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: o.xSh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(C54704xSf.EZpvd((BizInstrument) obj2));
                }
            };
        }
        return c54704xSf.OLrzqt(list, str, function1, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }

    public final java.util.ArrayList<TradeSearchGroup> OLrzqt(@NotNull java.util.List<? extends BizInstrument> list, @NotNull java.lang.String str, @NotNull Function1<? super BizInstrument, java.lang.Boolean> function1, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        pUU.EZpvd("BaseTradeSearchLoader", "matchingV2() called with:key = " + str + ", filter = " + function1 + ", fuzzySearch = " + z);
        java.util.ArrayList<C54716xSr> arrayListAEQbTJ = AEQbTJ(list, str, function1, z, z2);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListAEQbTJ, 10));
        for (C54716xSr c54716xSr : arrayListAEQbTJ) {
            java.lang.String strEZpvd = c54716xSr.EZpvd();
            java.util.List<C54713xSo> listAEQbTJ = c54716xSr.AEQbTJ();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            java.util.Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C54713xSo) it.next()).copydefault());
            }
            arrayList.add(new TradeSearchGroup(strEZpvd, new java.util.ArrayList(arrayList2)));
        }
        return new java.util.ArrayList<>(arrayList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.xSf */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.util.ArrayList matchingV3$default(C54704xSf c54704xSf, java.util.List list, java.lang.String str, Function1 function1, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: o.xSg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(C54704xSf.OLrzqt((BizInstrument) obj2));
                }
            };
        }
        return c54704xSf.AEQbTJ(list, str, function1, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:158:0x04af */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:163:0x047e */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Iterable] */
    public final java.util.ArrayList<C54716xSr> AEQbTJ(@NotNull java.util.List<? extends BizInstrument> list, @NotNull java.lang.String str, @NotNull Function1<? super BizInstrument, java.lang.Boolean> function1, final boolean z, final boolean z2) {
        ?? arrayList;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        pUU.EZpvd("BaseTradeSearchLoader", "matchingV3() called with:key = " + str + ", filter = " + function1 + ", fuzzySearch = " + z);
        java.util.Locale locale = java.util.Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        final java.lang.String lowerCase = C59449zhJ.replace$default(C59449zhJ.replace$default(C59449zhJ.replace$default(upperCase, "-", "", false, 4, (java.lang.Object) null), "/", "", false, 4, (java.lang.Object) null), " ", "", false, 4, (java.lang.Object) null).toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        final java.lang.String strKWHzl = KWHzl(lowerCase);
        if (lowerCase.length() == 0 && !z2) {
            return new java.util.ArrayList<>();
        }
        final java.util.HashMap map = new java.util.HashMap();
        final java.util.HashMap map2 = new java.util.HashMap();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        java.util.List<BizInstrument> listZuBGHE = C59467zhb.zuBGHE(C59467zhb.DbNXlk(C59467zhb.DbNXlk(CollectionsKt___CollectionsKt.QVAiDq(list), function1), new Function1() { // from class: o.xSi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C54704xSf.OLrzqt(strKWHzl, lowerCase, z, map2, booleanRef, z2, map, (BizInstrument) obj));
            }
        }));
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listZuBGHE, 10));
        for (BizInstrument bizInstrument : listZuBGHE) {
            arrayList2.add(new C54713xSo(bizInstrument, ((java.lang.Integer) map2.get(bizInstrument)) != null ? r7.intValue() : 0.0f));
        }
        Sequence sequenceQVAiDq = CollectionsKt___CollectionsKt.QVAiDq(arrayList2);
        if (!booleanRef.element) {
            sequenceQVAiDq = C59467zhb.DbNXlk(sequenceQVAiDq, new Function1() { // from class: o.xSk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(C54704xSf.EZpvd(map, (C54713xSo) obj));
                }
            });
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Iterator it = sequenceQVAiDq.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            C54713xSo c54713xSo = (C54713xSo) next;
            java.lang.String instType = Intrinsics.EZpvd((java.lang.Object) c54713xSo.copydefault().getInstType(), (java.lang.Object) "FUTURES") ? "SWAP" : c54713xSo.copydefault().getInstType();
            java.lang.Object arrayList3 = linkedHashMap.get(instType);
            if (arrayList3 == null) {
                arrayList3 = new java.util.ArrayList();
                linkedHashMap.put(instType, arrayList3);
            }
            ((java.util.List) arrayList3).add(next);
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList((java.util.Collection) entry.getValue());
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (java.lang.Object obj : arrayList5) {
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(EZpvd.invoke(java.lang.Integer.valueOf(matchingV3$tagInfo$default(((C54713xSo) obj).copydefault(), map, null, 2, null))).intValue());
                java.lang.Object arrayList6 = linkedHashMap2.get(numValueOf);
                if (arrayList6 == null) {
                    arrayList6 = new java.util.ArrayList();
                    linkedHashMap2.put(numValueOf, arrayList6);
                }
                ((java.util.List) arrayList6).add(obj);
            }
            SortedMap sortedMapGEmmrt = C56423yEv.gEmmrt(linkedHashMap2);
            java.util.ArrayList arrayList7 = new java.util.ArrayList(sortedMapGEmmrt.size());
            for (Map.Entry entry2 : sortedMapGEmmrt.entrySet()) {
                java.lang.Integer num = (java.lang.Integer) entry2.getKey();
                if (num == null || num.intValue() != 0) {
                    if (num == null || num.intValue() != 1) {
                        if (num == null || num.intValue() != 2) {
                            if (num == null || num.intValue() != 3) {
                                if (num == null || num.intValue() != 5) {
                                    if (num == null || num.intValue() != 4) {
                                        arrayList = (num != null && num.intValue() == 6) ? (java.util.List) entry2.getValue() : new java.util.ArrayList();
                                    } else {
                                        java.lang.Object value = entry2.getValue();
                                        Intrinsics.checkNotNullExpressionValue(value, "");
                                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                        for (java.lang.Object obj2 : (java.lang.Iterable) value) {
                                            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(KWHzl.invoke(((C54713xSo) obj2).copydefault().getQuoteSymbol()).intValue());
                                            java.lang.Object arrayList8 = linkedHashMap3.get(numValueOf2);
                                            if (arrayList8 == null) {
                                                arrayList8 = new java.util.ArrayList();
                                                linkedHashMap3.put(numValueOf2, arrayList8);
                                            }
                                            ((java.util.List) arrayList8).add(obj2);
                                        }
                                        java.util.Set setEntrySet = C56423yEv.gEmmrt(linkedHashMap3).entrySet();
                                        arrayList = new java.util.ArrayList();
                                        java.util.Iterator it2 = setEntrySet.iterator();
                                        while (it2.hasNext()) {
                                            arrayList.addAll((java.util.Collection) ((Map.Entry) it2.next()).getValue());
                                        }
                                    }
                                } else {
                                    java.lang.Object value2 = entry2.getValue();
                                    Intrinsics.checkNotNullExpressionValue(value2, "");
                                    java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd((java.lang.Iterable) value2, new Activity());
                                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                    for (java.lang.Object obj3 : listEZpvd) {
                                        java.lang.String tradeSymbol = ((C54713xSo) obj3).copydefault().getTradeSymbol();
                                        java.lang.Object arrayList9 = linkedHashMap4.get(tradeSymbol);
                                        if (arrayList9 == null) {
                                            arrayList9 = new java.util.ArrayList();
                                            linkedHashMap4.put(tradeSymbol, arrayList9);
                                        }
                                        ((java.util.List) arrayList9).add(obj3);
                                    }
                                    java.util.Set setEntrySet2 = linkedHashMap4.entrySet();
                                    arrayList = new java.util.ArrayList();
                                    java.util.Iterator it3 = setEntrySet2.iterator();
                                    while (it3.hasNext()) {
                                        arrayList.addAll((java.util.Collection) ((Map.Entry) it3.next()).getValue());
                                    }
                                }
                            } else {
                                java.lang.Object value3 = entry2.getValue();
                                Intrinsics.checkNotNullExpressionValue(value3, "");
                                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                                for (java.lang.Object obj4 : (java.lang.Iterable) value3) {
                                    java.lang.String tradeSymbol2 = ((C54713xSo) obj4).copydefault().getTradeSymbol();
                                    java.lang.Object arrayList10 = linkedHashMap5.get(tradeSymbol2);
                                    if (arrayList10 == null) {
                                        arrayList10 = new java.util.ArrayList();
                                        linkedHashMap5.put(tradeSymbol2, arrayList10);
                                    }
                                    ((java.util.List) arrayList10).add(obj4);
                                }
                                java.util.Set setEntrySet3 = linkedHashMap5.entrySet();
                                arrayList = new java.util.ArrayList();
                                java.util.Iterator it4 = setEntrySet3.iterator();
                                while (it4.hasNext()) {
                                    arrayList.addAll((java.util.Collection) ((Map.Entry) it4.next()).getValue());
                                }
                            }
                        } else {
                            java.lang.Object value4 = entry2.getValue();
                            Intrinsics.checkNotNullExpressionValue(value4, "");
                            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                            for (java.lang.Object obj5 : (java.lang.Iterable) value4) {
                                java.lang.String tradeSymbol3 = ((C54713xSo) obj5).copydefault().getTradeSymbol();
                                java.lang.Object arrayList11 = linkedHashMap6.get(tradeSymbol3);
                                if (arrayList11 == null) {
                                    arrayList11 = new java.util.ArrayList();
                                    linkedHashMap6.put(tradeSymbol3, arrayList11);
                                }
                                ((java.util.List) arrayList11).add(obj5);
                            }
                            java.util.Set setEntrySet4 = linkedHashMap6.entrySet();
                            arrayList = new java.util.ArrayList();
                            java.util.Iterator it5 = setEntrySet4.iterator();
                            while (it5.hasNext()) {
                                arrayList.addAll((java.util.Collection) ((Map.Entry) it5.next()).getValue());
                            }
                        }
                    } else {
                        java.lang.Object value5 = entry2.getValue();
                        Intrinsics.checkNotNullExpressionValue(value5, "");
                        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                        for (java.lang.Object obj6 : (java.lang.Iterable) value5) {
                            java.lang.String tradeSymbol4 = ((C54713xSo) obj6).copydefault().getTradeSymbol();
                            java.lang.Object arrayList12 = linkedHashMap7.get(tradeSymbol4);
                            if (arrayList12 == null) {
                                arrayList12 = new java.util.ArrayList();
                                linkedHashMap7.put(tradeSymbol4, arrayList12);
                            }
                            ((java.util.List) arrayList12).add(obj6);
                        }
                        java.util.Set setEntrySet5 = linkedHashMap7.entrySet();
                        arrayList = new java.util.ArrayList();
                        java.util.Iterator it6 = setEntrySet5.iterator();
                        while (it6.hasNext()) {
                            arrayList.addAll((java.util.Collection) ((Map.Entry) it6.next()).getValue());
                        }
                    }
                } else {
                    java.lang.Object value6 = entry2.getValue();
                    Intrinsics.checkNotNullExpressionValue(value6, "");
                    LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                    for (java.lang.Object obj7 : (java.lang.Iterable) value6) {
                        java.lang.String tradeSymbol5 = ((C54713xSo) obj7).copydefault().getTradeSymbol();
                        java.lang.Object arrayList13 = linkedHashMap8.get(tradeSymbol5);
                        if (arrayList13 == null) {
                            arrayList13 = new java.util.ArrayList();
                            linkedHashMap8.put(tradeSymbol5, arrayList13);
                        }
                        ((java.util.List) arrayList13).add(obj7);
                    }
                    java.util.Set setEntrySet6 = linkedHashMap8.entrySet();
                    arrayList = new java.util.ArrayList();
                    java.util.Iterator it7 = setEntrySet6.iterator();
                    while (it7.hasNext()) {
                        arrayList.addAll((java.util.Collection) ((Map.Entry) it7.next()).getValue());
                    }
                }
                arrayList7.add(arrayList);
            }
            ?? arrayList14 = new java.util.ArrayList();
            java.util.Iterator it8 = arrayList7.iterator();
            while (it8.hasNext()) {
                arrayList14.addAll((java.util.List) it8.next());
            }
            if (Intrinsics.EZpvd(entry.getKey(), (java.lang.Object) "SWAP")) {
                arrayList14 = CollectionsKt___CollectionsKt.EZpvd((java.lang.Iterable) arrayList14, new Application());
            }
            arrayList4.add(new C54716xSr((java.lang.String) entry.getKey(), CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList14)));
        }
        return new java.util.ArrayList<>(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList4));
    }

    public static /* synthetic */ int matchingV3$tagInfo$default(BizInstrument bizInstrument, java.util.HashMap map, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: o.xSp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Integer.valueOf(C54704xSf.OLrzqt());
                }
            };
        }
        return EZpvd(bizInstrument, map, function0);
    }

    public static final boolean OLrzqt(java.lang.String str, java.lang.String str2, boolean z, java.util.HashMap map, Ref.BooleanRef booleanRef, boolean z2, java.util.HashMap map2, BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        if (Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstFamily(), (java.lang.Object) "SOL-USDT") && Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "OPTION")) {
            bizInstrument.getInstId();
        }
        if (!Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "SPOT")) {
            str = str2;
        }
        C54704xSf c54704xSf = OLrzqt;
        kotlin.Pair<java.lang.Integer, java.lang.Integer> pairCopydefault = c54704xSf.copydefault(bizInstrument, str, z);
        final int iIntValue = pairCopydefault.component1().intValue();
        int iIntValue2 = pairCopydefault.component2().intValue();
        if (iIntValue > 0) {
            EZpvd(bizInstrument, map2, new Function0() { // from class: o.xSq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Integer.valueOf(C54704xSf.AEQbTJ(iIntValue));
                }
            });
        }
        map.put(bizInstrument, java.lang.Integer.valueOf(iIntValue2));
        if (c54704xSf.OLrzqt(iIntValue) || c54704xSf.AYXKKw(iIntValue)) {
            booleanRef.element = false;
        }
        return iIntValue > 0 || (str2.length() == 0 && z2);
    }

    public static final boolean EZpvd(java.util.HashMap map, C54713xSo c54713xSo) {
        Intrinsics.checkNotNullParameter(c54713xSo, "");
        return !OLrzqt.AhwBna(matchingV3$tagInfo$default(c54713xSo.copydefault(), map, null, 2, null));
    }

    public static /* synthetic */ kotlin.Pair computeInfoTag$default(C54704xSf c54704xSf, BizInstrument bizInstrument, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c54704xSf.copydefault(bizInstrument, str, z);
    }

    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> copydefault(BizInstrument bizInstrument, java.lang.String str, boolean z) {
        int iAkhnZx;
        java.lang.String tradeSymbol = bizInstrument.getTradeSymbol();
        java.util.Locale locale = java.util.Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = tradeSymbol.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.lang.String strFullCoinName = bizInstrument.fullCoinName();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase2 = strFullCoinName.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        java.lang.String displayQuoteSymbol = bizInstrument.getDisplayQuoteSymbol();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase3 = displayQuoteSymbol.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) lowerCase3)) {
            lowerCase3 = null;
        }
        if (lowerCase3 == null) {
            java.lang.String quoteSymbol = bizInstrument.getQuoteSymbol();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            lowerCase3 = quoteSymbol.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
        }
        java.lang.String displayId = bizInstrument.getDisplayId();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase4 = displayId.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) lowerCase4)) {
            lowerCase4 = null;
        }
        if (lowerCase4 == null) {
            java.lang.String instId = bizInstrument.getInstId();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            lowerCase4 = instId.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
        }
        java.lang.String str2 = lowerCase + lowerCase3;
        boolean z2 = !bizInstrument.isPreMarketPair();
        java.lang.String lowerCase5 = C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, bizInstrument.getInstId(), bizInstrument.getInstType(), false, false, 12, null).toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase5, "");
        if (Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) str)) {
            iAkhnZx = fARcdN(0);
        } else if (C59449zhJ.startsWith$default(lowerCase, str, false, 2, null) || C59449zhJ.startsWith$default(str2, str, false, 2, null)) {
            iAkhnZx = AkhnZx(0);
        } else if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase, (java.lang.CharSequence) str, false, 2, (java.lang.Object) null) || StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase4, (java.lang.CharSequence) str, false, 2, (java.lang.Object) null)) {
            iAkhnZx = fetchVPNInfo(0);
        } else if (z2 && C59449zhJ.startsWith$default(lowerCase2, str, false, 2, null)) {
            iAkhnZx = fJNWhG(0);
        } else if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase3, (java.lang.CharSequence) str, false, 2, (java.lang.Object) null)) {
            iAkhnZx = DbNXlk(0);
        } else if (z2 && (bizInstrument instanceof FutureInstrument) && xRY.copydefault.AEQbTJ(bizInstrument.getInstId(), str)) {
            iAkhnZx = fJNWhG(0);
        } else {
            iAkhnZx = StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase5, (java.lang.CharSequence) str, false, 2, (java.lang.Object) null) ? fetchVPNInfo(0) : 0;
        }
        double dDoubleValue = iAkhnZx > 0 ? 1.0d : AudioStats.AUDIO_AMPLITUDE_NONE;
        if (z && iAkhnZx == 0 && !(bizInstrument instanceof OptionInstrument)) {
            kotlin.Pair<java.lang.Double, java.lang.Integer> pairKWHzl = KWHzl(lowerCase, str, iAkhnZx, lowerCase2, dDoubleValue);
            dDoubleValue = pairKWHzl.getFirst().doubleValue();
            iAkhnZx = pairKWHzl.getSecond().intValue();
        }
        return C56390yDp.OLrzqt(java.lang.Integer.valueOf(iAkhnZx), java.lang.Integer.valueOf(yII.EZpvd(dDoubleValue * ((double) 100))));
    }

    public final kotlin.Pair<java.lang.Double, java.lang.Integer> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, double d) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        double dCalFuzzyRatio$default = calFuzzyRatio$default(this, str2, str, str3, AudioStats.AUDIO_AMPLITUDE_NONE, 8, null);
        if (dCalFuzzyRatio$default > AudioStats.AUDIO_AMPLITUDE_NONE) {
            i = values(i);
        }
        return new kotlin.Pair<>(java.lang.Double.valueOf(dCalFuzzyRatio$default), java.lang.Integer.valueOf(i));
    }

    public static final int KWHzl(int i) {
        C54704xSf c54704xSf = OLrzqt;
        if (c54704xSf.OLrzqt(i)) {
            return 0;
        }
        if (c54704xSf.AYXKKw(i)) {
            return 1;
        }
        if (c54704xSf.isConnected(i) || c54704xSf.djBIcL(i)) {
            return 2;
        }
        if (c54704xSf.gEmmrt(i)) {
            return 3;
        }
        if (c54704xSf.valueOf(i)) {
            return 4;
        }
        return c54704xSf.AhwBna(i) ? 5 : 6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int AEQbTJ(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Locale locale = java.util.Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        switch (lowerCase.hashCode()) {
            case 99212:
                return !lowerCase.equals("dai") ? 6 : 2;
            case 116102:
                if (lowerCase.equals("usd")) {
                    return 4;
                }
                break;
            case 3599261:
                if (lowerCase.equals("usdc")) {
                    return 1;
                }
                break;
            case 3599269:
                if (lowerCase.equals("usdk")) {
                    return 3;
                }
                break;
            case 3599278:
                if (lowerCase.equals("usdt")) {
                    return 0;
                }
                break;
        }
    }

    public final double KWHzl() {
        return ((java.lang.Number) copydefault.getValue()).doubleValue();
    }

    public static final double EZpvd() {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Double.valueOf(SPUtils.getDouble("fuzzyMatchNumber", 0.6d)));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = java.lang.Double.valueOf(0.6d);
        }
        return ((java.lang.Number) objM7377constructorimpl).doubleValue();
    }

    public static /* synthetic */ double calFuzzyRatio$default(C54704xSf c54704xSf, java.lang.String str, java.lang.String str2, java.lang.String str3, double d, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            d = c54704xSf.KWHzl();
        }
        return c54704xSf.copydefault(str, str2, str3, d);
    }

    /* JADX INFO: renamed from: o.xSf$TaskDescription */
    public static final class TaskDescription implements InterfaceC47221tlu {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public double EZpvd;
        public double KWHzl;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC47221tlu
        public java.lang.String getPrimary() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC47221tlu
        public double getPrimarySimilarity() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC47221tlu
        public java.lang.String getSecondary() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC47221tlu
        public double getSecondarySimilarity() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC47221tlu
        public void setPrimarySimilarity(double d) {
            this.EZpvd = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC47221tlu
        public void setSecondarySimilarity(double d) {
            this.KWHzl = d;
        }

        public TaskDescription(java.lang.String str, java.lang.String str2) {
            this.copydefault = str;
            this.AEQbTJ = str2;
        }
    }

    public final double copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, double d) {
        TaskDescription taskDescription;
        double dDoubleValue;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        TaskDescription taskDescription2 = new TaskDescription(str2, str3);
        Ref.DoubleRef doubleRef = new Ref.DoubleRef();
        java.util.List listSearchAndSortItems$default = C47222tlv.searchAndSortItems$default(C47222tlv.KWHzl, str, C56402yEa.EZpvd(taskDescription2), FuzzySearchEventSourceEnum.OKMARKET_COIN.getSource(), false, 8, null);
        if ((!listSearchAndSortItems$default.isEmpty()) && (taskDescription = (TaskDescription) CollectionsKt___CollectionsKt.firstOrNull(listSearchAndSortItems$default)) != null) {
            java.lang.Double dValueOf = java.lang.Double.valueOf(taskDescription.getPrimarySimilarity());
            if (!java.lang.Boolean.valueOf(dValueOf.doubleValue() >= d).booleanValue()) {
                dValueOf = null;
            }
            if (dValueOf != null) {
                dDoubleValue = dValueOf.doubleValue();
            } else {
                java.lang.Double dValueOf2 = java.lang.Double.valueOf(taskDescription.getSecondarySimilarity());
                java.lang.Double d2 = java.lang.Boolean.valueOf(dValueOf2.doubleValue() >= d).booleanValue() ? dValueOf2 : null;
                dDoubleValue = d2 != null ? d2.doubleValue() : AudioStats.AUDIO_AMPLITUDE_NONE;
            }
            doubleRef.element = dDoubleValue;
        }
        return doubleRef.element;
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString();
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = string.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        boolean zAhwBna = StringsKt__StringsKt.AhwBna((java.lang.CharSequence) lowerCase, (java.lang.CharSequence) "USDC", true);
        boolean zAhwBna2 = StringsKt__StringsKt.AhwBna((java.lang.CharSequence) lowerCase, (java.lang.CharSequence) "USDG", true);
        if (zAhwBna) {
            java.lang.String lowerCase2 = "USDC".toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            java.lang.String lowerCase3 = "USD".toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
            lowerCase = C59449zhJ.replace$default(lowerCase, lowerCase2, lowerCase3, false, 4, (java.lang.Object) null);
        }
        java.lang.String str2 = lowerCase;
        if (!zAhwBna2) {
            return str2;
        }
        java.lang.String lowerCase4 = "USDG".toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
        java.lang.String lowerCase5 = "USD".toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase5, "");
        return C59449zhJ.replace$default(str2, lowerCase4, lowerCase5, false, 4, (java.lang.Object) null);
    }

    public static final int EZpvd(BizInstrument bizInstrument, java.util.HashMap<BizInstrument, java.lang.Integer> map, Function0<java.lang.Integer> function0) {
        java.lang.Integer numInvoke = map.get(bizInstrument);
        if (numInvoke == null) {
            numInvoke = function0.invoke();
            map.put(bizInstrument, numInvoke);
        }
        return numInvoke.intValue();
    }
}
