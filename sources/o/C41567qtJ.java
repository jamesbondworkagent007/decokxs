package o;

import androidx.camera.video.AudioStats;
import com.okinc.core.util.SPUtils;
import com.okinc.oksearch.analytics.FuzzySearchEventSourceEnum;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.DexInstrument;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.biz.OptionInstrument;
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

/* JADX INFO: renamed from: o.qtJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41567qtJ {
    public static final C41567qtJ AEQbTJ = new C41567qtJ();
    public static final Function1<java.lang.Integer, java.lang.Integer> copydefault = new Function1() { // from class: o.qtS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return java.lang.Integer.valueOf(C41567qtJ.EZpvd(((java.lang.Integer) obj).intValue()));
        }
    };
    public static final Function1<java.lang.String, java.lang.Integer> OLrzqt = new Function1() { // from class: o.qtQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return java.lang.Integer.valueOf(C41567qtJ.EZpvd((java.lang.String) obj));
        }
    };
    public static final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.qtP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Double.valueOf(C41567qtJ.KWHzl());
        }
    });
    public static final int KWHzl = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean AEQbTJ(InterfaceC41645qui interfaceC41645qui) {
        Intrinsics.checkNotNullParameter(interfaceC41645qui, "");
        return true;
    }

    public static final int copydefault() {
        return 0;
    }

    public static final int copydefault(int i) {
        return i;
    }

    public final boolean AYXKKw(int i) {
        return (i & 4096) > 0;
    }

    public final boolean AhwBna(int i) {
        return (i & 8192) > 0;
    }

    public final int AkhnZx(int i) {
        return i + 8192;
    }

    public final int DbNXlk(int i) {
        return i + 2048;
    }

    public final boolean KWHzl(int i) {
        return (i & 16384) > 0;
    }

    public final boolean djBIcL(int i) {
        return (i & 2048) > 0;
    }

    public final int fARcdN(int i) {
        return i + 512;
    }

    public final int fJNWhG(int i) {
        return i + 16384;
    }

    public final int fetchVPNInfo(int i) {
        return i + 1024;
    }

    public final boolean gEmmrt(int i) {
        return (i & 512) > 0;
    }

    public final int isConnected(int i) {
        return i + 256;
    }

    public final boolean valueOf(int i) {
        return (i & 256) > 0;
    }

    public final boolean values(int i) {
        return (i & 1024) > 0;
    }

    /* JADX INFO: renamed from: o.qtJ$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Comparator {
        public final /* synthetic */ java.util.HashMap EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(java.util.HashMap map) {
            this.EZpvd = map;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.Integer num = (java.lang.Integer) this.EZpvd.get((InterfaceC41645qui) t2);
            int iIntValue = num != null ? num.intValue() : 0;
            java.lang.Integer num2 = (java.lang.Integer) this.EZpvd.get((InterfaceC41645qui) t);
            return yET.KWHzl(java.lang.Integer.valueOf(iIntValue), java.lang.Integer.valueOf(num2 != null ? num2.intValue() : 0));
        }
    }

    private C41567qtJ() {
    }

    public static /* synthetic */ java.util.List matchingV2$default(C41567qtJ c41567qtJ, java.util.List list, java.lang.String str, Function1 function1, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: o.qtN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(C41567qtJ.AEQbTJ((InterfaceC41645qui) obj2));
                }
            };
        }
        return c41567qtJ.EZpvd(list, str, function1, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:131:0x03fa */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:151:0x01b5 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v0, types: [java.lang.Iterable, java.lang.Object, java.util.List, java.util.List<? extends T extends o.qui<T>>, java.util.List<T extends o.qui<T>>] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.List] */
    public final <T extends InterfaceC41645qui<T>> java.util.List<T> EZpvd(@NotNull java.util.List<? extends T> list, @NotNull java.lang.String str, @NotNull Function1<? super T, java.lang.Boolean> function1, final boolean z, final boolean z2) {
        final java.util.HashMap map;
        java.util.HashMap map2;
        ?? arrayList;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C41434qqj c41434qqj = C41434qqj.KWHzl;
        c41434qqj.KWHzl("SearchInstrumentUseCase", "matchingV2 raw [size: " + list.size() + ", key: " + str + ", fuzzySearch: " + z + "]");
        java.util.Locale locale = java.util.Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        final java.lang.String lowerCase = C59449zhJ.replace$default(C59449zhJ.replace$default(C59449zhJ.replace$default(upperCase, "-", "", false, 4, (java.lang.Object) null), "/", "", false, 4, (java.lang.Object) null), " ", "", false, 4, (java.lang.Object) null).toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        final java.lang.String strKWHzl = C54704xSf.OLrzqt.KWHzl(lowerCase);
        if (lowerCase.length() == 0 && !z2) {
            c41434qqj.KWHzl("SearchInstrumentUseCase", "matchingV2 with empty key, return rawInstrumentList");
            return list;
        }
        final java.util.HashMap map3 = new java.util.HashMap();
        final java.util.HashMap map4 = new java.util.HashMap();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        java.util.HashMap map5 = map4;
        Sequence sequenceQVAiDq = CollectionsKt___CollectionsKt.QVAiDq(C59467zhb.zuBGHE(C59467zhb.DbNXlk(C59467zhb.DbNXlk(CollectionsKt___CollectionsKt.QVAiDq(list), function1), new Function1() { // from class: o.qtO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C41567qtJ.OLrzqt(strKWHzl, lowerCase, z, map4, booleanRef, z2, map3, (InterfaceC41645qui) obj));
            }
        })));
        if (booleanRef.element) {
            map = map3;
        } else {
            map = map3;
            sequenceQVAiDq = C59467zhb.DbNXlk(sequenceQVAiDq, new Function1() { // from class: o.qtK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(C41567qtJ.copydefault(map, (InterfaceC41645qui) obj));
                }
            });
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : sequenceQVAiDq) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(copydefault.invoke(java.lang.Integer.valueOf(matchingV2$tagInfo$default((InterfaceC41645qui) obj, map, null, 2, null))).intValue());
            java.lang.Object arrayList2 = linkedHashMap.get(numValueOf);
            if (arrayList2 == null) {
                arrayList2 = new java.util.ArrayList();
                linkedHashMap.put(numValueOf, arrayList2);
            }
            ((java.util.List) arrayList2).add(obj);
        }
        SortedMap sortedMapGEmmrt = C56423yEv.gEmmrt(linkedHashMap);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(sortedMapGEmmrt.size());
        for (Map.Entry entry : sortedMapGEmmrt.entrySet()) {
            java.lang.Integer num = (java.lang.Integer) entry.getKey();
            if (num == null || num.intValue() != 0) {
                if (num == null || num.intValue() != 1) {
                    if (num == null || num.intValue() != 2) {
                        if (num == null || num.intValue() != 3) {
                            if (num == null || num.intValue() != 5) {
                                map2 = map5;
                                if (num == null || num.intValue() != 4) {
                                    arrayList = (num != null && num.intValue() == 6) ? (java.util.List) entry.getValue() : (java.util.List) entry.getValue();
                                } else {
                                    java.lang.Object value = entry.getValue();
                                    Intrinsics.checkNotNullExpressionValue(value, "");
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    for (java.lang.Object obj2 : (java.lang.Iterable) value) {
                                        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(OLrzqt.invoke(AEQbTJ.EZpvd((InterfaceC41645qui) obj2)).intValue());
                                        java.lang.Object arrayList4 = linkedHashMap2.get(numValueOf2);
                                        if (arrayList4 == null) {
                                            arrayList4 = new java.util.ArrayList();
                                            linkedHashMap2.put(numValueOf2, arrayList4);
                                        }
                                        ((java.util.List) arrayList4).add(obj2);
                                    }
                                    java.util.Set setEntrySet = C56423yEv.gEmmrt(linkedHashMap2).entrySet();
                                    arrayList = new java.util.ArrayList();
                                    java.util.Iterator it = setEntrySet.iterator();
                                    while (it.hasNext()) {
                                        arrayList.addAll((java.util.Collection) ((Map.Entry) it.next()).getValue());
                                    }
                                }
                            } else {
                                java.lang.Object value2 = entry.getValue();
                                Intrinsics.checkNotNullExpressionValue(value2, "");
                                map2 = map5;
                                java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd((java.lang.Iterable) value2, new TaskDescription(map2));
                                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                for (java.lang.Object obj3 : listEZpvd) {
                                    java.lang.String strOLrzqt = AEQbTJ.OLrzqt((InterfaceC41645qui) obj3);
                                    java.lang.Object arrayList5 = linkedHashMap3.get(strOLrzqt);
                                    if (arrayList5 == null) {
                                        arrayList5 = new java.util.ArrayList();
                                        linkedHashMap3.put(strOLrzqt, arrayList5);
                                    }
                                    ((java.util.List) arrayList5).add(obj3);
                                }
                                java.util.Set setEntrySet2 = linkedHashMap3.entrySet();
                                arrayList = new java.util.ArrayList();
                                java.util.Iterator it2 = setEntrySet2.iterator();
                                while (it2.hasNext()) {
                                    arrayList.addAll((java.util.Collection) ((Map.Entry) it2.next()).getValue());
                                }
                            }
                            arrayList3.add(arrayList);
                            map5 = map2;
                        } else {
                            java.lang.Object value3 = entry.getValue();
                            Intrinsics.checkNotNullExpressionValue(value3, "");
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            for (java.lang.Object obj4 : (java.lang.Iterable) value3) {
                                java.lang.String strOLrzqt2 = AEQbTJ.OLrzqt((InterfaceC41645qui) obj4);
                                java.lang.Object arrayList6 = linkedHashMap4.get(strOLrzqt2);
                                if (arrayList6 == null) {
                                    arrayList6 = new java.util.ArrayList();
                                    linkedHashMap4.put(strOLrzqt2, arrayList6);
                                }
                                ((java.util.List) arrayList6).add(obj4);
                            }
                            java.util.Set setEntrySet3 = linkedHashMap4.entrySet();
                            arrayList = new java.util.ArrayList();
                            java.util.Iterator it3 = setEntrySet3.iterator();
                            while (it3.hasNext()) {
                                arrayList.addAll((java.util.Collection) ((Map.Entry) it3.next()).getValue());
                            }
                        }
                    } else {
                        java.lang.Object value4 = entry.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "");
                        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                        for (java.lang.Object obj5 : (java.lang.Iterable) value4) {
                            java.lang.String strOLrzqt3 = AEQbTJ.OLrzqt((InterfaceC41645qui) obj5);
                            java.lang.Object arrayList7 = linkedHashMap5.get(strOLrzqt3);
                            if (arrayList7 == null) {
                                arrayList7 = new java.util.ArrayList();
                                linkedHashMap5.put(strOLrzqt3, arrayList7);
                            }
                            ((java.util.List) arrayList7).add(obj5);
                        }
                        java.util.Set setEntrySet4 = linkedHashMap5.entrySet();
                        arrayList = new java.util.ArrayList();
                        java.util.Iterator it4 = setEntrySet4.iterator();
                        while (it4.hasNext()) {
                            arrayList.addAll((java.util.Collection) ((Map.Entry) it4.next()).getValue());
                        }
                    }
                } else {
                    java.lang.Object value5 = entry.getValue();
                    Intrinsics.checkNotNullExpressionValue(value5, "");
                    LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                    for (java.lang.Object obj6 : (java.lang.Iterable) value5) {
                        java.lang.String strOLrzqt4 = AEQbTJ.OLrzqt((InterfaceC41645qui) obj6);
                        java.lang.Object arrayList8 = linkedHashMap6.get(strOLrzqt4);
                        if (arrayList8 == null) {
                            arrayList8 = new java.util.ArrayList();
                            linkedHashMap6.put(strOLrzqt4, arrayList8);
                        }
                        ((java.util.List) arrayList8).add(obj6);
                    }
                    java.util.Set setEntrySet5 = linkedHashMap6.entrySet();
                    arrayList = new java.util.ArrayList();
                    java.util.Iterator it5 = setEntrySet5.iterator();
                    while (it5.hasNext()) {
                        arrayList.addAll((java.util.Collection) ((Map.Entry) it5.next()).getValue());
                    }
                }
            } else {
                java.lang.Object value6 = entry.getValue();
                Intrinsics.checkNotNullExpressionValue(value6, "");
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                for (java.lang.Object obj7 : (java.lang.Iterable) value6) {
                    java.lang.String strOLrzqt5 = AEQbTJ.OLrzqt((InterfaceC41645qui) obj7);
                    java.lang.Object arrayList9 = linkedHashMap7.get(strOLrzqt5);
                    if (arrayList9 == null) {
                        arrayList9 = new java.util.ArrayList();
                        linkedHashMap7.put(strOLrzqt5, arrayList9);
                    }
                    ((java.util.List) arrayList9).add(obj7);
                }
                java.util.Set setEntrySet6 = linkedHashMap7.entrySet();
                arrayList = new java.util.ArrayList();
                java.util.Iterator it6 = setEntrySet6.iterator();
                while (it6.hasNext()) {
                    arrayList.addAll((java.util.Collection) ((Map.Entry) it6.next()).getValue());
                }
            }
            map2 = map5;
            arrayList3.add(arrayList);
            map5 = map2;
        }
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        java.util.Iterator it7 = arrayList3.iterator();
        while (it7.hasNext()) {
            arrayList10.addAll((java.util.List) it7.next());
        }
        C41434qqj.KWHzl.KWHzl("SearchInstrumentUseCase", "matchingV2 result [size: " + arrayList10.size() + ", key: " + str + ", fuzzySearch: " + z + "]");
        return arrayList10;
    }

    public static /* synthetic */ int matchingV2$tagInfo$default(InterfaceC41645qui interfaceC41645qui, java.util.HashMap map, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: o.qtM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Integer.valueOf(C41567qtJ.copydefault());
                }
            };
        }
        return AEQbTJ(interfaceC41645qui, map, function0);
    }

    public static final boolean OLrzqt(java.lang.String str, java.lang.String str2, boolean z, java.util.HashMap map, Ref.BooleanRef booleanRef, boolean z2, java.util.HashMap map2, InterfaceC41645qui interfaceC41645qui) {
        kotlin.Pair<java.lang.Integer, java.lang.Integer> pairCopydefault;
        Intrinsics.checkNotNullParameter(interfaceC41645qui, "");
        InterfaceC55797xqi interfaceC55797xqiAkhnZx = interfaceC41645qui.AkhnZx();
        boolean z3 = interfaceC55797xqiAkhnZx instanceof BizInstrument;
        if (!z3 || !Intrinsics.EZpvd((java.lang.Object) ((BizInstrument) interfaceC55797xqiAkhnZx).getInstType(), (java.lang.Object) "SPOT")) {
            str = str2;
        }
        if (z3) {
            pairCopydefault = AEQbTJ.KWHzl((BizInstrument) interfaceC55797xqiAkhnZx, str, z);
        } else {
            if (!(interfaceC55797xqiAkhnZx instanceof DexInstrument)) {
                return false;
            }
            pairCopydefault = AEQbTJ.copydefault((DexInstrument) interfaceC55797xqiAkhnZx, str, z);
        }
        final int iIntValue = pairCopydefault.component1().intValue();
        int iIntValue2 = pairCopydefault.component2().intValue();
        if (iIntValue > 0) {
            AEQbTJ(interfaceC41645qui, map2, new Function0() { // from class: o.qtL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Integer.valueOf(C41567qtJ.copydefault(iIntValue));
                }
            });
        }
        map.put(interfaceC41645qui, java.lang.Integer.valueOf(iIntValue2));
        C41567qtJ c41567qtJ = AEQbTJ;
        if (c41567qtJ.KWHzl(iIntValue) || c41567qtJ.djBIcL(iIntValue)) {
            booleanRef.element = false;
        }
        return iIntValue > 0 || (str2.length() == 0 && z2);
    }

    public static final boolean copydefault(java.util.HashMap map, InterfaceC41645qui interfaceC41645qui) {
        Intrinsics.checkNotNullParameter(interfaceC41645qui, "");
        return !AEQbTJ.AhwBna(matchingV2$tagInfo$default(interfaceC41645qui, map, null, 2, null));
    }

    public static /* synthetic */ kotlin.Pair computeInfoTag$default(C41567qtJ c41567qtJ, DexInstrument dexInstrument, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c41567qtJ.copydefault(dexInstrument, str, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> copydefault(DexInstrument dexInstrument, java.lang.String str, boolean z) {
        int iIntValue;
        int iFJNWhG;
        double dDoubleValue;
        java.lang.String tokenSymbol = dexInstrument.getTokenSymbol();
        java.util.Locale locale = java.util.Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = tokenSymbol.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.lang.String tokenName = dexInstrument.getTokenName();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase2 = tokenName.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        java.lang.String tokenContractAddress = dexInstrument.getTokenContractAddress();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase3 = tokenContractAddress.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
        if (Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) str)) {
            iFJNWhG = fJNWhG(0);
        } else if (C59449zhJ.startsWith$default(lowerCase, str, false, 2, null)) {
            iFJNWhG = DbNXlk(0);
        } else if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase, (java.lang.CharSequence) str, false, 2, (java.lang.Object) null)) {
            iFJNWhG = fetchVPNInfo(0);
        } else if (C59449zhJ.startsWith$default(lowerCase2, str, false, 2, null)) {
            iFJNWhG = fARcdN(0);
        } else {
            if (!Intrinsics.EZpvd((java.lang.Object) lowerCase3, (java.lang.Object) str)) {
                iIntValue = 0;
                if (z || iIntValue != 0) {
                    dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
                } else {
                    kotlin.Pair<java.lang.Double, java.lang.Integer> pairCopydefault = copydefault(lowerCase, str, iIntValue, lowerCase2, AudioStats.AUDIO_AMPLITUDE_NONE);
                    dDoubleValue = pairCopydefault.getFirst().doubleValue();
                    iIntValue = pairCopydefault.getSecond().intValue();
                }
                return C56390yDp.OLrzqt(java.lang.Integer.valueOf(iIntValue), java.lang.Integer.valueOf(yII.EZpvd(dDoubleValue * ((double) 100))));
            }
            iFJNWhG = fJNWhG(0);
        }
        iIntValue = iFJNWhG;
        if (z) {
            dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        return C56390yDp.OLrzqt(java.lang.Integer.valueOf(iIntValue), java.lang.Integer.valueOf(yII.EZpvd(dDoubleValue * ((double) 100))));
    }

    public static /* synthetic */ kotlin.Pair computeInfoTag$default(C41567qtJ c41567qtJ, BizInstrument bizInstrument, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c41567qtJ.KWHzl(bizInstrument, str, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> KWHzl(BizInstrument bizInstrument, java.lang.String str, boolean z) {
        int iDbNXlk;
        int iIntValue;
        double dDoubleValue;
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
        if (Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) str)) {
            iDbNXlk = fJNWhG(0);
        } else if (C59449zhJ.startsWith$default(lowerCase, str, false, 2, null) || C59449zhJ.startsWith$default(str2, str, false, 2, null)) {
            iDbNXlk = DbNXlk(0);
        } else if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase, (java.lang.CharSequence) str, false, 2, (java.lang.Object) null) || StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase4, (java.lang.CharSequence) str, false, 2, (java.lang.Object) null)) {
            iDbNXlk = fetchVPNInfo(0);
        } else if (z2 && C59449zhJ.startsWith$default(lowerCase2, str, false, 2, null)) {
            iDbNXlk = fARcdN(0);
        } else if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase3, (java.lang.CharSequence) str, false, 2, (java.lang.Object) null)) {
            iDbNXlk = isConnected(0);
        } else if (z2 && (bizInstrument instanceof FutureInstrument) && C41562qtE.EZpvd.copydefault(bizInstrument.getInstId(), str)) {
            iDbNXlk = fARcdN(0);
        } else {
            iIntValue = 0;
            if (z || iIntValue != 0 || (bizInstrument instanceof OptionInstrument)) {
                dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
            } else {
                kotlin.Pair<java.lang.Double, java.lang.Integer> pairCopydefault = copydefault(lowerCase, str, iIntValue, lowerCase2, AudioStats.AUDIO_AMPLITUDE_NONE);
                dDoubleValue = pairCopydefault.getFirst().doubleValue();
                iIntValue = pairCopydefault.getSecond().intValue();
            }
            return C56390yDp.OLrzqt(java.lang.Integer.valueOf(iIntValue), java.lang.Integer.valueOf(yII.EZpvd(dDoubleValue * ((double) 100))));
        }
        iIntValue = iDbNXlk;
        if (z) {
            dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        return C56390yDp.OLrzqt(java.lang.Integer.valueOf(iIntValue), java.lang.Integer.valueOf(yII.EZpvd(dDoubleValue * ((double) 100))));
    }

    public final kotlin.Pair<java.lang.Double, java.lang.Integer> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, double d) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        double dCalFuzzyRatio$default = calFuzzyRatio$default(this, str2, str, str3, AudioStats.AUDIO_AMPLITUDE_NONE, 8, null);
        if (dCalFuzzyRatio$default > AudioStats.AUDIO_AMPLITUDE_NONE) {
            i = AkhnZx(i);
        }
        return new kotlin.Pair<>(java.lang.Double.valueOf(dCalFuzzyRatio$default), java.lang.Integer.valueOf(i));
    }

    public static final int EZpvd(int i) {
        C41567qtJ c41567qtJ = AEQbTJ;
        if (c41567qtJ.KWHzl(i)) {
            return 0;
        }
        if (c41567qtJ.djBIcL(i)) {
            return 1;
        }
        if (c41567qtJ.values(i) || c41567qtJ.AYXKKw(i)) {
            return 2;
        }
        if (c41567qtJ.gEmmrt(i)) {
            return 3;
        }
        if (c41567qtJ.valueOf(i)) {
            return 4;
        }
        return c41567qtJ.AhwBna(i) ? 5 : 6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int EZpvd(java.lang.String str) {
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

    public final double OLrzqt() {
        return ((java.lang.Number) EZpvd.getValue()).doubleValue();
    }

    public static final double KWHzl() {
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

    public static /* synthetic */ double calFuzzyRatio$default(C41567qtJ c41567qtJ, java.lang.String str, java.lang.String str2, java.lang.String str3, double d, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            d = c41567qtJ.OLrzqt();
        }
        return c41567qtJ.AEQbTJ(str, str2, str3, d);
    }

    /* JADX INFO: renamed from: o.qtJ$Activity */
    public static final class Activity implements InterfaceC47221tlu {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public double EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public double copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC47221tlu
        public java.lang.String getPrimary() {
            return this.KWHzl;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC47221tlu
        public void setPrimarySimilarity(double d) {
            this.EZpvd = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC47221tlu
        public void setSecondarySimilarity(double d) {
            this.copydefault = d;
        }

        public Activity(java.lang.String str, java.lang.String str2) {
            this.KWHzl = str;
            this.AEQbTJ = str2;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.tlv.searchAndSortItems$default(o.tlv, java.lang.String, java.util.List, java.lang.String, boolean, int, java.lang.Object):java.util.List */
    public final double AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, double d) {
        Activity activity;
        double dDoubleValue;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Activity activity2 = new Activity(str2, str3);
        Ref.DoubleRef doubleRef = new Ref.DoubleRef();
        java.util.List listSearchAndSortItems$default = C47222tlv.searchAndSortItems$default(C47222tlv.KWHzl, str, C56402yEa.EZpvd(activity2), FuzzySearchEventSourceEnum.OKMARKET_COIN.getSource(), false, 8, null);
        if ((!listSearchAndSortItems$default.isEmpty()) && (activity = (Activity) CollectionsKt___CollectionsKt.firstOrNull(listSearchAndSortItems$default)) != null) {
            java.lang.Double dValueOf = java.lang.Double.valueOf(activity.getPrimarySimilarity());
            if (!java.lang.Boolean.valueOf(dValueOf.doubleValue() >= d).booleanValue()) {
                dValueOf = null;
            }
            if (dValueOf != null) {
                dDoubleValue = dValueOf.doubleValue();
            } else {
                java.lang.Double dValueOf2 = java.lang.Double.valueOf(activity.getSecondarySimilarity());
                java.lang.Double d2 = java.lang.Boolean.valueOf(dValueOf2.doubleValue() >= d).booleanValue() ? dValueOf2 : null;
                dDoubleValue = d2 != null ? d2.doubleValue() : AudioStats.AUDIO_AMPLITUDE_NONE;
            }
            doubleRef.element = dDoubleValue;
        }
        return doubleRef.element;
    }

    public final <T extends InterfaceC41645qui<T>> java.lang.String OLrzqt(InterfaceC41645qui<T> interfaceC41645qui) {
        InterfaceC55797xqi interfaceC55797xqiAkhnZx = interfaceC41645qui.AkhnZx();
        if (interfaceC55797xqiAkhnZx instanceof BizInstrument) {
            return ((BizInstrument) interfaceC55797xqiAkhnZx).getTradeSymbol();
        }
        if (interfaceC55797xqiAkhnZx instanceof DexInstrument) {
            return ((DexInstrument) interfaceC55797xqiAkhnZx).getTokenName();
        }
        throw new java.lang.IllegalStateException("not support instrument for " + interfaceC55797xqiAkhnZx.getClass().getName());
    }

    public final <T extends InterfaceC41645qui<T>> java.lang.String EZpvd(InterfaceC41645qui<T> interfaceC41645qui) {
        InterfaceC55797xqi interfaceC55797xqiAkhnZx = interfaceC41645qui.AkhnZx();
        if (interfaceC55797xqiAkhnZx instanceof BizInstrument) {
            return ((BizInstrument) interfaceC55797xqiAkhnZx).getQuoteSymbol();
        }
        if (interfaceC55797xqiAkhnZx instanceof DexInstrument) {
            return ((DexInstrument) interfaceC55797xqiAkhnZx).getTokenName();
        }
        throw new java.lang.IllegalStateException("not support instrument for " + interfaceC55797xqiAkhnZx.getClass().getName());
    }

    public static final <T extends InterfaceC41645qui<T>> int AEQbTJ(T t, java.util.HashMap<T, java.lang.Integer> map, Function0<java.lang.Integer> function0) {
        java.lang.Integer numInvoke = map.get(t);
        if (numInvoke == null) {
            numInvoke = function0.invoke();
            map.put(t, numInvoke);
        }
        return numInvoke.intValue();
    }
}
