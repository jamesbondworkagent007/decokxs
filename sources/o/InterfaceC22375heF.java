package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.heF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC22375heF {

    /* JADX INFO: renamed from: o.heF$Activity */
    public static final class Activity implements InterfaceC22375heF {
        public final java.util.List<hSE> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<hSE> EZpvd() {
            return this.OLrzqt;
        }

        public Activity(@NotNull java.util.List<hSE> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = list;
        }
    }

    /* JADX INFO: renamed from: o.heF$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC22375heF {
        public static final StateListAnimator OLrzqt = new StateListAnimator();

        private StateListAnimator() {
        }
    }
}
