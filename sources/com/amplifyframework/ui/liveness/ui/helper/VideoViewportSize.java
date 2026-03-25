package com.amplifyframework.ui.liveness.ui.helper;

import android.graphics.RectF;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.amplifyframework.ui.liveness.camera.LivenessCoordinator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class VideoViewportSize {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long containerSize;
    private final long viewportDpSize;
    private final long viewportPixelSize;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 long), (r3v0 long), (r5v0 long) A[MD:(long, long, long):void (m)] call: com.amplifyframework.ui.liveness.ui.helper.VideoViewportSize.<init>(long, long, long):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ VideoViewportSize(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: copy-DiEohAw$default, reason: not valid java name */
    public static /* synthetic */ VideoViewportSize m6093copyDiEohAw$default(VideoViewportSize videoViewportSize, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = videoViewportSize.containerSize;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = videoViewportSize.viewportPixelSize;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = videoViewportSize.viewportDpSize;
        }
        return videoViewportSize.m6097copyDiEohAw(j4, j5, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component1-YbymL2g, reason: not valid java name */
    public final long m6094component1YbymL2g() {
        return this.containerSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component2-YbymL2g, reason: not valid java name */
    public final long m6095component2YbymL2g() {
        return this.viewportPixelSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component3-MYxV2XQ, reason: not valid java name */
    public final long m6096component3MYxV2XQ() {
        return this.viewportDpSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: copy-DiEohAw, reason: not valid java name */
    public final VideoViewportSize m6097copyDiEohAw(long j, long j2, long j3) {
        return new VideoViewportSize(j, j2, j3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoViewportSize)) {
            return false;
        }
        VideoViewportSize videoViewportSize = (VideoViewportSize) obj;
        return IntSize.m5572equalsimpl0(this.containerSize, videoViewportSize.containerSize) && IntSize.m5572equalsimpl0(this.viewportPixelSize, videoViewportSize.viewportPixelSize) && DpSize.m5509equalsimpl0(this.viewportDpSize, videoViewportSize.viewportDpSize);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getContainerSize-YbymL2g, reason: not valid java name */
    public final long m6098getContainerSizeYbymL2g() {
        return this.containerSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getViewportDpSize-MYxV2XQ, reason: not valid java name */
    public final long m6099getViewportDpSizeMYxV2XQ() {
        return this.viewportDpSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getViewportPixelSize-YbymL2g, reason: not valid java name */
    public final long m6100getViewportPixelSizeYbymL2g() {
        return this.viewportPixelSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((IntSize.m5575hashCodeimpl(this.containerSize) * 31) + IntSize.m5575hashCodeimpl(this.viewportPixelSize)) * 31) + DpSize.m5514hashCodeimpl(this.viewportDpSize);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VideoViewportSize(containerSize=" + IntSize.m5577toStringimpl(this.containerSize) + ", viewportPixelSize=" + IntSize.m5577toStringimpl(this.viewportPixelSize) + ", viewportDpSize=" + DpSize.m5519toStringimpl(this.viewportDpSize) + ")";
    }

    private VideoViewportSize(long j, long j2, long j3) {
        this.containerSize = j;
        this.viewportPixelSize = j2;
        this.viewportDpSize = j3;
    }

    public final RectF getScaledBoundingRect(@NotNull RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "");
        float fM5574getWidthimpl = IntSize.m5574getWidthimpl(this.viewportPixelSize) / LivenessCoordinator.TARGET_WIDTH;
        return new RectF(rectF.left * fM5574getWidthimpl, rectF.top * fM5574getWidthimpl, rectF.right * fM5574getWidthimpl, rectF.bottom * fM5574getWidthimpl);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.ui.liveness.ui.helper.VideoViewportSize.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: create-viCIZxY, reason: not valid java name */
        public final VideoViewportSize m6101createviCIZxY(long j, @NotNull Density density) {
            long jIntSize;
            long j2;
            Intrinsics.checkNotNullParameter(density, "");
            float fM5574getWidthimpl = IntSize.m5574getWidthimpl(j) / IntSize.m5573getHeightimpl(j);
            if (fM5574getWidthimpl == 0.75f) {
                j2 = j;
            } else {
                if (fM5574getWidthimpl < 0.75f) {
                    jIntSize = IntSizeKt.IntSize(IntSize.m5574getWidthimpl(j), (int) (IntSize.m5574getWidthimpl(j) * 1.3333334f));
                } else {
                    jIntSize = IntSizeKt.IntSize((int) (IntSize.m5573getHeightimpl(j) * 0.75f), IntSize.m5573getHeightimpl(j));
                }
                j2 = jIntSize;
            }
            return new VideoViewportSize(j, j2, DpKt.m5436DpSizeYgX7TsA(density.mo513toDpu2uoSUM(IntSize.m5574getWidthimpl(j2)), density.mo513toDpu2uoSUM(IntSize.m5573getHeightimpl(j2))), null);
        }
    }
}
