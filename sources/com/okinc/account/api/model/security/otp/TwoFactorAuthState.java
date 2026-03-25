package com.okinc.account.api.model.security.otp;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public abstract class TwoFactorAuthState {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.account.api.model.security.otp.TwoFactorAuthState.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ TwoFactorAuthState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class Loading extends TwoFactorAuthState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    private TwoFactorAuthState() {
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class InvalidAuthCode extends TwoFactorAuthState {
        public static final int $stable = 8;
        private final Map<String, String> errorCodes;
        private final String msg;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.account.api.model.security.otp.TwoFactorAuthState$InvalidAuthCode */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InvalidAuthCode copy$default(InvalidAuthCode invalidAuthCode, String str, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = invalidAuthCode.msg;
            }
            if ((i & 2) != 0) {
                map = invalidAuthCode.errorCodes;
            }
            return invalidAuthCode.copy(str, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.msg;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, String> component2() {
            return this.errorCodes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvalidAuthCode copy(@NotNull String str, Map<String, String> map) {
            Intrinsics.checkNotNullParameter(str, "");
            return new InvalidAuthCode(str, map);
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
            return Intrinsics.EZpvd((Object) this.msg, (Object) invalidAuthCode.msg) && Intrinsics.EZpvd(this.errorCodes, invalidAuthCode.errorCodes);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, String> getErrorCodes() {
            return this.errorCodes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMsg() {
            return this.msg;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.msg.hashCode();
            Map<String, String> map = this.errorCodes;
            return (iHashCode * 31) + (map == null ? 0 : map.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "InvalidAuthCode(msg=" + this.msg + ", errorCodes=" + this.errorCodes + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidAuthCode(@NotNull String str, Map<String, String> map) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.msg = str;
            this.errorCodes = map;
        }
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class MaxAttemptReached extends TwoFactorAuthState {
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

    /* JADX INFO: loaded from: classes22.dex */
    public static final class UnknownError extends TwoFactorAuthState {
        public static final int $stable = 0;
        private final int code;
        private final String msg;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ UnknownError copy$default(UnknownError unknownError, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = unknownError.code;
            }
            if ((i2 & 2) != 0) {
                str = unknownError.msg;
            }
            return unknownError.copy(i, str);
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
        public final UnknownError copy(int i, String str) {
            return new UnknownError(i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnknownError)) {
                return false;
            }
            UnknownError unknownError = (UnknownError) obj;
            return this.code == unknownError.code && Intrinsics.EZpvd((Object) this.msg, (Object) unknownError.msg);
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
            int iHashCode = Integer.hashCode(this.code);
            String str = this.msg;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UnknownError(code=" + this.code + ", msg=" + this.msg + ")";
        }

        public UnknownError(int i, String str) {
            super(null);
            this.code = i;
            this.msg = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(int, java.lang.String):void (m)] (LINE:7) call: com.okinc.account.api.model.security.otp.TwoFactorAuthState.UnknownError.<init>(int, java.lang.String):void type: THIS */
        public /* synthetic */ UnknownError(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : str);
        }
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class Success<T> extends TwoFactorAuthState {
        public static final int $stable = 0;
        private final T data;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.account.api.model.security.otp.TwoFactorAuthState$Success */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = success.data;
            }
            return success.copy(obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final T component1() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Success<T> copy(T t) {
            return new Success<>(t);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.EZpvd(this.data, ((Success) obj).data);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final T getData() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            T t = this.data;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Success(data=" + this.data + ")";
        }

        public Success(T t) {
            super(null);
            this.data = t;
        }
    }
}
