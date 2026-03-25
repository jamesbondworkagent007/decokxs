package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC59307zea {
    void EZpvd(@NotNull InterfaceC56690yOs interfaceC56690yOs, InterfaceC56691yOt interfaceC56691yOt, @NotNull AbstractC59233zdF abstractC59233zdF);

    void KWHzl(@NotNull InterfaceC56690yOs interfaceC56690yOs);

    void OLrzqt(@NotNull yOJ yoj);

    void copydefault(@NotNull TypeSubstitutor typeSubstitutor, @NotNull AbstractC59233zdF abstractC59233zdF, @NotNull AbstractC59233zdF abstractC59233zdF2, @NotNull InterfaceC56691yOt interfaceC56691yOt);

    /* JADX INFO: renamed from: o.zea$ActionBar */
    public static final class ActionBar implements InterfaceC59307zea {
        public static final ActionBar KWHzl = new ActionBar();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC59307zea
        public void EZpvd(@NotNull InterfaceC56690yOs interfaceC56690yOs, InterfaceC56691yOt interfaceC56691yOt, @NotNull AbstractC59233zdF abstractC59233zdF) {
            Intrinsics.checkNotNullParameter(interfaceC56690yOs, "");
            Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC59307zea
        public void KWHzl(@NotNull InterfaceC56690yOs interfaceC56690yOs) {
            Intrinsics.checkNotNullParameter(interfaceC56690yOs, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC59307zea
        public void OLrzqt(@NotNull yOJ yoj) {
            Intrinsics.checkNotNullParameter(yoj, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC59307zea
        public void copydefault(@NotNull TypeSubstitutor typeSubstitutor, @NotNull AbstractC59233zdF abstractC59233zdF, @NotNull AbstractC59233zdF abstractC59233zdF2, @NotNull InterfaceC56691yOt interfaceC56691yOt) {
            Intrinsics.checkNotNullParameter(typeSubstitutor, "");
            Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
            Intrinsics.checkNotNullParameter(abstractC59233zdF2, "");
            Intrinsics.checkNotNullParameter(interfaceC56691yOt, "");
        }

        private ActionBar() {
        }
    }
}
