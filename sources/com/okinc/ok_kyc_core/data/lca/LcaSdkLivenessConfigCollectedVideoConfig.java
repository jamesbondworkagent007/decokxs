package com.okinc.ok_kyc_core.data.lca;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class LcaSdkLivenessConfigCollectedVideoConfig {
    public static final int $stable = 0;
    private final Integer bitrate;
    private final Integer fps;
    private final Integer resolutionHeight;
    private final Integer resolutionWidth;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LcaSdkLivenessConfigCollectedVideoConfig copy$default(LcaSdkLivenessConfigCollectedVideoConfig lcaSdkLivenessConfigCollectedVideoConfig, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = lcaSdkLivenessConfigCollectedVideoConfig.bitrate;
        }
        if ((i & 2) != 0) {
            num2 = lcaSdkLivenessConfigCollectedVideoConfig.resolutionHeight;
        }
        if ((i & 4) != 0) {
            num3 = lcaSdkLivenessConfigCollectedVideoConfig.resolutionWidth;
        }
        if ((i & 8) != 0) {
            num4 = lcaSdkLivenessConfigCollectedVideoConfig.fps;
        }
        return lcaSdkLivenessConfigCollectedVideoConfig.copy(num, num2, num3, num4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.bitrate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.resolutionHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.resolutionWidth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.fps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaSdkLivenessConfigCollectedVideoConfig copy(Integer num, Integer num2, Integer num3, Integer num4) {
        return new LcaSdkLivenessConfigCollectedVideoConfig(num, num2, num3, num4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LcaSdkLivenessConfigCollectedVideoConfig)) {
            return false;
        }
        LcaSdkLivenessConfigCollectedVideoConfig lcaSdkLivenessConfigCollectedVideoConfig = (LcaSdkLivenessConfigCollectedVideoConfig) obj;
        return Intrinsics.EZpvd(this.bitrate, lcaSdkLivenessConfigCollectedVideoConfig.bitrate) && Intrinsics.EZpvd(this.resolutionHeight, lcaSdkLivenessConfigCollectedVideoConfig.resolutionHeight) && Intrinsics.EZpvd(this.resolutionWidth, lcaSdkLivenessConfigCollectedVideoConfig.resolutionWidth) && Intrinsics.EZpvd(this.fps, lcaSdkLivenessConfigCollectedVideoConfig.fps);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBitrate() {
        return this.bitrate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFps() {
        return this.fps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getResolutionHeight() {
        return this.resolutionHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getResolutionWidth() {
        return this.resolutionWidth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.bitrate;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.resolutionHeight;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.resolutionWidth;
        int iHashCode3 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.fps;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num4 != null ? num4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaSdkLivenessConfigCollectedVideoConfig(bitrate=" + this.bitrate + ", resolutionHeight=" + this.resolutionHeight + ", resolutionWidth=" + this.resolutionWidth + ", fps=" + this.fps + ")";
    }

    public LcaSdkLivenessConfigCollectedVideoConfig(Integer num, Integer num2, Integer num3, Integer num4) {
        this.bitrate = num;
        this.resolutionHeight = num2;
        this.resolutionWidth = num3;
        this.fps = num4;
    }
}
