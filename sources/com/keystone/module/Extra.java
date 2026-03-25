package com.keystone.module;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Extra {
    private OkxExtra okx;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Extra copy$default(Extra extra, OkxExtra okxExtra, int i, Object obj) {
        if ((i & 1) != 0) {
            okxExtra = extra.okx;
        }
        return extra.copy(okxExtra);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OkxExtra component1() {
        return this.okx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Extra copy(@NotNull OkxExtra okxExtra) {
        Intrinsics.checkNotNullParameter(okxExtra, "");
        return new Extra(okxExtra);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Extra) && Intrinsics.EZpvd(this.okx, ((Extra) obj).okx);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OkxExtra getOkx() {
        return this.okx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.okx.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOkx(@NotNull OkxExtra okxExtra) {
        Intrinsics.checkNotNullParameter(okxExtra, "");
        this.okx = okxExtra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Extra(okx=" + this.okx + ')';
    }

    public Extra(@NotNull OkxExtra okxExtra) {
        Intrinsics.checkNotNullParameter(okxExtra, "");
        this.okx = okxExtra;
    }
}
