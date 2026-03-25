package com.okinc.wallet.core.sign;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class VerifyMessageParams {
    public static final int $stable = 0;
    private final boolean addPrefix;
    private final String address;
    private final String message;
    private final String signature;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VerifyMessageParams copy$default(VerifyMessageParams verifyMessageParams, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verifyMessageParams.address;
        }
        if ((i & 2) != 0) {
            str2 = verifyMessageParams.message;
        }
        if ((i & 4) != 0) {
            z = verifyMessageParams.addPrefix;
        }
        if ((i & 8) != 0) {
            str3 = verifyMessageParams.signature;
        }
        return verifyMessageParams.copy(str, str2, z, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.addPrefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VerifyMessageParams copy(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new VerifyMessageParams(str, str2, z, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyMessageParams)) {
            return false;
        }
        VerifyMessageParams verifyMessageParams = (VerifyMessageParams) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) verifyMessageParams.address) && Intrinsics.EZpvd((Object) this.message, (Object) verifyMessageParams.message) && this.addPrefix == verifyMessageParams.addPrefix && Intrinsics.EZpvd((Object) this.signature, (Object) verifyMessageParams.signature);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAddPrefix() {
        return this.addPrefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.address.hashCode() * 31) + this.message.hashCode()) * 31) + Boolean.hashCode(this.addPrefix)) * 31) + this.signature.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VerifyMessageParams(address=" + this.address + ", message=" + this.message + ", addPrefix=" + this.addPrefix + ", signature=" + this.signature + ")";
    }

    public VerifyMessageParams(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.address = str;
        this.message = str2;
        this.addPrefix = z;
        this.signature = str3;
    }
}
