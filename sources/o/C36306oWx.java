package o;

import android.graphics.Paint;
import android.graphics.RectF;
import com.okinc.kline.data.KlineQuickOrderPriceBean;
import com.okinc.kline.library.layout.ChartArea;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import o.C32392mcI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oWx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36306oWx extends AbstractC36302oWt {
    public int AEQbTJ;
    public final android.graphics.Paint AYXKKw;
    public int AhwBna;
    public int AkhnZx;
    public C36246oUr DbNXlk;
    public ChartArea EZpvd;
    public int KWHzl;
    public int OLrzqt;
    public int djBIcL;
    public float fetchVPNInfo;
    public final android.graphics.Paint gEmmrt;
    public oWC isConnected;
    public int valueOf;
    public final android.graphics.Paint values;

    @Override // o.AbstractC36302oWt
    public void KWHzl() {
    }

    public C36306oWx(java.lang.String str) {
        oWC owc;
        LinkedHashMap<java.lang.String, oWC> linkedHashMapQVAiDq;
        super(str);
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        Intrinsics.checkNotNullExpressionValue(c36246oUrCopydefault, "");
        this.DbNXlk = c36246oUrCopydefault;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.gEmmrt = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.AYXKKw = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.values = paint3;
        oUE oueIwGUEr = this.DbNXlk.iwGUEr();
        if (oueIwGUEr == null || (linkedHashMapQVAiDq = oueIwGUEr.QVAiDq()) == null) {
            owc = null;
        } else {
            owc = linkedHashMapQVAiDq.get(copydefault() + ".m");
        }
        this.isConnected = owc;
        this.EZpvd = this.DbNXlk.values().get(EZpvd());
        this.DGUQLIOvDItG = AbstractC36302oWt.copydefault(6.0f);
        this.DTg = AbstractC36302oWt.copydefault(4.0f);
        this.AEQbTJ = AbstractC36302oWt.copydefault(1.0f);
        this.KWHzl = AbstractC36302oWt.copydefault(4.0f);
        this.OLrzqt = AbstractC36302oWt.copydefault(16.0f);
        this.djBIcL = AbstractC36302oWt.copydefault(2.0f);
        this.AhwBna = AbstractC36302oWt.copydefault(16.0f);
        this.AkhnZx = AbstractC36302oWt.copydefault(4.0f);
        C37891pEn c37891pEn = C37891pEn.AEQbTJ;
        android.content.Context contextAubY = C36246oUr.copydefault().AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        this.DGUQLIDGUQLI = c37891pEn.OLrzqt(contextAubY, C32392mcI.Activity.fARcdN, false);
        this.getLabel = C33070mpX.KWHzl(C32392mcI.Activity.iwGUEr);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(C33129mqd.djBIcL(java.lang.Integer.valueOf(this.AEQbTJ)));
        paint.setPathEffect(this.getPriority);
        paint3.setAntiAlias(true);
        paint3.setTextAlign(Paint.Align.RIGHT);
        paint3.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        paint3.setTypeface(C55051xce.OLrzqt.valueOf());
        paint2.setStyle(Paint.Style.FILL);
        this.fetchVPNInfo = (-(C33129mqd.AhwBna(java.lang.Double.valueOf(java.lang.Math.ceil(r7.bottom - r7.top))) / 2)) - paint3.getFontMetrics().top;
    }

    @Override // o.AbstractC36302oWt
    public void OLrzqt(@NotNull oWK owk) {
        Intrinsics.checkNotNullParameter(owk, "");
        this.gEmmrt.setColor(owk.EZpvd(6));
        this.AYXKKw.setColor(owk.gEmmrt());
        this.values.setColor(owk.AuCTel());
        this.valueOf = owk.gEmmrt();
    }

    @Override // o.AbstractC36302oWt
    public void AEQbTJ(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        if (this.isConnected == null || this.EZpvd == null || !this.DbNXlk.DsrFlB()) {
            return;
        }
        copydefault(canvas);
    }

    public final void copydefault(android.graphics.Canvas canvas) {
        KlineQuickOrderPriceBean klineQuickOrderPriceBeanDAIeex = this.DbNXlk.DAIeex();
        if (klineQuickOrderPriceBeanDAIeex != null && klineQuickOrderPriceBeanDAIeex.getPrice().length() > 0) {
            oWC owc = this.isConnected;
            Intrinsics.copydefault(owc);
            int iAhwBna = owc.AhwBna(C33129mqd.AEQbTJ(klineQuickOrderPriceBeanDAIeex.getPrice()));
            if (iAhwBna >= 0) {
                ChartArea chartArea = this.EZpvd;
                Intrinsics.copydefault(chartArea);
                if (iAhwBna > chartArea.KWHzl()) {
                    return;
                }
                KWHzl(canvas, 0, canvas.getWidth() - this.OLrzqt, iAhwBna, this.gEmmrt);
                EZpvd(canvas, this.valueOf, iAhwBna);
                this.DbNXlk.iwGUEr().valueOf(copydefault(canvas, iAhwBna, klineQuickOrderPriceBeanDAIeex.getPrice()));
                return;
            }
            return;
        }
        this.DbNXlk.iwGUEr().valueOf((RectF) null);
    }

    public final RectF copydefault(android.graphics.Canvas canvas, int i, java.lang.String str) {
        java.lang.String strAYXKKw = AbstractC36302oWt.AYXKKw(C33129mqd.AEQbTJ(str));
        int i2 = this.AhwBna / 2;
        int i3 = i - i2;
        int i4 = i2 + i;
        int width = canvas.getWidth() - this.OLrzqt;
        float fOLrzqt = width - OLrzqt(strAYXKKw);
        RectF rectF = new RectF(fOLrzqt, i3, width, i4);
        float f = this.djBIcL;
        canvas.drawRoundRect(rectF, f, f, this.AYXKKw);
        canvas.drawText(strAYXKKw, width - this.AkhnZx, i + this.fetchVPNInfo, this.values);
        return new RectF(0.0f, C33129mqd.djBIcL(java.lang.Integer.valueOf(i3)) - this.KWHzl, fOLrzqt, C33129mqd.djBIcL(java.lang.Integer.valueOf(i4)) + this.KWHzl);
    }

    private final int OLrzqt(java.lang.String str) {
        return (int) (this.values.measureText(str) + (this.AkhnZx * 2));
    }
}
