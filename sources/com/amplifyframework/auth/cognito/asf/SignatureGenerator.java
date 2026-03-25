package com.amplifyframework.auth.cognito.asf;

import android.util.Base64;
import java.nio.charset.Charset;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SignatureGenerator {
    private static final String HMAC_SHA_256 = "HmacSHA256";
    public static final Companion Companion = new Companion(null);
    private static final String TAG = SignatureGenerator.class.getSimpleName();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final String getSignature(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        return Companion.getSignature(str, str2, str3);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.cognito.asf.SignatureGenerator.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getSignature(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            try {
                Mac mac = Mac.getInstance(SignatureGenerator.HMAC_SHA_256);
                Charset charset = Charsets.UTF_8;
                byte[] bytes = str2.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "");
                mac.init(new SecretKeySpec(bytes, SignatureGenerator.HMAC_SHA_256));
                byte[] bytes2 = str3.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes2, "");
                mac.update(bytes2);
                byte[] bytes3 = str.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes3, "");
                byte[] bArrEncode = Base64.encode(mac.doFinal(bytes3), 2);
                Intrinsics.checkNotNullExpressionValue(bArrEncode, "");
                return new String(bArrEncode, charset);
            } catch (Exception unused) {
                String unused2 = SignatureGenerator.TAG;
                return "";
            }
        }
    }
}
