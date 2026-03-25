package com.okinc.business.defi.biz.core.transaction.sign.starknet.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class StarkNetExtJson {
    public static final int $stable = 0;
    private final String nonce;
    private final long serviceChargeCoinId;
    private final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StarkNetExtJson copy$default(StarkNetExtJson starkNetExtJson, String str, long j, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = starkNetExtJson.nonce;
        }
        if ((i & 2) != 0) {
            j = starkNetExtJson.serviceChargeCoinId;
        }
        if ((i & 4) != 0) {
            str2 = starkNetExtJson.type;
        }
        return starkNetExtJson.copy(str, j, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.serviceChargeCoinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StarkNetExtJson copy(@NotNull String str, long j, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new StarkNetExtJson(str, j, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StarkNetExtJson)) {
            return false;
        }
        StarkNetExtJson starkNetExtJson = (StarkNetExtJson) obj;
        return Intrinsics.EZpvd((Object) this.nonce, (Object) starkNetExtJson.nonce) && this.serviceChargeCoinId == starkNetExtJson.serviceChargeCoinId && Intrinsics.EZpvd((Object) this.type, (Object) starkNetExtJson.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getServiceChargeCoinId() {
        return this.serviceChargeCoinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.nonce.hashCode();
        int iHashCode2 = Long.hashCode(this.serviceChargeCoinId);
        String str = this.type;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StarkNetExtJson(nonce=" + this.nonce + ", serviceChargeCoinId=" + this.serviceChargeCoinId + ", type=" + this.type + ")";
    }

    public StarkNetExtJson(@NotNull String str, long j, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nonce = str;
        this.serviceChargeCoinId = j;
        this.type = str2;
    }
}
