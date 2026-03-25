package com.reown.android.internal.common.model.params;

import com.reown.android.internal.common.model.type.ClientParams;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface ChatNotifyResponseAuthParams {

    @JsonClass(generateAdapter = true)
    public static final class ResponseAuth implements ClientParams {
        public final String responseAuth;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ResponseAuth copy$default(ResponseAuth responseAuth, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = responseAuth.responseAuth;
            }
            return responseAuth.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.responseAuth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ResponseAuth copy(@Json(name = "responseAuth") @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ResponseAuth(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ResponseAuth) && Intrinsics.EZpvd((Object) this.responseAuth, (Object) ((ResponseAuth) obj).responseAuth);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getResponseAuth() {
            return this.responseAuth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.responseAuth.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ResponseAuth(responseAuth=" + this.responseAuth + ")";
        }

        public ResponseAuth(@Json(name = "responseAuth") @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.responseAuth = str;
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class Auth implements ClientParams {
        public final String auth;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Auth copy$default(Auth auth, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = auth.auth;
            }
            return auth.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.auth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Auth copy(@Json(name = "auth") @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Auth(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Auth) && Intrinsics.EZpvd((Object) this.auth, (Object) ((Auth) obj).auth);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAuth() {
            return this.auth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.auth.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Auth(auth=" + this.auth + ")";
        }

        public Auth(@Json(name = "auth") @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.auth = str;
        }
    }
}
