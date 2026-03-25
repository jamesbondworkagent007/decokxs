package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface yNP extends InterfaceC56665yNu {
    AbstractC56640yMw AEQbTJ();

    boolean EZpvd(@NotNull yNP ynp);

    java.util.List<yNP> KWHzl();

    <T> T OLrzqt(@NotNull yNN<T> ynn);

    java.util.Collection<C56933yXs> OLrzqt(@NotNull C56933yXs c56933yXs, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1);

    yNY copydefault(@NotNull C56933yXs c56933yXs);

    public static final class Application {
        public static InterfaceC56665yNu OLrzqt(@NotNull yNP ynp) {
            return null;
        }

        public static <R, D> R AEQbTJ(@NotNull yNP ynp, @NotNull InterfaceC56667yNw<R, D> interfaceC56667yNw, D d) {
            Intrinsics.checkNotNullParameter(interfaceC56667yNw, "");
            return interfaceC56667yNw.OLrzqt(ynp, d);
        }
    }
}
