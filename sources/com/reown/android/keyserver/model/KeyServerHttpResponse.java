package com.reown.android.keyserver.model;

import com.google.firebase.messaging.Constants;
import com.reown.android.keyserver.model.KeyServerResponse;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public abstract class KeyServerHttpResponse<T> {
    public static final Companion Companion = new Companion(null);
    public static final String SUCCESS_STATUS = "SUCCESS";

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.keyserver.model.KeyServerHttpResponse.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ KeyServerHttpResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Error getError();

    public abstract String getStatus();

    public abstract T getValue();

    private KeyServerHttpResponse() {
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.keyserver.model.KeyServerHttpResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class RegisterInvite extends KeyServerHttpResponse<String> {
        public final Error error;
        public final String status;
        public final String value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ RegisterInvite copy$default(RegisterInvite registerInvite, String str, Error error, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = registerInvite.status;
            }
            if ((i & 2) != 0) {
                error = registerInvite.error;
            }
            if ((i & 4) != 0) {
                str2 = registerInvite.value;
            }
            return registerInvite.copy(str, error, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Error component2() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RegisterInvite copy(@Json(name = "status") @NotNull String str, @Json(name = Constants.IPC_BUNDLE_KEY_SEND_ERROR) Error error, @Json(name = "value") String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new RegisterInvite(str, error, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegisterInvite)) {
                return false;
            }
            RegisterInvite registerInvite = (RegisterInvite) obj;
            return Intrinsics.EZpvd((Object) this.status, (Object) registerInvite.status) && Intrinsics.EZpvd(this.error, registerInvite.error) && Intrinsics.EZpvd((Object) this.value, (Object) registerInvite.value);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.keyserver.model.KeyServerHttpResponse
        public Error getError() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.keyserver.model.KeyServerHttpResponse
        public String getStatus() {
            return this.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getValue()Ljava/lang/Object; */
        @Override // com.reown.android.keyserver.model.KeyServerHttpResponse
        public String getValue() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.status.hashCode();
            Error error = this.error;
            int iHashCode2 = error == null ? 0 : error.hashCode();
            String str = this.value;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "RegisterInvite(status=" + this.status + ", error=" + this.error + ", value=" + this.value + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RegisterInvite(@Json(name = "status") @NotNull String str, @Json(name = Constants.IPC_BUNDLE_KEY_SEND_ERROR) Error error, @Json(name = "value") String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.status = str;
            this.error = error;
            this.value = str2;
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class UnregisterInvite extends KeyServerHttpResponse<String> {
        public final Error error;
        public final String status;
        public final String value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ UnregisterInvite copy$default(UnregisterInvite unregisterInvite, String str, Error error, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unregisterInvite.status;
            }
            if ((i & 2) != 0) {
                error = unregisterInvite.error;
            }
            if ((i & 4) != 0) {
                str2 = unregisterInvite.value;
            }
            return unregisterInvite.copy(str, error, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Error component2() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UnregisterInvite copy(@Json(name = "status") @NotNull String str, @Json(name = Constants.IPC_BUNDLE_KEY_SEND_ERROR) Error error, @Json(name = "value") String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new UnregisterInvite(str, error, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnregisterInvite)) {
                return false;
            }
            UnregisterInvite unregisterInvite = (UnregisterInvite) obj;
            return Intrinsics.EZpvd((Object) this.status, (Object) unregisterInvite.status) && Intrinsics.EZpvd(this.error, unregisterInvite.error) && Intrinsics.EZpvd((Object) this.value, (Object) unregisterInvite.value);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.keyserver.model.KeyServerHttpResponse
        public Error getError() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.keyserver.model.KeyServerHttpResponse
        public String getStatus() {
            return this.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getValue()Ljava/lang/Object; */
        @Override // com.reown.android.keyserver.model.KeyServerHttpResponse
        public String getValue() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.status.hashCode();
            Error error = this.error;
            int iHashCode2 = error == null ? 0 : error.hashCode();
            String str = this.value;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UnregisterInvite(status=" + this.status + ", error=" + this.error + ", value=" + this.value + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnregisterInvite(@Json(name = "status") @NotNull String str, @Json(name = Constants.IPC_BUNDLE_KEY_SEND_ERROR) Error error, @Json(name = "value") String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.status = str;
            this.error = error;
            this.value = str2;
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class ResolveInvite extends KeyServerHttpResponse<KeyServerResponse.ResolveInvite> {
        public final Error error;
        public final String status;
        public final KeyServerResponse.ResolveInvite value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ResolveInvite copy$default(ResolveInvite resolveInvite, String str, Error error, KeyServerResponse.ResolveInvite resolveInvite2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = resolveInvite.status;
            }
            if ((i & 2) != 0) {
                error = resolveInvite.error;
            }
            if ((i & 4) != 0) {
                resolveInvite2 = resolveInvite.value;
            }
            return resolveInvite.copy(str, error, resolveInvite2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Error component2() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final KeyServerResponse.ResolveInvite component3() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ResolveInvite copy(@Json(name = "status") @NotNull String str, @Json(name = Constants.IPC_BUNDLE_KEY_SEND_ERROR) Error error, @Json(name = "value") @NotNull KeyServerResponse.ResolveInvite resolveInvite) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(resolveInvite, "");
            return new ResolveInvite(str, error, resolveInvite);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResolveInvite)) {
                return false;
            }
            ResolveInvite resolveInvite = (ResolveInvite) obj;
            return Intrinsics.EZpvd((Object) this.status, (Object) resolveInvite.status) && Intrinsics.EZpvd(this.error, resolveInvite.error) && Intrinsics.EZpvd(this.value, resolveInvite.value);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.keyserver.model.KeyServerHttpResponse
        public Error getError() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.keyserver.model.KeyServerHttpResponse
        public String getStatus() {
            return this.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getValue()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.reown.android.keyserver.model.KeyServerHttpResponse
        public KeyServerResponse.ResolveInvite getValue() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.status.hashCode();
            Error error = this.error;
            return (((iHashCode * 31) + (error == null ? 0 : error.hashCode())) * 31) + this.value.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ResolveInvite(status=" + this.status + ", error=" + this.error + ", value=" + this.value + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResolveInvite(@Json(name = "status") @NotNull String str, @Json(name = Constants.IPC_BUNDLE_KEY_SEND_ERROR) Error error, @Json(name = "value") @NotNull KeyServerResponse.ResolveInvite resolveInvite) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(resolveInvite, "");
            this.status = str;
            this.error = error;
            this.value = resolveInvite;
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class RegisterIdentity extends KeyServerHttpResponse<String> {
        public final Error error;
        public final String status;
        public final String value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ RegisterIdentity copy$default(RegisterIdentity registerIdentity, String str, Error error, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = registerIdentity.status;
            }
            if ((i & 2) != 0) {
                error = registerIdentity.error;
            }
            if ((i & 4) != 0) {
                str2 = registerIdentity.value;
            }
            return registerIdentity.copy(str, error, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Error component2() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RegisterIdentity copy(@Json(name = "status") @NotNull String str, @Json(name = Constants.IPC_BUNDLE_KEY_SEND_ERROR) Error error, @Json(name = "value") String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new RegisterIdentity(str, error, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegisterIdentity)) {
                return false;
            }
            RegisterIdentity registerIdentity = (RegisterIdentity) obj;
            return Intrinsics.EZpvd((Object) this.status, (Object) registerIdentity.status) && Intrinsics.EZpvd(this.error, registerIdentity.error) && Intrinsics.EZpvd((Object) this.value, (Object) registerIdentity.value);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.keyserver.model.KeyServerHttpResponse
        public Error getError() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.keyserver.model.KeyServerHttpResponse
        public String getStatus() {
            return this.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getValue()Ljava/lang/Object; */
        @Override // com.reown.android.keyserver.model.KeyServerHttpResponse
        public String getValue() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.status.hashCode();
            Error error = this.error;
            int iHashCode2 = error == null ? 0 : error.hashCode();
            String str = this.value;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "RegisterIdentity(status=" + this.status + ", error=" + this.error + ", value=" + this.value + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RegisterIdentity(@Json(name = "status") @NotNull String str, @Json(name = Constants.IPC_BUNDLE_KEY_SEND_ERROR) Error error, @Json(name = "value") String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.status = str;
            this.error = error;
            this.value = str2;
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class UnregisterIdentity extends KeyServerHttpResponse<String> {
        public final Error error;
        public final String status;
        public final String value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ UnregisterIdentity copy$default(UnregisterIdentity unregisterIdentity, String str, Error error, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unregisterIdentity.status;
            }
            if ((i & 2) != 0) {
                error = unregisterIdentity.error;
            }
            if ((i & 4) != 0) {
                str2 = unregisterIdentity.value;
            }
            return unregisterIdentity.copy(str, error, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Error component2() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UnregisterIdentity copy(@Json(name = "status") @NotNull String str, @Json(name = Constants.IPC_BUNDLE_KEY_SEND_ERROR) Error error, @Json(name = "value") String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new UnregisterIdentity(str, error, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnregisterIdentity)) {
                return false;
            }
            UnregisterIdentity unregisterIdentity = (UnregisterIdentity) obj;
            return Intrinsics.EZpvd((Object) this.status, (Object) unregisterIdentity.status) && Intrinsics.EZpvd(this.error, unregisterIdentity.error) && Intrinsics.EZpvd((Object) this.value, (Object) unregisterIdentity.value);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.keyserver.model.KeyServerHttpResponse
        public Error getError() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.keyserver.model.KeyServerHttpResponse
        public String getStatus() {
            return this.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getValue()Ljava/lang/Object; */
        @Override // com.reown.android.keyserver.model.KeyServerHttpResponse
        public String getValue() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.status.hashCode();
            Error error = this.error;
            int iHashCode2 = error == null ? 0 : error.hashCode();
            String str = this.value;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UnregisterIdentity(status=" + this.status + ", error=" + this.error + ", value=" + this.value + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnregisterIdentity(@Json(name = "status") @NotNull String str, @Json(name = Constants.IPC_BUNDLE_KEY_SEND_ERROR) Error error, @Json(name = "value") String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.status = str;
            this.error = error;
            this.value = str2;
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class ResolveIdentity extends KeyServerHttpResponse<KeyServerResponse.ResolveIdentity> {
        public final Error error;
        public final String status;
        public final KeyServerResponse.ResolveIdentity value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ResolveIdentity copy$default(ResolveIdentity resolveIdentity, String str, Error error, KeyServerResponse.ResolveIdentity resolveIdentity2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = resolveIdentity.status;
            }
            if ((i & 2) != 0) {
                error = resolveIdentity.error;
            }
            if ((i & 4) != 0) {
                resolveIdentity2 = resolveIdentity.value;
            }
            return resolveIdentity.copy(str, error, resolveIdentity2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Error component2() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final KeyServerResponse.ResolveIdentity component3() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ResolveIdentity copy(@Json(name = "status") @NotNull String str, @Json(name = Constants.IPC_BUNDLE_KEY_SEND_ERROR) Error error, @Json(name = "value") @NotNull KeyServerResponse.ResolveIdentity resolveIdentity) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(resolveIdentity, "");
            return new ResolveIdentity(str, error, resolveIdentity);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResolveIdentity)) {
                return false;
            }
            ResolveIdentity resolveIdentity = (ResolveIdentity) obj;
            return Intrinsics.EZpvd((Object) this.status, (Object) resolveIdentity.status) && Intrinsics.EZpvd(this.error, resolveIdentity.error) && Intrinsics.EZpvd(this.value, resolveIdentity.value);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.keyserver.model.KeyServerHttpResponse
        public Error getError() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.keyserver.model.KeyServerHttpResponse
        public String getStatus() {
            return this.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getValue()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.reown.android.keyserver.model.KeyServerHttpResponse
        public KeyServerResponse.ResolveIdentity getValue() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.status.hashCode();
            Error error = this.error;
            return (((iHashCode * 31) + (error == null ? 0 : error.hashCode())) * 31) + this.value.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ResolveIdentity(status=" + this.status + ", error=" + this.error + ", value=" + this.value + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResolveIdentity(@Json(name = "status") @NotNull String str, @Json(name = Constants.IPC_BUNDLE_KEY_SEND_ERROR) Error error, @Json(name = "value") @NotNull KeyServerResponse.ResolveIdentity resolveIdentity) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(resolveIdentity, "");
            this.status = str;
            this.error = error;
            this.value = resolveIdentity;
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
