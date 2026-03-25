package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface yXY {
    java.lang.String AEQbTJ(@NotNull InterfaceC56663yNs interfaceC56663yNs, @NotNull yXX yxx);

    public static final class Application implements yXY {
        public static final Application OLrzqt = new Application();

        private Application() {
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:12:? */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, o.yNs] */
        /* JADX WARN: Type inference failed for: r3v1, types: [o.yNQ, o.yNu] */
        /* JADX WARN: Type inference failed for: r3v2, types: [o.yNu] */
        @Override // o.yXY
        public java.lang.String AEQbTJ(@NotNull InterfaceC56663yNs interfaceC56663yNs, @NotNull yXX yxx) {
            Intrinsics.checkNotNullParameter(interfaceC56663yNs, "");
            Intrinsics.checkNotNullParameter(yxx, "");
            if (interfaceC56663yNs instanceof InterfaceC56691yOt) {
                C56935yXu c56935yXuBR_ = ((InterfaceC56691yOt) interfaceC56663yNs).bR_();
                Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
                return yxx.EZpvd(c56935yXuBR_, false);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            do {
                arrayList.add(interfaceC56663yNs.bR_());
                interfaceC56663yNs = interfaceC56663yNs.AuCTel();
            } while (interfaceC56663yNs instanceof InterfaceC56658yNn);
            return C56965yYx.KWHzl(C56405yEd.zLjUOn(arrayList));
        }
    }

    public static final class StateListAnimator implements yXY {
        public static final StateListAnimator OLrzqt = new StateListAnimator();

        private StateListAnimator() {
        }

        @Override // o.yXY
        public java.lang.String AEQbTJ(@NotNull InterfaceC56663yNs interfaceC56663yNs, @NotNull yXX yxx) {
            Intrinsics.checkNotNullParameter(interfaceC56663yNs, "");
            Intrinsics.checkNotNullParameter(yxx, "");
            if (interfaceC56663yNs instanceof InterfaceC56691yOt) {
                C56935yXu c56935yXuBR_ = ((InterfaceC56691yOt) interfaceC56663yNs).bR_();
                Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
                return yxx.EZpvd(c56935yXuBR_, false);
            }
            C56930yXp c56930yXpAEQbTJ = yYH.AEQbTJ(interfaceC56663yNs);
            Intrinsics.checkNotNullExpressionValue(c56930yXpAEQbTJ, "");
            return yxx.copydefault(c56930yXpAEQbTJ);
        }
    }

    public static final class Activity implements yXY {
        public static final Activity KWHzl = new Activity();

        private Activity() {
        }

        @Override // o.yXY
        public java.lang.String AEQbTJ(@NotNull InterfaceC56663yNs interfaceC56663yNs, @NotNull yXX yxx) {
            Intrinsics.checkNotNullParameter(interfaceC56663yNs, "");
            Intrinsics.checkNotNullParameter(yxx, "");
            return EZpvd(interfaceC56663yNs);
        }

        public final java.lang.String EZpvd(InterfaceC56663yNs interfaceC56663yNs) {
            C56935yXu c56935yXuBR_ = interfaceC56663yNs.bR_();
            Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
            java.lang.String strEZpvd = C56965yYx.EZpvd(c56935yXuBR_);
            if (interfaceC56663yNs instanceof InterfaceC56691yOt) {
                return strEZpvd;
            }
            InterfaceC56665yNu interfaceC56665yNuAYXKKw = interfaceC56663yNs.AuCTel();
            Intrinsics.checkNotNullExpressionValue(interfaceC56665yNuAYXKKw, "");
            java.lang.String strKWHzl = KWHzl(interfaceC56665yNuAYXKKw);
            if (strKWHzl == null || Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) "")) {
                return strEZpvd;
            }
            return strKWHzl + '.' + strEZpvd;
        }

        public final java.lang.String KWHzl(InterfaceC56665yNu interfaceC56665yNu) {
            if (interfaceC56665yNu instanceof InterfaceC56658yNn) {
                return EZpvd((InterfaceC56663yNs) interfaceC56665yNu);
            }
            if (interfaceC56665yNu instanceof yNW) {
                return C56965yYx.AEQbTJ(((yNW) interfaceC56665yNu).KWHzl().AYXKKw());
            }
            return null;
        }
    }
}
