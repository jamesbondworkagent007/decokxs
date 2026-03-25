package o;

/* JADX INFO: renamed from: o.rrR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C43550rrR extends android.view.animation.Animation {
    public android.graphics.Camera AEQbTJ;
    public final boolean AhwBna;
    public final float EZpvd;
    public final float KWHzl;
    public final float OLrzqt;
    public final float copydefault;
    public final float valueOf;

    public C43550rrR(float f, float f2, float f3, float f4, float f5, boolean z) {
        this.OLrzqt = f;
        this.valueOf = f2;
        this.KWHzl = f3;
        this.copydefault = f4;
        this.EZpvd = f5;
        this.AhwBna = z;
    }

    @Override // android.view.animation.Animation
    public void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
        this.AEQbTJ = new android.graphics.Camera();
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, android.view.animation.Transformation transformation) {
        float f2 = this.OLrzqt;
        float f3 = this.valueOf;
        float f4 = this.KWHzl;
        float f5 = this.copydefault;
        android.graphics.Camera camera = this.AEQbTJ;
        android.graphics.Matrix matrix = transformation.getMatrix();
        camera.save();
        if (this.AhwBna) {
            camera.translate(0.0f, 0.0f, this.EZpvd * f);
        } else {
            camera.translate(0.0f, 0.0f, this.EZpvd * (1.0f - f));
        }
        camera.rotateY(f2 + ((f3 - f2) * f));
        camera.getMatrix(matrix);
        camera.restore();
        matrix.preTranslate(-f4, -f5);
        matrix.postTranslate(f4, f5);
    }
}
