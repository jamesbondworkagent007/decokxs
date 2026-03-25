package com.amplifyframework.statemachine.codegen.data;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C56548yJl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SignInTOTPSetupData {
    private final String secretCode;
    private final String session;
    private final String username;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SignInTOTPSetupData copy$default(SignInTOTPSetupData signInTOTPSetupData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signInTOTPSetupData.secretCode;
        }
        if ((i & 2) != 0) {
            str2 = signInTOTPSetupData.session;
        }
        if ((i & 4) != 0) {
            str3 = signInTOTPSetupData.username;
        }
        return signInTOTPSetupData.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.secretCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.session;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignInTOTPSetupData copy(@NotNull String str, String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SignInTOTPSetupData(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignInTOTPSetupData)) {
            return false;
        }
        SignInTOTPSetupData signInTOTPSetupData = (SignInTOTPSetupData) obj;
        return Intrinsics.EZpvd((Object) this.secretCode, (Object) signInTOTPSetupData.secretCode) && Intrinsics.EZpvd((Object) this.session, (Object) signInTOTPSetupData.session) && Intrinsics.EZpvd((Object) this.username, (Object) signInTOTPSetupData.username);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSecretCode() {
        return this.secretCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSession() {
        return this.session;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsername() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.secretCode.hashCode();
        String str = this.session;
        return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.username.hashCode();
    }

    public SignInTOTPSetupData(@NotNull String str, String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.secretCode = str;
        this.session = str2;
        this.username = str3;
    }

    public String toString() {
        return "SignInTOTPSetupData(secretCode = " + mask(this.secretCode) + ", session = " + mask(this.session) + ", username = " + this.username + "})";
    }

    private final String mask(String str) {
        if (str == null || str.length() <= 4) {
            return "***";
        }
        return StringsKt__StringsKt.KWHzl(str, C56548yJl.AhwBna(0, 4)) + "***";
    }
}
