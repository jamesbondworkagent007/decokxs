package com.reown.android.push.network.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@JsonClass(generateAdapter = true)
public final class PushBody {
    public final String clientId;
    public final Boolean enableEncrypted;
    public final String token;
    public final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PushBody copy$default(PushBody pushBody, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pushBody.clientId;
        }
        if ((i & 2) != 0) {
            str2 = pushBody.token;
        }
        if ((i & 4) != 0) {
            str3 = pushBody.type;
        }
        if ((i & 8) != 0) {
            bool = pushBody.enableEncrypted;
        }
        return pushBody.copy(str, str2, str3, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.clientId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.enableEncrypted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PushBody copy(@Json(name = "client_id") @NotNull String str, @Json(name = "token") @NotNull String str2, @Json(name = "type") @NotNull String str3, @Json(name = "always_raw") Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new PushBody(str, str2, str3, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushBody)) {
            return false;
        }
        PushBody pushBody = (PushBody) obj;
        return Intrinsics.EZpvd((Object) this.clientId, (Object) pushBody.clientId) && Intrinsics.EZpvd((Object) this.token, (Object) pushBody.token) && Intrinsics.EZpvd((Object) this.type, (Object) pushBody.type) && Intrinsics.EZpvd(this.enableEncrypted, pushBody.enableEncrypted);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClientId() {
        return this.clientId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getEnableEncrypted() {
        return this.enableEncrypted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.clientId.hashCode();
        int iHashCode2 = this.token.hashCode();
        int iHashCode3 = this.type.hashCode();
        Boolean bool = this.enableEncrypted;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bool == null ? 0 : bool.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PushBody(clientId=" + this.clientId + ", token=" + this.token + ", type=" + this.type + ", enableEncrypted=" + this.enableEncrypted + ")";
    }

    public PushBody(@Json(name = "client_id") @NotNull String str, @Json(name = "token") @NotNull String str2, @Json(name = "type") @NotNull String str3, @Json(name = "always_raw") Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.clientId = str;
        this.token = str2;
        this.type = str3;
        this.enableEncrypted = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("fcm") : (r3v0 java.lang.String))
  (r4v0 java.lang.Boolean)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:7) call: com.reown.android.push.network.model.PushBody.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ PushBody(String str, String str2, String str3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "fcm" : str3, bool);
    }
}
