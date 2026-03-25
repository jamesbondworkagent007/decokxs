package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yOn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC56685yOn {
    java.util.Collection<AbstractC59233zdF> AEQbTJ(@NotNull InterfaceC59315zei interfaceC59315zei, @NotNull java.util.Collection<? extends AbstractC59233zdF> collection, @NotNull Function1<? super InterfaceC59315zei, ? extends java.lang.Iterable<? extends AbstractC59233zdF>> function1, @NotNull Function1<? super AbstractC59233zdF, Unit> function12);

    /* JADX INFO: renamed from: o.yOn$Activity */
    public static final class Activity implements InterfaceC56685yOn {
        public static final Activity KWHzl = new Activity();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Collection<? extends o.zdF> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC56685yOn
        public java.util.Collection<AbstractC59233zdF> AEQbTJ(@NotNull InterfaceC59315zei interfaceC59315zei, @NotNull java.util.Collection<? extends AbstractC59233zdF> collection, @NotNull Function1<? super InterfaceC59315zei, ? extends java.lang.Iterable<? extends AbstractC59233zdF>> function1, @NotNull Function1<? super AbstractC59233zdF, Unit> function12) {
            Intrinsics.checkNotNullParameter(interfaceC59315zei, "");
            Intrinsics.checkNotNullParameter(collection, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            return collection;
        }

        private Activity() {
        }
    }
}
