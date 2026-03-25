package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface kMU {
    boolean compareContent(@NotNull kMU kmu);

    boolean compareId(@NotNull kMU kmu);

    java.lang.Object getChangePayload(@NotNull kMU kmu);

    public static final class TaskDescription {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static java.lang.Object EZpvd(@NotNull kMU kmu, @NotNull kMU kmu2) {
            Intrinsics.checkNotNullParameter(kmu2, "");
            return null;
        }

        public static boolean KWHzl(@NotNull kMU kmu, @NotNull kMU kmu2) {
            Intrinsics.checkNotNullParameter(kmu2, "");
            return Intrinsics.EZpvd(kmu, kmu2);
        }

        public static boolean AEQbTJ(@NotNull kMU kmu, @NotNull kMU kmu2) {
            Intrinsics.checkNotNullParameter(kmu2, "");
            return Intrinsics.EZpvd(kmu, kmu2);
        }
    }
}
