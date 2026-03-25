package com.airbnb.lottie.value;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import com.airbnb.lottie.utils.MiscUtils;

/* JADX INFO: loaded from: classes21.dex */
public class LottieRelativePointValueCallback extends LottieValueCallback<PointF> {
    private final PointF point;

    public LottieRelativePointValueCallback() {
        this.point = new PointF();
    }

    public LottieRelativePointValueCallback(@NonNull PointF pointF) {
        super(pointF);
        this.point = new PointF();
    }

    /* JADX DEBUG: Method merged with bridge method: getValue(Lcom/airbnb/lottie/value/LottieFrameInfo;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.value.LottieValueCallback
    public final PointF getValue(LottieFrameInfo<PointF> lottieFrameInfo) {
        this.point.set(MiscUtils.lerp(lottieFrameInfo.getStartValue().x, lottieFrameInfo.getEndValue().x, lottieFrameInfo.getInterpolatedKeyframeProgress()), MiscUtils.lerp(lottieFrameInfo.getStartValue().y, lottieFrameInfo.getEndValue().y, lottieFrameInfo.getInterpolatedKeyframeProgress()));
        PointF offset = getOffset(lottieFrameInfo);
        this.point.offset(offset.x, offset.y);
        return this.point;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public PointF getOffset(LottieFrameInfo<PointF> lottieFrameInfo) {
        T t = this.value;
        if (t == 0) {
            throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
        }
        return (PointF) t;
    }
}
