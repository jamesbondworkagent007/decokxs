package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.PolystarContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* JADX INFO: loaded from: classes2.dex */
public class PolystarShape implements ContentModel {
    private final boolean hidden;
    private final AnimatableFloatValue innerRadius;
    private final AnimatableFloatValue innerRoundedness;
    private final boolean isReversed;
    private final String name;
    private final AnimatableFloatValue outerRadius;
    private final AnimatableFloatValue outerRoundedness;
    private final AnimatableFloatValue points;
    private final AnimatableValue<PointF, PointF> position;
    private final AnimatableFloatValue rotation;
    private final Type type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnimatableFloatValue getInnerRadius() {
        return this.innerRadius;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnimatableFloatValue getInnerRoundedness() {
        return this.innerRoundedness;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnimatableFloatValue getOuterRadius() {
        return this.outerRadius;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnimatableFloatValue getOuterRoundedness() {
        return this.outerRoundedness;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnimatableFloatValue getPoints() {
        return this.points;
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
    public Type getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isHidden() {
        return this.hidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isReversed() {
        return this.isReversed;
    }

    public enum Type {
        STAR(1),
        POLYGON(2);

        private final int value;

        Type(int i) {
            this.value = i;
        }

        public static Type forValue(int i) {
            for (Type type : values()) {
                if (type.value == i) {
                    return type;
                }
            }
            return null;
        }
    }

    public PolystarShape(String str, Type type, AnimatableFloatValue animatableFloatValue, AnimatableValue<PointF, PointF> animatableValue, AnimatableFloatValue animatableFloatValue2, AnimatableFloatValue animatableFloatValue3, AnimatableFloatValue animatableFloatValue4, AnimatableFloatValue animatableFloatValue5, AnimatableFloatValue animatableFloatValue6, boolean z, boolean z2) {
        this.name = str;
        this.type = type;
        this.points = animatableFloatValue;
        this.position = animatableValue;
        this.rotation = animatableFloatValue2;
        this.innerRadius = animatableFloatValue3;
        this.outerRadius = animatableFloatValue4;
        this.innerRoundedness = animatableFloatValue5;
        this.outerRoundedness = animatableFloatValue6;
        this.hidden = z;
        this.isReversed = z2;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new PolystarContent(lottieDrawable, baseLayer, this);
    }
}
