package com.amplifyframework.auth.cognito.result;

import com.amplifyframework.auth.AWSTemporaryCredentials;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class FederateToIdentityPoolResult {
    private final AWSTemporaryCredentials credentials;
    private final String identityId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FederateToIdentityPoolResult copy$default(FederateToIdentityPoolResult federateToIdentityPoolResult, String str, AWSTemporaryCredentials aWSTemporaryCredentials, int i, Object obj) {
        if ((i & 1) != 0) {
            str = federateToIdentityPoolResult.identityId;
        }
        if ((i & 2) != 0) {
            aWSTemporaryCredentials = federateToIdentityPoolResult.credentials;
        }
        return federateToIdentityPoolResult.copy(str, aWSTemporaryCredentials);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.identityId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AWSTemporaryCredentials component2() {
        return this.credentials;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FederateToIdentityPoolResult copy(@NotNull String str, @NotNull AWSTemporaryCredentials aWSTemporaryCredentials) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aWSTemporaryCredentials, "");
        return new FederateToIdentityPoolResult(str, aWSTemporaryCredentials);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FederateToIdentityPoolResult)) {
            return false;
        }
        FederateToIdentityPoolResult federateToIdentityPoolResult = (FederateToIdentityPoolResult) obj;
        return Intrinsics.EZpvd((Object) this.identityId, (Object) federateToIdentityPoolResult.identityId) && Intrinsics.EZpvd(this.credentials, federateToIdentityPoolResult.credentials);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AWSTemporaryCredentials getCredentials() {
        return this.credentials;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIdentityId() {
        return this.identityId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.identityId.hashCode() * 31) + this.credentials.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FederateToIdentityPoolResult(identityId=" + this.identityId + ", credentials=" + this.credentials + ")";
    }

    public FederateToIdentityPoolResult(@NotNull String str, @NotNull AWSTemporaryCredentials aWSTemporaryCredentials) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aWSTemporaryCredentials, "");
        this.identityId = str;
        this.credentials = aWSTemporaryCredentials;
    }
}
