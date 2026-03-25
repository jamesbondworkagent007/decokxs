package com.okinc.wallet.core.sign.utxo;

import com.okinc.wallet.core.sign.SignatureRawValue;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class BTCSignatureRawValue extends SignatureRawValue {
    public static final int $stable = 8;
    private String publicKey;
    private List<RSV> signatures;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPublicKey() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RSV> getSignatures() {
        return this.signatures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPublicKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.publicKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignatures(@NotNull List<RSV> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.signatures = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BTCSignatureRawValue(@NotNull String str, @NotNull String str2, @NotNull List<RSV> list) {
        super(str, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.publicKey = str2;
        this.signatures = list;
    }
}
