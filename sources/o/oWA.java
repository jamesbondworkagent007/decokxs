package o;

import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.VectorDrawable;
import androidx.camera.video.AudioStats;
import com.okinc.kline.library.data.DataSource;
import com.okinc.kline.library.drawline.DrawLineData;
import com.okinc.kline.library.layout.ChartArea;
import com.okinc.localization.util.currency.Notation;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import o.C32392mcI;
import o.C52761wXj;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes8.dex */
public class oWA extends AbstractC36302oWt {
    public android.graphics.Bitmap AEQbTJ;
    public float[] AYXKKw;
    public int AhwBna;
    public int AkhnZx;
    public int AuCTel;
    public android.graphics.Bitmap AuCTelauCTel;
    public android.graphics.Paint AubY;
    public android.graphics.Paint AwvSrB;
    public android.graphics.Paint AxsJAY;
    public final RectF AxsJAYaxsJAY;
    public final android.graphics.Path AxsJAYsNCnLh;
    public final PorterDuffColorFilter DAIeex;
    public java.lang.String DCJXGO;
    public NumberFormat DCUTEI;
    public java.lang.String DTwDnp;
    public final RectF DXXBbs;
    public final RectF DarRvM;
    public int DbNXlk;
    public android.graphics.Bitmap EZpvd;
    public int KWHzl;
    public java.lang.String OBJEWx;
    public final android.graphics.Path ODWQjV;
    public android.graphics.Bitmap OLrzqt;
    public java.lang.String ORxRYg;
    public android.graphics.Paint OcIXYQ;
    public final RectF OqFWZa;
    public java.lang.String OuxcSI;
    public float QHmsKR;
    public java.lang.String QKVWgx;
    public final java.util.Map<java.lang.String, java.lang.String> QKudOq;
    public java.lang.String QOLQEE;
    public java.lang.String QSBOWP;
    public java.lang.String QUSxYX;
    public android.graphics.Paint QVAiDq;
    public android.graphics.Paint QbewEr;
    public java.lang.String QfsBiF;
    public int QkdxfA;
    public java.lang.String RJOkX;
    public RectF RKDWNf;
    public java.lang.String RcXXUw;
    public android.content.res.Resources RdAHlO;
    public final RectF RlQdEF;
    public java.lang.String UeEOUB;
    public java.lang.String aKErDB;
    public final Date accept;
    public int dHguZz;
    public final android.graphics.Paint dNCPSb;
    public android.graphics.Bitmap djBIcL;
    public java.lang.String djSkpj;
    public RectF dmfpNf;
    public int dvKsVJ;
    public VectorDrawable dxcTrN;
    public int ejfBZ;
    public int fARcdN;
    public int fFgQHt;
    public int fIwbmz;
    public int fJNWhG;
    public NumberFormat fZBcTu;
    public int fetchVPNInfo;
    public int ffGIBT;
    public int finit;
    public int flVtFt;
    public final int fvQaOB;
    public float[] gEmmrt;
    public final int gGvvIC;
    public android.graphics.Paint gHZMYf;
    public android.graphics.Paint gasjUx;
    public int getFieldNames;
    public int getNewProxyInstance;
    public android.graphics.Paint getPostValueLengthLimit;
    public int giSNqX;
    public int gkJEwt;
    public android.graphics.Bitmap gwTjWJ;
    public int hBpjJd;
    public java.lang.String hDKMBd;
    public int hUfVAv;
    public int hrNTAI;
    public final PorterDuffColorFilter iRxXKY;
    public final RectF iZzfmt;
    public int isConnected;
    public int iwGUEr;
    public android.graphics.Bitmap sSMYrx;
    public android.graphics.Paint uzCIH;
    public android.graphics.Bitmap valueOf;
    public int values;
    public android.graphics.Bitmap wlaJM;
    public android.graphics.Paint zLjUOn;
    public android.graphics.Paint zsXlph;
    public android.graphics.Bitmap zuBGHE;
    public android.graphics.Paint zuWLRA;

    public final boolean AEQbTJ(int i) {
        return i == 0 || i == -5 || i == -15 || i == -30;
    }

    public final int EZpvd(int i) {
        if (i != 12) {
            return (i == 14 || i == 15) ? 8 : 6;
        }
        return 7;
    }

    @Override // o.AbstractC36302oWt
    public void KWHzl() {
    }

    public oWA(java.lang.String str) {
        super(str);
        this.EZpvd = null;
        this.AEQbTJ = null;
        this.OLrzqt = null;
        this.valueOf = null;
        this.gwTjWJ = null;
        this.djBIcL = null;
        this.KWHzl = 0;
        this.wlaJM = null;
        this.AuCTelauCTel = null;
        this.zuBGHE = null;
        this.sSMYrx = null;
        this.RdAHlO = null;
        this.dxcTrN = null;
        this.dmfpNf = new RectF();
        this.RKDWNf = new RectF();
        this.iZzfmt = new RectF();
        this.OqFWZa = new RectF();
        this.AxsJAYaxsJAY = new RectF();
        this.RlQdEF = new RectF();
        this.DarRvM = new RectF();
        this.DXXBbs = new RectF();
        this.ODWQjV = new android.graphics.Path();
        this.AxsJAYsNCnLh = new android.graphics.Path();
        this.accept = new Date();
        this.QKudOq = new LinkedHashMap();
        this.QkdxfA = 0;
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        this.fZBcTu = percentInstance;
        percentInstance.setGroupingUsed(false);
        this.fZBcTu.setMaximumFractionDigits(2);
        this.fZBcTu.setMinimumFractionDigits(2);
        this.RdAHlO = C36246oUr.copydefault().AubY().getResources();
        this.hBpjJd = AbstractC36302oWt.KWHzl(10.0f);
        this.dHguZz = AbstractC36302oWt.KWHzl(12.0f);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.dNCPSb = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setStrokeWidth(AbstractC36302oWt.copydefault(1.0f));
        paint.setPathEffect(this.getPriority);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.AxsJAY = paint2;
        paint2.setStyle(style);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.QVAiDq = paint3;
        paint3.setAntiAlias(true);
        this.QVAiDq.setStyle(style);
        this.QVAiDq.setTextSize(this.hBpjJd);
        android.graphics.Paint paint4 = this.QVAiDq;
        C55051xce c55051xce = C55051xce.OLrzqt;
        paint4.setTypeface(c55051xce.AEQbTJ("harmony_sans_regular.ttf"));
        android.graphics.Paint paint5 = new android.graphics.Paint();
        this.AubY = paint5;
        paint5.setStyle(style);
        android.graphics.Paint paint6 = new android.graphics.Paint();
        this.zLjUOn = paint6;
        paint6.setStyle(style);
        android.graphics.Paint paint7 = new android.graphics.Paint();
        this.gHZMYf = paint7;
        paint7.setAntiAlias(true);
        this.gHZMYf.setTextAlign(Paint.Align.RIGHT);
        this.gHZMYf.setTextSize(AbstractC36302oWt.KWHzl(14.0f));
        this.gHZMYf.setTypeface(c55051xce.AEQbTJ("harmony_sans_regular.ttf"));
        android.graphics.Paint paint8 = new android.graphics.Paint();
        this.zsXlph = paint8;
        paint8.setStyle(style);
        android.graphics.Paint paint9 = new android.graphics.Paint();
        this.getPostValueLengthLimit = paint9;
        paint9.setAntiAlias(true);
        this.getPostValueLengthLimit.setStyle(style);
        this.getPostValueLengthLimit.setTextSize(this.hBpjJd);
        this.getPostValueLengthLimit.setColor(-1);
        this.getPostValueLengthLimit.setTypeface(c55051xce.AEQbTJ("harmony_sans_regular.ttf"));
        android.graphics.Paint paint10 = new android.graphics.Paint();
        this.zuWLRA = paint10;
        paint10.setAntiAlias(true);
        this.zuWLRA.setStyle(style);
        this.zuWLRA.setTextSize(this.dHguZz);
        this.zuWLRA.setTypeface(c55051xce.AEQbTJ("harmony_sans_regular.ttf"));
        android.graphics.Paint paint11 = new android.graphics.Paint();
        this.OcIXYQ = paint11;
        paint11.setStyle(style);
        android.graphics.Paint paint12 = new android.graphics.Paint();
        this.gasjUx = paint12;
        paint12.setAntiAlias(true);
        this.gasjUx.setTextSize(this.hBpjJd);
        this.gasjUx.setTypeface(c55051xce.AEQbTJ("harmony_sans_regular.ttf"));
        Paint.FontMetrics fontMetrics = this.gasjUx.getFontMetrics();
        this.ffGIBT = (int) java.lang.Math.ceil(fontMetrics.bottom - fontMetrics.top);
        this.QHmsKR = (-(r6 >> 1)) - fontMetrics.top;
        NumberFormat numberInstance = NumberFormat.getNumberInstance(java.util.Locale.US);
        this.DCUTEI = numberInstance;
        numberInstance.setGroupingUsed(false);
        android.graphics.Paint paint13 = new android.graphics.Paint();
        this.AwvSrB = paint13;
        paint13.setStyle(style);
        android.graphics.Paint paint14 = new android.graphics.Paint();
        this.QbewEr = paint14;
        paint14.setStyle(style);
        this.dvKsVJ = AbstractC36302oWt.copydefault(3.0f);
        this.finit = AbstractC36302oWt.copydefault(4.0f);
        this.fFgQHt = AbstractC36302oWt.copydefault(4.0f);
        this.hUfVAv = AbstractC36302oWt.copydefault(16.0f);
        this.gkJEwt = AbstractC36302oWt.copydefault(2.0f);
        this.AhwBna = AbstractC36302oWt.copydefault(11.0f);
        this.fJNWhG = AbstractC36302oWt.copydefault(2.0f);
        this.ejfBZ = AbstractC36302oWt.copydefault(4.0f);
        this.getNewProxyInstance = AbstractC36302oWt.copydefault(6.0f);
        this.getFieldNames = AbstractC36302oWt.copydefault(5.0f);
        this.iwGUEr = AbstractC36302oWt.copydefault(8.0f);
        this.DbNXlk = AbstractC36302oWt.copydefault(10.0f);
        this.isConnected = AbstractC36302oWt.copydefault(12.0f);
        this.values = AbstractC36302oWt.copydefault(15.0f);
        this.fetchVPNInfo = AbstractC36302oWt.copydefault(16.0f);
        this.AkhnZx = AbstractC36302oWt.copydefault(18.0f);
        this.fIwbmz = AbstractC36302oWt.copydefault(19.0f);
        this.AuCTel = AbstractC36302oWt.copydefault(20.0f);
        this.fARcdN = AbstractC36302oWt.copydefault(24.0f);
        float f = this.gkJEwt;
        this.gEmmrt = new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f};
        this.AYXKKw = new float[]{0.0f, 0.0f, f, f, f, f, 0.0f, 0.0f};
        this.QVAiDq.setColor(-1);
        android.graphics.Paint paint15 = new android.graphics.Paint();
        this.uzCIH = paint15;
        paint15.setStyle(style);
        this.EZpvd = BitmapFactory.decodeResource(C36246oUr.copydefault().AubY().getResources(), C32392mcI.Activity.AhwBna);
        this.AEQbTJ = BitmapFactory.decodeResource(C36246oUr.copydefault().AubY().getResources(), C32392mcI.Activity.gEmmrt);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setRotate(180.0f);
        android.graphics.Bitmap bitmap = this.EZpvd;
        this.OLrzqt = android.graphics.Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), this.EZpvd.getHeight(), matrix, true);
        android.graphics.Bitmap bitmap2 = this.AEQbTJ;
        this.valueOf = android.graphics.Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), this.AEQbTJ.getHeight(), matrix, true);
        this.wlaJM = BitmapFactory.decodeResource(this.RdAHlO, C32392mcI.Activity.values);
        this.AuCTelauCTel = BitmapFactory.decodeResource(this.RdAHlO, C32392mcI.Activity.fetchVPNInfo);
        this.zuBGHE = BitmapFactory.decodeResource(this.RdAHlO, C32392mcI.Activity.AuCTel);
        this.sSMYrx = BitmapFactory.decodeResource(this.RdAHlO, C32392mcI.Activity.ejfBZ);
        this.dxcTrN = (VectorDrawable) this.RdAHlO.getDrawable(C52761wXj.TaskDescription.fzHEvu);
        int i = this.fetchVPNInfo;
        this.fvQaOB = i;
        this.gGvvIC = i;
        int color = this.RdAHlO.getColor(C52761wXj.Activity.zblBkD);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.iRxXKY = new PorterDuffColorFilter(color, mode);
        this.DAIeex = new PorterDuffColorFilter(this.RdAHlO.getColor(C52761wXj.Activity.ixgjPv), mode);
    }

    @Override // o.AbstractC36302oWt
    public void OLrzqt(oWK owk) {
        this.dNCPSb.setColor(owk.AkhnZx());
        this.AxsJAY.setColor(owk.getFieldNames());
        this.QVAiDq.setColor(owk.getFieldNames());
        this.AwvSrB.setColor(owk.fetchVPNInfo());
        this.QbewEr.setColor(owk.djBIcL());
        this.gasjUx.setColor(owk.DbNXlk());
        this.zsXlph.setColor(owk.getNewProxyInstance());
        this.gHZMYf.setColor(owk.getFieldNames());
        if (C33512mxp.AEQbTJ.isConnected() == 0) {
            this.gwTjWJ = BitmapFactory.decodeResource(C36246oUr.copydefault().AubY().getResources(), C32392mcI.Activity.DbNXlk);
            this.djBIcL = BitmapFactory.decodeResource(C36246oUr.copydefault().AubY().getResources(), C32392mcI.Activity.KWHzl);
        } else {
            this.gwTjWJ = BitmapFactory.decodeResource(C36246oUr.copydefault().AubY().getResources(), C32392mcI.Activity.isConnected);
            this.djBIcL = BitmapFactory.decodeResource(C36246oUr.copydefault().AubY().getResources(), C32392mcI.Activity.AEQbTJ);
        }
    }

    @Override // o.AbstractC36302oWt
    public void AEQbTJ(android.graphics.Canvas canvas) {
        if (this.zhUgOk) {
            return;
        }
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        ChartArea chartArea = c36246oUrCopydefault.values().get(EZpvd());
        oWN own = c36246oUrCopydefault.DCJXGO().get(copydefault());
        this.hrNTAI = c36246oUrCopydefault.ODWQjV();
        if ((own.DbNXlk() < 0 && !c36246oUrCopydefault.QCjLjM()) || (c36246oUrCopydefault.QCjLjM() && DrawLineData.copydefault.OLrzqt() == null && own.DbNXlk() < 0)) {
            if (Objects.equals(c36246oUrCopydefault.fZBcTu(), "nft_mode")) {
                return;
            }
            EZpvd(canvas, chartArea);
            return;
        }
        AEQbTJ(canvas, c36246oUrCopydefault, own);
        int iUzCIH = own.uzCIH();
        if (iUzCIH <= chartArea.KWHzl() && iUzCIH >= chartArea.AuCTel()) {
            this.KWHzl = AEQbTJ(canvas, c36246oUrCopydefault, own, chartArea.EZpvd());
        }
        if (!Objects.equals(c36246oUrCopydefault.fZBcTu(), "nft_mode")) {
            EZpvd(canvas, chartArea);
        }
        if (own.hDKMBd() < 0 || DrawLineData.copydefault.OLrzqt() != null) {
            return;
        }
        if (c36246oUrCopydefault.QCjLjM() && c36246oUrCopydefault.gwTjWJ()) {
            return;
        }
        KWHzl(canvas, c36246oUrCopydefault, own, this.KWHzl, chartArea.EZpvd());
    }

    public final void EZpvd(android.graphics.Canvas canvas, ChartArea chartArea) {
        android.graphics.Bitmap bitmap;
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        if (c36246oUrCopydefault.gHZMYf().equals("YScale")) {
            this.zLjUOn.setAlpha(0);
            RectF rectFAwvSrB = C36246oUr.copydefault().iwGUEr().AwvSrB();
            float f = this.gkJEwt;
            canvas.drawRoundRect(rectFAwvSrB, f, f, this.zLjUOn);
            android.graphics.Bitmap bitmap2 = C36246oUr.copydefault().DarRvM().equalsIgnoreCase("light") ? this.wlaJM : this.AuCTelauCTel;
            C36246oUr.copydefault().iwGUEr().EZpvd(false);
            float width = (canvas.getWidth() - bitmap2.getWidth()) - this.fetchVPNInfo;
            float fKWHzl = (chartArea.KWHzl() - bitmap2.getHeight()) - this.ejfBZ;
            this.iZzfmt.set(width, fKWHzl, bitmap2.getWidth() + width, bitmap2.getHeight() + fKWHzl);
            c36246oUrCopydefault.iwGUEr().KWHzl(this.iZzfmt);
            canvas.drawBitmap(bitmap2, width, fKWHzl, this.AubY);
            return;
        }
        if (!c36246oUrCopydefault.QHmsKR() || c36246oUrCopydefault.iwGUEr().fZBcTu()) {
            return;
        }
        this.zLjUOn.setAlpha(0);
        RectF rectFAwvSrB2 = C36246oUr.copydefault().iwGUEr().AwvSrB();
        float f2 = this.gkJEwt;
        canvas.drawRoundRect(rectFAwvSrB2, f2, f2, this.zLjUOn);
        if (C36246oUr.copydefault().DarRvM().equalsIgnoreCase("light")) {
            bitmap = c36246oUrCopydefault.iwGUEr().fZBcTu() ? this.zuBGHE : this.wlaJM;
        } else {
            bitmap = c36246oUrCopydefault.iwGUEr().fZBcTu() ? this.sSMYrx : this.AuCTelauCTel;
        }
        float width2 = (canvas.getWidth() - bitmap.getWidth()) - this.fetchVPNInfo;
        float fKWHzl2 = (chartArea.KWHzl() - bitmap.getHeight()) - this.ejfBZ;
        this.iZzfmt.set(width2, fKWHzl2, bitmap.getWidth() + width2, bitmap.getHeight() + fKWHzl2);
        c36246oUrCopydefault.iwGUEr().KWHzl(this.iZzfmt);
        canvas.drawBitmap(bitmap, width2, fKWHzl2, this.AubY);
    }

    public final void AEQbTJ(android.graphics.Canvas canvas, C36246oUr c36246oUr, oWN own) {
        ChartArea chartArea = c36246oUr.values().get(EZpvd());
        float fAYXKKw = own.AYXKKw(own.DbNXlk());
        float fCopydefault = copydefault(own.uzCIH(), own);
        canvas.drawCircle(fAYXKKw, fCopydefault, this.ejfBZ, this.QbewEr);
        canvas.drawCircle(fAYXKKw, fCopydefault, this.fJNWhG, this.AwvSrB);
        if (c36246oUr.DTwDnp().x >= 0) {
            DrawLineData drawLineData = DrawLineData.copydefault;
            if ((drawLineData.OLrzqt() == null || !drawLineData.OLrzqt().equals(DrawLineData.LineType.G_RECTANGLE)) && !drawLineData.OLrzqt().equals(DrawLineData.LineType.G_CIRCLE) && !drawLineData.OLrzqt().equals(DrawLineData.LineType.G_TRIANGLE)) {
                canvas.drawLine(own.AYXKKw(own.valueOf(c36246oUr.DTwDnp().x)), c36246oUr.DTwDnp().y, fAYXKKw, fCopydefault, this.dNCPSb);
            }
        }
        canvas.drawLine(fAYXKKw, chartArea.AuCTel(), fAYXKKw, chartArea.KWHzl(), this.dNCPSb);
        if (EZpvd().endsWith(com.ibm.icu.text.DateFormat.MINUTE)) {
            canvas.drawLine(chartArea.AYXKKw(), fCopydefault, chartArea.DbNXlk() - AEQbTJ(AbstractC36302oWt.AYXKKw(c36246oUr.iwGUEr().QVAiDq().get(chartArea.EZpvd()).EZpvd(r8))), fCopydefault, this.dNCPSb);
        }
    }

    public final int copydefault(int i, oWN own) {
        com.okinc.kline.library.data.DataSource dataSource;
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        if (!c36246oUrCopydefault.zLjUOn().isCeFiMCapMode() || (dataSource = c36246oUrCopydefault.sSMYrx().get(copydefault())) == null || dataSource.AEQbTJ.size() <= own.DbNXlk()) {
            return i;
        }
        DataSource.StateListAnimator stateListAnimator = dataSource.AEQbTJ.get(own.DbNXlk());
        oWC owc = c36246oUrCopydefault.iwGUEr().QVAiDq().get(EZpvd());
        return owc != null ? owc.AhwBna(stateListAnimator.copydefault()) : i;
    }

    public final int AEQbTJ(android.graphics.Canvas canvas, C36246oUr c36246oUr, oWN own, java.lang.String str) {
        java.lang.String strAEQbTJ;
        com.okinc.kline.library.data.DataSource dataSource = c36246oUr.sSMYrx().get(copydefault());
        if (dataSource.gEmmrt() < 1) {
            return 0;
        }
        int iCopydefault = copydefault(own.uzCIH(), own);
        int iAuCTel = own.AuCTel();
        LinkedHashMap<java.lang.String, oWC> linkedHashMapQVAiDq = c36246oUr.iwGUEr().QVAiDq();
        this.DCUTEI.setMaximumFractionDigits(linkedHashMapQVAiDq.get(str).isConnected());
        this.DCUTEI.setMinimumFractionDigits(linkedHashMapQVAiDq.get(str).isConnected());
        java.lang.String strAEQbTJ2 = "";
        if (linkedHashMapQVAiDq.get(str).AhwBna().equals("VOLUME")) {
            strAEQbTJ = oWC.AEQbTJ(linkedHashMapQVAiDq.get(str).EZpvd(iCopydefault), linkedHashMapQVAiDq.get(str).isConnected());
        } else if (valueOf(linkedHashMapQVAiDq.get(str).AhwBna())) {
            if (getFieldNames()) {
                strAEQbTJ = "0";
            } else {
                double dEZpvd = linkedHashMapQVAiDq.get(str).EZpvd(iCopydefault);
                if (dEZpvd < AudioStats.AUDIO_AMPLITUDE_NONE) {
                    strAEQbTJ = AbstractC36302oWt.AEQbTJ(dEZpvd, 2);
                } else {
                    strAEQbTJ = oWC.AEQbTJ(dEZpvd, 2);
                }
            }
        } else {
            java.lang.String strAYXKKw = AbstractC36302oWt.AYXKKw(linkedHashMapQVAiDq.get(str).EZpvd(iCopydefault));
            dataSource.AEQbTJ.get(iAuCTel - 1).copydefault();
            double dAhwBna = AhwBna();
            double dEZpvd2 = (linkedHashMapQVAiDq.get(str).EZpvd(iCopydefault) - dAhwBna) / dAhwBna;
            linkedHashMapQVAiDq.get(str).EZpvd(iCopydefault);
            strAEQbTJ2 = pTB.AEQbTJ(pTB.OLrzqt(java.lang.Double.valueOf(dEZpvd2)), 2, 2, RoundingMode.HALF_UP);
            strAEQbTJ = strAYXKKw;
        }
        int i = this.AkhnZx;
        this.hUfVAv = i;
        int i2 = i >> 1;
        int i3 = iCopydefault - i2;
        int i4 = i2 + iCopydefault;
        float f = iCopydefault;
        float f2 = this.QHmsKR + f;
        int iAEQbTJ = AEQbTJ(strAEQbTJ);
        if (c36246oUr.zLjUOn().isShowPriceChange()) {
            if (iAEQbTJ < AEQbTJ(strAEQbTJ2)) {
                iAEQbTJ = AEQbTJ(strAEQbTJ2);
            }
            int iCopydefault2 = AbstractC36302oWt.copydefault(32.0f);
            this.hUfVAv = iCopydefault2;
            int i5 = iCopydefault2 >> 1;
            i3 = iCopydefault - i5;
            i4 = i5 + iCopydefault;
            f2 = ((f + this.QHmsKR) - this.ffGIBT) + this.getNewProxyInstance;
        }
        int width = (canvas.getWidth() - iAEQbTJ) - this.fetchVPNInfo;
        int width2 = canvas.getWidth() - this.fetchVPNInfo;
        RectF rectF = this.dmfpNf;
        rectF.left = width;
        float f3 = i3;
        rectF.top = f3;
        rectF.right = width2;
        float f4 = i4;
        rectF.bottom = f4;
        if (c36246oUr.zLjUOn().isSupportQuickOrder()) {
            this.ODWQjV.reset();
            this.ODWQjV.addRoundRect(this.dmfpNf, this.AYXKKw, Path.Direction.CW);
            canvas.drawPath(this.ODWQjV, this.AwvSrB);
        } else {
            RectF rectF2 = this.dmfpNf;
            float f5 = this.gkJEwt;
            canvas.drawRoundRect(rectF2, f5, f5, this.AwvSrB);
        }
        this.gasjUx.setTextAlign(Paint.Align.RIGHT);
        canvas.drawText(strAEQbTJ, width2 - this.fFgQHt, f2, this.gasjUx);
        if (c36246oUr.zLjUOn().isShowPriceChange()) {
            canvas.drawText(strAEQbTJ2, width2 - this.fFgQHt, f2 + this.ffGIBT + this.fJNWhG, this.gasjUx);
        }
        if (c36246oUr.zLjUOn().isSupportQuickOrder()) {
            RectF rectF3 = this.RKDWNf;
            rectF3.left = (width - this.fvQaOB) - this.getNewProxyInstance;
            rectF3.top = f3;
            rectF3.right = width - this.fJNWhG;
            rectF3.bottom = f4;
            this.AxsJAYsNCnLh.reset();
            this.AxsJAYsNCnLh.addRoundRect(this.RKDWNf, this.gEmmrt, Path.Direction.CW);
            canvas.drawPath(this.AxsJAYsNCnLh, this.AwvSrB);
            if (this.dxcTrN != null) {
                if (C36246oUr.copydefault().DarRvM().equalsIgnoreCase("light")) {
                    this.dxcTrN.setColorFilter(this.iRxXKY);
                } else {
                    this.dxcTrN.setColorFilter(this.DAIeex);
                }
                int i6 = this.gGvvIC;
                int i7 = iCopydefault - (i6 >> 1);
                this.flVtFt = i7;
                int i8 = this.fvQaOB;
                int i9 = (width - i8) - this.ejfBZ;
                this.giSNqX = i9;
                this.dxcTrN.setBounds(i9, i7, i8 + i9, i6 + i7);
                this.dxcTrN.draw(canvas);
                RectF rectF4 = this.OqFWZa;
                RectF rectF5 = this.RKDWNf;
                float f6 = rectF5.left;
                float f7 = this.ejfBZ;
                rectF4.set(f6 - f7, rectF5.top - f7, rectF5.right, rectF5.bottom + f7);
                c36246oUr.iwGUEr().AhwBna(this.OqFWZa);
            }
        } else {
            c36246oUr.iwGUEr().AhwBna(null);
        }
        if (c36246oUr.zLjUOn().isShowCountdown() && !c36246oUr.iwGUEr().RcXXUw().isEmpty() && AEQbTJ(c36246oUr.iwGUEr().RcXXUw()) > AEQbTJ(strAEQbTJ)) {
            this.QkdxfA = AEQbTJ(c36246oUr.iwGUEr().RcXXUw()) + this.AuCTel;
        } else {
            this.QkdxfA = AEQbTJ(strAEQbTJ) + this.AuCTel;
        }
        if (c36246oUr.zLjUOn().isSupportQuickOrder()) {
            this.QkdxfA += this.fvQaOB + this.getNewProxyInstance;
        }
        return this.QkdxfA;
    }

    public final double AhwBna() {
        com.okinc.kline.library.data.DataSource dataSource = C36246oUr.copydefault().sSMYrx().get(copydefault());
        return dataSource.gEmmrt() < 1 ? AudioStats.AUDIO_AMPLITUDE_NONE : dataSource.AEQbTJ.get(dataSource.DbNXlk() - 1).copydefault();
    }

    public final void KWHzl(android.graphics.Canvas canvas, C36246oUr c36246oUr, oWN own, int i, java.lang.String str) {
        double dCopydefault;
        double dAkhnZx;
        java.util.Map<java.lang.String, java.lang.String> map;
        java.lang.Object obj;
        float f;
        java.lang.CharSequence charSequence;
        java.lang.CharSequence charSequence2;
        java.lang.String str2;
        java.lang.CharSequence charSequence3;
        java.lang.CharSequence charSequence4;
        java.lang.String str3;
        float f2;
        float f3;
        java.lang.String str4;
        android.graphics.Bitmap bitmap;
        float f4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        float f5;
        java.lang.String str8;
        com.okinc.kline.library.data.DataSource dataSource = c36246oUr.sSMYrx().get(copydefault());
        oWK owk = c36246oUr.zLjUOn().getThemes().get(copydefault());
        if (dataSource.gEmmrt() < 1) {
            return;
        }
        DataSource.StateListAnimator stateListAnimator = dataSource.AEQbTJ.get(own.hDKMBd());
        this.OBJEWx = this.RdAHlO.getString(C32392mcI.Dialog.iRxXKY);
        this.djSkpj = this.RdAHlO.getString(C32392mcI.Dialog.fvQaOB);
        this.UeEOUB = this.RdAHlO.getString(C32392mcI.Dialog.flVtFt);
        this.RcXXUw = this.RdAHlO.getString(C32392mcI.Dialog.gasjUx);
        this.QUSxYX = this.RdAHlO.getString(C32392mcI.Dialog.QSBOWP);
        this.RJOkX = this.RdAHlO.getString(C32392mcI.Dialog.gGvvIC);
        this.QKVWgx = this.RdAHlO.getString(C32392mcI.Dialog.hUfVAv);
        this.aKErDB = this.RdAHlO.getString(C32392mcI.Dialog.EZpvd);
        this.hDKMBd = this.RdAHlO.getString(C32392mcI.Dialog.AxsJAYaxsJAY);
        if (c36246oUr.RVsVBY()) {
            java.util.HashMap map2 = new java.util.HashMap();
            map2.put("ccy", c36246oUr.AkhnZx());
            java.util.HashMap map3 = new java.util.HashMap();
            map3.put("ccy", c36246oUr.OuxcSI());
            C43246rlf c43246rlf = C43246rlf.OLrzqt;
            this.QSBOWP = C33069mpW.KWHzl(c43246rlf.valueOf(), C32392mcI.Dialog.getPostValueLengthLimit, map2);
            this.QfsBiF = C33069mpW.KWHzl(c43246rlf.valueOf(), C32392mcI.Dialog.DCUTEI, map3);
        } else {
            this.QSBOWP = this.RdAHlO.getString(C32392mcI.Dialog.gkJEwt);
            this.QfsBiF = this.RdAHlO.getString(C32392mcI.Dialog.iZzfmt);
        }
        this.OuxcSI = this.RdAHlO.getString(C32392mcI.Dialog.AubY);
        this.QOLQEE = this.RdAHlO.getString(C32392mcI.Dialog.getFieldNames);
        this.DTwDnp = "mBuyingCount";
        this.DCJXGO = "mSellingCount";
        this.ORxRYg = "mBsCount";
        if (own.hDKMBd() == 0) {
            double dCopydefault2 = (stateListAnimator.copydefault() - stateListAnimator.AuCTel()) / stateListAnimator.AuCTel();
            dAkhnZx = (stateListAnimator.AkhnZx() - stateListAnimator.values()) / stateListAnimator.AuCTel();
            dCopydefault = dCopydefault2;
        } else {
            DataSource.StateListAnimator stateListAnimator2 = dataSource.AEQbTJ.get(own.hDKMBd() - 1);
            dCopydefault = (stateListAnimator.copydefault() - stateListAnimator2.copydefault()) / stateListAnimator2.copydefault();
            dAkhnZx = (stateListAnimator.AkhnZx() - stateListAnimator.values()) / stateListAnimator2.copydefault();
        }
        java.lang.String strAEQbTJ = pTB.AEQbTJ(pTB.OLrzqt(java.lang.Double.valueOf(dCopydefault)), 2, 2, RoundingMode.HALF_UP);
        c36246oUr.EZpvd((RectF) null);
        this.QKudOq.clear();
        java.util.Map<java.lang.String, java.lang.String> map4 = this.QKudOq;
        if (C36246oUr.copydefault().QVAiDq() == 0) {
            if (C36246oUr.copydefault().QKudOq() == 1) {
                KWHzl(c36246oUr, dataSource, own, stateListAnimator, dCopydefault, dAkhnZx, map4);
                AEQbTJ(canvas, c36246oUr, owk, map4, strAEQbTJ);
                return;
            } else {
                EZpvd(c36246oUr, dataSource, own, stateListAnimator, dCopydefault, dAkhnZx, map4);
                OLrzqt(canvas, c36246oUr, owk, map4, strAEQbTJ);
                return;
            }
        }
        if (owk != null) {
            this.AxsJAY.setColor(owk.getFieldNames());
        }
        java.util.Map<java.lang.String, java.lang.String> map5 = map4;
        OLrzqt(c36246oUr, dataSource, own, stateListAnimator, dCopydefault, dAkhnZx, map5);
        Paint.FontMetrics fontMetrics = this.QVAiDq.getFontMetrics();
        float f6 = fontMetrics.descent - fontMetrics.ascent;
        this.getPostValueLengthLimit.setTextSize(this.hBpjJd);
        float f7 = this.dvKsVJ;
        float f8 = this.getNewProxyInstance;
        float fAubY = c36246oUr.iwGUEr().AubY() + c36246oUr.iwGUEr().AEQbTJ();
        float size = ((map5.size() + 1) * f7) + (map5.size() * f6) + f8;
        this.QVAiDq.setColor(owk.getFieldNames());
        float fMax = 0.0f;
        for (Map.Entry<java.lang.String, java.lang.String> entry : map5.entrySet()) {
            fMax = java.lang.Math.max(fMax, this.QVAiDq.measureText(entry.getKey() + entry.getValue()));
        }
        float f9 = fMax + (5.0f * f8);
        float fAYXKKw = own.AYXKKw(own.hDKMBd());
        ChartArea chartArea = c36246oUr.values().get(EZpvd());
        float f10 = fAubY + size;
        if (f10 > chartArea.KWHzl()) {
            fAubY -= f10 - chartArea.KWHzl();
        }
        float fFIwbmz = fAYXKKw > ((float) (chartArea.fIwbmz() / 2)) ? this.iwGUEr : (chartArea.fIwbmz() - f9) - i;
        this.RlQdEF.set(fFIwbmz, fAubY, f9 + fFIwbmz, size + fAubY);
        KWHzl(this.AxsJAY, this.zSsVtY);
        RectF rectF = this.RlQdEF;
        float f11 = this.ejfBZ;
        canvas.drawRoundRect(rectF, f11, f11, this.AxsJAY);
        copydefault(this.AxsJAY);
        float f12 = fAubY + f8 + (((f6 - fontMetrics.bottom) - fontMetrics.top) / 2.0f);
        boolean zOLrzqt = C55296xhK.OLrzqt(C36246oUr.copydefault().AubY());
        java.lang.String str9 = Marker.ANY_NON_NULL_MARKER;
        java.lang.String str10 = "-";
        java.lang.String str11 = "lite_mode";
        if (zOLrzqt) {
            android.graphics.Bitmap bitmap2 = C36246oUr.copydefault().DarRvM().equalsIgnoreCase("light") ? this.OLrzqt : this.valueOf;
            float f13 = f12;
            for (Map.Entry<java.lang.String, java.lang.String> entry2 : map5.entrySet()) {
                if (entry2.getKey().equals(this.OuxcSI)) {
                    this.getPostValueLengthLimit.setColor(owk.uzCIH());
                    if (!Objects.equals(c36246oUr.fZBcTu(), "defi_mode_dex") && !Objects.equals(c36246oUr.fZBcTu(), str11)) {
                        str8 = str10;
                        canvas.drawText(entry2.getValue(), fFIwbmz + f8 + this.isConnected, f13, this.getPostValueLengthLimit);
                    } else {
                        str8 = str10;
                        canvas.drawText(entry2.getValue(), fFIwbmz + f8, f13, this.getPostValueLengthLimit);
                    }
                    this.getPostValueLengthLimit.setTextAlign(Paint.Align.RIGHT);
                    this.getPostValueLengthLimit.setColor(owk.fJNWhG());
                    canvas.drawText(entry2.getKey(), this.RlQdEF.right - f8, f13, this.getPostValueLengthLimit);
                    if (!Objects.equals(c36246oUr.fZBcTu(), "defi_mode_dex") && !Objects.equals(c36246oUr.fZBcTu(), str11) && bitmap2 != null) {
                        canvas.drawBitmap(bitmap2, this.RlQdEF.left + f8, (f13 - f6) + f7, this.uzCIH);
                    }
                    float f14 = f13;
                    java.lang.String str12 = str8;
                    f3 = f7;
                    str4 = str11;
                    java.lang.String str13 = str9;
                    copydefault(c36246oUr, map5, this.RlQdEF, f14, f6, f8);
                    bitmap = bitmap2;
                    str5 = strAEQbTJ;
                    str6 = str12;
                    str7 = str13;
                    f4 = f14;
                } else {
                    float f15 = f13;
                    java.lang.String str14 = str10;
                    java.lang.String str15 = str9;
                    f3 = f7;
                    java.lang.String str16 = strAEQbTJ;
                    android.graphics.Bitmap bitmap3 = bitmap2;
                    str4 = str11;
                    if (entry2.getKey().equals(this.QOLQEE)) {
                        this.getPostValueLengthLimit.setColor(owk.uzCIH());
                        if (!Objects.equals(c36246oUr.fZBcTu(), "defi_mode_dex") && !Objects.equals(c36246oUr.fZBcTu(), str4)) {
                            f5 = f15;
                            canvas.drawText(entry2.getValue(), fFIwbmz + f8 + this.isConnected, f5, this.getPostValueLengthLimit);
                        } else {
                            f5 = f15;
                            canvas.drawText(entry2.getValue(), fFIwbmz + f8, f5, this.getPostValueLengthLimit);
                        }
                        this.getPostValueLengthLimit.setColor(owk.fIwbmz());
                        this.getPostValueLengthLimit.setTextAlign(Paint.Align.RIGHT);
                        if (!Objects.equals(c36246oUr.fZBcTu(), "defi_mode_dex") && !Objects.equals(c36246oUr.fZBcTu(), str4)) {
                            if (bitmap3 != null) {
                                canvas.drawBitmap(bitmap3, this.RlQdEF.left + f8, (f5 - f6) + f3, this.uzCIH);
                            }
                            java.util.Map<java.lang.String, java.lang.String> map6 = map5;
                            if (!map6.containsKey(this.OuxcSI)) {
                                map5 = map6;
                                bitmap = bitmap3;
                                f4 = f5;
                                copydefault(c36246oUr, map6, this.RlQdEF, f5, f6, f8);
                                canvas.drawText(entry2.getKey(), this.RlQdEF.right - f8, f4, this.getPostValueLengthLimit);
                                str5 = str16;
                                str6 = str14;
                                str7 = str15;
                            } else {
                                map5 = map6;
                                bitmap = bitmap3;
                                f4 = f5;
                                canvas.drawText(entry2.getKey(), this.RlQdEF.right - f8, f4, this.getPostValueLengthLimit);
                                str5 = str16;
                                str6 = str14;
                                str7 = str15;
                            }
                        } else {
                            bitmap = bitmap3;
                            f4 = f5;
                            canvas.drawText(entry2.getKey(), this.RlQdEF.right - f8, f4, this.getPostValueLengthLimit);
                            str5 = str16;
                            str6 = str14;
                            str7 = str15;
                        }
                    } else {
                        bitmap = bitmap3;
                        f4 = f15;
                        this.getPostValueLengthLimit.setColor(owk.getNewProxyInstance());
                        str5 = str16;
                        if (entry2.getKey().equals(this.RJOkX)) {
                            str7 = str15;
                            if (str5.contains(str7)) {
                                this.getPostValueLengthLimit.setColor(owk.fIwbmz());
                                str6 = str14;
                            } else {
                                str6 = str14;
                                if (str5.contains(str6)) {
                                    this.getPostValueLengthLimit.setColor(owk.fJNWhG());
                                } else {
                                    this.getPostValueLengthLimit.setColor(owk.getNewProxyInstance());
                                }
                            }
                        } else {
                            str6 = str14;
                            str7 = str15;
                        }
                        canvas.drawText(entry2.getValue(), fFIwbmz + f8, f4, this.getPostValueLengthLimit);
                        this.getPostValueLengthLimit.setTextAlign(Paint.Align.RIGHT);
                        this.getPostValueLengthLimit.setColor(owk.uzCIH());
                        canvas.drawText(entry2.getKey(), this.RlQdEF.right - f8, f4, this.getPostValueLengthLimit);
                    }
                }
                f13 = f4 + f6 + f3;
                this.getPostValueLengthLimit.setTextAlign(Paint.Align.LEFT);
                bitmap2 = bitmap;
                strAEQbTJ = str5;
                str9 = str7;
                str10 = str6;
                str11 = str4;
                f7 = f3;
            }
            return;
        }
        java.lang.Object obj2 = "lite_mode";
        java.lang.CharSequence charSequence5 = "-";
        java.lang.CharSequence charSequence6 = Marker.ANY_NON_NULL_MARKER;
        java.lang.String str17 = strAEQbTJ;
        android.graphics.Bitmap bitmap4 = C36246oUr.copydefault().DarRvM().equalsIgnoreCase("light") ? this.EZpvd : this.AEQbTJ;
        float f16 = f12;
        for (Map.Entry<java.lang.String, java.lang.String> entry3 : map5.entrySet()) {
            if (entry3.getKey().equals(this.OuxcSI)) {
                this.getPostValueLengthLimit.setColor(owk.fJNWhG());
                canvas.drawText(entry3.getKey(), fFIwbmz + f8, f16, this.getPostValueLengthLimit);
                this.getPostValueLengthLimit.setColor(owk.getNewProxyInstance());
                this.getPostValueLengthLimit.setTextAlign(Paint.Align.RIGHT);
                if (!Objects.equals(c36246oUr.fZBcTu(), "defi_mode_dex") && !Objects.equals(c36246oUr.fZBcTu(), obj2)) {
                    canvas.drawBitmap(bitmap4, (this.RlQdEF.right - f8) - bitmap4.getWidth(), (f16 - f6) + f7, this.uzCIH);
                    float f17 = f16;
                    charSequence3 = charSequence5;
                    charSequence4 = charSequence6;
                    str3 = str17;
                    copydefault(c36246oUr, map5, this.RlQdEF, f17, f6, f8);
                    f2 = f17;
                    canvas.drawText(entry3.getValue(), (this.RlQdEF.right - f8) - this.isConnected, f2, this.getPostValueLengthLimit);
                } else {
                    charSequence3 = charSequence5;
                    charSequence4 = charSequence6;
                    str3 = str17;
                    f2 = f16;
                    canvas.drawText(entry3.getValue(), this.RlQdEF.right - f8, f2, this.getPostValueLengthLimit);
                }
                map = map5;
                obj = obj2;
                charSequence = charSequence3;
                charSequence2 = charSequence4;
                str2 = str3;
                f = f2;
            } else {
                java.lang.CharSequence charSequence7 = charSequence5;
                java.lang.CharSequence charSequence8 = charSequence6;
                java.lang.String str18 = str17;
                float f18 = f16;
                if (entry3.getKey().equals(this.QOLQEE)) {
                    this.getPostValueLengthLimit.setColor(owk.fIwbmz());
                    canvas.drawText(entry3.getKey(), fFIwbmz + f8, f18, this.getPostValueLengthLimit);
                    this.getPostValueLengthLimit.setColor(owk.getNewProxyInstance());
                    this.getPostValueLengthLimit.setTextAlign(Paint.Align.RIGHT);
                    if (!Objects.equals(c36246oUr.fZBcTu(), "defi_mode_dex") && !Objects.equals(c36246oUr.fZBcTu(), obj2)) {
                        canvas.drawText(entry3.getValue(), (this.RlQdEF.right - f8) - this.isConnected, f18, this.getPostValueLengthLimit);
                        canvas.drawBitmap(bitmap4, (this.RlQdEF.right - f8) - bitmap4.getWidth(), (f18 - f6) + f7, this.uzCIH);
                        java.util.Map<java.lang.String, java.lang.String> map7 = map5;
                        if (map7.containsKey(this.OuxcSI)) {
                            map = map7;
                            obj = obj2;
                            f = f18;
                        } else {
                            map = map7;
                            obj = obj2;
                            f = f18;
                            copydefault(c36246oUr, map7, this.RlQdEF, f18, f6, f8);
                        }
                    } else {
                        map = map5;
                        obj = obj2;
                        f = f18;
                        canvas.drawText(entry3.getValue(), this.RlQdEF.right - f8, f, this.getPostValueLengthLimit);
                    }
                    charSequence = charSequence7;
                    charSequence2 = charSequence8;
                    str2 = str18;
                } else {
                    map = map5;
                    obj = obj2;
                    f = f18;
                    this.getPostValueLengthLimit.setColor(owk.uzCIH());
                    canvas.drawText(entry3.getKey(), fFIwbmz + f8, f, this.getPostValueLengthLimit);
                    this.getPostValueLengthLimit.setTextAlign(Paint.Align.RIGHT);
                    this.getPostValueLengthLimit.setColor(owk.getNewProxyInstance());
                    if (entry3.getKey().equals(this.RJOkX)) {
                        charSequence2 = charSequence8;
                        str2 = str18;
                        if (str2.contains(charSequence2)) {
                            this.getPostValueLengthLimit.setColor(owk.fIwbmz());
                            charSequence = charSequence7;
                        } else {
                            charSequence = charSequence7;
                            if (str2.contains(charSequence)) {
                                this.getPostValueLengthLimit.setColor(owk.fJNWhG());
                            } else {
                                this.getPostValueLengthLimit.setColor(owk.getNewProxyInstance());
                            }
                        }
                    } else {
                        charSequence = charSequence7;
                        charSequence2 = charSequence8;
                        str2 = str18;
                    }
                    canvas.drawText(entry3.getValue(), this.RlQdEF.right - f8, f, this.getPostValueLengthLimit);
                }
            }
            f16 = f6 + f7 + f;
            this.getPostValueLengthLimit.setTextAlign(Paint.Align.LEFT);
            str17 = str2;
            charSequence6 = charSequence2;
            charSequence5 = charSequence;
            map5 = map;
            obj2 = obj;
        }
    }

    public final void copydefault(C36246oUr c36246oUr, java.util.Map<java.lang.String, java.lang.String> map, RectF rectF, float f, float f2, float f3) {
        this.AxsJAYaxsJAY.set(rectF.left, f - ((f2 + f3) * 2.0f), rectF.right, rectF.bottom);
        c36246oUr.EZpvd(this.AxsJAYaxsJAY);
    }

    public final void OLrzqt(C36246oUr c36246oUr) {
        this.AxsJAYaxsJAY.setEmpty();
        c36246oUr.EZpvd(this.AxsJAYaxsJAY);
    }

    public final void AEQbTJ(android.graphics.Canvas canvas, C36246oUr c36246oUr, oWK owk, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str) {
        java.lang.String str2;
        java.lang.CharSequence charSequence;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        android.graphics.Bitmap bitmap;
        java.lang.String str7 = str;
        c36246oUr.getNewProxyInstance(true);
        Paint.FontMetrics fontMetrics = this.zuWLRA.getFontMetrics();
        float f = fontMetrics.descent - fontMetrics.ascent;
        this.getPostValueLengthLimit.setTextSize(this.dHguZz);
        this.zuWLRA.setColor(owk.iwGUEr());
        float fEZpvd = C33566myq.EZpvd.EZpvd(C36246oUr.copydefault().AubY());
        float fZuWLRA = C36246oUr.copydefault().zuWLRA();
        this.AxsJAY.setColor(owk.OLrzqt());
        RectF rectF = this.DarRvM;
        float f2 = this.fetchVPNInfo;
        float f3 = -fZuWLRA;
        rectF.set(f2, f3, fEZpvd - f2, 0.0f);
        canvas.drawRoundRect(this.DarRvM, 0.0f, 0.0f, this.AxsJAY);
        float fEZpvd2 = (int) ((fZuWLRA - (EZpvd(map.size()) * f)) / (r10 + 1));
        float f4 = f3 + (((f - fontMetrics.bottom) - fontMetrics.top) / 2.0f) + fEZpvd2;
        int i = this.AuCTel;
        boolean zOLrzqt = C55296xhK.OLrzqt(C36246oUr.copydefault().AubY());
        java.lang.String str8 = "--";
        java.lang.String str9 = "TYPE_KLINE";
        java.lang.String str10 = "-";
        java.lang.String str11 = Marker.ANY_NON_NULL_MARKER;
        if (zOLrzqt) {
            this.getPostValueLengthLimit.setColor(owk.iwGUEr());
            android.graphics.Bitmap bitmap2 = C36246oUr.copydefault().DarRvM().equalsIgnoreCase("light") ? this.OLrzqt : this.valueOf;
            java.util.Iterator<Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
            float f5 = f4;
            while (it.hasNext()) {
                Map.Entry<java.lang.String, java.lang.String> next = it.next();
                java.util.Iterator<Map.Entry<java.lang.String, java.lang.String>> it2 = it;
                java.lang.String str12 = str8;
                this.zuWLRA.setColor(owk.hDKMBd());
                this.getPostValueLengthLimit.setTextAlign(Paint.Align.LEFT);
                if (next.getKey() == this.OBJEWx) {
                    this.getPostValueLengthLimit.setTextAlign(Paint.Align.RIGHT);
                    str3 = str9;
                    canvas.drawText(next.getValue(), fEZpvd - i, f5, this.getPostValueLengthLimit);
                } else {
                    str3 = str9;
                    if (next.getKey() == this.djSkpj || next.getKey() == this.QUSxYX || next.getKey() == this.QKVWgx) {
                        str4 = str10;
                        str5 = str12;
                        str6 = str3;
                        bitmap = bitmap2;
                        canvas.drawText(next.getValue(), this.DarRvM.left, f5, this.zuWLRA);
                        this.getPostValueLengthLimit.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(next.getKey(), (fEZpvd / 2.0f) - i, f5, this.getPostValueLengthLimit);
                    } else if (next.getKey() == this.RJOkX) {
                        if (str7.contains(Marker.ANY_NON_NULL_MARKER)) {
                            this.zuWLRA.setColor(owk.fIwbmz());
                        } else if (str7.contains(str10)) {
                            this.zuWLRA.setColor(owk.fJNWhG());
                        } else {
                            this.zuWLRA.setColor(owk.getNewProxyInstance());
                        }
                        canvas.drawText(next.getValue(), this.DarRvM.left, f5, this.zuWLRA);
                        this.getPostValueLengthLimit.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(next.getKey(), (fEZpvd / 2.0f) - i, f5, this.getPostValueLengthLimit);
                        if (!map.containsKey(this.QfsBiF)) {
                        }
                        str4 = str10;
                        str5 = str12;
                        str6 = str3;
                        bitmap = bitmap2;
                    } else {
                        if (next.getKey() == this.UeEOUB || next.getKey() == this.RcXXUw) {
                            str4 = str10;
                            str5 = str12;
                            str6 = str3;
                            bitmap = bitmap2;
                            canvas.drawText(next.getValue(), (fEZpvd / 2.0f) + i, f5, this.zuWLRA);
                            this.getPostValueLengthLimit.setTextAlign(Paint.Align.RIGHT);
                            canvas.drawText(next.getKey(), this.DarRvM.right, f5, this.getPostValueLengthLimit);
                        } else if (next.getKey() == this.QSBOWP || next.getKey() == this.QfsBiF) {
                            str4 = str10;
                            str6 = str3;
                            if (c36246oUr.UeEOUB() == str6) {
                                canvas.drawText(next.getValue(), (fEZpvd / 2.0f) + i, f5, this.zuWLRA);
                                this.getPostValueLengthLimit.setTextAlign(Paint.Align.RIGHT);
                                canvas.drawText(next.getKey(), this.DarRvM.right, f5, this.getPostValueLengthLimit);
                                str5 = str12;
                                bitmap = bitmap2;
                            } else {
                                str5 = str12;
                                canvas.drawText(str5, (fEZpvd / 2.0f) + i, f5, this.zuWLRA);
                                this.getPostValueLengthLimit.setTextAlign(Paint.Align.RIGHT);
                                bitmap = bitmap2;
                                canvas.drawText(next.getKey(), this.DarRvM.right, f5, this.getPostValueLengthLimit);
                            }
                        } else if (next.getKey() == this.hDKMBd) {
                            canvas.drawText(next.getValue(), this.DarRvM.left, f5, this.zuWLRA);
                            this.getPostValueLengthLimit.setTextAlign(Paint.Align.RIGHT);
                            canvas.drawText(next.getKey(), (fEZpvd / 2.0f) - i, f5, this.getPostValueLengthLimit);
                        } else {
                            if (next.getKey() == this.QOLQEE) {
                                str4 = str10;
                                canvas.drawBitmap(this.djBIcL, this.DarRvM.left, f5 - this.AhwBna, this.OcIXYQ);
                                this.getPostValueLengthLimit.setColor(owk.fIwbmz());
                                canvas.drawText(next.getValue(), this.DarRvM.left + this.values, f5, this.zuWLRA);
                                canvas.drawText(next.getKey(), this.DarRvM.left + this.getPostValueLengthLimit.measureText(next.getKey()) + this.fARcdN, f5, this.getPostValueLengthLimit);
                            } else {
                                str4 = str10;
                                if (next.getKey() == this.DTwDnp) {
                                    canvas.drawText(next.getValue(), this.DarRvM.left + this.getPostValueLengthLimit.measureText(this.QOLQEE) + this.AuCTel + this.getPostValueLengthLimit.measureText(map.get(this.QOLQEE)) + this.isConnected, f5, this.getPostValueLengthLimit);
                                    this.getPostValueLengthLimit.setTextAlign(Paint.Align.RIGHT);
                                    canvas.drawBitmap(bitmap2, this.DarRvM.right - bitmap2.getWidth(), (f5 - this.AhwBna) + this.fJNWhG, this.uzCIH);
                                    f5 += f + fEZpvd2;
                                    OLrzqt(c36246oUr);
                                } else if (next.getKey() == this.OuxcSI) {
                                    canvas.drawBitmap(this.gwTjWJ, this.DarRvM.left, f5 - this.AhwBna, this.OcIXYQ);
                                    this.zuWLRA.setColor(owk.fJNWhG());
                                    canvas.drawText(next.getValue(), this.DarRvM.left + this.values, f5, this.zuWLRA);
                                    canvas.drawText(next.getKey(), this.DarRvM.left + this.getPostValueLengthLimit.measureText(next.getKey()) + this.fARcdN, f5, this.getPostValueLengthLimit);
                                } else if (next.getKey() == this.DCJXGO) {
                                    canvas.drawText(next.getValue(), this.DarRvM.left + this.getPostValueLengthLimit.measureText(this.OuxcSI) + this.AuCTel + this.getPostValueLengthLimit.measureText(map.get(this.OuxcSI)) + this.isConnected, f5, this.getPostValueLengthLimit);
                                    this.getPostValueLengthLimit.setTextAlign(Paint.Align.RIGHT);
                                    canvas.drawBitmap(bitmap2, this.DarRvM.right - bitmap2.getWidth(), (f5 - this.AhwBna) + this.fJNWhG, this.uzCIH);
                                    OLrzqt(c36246oUr);
                                }
                            }
                            str5 = str12;
                            str6 = str3;
                            bitmap = bitmap2;
                        }
                        f5 += f + fEZpvd2;
                    }
                    str9 = str6;
                    bitmap2 = bitmap;
                    str10 = str4;
                    str8 = str5;
                    it = it2;
                }
                f5 += f + fEZpvd2;
                str4 = str10;
                str5 = str12;
                str6 = str3;
                bitmap = bitmap2;
                str9 = str6;
                bitmap2 = bitmap;
                str10 = str4;
                str8 = str5;
                it = it2;
            }
            return;
        }
        java.lang.String str13 = "--";
        java.lang.CharSequence charSequence2 = "-";
        android.graphics.Bitmap bitmap3 = C36246oUr.copydefault().DarRvM().equalsIgnoreCase("light") ? this.EZpvd : this.AEQbTJ;
        java.util.Iterator<Map.Entry<java.lang.String, java.lang.String>> it3 = map.entrySet().iterator();
        float f6 = f4;
        while (it3.hasNext()) {
            Map.Entry<java.lang.String, java.lang.String> next2 = it3.next();
            java.util.Iterator<Map.Entry<java.lang.String, java.lang.String>> it4 = it3;
            java.lang.String str14 = str13;
            this.getPostValueLengthLimit.setColor(owk.hDKMBd());
            this.getPostValueLengthLimit.setTextAlign(Paint.Align.LEFT);
            if (next2.getKey() == this.OBJEWx) {
                canvas.drawText(next2.getValue(), this.DarRvM.left, f6, this.getPostValueLengthLimit);
                f6 += f + fEZpvd2;
                str2 = str11;
                charSequence = charSequence2;
            } else if (next2.getKey() == this.djSkpj || next2.getKey() == this.QUSxYX || next2.getKey() == this.QKVWgx) {
                str2 = str11;
                str13 = str14;
                canvas.drawText(next2.getKey(), this.DarRvM.left, f6, this.zuWLRA);
                this.getPostValueLengthLimit.setTextAlign(Paint.Align.RIGHT);
                canvas.drawText(next2.getValue(), (fEZpvd / 2.0f) - i, f6, this.getPostValueLengthLimit);
                str7 = str;
                it3 = it4;
                str11 = str2;
            } else {
                if (next2.getKey() == this.RJOkX) {
                    if (str7.contains(str11)) {
                        this.getPostValueLengthLimit.setColor(owk.fIwbmz());
                        charSequence = charSequence2;
                    } else {
                        charSequence = charSequence2;
                        if (str7.contains(charSequence)) {
                            this.getPostValueLengthLimit.setColor(owk.fJNWhG());
                        } else {
                            this.getPostValueLengthLimit.setColor(owk.getNewProxyInstance());
                        }
                    }
                    str2 = str11;
                    canvas.drawText(next2.getKey(), this.DarRvM.left, f6, this.zuWLRA);
                    this.getPostValueLengthLimit.setTextAlign(Paint.Align.RIGHT);
                    canvas.drawText(next2.getValue(), (fEZpvd / 2.0f) - i, f6, this.getPostValueLengthLimit);
                    if (!map.containsKey(this.QfsBiF)) {
                    }
                } else {
                    str2 = str11;
                    charSequence = charSequence2;
                    if (next2.getKey() == this.UeEOUB || next2.getKey() == this.RcXXUw) {
                        charSequence2 = charSequence;
                        str13 = str14;
                        canvas.drawText(next2.getKey(), (fEZpvd / 2.0f) + i, f6, this.zuWLRA);
                        this.getPostValueLengthLimit.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(next2.getValue(), this.DarRvM.right, f6, this.getPostValueLengthLimit);
                    } else if (next2.getKey() == this.QSBOWP || next2.getKey() == this.QfsBiF) {
                        charSequence2 = charSequence;
                        if (c36246oUr.UeEOUB() == "TYPE_KLINE") {
                            canvas.drawText(next2.getKey(), (fEZpvd / 2.0f) + i, f6, this.zuWLRA);
                            this.getPostValueLengthLimit.setTextAlign(Paint.Align.RIGHT);
                            canvas.drawText(next2.getValue(), this.DarRvM.right, f6, this.getPostValueLengthLimit);
                            str13 = str14;
                        } else {
                            canvas.drawText(next2.getKey(), (fEZpvd / 2.0f) + i, f6, this.zuWLRA);
                            this.getPostValueLengthLimit.setTextAlign(Paint.Align.RIGHT);
                            str13 = str14;
                            canvas.drawText(str13, this.DarRvM.right, f6, this.getPostValueLengthLimit);
                        }
                    } else if (next2.getKey() == this.hDKMBd) {
                        canvas.drawText(next2.getKey(), this.DarRvM.left, f6, this.zuWLRA);
                        this.getPostValueLengthLimit.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(next2.getValue(), (fEZpvd / 2.0f) - i, f6, this.getPostValueLengthLimit);
                    } else {
                        if (next2.getKey() == this.QOLQEE) {
                            charSequence2 = charSequence;
                            canvas.drawBitmap(this.djBIcL, this.DarRvM.left, f6 - this.AhwBna, this.OcIXYQ);
                            this.zuWLRA.setColor(owk.fIwbmz());
                            canvas.drawText(next2.getKey(), this.DarRvM.left + this.values, f6, this.zuWLRA);
                            canvas.drawText(next2.getValue(), this.DarRvM.left + this.getPostValueLengthLimit.measureText(next2.getKey()) + this.fARcdN, f6, this.getPostValueLengthLimit);
                        } else {
                            charSequence2 = charSequence;
                            if (next2.getKey() == this.DTwDnp) {
                                canvas.drawText(next2.getValue(), this.DarRvM.left + this.getPostValueLengthLimit.measureText(this.QOLQEE) + this.AuCTel + this.getPostValueLengthLimit.measureText(map.get(this.QOLQEE)) + this.isConnected, f6, this.getPostValueLengthLimit);
                                this.getPostValueLengthLimit.setTextAlign(Paint.Align.RIGHT);
                                canvas.drawBitmap(bitmap3, this.DarRvM.right - bitmap3.getWidth(), (f6 - this.AhwBna) + this.fJNWhG, this.uzCIH);
                                f6 += f + fEZpvd2;
                                OLrzqt(c36246oUr);
                            } else if (next2.getKey() == this.OuxcSI) {
                                canvas.drawBitmap(this.gwTjWJ, this.DarRvM.left, f6 - this.AhwBna, this.OcIXYQ);
                                this.zuWLRA.setColor(owk.fJNWhG());
                                canvas.drawText(next2.getKey(), this.DarRvM.left + this.values, f6, this.zuWLRA);
                                canvas.drawText(next2.getValue(), this.DarRvM.left + this.getPostValueLengthLimit.measureText(next2.getKey()) + this.fARcdN, f6, this.getPostValueLengthLimit);
                            } else if (next2.getKey() == this.DCJXGO) {
                                canvas.drawText(next2.getValue(), this.DarRvM.left + this.getPostValueLengthLimit.measureText(this.OuxcSI) + this.AuCTel + this.getPostValueLengthLimit.measureText(map.get(this.OuxcSI)) + this.isConnected, f6, this.getPostValueLengthLimit);
                                this.getPostValueLengthLimit.setTextAlign(Paint.Align.RIGHT);
                                canvas.drawBitmap(bitmap3, this.DarRvM.right - bitmap3.getWidth(), (f6 - this.AhwBna) + this.fJNWhG, this.uzCIH);
                                OLrzqt(c36246oUr);
                            }
                        }
                        str13 = str14;
                        str7 = str;
                        it3 = it4;
                        str11 = str2;
                    }
                    f6 += f + fEZpvd2;
                    str7 = str;
                    it3 = it4;
                    str11 = str2;
                }
                f6 += f + fEZpvd2;
            }
            charSequence2 = charSequence;
            str13 = str14;
            str7 = str;
            it3 = it4;
            str11 = str2;
        }
    }

    public final void OLrzqt(android.graphics.Canvas canvas, C36246oUr c36246oUr, oWK owk, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str) {
        float fMeasureText;
        float fMeasureText2;
        int i;
        c36246oUr.getNewProxyInstance(true);
        Paint.FontMetrics fontMetrics = this.zuWLRA.getFontMetrics();
        float f = fontMetrics.descent - fontMetrics.ascent;
        this.getPostValueLengthLimit.setTextSize(this.dHguZz);
        this.zuWLRA.setColor(owk.iwGUEr());
        float fEZpvd = C33566myq.EZpvd.EZpvd(C36246oUr.copydefault().AubY());
        float fZuWLRA = C36246oUr.copydefault().zuWLRA();
        float fRcXXUw = (-fZuWLRA) + c36246oUr.RcXXUw();
        this.AxsJAY.setColor(owk.OLrzqt());
        this.DXXBbs.set(0.0f, fRcXXUw, fEZpvd, c36246oUr.RcXXUw());
        canvas.drawRoundRect(this.DXXBbs, 0.0f, 0.0f, this.AxsJAY);
        float f2 = (int) ((fZuWLRA - (4 * f)) / 5);
        float f3 = fRcXXUw + (((f - fontMetrics.bottom) - fontMetrics.top) / 2.0f) + f2;
        float fAEQbTJ = this.DXXBbs.left;
        android.graphics.Bitmap bitmap = C36246oUr.copydefault().DarRvM().equalsIgnoreCase("light") ? this.EZpvd : this.AEQbTJ;
        for (Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            this.getPostValueLengthLimit.setColor(owk.hDKMBd());
            this.getPostValueLengthLimit.setTextAlign(Paint.Align.LEFT);
            if (entry.getKey() == this.OBJEWx) {
                canvas.drawText(entry.getValue(), this.DXXBbs.left, f3, this.getPostValueLengthLimit);
                f3 += f + f2;
            } else if (entry.getKey() == this.djSkpj || entry.getKey() == this.QUSxYX || entry.getKey() == this.UeEOUB || entry.getKey() == this.RcXXUw || entry.getKey() == this.QKVWgx || entry.getKey() == this.RJOkX || entry.getKey() == this.hDKMBd || entry.getKey() == this.QfsBiF || entry.getKey() == this.QSBOWP) {
                canvas.drawText(entry.getKey(), fAEQbTJ, f3, this.zuWLRA);
                if (entry.getKey() == this.RJOkX) {
                    if (str.contains(Marker.ANY_NON_NULL_MARKER)) {
                        this.getPostValueLengthLimit.setColor(owk.fIwbmz());
                    } else if (str.contains("-")) {
                        this.getPostValueLengthLimit.setColor(owk.fJNWhG());
                    } else {
                        this.getPostValueLengthLimit.setColor(owk.getNewProxyInstance());
                    }
                }
                float f4 = f + f2;
                float f5 = f3 + f4;
                canvas.drawText(entry.getValue(), fAEQbTJ, f5, this.getPostValueLengthLimit);
                fAEQbTJ += AEQbTJ(this.getPostValueLengthLimit, entry.getKey(), entry.getValue());
                f3 = f5 - f4;
            } else {
                if (entry.getKey() == this.QOLQEE) {
                    float f6 = this.DXXBbs.left;
                    f3 += (f + f2) * 2.0f;
                    canvas.drawBitmap(this.djBIcL, f6, f3 - this.AhwBna, this.OcIXYQ);
                    float f7 = f6 + this.values;
                    this.zuWLRA.setColor(owk.fIwbmz());
                    canvas.drawText(entry.getKey(), f7, f3, this.zuWLRA);
                    fMeasureText = f7 + this.getPostValueLengthLimit.measureText(entry.getKey()) + this.AuCTel;
                    canvas.drawText(entry.getValue(), fMeasureText, f3, this.getPostValueLengthLimit);
                    fMeasureText2 = this.getPostValueLengthLimit.measureText(entry.getValue());
                    i = this.AuCTel;
                } else if (entry.getKey() == this.DTwDnp) {
                    if (!map.containsKey(this.OuxcSI)) {
                        canvas.drawText(entry.getValue(), fAEQbTJ, f3, this.getPostValueLengthLimit);
                        fAEQbTJ += this.getPostValueLengthLimit.measureText(entry.getValue()) + this.iwGUEr;
                        canvas.drawBitmap(this.EZpvd, fAEQbTJ, (f3 - this.AhwBna) + this.fJNWhG, this.uzCIH);
                        OLrzqt(c36246oUr);
                    }
                } else if (entry.getKey() == this.OuxcSI) {
                    if (!map.containsKey(this.QOLQEE)) {
                        fAEQbTJ = this.DXXBbs.left;
                        f3 += (f + f2) * 2.0f;
                    }
                    canvas.drawBitmap(this.gwTjWJ, fAEQbTJ, f3 - this.AhwBna, this.OcIXYQ);
                    float f8 = fAEQbTJ + this.values;
                    this.zuWLRA.setColor(owk.fJNWhG());
                    canvas.drawText(entry.getKey(), f8, f3, this.zuWLRA);
                    fMeasureText = f8 + this.getPostValueLengthLimit.measureText(entry.getKey()) + this.AuCTel;
                    canvas.drawText(entry.getValue(), fMeasureText, f3, this.getPostValueLengthLimit);
                    fMeasureText2 = this.getPostValueLengthLimit.measureText(entry.getValue());
                    i = this.AuCTel;
                } else if (entry.getKey() == this.DCJXGO) {
                    if (!map.containsKey(this.QOLQEE)) {
                        canvas.drawText(entry.getValue(), fAEQbTJ, f3, this.getPostValueLengthLimit);
                        fAEQbTJ += this.getPostValueLengthLimit.measureText(entry.getValue()) + this.iwGUEr;
                        canvas.drawBitmap(bitmap, fAEQbTJ, (f3 - this.AhwBna) + this.fJNWhG, this.uzCIH);
                        OLrzqt(c36246oUr);
                    }
                } else if (entry.getKey() == this.ORxRYg) {
                    canvas.drawText(entry.getValue(), fAEQbTJ, f3, this.getPostValueLengthLimit);
                    fAEQbTJ += this.getPostValueLengthLimit.measureText(entry.getValue()) + this.iwGUEr;
                    canvas.drawBitmap(bitmap, fAEQbTJ, (f3 - this.AhwBna) + this.fJNWhG, this.uzCIH);
                    OLrzqt(c36246oUr);
                }
                fAEQbTJ = fMeasureText + fMeasureText2 + i;
            }
        }
    }

    public final float AEQbTJ(android.graphics.Paint paint, java.lang.String str, java.lang.String str2) {
        return java.lang.Math.max(paint.measureText(str), paint.measureText(str2)) + this.fARcdN;
    }

    public final void OLrzqt(C36246oUr c36246oUr, com.okinc.kline.library.data.DataSource dataSource, oWN own, DataSource.StateListAnimator stateListAnimator, double d, double d2, java.util.Map<java.lang.String, java.lang.String> map) {
        map.clear();
        if (c36246oUr.zLjUOn().isCeFiMCapMode()) {
            this.accept.setTime(stateListAnimator.AhwBna());
            map.put(this.OBJEWx, pTA.KWHzl(this.accept, OKDateEnum.DATE_FORMAT_SIMPLE_MD, AEQbTJ(this.hrNTAI) ? OKTimeEnum.TIME_FORMAT_SIMPLE : OKTimeEnum.TIME_FORMAT_SIMPLE_HM));
            map.put(this.aKErDB, C38305pTw.AEQbTJ(pTB.OLrzqt(java.lang.Double.valueOf(stateListAnimator.copydefault())), Currency.getInstance(java.util.Locale.US).getCurrencyCode(), RoundingMode.HALF_UP, C38307pTy.Companion.EZpvd(2), DisplaySign.AUTO, Notation.COMPACT_SHORT));
            return;
        }
        this.accept.setTime(stateListAnimator.AhwBna());
        map.put(this.OBJEWx, pTA.KWHzl(this.accept, OKDateEnum.DATE_FORMAT_SIMPLE_MD, AEQbTJ(this.hrNTAI) ? OKTimeEnum.TIME_FORMAT_SIMPLE : OKTimeEnum.TIME_FORMAT_SIMPLE_HM));
        map.put(this.djSkpj, AbstractC36302oWt.AYXKKw(stateListAnimator.AuCTel()));
        map.put(this.UeEOUB, AbstractC36302oWt.AYXKKw(stateListAnimator.AkhnZx()));
        map.put(this.RcXXUw, AbstractC36302oWt.AYXKKw(stateListAnimator.values()));
        map.put(this.QUSxYX, AbstractC36302oWt.AYXKKw(stateListAnimator.copydefault()));
        map.put(this.QKVWgx, copydefault(own.hDKMBd(), dataSource.AEQbTJ));
        java.lang.String str = this.RJOkX;
        BigDecimal bigDecimalOLrzqt = pTB.OLrzqt(java.lang.Double.valueOf(d));
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        map.put(str, pTB.AEQbTJ(bigDecimalOLrzqt, 2, 2, roundingMode));
        map.put(this.hDKMBd, pTB.EZpvd(pTB.OLrzqt(java.lang.Double.valueOf(d2)), 2, 2, roundingMode));
        if (c36246oUr.UeEOUB() == "TYPE_KLINE") {
            map.put(this.QSBOWP, copydefault(c36246oUr, stateListAnimator));
            java.lang.String strAEQbTJ = AEQbTJ(c36246oUr, stateListAnimator);
            if (strAEQbTJ != null) {
                map.put(this.QfsBiF, strAEQbTJ);
            }
        }
        if (c36246oUr.DWgRXt()) {
            if (!stateListAnimator.KWHzl().isEmpty() && !"0".equals(stateListAnimator.KWHzl())) {
                map.put(this.QOLQEE, AbstractC36302oWt.AYXKKw(java.lang.Double.parseDouble(stateListAnimator.AEQbTJ())) + " " + stateListAnimator.OLrzqt());
            }
            if (stateListAnimator.fIwbmz().isEmpty() || "0".equals(stateListAnimator.fIwbmz())) {
                return;
            }
            map.put(this.OuxcSI, AbstractC36302oWt.AYXKKw(java.lang.Double.parseDouble(stateListAnimator.iwGUEr())) + " " + stateListAnimator.ejfBZ());
        }
    }

    public final void KWHzl(C36246oUr c36246oUr, com.okinc.kline.library.data.DataSource dataSource, oWN own, DataSource.StateListAnimator stateListAnimator, double d, double d2, java.util.Map<java.lang.String, java.lang.String> map) {
        map.clear();
        if (c36246oUr.zLjUOn().isCeFiMCapMode()) {
            this.accept.setTime(stateListAnimator.AhwBna());
            map.put(this.OBJEWx, pTA.KWHzl(this.accept, OKDateEnum.DATE_FORMAT_SIMPLE_MD, AEQbTJ(this.hrNTAI) ? OKTimeEnum.TIME_FORMAT_SIMPLE : OKTimeEnum.TIME_FORMAT_SIMPLE_HM));
            map.put(this.aKErDB, C38305pTw.AEQbTJ(pTB.OLrzqt(java.lang.Double.valueOf(stateListAnimator.copydefault())), Currency.getInstance(java.util.Locale.US).getCurrencyCode(), RoundingMode.HALF_UP, C38307pTy.Companion.EZpvd(2), DisplaySign.AUTO, Notation.COMPACT_SHORT));
            return;
        }
        this.accept.setTime(stateListAnimator.AhwBna());
        map.put(this.OBJEWx, pTA.KWHzl(this.accept, OKDateEnum.DATE_FORMAT_SIMPLE_MD, AEQbTJ(this.hrNTAI) ? OKTimeEnum.TIME_FORMAT_SIMPLE : OKTimeEnum.TIME_FORMAT_SIMPLE_HM));
        map.put(this.djSkpj, AbstractC36302oWt.AYXKKw(stateListAnimator.AuCTel()));
        map.put(this.UeEOUB, AbstractC36302oWt.AYXKKw(stateListAnimator.AkhnZx()));
        map.put(this.QUSxYX, AbstractC36302oWt.AYXKKw(stateListAnimator.copydefault()));
        map.put(this.RcXXUw, AbstractC36302oWt.AYXKKw(stateListAnimator.values()));
        map.put(this.QKVWgx, copydefault(own.hDKMBd(), dataSource.AEQbTJ));
        map.put(this.QSBOWP, copydefault(c36246oUr, stateListAnimator));
        java.lang.String str = this.RJOkX;
        BigDecimal bigDecimalOLrzqt = pTB.OLrzqt(java.lang.Double.valueOf(d));
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        map.put(str, pTB.AEQbTJ(bigDecimalOLrzqt, 2, 2, roundingMode));
        java.lang.String strAEQbTJ = AEQbTJ(c36246oUr, stateListAnimator);
        if (strAEQbTJ != null) {
            map.put(this.QfsBiF, strAEQbTJ);
        } else {
            map.put(this.QfsBiF, "--");
        }
        map.put(this.hDKMBd, pTB.EZpvd(pTB.OLrzqt(java.lang.Double.valueOf(d2)), 2, 2, roundingMode));
        if (c36246oUr.DWgRXt()) {
            if (!stateListAnimator.KWHzl().isEmpty() && !"0".equals(stateListAnimator.KWHzl())) {
                map.put(this.QOLQEE, AbstractC36302oWt.AYXKKw(java.lang.Double.parseDouble(stateListAnimator.AEQbTJ())));
                map.put(this.DTwDnp, stateListAnimator.OLrzqt());
            }
            if (!stateListAnimator.fIwbmz().isEmpty() && !"0".equals(stateListAnimator.fIwbmz())) {
                map.put(this.OuxcSI, AbstractC36302oWt.AYXKKw(java.lang.Double.parseDouble(stateListAnimator.iwGUEr())));
                map.put(this.DCJXGO, stateListAnimator.ejfBZ());
            }
            if (stateListAnimator.KWHzl().isEmpty() || "0".equals(stateListAnimator.KWHzl()) || stateListAnimator.fIwbmz().isEmpty() || "0".equals(stateListAnimator.fIwbmz())) {
                return;
            }
            map.put(this.ORxRYg, stateListAnimator.EZpvd());
        }
    }

    public final void EZpvd(C36246oUr c36246oUr, com.okinc.kline.library.data.DataSource dataSource, oWN own, DataSource.StateListAnimator stateListAnimator, double d, double d2, java.util.Map<java.lang.String, java.lang.String> map) {
        map.clear();
        if (c36246oUr.zLjUOn().isCeFiMCapMode()) {
            this.accept.setTime(stateListAnimator.AhwBna());
            map.put(this.OBJEWx, pTA.KWHzl(this.accept, OKDateEnum.DATE_FORMAT_SIMPLE_MD, AEQbTJ(this.hrNTAI) ? OKTimeEnum.TIME_FORMAT_SIMPLE : OKTimeEnum.TIME_FORMAT_SIMPLE_HM));
            map.put(this.aKErDB, C38305pTw.AEQbTJ(pTB.OLrzqt(java.lang.Double.valueOf(stateListAnimator.copydefault())), Currency.getInstance(java.util.Locale.US).getCurrencyCode(), RoundingMode.HALF_UP, C38307pTy.Companion.EZpvd(2), DisplaySign.AUTO, Notation.COMPACT_SHORT));
            return;
        }
        this.accept.setTime(stateListAnimator.AhwBna());
        map.put(this.OBJEWx, pTA.KWHzl(this.accept, OKDateEnum.DATE_FORMAT_SIMPLE_MD, AEQbTJ(this.hrNTAI) ? OKTimeEnum.TIME_FORMAT_SIMPLE : OKTimeEnum.TIME_FORMAT_SIMPLE_HM));
        map.put(this.djSkpj, AbstractC36302oWt.AYXKKw(stateListAnimator.AuCTel()));
        map.put(this.QUSxYX, AbstractC36302oWt.AYXKKw(stateListAnimator.copydefault()));
        map.put(this.UeEOUB, AbstractC36302oWt.AYXKKw(stateListAnimator.AkhnZx()));
        map.put(this.RcXXUw, AbstractC36302oWt.AYXKKw(stateListAnimator.values()));
        map.put(this.QKVWgx, copydefault(own.hDKMBd(), dataSource.AEQbTJ));
        java.lang.String str = this.RJOkX;
        BigDecimal bigDecimalOLrzqt = pTB.OLrzqt(java.lang.Double.valueOf(d));
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        map.put(str, pTB.AEQbTJ(bigDecimalOLrzqt, 2, 2, roundingMode));
        map.put(this.hDKMBd, pTB.EZpvd(pTB.OLrzqt(java.lang.Double.valueOf(d2)), 2, 2, roundingMode));
        java.lang.String strAEQbTJ = AEQbTJ(c36246oUr, stateListAnimator);
        if (strAEQbTJ != null) {
            map.put(this.QfsBiF, strAEQbTJ);
        }
        map.put(this.QSBOWP, copydefault(c36246oUr, stateListAnimator));
        if (c36246oUr.DWgRXt()) {
            if (!stateListAnimator.KWHzl().isEmpty() && !"0".equals(stateListAnimator.KWHzl())) {
                map.put(this.QOLQEE, AbstractC36302oWt.AYXKKw(java.lang.Double.parseDouble(stateListAnimator.AEQbTJ())));
                map.put(this.DTwDnp, stateListAnimator.OLrzqt());
            }
            if (!stateListAnimator.fIwbmz().isEmpty() && !"0".equals(stateListAnimator.fIwbmz())) {
                map.put(this.OuxcSI, AbstractC36302oWt.AYXKKw(java.lang.Double.parseDouble(stateListAnimator.iwGUEr())));
                map.put(this.DCJXGO, stateListAnimator.ejfBZ());
            }
            if (stateListAnimator.KWHzl().isEmpty() || "0".equals(stateListAnimator.KWHzl()) || stateListAnimator.fIwbmz().isEmpty() || "0".equals(stateListAnimator.fIwbmz())) {
                return;
            }
            map.put(this.ORxRYg, stateListAnimator.EZpvd());
        }
    }

    public final java.lang.String copydefault(C36246oUr c36246oUr, DataSource.StateListAnimator stateListAnimator) {
        if (c36246oUr.RVsVBY()) {
            return pTB.AEQbTJ(pTB.OLrzqt(java.lang.Double.valueOf(stateListAnimator.AubY())), RoundingMode.DOWN, C38307pTy.Companion.EZpvd(2));
        }
        return pTB.AEQbTJ(pTB.OLrzqt(java.lang.Double.valueOf(stateListAnimator.zsXlph())), RoundingMode.DOWN, C38307pTy.Companion.EZpvd(2));
    }

    public final java.lang.String AEQbTJ(C36246oUr c36246oUr, DataSource.StateListAnimator stateListAnimator) {
        if (c36246oUr.RVsVBY()) {
            double dWlaJM = stateListAnimator.wlaJM();
            if (dWlaJM > AudioStats.AUDIO_AMPLITUDE_NONE) {
                return pTB.AEQbTJ(pTB.OLrzqt(java.lang.Double.valueOf(dWlaJM)), RoundingMode.DOWN, C38307pTy.Companion.EZpvd(2));
            }
            return null;
        }
        java.lang.String strZLjUOn = stateListAnimator.zLjUOn();
        if (strZLjUOn == null || strZLjUOn.isEmpty() || strZLjUOn.equals("0")) {
            return null;
        }
        return strZLjUOn;
    }

    public final java.lang.String copydefault(int i, DataSource.DataArrayList<DataSource.StateListAnimator> dataArrayList) {
        if (dataArrayList.isEmpty() || i > dataArrayList.size() - 1) {
            return "--";
        }
        if (i == 0 || dataArrayList.size() == 1) {
            return AbstractC36302oWt.AYXKKw(dataArrayList.get(0).copydefault() - dataArrayList.get(0).AuCTel());
        }
        return AbstractC36302oWt.AYXKKw(dataArrayList.get(i).copydefault() - dataArrayList.get(i - 1).copydefault());
    }

    private int AEQbTJ(java.lang.String str) {
        return (int) (this.QVAiDq.measureText(str) + this.finit + this.fFgQHt);
    }
}
