package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface ySA {
    InterfaceC56841yUh AEQbTJ(@NotNull C56935yXu c56935yXu);

    java.util.Set<C56935yXu> EZpvd();

    java.util.Set<C56935yXu> KWHzl();

    yTW OLrzqt(@NotNull C56935yXu c56935yXu);

    java.util.Collection<InterfaceC56835yUb> copydefault(@NotNull C56935yXu c56935yXu);

    java.util.Set<C56935yXu> copydefault();

    public static final class StateListAnimator implements ySA {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.ySA
        public InterfaceC56841yUh AEQbTJ(@NotNull C56935yXu c56935yXu) {
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.ySA
        public yTW OLrzqt(@NotNull C56935yXu c56935yXu) {
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            return null;
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/yXu;)Ljava/util/Collection; */
        @Override // o.ySA
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public java.util.List<InterfaceC56835yUb> copydefault(@NotNull C56935yXu c56935yXu) {
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            return yDY.AhwBna();
        }

        @Override // o.ySA
        public java.util.Set<C56935yXu> KWHzl() {
            return yEE.copydefault();
        }

        @Override // o.ySA
        public java.util.Set<C56935yXu> copydefault() {
            return yEE.copydefault();
        }

        @Override // o.ySA
        public java.util.Set<C56935yXu> EZpvd() {
            return yEE.copydefault();
        }
    }
}
