package com.okinc.business.defi.wallet.tee.common.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class TeeRemoveReqItemData {
    public static final int $stable = 0;
    private final String payload;
    private final String signature;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TeeRemoveReqItemData copy$default(TeeRemoveReqItemData teeRemoveReqItemData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = teeRemoveReqItemData.payload;
        }
        if ((i & 2) != 0) {
            str2 = teeRemoveReqItemData.signature;
        }
        return teeRemoveReqItemData.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeRemoveReqItemData copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TeeRemoveReqItemData(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeeRemoveReqItemData)) {
            return false;
        }
        TeeRemoveReqItemData teeRemoveReqItemData = (TeeRemoveReqItemData) obj;
        return Intrinsics.EZpvd((Object) this.payload, (Object) teeRemoveReqItemData.payload) && Intrinsics.EZpvd((Object) this.signature, (Object) teeRemoveReqItemData.signature);
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
        return (this.payload.hashCode() * 31) + this.signature.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TeeRemoveReqItemData(payload=" + this.payload + ", signature=" + this.signature + ")";
    }

    public TeeRemoveReqItemData(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.payload = str;
        this.signature = str2;
    }
}
