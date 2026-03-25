package com.keystone.module;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PSBT {
    private String psbt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PSBT copy$default(PSBT psbt, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = psbt.psbt;
        }
        return psbt.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.psbt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PSBT copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PSBT(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PSBT) && Intrinsics.EZpvd((Object) this.psbt, (Object) ((PSBT) obj).psbt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPsbt() {
        return this.psbt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.psbt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPsbt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.psbt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PSBT(psbt=" + this.psbt + ')';
    }

    public PSBT(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.psbt = str;
    }
}
