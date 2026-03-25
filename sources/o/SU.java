package o;

/* JADX INFO: loaded from: classes2.dex */
public class SU implements SR {
    public final float KWHzl;

    public SU() {
        this(0.0f);
    }

    public SU(float f) {
        this.KWHzl = f;
    }

    @Override // o.SR
    public android.animation.Animator[] EZpvd(android.view.View view) {
        return new android.animation.Animator[]{android.animation.ObjectAnimator.ofFloat(view, "alpha", this.KWHzl, 1.0f)};
    }
}
