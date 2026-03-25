package o;

import com.okinc.network.request.RequestConfigNotFoundException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.roS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43392roS {
    public static final C43392roS EZpvd = new C43392roS();
    public static final ConcurrentHashMap<InterfaceC56551yJo<?>, java.util.List<InterfaceC43391roR>> KWHzl = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<C43390roQ<?>, java.lang.Object> copydefault = new ConcurrentHashMap<>();
    public static final int AEQbTJ = 8;

    private C43392roS() {
    }

    public static /* synthetic */ java.lang.Object getService$default(C43392roS c43392roS, InterfaceC56551yJo interfaceC56551yJo, InterfaceC43391roR interfaceC43391roR, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            interfaceC43391roR = null;
        }
        return c43392roS.OLrzqt(interfaceC56551yJo, interfaceC43391roR);
    }

    public final <T> T OLrzqt(@NotNull InterfaceC56551yJo<T> interfaceC56551yJo, InterfaceC43391roR interfaceC43391roR) {
        T t;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
            if (interfaceC43391roR == null) {
                InterfaceC43391roR interfaceC43391roRKWHzl = KWHzl(interfaceC56551yJo);
                if (interfaceC43391roRKWHzl == null) {
                    throw new RequestConfigNotFoundException(" No RequestConfig associated with " + interfaceC56551yJo + " ,please setup config at first");
                }
                t = (T) KWHzl(interfaceC56551yJo, interfaceC43391roRKWHzl);
            } else {
                if (!EZpvd(interfaceC56551yJo, interfaceC43391roR)) {
                    KWHzl(interfaceC56551yJo, interfaceC43391roR);
                }
                t = (T) KWHzl(interfaceC56551yJo, interfaceC43391roR);
            }
        }
        return t;
    }

    public final <T> T KWHzl(@NotNull InterfaceC56551yJo<T> interfaceC56551yJo, @NotNull InterfaceC43391roR interfaceC43391roR) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        Intrinsics.checkNotNullParameter(interfaceC43391roR, "");
        C43390roQ<?> c43390roQCopydefault = copydefault(interfaceC56551yJo, interfaceC43391roR);
        ConcurrentHashMap<C43390roQ<?>, java.lang.Object> concurrentHashMap = copydefault;
        T t = (T) concurrentHashMap.get(c43390roQCopydefault);
        if (t == null) {
            t = (T) interfaceC43391roR.createService(interfaceC56551yJo);
            concurrentHashMap.put(c43390roQCopydefault, t);
        }
        pUU.KWHzl("RequestHub", "getService()-->key:" + c43390roQCopydefault + "   service:" + t + ", size:" + concurrentHashMap.size());
        Intrinsics.copydefault(t, "");
        return t;
    }

    public final <T> void KWHzl(InterfaceC56551yJo<T> interfaceC56551yJo, InterfaceC43391roR... interfaceC43391roRArr) {
        if (!(interfaceC43391roRArr.length == 0)) {
            java.util.List<InterfaceC43391roR> listOLrzqt = OLrzqt(interfaceC56551yJo);
            if (listOLrzqt.size() > 16) {
                listOLrzqt.clear();
            }
            for (InterfaceC43391roR interfaceC43391roR : interfaceC43391roRArr) {
                if (!listOLrzqt.contains(interfaceC43391roR)) {
                    listOLrzqt.add(interfaceC43391roR);
                }
            }
        }
    }

    public final <T> boolean EZpvd(InterfaceC56551yJo<T> interfaceC56551yJo, InterfaceC43391roR interfaceC43391roR) {
        java.util.List<InterfaceC43391roR> list = KWHzl.get(interfaceC56551yJo);
        if (list != null) {
            return list.contains(interfaceC43391roR);
        }
        return false;
    }

    public final <T> InterfaceC43391roR KWHzl(InterfaceC56551yJo<T> interfaceC56551yJo) {
        java.util.List<InterfaceC43391roR> list = KWHzl.get(interfaceC56551yJo);
        if (list != null) {
            return (InterfaceC43391roR) CollectionsKt___CollectionsKt.AkhnZx(list, 0);
        }
        return null;
    }

    public final <T> java.util.List<InterfaceC43391roR> OLrzqt(InterfaceC56551yJo<T> interfaceC56551yJo) {
        ConcurrentHashMap<InterfaceC56551yJo<?>, java.util.List<InterfaceC43391roR>> concurrentHashMap = KWHzl;
        java.util.List<InterfaceC43391roR> list = concurrentHashMap.get(interfaceC56551yJo);
        if (list != null) {
            return list;
        }
        java.util.List<InterfaceC43391roR> listCopydefault = copydefault(16);
        concurrentHashMap.put(interfaceC56551yJo, listCopydefault);
        return listCopydefault;
    }

    public final java.util.List<InterfaceC43391roR> copydefault(int i) {
        return new java.util.ArrayList(i);
    }

    public final <T> C43390roQ<T> copydefault(InterfaceC56551yJo<T> interfaceC56551yJo, InterfaceC43391roR interfaceC43391roR) {
        return new C43390roQ<>(interfaceC56551yJo, interfaceC43391roR);
    }
}
