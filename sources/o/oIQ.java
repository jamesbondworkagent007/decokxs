package o;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes18.dex */
public class oIQ extends RecyclerView.AdapterDataObserver {
    public int AEQbTJ;
    public int AhwBna;
    public float AkhnZx;
    public int AuCTel;
    public java.lang.Boolean AuCTelauCTel;
    public float AwvSrB;
    public int AxsJAY;
    public java.lang.Boolean DTwDnp;
    public float DbNXlk;
    public int EZpvd;
    public int KWHzl;
    public int OLrzqt;
    public int QOLQEE;
    public int copydefault;
    public java.lang.Boolean djBIcL;
    public int ejfBZ;
    public float fARcdN;
    public java.lang.Runnable fJNWhG;
    public float gEmmrt;
    public int gHZMYf;
    public int getFieldNames;
    public float getNewProxyInstance;
    public RecyclerView hDKMBd;
    public RectF isConnected;
    public float sSMYrx;
    public int uzCIH;
    public int valueOf;
    public float values;
    public int wlaJM;
    public int zLjUOn;
    public float zuBGHE;
    public int AYXKKw = -1;
    public boolean fIwbmz = false;
    public android.widget.SectionIndexer fetchVPNInfo = null;
    public java.lang.String[] iwGUEr = null;
    public boolean zsXlph = true;
    public android.graphics.Typeface ORxRYg = null;
    public java.lang.Boolean AubY = java.lang.Boolean.TRUE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(float f) {
        this.DbNXlk = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@androidx.annotation.ColorInt int i) {
        this.AhwBna = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(boolean z) {
        this.zsXlph = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AYXKKw(@androidx.annotation.ColorInt int i) {
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AhwBna(int i) {
        this.AxsJAY = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(float f) {
        this.values = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@androidx.annotation.ColorInt int i) {
        this.OLrzqt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(android.graphics.Typeface typeface) {
        this.ORxRYg = typeface;
    }

    public final int KWHzl(float f) {
        return (int) (f * 255.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@androidx.annotation.ColorInt int i) {
        this.EZpvd = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(int i) {
        this.valueOf = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(int i) {
        this.zLjUOn = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void djBIcL(@androidx.annotation.ColorInt int i) {
        this.wlaJM = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void gEmmrt(float f) {
        this.AkhnZx = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void gEmmrt(@androidx.annotation.ColorInt int i) {
        this.getFieldNames = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void isConnected(int i) {
        this.QOLQEE = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void valueOf(int i) {
        this.gHZMYf = i;
    }

    public oIQ(android.content.Context context, oIS ois) {
        this.hDKMBd = null;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.DTwDnp = bool;
        this.AuCTelauCTel = bool;
        this.valueOf = 0;
        this.copydefault = -1;
        this.fJNWhG = null;
        this.djBIcL = java.lang.Boolean.valueOf(context.getResources().getConfiguration().getLayoutDirection() == 1);
        this.gHZMYf = ois.fJNWhG;
        this.sSMYrx = ois.values;
        this.zuBGHE = ois.gEmmrt;
        this.AwvSrB = ois.valueOf;
        this.AxsJAY = ois.fetchVPNInfo;
        this.QOLQEE = ois.AkhnZx;
        this.getFieldNames = ois.isConnected;
        this.wlaJM = ois.DbNXlk;
        this.uzCIH = KWHzl(ois.ejfBZ);
        this.AhwBna = ois.fIwbmz;
        this.valueOf = ois.AEQbTJ;
        this.zLjUOn = ois.EZpvd;
        this.OLrzqt = ois.AYXKKw;
        this.EZpvd = ois.AhwBna;
        this.AEQbTJ = ois.copydefault;
        this.KWHzl = KWHzl(ois.djBIcL);
        this.gEmmrt = context.getResources().getDisplayMetrics().density;
        this.getNewProxyInstance = context.getResources().getDisplayMetrics().scaledDensity;
        this.hDKMBd = ois;
        EZpvd(ois.getAdapter());
        float f = this.sSMYrx;
        float f2 = this.gEmmrt;
        this.AkhnZx = f * f2;
        this.values = this.zuBGHE * f2;
        this.DbNXlk = this.AwvSrB * f2;
        this.fARcdN = this.AxsJAY * f2;
    }

    public void AEQbTJ(android.graphics.Canvas canvas) {
        int i;
        if (this.AubY.booleanValue()) {
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setColor(this.OLrzqt);
            paint.setAlpha(this.KWHzl);
            paint.setAntiAlias(true);
            RectF rectF = this.isConnected;
            float f = this.zLjUOn * this.gEmmrt;
            canvas.drawRoundRect(rectF, f, f, paint);
            if (this.AuCTelauCTel.booleanValue()) {
                paint.setStyle(Paint.Style.STROKE);
                paint.setColor(this.AhwBna);
                paint.setStrokeWidth(this.valueOf);
                RectF rectF2 = this.isConnected;
                float f2 = this.zLjUOn * this.gEmmrt;
                canvas.drawRoundRect(rectF2, f2, f2, paint);
            }
            java.lang.String[] strArr = this.iwGUEr;
            if (strArr == null || strArr.length <= 0) {
                return;
            }
            if (this.zsXlph && (i = this.AYXKKw) >= 0 && strArr[i] != "") {
                android.graphics.Paint paint2 = new android.graphics.Paint();
                paint2.setColor(this.getFieldNames);
                paint2.setAlpha(this.uzCIH);
                paint2.setAntiAlias(true);
                paint2.setShadowLayer(3.0f, 0.0f, 0.0f, Color.argb(64, 0, 0, 0));
                android.graphics.Paint paint3 = new android.graphics.Paint();
                paint3.setColor(this.wlaJM);
                paint3.setAntiAlias(true);
                paint3.setTextSize(this.QOLQEE * this.getNewProxyInstance);
                paint3.setTypeface(this.ORxRYg);
                float fMeasureText = paint3.measureText(this.iwGUEr[this.AYXKKw]);
                float fMax = java.lang.Math.max(((this.fARcdN * 2.0f) + paint3.descent()) - paint3.ascent(), (this.fARcdN * 2.0f) + fMeasureText);
                float f3 = (this.ejfBZ - fMax) / 2.0f;
                float f4 = (this.AuCTel - fMax) / 2.0f;
                RectF rectF3 = new RectF(f3, f4, f3 + fMax, f4 + fMax);
                float f5 = this.gEmmrt * 5.0f;
                canvas.drawRoundRect(rectF3, f5, f5, paint2);
                canvas.drawText(this.iwGUEr[this.AYXKKw], (rectF3.left + ((fMax - fMeasureText) / 2.0f)) - 1.0f, (rectF3.top + ((fMax - (paint3.descent() - paint3.ascent())) / 2.0f)) - paint3.ascent(), paint3);
                copydefault(300L);
            }
            android.graphics.Paint paint4 = new android.graphics.Paint();
            paint4.setColor(this.EZpvd);
            paint4.setAntiAlias(true);
            paint4.setTextSize(this.gHZMYf * this.getNewProxyInstance);
            paint4.setTypeface(this.ORxRYg);
            float fHeight = (this.isConnected.height() - (this.DbNXlk * 2.0f)) / 27.0f;
            float fDescent = (fHeight - (paint4.descent() - paint4.ascent())) / 2.0f;
            float fHeight2 = (this.isConnected.height() - (this.iwGUEr.length * fHeight)) / 2.0f;
            for (int i2 = 0; i2 < this.iwGUEr.length; i2++) {
                if (this.DTwDnp.booleanValue()) {
                    int i3 = this.AYXKKw;
                    if (i3 > -1 && i2 == i3) {
                        paint4.setTypeface(android.graphics.Typeface.create(this.ORxRYg, 1));
                        paint4.setTextSize((this.gHZMYf + 3) * this.getNewProxyInstance);
                        paint4.setColor(this.AEQbTJ);
                    } else {
                        paint4.setTypeface(this.ORxRYg);
                        paint4.setTextSize(this.gHZMYf * this.getNewProxyInstance);
                        paint4.setColor(this.EZpvd);
                    }
                    canvas.drawText(this.iwGUEr[i2], this.isConnected.left + ((this.AkhnZx - paint4.measureText(this.iwGUEr[i2])) / 2.0f), (((i2 * fHeight) + fHeight2) + fDescent) - paint4.ascent(), paint4);
                } else {
                    canvas.drawText(this.iwGUEr[i2], this.isConnected.left + ((this.AkhnZx - paint4.measureText(this.iwGUEr[i2])) / 2.0f), (((i2 * fHeight) + fHeight2) + fDescent) - paint4.ascent(), paint4);
                }
            }
        }
    }

    public boolean OLrzqt(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2 && this.fIwbmz) {
                    if (copydefault(motionEvent.getX(), motionEvent.getY())) {
                        this.AYXKKw = OLrzqt(motionEvent.getY());
                        OLrzqt();
                    }
                    return true;
                }
            } else if (this.fIwbmz) {
                this.fIwbmz = false;
                this.AYXKKw = -1;
            }
        } else if (copydefault(motionEvent.getX(), motionEvent.getY())) {
            this.fIwbmz = true;
            this.AYXKKw = OLrzqt(motionEvent.getY());
            OLrzqt();
            return true;
        }
        return false;
    }

    public final void OLrzqt() {
        try {
            int positionForSection = this.fetchVPNInfo.getPositionForSection(this.AYXKKw);
            RecyclerView.LayoutManager layoutManager = this.hDKMBd.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(positionForSection, 0);
            } else {
                layoutManager.scrollToPosition(positionForSection);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public void copydefault(int i, int i2, int i3, int i4) {
        this.ejfBZ = i;
        this.AuCTel = i2;
        if (this.djBIcL.booleanValue()) {
            float f = this.values;
            float f2 = this.DbNXlk;
            this.isConnected = new RectF(f, f2, this.AkhnZx + f, i2 - f2);
        } else {
            float f3 = this.values;
            float f4 = this.AkhnZx;
            float f5 = this.DbNXlk;
            float f6 = i - f3;
            this.isConnected = new RectF(f6 - f4, f5, f6, i2 - f5);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.recyclerview.widget.RecyclerView$Adapter */
    /* JADX WARN: Multi-variable type inference failed */
    public void EZpvd(RecyclerView.Adapter adapter) {
        if (adapter instanceof android.widget.SectionIndexer) {
            adapter.registerAdapterDataObserver(this);
            android.widget.SectionIndexer sectionIndexer = (android.widget.SectionIndexer) adapter;
            this.fetchVPNInfo = sectionIndexer;
            this.iwGUEr = (java.lang.String[]) sectionIndexer.getSections();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onChanged() {
        super.onChanged();
        KWHzl();
    }

    public void KWHzl() {
        this.iwGUEr = (java.lang.String[]) this.fetchVPNInfo.getSections();
    }

    public boolean copydefault(float f, float f2) {
        float fHeight = ((this.isConnected.height() - (this.DbNXlk * 2.0f)) / 27.0f) * this.iwGUEr.length;
        float fHeight2 = (this.isConnected.height() - fHeight) / 2.0f;
        return this.djBIcL.booleanValue() ? f <= this.isConnected.right && f2 >= fHeight2 && f2 <= fHeight2 + fHeight : f >= this.isConnected.left && f2 >= fHeight2 && f2 <= fHeight2 + fHeight;
    }

    public final int OLrzqt(float f) {
        float fHeight = (this.isConnected.height() - (this.DbNXlk * 2.0f)) / 27.0f;
        float length = this.iwGUEr.length * fHeight;
        float fHeight2 = (this.isConnected.height() - length) / 2.0f;
        java.lang.String[] strArr = this.iwGUEr;
        if (strArr == null || strArr.length == 0 || f < fHeight2) {
            return 0;
        }
        return f >= length + fHeight2 ? strArr.length - 1 : (int) ((f - fHeight2) / fHeight);
    }

    public final void copydefault(long j) {
        RecyclerView recyclerView = this.hDKMBd;
        if (recyclerView != null) {
            java.lang.Runnable runnable = this.fJNWhG;
            if (runnable != null) {
                recyclerView.removeCallbacks(runnable);
            }
            java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: o.oIQ.5
                @Override // java.lang.Runnable
                public void run() {
                    oIQ.this.hDKMBd.invalidate();
                }
            };
            this.fJNWhG = runnable2;
            this.hDKMBd.postDelayed(runnable2, j);
        }
    }

    public void copydefault(float f) {
        this.KWHzl = KWHzl(f);
    }

    public void EZpvd(boolean z) {
        this.AubY = java.lang.Boolean.valueOf(z);
    }

    public void OLrzqt(boolean z) {
        this.AuCTelauCTel = java.lang.Boolean.valueOf(z);
    }

    public void valueOf(float f) {
        this.uzCIH = KWHzl(f);
    }

    public void copydefault(boolean z) {
        this.DTwDnp = java.lang.Boolean.valueOf(z);
    }
}
