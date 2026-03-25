package o;

import com.amplitude.core.events.IdentifyOperation;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class KB {
    public static final KB OLrzqt = new KB();

    private KB() {
    }

    public final java.util.Map<java.lang.String, java.lang.Object> copydefault(@NotNull java.util.List<? extends C5242Ke> list) {
        Intrinsics.checkNotNullParameter(list, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C5242Ke c5242Ke : list) {
            KB kb = OLrzqt;
            java.util.Map<java.lang.String, java.lang.Object> mapOLrzqt = c5242Ke.OLrzqt();
            Intrinsics.copydefault(mapOLrzqt);
            java.lang.Object obj = mapOLrzqt.get(IdentifyOperation.SET.getOperationType());
            Intrinsics.copydefault(obj, "");
            linkedHashMap.putAll(kb.KWHzl(C56532yIw.AEQbTJ(obj)));
        }
        return linkedHashMap;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> KWHzl(@NotNull java.util.Map<java.lang.String, java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return C56424yEw.isConnected(linkedHashMap);
    }
}
