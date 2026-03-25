package com.keystone.sdk;

import com.google.gson.Gson;
import com.keystone.module.CosmosSignRequest;
import com.keystone.module.CosmosSignature;
import com.keystone.module.NativeUR;
import com.sparrowwallet.hummingbird.UR;
import com.sparrowwallet.hummingbird.UREncoder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class KeystoneCosmosSDK extends KeystoneBaseSDK {

    /* JADX INFO: loaded from: classes14.dex */
    public enum DataType {
        Amino(1),
        Direct(2),
        Textual(3),
        Message(4);

        private final int value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        DataType(int i) {
            this.value = i;
        }
    }

    public final CosmosSignature parseSignature(@NotNull UR ur) {
        Intrinsics.checkNotNullParameter(ur, "");
        KeystoneNativeSDK native$library_release = getNative$library_release();
        String type = ur.getType();
        Intrinsics.checkNotNullExpressionValue(type, "");
        byte[] cborBytes = ur.getCborBytes();
        Intrinsics.checkNotNullExpressionValue(cborBytes, "");
        String cosmosSignature = native$library_release.parseCosmosSignature(type, toHexString(cborBytes));
        return (CosmosSignature) handleError(cosmosSignature, (CosmosSignature) KeystoneBaseSDK.fromJson$default(this, cosmosSignature, CosmosSignature.class, null, 4, null));
    }

    public final UREncoder generateSignRequest(@NotNull CosmosSignRequest cosmosSignRequest) {
        Intrinsics.checkNotNullParameter(cosmosSignRequest, "");
        String strGenerateCosmosSignRequest = getNative$library_release().generateCosmosSignRequest(cosmosSignRequest.getRequestId(), cosmosSignRequest.getSignData(), cosmosSignRequest.getDataType().getValue(), KeystoneBaseSDK.toJson$default(this, cosmosSignRequest.getAccounts(), null, 2, null), cosmosSignRequest.getOrigin());
        NativeUR nativeUR = (NativeUR) handleError(strGenerateCosmosSignRequest, new Gson().fromJson(strGenerateCosmosSignRequest, NativeUR.class));
        Intrinsics.checkNotNullExpressionValue(nativeUR, "");
        return encodeQR(nativeUR);
    }
}
