package com.reown.android.verify.model;

import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@JsonClass(generateAdapter = true)
public final class RegisterAttestationBody {
    public final String attestationId;
    public final String origin;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RegisterAttestationBody copy$default(RegisterAttestationBody registerAttestationBody, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = registerAttestationBody.attestationId;
        }
        if ((i & 2) != 0) {
            str2 = registerAttestationBody.origin;
        }
        return registerAttestationBody.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.attestationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RegisterAttestationBody copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new RegisterAttestationBody(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterAttestationBody)) {
            return false;
        }
        RegisterAttestationBody registerAttestationBody = (RegisterAttestationBody) obj;
        return Intrinsics.EZpvd((Object) this.attestationId, (Object) registerAttestationBody.attestationId) && Intrinsics.EZpvd((Object) this.origin, (Object) registerAttestationBody.origin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAttestationId() {
        return this.attestationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrigin() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.attestationId.hashCode() * 31) + this.origin.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RegisterAttestationBody(attestationId=" + this.attestationId + ", origin=" + this.origin + ")";
    }

    public RegisterAttestationBody(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.attestationId = str;
        this.origin = str2;
    }
}
