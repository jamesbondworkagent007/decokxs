package com.keystone.sdk;

import com.google.gson.Gson;
import com.keystone.module.EvmSignRequest;
import com.keystone.module.NativeUR;
import com.keystone.module.Signature;
import com.sparrowwallet.hummingbird.UR;
import com.sparrowwallet.hummingbird.UREncoder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class KeystoneEvmSDK extends KeystoneBaseSDK {

    /* JADX INFO: loaded from: classes14.dex */
    public enum DataType {
        Arbitrary(1),
        CosmosAmino(2),
        CosmosDirect(3);

        private final int value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        DataType(int i) {
            this.value = i;
        }
    }

    public final Signature parseSignature(@NotNull UR ur) {
        Intrinsics.checkNotNullParameter(ur, "");
        KeystoneNativeSDK native$library_release = getNative$library_release();
        String type = ur.getType();
        Intrinsics.checkNotNullExpressionValue(type, "");
        byte[] cborBytes = ur.getCborBytes();
        Intrinsics.checkNotNullExpressionValue(cborBytes, "");
        String evmSignature = native$library_release.parseEvmSignature(type, toHexString(cborBytes));
        return (Signature) handleError(evmSignature, (Signature) KeystoneBaseSDK.fromJson$default(this, evmSignature, Signature.class, null, 4, null));
    }

    public final UREncoder generateSignRequest(@NotNull EvmSignRequest evmSignRequest) {
        Intrinsics.checkNotNullParameter(evmSignRequest, "");
        String strGenerateEvmSignRequest = getNative$library_release().generateEvmSignRequest(evmSignRequest.getRequestId(), evmSignRequest.getSignData(), evmSignRequest.getDataType().getValue(), evmSignRequest.getCustomChainIdentifier(), KeystoneBaseSDK.toJson$default(this, evmSignRequest.getAccount(), null, 2, null), evmSignRequest.getOrigin());
        NativeUR nativeUR = (NativeUR) handleError(strGenerateEvmSignRequest, new Gson().fromJson(strGenerateEvmSignRequest, NativeUR.class));
        Intrinsics.checkNotNullExpressionValue(nativeUR, "");
        return encodeQR(nativeUR);
    }
}
