package com.amplifyframework.predictions.aws.http;

import android.net.Uri;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C56390yDp;
import o.C56393yDs;
import o.C56407yEf;
import o.C56424yEw;
import o.C59449zhJ;
import o.InterfaceC52697wV;
import o.yCN;
import o.yDY;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes2.dex */
public final class AWSV4Signer {
    private static final String ALGORITHM_AWS4_HMAC_SHA_256 = "AWS4-HMAC-SHA256";
    private static final String ALGORITHM_AWS4_HMAC_SHA_256_PAYLOAD = "AWS4-HMAC-SHA256-PAYLOAD";
    private static final String AWS4_REQUEST_TYPE = "aws4_request";
    private static final String DATE_PATTERN = "yyyyMMdd";
    private static final Logger LOG;
    private static final String METHOD = "GET";
    private static final String NEW_LINE_DELIMITER = "\n";
    private static final String SERVICE = "rekognition";
    private static final String SIGNED_HEADERS = "host";
    private static final String TIME_PATTERN = "yyyyMMdd'T'HHmmss'Z'";
    private static final String X_AMZ_ALGORITHM = "X-Amz-Algorithm";
    private static final String X_AMZ_CREDENTIAL = "X-Amz-Credential";
    private static final String X_AMZ_DATE = "X-Amz-Date";
    private static final String X_AMZ_EXPIRES = "X-Amz-Expires";
    private static final String X_AMZ_SECURITY_TOKEN = "X-Amz-Security-Token";
    private static final String X_AMZ_SIGNATURE = "X-Amz-Signature";
    private static final String X_AMZ_SIGNED_HEADERS = "X-Amz-SignedHeaders";
    private static final String X_AMZ_USER_AGENT = "x-amz-user-agent";
    private final SimpleDateFormat dateFormatter;
    private final String encodedSpace;
    private String priorSignature = "";
    private final MessageDigest sha256Algorithm;
    private final SimpleDateFormat timeFormatter;
    public static final Companion Companion = new Companion(null);
    private static final TimeZone GMT_TIMEZONE = yCN.OLrzqt("GMT");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEncodedSpace() {
        return this.encodedSpace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void resetPriorSignature() {
        this.priorSignature = "";
    }

    public AWSV4Signer() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_PATTERN, new Locale("en", "US", "POSIX"));
        this.dateFormatter = simpleDateFormat;
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(TIME_PATTERN, new Locale("en", "US", "POSIX"));
        this.timeFormatter = simpleDateFormat2;
        this.sha256Algorithm = MessageDigest.getInstance("SHA-256");
        String strEncode = Uri.encode(" ");
        Intrinsics.checkNotNullExpressionValue(strEncode, "");
        this.encodedSpace = strEncode;
        TimeZone timeZone = GMT_TIMEZONE;
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.setLenient(false);
        simpleDateFormat2.setTimeZone(timeZone);
        simpleDateFormat2.setLenient(false);
    }

    public static /* synthetic */ URI getSignedUri$default(AWSV4Signer aWSV4Signer, URI uri, InterfaceC52697wV interfaceC52697wV, String str, String str2, long j, int i, Object obj) {
        if ((i & 16) != 0) {
            j = new Date().getTime();
        }
        return aWSV4Signer.getSignedUri(uri, interfaceC52697wV, str, str2, j);
    }

    public final URI getSignedUri(@NotNull URI uri, @NotNull InterfaceC52697wV interfaceC52697wV, @NotNull String str, @NotNull String str2, long j) {
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(interfaceC52697wV, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String timeStamp = getTimeStamp(j);
        String dateStamp = getDateStamp(j);
        String strDjBIcL = interfaceC52697wV.djBIcL();
        String canonicalizedQueryString = getCanonicalizedQueryString(buildQueryParamsMap(uri, interfaceC52697wV.EZpvd(), strDjBIcL == null ? "" : strDjBIcL, str, timeStamp, dateStamp, str2));
        String strConvertBytesToHex = convertBytesToHex(hmacSha256(signString(timeStamp, createCredentialScope(str, dateStamp), getCanonicalRequest(uri, canonicalizedQueryString)), createSignature(str, interfaceC52697wV.copydefault(), dateStamp)));
        if (this.priorSignature.length() == 0) {
            this.priorSignature = strConvertBytesToHex;
        }
        try {
            return new URI(uri.getScheme(), uri.getRawAuthority(), getCanonicalUri(uri), canonicalizedQueryString + "&X-Amz-Signature=" + strConvertBytesToHex, null);
        } catch (URISyntaxException unused) {
            LOG.error("Error creating signed URI.");
            return null;
        }
    }

    public final String getSignedFrame(@NotNull String str, @NotNull byte[] bArr, @NotNull String str2, @NotNull Pair<String, ? extends Date> pair) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(pair, "");
        long time = pair.getSecond().getTime();
        String timeStamp = getTimeStamp(time);
        String dateStamp = getDateStamp(time);
        String strConvertBytesToHex = convertBytesToHex(hmacSha256(signStringWithPreviousSignature(timeStamp, createCredentialScope(str, dateStamp), bArr, pair), createSignature(str, str2, dateStamp)));
        this.priorSignature = strConvertBytesToHex;
        return strConvertBytesToHex;
    }

    private final String createCredentialScope(String str, String str2) {
        return CollectionsKt___CollectionsKt.joinToString$default(yDY.gEmmrt(str2, str, SERVICE, AWS4_REQUEST_TYPE), "/", null, null, 0, null, null, 62, null);
    }

    private final byte[] hmacSha256(String str, byte[] bArr) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
            Charset charsetDefaultCharset = Charset.defaultCharset();
            Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "");
            byte[] bytes = str.getBytes(charsetDefaultCharset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            byte[] bArrDoFinal = mac.doFinal(bytes);
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "");
            return bArrDoFinal;
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalArgumentException(e2.getMessage(), e2);
        }
    }

    private final byte[] createSignature(String str, String str2, String str3) {
        Charset charsetDefaultCharset = Charset.defaultCharset();
        Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "");
        byte[] bytes = ("AWS4" + str2).getBytes(charsetDefaultCharset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        return hmacSha256(AWS4_REQUEST_TYPE, hmacSha256(SERVICE, hmacSha256(str, hmacSha256(str3, bytes))));
    }

    private final String signString(String str, String str2, String str3) {
        MessageDigest messageDigest = this.sha256Algorithm;
        Charset charsetDefaultCharset = Charset.defaultCharset();
        Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "");
        byte[] bytes = str3.getBytes(charsetDefaultCharset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        return CollectionsKt___CollectionsKt.joinToString$default(yDY.gEmmrt(ALGORITHM_AWS4_HMAC_SHA_256, str, str2, convertBytesToHex(bArrDigest)), NEW_LINE_DELIMITER, null, null, 0, null, null, 62, null);
    }

    private final String signStringWithPreviousSignature(String str, String str2, byte[] bArr, Pair<String, ? extends Date> pair) {
        byte[] bArrDigest = this.sha256Algorithm.digest(bArr);
        Intrinsics.copydefault(bArrDigest);
        String strConvertBytesToHex = convertBytesToHex(bArrDigest);
        byte[] bArrDigest2 = this.sha256Algorithm.digest(encodeDateHeader(pair));
        Intrinsics.copydefault(bArrDigest2);
        return CollectionsKt___CollectionsKt.joinToString$default(yDY.gEmmrt(ALGORITHM_AWS4_HMAC_SHA_256_PAYLOAD, str, str2, this.priorSignature, convertBytesToHex(bArrDigest2), strConvertBytesToHex), NEW_LINE_DELIMITER, null, null, 0, null, null, 62, null);
    }

    private final byte[] encodeDateHeader(Pair<String, ? extends Date> pair) {
        int length = pair.getFirst().length();
        long time = pair.getSecond().getTime();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 10);
        byteBufferAllocate.put(C56393yDs.copydefault((byte) length));
        byteBufferAllocate.put(ByteString.Companion.encodeUtf8(pair.getFirst()).toByteArray());
        byteBufferAllocate.put((byte) 8);
        byteBufferAllocate.putLong(time);
        Buffer bufferPosition = byteBufferAllocate.position(0);
        Intrinsics.copydefault(bufferPosition, "");
        byte[] bArrArray = ((ByteBuffer) bufferPosition).array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "");
        return bArrArray;
    }

    private final String convertBytesToHex(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b);
            if (hexString.length() == 1) {
                sb.append("0");
            } else if (hexString.length() == 8) {
                Intrinsics.copydefault((Object) hexString);
                hexString = hexString.substring(6);
                Intrinsics.checkNotNullExpressionValue(hexString, "");
            }
            sb.append(hexString);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        String lowerCase = string.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    private final String getTimeStamp(long j) {
        String str = this.timeFormatter.format(new Date(j));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    private final String getDateStamp(long j) {
        String str = this.dateFormatter.format(new Date(j));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    private final Map<String, String> buildQueryParamsMap(URI uri, String str, String str2, String str3, String str4, String str5, String str6) {
        Map mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt(X_AMZ_ALGORITHM, ALGORITHM_AWS4_HMAC_SHA_256), C56390yDp.OLrzqt(X_AMZ_CREDENTIAL, urlEncode(str + "/" + createCredentialScope(str3, str5))), C56390yDp.OLrzqt(X_AMZ_DATE, str4), C56390yDp.OLrzqt(X_AMZ_EXPIRES, "299"), C56390yDp.OLrzqt(X_AMZ_SIGNED_HEADERS, SIGNED_HEADERS), C56390yDp.OLrzqt(X_AMZ_USER_AGENT, C59449zhJ.replace$default(urlEncode(str6), Marker.ANY_NON_NULL_MARKER, this.encodedSpace, false, 4, (Object) null)));
        if (str2 != null && str2.length() != 0) {
            mapDjBIcL.put(X_AMZ_SECURITY_TOKEN, urlEncode(str2));
        }
        String query = uri.getQuery();
        if (query != null && query.length() != 0) {
            String query2 = uri.getQuery();
            Intrinsics.checkNotNullExpressionValue(query2, "");
            for (String str7 : StringsKt__StringsKt.split$default((CharSequence) query2, new String[]{ContainerUtils.FIELD_DELIMITER}, false, 0, 6, (Object) null)) {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str7, '=', 0, false, 6, (Object) null);
                if (iIndexOf$default > 0) {
                    String strSubstring = str7.substring(0, iIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    String strSubstring2 = str7.substring(iIndexOf$default + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                    mapDjBIcL.put(strSubstring, urlEncode(strSubstring2));
                }
            }
        }
        return C56424yEw.values(mapDjBIcL);
    }

    private final String urlEncode(String str) {
        try {
            String strEncode = URLEncoder.encode(str, Charset.defaultCharset().name());
            Intrinsics.checkNotNullExpressionValue(strEncode, "");
            return strEncode;
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    private final String getCanonicalizedQueryString(Map<String, String> map) {
        List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG(map.keySet());
        C56407yEf.fIwbmz(listFJNWhG);
        StringBuilder sb = new StringBuilder();
        int size = listFJNWhG.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) listFJNWhG.get(i));
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(map.get(listFJNWhG.get(i)));
            if (listFJNWhG.size() - 1 > i) {
                sb.append(ContainerUtils.FIELD_DELIMITER);
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private final String getCanonicalRequest(URI uri, String str) {
        MessageDigest messageDigest = this.sha256Algorithm;
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(charset, "");
        byte[] bytes = "".getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        String strConvertBytesToHex = convertBytesToHex(bArrDigest);
        return CollectionsKt___CollectionsKt.joinToString$default(yDY.gEmmrt("GET", getCanonicalUri(uri), str, "host:" + uri.getHost() + NEW_LINE_DELIMITER, SIGNED_HEADERS, strConvertBytesToHex), NEW_LINE_DELIMITER, null, null, 0, null, null, 62, null);
    }

    private final String getCanonicalUri(URI uri) {
        String path = uri.getPath();
        return path.length() == 0 ? "/" : path;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.predictions.aws.http.AWSV4Signer.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Logger logger = Amplify.Logging.logger(CategoryType.PREDICTIONS, "amplify:aws-predictions");
        Intrinsics.checkNotNullExpressionValue(logger, "");
        LOG = logger;
    }
}
