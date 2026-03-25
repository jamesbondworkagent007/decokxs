package com.reown.foundation.crypto.data.repository;

import com.reown.foundation.common.model.PrivateKey;
import com.reown.foundation.common.model.PublicKey;
import com.reown.foundation.crypto.data.repository.model.IrnJwtClaims;
import com.reown.foundation.util.jwt.JwtHeader;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import com.reown.util.UtilFunctionsKt;
import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import o.C56390yDp;
import o.C56391yDq;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.generators.Ed25519KeyPairGenerator;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.Ed25519KeyGenerationParameters;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseClientIdJwtRepository implements ClientIdJwtRepository {
    public static final String CLIENT_ID_KEYPAIR_TAG = "key_did_keypair";
    public static final Companion Companion = new Companion(null);
    private static final int KEY_NONCE_SIZE = 32;
    private static final int KEY_SIZE = 32;

    /* JADX INFO: renamed from: setKeyPair-FCmjpgM */
    public abstract void mo7198setKeyPairFCmjpgM(@NotNull String str, @NotNull String str2, @NotNull String str3);

    public Pair<String, String> getKeyPair() {
        return generateAndStoreClientIdKeyPair();
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.reown.foundation.util.jwt.JwtUtilsKt.jwtIatAndExp$default(java.util.concurrent.TimeUnit, long, java.util.concurrent.TimeUnit, long, int, java.lang.Object):kotlin.Pair */
    @Override // com.reown.foundation.crypto.data.repository.ClientIdJwtRepository
    public String generateJWT(@NotNull String str, @NotNull Function1<? super String, Unit> function1) throws Throwable {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        String strGenerateSubject = generateSubject();
        Pair<String, String> keyPair = getKeyPair();
        String strComponent1 = keyPair.component1();
        String strComponent2 = keyPair.component2();
        String strEncodeEd25519DidKey = JwtUtilsKt.encodeEd25519DidKey(UtilFunctionsKt.hexToBytes(strComponent1));
        function1.invoke((String) CollectionsKt___CollectionsKt.AubY(StringsKt__StringsKt.split$default((CharSequence) strEncodeEd25519DidKey, new String[]{":"}, false, 0, 6, (Object) null)));
        Pair pairJwtIatAndExp$default = JwtUtilsKt.jwtIatAndExp$default(TimeUnit.SECONDS, 1L, TimeUnit.DAYS, 0L, 8, null);
        IrnJwtClaims irnJwtClaims = new IrnJwtClaims(strEncodeEd25519DidKey, strGenerateSubject, str, ((Number) pairJwtIatAndExp$default.component1()).longValue(), ((Number) pairJwtIatAndExp$default.component2()).longValue());
        JwtHeader.Companion companion = JwtHeader.Companion;
        byte[] bytes = JwtUtilsKt.encodeData(companion.getEdDSA().getEncoded(), irnJwtClaims).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        Object objM7326signJwtFH9GnLg = JwtUtilsKt.m7326signJwtFH9GnLg(PrivateKey.m7309constructorimpl(strComponent2), bytes);
        C56391yDq.AEQbTJ(objM7326signJwtFH9GnLg);
        return JwtUtilsKt.encodeJWT(companion.getEdDSA().getEncoded(), irnJwtClaims, (byte[]) objM7326signJwtFH9GnLg);
    }

    public final Pair<String, String> generateAndStoreClientIdKeyPair() {
        SecureRandom secureRandom = new SecureRandom();
        Ed25519KeyPairGenerator ed25519KeyPairGenerator = new Ed25519KeyPairGenerator();
        ed25519KeyPairGenerator.init(new Ed25519KeyGenerationParameters(secureRandom));
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = ed25519KeyPairGenerator.generateKeyPair();
        Intrinsics.checkNotNullExpressionValue(asymmetricCipherKeyPairGenerateKeyPair, "");
        AsymmetricKeyParameter asymmetricKeyParameter = asymmetricCipherKeyPairGenerateKeyPair.getPublic();
        Intrinsics.copydefault(asymmetricKeyParameter, "");
        AsymmetricKeyParameter asymmetricKeyParameter2 = asymmetricCipherKeyPairGenerateKeyPair.getPrivate();
        Intrinsics.copydefault(asymmetricKeyParameter2, "");
        byte[] encoded = ((Ed25519PublicKeyParameters) asymmetricKeyParameter).getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "");
        String strM7317constructorimpl = PublicKey.m7317constructorimpl(UtilFunctionsKt.bytesToHex(encoded));
        byte[] encoded2 = ((Ed25519PrivateKeyParameters) asymmetricKeyParameter2).getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded2, "");
        String strM7309constructorimpl = PrivateKey.m7309constructorimpl(UtilFunctionsKt.bytesToHex(encoded2));
        mo7198setKeyPairFCmjpgM(CLIENT_ID_KEYPAIR_TAG, strM7309constructorimpl, strM7317constructorimpl);
        return C56390yDp.OLrzqt(strM7317constructorimpl, strM7309constructorimpl);
    }

    public final String generateSubject() {
        return UtilFunctionsKt.bytesToHex(UtilFunctionsKt.randomBytes(32));
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.foundation.crypto.data.repository.BaseClientIdJwtRepository.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
