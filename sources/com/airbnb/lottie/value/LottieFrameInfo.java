package com.airbnb.lottie.value;

/* JADX INFO: loaded from: classes2.dex */
public class LottieFrameInfo<T> {
    private float endFrame;
    private T endValue;
    private float interpolatedKeyframeProgress;
    private float linearKeyframeProgress;
    private float overallProgress;
    private float startFrame;
    private T startValue;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float getEndFrame() {
        return this.endFrame;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public T getEndValue() {
        return this.endValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float getInterpolatedKeyframeProgress() {
        return this.interpolatedKeyframeProgress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float getLinearKeyframeProgress() {
        return this.linearKeyframeProgress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float getOverallProgress() {
        return this.overallProgress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float getStartFrame() {
        return this.startFrame;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public T getStartValue() {
        return this.startValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LottieFrameInfo<T> set(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        this.startFrame = f;
        this.endFrame = f2;
        this.startValue = t;
        this.endValue = t2;
        this.linearKeyframeProgress = f3;
        this.interpolatedKeyframeProgress = f4;
        this.overallProgress = f5;
        return this;
    }
}
