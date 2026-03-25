package o;

import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qUc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC40391qUc<T> {
    SoftReference<java.util.Map<java.lang.String, T>> EZpvd();

    void OLrzqt(SoftReference<java.util.Map<java.lang.String, T>> softReference);

    /* JADX INFO: renamed from: o.qUc$ActionBar */
    public static final class ActionBar {
        public static <T> void OLrzqt(@NotNull InterfaceC40391qUc<T> interfaceC40391qUc, @NotNull java.util.Map<java.lang.String, ? extends T> map) {
            Intrinsics.checkNotNullParameter(map, "");
            synchronized (interfaceC40391qUc) {
                SoftReference<java.util.Map<java.lang.String, T>> softReferenceEZpvd = interfaceC40391qUc.EZpvd();
                java.util.Map<java.lang.String, T> map2 = softReferenceEZpvd != null ? softReferenceEZpvd.get() : null;
                if (map2 == null) {
                    interfaceC40391qUc.OLrzqt(new SoftReference<>(new ConcurrentHashMap(map)));
                } else {
                    map2.putAll(map);
                }
                Unit unit = Unit.INSTANCE;
            }
        }

        public static <T> java.util.Map<java.lang.String, T> copydefault(@NotNull InterfaceC40391qUc<T> interfaceC40391qUc) {
            SoftReference<java.util.Map<java.lang.String, T>> softReferenceEZpvd = interfaceC40391qUc.EZpvd();
            java.util.Map<java.lang.String, T> map = softReferenceEZpvd != null ? softReferenceEZpvd.get() : null;
            return map == null ? C56424yEw.KWHzl() : map;
        }

        public static <T> T copydefault(@NotNull InterfaceC40391qUc<T> interfaceC40391qUc, @NotNull java.lang.String str) {
            java.util.Map<java.lang.String, T> map;
            Intrinsics.checkNotNullParameter(str, "");
            SoftReference<java.util.Map<java.lang.String, T>> softReferenceEZpvd = interfaceC40391qUc.EZpvd();
            if (softReferenceEZpvd == null || (map = softReferenceEZpvd.get()) == null) {
                return null;
            }
            return map.get(str);
        }
    }
}
