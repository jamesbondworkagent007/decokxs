package com.okinc.account.api.model.security.otp;

/* JADX INFO: loaded from: classes14.dex */
public final class Otp {
    public static final int $stable = 0;
    private final int code;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Otp copy$default(Otp otp, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = otp.code;
        }
        return otp.copy(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Otp copy(int i) {
        return new Otp(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Otp) && this.code == ((Otp) obj).code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Integer.hashCode(this.code);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Otp(code=" + this.code + ")";
    }

    public Otp(int i) {
        this.code = i;
    }
}
