package com.keystone.sdk;

import com.keystone.module.KeystoneSignResult;
import com.sparrowwallet.hummingbird.UR;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes3.dex */
public class KeystoneChainSDK extends KeystoneBaseSDK {

    /* JADX INFO: loaded from: classes14.dex */
    public enum CoinType {
        LTC(2),
        DASH(5),
        BCH(CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA);

        private final int value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        CoinType(int i) {
            this.value = i;
        }
    }

    public final KeystoneSignResult parseSignResult(@NotNull UR ur) {
        Intrinsics.checkNotNullParameter(ur, "");
        KeystoneNativeSDK native$library_release = getNative$library_release();
        String type = ur.getType();
        Intrinsics.checkNotNullExpressionValue(type, "");
        byte[] cborBytes = ur.getCborBytes();
        Intrinsics.checkNotNullExpressionValue(cborBytes, "");
        String keystoneSignResult = native$library_release.parseKeystoneSignResult(type, toHexString(cborBytes));
        return (KeystoneSignResult) handleError(keystoneSignResult, (KeystoneSignResult) KeystoneBaseSDK.fromJson$default(this, keystoneSignResult, KeystoneSignResult.class, null, 4, null));
    }
}
