package com.keystone.sdk;

import com.google.gson.Gson;
import com.keystone.module.NativeUR;
import com.keystone.module.Signature;
import com.keystone.module.SolSignRequest;
import com.sparrowwallet.hummingbird.UR;
import com.sparrowwallet.hummingbird.UREncoder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class KeystoneSolanaSDK extends KeystoneBaseSDK {

    /* JADX INFO: loaded from: classes14.dex */
    public enum SignType {
        Transaction(1),
        Message(2);

        private final int value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        SignType(int i) {
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
        String solSignature = native$library_release.parseSolSignature(type, toHexString(cborBytes));
        return (Signature) handleError(solSignature, (Signature) KeystoneBaseSDK.fromJson$default(this, solSignature, Signature.class, null, 4, null));
    }

    public final UREncoder generateSignRequest(@NotNull SolSignRequest solSignRequest) {
        Intrinsics.checkNotNullParameter(solSignRequest, "");
        String strGenerateSolSignRequest = getNative$library_release().generateSolSignRequest(solSignRequest.getRequestId(), solSignRequest.getSignData(), solSignRequest.getPath(), solSignRequest.getXfp(), solSignRequest.getAddress(), solSignRequest.getOrigin(), solSignRequest.getSignType().getValue());
        NativeUR nativeUR = (NativeUR) handleError(strGenerateSolSignRequest, new Gson().fromJson(strGenerateSolSignRequest, NativeUR.class));
        Intrinsics.checkNotNullExpressionValue(nativeUR, "");
        return encodeQR(nativeUR);
    }
}
