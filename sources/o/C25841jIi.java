package o;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import com.github.mikephil.charting.data.Entry;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jIi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25841jIi extends android.view.View {
    public RectF AEQbTJ;
    public float AYXKKw;
    public final android.graphics.Paint AhwBna;
    public final android.graphics.Paint AkhnZx;
    public java.lang.String AuCTel;
    public final Application DbNXlk;
    public android.graphics.Rect EZpvd;
    public final android.graphics.Paint KWHzl;
    public final Activity OLrzqt;
    public Entry copydefault;
    public float djBIcL;
    public final android.graphics.Paint fIwbmz;
    public kotlin.Pair<java.lang.Integer, java.lang.Integer> fetchVPNInfo;
    public boolean gEmmrt;
    public int isConnected;
    public final android.graphics.Paint valueOf;
    public java.lang.String values;

    /* JADX INFO: renamed from: o.jIi$Activity */
    public interface Activity {
        RectF KWHzl();
    }

    /* JADX INFO: renamed from: o.jIi$Application */
    /* JADX INFO: loaded from: classes23.dex */
    public interface Application {
        java.lang.String AEQbTJ(float f);
    }

    private final int AEQbTJ() {
        return 180;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt() {
        this.AEQbTJ = null;
        this.EZpvd = null;
        this.values = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25841jIi(@NotNull android.content.Context context, @NotNull Activity activity, @NotNull Application application, int i) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(application, "");
        this.OLrzqt = activity;
        this.DbNXlk = application;
        this.isConnected = -1;
        this.AuCTel = "";
        this.fetchVPNInfo = new kotlin.Pair<>(0, 0);
        this.values = "";
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(C33070mpX.copydefault(C52761wXj.Activity.zuBGHE));
        paint.setStrokeWidth(C55298xhM.dp2pxFloat$default(1.0f, null, 1, null));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        paint.setPathEffect(new DashPathEffect(new float[]{C55298xhM.dp2pxFloat$default(2.0f, null, 1, null), C55298xhM.dp2pxFloat$default(2.0f, null, 1, null)}, 0.0f));
        this.KWHzl = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        Paint.Style style2 = Paint.Style.FILL;
        paint2.setStyle(style2);
        paint2.setAntiAlias(true);
        this.valueOf = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setColor(C33070mpX.copydefault(C52761wXj.Activity.htlTjW));
        paint3.setStyle(style);
        paint3.setStrokeWidth(C55298xhM.dp2pxFloat$default(2.0f, null, 1, null));
        paint3.setAntiAlias(true);
        this.AhwBna = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint();
        paint4.setColor(C33070mpX.copydefault(C52761wXj.Activity.htlTjW));
        paint4.setAlpha(AEQbTJ());
        paint4.setStyle(style2);
        this.AkhnZx = paint4;
        android.graphics.Paint paint5 = new android.graphics.Paint();
        paint5.setColor(i);
        paint5.setTextSize(C55298xhM.dp2pxFloat$default(10.0f, null, 1, null));
        paint5.setStyle(style2);
        paint5.setAntiAlias(true);
        paint5.setTextAlign(Paint.Align.CENTER);
        this.fIwbmz = paint5;
    }

    public static /* synthetic */ void setHighlightInfo$default(C25841jIi c25841jIi, float f, float f2, int i, boolean z, Entry entry, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            entry = null;
        }
        c25841jIi.setHighlightInfo(f, f2, i, z2, entry);
    }

    public final void setHighlightInfo(float f, float f2, int i, boolean z, Entry entry) {
        java.lang.String strAEQbTJ;
        this.djBIcL = f;
        this.AYXKKw = f2;
        this.isConnected = i;
        this.gEmmrt = z;
        this.copydefault = entry;
        this.valueOf.setColor(i);
        if (entry == null || (strAEQbTJ = this.DbNXlk.AEQbTJ(entry.getX())) == null) {
            strAEQbTJ = "";
        }
        this.AuCTel = strAEQbTJ;
    }

    private final RectF KWHzl() {
        kotlin.Pair<java.lang.Integer, java.lang.Integer> pair = new kotlin.Pair<>(java.lang.Integer.valueOf(getWidth()), java.lang.Integer.valueOf(getHeight()));
        RectF rectF = this.AEQbTJ;
        if (rectF != null && Intrinsics.EZpvd(this.fetchVPNInfo, pair)) {
            return rectF;
        }
        this.fetchVPNInfo = pair;
        RectF rectFKWHzl = this.OLrzqt.KWHzl();
        this.AEQbTJ = rectFKWHzl;
        return rectFKWHzl == null ? new RectF(0.0f, 0.0f, getWidth(), getHeight()) : rectFKWHzl;
    }

    private final android.graphics.Rect EZpvd() {
        if (this.EZpvd != null && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) this.AuCTel)) {
            android.graphics.Rect rect = this.EZpvd;
            Intrinsics.copydefault(rect);
            return rect;
        }
        this.values = this.AuCTel;
        if (this.EZpvd == null) {
            this.EZpvd = new android.graphics.Rect();
        }
        android.graphics.Paint paint = this.fIwbmz;
        java.lang.String str = this.AuCTel;
        int length = str.length();
        android.graphics.Rect rect2 = this.EZpvd;
        Intrinsics.copydefault(rect2);
        paint.getTextBounds(str, 0, length, rect2);
        android.graphics.Rect rect3 = this.EZpvd;
        Intrinsics.copydefault(rect3);
        return rect3;
    }

    public final void OLrzqt(int i) {
        this.fIwbmz.setColor(i);
        this.EZpvd = null;
        this.values = "";
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        if (this.djBIcL > 0.0f) {
            RectF rectFKWHzl = KWHzl();
            float f = this.djBIcL;
            float f2 = rectFKWHzl.right;
            if (f < f2) {
                canvas.drawRect(f, rectFKWHzl.top, f2, rectFKWHzl.bottom, this.AkhnZx);
            }
            float f3 = this.djBIcL;
            canvas.drawLine(f3, rectFKWHzl.top, f3, rectFKWHzl.bottom, this.KWHzl);
            if (this.AYXKKw > 0.0f) {
                float fDp2pxFloat$default = C55298xhM.dp2pxFloat$default(3.0f, null, 1, null);
                canvas.drawCircle(this.djBIcL, this.AYXKKw, C55298xhM.dp2pxFloat$default(1.0f, null, 1, null) + fDp2pxFloat$default, this.AhwBna);
                canvas.drawCircle(this.djBIcL, this.AYXKKw, fDp2pxFloat$default, this.valueOf);
            }
            if (this.AuCTel.length() > 0) {
                AEQbTJ(canvas, rectFKWHzl);
            }
        }
    }

    public final void AEQbTJ(android.graphics.Canvas canvas, RectF rectF) {
        android.graphics.Rect rectEZpvd = EZpvd();
        float fDp2pxFloat$default = C55298xhM.dp2pxFloat$default(8.0f, null, 1, null);
        float fDp2pxFloat$default2 = C55298xhM.dp2pxFloat$default(4.0f, null, 1, null);
        float fWidth = rectEZpvd.width();
        float f = 2;
        float fHeight = rectEZpvd.height();
        float fDp2pxFloat$default3 = C55298xhM.dp2pxFloat$default(8.0f, null, 1, null);
        float f2 = rectF.top;
        float f3 = this.djBIcL;
        float f4 = (fWidth + (fDp2pxFloat$default * f)) / f;
        float f5 = f3 - f4;
        float f6 = f3 + f4;
        float f7 = rectF.left;
        if (f5 < f7) {
            float f8 = f7 - f5;
            f5 += f8;
            f6 += f8;
        }
        float f9 = rectF.right;
        if (f6 > f9) {
            f5 -= f6 - f9;
        }
        canvas.drawText(this.AuCTel, f5 + f4, ((f2 - fDp2pxFloat$default3) - (fHeight + (f * fDp2pxFloat$default2))) + fDp2pxFloat$default2 + rectEZpvd.height(), this.fIwbmz);
    }
}
