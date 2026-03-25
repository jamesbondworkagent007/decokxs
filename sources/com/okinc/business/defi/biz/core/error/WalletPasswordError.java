package com.okinc.business.defi.biz.core.error;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C10856bwO;
import o.C13754dXa;
import o.C33070mpX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class WalletPasswordError extends OKWException {
    public static final int $stable = 0;
    public static final Activity Companion = new Activity(null);
    public static final int ERROR_CODE_PWD_ENCRYPT_ERROR = 101;
    public static final int ERROR_CODE_PWD_ERROR = 103;
    public static final int ERROR_CODE_PWD_EXIST_ERROR = 102;
    public static final int ERROR_CODE_PWD_GET_SECRET_KEY_ERROR = 105;
    public static final int ERROR_CODE_PWD_VALIDATE_ERROR = 100;
    public static final int ERROR_CODE_PWD_WALLET_DECODE_ERROR = 104;
    private final int code;
    private final String failReason;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletPasswordError copy$default(WalletPasswordError walletPasswordError, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = walletPasswordError.code;
        }
        if ((i2 & 2) != 0) {
            str = walletPasswordError.failReason;
        }
        return walletPasswordError.copy(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.failReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletPasswordError copy(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new WalletPasswordError(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletPasswordError)) {
            return false;
        }
        WalletPasswordError walletPasswordError = (WalletPasswordError) obj;
        return this.code == walletPasswordError.code && Intrinsics.EZpvd((Object) this.failReason, (Object) walletPasswordError.failReason);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFailReason() {
        return this.failReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.code) * 31) + this.failReason.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String toString() {
        return "WalletPasswordError(code=" + this.code + ", failReason=" + this.failReason + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletPasswordError(int i, @NotNull String str) {
        super(str, null);
        Intrinsics.checkNotNullParameter(str, "");
        this.code = i;
        this.failReason = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable toThrowableWithLog() {
        C10856bwO.copydefault("WalletPasswordError", this.code, this.failReason);
        return new Throwable(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaController));
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.error.WalletPasswordError.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final Throwable KWHzl() {
            return new WalletPasswordError(100, "pwd validate error").toThrowableWithLog();
        }

        public final Throwable AEQbTJ() {
            return new WalletPasswordError(101, "pwd encrypt error").toThrowableWithLog();
        }

        public final Throwable OLrzqt() {
            return new WalletPasswordError(102, "pwd exist error").toThrowableWithLog();
        }

        public final Throwable EZpvd() {
            return new WalletPasswordError(103, "pwd error").toThrowableWithLog();
        }

        public final Throwable copydefault() {
            return new WalletPasswordError(104, "wallet decode error").toThrowableWithLog();
        }

        public final Throwable AEQbTJ(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new WalletPasswordError(105, str).toThrowableWithLog();
        }
    }
}
