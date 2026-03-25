package aws.smithy.kotlin.runtime.retries;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class TimedOutException extends RetryException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimedOutException(@NotNull String str, int i, Object obj, Throwable th) {
        super(str, null, i, obj, th, null);
        Intrinsics.checkNotNullParameter(str, "");
    }
}
