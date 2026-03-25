package com.keystone.module;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class AptosSignature {
    private final String authenticationPublicKey;
    private final String requestId;
    private final String signature;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AptosSignature copy$default(AptosSignature aptosSignature, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aptosSignature.requestId;
        }
        if ((i & 2) != 0) {
            str2 = aptosSignature.signature;
        }
        if ((i & 4) != 0) {
            str3 = aptosSignature.authenticationPublicKey;
        }
        return aptosSignature.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.authenticationPublicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AptosSignature copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new AptosSignature(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AptosSignature)) {
            return false;
        }
        AptosSignature aptosSignature = (AptosSignature) obj;
        return Intrinsics.EZpvd((Object) this.requestId, (Object) aptosSignature.requestId) && Intrinsics.EZpvd((Object) this.signature, (Object) aptosSignature.signature) && Intrinsics.EZpvd((Object) this.authenticationPublicKey, (Object) aptosSignature.authenticationPublicKey);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAuthenticationPublicKey() {
        return this.authenticationPublicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.requestId.hashCode() * 31) + this.signature.hashCode()) * 31) + this.authenticationPublicKey.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AptosSignature(requestId=" + this.requestId + ", signature=" + this.signature + ", authenticationPublicKey=" + this.authenticationPublicKey + ')';
    }

    public AptosSignature(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.requestId = str;
        this.signature = str2;
        this.authenticationPublicKey = str3;
    }
}
