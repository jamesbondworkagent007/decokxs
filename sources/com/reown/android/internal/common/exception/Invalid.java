package com.reown.android.internal.common.exception;

import com.reown.android.internal.common.model.type.Error;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class Invalid implements Error {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.internal.common.exception.Invalid.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Invalid(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public Invalid() {
    }

    public static final class MethodUnsupported extends Invalid {
        public final int code;
        public final String message;
        public final String method;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ MethodUnsupported copy$default(MethodUnsupported methodUnsupported, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = methodUnsupported.method;
            }
            return methodUnsupported.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MethodUnsupported copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new MethodUnsupported(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MethodUnsupported) && Intrinsics.EZpvd((Object) this.method, (Object) ((MethodUnsupported) obj).method);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.Error
        public int getCode() {
            return this.code;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.Error
        public String getMessage() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMethod() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.method.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "MethodUnsupported(method=" + this.method + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MethodUnsupported(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.method = str;
            this.message = "Unsupported Method Requested: " + str;
            this.code = 10001;
        }
    }

    public static final class RequestExpired extends Invalid {
        public static final RequestExpired INSTANCE = new RequestExpired();
        public static final String message = "Request expired";
        public static final int code = 8000;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.Error
        public int getCode() {
            return code;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.Error
        public String getMessage() {
            return message;
        }

        public RequestExpired() {
            super(null);
        }
    }
}
