package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import o.FA;

/* JADX INFO: loaded from: classes2.dex */
public final class FP {
    public static final java.util.Map<java.lang.String, char[]> copydefault;
    public static final Regex OLrzqt = new Regex("#([0-9]+)");
    public static final Regex EZpvd = new Regex("#x([0-9a-fA-F]+)");

    static {
        java.util.Map mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("lt", '<'), C56390yDp.OLrzqt("gt", '>'), C56390yDp.OLrzqt("amp", '&'), C56390yDp.OLrzqt("apos", '\''), C56390yDp.OLrzqt("quot", '\"'));
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(mapGEmmrt.size()));
        for (Map.Entry entry : mapGEmmrt.entrySet()) {
            linkedHashMap.put(entry.getKey(), new char[]{((java.lang.Character) entry.getValue()).charValue()});
        }
        copydefault = linkedHashMap;
    }

    public static final boolean KWHzl(FA.Application application) {
        return (Intrinsics.EZpvd((java.lang.Object) application.AEQbTJ(), (java.lang.Object) "xmlns") && application.EZpvd() == null) || Intrinsics.EZpvd((java.lang.Object) application.EZpvd(), (java.lang.Object) "xmlns");
    }

    public static final java.lang.String EZpvd(FA.Application application) {
        if (Intrinsics.EZpvd((java.lang.Object) application.AEQbTJ(), (java.lang.Object) "xmlns")) {
            return null;
        }
        return application.AEQbTJ();
    }

    public static final kotlin.Pair<java.util.Map<FA.Application, java.lang.String>, java.util.List<FA.TaskDescription>> EZpvd(java.util.Map<FA.Application, java.lang.String> map) {
        java.util.List listAkhnZx = C56427yEz.AkhnZx(map);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : listAkhnZx) {
            if (KWHzl((FA.Application) ((kotlin.Pair) obj).getFirst())) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        kotlin.Pair pair = new kotlin.Pair(arrayList, arrayList2);
        java.util.Map mapCopydefault = C56424yEw.copydefault((java.lang.Iterable) pair.getSecond());
        java.lang.Iterable<kotlin.Pair> iterable = (java.lang.Iterable) pair.getFirst();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
        for (kotlin.Pair pair2 : iterable) {
            arrayList3.add(new FA.TaskDescription((java.lang.String) pair2.getSecond(), EZpvd((FA.Application) pair2.getFirst())));
        }
        return C56390yDp.OLrzqt(mapCopydefault, arrayList3);
    }
}
