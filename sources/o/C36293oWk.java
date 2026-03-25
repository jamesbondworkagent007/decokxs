package o;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.VectorDrawable;
import androidx.camera.video.AudioStats;
import androidx.core.content.ContextCompat;
import com.okinc.kline.library.data.DataSource;
import com.okinc.kline.library.drawline.DrawLineData;
import com.okinc.kline.library.layout.ChartArea;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import o.C32392mcI;
import o.C52761wXj;
import o.pDT;

/* JADX INFO: renamed from: o.oWk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36293oWk extends AbstractC36302oWt {
    public static final float[] AEQbTJ = {10.0f, 0.0f};
    public static final float[] EZpvd = {10.0f, 10.0f};
    public int AYXKKw;
    public java.lang.String AhwBna;
    public int AkhnZx;
    public java.lang.String AuCTel;
    public android.graphics.Paint AuCTelauCTel;
    public final android.graphics.Paint AubY;
    public final android.graphics.Path AwvSrB;
    public final android.graphics.Paint AxsJAY;
    public final android.graphics.Path DTwDnp;
    public int DbNXlk;
    public final android.graphics.drawable.Drawable KWHzl;
    public final int OLrzqt;
    public final android.graphics.Paint ORxRYg;
    public final float[] OcIXYQ;
    public final RectF QKVWgx;
    public final float[] QOLQEE;
    public C36246oUr QUSxYX;
    public final android.graphics.Paint QVAiDq;
    public final DashPathEffect QbewEr;
    public int QfsBiF;
    public float RJOkX;
    public int UeEOUB;
    public java.lang.String aKErDB;
    public final VectorDrawable dNCPSb;
    public int djBIcL;
    public java.lang.String djSkpj;
    public boolean ejfBZ;
    public final VectorDrawable fARcdN;
    public final float fIwbmz;
    public final android.graphics.Paint fJNWhG;
    public int fetchVPNInfo;
    public int gEmmrt;
    public final float[] gHZMYf;
    public final android.graphics.Paint getFieldNames;
    public final RectF getNewProxyInstance;
    public final int hDKMBd;
    public int isConnected;
    public final DashPathEffect iwGUEr;
    public final android.graphics.Paint sSMYrx;
    public final int uzCIH;
    public int valueOf;
    public int values;
    public final android.graphics.Paint wlaJM;
    public android.graphics.Paint zLjUOn;
    public android.graphics.Paint zsXlph;
    public android.graphics.Paint zuBGHE;

    @Override // o.AbstractC36302oWt
    public void KWHzl() {
    }

    public C36293oWk(java.lang.String str) {
        super(str);
        this.ejfBZ = false;
        this.QbewEr = new DashPathEffect(AEQbTJ, 0.0f);
        this.iwGUEr = new DashPathEffect(EZpvd, 0.0f);
        this.AwvSrB = new android.graphics.Path();
        this.DTwDnp = new android.graphics.Path();
        this.QKVWgx = new RectF();
        this.getNewProxyInstance = new RectF();
        this.gHZMYf = new float[2];
        this.QOLQEE = new float[2];
        this.OcIXYQ = new float[2];
        this.AhwBna = "";
        this.AuCTel = "";
        this.aKErDB = "";
        this.djSkpj = "";
        this.djBIcL = AbstractC36302oWt.copydefault(1.0f);
        this.isConnected = AbstractC36302oWt.copydefault(4.0f);
        this.DbNXlk = AbstractC36302oWt.copydefault(6.0f);
        this.fetchVPNInfo = AbstractC36302oWt.copydefault(8.0f);
        this.valueOf = AbstractC36302oWt.copydefault(12.0f);
        this.gEmmrt = AbstractC36302oWt.copydefault(14.0f);
        this.AYXKKw = AbstractC36302oWt.copydefault(18.0f);
        this.AkhnZx = AbstractC36302oWt.copydefault(22.0f);
        this.values = AbstractC36302oWt.copydefault(50.0f);
        this.OLrzqt = AbstractC36302oWt.copydefault(14.0f);
        this.uzCIH = AbstractC36302oWt.copydefault(16.0f);
        this.hDKMBd = AbstractC36302oWt.copydefault(16.0f);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.wlaJM = paint;
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.AubY = paint2;
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.fJNWhG = paint3;
        paint3.setAntiAlias(true);
        paint3.setStrokeWidth(this.djBIcL);
        paint3.setStyle(style);
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.ORxRYg = paint4;
        paint4.setAntiAlias(true);
        paint4.setStyle(style);
        android.graphics.Paint paint5 = new android.graphics.Paint();
        this.getFieldNames = paint5;
        paint5.setAntiAlias(true);
        paint5.setStrokeWidth(this.djBIcL);
        paint5.setStyle(style);
        android.graphics.Paint paint6 = new android.graphics.Paint();
        this.QVAiDq = paint6;
        paint6.setAntiAlias(true);
        paint6.setStrokeWidth(this.djBIcL);
        paint6.setTextSize(AbstractC36302oWt.KWHzl(9.0f));
        paint6.setStyle(style);
        android.graphics.Paint paint7 = new android.graphics.Paint();
        this.AxsJAY = paint7;
        paint7.setAntiAlias(true);
        paint7.setStrokeWidth(this.djBIcL);
        paint7.setStyle(style);
        android.graphics.Paint paint8 = new android.graphics.Paint();
        this.sSMYrx = paint8;
        paint8.setAntiAlias(true);
        paint8.setStyle(style);
        this.fIwbmz = paint7.getFontMetrics().top;
        Paint.FontMetrics fontMetrics = paint6.getFontMetrics();
        this.QfsBiF = (int) java.lang.Math.ceil(fontMetrics.bottom - fontMetrics.top);
        this.RJOkX = (-(r3 >> 1)) - fontMetrics.top;
        this.fARcdN = (VectorDrawable) C33070mpX.KWHzl(C52761wXj.TaskDescription.invokespecialgBtXYZ);
        this.dNCPSb = (VectorDrawable) C33070mpX.KWHzl(C52761wXj.TaskDescription.ODCBUN);
        this.KWHzl = C33070mpX.KWHzl(C32392mcI.Activity.EZpvd);
        android.graphics.Paint paint9 = new android.graphics.Paint();
        this.zLjUOn = paint9;
        paint9.setStyle(style);
        android.graphics.Paint paint10 = new android.graphics.Paint();
        this.AuCTelauCTel = paint10;
        paint10.setAntiAlias(true);
        this.AuCTelauCTel.setStyle(style);
        this.AuCTelauCTel.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        android.graphics.Paint paint11 = this.AuCTelauCTel;
        C55051xce c55051xce = C55051xce.OLrzqt;
        paint11.setTypeface(c55051xce.AEQbTJ("harmony_sans_regular.ttf"));
        android.graphics.Paint paint12 = new android.graphics.Paint();
        this.zsXlph = paint12;
        paint12.setAntiAlias(true);
        this.zsXlph.setStyle(style);
        this.zsXlph.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        this.zsXlph.setColor(-1);
        this.zsXlph.setTypeface(c55051xce.AEQbTJ("harmony_sans_regular.ttf"));
        android.graphics.Paint paint13 = new android.graphics.Paint();
        this.zuBGHE = paint13;
        paint13.setAntiAlias(true);
        this.zuBGHE.setStyle(style);
        this.zuBGHE.setTextSize(AbstractC36302oWt.KWHzl(12.0f));
        this.zuBGHE.setTypeface(c55051xce.AEQbTJ("harmony_sans_regular.ttf"));
        C43246rlf c43246rlf = C43246rlf.OLrzqt;
        this.AhwBna = c43246rlf.valueOf().getString(C32392mcI.Dialog.hCLrkq);
        this.AuCTel = c43246rlf.valueOf().getString(C32392mcI.Dialog.DBxZfM);
        this.aKErDB = c43246rlf.valueOf().getString(C32392mcI.Dialog.DGOPHZDGOPHZ);
        this.djSkpj = c43246rlf.valueOf().getString(C32392mcI.Dialog.OTwTPd);
    }

    @Override // o.AbstractC36302oWt
    public void OLrzqt(oWK owk) {
        this.fJNWhG.setColor(owk.ejfBZ());
        this.getFieldNames.setColor(owk.OLrzqt());
        this.ORxRYg.setColor(owk.ejfBZ());
    }

    /* JADX WARN: Removed duplicated region for block: B:193:0x0984  */
    @Override // o.AbstractC36302oWt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void AEQbTJ(android.graphics.Canvas canvas) {
        int i;
        java.util.ArrayList<DrawLineData.DrawLineItem> arrayList;
        ChartArea chartArea;
        com.okinc.kline.library.data.DataSource dataSource;
        boolean z;
        boolean z2;
        int i2;
        DrawLineData.DrawLineItem drawLineItem;
        oWC owc;
        int i3;
        oWN own;
        java.lang.Exception exc;
        float fAYXKKw;
        float fAYXKKw2;
        java.util.ArrayList<DrawLineData.Line> arrayList2;
        java.util.ArrayList<DrawLineData.Line> arrayList3;
        float fAYXKKw3;
        float f;
        float fAYXKKw4;
        java.util.ArrayList<DrawLineData.Line> arrayList4;
        int i4;
        oWN own2;
        oWN own3;
        java.util.ArrayList<DrawLineData.Line> arrayList5;
        float f2;
        java.util.ArrayList<DrawLineData.Line> arrayList6;
        java.lang.Exception e;
        java.util.ArrayList<DrawLineData.Line> arrayList7;
        float fAYXKKw5;
        float fAYXKKw6;
        int i5;
        int i6;
        oWN own4;
        java.util.ArrayList<DrawLineData.Line> arrayList8;
        java.util.Iterator<DrawLineData.DrawLineFiboBean> it;
        float fAYXKKw7;
        float fAYXKKw8;
        double d;
        double d2;
        float fOLrzqt;
        oUU ouu;
        double d3;
        double d4;
        oWN own5;
        oWC owc2;
        int i7;
        int i8;
        android.graphics.Canvas canvas2 = canvas;
        this.ejfBZ = false;
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        this.QUSxYX = c36246oUrCopydefault;
        this.UeEOUB = c36246oUrCopydefault.ODWQjV();
        java.util.ArrayList<DrawLineData.DrawLineItem> arrayList9 = new java.util.ArrayList<>();
        if (this.QUSxYX.RdAHlO()) {
            arrayList9 = C36246oUr.copydefault().dxcTrN();
        } else {
            for (DrawLineData.DrawLineItem drawLineItem2 : DrawLineData.copydefault.EZpvd()) {
                java.lang.String contract = drawLineItem2.getContract();
                oUJ ouj = oUJ.KWHzl;
                if (contract.equals(ouj.AEQbTJ().getCoinId()) && drawLineItem2.getKlineType() == ouj.AEQbTJ().getType().intValue()) {
                    arrayList9.add(drawLineItem2);
                }
            }
        }
        java.util.ArrayList<DrawLineData.DrawLineItem> arrayList10 = arrayList9;
        ChartArea chartArea2 = this.QUSxYX.values().get(EZpvd());
        if (this.zhUgOk || C36246oUr.copydefault().QwvEab() || this.QUSxYX.USBtdM() || this.QUSxYX.zLjUOn().isCeFiMCapMode() || (this.QUSxYX.zLjUOn().isMarketCap() && Objects.equals(this.QUSxYX.fZBcTu(), "defi_mode_dex"))) {
            if (arrayList10.isEmpty() || !this.QUSxYX.fERRXa() || this.QUSxYX.QSBOWP() || this.QUSxYX.USBtdM() || this.QUSxYX.zLjUOn().isCeFiMCapMode()) {
                C36246oUr.copydefault().iwGUEr().AkhnZx(null);
                return;
            } else {
                AEQbTJ(canvas2, chartArea2);
                return;
            }
        }
        int iAYXKKw = chartArea2.AYXKKw();
        int iDbNXlk = chartArea2.DbNXlk();
        canvas.save();
        canvas2.clipRect(iAYXKKw, chartArea2.AuCTel(), iDbNXlk, chartArea2.KWHzl());
        oWC owc3 = this.QUSxYX.iwGUEr().QVAiDq().get(EZpvd());
        oWN own6 = this.QUSxYX.DCJXGO().get("ds0");
        com.okinc.kline.library.data.DataSource dataSource2 = this.QUSxYX.sSMYrx().get("ds0");
        java.util.ArrayList<DrawLineData.Line> arrayList11 = new java.util.ArrayList<>();
        int i9 = 2;
        if (dataSource2.AEQbTJ.size() < 2) {
            return;
        }
        boolean z3 = true;
        long jAhwBna = dataSource2.AEQbTJ.get(1).AhwBna();
        long jAhwBna2 = dataSource2.AEQbTJ.get(0).AhwBna();
        java.util.ArrayList<DrawLineData.Line> arrayList12 = arrayList11;
        for (DrawLineData.DrawLineItem drawLineItem3 : arrayList10) {
            if (!drawLineItem3.isDelete()) {
                this.ejfBZ = z3;
                int[] iArr = {dataSource2.AEQbTJ.size() - (z3 ? 1 : 0), dataSource2.AEQbTJ.size() - (z3 ? 1 : 0), dataSource2.AEQbTJ.size() - (z3 ? 1 : 0)};
                int i10 = 0;
                while (i10 < drawLineItem3.getDotList().size() && (drawLineItem3.getLineType() == DrawLineData.LineType.G_TRIANGLE || i10 <= i9)) {
                    iArr[i10] = OLrzqt(drawLineItem3.getDotList().get(i10).getTime());
                    i10++;
                    dataSource2 = dataSource2;
                    i9 = 2;
                }
                com.okinc.kline.library.data.DataSource dataSource3 = dataSource2;
                try {
                    java.lang.String strEZpvd = EZpvd(drawLineItem3);
                    java.lang.String strOLrzqt = OLrzqt(drawLineItem3);
                    this.AxsJAY.setColor(Color.parseColor(strEZpvd));
                    this.QVAiDq.setColor(Color.parseColor(strEZpvd));
                    if (strOLrzqt.isEmpty()) {
                        this.wlaJM.setColor(Color.parseColor(strEZpvd));
                    } else {
                        this.wlaJM.setColor(Color.parseColor(strOLrzqt));
                    }
                    this.AubY.setColor(Color.parseColor(strEZpvd));
                } catch (java.lang.Exception e2) {
                    e2.toString();
                    drawLineItem3.getLinecolor();
                }
                this.AxsJAY.setStrokeWidth(AbstractC36302oWt.copydefault(drawLineItem3.getLinewidth()));
                this.AubY.setStrokeWidth(AbstractC36302oWt.copydefault(drawLineItem3.getLinewidth()));
                if (drawLineItem3.getLinestyle() == 0) {
                    this.AxsJAY.setStyle(Paint.Style.FILL);
                    this.AxsJAY.setPathEffect(this.QbewEr);
                } else {
                    this.AxsJAY.setStyle(Paint.Style.STROKE);
                    this.AxsJAY.setPathEffect(this.iwGUEr);
                }
                try {
                    switch (AnonymousClass2.OLrzqt[drawLineItem3.getLineType().ordinal()]) {
                        case 1:
                            i = iAYXKKw;
                            arrayList = arrayList10;
                            chartArea = chartArea2;
                            dataSource = dataSource3;
                            i2 = 2;
                            drawLineItem = drawLineItem3;
                            owc = owc3;
                            i3 = iDbNXlk;
                            own = own6;
                            try {
                                fAYXKKw = own.AYXKKw(iArr[0]);
                                try {
                                    fAYXKKw2 = own.AYXKKw(iArr[1]);
                                    try {
                                        canvas.drawLine(fAYXKKw, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), fAYXKKw2, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), this.AxsJAY);
                                        try {
                                            drawLineItem.getDotList().get(0).setX(fAYXKKw);
                                            drawLineItem.getDotList().get(0).setY(owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()));
                                            z2 = true;
                                            try {
                                                drawLineItem.getDotList().get(1).setX(fAYXKKw2);
                                                try {
                                                    drawLineItem.getDotList().get(1).setY(owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()));
                                                    AEQbTJ(canvas, owc, drawLineItem, fAYXKKw, fAYXKKw2);
                                                    arrayList2 = new java.util.ArrayList<>();
                                                    try {
                                                        z = false;
                                                    } catch (java.lang.Exception e3) {
                                                        e = e3;
                                                        z = false;
                                                    }
                                                } catch (java.lang.Exception e4) {
                                                    e = e4;
                                                    z = false;
                                                    exc = e;
                                                    pUU.copydefault("DrawLinePlotter", "drawline: " + exc.toString() + " lineType = " + drawLineItem.getLineType());
                                                    canvas2 = canvas;
                                                    own6 = own;
                                                    iDbNXlk = i3;
                                                    z3 = z2;
                                                    owc3 = owc;
                                                    dataSource2 = dataSource;
                                                    chartArea2 = chartArea;
                                                    arrayList10 = arrayList;
                                                    iAYXKKw = i;
                                                    i9 = i2;
                                                    break;
                                                }
                                            } catch (java.lang.Exception e5) {
                                                e = e5;
                                                z = false;
                                            }
                                        } catch (java.lang.Exception e6) {
                                            e = e6;
                                            z = false;
                                            z2 = true;
                                            exc = e;
                                            pUU.copydefault("DrawLinePlotter", "drawline: " + exc.toString() + " lineType = " + drawLineItem.getLineType());
                                            canvas2 = canvas;
                                            own6 = own;
                                            iDbNXlk = i3;
                                            z3 = z2;
                                            owc3 = owc;
                                            dataSource2 = dataSource;
                                            chartArea2 = chartArea;
                                            arrayList10 = arrayList;
                                            iAYXKKw = i;
                                            i9 = i2;
                                            break;
                                        }
                                    } catch (java.lang.Exception e7) {
                                        e = e7;
                                        z = false;
                                    }
                                } catch (java.lang.Exception e8) {
                                    e = e8;
                                    z = false;
                                    z2 = true;
                                }
                            } catch (java.lang.Exception e9) {
                                e = e9;
                                z = false;
                            }
                            try {
                                arrayList2.add(new DrawLineData.Line(fAYXKKw, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), fAYXKKw2, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice())));
                                drawLineItem.setLinePositionList(arrayList2);
                                arrayList12 = arrayList2;
                            } catch (java.lang.Exception e10) {
                                e = e10;
                                arrayList12 = arrayList2;
                                exc = e;
                                pUU.copydefault("DrawLinePlotter", "drawline: " + exc.toString() + " lineType = " + drawLineItem.getLineType());
                            }
                            break;
                        case 2:
                            i = iAYXKKw;
                            arrayList = arrayList10;
                            chartArea = chartArea2;
                            dataSource = dataSource3;
                            i2 = 2;
                            drawLineItem = drawLineItem3;
                            owc = owc3;
                            i3 = iDbNXlk;
                            own = own6;
                            float fAYXKKw9 = own.AYXKKw(iArr[0]);
                            float fAYXKKw10 = own.AYXKKw(iArr[1]);
                            java.util.ArrayList<DrawLineData.Line> arrayList13 = new java.util.ArrayList<>();
                            try {
                                if (drawLineItem.getDotList().size() <= 1) {
                                    float f3 = i3;
                                    canvas.drawLine(fAYXKKw9, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), f3, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), this.AxsJAY);
                                    arrayList13.add(new DrawLineData.Line(fAYXKKw9, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), f3, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice())));
                                } else if (fAYXKKw9 != fAYXKKw10 || drawLineItem.getDotList().get(0).getPrice() != drawLineItem.getDotList().get(1).getPrice()) {
                                    float f4 = fAYXKKw10 > fAYXKKw9 ? i3 : 0.0f;
                                    canvas.drawLine(fAYXKKw9, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), f4, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), this.AxsJAY);
                                    arrayList13.add(new DrawLineData.Line(fAYXKKw9, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), f4, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice())));
                                }
                                drawLineItem.setLinePositionList(arrayList13);
                                drawLineItem.getDotList().get(0).setX(fAYXKKw9);
                                drawLineItem.getDotList().get(0).setY(owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()));
                                if (drawLineItem.getDotList().size() > 1) {
                                    drawLineItem.getDotList().get(1).setX(fAYXKKw10);
                                    drawLineItem.getDotList().get(1).setY(owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()));
                                }
                                AEQbTJ(canvas, owc, drawLineItem, fAYXKKw9, fAYXKKw10);
                                arrayList3 = arrayList13;
                                arrayList12 = arrayList3;
                                z = false;
                                z2 = true;
                            } catch (java.lang.Exception e11) {
                                exc = e11;
                                arrayList12 = arrayList13;
                                z = false;
                                z2 = true;
                                pUU.copydefault("DrawLinePlotter", "drawline: " + exc.toString() + " lineType = " + drawLineItem.getLineType());
                            }
                            break;
                        case 3:
                            i = iAYXKKw;
                            arrayList = arrayList10;
                            chartArea = chartArea2;
                            dataSource = dataSource3;
                            i2 = 2;
                            drawLineItem = drawLineItem3;
                            owc = owc3;
                            i3 = iDbNXlk;
                            own = own6;
                            try {
                                fAYXKKw3 = own.AYXKKw(iArr[0]);
                                drawLineItem.getDotList().get(0).setX(fAYXKKw3);
                                drawLineItem.getDotList().get(0).setY(owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()));
                                f = i;
                            } catch (java.lang.Exception e12) {
                                e = e12;
                            }
                            try {
                                float f5 = i3;
                                i = i;
                                canvas.drawLine(f, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), f5, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), this.AxsJAY);
                                AEQbTJ(canvas, owc, drawLineItem, fAYXKKw3, -1.0f);
                                arrayList3 = new java.util.ArrayList<>();
                                try {
                                    arrayList3.add(new DrawLineData.Line(f, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), f5, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice())));
                                    drawLineItem.setLinePositionList(arrayList3);
                                    arrayList12 = arrayList3;
                                    z = false;
                                    z2 = true;
                                } catch (java.lang.Exception e13) {
                                    arrayList12 = arrayList3;
                                    exc = e13;
                                    z = false;
                                    z2 = true;
                                    pUU.copydefault("DrawLinePlotter", "drawline: " + exc.toString() + " lineType = " + drawLineItem.getLineType());
                                }
                            } catch (java.lang.Exception e14) {
                                e = e14;
                                i = i;
                                exc = e;
                                z = false;
                                z2 = true;
                                pUU.copydefault("DrawLinePlotter", "drawline: " + exc.toString() + " lineType = " + drawLineItem.getLineType());
                                canvas2 = canvas;
                                own6 = own;
                                iDbNXlk = i3;
                                z3 = z2;
                                owc3 = owc;
                                dataSource2 = dataSource;
                                chartArea2 = chartArea;
                                arrayList10 = arrayList;
                                iAYXKKw = i;
                                i9 = i2;
                                break;
                            }
                            break;
                        case 4:
                            oWN own7 = own6;
                            int i11 = iDbNXlk;
                            i = iAYXKKw;
                            arrayList = arrayList10;
                            chartArea = chartArea2;
                            dataSource = dataSource3;
                            i2 = 2;
                            drawLineItem = drawLineItem3;
                            owc = owc3;
                            try {
                                this.QVAiDq.setTextAlign(Paint.Align.LEFT);
                                own = own7;
                                try {
                                    fAYXKKw4 = own.AYXKKw(iArr[0]);
                                    i3 = i11;
                                    float f6 = i3;
                                    try {
                                        canvas.drawLine(fAYXKKw4, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), f6, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), this.AxsJAY);
                                        arrayList4 = new java.util.ArrayList<>();
                                        try {
                                            arrayList4.add(new DrawLineData.Line(fAYXKKw4, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), f6, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice())));
                                            drawLineItem.setLinePositionList(arrayList4);
                                            drawLineItem.getDotList().get(0).setX(fAYXKKw4);
                                            drawLineItem.getDotList().get(0).setY(owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()));
                                            AEQbTJ(canvas, owc, drawLineItem, fAYXKKw4, -1.0f);
                                        } catch (java.lang.Exception e15) {
                                            e = e15;
                                        }
                                    } catch (java.lang.Exception e16) {
                                        e = e16;
                                        exc = e;
                                        z = false;
                                        z2 = true;
                                        pUU.copydefault("DrawLinePlotter", "drawline: " + exc.toString() + " lineType = " + drawLineItem.getLineType());
                                        canvas2 = canvas;
                                        own6 = own;
                                        iDbNXlk = i3;
                                        z3 = z2;
                                        owc3 = owc;
                                        dataSource2 = dataSource;
                                        chartArea2 = chartArea;
                                        arrayList10 = arrayList;
                                        iAYXKKw = i;
                                        i9 = i2;
                                        break;
                                    }
                                } catch (java.lang.Exception e17) {
                                    e = e17;
                                    i3 = i11;
                                }
                            } catch (java.lang.Exception e18) {
                                e = e18;
                                i3 = i11;
                                own = own7;
                            }
                            try {
                                canvas.drawText(AbstractC36302oWt.AYXKKw(drawLineItem.getDotList().get(0).getPrice()), fAYXKKw4 + this.valueOf, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()) + (this.fIwbmz / 3.0f), this.QVAiDq);
                                arrayList3 = arrayList4;
                                arrayList12 = arrayList3;
                                z = false;
                                z2 = true;
                            } catch (java.lang.Exception e19) {
                                e = e19;
                                exc = e;
                                arrayList12 = arrayList4;
                                z = false;
                                z2 = true;
                                pUU.copydefault("DrawLinePlotter", "drawline: " + exc.toString() + " lineType = " + drawLineItem.getLineType());
                            }
                            break;
                        case 5:
                            i4 = iDbNXlk;
                            i = iAYXKKw;
                            arrayList = arrayList10;
                            chartArea = chartArea2;
                            dataSource = dataSource3;
                            i2 = 2;
                            drawLineItem = drawLineItem3;
                            own2 = own6;
                            owc = owc3;
                            try {
                                float fAYXKKw11 = own2.AYXKKw(iArr[0]);
                                float fAYXKKw12 = own2.AYXKKw(iArr[1]);
                                float fFIwbmz = chartArea.fIwbmz() * 3;
                                float f7 = fAYXKKw11 - fFIwbmz;
                                float f8 = fFIwbmz / (fAYXKKw12 - fAYXKKw11);
                                float fOLrzqt2 = owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()) - ((owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()) - owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice())) * f8);
                                float f9 = fAYXKKw12 + fFIwbmz;
                                float fOLrzqt3 = owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()) + (f8 * (owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()) - owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice())));
                                java.util.ArrayList<DrawLineData.Line> arrayList14 = new java.util.ArrayList<>();
                                if (fAYXKKw11 == fAYXKKw12) {
                                    try {
                                        arrayList5 = arrayList14;
                                        try {
                                            f2 = fOLrzqt3;
                                            if (drawLineItem.getDotList().get(0).getPrice() == drawLineItem.getDotList().get(1).getPrice()) {
                                                own3 = own2;
                                                arrayList6 = arrayList5;
                                            }
                                            drawLineItem.setLinePositionList(arrayList6);
                                            drawLineItem.getDotList().get(0).setX(fAYXKKw11);
                                            drawLineItem.getDotList().get(0).setY(owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()));
                                            drawLineItem.getDotList().get(1).setX(fAYXKKw12);
                                            drawLineItem.getDotList().get(1).setY(owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()));
                                            AEQbTJ(canvas, owc, drawLineItem, fAYXKKw11, fAYXKKw12);
                                            arrayList3 = arrayList6;
                                            i3 = i4;
                                            own = own3;
                                            arrayList12 = arrayList3;
                                            z = false;
                                            z2 = true;
                                        } catch (java.lang.Exception e20) {
                                            e = e20;
                                            exc = e;
                                            arrayList12 = arrayList5;
                                            own = own2;
                                            i3 = i4;
                                            z = false;
                                            z2 = true;
                                            pUU.copydefault("DrawLinePlotter", "drawline: " + exc.toString() + " lineType = " + drawLineItem.getLineType());
                                            canvas2 = canvas;
                                            own6 = own;
                                            iDbNXlk = i3;
                                            z3 = z2;
                                            owc3 = owc;
                                            dataSource2 = dataSource;
                                            chartArea2 = chartArea;
                                            arrayList10 = arrayList;
                                            iAYXKKw = i;
                                            i9 = i2;
                                        }
                                    } catch (java.lang.Exception e21) {
                                        e = e21;
                                        arrayList5 = arrayList14;
                                    }
                                } else {
                                    arrayList5 = arrayList14;
                                    f2 = fOLrzqt3;
                                }
                                if (fAYXKKw11 == fAYXKKw12) {
                                    try {
                                        arrayList7 = arrayList5;
                                    } catch (java.lang.Exception e22) {
                                        e = e22;
                                        arrayList7 = arrayList5;
                                    }
                                    try {
                                        canvas.drawLine(fAYXKKw11, chartArea.AuCTel(), fAYXKKw11, chartArea.KWHzl(), this.AxsJAY);
                                        arrayList7.add(new DrawLineData.Line(fAYXKKw11, chartArea.AuCTel(), fAYXKKw11, chartArea.KWHzl()));
                                        arrayList6 = arrayList7;
                                        own3 = own2;
                                    } catch (java.lang.Exception e23) {
                                        e = e23;
                                        exc = e;
                                        arrayList12 = arrayList7;
                                        own = own2;
                                        i3 = i4;
                                        z = false;
                                        z2 = true;
                                        pUU.copydefault("DrawLinePlotter", "drawline: " + exc.toString() + " lineType = " + drawLineItem.getLineType());
                                    }
                                } else {
                                    java.util.ArrayList<DrawLineData.Line> arrayList15 = arrayList5;
                                    try {
                                        arrayList6 = arrayList15;
                                        float f10 = f2;
                                        own3 = own2;
                                        try {
                                            canvas.drawLine(f7, fOLrzqt2, f9, f10, this.AxsJAY);
                                            arrayList6.add(new DrawLineData.Line(f7, fOLrzqt2, f9, f10));
                                        } catch (java.lang.Exception e24) {
                                            e = e24;
                                            exc = e;
                                            arrayList12 = arrayList6;
                                            i3 = i4;
                                            own = own3;
                                            z = false;
                                            z2 = true;
                                            pUU.copydefault("DrawLinePlotter", "drawline: " + exc.toString() + " lineType = " + drawLineItem.getLineType());
                                        }
                                    } catch (java.lang.Exception e25) {
                                        e = e25;
                                        arrayList6 = arrayList15;
                                        own3 = own2;
                                        exc = e;
                                        arrayList12 = arrayList6;
                                        i3 = i4;
                                        own = own3;
                                        z = false;
                                        z2 = true;
                                        pUU.copydefault("DrawLinePlotter", "drawline: " + exc.toString() + " lineType = " + drawLineItem.getLineType());
                                    }
                                }
                                drawLineItem.setLinePositionList(arrayList6);
                                drawLineItem.getDotList().get(0).setX(fAYXKKw11);
                                drawLineItem.getDotList().get(0).setY(owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()));
                                drawLineItem.getDotList().get(1).setX(fAYXKKw12);
                                drawLineItem.getDotList().get(1).setY(owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()));
                                AEQbTJ(canvas, owc, drawLineItem, fAYXKKw11, fAYXKKw12);
                                arrayList3 = arrayList6;
                                i3 = i4;
                                own = own3;
                                arrayList12 = arrayList3;
                                z = false;
                                z2 = true;
                            } catch (java.lang.Exception e26) {
                                e = e26;
                                own3 = own2;
                                exc = e;
                                i3 = i4;
                                own = own3;
                                z = false;
                                z2 = true;
                                pUU.copydefault("DrawLinePlotter", "drawline: " + exc.toString() + " lineType = " + drawLineItem.getLineType());
                                canvas2 = canvas;
                                own6 = own;
                                iDbNXlk = i3;
                                z3 = z2;
                                owc3 = owc;
                                dataSource2 = dataSource;
                                chartArea2 = chartArea;
                                arrayList10 = arrayList;
                                iAYXKKw = i;
                                i9 = i2;
                            }
                            break;
                        case 6:
                            i4 = iDbNXlk;
                            arrayList = arrayList10;
                            chartArea = chartArea2;
                            dataSource = dataSource3;
                            i2 = 2;
                            drawLineItem = drawLineItem3;
                            own2 = own6;
                            owc = owc3;
                            int i12 = iAYXKKw;
                            try {
                                float fAYXKKw13 = own2.AYXKKw(iArr[0]);
                                float fAYXKKw14 = own2.AYXKKw(iArr[1]);
                                java.util.ArrayList<DrawLineData.Line> arrayList16 = new java.util.ArrayList<>();
                                try {
                                    int iFIwbmz = chartArea.fIwbmz() * 3;
                                    if (fAYXKKw13 == fAYXKKw14) {
                                        try {
                                            if (drawLineItem.getDotList().get(0).getPrice() == drawLineItem.getDotList().get(1).getPrice()) {
                                                i = i12;
                                            } else if (fAYXKKw13 < fAYXKKw14) {
                                                float f11 = iFIwbmz;
                                                float f12 = fAYXKKw14 + f11;
                                                float f13 = f11 / (fAYXKKw14 - fAYXKKw13);
                                                i = i12;
                                                try {
                                                    canvas.drawLine(fAYXKKw13, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), f12, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()) + ((owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()) - owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice())) * f13), this.AxsJAY);
                                                    arrayList16.add(new DrawLineData.Line(fAYXKKw13, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), f12, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()) + (f13 * (owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()) - owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice())))));
                                                } catch (java.lang.Exception e27) {
                                                    e = e27;
                                                    exc = e;
                                                    arrayList12 = arrayList16;
                                                    own = own2;
                                                    i3 = i4;
                                                    z = false;
                                                    z2 = true;
                                                    pUU.copydefault("DrawLinePlotter", "drawline: " + exc.toString() + " lineType = " + drawLineItem.getLineType());
                                                }
                                                break;
                                            } else {
                                                i = i12;
                                                if (fAYXKKw13 > fAYXKKw14) {
                                                    float f14 = iFIwbmz;
                                                    float f15 = fAYXKKw14 - f14;
                                                    float f16 = f14 / (fAYXKKw14 - fAYXKKw13);
                                                    canvas.drawLine(fAYXKKw13, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), f15, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()) - ((owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()) - owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice())) * f16), this.AxsJAY);
                                                    arrayList16.add(new DrawLineData.Line(fAYXKKw13, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), f15, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()) - (f16 * (owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()) - owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice())))));
                                                } else if (drawLineItem.getDotList().get(0).getPrice() > drawLineItem.getDotList().get(1).getPrice()) {
                                                    canvas.drawLine(fAYXKKw13, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), fAYXKKw13, chartArea.KWHzl(), this.AxsJAY);
                                                    arrayList16.add(new DrawLineData.Line(fAYXKKw13, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), fAYXKKw13, chartArea.KWHzl()));
                                                } else {
                                                    canvas.drawLine(fAYXKKw13, chartArea.AuCTel(), fAYXKKw13, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), this.AxsJAY);
                                                    arrayList16.add(new DrawLineData.Line(fAYXKKw13, chartArea.AuCTel(), fAYXKKw13, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice())));
                                                }
                                            }
                                            drawLineItem.setLinePositionList(arrayList16);
                                            drawLineItem.getDotList().get(0).setX(fAYXKKw13);
                                            drawLineItem.getDotList().get(0).setY(owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()));
                                            drawLineItem.getDotList().get(1).setX(fAYXKKw14);
                                            drawLineItem.getDotList().get(1).setY(owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()));
                                            AEQbTJ(canvas, owc, drawLineItem, fAYXKKw13, fAYXKKw14);
                                            arrayList3 = arrayList16;
                                            own = own2;
                                            i3 = i4;
                                            arrayList12 = arrayList3;
                                            z = false;
                                            z2 = true;
                                        } catch (java.lang.Exception e28) {
                                            exc = e28;
                                            i = i12;
                                            arrayList12 = arrayList16;
                                            own = own2;
                                            i3 = i4;
                                            z = false;
                                            z2 = true;
                                            pUU.copydefault("DrawLinePlotter", "drawline: " + exc.toString() + " lineType = " + drawLineItem.getLineType());
                                        }
                                        break;
                                    }
                                } catch (java.lang.Exception e29) {
                                    e = e29;
                                    i = i12;
                                }
                            } catch (java.lang.Exception e30) {
                                i = i12;
                                exc = e30;
                            }
                            break;
                        case 7:
                            i4 = iDbNXlk;
                            arrayList = arrayList10;
                            chartArea = chartArea2;
                            dataSource = dataSource3;
                            i2 = 2;
                            drawLineItem = drawLineItem3;
                            own2 = own6;
                            owc = owc3;
                            int i13 = iAYXKKw;
                            try {
                                fAYXKKw5 = own2.AYXKKw(iArr[0]);
                                fAYXKKw6 = own2.AYXKKw(iArr[1]);
                                canvas.drawLine(fAYXKKw5, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), fAYXKKw6, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), this.AxsJAY);
                                drawLineItem.getDotList().get(0).setX(fAYXKKw5);
                                drawLineItem.getDotList().get(0).setY(owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()));
                                drawLineItem.getDotList().get(1).setX(fAYXKKw6);
                                drawLineItem.getDotList().get(1).setY(owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()));
                                AEQbTJ(canvas, owc, drawLineItem, fAYXKKw5, fAYXKKw6);
                                arrayList3 = new java.util.ArrayList<>();
                            } catch (java.lang.Exception e31) {
                                exc = e31;
                                i = i13;
                            }
                            try {
                                arrayList3.add(new DrawLineData.Line(fAYXKKw5, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), fAYXKKw6, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice())));
                                drawLineItem.setLinePositionList(arrayList3);
                                i = i13;
                                own = own2;
                                i3 = i4;
                                arrayList12 = arrayList3;
                                z = false;
                                z2 = true;
                            } catch (java.lang.Exception e32) {
                                arrayList12 = arrayList3;
                                exc = e32;
                                i = i13;
                                own = own2;
                                i3 = i4;
                                z = false;
                                z2 = true;
                                pUU.copydefault("DrawLinePlotter", "drawline: " + exc.toString() + " lineType = " + drawLineItem.getLineType());
                            }
                            break;
                        case 8:
                            oWN own8 = own6;
                            i4 = iDbNXlk;
                            int i14 = iAYXKKw;
                            arrayList = arrayList10;
                            chartArea = chartArea2;
                            dataSource = dataSource3;
                            i2 = 2;
                            drawLineItem = drawLineItem3;
                            owc = owc3;
                            try {
                                try {
                                    float fAYXKKw15 = own8.AYXKKw(iArr[0]);
                                    float fAYXKKw16 = own8.AYXKKw(iArr[1]);
                                    canvas.drawLine(fAYXKKw15, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), fAYXKKw16, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), this.AxsJAY);
                                    drawLineItem.getDotList().get(0).setX(fAYXKKw15);
                                    drawLineItem.getDotList().get(0).setY(owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()));
                                    drawLineItem.getDotList().get(1).setX(fAYXKKw16);
                                    drawLineItem.getDotList().get(1).setY(owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()));
                                    AEQbTJ(canvas, owc, drawLineItem, fAYXKKw15, fAYXKKw16);
                                    java.util.ArrayList<DrawLineData.Line> arrayList17 = new java.util.ArrayList<>();
                                    try {
                                        arrayList17.add(new DrawLineData.Line(fAYXKKw15, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), fAYXKKw16, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice())));
                                        drawLineItem.setLinePositionList(arrayList17);
                                        arrayList5 = arrayList17;
                                        i6 = i14;
                                        own2 = own8;
                                    } catch (java.lang.Exception e33) {
                                        e = e33;
                                        arrayList5 = arrayList17;
                                        i6 = i14;
                                        own2 = own8;
                                    }
                                } catch (java.lang.Exception e34) {
                                    e = e34;
                                    own2 = own8;
                                    i5 = i14;
                                    exc = e;
                                    i = i5;
                                    own = own2;
                                    i3 = i4;
                                    z = false;
                                    z2 = true;
                                    pUU.copydefault("DrawLinePlotter", "drawline: " + exc.toString() + " lineType = " + drawLineItem.getLineType());
                                    break;
                                }
                            } catch (java.lang.Exception e35) {
                                e = e35;
                                i5 = i14;
                                own2 = own8;
                            }
                            try {
                                KWHzl(canvas, drawLineItem, own8, iArr, dataSource, owc, jAhwBna - jAhwBna2);
                                i = i6;
                                arrayList3 = arrayList5;
                                own = own2;
                                i3 = i4;
                                arrayList12 = arrayList3;
                                z = false;
                                z2 = true;
                            } catch (java.lang.Exception e36) {
                                e = e36;
                                exc = e;
                                i = i6;
                                arrayList12 = arrayList5;
                                own = own2;
                                i3 = i4;
                                z = false;
                                z2 = true;
                                pUU.copydefault("DrawLinePlotter", "drawline: " + exc.toString() + " lineType = " + drawLineItem.getLineType());
                            }
                            break;
                        case 9:
                            oWN own9 = own6;
                            i4 = iDbNXlk;
                            i = iAYXKKw;
                            arrayList = arrayList10;
                            chartArea = chartArea2;
                            dataSource = dataSource3;
                            i2 = 2;
                            drawLineItem = drawLineItem3;
                            owc = owc3;
                            try {
                                own4 = own9;
                            } catch (java.lang.Exception e37) {
                                e = e37;
                            }
                            try {
                                float fAYXKKw17 = own4.AYXKKw(iArr[0]);
                                float fAYXKKw18 = own4.AYXKKw(iArr[1]);
                                double price = drawLineItem.getDotList().get(1).getPrice() - drawLineItem.getDotList().get(0).getPrice();
                                java.util.ArrayList<DrawLineData.Line> arrayList18 = new java.util.ArrayList<>();
                                try {
                                    this.QVAiDq.setTextAlign(Paint.Align.RIGHT);
                                    if (drawLineItem.getFiboList().isEmpty()) {
                                        try {
                                            drawLineItem.setFiboList(pEB.OLrzqt.gEmmrt());
                                        } catch (java.lang.Exception e38) {
                                            exc = e38;
                                            own9 = own4;
                                            arrayList8 = arrayList18;
                                            arrayList12 = arrayList8;
                                            own2 = own9;
                                            own = own2;
                                            i3 = i4;
                                            z = false;
                                            z2 = true;
                                            pUU.copydefault("DrawLinePlotter", "drawline: " + exc.toString() + " lineType = " + drawLineItem.getLineType());
                                        }
                                    }
                                    java.util.Iterator<DrawLineData.DrawLineFiboBean> it2 = drawLineItem.getFiboList().iterator();
                                    while (it2.hasNext()) {
                                        DrawLineData.DrawLineFiboBean next = it2.next();
                                        if (next.isSelected()) {
                                            it = it2;
                                            canvas.drawLine(fAYXKKw17, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice() - (((double) next.getPercent()) * price)), fAYXKKw18, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice() - (((double) next.getPercent()) * price)), this.AxsJAY);
                                            if (fAYXKKw17 == fAYXKKw18 && drawLineItem.getDotList().get(0).getPrice() == drawLineItem.getDotList().get(1).getPrice()) {
                                                own9 = own4;
                                                arrayList8 = arrayList18;
                                            } else {
                                                double price2 = drawLineItem.getDotList().get(1).getPrice();
                                                double percent = next.getPercent();
                                                float f17 = this.DbNXlk;
                                                float f18 = fAYXKKw17 - f17;
                                                if (fAYXKKw17 > fAYXKKw18) {
                                                    f18 = fAYXKKw18 - f17;
                                                }
                                                float f19 = f18;
                                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                own9 = own4;
                                                try {
                                                    java.util.ArrayList<DrawLineData.Line> arrayList19 = arrayList18;
                                                    try {
                                                        sb.append(pTB.OLrzqt(java.lang.String.valueOf(next.getPercent()), 3, RoundingMode.HALF_UP));
                                                        sb.append("(");
                                                        sb.append(OLrzqt(price2 - (percent * price)));
                                                        sb.append(")");
                                                        canvas2.drawText(sb.toString(), f19, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice() - (((double) next.getPercent()) * price)) + this.RJOkX, this.QVAiDq);
                                                        arrayList8 = arrayList19;
                                                    } catch (java.lang.Exception e39) {
                                                        e = e39;
                                                        arrayList8 = arrayList19;
                                                    }
                                                } catch (java.lang.Exception e40) {
                                                    e = e40;
                                                    arrayList8 = arrayList18;
                                                    exc = e;
                                                    arrayList12 = arrayList8;
                                                    own2 = own9;
                                                    own = own2;
                                                    i3 = i4;
                                                    z = false;
                                                    z2 = true;
                                                    pUU.copydefault("DrawLinePlotter", "drawline: " + exc.toString() + " lineType = " + drawLineItem.getLineType());
                                                    canvas2 = canvas;
                                                    own6 = own;
                                                    iDbNXlk = i3;
                                                    z3 = z2;
                                                    owc3 = owc;
                                                    dataSource2 = dataSource;
                                                    chartArea2 = chartArea;
                                                    arrayList10 = arrayList;
                                                    iAYXKKw = i;
                                                    i9 = i2;
                                                    break;
                                                }
                                                try {
                                                    arrayList8.add(new DrawLineData.Line(fAYXKKw17, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice() - (((double) next.getPercent()) * price)), fAYXKKw18, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice() - (((double) next.getPercent()) * price))));
                                                } catch (java.lang.Exception e41) {
                                                    e = e41;
                                                    exc = e;
                                                    arrayList12 = arrayList8;
                                                    own2 = own9;
                                                    own = own2;
                                                    i3 = i4;
                                                    z = false;
                                                    z2 = true;
                                                    pUU.copydefault("DrawLinePlotter", "drawline: " + exc.toString() + " lineType = " + drawLineItem.getLineType());
                                                    canvas2 = canvas;
                                                    own6 = own;
                                                    iDbNXlk = i3;
                                                    z3 = z2;
                                                    owc3 = owc;
                                                    dataSource2 = dataSource;
                                                    chartArea2 = chartArea;
                                                    arrayList10 = arrayList;
                                                    iAYXKKw = i;
                                                    i9 = i2;
                                                }
                                            }
                                        } else {
                                            own9 = own4;
                                            arrayList8 = arrayList18;
                                            it = it2;
                                        }
                                        arrayList18 = arrayList8;
                                        it2 = it;
                                        own4 = own9;
                                        break;
                                    }
                                    oWN own10 = own4;
                                    java.util.ArrayList<DrawLineData.Line> arrayList20 = arrayList18;
                                    drawLineItem.setLinePositionList(arrayList20);
                                    drawLineItem.getDotList().get(0).setX(fAYXKKw17);
                                    drawLineItem.getDotList().get(0).setY(owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()));
                                    drawLineItem.getDotList().get(1).setX(fAYXKKw18);
                                    drawLineItem.getDotList().get(1).setY(owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()));
                                    AEQbTJ(canvas, owc, drawLineItem, fAYXKKw17, fAYXKKw18);
                                    arrayList3 = arrayList20;
                                    own2 = own10;
                                    own = own2;
                                    i3 = i4;
                                    arrayList12 = arrayList3;
                                    z = false;
                                    z2 = true;
                                } catch (java.lang.Exception e42) {
                                    e = e42;
                                    own9 = own4;
                                }
                            } catch (java.lang.Exception e43) {
                                e = e43;
                                own9 = own4;
                                exc = e;
                                own2 = own9;
                                own = own2;
                                i3 = i4;
                                z = false;
                                z2 = true;
                                pUU.copydefault("DrawLinePlotter", "drawline: " + exc.toString() + " lineType = " + drawLineItem.getLineType());
                                canvas2 = canvas;
                                own6 = own;
                                iDbNXlk = i3;
                                z3 = z2;
                                owc3 = owc;
                                dataSource2 = dataSource;
                                chartArea2 = chartArea;
                                arrayList10 = arrayList;
                                iAYXKKw = i;
                                i9 = i2;
                            }
                            break;
                        case 10:
                            oWN own11 = own6;
                            oWC owc4 = owc3;
                            i4 = iDbNXlk;
                            int i15 = iAYXKKw;
                            i2 = 2;
                            try {
                                try {
                                    fAYXKKw7 = own11.AYXKKw(iArr[0]);
                                    fAYXKKw8 = own11.AYXKKw(iArr[1]);
                                } catch (java.lang.Exception e44) {
                                    e = e44;
                                    i = i15;
                                    own3 = own11;
                                    arrayList = arrayList10;
                                    dataSource = dataSource3;
                                    owc = owc4;
                                    chartArea = chartArea2;
                                }
                            } catch (java.lang.Exception e45) {
                                e = e45;
                                i = i15;
                                arrayList = arrayList10;
                                own3 = own11;
                                owc = owc4;
                                chartArea = chartArea2;
                                dataSource = dataSource3;
                            }
                            try {
                                float fOLrzqt4 = owc4.OLrzqt(drawLineItem3.getDotList().get(0).getPrice());
                                float fOLrzqt5 = owc4.OLrzqt(drawLineItem3.getDotList().get(1).getPrice());
                                arrayList = arrayList10;
                                owc = owc4;
                                chartArea = chartArea2;
                                try {
                                    canvas.drawLine(fAYXKKw7, fOLrzqt4, fAYXKKw8, fOLrzqt5, this.AxsJAY);
                                    d = fAYXKKw7;
                                    drawLineItem3.getDotList().get(0).setX(d);
                                    drawLineItem3.getDotList().get(0).setY(owc.OLrzqt(drawLineItem3.getDotList().get(0).getPrice()));
                                    d2 = fAYXKKw8;
                                    drawLineItem3.getDotList().get(1).setX(d2);
                                    dataSource = dataSource3;
                                    try {
                                        drawLineItem3.getDotList().get(1).setY(owc.OLrzqt(drawLineItem3.getDotList().get(1).getPrice()));
                                        float fOLrzqt6 = owc.OLrzqt(drawLineItem3.getDotList().get(0).getPrice());
                                        fOLrzqt = owc.OLrzqt(drawLineItem3.getDotList().get(1).getPrice());
                                        canvas2.rotate(45.0f, fAYXKKw8, fOLrzqt);
                                        ouu = oUU.copydefault;
                                        d3 = fOLrzqt6;
                                        i = i15;
                                        own3 = own11;
                                        d4 = fOLrzqt;
                                    } catch (java.lang.Exception e46) {
                                        e = e46;
                                        i = i15;
                                        own3 = own11;
                                    }
                                } catch (java.lang.Exception e47) {
                                    e = e47;
                                    i = i15;
                                    own3 = own11;
                                    dataSource = dataSource3;
                                }
                                try {
                                    canvas.drawLine(ouu.copydefault(7, d, d3, d2, d4)[0], ouu.copydefault(7, d, d3, d2, d4)[1], fAYXKKw8, fOLrzqt, this.AxsJAY);
                                    canvas2.rotate(-90.0f, fAYXKKw8, fOLrzqt);
                                    canvas.drawLine(ouu.copydefault(7, d, d3, d2, d4)[0], ouu.copydefault(7, d, d3, d2, d4)[1], fAYXKKw8, fOLrzqt, this.AxsJAY);
                                    canvas2.rotate(45.0f, fAYXKKw8, fOLrzqt);
                                    AEQbTJ(canvas, owc, drawLineItem3, fAYXKKw7, fAYXKKw8);
                                    arrayList3 = new java.util.ArrayList<>();
                                    try {
                                        arrayList3.add(new DrawLineData.Line(fAYXKKw7, owc.OLrzqt(drawLineItem3.getDotList().get(0).getPrice()), fAYXKKw8, owc.OLrzqt(drawLineItem3.getDotList().get(1).getPrice())));
                                        drawLineItem = drawLineItem3;
                                        try {
                                            drawLineItem.setLinePositionList(arrayList3);
                                            i3 = i4;
                                            own = own3;
                                            arrayList12 = arrayList3;
                                            z = false;
                                            z2 = true;
                                        } catch (java.lang.Exception e48) {
                                            e = e48;
                                            arrayList12 = arrayList3;
                                            exc = e;
                                            i3 = i4;
                                            own = own3;
                                            z = false;
                                            z2 = true;
                                            pUU.copydefault("DrawLinePlotter", "drawline: " + exc.toString() + " lineType = " + drawLineItem.getLineType());
                                        }
                                    } catch (java.lang.Exception e49) {
                                        e = e49;
                                        drawLineItem = drawLineItem3;
                                    }
                                } catch (java.lang.Exception e50) {
                                    e = e50;
                                    drawLineItem = drawLineItem3;
                                    exc = e;
                                    i3 = i4;
                                    own = own3;
                                    z = false;
                                    z2 = true;
                                    pUU.copydefault("DrawLinePlotter", "drawline: " + exc.toString() + " lineType = " + drawLineItem.getLineType());
                                    canvas2 = canvas;
                                    own6 = own;
                                    iDbNXlk = i3;
                                    z3 = z2;
                                    owc3 = owc;
                                    dataSource2 = dataSource;
                                    chartArea2 = chartArea;
                                    arrayList10 = arrayList;
                                    iAYXKKw = i;
                                    i9 = i2;
                                    break;
                                }
                            } catch (java.lang.Exception e51) {
                                e = e51;
                                i = i15;
                                own3 = own11;
                                arrayList = arrayList10;
                                chartArea = chartArea2;
                                dataSource = dataSource3;
                                drawLineItem = drawLineItem3;
                                owc = owc4;
                                exc = e;
                                i3 = i4;
                                own = own3;
                                z = false;
                                z2 = true;
                                pUU.copydefault("DrawLinePlotter", "drawline: " + exc.toString() + " lineType = " + drawLineItem.getLineType());
                                canvas2 = canvas;
                                own6 = own;
                                iDbNXlk = i3;
                                z3 = z2;
                                owc3 = owc;
                                dataSource2 = dataSource;
                                chartArea2 = chartArea;
                                arrayList10 = arrayList;
                                iAYXKKw = i;
                                i9 = i2;
                                break;
                            }
                            break;
                        case 11:
                            own5 = own6;
                            owc2 = owc3;
                            i7 = iDbNXlk;
                            i2 = 2;
                            i8 = iAYXKKw;
                            KWHzl(canvas, owc2, drawLineItem3, -1.0f, -1.0f, own5, iArr, arrayList12);
                            i = i8;
                            arrayList = arrayList10;
                            own = own5;
                            owc = owc2;
                            i3 = i7;
                            z = false;
                            z2 = true;
                            chartArea = chartArea2;
                            dataSource = dataSource3;
                            break;
                        case 12:
                            own5 = own6;
                            owc2 = owc3;
                            i7 = iDbNXlk;
                            i2 = 2;
                            i8 = iAYXKKw;
                            AEQbTJ(canvas, owc2, drawLineItem3, -1.0f, -1.0f, own5, iArr, arrayList12);
                            i = i8;
                            arrayList = arrayList10;
                            own = own5;
                            owc = owc2;
                            i3 = i7;
                            z = false;
                            z2 = true;
                            chartArea = chartArea2;
                            dataSource = dataSource3;
                            break;
                        case 13:
                            i2 = 2;
                            own5 = own6;
                            owc2 = owc3;
                            i7 = iDbNXlk;
                            i8 = iAYXKKw;
                            try {
                                copydefault(canvas, owc3, drawLineItem3, -1.0f, -1.0f, own5, iArr, arrayList12);
                                i = i8;
                                arrayList = arrayList10;
                                own = own5;
                                owc = owc2;
                                i3 = i7;
                                z = false;
                                z2 = true;
                                chartArea = chartArea2;
                                dataSource = dataSource3;
                            } catch (java.lang.Exception e52) {
                                exc = e52;
                                i = i8;
                                arrayList = arrayList10;
                                own = own5;
                                owc = owc2;
                                i3 = i7;
                                z = false;
                                z2 = true;
                                chartArea = chartArea2;
                                dataSource = dataSource3;
                                drawLineItem = drawLineItem3;
                                pUU.copydefault("DrawLinePlotter", "drawline: " + exc.toString() + " lineType = " + drawLineItem.getLineType());
                            }
                            break;
                        default:
                            i = iAYXKKw;
                            arrayList = arrayList10;
                            chartArea = chartArea2;
                            dataSource = dataSource3;
                            z = false;
                            z2 = true;
                            i2 = 2;
                            owc = owc3;
                            i3 = iDbNXlk;
                            own = own6;
                            break;
                    }
                } catch (java.lang.Exception e53) {
                    e = e53;
                    i = iAYXKKw;
                    arrayList = arrayList10;
                    chartArea = chartArea2;
                    dataSource = dataSource3;
                    z = false;
                    z2 = true;
                    i2 = 2;
                    drawLineItem = drawLineItem3;
                    owc = owc3;
                    i3 = iDbNXlk;
                    own = own6;
                }
                canvas2 = canvas;
                own6 = own;
                iDbNXlk = i3;
                z3 = z2;
                owc3 = owc;
                dataSource2 = dataSource;
                chartArea2 = chartArea;
                arrayList10 = arrayList;
                iAYXKKw = i;
                i9 = i2;
            }
        }
        ChartArea chartArea3 = chartArea2;
        if (arrayList10.isEmpty() || !this.QUSxYX.fERRXa() || this.QUSxYX.QSBOWP() || this.QUSxYX.USBtdM() || this.QUSxYX.OJuSTm() || this.QUSxYX.zLjUOn().isCeFiMCapMode()) {
            C36246oUr.copydefault().iwGUEr().AkhnZx(null);
        } else {
            KWHzl(canvas, chartArea3);
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: o.oWk$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] OLrzqt;

        static {
            int[] iArr = new int[DrawLineData.LineType.values().length];
            OLrzqt = iArr;
            try {
                iArr[DrawLineData.LineType.H_SEGMENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                OLrzqt[DrawLineData.LineType.H_RADIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                OLrzqt[DrawLineData.LineType.H_LINE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                OLrzqt[DrawLineData.LineType.PRICE_LINE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                OLrzqt[DrawLineData.LineType.LINE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                OLrzqt[DrawLineData.LineType.RADIAL.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                OLrzqt[DrawLineData.LineType.SEGMENT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                OLrzqt[DrawLineData.LineType.INFO_SEGMENT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                OLrzqt[DrawLineData.LineType.FIBONACCI.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                OLrzqt[DrawLineData.LineType.ARROW.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                OLrzqt[DrawLineData.LineType.G_RECTANGLE.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                OLrzqt[DrawLineData.LineType.G_TRIANGLE.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                OLrzqt[DrawLineData.LineType.G_CIRCLE.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
        }
    }

    public final void KWHzl(android.graphics.Canvas canvas, DrawLineData.DrawLineItem drawLineItem, oWN own, int[] iArr, com.okinc.kline.library.data.DataSource dataSource, oWC owc, long j) {
        java.util.Map<java.lang.Integer, java.lang.String> mapCopydefault;
        float fMax;
        float f;
        double y;
        double y2;
        double d;
        long jAhwBna;
        DataSource.StateListAnimator stateListAnimator;
        DrawLineData.Dot dot = drawLineItem.getDotList().get(0);
        DrawLineData.Dot dotCopy = drawLineItem.getDotList().get(1).copy();
        if (dataSource.AEQbTJ.size() <= iArr[0] || dataSource.AEQbTJ.size() <= iArr[1]) {
            mapCopydefault = copydefault(own, dot, dotCopy, (DataSource.StateListAnimator) null, (DataSource.StateListAnimator) null);
        } else if (dot.getTime() == dotCopy.getTime() && dot.getPrice() == dotCopy.getPrice()) {
            dotCopy.setX(own.getNewProxyInstance());
            dotCopy.setY(own.uzCIH());
            dotCopy.setPrice(owc.EZpvd(own.uzCIH()));
            int iDbNXlk = own.DbNXlk();
            if (iDbNXlk < 0 || iDbNXlk >= dataSource.AEQbTJ.size()) {
                long jAhwBna2 = dataSource.AEQbTJ.get(0).AhwBna();
                jAhwBna = jAhwBna2 + (((long) iDbNXlk) * j);
                stateListAnimator = null;
                DataSource.StateListAnimator stateListAnimator2 = stateListAnimator;
                dotCopy.setTime(jAhwBna);
                if (dot.getTime() != dotCopy.getTime()) {
                }
                mapCopydefault = copydefault(own, dot, dotCopy, dataSource.AEQbTJ.get(iArr[0]), stateListAnimator2);
            } else {
                jAhwBna = dataSource.AEQbTJ.get(iDbNXlk).AhwBna();
                stateListAnimator = dataSource.AEQbTJ.get(iDbNXlk);
                DataSource.StateListAnimator stateListAnimator22 = stateListAnimator;
                dotCopy.setTime(jAhwBna);
                if (dot.getTime() != dotCopy.getTime() && dot.getPrice() == dotCopy.getPrice()) {
                    return;
                } else {
                    mapCopydefault = copydefault(own, dot, dotCopy, dataSource.AEQbTJ.get(iArr[0]), stateListAnimator22);
                }
            }
        } else {
            mapCopydefault = copydefault(own, dot, dotCopy, dataSource.AEQbTJ.get(iArr[0]), dataSource.AEQbTJ.get(iArr[1]));
        }
        oWK owk = this.QUSxYX.zLjUOn().getThemes().get(copydefault());
        if (mapCopydefault.isEmpty()) {
            return;
        }
        float f2 = this.fetchVPNInfo;
        this.AuCTelauCTel.setColor(owk.getFieldNames());
        java.util.Iterator<Map.Entry<java.lang.Integer, java.lang.String>> it = mapCopydefault.entrySet().iterator();
        float fMax2 = 0.0f;
        while (it.hasNext()) {
            fMax2 = java.lang.Math.max(fMax2, this.AuCTelauCTel.measureText(it.next().getValue()) + this.AYXKKw);
        }
        float f3 = fMax2 + f2;
        Paint.FontMetrics fontMetrics = this.AuCTelauCTel.getFontMetrics();
        float f4 = fontMetrics.descent - fontMetrics.ascent;
        float fCopydefault = AbstractC36302oWt.copydefault(5.0f);
        float size = ((mapCopydefault.size() - 1) * fCopydefault) + (mapCopydefault.size() * f4) + (f2 * 2.0f);
        float x = (float) (dot.getX() + ((dotCopy.getX() - dot.getX()) / 2.0d));
        ChartArea chartArea = this.QUSxYX.values().get(EZpvd());
        boolean z = (((dotCopy.getX() - dot.getX()) > AudioStats.AUDIO_AMPLITUDE_NONE ? 1 : ((dotCopy.getX() - dot.getX()) == AudioStats.AUDIO_AMPLITUDE_NONE ? 0 : -1)) >= 0) == (dotCopy.getY() - dot.getY() >= AudioStats.AUDIO_AMPLITUDE_NONE);
        double y3 = dotCopy.getY() - dot.getY();
        if (((int) (x + f3)) <= chartArea.fIwbmz()) {
            fMax = x + f2;
            f = fMax + f3;
            if (!z) {
                y = dot.getY();
                d = y + (y3 / 2.0d);
            } else {
                y2 = dot.getY();
                d = (y2 + (y3 / 2.0d)) - ((double) size);
            }
        } else {
            fMax = java.lang.Math.max((x - f2) - f3, 0.0f);
            f = fMax + f3;
            if (!z) {
                y2 = dot.getY();
                d = (y2 + (y3 / 2.0d)) - ((double) size);
            } else {
                y = dot.getY();
                d = y + (y3 / 2.0d);
            }
        }
        float f5 = (float) d;
        RectF rectF = new RectF(fMax, f5, f, size + f5);
        this.zLjUOn.setColor(owk.getFieldNames());
        KWHzl(this.zLjUOn, this.zSsVtY);
        float f6 = this.isConnected;
        canvas.drawRoundRect(rectF, f6, f6, this.zLjUOn);
        copydefault(this.zLjUOn);
        float f7 = f5 + f2;
        if (C55296xhK.OLrzqt(C36246oUr.copydefault().AubY())) {
            for (Map.Entry<java.lang.Integer, java.lang.String> entry : mapCopydefault.entrySet()) {
                android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(C32979mnm.EZpvd.OLrzqt(), entry.getKey().intValue());
                int i = (int) (f - f2);
                int i2 = (int) f7;
                if (drawable != null) {
                    int i3 = this.gEmmrt;
                    drawable.setBounds(i - i3, i2, i, i3 + i2);
                    drawable.setTint(owk.getNewProxyInstance());
                    drawable.draw(canvas);
                }
                float f8 = ((f4 - fontMetrics.bottom) - fontMetrics.top) / 2.0f;
                this.QVAiDq.setTextAlign(Paint.Align.RIGHT);
                this.QVAiDq.setColor(owk.getNewProxyInstance());
                canvas.drawText(entry.getValue(), i - this.AYXKKw, f8 + f7, this.QVAiDq);
                f7 += f4 + fCopydefault;
            }
            return;
        }
        for (Map.Entry<java.lang.Integer, java.lang.String> entry2 : mapCopydefault.entrySet()) {
            android.graphics.drawable.Drawable drawable2 = ContextCompat.getDrawable(C32979mnm.EZpvd.OLrzqt(), entry2.getKey().intValue());
            int i4 = (int) (fMax + f2);
            int i5 = (int) f7;
            if (drawable2 != null) {
                int i6 = this.gEmmrt;
                drawable2.setBounds(i4, i5, i4 + i6, i6 + i5);
                drawable2.setTint(owk.getNewProxyInstance());
                drawable2.draw(canvas);
            }
            float f9 = ((f4 - fontMetrics.bottom) - fontMetrics.top) / 2.0f;
            this.QVAiDq.setTextAlign(Paint.Align.LEFT);
            this.QVAiDq.setColor(owk.getNewProxyInstance());
            canvas.drawText(entry2.getValue(), i4 + this.AYXKKw, f9 + f7, this.QVAiDq);
            f7 += f4 + fCopydefault;
        }
    }

    public final java.util.Map<java.lang.Integer, java.lang.String> copydefault(oWN own, DrawLineData.Dot dot, DrawLineData.Dot dot2, DataSource.StateListAnimator stateListAnimator, DataSource.StateListAnimator stateListAnimator2) {
        java.lang.String strKWHzl;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (dot.getX() == dot2.getX() && dot.getY() == dot2.getY()) {
            return linkedHashMap;
        }
        double price = dot.getPrice();
        double price2 = dot2.getPrice() - price;
        java.lang.String strAEQbTJ = pTB.AEQbTJ(pTB.OLrzqt(java.lang.Double.valueOf(price2 / price)), 2, 2, RoundingMode.HALF_UP);
        linkedHashMap.put(java.lang.Integer.valueOf(C52761wXj.TaskDescription.HJWChPOKBmQN), AbstractC36302oWt.AYXKKw(price2) + "(" + strAEQbTJ + ")");
        int iRound = java.lang.Math.round(((float) (dot2.getX() - dot.getX())) / own.AhwBna());
        java.lang.String strAEQbTJ2 = AEQbTJ((double) dot.getTime(), (double) dot2.getTime());
        java.util.HashMap map = new java.util.HashMap();
        map.put("num", java.lang.String.valueOf(iRound));
        C43246rlf c43246rlf = C43246rlf.OLrzqt;
        java.lang.String strEZpvd = pTD.EZpvd(c43246rlf.valueOf(), C32392mcI.ActionBar.KWHzl, iRound, map);
        linkedHashMap.put(java.lang.Integer.valueOf(C52761wXj.TaskDescription.DLWbHP), strAEQbTJ2 + "(" + strEZpvd + ")");
        linkedHashMap.put(java.lang.Integer.valueOf(C52761wXj.TaskDescription.AubY), java.lang.String.format("%.2f°", java.lang.Double.valueOf(java.lang.Math.toDegrees(AEQbTJ(dot.getX(), dot.getY(), dot2.getX(), dot2.getY())))));
        if (stateListAnimator2 == null || stateListAnimator == null) {
            strKWHzl = "--";
        } else {
            java.lang.String strAEQbTJ3 = pTB.AEQbTJ(pTB.OLrzqt(java.lang.Double.valueOf(stateListAnimator2.zsXlph() - stateListAnimator.zsXlph())), RoundingMode.DOWN, C38307pTy.Companion.EZpvd(2));
            java.util.HashMap map2 = new java.util.HashMap();
            map2.put("volume", strAEQbTJ3);
            strKWHzl = C33069mpW.KWHzl(c43246rlf.valueOf(), C32392mcI.Dialog.gmHjFq, map2);
        }
        linkedHashMap.put(java.lang.Integer.valueOf(C52761wXj.TaskDescription.QYvkLl), strKWHzl);
        return linkedHashMap;
    }

    public double AEQbTJ(double d, double d2, double d3, double d4) {
        return java.lang.Math.atan2(d2 - d4, d3 - d);
    }

    public final java.lang.String AEQbTJ(double d, double d2) {
        long j;
        long j2;
        long j3;
        double d3 = d2 - d;
        java.lang.String str = d3 >= AudioStats.AUDIO_AMPLITUDE_NONE ? "" : "-";
        double dCeil = java.lang.Math.ceil(java.lang.Math.abs(d3)) / 1000.0d;
        if (dCeil >= 86400.0d) {
            j = (int) (dCeil / 86400.0d);
            dCeil -= j * 86400.0d;
        } else {
            j = 0;
        }
        if (dCeil >= 3600.0d) {
            j2 = (int) (dCeil / 3600.0d);
            dCeil -= 3600 * j2;
        } else {
            j2 = 0;
        }
        if (dCeil >= 60.0d) {
            j3 = (int) (dCeil / 60.0d);
            dCeil -= 60 * j3;
        } else {
            j3 = 0;
        }
        long j4 = (long) dCeil;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        if (j > 0) {
            sb.append(j);
            sb.append(this.AhwBna);
            if (this.UeEOUB >= 1440) {
                return sb.toString();
            }
        }
        if (j2 > 0) {
            sb.append(j2);
            sb.append(this.AuCTel);
            if (this.UeEOUB >= 60) {
                return sb.toString();
            }
        }
        if (j3 > 0) {
            sb.append(j3);
            sb.append(this.aKErDB);
            if (this.UeEOUB >= 1) {
                return sb.toString();
            }
        }
        if (j4 > 0) {
            sb.append(j4);
            sb.append(this.djSkpj);
        }
        return sb.toString();
    }

    public final void AEQbTJ(android.graphics.Canvas canvas, oWC owc, DrawLineData.DrawLineItem drawLineItem, float f, float f2, oWN own, int[] iArr, java.util.ArrayList<DrawLineData.Line> arrayList) {
        float x;
        float x2;
        float x3;
        android.graphics.Canvas canvas2;
        oWC owc2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int i;
        float f8;
        float fAYXKKw = own.AYXKKw(iArr[2]);
        if (drawLineItem.getSelected() == 5) {
            x2 = (float) drawLineItem.getDotList().get(0).getX();
            x3 = (float) drawLineItem.getDotList().get(1).getX();
            x = (float) drawLineItem.getDotList().get(2).getX();
        } else {
            float fAYXKKw2 = own.AYXKKw(iArr[0]);
            float fAYXKKw3 = own.AYXKKw(iArr[1]);
            drawLineItem.getDotList().get(0).setX(fAYXKKw2);
            drawLineItem.getDotList().get(0).setY(owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()));
            drawLineItem.getDotList().get(1).setX(fAYXKKw3);
            drawLineItem.getDotList().get(1).setY(owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()));
            drawLineItem.getDotList().get(2).setX(fAYXKKw);
            drawLineItem.getDotList().get(2).setY(owc.OLrzqt(drawLineItem.getDotList().get(2).getPrice()));
            x = fAYXKKw;
            x2 = fAYXKKw2;
            x3 = fAYXKKw3;
        }
        if (drawLineItem.getSelected() == 0 || drawLineItem.getSelected() == 5) {
            float f9 = x2;
            float f10 = x;
            pUU.copydefault("drawGraphicsTriangle", "drawGraphicsTriangle G_TRIANGLE = dot1" + f9 + " dot1Y " + owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()) + "  dot2" + x3 + " dot2Y " + owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()) + "  dot3" + f10 + " dot3Y " + owc.OLrzqt(drawLineItem.getDotList().get(2).getPrice()));
            double d = (double) f9;
            double d2 = (double) x3;
            float f11 = x3;
            if (EZpvd(d, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), d2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), f10, owc.OLrzqt(drawLineItem.getDotList().get(2).getPrice())).booleanValue()) {
                float fCopydefault = AbstractC36302oWt.copydefault(drawLineItem.getLinewidth() / 2);
                this.AwvSrB.reset();
                this.DTwDnp.reset();
                if (drawLineItem.getSelected() == 5) {
                    this.AwvSrB.moveTo(f9, (float) drawLineItem.getDotList().get(0).getY());
                    i = 1;
                    f3 = f11;
                    this.AwvSrB.lineTo(f3, (float) drawLineItem.getDotList().get(1).getY());
                    this.AwvSrB.lineTo(f10, (float) drawLineItem.getDotList().get(2).getY());
                    OLrzqt(f9, (float) drawLineItem.getDotList().get(0).getY(), f3, (float) drawLineItem.getDotList().get(1).getY(), f10, (float) drawLineItem.getDotList().get(2).getY(), fCopydefault, this.gHZMYf);
                    OLrzqt(f3, (float) drawLineItem.getDotList().get(1).getY(), f10, (float) drawLineItem.getDotList().get(2).getY(), f9, (float) drawLineItem.getDotList().get(0).getY(), fCopydefault, this.QOLQEE);
                    OLrzqt(f10, (float) drawLineItem.getDotList().get(2).getY(), f9, (float) drawLineItem.getDotList().get(0).getY(), f3, (float) drawLineItem.getDotList().get(1).getY(), fCopydefault, this.OcIXYQ);
                    android.graphics.Path path = this.DTwDnp;
                    float[] fArr = this.gHZMYf;
                    path.moveTo(fArr[0], fArr[1]);
                    android.graphics.Path path2 = this.DTwDnp;
                    float[] fArr2 = this.QOLQEE;
                    path2.lineTo(fArr2[0], fArr2[1]);
                    android.graphics.Path path3 = this.DTwDnp;
                    float[] fArr3 = this.OcIXYQ;
                    path3.lineTo(fArr3[0], fArr3[1]);
                    owc2 = owc;
                    f8 = f10;
                } else {
                    f3 = f11;
                    i = 1;
                    this.AwvSrB.moveTo(f9, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()));
                    this.AwvSrB.lineTo(f3, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()));
                    this.AwvSrB.lineTo(f10, owc.OLrzqt(drawLineItem.getDotList().get(2).getPrice()));
                    f8 = f10;
                    owc2 = owc;
                    OLrzqt(f9, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), f3, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), f10, owc.OLrzqt(drawLineItem.getDotList().get(2).getPrice()), fCopydefault, this.gHZMYf);
                    OLrzqt(f3, owc2.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), f8, owc2.OLrzqt(drawLineItem.getDotList().get(2).getPrice()), f9, owc2.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), fCopydefault, this.QOLQEE);
                    OLrzqt(f8, owc2.OLrzqt(drawLineItem.getDotList().get(2).getPrice()), f9, owc2.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), f3, owc2.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), fCopydefault, this.OcIXYQ);
                    android.graphics.Path path4 = this.DTwDnp;
                    float[] fArr4 = this.gHZMYf;
                    path4.moveTo(fArr4[0], fArr4[1]);
                    android.graphics.Path path5 = this.DTwDnp;
                    float[] fArr5 = this.QOLQEE;
                    path5.lineTo(fArr5[0], fArr5[1]);
                    android.graphics.Path path6 = this.DTwDnp;
                    float[] fArr6 = this.OcIXYQ;
                    path6.lineTo(fArr6[0], fArr6[1]);
                }
                this.AwvSrB.close();
                this.DTwDnp.close();
                canvas2 = canvas;
                canvas2.drawPath(this.AwvSrB, this.wlaJM);
                canvas2.drawPath(this.DTwDnp, this.AubY);
                java.util.ArrayList<DrawLineData.Line> arrayList2 = new java.util.ArrayList<>();
                arrayList2.add(new DrawLineData.Line(f9, owc2.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), f3, owc2.OLrzqt(drawLineItem.getDotList().get(i).getPrice())));
                f4 = f8;
                arrayList2.add(new DrawLineData.Line(f3, owc2.OLrzqt(drawLineItem.getDotList().get(i).getPrice()), f4, owc2.OLrzqt(drawLineItem.getDotList().get(2).getPrice())));
                arrayList2.add(new DrawLineData.Line(f4, owc2.OLrzqt(drawLineItem.getDotList().get(2).getPrice()), f9, owc2.OLrzqt(drawLineItem.getDotList().get(0).getPrice())));
                drawLineItem.setLinePositionList(arrayList2);
            } else {
                canvas2 = canvas;
                owc2 = owc;
                f3 = f11;
                f4 = f10;
                if (own.DbNXlk() != -1) {
                    float fAYXKKw4 = own.AYXKKw(own.DbNXlk());
                    float fCopydefault2 = AbstractC36302oWt.copydefault(drawLineItem.getLinewidth() / 2);
                    f5 = f4;
                    if (EZpvd(d, owc2.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), d2, owc2.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), fAYXKKw4, own.uzCIH()).booleanValue()) {
                        this.AwvSrB.reset();
                        this.DTwDnp.reset();
                        f6 = f9;
                        this.AwvSrB.moveTo(f6, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()));
                        f7 = f3;
                        this.AwvSrB.lineTo(f7, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()));
                        this.AwvSrB.lineTo(fAYXKKw4, own.uzCIH());
                        this.AwvSrB.close();
                        OLrzqt(f6, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), f7, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), fAYXKKw4, own.uzCIH(), fCopydefault2, this.gHZMYf);
                        OLrzqt(f7, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), fAYXKKw4, own.uzCIH(), f6, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), fCopydefault2, this.QOLQEE);
                        OLrzqt(fAYXKKw4, own.uzCIH(), f6, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), f7, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), fCopydefault2, this.OcIXYQ);
                        android.graphics.Path path7 = this.DTwDnp;
                        float[] fArr7 = this.gHZMYf;
                        path7.moveTo(fArr7[0], fArr7[1]);
                        android.graphics.Path path8 = this.DTwDnp;
                        float[] fArr8 = this.QOLQEE;
                        path8.lineTo(fArr8[0], fArr8[1]);
                        android.graphics.Path path9 = this.DTwDnp;
                        float[] fArr9 = this.OcIXYQ;
                        path9.lineTo(fArr9[0], fArr9[1]);
                        this.DTwDnp.close();
                        canvas.drawPath(this.AwvSrB, this.wlaJM);
                        canvas.drawPath(this.DTwDnp, this.AubY);
                    } else {
                        f6 = f9;
                        f7 = f3;
                        canvas.drawLine(f6, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), fAYXKKw4, own.uzCIH(), this.AubY);
                    }
                }
                AEQbTJ(canvas, owc, drawLineItem, f6, f7, f5);
                return;
            }
            f5 = f4;
            f7 = f3;
            f6 = f9;
            AEQbTJ(canvas, owc, drawLineItem, f6, f7, f5);
            return;
        }
        float fCopydefault3 = AbstractC36302oWt.copydefault(drawLineItem.getLinewidth() / 2);
        this.AwvSrB.reset();
        this.DTwDnp.reset();
        this.AwvSrB.moveTo(x2, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()));
        this.AwvSrB.lineTo(x3, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()));
        this.AwvSrB.lineTo(x, owc.OLrzqt(drawLineItem.getDotList().get(2).getPrice()));
        this.AwvSrB.close();
        float f12 = x;
        float f13 = x3;
        float f14 = x2;
        OLrzqt(x2, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), x3, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), f12, owc.OLrzqt(drawLineItem.getDotList().get(2).getPrice()), fCopydefault3, this.gHZMYf);
        OLrzqt(f13, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), f12, owc.OLrzqt(drawLineItem.getDotList().get(2).getPrice()), f14, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), fCopydefault3, this.QOLQEE);
        OLrzqt(f12, owc.OLrzqt(drawLineItem.getDotList().get(2).getPrice()), f14, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), f13, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), fCopydefault3, this.OcIXYQ);
        android.graphics.Path path10 = this.DTwDnp;
        float[] fArr10 = this.gHZMYf;
        path10.moveTo(fArr10[0], fArr10[1]);
        android.graphics.Path path11 = this.DTwDnp;
        float[] fArr11 = this.QOLQEE;
        path11.lineTo(fArr11[0], fArr11[1]);
        android.graphics.Path path12 = this.DTwDnp;
        float[] fArr12 = this.OcIXYQ;
        path12.lineTo(fArr12[0], fArr12[1]);
        this.DTwDnp.close();
        canvas.drawPath(this.AwvSrB, this.wlaJM);
        canvas.drawPath(this.DTwDnp, this.AubY);
        java.util.ArrayList<DrawLineData.Line> arrayList3 = new java.util.ArrayList<>();
        arrayList3.add(new DrawLineData.Line(f14, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), f13, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice())));
        arrayList3.add(new DrawLineData.Line(f13, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), f12, owc.OLrzqt(drawLineItem.getDotList().get(2).getPrice())));
        arrayList3.add(new DrawLineData.Line(f12, owc.OLrzqt(drawLineItem.getDotList().get(2).getPrice()), f14, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice())));
        drawLineItem.setLinePositionList(arrayList3);
        AEQbTJ(canvas, owc, drawLineItem, f14, f13, f12);
    }

    public final void copydefault(android.graphics.Canvas canvas, oWC owc, DrawLineData.DrawLineItem drawLineItem, float f, float f2, oWN own, int[] iArr, java.util.ArrayList<DrawLineData.Line> arrayList) {
        float x;
        float x2;
        if (drawLineItem.getSelected() == 5 || drawLineItem.getSelected() == 0) {
            x = (float) drawLineItem.getDotList().get(0).getX();
            x2 = (float) drawLineItem.getDotList().get(1).getX();
        } else {
            x = own.AYXKKw(iArr[0]);
            x2 = own.AYXKKw(iArr[1]);
            drawLineItem.getDotList().get(0).setX(x);
            drawLineItem.getDotList().get(0).setY(owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()));
            drawLineItem.getDotList().get(1).setX(x2);
            drawLineItem.getDotList().get(1).setY(owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()));
        }
        float f3 = x;
        float f4 = x2;
        if (drawLineItem.getSelected() != 0 && drawLineItem.getSelected() != 5) {
            float fCopydefault = (float) copydefault(f3, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), f4, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()));
            canvas.drawCircle(f3, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), fCopydefault, this.AubY);
            canvas.drawCircle(f3, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), fCopydefault - AbstractC36302oWt.copydefault(drawLineItem.getLinewidth() / 2), this.wlaJM);
            java.util.ArrayList<DrawLineData.Line> arrayList2 = new java.util.ArrayList<>();
            arrayList2.add(new DrawLineData.Line(f3, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), f4, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice())));
            drawLineItem.setLinePositionList(arrayList2);
            OLrzqt(canvas, owc, drawLineItem, f3, f4);
            return;
        }
        if (f3 != f4) {
            double d = f3;
            double d2 = f4;
            float fCopydefault2 = (float) copydefault(d, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), d2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()));
            if (drawLineItem.getSelected() == 5) {
                float fCopydefault3 = (float) copydefault(d, drawLineItem.getDotList().get(0).getY(), d2, drawLineItem.getDotList().get(1).getY());
                canvas.drawCircle(f3, (float) drawLineItem.getDotList().get(0).getY(), fCopydefault3, this.AubY);
                canvas.drawCircle(f3, (float) drawLineItem.getDotList().get(0).getY(), fCopydefault3 - AbstractC36302oWt.copydefault(drawLineItem.getLinewidth() / 2), this.wlaJM);
            } else {
                canvas.drawCircle(f3, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), fCopydefault2, this.AubY);
                canvas.drawCircle(f3, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), fCopydefault2 - AbstractC36302oWt.copydefault(drawLineItem.getLinewidth() / 2), this.wlaJM);
            }
            java.util.ArrayList<DrawLineData.Line> arrayList3 = new java.util.ArrayList<>();
            arrayList3.add(new DrawLineData.Line(f3, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), f4, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice())));
            drawLineItem.setLinePositionList(arrayList3);
            OLrzqt(canvas, owc, drawLineItem, f3, f4);
            return;
        }
        float fCopydefault4 = (float) copydefault(f3, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), own.AYXKKw(own.DbNXlk()), own.uzCIH());
        if (fCopydefault4 > this.isConnected) {
            canvas.drawCircle(f3, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), fCopydefault4, this.AubY);
            canvas.drawCircle(f3, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), fCopydefault4 - AbstractC36302oWt.copydefault(drawLineItem.getLinewidth() / 2), this.wlaJM);
        } else {
            OLrzqt(canvas, owc, drawLineItem, f3, f4);
        }
    }

    public final void KWHzl(android.graphics.Canvas canvas, oWC owc, DrawLineData.DrawLineItem drawLineItem, float f, float f2, oWN own, int[] iArr, java.util.ArrayList<DrawLineData.Line> arrayList) {
        float fAYXKKw = own.AYXKKw(iArr[0]);
        float fAYXKKw2 = own.AYXKKw(iArr[1]);
        drawLineItem.getDotList().get(0).setX(fAYXKKw);
        drawLineItem.getDotList().get(0).setY(owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()));
        drawLineItem.getDotList().get(1).setX(fAYXKKw2);
        drawLineItem.getDotList().get(1).setY(owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()));
        if (drawLineItem.getSelected() != 0) {
            this.QKVWgx.set(fAYXKKw, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), fAYXKKw2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()));
            canvas.drawRoundRect(this.QKVWgx, 0.0f, 0.0f, this.wlaJM);
            this.QKVWgx.set(fAYXKKw - (AbstractC36302oWt.copydefault(drawLineItem.getLinewidth()) / 2), owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()) - (AbstractC36302oWt.copydefault(drawLineItem.getLinewidth()) / 2), (AbstractC36302oWt.copydefault(drawLineItem.getLinewidth()) / 2) + fAYXKKw2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()) + (AbstractC36302oWt.copydefault(drawLineItem.getLinewidth()) / 2));
            canvas.drawRoundRect(this.QKVWgx, 0.0f, 0.0f, this.AubY);
            java.util.ArrayList<DrawLineData.Line> arrayList2 = new java.util.ArrayList<>();
            arrayList2.add(new DrawLineData.Line(fAYXKKw, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), fAYXKKw2, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice())));
            arrayList2.add(new DrawLineData.Line(fAYXKKw, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), fAYXKKw, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice())));
            arrayList2.add(new DrawLineData.Line(fAYXKKw, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), fAYXKKw2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice())));
            arrayList2.add(new DrawLineData.Line(fAYXKKw2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), fAYXKKw2, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice())));
            drawLineItem.setLinePositionList(arrayList2);
            AYXKKw(canvas, owc, drawLineItem, fAYXKKw, fAYXKKw2);
            return;
        }
        if (fAYXKKw != fAYXKKw2 || drawLineItem.getDotList().get(0).getY() != drawLineItem.getDotList().get(1).getY()) {
            this.QKVWgx.set(fAYXKKw, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), fAYXKKw2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()));
            canvas.drawRoundRect(this.QKVWgx, 0.0f, 0.0f, this.wlaJM);
            this.QKVWgx.set(fAYXKKw - (AbstractC36302oWt.copydefault(drawLineItem.getLinewidth()) / 2), owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()) - (AbstractC36302oWt.copydefault(drawLineItem.getLinewidth()) / 2), (AbstractC36302oWt.copydefault(drawLineItem.getLinewidth()) / 2) + fAYXKKw2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()) + (AbstractC36302oWt.copydefault(drawLineItem.getLinewidth()) / 2));
            canvas.drawRoundRect(this.QKVWgx, 0.0f, 0.0f, this.AubY);
            java.util.ArrayList<DrawLineData.Line> arrayList3 = new java.util.ArrayList<>();
            arrayList3.add(new DrawLineData.Line(fAYXKKw, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), fAYXKKw2, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice())));
            arrayList3.add(new DrawLineData.Line(fAYXKKw, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), fAYXKKw, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice())));
            arrayList3.add(new DrawLineData.Line(fAYXKKw, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), fAYXKKw2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice())));
            arrayList3.add(new DrawLineData.Line(fAYXKKw2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), fAYXKKw2, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice())));
            drawLineItem.setLinePositionList(arrayList3);
            AYXKKw(canvas, owc, drawLineItem, fAYXKKw, fAYXKKw2);
            return;
        }
        float fAYXKKw3 = own.AYXKKw(own.DbNXlk());
        if (java.lang.Math.abs(fAYXKKw2 - fAYXKKw3) > this.isConnected) {
            this.QKVWgx.set(fAYXKKw, own.uzCIH(), fAYXKKw3, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()));
            canvas.drawRoundRect(this.QKVWgx, 0.0f, 0.0f, this.wlaJM);
            this.QKVWgx.set(fAYXKKw - (AbstractC36302oWt.copydefault(drawLineItem.getLinewidth()) / 2), own.uzCIH() - (AbstractC36302oWt.copydefault(drawLineItem.getLinewidth()) / 2), fAYXKKw3 + (AbstractC36302oWt.copydefault(drawLineItem.getLinewidth()) / 2), owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()) + (AbstractC36302oWt.copydefault(drawLineItem.getLinewidth()) / 2));
            canvas.drawRoundRect(this.QKVWgx, 0.0f, 0.0f, this.AubY);
            return;
        }
        AYXKKw(canvas, owc, drawLineItem, fAYXKKw, fAYXKKw2);
    }

    public final java.lang.String EZpvd(DrawLineData.DrawLineItem drawLineItem) {
        pDT.StateListAnimator stateListAnimator = pDT.Companion;
        java.lang.String strCopydefault = stateListAnimator.KWHzl().copydefault(drawLineItem.getLineColorBlk(), C36246oUr.copydefault().DarRvM());
        if (strCopydefault != null) {
            if (OLrzqt(drawLineItem.getLinecolor()) >= 255) {
                return strCopydefault;
            }
            if (drawLineItem.getLinecolor().contains("rgb")) {
                return stateListAnimator.KWHzl().AEQbTJ(drawLineItem.getLinecolor());
            }
            return drawLineItem.getLinecolor();
        }
        if (drawLineItem.getLinecolor().contains("rgb")) {
            return stateListAnimator.KWHzl().AEQbTJ(drawLineItem.getLinecolor());
        }
        return drawLineItem.getLinecolor();
    }

    public final java.lang.String OLrzqt(DrawLineData.DrawLineItem drawLineItem) {
        pDT.StateListAnimator stateListAnimator = pDT.Companion;
        java.lang.String strCopydefault = stateListAnimator.KWHzl().copydefault(drawLineItem.getFillColorBlk(), C36246oUr.copydefault().DarRvM());
        if (strCopydefault != null) {
            if (OLrzqt(drawLineItem.getFillColor()) >= 255) {
                return strCopydefault;
            }
            if (drawLineItem.getFillColor().contains("rgb")) {
                return stateListAnimator.KWHzl().AEQbTJ(drawLineItem.getFillColor());
            }
            return drawLineItem.getFillColor();
        }
        if (drawLineItem.getFillColor().contains("rgb")) {
            return stateListAnimator.KWHzl().AEQbTJ(drawLineItem.getFillColor());
        }
        return drawLineItem.getFillColor();
    }

    public final int OLrzqt(java.lang.String str) {
        return Color.alpha(Color.parseColor(str));
    }

    public final void AEQbTJ(android.graphics.Canvas canvas, oWC owc, DrawLineData.DrawLineItem drawLineItem, float f, float f2) {
        if (drawLineItem.getSelected() == 0) {
            EZpvd(canvas, owc, drawLineItem, f, f2);
        } else if (drawLineItem.getSelected() == 1) {
            copydefault(canvas, owc, drawLineItem, f, f2);
        } else if (drawLineItem.getSelected() == 2) {
            KWHzl(canvas, owc, drawLineItem, f, f2);
        }
    }

    public final void KWHzl(android.graphics.Canvas canvas, oWC owc, DrawLineData.DrawLineItem drawLineItem, float f, float f2) {
        canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
        canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
        canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(4.0f), this.fJNWhG);
    }

    public final void copydefault(android.graphics.Canvas canvas, oWC owc, DrawLineData.DrawLineItem drawLineItem, float f, float f2) {
        canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(4.0f), this.fJNWhG);
        DrawLineData drawLineData = DrawLineData.copydefault;
        if (drawLineData.isConnected().getLineType() == DrawLineData.LineType.PRICE_LINE || drawLineData.isConnected().getLineType() == DrawLineData.LineType.H_LINE || drawLineItem.getDotList().size() <= 0) {
            return;
        }
        canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
        canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
    }

    public final void AEQbTJ(android.graphics.Canvas canvas, oWC owc, DrawLineData.DrawLineItem drawLineItem, float f, float f2, float f3) {
        if (drawLineItem.getSelected() == 5 || drawLineItem.getSelected() == 0) {
            canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
            canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
            canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
            canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
            canvas.drawCircle(f3, owc.OLrzqt(drawLineItem.getDotList().get(2).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
            canvas.drawCircle(f3, owc.OLrzqt(drawLineItem.getDotList().get(2).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
            return;
        }
        if (drawLineItem.getSelected() == 1) {
            canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(2.0f), this.ORxRYg);
            canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
            canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
            canvas.drawCircle(f3, owc.OLrzqt(drawLineItem.getDotList().get(2).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
            canvas.drawCircle(f3, owc.OLrzqt(drawLineItem.getDotList().get(2).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
            return;
        }
        if (drawLineItem.getSelected() == 2) {
            canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
            canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
            canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(2.0f), this.ORxRYg);
            canvas.drawCircle(f3, owc.OLrzqt(drawLineItem.getDotList().get(2).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
            canvas.drawCircle(f3, owc.OLrzqt(drawLineItem.getDotList().get(2).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
            return;
        }
        if (drawLineItem.getSelected() == 3) {
            canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
            canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
            canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
            canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
            canvas.drawCircle(f3, owc.OLrzqt(drawLineItem.getDotList().get(2).getPrice()), AbstractC36302oWt.copydefault(2.0f), this.ORxRYg);
        }
    }

    public final void OLrzqt(android.graphics.Canvas canvas, oWC owc, DrawLineData.DrawLineItem drawLineItem, float f, float f2) {
        if (drawLineItem.getSelected() == 0 || drawLineItem.getSelected() == 5 || drawLineItem.getSelected() == 1) {
            canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
            canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
            canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
            canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
            return;
        }
        if (drawLineItem.getSelected() == 2) {
            canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
            canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
            canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(2.0f), this.ORxRYg);
        }
    }

    public final void AYXKKw(android.graphics.Canvas canvas, oWC owc, DrawLineData.DrawLineItem drawLineItem, float f, float f2) {
        if (drawLineItem.getSelected() == 0) {
            canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
            canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
            canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
            canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
            canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
            canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
            canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
            canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
            return;
        }
        if (drawLineItem.getSelected() == 1) {
            canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(2.0f), this.ORxRYg);
            canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
            canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
            canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
            canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
            canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
            canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
            return;
        }
        if (drawLineItem.getSelected() == 2) {
            canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
            canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
            canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(2.0f), this.ORxRYg);
            canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
            canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
            canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
            canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
            return;
        }
        if (drawLineItem.getSelected() == 3) {
            canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
            canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
            canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
            canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
            canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(2.0f), this.ORxRYg);
            canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
            canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
            return;
        }
        if (drawLineItem.getSelected() == 4) {
            canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
            canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
            canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
            canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
            canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
            canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
            canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(2.0f), this.ORxRYg);
        }
    }

    public final void EZpvd(android.graphics.Canvas canvas, oWC owc, DrawLineData.DrawLineItem drawLineItem, float f, float f2) {
        canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
        canvas.drawCircle(f, owc.OLrzqt(drawLineItem.getDotList().get(0).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
        DrawLineData drawLineData = DrawLineData.copydefault;
        if (drawLineData.isConnected().getLineType() == DrawLineData.LineType.PRICE_LINE || drawLineData.isConnected().getLineType() == DrawLineData.LineType.H_LINE || drawLineItem.getDotList().size() <= 0) {
            return;
        }
        canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(12.0f), this.fJNWhG);
        canvas.drawCircle(f2, owc.OLrzqt(drawLineItem.getDotList().get(1).getPrice()), AbstractC36302oWt.copydefault(10.0f), this.getFieldNames);
    }

    public final void KWHzl(android.graphics.Canvas canvas, ChartArea chartArea) {
        if (this.QUSxYX.RdAHlO()) {
            float width = (canvas.getWidth() - this.OLrzqt) - this.values;
            float fKWHzl = chartArea.KWHzl() - this.AkhnZx;
            EZpvd(canvas, this.KWHzl, width, fKWHzl);
            VectorDrawable vectorDrawable = this.dNCPSb;
            float f = this.uzCIH / 2;
            int i = this.hDKMBd / 2;
            vectorDrawable.setBounds((int) (width - f), (int) (fKWHzl - i), (int) (width + f), ((int) fKWHzl) + i);
            this.dNCPSb.draw(canvas);
        }
    }

    public final void AEQbTJ(android.graphics.Canvas canvas, ChartArea chartArea) {
        if (this.QUSxYX.RdAHlO()) {
            float width = (canvas.getWidth() - this.OLrzqt) - this.values;
            float fKWHzl = chartArea.KWHzl() - this.AkhnZx;
            EZpvd(canvas, this.KWHzl, width, fKWHzl);
            VectorDrawable vectorDrawable = this.fARcdN;
            float f = this.uzCIH / 2;
            int i = this.hDKMBd / 2;
            vectorDrawable.setBounds((int) (width - f), (int) (fKWHzl - i), (int) (width + f), ((int) fKWHzl) + i);
            this.fARcdN.draw(canvas);
        }
    }

    public final void EZpvd(android.graphics.Canvas canvas, android.graphics.drawable.Drawable drawable, float f, float f2) {
        int i = this.OLrzqt;
        float f3 = i;
        int i2 = (int) (f - f3);
        int i3 = (int) (f2 - f3);
        int i4 = (int) (f + f3);
        int i5 = ((int) f2) + i;
        drawable.setAlpha(190);
        drawable.setBounds(i2, i3, i4, i5);
        drawable.draw(canvas);
        this.getNewProxyInstance.set(i2, i3, i4, i5);
        this.QUSxYX.iwGUEr().AkhnZx(this.getNewProxyInstance);
    }

    public final java.lang.String OLrzqt(double d) {
        return pTB.OLrzqt(java.lang.String.valueOf(d), AbstractC36302oWt.EZpvd(d), RoundingMode.HALF_UP);
    }

    public double copydefault(double d, double d2, double d3, double d4) {
        return java.lang.Math.sqrt(java.lang.Math.pow(d3 - d, 2.0d) + java.lang.Math.pow(d4 - d2, 2.0d));
    }

    public java.lang.Boolean EZpvd(double d, double d2, double d3, double d4, double d5, double d6) {
        return java.lang.Boolean.valueOf((((d > d3 ? 1 : (d == d3 ? 0 : -1)) == 0 && (d2 > d4 ? 1 : (d2 == d4 ? 0 : -1)) == 0) || ((d3 > d5 ? 1 : (d3 == d5 ? 0 : -1)) == 0 && (d4 > d6 ? 1 : (d4 == d6 ? 0 : -1)) == 0) || ((d > d5 ? 1 : (d == d5 ? 0 : -1)) == 0 && (d2 > d6 ? 1 : (d2 == d6 ? 0 : -1)) == 0)) ? false : true);
    }

    public final void OLrzqt(float f, float f2, float f3, float f4, float f5, float f6, float f7, float[] fArr) {
        float fSqrt = (float) java.lang.Math.sqrt((r6 * r6) + (r7 * r7));
        float fSqrt2 = (float) java.lang.Math.sqrt((r8 * r8) + (r9 * r9));
        float f8 = ((f - f3) / fSqrt) + ((f5 - f) / fSqrt2);
        float fSqrt3 = (float) java.lang.Math.sqrt((r7 * r7) + (f8 * f8));
        fArr[0] = f + (((((-(f2 - f4)) / fSqrt) + ((-(f6 - f2)) / fSqrt2)) / fSqrt3) * f7);
        fArr[1] = f2 + ((f8 / fSqrt3) * f7);
    }
}
