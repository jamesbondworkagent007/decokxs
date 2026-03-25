package com.amplifyframework.auth;

import j$.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import o.C5171Hl;
import o.C5173Hn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AWSTemporaryCredentials extends AWSCredentials {
    private final String accessKeyId;
    private final C5173Hn expiration;
    private final Instant expiresAt;
    private final String secretAccessKey;
    private final String sessionToken;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AWSTemporaryCredentials copy$default(AWSTemporaryCredentials aWSTemporaryCredentials, String str, String str2, String str3, C5173Hn c5173Hn, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aWSTemporaryCredentials.accessKeyId;
        }
        if ((i & 2) != 0) {
            str2 = aWSTemporaryCredentials.secretAccessKey;
        }
        if ((i & 4) != 0) {
            str3 = aWSTemporaryCredentials.sessionToken;
        }
        if ((i & 8) != 0) {
            c5173Hn = aWSTemporaryCredentials.expiration;
        }
        return aWSTemporaryCredentials.copy(str, str2, str3, c5173Hn);
    }

    public static /* synthetic */ void getExpiration$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accessKeyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.secretAccessKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.sessionToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn component4() {
        return this.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AWSTemporaryCredentials copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull C5173Hn c5173Hn) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(c5173Hn, "");
        return new AWSTemporaryCredentials(str, str2, str3, c5173Hn);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSTemporaryCredentials)) {
            return false;
        }
        AWSTemporaryCredentials aWSTemporaryCredentials = (AWSTemporaryCredentials) obj;
        return Intrinsics.EZpvd((Object) this.accessKeyId, (Object) aWSTemporaryCredentials.accessKeyId) && Intrinsics.EZpvd((Object) this.secretAccessKey, (Object) aWSTemporaryCredentials.secretAccessKey) && Intrinsics.EZpvd((Object) this.sessionToken, (Object) aWSTemporaryCredentials.sessionToken) && Intrinsics.EZpvd(this.expiration, aWSTemporaryCredentials.expiration);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.auth.AWSCredentials
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn getExpiration() {
        return this.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Instant getExpiresAt() {
        return this.expiresAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.auth.AWSCredentials
    public String getSecretAccessKey() {
        return this.secretAccessKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSessionToken() {
        return this.sessionToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.accessKeyId.hashCode() * 31) + this.secretAccessKey.hashCode()) * 31) + this.sessionToken.hashCode()) * 31) + this.expiration.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AWSTemporaryCredentials(accessKeyId=" + this.accessKeyId + ", secretAccessKey=" + this.secretAccessKey + ", sessionToken=" + this.sessionToken + ", expiration=" + this.expiration + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSTemporaryCredentials(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull C5173Hn c5173Hn) {
        super(str, str2);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(c5173Hn, "");
        this.accessKeyId = str;
        this.secretAccessKey = str2;
        this.sessionToken = str3;
        this.expiration = c5173Hn;
        this.expiresAt = C5171Hl.copydefault(c5173Hn);
    }
}
