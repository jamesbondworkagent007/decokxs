package com.airbnb.lottie.model.content;

import com.airbnb.lottie.model.animatable.AnimatableFloatValue;

/* JADX INFO: loaded from: classes2.dex */
public class BlurEffect {
    final AnimatableFloatValue blurriness;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnimatableFloatValue getBlurriness() {
        return this.blurriness;
    }

    public BlurEffect(AnimatableFloatValue animatableFloatValue) {
        this.blurriness = animatableFloatValue;
    }
}
