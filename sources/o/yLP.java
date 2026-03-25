package o;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yLP {
    public static final ConcurrentMap<yLZ, WeakReference<C56731yQf>> AEQbTJ = new ConcurrentHashMap();

    public static final C56731yQf copydefault(@NotNull java.lang.Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        java.lang.ClassLoader classLoaderCopydefault = C56743yQr.copydefault(cls);
        yLZ ylz = new yLZ(classLoaderCopydefault);
        ConcurrentMap<yLZ, WeakReference<C56731yQf>> concurrentMap = AEQbTJ;
        WeakReference<C56731yQf> weakReference = concurrentMap.get(ylz);
        if (weakReference != null) {
            C56731yQf c56731yQf = weakReference.get();
            if (c56731yQf != null) {
                return c56731yQf;
            }
            concurrentMap.remove(ylz, weakReference);
        }
        C56731yQf c56731yQfOLrzqt = C56731yQf.OLrzqt.OLrzqt(classLoaderCopydefault);
        while (true) {
            try {
                ConcurrentMap<yLZ, WeakReference<C56731yQf>> concurrentMap2 = AEQbTJ;
                WeakReference<C56731yQf> weakReferencePutIfAbsent = concurrentMap2.putIfAbsent(ylz, new WeakReference<>(c56731yQfOLrzqt));
                if (weakReferencePutIfAbsent == null) {
                    return c56731yQfOLrzqt;
                }
                C56731yQf c56731yQf2 = weakReferencePutIfAbsent.get();
                if (c56731yQf2 != null) {
                    return c56731yQf2;
                }
                concurrentMap2.remove(ylz, weakReferencePutIfAbsent);
            } finally {
                ylz.KWHzl(null);
            }
        }
    }
}
