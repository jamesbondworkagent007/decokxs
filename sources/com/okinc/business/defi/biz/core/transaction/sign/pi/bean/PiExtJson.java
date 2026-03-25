package com.okinc.business.defi.biz.core.transaction.sign.pi.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class PiExtJson {
    public static final int $stable = 0;
    private final String memo;
    private final String nonce;
    private final Boolean register;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PiExtJson copy$default(PiExtJson piExtJson, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = piExtJson.nonce;
        }
        if ((i & 2) != 0) {
            str2 = piExtJson.memo;
        }
        if ((i & 4) != 0) {
            bool = piExtJson.register;
        }
        return piExtJson.copy(str, str2, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.register;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PiExtJson copy(@NotNull String str, String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PiExtJson(str, str2, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PiExtJson)) {
            return false;
        }
        PiExtJson piExtJson = (PiExtJson) obj;
        return Intrinsics.EZpvd((Object) this.nonce, (Object) piExtJson.nonce) && Intrinsics.EZpvd((Object) this.memo, (Object) piExtJson.memo) && Intrinsics.EZpvd(this.register, piExtJson.register);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMemo() {
        return this.memo;
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
        String str = this.memo;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Boolean bool = this.register;
        return (((iHashCode * 31) + iHashCode2) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PiExtJson(nonce=" + this.nonce + ", memo=" + this.memo + ", register=" + this.register + ")";
    }

    public PiExtJson(@NotNull String str, String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nonce = str;
        this.memo = str2;
        this.register = bool;
    }
}
