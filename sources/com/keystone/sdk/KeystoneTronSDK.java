package com.keystone.sdk;

import com.google.gson.Gson;
import com.keystone.module.NativeUR;
import com.keystone.module.TronSignRequest;
import com.keystone.module.TronSignature;
import com.sparrowwallet.hummingbird.UR;
import com.sparrowwallet.hummingbird.UREncoder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class KeystoneTronSDK extends KeystoneBaseSDK {
    public final TronSignature parseSignature(@NotNull UR ur) {
        Intrinsics.checkNotNullParameter(ur, "");
        KeystoneNativeSDK native$library_release = getNative$library_release();
        String type = ur.getType();
        Intrinsics.checkNotNullExpressionValue(type, "");
        byte[] cborBytes = ur.getCborBytes();
        Intrinsics.checkNotNullExpressionValue(cborBytes, "");
        String tronSignature = native$library_release.parseTronSignature(type, toHexString(cborBytes));
        return (TronSignature) handleError(tronSignature, (TronSignature) KeystoneBaseSDK.fromJson$default(this, tronSignature, TronSignature.class, null, 4, null));
    }

    public final UREncoder generateSignRequest(@NotNull TronSignRequest tronSignRequest) {
        Intrinsics.checkNotNullParameter(tronSignRequest, "");
        KeystoneNativeSDK native$library_release = getNative$library_release();
        String requestId = tronSignRequest.getRequestId();
        String signData = tronSignRequest.getSignData();
        String path = tronSignRequest.getPath();
        String xfp = tronSignRequest.getXfp();
        String json = tronSignRequest.getTokenInfo() == null ? "" : new Gson().toJson(tronSignRequest.getTokenInfo());
        Intrinsics.checkNotNullExpressionValue(json, "");
        String strGenerateTronSignRequest = native$library_release.generateTronSignRequest(requestId, signData, path, xfp, json, tronSignRequest.getOrigin(), getTimestamp());
        NativeUR nativeUR = (NativeUR) handleError(strGenerateTronSignRequest, new Gson().fromJson(strGenerateTronSignRequest, NativeUR.class));
        Intrinsics.checkNotNullExpressionValue(nativeUR, "");
        return encodeQR(nativeUR);
    }
}
