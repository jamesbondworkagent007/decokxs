package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yRB<T> implements yRA<T> {
    public final java.util.Map<C56933yXs, T> KWHzl;
    public final LockBasedStorageManager OLrzqt;
    public final InterfaceC59179zcE<C56933yXs, T> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<o.yXs, ? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public yRB(@NotNull java.util.Map<C56933yXs, ? extends T> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.KWHzl = map;
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Java nullability annotation states");
        this.OLrzqt = lockBasedStorageManager;
        InterfaceC59179zcE<C56933yXs, T> interfaceC59179zcEOLrzqt = lockBasedStorageManager.OLrzqt(new yRD(this));
        Intrinsics.checkNotNullExpressionValue(interfaceC59179zcEOLrzqt, "");
        this.copydefault = interfaceC59179zcEOLrzqt;
    }

    public static final java.lang.Object OLrzqt(yRB yrb, C56933yXs c56933yXs) {
        Intrinsics.copydefault(c56933yXs);
        return C56931yXq.copydefault(c56933yXs, yrb.KWHzl);
    }

    @Override // o.yRA
    public T copydefault(@NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        return this.copydefault.invoke(c56933yXs);
    }
}
