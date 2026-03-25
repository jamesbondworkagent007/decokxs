package com.keystone.sdk;

import com.google.gson.Gson;
import com.keystone.module.NativeUR;
import com.keystone.module.SuiSignRequest;
import com.keystone.module.SuiSignature;
import com.sparrowwallet.hummingbird.UR;
import com.sparrowwallet.hummingbird.UREncoder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class KeystoneSuiSDK extends KeystoneBaseSDK {
    public final SuiSignature parseSignature(@NotNull UR ur) {
        Intrinsics.checkNotNullParameter(ur, "");
        KeystoneNativeSDK native$library_release = getNative$library_release();
        String type = ur.getType();
        Intrinsics.checkNotNullExpressionValue(type, "");
        byte[] cborBytes = ur.getCborBytes();
        Intrinsics.checkNotNullExpressionValue(cborBytes, "");
        String suiSignature = native$library_release.parseSuiSignature(type, toHexString(cborBytes));
        return (SuiSignature) handleError(suiSignature, (SuiSignature) KeystoneBaseSDK.fromJson$default(this, suiSignature, SuiSignature.class, null, 4, null));
    }

    public final UREncoder generateSignRequest(@NotNull SuiSignRequest suiSignRequest) {
        Intrinsics.checkNotNullParameter(suiSignRequest, "");
        KeystoneNativeSDK native$library_release = getNative$library_release();
        String requestId = suiSignRequest.getRequestId();
        String intentMessage = suiSignRequest.getIntentMessage();
        String json = new Gson().toJson(suiSignRequest.getAccounts());
        Intrinsics.checkNotNullExpressionValue(json, "");
        String strGenerateSuiSignRequest = native$library_release.generateSuiSignRequest(requestId, intentMessage, json, suiSignRequest.getOrigin());
        NativeUR nativeUR = (NativeUR) handleError(strGenerateSuiSignRequest, new Gson().fromJson(strGenerateSuiSignRequest, NativeUR.class));
        Intrinsics.checkNotNullExpressionValue(nativeUR, "");
        return encodeQR(nativeUR);
    }
}
