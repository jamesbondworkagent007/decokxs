package o;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.exifinterface.media.ExifInterface;
import com.okinc.kline.library.layout.ChartArea;
import o.C32392mcI;

/* JADX INFO: renamed from: o.oWa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36283oWa extends C36284oWb {
    public int AEQbTJ;
    public final int AYXKKw;
    public final RectF AhwBna;
    public final int AkhnZx;
    public final int AuCTel;
    public final android.graphics.drawable.Drawable AubY;
    public final int DbNXlk;
    public int EZpvd;
    public final RectF djBIcL;
    public boolean ejfBZ;
    public java.lang.String fARcdN;
    public boolean fIwbmz;
    public final android.graphics.drawable.Drawable fJNWhG;
    public final int fetchVPNInfo;
    public final RectF gEmmrt;
    public final android.graphics.Paint getFieldNames;
    public android.graphics.drawable.Drawable getNewProxyInstance;
    public final android.graphics.drawable.Drawable hDKMBd;
    public final int isConnected;
    public java.lang.String iwGUEr;
    public int uzCIH;
    public final int valueOf;
    public final int values;
    public int zLjUOn;
    public final float zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AYXKKw() {
        return this.ejfBZ ? this.zLjUOn : this.uzCIH;
    }

    public C36283oWa(java.lang.String str) {
        super(str);
        this.fARcdN = "";
        this.fIwbmz = false;
        this.AhwBna = new RectF();
        this.gEmmrt = new RectF();
        this.djBIcL = new RectF();
        this.AubY = C33070mpX.KWHzl(C32392mcI.Activity.fIwbmz);
        this.hDKMBd = C33070mpX.KWHzl(C32392mcI.Activity.getNewProxyInstance);
        this.fJNWhG = C33070mpX.KWHzl(C32392mcI.Activity.getFieldNames);
        this.zsXlph = AbstractC36302oWt.KWHzl(10.0f);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.getFieldNames = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.valueOf = AbstractC36302oWt.copydefault(2.0f);
        this.AYXKKw = AbstractC36302oWt.copydefault(16.0f);
        this.DbNXlk = AbstractC36302oWt.copydefault(25.0f);
        this.values = AbstractC36302oWt.copydefault(32.0f);
        this.fetchVPNInfo = AbstractC36302oWt.copydefault(52.0f);
        this.AkhnZx = AbstractC36302oWt.copydefault(56.0f);
        this.isConnected = AbstractC36302oWt.copydefault(64.0f);
        this.AuCTel = AbstractC36302oWt.copydefault(12.0f);
        AhwBna();
        this.iwGUEr = C36246oUr.copydefault().AubY().getResources().getString(C32392mcI.Dialog.uzCIH);
    }

    @Override // o.C36284oWb, o.AbstractC36302oWt
    public void AEQbTJ(android.graphics.Canvas canvas) {
        if (this.zhUgOk) {
            return;
        }
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        ChartArea chartArea = c36246oUrCopydefault.values().get(EZpvd());
        if (chartArea == null) {
            return;
        }
        this.KWHzl.set(chartArea.AYXKKw(), chartArea.AuCTel(), chartArea.DbNXlk(), chartArea.KWHzl());
        canvas.drawRect(this.KWHzl, this.OLrzqt);
        copydefault(c36246oUrCopydefault.DarRvM());
        android.graphics.drawable.Drawable drawableGEmmrt = gEmmrt();
        if (EZpvd().endsWith(com.ibm.icu.text.DateFormat.MINUTE) && C34704nhP.copydefault.copydefault()) {
            this.AhwBna.set(chartArea.DbNXlk() - this.AkhnZx, chartArea.AuCTel(), chartArea.DbNXlk(), chartArea.KWHzl());
            this.gEmmrt.set(chartArea.DbNXlk() - this.AkhnZx, chartArea.KWHzl() - this.DbNXlk, chartArea.DbNXlk(), chartArea.KWHzl());
            this.djBIcL.set(chartArea.AYXKKw(), chartArea.AuCTel(), chartArea.DbNXlk() - this.AkhnZx, chartArea.KWHzl());
            c36246oUrCopydefault.iwGUEr().EZpvd(this.AhwBna);
            c36246oUrCopydefault.iwGUEr().AYXKKw(this.gEmmrt);
            c36246oUrCopydefault.iwGUEr().copydefault(this.djBIcL);
            boolean zDmq = c36246oUrCopydefault.Dmq();
            int iAYXKKw = chartArea.AYXKKw() + (zDmq ? this.fetchVPNInfo : this.AYXKKw);
            drawableGEmmrt.setBounds(iAYXKKw, (chartArea.KWHzl() - drawableGEmmrt.getIntrinsicHeight()) - this.AuCTel, drawableGEmmrt.getIntrinsicWidth() + iAYXKKw, chartArea.KWHzl() - this.AuCTel);
            drawableGEmmrt.draw(canvas);
            if (c36246oUrCopydefault.OTwTPd()) {
                OLrzqt(canvas, chartArea, drawableGEmmrt, zDmq);
            }
        }
    }

    public final void OLrzqt(android.graphics.Canvas canvas, ChartArea chartArea, android.graphics.drawable.Drawable drawable, boolean z) {
        valueOf();
        this.getFieldNames.setTextSize(this.zsXlph);
        float fAYXKKw = chartArea.AYXKKw() + drawable.getIntrinsicWidth() + this.AkhnZx;
        float fKWHzl = (chartArea.KWHzl() - drawable.getIntrinsicHeight()) - this.AuCTel;
        float fAYXKKw2 = chartArea.AYXKKw() + drawable.getIntrinsicWidth() + this.isConnected + this.getFieldNames.measureText(this.iwGUEr);
        float fKWHzl2 = chartArea.KWHzl() - this.AuCTel;
        if (!z) {
            float f = this.values;
            fAYXKKw -= f;
            fAYXKKw2 -= f;
        }
        float f2 = this.valueOf;
        canvas.drawRoundRect(fAYXKKw, fKWHzl, fAYXKKw2, fKWHzl2, f2, f2, this.getFieldNames);
        float fMeasureText = ((fAYXKKw2 - fAYXKKw) - this.getFieldNames.measureText(this.iwGUEr)) / 2.0f;
        float fMeasureText2 = ((fKWHzl2 - fKWHzl) - this.getFieldNames.measureText(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS)) / 2.0f;
        this.getFieldNames.setColor(AYXKKw());
        canvas.drawText(this.iwGUEr, fAYXKKw + fMeasureText, fKWHzl2 - fMeasureText2, this.getFieldNames);
    }

    public final void AhwBna() {
        this.AEQbTJ = Color.parseColor("#F2F2F2");
        this.zLjUOn = Color.parseColor("#9AA1B1");
        this.EZpvd = Color.parseColor("#242424");
        this.uzCIH = Color.parseColor("#6C6C6C");
    }

    public final void copydefault(java.lang.String str) {
        if (this.fARcdN.equals(str)) {
            return;
        }
        this.ejfBZ = "light".equalsIgnoreCase(str);
        this.fARcdN = str;
    }

    public final void valueOf() {
        if (this.ejfBZ) {
            this.getFieldNames.setColor(this.AEQbTJ);
        } else {
            this.getFieldNames.setColor(this.EZpvd);
        }
    }

    public final android.graphics.drawable.Drawable gEmmrt() {
        if (!this.fIwbmz) {
            C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
            if (C34703nhO.AEQbTJ()) {
                this.getNewProxyInstance = this.hDKMBd;
            } else {
                this.getNewProxyInstance = ("defi_mode_dex".equals(c36246oUrCopydefault.fZBcTu()) || "defi_mode_wallet".equals(c36246oUrCopydefault.fZBcTu())) ? this.fJNWhG : this.AubY;
            }
            this.fIwbmz = true;
        }
        return this.getNewProxyInstance;
    }
}
