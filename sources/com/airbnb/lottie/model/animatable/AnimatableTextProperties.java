package com.airbnb.lottie.model.animatable;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class AnimatableTextProperties {
    public final AnimatableColorValue color;
    public final AnimatableColorValue stroke;
    public final AnimatableFloatValue strokeWidth;
    public final AnimatableFloatValue tracking;

    public AnimatableTextProperties(@Nullable AnimatableColorValue animatableColorValue, @Nullable AnimatableColorValue animatableColorValue2, @Nullable AnimatableFloatValue animatableFloatValue, @Nullable AnimatableFloatValue animatableFloatValue2) {
        this.color = animatableColorValue;
        this.stroke = animatableColorValue2;
        this.strokeWidth = animatableFloatValue;
        this.tracking = animatableFloatValue2;
    }
}
