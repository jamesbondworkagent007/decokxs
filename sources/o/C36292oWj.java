package o;

import android.graphics.Paint;
import android.graphics.RectF;
import com.okinc.kline.library.drawline.DrawLineData;
import com.okinc.kline.library.layout.ChartArea;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Date;

/* JADX INFO: renamed from: o.oWj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36292oWj extends AbstractC36302oWt {
    public int AEQbTJ;
    public int AYXKKw;
    public int AhwBna;
    public float AkhnZx;
    public android.graphics.Paint EZpvd;
    public android.graphics.Paint KWHzl;
    public java.util.ArrayList<DrawLineData.Dot> OLrzqt;
    public float djBIcL;
    public final RectF gEmmrt;
    public android.graphics.Paint isConnected;
    public final Date valueOf;

    @Override // o.AbstractC36302oWt
    public void KWHzl() {
    }

    public C36292oWj(java.lang.String str) {
        super(str);
        this.gEmmrt = new RectF();
        this.valueOf = new Date();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.isConnected = paint;
        paint.setAntiAlias(true);
        this.isConnected.setTextAlign(Paint.Align.CENTER);
        this.isConnected.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        this.isConnected.setColor(-1);
        this.isConnected.setTypeface(C55051xce.OLrzqt.AEQbTJ("harmony_sans_regular.ttf"));
        Paint.FontMetrics fontMetrics = this.isConnected.getFontMetrics();
        this.AhwBna = (int) java.lang.Math.ceil(fontMetrics.bottom - fontMetrics.top);
        this.AkhnZx = (-(r1 >> 1)) - ((int) fontMetrics.top);
        this.djBIcL = this.isConnected.measureText("0000-00-00 00:00") + AbstractC36302oWt.copydefault(4.0f);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.EZpvd = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.EZpvd.setAntiAlias(true);
        this.EZpvd.setStrokeWidth(AbstractC36302oWt.copydefault(0.5f));
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.KWHzl = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.AEQbTJ = AbstractC36302oWt.copydefault(16.0f);
        this.AYXKKw = AbstractC36302oWt.copydefault(2.0f);
    }

    @Override // o.AbstractC36302oWt
    public void OLrzqt(oWK owk) {
        this.KWHzl.setColor(owk.ejfBZ());
    }

    @Override // o.AbstractC36302oWt
    public void AEQbTJ(android.graphics.Canvas canvas) {
        DrawLineData drawLineData = DrawLineData.copydefault;
        if (drawLineData.isConnected() == null) {
            return;
        }
        java.util.ArrayList<DrawLineData.Dot> dotList = drawLineData.isConnected().getDotList();
        this.OLrzqt = dotList;
        if (dotList.isEmpty()) {
            return;
        }
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        EZpvd(canvas, c36246oUrCopydefault, this.OLrzqt);
        this.KWHzl.setAlpha(255);
        for (int i = 0; i < this.OLrzqt.size(); i++) {
            copydefault(canvas, c36246oUrCopydefault, this.OLrzqt.get(i));
        }
    }

    public final void EZpvd(android.graphics.Canvas canvas, C36246oUr c36246oUr, java.util.ArrayList<DrawLineData.Dot> arrayList) {
        ChartArea chartArea = c36246oUr.values().get(EZpvd());
        oWN own = c36246oUr.DCJXGO().get(copydefault());
        if (chartArea == null || own == null) {
            return;
        }
        int iAkhnZx = chartArea.AkhnZx();
        int i = this.AEQbTJ;
        int iAkhnZx2 = chartArea.AkhnZx();
        int i2 = this.AEQbTJ;
        java.util.Iterator<DrawLineData.Dot> it = arrayList.iterator();
        double d = Double.MAX_VALUE;
        double dAYXKKw = Double.MIN_VALUE;
        while (it.hasNext()) {
            double x = it.next().getX();
            if (x < d) {
                d = x;
            }
            if (x > dAYXKKw) {
                dAYXKKw = x;
            }
        }
        DrawLineData drawLineData = DrawLineData.copydefault;
        if (drawLineData.isConnected().getLineType() != DrawLineData.LineType.PRICE_LINE && drawLineData.isConnected().getLineType() != DrawLineData.LineType.H_LINE && d == dAYXKKw && arrayList.get(0).getY() == arrayList.get(1).getY()) {
            dAYXKKw = own.AYXKKw(own.DbNXlk());
        }
        this.KWHzl.setAlpha(50);
        this.gEmmrt.set((float) d, iAkhnZx - (i >> 1), (float) dAYXKKw, iAkhnZx2 + (i2 >> 1));
        canvas.drawRect(this.gEmmrt, this.KWHzl);
    }

    public final void copydefault(android.graphics.Canvas canvas, C36246oUr c36246oUr, DrawLineData.Dot dot) {
        int x;
        if (c36246oUr.sSMYrx().get(copydefault()).gEmmrt() < 1) {
            return;
        }
        oWN own = c36246oUr.DCJXGO().get(copydefault());
        ChartArea chartArea = c36246oUr.values().get(EZpvd());
        if (own == null || chartArea == null || (x = (int) dot.getX()) < 0 || x > chartArea.DbNXlk()) {
            return;
        }
        float f = x;
        float f2 = this.djBIcL / 2.0f;
        float f3 = 1.0f + f2;
        if (f < f3) {
            x = (int) f3;
        } else if (f + f2 > chartArea.DbNXlk()) {
            x = (int) (chartArea.DbNXlk() - (this.djBIcL / 2.0f));
        }
        float f4 = x;
        float f5 = this.djBIcL / 2.0f;
        this.gEmmrt.set(f4 - f5, chartArea.AkhnZx() - (this.AEQbTJ >> 1), f5 + f4, chartArea.AkhnZx() + (this.AEQbTJ >> 1));
        RectF rectF = this.gEmmrt;
        float f6 = this.AYXKKw;
        canvas.drawRoundRect(rectF, f6, f6, this.KWHzl);
        this.valueOf.setTime(dot.getTime());
        canvas.drawText(pTA.KWHzl(this.valueOf, OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM), f4, chartArea.AkhnZx() + this.AkhnZx, this.isConnected);
    }
}
