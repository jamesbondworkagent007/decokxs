package com.okinc.account.api.model.security.otp;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class OtpError extends Throwable {
    public static final int $stable = 0;
    private final int code;
    private final String msg;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OtpError copy$default(OtpError otpError, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = otpError.code;
        }
        if ((i2 & 2) != 0) {
            str = otpError.msg;
        }
        return otpError.copy(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OtpError copy(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new OtpError(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtpError)) {
            return false;
        }
        OtpError otpError = (OtpError) obj;
        return this.code == otpError.code && Intrinsics.EZpvd((Object) this.msg, (Object) otpError.msg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.code) * 31) + this.msg.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String toString() {
        return "OtpError(code=" + this.code + ", msg=" + this.msg + ")";
    }

    public OtpError(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.code = i;
        this.msg = str;
    }
}
