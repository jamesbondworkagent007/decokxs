package com.okinc.account.api.model.security.otp;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public abstract class OtpState {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.account.api.model.security.otp.OtpState.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ OtpState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class OldLoading extends OtpState {
        public static final int $stable = 0;
        public static final OldLoading INSTANCE = new OldLoading();

        private OldLoading() {
            super(null);
        }
    }

    private OtpState() {
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class OldSuccess extends OtpState {
        public static final int $stable = 0;
        private final Integer msgType;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public OldSuccess() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ OldSuccess copy$default(OldSuccess oldSuccess, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                num = oldSuccess.msgType;
            }
            return oldSuccess.copy(num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component1() {
            return this.msgType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OldSuccess copy(Integer num) {
            return new OldSuccess(num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OldSuccess) && Intrinsics.EZpvd(this.msgType, ((OldSuccess) obj).msgType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getMsgType() {
            return this.msgType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Integer num = this.msgType;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "OldSuccess(msgType=" + this.msgType + ")";
        }

        public OldSuccess(Integer num) {
            super(null);
            this.msgType = num;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r1v0 java.lang.Integer))
 A[MD:(java.lang.Integer):void (m)] (LINE:5) call: com.okinc.account.api.model.security.otp.OtpState.OldSuccess.<init>(java.lang.Integer):void type: THIS */
        public /* synthetic */ OldSuccess(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num);
        }
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class OldError extends OtpState {
        public static final int $stable = 0;
        private final int code;
        private final String msg;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ OldError copy$default(OldError oldError, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = oldError.code;
            }
            if ((i2 & 2) != 0) {
                str = oldError.msg;
            }
            return oldError.copy(i, str);
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
        public final OldError copy(int i, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new OldError(i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OldError)) {
                return false;
            }
            OldError oldError = (OldError) obj;
            return this.code == oldError.code && Intrinsics.EZpvd((Object) this.msg, (Object) oldError.msg);
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
        public String toString() {
            return "OldError(code=" + this.code + ", msg=" + this.msg + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OldError(int i, @NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.code = i;
            this.msg = str;
        }
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class NewLoading extends OtpState {
        public static final int $stable = 0;
        public static final NewLoading INSTANCE = new NewLoading();

        private NewLoading() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class NewSuccess extends OtpState {
        public static final int $stable = 0;
        private final Integer msgType;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public NewSuccess() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ NewSuccess copy$default(NewSuccess newSuccess, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                num = newSuccess.msgType;
            }
            return newSuccess.copy(num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component1() {
            return this.msgType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NewSuccess copy(Integer num) {
            return new NewSuccess(num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NewSuccess) && Intrinsics.EZpvd(this.msgType, ((NewSuccess) obj).msgType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getMsgType() {
            return this.msgType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Integer num = this.msgType;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "NewSuccess(msgType=" + this.msgType + ")";
        }

        public NewSuccess(Integer num) {
            super(null);
            this.msgType = num;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r1v0 java.lang.Integer))
 A[MD:(java.lang.Integer):void (m)] (LINE:8) call: com.okinc.account.api.model.security.otp.OtpState.NewSuccess.<init>(java.lang.Integer):void type: THIS */
        public /* synthetic */ NewSuccess(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num);
        }
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class NewError extends OtpState {
        public static final int $stable = 0;
        private final int code;
        private final String msg;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ NewError copy$default(NewError newError, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = newError.code;
            }
            if ((i2 & 2) != 0) {
                str = newError.msg;
            }
            return newError.copy(i, str);
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
        public final NewError copy(int i, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new NewError(i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewError)) {
                return false;
            }
            NewError newError = (NewError) obj;
            return this.code == newError.code && Intrinsics.EZpvd((Object) this.msg, (Object) newError.msg);
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
        public String toString() {
            return "NewError(code=" + this.code + ", msg=" + this.msg + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewError(int i, @NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.code = i;
            this.msg = str;
        }
    }
}
