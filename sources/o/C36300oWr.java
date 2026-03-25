package o;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.VectorDrawable;
import androidx.camera.video.AudioStats;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import com.okinc.kline.library.indicator.Expression;
import com.okinc.kline.library.layout.ChartArea;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.text.NumberFormat;
import java.util.LinkedHashMap;
import o.C32392mcI;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.oWr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36300oWr extends AbstractC36297oWo {
    public final int AuCTelauCTel;
    public final int AubY;
    public android.graphics.Paint AwvSrB;
    public final int AxsJAY;
    public final int DTwDnp;
    public final java.lang.String EZpvd;
    public final int ORxRYg;
    public final android.graphics.Paint OcIXYQ;
    public final NumberFormat QKVWgx;
    public final int QOLQEE;
    public final float QUSxYX;
    public oWC QVAiDq;
    public oWK QbewEr;
    public final java.lang.String QfsBiF;
    public final C36246oUr RJOkX;
    public final java.lang.String fARcdN;
    public final android.graphics.Paint gHZMYf;
    public int getFieldNames;
    public com.okinc.kline.library.data.DataSource getNewProxyInstance;
    public final int hDKMBd;
    public final int iwGUEr;
    public final android.graphics.Paint sSMYrx;
    public final int uzCIH;
    public final int wlaJM;
    public final int zLjUOn;
    public int zsXlph;
    public final android.graphics.Paint zuBGHE;

    public C36300oWr(java.lang.String str) {
        super(str);
        this.fARcdN = "MA60";
        this.EZpvd = "AVG: ";
        this.QfsBiF = ": ";
        this.zsXlph = 0;
        NumberFormat numberInstance = NumberFormat.getNumberInstance(java.util.Locale.US);
        this.QKVWgx = numberInstance;
        numberInstance.setGroupingUsed(false);
        this.RJOkX = C36246oUr.copydefault();
        this.ejfBZ.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        this.AwvSrB = new android.graphics.Paint(this.ejfBZ);
        android.graphics.Paint paint = this.ejfBZ;
        C55051xce c55051xce = C55051xce.OLrzqt;
        paint.setTypeface(c55051xce.AEQbTJ("harmony_sans_regular.ttf"));
        this.hDKMBd = AbstractC36302oWt.copydefault(40.0f);
        this.AubY = AbstractC36302oWt.copydefault(5.0f);
        this.wlaJM = AbstractC36302oWt.copydefault(6.0f);
        this.iwGUEr = AbstractC36302oWt.copydefault(10.0f);
        this.uzCIH = AbstractC36302oWt.copydefault(12.0f);
        this.AuCTelauCTel = AbstractC36302oWt.copydefault(16.0f);
        this.QOLQEE = AbstractC36302oWt.copydefault(4.0f);
        this.DTwDnp = AbstractC36302oWt.copydefault(16.0f);
        this.ORxRYg = AbstractC36302oWt.copydefault(2.0f);
        this.zLjUOn = AbstractC36302oWt.copydefault(20.0f);
        this.AxsJAY = AbstractC36302oWt.copydefault(6.0f);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.sSMYrx = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.zuBGHE = paint3;
        paint3.setAntiAlias(true);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(AbstractC36302oWt.copydefault(0.5f));
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.gHZMYf = paint4;
        paint4.setStyle(style);
        android.graphics.Paint paint5 = new android.graphics.Paint();
        this.OcIXYQ = paint5;
        paint5.setAntiAlias(true);
        paint5.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        paint5.setTypeface(c55051xce.valueOf());
        this.QUSxYX = (-(((int) java.lang.Math.ceil(r6.bottom - r6.top)) >> 1)) - paint5.getFontMetrics().top;
    }

    @Override // o.AbstractC36297oWo, o.AbstractC36302oWt
    public void KWHzl() {
        super.KWHzl();
        this.QKVWgx.setMaximumFractionDigits(this.RJOkX.gkJEwt());
        this.QKVWgx.setMinimumFractionDigits(this.RJOkX.gkJEwt());
    }

    @Override // o.AbstractC36297oWo, o.AbstractC36302oWt
    public void OLrzqt(oWK owk) {
        this.AwvSrB.setColor(owk.EZpvd(4));
        this.sSMYrx.setColor(owk.OLrzqt());
        this.gHZMYf.setColor(owk.valueOf());
        this.gHZMYf.setAlpha(CipherSuite.TLS_DHE_DSS_WITH_SEED_CBC_SHA);
        VectorDrawable vectorDrawable = (VectorDrawable) ContextCompat.getDrawable(this.RJOkX.AubY(), C32392mcI.Activity.AYXKKw);
        this.zOIQXb = vectorDrawable;
        if (vectorDrawable != null) {
            vectorDrawable.setTint(owk.isConnected());
        }
    }

    @Override // o.AbstractC36297oWo, o.AbstractC36302oWt
    public void AEQbTJ(android.graphics.Canvas canvas) {
        this.getNewProxyInstance = this.RJOkX.sSMYrx().get(copydefault());
        this.QVAiDq = this.RJOkX.iwGUEr().QVAiDq().get(EZpvd());
        oWK owk = this.RJOkX.zLjUOn().getThemes().get(copydefault());
        this.QbewEr = owk;
        if (this.getNewProxyInstance == null || this.QVAiDq == null || owk == null) {
            return;
        }
        if (this.RJOkX.DGUQLI()) {
            this.fJNWhG = AbstractC36302oWt.copydefault(76.0f);
        } else {
            this.fJNWhG = 0;
        }
        this.zsXlph = 0;
        this.getFieldNames = 0;
        this.RJOkX.iwGUEr().AEQbTJ(0);
        if (this.RJOkX.zLjUOn().isCeFiMCapMode()) {
            KWHzl(canvas);
        } else {
            copydefault(canvas);
            EZpvd(canvas);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:34|(7:36|(7:42|(2:44|(1:49)(1:48))(2:51|(8:53|(0)(1:57)|58|80|(2:85|(1:91))(1:84)|92|(2:94|(2:96|(1:98)(1:99)))(1:100)|101)(5:59|(2:61|(1:63)(1:64))(2:65|(2:67|(1:69)(1:70))(2:71|(2:76|(1:78)(1:79))(1:75)))|80|(6:82|85|(3:87|89|91)|92|(0)(0)|101)(0)|130))|50|58|80|(0)(0)|130)(1:40)|41|58|80|(0)(0)|130)(1:102)|103|(1:105)|106|153|107|(3:109|110|(3:112|151|113)(1:114))(2:115|(1:117))|121) */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0477, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(android.graphics.Canvas canvas) {
        java.util.ArrayList<java.lang.String> arrayList;
        ChartArea chartArea;
        oWN own;
        int i;
        int i2;
        java.lang.String str;
        int[] iArr;
        ChartArea chartArea2;
        oWN own2;
        int i3;
        int i4;
        java.lang.String str2;
        java.lang.Object obj;
        java.lang.String str3;
        com.okinc.kline.library.data.DataSource dataSource = this.RJOkX.sSMYrx().get(copydefault());
        java.util.ArrayList<java.lang.String> mainIndicatorNames = this.RJOkX.KWHzl(copydefault()).getMainIndicatorNames();
        if (dataSource == null || dataSource.gEmmrt() < 0) {
            return;
        }
        ChartArea chartArea3 = this.RJOkX.values().get(EZpvd());
        oWN own3 = this.RJOkX.DCJXGO().get(copydefault());
        if (chartArea3 == null || own3 == null) {
            return;
        }
        com.okinc.kline.library.data.DataSource dataSource2 = this.RJOkX.sSMYrx().get(copydefault());
        this.djBIcL.setColor(this.QbewEr.AEQbTJ());
        this.ejfBZ.setColor(this.QbewEr.EZpvd(3));
        AbstractC36262oVg abstractC36262oVgEZpvd = this.RJOkX.EZpvd(copydefault(), "compare");
        if (abstractC36262oVgEZpvd != null && dataSource2 != null) {
            this.getFieldNames = KWHzl(canvas, chartArea3, abstractC36262oVgEZpvd, dataSource2, own3, this.QbewEr);
            this.RJOkX.iwGUEr().AEQbTJ(this.getFieldNames);
        }
        int i5 = 0;
        if (this.RJOkX.KWHzl(copydefault()).getMainIndicatorNames().isEmpty()) {
            this.zsXlph = 0;
            this.RJOkX.iwGUEr().KWHzl(this.RJOkX.zuBGHE());
            if (this.RJOkX.zLjUOn().isBotKLine()) {
                this.RJOkX.iwGUEr().KWHzl(this.RJOkX.iwGUEr().AubY() + this.hDKMBd);
            }
            AYXKKw();
            return;
        }
        int i6 = 0;
        while (i6 < mainIndicatorNames.size()) {
            java.lang.String str4 = mainIndicatorNames.get(i6);
            oUK ouk = (oUK) this.RJOkX.iwGUEr().AkhnZx().get(EZpvd() + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND + JwtUtilsKt.JWT_DELIMITER + str4);
            if (ouk == null) {
                arrayList = mainIndicatorNames;
                chartArea = chartArea3;
                own = own3;
                i = i5;
                i2 = i6;
            } else {
                this.zsXlph++;
                AbstractC36262oVg abstractC36262oVgIsConnected = ouk.isConnected();
                int iHDKMBd = own3.hDKMBd();
                if (iHDKMBd < 0) {
                    iHDKMBd = own3.AuCTel() - 1;
                }
                int iAhwBna = abstractC36262oVgIsConnected.AhwBna();
                java.lang.String[] strArr = new java.lang.String[iAhwBna];
                int[] iArr2 = new int[iAhwBna];
                int i7 = i5;
                int i8 = i7;
                while (i7 < iAhwBna) {
                    Expression.Output outputOLrzqt = abstractC36262oVgIsConnected.OLrzqt(i7);
                    int i9 = iAhwBna;
                    double dExecute = outputOLrzqt.execute(iHDKMBd);
                    java.util.ArrayList<java.lang.String> arrayList2 = mainIndicatorNames;
                    if (!java.lang.Double.isNaN(dExecute)) {
                        own2 = own3;
                        if (abstractC36262oVgIsConnected.copydefault(i7).getIsShow()) {
                            i3 = i6;
                            chartArea2 = chartArea3;
                            if (this.RJOkX.ODWQjV() == -1 && "MA60".equals(outputOLrzqt.EZpvd())) {
                                str3 = "AVG: " + AbstractC36302oWt.AYXKKw(dExecute) + "  ";
                            } else {
                                if ("Support".equals(outputOLrzqt.EZpvd())) {
                                    oLZ olzOqFWZa = this.RJOkX.OqFWZa();
                                    if (olzOqFWZa == null || olzOqFWZa.KWHzl() == null) {
                                        iArr = iArr2;
                                    } else {
                                        str3 = outputOLrzqt.EZpvd() + ": " + AbstractC36302oWt.AYXKKw(olzOqFWZa.KWHzl().doubleValue()) + "  ";
                                    }
                                } else {
                                    iArr = iArr2;
                                    if ("Resistance".equals(outputOLrzqt.EZpvd())) {
                                        oLZ olzOqFWZa2 = this.RJOkX.OqFWZa();
                                        if (olzOqFWZa2 != null && olzOqFWZa2.EZpvd() != null) {
                                            str3 = outputOLrzqt.EZpvd() + ": " + AbstractC36302oWt.AYXKKw(olzOqFWZa2.EZpvd().doubleValue()) + "  ";
                                        }
                                        str2 = str4;
                                        obj = "SUPERTREND";
                                        if (!(outputOLrzqt instanceof Expression.Paint) && ((Expression.Paint) outputOLrzqt).AhwBna() - 1 > iHDKMBd) {
                                            str3 = outputOLrzqt.EZpvd() + ": --  ";
                                        } else if ((abstractC36262oVgIsConnected instanceof C36266oVk) && abstractC36262oVgIsConnected.AhwBna() > 0 && ((Expression.Paint) abstractC36262oVgIsConnected.OLrzqt(0)).AhwBna() - 1 > iHDKMBd) {
                                            str3 = outputOLrzqt.EZpvd() + ": --  ";
                                        }
                                        if (abstractC36262oVgIsConnected.ejfBZ().equals("BOLL")) {
                                            iAhwBna = i9;
                                        } else {
                                            iAhwBna = i9;
                                            if (abstractC36262oVgIsConnected.values() >= iAhwBna) {
                                                if (abstractC36262oVgIsConnected.copydefault(i7).getIsShow()) {
                                                    strArr[i7] = str3;
                                                } else {
                                                    strArr[i7] = "";
                                                }
                                            }
                                        }
                                        strArr[i8] = str3;
                                    } else {
                                        if ("SUPERTREND".equals(outputOLrzqt.EZpvd())) {
                                            obj = "SUPERTREND";
                                            str2 = str4;
                                            str3 = iHDKMBd >= abstractC36262oVgIsConnected.EZpvd(0).getValue() ? AEQbTJ(abstractC36262oVgIsConnected, outputOLrzqt) + ": " + AbstractC36302oWt.AYXKKw(dExecute) + "  " : AEQbTJ(abstractC36262oVgIsConnected, outputOLrzqt) + ": --";
                                        } else {
                                            str2 = str4;
                                            obj = "SUPERTREND";
                                            if (abstractC36262oVgIsConnected.ejfBZ().equals("ENVELOPE")) {
                                                str3 = iHDKMBd >= ((abstractC36262oVgIsConnected.djBIcL() - 1.0d) * 2.0d) - 1.0d ? outputOLrzqt.EZpvd() + ": " + AbstractC36302oWt.AYXKKw(dExecute) + "  " : outputOLrzqt.EZpvd() + ": --";
                                            } else if ("VOL".equals(outputOLrzqt.EZpvd()) && !this.RJOkX.AkhnZx().isEmpty()) {
                                                str3 = outputOLrzqt.EZpvd() + "(" + this.RJOkX.AkhnZx() + "): " + oWC.AEQbTJ(dExecute, AbstractC36302oWt.EZpvd(dExecute)) + " ";
                                            } else if (abstractC36262oVgIsConnected.ejfBZ().equals("VOLUME")) {
                                                str3 = outputOLrzqt.EZpvd() + ": " + oWC.AEQbTJ(dExecute, AbstractC36302oWt.EZpvd(dExecute)) + " ";
                                            } else {
                                                str3 = outputOLrzqt.EZpvd() + ": " + AbstractC36302oWt.AYXKKw(dExecute) + "  ";
                                            }
                                        }
                                        if (outputOLrzqt instanceof Expression.Paint) {
                                            if (abstractC36262oVgIsConnected instanceof C36266oVk) {
                                                str3 = outputOLrzqt.EZpvd() + ": --  ";
                                            }
                                            if (abstractC36262oVgIsConnected.ejfBZ().equals("BOLL")) {
                                            }
                                            strArr[i8] = str3;
                                        }
                                        i7++;
                                        str4 = str;
                                        i5 = i4;
                                        i6 = i3;
                                        mainIndicatorNames = arrayList2;
                                        own3 = own2;
                                        chartArea3 = chartArea2;
                                    }
                                }
                                str3 = "";
                                str2 = str4;
                                obj = "SUPERTREND";
                                if (outputOLrzqt instanceof Expression.Paint) {
                                }
                                i7++;
                                str4 = str;
                                i5 = i4;
                                i6 = i3;
                                mainIndicatorNames = arrayList2;
                                own3 = own2;
                                chartArea3 = chartArea2;
                            }
                            iArr = iArr2;
                            str2 = str4;
                            obj = "SUPERTREND";
                            if (outputOLrzqt instanceof Expression.Paint) {
                            }
                            i7++;
                            str4 = str;
                            i5 = i4;
                            i6 = i3;
                            mainIndicatorNames = arrayList2;
                            own3 = own2;
                            chartArea3 = chartArea2;
                        } else {
                            str2 = str4;
                            iArr = iArr2;
                            chartArea2 = chartArea3;
                            obj = "SUPERTREND";
                            i3 = i6;
                            iAhwBna = i9;
                        }
                        int iKWHzl = outputOLrzqt.KWHzl();
                        if (iKWHzl < 0) {
                            iKWHzl = i7 + 1;
                        }
                        str = str2;
                        if (str.equals(obj)) {
                            if (outputOLrzqt.getColor(iHDKMBd) == 1) {
                                i4 = 0;
                                try {
                                    iArr[i7] = Color.parseColor(AEQbTJ(abstractC36262oVgIsConnected.copydefault(0).getColor(), abstractC36262oVgIsConnected.copydefault(0).getColorBlk()));
                                } catch (java.lang.Exception unused) {
                                    iArr[i8] = this.QbewEr.KWHzl(iKWHzl);
                                }
                            } else {
                                i4 = 0;
                                iArr[i7] = Color.parseColor(AEQbTJ(abstractC36262oVgIsConnected.copydefault(1).getColor(), abstractC36262oVgIsConnected.copydefault(1).getColorBlk()));
                            }
                        } else {
                            i4 = 0;
                            if (abstractC36262oVgIsConnected.values() >= iAhwBna) {
                                iArr[i7] = Color.parseColor(AEQbTJ(abstractC36262oVgIsConnected.copydefault(i7).getColor(), abstractC36262oVgIsConnected.copydefault(i7).getColorBlk()));
                            }
                        }
                        i8++;
                    } else {
                        str = str4;
                        iArr = iArr2;
                        chartArea2 = chartArea3;
                        own2 = own3;
                        i3 = i6;
                        iAhwBna = i9;
                        i4 = 0;
                        if (abstractC36262oVgIsConnected instanceof oVQ) {
                            strArr[i7] = outputOLrzqt.EZpvd() + ": --  ";
                            Expression.Parameter parameterCopydefault = abstractC36262oVgIsConnected.copydefault(i7);
                            if (parameterCopydefault != null) {
                                try {
                                    iArr[i7] = Color.parseColor(AEQbTJ(parameterCopydefault.getColor(), parameterCopydefault.getColorBlk()));
                                } catch (java.lang.Exception unused2) {
                                    iArr2 = iArr;
                                    KWHzl(outputOLrzqt, i7, iArr2);
                                }
                            }
                        }
                        i7++;
                        str4 = str;
                        i5 = i4;
                        i6 = i3;
                        mainIndicatorNames = arrayList2;
                        own3 = own2;
                        chartArea3 = chartArea2;
                    }
                    iArr2 = iArr;
                    i7++;
                    str4 = str;
                    i5 = i4;
                    i6 = i3;
                    mainIndicatorNames = arrayList2;
                    own3 = own2;
                    chartArea3 = chartArea2;
                }
                arrayList = mainIndicatorNames;
                chartArea = chartArea3;
                own = own3;
                i = i5;
                i2 = i6;
                int width = (canvas.getWidth() - (this.AkhnZx * 2)) - this.fJNWhG;
                int i10 = 1;
                for (int i11 = i; i11 < iAhwBna; i11++) {
                    java.lang.String str5 = strArr[i11];
                    if (str5 != null) {
                        int iMeasureText = (int) this.ejfBZ.measureText(str5);
                        if (iMeasureText > width) {
                            width = canvas.getWidth();
                            this.zsXlph++;
                            i10++;
                        }
                        width -= iMeasureText;
                    }
                }
                this.RJOkX.iwGUEr().KWHzl((int) (((java.lang.Math.min(4, this.zsXlph) + 1) * this.DbNXlk) + (this.ejfBZ.measureText(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS) * java.lang.Math.min(4, this.zsXlph))));
                int iAuCTel = chartArea.AuCTel() + this.getFieldNames;
                if (this.RJOkX.zLjUOn().isBotKLine()) {
                    iAuCTel += this.hDKMBd;
                    this.RJOkX.iwGUEr().KWHzl(this.RJOkX.iwGUEr().AubY() + this.hDKMBd);
                }
                int i12 = iAuCTel;
                if (i2 == 0) {
                    KWHzl(canvas, strArr, iArr2, chartArea.AYXKKw() + this.AkhnZx, i12, this.ejfBZ);
                } else {
                    KWHzl(canvas, strArr, iArr2, chartArea.AYXKKw() + this.AkhnZx, i12 + ((int) (((this.zsXlph - i10) * this.DbNXlk) + (this.ejfBZ.measureText(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS) * (this.zsXlph - i10)))), this.ejfBZ);
                }
            }
            i6 = i2 + 1;
            i5 = i;
            mainIndicatorNames = arrayList;
            own3 = own;
            chartArea3 = chartArea;
        }
    }

    public final void KWHzl(Expression.Output output, int i, int[] iArr) {
        int iKWHzl = output.KWHzl();
        if (iKWHzl < 0) {
            iKWHzl = i + 1;
        }
        iArr[i] = this.QbewEr.KWHzl(iKWHzl);
    }

    public final java.lang.String AEQbTJ(AbstractC36262oVg abstractC36262oVg, Expression.Output output) {
        return output.EZpvd() + "(" + ((int) abstractC36262oVg.EZpvd(0).getValue()) + "," + ((int) abstractC36262oVg.EZpvd(1).getValue()) + ")";
    }

    public final int KWHzl(android.graphics.Canvas canvas, ChartArea chartArea, AbstractC36262oVg abstractC36262oVg, com.okinc.kline.library.data.DataSource dataSource, oWN own, oWK owk) {
        java.lang.String str;
        int iKWHzl;
        double d;
        int i;
        AbstractC36262oVg abstractC36262oVg2 = abstractC36262oVg;
        int iHDKMBd = own.hDKMBd();
        if (iHDKMBd < 0) {
            iHDKMBd = java.lang.Math.min(own.fIwbmz(), own.AuCTel() - 1);
        }
        int i2 = iHDKMBd;
        int iAhwBna = abstractC36262oVg.AhwBna();
        java.lang.String[] strArr = new java.lang.String[iAhwBna];
        int[] iArr = new int[iAhwBna];
        int i3 = 0;
        while (i3 < iAhwBna) {
            Expression.Output outputOLrzqt = abstractC36262oVg2.OLrzqt(i3);
            Expression.Parameter parameterCopydefault = abstractC36262oVg2.copydefault(i3);
            Expression.Parameter parameterEZpvd = abstractC36262oVg2.EZpvd(i3);
            if (parameterCopydefault.getIsShow()) {
                java.lang.String str2 = parameterCopydefault.getName() + ": ";
                double dExecute = outputOLrzqt.execute(i2);
                int iIsConnected = own.isConnected();
                if (dExecute > AudioStats.AUDIO_AMPLITUDE_NONE) {
                    int iFIwbmz = own.fIwbmz();
                    int i4 = iIsConnected;
                    double dExecute2 = AudioStats.AUDIO_AMPLITUDE_NONE;
                    while (true) {
                        if (i4 >= iFIwbmz) {
                            d = AudioStats.AUDIO_AMPLITUDE_NONE;
                            i = iIsConnected;
                            break;
                        }
                        dExecute2 = outputOLrzqt.execute(i4);
                        d = AudioStats.AUDIO_AMPLITUDE_NONE;
                        if (dExecute2 != AudioStats.AUDIO_AMPLITUDE_NONE) {
                            i = i4;
                            break;
                        }
                        i4++;
                    }
                    double d2 = dExecute2;
                    if (d2 == d) {
                        str = str2 + "--";
                    } else {
                        str = str2 + pDQ.copydefault.copydefault(dExecute, d2);
                    }
                    iKWHzl = i;
                } else {
                    str = str2 + "--";
                    iKWHzl = KWHzl(own, iIsConnected, outputOLrzqt);
                }
                strArr[i3] = str;
                int iKWHzl2 = outputOLrzqt.KWHzl();
                if (iKWHzl2 < 0) {
                    iKWHzl2 = i3 + 1;
                }
                try {
                    if (abstractC36262oVg.values() >= iAhwBna) {
                        iArr[i3] = Color.parseColor(AEQbTJ(parameterCopydefault.getColor(), parameterCopydefault.getColorBlk()));
                    }
                } catch (java.lang.Exception unused) {
                    iArr[i3] = owk.KWHzl(iKWHzl2);
                }
                this.zuBGHE.setColor(iArr[i3]);
                this.OcIXYQ.setColor(iArr[i3]);
                int iMin = java.lang.Math.min(own.fIwbmz(), own.AuCTel() - 1);
                if (i3 > 0) {
                    KWHzl(canvas, chartArea, outputOLrzqt.execute(iMin), own.isConnected(), iKWHzl, parameterEZpvd.getName());
                }
            }
            i3++;
            abstractC36262oVg2 = abstractC36262oVg;
        }
        return copydefault(canvas, strArr, iArr, chartArea.AYXKKw() + this.AkhnZx, chartArea.AuCTel() + this.AxsJAY);
    }

    public final int KWHzl(oWN own, int i, Expression.Output output) {
        int iFIwbmz = own.fIwbmz();
        for (int i2 = i; i2 < iFIwbmz; i2++) {
            if (output.execute(i2) != AudioStats.AUDIO_AMPLITUDE_NONE) {
                return i2;
            }
        }
        return i;
    }

    public final int copydefault(android.graphics.Canvas canvas, java.lang.String[] strArr, int[] iArr, int i, int i2) {
        int iOLrzqt;
        int i3;
        float f;
        int i4 = 0;
        if (strArr.length == 0) {
            return 0;
        }
        int iOLrzqt2 = OLrzqt(canvas);
        float f2 = i;
        int i5 = 0;
        float f3 = f2;
        for (int i6 = 0; i6 < strArr.length; i6++) {
            java.lang.String str = strArr[i6];
            if (str != null && !str.isEmpty()) {
                int iEZpvd = EZpvd(strArr[i6]);
                int i7 = this.uzCIH;
                int i8 = this.QOLQEE;
                int i9 = iEZpvd + i7 + i8;
                if (i6 > 0) {
                    i9 += this.iwGUEr + i8;
                }
                int i10 = i9;
                if (i10 > iOLrzqt2) {
                    iOLrzqt = OLrzqt(canvas);
                    i3 = i5 + 1;
                    f = f2;
                } else {
                    iOLrzqt = iOLrzqt2;
                    i3 = i5;
                    f = f3;
                }
                int i11 = (int) (i10 + f);
                int i12 = this.zLjUOn;
                int i13 = i2 + ((this.AxsJAY + i12) * i3);
                int i14 = i13 + i12;
                int i15 = (i13 + i14) / 2;
                RectF rectF = new RectF(f, i13, i11, i14);
                float f4 = this.uzCIH;
                canvas.drawRoundRect(rectF, f4, f4, this.gHZMYf);
                this.RJOkX.iwGUEr().OLrzqt().put(java.lang.Integer.valueOf(i6), rectF);
                try {
                    canvas.drawBitmap(this.RJOkX.zLjUOn().getCompareBitmapList().get(i6), (int) (this.QOLQEE + f), i15 - this.wlaJM, this.ejfBZ);
                } catch (java.lang.Exception e) {
                    pUU.copydefault("ChartView", "drawCompareInfo bitmap: " + e);
                }
                copydefault(canvas, strArr[i6], iArr[i6], this.uzCIH + f + (this.QOLQEE * 2), i15);
                if (i6 > 0) {
                    int i16 = i11 - this.QOLQEE;
                    int i17 = i16 - this.iwGUEr;
                    int i18 = this.AubY;
                    copydefault(canvas, i17, i15 - i18, i16, i15 + i18);
                    LinkedHashMap<java.lang.Integer, RectF> linkedHashMapCopydefault = this.RJOkX.iwGUEr().copydefault();
                    int i19 = this.QOLQEE;
                    linkedHashMapCopydefault.put(java.lang.Integer.valueOf(i6), new RectF(i17 - i19, i13 - i19, i11 + i19, i14 + i19));
                }
                int i20 = (this.QOLQEE * 2) + i10;
                f3 = f + i20;
                iOLrzqt2 = iOLrzqt - i20;
                i5 = i3;
                i4 = i14;
            }
        }
        return i4 + this.AxsJAY;
    }

    public final int OLrzqt(android.graphics.Canvas canvas) {
        return (canvas.getWidth() - C36246oUr.copydefault().iwGUEr().fJNWhG()) - this.AuCTelauCTel;
    }

    public final void copydefault(android.graphics.Canvas canvas, java.lang.String str, int i, float f, int i2) {
        java.lang.String[] strArrSplit = str.split(": ");
        if (strArrSplit.length >= 2) {
            this.OcIXYQ.setColor(this.QbewEr.AYXKKw());
            float f2 = i2;
            canvas.drawText(strArrSplit[0], f, this.QUSxYX + f2, this.OcIXYQ);
            this.OcIXYQ.setColor(i);
            canvas.drawText(strArrSplit[1], (f + EZpvd(strArrSplit[0])) - this.QOLQEE, f2 + this.QUSxYX, this.OcIXYQ);
        }
    }

    public final void KWHzl(android.graphics.Canvas canvas, ChartArea chartArea, double d, int i, int i2, java.lang.String str) {
        if (d > AudioStats.AUDIO_AMPLITUDE_NONE) {
            pDQ pdq = pDQ.copydefault;
            java.lang.String strCopydefault = pdq.copydefault(d, this.getNewProxyInstance.AEQbTJ.get(i2).EZpvd(str));
            int width = canvas.getWidth() - this.AuCTelauCTel;
            int iEZpvd = width - EZpvd(strCopydefault);
            int iEZpvd2 = this.QVAiDq.EZpvd(pdq.EZpvd(i, i2, d, str), false);
            if (iEZpvd2 < chartArea.AuCTel() || iEZpvd2 > chartArea.KWHzl()) {
                return;
            }
            int i3 = this.DTwDnp;
            int i4 = iEZpvd2 - (i3 >> 1);
            float f = iEZpvd;
            float f2 = i4;
            float f3 = width;
            float f4 = i3 + i4;
            RectF rectF = new RectF(f, f2, f3, f4);
            float f5 = this.ORxRYg;
            canvas.drawRoundRect(rectF, f5, f5, this.sSMYrx);
            RectF rectF2 = new RectF(f, f2, f3, f4);
            float f6 = this.ORxRYg;
            canvas.drawRoundRect(rectF2, f6, f6, this.zuBGHE);
            canvas.drawText(strCopydefault, iEZpvd + this.QOLQEE, iEZpvd2 + this.QUSxYX, this.OcIXYQ);
        }
    }

    public final void EZpvd(android.graphics.Canvas canvas) {
        java.lang.String str;
        this.fJNWhG = 0;
        com.okinc.kline.library.data.DataSource dataSource = this.RJOkX.sSMYrx().get(copydefault());
        ChartArea chartArea = this.RJOkX.values().get(EZpvd());
        oWN own = this.RJOkX.DCJXGO().get(copydefault());
        if (dataSource == null || dataSource.gEmmrt() < 0 || chartArea == null || own == null) {
            return;
        }
        this.ejfBZ.setColor(this.QbewEr.EZpvd(3));
        oUK ouk = (oUK) this.RJOkX.iwGUEr().AkhnZx().get(EZpvd() + JwtUtilsKt.JWT_DELIMITER + "l");
        if (ouk == null) {
            return;
        }
        AbstractC36262oVg abstractC36262oVgIsConnected = ouk.isConnected();
        int iHDKMBd = own.hDKMBd();
        if (iHDKMBd < 0) {
            iHDKMBd = own.AuCTel() - 1;
        }
        int iAhwBna = abstractC36262oVgIsConnected.AhwBna();
        java.lang.String[] strArr = new java.lang.String[iAhwBna];
        int[] iArr = new int[iAhwBna];
        int i = 0;
        for (int i2 = 0; i2 < iAhwBna; i2++) {
            Expression.Output outputOLrzqt = abstractC36262oVgIsConnected.OLrzqt(i2);
            double dExecute = outputOLrzqt.execute(iHDKMBd);
            if (!java.lang.Double.isNaN(dExecute)) {
                if ("MA60".equals(outputOLrzqt.EZpvd())) {
                    str = "AVG: " + AbstractC36302oWt.AYXKKw(dExecute);
                    if ((outputOLrzqt instanceof Expression.Paint) && ((Expression.Paint) outputOLrzqt).AhwBna() - 1 > iHDKMBd) {
                        str = outputOLrzqt.EZpvd() + ": --  ";
                    }
                } else {
                    str = "";
                }
                strArr[i] = str;
                iArr[i] = Color.parseColor(AEQbTJ(abstractC36262oVgIsConnected.copydefault(i2).getColor(), abstractC36262oVgIsConnected.copydefault(i2).getColorBlk()));
                i++;
            }
        }
        int iAuCTel = chartArea.AuCTel() + this.getFieldNames;
        if (this.RJOkX.zLjUOn().isBotKLine()) {
            iAuCTel += this.hDKMBd;
        }
        KWHzl(canvas, strArr, iArr, chartArea.AYXKKw() + this.AkhnZx, iAuCTel, this.ejfBZ);
    }

    public final void KWHzl(android.graphics.Canvas canvas) {
        ChartArea chartArea = this.RJOkX.values().get(EZpvd());
        if (chartArea != null) {
            this.djBIcL.setColor(this.QbewEr.AEQbTJ());
            int[] iArr = {this.QbewEr.OLrzqt(4)};
            java.lang.String[] strArr = {AhwBna()};
            int iAYXKKw = chartArea.AYXKKw();
            int i = this.AkhnZx;
            KWHzl(canvas, strArr, iArr, iAYXKKw + i, chartArea.AuCTel() + this.DbNXlk, this.ejfBZ);
        }
    }

    public final java.lang.String AhwBna() {
        java.util.HashMap map = new java.util.HashMap();
        map.put("ccy", this.RJOkX.zLjUOn().getTradeSymbol());
        return C33069mpW.OLrzqt(this.RJOkX.AubY().getResources().getString(C32392mcI.Dialog.gSBher), map);
    }

    private int EZpvd(java.lang.String str) {
        return (int) (this.OcIXYQ.measureText(str) + (this.QOLQEE * 2));
    }
}
