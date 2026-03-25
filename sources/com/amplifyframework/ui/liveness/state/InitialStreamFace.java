package com.amplifyframework.ui.liveness.state;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class InitialStreamFace {
    public static final int $stable = 8;
    private final RectF faceRect;
    private final long timestamp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InitialStreamFace copy$default(InitialStreamFace initialStreamFace, RectF rectF, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            rectF = initialStreamFace.faceRect;
        }
        if ((i & 2) != 0) {
            j = initialStreamFace.timestamp;
        }
        return initialStreamFace.copy(rectF, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RectF component1() {
        return this.faceRect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InitialStreamFace copy(@NotNull RectF rectF, long j) {
        Intrinsics.checkNotNullParameter(rectF, "");
        return new InitialStreamFace(rectF, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitialStreamFace)) {
            return false;
        }
        InitialStreamFace initialStreamFace = (InitialStreamFace) obj;
        return Intrinsics.EZpvd(this.faceRect, initialStreamFace.faceRect) && this.timestamp == initialStreamFace.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RectF getFaceRect() {
        return this.faceRect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.faceRect.hashCode() * 31) + Long.hashCode(this.timestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InitialStreamFace(faceRect=" + this.faceRect + ", timestamp=" + this.timestamp + ")";
    }

    public InitialStreamFace(@NotNull RectF rectF, long j) {
        Intrinsics.checkNotNullParameter(rectF, "");
        this.faceRect = rectF;
        this.timestamp = j;
    }
}
