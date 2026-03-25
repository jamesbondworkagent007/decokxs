package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yVF {
    public final java.util.Map<java.lang.Integer, C56857yUx> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.Integer, C56857yUx> AEQbTJ() {
        return this.KWHzl;
    }

    public yVF(@NotNull java.util.Map<java.lang.Integer, C56857yUx> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.KWHzl = map;
    }

    public final yVF EZpvd() {
        java.util.Map<java.lang.Integer, C56857yUx> map = this.KWHzl;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), C56857yUx.copy$default((C56857yUx) entry.getValue(), null, null, false, true, 7, null));
        }
        return new yVF(linkedHashMap);
    }
}
