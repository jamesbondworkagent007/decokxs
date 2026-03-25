package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface yOL extends java.lang.Iterable<yOJ>, InterfaceC56535yIz {
    public static final Application KWHzl = Application.AEQbTJ;

    boolean AEQbTJ();

    yOJ EZpvd(@NotNull C56933yXs c56933yXs);

    boolean copydefault(@NotNull C56933yXs c56933yXs);

    public static final class Activity {
        public static boolean OLrzqt(@NotNull yOL yol, @NotNull C56933yXs c56933yXs) {
            Intrinsics.checkNotNullParameter(c56933yXs, "");
            return yol.EZpvd(c56933yXs) != null;
        }

        public static yOJ EZpvd(@NotNull yOL yol, @NotNull C56933yXs c56933yXs) {
            yOJ next;
            Intrinsics.checkNotNullParameter(c56933yXs, "");
            java.util.Iterator<yOJ> it = yol.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd(next.KWHzl(), c56933yXs)) {
                    break;
                }
            }
            return next;
        }
    }

    public static final class Application {
        public static final /* synthetic */ Application AEQbTJ = new Application();
        public static final yOL copydefault = new C1002Application();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final yOL OLrzqt() {
            return copydefault;
        }

        /* JADX INFO: renamed from: o.yOL$Application$Application, reason: collision with other inner class name */
        public static final class C1002Application implements yOL {
            @Override // o.yOL
            public boolean AEQbTJ() {
                return true;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.Void OLrzqt(C56933yXs c56933yXs) {
                Intrinsics.checkNotNullParameter(c56933yXs, "");
                return null;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "EMPTY";
            }

            @Override // o.yOL
            public /* synthetic */ yOJ EZpvd(C56933yXs c56933yXs) {
                return (yOJ) OLrzqt(c56933yXs);
            }

            @Override // o.yOL
            public boolean copydefault(C56933yXs c56933yXs) {
                return Activity.OLrzqt(this, c56933yXs);
            }

            @Override // java.lang.Iterable
            public java.util.Iterator<yOJ> iterator() {
                return yDY.AhwBna().iterator();
            }
        }

        private Application() {
        }

        public final yOL EZpvd(@NotNull java.util.List<? extends yOJ> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return list.isEmpty() ? copydefault : new yOO(list);
        }
    }
}
