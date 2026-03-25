package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zfT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC59353zfT {
    boolean EZpvd(@NotNull yNG yng);

    java.lang.String KWHzl(@NotNull yNG yng);

    java.lang.String copydefault();

    /* JADX INFO: renamed from: o.zfT$Activity */
    public static final class Activity {
        public static java.lang.String EZpvd(@NotNull InterfaceC59353zfT interfaceC59353zfT, @NotNull yNG yng) {
            Intrinsics.checkNotNullParameter(yng, "");
            if (interfaceC59353zfT.EZpvd(yng)) {
                return null;
            }
            return interfaceC59353zfT.copydefault();
        }
    }
}
