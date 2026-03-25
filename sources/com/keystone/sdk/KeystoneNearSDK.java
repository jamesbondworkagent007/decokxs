package com.keystone.sdk;

import com.google.gson.Gson;
import com.keystone.module.NativeUR;
import com.keystone.module.NearSignRequest;
import com.keystone.module.NearSignature;
import com.sparrowwallet.hummingbird.UR;
import com.sparrowwallet.hummingbird.UREncoder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class KeystoneNearSDK extends KeystoneBaseSDK {
    public final NearSignature parseSignature(@NotNull UR ur) {
        Intrinsics.checkNotNullParameter(ur, "");
        KeystoneNativeSDK native$library_release = getNative$library_release();
        String type = ur.getType();
        Intrinsics.checkNotNullExpressionValue(type, "");
        byte[] cborBytes = ur.getCborBytes();
        Intrinsics.checkNotNullExpressionValue(cborBytes, "");
        String nearSignature = native$library_release.parseNearSignature(type, toHexString(cborBytes));
        return (NearSignature) handleError(nearSignature, (NearSignature) KeystoneBaseSDK.fromJson$default(this, nearSignature, NearSignature.class, null, 4, null));
    }

    public final UREncoder generateSignRequest(@NotNull NearSignRequest nearSignRequest) {
        Intrinsics.checkNotNullParameter(nearSignRequest, "");
        String strGenerateNearSignRequest = getNative$library_release().generateNearSignRequest(nearSignRequest.getRequestId(), KeystoneBaseSDK.toJson$default(this, nearSignRequest.getSignData(), null, 2, null), nearSignRequest.getPath(), nearSignRequest.getXfp(), nearSignRequest.getAccount(), nearSignRequest.getOrigin());
        NativeUR nativeUR = (NativeUR) handleError(strGenerateNearSignRequest, new Gson().fromJson(strGenerateNearSignRequest, NativeUR.class));
        Intrinsics.checkNotNullExpressionValue(nativeUR, "");
        return encodeQR(nativeUR);
    }
}
