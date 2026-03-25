package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yRo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC56767yRo {
    void OLrzqt(@NotNull InterfaceC56780ySa interfaceC56780ySa);

    /* JADX INFO: renamed from: o.yRo$Activity */
    public static final class Activity implements InterfaceC56767yRo {
        public static final Activity copydefault = new Activity();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56767yRo
        public void OLrzqt(@NotNull InterfaceC56780ySa interfaceC56780ySa) {
            Intrinsics.checkNotNullParameter(interfaceC56780ySa, "");
        }

        private Activity() {
        }
    }
}
