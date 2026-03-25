package com.reown.foundation.util.jwt;

import com.reown.foundation.common.model.PrivateKey;
import com.reown.foundation.common.model.PublicKey;
import com.reown.util.UtilFunctionsKt;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory;
import io.ipfs.multibase.Multibase;
import java.lang.reflect.Type;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import o.C56390yDp;
import o.C56391yDq;
import o.C58171ywJ;
import o.C58174ywM;
import o.C59449zhJ;
import o.yDT;
import o.yDY;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.crypto.signers.Ed25519Signer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class JwtUtilsKt {
    public static final String DID_DELIMITER = ":";
    public static final String DID_METHOD_KEY = "key";
    public static final String DID_METHOD_PKH = "pkh";
    public static final String DID_METHOD_WEB = "web";
    public static final String DID_PREFIX = "did";
    public static final String JWT_DELIMITER = ".";
    public static final String MULTICODEC_ED25519_HEADER = "K36";
    public static final String MULTICODEC_X25519_HEADER = "Jxg";

    public static final String encodeJWT(@NotNull String str, @NotNull JwtClaims jwtClaims, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jwtClaims, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        return CollectionsKt___CollectionsKt.joinToString$default(yDY.gEmmrt(str, encodeJSON(jwtClaims), encodeBase64(bArr)), JWT_DELIMITER, null, null, 0, null, null, 62, null);
    }

    public static final String encodeData(@NotNull String str, @NotNull JwtClaims jwtClaims) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jwtClaims, "");
        return CollectionsKt___CollectionsKt.joinToString$default(yDY.gEmmrt(str, encodeJSON(jwtClaims)), JWT_DELIMITER, null, null, 0, null, null, 62, null);
    }

    public static final <T> String encodeJSON(T t) {
        Moshi moshiBuild = new Moshi.Builder().addLast((JsonAdapter.Factory) new KotlinJsonAdapterFactory()).build();
        Intrinsics.copydefault(t);
        String json = moshiBuild.adapter((Type) t.getClass()).toJson(t);
        Intrinsics.copydefault((Object) json);
        byte[] bytes = json.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        return encodeBase64(bytes);
    }

    public static final String encodeBase64(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        byte[] bArrAEQbTJ = C58174ywM.AEQbTJ(bArr);
        Intrinsics.checkNotNullExpressionValue(bArrAEQbTJ, "");
        return new String(bArrAEQbTJ, Charsets.UTF_8);
    }

    public static final String decodeBase64(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        byte[] bArrKWHzl = C58174ywM.KWHzl(bArr);
        Intrinsics.checkNotNullExpressionValue(bArrKWHzl, "");
        String str = new String(bArrKWHzl, Charsets.copydefault);
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        return new String(bytes, charset);
    }

    public static final String encodeEd25519DidKey(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        byte[] bArrCopydefault = C58171ywJ.copydefault(MULTICODEC_ED25519_HEADER);
        Intrinsics.checkNotNullExpressionValue(bArrCopydefault, "");
        return CollectionsKt___CollectionsKt.joinToString$default(yDY.gEmmrt(DID_PREFIX, DID_METHOD_KEY, Multibase.KWHzl(Multibase.Base.Base58BTC, yDT.copydefault(bArrCopydefault, bArr))), ":", null, null, 0, null, null, 62, null);
    }

    public static final String encodeX25519DidKey(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        byte[] bArrCopydefault = C58171ywJ.copydefault(MULTICODEC_X25519_HEADER);
        Intrinsics.checkNotNullExpressionValue(bArrCopydefault, "");
        return CollectionsKt___CollectionsKt.joinToString$default(yDY.gEmmrt(DID_PREFIX, DID_METHOD_KEY, Multibase.KWHzl(Multibase.Base.Base58BTC, yDT.copydefault(bArrCopydefault, bArr))), ":", null, null, 0, null, null, 62, null);
    }

    public static final String decodeEd25519DidKey(@NotNull String str) throws Throwable {
        Intrinsics.checkNotNullParameter(str, "");
        byte[] bArrEZpvd = Multibase.EZpvd((String) CollectionsKt___CollectionsKt.AubY(StringsKt__StringsKt.split$default((CharSequence) str, new String[]{":"}, false, 0, 6, (Object) null)));
        Intrinsics.checkNotNullExpressionValue(bArrEZpvd, "");
        String strBytesToHex = UtilFunctionsKt.bytesToHex(bArrEZpvd);
        if (!C59449zhJ.startsWith$default(strBytesToHex, "ed01", false, 2, null)) {
            throw new Throwable("Invalid key: " + strBytesToHex);
        }
        return PublicKey.m7317constructorimpl(StringsKt__StringsKt.KWHzl(strBytesToHex, (CharSequence) "ed01"));
    }

    public static final String decodeX25519DidKey(@NotNull String str) throws Throwable {
        Intrinsics.checkNotNullParameter(str, "");
        byte[] bArrEZpvd = Multibase.EZpvd((String) CollectionsKt___CollectionsKt.AubY(StringsKt__StringsKt.split$default((CharSequence) str, new String[]{":"}, false, 0, 6, (Object) null)));
        Intrinsics.checkNotNullExpressionValue(bArrEZpvd, "");
        String strBytesToHex = UtilFunctionsKt.bytesToHex(bArrEZpvd);
        if (!C59449zhJ.startsWith$default(strBytesToHex, "ec01", false, 2, null)) {
            throw new Throwable("Invalid key: " + strBytesToHex);
        }
        return PublicKey.m7317constructorimpl(StringsKt__StringsKt.KWHzl(strBytesToHex, (CharSequence) "ec01"));
    }

    public static /* synthetic */ Pair jwtIatAndExp$default(TimeUnit timeUnit, long j, TimeUnit timeUnit2, long j2, int i, Object obj) {
        if ((i & 8) != 0) {
            j2 = System.currentTimeMillis();
        }
        return jwtIatAndExp(timeUnit, j, timeUnit2, j2);
    }

    public static final Pair<Long, Long> jwtIatAndExp(@NotNull TimeUnit timeUnit, long j, @NotNull TimeUnit timeUnit2, long j2) {
        Intrinsics.checkNotNullParameter(timeUnit, "");
        Intrinsics.checkNotNullParameter(timeUnit2, "");
        long jConvert = timeUnit.convert(j2, TimeUnit.MILLISECONDS);
        return C56390yDp.OLrzqt(Long.valueOf(jConvert), Long.valueOf(timeUnit.convert(j, timeUnit2) + jConvert));
    }

    public static final String encodeDidPkh(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return CollectionsKt___CollectionsKt.joinToString$default(yDY.gEmmrt(DID_PREFIX, DID_METHOD_PKH, str), ":", null, null, 0, null, null, 62, null);
    }

    public static final String decodeDidPkh(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.fetchVPNInfo(StringsKt__StringsKt.split$default((CharSequence) str, new String[]{":"}, false, 0, 6, (Object) null), 3), ":", null, null, 0, null, null, 62, null);
    }

    public static final String encodeDidWeb(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return CollectionsKt___CollectionsKt.joinToString$default(yDY.gEmmrt(DID_PREFIX, "web", new URI(str).getHost()), ":", null, null, 0, null, null, 62, null);
    }

    public static final String decodeDidWeb(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return StringsKt__StringsKt.KWHzl(str, (CharSequence) CollectionsKt___CollectionsKt.joinToString$default(yDY.gEmmrt(DID_PREFIX, "web"), ":", null, ":", 0, null, null, 58, null));
    }

    public static final /* synthetic */ <C extends JwtClaims> Object decodeJwt(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{JWT_DELIMITER}, false, 0, 6, (Object) null);
            if (listSplit$default.size() != 3) {
                throw new Throwable("Unable to split jwt: " + str);
            }
            String str2 = (String) listSplit$default.get(0);
            String str3 = (String) listSplit$default.get(1);
            String str4 = (String) listSplit$default.get(2);
            Charset charset = Charsets.UTF_8;
            byte[] bytes = str3.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            String strDecodeBase64 = decodeBase64(bytes);
            byte[] bytes2 = str2.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes2, "");
            String strDecodeBase642 = decodeBase64(bytes2);
            byte[] bytes3 = str4.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes3, "");
            String strDecodeBase643 = decodeBase64(bytes3);
            Moshi moshiBuild = new Moshi.Builder().addLast((JsonAdapter.Factory) new KotlinJsonAdapterFactory()).build();
            Intrinsics.KWHzl(4, "C");
            JwtClaims jwtClaims = (JwtClaims) moshiBuild.adapter(JwtClaims.class).fromJson(strDecodeBase64);
            if (jwtClaims == null) {
                throw new Throwable("Invalid claims: " + str3);
            }
            Intrinsics.copydefault(jwtClaims);
            JwtHeader jwtHeader = (JwtHeader) moshiBuild.adapter(JwtHeader.class).fromJson(strDecodeBase642);
            if (jwtHeader != null) {
                Intrinsics.copydefault(jwtHeader);
                return Result.m7377constructorimpl(new Triple(jwtHeader, jwtClaims, strDecodeBase643));
            }
            throw new Throwable("Invalid header: " + str2);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public static final String extractData(@NotNull String str) throws Throwable {
        Intrinsics.checkNotNullParameter(str, "");
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{JWT_DELIMITER}, false, 0, 6, (Object) null);
        if (listSplit$default.size() != 3) {
            throw new Throwable("Unable to split jwt: " + str);
        }
        return CollectionsKt___CollectionsKt.joinToString$default(yDY.gEmmrt((String) listSplit$default.get(0), (String) listSplit$default.get(1)), JWT_DELIMITER, null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: renamed from: signJwt-FH9GnLg, reason: not valid java name */
    public static final Object m7326signJwtFH9GnLg(@NotNull String str, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        try {
            Result.Application application = Result.Companion;
            Ed25519PrivateKeyParameters ed25519PrivateKeyParameters = new Ed25519PrivateKeyParameters(PrivateKey.m7312getKeyAsBytesimpl(str));
            Ed25519Signer ed25519Signer = new Ed25519Signer();
            ed25519Signer.init(true, ed25519PrivateKeyParameters);
            ed25519Signer.update(bArr, 0, bArr.length);
            return Result.m7377constructorimpl(ed25519Signer.generateSignature());
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX INFO: renamed from: verifySignature-dKHZaD0, reason: not valid java name */
    public static final Object m7327verifySignaturedKHZaD0(@NotNull String str, @NotNull byte[] bArr, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            Result.Application application = Result.Companion;
            Ed25519PublicKeyParameters ed25519PublicKeyParameters = new Ed25519PublicKeyParameters(PublicKey.m7320getKeyAsBytesimpl(str));
            Ed25519Signer ed25519Signer = new Ed25519Signer();
            ed25519Signer.init(false, ed25519PublicKeyParameters);
            ed25519Signer.update(bArr, 0, bArr.length);
            byte[] bytes = str2.getBytes(Charsets.copydefault);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            return Result.m7377constructorimpl(Boolean.valueOf(ed25519Signer.verifySignature(bytes)));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
