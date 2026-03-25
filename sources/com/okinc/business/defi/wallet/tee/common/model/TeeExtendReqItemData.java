package com.okinc.business.defi.wallet.tee.common.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class TeeExtendReqItemData {
    public static final int $stable = 0;
    private final String accountId;
    private final String payload;
    private final String signature;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TeeExtendReqItemData copy$default(TeeExtendReqItemData teeExtendReqItemData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = teeExtendReqItemData.accountId;
        }
        if ((i & 2) != 0) {
            str2 = teeExtendReqItemData.payload;
        }
        if ((i & 4) != 0) {
            str3 = teeExtendReqItemData.signature;
        }
        return teeExtendReqItemData.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeExtendReqItemData copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new TeeExtendReqItemData(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeeExtendReqItemData)) {
            return false;
        }
        TeeExtendReqItemData teeExtendReqItemData = (TeeExtendReqItemData) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) teeExtendReqItemData.accountId) && Intrinsics.EZpvd((Object) this.payload, (Object) teeExtendReqItemData.payload) && Intrinsics.EZpvd((Object) this.signature, (Object) teeExtendReqItemData.signature);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayload() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.accountId.hashCode() * 31) + this.payload.hashCode()) * 31) + this.signature.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TeeExtendReqItemData(accountId=" + this.accountId + ", payload=" + this.payload + ", signature=" + this.signature + ")";
    }

    public TeeExtendReqItemData(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.accountId = str;
        this.payload = str2;
        this.signature = str3;
    }
}
