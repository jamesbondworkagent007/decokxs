package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;

/* JADX INFO: loaded from: classes2.dex */
public class DropShadowEffect {
    private final AnimatableColorValue color;
    private final AnimatableFloatValue direction;
    private final AnimatableFloatValue distance;
    private final AnimatableFloatValue opacity;
    private final AnimatableFloatValue radius;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnimatableColorValue getColor() {
        return this.color;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnimatableFloatValue getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnimatableFloatValue getDistance() {
        return this.distance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnimatableFloatValue getOpacity() {
        return this.opacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnimatableFloatValue getRadius() {
        return this.radius;
    }

    public DropShadowEffect(AnimatableColorValue animatableColorValue, AnimatableFloatValue animatableFloatValue, AnimatableFloatValue animatableFloatValue2, AnimatableFloatValue animatableFloatValue3, AnimatableFloatValue animatableFloatValue4) {
        this.color = animatableColorValue;
        this.opacity = animatableFloatValue;
        this.direction = animatableFloatValue2;
        this.distance = animatableFloatValue3;
        this.radius = animatableFloatValue4;
    }
}
