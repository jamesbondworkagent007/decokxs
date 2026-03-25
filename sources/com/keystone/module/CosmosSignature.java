package com.keystone.module;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class CosmosSignature {
    private final String publicKey;
    private final String requestId;
    private final String signature;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CosmosSignature copy$default(CosmosSignature cosmosSignature, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cosmosSignature.requestId;
        }
        if ((i & 2) != 0) {
            str2 = cosmosSignature.signature;
        }
        if ((i & 4) != 0) {
            str3 = cosmosSignature.publicKey;
        }
        return cosmosSignature.copy(str, str2, str3);
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
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CosmosSignature copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new CosmosSignature(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CosmosSignature)) {
            return false;
        }
        CosmosSignature cosmosSignature = (CosmosSignature) obj;
        return Intrinsics.EZpvd((Object) this.requestId, (Object) cosmosSignature.requestId) && Intrinsics.EZpvd((Object) this.signature, (Object) cosmosSignature.signature) && Intrinsics.EZpvd((Object) this.publicKey, (Object) cosmosSignature.publicKey);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPublicKey() {
        return this.publicKey;
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
        return (((this.requestId.hashCode() * 31) + this.signature.hashCode()) * 31) + this.publicKey.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CosmosSignature(requestId=" + this.requestId + ", signature=" + this.signature + ", publicKey=" + this.publicKey + ')';
    }

    public CosmosSignature(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.requestId = str;
        this.signature = str2;
        this.publicKey = str3;
    }
}
