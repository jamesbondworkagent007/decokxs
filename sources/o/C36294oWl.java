package o;

import android.graphics.Paint;
import android.text.Layout;
import com.okinc.kline.library.layout.ChartArea;
import o.C32392mcI;
import o.C52761wXj;

/* JADX INFO: renamed from: o.oWl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36294oWl extends AbstractC36302oWt {
    public int AEQbTJ;
    public int AYXKKw;
    public int AhwBna;
    public android.graphics.Paint AkhnZx;
    public int AuCTel;
    public boolean DbNXlk;
    public int EZpvd;
    public int KWHzl;
    public ChartArea OLrzqt;
    public java.lang.String djBIcL;
    public android.graphics.Paint ejfBZ;
    public int fARcdN;
    public int fIwbmz;
    public android.text.TextPaint fJNWhG;
    public final android.graphics.drawable.Drawable fetchVPNInfo;
    public int gEmmrt;
    public android.text.StaticLayout isConnected;
    public C36246oUr iwGUEr;
    public android.content.res.Resources uzCIH;
    public com.okinc.kline.library.data.DataSource valueOf;
    public int values;

    @Override // o.AbstractC36302oWt
    public void KWHzl() {
    }

    public C36294oWl(java.lang.String str) {
        super(str);
        this.uzCIH = null;
        this.AuCTel = -1;
        this.fIwbmz = -1;
        this.DbNXlk = false;
        this.uzCIH = C36246oUr.copydefault().AubY().getResources();
        this.fetchVPNInfo = C33070mpX.KWHzl(C52761wXj.TaskDescription.HJWChPRGtXKC);
        android.text.TextPaint textPaint = new android.text.TextPaint();
        this.fJNWhG = textPaint;
        textPaint.setAntiAlias(true);
        android.text.TextPaint textPaint2 = this.fJNWhG;
        Paint.Style style = Paint.Style.FILL;
        textPaint2.setStyle(style);
        this.fJNWhG.setTextSize(AbstractC36302oWt.KWHzl(16.0f));
        this.fJNWhG.setTypeface(C55051xce.OLrzqt.AEQbTJ("harmony_sans_regular.ttf"));
        android.graphics.Paint paint = new android.graphics.Paint();
        this.ejfBZ = paint;
        paint.setStyle(style);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.AkhnZx = paint2;
        paint2.setStyle(style);
        this.EZpvd = AbstractC36302oWt.copydefault(8.0f);
        this.AEQbTJ = AbstractC36302oWt.copydefault(16.0f);
        this.KWHzl = AbstractC36302oWt.copydefault(32.0f);
        this.gEmmrt = AbstractC36302oWt.copydefault(80.0f);
        int iCopydefault = AbstractC36302oWt.copydefault(80.0f);
        this.AhwBna = iCopydefault;
        this.AYXKKw = iCopydefault + this.EZpvd + this.AEQbTJ;
        this.iwGUEr = C36246oUr.copydefault();
    }

    @Override // o.AbstractC36302oWt
    public void OLrzqt(oWK owk) {
        this.fJNWhG.setColor(owk.EZpvd(11));
        this.djBIcL = this.uzCIH.getString(C32392mcI.Dialog.hlkKmr);
        this.AkhnZx.setColor(owk.OLrzqt());
    }

    @Override // o.AbstractC36302oWt
    public void AEQbTJ(android.graphics.Canvas canvas) {
        this.OLrzqt = this.iwGUEr.values().get(EZpvd());
        com.okinc.kline.library.data.DataSource dataSource = this.iwGUEr.sSMYrx().get(copydefault());
        this.valueOf = dataSource;
        if (this.OLrzqt != null) {
            if (dataSource == null || dataSource.gEmmrt() <= 0) {
                int iFIwbmz = this.OLrzqt.fIwbmz();
                int iDjBIcL = this.OLrzqt.djBIcL();
                canvas.drawRect(this.OLrzqt.AYXKKw(), this.OLrzqt.AuCTel(), this.OLrzqt.DbNXlk(), this.OLrzqt.KWHzl(), this.AkhnZx);
                if (this.fIwbmz != iDjBIcL || !this.DbNXlk) {
                    this.fARcdN = ((iDjBIcL - this.AEQbTJ) - this.AYXKKw) / 2;
                    this.fIwbmz = iDjBIcL;
                    this.DbNXlk = true;
                }
                int iDbNXlk = this.OLrzqt.DbNXlk();
                int i = this.gEmmrt;
                int i2 = (iDbNXlk - i) / 2;
                this.values = i2;
                android.graphics.drawable.Drawable drawable = this.fetchVPNInfo;
                int i3 = this.fARcdN;
                drawable.setBounds(i2, i3, i + i2, this.AhwBna + i3);
                this.fetchVPNInfo.draw(canvas);
                if (this.isConnected == null || this.AuCTel != iFIwbmz) {
                    this.isConnected = new android.text.StaticLayout(this.djBIcL, this.fJNWhG, iFIwbmz - this.KWHzl, Layout.Alignment.ALIGN_CENTER, 1.2f, 0.0f, true);
                    this.AuCTel = iFIwbmz;
                }
                canvas.save();
                canvas.translate(this.AEQbTJ, (this.fARcdN + this.AYXKKw) - r0);
                this.isConnected.draw(canvas);
                canvas.restore();
            }
        }
    }
}
