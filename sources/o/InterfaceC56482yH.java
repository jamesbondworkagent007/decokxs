package o;

import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC56482yH<T> {
    java.util.Set<Map.Entry<java.lang.String, java.util.List<T>>> AEQbTJ();

    boolean AEQbTJ(@NotNull java.lang.String str);

    void EZpvd(@NotNull Function2<? super java.lang.String, ? super java.util.List<? extends T>, Unit> function2);

    boolean EZpvd();

    java.util.List<T> KWHzl(@NotNull java.lang.String str);

    boolean KWHzl();

    java.util.Set<java.lang.String> OLrzqt();

    T copydefault(@NotNull java.lang.String str);

    /* JADX INFO: renamed from: o.yH$Application */
    public static final class Application {
        public static <T> T KWHzl(@NotNull InterfaceC56482yH<T> interfaceC56482yH, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            java.util.List<T> listKWHzl = interfaceC56482yH.KWHzl(str);
            if (listKWHzl != null) {
                return (T) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl);
            }
            return null;
        }

        public static <T> void OLrzqt(@NotNull InterfaceC56482yH<T> interfaceC56482yH, @NotNull Function2<? super java.lang.String, ? super java.util.List<? extends T>, Unit> function2) {
            Intrinsics.checkNotNullParameter(function2, "");
            java.util.Iterator<T> it = interfaceC56482yH.AEQbTJ().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                function2.invoke((java.lang.String) entry.getKey(), (java.util.List) entry.getValue());
            }
        }
    }
}
