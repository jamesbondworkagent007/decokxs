package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DO {
    public static final boolean KWHzl(char c) {
        return ('0' <= c && c < ':') || ('a' <= c && c < 'g') || ('A' <= c && c < 'G');
    }

    public static final boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int length = str.length();
        if (1 > length || length >= 64 || !java.lang.Character.isLetterOrDigit(str.charAt(0))) {
            return false;
        }
        java.lang.String strFetchVPNInfo = C59454zhO.fetchVPNInfo(str, 1);
        for (int i = 0; i < strFetchVPNInfo.length(); i++) {
            char cCharAt = strFetchVPNInfo.charAt(i);
            if (!java.lang.Character.isLetterOrDigit(cCharAt) && cCharAt != '-') {
                return false;
            }
        }
        return true;
    }

    public static final DH copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new char[]{'.'}, false, 0, 6, (java.lang.Object) null);
        if (listSplit$default.size() != 4) {
            return null;
        }
        if (!listSplit$default.isEmpty()) {
            java.util.Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                java.lang.Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull((java.lang.String) it.next());
                int iIntValue = intOrNull != null ? intOrNull.intValue() : -1;
                if (!(iIntValue >= 0 && iIntValue < 256)) {
                    return null;
                }
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listSplit$default, 10));
        java.util.Iterator it2 = listSplit$default.iterator();
        while (it2.hasNext()) {
            arrayList.add(java.lang.Byte.valueOf(C59460zhU.AEQbTJ((java.lang.String) it2.next())));
        }
        return new DH(CollectionsKt___CollectionsKt.DbNXlk(arrayList));
    }

    public static final java.util.List<java.lang.String> AEQbTJ(java.lang.String str) {
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"::"}, false, 0, 6, (java.lang.Object) null);
        if (listSplit$default.size() > 2) {
            return null;
        }
        if (listSplit$default.size() == 1) {
            return StringsKt__StringsKt.split$default((java.lang.CharSequence) listSplit$default.get(0), new java.lang.String[]{":"}, false, 0, 6, (java.lang.Object) null);
        }
        java.util.List listAhwBna = Intrinsics.EZpvd(listSplit$default.get(0), (java.lang.Object) "") ? yDY.AhwBna() : StringsKt__StringsKt.split$default((java.lang.CharSequence) listSplit$default.get(0), new char[]{AbstractJsonLexerKt.COLON}, false, 0, 6, (java.lang.Object) null);
        java.util.List listAhwBna2 = Intrinsics.EZpvd(listSplit$default.get(1), (java.lang.Object) "") ? yDY.AhwBna() : StringsKt__StringsKt.split$default((java.lang.CharSequence) listSplit$default.get(1), new char[]{AbstractJsonLexerKt.COLON}, false, 0, 6, (java.lang.Object) null);
        int i = 8;
        if (listAhwBna.size() + listAhwBna2.size() == 8) {
            return null;
        }
        java.lang.String str2 = (java.lang.String) CollectionsKt___CollectionsKt.wlaJM(listAhwBna2);
        if (str2 != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) str2, '.', false, 2, (java.lang.Object) null)) {
            i = 7;
        }
        int size = listAhwBna.size();
        int size2 = listAhwBna2.size();
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        listOLrzqt.addAll(listAhwBna);
        for (int i2 = 0; i2 < (i - size) - size2; i2++) {
            listOLrzqt.add("0");
        }
        listOLrzqt.addAll(listAhwBna2);
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public static final DG gEmmrt(@NotNull java.lang.String str) {
        DH dhCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new char[]{'%'}, false, 0, 6, (java.lang.Object) null);
        if (listSplit$default.size() > 2) {
            return null;
        }
        if (listSplit$default.size() == 2 && !OLrzqt((java.lang.String) listSplit$default.get(1))) {
            return null;
        }
        java.lang.String str2 = listSplit$default.size() == 2 ? (java.lang.String) listSplit$default.get(1) : null;
        java.util.List<java.lang.String> listAEQbTJ = AEQbTJ((java.lang.String) listSplit$default.get(0));
        if (listAEQbTJ == null || listAEQbTJ.size() < 7) {
            return null;
        }
        for (int i = 0; i < 6; i++) {
            if (!KWHzl(listAEQbTJ.get(i))) {
                return null;
            }
        }
        if (listAEQbTJ.size() == 7) {
            java.util.List<java.lang.String> listSubList = listAEQbTJ.subList(0, 6);
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listSubList, 10));
            java.util.Iterator<T> it = listSubList.iterator();
            while (it.hasNext()) {
                arrayList.add(yDB.EZpvd(C59460zhU.AEQbTJ((java.lang.String) it.next(), 16)));
            }
            if (Intrinsics.EZpvd(arrayList, yDY.gEmmrt(yDB.EZpvd((short) 0), yDB.EZpvd((short) 0), yDB.EZpvd((short) 0), yDB.EZpvd((short) 0), yDB.EZpvd((short) 0), yDB.EZpvd((short) -1))) && (dhCopydefault = copydefault(listAEQbTJ.get(6))) != null) {
                return dhCopydefault.AEQbTJ();
            }
            return null;
        }
        if (listAEQbTJ.size() != 8 || !KWHzl(listAEQbTJ.get(6)) || !KWHzl(listAEQbTJ.get(7))) {
            return null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        java.util.Iterator<T> it2 = listAEQbTJ.iterator();
        while (it2.hasNext()) {
            arrayList2.add(yDB.EZpvd(C59460zhU.AEQbTJ((java.lang.String) it2.next(), 16)));
        }
        return new DG(((yDB) arrayList2.get(0)).EZpvd(), ((yDB) arrayList2.get(1)).EZpvd(), ((yDB) arrayList2.get(2)).EZpvd(), ((yDB) arrayList2.get(3)).EZpvd(), ((yDB) arrayList2.get(4)).EZpvd(), ((yDB) arrayList2.get(5)).EZpvd(), ((yDB) arrayList2.get(6)).EZpvd(), ((yDB) arrayList2.get(7)).EZpvd(), str2, null);
    }

    public static final boolean KWHzl(java.lang.String str) {
        int length = str.length();
        if (1 > length || length >= 5) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!KWHzl(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str.length() > 0 && !StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, '%', false, 2, (java.lang.Object) null);
    }
}
