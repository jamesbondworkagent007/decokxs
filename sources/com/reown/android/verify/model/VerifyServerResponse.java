package com.reown.android.verify.model;

import com.google.firebase.messaging.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public abstract class VerifyServerResponse<T> {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.verify.model.VerifyServerResponse.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ VerifyServerResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Error getError();

    public abstract T getValue();

    private VerifyServerResponse() {
    }

    @JsonClass(generateAdapter = true)
    public static final class RegisterAttestation extends VerifyServerResponse<String> {
        public final Error error;
        public final String value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ RegisterAttestation copy$default(RegisterAttestation registerAttestation, Error error, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                error = registerAttestation.error;
            }
            if ((i & 2) != 0) {
                str = registerAttestation.value;
            }
            return registerAttestation.copy(error, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Error component1() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RegisterAttestation copy(@Json(name = Constants.IPC_BUNDLE_KEY_SEND_ERROR) Error error, @Json(name = "value") String str) {
            return new RegisterAttestation(error, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegisterAttestation)) {
                return false;
            }
            RegisterAttestation registerAttestation = (RegisterAttestation) obj;
            return Intrinsics.EZpvd(this.error, registerAttestation.error) && Intrinsics.EZpvd((Object) this.value, (Object) registerAttestation.value);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.verify.model.VerifyServerResponse
        public Error getError() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getValue()Ljava/lang/Object; */
        @Override // com.reown.android.verify.model.VerifyServerResponse
        public String getValue() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Error error = this.error;
            int iHashCode = error == null ? 0 : error.hashCode();
            String str = this.value;
            return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "RegisterAttestation(error=" + this.error + ", value=" + this.value + ")";
        }

        public RegisterAttestation(@Json(name = Constants.IPC_BUNDLE_KEY_SEND_ERROR) Error error, @Json(name = "value") String str) {
            super(null);
            this.error = error;
            this.value = str;
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    @JsonClass(generateAdapter = true)
    public static final class ResolveAttestation extends VerifyServerResponse<Origin> {
        public final Error error;
        public final Origin value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ResolveAttestation copy$default(ResolveAttestation resolveAttestation, Error error, Origin origin, int i, Object obj) {
            if ((i & 1) != 0) {
                error = resolveAttestation.error;
            }
            if ((i & 2) != 0) {
                origin = resolveAttestation.value;
            }
            return resolveAttestation.copy(error, origin);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Error component1() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Origin component2() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ResolveAttestation copy(@Json(name = Constants.IPC_BUNDLE_KEY_SEND_ERROR) Error error, @Json(name = "value") Origin origin) {
            return new ResolveAttestation(error, origin);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResolveAttestation)) {
                return false;
            }
            ResolveAttestation resolveAttestation = (ResolveAttestation) obj;
            return Intrinsics.EZpvd(this.error, resolveAttestation.error) && Intrinsics.EZpvd(this.value, resolveAttestation.value);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.verify.model.VerifyServerResponse
        public Error getError() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getValue()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.reown.android.verify.model.VerifyServerResponse
        public Origin getValue() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Error error = this.error;
            int iHashCode = error == null ? 0 : error.hashCode();
            Origin origin = this.value;
            return (iHashCode * 31) + (origin != null ? origin.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ResolveAttestation(error=" + this.error + ", value=" + this.value + ")";
        }

        public ResolveAttestation(@Json(name = Constants.IPC_BUNDLE_KEY_SEND_ERROR) Error error, @Json(name = "value") Origin origin) {
            super(null);
            this.error = error;
            this.value = origin;
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    @JsonClass(generateAdapter = true)
    public static final class Error {
        public final String message;
        public final String name;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Error copy$default(Error error, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            if ((i & 2) != 0) {
                str2 = error.name;
            }
            return error.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.name;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Error copy(@Json(name = "message") @NotNull String str, @Json(name = "name") @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Error(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.EZpvd((Object) this.message, (Object) error.message) && Intrinsics.EZpvd((Object) this.name, (Object) error.name);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMessage() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getName() {
            return this.name;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.message.hashCode() * 31) + this.name.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Error(message=" + this.message + ", name=" + this.name + ")";
        }

        public Error(@Json(name = "message") @NotNull String str, @Json(name = "name") @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.message = str;
            this.name = str2;
        }
    }
}
