package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface yOV {
    boolean copydefault(@NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull InterfaceC56687yOp interfaceC56687yOp);

    public static final class StateListAnimator implements yOV {
        public static final StateListAnimator copydefault = new StateListAnimator();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.yOV
        public boolean copydefault(@NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull InterfaceC56687yOp interfaceC56687yOp) {
            Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
            Intrinsics.checkNotNullParameter(interfaceC56687yOp, "");
            return true;
        }

        private StateListAnimator() {
        }
    }

    public static final class TaskDescription implements yOV {
        public static final TaskDescription AEQbTJ = new TaskDescription();

        private TaskDescription() {
        }

        @Override // o.yOV
        public boolean copydefault(@NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull InterfaceC56687yOp interfaceC56687yOp) {
            Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
            Intrinsics.checkNotNullParameter(interfaceC56687yOp, "");
            return !interfaceC56687yOp.copydefault().copydefault(yOZ.KWHzl());
        }
    }
}
