package com.airbnb.lottie.animation.content;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TrimPathContent implements Content, BaseKeyframeAnimation.AnimationListener {
    private final BaseKeyframeAnimation<?, Float> endAnimation;
    private final boolean hidden;
    private final List<BaseKeyframeAnimation.AnimationListener> listeners = new ArrayList();
    private final String name;
    private final BaseKeyframeAnimation<?, Float> offsetAnimation;
    private final BaseKeyframeAnimation<?, Float> startAnimation;
    private final ShapeTrimPath.Type type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BaseKeyframeAnimation<?, Float> getEnd() {
        return this.endAnimation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BaseKeyframeAnimation<?, Float> getOffset() {
        return this.offsetAnimation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BaseKeyframeAnimation<?, Float> getStart() {
        return this.startAnimation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ShapeTrimPath.Type getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isHidden() {
        return this.hidden;
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
    }

    public TrimPathContent(BaseLayer baseLayer, ShapeTrimPath shapeTrimPath) {
        this.name = shapeTrimPath.getName();
        this.hidden = shapeTrimPath.isHidden();
        this.type = shapeTrimPath.getType();
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation = shapeTrimPath.getStart().createAnimation();
        this.startAnimation = baseKeyframeAnimationCreateAnimation;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation2 = shapeTrimPath.getEnd().createAnimation();
        this.endAnimation = baseKeyframeAnimationCreateAnimation2;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation3 = shapeTrimPath.getOffset().createAnimation();
        this.offsetAnimation = baseKeyframeAnimationCreateAnimation3;
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation2);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation3);
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
        baseKeyframeAnimationCreateAnimation2.addUpdateListener(this);
        baseKeyframeAnimationCreateAnimation3.addUpdateListener(this);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        for (int i = 0; i < this.listeners.size(); i++) {
            this.listeners.get(i).onValueChanged();
        }
    }

    public void addListener(BaseKeyframeAnimation.AnimationListener animationListener) {
        this.listeners.add(animationListener);
    }
}
