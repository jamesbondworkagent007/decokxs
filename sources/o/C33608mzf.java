package o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewCompat;
import o.C52761wXj;

/* JADX INFO: renamed from: o.mzf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33608mzf extends AppCompatImageView {
    public static final ImageView.ScaleType[] EZpvd = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public android.content.res.ColorStateList AEQbTJ;
    public float AYXKKw;
    public float AhwBna;
    public float AkhnZx;
    public float KWHzl;
    public android.graphics.drawable.Drawable OLrzqt;
    public boolean copydefault;
    public float djBIcL;
    public float[] gEmmrt;
    public ImageView.ScaleType isConnected;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.isConnected;
    }

    public C33608mzf(android.content.Context context) {
        super(context);
        this.valueOf = 0;
        this.isConnected = ImageView.ScaleType.FIT_CENTER;
        this.AYXKKw = 0.0f;
        this.AkhnZx = 0.0f;
        this.AhwBna = 0.0f;
        this.djBIcL = 0.0f;
        this.KWHzl = 0.0f;
        this.AEQbTJ = android.content.res.ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        this.copydefault = false;
        this.gEmmrt = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public C33608mzf(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C33608mzf(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.valueOf = 0;
        this.isConnected = ImageView.ScaleType.FIT_CENTER;
        this.AYXKKw = 0.0f;
        this.AkhnZx = 0.0f;
        this.AhwBna = 0.0f;
        this.djBIcL = 0.0f;
        this.KWHzl = 0.0f;
        this.AEQbTJ = android.content.res.ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        this.copydefault = false;
        this.gEmmrt = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.ArkbYM, i, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.f1067a, -1);
        if (i2 >= 0) {
            setScaleType(EZpvd[i2]);
        }
        this.AYXKKw = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.GVpNrsfQMcgE, 0);
        this.AkhnZx = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.RbMRq, 0);
        this.AhwBna = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.fXG, 0);
        float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.hkDICb, 0);
        this.djBIcL = dimensionPixelSize;
        float f = this.AYXKKw;
        if (f >= 0.0f) {
            float f2 = this.AkhnZx;
            if (f2 >= 0.0f) {
                float f3 = this.AhwBna;
                if (f3 >= 0.0f && dimensionPixelSize >= 0.0f) {
                    this.gEmmrt = new float[]{f, f, f2, f2, dimensionPixelSize, dimensionPixelSize, f3, f3};
                    float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.wtf, 0);
                    this.KWHzl = dimensionPixelSize2;
                    if (dimensionPixelSize2 < 0.0f) {
                        throw new java.lang.IllegalArgumentException("border width cannot be negative.");
                    }
                    android.content.res.ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.IIEbr);
                    this.AEQbTJ = colorStateList;
                    if (colorStateList == null) {
                        this.AEQbTJ = android.content.res.ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
                    }
                    this.copydefault = typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.isDevMode, false);
                    typedArrayObtainStyledAttributes.recycle();
                    KWHzl();
                    return;
                }
            }
        }
        throw new java.lang.IllegalArgumentException("radius values cannot be negative.");
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        super.setScaleType(scaleType);
        this.isConnected = scaleType;
        KWHzl();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        this.valueOf = 0;
        android.graphics.drawable.Drawable drawableKWHzl = Activity.KWHzl(drawable, getResources());
        this.OLrzqt = drawableKWHzl;
        super.setImageDrawable(drawableKWHzl);
        KWHzl();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        this.valueOf = 0;
        Activity activityKWHzl = Activity.KWHzl(bitmap, getResources());
        this.OLrzqt = activityKWHzl;
        super.setImageDrawable(activityKWHzl);
        KWHzl();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.valueOf != i) {
            this.valueOf = i;
            android.graphics.drawable.Drawable drawableAEQbTJ = AEQbTJ();
            this.OLrzqt = drawableAEQbTJ;
            super.setImageDrawable(drawableAEQbTJ);
            KWHzl();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(android.net.Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public final android.graphics.drawable.Drawable AEQbTJ() {
        android.content.res.Resources resources = getResources();
        android.graphics.drawable.Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.valueOf;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Resources.NotFoundException unused) {
                this.valueOf = 0;
            }
        }
        return Activity.KWHzl(drawable, getResources());
    }

    public final void KWHzl() {
        android.graphics.drawable.Drawable drawable = this.OLrzqt;
        if (drawable == null) {
            return;
        }
        ((Activity) drawable).OLrzqt(this.isConnected);
        ((Activity) this.OLrzqt).copydefault(this.gEmmrt);
        ((Activity) this.OLrzqt).copydefault(this.KWHzl);
        ((Activity) this.OLrzqt).EZpvd(this.AEQbTJ);
        ((Activity) this.OLrzqt).copydefault(this.copydefault);
    }

    public void setCornerRadiiDP(float f, float f2, float f3, float f4) {
        float f5 = getResources().getDisplayMetrics().density;
        float f6 = f * f5;
        float f7 = f2 * f5;
        float f8 = f3 * f5;
        float f9 = f4 * f5;
        this.gEmmrt = new float[]{f6, f6, f7, f7, f9, f9, f8, f8};
        KWHzl();
    }

    public void setBorderWidthDP(float f) {
        float f2 = getResources().getDisplayMetrics().density * f;
        if (this.KWHzl == f2) {
            return;
        }
        this.KWHzl = f2;
        KWHzl();
        invalidate();
    }

    public void setBorderColor(int i) {
        setBorderColor(android.content.res.ColorStateList.valueOf(i));
    }

    public void setBorderColor(android.content.res.ColorStateList colorStateList) {
        if (this.AEQbTJ.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = android.content.res.ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        }
        this.AEQbTJ = colorStateList;
        KWHzl();
        if (this.KWHzl > 0.0f) {
            invalidate();
        }
    }

    public void setOval(boolean z) {
        this.copydefault = z;
        KWHzl();
        invalidate();
    }

    /* JADX INFO: renamed from: o.mzf$Activity */
    public static class Activity extends android.graphics.drawable.Drawable {
        public android.graphics.Bitmap AEQbTJ;
        public final int AhwBna;
        public boolean AkhnZx;
        public final android.graphics.Paint EZpvd;
        public final RectF KWHzl;
        public BitmapShader OLrzqt;
        public final int copydefault;
        public float[] djBIcL;
        public float[] fARcdN;
        public ImageView.ScaleType fJNWhG;
        public float fetchVPNInfo;
        public android.content.res.ColorStateList gEmmrt;
        public android.graphics.Path isConnected;
        public final android.graphics.Paint valueOf;
        public boolean values;
        public RectF DbNXlk = new RectF();
        public RectF AYXKKw = new RectF();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void OLrzqt(ImageView.ScaleType scaleType) {
            if (scaleType == null) {
                return;
            }
            this.fJNWhG = scaleType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void copydefault(boolean z) {
            this.values = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return this.AhwBna;
        }

        public Activity(android.graphics.Bitmap bitmap, android.content.res.Resources resources) {
            RectF rectF = new RectF();
            this.KWHzl = rectF;
            this.fARcdN = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
            this.djBIcL = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
            this.values = false;
            this.fetchVPNInfo = 0.0f;
            this.gEmmrt = android.content.res.ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
            this.fJNWhG = ImageView.ScaleType.FIT_CENTER;
            this.isConnected = new android.graphics.Path();
            this.AkhnZx = false;
            this.AEQbTJ = bitmap;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.OLrzqt = new BitmapShader(bitmap, tileMode, tileMode);
            int scaledWidth = bitmap.getScaledWidth(resources.getDisplayMetrics());
            this.AhwBna = scaledWidth;
            int scaledHeight = bitmap.getScaledHeight(resources.getDisplayMetrics());
            this.copydefault = scaledHeight;
            rectF.set(0.0f, 0.0f, scaledWidth, scaledHeight);
            android.graphics.Paint paint = new android.graphics.Paint(1);
            this.EZpvd = paint;
            paint.setFilterBitmap(true);
            paint.setStyle(Paint.Style.FILL);
            paint.setShader(this.OLrzqt);
            android.graphics.Paint paint2 = new android.graphics.Paint(1);
            this.valueOf = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(this.gEmmrt.getColorForState(getState(), ViewCompat.MEASURED_STATE_MASK));
            paint2.setStrokeWidth(this.fetchVPNInfo);
        }

        public static Activity KWHzl(android.graphics.Bitmap bitmap, android.content.res.Resources resources) {
            if (bitmap != null) {
                return new Activity(bitmap, resources);
            }
            return null;
        }

        public static android.graphics.drawable.Drawable KWHzl(android.graphics.drawable.Drawable drawable, android.content.res.Resources resources) {
            if (drawable == null || (drawable instanceof Activity)) {
                return drawable;
            }
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i = 0; i < numberOfLayers; i++) {
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i), KWHzl(layerDrawable.getDrawable(i), resources));
                }
                return layerDrawable;
            }
            android.graphics.Bitmap bitmapAEQbTJ = AEQbTJ(drawable);
            return bitmapAEQbTJ != null ? new Activity(bitmapAEQbTJ, resources) : drawable;
        }

        public static android.graphics.Bitmap AEQbTJ(android.graphics.drawable.Drawable drawable) {
            if (drawable == null) {
                return null;
            }
            if (drawable instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            try {
                android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(java.lang.Math.max(drawable.getIntrinsicWidth(), 2), java.lang.Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
                android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                return bitmapCreateBitmap;
            } catch (java.lang.IllegalArgumentException e) {
                android.util.Log.getStackTraceString(e);
                return null;
            }
        }

        @Override // android.graphics.drawable.Drawable
        public boolean isStateful() {
            return this.gEmmrt.isStateful();
        }

        @Override // android.graphics.drawable.Drawable
        public boolean onStateChange(int[] iArr) {
            int colorForState = this.gEmmrt.getColorForState(iArr, 0);
            if (this.valueOf.getColor() != colorForState) {
                this.valueOf.setColor(colorForState);
                return true;
            }
            return super.onStateChange(iArr);
        }

        public final void copydefault(android.graphics.Canvas canvas) {
            android.graphics.Rect clipBounds = canvas.getClipBounds();
            android.graphics.Matrix matrix = canvas.getMatrix();
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            ImageView.ScaleType scaleType2 = this.fJNWhG;
            if (scaleType == scaleType2) {
                this.DbNXlk.set(clipBounds);
                return;
            }
            if (ImageView.ScaleType.CENTER_CROP == scaleType2) {
                OLrzqt(matrix);
                this.DbNXlk.set(clipBounds);
                return;
            }
            if (ImageView.ScaleType.FIT_XY == scaleType2) {
                android.graphics.Matrix matrix2 = new android.graphics.Matrix();
                matrix2.setRectToRect(this.KWHzl, new RectF(clipBounds), Matrix.ScaleToFit.FILL);
                this.OLrzqt.setLocalMatrix(matrix2);
                this.DbNXlk.set(clipBounds);
                return;
            }
            if (ImageView.ScaleType.FIT_START == scaleType2 || ImageView.ScaleType.FIT_END == scaleType2 || ImageView.ScaleType.FIT_CENTER == scaleType2 || ImageView.ScaleType.CENTER_INSIDE == scaleType2) {
                OLrzqt(matrix);
                this.DbNXlk.set(this.KWHzl);
            } else if (ImageView.ScaleType.MATRIX == scaleType2) {
                OLrzqt(matrix);
                this.DbNXlk.set(this.KWHzl);
            }
        }

        public final void OLrzqt(android.graphics.Matrix matrix) {
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            int i = 0;
            while (true) {
                float[] fArr2 = this.fARcdN;
                if (i >= fArr2.length) {
                    return;
                }
                fArr2[i] = fArr2[i] / fArr[0];
                i++;
            }
        }

        public final void KWHzl(android.graphics.Canvas canvas) {
            float[] fArr = new float[9];
            canvas.getMatrix().getValues(fArr);
            float f = fArr[0];
            float f2 = fArr[4];
            float f3 = fArr[2];
            float f4 = fArr[5];
            float fWidth = this.DbNXlk.width();
            float fWidth2 = this.DbNXlk.width();
            float f5 = this.fetchVPNInfo;
            float f6 = fWidth / ((fWidth2 + f5) + f5);
            float fHeight = this.DbNXlk.height();
            float fHeight2 = this.DbNXlk.height();
            float f7 = this.fetchVPNInfo;
            float f8 = fHeight / ((fHeight2 + f7) + f7);
            canvas.scale(f6, f8);
            ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_START;
            ImageView.ScaleType scaleType2 = this.fJNWhG;
            if (scaleType == scaleType2 || ImageView.ScaleType.FIT_END == scaleType2 || ImageView.ScaleType.FIT_XY == scaleType2 || ImageView.ScaleType.FIT_CENTER == scaleType2 || ImageView.ScaleType.CENTER_INSIDE == scaleType2 || ImageView.ScaleType.MATRIX == scaleType2) {
                float f9 = this.fetchVPNInfo;
                canvas.translate(f9, f9);
            } else if (ImageView.ScaleType.CENTER == scaleType2 || ImageView.ScaleType.CENTER_CROP == scaleType2) {
                canvas.translate((-f3) / (f6 * f), (-f4) / (f8 * f2));
                RectF rectF = this.DbNXlk;
                float f10 = rectF.left;
                float f11 = this.fetchVPNInfo;
                canvas.translate(-(f10 - f11), -(rectF.top - f11));
            }
        }

        public final void OLrzqt(android.graphics.Canvas canvas) {
            float[] fArr = new float[9];
            canvas.getMatrix().getValues(fArr);
            float f = fArr[0];
            float fWidth = (this.fetchVPNInfo * this.DbNXlk.width()) / ((this.DbNXlk.width() * f) - (this.fetchVPNInfo * 2.0f));
            this.fetchVPNInfo = fWidth;
            this.valueOf.setStrokeWidth(fWidth);
            this.AYXKKw.set(this.DbNXlk);
            RectF rectF = this.AYXKKw;
            float f2 = (-this.fetchVPNInfo) / 2.0f;
            rectF.inset(f2, f2);
        }

        public final void KWHzl() {
            int i = 0;
            while (true) {
                float[] fArr = this.fARcdN;
                if (i >= fArr.length) {
                    return;
                }
                float f = fArr[i];
                if (f > 0.0f) {
                    this.djBIcL[i] = f;
                    fArr[i] = fArr[i] - this.fetchVPNInfo;
                }
                i++;
            }
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(android.graphics.Canvas canvas) {
            canvas.save();
            if (!this.AkhnZx) {
                copydefault(canvas);
                if (this.fetchVPNInfo > 0.0f) {
                    OLrzqt(canvas);
                    KWHzl();
                }
                this.AkhnZx = true;
            }
            if (this.values) {
                if (this.fetchVPNInfo > 0.0f) {
                    KWHzl(canvas);
                    android.graphics.Path path = this.isConnected;
                    RectF rectF = this.DbNXlk;
                    Path.Direction direction = Path.Direction.CW;
                    path.addOval(rectF, direction);
                    canvas.drawPath(this.isConnected, this.EZpvd);
                    this.isConnected.reset();
                    this.isConnected.addOval(this.AYXKKw, direction);
                    canvas.drawPath(this.isConnected, this.valueOf);
                } else {
                    this.isConnected.addOval(this.DbNXlk, Path.Direction.CW);
                    canvas.drawPath(this.isConnected, this.EZpvd);
                }
            } else if (this.fetchVPNInfo > 0.0f) {
                KWHzl(canvas);
                android.graphics.Path path2 = this.isConnected;
                RectF rectF2 = this.DbNXlk;
                float[] fArr = this.fARcdN;
                Path.Direction direction2 = Path.Direction.CW;
                path2.addRoundRect(rectF2, fArr, direction2);
                canvas.drawPath(this.isConnected, this.EZpvd);
                this.isConnected.reset();
                this.isConnected.addRoundRect(this.AYXKKw, this.djBIcL, direction2);
                canvas.drawPath(this.isConnected, this.valueOf);
            } else {
                this.isConnected.addRoundRect(this.DbNXlk, this.fARcdN, Path.Direction.CW);
                canvas.drawPath(this.isConnected, this.EZpvd);
            }
            canvas.restore();
        }

        public void copydefault(float[] fArr) {
            if (fArr == null) {
                return;
            }
            if (fArr.length != 8) {
                throw new java.lang.ArrayIndexOutOfBoundsException("radii[] needs 8 values");
            }
            java.lang.System.arraycopy(fArr, 0, this.fARcdN, 0, fArr.length);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            android.graphics.Bitmap bitmap = this.AEQbTJ;
            return (bitmap == null || bitmap.hasAlpha() || this.EZpvd.getAlpha() < 255) ? -3 : -1;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            this.EZpvd.setAlpha(i);
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.EZpvd.setColorFilter(colorFilter);
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void setDither(boolean z) {
            this.EZpvd.setDither(z);
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void setFilterBitmap(boolean z) {
            this.EZpvd.setFilterBitmap(z);
            invalidateSelf();
        }

        public void copydefault(float f) {
            this.fetchVPNInfo = f;
            this.valueOf.setStrokeWidth(f);
        }

        public void EZpvd(android.content.res.ColorStateList colorStateList) {
            if (colorStateList == null) {
                this.fetchVPNInfo = 0.0f;
                this.gEmmrt = android.content.res.ColorStateList.valueOf(0);
                this.valueOf.setColor(0);
            } else {
                this.gEmmrt = colorStateList;
                this.valueOf.setColor(colorStateList.getColorForState(getState(), ViewCompat.MEASURED_STATE_MASK));
            }
        }
    }
}
