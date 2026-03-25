package com.keystone.sdk;

import com.google.gson.Gson;
import com.keystone.module.CardanoSignRequest;
import com.keystone.module.CardanoSignature;
import com.keystone.module.NativeUR;
import com.sparrowwallet.hummingbird.UR;
import com.sparrowwallet.hummingbird.UREncoder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class KeystoneCardanoSDK extends KeystoneBaseSDK {
    public final CardanoSignature parseSignature(@NotNull UR ur) {
        Intrinsics.checkNotNullParameter(ur, "");
        KeystoneNativeSDK native$library_release = getNative$library_release();
        String type = ur.getType();
        Intrinsics.checkNotNullExpressionValue(type, "");
        byte[] cborBytes = ur.getCborBytes();
        Intrinsics.checkNotNullExpressionValue(cborBytes, "");
        String cardanoSignature = native$library_release.parseCardanoSignature(type, toHexString(cborBytes));
        return (CardanoSignature) handleError(cardanoSignature, (CardanoSignature) KeystoneBaseSDK.fromJson$default(this, cardanoSignature, CardanoSignature.class, null, 4, null));
    }

    public final UREncoder generateSignRequest(@NotNull CardanoSignRequest cardanoSignRequest) {
        Intrinsics.checkNotNullParameter(cardanoSignRequest, "");
        String strGenerateCardanoSignRequest = getNative$library_release().generateCardanoSignRequest(cardanoSignRequest.getRequestId(), cardanoSignRequest.getSignData(), KeystoneBaseSDK.toJson$default(this, cardanoSignRequest.getUtxos(), null, 2, null), KeystoneBaseSDK.toJson$default(this, cardanoSignRequest.getCertKeys(), null, 2, null), cardanoSignRequest.getOrigin());
        NativeUR nativeUR = (NativeUR) handleError(strGenerateCardanoSignRequest, new Gson().fromJson(strGenerateCardanoSignRequest, NativeUR.class));
        Intrinsics.checkNotNullExpressionValue(nativeUR, "");
        return encodeQR(nativeUR);
    }
}
