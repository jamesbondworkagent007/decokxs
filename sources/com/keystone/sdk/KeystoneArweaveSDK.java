package com.keystone.sdk;

import com.google.gson.Gson;
import com.keystone.module.ArweaveAccount;
import com.keystone.module.ArweaveSignRequest;
import com.keystone.module.NativeUR;
import com.keystone.module.Signature;
import com.sparrowwallet.hummingbird.UR;
import com.sparrowwallet.hummingbird.UREncoder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class KeystoneArweaveSDK extends KeystoneBaseSDK {

    /* JADX INFO: loaded from: classes14.dex */
    public enum SignType {
        Transaction(1),
        DataItem(2),
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

    /* JADX INFO: loaded from: classes14.dex */
    public enum SaltLen {
        Zero(0),
        Digest(32);

        private final int value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        SaltLen(int i) {
            this.value = i;
        }
    }

    public final ArweaveAccount parseAccount(@NotNull UR ur) {
        Intrinsics.checkNotNullParameter(ur, "");
        KeystoneNativeSDK native$library_release = getNative$library_release();
        String type = ur.getType();
        Intrinsics.checkNotNullExpressionValue(type, "");
        byte[] cborBytes = ur.getCborBytes();
        Intrinsics.checkNotNullExpressionValue(cborBytes, "");
        String arweaveAccount = native$library_release.parseArweaveAccount(type, toHexString(cborBytes));
        return (ArweaveAccount) handleError(arweaveAccount, (ArweaveAccount) KeystoneBaseSDK.fromJson$default(this, arweaveAccount, ArweaveAccount.class, null, 4, null));
    }

    public final Signature parseSignature(@NotNull UR ur) {
        Intrinsics.checkNotNullParameter(ur, "");
        KeystoneNativeSDK native$library_release = getNative$library_release();
        String type = ur.getType();
        Intrinsics.checkNotNullExpressionValue(type, "");
        byte[] cborBytes = ur.getCborBytes();
        Intrinsics.checkNotNullExpressionValue(cborBytes, "");
        String arweaveSignature = native$library_release.parseArweaveSignature(type, toHexString(cborBytes));
        return (Signature) handleError(arweaveSignature, (Signature) KeystoneBaseSDK.fromJson$default(this, arweaveSignature, Signature.class, null, 4, null));
    }

    public final UREncoder generateSignRequest(@NotNull ArweaveSignRequest arweaveSignRequest) {
        Intrinsics.checkNotNullParameter(arweaveSignRequest, "");
        String strGenerateArweaveSignRequest = getNative$library_release().generateArweaveSignRequest(arweaveSignRequest.getRequestId(), arweaveSignRequest.getSignData(), arweaveSignRequest.getSignType().getValue(), arweaveSignRequest.getSaltLen().getValue(), arweaveSignRequest.getMasterFingerprint(), arweaveSignRequest.getAccount(), arweaveSignRequest.getOrigin());
        NativeUR nativeUR = (NativeUR) handleError(strGenerateArweaveSignRequest, new Gson().fromJson(strGenerateArweaveSignRequest, NativeUR.class));
        Intrinsics.checkNotNullExpressionValue(nativeUR, "");
        return encodeQR(nativeUR);
    }
}
