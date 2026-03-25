package com.scwang.smartrefresh.header;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import o.AbstractC57946yrx;
import o.C57863yqT;
import o.C57866yqW;
import o.C57940yrr;
import o.InterfaceC57931yri;
import o.InterfaceC57933yrk;
import o.InterfaceC57934yrl;
import o.InterpolatorC57905yrI;

/* JADX INFO: loaded from: classes24.dex */
public class TaurusHeader extends AbstractC57946yrx implements InterfaceC57933yrk {
    public Drawable AYXKKw;
    public Drawable AhwBna;
    public float AkhnZx;
    public boolean AuCTel;
    public int DbNXlk;
    public boolean djBIcL;
    public float ejfBZ;
    public float fARcdN;
    public float fIwbmz;
    public Matrix fJNWhG;
    public boolean fetchVPNInfo;
    public int gEmmrt;
    public Random getNewProxyInstance;
    public Paint hDKMBd;
    public InterfaceC57931yri isConnected;
    public Map<Float, Float> iwGUEr;
    public float uzCIH;
    public Animation valueOf;
    public int values;
    public static String[] copydefault = {"m23.01,81.48c-0.21,-0.3 -0.38,-0.83 -0.38,-1.19 0,-0.55 0.24,-0.78 1.5,-1.48 1.78,-0.97 2.62,-1.94 2.24,-2.57 -0.57,-0.93 -1.97,-1.24 -11.64,-2.59 -5.35,-0.74 -10.21,-1.44 -10.82,-1.54l-1.09,-0.18 1.19,-0.91c0.99,-0.76 1.38,-0.91 2.35,-0.91 0.64,0 6.39,0.33 12.79,0.74 6.39,0.41 12.09,0.71 12.65,0.67l1.03,-0.07 -1.24,-2.19C30.18,66.77 15.91,42 15.13,40.68l-0.51,-0.87 4.19,-1.26c2.3,-0.69 4.27,-1.26 4.37,-1.26 0.1,0 5.95,3.85 13,8.55 14.69,9.81 17.1,11.31 19.7,12.31 4.63,1.78 6.45,1.69 12.94,-0.64 13.18,-4.73 25.22,-9.13 25.75,-9.4 0.69,-0.36 3.6,1.33 -24.38,-14.22L50.73,23.07 46.74,16.42 42.75,9.77 43.63,8.89c0.83,-0.83 0.91,-0.86 1.46,-0.52 0.32,0.2 3.72,3.09 7.55,6.44 3.83,3.34 7.21,6.16 7.5,6.27 0.29,0.11 13.6,2.82 29.58,6.03 15.98,3.21 31.86,6.4 35.3,7.1l6.26,1.26 3.22,-1.13c41.63,-14.63 67.88,-23.23 85.38,-28 14.83,-4.04 23.75,-4.75 32.07,-2.57 7.04,1.84 9.87,4.88 7.71,8.27 -1.6,2.5 -4.6,4.63 -10.61,7.54 -5.94,2.88 -10.22,4.46 -25.4,9.41 -8.15,2.66 -16.66,5.72 -39.01,14.02 -66.79,24.82 -88.49,31.25 -121.66,36.07 -14.56,2.11 -24.17,2.95 -34.08,2.95 -5.43,0 -5.52,-0.01 -5.89,-0.54z"};
    public static int[] EZpvd = {-1};
    public static String[] OLrzqt = {"M551.81,1.01A65.42,65.42 0,0 0,504.38 21.5A50.65,50.65 0,0 0,492.4 20A50.65,50.65 0,0 0,441.75 70.65A50.65,50.65 0,0 0,492.4 121.3A50.65,50.65 0,0 0,511.22 117.64A65.42,65.42 0,0 0,517.45 122L586.25,122A65.42,65.42 0,0 0,599.79 110.78A59.79,59.79 0,0 0,607.81 122L696.34,122A59.79,59.79 0,0 0,711.87 81.9A59.79,59.79 0,0 0,652.07 22.11A59.79,59.79 0,0 0,610.93 38.57A65.42,65.42 0,0 0,551.81 1.01zM246.2,1.71A54.87,54.87 0,0 0,195.14 36.64A46.78,46.78 0,0 0,167.77 27.74A46.78,46.78 0,0 0,120.99 74.52A46.78,46.78 0,0 0,167.77 121.3A46.78,46.78 0,0 0,208.92 96.74A54.87,54.87 0,0 0,246.2 111.45A54.87,54.87 0,0 0,268.71 106.54A39.04,39.04 0,0 0,281.09 122L327.6,122A39.04,39.04 0,0 0,343.38 90.7A39.04,39.04 0,0 0,304.34 51.66A39.04,39.04 0,0 0,300.82 51.85A54.87,54.87 0,0 0,246.2 1.71z", "m506.71,31.37a53.11,53.11 0,0 0,-53.11 53.11,53.11 53.11,0 0,0 15.55,37.5h75.12a53.11,53.11 0,0 0,1.88 -2.01,28.49 28.49,0 0,0 0.81,2.01h212.96a96.72,96.72 0,0 0,-87.09 -54.85,96.72 96.72,0 0,0 -73.14,33.52 28.49,28.49 0,0 0,-26.74 -18.74,28.49 28.49,0 0,0 -13.16,3.23 53.11,53.11 0,0 0,0.03 -0.66,53.11 53.11,0 0,0 -53.11,-53.11zM206.23,31.81a53.81,53.81 0,0 0,-49.99 34.03,74.91 74.91,0 0,0 -47.45,-17 74.91,74.91 0,0 0,-73.54 60.82,31.3 31.3,0 0,0 -10.17,-1.73 31.3,31.3 0,0 0,-26.09 14.05L300.86,121.98a37.63,37.63 0,0 0,0.2 -3.85,37.63 37.63,0 0,0 -37.63,-37.63 37.63,37.63 0,0 0,-3.65 0.21,53.81 53.81,0 0,0 -53.54,-48.9z", "m424.05,36.88a53.46,53.46 0,0 0,-40.89 19.02,53.46 53.46,0 0,0 -1.34,1.76 62.6,62.6 0,0 0,-5.39 -0.27,62.6 62.6,0 0,0 -61.36,50.17 62.6,62.6 0,0 0,-0.53 3.51,15.83 15.83,0 0,0 -10.33,-3.84 15.83,15.83 0,0 0,-8.06 2.23,21.1 21.1,0 0,0 -18.31,-10.67 21.1,21.1 0,0 0,-19.47 12.97,21.81 21.81,0 0,0 -6.56,-1.01 21.81,21.81 0,0 0,-19.09 11.32L522.84,122.07a43.61,43.61 0,0 0,-43.11 -37.35,43.61 43.61,0 0,0 -2.57,0.09 53.46,53.46 0,0 0,-53.11 -47.93zM129.08,38.4a50.29,50.29 0,0 0,-50.29 50.29,50.29 50.29,0 0,0 2.37,15.06 15.48,15.83 0,0 0,-5.87 1.68,15.48 15.83,0 0,0 -0.98,0.58 16.53,16.18 0,0 0,-0.19 -0.21,16.53 16.18,0 0,0 -11.86,-4.91 16.53,16.18 0,0 0,-16.38 14.13,20.05 16.18,0 0,0 -14.97,7.04L223.95,122.07a42.56,42.56 0,0 0,1.14 -9.56,42.56 42.56,0 0,0 -42.56,-42.56 42.56,42.56 0,0 0,-6.58 0.54,50.29 50.29,0 0,0 -0,-0.01 50.29,50.29 0,0 0,-46.88 -32.07zM631.67,82.61a64.01,64.01 0,0 0,-44.9 18.42,26.73 26.73,0 0,0 -10.67,-2.24 26.73,26.73 0,0 0,-22.72 12.71,16.88 16.88,0 0,0 -0.25,-0.12 16.88,16.88 0,0 0,-6.57 -1.33,16.88 16.88,0 0,0 -16.15,12.03h160.36a64.01,64.01 0,0 0,-59.1 -39.46z"};
    public static int[] AEQbTJ = {-1429742351, -571935747, -131587};
    public static final Interpolator KWHzl = new AccelerateDecelerateInterpolator();

    public enum AnimationPart {
        FIRST,
        SECOND,
        THIRD,
        FOURTH
    }

    public TaurusHeader(Context context) {
        this(context, null);
    }

    public TaurusHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.djBIcL = false;
        setMinimumHeight(InterpolatorC57905yrI.OLrzqt(100.0f));
        this.fJNWhG = new Matrix();
        this.iwGUEr = new HashMap();
        this.getNewProxyInstance = new Random();
        Paint paint = new Paint();
        this.hDKMBd = paint;
        paint.setColor(-1);
        this.hDKMBd.setStrokeWidth(InterpolatorC57905yrI.OLrzqt(3.0f));
        this.hDKMBd.setAlpha(50);
        this.AuCTelauCTel = C57940yrr.OLrzqt;
        Animation animation = new Animation() { // from class: com.scwang.smartrefresh.header.TaurusHeader.1
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, @NonNull Transformation transformation) {
                TaurusHeader.this.fIwbmz = (f / 6.0f) * 80.0f;
                this.invalidate();
            }
        };
        this.valueOf = animation;
        animation.setRepeatCount(-1);
        this.valueOf.setRepeatMode(2);
        this.valueOf.setInterpolator(KWHzl);
        this.valueOf.setDuration(1000L);
        C57866yqW c57866yqW = new C57866yqW();
        if (!c57866yqW.EZpvd(copydefault)) {
            c57866yqW.EZpvd(3, 3, 257, 79);
        }
        c57866yqW.OLrzqt(EZpvd);
        C57866yqW c57866yqW2 = new C57866yqW();
        if (!c57866yqW2.EZpvd(OLrzqt)) {
            c57866yqW2.EZpvd(-1, 1, 761, 121);
        }
        c57866yqW2.OLrzqt(AEQbTJ);
        this.AhwBna = c57866yqW;
        this.AYXKKw = c57866yqW2;
        c57866yqW.setBounds(0, 0, InterpolatorC57905yrI.OLrzqt(65.0f), InterpolatorC57905yrI.OLrzqt(20.0f));
        this.AYXKKw.setBounds(0, 0, InterpolatorC57905yrI.OLrzqt(260.0f), InterpolatorC57905yrI.OLrzqt(45.0f));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C57863yqT.TaskDescription.DbNXlk);
        int color = typedArrayObtainStyledAttributes.getColor(C57863yqT.TaskDescription.fetchVPNInfo, 0);
        this.gEmmrt = color == 0 ? -15614977 : color;
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public void EZpvd(@NonNull InterfaceC57931yri interfaceC57931yri, int i, int i2) {
        this.isConnected = interfaceC57931yri;
        interfaceC57931yri.AEQbTJ(this, this.gEmmrt);
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public void copydefault(boolean z, float f, int i, int i2, int i3) {
        this.DbNXlk = i;
        this.fARcdN = f;
        this.values = i2;
        if (z) {
            this.AkhnZx = 0.0f;
        }
        invalidate();
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public void KWHzl(@NonNull InterfaceC57934yrl interfaceC57934yrl, int i, int i2) {
        this.djBIcL = true;
        this.AkhnZx = 0.0f;
        startAnimation(this.valueOf);
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public int EZpvd(@NonNull InterfaceC57934yrl interfaceC57934yrl, boolean z) {
        clearAnimation();
        if (z) {
            startAnimation(new Animation() { // from class: com.scwang.smartrefresh.header.TaurusHeader.3
                {
                    super.setDuration(100L);
                    super.setInterpolator(new AccelerateInterpolator());
                }

                @Override // android.view.animation.Animation
                public void applyTransformation(float f, Transformation transformation) {
                    if (f == 1.0f) {
                        TaurusHeader.this.djBIcL = false;
                    }
                    TaurusHeader.this.AkhnZx = f;
                    this.invalidate();
                }
            });
            return 200;
        }
        this.djBIcL = false;
        return 0;
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    @Deprecated
    public void setPrimaryColors(@ColorInt int... iArr) {
        int i = iArr[0];
        this.gEmmrt = i;
        InterfaceC57931yri interfaceC57931yri = this.isConnected;
        if (interfaceC57931yri != null) {
            interfaceC57931yri.AEQbTJ(this, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int i = this.DbNXlk;
        InterfaceC57931yri interfaceC57931yri = this.isConnected;
        boolean z = interfaceC57931yri != null && equals(interfaceC57931yri.copydefault().isConnected());
        if (z) {
            canvas.save();
            canvas.translate(0.0f, getHeight() - this.DbNXlk);
        }
        OLrzqt(canvas, width);
        copydefault(canvas, width, i);
        KWHzl(canvas, width, i);
        EZpvd(canvas, width, i);
        if (z) {
            canvas.restore();
        }
        super.dispatchDraw(canvas);
    }

    public void OLrzqt(Canvas canvas, int i) {
        float f;
        if (this.djBIcL) {
            while (this.iwGUEr.size() < 10) {
                float fRandom = (float) (((double) this.values) / (Math.random() * 5.0d));
                float fKWHzl = KWHzl(1000, 2000);
                if (this.iwGUEr.size() > 1) {
                    while (true) {
                        f = 0.0f;
                        while (f == 0.0f) {
                            float fRandom2 = (float) (((double) this.values) / (Math.random() * 5.0d));
                            Iterator<Map.Entry<Float, Float>> it = this.iwGUEr.entrySet().iterator();
                            while (it.hasNext()) {
                                if (Math.abs(it.next().getKey().floatValue() - fRandom2) > this.values / 5) {
                                    f = fRandom2;
                                }
                            }
                        }
                    }
                    fRandom = f;
                }
                this.iwGUEr.put(Float.valueOf(fRandom), Float.valueOf(fKWHzl));
                OLrzqt(canvas, fRandom, fKWHzl, i);
            }
            if (this.iwGUEr.size() >= 10) {
                for (Map.Entry<Float, Float> entry : this.iwGUEr.entrySet()) {
                    OLrzqt(canvas, entry.getKey().floatValue(), entry.getValue().floatValue(), i);
                }
            }
            if (this.fetchVPNInfo && this.AuCTel) {
                this.iwGUEr.clear();
                this.AuCTel = false;
                this.uzCIH = KWHzl(50, 300);
            }
            this.ejfBZ = this.fIwbmz;
        }
    }

    public void OLrzqt(Canvas canvas, float f, float f2, int i) {
        float f3 = i;
        float f4 = (f3 + f2) / 13.333333f;
        float f5 = this.fIwbmz;
        if (this.ejfBZ - f5 > 0.0f) {
            this.fetchVPNInfo = true;
            f5 = 13.333333f - f5;
        } else {
            this.AuCTel = true;
            this.fetchVPNInfo = false;
        }
        float f6 = this.uzCIH;
        float f7 = ((f3 - (f5 * f4)) + f2) - f6;
        canvas.drawLine(f7, f, f7 + f6, f, this.hDKMBd);
    }

    public void KWHzl(Canvas canvas, int i, int i2) {
        float fCopydefault;
        float fCopydefault2;
        Matrix matrix = this.fJNWhG;
        matrix.reset();
        Drawable drawable = this.AYXKKw;
        float fMin = Math.min(1.0f, Math.abs(this.fARcdN));
        if (isInEditMode()) {
            this.values = i2;
            fMin = 1.0f;
        }
        float f = fMin - 0.5f;
        float f2 = f > 0.0f ? 0.6f + ((f / 0.5f) * 0.39999998f) : 0.6f;
        float fHeight = this.values * (1.0f - fMin);
        float fWidth = 0.0f - (drawable.getBounds().width() / 2.0f);
        float fWidth2 = i - (drawable.getBounds().width() / 2.0f);
        if (this.djBIcL) {
            AnimationPart animationPart = AnimationPart.FIRST;
            if (OLrzqt(animationPart)) {
                fWidth -= (copydefault(animationPart) * 2.0f) / 4.0f;
                fCopydefault2 = copydefault(animationPart);
            } else {
                AnimationPart animationPart2 = AnimationPart.SECOND;
                if (OLrzqt(animationPart2)) {
                    fWidth -= (copydefault(animationPart2) * 2.0f) / 4.0f;
                    fCopydefault2 = copydefault(animationPart2);
                } else {
                    AnimationPart animationPart3 = AnimationPart.THIRD;
                    if (OLrzqt(animationPart3)) {
                        fWidth -= copydefault(animationPart3) / 4.0f;
                        fCopydefault2 = copydefault(animationPart3) * 2.0f;
                    } else {
                        AnimationPart animationPart4 = AnimationPart.FOURTH;
                        if (OLrzqt(animationPart4)) {
                            fWidth -= copydefault(animationPart4) / 2.0f;
                            fCopydefault = (copydefault(animationPart4) * 2.0f) / 4.0f;
                            fWidth2 += fCopydefault;
                        }
                    }
                }
            }
            fCopydefault = fCopydefault2 / 2.0f;
            fWidth2 += fCopydefault;
        }
        float f3 = i2 + 2;
        float fHeight2 = (((float) drawable.getBounds().height()) * f2) + fHeight < f3 ? f3 - (drawable.getBounds().height() * f2) : fHeight;
        if ((drawable.getBounds().height() * f2) + fHeight < f3) {
            fHeight = f3 - (drawable.getBounds().height() * f2);
        }
        int saveCount = canvas.getSaveCount();
        canvas.save();
        canvas.translate(fWidth, fHeight2);
        matrix.postScale(f2, f2, (drawable.getBounds().width() * 3) / 4.0f, drawable.getBounds().height());
        canvas.concat(matrix);
        drawable.setAlpha(100);
        drawable.draw(canvas);
        drawable.setAlpha(255);
        canvas.restoreToCount(saveCount);
        canvas.save();
        canvas.translate(fWidth2, fHeight);
        matrix.postScale(f2, f2, 0.0f, drawable.getBounds().height());
        canvas.concat(matrix);
        drawable.setAlpha(100);
        drawable.draw(canvas);
        drawable.setAlpha(255);
        canvas.restoreToCount(saveCount);
    }

    public void EZpvd(Canvas canvas, int i, int i2) {
        boolean z;
        float fAbs;
        float f;
        float fCopydefault;
        float fCopydefault2;
        Matrix matrix = this.fJNWhG;
        matrix.reset();
        float fMin = Math.min(1.0f, Math.abs(this.fARcdN));
        if (isInEditMode()) {
            this.values = i2;
            fMin = 1.0f;
        }
        float f2 = this.fARcdN;
        boolean z2 = false;
        if (f2 > 1.0f) {
            fAbs = Math.abs(1.0f - f2);
            z = true;
        } else {
            z = false;
            fAbs = 0.0f;
        }
        float f3 = fMin - 0.5f;
        float f4 = f3 > 0.0f ? 0.8f + ((f3 / 0.5f) * 0.19999999f) : 0.8f;
        int i3 = this.values;
        float f5 = i3 * fMin;
        float fHeight = i3 - (this.AYXKKw.getBounds().height() / 2);
        if (f5 > fHeight) {
            f = f5 - fHeight;
            z2 = true;
        } else {
            f = 0.0f;
        }
        float f6 = i / 2.0f;
        float fWidth = this.AYXKKw.getBounds().width() / 2.0f;
        float fHeight2 = f5 - (z2 ? (this.AYXKKw.getBounds().height() / 2.0f) + f : this.AYXKKw.getBounds().height() / 2.0f);
        float f7 = z ? (fAbs / 4.0f) + f4 : f4;
        float f8 = z ? (fAbs / 2.0f) + f4 : f4;
        if (this.djBIcL && !z) {
            AnimationPart animationPart = AnimationPart.FIRST;
            if (OLrzqt(animationPart)) {
                fCopydefault2 = copydefault(animationPart);
            } else {
                AnimationPart animationPart2 = AnimationPart.SECOND;
                if (OLrzqt(animationPart2)) {
                    fCopydefault2 = copydefault(animationPart2);
                } else {
                    AnimationPart animationPart3 = AnimationPart.THIRD;
                    if (OLrzqt(animationPart3)) {
                        fCopydefault = copydefault(animationPart3);
                    } else {
                        AnimationPart animationPart4 = AnimationPart.FOURTH;
                        if (OLrzqt(animationPart4)) {
                            fCopydefault = copydefault(animationPart4);
                        }
                        f8 = f7;
                    }
                    f7 = ((fCopydefault / 80.0f) / 6.0f) + f4;
                    f8 = f7;
                }
            }
            f7 = f4 - ((fCopydefault2 / 80.0f) / 8.0f);
            f8 = f7;
        }
        matrix.postScale(f7, f8, this.AYXKKw.getBounds().width() / 2.0f, 0.0f);
        float f9 = i2 + 2;
        if ((this.AYXKKw.getBounds().height() * f8) + fHeight2 < f9) {
            fHeight2 = f9 - (f8 * this.AYXKKw.getBounds().height());
        }
        int saveCount = canvas.getSaveCount();
        canvas.save();
        canvas.translate(f6 - fWidth, fHeight2);
        canvas.concat(matrix);
        this.AYXKKw.draw(canvas);
        canvas.restoreToCount(saveCount);
    }

    public void copydefault(Canvas canvas, int i, int i2) {
        float fPow;
        float fCopydefault;
        float fCopydefault2;
        Matrix matrix = this.fJNWhG;
        matrix.reset();
        float f = this.fARcdN;
        if (isInEditMode()) {
            this.values = i2;
            f = 1.0f;
        }
        if (f > 1.0f) {
            fPow = ((float) (1.0d - Math.pow(100.0d, (-(f - 1.0f)) / 2.0f))) * 20.0f;
            f = 1.0f;
        } else {
            fPow = 0.0f;
        }
        float fWidth = ((i * f) / 2.0f) - (this.AhwBna.getBounds().width() / 2.0f);
        float fHeight = (this.values * (1.0f - (f / 2.0f))) - (this.AhwBna.getBounds().height() / 2.0f);
        float f2 = this.AkhnZx;
        if (f2 > 0.0f) {
            fHeight += (0.0f - fHeight) * f2;
            fWidth += ((i + this.AhwBna.getBounds().width()) - fWidth) * this.AkhnZx;
        }
        if (this.djBIcL) {
            AnimationPart animationPart = AnimationPart.FIRST;
            if (OLrzqt(animationPart)) {
                fCopydefault2 = copydefault(animationPart);
            } else {
                AnimationPart animationPart2 = AnimationPart.SECOND;
                if (OLrzqt(animationPart2)) {
                    fCopydefault2 = copydefault(animationPart2);
                } else {
                    AnimationPart animationPart3 = AnimationPart.THIRD;
                    if (OLrzqt(animationPart3)) {
                        fCopydefault = copydefault(animationPart3);
                    } else {
                        AnimationPart animationPart4 = AnimationPart.FOURTH;
                        if (OLrzqt(animationPart4)) {
                            fCopydefault = copydefault(animationPart4);
                        }
                    }
                    fHeight += fCopydefault;
                }
            }
            fHeight -= fCopydefault2;
        }
        if (fPow > 0.0f) {
            matrix.postRotate(fPow, this.AhwBna.getBounds().width() / 2.0f, this.AhwBna.getBounds().height() / 2.0f);
        }
        int saveCount = canvas.getSaveCount();
        canvas.save();
        canvas.translate(fWidth, fHeight);
        canvas.concat(matrix);
        this.AhwBna.draw(canvas);
        canvas.restoreToCount(saveCount);
    }

    public float KWHzl(int i, int i2) {
        return this.getNewProxyInstance.nextInt((i2 - i) + 1) + i;
    }

    /* JADX INFO: renamed from: com.scwang.smartrefresh.header.TaurusHeader$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] AEQbTJ;

        static {
            int[] iArr = new int[AnimationPart.values().length];
            AEQbTJ = iArr;
            try {
                iArr[AnimationPart.FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AEQbTJ[AnimationPart.SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AEQbTJ[AnimationPart.THIRD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AEQbTJ[AnimationPart.FOURTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public float copydefault(AnimationPart animationPart) {
        float fEZpvd;
        float fEZpvd2;
        int i = AnonymousClass4.AEQbTJ[animationPart.ordinal()];
        if (i == 1) {
            return this.fIwbmz;
        }
        if (i == 2) {
            AnimationPart animationPart2 = AnimationPart.FOURTH;
            return EZpvd(animationPart2) - (this.fIwbmz - EZpvd(animationPart2));
        }
        if (i == 3) {
            fEZpvd = this.fIwbmz;
            fEZpvd2 = EZpvd(AnimationPart.SECOND);
        } else {
            if (i != 4) {
                return 0.0f;
            }
            fEZpvd = EZpvd(AnimationPart.THIRD);
            fEZpvd2 = this.fIwbmz - EZpvd(AnimationPart.FOURTH);
        }
        return fEZpvd - fEZpvd2;
    }

    public boolean OLrzqt(AnimationPart animationPart) {
        int i = AnonymousClass4.AEQbTJ[animationPart.ordinal()];
        return i != 1 ? (i == 2 || i == 3) ? this.fIwbmz < ((float) EZpvd(animationPart)) : i == 4 && this.fIwbmz > ((float) EZpvd(AnimationPart.THIRD)) : this.fIwbmz < ((float) EZpvd(AnimationPart.FOURTH));
    }

    public int EZpvd(AnimationPart animationPart) {
        int i = AnonymousClass4.AEQbTJ[animationPart.ordinal()];
        if (i == 2) {
            return 40;
        }
        if (i != 3) {
            return i != 4 ? 0 : 20;
        }
        return EZpvd(AnimationPart.FOURTH) * 3;
    }
}
