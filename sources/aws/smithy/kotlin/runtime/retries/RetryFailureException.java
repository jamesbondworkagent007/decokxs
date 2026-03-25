package aws.smithy.kotlin.runtime.retries;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class RetryFailureException extends RetryException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetryFailureException(@NotNull String str, Throwable th, int i, Object obj) {
        super(str, th, i, obj, null, null);
        Intrinsics.checkNotNullParameter(str, "");
    }
}
