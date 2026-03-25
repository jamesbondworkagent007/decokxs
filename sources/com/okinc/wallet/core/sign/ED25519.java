package com.okinc.wallet.core.sign;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class ED25519 {
    public static final int $stable = 8;
    private String aesKey;
    private String messages;
    private String mpcId;
    private String p;
    private String path;
    private String serverStepData;
    private String share;
    private int step;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.step;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.serverStepData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.messages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.share;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.aesKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ED25519 copy(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new ED25519(i, str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ED25519)) {
            return false;
        }
        ED25519 ed25519 = (ED25519) obj;
        return this.step == ed25519.step && Intrinsics.EZpvd((Object) this.mpcId, (Object) ed25519.mpcId) && Intrinsics.EZpvd((Object) this.serverStepData, (Object) ed25519.serverStepData) && Intrinsics.EZpvd((Object) this.messages, (Object) ed25519.messages) && Intrinsics.EZpvd((Object) this.share, (Object) ed25519.share) && Intrinsics.EZpvd((Object) this.p, (Object) ed25519.p) && Intrinsics.EZpvd((Object) this.aesKey, (Object) ed25519.aesKey) && Intrinsics.EZpvd((Object) this.path, (Object) ed25519.path);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAesKey() {
        return this.aesKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessages() {
        return this.messages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMpcId() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getP() {
        return this.p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPath() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServerStepData() {
        return this.serverStepData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShare() {
        return this.share;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStep() {
        return this.step;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.step);
        String str = this.mpcId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.serverStepData;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.messages;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.share;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.p;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.aesKey;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.path;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAesKey(String str) {
        this.aesKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMessages(String str) {
        this.messages = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMpcId(String str) {
        this.mpcId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setP(String str) {
        this.p = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPath(String str) {
        this.path = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setServerStepData(String str) {
        this.serverStepData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShare(String str) {
        this.share = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStep(int i) {
        this.step = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ED25519(step=" + this.step + ", mpcId=" + this.mpcId + ", serverStepData=" + this.serverStepData + ", messages=" + this.messages + ", share=" + this.share + ", p=" + this.p + ", aesKey=" + this.aesKey + ", path=" + this.path + ")";
    }

    public ED25519(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.step = i;
        this.mpcId = str;
        this.serverStepData = str2;
        this.messages = str3;
        this.share = str4;
        this.p = str5;
        this.aesKey = str6;
        this.path = str7;
    }
}
