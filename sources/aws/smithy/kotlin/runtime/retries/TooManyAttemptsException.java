package aws.smithy.kotlin.runtime.retries;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class TooManyAttemptsException extends RetryException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooManyAttemptsException(@NotNull String str, Throwable th, int i, Object obj, Throwable th2) {
        super(str, th, i, obj, th2, null);
        Intrinsics.checkNotNullParameter(str, "");
    }
}
