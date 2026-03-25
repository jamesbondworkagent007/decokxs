package com.okinc.business.defi.biz.core.transaction.sign.aptos.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AptosExtJson {
    public static final int $stable = 0;
    private final String nonce;
    private final Boolean register;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AptosExtJson copy$default(AptosExtJson aptosExtJson, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aptosExtJson.nonce;
        }
        if ((i & 2) != 0) {
            bool = aptosExtJson.register;
        }
        return aptosExtJson.copy(str, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.register;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AptosExtJson copy(@NotNull String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AptosExtJson(str, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AptosExtJson)) {
            return false;
        }
        AptosExtJson aptosExtJson = (AptosExtJson) obj;
        return Intrinsics.EZpvd((Object) this.nonce, (Object) aptosExtJson.nonce) && Intrinsics.EZpvd(this.register, aptosExtJson.register);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getRegister() {
        return this.register;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.nonce.hashCode();
        Boolean bool = this.register;
        return (iHashCode * 31) + (bool == null ? 0 : bool.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AptosExtJson(nonce=" + this.nonce + ", register=" + this.register + ")";
    }

    public AptosExtJson(@NotNull String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nonce = str;
        this.register = bool;
    }
}
