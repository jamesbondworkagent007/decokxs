package com.keystone.sdk;

import com.google.gson.Gson;
import com.keystone.module.NativeUR;
import com.keystone.module.ZcashPCZT;
import com.sparrowwallet.hummingbird.UR;
import com.sparrowwallet.hummingbird.UREncoder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class KeystoneZcashSDK extends KeystoneBaseSDK {
    public final byte[] parsePczt(@NotNull UR ur) {
        Intrinsics.checkNotNullParameter(ur, "");
        KeystoneNativeSDK native$library_release = getNative$library_release();
        String type = ur.getType();
        Intrinsics.checkNotNullExpressionValue(type, "");
        byte[] cborBytes = ur.getCborBytes();
        Intrinsics.checkNotNullExpressionValue(cborBytes, "");
        String zcashPczt = native$library_release.parseZcashPczt(type, toHexString(cborBytes));
        return decodeHex(((ZcashPCZT) handleError(zcashPczt, new Gson().fromJson(zcashPczt, ZcashPCZT.class))).getPczt());
    }

    public final UREncoder generatePczt(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        String strGenerateZcashPczt = getNative$library_release().generateZcashPczt(toHexString(bArr));
        NativeUR nativeUR = (NativeUR) handleError(strGenerateZcashPczt, new Gson().fromJson(strGenerateZcashPczt, NativeUR.class));
        Intrinsics.checkNotNullExpressionValue(nativeUR, "");
        return encodeQR(nativeUR);
    }
}
