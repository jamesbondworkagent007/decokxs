package o;

import com.okinc.oksearch.analytics.FuzzySearchEventSourceEnum;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tlp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47216tlp {
    public static final C47216tlp EZpvd = new C47216tlp();

    private C47216tlp() {
    }

    public static /* synthetic */ java.util.List searchForCeDeFi$default(java.lang.String str, java.util.List list, java.util.List list2, java.util.Map map, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            map = C56424yEw.KWHzl();
        }
        if ((i & 16) != 0) {
            str2 = FuzzySearchEventSourceEnum.UNKNOWN.getSource();
        }
        return EZpvd(str, list, list2, map, str2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v11, resolved type: o.tlp */
    /* JADX DEBUG: Multi-variable search result rejected for r9v3, resolved type: o.tlp */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends InterfaceC47217tlq> java.util.List<T> EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<? extends T> list, @NotNull java.util.List<? extends T> list2, @NotNull java.util.Map<java.lang.String, java.lang.Integer> map, @NotNull java.lang.String str2) {
        java.lang.String lowerCase;
        java.util.Iterator it;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String lowerCase2 = EZpvd.AEQbTJ(str).toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        if (lowerCase2.length() == 0) {
            return yDY.AhwBna();
        }
        java.lang.Integer num = map.get("cap1");
        int iIntValue = num != null ? num.intValue() : 3;
        java.lang.Integer num2 = map.get("cap2");
        int iIntValue2 = num2 != null ? num2.intValue() : 3;
        java.lang.Integer num3 = map.get("cap3");
        int iIntValue3 = num3 != null ? num3.intValue() : 3;
        java.lang.Integer num4 = map.get("cap4");
        int iIntValue4 = num4 != null ? num4.intValue() : 7;
        java.lang.Integer num5 = map.get("cap5");
        int iIntValue5 = num5 != null ? num5.intValue() : 7;
        java.lang.Integer num6 = map.get("cap6");
        int iIntValue6 = num6 != null ? num6.intValue() : 7;
        java.util.List<InterfaceC47217tlq> listSearchAndSortItems$default = C47222tlv.searchAndSortItems$default(C47222tlv.KWHzl, lowerCase2, list, str2, false, 8, null);
        java.util.ArrayList<InterfaceC47217tlq> arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (InterfaceC47217tlq interfaceC47217tlq : listSearchAndSortItems$default) {
            if (interfaceC47217tlq.getPrimarySimilarity() == 1.0d || interfaceC47217tlq.getSecondarySimilarity() == 1.0d) {
                arrayList.add(interfaceC47217tlq);
            } else {
                arrayList2.add(interfaceC47217tlq);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (InterfaceC47217tlq interfaceC47217tlq2 : arrayList) {
            java.lang.String cefiId = interfaceC47217tlq2.getCefiId();
            if (cefiId != null) {
                java.lang.String lowerCase3 = cefiId.toLowerCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
                if (lowerCase3 != null) {
                    java.lang.String str3 = lowerCase3.length() > 0 ? lowerCase3 : null;
                    if (str3 != null) {
                        linkedHashMap.put(str3, interfaceC47217tlq2);
                    }
                }
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        java.util.Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            InterfaceC47217tlq interfaceC47217tlq3 = (InterfaceC47217tlq) it2.next();
            java.lang.String cefiId2 = interfaceC47217tlq3.getCefiId();
            java.util.Iterator it3 = it2;
            if (cefiId2 != null) {
                java.lang.String lowerCase4 = cefiId2.toLowerCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
                if (lowerCase4 != null) {
                    if (lowerCase4.length() <= 0) {
                        lowerCase4 = null;
                    }
                    if (lowerCase4 != null) {
                        linkedHashMap2.put(lowerCase4, interfaceC47217tlq3);
                    }
                }
            }
            it2 = it3;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        java.util.Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            InterfaceC47217tlq interfaceC47217tlq4 = (InterfaceC47217tlq) it4.next();
            java.lang.String cefiId3 = interfaceC47217tlq4.getCefiId();
            if (cefiId3 != null) {
                lowerCase = cefiId3.toLowerCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            InterfaceC47217tlq interfaceC47217tlq5 = lowerCase != null ? (InterfaceC47217tlq) linkedHashMap2.get(lowerCase) : null;
            if (interfaceC47217tlq5 != null) {
                it = it4;
                if (Intrinsics.EZpvd(interfaceC47217tlq5.getCexListing(), java.lang.Boolean.TRUE)) {
                    linkedHashSet.add(EZpvd.EZpvd(interfaceC47217tlq5));
                    arrayList4.add(interfaceC47217tlq4);
                }
                it4 = it;
            } else {
                it = it4;
            }
            arrayList3.add(interfaceC47217tlq4);
            it4 = it;
        }
        java.util.Iterator<T> it5 = list2.iterator();
        while (it5.hasNext()) {
            InterfaceC47217tlq interfaceC47217tlq6 = (InterfaceC47217tlq) it5.next();
            if (!linkedHashSet.contains(EZpvd.EZpvd(interfaceC47217tlq6))) {
                arrayList5.add(interfaceC47217tlq6);
            }
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList5) {
            if (!Intrinsics.EZpvd(((InterfaceC47217tlq) obj).getCexListing(), java.lang.Boolean.TRUE)) {
                arrayList6.add(obj);
            }
        }
        java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList6);
        java.util.List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) arrayList3, iIntValue);
        java.util.List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.lang.Iterable) arrayList3, listAhwBna.size());
        java.util.List listAhwBna2 = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) arrayList4, iIntValue2);
        java.util.List listDjBIcL2 = CollectionsKt___CollectionsKt.djBIcL((java.lang.Iterable) arrayList4, listAhwBna2.size());
        java.util.List listAhwBna3 = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) listFJNWhG, iIntValue3);
        java.util.List listDjBIcL3 = CollectionsKt___CollectionsKt.djBIcL((java.lang.Iterable) listFJNWhG, listAhwBna3.size());
        java.util.List listDjBIcL4 = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listDjBIcL, (java.lang.Iterable) listDjBIcL2), (java.lang.Iterable) arrayList2);
        java.util.List listAhwBna4 = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) listDjBIcL4, iIntValue4);
        return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listAhwBna, (java.lang.Iterable) listAhwBna2), (java.lang.Iterable) listAhwBna3), (java.lang.Iterable) listAhwBna4), (java.lang.Iterable) CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) listDjBIcL3, iIntValue5)), (java.lang.Iterable) CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) CollectionsKt___CollectionsKt.djBIcL((java.lang.Iterable) listDjBIcL4, listAhwBna4.size()), iIntValue6));
    }

    public final <T extends InterfaceC47217tlq> java.lang.String EZpvd(T t) {
        java.lang.String primary = t.getPrimary();
        if (primary == null) {
            primary = "";
        }
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = primary.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.lang.String tokenContractAddress = t.getTokenContractAddress();
        if (tokenContractAddress == null) {
            tokenContractAddress = "";
        }
        java.lang.String lowerCase2 = tokenContractAddress.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        return lowerCase + "_" + lowerCase2;
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char cCharAt = str.charAt(!z ? i : length);
            boolean z2 = CharsKt__CharJVMKt.EZpvd(cCharAt) || cCharAt == '\n';
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }
}
