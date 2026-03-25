package com.okinc.wallet.core.sign.solana;

import com.okinc.wallet.core.sign.SignatureRawValue;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class SolSignatureRawValue extends SignatureRawValue {
    public static final int $stable = 8;
    private String r;
    private String s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getR() {
        return this.r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getS() {
        return this.s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setR(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.r = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setS(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.s = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SolSignatureRawValue(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        super(str3, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.r = str;
        this.s = str2;
    }
}
