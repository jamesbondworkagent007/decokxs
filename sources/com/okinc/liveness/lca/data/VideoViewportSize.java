package com.okinc.liveness.lca.data;

import android.content.Context;
import android.graphics.RectF;
import android.util.Size;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55298xhM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class VideoViewportSize {
    private final Size containerSize;
    private final Size videoSize;
    private final Size viewportDpSize;
    private final Size viewportPixelSize;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VideoViewportSize copy$default(VideoViewportSize videoViewportSize, Size size, Size size2, Size size3, Size size4, int i, Object obj) {
        if ((i & 1) != 0) {
            size = videoViewportSize.containerSize;
        }
        if ((i & 2) != 0) {
            size2 = videoViewportSize.viewportPixelSize;
        }
        if ((i & 4) != 0) {
            size3 = videoViewportSize.viewportDpSize;
        }
        if ((i & 8) != 0) {
            size4 = videoViewportSize.videoSize;
        }
        return videoViewportSize.copy(size, size2, size3, size4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Size component1() {
        return this.containerSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Size component2() {
        return this.viewportPixelSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Size component3() {
        return this.viewportDpSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Size component4() {
        return this.videoSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VideoViewportSize copy(@NotNull Size size, @NotNull Size size2, @NotNull Size size3, @NotNull Size size4) {
        Intrinsics.checkNotNullParameter(size, "");
        Intrinsics.checkNotNullParameter(size2, "");
        Intrinsics.checkNotNullParameter(size3, "");
        Intrinsics.checkNotNullParameter(size4, "");
        return new VideoViewportSize(size, size2, size3, size4);
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
        return Intrinsics.EZpvd(this.containerSize, videoViewportSize.containerSize) && Intrinsics.EZpvd(this.viewportPixelSize, videoViewportSize.viewportPixelSize) && Intrinsics.EZpvd(this.viewportDpSize, videoViewportSize.viewportDpSize) && Intrinsics.EZpvd(this.videoSize, videoViewportSize.videoSize);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Size getContainerSize() {
        return this.containerSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Size getVideoSize() {
        return this.videoSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Size getViewportDpSize() {
        return this.viewportDpSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Size getViewportPixelSize() {
        return this.viewportPixelSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.containerSize.hashCode() * 31) + this.viewportPixelSize.hashCode()) * 31) + this.viewportDpSize.hashCode()) * 31) + this.videoSize.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VideoViewportSize(containerSize=" + this.containerSize + ", viewportPixelSize=" + this.viewportPixelSize + ", viewportDpSize=" + this.viewportDpSize + ", videoSize=" + this.videoSize + ")";
    }

    public VideoViewportSize(@NotNull Size size, @NotNull Size size2, @NotNull Size size3, @NotNull Size size4) {
        Intrinsics.checkNotNullParameter(size, "");
        Intrinsics.checkNotNullParameter(size2, "");
        Intrinsics.checkNotNullParameter(size3, "");
        Intrinsics.checkNotNullParameter(size4, "");
        this.containerSize = size;
        this.viewportPixelSize = size2;
        this.viewportDpSize = size3;
        this.videoSize = size4;
    }

    public final RectF getScaledBoundingRect(@NotNull RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "");
        float width = this.viewportPixelSize.getWidth() / this.videoSize.getWidth();
        return new RectF(rectF.left * width, rectF.top * width, rectF.right * width, rectF.bottom * width);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.data.VideoViewportSize.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final VideoViewportSize create(@NotNull Size size, @NotNull Context context, int i, int i2) {
            Size size2;
            Intrinsics.checkNotNullParameter(size, "");
            Intrinsics.checkNotNullParameter(context, "");
            float width = size.getWidth() / size.getHeight();
            float f = i / i2;
            if (width == f) {
                size2 = size;
            } else if (width < f) {
                size2 = new Size(size.getWidth(), (int) (size.getWidth() * (1 / f)));
            } else {
                size2 = new Size((int) (size.getHeight() * f), size.getHeight());
            }
            return new VideoViewportSize(size, size2, new Size(C55298xhM.px2dp$default(size2.getWidth(), (Context) null, 1, (Object) null), C55298xhM.EZpvd(size2.getHeight(), context)), new Size(i, i2));
        }
    }
}
