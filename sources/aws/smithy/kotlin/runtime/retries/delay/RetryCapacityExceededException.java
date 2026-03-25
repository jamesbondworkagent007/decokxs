package aws.smithy.kotlin.runtime.retries.delay;

import aws.smithy.kotlin.runtime.ClientException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class RetryCapacityExceededException extends ClientException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetryCapacityExceededException(@NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
    }
}
