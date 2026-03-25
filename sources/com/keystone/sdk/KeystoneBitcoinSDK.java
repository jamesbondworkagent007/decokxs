package com.keystone.sdk;

import com.google.gson.Gson;
import com.keystone.module.NativeUR;
import com.keystone.module.PSBT;
import com.sparrowwallet.hummingbird.UR;
import com.sparrowwallet.hummingbird.UREncoder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class KeystoneBitcoinSDK extends KeystoneBaseSDK {
    public final byte[] parsePSBT(@NotNull UR ur) {
        Intrinsics.checkNotNullParameter(ur, "");
        KeystoneNativeSDK native$library_release = getNative$library_release();
        String type = ur.getType();
        Intrinsics.checkNotNullExpressionValue(type, "");
        byte[] cborBytes = ur.getCborBytes();
        Intrinsics.checkNotNullExpressionValue(cborBytes, "");
        String cryptoPSBT = native$library_release.parseCryptoPSBT(type, toHexString(cborBytes));
        return decodeHex(((PSBT) handleError(cryptoPSBT, new Gson().fromJson(cryptoPSBT, PSBT.class))).getPsbt());
    }

    public final UREncoder generatePSBT(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        String strGenerateCryptoPSBT = getNative$library_release().generateCryptoPSBT(toHexString(bArr));
        NativeUR nativeUR = (NativeUR) handleError(strGenerateCryptoPSBT, new Gson().fromJson(strGenerateCryptoPSBT, NativeUR.class));
        Intrinsics.checkNotNullExpressionValue(nativeUR, "");
        return encodeQR(nativeUR);
    }
}
