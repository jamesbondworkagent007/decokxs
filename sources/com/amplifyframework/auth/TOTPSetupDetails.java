package com.amplifyframework.auth;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class TOTPSetupDetails {
    private final String sharedSecret;
    private final String username;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TOTPSetupDetails copy$default(TOTPSetupDetails tOTPSetupDetails, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tOTPSetupDetails.sharedSecret;
        }
        if ((i & 2) != 0) {
            str2 = tOTPSetupDetails.username;
        }
        return tOTPSetupDetails.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sharedSecret;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TOTPSetupDetails copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TOTPSetupDetails(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TOTPSetupDetails)) {
            return false;
        }
        TOTPSetupDetails tOTPSetupDetails = (TOTPSetupDetails) obj;
        return Intrinsics.EZpvd((Object) this.sharedSecret, (Object) tOTPSetupDetails.sharedSecret) && Intrinsics.EZpvd((Object) this.username, (Object) tOTPSetupDetails.username);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Uri getSetupURI(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return getSetupURI$default(this, str, null, 2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSharedSecret() {
        return this.sharedSecret;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsername() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.sharedSecret.hashCode() * 31) + this.username.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TOTPSetupDetails(sharedSecret=" + this.sharedSecret + ", username=" + this.username + ")";
    }

    public TOTPSetupDetails(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.sharedSecret = str;
        this.username = str2;
    }

    public static /* synthetic */ Uri getSetupURI$default(TOTPSetupDetails tOTPSetupDetails, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = tOTPSetupDetails.username;
        }
        return tOTPSetupDetails.getSetupURI(str, str2);
    }

    public final Uri getSetupURI(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Uri uri = Uri.parse("otpauth://totp/" + str + ":" + str2 + "?secret=" + this.sharedSecret + "&issuer=" + str);
        Intrinsics.checkNotNullExpressionValue(uri, "");
        return uri;
    }
}
