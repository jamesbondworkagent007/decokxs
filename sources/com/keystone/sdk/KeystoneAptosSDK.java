package com.keystone.sdk;

import com.google.gson.Gson;
import com.keystone.module.AptosSignRequest;
import com.keystone.module.AptosSignature;
import com.keystone.module.NativeUR;
import com.sparrowwallet.hummingbird.UR;
import com.sparrowwallet.hummingbird.UREncoder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class KeystoneAptosSDK extends KeystoneBaseSDK {

    /* JADX INFO: loaded from: classes14.dex */
    public enum SignType {
        Single(1),
        Multi(2),
        Message(3);

        private final int value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        SignType(int i) {
            this.value = i;
        }
    }

    public final AptosSignature parseSignature(@NotNull UR ur) {
        Intrinsics.checkNotNullParameter(ur, "");
        KeystoneNativeSDK native$library_release = getNative$library_release();
        String type = ur.getType();
        Intrinsics.checkNotNullExpressionValue(type, "");
        byte[] cborBytes = ur.getCborBytes();
        Intrinsics.checkNotNullExpressionValue(cborBytes, "");
        String aptosSignature = native$library_release.parseAptosSignature(type, toHexString(cborBytes));
        return (AptosSignature) handleError(aptosSignature, (AptosSignature) KeystoneBaseSDK.fromJson$default(this, aptosSignature, AptosSignature.class, null, 4, null));
    }

    public final UREncoder generateSignRequest(@NotNull AptosSignRequest aptosSignRequest) {
        Intrinsics.checkNotNullParameter(aptosSignRequest, "");
        KeystoneNativeSDK native$library_release = getNative$library_release();
        String requestId = aptosSignRequest.getRequestId();
        String signData = aptosSignRequest.getSignData();
        String json = new Gson().toJson(aptosSignRequest.getAccounts());
        Intrinsics.checkNotNullExpressionValue(json, "");
        String strGenerateAptosSignRequest = native$library_release.generateAptosSignRequest(requestId, signData, json, aptosSignRequest.getOrigin(), aptosSignRequest.getSignType().getValue());
        NativeUR nativeUR = (NativeUR) handleError(strGenerateAptosSignRequest, new Gson().fromJson(strGenerateAptosSignRequest, NativeUR.class));
        Intrinsics.checkNotNullExpressionValue(nativeUR, "");
        return encodeQR(nativeUR);
    }
}
