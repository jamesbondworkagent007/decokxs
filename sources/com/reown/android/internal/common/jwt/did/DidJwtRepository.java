package com.reown.android.internal.common.jwt.did;

import com.reown.android.internal.common.jwt.did.EncodeDidJwtPayloadUseCase;
import com.reown.android.internal.common.model.DidJwt;
import com.reown.foundation.util.jwt.JwtClaims;
import com.reown.foundation.util.jwt.JwtHeader;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Result;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import o.C56391yDq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class DidJwtRepository {
    /* JADX INFO: renamed from: encodeDidJwt-57yAOYI, reason: not valid java name */
    public static final <R extends JwtClaims> Object m7199encodeDidJwt57yAOYI(@NotNull String str, @NotNull EncodeDidJwtPayloadUseCase<R> encodeDidJwtPayloadUseCase, @NotNull EncodeDidJwtPayloadUseCase.Params params) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(encodeDidJwtPayloadUseCase, "");
        Intrinsics.checkNotNullParameter(params, "");
        try {
            Result.Application application = Result.Companion;
            JwtClaims jwtClaimsInvoke = encodeDidJwtPayloadUseCase.invoke(params);
            JwtHeader.Companion companion = JwtHeader.Companion;
            byte[] bytes = JwtUtilsKt.encodeData(companion.getEdDSA().getEncoded(), jwtClaimsInvoke).getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Object objM7326signJwtFH9GnLg = JwtUtilsKt.m7326signJwtFH9GnLg(str, bytes);
            C56391yDq.AEQbTJ(objM7326signJwtFH9GnLg);
            return Result.m7377constructorimpl(DidJwt.m7218boximpl(DidJwt.m7219constructorimpl(JwtUtilsKt.encodeJWT(companion.getEdDSA().getEncoded(), jwtClaimsInvoke, (byte[]) objM7326signJwtFH9GnLg))));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public static final /* synthetic */ <C extends JwtClaims> Object extractVerifiedDidJwtClaims(String str) {
        Object objM7377constructorimpl;
        List listSplit$default;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            try {
                listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{JwtUtilsKt.JWT_DELIMITER}, false, 0, 6, (Object) null);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (listSplit$default.size() != 3) {
                throw new Throwable("Unable to split jwt: " + str);
            }
            String str2 = (String) listSplit$default.get(0);
            String str3 = (String) listSplit$default.get(1);
            String str4 = (String) listSplit$default.get(2);
            Charset charset = Charsets.UTF_8;
            byte[] bytes = str3.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            String strDecodeBase64 = JwtUtilsKt.decodeBase64(bytes);
            byte[] bytes2 = str2.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes2, "");
            String strDecodeBase642 = JwtUtilsKt.decodeBase64(bytes2);
            byte[] bytes3 = str4.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes3, "");
            String strDecodeBase643 = JwtUtilsKt.decodeBase64(bytes3);
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
                objM7377constructorimpl = Result.m7377constructorimpl(new Triple(jwtHeader, jwtClaims, strDecodeBase643));
                C56391yDq.AEQbTJ(objM7377constructorimpl);
                Triple triple = (Triple) objM7377constructorimpl;
                JwtHeader jwtHeader2 = (JwtHeader) triple.component1();
                JwtClaims jwtClaims2 = (JwtClaims) triple.component2();
                String str5 = (String) triple.component3();
                verifyHeader(jwtHeader2, jwtHeader2);
                verifyJwt(jwtClaims2, jwtClaims2, str, str5);
                return Result.m7377constructorimpl(jwtClaims2);
            }
            throw new Throwable("Invalid header: " + str2);
        } catch (Throwable th2) {
            Result.Application application3 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
    }

    public static final void verifyHeader(@NotNull JwtHeader jwtHeader, @NotNull JwtHeader jwtHeader2) throws Throwable {
        Intrinsics.checkNotNullParameter(jwtHeader2, "");
        Intrinsics.checkNotNullParameter(jwtHeader, "");
        if (Intrinsics.EZpvd((Object) jwtHeader2.getAlgorithm(), (Object) JwtHeader.Companion.getEdDSA().getAlgorithm())) {
            return;
        }
        throw new Throwable("Unsupported header alg: " + jwtHeader2.getAlgorithm());
    }

    public static final void verifyJwt(@NotNull JwtClaims jwtClaims, @NotNull JwtClaims jwtClaims2, @NotNull String str, @NotNull String str2) throws Throwable {
        Intrinsics.checkNotNullParameter(jwtClaims2, "");
        Intrinsics.checkNotNullParameter(jwtClaims, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String strDecodeEd25519DidKey = JwtUtilsKt.decodeEd25519DidKey(jwtClaims2.getIssuer());
        byte[] bytes = JwtUtilsKt.extractData(str).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        Object objM7327verifySignaturedKHZaD0 = JwtUtilsKt.m7327verifySignaturedKHZaD0(strDecodeEd25519DidKey, bytes, str2);
        C56391yDq.AEQbTJ(objM7327verifySignaturedKHZaD0);
        if (!((Boolean) objM7327verifySignaturedKHZaD0).booleanValue()) {
            throw new Throwable("Invalid signature");
        }
    }
}
