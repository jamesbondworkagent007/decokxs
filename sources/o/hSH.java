package o;

import kotlin.jvm.internal.Intrinsics;
import o.kMU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface hSH extends kMU {

    public static final class ActionBar {
        public static boolean AEQbTJ(@NotNull hSH hsh, @NotNull kMU kmu) {
            Intrinsics.checkNotNullParameter(kmu, "");
            return kMU.TaskDescription.AEQbTJ(hsh, kmu);
        }

        public static java.lang.Object KWHzl(@NotNull hSH hsh, @NotNull kMU kmu) {
            Intrinsics.checkNotNullParameter(kmu, "");
            return kMU.TaskDescription.EZpvd(hsh, kmu);
        }

        public static boolean copydefault(@NotNull hSH hsh, @NotNull kMU kmu) {
            Intrinsics.checkNotNullParameter(kmu, "");
            return kMU.TaskDescription.KWHzl(hsh, kmu);
        }
    }
}
