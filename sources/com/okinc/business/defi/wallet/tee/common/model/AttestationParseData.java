package com.okinc.business.defi.wallet.tee.common.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class AttestationParseData {
    public static final int $stable = 0;
    private final String frontendPubkeyVersionSelected;
    private final String pubKeyHex;
    private final String userDataHex;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AttestationParseData copy$default(AttestationParseData attestationParseData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = attestationParseData.pubKeyHex;
        }
        if ((i & 2) != 0) {
            str2 = attestationParseData.userDataHex;
        }
        if ((i & 4) != 0) {
            str3 = attestationParseData.frontendPubkeyVersionSelected;
        }
        return attestationParseData.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.pubKeyHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.userDataHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.frontendPubkeyVersionSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AttestationParseData copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new AttestationParseData(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttestationParseData)) {
            return false;
        }
        AttestationParseData attestationParseData = (AttestationParseData) obj;
        return Intrinsics.EZpvd((Object) this.pubKeyHex, (Object) attestationParseData.pubKeyHex) && Intrinsics.EZpvd((Object) this.userDataHex, (Object) attestationParseData.userDataHex) && Intrinsics.EZpvd((Object) this.frontendPubkeyVersionSelected, (Object) attestationParseData.frontendPubkeyVersionSelected);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrontendPubkeyVersionSelected() {
        return this.frontendPubkeyVersionSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPubKeyHex() {
        return this.pubKeyHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserDataHex() {
        return this.userDataHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.pubKeyHex.hashCode() * 31) + this.userDataHex.hashCode()) * 31) + this.frontendPubkeyVersionSelected.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AttestationParseData(pubKeyHex=" + this.pubKeyHex + ", userDataHex=" + this.userDataHex + ", frontendPubkeyVersionSelected=" + this.frontendPubkeyVersionSelected + ")";
    }

    public AttestationParseData(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.pubKeyHex = str;
        this.userDataHex = str2;
        this.frontendPubkeyVersionSelected = str3;
    }
}
