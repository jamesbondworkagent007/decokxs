package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.ModifierContent;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.layer.BaseLayer;

/* JADX INFO: loaded from: classes2.dex */
public class AnimatableTransform implements ModifierContent, ContentModel {
    private final AnimatablePathValue anchorPoint;
    private boolean autoOrient;
    private final AnimatableFloatValue endOpacity;
    private final AnimatableIntegerValue opacity;
    private final AnimatableValue<PointF, PointF> position;
    private final AnimatableFloatValue rotation;
    private final AnimatableScaleValue scale;
    private final AnimatableFloatValue skew;
    private final AnimatableFloatValue skewAngle;
    private final AnimatableFloatValue startOpacity;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnimatablePathValue getAnchorPoint() {
        return this.anchorPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnimatableFloatValue getEndOpacity() {
        return this.endOpacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnimatableIntegerValue getOpacity() {
        return this.opacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnimatableValue<PointF, PointF> getPosition() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnimatableFloatValue getRotation() {
        return this.rotation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnimatableScaleValue getScale() {
        return this.scale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnimatableFloatValue getSkew() {
        return this.skew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnimatableFloatValue getSkewAngle() {
        return this.skewAngle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnimatableFloatValue getStartOpacity() {
        return this.startOpacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isAutoOrient() {
        return this.autoOrient;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAutoOrient(boolean z) {
        this.autoOrient = z;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return null;
    }

    public AnimatableTransform() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public AnimatableTransform(@Nullable AnimatablePathValue animatablePathValue, @Nullable AnimatableValue<PointF, PointF> animatableValue, @Nullable AnimatableScaleValue animatableScaleValue, @Nullable AnimatableFloatValue animatableFloatValue, @Nullable AnimatableIntegerValue animatableIntegerValue, @Nullable AnimatableFloatValue animatableFloatValue2, @Nullable AnimatableFloatValue animatableFloatValue3, @Nullable AnimatableFloatValue animatableFloatValue4, @Nullable AnimatableFloatValue animatableFloatValue5) {
        this.autoOrient = false;
        this.anchorPoint = animatablePathValue;
        this.position = animatableValue;
        this.scale = animatableScaleValue;
        this.rotation = animatableFloatValue;
        this.opacity = animatableIntegerValue;
        this.startOpacity = animatableFloatValue2;
        this.endOpacity = animatableFloatValue3;
        this.skew = animatableFloatValue4;
        this.skewAngle = animatableFloatValue5;
    }

    public TransformKeyframeAnimation createAnimation() {
        return new TransformKeyframeAnimation(this);
    }
}
