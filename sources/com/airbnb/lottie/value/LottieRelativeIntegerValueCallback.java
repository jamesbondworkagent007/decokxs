package com.airbnb.lottie.value;

import com.airbnb.lottie.utils.MiscUtils;

/* JADX INFO: loaded from: classes21.dex */
public class LottieRelativeIntegerValueCallback extends LottieValueCallback<Integer> {
    /* JADX DEBUG: Method merged with bridge method: getValue(Lcom/airbnb/lottie/value/LottieFrameInfo;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.value.LottieValueCallback
    public Integer getValue(LottieFrameInfo<Integer> lottieFrameInfo) {
        return Integer.valueOf(MiscUtils.lerp(lottieFrameInfo.getStartValue().intValue(), lottieFrameInfo.getEndValue().intValue(), lottieFrameInfo.getInterpolatedKeyframeProgress()) + getOffset(lottieFrameInfo).intValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public Integer getOffset(LottieFrameInfo<Integer> lottieFrameInfo) {
        T t = this.value;
        if (t == 0) {
            throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
        }
        return (Integer) t;
    }
}
