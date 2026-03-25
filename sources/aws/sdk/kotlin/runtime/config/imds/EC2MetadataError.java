package aws.sdk.kotlin.runtime.config.imds;

import aws.sdk.kotlin.runtime.AwsServiceException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class EC2MetadataError extends AwsServiceException {
    private final int statusCode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatusCode() {
        return this.statusCode;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EC2MetadataError(int i, @NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
        this.statusCode = i;
    }
}
