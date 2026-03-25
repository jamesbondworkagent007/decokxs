package com.okinc.assets.backend.api.model;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class WithdrawBatchVerifyReq {
    public static final int $stable = 8;
    private final long[] addressIds;
    private final String emailCode;
    private final boolean mfaCreateSessionOnly;
    private final String phoneCode;
    private final String sessionId;
    private final boolean setExpireIfInactive;
    private final String totpCode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WithdrawBatchVerifyReq copy$default(WithdrawBatchVerifyReq withdrawBatchVerifyReq, long[] jArr, boolean z, String str, String str2, String str3, boolean z2, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            jArr = withdrawBatchVerifyReq.addressIds;
        }
        if ((i & 2) != 0) {
            z = withdrawBatchVerifyReq.setExpireIfInactive;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            str = withdrawBatchVerifyReq.emailCode;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = withdrawBatchVerifyReq.phoneCode;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = withdrawBatchVerifyReq.totpCode;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            z2 = withdrawBatchVerifyReq.mfaCreateSessionOnly;
        }
        boolean z4 = z2;
        if ((i & 64) != 0) {
            str4 = withdrawBatchVerifyReq.sessionId;
        }
        return withdrawBatchVerifyReq.copy(jArr, z3, str5, str6, str7, z4, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long[] component1() {
        return this.addressIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.setExpireIfInactive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.emailCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.phoneCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.totpCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.mfaCreateSessionOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawBatchVerifyReq copy(@NotNull long[] jArr, boolean z, String str, String str2, String str3, boolean z2, String str4) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return new WithdrawBatchVerifyReq(jArr, z, str, str2, str3, z2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WithdrawBatchVerifyReq)) {
            return false;
        }
        WithdrawBatchVerifyReq withdrawBatchVerifyReq = (WithdrawBatchVerifyReq) obj;
        return Intrinsics.EZpvd(this.addressIds, withdrawBatchVerifyReq.addressIds) && this.setExpireIfInactive == withdrawBatchVerifyReq.setExpireIfInactive && Intrinsics.EZpvd((Object) this.emailCode, (Object) withdrawBatchVerifyReq.emailCode) && Intrinsics.EZpvd((Object) this.phoneCode, (Object) withdrawBatchVerifyReq.phoneCode) && Intrinsics.EZpvd((Object) this.totpCode, (Object) withdrawBatchVerifyReq.totpCode) && this.mfaCreateSessionOnly == withdrawBatchVerifyReq.mfaCreateSessionOnly && Intrinsics.EZpvd((Object) this.sessionId, (Object) withdrawBatchVerifyReq.sessionId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long[] getAddressIds() {
        return this.addressIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEmailCode() {
        return this.emailCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMfaCreateSessionOnly() {
        return this.mfaCreateSessionOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPhoneCode() {
        return this.phoneCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSetExpireIfInactive() {
        return this.setExpireIfInactive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotpCode() {
        return this.totpCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.addressIds);
        int iHashCode2 = Boolean.hashCode(this.setExpireIfInactive);
        String str = this.emailCode;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.phoneCode;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.totpCode;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        int iHashCode6 = Boolean.hashCode(this.mfaCreateSessionOnly);
        String str4 = this.sessionId;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WithdrawBatchVerifyReq(addressIds=" + Arrays.toString(this.addressIds) + ", setExpireIfInactive=" + this.setExpireIfInactive + ", emailCode=" + this.emailCode + ", phoneCode=" + this.phoneCode + ", totpCode=" + this.totpCode + ", mfaCreateSessionOnly=" + this.mfaCreateSessionOnly + ", sessionId=" + this.sessionId + ")";
    }

    public WithdrawBatchVerifyReq(@NotNull long[] jArr, boolean z, String str, String str2, String str3, boolean z2, String str4) {
        Intrinsics.checkNotNullParameter(jArr, "");
        this.addressIds = jArr;
        this.setExpireIfInactive = z;
        this.emailCode = str;
        this.phoneCode = str2;
        this.totpCode = str3;
        this.mfaCreateSessionOnly = z2;
        this.sessionId = str4;
    }
}
