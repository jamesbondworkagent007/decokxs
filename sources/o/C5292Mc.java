package o;

import com.amplitude.experiment.evaluation.CycleException;
import com.amplitude.experiment.evaluation.EvaluationFlag;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Mc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5292Mc {
    public static /* synthetic */ java.util.List topologicalSort$default(java.util.List list, java.util.Set set, int i, java.lang.Object obj) throws CycleException {
        if ((i & 2) != 0) {
            set = yEE.copydefault();
        }
        return KWHzl(list, set);
    }

    public static /* synthetic */ java.util.List topologicalSort$default(java.util.Map map, java.util.Set set, int i, java.lang.Object obj) throws CycleException {
        if ((i & 2) != 0) {
            set = yEE.copydefault();
        }
        return EZpvd(map, set);
    }

    public static final java.util.List<EvaluationFlag> EZpvd(@NotNull java.util.Map<java.lang.String, EvaluationFlag> map, @NotNull java.util.Set<java.lang.String> set) throws CycleException {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(set, "");
        java.util.Map mapIsConnected = C56424yEw.isConnected(map);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Set<java.lang.String> setOqFWZa = set;
        if (setOqFWZa.isEmpty()) {
            setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(mapIsConnected.keySet());
        }
        java.util.Iterator<java.lang.String> it = setOqFWZa.iterator();
        while (it.hasNext()) {
            java.util.List listParentTraversal$default = parentTraversal$default(it.next(), mapIsConnected, null, 4, null);
            if (listParentTraversal$default != null) {
                arrayList.addAll(listParentTraversal$default);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ java.util.List parentTraversal$default(java.lang.String str, java.util.Map map, java.util.Set set, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            set = new LinkedHashSet();
        }
        return OLrzqt(str, map, set);
    }

    public static final java.util.List<EvaluationFlag> OLrzqt(java.lang.String str, java.util.Map<java.lang.String, EvaluationFlag> map, java.util.Set<java.lang.String> set) {
        EvaluationFlag evaluationFlag = map.get(str);
        if (evaluationFlag == null) {
            return null;
        }
        java.util.Set<java.lang.String> setEZpvd = evaluationFlag.EZpvd();
        if (setEZpvd == null || setEZpvd.isEmpty()) {
            map.remove(evaluationFlag.KWHzl());
            return C56402yEa.EZpvd(evaluationFlag);
        }
        set.add(evaluationFlag.KWHzl());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : evaluationFlag.EZpvd()) {
            if (set.contains(str2)) {
                throw new CycleException(set);
            }
            java.util.List<EvaluationFlag> listOLrzqt = OLrzqt(str2, map, set);
            if (listOLrzqt != null) {
                arrayList.addAll(listOLrzqt);
            }
        }
        arrayList.add(evaluationFlag);
        set.remove(evaluationFlag.KWHzl());
        map.remove(evaluationFlag.KWHzl());
        return arrayList;
    }

    public static final java.util.List<EvaluationFlag> KWHzl(@NotNull java.util.List<EvaluationFlag> list, @NotNull java.util.Set<java.lang.String> set) throws CycleException {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(set, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
        for (java.lang.Object obj : list) {
            linkedHashMap.put(((EvaluationFlag) obj).KWHzl(), obj);
        }
        return EZpvd(linkedHashMap, set);
    }
}
