package o;

import android.graphics.Paint;
import android.graphics.RectF;
import com.okinc.kline.library.data.DataSource;
import com.okinc.kline.library.layout.ChartArea;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oWi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36291oWi extends AbstractC36302oWt {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final RectF AEQbTJ;
    public final float AYXKKw;
    public final int AhwBna;
    public final float AkhnZx;
    public final float AuCTel;
    public final float DbNXlk;
    public final int EZpvd;
    public final android.graphics.Paint OLrzqt;
    public final float djBIcL;
    public final float ejfBZ;
    public final LinkedHashMap<java.lang.Integer, RectF> fARcdN;
    public final float fIwbmz;
    public final float fJNWhG;
    public final android.graphics.drawable.Drawable fetchVPNInfo;
    public final float gEmmrt;
    public final C36246oUr getFieldNames;
    public final android.graphics.Paint getNewProxyInstance;
    public final android.graphics.Paint hDKMBd;
    public final float isConnected;
    public final float iwGUEr;
    public final android.graphics.Paint valueOf;
    public final float values;

    @Override // o.AbstractC36302oWt
    public void KWHzl() {
    }

    public C36291oWi(java.lang.String str) {
        super(str);
        float fDp$default = C55298xhM.dp$default(1, (android.content.Context) null, 1, (java.lang.Object) null);
        this.gEmmrt = fDp$default;
        float fDp$default2 = C55298xhM.dp$default(3, (android.content.Context) null, 1, (java.lang.Object) null);
        this.isConnected = fDp$default2;
        float fDp$default3 = C55298xhM.dp$default(4, (android.content.Context) null, 1, (java.lang.Object) null);
        this.DbNXlk = fDp$default3;
        float fDp$default4 = C55298xhM.dp$default(14, (android.content.Context) null, 1, (java.lang.Object) null);
        this.djBIcL = fDp$default4;
        float fDp$default5 = C55298xhM.dp$default(16, (android.content.Context) null, 1, (java.lang.Object) null);
        this.values = fDp$default5;
        this.AkhnZx = C55298xhM.dp$default(22, (android.content.Context) null, 1, (java.lang.Object) null);
        this.fIwbmz = fDp$default5;
        this.AuCTel = fDp$default5;
        this.ejfBZ = fDp$default3;
        this.iwGUEr = fDp$default3;
        this.fJNWhG = fDp$default2;
        this.AYXKKw = fDp$default4;
        this.fetchVPNInfo = C33070mpX.KWHzl(C52761wXj.TaskDescription.ihnvzI);
        this.AhwBna = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        this.EZpvd = C33070mpX.copydefault(C52761wXj.Activity.EZpvd);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(C33070mpX.copydefault(C52761wXj.Activity.invokespecialODCBUN));
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(fDp$default);
        this.valueOf = paint;
        this.AEQbTJ = new RectF();
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setAntiAlias(true);
        this.OLrzqt = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setTextSize(C55298xhM.sp2pxFloat$default(12.0f, null, 1, null));
        paint3.setTypeface(C55051xce.OLrzqt.OLrzqt());
        paint3.setAntiAlias(true);
        this.hDKMBd = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint();
        paint4.setStyle(Paint.Style.FILL);
        paint4.setStrokeWidth(fDp$default);
        paint4.setPathEffect(this.getPriority);
        paint4.setAntiAlias(true);
        this.getNewProxyInstance = paint4;
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        this.getFieldNames = c36246oUrCopydefault;
        this.fARcdN = c36246oUrCopydefault.iwGUEr().fIwbmz();
    }

    /* JADX INFO: renamed from: o.oWi$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oWi.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.AbstractC36302oWt
    public void OLrzqt(@NotNull oWK owk) {
        Intrinsics.checkNotNullParameter(owk, "");
        this.getNewProxyInstance.setColor(owk.AkhnZx());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    @Override // o.AbstractC36302oWt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void AEQbTJ(@NotNull android.graphics.Canvas canvas) {
        ChartArea chartArea;
        com.okinc.kline.library.data.DataSource dataSource;
        float f;
        Intrinsics.checkNotNullParameter(canvas, "");
        this.fARcdN.clear();
        java.util.List<oLS> listDNCPSb = this.getFieldNames.dNCPSb();
        if (listDNCPSb == null || (chartArea = this.getFieldNames.values().get(EZpvd())) == null || (dataSource = this.getFieldNames.sSMYrx().get("ds0")) == null || dataSource.AEQbTJ.size() < 2) {
            return;
        }
        float fKWHzl = chartArea.KWHzl();
        float f2 = this.AkhnZx;
        DataSource.DataArrayList<DataSource.StateListAnimator> dataArrayList = dataSource.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(dataArrayList, "");
        long jAhwBna = ((DataSource.StateListAnimator) CollectionsKt___CollectionsKt.AubY(dataArrayList)).AhwBna();
        int i = 0;
        for (oLS ols : listDNCPSb) {
            if ((this.getFieldNames.DcqEDu() || ols.KWHzl() >= jAhwBna) && (this.getFieldNames.DNMMPQ() || ols.KWHzl() <= jAhwBna)) {
                float fCopydefault = ols.copydefault();
                if (fCopydefault < chartArea.AYXKKw() || fCopydefault > chartArea.DbNXlk()) {
                    f = f2;
                } else {
                    if (ols.EZpvd()) {
                        canvas.drawLine(fCopydefault, chartArea.AuCTel(), fCopydefault, chartArea.KWHzl(), this.getNewProxyInstance);
                    }
                    android.graphics.drawable.Drawable drawable = this.fetchVPNInfo;
                    Intrinsics.copydefault(ols);
                    f = f2;
                    RectF rectFOLrzqt = OLrzqt(canvas, drawable, fCopydefault, fKWHzl - f2, ols);
                    if (rectFOLrzqt != null) {
                        this.fARcdN.put(java.lang.Integer.valueOf(i), rectFOLrzqt);
                    }
                }
            }
            i++;
            f2 = f;
        }
    }

    public final RectF OLrzqt(android.graphics.Canvas canvas, android.graphics.drawable.Drawable drawable, float f, float f2, oLS ols) {
        float f3;
        if (drawable == null) {
            return null;
        }
        java.lang.String strValueOf = java.lang.String.valueOf(ols.AEQbTJ());
        float fMeasureText = this.hDKMBd.measureText(strValueOf);
        if (ols.AEQbTJ() == 1) {
            fMeasureText = this.ejfBZ * 2;
            f3 = this.fIwbmz;
        } else {
            f3 = (this.ejfBZ * 2) + this.fIwbmz + this.fJNWhG;
        }
        float f4 = fMeasureText + f3;
        float f5 = this.iwGUEr;
        float f6 = 2;
        float fMax = java.lang.Math.max(this.AuCTel, this.hDKMBd.getTextSize());
        RectF rectF = this.AEQbTJ;
        float f7 = f4 / f6;
        rectF.left = f - f7;
        float f8 = ((f5 * f6) + fMax) / f6;
        rectF.top = f2 - f8;
        rectF.right = f + f7;
        rectF.bottom = f8 + f2;
        RectF rectF2 = new RectF();
        RectF rectF3 = this.AEQbTJ;
        rectF2.left = rectF3.left - 0.5f;
        rectF2.top = rectF3.top - 0.5f;
        rectF2.right = rectF3.right + 0.5f;
        rectF2.bottom = rectF3.bottom + 0.5f;
        this.OLrzqt.setColor(ols.EZpvd() ? this.AhwBna : this.EZpvd);
        float f9 = this.AYXKKw;
        canvas.drawRoundRect(rectF2, f9, f9, this.valueOf);
        RectF rectF4 = this.AEQbTJ;
        float f10 = this.AYXKKw;
        canvas.drawRoundRect(rectF4, f10, f10, this.OLrzqt);
        RectF rectF5 = this.AEQbTJ;
        float f11 = rectF5.left + this.ejfBZ;
        float f12 = rectF5.top;
        float fHeight = rectF5.height();
        float f13 = this.AuCTel;
        float f14 = f12 + ((fHeight - f13) / f6);
        float f15 = this.fIwbmz + f11;
        drawable.setTint(ols.EZpvd() ? this.EZpvd : this.AhwBna);
        drawable.setBounds((int) f11, (int) f14, (int) f15, (int) (f13 + f14));
        drawable.draw(canvas);
        if (ols.AEQbTJ() > 1) {
            this.hDKMBd.setColor(ols.EZpvd() ? this.EZpvd : this.AhwBna);
            canvas.drawText(strValueOf, f15 + this.fJNWhG, f2 - ((this.hDKMBd.descent() + this.hDKMBd.ascent()) / f6), this.hDKMBd);
        }
        return rectF2;
    }
}
