package com.okinc.account.api.model.security.otp;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class TwoFactorAuth<T> {
    public static final int $stable = 0;
    private final int code;
    private final T data;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.account.api.model.security.otp.TwoFactorAuth */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TwoFactorAuth copy$default(TwoFactorAuth twoFactorAuth, int i, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = twoFactorAuth.code;
        }
        if ((i2 & 2) != 0) {
            obj = twoFactorAuth.data;
        }
        return twoFactorAuth.copy(i, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T component2() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwoFactorAuth<T> copy(int i, T t) {
        return new TwoFactorAuth<>(i, t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TwoFactorAuth)) {
            return false;
        }
        TwoFactorAuth twoFactorAuth = (TwoFactorAuth) obj;
        return this.code == twoFactorAuth.code && Intrinsics.EZpvd(this.data, twoFactorAuth.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.code);
        T t = this.data;
        return (iHashCode * 31) + (t == null ? 0 : t.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TwoFactorAuth(code=" + this.code + ", data=" + this.data + ")";
    }

    public TwoFactorAuth(int i, T t) {
        this.code = i;
        this.data = t;
    }
}
