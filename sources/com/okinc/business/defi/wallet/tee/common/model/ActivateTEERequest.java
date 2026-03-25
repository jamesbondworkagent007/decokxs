package com.okinc.business.defi.wallet.tee.common.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class ActivateTEERequest {
    public static final int $stable = 8;
    private final String accountId;
    private final boolean autoRenew;
    private final List<Long> chainIndexList;
    private final long expireTimestamp;
    private final String frontendPubkeyVersionSelected;
    private final HPKEInfoData hpkeInfo;
    private final String signMsg;
    private final String signature;
    private final String teeId;
    private final long timestamp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.frontendPubkeyVersionSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.expireTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.autoRenew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component6() {
        return this.chainIndexList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.signMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HPKEInfoData component9() {
        return this.hpkeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivateTEERequest copy(@NotNull String str, @NotNull String str2, long j, long j2, boolean z, @NotNull List<Long> list, @NotNull String str3, @NotNull String str4, @NotNull HPKEInfoData hPKEInfoData, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(hPKEInfoData, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new ActivateTEERequest(str, str2, j, j2, z, list, str3, str4, hPKEInfoData, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivateTEERequest)) {
            return false;
        }
        ActivateTEERequest activateTEERequest = (ActivateTEERequest) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) activateTEERequest.accountId) && Intrinsics.EZpvd((Object) this.teeId, (Object) activateTEERequest.teeId) && this.timestamp == activateTEERequest.timestamp && this.expireTimestamp == activateTEERequest.expireTimestamp && this.autoRenew == activateTEERequest.autoRenew && Intrinsics.EZpvd(this.chainIndexList, activateTEERequest.chainIndexList) && Intrinsics.EZpvd((Object) this.signature, (Object) activateTEERequest.signature) && Intrinsics.EZpvd((Object) this.signMsg, (Object) activateTEERequest.signMsg) && Intrinsics.EZpvd(this.hpkeInfo, activateTEERequest.hpkeInfo) && Intrinsics.EZpvd((Object) this.frontendPubkeyVersionSelected, (Object) activateTEERequest.frontendPubkeyVersionSelected);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAutoRenew() {
        return this.autoRenew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getChainIndexList() {
        return this.chainIndexList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getExpireTimestamp() {
        return this.expireTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrontendPubkeyVersionSelected() {
        return this.frontendPubkeyVersionSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HPKEInfoData getHpkeInfo() {
        return this.hpkeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignMsg() {
        return this.signMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTeeId() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.accountId.hashCode() * 31) + this.teeId.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + Long.hashCode(this.expireTimestamp)) * 31) + Boolean.hashCode(this.autoRenew)) * 31) + this.chainIndexList.hashCode()) * 31) + this.signature.hashCode()) * 31) + this.signMsg.hashCode()) * 31) + this.hpkeInfo.hashCode()) * 31) + this.frontendPubkeyVersionSelected.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ActivateTEERequest(accountId=" + this.accountId + ", teeId=" + this.teeId + ", timestamp=" + this.timestamp + ", expireTimestamp=" + this.expireTimestamp + ", autoRenew=" + this.autoRenew + ", chainIndexList=" + this.chainIndexList + ", signature=" + this.signature + ", signMsg=" + this.signMsg + ", hpkeInfo=" + this.hpkeInfo + ", frontendPubkeyVersionSelected=" + this.frontendPubkeyVersionSelected + ")";
    }

    public ActivateTEERequest(@NotNull String str, @NotNull String str2, long j, long j2, boolean z, @NotNull List<Long> list, @NotNull String str3, @NotNull String str4, @NotNull HPKEInfoData hPKEInfoData, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(hPKEInfoData, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.accountId = str;
        this.teeId = str2;
        this.timestamp = j;
        this.expireTimestamp = j2;
        this.autoRenew = z;
        this.chainIndexList = list;
        this.signature = str3;
        this.signMsg = str4;
        this.hpkeInfo = hPKEInfoData;
        this.frontendPubkeyVersionSelected = str5;
    }
}
