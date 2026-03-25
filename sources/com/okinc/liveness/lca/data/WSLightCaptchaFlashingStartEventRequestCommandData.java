package com.okinc.liveness.lca.data;

/* JADX INFO: loaded from: classes19.dex */
public final class WSLightCaptchaFlashingStartEventRequestCommandData {
    public static final int $stable = 0;
    private final long colorFlashingStartTime;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WSLightCaptchaFlashingStartEventRequestCommandData copy$default(WSLightCaptchaFlashingStartEventRequestCommandData wSLightCaptchaFlashingStartEventRequestCommandData, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = wSLightCaptchaFlashingStartEventRequestCommandData.colorFlashingStartTime;
        }
        return wSLightCaptchaFlashingStartEventRequestCommandData.copy(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.colorFlashingStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSLightCaptchaFlashingStartEventRequestCommandData copy(long j) {
        return new WSLightCaptchaFlashingStartEventRequestCommandData(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WSLightCaptchaFlashingStartEventRequestCommandData) && this.colorFlashingStartTime == ((WSLightCaptchaFlashingStartEventRequestCommandData) obj).colorFlashingStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getColorFlashingStartTime() {
        return this.colorFlashingStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Long.hashCode(this.colorFlashingStartTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WSLightCaptchaFlashingStartEventRequestCommandData(colorFlashingStartTime=" + this.colorFlashingStartTime + ")";
    }

    public WSLightCaptchaFlashingStartEventRequestCommandData(long j) {
        this.colorFlashingStartTime = j;
    }
}
