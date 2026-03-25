package o;

import com.amplitude.common.Logger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class KY {
    public static final void EZpvd(@NotNull java.lang.Exception exc, @NotNull Logger logger, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(exc, "");
        Intrinsics.checkNotNullParameter(logger, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String message = exc.getMessage();
        if (message != null) {
            logger.EZpvd(str + ": " + message);
        }
        if (exc.getStackTrace() != null) {
            logger.EZpvd("Stack trace: " + C56379yDe.AEQbTJ(exc));
        }
    }
}
