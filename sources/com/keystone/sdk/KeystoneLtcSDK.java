package com.keystone.sdk;

import com.google.gson.Gson;
import com.keystone.module.KeystoneSignRequest;
import com.keystone.module.LtcTx;
import com.keystone.module.NativeUR;
import com.keystone.sdk.KeystoneChainSDK;
import com.sparrowwallet.hummingbird.UREncoder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class KeystoneLtcSDK extends KeystoneChainSDK {
    public final UREncoder generateSignRequest(@NotNull KeystoneSignRequest<LtcTx> keystoneSignRequest) {
        Intrinsics.checkNotNullParameter(keystoneSignRequest, "");
        String strGenerateKeystoneSignRequest = getNative$library_release().generateKeystoneSignRequest(keystoneSignRequest.getRequestId(), KeystoneChainSDK.CoinType.LTC.getValue(), KeystoneBaseSDK.toJson$default(this, keystoneSignRequest.getSignData(), null, 2, null), keystoneSignRequest.getXfp(), keystoneSignRequest.getOrigin(), getTimestamp());
        NativeUR nativeUR = (NativeUR) handleError(strGenerateKeystoneSignRequest, new Gson().fromJson(strGenerateKeystoneSignRequest, NativeUR.class));
        Intrinsics.checkNotNullExpressionValue(nativeUR, "");
        return encodeQR(nativeUR);
    }
}
