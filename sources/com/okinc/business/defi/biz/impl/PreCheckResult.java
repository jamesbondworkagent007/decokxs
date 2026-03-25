package com.okinc.business.defi.biz.impl;

import com.okinc.wallet.api.bean.SignStatus;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC12782ctV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class PreCheckResult {
    public static final int $stable = 8;
    private final SignStatus status;
    private final AbstractC12782ctV wallet;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PreCheckResult copy$default(PreCheckResult preCheckResult, SignStatus signStatus, AbstractC12782ctV abstractC12782ctV, int i, Object obj) {
        if ((i & 1) != 0) {
            signStatus = preCheckResult.status;
        }
        if ((i & 2) != 0) {
            abstractC12782ctV = preCheckResult.wallet;
        }
        return preCheckResult.copy(signStatus, abstractC12782ctV);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignStatus component1() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12782ctV component2() {
        return this.wallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PreCheckResult copy(@NotNull SignStatus signStatus, @NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(signStatus, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return new PreCheckResult(signStatus, abstractC12782ctV);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreCheckResult)) {
            return false;
        }
        PreCheckResult preCheckResult = (PreCheckResult) obj;
        return this.status == preCheckResult.status && Intrinsics.EZpvd(this.wallet, preCheckResult.wallet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignStatus getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12782ctV getWallet() {
        return this.wallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.status.hashCode() * 31) + this.wallet.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PreCheckResult(status=" + this.status + ", wallet=" + this.wallet + ")";
    }

    public PreCheckResult(@NotNull SignStatus signStatus, @NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(signStatus, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        this.status = signStatus;
        this.wallet = abstractC12782ctV;
    }
}
