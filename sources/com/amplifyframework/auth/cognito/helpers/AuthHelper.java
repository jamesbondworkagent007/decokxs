package com.amplifyframework.auth.cognito.helpers;

import android.util.Base64;
import com.amplifyframework.auth.cognito.exceptions.service.InvalidParameterException;
import com.amplifyframework.auth.exceptions.UnknownException;
import java.nio.charset.Charset;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class AuthHelper {
    public static final Companion Companion = new Companion(null);
    private static final String HMAC_SHA_256 = "HmacSHA256";

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.cognito.helpers.AuthHelper.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getActiveUsername(@NotNull String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            return str2 == null ? str3 == null ? str : str3 : str2;
        }

        private Companion() {
        }

        public final String getHMAC_SHA_256() {
            return AuthHelper.HMAC_SHA_256;
        }

        public final String getSecretHash(String str, String str2, String str3) throws InvalidParameterException, UnknownException {
            if (str == null) {
                throw new InvalidParameterException(null, new Exception("user ID cannot be null"), 1, null);
            }
            if (str2 == null) {
                throw new InvalidParameterException(null, new Exception("client ID cannot be null"), 1, null);
            }
            if (str3 == null || str3.length() == 0) {
                return null;
            }
            try {
                Mac mac = Mac.getInstance(getHMAC_SHA_256());
                Charset charset = Charsets.UTF_8;
                byte[] bytes = str3.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "");
                mac.init(new SecretKeySpec(bytes, getHMAC_SHA_256()));
                byte[] bytes2 = str.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes2, "");
                mac.update(bytes2);
                byte[] bytes3 = str2.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes3, "");
                byte[] bArrEncode = Base64.encode(mac.doFinal(bytes3), 2);
                Intrinsics.checkNotNullExpressionValue(bArrEncode, "");
                return new String(bArrEncode, charset);
            } catch (Exception unused) {
                throw new UnknownException(null, new Exception("errors in HMAC calculation"), 1, null);
            }
        }
    }
}
