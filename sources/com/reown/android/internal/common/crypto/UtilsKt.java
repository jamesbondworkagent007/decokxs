package com.reown.android.internal.common.crypto;

import com.reown.util.UtilFunctionsKt;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class UtilsKt {
    public static final String SHA_256 = "SHA-256";

    public static final String sha256(@NotNull byte[] bArr) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(bArr, "");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Intrinsics.checkNotNullExpressionValue(messageDigest, "");
        byte[] bArrDigest = messageDigest.digest(bArr);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        return UtilFunctionsKt.bytesToHex(bArrDigest);
    }
}
