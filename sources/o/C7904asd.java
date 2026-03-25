package o;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;

/* JADX INFO: renamed from: o.asd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7904asd {
    public static final android.graphics.Paint AEQbTJ;
    public static final android.graphics.Paint KWHzl;
    public static final android.graphics.Rect copydefault = new android.graphics.Rect();
    public final android.graphics.Path AYXKKw;
    public int AhwBna;
    public boolean AkhnZx;
    public boolean AuCTel;
    public int DbNXlk;
    public float EZpvd;
    public float OLrzqt;
    public boolean djBIcL;
    public final C7845arX ejfBZ;
    public final float[] fARcdN;
    public int fIwbmz;
    public boolean fJNWhG;
    public float fetchVPNInfo;
    public int gEmmrt;
    public float getNewProxyInstance;
    public float hDKMBd;
    public int isConnected;
    public final android.graphics.Path uzCIH;
    public final RectF valueOf;
    public boolean values;

    /* JADX INFO: renamed from: o.asd$ActionBar */
    public interface ActionBar {
    }

    /* JADX INFO: renamed from: o.asd$Application */
    public interface Application {
        void innerDraw(android.graphics.Canvas canvas);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(int i) {
        this.AhwBna = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(boolean z) {
        this.djBIcL = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(boolean z) {
        this.AuCTel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(int i) {
        this.gEmmrt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return (this.getNewProxyInstance == 0.0f && this.hDKMBd == 0.0f && this.OLrzqt == 0.0f && this.EZpvd == 0.0f) ? false : true;
    }

    static {
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        PorterDuffXfermode porterDuffXfermode2 = Build.VERSION.SDK_INT >= 28 ? porterDuffXfermode : new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        KWHzl = paint;
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint.setStyle(style);
        paint.setXfermode(porterDuffXfermode2);
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        AEQbTJ = paint2;
        paint2.setStyle(style);
        paint2.setXfermode(porterDuffXfermode);
    }

    public C7904asd() {
        this(null);
    }

    public C7904asd(android.view.View view) {
        this.fIwbmz = 0;
        this.getNewProxyInstance = 0.0f;
        this.hDKMBd = 0.0f;
        this.OLrzqt = 0.0f;
        this.EZpvd = 0.0f;
        this.fJNWhG = false;
        this.valueOf = new RectF();
        this.fARcdN = new float[8];
        this.AYXKKw = new android.graphics.Path();
        this.uzCIH = new android.graphics.Path();
        this.djBIcL = C7330ahm.AYXKKw;
        this.AuCTel = false;
        this.values = false;
        this.gEmmrt = 0;
        this.AhwBna = 0;
        this.ejfBZ = new C7845arX();
        this.AkhnZx = view instanceof android.widget.TextView;
    }

    public void KWHzl(float f) {
        EZpvd(f, f, f, f);
    }

    public void EZpvd(float f, float f2, float f3, float f4) {
        boolean z = true;
        this.values = true;
        if (this.getNewProxyInstance == f && this.hDKMBd == f2 && f3 == this.OLrzqt && f4 == this.EZpvd) {
            z = false;
        }
        this.fJNWhG = z;
        this.getNewProxyInstance = f;
        this.hDKMBd = f2;
        this.OLrzqt = f3;
        this.EZpvd = f4;
        AEQbTJ(this.isConnected, this.DbNXlk, this.fetchVPNInfo);
    }

    public void OLrzqt(InterfaceC7409ajL interfaceC7409ajL) {
        float[] radii = interfaceC7409ajL.getRadii();
        EZpvd(radii[0], radii[2], radii[6], radii[4]);
    }

    public void copydefault(int i) {
        this.ejfBZ.AEQbTJ(i);
        AEQbTJ(3);
    }

    public void OLrzqt(int i) {
        if (i != this.fIwbmz && this.values) {
            EZpvd(this.hDKMBd, this.getNewProxyInstance, this.EZpvd, this.OLrzqt);
        }
        this.fIwbmz = i;
    }

    public void AEQbTJ(int i, int i2, float f) {
        if (!this.fJNWhG && this.isConnected == i && this.DbNXlk == i2 && this.fetchVPNInfo == f) {
            return;
        }
        this.isConnected = i;
        this.DbNXlk = i2;
        this.fetchVPNInfo = f;
        if (i == 0 || i2 == 0) {
            this.AYXKKw.reset();
            this.uzCIH.reset();
            return;
        }
        float f2 = this.getNewProxyInstance;
        float f3 = this.hDKMBd;
        float f4 = this.OLrzqt;
        float f5 = this.EZpvd;
        if (this.AhwBna == 3) {
            this.ejfBZ.KWHzl(f2, f3, f4, f5);
            return;
        }
        this.AYXKKw.reset();
        this.uzCIH.reset();
        this.valueOf.set(0.0f, 0.0f, i, i2);
        float[] fArr = this.fARcdN;
        fArr[1] = f2;
        fArr[0] = f2;
        fArr[3] = f3;
        fArr[2] = f3;
        fArr[5] = f5;
        fArr[4] = f5;
        fArr[7] = f4;
        fArr[6] = f4;
        android.graphics.Path path = this.AYXKKw;
        RectF rectF = this.valueOf;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fArr, direction);
        if (Build.VERSION.SDK_INT >= 28) {
            this.AYXKKw.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        }
        this.uzCIH.addRoundRect(this.valueOf, this.fARcdN, direction);
    }

    public void AEQbTJ(@androidx.annotation.NonNull android.graphics.Canvas canvas, Application application, boolean z) {
        int i = this.AhwBna;
        if (i == 3) {
            application.innerDraw(canvas);
            this.ejfBZ.KWHzl(canvas);
            return;
        }
        int i2 = this.gEmmrt;
        boolean z2 = true;
        if (i2 == 0 ? !this.AuCTel || !this.values : i2 != 1) {
            if (i != 2) {
                z2 = false;
            }
        }
        int i3 = Build.VERSION.SDK_INT;
        if (this.djBIcL && !z2) {
            application.innerDraw(canvas);
            return;
        }
        if (z) {
            canvas.drawPath(this.uzCIH, AEQbTJ);
        }
        canvas.getClipBounds(copydefault);
        if (this.AkhnZx && i3 >= 28) {
            canvas.save();
            canvas.translate(r6.left, r6.top);
            canvas.clipPath(this.AYXKKw, Region.Op.DIFFERENCE);
            canvas.translate(-r6.left, -r6.top);
            application.innerDraw(canvas);
            canvas.restore();
            return;
        }
        this.valueOf.offset(r6.left, r6.top);
        int iSaveLayer = canvas.saveLayer(this.valueOf, null, 31);
        this.valueOf.offset(-r6.left, -r6.top);
        application.innerDraw(canvas);
        canvas.drawPath(this.AYXKKw, KWHzl);
        canvas.restoreToCount(iSaveLayer);
    }

    public static boolean copydefault(@androidx.annotation.NonNull android.view.ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof android.view.SurfaceView) || (childAt instanceof ActionBar)) {
                return true;
            }
        }
        if (childCount == 1 && z) {
            android.view.View childAt2 = viewGroup.getChildAt(0);
            if ((childAt2 instanceof android.view.ViewGroup) || (childAt2 instanceof ActionBar)) {
                return copydefault((android.view.ViewGroup) childAt2, false);
            }
        }
        return false;
    }

    public static boolean AEQbTJ(@androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        return copydefault(viewGroup, true);
    }
}
