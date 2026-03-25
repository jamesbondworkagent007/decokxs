package o;

import java.util.Collections;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: o.pVn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38350pVn {
    public static final int AEQbTJ;
    public static final java.util.Map<java.lang.Class<?>, InterfaceC38345pVi<?>> EZpvd;
    public static final C38350pVn KWHzl = new C38350pVn();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.Class<?>, InterfaceC38345pVi<?>> KWHzl() {
        return EZpvd;
    }

    private C38350pVn() {
    }

    public final InterfaceC38344pVh copydefault() {
        return new C38343pVg();
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(android.os.Bundle.class, new C38342pVf());
        linkedHashMap.put(android.content.Intent.class, new C38341pVe());
        EZpvd = Collections.unmodifiableMap(linkedHashMap);
        AEQbTJ = 8;
    }
}
