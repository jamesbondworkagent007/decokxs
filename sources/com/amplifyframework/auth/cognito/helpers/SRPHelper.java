package com.amplifyframework.auth.cognito.helpers;

import android.util.Base64;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import o.yCN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SRPHelper {
    public static final Companion Companion = new Companion(null);
    private static final int EPHEMERAL_KEY_LENGTH = 1024;
    private static final String HMAC_SHA_256 = "HmacSHA256";
    private final String DERIVED_KEY_INFO;
    private final int DERIVED_KEY_SIZE;
    private final String HEX_N;
    private final BigInteger N;
    private String dateString;
    private final MessageDigest digest;
    private final BigInteger g;
    private final BigInteger k;
    private final String password;
    private BigInteger privateA;
    private BigInteger publicA;
    private final SecureRandom random;
    private String userId;
    private String userPoolName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDateString() {
        return this.dateString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAValues(@NotNull BigInteger bigInteger, @NotNull BigInteger bigInteger2) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        Intrinsics.checkNotNullParameter(bigInteger2, "");
        this.privateA = bigInteger;
        this.publicA = bigInteger2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDateString(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dateString = str;
    }

    public SRPHelper(@NotNull String str) throws NoSuchAlgorithmException {
        BigInteger bigIntegerModPow;
        Intrinsics.checkNotNullParameter(str, "");
        this.password = str;
        this.g = BigInteger.valueOf(2L);
        this.HEX_N = "FFFFFFFFFFFFFFFFC90FDAA22168C234C4C6628B80DC1CD129024E088A67CC74020BBEA63B139B22514A08798E3404DDEF9519B3CD3A431B302B0A6DF25F14374FE1356D6D51C245E485B576625E7EC6F44C42E9A637ED6B0BFF5CB6F406B7EDEE386BFB5A899FA5AE9F24117C4B1FE649286651ECE45B3DC2007CB8A163BF0598DA48361C55D39A69163FA8FD24CF5F83655D23DCA3AD961C62F356208552BB9ED529077096966D670C354E4ABC9804F1746C08CA18217C32905E462E36CE3BE39E772C180E86039B2783A2EC07A28FB5C55DF06F4C52C9DE2BCBF6955817183995497CEA956AE515D2261898FA051015728E5A8AAAC42DAD33170D04507A33A85521ABDF1CBA64ECFB850458DBEF0A8AEA71575D060C7DB3970F85A6E1E4C7ABF5AE8CDB0933D71E8C94E04A25619DCEE3D2261AD2EE6BF12FFA06D98A0864D87602733EC86A64521F2B18177B200CBBE117577A615D6C770988C0BAD946E208E24FA074E5AB3143DB5BFCE0FD108E4B82D120A93AD2CAFFFFFFFFFFFFFFFF";
        this.N = new BigInteger("FFFFFFFFFFFFFFFFC90FDAA22168C234C4C6628B80DC1CD129024E088A67CC74020BBEA63B139B22514A08798E3404DDEF9519B3CD3A431B302B0A6DF25F14374FE1356D6D51C245E485B576625E7EC6F44C42E9A637ED6B0BFF5CB6F406B7EDEE386BFB5A899FA5AE9F24117C4B1FE649286651ECE45B3DC2007CB8A163BF0598DA48361C55D39A69163FA8FD24CF5F83655D23DCA3AD961C62F356208552BB9ED529077096966D670C354E4ABC9804F1746C08CA18217C32905E462E36CE3BE39E772C180E86039B2783A2EC07A28FB5C55DF06F4C52C9DE2BCBF6955817183995497CEA956AE515D2261898FA051015728E5A8AAAC42DAD33170D04507A33A85521ABDF1CBA64ECFB850458DBEF0A8AEA71575D060C7DB3970F85A6E1E4C7ABF5AE8CDB0933D71E8C94E04A25619DCEE3D2261AD2EE6BF12FFA06D98A0864D87602733EC86A64521F2B18177B200CBBE117577A615D6C770988C0BAD946E208E24FA074E5AB3143DB5BFCE0FD108E4B82D120A93AD2CAFFFFFFFFFFFFFFFF", 16);
        this.random = new SecureRandom();
        this.DERIVED_KEY_INFO = "Caldera Derived Key";
        this.DERIVED_KEY_SIZE = 16;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Intrinsics.checkNotNullExpressionValue(messageDigest, "");
        this.digest = messageDigest;
        do {
            BigInteger bigIntegerMod = new BigInteger(EPHEMERAL_KEY_LENGTH, this.random).mod(this.N);
            Intrinsics.checkNotNullExpressionValue(bigIntegerMod, "");
            this.privateA = bigIntegerMod;
            bigIntegerModPow = this.g.modPow(bigIntegerMod, this.N);
            Intrinsics.checkNotNullExpressionValue(bigIntegerModPow, "");
            this.publicA = bigIntegerModPow;
        } while (Intrinsics.EZpvd(bigIntegerModPow.mod(this.N), BigInteger.ZERO));
        this.digest.reset();
        this.digest.update(this.N.toByteArray());
        this.k = new BigInteger(1, this.digest.digest(this.g.toByteArray()));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE MMM d HH:mm:ss z yyyy", Locale.US);
        simpleDateFormat.setTimeZone(yCN.OLrzqt("UTC"));
        String str2 = simpleDateFormat.format(new Date());
        Intrinsics.checkNotNullExpressionValue(str2, "");
        this.dateString = str2;
        this.userId = "";
        this.userPoolName = "";
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.cognito.helpers.SRPHelper.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final void setUserPoolParams(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.userId = str;
        this.userPoolName = str2;
        if (StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) "_", false, 2, (Object) null)) {
            this.userPoolName = new Regex("_").split(str2, 2).get(1);
        }
    }

    public final BigInteger modN(@NotNull BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        BigInteger bigIntegerMod = bigInteger.mod(this.N);
        Intrinsics.checkNotNullExpressionValue(bigIntegerMod, "");
        return bigIntegerMod;
    }

    public final String getPublicA() {
        String string = this.publicA.toString(16);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final BigInteger computeU$aws_auth_cognito_release(@NotNull BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        this.digest.reset();
        this.digest.update(this.publicA.toByteArray());
        return new BigInteger(1, this.digest.digest(bigInteger.toByteArray()));
    }

    public final BigInteger computeX$aws_auth_cognito_release(@NotNull BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        this.digest.reset();
        MessageDigest messageDigest = this.digest;
        String str = this.userPoolName;
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        messageDigest.update(bytes);
        MessageDigest messageDigest2 = this.digest;
        byte[] bytes2 = this.userId.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "");
        messageDigest2.update(bytes2);
        MessageDigest messageDigest3 = this.digest;
        byte[] bytes3 = ":".getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes3, "");
        messageDigest3.update(bytes3);
        MessageDigest messageDigest4 = this.digest;
        byte[] bytes4 = this.password.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes4, "");
        byte[] bArrDigest = messageDigest4.digest(bytes4);
        this.digest.reset();
        this.digest.update(bigInteger.toByteArray());
        return new BigInteger(1, this.digest.digest(bArrDigest));
    }

    public final BigInteger computePasswordVerifier$aws_auth_cognito_release(@NotNull BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        BigInteger bigIntegerModPow = this.g.modPow(computeX$aws_auth_cognito_release(bigInteger), this.N);
        Intrinsics.checkNotNullExpressionValue(bigIntegerModPow, "");
        return bigIntegerModPow;
    }

    public final BigInteger computeS$aws_auth_cognito_release(@NotNull BigInteger bigInteger, @NotNull BigInteger bigInteger2, @NotNull BigInteger bigInteger3) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        Intrinsics.checkNotNullParameter(bigInteger2, "");
        Intrinsics.checkNotNullParameter(bigInteger3, "");
        BigInteger bigIntegerMod = bigInteger3.subtract(this.k.multiply(this.g.modPow(bigInteger2, this.N))).modPow(this.privateA.add(bigInteger.multiply(bigInteger2)), this.N).mod(this.N);
        Intrinsics.checkNotNullExpressionValue(bigIntegerMod, "");
        return bigIntegerMod;
    }

    public final byte[] computePasswordAuthenticationKey$aws_auth_cognito_release(@NotNull BigInteger bigInteger, @NotNull BigInteger bigInteger2) throws NoSuchAlgorithmException, InvalidKeyException {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        Intrinsics.checkNotNullParameter(bigInteger2, "");
        String str = HMAC_SHA_256;
        Mac mac = Mac.getInstance(str);
        mac.init(new SecretKeySpec(bigInteger2.toByteArray(), str));
        byte[] bArrDoFinal = mac.doFinal(bigInteger.toByteArray());
        mac.reset();
        mac.init(new SecretKeySpec(bArrDoFinal, str));
        String str2 = this.DERIVED_KEY_INFO;
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str2.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        mac.update(bytes);
        byte[] bytes2 = String.valueOf((char) 1).getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "");
        byte[] bArrDoFinal2 = mac.doFinal(bytes2);
        Intrinsics.copydefault(bArrDoFinal2);
        byte[] bArrCopyOf = Arrays.copyOf(bArrDoFinal2, this.DERIVED_KEY_SIZE);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
        return bArrCopyOf;
    }

    public final byte[] generateM1Signature$aws_auth_cognito_release(@NotNull byte[] bArr, @NotNull String str) throws NoSuchAlgorithmException, InvalidKeyException {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = HMAC_SHA_256;
        Mac mac = Mac.getInstance(str2);
        mac.init(new SecretKeySpec(bArr, str2));
        String str3 = this.userPoolName;
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str3.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        mac.update(bytes);
        byte[] bytes2 = this.userId.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "");
        mac.update(bytes2);
        mac.update(Base64.decode(str, 2));
        byte[] bytes3 = this.dateString.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes3, "");
        byte[] bArrDoFinal = mac.doFinal(bytes3);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "");
        return bArrDoFinal;
    }

    public final String getSignature(@NotNull String str, @NotNull String str2, @NotNull String str3) throws Exception {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        BigInteger bigInteger = new BigInteger(str2, 16);
        BigInteger bigInteger2 = new BigInteger(str, 16);
        BigInteger bigIntegerMod = bigInteger.mod(this.N);
        BigInteger bigInteger3 = BigInteger.ZERO;
        if (Intrinsics.EZpvd(bigIntegerMod, bigInteger3)) {
            throw new Exception("Bad server public value 'B'");
        }
        BigInteger bigIntegerComputeU$aws_auth_cognito_release = computeU$aws_auth_cognito_release(bigInteger);
        if (Intrinsics.EZpvd(bigIntegerComputeU$aws_auth_cognito_release.mod(this.N), bigInteger3)) {
            throw new Exception("Hash of A and B cannot be zero");
        }
        String strEncodeToString = Base64.encodeToString(generateM1Signature$aws_auth_cognito_release(computePasswordAuthenticationKey$aws_auth_cognito_release(computeS$aws_auth_cognito_release(bigIntegerComputeU$aws_auth_cognito_release, computeX$aws_auth_cognito_release(bigInteger2), bigInteger), bigIntegerComputeU$aws_auth_cognito_release), str3), 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
        return strEncodeToString;
    }
}
