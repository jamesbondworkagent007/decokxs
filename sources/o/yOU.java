package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface yOU {
    java.util.Collection<InterfaceC56687yOp> AEQbTJ(@NotNull C56935yXu c56935yXu, @NotNull InterfaceC56658yNn interfaceC56658yNn);

    java.util.Collection<InterfaceC56656yNl> KWHzl(@NotNull InterfaceC56658yNn interfaceC56658yNn);

    java.util.Collection<AbstractC59233zdF> OLrzqt(@NotNull InterfaceC56658yNn interfaceC56658yNn);

    java.util.Collection<C56935yXu> copydefault(@NotNull InterfaceC56658yNn interfaceC56658yNn);

    public static final class Application implements yOU {
        public static final Application EZpvd = new Application();

        private Application() {
        }

        @Override // o.yOU
        public java.util.Collection<AbstractC59233zdF> OLrzqt(@NotNull InterfaceC56658yNn interfaceC56658yNn) {
            Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
            return yDY.AhwBna();
        }

        @Override // o.yOU
        public java.util.Collection<InterfaceC56687yOp> AEQbTJ(@NotNull C56935yXu c56935yXu, @NotNull InterfaceC56658yNn interfaceC56658yNn) {
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
            return yDY.AhwBna();
        }

        @Override // o.yOU
        public java.util.Collection<C56935yXu> copydefault(@NotNull InterfaceC56658yNn interfaceC56658yNn) {
            Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
            return yDY.AhwBna();
        }

        @Override // o.yOU
        public java.util.Collection<InterfaceC56656yNl> KWHzl(@NotNull InterfaceC56658yNn interfaceC56658yNn) {
            Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
            return yDY.AhwBna();
        }
    }
}
