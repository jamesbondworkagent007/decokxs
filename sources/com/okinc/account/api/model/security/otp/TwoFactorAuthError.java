package com.okinc.account.api.model.security.otp;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public abstract class TwoFactorAuthError extends Throwable {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.account.api.model.security.otp.TwoFactorAuthError.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ TwoFactorAuthError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TwoFactorAuthError() {
    }

    public static final class MaxAttemptReached extends TwoFactorAuthError {
        public static final int $stable = 0;
        private final String msg;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ MaxAttemptReached copy$default(MaxAttemptReached maxAttemptReached, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = maxAttemptReached.msg;
            }
            return maxAttemptReached.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.msg;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MaxAttemptReached copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new MaxAttemptReached(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MaxAttemptReached) && Intrinsics.EZpvd((Object) this.msg, (Object) ((MaxAttemptReached) obj).msg);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMsg() {
            return this.msg;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.msg.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Throwable
        public String toString() {
            return "MaxAttemptReached(msg=" + this.msg + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MaxAttemptReached(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.msg = str;
        }
    }

    public static final class InvalidAuthCode extends TwoFactorAuthError {
        public static final int $stable = 8;
        private final String attemptsLeft;
        private final Map<String, String> errors;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.account.api.model.security.otp.TwoFactorAuthError$InvalidAuthCode */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InvalidAuthCode copy$default(InvalidAuthCode invalidAuthCode, Map map, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                map = invalidAuthCode.errors;
            }
            if ((i & 2) != 0) {
                str = invalidAuthCode.attemptsLeft;
            }
            return invalidAuthCode.copy(map, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, String> component1() {
            return this.errors;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.attemptsLeft;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvalidAuthCode copy(Map<String, String> map, String str) {
            return new InvalidAuthCode(map, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InvalidAuthCode)) {
                return false;
            }
            InvalidAuthCode invalidAuthCode = (InvalidAuthCode) obj;
            return Intrinsics.EZpvd(this.errors, invalidAuthCode.errors) && Intrinsics.EZpvd((Object) this.attemptsLeft, (Object) invalidAuthCode.attemptsLeft);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAttemptsLeft() {
            return this.attemptsLeft;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, String> getErrors() {
            return this.errors;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Map<String, String> map = this.errors;
            int iHashCode = map == null ? 0 : map.hashCode();
            String str = this.attemptsLeft;
            return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Throwable
        public String toString() {
            return "InvalidAuthCode(errors=" + this.errors + ", attemptsLeft=" + this.attemptsLeft + ")";
        }

        public InvalidAuthCode(Map<String, String> map, String str) {
            super(null);
            this.errors = map;
            this.attemptsLeft = str;
        }
    }

    public static final class Unknown extends TwoFactorAuthError {
        public static final int $stable = 0;
        private final int code;
        private final String msg;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Unknown copy$default(Unknown unknown, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = unknown.code;
            }
            if ((i2 & 2) != 0) {
                str = unknown.msg;
            }
            return unknown.copy(i, str);
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
        public final Unknown copy(int i, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Unknown(i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Unknown)) {
                return false;
            }
            Unknown unknown = (Unknown) obj;
            return this.code == unknown.code && Intrinsics.EZpvd((Object) this.msg, (Object) unknown.msg);
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
            return "Unknown(code=" + this.code + ", msg=" + this.msg + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(int i, @NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.code = i;
            this.msg = str;
        }
    }
}
