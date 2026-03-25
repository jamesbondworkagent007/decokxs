package com.keystone.sdk;

import com.google.gson.Gson;
import com.keystone.module.EthSignRequest;
import com.keystone.module.NativeUR;
import com.keystone.module.Signature;
import com.sparrowwallet.hummingbird.UR;
import com.sparrowwallet.hummingbird.UREncoder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class KeystoneEthereumSDK extends KeystoneBaseSDK {

    /* JADX INFO: loaded from: classes14.dex */
    public enum DataType {
        Transaction(1),
        TypedData(2),
        PersonalMessage(3),
        TypedTransaction(4);

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
        String eTHSignature = native$library_release.parseETHSignature(type, toHexString(cborBytes));
        return (Signature) handleError(eTHSignature, (Signature) KeystoneBaseSDK.fromJson$default(this, eTHSignature, Signature.class, null, 4, null));
    }

    public final UREncoder generateSignRequest(@NotNull EthSignRequest ethSignRequest) {
        Intrinsics.checkNotNullParameter(ethSignRequest, "");
        String strGenerateETHSignRequest = getNative$library_release().generateETHSignRequest(ethSignRequest.getRequestId(), ethSignRequest.getSignData(), ethSignRequest.getDataType().getValue(), ethSignRequest.getChainId(), ethSignRequest.getPath(), ethSignRequest.getXfp(), ethSignRequest.getAddress(), ethSignRequest.getOrigin());
        NativeUR nativeUR = (NativeUR) handleError(strGenerateETHSignRequest, new Gson().fromJson(strGenerateETHSignRequest, NativeUR.class));
        Intrinsics.checkNotNullExpressionValue(nativeUR, "");
        return encodeQR(nativeUR);
    }
}
