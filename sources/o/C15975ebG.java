package o;

import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.business.defi.wallet.common.okxconnect.util.Ed25519KeyPair;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationUnit;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import kotlinx.serialization.json.JsonPrimitive;
import o.C59462zhW;
import okio.ByteString;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.crypto.signers.Ed25519Signer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ebG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C15975ebG {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.ebM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C15975ebG.AEQbTJ();
        }
    });

    public final Ed25519Signer EZpvd() {
        return (Ed25519Signer) this.EZpvd.getValue();
    }

    public static final Ed25519Signer AEQbTJ() {
        return new Ed25519Signer();
    }

    /* JADX DEBUG: Class process forced to load method for inline: okio.ByteString.Companion.of$default(okio.ByteString$Companion, byte[], int, int, int, java.lang.Object):okio.ByteString */
    public final java.lang.String KWHzl(@NotNull Ed25519KeyPair ed25519KeyPair) {
        Intrinsics.checkNotNullParameter(ed25519KeyPair, "");
        C15978ebJ c15978ebJEZpvd = EZpvd(ed25519KeyPair.KWHzl());
        ByteString.Companion companion = ByteString.Companion;
        java.lang.String str = ByteString.Companion.of$default(companion, c15978ebJEZpvd.OLrzqt(), 0, 0, 3, null).base64Url() + JwtUtilsKt.JWT_DELIMITER + ByteString.Companion.of$default(companion, c15978ebJEZpvd.AEQbTJ(), 0, 0, 3, null).base64Url();
        return str + JwtUtilsKt.JWT_DELIMITER + ByteString.Companion.of$default(companion, EZpvd(new Ed25519PrivateKeyParameters(ed25519KeyPair.AEQbTJ()), C59449zhJ.getNewProxyInstance(str)), 0, 0, 3, null).base64Url();
    }

    public final boolean KWHzl(@NotNull java.lang.String str, @NotNull byte[] bArr) {
        java.lang.String strUtf8;
        JsonObject jsonObject;
        ByteString byteStringDecodeBase64;
        byte[] byteArray;
        JsonPrimitive jsonPrimitive;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        try {
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{JwtUtilsKt.JWT_DELIMITER}, false, 0, 6, (java.lang.Object) null);
            if (listSplit$default.size() != 3) {
                listSplit$default = null;
            }
            if (listSplit$default == null) {
                return false;
            }
            java.lang.String str2 = (java.lang.String) listSplit$default.get(0);
            java.lang.String str3 = (java.lang.String) listSplit$default.get(1);
            java.lang.String str4 = (java.lang.String) listSplit$default.get(2);
            ByteString.Companion companion = ByteString.Companion;
            ByteString byteStringDecodeBase642 = companion.decodeBase64(str3);
            if (byteStringDecodeBase642 != null && (strUtf8 = byteStringDecodeBase642.utf8()) != null && (jsonObject = JsonElementKt.getJsonObject(Json.Default.parseToJsonElement(strUtf8))) != null) {
                JsonElement jsonElement = (JsonElement) jsonObject.get((java.lang.Object) "exp");
                if (((jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? 0L : JsonElementKt.getLong(jsonPrimitive)) >= java.lang.System.currentTimeMillis() && (byteStringDecodeBase64 = companion.decodeBase64(str4)) != null && (byteArray = byteStringDecodeBase64.toByteArray()) != null) {
                    return OLrzqt(new Ed25519PublicKeyParameters(bArr), C59449zhJ.getNewProxyInstance(str2 + JwtUtilsKt.JWT_DELIMITER + str3), byteArray);
                }
            }
            return false;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("JwtGenerator", "Failed to validate jwt - " + e.getMessage(), e);
            return false;
        }
    }

    public final C15978ebJ EZpvd(byte[] bArr) {
        java.lang.String strKWHzl = KWHzl(bArr);
        C59462zhW.Activity activity = C59462zhW.OLrzqt;
        long jGEmmrt = C59462zhW.gEmmrt(C59519zia.EZpvd(1, DurationUnit.DAYS));
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder, "alg", "EdDSA");
        JsonElementBuildersKt.put(jsonObjectBuilder, ClientData.KEY_TYPE, "JWT");
        byte[] newProxyInstance = C59449zhJ.getNewProxyInstance(jsonObjectBuilder.build().toString());
        JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder2, "iss", "did:key:" + strKWHzl);
        JsonElementBuildersKt.put(jsonObjectBuilder2, "sub", FirebaseAnalytics.Event.LOGIN);
        JsonElementBuildersKt.put(jsonObjectBuilder2, "aud", "dapp");
        JsonElementBuildersKt.put(jsonObjectBuilder2, "iat", java.lang.Long.valueOf(jCurrentTimeMillis));
        JsonElementBuildersKt.put(jsonObjectBuilder2, "exp", java.lang.Long.valueOf(jCurrentTimeMillis + jGEmmrt));
        JsonElementBuildersKt.put(jsonObjectBuilder2, "act", "authenticate user");
        return new C15978ebJ(newProxyInstance, C59449zhJ.getNewProxyInstance(jsonObjectBuilder2.build().toString()));
    }

    public final byte[] EZpvd(Ed25519PrivateKeyParameters ed25519PrivateKeyParameters, byte[] bArr) {
        EZpvd().init(true, ed25519PrivateKeyParameters);
        EZpvd().update(bArr, 0, bArr.length);
        byte[] bArrGenerateSignature = EZpvd().generateSignature();
        Intrinsics.checkNotNullExpressionValue(bArrGenerateSignature, "");
        return bArrGenerateSignature;
    }

    public final boolean OLrzqt(Ed25519PublicKeyParameters ed25519PublicKeyParameters, byte[] bArr, byte[] bArr2) {
        EZpvd().init(false, ed25519PublicKeyParameters);
        EZpvd().update(bArr, 0, bArr.length);
        return EZpvd().verifySignature(bArr2);
    }

    public static final java.lang.CharSequence AEQbTJ(byte b) {
        java.lang.String str = java.lang.String.format("%02x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final java.lang.String KWHzl(byte[] bArr) {
        java.math.BigInteger bigInteger = new java.math.BigInteger(yDV.joinToString$default(bArr, (java.lang.CharSequence) "", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, new Function1() { // from class: o.ebH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15975ebG.AEQbTJ(((java.lang.Byte) obj).byteValue());
            }
        }, 30, (java.lang.Object) null), 16);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (bigInteger.compareTo(java.math.BigInteger.ZERO) > 0) {
            java.math.BigInteger bigIntegerValueOf = java.math.BigInteger.valueOf(58L);
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
            java.math.BigInteger bigIntegerRemainder = bigInteger.remainder(bigIntegerValueOf);
            Intrinsics.checkNotNullExpressionValue(bigIntegerRemainder, "");
            sb.insert(0, "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz".charAt(bigIntegerRemainder.intValue()));
            java.math.BigInteger bigIntegerValueOf2 = java.math.BigInteger.valueOf(58L);
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf2, "");
            bigInteger = bigInteger.divide(bigIntegerValueOf2);
            Intrinsics.checkNotNullExpressionValue(bigInteger, "");
        }
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
