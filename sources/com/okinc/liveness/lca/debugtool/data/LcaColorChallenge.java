package com.okinc.liveness.lca.debugtool.data;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaColorChallenge {
    public static final int $stable = 0;
    private final String colorPrediction;
    private final String currentTag;
    private final float score;
    private final int sequence;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LcaColorChallenge copy$default(LcaColorChallenge lcaColorChallenge, String str, String str2, float f, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = lcaColorChallenge.colorPrediction;
        }
        if ((i2 & 2) != 0) {
            str2 = lcaColorChallenge.currentTag;
        }
        if ((i2 & 4) != 0) {
            f = lcaColorChallenge.score;
        }
        if ((i2 & 8) != 0) {
            i = lcaColorChallenge.sequence;
        }
        return lcaColorChallenge.copy(str, str2, f, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.colorPrediction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.currentTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component3() {
        return this.score;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.sequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaColorChallenge copy(@NotNull String str, @NotNull String str2, float f, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new LcaColorChallenge(str, str2, f, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LcaColorChallenge)) {
            return false;
        }
        LcaColorChallenge lcaColorChallenge = (LcaColorChallenge) obj;
        return Intrinsics.EZpvd((Object) this.colorPrediction, (Object) lcaColorChallenge.colorPrediction) && Intrinsics.EZpvd((Object) this.currentTag, (Object) lcaColorChallenge.currentTag) && Float.compare(this.score, lcaColorChallenge.score) == 0 && this.sequence == lcaColorChallenge.sequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getColorPrediction() {
        return this.colorPrediction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentTag() {
        return this.currentTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getScore() {
        return this.score;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSequence() {
        return this.sequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.colorPrediction.hashCode() * 31) + this.currentTag.hashCode()) * 31) + Float.hashCode(this.score)) * 31) + Integer.hashCode(this.sequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaColorChallenge(colorPrediction=" + this.colorPrediction + ", currentTag=" + this.currentTag + ", score=" + this.score + ", sequence=" + this.sequence + ")";
    }

    public LcaColorChallenge(@NotNull String str, @NotNull String str2, float f, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.colorPrediction = str;
        this.currentTag = str2;
        this.score = f;
        this.sequence = i;
    }
}
