package aws.smithy.kotlin.runtime.auth.awssigning;

import aws.smithy.kotlin.runtime.ClientException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class UnsupportedSigningAlgorithmException extends ClientException {
    private final AwsSigningAlgorithm signingAlgorithm;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AwsSigningAlgorithm getSigningAlgorithm() {
        return this.signingAlgorithm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsupportedSigningAlgorithmException(@NotNull String str, @NotNull AwsSigningAlgorithm awsSigningAlgorithm) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(awsSigningAlgorithm, "");
        this.signingAlgorithm = awsSigningAlgorithm;
    }
}
