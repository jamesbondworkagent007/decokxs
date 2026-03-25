package o;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Shader;
import androidx.camera.video.AudioStats;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.okinc.business.invest_biz.data.bean.InvestButtonAction;
import com.okinc.kline.library.data.DataSource;
import com.okinc.kline.library.indicator.Expression;
import com.okinc.kline.library.layout.ChartArea;
import com.okinc.kline.library.template.TemplateSetting;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.Map;
import kotlin.Triple;
import o.C32392mcI;

/* JADX INFO: renamed from: o.oWm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36295oWm extends AbstractC36302oWt {
    public final android.graphics.Paint AEQbTJ;
    public final android.graphics.Path AYXKKw;
    public final android.graphics.Paint AhwBna;
    public final android.graphics.Paint AkhnZx;
    public final android.graphics.Paint AuCTel;
    public final android.graphics.Paint AuCTelauCTel;
    public final java.util.Map<java.lang.String, java.lang.String> AubY;
    public android.graphics.Path AwvSrB;
    public final android.graphics.Path AxsJAY;
    public final android.graphics.Path DbNXlk;
    public final int EZpvd;
    public ChartArea KWHzl;
    public final android.graphics.Paint OLrzqt;
    public final android.graphics.Path ORxRYg;
    public android.graphics.Path QKVWgx;
    public oWN QOLQEE;
    public final android.graphics.Path djBIcL;
    public final android.graphics.Paint ejfBZ;
    public final android.graphics.Paint fARcdN;
    public final android.graphics.Paint fIwbmz;
    public final android.graphics.Paint fJNWhG;
    public final android.graphics.Path fetchVPNInfo;
    public final android.graphics.Path gEmmrt;
    public android.graphics.Path gHZMYf;
    public final android.graphics.Paint getFieldNames;
    public final float getNewProxyInstance;
    public final android.content.res.Resources hDKMBd;
    public android.graphics.Path isConnected;
    public final android.graphics.Paint iwGUEr;
    public final android.graphics.Paint sSMYrx;
    public final android.graphics.Paint uzCIH;
    public final java.lang.String valueOf;
    public final android.graphics.Path values;
    public C36246oUr wlaJM;
    public oWC zLjUOn;
    public android.graphics.Path zsXlph;
    public final android.graphics.Paint zuBGHE;

    @Override // o.AbstractC36302oWt
    public void KWHzl() {
    }

    public C36295oWm(java.lang.String str) {
        super(str);
        this.values = new android.graphics.Path();
        this.QKVWgx = new android.graphics.Path();
        this.isConnected = new android.graphics.Path();
        this.getNewProxyInstance = 1.0f;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.OLrzqt = paint;
        this.EZpvd = 127;
        this.valueOf = "...";
        this.fJNWhG = new android.graphics.Paint();
        this.zuBGHE = new android.graphics.Paint();
        this.DbNXlk = new android.graphics.Path();
        this.fetchVPNInfo = new android.graphics.Path();
        this.ORxRYg = new android.graphics.Path();
        this.AxsJAY = new android.graphics.Path();
        this.djBIcL = new android.graphics.Path();
        this.AYXKKw = new android.graphics.Path();
        this.gEmmrt = new android.graphics.Path();
        this.AuCTelauCTel = new android.graphics.Paint();
        this.AubY = new java.util.HashMap();
        this.AkhnZx = new android.graphics.Paint();
        this.hDKMBd = C36246oUr.copydefault().AubY().getApplicationContext().getResources();
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.iwGUEr = paint2;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(1.0f);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.uzCIH = paint3;
        paint3.setStyle(style);
        paint3.setStrokeWidth(1.0f);
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.getFieldNames = paint4;
        Paint.Style style2 = Paint.Style.FILL;
        paint4.setStyle(style2);
        android.graphics.Paint paint5 = new android.graphics.Paint();
        this.fIwbmz = paint5;
        paint5.setStyle(style2);
        android.graphics.Paint paint6 = new android.graphics.Paint();
        this.fARcdN = paint6;
        paint6.setStyle(style2);
        android.graphics.Paint paint7 = new android.graphics.Paint();
        this.ejfBZ = paint7;
        paint7.setStyle(style2);
        android.graphics.Paint paint8 = new android.graphics.Paint();
        this.AEQbTJ = paint8;
        paint8.setStyle(style2);
        android.graphics.Paint paint9 = new android.graphics.Paint();
        this.AuCTel = paint9;
        paint9.setStyle(style);
        android.graphics.Paint paint10 = new android.graphics.Paint();
        this.sSMYrx = paint10;
        paint10.setStyle(style2);
        paint10.setAntiAlias(true);
        android.graphics.Paint paint11 = new android.graphics.Paint();
        this.AhwBna = paint11;
        paint11.setAntiAlias(true);
        paint11.setTextAlign(Paint.Align.LEFT);
        paint11.setTextSize(AbstractC36302oWt.KWHzl(12.0f));
        paint11.setTypeface(C55051xce.OLrzqt.AEQbTJ("harmony_sans_regular.ttf"));
        paint.setAntiAlias(true);
        paint.setStyle(style);
        paint.setPathEffect(this.getPriority);
        paint.setStrokeWidth(AbstractC36302oWt.copydefault(1.0f));
    }

    @Override // o.AbstractC36302oWt
    public void OLrzqt(oWK owk) {
        this.iwGUEr.setColor(owk.fIwbmz());
        this.uzCIH.setColor(owk.fJNWhG());
        this.getFieldNames.setColor(owk.fIwbmz());
        this.fIwbmz.setColor(owk.fJNWhG());
        this.fARcdN.setColor(owk.fIwbmz());
        this.ejfBZ.setColor(owk.fJNWhG());
        this.AuCTel.setColor(owk.OLrzqt(5));
        this.AuCTel.setAlpha(200);
        this.AhwBna.setColor(owk.OLrzqt(4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x04a5, code lost:
    
        if (r6 == androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE) goto L143;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x064c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0824 A[SYNTHETIC] */
    @Override // o.AbstractC36302oWt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void AEQbTJ(android.graphics.Canvas canvas) {
        boolean z;
        int i;
        int i2;
        oWK owk;
        int i3;
        AbstractC36262oVg abstractC36262oVg;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        int i6;
        double dDjBIcL;
        int iDjBIcL;
        Expression.Output output;
        int iEZpvd;
        int i7;
        float f;
        int i8;
        int i9;
        float f2;
        float fDbNXlk;
        int i10;
        int iKWHzl;
        int iCopydefault;
        int i11;
        int i12;
        int i13;
        AbstractC36262oVg abstractC36262oVg2;
        int i14;
        float f3;
        int i15;
        java.lang.Object obj;
        int i16;
        int i17;
        AbstractC36262oVg abstractC36262oVg3;
        int i18;
        boolean z4;
        int i19;
        oWK owk2;
        int i20;
        int i21;
        if (this.zhUgOk) {
            return;
        }
        this.values.reset();
        this.QKVWgx.reset();
        this.isConnected.reset();
        this.fARcdN.setAlpha(255);
        this.ejfBZ.setAlpha(255);
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        this.wlaJM = c36246oUrCopydefault;
        this.KWHzl = c36246oUrCopydefault.values().get(EZpvd());
        this.QOLQEE = this.wlaJM.DCJXGO().get(copydefault());
        oWC owc = this.wlaJM.iwGUEr().QVAiDq().get(EZpvd());
        this.zLjUOn = owc;
        boolean zEndsWith = owc.AEQbTJ().endsWith(com.ibm.icu.text.DateFormat.MINUTE);
        oWC owc2 = this.zLjUOn;
        if (owc2 == null) {
            return;
        }
        int i22 = 5;
        if (!owc2.AEQbTJ().endsWith(com.ibm.icu.text.DateFormat.MINUTE) && !EZpvd().endsWith("mVOLUME")) {
            float fDbNXlk2 = ((this.KWHzl.DbNXlk() * 1.0f) - (this.KWHzl.AYXKKw() * 1.0f)) / 5.0f;
            for (int i23 = 0; i23 < 5; i23++) {
                if (i23 != 0) {
                    float f4 = fDbNXlk2 * i23;
                    canvas.drawLine(f4, this.KWHzl.AuCTel(), f4, this.KWHzl.KWHzl(), this.AuCTel);
                }
            }
        }
        oUK ouk = (oUK) this.wlaJM.iwGUEr().AkhnZx().get(AEQbTJ());
        if (ouk == null) {
            return;
        }
        oWK owk3 = this.wlaJM.zLjUOn().getThemes().get(copydefault());
        float fAhwBna = this.QOLQEE.AhwBna();
        int iIsConnected = this.QOLQEE.isConnected();
        int iEjfBZ = this.QOLQEE.ejfBZ();
        boolean z5 = true;
        boolean z6 = iEjfBZ == this.QOLQEE.fARcdN() + iIsConnected;
        AbstractC36262oVg abstractC36262oVgIsConnected = ouk.isConnected();
        if (abstractC36262oVgIsConnected == null || copydefault(abstractC36262oVgIsConnected, canvas).booleanValue()) {
            return;
        }
        int iAhwBna = abstractC36262oVgIsConnected.AhwBna();
        int i24 = 0;
        while (i24 < iAhwBna) {
            Expression.Output outputOLrzqt = abstractC36262oVgIsConnected.OLrzqt(i24);
            if (outputOLrzqt.AYXKKw() == Expression.Output.Style.VOLUME_STICK) {
                i16 = i24;
                i17 = iAhwBna;
                abstractC36262oVg3 = abstractC36262oVgIsConnected;
                z4 = zEndsWith;
                i18 = iEjfBZ;
                i19 = iIsConnected;
                AEQbTJ(canvas, abstractC36262oVgIsConnected, this.wlaJM.sSMYrx().get(copydefault()), iIsConnected, iEjfBZ, this.QOLQEE.djBIcL(iIsConnected), fAhwBna, this.QOLQEE.fJNWhG(), this.zLjUOn);
            } else {
                i16 = i24;
                i17 = iAhwBna;
                abstractC36262oVg3 = abstractC36262oVgIsConnected;
                i18 = iEjfBZ;
                z4 = zEndsWith;
                i19 = iIsConnected;
                if (outputOLrzqt.AYXKKw() == Expression.Output.Style.MACD_STICK) {
                    EZpvd(canvas, owk3, outputOLrzqt, i19, i18, this.QOLQEE.djBIcL(i19), fAhwBna, this.QOLQEE.fJNWhG(), this.zLjUOn);
                } else if (outputOLrzqt.AYXKKw() == Expression.Output.Style.SAR_POINT) {
                    copydefault(canvas, owk3, outputOLrzqt, i19, i18, this.QOLQEE.AhwBna(i19), fAhwBna, this.QOLQEE.fJNWhG(), this.zLjUOn);
                } else {
                    if (outputOLrzqt.AYXKKw() == Expression.Output.Style.LSA_STICK) {
                        owk2 = owk3;
                        i20 = i17;
                        i21 = i22;
                        AEQbTJ(canvas, owk3, this.wlaJM.sSMYrx().get(copydefault()), i19, i18, this.QOLQEE.DbNXlk(i19), fAhwBna, this.QOLQEE.fJNWhG(), this.zLjUOn, outputOLrzqt.KWHzl(), abstractC36262oVg3, outputOLrzqt);
                    } else {
                        owk2 = owk3;
                        i20 = i17;
                        i21 = i22;
                        if (outputOLrzqt.AYXKKw() == Expression.Output.Style.TAKER_STICK) {
                            EZpvd(canvas, owk2, this.wlaJM.sSMYrx().get(copydefault()), i19, i18, this.QOLQEE.DbNXlk(i19), fAhwBna, this.QOLQEE.fJNWhG(), this.zLjUOn, abstractC36262oVg3);
                        } else if (outputOLrzqt.AYXKKw() == Expression.Output.Style.SUPPORT_RESISTANCE) {
                            OLrzqt(canvas);
                            copydefault(canvas);
                        } else if (outputOLrzqt.AYXKKw() == Expression.Output.Style.SUPERTREND) {
                            EZpvd(canvas, outputOLrzqt, i19, i18, fAhwBna, this.zLjUOn, abstractC36262oVg3);
                        }
                    }
                    i24 = i16 + 1;
                    i22 = i21;
                    iIsConnected = i19;
                    iAhwBna = i20;
                    abstractC36262oVgIsConnected = abstractC36262oVg3;
                    zEndsWith = z4;
                    iEjfBZ = i18;
                    owk3 = owk2;
                    z5 = true;
                }
            }
            owk2 = owk3;
            i20 = i17;
            i21 = i22;
            i24 = i16 + 1;
            i22 = i21;
            iIsConnected = i19;
            iAhwBna = i20;
            abstractC36262oVgIsConnected = abstractC36262oVg3;
            zEndsWith = z4;
            iEjfBZ = i18;
            owk3 = owk2;
            z5 = true;
        }
        int i25 = iAhwBna;
        int i26 = iEjfBZ;
        oWK owk4 = owk3;
        int i27 = i22;
        boolean z7 = zEndsWith;
        int i28 = iIsConnected;
        this.fJNWhG.setStyle(Paint.Style.STROKE);
        this.fJNWhG.setStrokeWidth(AbstractC36302oWt.copydefault(1.0f));
        this.fJNWhG.setAntiAlias(true);
        this.zuBGHE.setStyle(Paint.Style.FILL);
        AbstractC36262oVg abstractC36262oVg4 = abstractC36262oVgIsConnected;
        boolean z8 = abstractC36262oVg4 instanceof C36266oVk;
        int i29 = 2;
        if (z8 && abstractC36262oVg4.values() >= 4) {
            this.AEQbTJ.setColor(Color.parseColor(AEQbTJ(abstractC36262oVg4.copydefault(3).getColor(), abstractC36262oVg4.copydefault(3).getColorBlk())));
            this.AEQbTJ.setAlpha(abstractC36262oVg4.copydefault(3).getTransparency());
        } else if ((abstractC36262oVg4 instanceof oVE) && abstractC36262oVg4.values() >= 6) {
            this.AEQbTJ.setColor(Color.parseColor(AEQbTJ(abstractC36262oVg4.copydefault(i27).getColor(), abstractC36262oVg4.copydefault(i27).getColorBlk())));
            this.AEQbTJ.setAlpha(abstractC36262oVg4.copydefault(i27).getTransparency());
        } else if ((abstractC36262oVg4 instanceof C36277oVv) && abstractC36262oVg4.values() >= 3) {
            this.AEQbTJ.setColor(Color.parseColor(AEQbTJ(abstractC36262oVg4.copydefault(2).getColor(), abstractC36262oVg4.copydefault(2).getColorBlk())));
            this.AEQbTJ.setAlpha(abstractC36262oVg4.copydefault(2).getTransparency());
        }
        int i30 = i25;
        int i31 = 0;
        while (i31 < i30) {
            Expression.Output outputOLrzqt2 = abstractC36262oVg4.OLrzqt(i31);
            Expression.Parameter parameterEZpvd = abstractC36262oVg4.EZpvd(i31);
            if (outputOLrzqt2.AYXKKw() != Expression.Output.Style.LINE_SHADER) {
                z3 = outputOLrzqt2.AYXKKw() != Expression.Output.Style.LINE;
                i5 = i30;
                z2 = z7;
                i4 = i26;
                i3 = i31;
                i2 = i5;
                abstractC36262oVg = abstractC36262oVg4;
                i26 = i4;
                z = z2;
                i = i28;
                owk = owk4;
                i31 = i3 + 1;
                owk4 = owk;
                i30 = i2;
                i28 = i;
                z7 = z;
                i29 = 2;
                abstractC36262oVg4 = abstractC36262oVg;
            }
            if (abstractC36262oVg4.fARcdN() || !AEQbTJ(abstractC36262oVg4)) {
                this.zsXlph = new android.graphics.Path();
                this.gHZMYf = new android.graphics.Path();
                if (abstractC36262oVg4 instanceof oVL) {
                    iDjBIcL = (int) abstractC36262oVg4.djBIcL();
                } else {
                    if (outputOLrzqt2 instanceof Expression.Paint) {
                        Expression.Paint paint = (Expression.Paint) outputOLrzqt2;
                        if (paint.AhwBna() > 0) {
                            iDjBIcL = paint.AhwBna();
                        }
                    }
                    if (z8) {
                        i6 = 0;
                        iDjBIcL = abstractC36262oVg4.AhwBna() > 0 ? ((Expression.Paint) abstractC36262oVg4.OLrzqt(0)).AhwBna() : i6;
                        if (i28 >= iDjBIcL) {
                            iDjBIcL = i28;
                        }
                        float fAhwBna2 = this.QOLQEE.AhwBna(iDjBIcL);
                        if (iDjBIcL > i28) {
                            int i32 = iDjBIcL - 1;
                            double dExecute = outputOLrzqt2.execute(i32);
                            if (java.lang.Double.isNaN(dExecute)) {
                                i3 = i31;
                                i10 = i30;
                                abstractC36262oVg = abstractC36262oVg4;
                                i9 = i28;
                                z2 = z7;
                                i4 = i26;
                                i2 = i10;
                                i26 = i4;
                                z = z2;
                                owk = owk4;
                                i = i9;
                            } else {
                                if (abstractC36262oVg4 instanceof C36270oVo) {
                                    dExecute = pDQ.copydefault.EZpvd(i32, i32, dExecute, parameterEZpvd.getName());
                                }
                                i5 = i30;
                                z2 = z7;
                                iEZpvd = this.zLjUOn.EZpvd(dExecute, z2);
                                float f5 = iEZpvd;
                                this.zsXlph.moveTo(fAhwBna2 - fAhwBna, f5);
                                if (z3) {
                                    float f6 = (fAhwBna2 - (fAhwBna / 2.0f)) - 1.0f;
                                    this.gHZMYf.moveTo(f6, this.KWHzl.KWHzl());
                                    this.gHZMYf.lineTo(f6, f5);
                                }
                                i8 = iDjBIcL;
                                f = fAhwBna2;
                                output = outputOLrzqt2;
                                i4 = i26;
                                i7 = i8;
                            }
                        } else {
                            i5 = i30;
                            z2 = z7;
                            double dExecute2 = outputOLrzqt2.execute(iDjBIcL);
                            if (!java.lang.Double.isNaN(dExecute2)) {
                                if (abstractC36262oVg4 instanceof C36270oVo) {
                                    if (dExecute2 == AudioStats.AUDIO_AMPLITUDE_NONE) {
                                        int i33 = iDjBIcL;
                                        i4 = i26;
                                        while (true) {
                                            if (i33 >= i4) {
                                                break;
                                            }
                                            dExecute2 = outputOLrzqt2.execute(i33);
                                            if (dExecute2 != AudioStats.AUDIO_AMPLITUDE_NONE) {
                                                fAhwBna2 = this.QOLQEE.AhwBna(i33);
                                                iDjBIcL = i33;
                                                break;
                                            }
                                            i33++;
                                        }
                                    } else {
                                        i4 = i26;
                                    }
                                    int i34 = iDjBIcL;
                                    output = outputOLrzqt2;
                                    dExecute2 = pDQ.copydefault.EZpvd(i28, i34, dExecute2, parameterEZpvd.getName());
                                    iDjBIcL = i34;
                                    fAhwBna2 = fAhwBna2;
                                } else {
                                    output = outputOLrzqt2;
                                    i4 = i26;
                                }
                                iEZpvd = this.zLjUOn.EZpvd(dExecute2, z2);
                                if (z3) {
                                    float f7 = iEZpvd;
                                    this.zsXlph.moveTo(fAhwBna2, f7);
                                    this.zsXlph.lineTo(fAhwBna2, f7);
                                    this.gHZMYf.moveTo(fAhwBna2, this.KWHzl.KWHzl());
                                    this.gHZMYf.lineTo(fAhwBna2, f7);
                                } else {
                                    this.zsXlph.moveTo(fAhwBna2, iEZpvd);
                                }
                                i7 = iDjBIcL;
                                f = fAhwBna2 + fAhwBna;
                                i8 = iDjBIcL + 1;
                            }
                            i3 = i31;
                            i2 = i5;
                            abstractC36262oVg = abstractC36262oVg4;
                            i26 = i4;
                            z = z2;
                            i = i28;
                            owk = owk4;
                        }
                        while (i8 < i4) {
                            double dExecute3 = output.execute(i8);
                            if (java.lang.Double.isNaN(dExecute3)) {
                                i12 = i31;
                                i13 = i5;
                                abstractC36262oVg2 = abstractC36262oVg4;
                                i14 = i28;
                                f3 = f;
                            } else {
                                if (abstractC36262oVg4 instanceof C36270oVo) {
                                    if (dExecute3 != AudioStats.AUDIO_AMPLITUDE_NONE) {
                                        pDQ pdq = pDQ.copydefault;
                                        java.lang.String name = parameterEZpvd.getName();
                                        i15 = i31;
                                        obj = InvestButtonAction.ACTION_CALLBACK_CLOSE;
                                        i14 = i28;
                                        f3 = f;
                                        dExecute3 = pdq.EZpvd(i28, i7, dExecute3, name);
                                    }
                                    i12 = i31;
                                    i13 = i5;
                                    abstractC36262oVg2 = abstractC36262oVg4;
                                    i14 = i28;
                                    f3 = f;
                                } else {
                                    i15 = i31;
                                    obj = InvestButtonAction.ACTION_CALLBACK_CLOSE;
                                    i14 = i28;
                                    f3 = f;
                                }
                                double d = dExecute3;
                                int iEZpvd2 = this.zLjUOn.EZpvd(d, z2);
                                if (OLrzqt(abstractC36262oVg4) && d == AudioStats.AUDIO_AMPLITUDE_NONE) {
                                    this.zsXlph.moveTo(f3, iEZpvd2);
                                    abstractC36262oVg2 = abstractC36262oVg4;
                                    i12 = i15;
                                    i13 = i5;
                                } else if (i8 == this.QOLQEE.AuCTel() - 1 && abstractC36262oVg4.AYXKKw().equals(obj)) {
                                    if (this.wlaJM.iwGUEr().ejfBZ() == AudioStats.AUDIO_AMPLITUDE_NONE) {
                                        this.wlaJM.iwGUEr().AEQbTJ(d);
                                    }
                                    if (this.wlaJM.iwGUEr().ejfBZ() == d) {
                                        i12 = i15;
                                        AEQbTJ(this.zsXlph, this.gHZMYf, f3, iEZpvd2, z3);
                                        i13 = i5;
                                        abstractC36262oVg2 = abstractC36262oVg4;
                                    } else {
                                        i12 = i15;
                                        double dEjfBZ = this.wlaJM.iwGUEr().ejfBZ();
                                        i13 = i5;
                                        abstractC36262oVg2 = abstractC36262oVg4;
                                        this.wlaJM.iwGUEr().AEQbTJ(dEjfBZ + ((d - dEjfBZ) * ((double) this.wlaJM.iwGUEr().EZpvd())));
                                        double dEjfBZ2 = this.wlaJM.iwGUEr().ejfBZ();
                                        int iEZpvd3 = (int) (this.zLjUOn.EZpvd(dEjfBZ2, z2) + ((iEZpvd2 - this.zLjUOn.EZpvd(dEjfBZ2, z2)) * this.wlaJM.iwGUEr().EZpvd()));
                                        this.zlvcHA = iEZpvd3;
                                        AEQbTJ(this.zsXlph, this.gHZMYf, f3, iEZpvd3, z3);
                                    }
                                } else {
                                    abstractC36262oVg2 = abstractC36262oVg4;
                                    i12 = i15;
                                    i13 = i5;
                                    AEQbTJ(this.zsXlph, this.gHZMYf, f3, iEZpvd2, z3);
                                }
                                iEZpvd = iEZpvd2;
                            }
                            i8++;
                            f = f3 + fAhwBna;
                            abstractC36262oVg4 = abstractC36262oVg2;
                            i5 = i13;
                            i28 = i14;
                            i31 = i12;
                        }
                        int i35 = i31;
                        int i36 = i5;
                        AbstractC36262oVg abstractC36262oVg5 = abstractC36262oVg4;
                        i9 = i28;
                        f2 = f;
                        if (z3 && z6) {
                            fDbNXlk = this.QOLQEE.DbNXlk(i4);
                            float f8 = iEZpvd;
                            this.zsXlph.lineTo(fDbNXlk, f8);
                            this.gHZMYf.lineTo(fDbNXlk, f8);
                        } else {
                            fDbNXlk = f2 - fAhwBna;
                        }
                        abstractC36262oVg = abstractC36262oVg5;
                        if ((!z8 || (abstractC36262oVg instanceof oVE) || (abstractC36262oVg instanceof C36277oVv)) && output.EZpvd().equals("UB")) {
                            this.QKVWgx = this.zsXlph;
                        } else if ((z8 || (abstractC36262oVg instanceof oVE) || (abstractC36262oVg instanceof C36277oVv)) && output.EZpvd().equals(ExpandedProductParsedResult.POUND)) {
                            this.isConnected = this.zsXlph;
                        }
                        i10 = i36;
                        if (abstractC36262oVg.values() >= i10) {
                            i3 = i35;
                            if (!abstractC36262oVg.copydefault(i3).getIsShow()) {
                                i2 = i10;
                                i26 = i4;
                                z = z2;
                                owk = owk4;
                                i = i9;
                            }
                        } else {
                            i3 = i35;
                        }
                        iKWHzl = output.KWHzl();
                        if (iKWHzl < 0) {
                            iKWHzl = i3 + 1;
                        }
                        owk = owk4;
                        int iKWHzl2 = owk.KWHzl(iKWHzl);
                        if (output.EZpvd().equals(InvestButtonAction.ACTION_CALLBACK_CLOSE)) {
                            iKWHzl2 = owk.EZpvd();
                        } else if (abstractC36262oVg.values() >= i10) {
                            iKWHzl2 = Color.parseColor(AEQbTJ(abstractC36262oVg.copydefault(i3).getColor(), abstractC36262oVg.copydefault(i3).getColorBlk()));
                        }
                        this.fJNWhG.setColor(iKWHzl2);
                        iCopydefault = output.copydefault();
                        if (iCopydefault > 0) {
                            this.fJNWhG.setStrokeWidth(iCopydefault);
                        }
                        if ((abstractC36262oVg instanceof oVE) && (output.EZpvd().equals("UB") || output.EZpvd().equals(ExpandedProductParsedResult.POUND))) {
                            this.fJNWhG.setPathEffect(this.getPriority);
                        } else {
                            this.fJNWhG.setPathEffect(null);
                        }
                        i2 = i10;
                        canvas.drawPath(this.zsXlph, this.fJNWhG);
                        if (output.EZpvd().equals(InvestButtonAction.ACTION_CALLBACK_CLOSE)) {
                            i11 = iKWHzl;
                            i26 = i4;
                            z = z2;
                            i = i9;
                        } else {
                            this.sSMYrx.setColor(owk.EZpvd());
                            this.sSMYrx.setAlpha(130);
                            android.graphics.Path path = this.zsXlph;
                            this.AwvSrB = path;
                            path.lineTo(fDbNXlk, this.KWHzl.KWHzl());
                            this.AwvSrB.lineTo(this.QOLQEE.AhwBna(i9), this.KWHzl.KWHzl());
                            this.AwvSrB.close();
                            i = i9;
                            i11 = iKWHzl;
                            i26 = i4;
                            z = z2;
                            this.sSMYrx.setShader(new LinearGradient(this.KWHzl.DbNXlk(), this.KWHzl.AuCTel(), this.KWHzl.DbNXlk(), this.KWHzl.KWHzl(), this.sSMYrx.getColor(), 0, Shader.TileMode.CLAMP));
                            canvas.drawPath(this.AwvSrB, this.sSMYrx);
                        }
                        if (!z3) {
                            int iDjBIcL2 = output.djBIcL();
                            int iAEQbTJ = output.AEQbTJ();
                            if (iDjBIcL2 == -1) {
                                iDjBIcL2 = i11;
                            }
                            this.zuBGHE.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.KWHzl.KWHzl(), owk.KWHzl(iDjBIcL2), owk.KWHzl(iAEQbTJ == -1 ? i11 : iAEQbTJ), Shader.TileMode.MIRROR));
                            this.gHZMYf.setFillType(Path.FillType.WINDING);
                            this.gHZMYf.lineTo(fDbNXlk, this.KWHzl.KWHzl());
                            this.gHZMYf.close();
                            canvas.drawPath(this.gHZMYf, this.zuBGHE);
                        }
                    } else {
                        i6 = 0;
                        if (abstractC36262oVg4 instanceof C36279oVx) {
                            if (abstractC36262oVg4.DbNXlk() > 0) {
                                dDjBIcL = abstractC36262oVg4.djBIcL();
                                iDjBIcL = (int) dDjBIcL;
                            }
                        } else if (abstractC36262oVg4 instanceof C36277oVv) {
                            iDjBIcL = ((int) (abstractC36262oVg4.djBIcL() - 1.0d)) * i29;
                        } else if ((abstractC36262oVg4 instanceof C36274oVs) && abstractC36262oVg4.DbNXlk() > 0) {
                            dDjBIcL = abstractC36262oVg4.djBIcL();
                            iDjBIcL = (int) dDjBIcL;
                        }
                        if (i28 >= iDjBIcL) {
                        }
                        float fAhwBna22 = this.QOLQEE.AhwBna(iDjBIcL);
                        if (iDjBIcL > i28) {
                        }
                        while (i8 < i4) {
                        }
                        int i352 = i31;
                        int i362 = i5;
                        AbstractC36262oVg abstractC36262oVg52 = abstractC36262oVg4;
                        i9 = i28;
                        f2 = f;
                        if (z3) {
                            fDbNXlk = f2 - fAhwBna;
                            abstractC36262oVg = abstractC36262oVg52;
                            if (z8) {
                                this.QKVWgx = this.zsXlph;
                                i10 = i362;
                                if (abstractC36262oVg.values() >= i10) {
                                }
                                iKWHzl = output.KWHzl();
                                if (iKWHzl < 0) {
                                }
                                owk = owk4;
                                int iKWHzl22 = owk.KWHzl(iKWHzl);
                                if (output.EZpvd().equals(InvestButtonAction.ACTION_CALLBACK_CLOSE)) {
                                }
                                this.fJNWhG.setColor(iKWHzl22);
                                iCopydefault = output.copydefault();
                                if (iCopydefault > 0) {
                                }
                                if (abstractC36262oVg instanceof oVE) {
                                    this.fJNWhG.setPathEffect(null);
                                    i2 = i10;
                                    canvas.drawPath(this.zsXlph, this.fJNWhG);
                                    if (output.EZpvd().equals(InvestButtonAction.ACTION_CALLBACK_CLOSE)) {
                                    }
                                    if (!z3) {
                                    }
                                }
                            } else {
                                this.QKVWgx = this.zsXlph;
                                i10 = i362;
                                if (abstractC36262oVg.values() >= i10) {
                                }
                                iKWHzl = output.KWHzl();
                                if (iKWHzl < 0) {
                                }
                                owk = owk4;
                                int iKWHzl222 = owk.KWHzl(iKWHzl);
                                if (output.EZpvd().equals(InvestButtonAction.ACTION_CALLBACK_CLOSE)) {
                                }
                                this.fJNWhG.setColor(iKWHzl222);
                                iCopydefault = output.copydefault();
                                if (iCopydefault > 0) {
                                }
                                if (abstractC36262oVg instanceof oVE) {
                                }
                            }
                        }
                    }
                    i31 = i3 + 1;
                    owk4 = owk;
                    i30 = i2;
                    i28 = i;
                    z7 = z;
                    i29 = 2;
                    abstractC36262oVg4 = abstractC36262oVg;
                }
                i6 = 0;
                if (i28 >= iDjBIcL) {
                }
                float fAhwBna222 = this.QOLQEE.AhwBna(iDjBIcL);
                if (iDjBIcL > i28) {
                }
                while (i8 < i4) {
                }
                int i3522 = i31;
                int i3622 = i5;
                AbstractC36262oVg abstractC36262oVg522 = abstractC36262oVg4;
                i9 = i28;
                f2 = f;
                if (z3) {
                }
                i31 = i3 + 1;
                owk4 = owk;
                i30 = i2;
                i28 = i;
                z7 = z;
                i29 = 2;
                abstractC36262oVg4 = abstractC36262oVg;
            } else {
                i5 = i30;
                z2 = z7;
            }
            i4 = i26;
            i3 = i31;
            i2 = i5;
            abstractC36262oVg = abstractC36262oVg4;
            i26 = i4;
            z = z2;
            i = i28;
            owk = owk4;
            i31 = i3 + 1;
            owk4 = owk;
            i30 = i2;
            i28 = i;
            z7 = z;
            i29 = 2;
            abstractC36262oVg4 = abstractC36262oVg;
        }
        AbstractC36262oVg abstractC36262oVg6 = abstractC36262oVg4;
        if ((z8 && abstractC36262oVg6.values() >= 4 && abstractC36262oVg6.copydefault(3).getIsShow()) || (((abstractC36262oVg6 instanceof oVE) && abstractC36262oVg6.values() >= 6 && abstractC36262oVg6.copydefault(5).getIsShow()) || ((abstractC36262oVg6 instanceof C36277oVv) && abstractC36262oVg6.values() >= 3 && abstractC36262oVg6.copydefault(2).getIsShow()))) {
            OLrzqt(canvas, this.QKVWgx, this.isConnected);
        }
    }

    public final void AEQbTJ(android.graphics.Path path, android.graphics.Path path2, float f, int i, boolean z) {
        float f2 = i;
        path.lineTo(f, f2);
        if (z) {
            path2.lineTo(f, f2);
        }
    }

    public final void OLrzqt(android.graphics.Canvas canvas) {
        oLZ olzOqFWZa = this.wlaJM.OqFWZa();
        if (olzOqFWZa == null || olzOqFWZa.copydefault() == null || olzOqFWZa.copydefault().intValue() <= 0) {
            return;
        }
        oUK ouk = (oUK) this.wlaJM.iwGUEr().AkhnZx().get(EZpvd() + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND + JwtUtilsKt.JWT_DELIMITER + "SR");
        if (ouk != null) {
            AbstractC36262oVg abstractC36262oVgIsConnected = ouk.isConnected();
            try {
                this.OLrzqt.setColor(Color.parseColor(AEQbTJ(abstractC36262oVgIsConnected.copydefault(1).getColor(), abstractC36262oVgIsConnected.copydefault(1).getColorBlk())));
                KWHzl(canvas, 0, canvas.getWidth() - C55298xhM.OLrzqt(16, this.wlaJM.AubY()), olzOqFWZa.copydefault().intValue(), this.OLrzqt);
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("drawSupportLine fail", e);
            }
        }
    }

    public final void copydefault(android.graphics.Canvas canvas) {
        oLZ olzOqFWZa = this.wlaJM.OqFWZa();
        if (olzOqFWZa == null || olzOqFWZa.AEQbTJ() == null || olzOqFWZa.AEQbTJ().intValue() <= 0) {
            return;
        }
        oUK ouk = (oUK) this.wlaJM.iwGUEr().AkhnZx().get(EZpvd() + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND + JwtUtilsKt.JWT_DELIMITER + "SR");
        if (ouk != null) {
            AbstractC36262oVg abstractC36262oVgIsConnected = ouk.isConnected();
            try {
                this.OLrzqt.setColor(Color.parseColor(AEQbTJ(abstractC36262oVgIsConnected.copydefault(0).getColor(), abstractC36262oVgIsConnected.copydefault(0).getColorBlk())));
                KWHzl(canvas, 0, canvas.getWidth() - C55298xhM.OLrzqt(16, this.wlaJM.AubY()), olzOqFWZa.AEQbTJ().intValue(), this.OLrzqt);
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("drawResistanceLine fail", e);
            }
        }
    }

    public void AEQbTJ(android.graphics.Canvas canvas, oWK owk, com.okinc.kline.library.data.DataSource dataSource, int i, int i2, float f, float f2, float f3, oWC owc, int i3, AbstractC36262oVg abstractC36262oVg, Expression.Output output) {
        int i4;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        oWC owc2 = owc;
        boolean zEndsWith = owc.AEQbTJ().endsWith(com.ibm.icu.text.DateFormat.MINUTE);
        double d = AudioStats.AUDIO_AMPLITUDE_NONE;
        int iEZpvd = owc2.EZpvd(AudioStats.AUDIO_AMPLITUDE_NONE, zEndsWith);
        if (abstractC36262oVg.EZpvd) {
            iEZpvd = owc.OLrzqt(output.valueOf(), output.gEmmrt(), AudioStats.AUDIO_AMPLITUDE_NONE);
        }
        int i5 = iEZpvd;
        this.DbNXlk.reset();
        this.fetchVPNInfo.reset();
        int i6 = i;
        float f9 = f;
        while (i6 < i2) {
            DataSource.StateListAnimator stateListAnimator = dataSource.AEQbTJ.get(i6);
            double dGEmmrt = abstractC36262oVg instanceof C36275oVt ? stateListAnimator.gEmmrt() : d;
            if (abstractC36262oVg instanceof oVB) {
                dGEmmrt = stateListAnimator.fetchVPNInfo();
            }
            if (abstractC36262oVg instanceof C36281oVz) {
                dGEmmrt = stateListAnimator.AYXKKw();
            }
            double d2 = dGEmmrt;
            if (d2 >= d) {
                int iEZpvd2 = owc2.EZpvd(d2, owc.AEQbTJ().endsWith(com.ibm.icu.text.DateFormat.MINUTE));
                int iAEQbTJ = owc2.AEQbTJ(d2);
                if (abstractC36262oVg.EZpvd) {
                    f8 = 1.0f;
                    i4 = i6;
                    f7 = f9;
                    int iEZpvd3 = owc.EZpvd(output.valueOf(), output.gEmmrt(), d2);
                    iEZpvd2 = owc.OLrzqt(output.valueOf(), output.gEmmrt(), d2);
                    iAEQbTJ = iEZpvd3;
                } else {
                    i4 = i6;
                    f7 = f9;
                    f8 = 1.0f;
                }
                float f10 = f7;
                AbstractC36302oWt.AEQbTJ(this.DbNXlk, f10, iEZpvd2, java.lang.Math.max(f3, f8) + f10, iEZpvd2 + iAEQbTJ);
                f4 = f3;
                f6 = f10;
            } else {
                i4 = i6;
                double d3 = -d2;
                int iAEQbTJ2 = owc2.AEQbTJ(d3);
                if (abstractC36262oVg.EZpvd) {
                    f4 = f3;
                    f5 = f9;
                    iAEQbTJ2 = owc.EZpvd(output.valueOf(), output.gEmmrt(), d3);
                } else {
                    f4 = f3;
                    f5 = f9;
                }
                f6 = f5;
                AbstractC36302oWt.AEQbTJ(this.fetchVPNInfo, f6, i5, f6 + java.lang.Math.max(f4, 1.0f), java.lang.Math.max(iAEQbTJ2, 1) + i5 + 1);
            }
            f9 = f6 + f2;
            i6 = i4 + 1;
            d = AudioStats.AUDIO_AMPLITUDE_NONE;
            owc2 = owc;
        }
        android.graphics.Paint paint = this.AkhnZx;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.AkhnZx.setColor(Color.parseColor(AEQbTJ(abstractC36262oVg.copydefault(1).getColor(), abstractC36262oVg.copydefault(1).getColorBlk())));
        this.AkhnZx.setAlpha(127);
        this.ejfBZ.setStyle(style);
        this.ejfBZ.setColor(Color.parseColor(AEQbTJ(abstractC36262oVg.copydefault(2).getColor(), abstractC36262oVg.copydefault(2).getColorBlk())));
        this.ejfBZ.setAlpha(127);
        canvas.drawPath(this.DbNXlk, this.AkhnZx);
        canvas.drawPath(this.fetchVPNInfo, this.ejfBZ);
    }

    public void EZpvd(android.graphics.Canvas canvas, oWK owk, com.okinc.kline.library.data.DataSource dataSource, int i, int i2, float f, float f2, float f3, oWC owc, AbstractC36262oVg abstractC36262oVg) {
        owc.EZpvd(AudioStats.AUDIO_AMPLITUDE_NONE, owc.AEQbTJ().endsWith(com.ibm.icu.text.DateFormat.MINUTE));
        this.DbNXlk.reset();
        this.fetchVPNInfo.reset();
        float f4 = f;
        for (int i3 = i; i3 < i2; i3++) {
            DataSource.StateListAnimator stateListAnimator = dataSource.AEQbTJ.get(i3);
            int iEZpvd = owc.EZpvd(stateListAnimator.getFieldNames(), owc.AEQbTJ().endsWith(com.ibm.icu.text.DateFormat.MINUTE));
            int iAEQbTJ = owc.AEQbTJ(stateListAnimator.getFieldNames());
            int iAEQbTJ2 = owc.AEQbTJ(stateListAnimator.getNewProxyInstance());
            float f5 = iEZpvd;
            float f6 = f4 + f3;
            AbstractC36302oWt.AEQbTJ(this.DbNXlk, f4, f5, f6, iAEQbTJ + iEZpvd);
            AbstractC36302oWt.AEQbTJ(this.fetchVPNInfo, f4, iEZpvd - iAEQbTJ2, f6, f5);
            f4 += f2;
        }
        android.graphics.Paint paint = this.fARcdN;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.fARcdN.setColor(Color.parseColor(AEQbTJ(abstractC36262oVg.copydefault(1).getColor(), abstractC36262oVg.copydefault(1).getColorBlk())));
        this.fARcdN.setAlpha(127);
        this.ejfBZ.setStyle(style);
        this.ejfBZ.setColor(Color.parseColor(AEQbTJ(abstractC36262oVg.copydefault(2).getColor(), abstractC36262oVg.copydefault(2).getColorBlk())));
        this.ejfBZ.setAlpha(127);
        canvas.drawPath(this.DbNXlk, this.fARcdN);
        canvas.drawPath(this.fetchVPNInfo, this.ejfBZ);
    }

    public void AEQbTJ(android.graphics.Canvas canvas, AbstractC36262oVg abstractC36262oVg, com.okinc.kline.library.data.DataSource dataSource, int i, int i2, float f, float f2, float f3, oWC owc) {
        int i3 = i;
        oWC owc2 = owc;
        owc2.EZpvd(AudioStats.AUDIO_AMPLITUDE_NONE, owc.AEQbTJ().endsWith(com.ibm.icu.text.DateFormat.MINUTE));
        this.ORxRYg.reset();
        this.DbNXlk.reset();
        this.fetchVPNInfo.reset();
        float fDjBIcL = this.QOLQEE.djBIcL(i3);
        int i4 = i3;
        float f4 = fDjBIcL;
        while (i4 < i2) {
            DataSource.StateListAnimator stateListAnimator = dataSource.AEQbTJ.get(i4);
            int iEZpvd = owc2.EZpvd(stateListAnimator.zsXlph(), owc.AEQbTJ().endsWith(com.ibm.icu.text.DateFormat.MINUTE));
            int iAEQbTJ = owc2.AEQbTJ(stateListAnimator.zsXlph());
            if (stateListAnimator.copydefault() >= stateListAnimator.AuCTel()) {
                if (i4 == i3) {
                    AbstractC36302oWt.AEQbTJ(this.ORxRYg, fDjBIcL, iEZpvd, fDjBIcL + f3, iEZpvd + iAEQbTJ);
                } else {
                    AbstractC36302oWt.AEQbTJ(this.ORxRYg, f4, iEZpvd, f4 + f3, iEZpvd + iAEQbTJ);
                }
            } else if (i4 == i3) {
                AbstractC36302oWt.AEQbTJ(this.fetchVPNInfo, fDjBIcL, iEZpvd, java.lang.Math.max(f3, 1.0f) + fDjBIcL, iEZpvd + java.lang.Math.max(iAEQbTJ, 1));
            } else {
                AbstractC36302oWt.AEQbTJ(this.fetchVPNInfo, f4, iEZpvd, java.lang.Math.max(f3, 1.0f) + f4, iEZpvd + java.lang.Math.max(iAEQbTJ, 1));
            }
            f4 += f2;
            i4++;
            i3 = i;
            owc2 = owc;
        }
        if ((abstractC36262oVg instanceof oVO) && ((oVO) abstractC36262oVg).getNewProxyInstance()) {
            this.fARcdN.setAlpha(this.wlaJM.ffGIBT());
            this.ejfBZ.setAlpha(this.wlaJM.ffGIBT());
        } else {
            this.fARcdN.setAlpha(this.wlaJM.QkdxfA());
            this.ejfBZ.setAlpha(this.wlaJM.QkdxfA());
        }
        canvas.drawPath(this.ORxRYg, this.fARcdN);
        canvas.drawPath(this.DbNXlk, this.fARcdN);
        canvas.drawPath(this.fetchVPNInfo, this.ejfBZ);
    }

    public void EZpvd(android.graphics.Canvas canvas, oWK owk, Expression.Output output, int i, int i2, float f, float f2, float f3, oWC owc) {
        float f4;
        Expression.Output output2 = output;
        boolean zEndsWith = owc.AEQbTJ().endsWith(com.ibm.icu.text.DateFormat.MINUTE);
        double d = AudioStats.AUDIO_AMPLITUDE_NONE;
        int iEZpvd = owc.EZpvd(AudioStats.AUDIO_AMPLITUDE_NONE, zEndsWith);
        this.ORxRYg.reset();
        this.AxsJAY.reset();
        this.DbNXlk.reset();
        this.fetchVPNInfo.reset();
        float fDjBIcL = this.QOLQEE.djBIcL(i);
        double dExecute = i > 0 ? output2.execute(i - 1) : Double.NaN;
        int i3 = i2;
        int i4 = i;
        float f5 = fDjBIcL;
        while (i4 < i3) {
            float f6 = f5;
            double dExecute2 = output2.execute(i4);
            if (dExecute2 >= d) {
                int iAEQbTJ = owc.AEQbTJ(dExecute2);
                if (i4 == 0 || dExecute2 >= dExecute) {
                    f4 = f6;
                    if (i4 == i) {
                        AbstractC36302oWt.AEQbTJ(this.DbNXlk, fDjBIcL, iEZpvd - iAEQbTJ, fDjBIcL + f3, iEZpvd);
                    } else {
                        AbstractC36302oWt.AEQbTJ(this.DbNXlk, f4, iEZpvd - iAEQbTJ, f4 + f3, iEZpvd);
                    }
                } else if (i4 == i) {
                    AbstractC36302oWt.AEQbTJ(this.ORxRYg, fDjBIcL, iEZpvd - iAEQbTJ, java.lang.Math.max(f3, 1.0f) + fDjBIcL, r11 + java.lang.Math.max(iAEQbTJ, 1) + 1);
                    f4 = f6;
                } else {
                    f4 = f6;
                    AbstractC36302oWt.AEQbTJ(this.ORxRYg, f4, iEZpvd - iAEQbTJ, f6 + java.lang.Math.max(f3, 1.0f), r10 + java.lang.Math.max(iAEQbTJ, 1) + 1);
                }
            } else {
                f4 = f6;
                int iAEQbTJ2 = owc.AEQbTJ(-dExecute2);
                if (i4 == 0 || dExecute2 >= dExecute) {
                    if (i4 == i) {
                        AbstractC36302oWt.AEQbTJ(this.AxsJAY, fDjBIcL, iEZpvd, fDjBIcL + f3, (iAEQbTJ2 + iEZpvd) - 1);
                    } else {
                        AbstractC36302oWt.AEQbTJ(this.AxsJAY, f4, iEZpvd, f4 + f3, (iAEQbTJ2 + iEZpvd) - 1);
                    }
                } else if (i4 == i) {
                    AbstractC36302oWt.AEQbTJ(this.fetchVPNInfo, fDjBIcL, iEZpvd, java.lang.Math.max(f3, 1.0f) + fDjBIcL, java.lang.Math.max(iAEQbTJ2, 1) + iEZpvd + 1);
                } else {
                    AbstractC36302oWt.AEQbTJ(this.fetchVPNInfo, f4, iEZpvd, java.lang.Math.max(f3, 1.0f) + f4, java.lang.Math.max(iAEQbTJ2, 1) + iEZpvd + 1);
                }
            }
            i4++;
            float f7 = f4 + f2;
            i3 = i2;
            dExecute = dExecute2;
            d = AudioStats.AUDIO_AMPLITUDE_NONE;
            f5 = f7;
            output2 = output;
        }
        canvas.drawPath(this.ORxRYg, this.iwGUEr);
        canvas.drawPath(this.AxsJAY, this.uzCIH);
        canvas.drawPath(this.DbNXlk, this.getFieldNames);
        canvas.drawPath(this.fetchVPNInfo, this.fIwbmz);
    }

    public void copydefault(android.graphics.Canvas canvas, oWK owk, Expression.Output output, int i, int i2, float f, float f2, float f3, oWC owc) {
        if (f3 > AbstractC36302oWt.copydefault(6.0f)) {
            f3 = AbstractC36302oWt.copydefault(6.0f);
        }
        float f4 = f3 / 2.0f;
        this.djBIcL.reset();
        this.AYXKKw.reset();
        this.gEmmrt.reset();
        this.AuCTelauCTel.setStyle(Paint.Style.STROKE);
        this.AuCTelauCTel.setStrokeWidth(AbstractC36302oWt.copydefault(1.0f));
        float f5 = f;
        for (int i3 = i; i3 < i2; i3++) {
            int iEZpvd = owc.EZpvd(output.execute(i3), owc.AEQbTJ().endsWith(com.ibm.icu.text.DateFormat.MINUTE));
            int color = output.getColor(i3);
            if (color != 0) {
                if (color == 1) {
                    if (i3 == i) {
                        this.AYXKKw.addCircle(f, iEZpvd, f4, Path.Direction.CW);
                    } else {
                        this.AYXKKw.addCircle(f5, iEZpvd, f4, Path.Direction.CW);
                    }
                    this.AuCTelauCTel.setColor(owk.fIwbmz());
                } else if (color == 2) {
                    if (i3 == i) {
                        this.gEmmrt.addCircle(f, iEZpvd, f4, Path.Direction.CW);
                    } else {
                        this.gEmmrt.addCircle(f5, iEZpvd, f4, Path.Direction.CW);
                    }
                    this.AuCTelauCTel.setColor(owk.fJNWhG());
                }
            } else if (i3 == i) {
                this.djBIcL.addCircle(f, iEZpvd, f4, Path.Direction.CW);
            } else {
                this.djBIcL.addCircle(f5, iEZpvd, f4, Path.Direction.CW);
            }
            f5 += f2;
        }
        this.AuCTelauCTel.setColor(-7829368);
        canvas.drawPath(this.djBIcL, this.AuCTelauCTel);
        this.AuCTelauCTel.setColor(owk.fIwbmz());
        canvas.drawPath(this.AYXKKw, this.AuCTelauCTel);
        this.AuCTelauCTel.setColor(owk.fJNWhG());
        canvas.drawPath(this.gEmmrt, this.AuCTelauCTel);
    }

    public java.lang.Boolean copydefault(AbstractC36262oVg abstractC36262oVg, android.graphics.Canvas canvas) {
        TemplateSetting templateSettingKWHzl = C36246oUr.copydefault().KWHzl(copydefault());
        if (templateSettingKWHzl != null && templateSettingKWHzl.getSPTimeInterval() < 5) {
            java.lang.String strCopydefault = copydefault(this.hDKMBd.getString(C32392mcI.Dialog.DaRZkR));
            int iMax = java.lang.Math.max(0, ((int) (this.KWHzl.fIwbmz() - this.AhwBna.measureText(strCopydefault))) / 2);
            Paint.FontMetrics fontMetrics = this.AhwBna.getFontMetrics();
            float f = (fontMetrics.bottom - fontMetrics.top) / 2.0f;
            if (abstractC36262oVg instanceof C36275oVt) {
                canvas.drawText(strCopydefault, this.KWHzl.AYXKKw() + iMax, ((this.KWHzl.AuCTel() + this.KWHzl.KWHzl()) / 2) + f, this.AhwBna);
                return java.lang.Boolean.TRUE;
            }
            if (abstractC36262oVg instanceof C36281oVz) {
                canvas.drawText(strCopydefault, this.KWHzl.AYXKKw() + iMax, ((this.KWHzl.AuCTel() + this.KWHzl.KWHzl()) / 2) + f, this.AhwBna);
                return java.lang.Boolean.TRUE;
            }
            if (abstractC36262oVg instanceof oVB) {
                canvas.drawText(strCopydefault, this.KWHzl.AYXKKw() + iMax, ((this.KWHzl.AuCTel() + this.KWHzl.KWHzl()) / 2) + f, this.AhwBna);
                return java.lang.Boolean.TRUE;
            }
            if (abstractC36262oVg instanceof C36269oVn) {
                canvas.drawText(strCopydefault, this.KWHzl.AYXKKw() + iMax, ((this.KWHzl.AuCTel() + this.KWHzl.KWHzl()) / 2) + f, this.AhwBna);
                return java.lang.Boolean.TRUE;
            }
            if (abstractC36262oVg instanceof oVG) {
                canvas.drawText(strCopydefault, this.KWHzl.AYXKKw() + iMax, ((this.KWHzl.AuCTel() + this.KWHzl.KWHzl()) / 2) + f, this.AhwBna);
                return java.lang.Boolean.TRUE;
            }
        }
        if (!this.wlaJM.QVsKAR()) {
            this.AubY.clear();
            this.AubY.put("instrument", this.wlaJM.OcIXYQ());
            java.lang.String strCopydefault2 = copydefault(C33069mpW.KWHzl(C43246rlf.OLrzqt.valueOf(), C32392mcI.Dialog.DsrFlB, this.AubY));
            int iMax2 = java.lang.Math.max(0, ((int) (this.KWHzl.fIwbmz() - this.AhwBna.measureText(strCopydefault2))) / 2);
            Paint.FontMetrics fontMetrics2 = this.AhwBna.getFontMetrics();
            float f2 = (fontMetrics2.bottom - fontMetrics2.top) / 2.0f;
            if (abstractC36262oVg instanceof C36275oVt) {
                canvas.drawText(strCopydefault2, this.KWHzl.AYXKKw() + iMax2, ((this.KWHzl.AuCTel() + this.KWHzl.KWHzl()) / 2) + f2, this.AhwBna);
                return java.lang.Boolean.TRUE;
            }
            if (abstractC36262oVg instanceof C36281oVz) {
                canvas.drawText(strCopydefault2, this.KWHzl.AYXKKw() + iMax2, ((this.KWHzl.AuCTel() + this.KWHzl.KWHzl()) / 2) + f2, this.AhwBna);
                return java.lang.Boolean.TRUE;
            }
            if (abstractC36262oVg instanceof oVB) {
                canvas.drawText(strCopydefault2, this.KWHzl.AYXKKw() + iMax2, ((this.KWHzl.AuCTel() + this.KWHzl.KWHzl()) / 2) + f2, this.AhwBna);
                return java.lang.Boolean.TRUE;
            }
            if (abstractC36262oVg instanceof C36269oVn) {
                canvas.drawText(strCopydefault2, this.KWHzl.AYXKKw() + iMax2, ((this.KWHzl.AuCTel() + this.KWHzl.KWHzl()) / 2) + f2, this.AhwBna);
                return java.lang.Boolean.TRUE;
            }
            if (abstractC36262oVg instanceof oVG) {
                canvas.drawText(strCopydefault2, this.KWHzl.AYXKKw() + iMax2, ((this.KWHzl.AuCTel() + this.KWHzl.KWHzl()) / 2) + f2, this.AhwBna);
                return java.lang.Boolean.TRUE;
            }
        }
        return abstractC36262oVg instanceof oVQ ? java.lang.Boolean.valueOf(!"TYPE_KLINE".equals(this.wlaJM.UeEOUB())) : java.lang.Boolean.FALSE;
    }

    public final java.lang.String copydefault(java.lang.String str) {
        if (this.AhwBna.measureText(str) <= this.KWHzl.fIwbmz()) {
            return str;
        }
        while (true) {
            if (this.AhwBna.measureText(str + "...") <= this.KWHzl.fIwbmz() || str.isEmpty()) {
                break;
            }
            str = str.substring(0, str.length() - 1);
        }
        return str + "...";
    }

    public final void EZpvd(android.graphics.Canvas canvas, Expression.Output output, int i, int i2, float f, oWC owc, AbstractC36262oVg abstractC36262oVg) {
        Expression.Handler fieldNames;
        int i3;
        int i4;
        android.graphics.Path path;
        float f2;
        android.graphics.Path path2;
        boolean z;
        boolean z2;
        if ((abstractC36262oVg instanceof oVM) && (fieldNames = ((oVM) abstractC36262oVg).getFieldNames()) != null) {
            this.fJNWhG.setStyle(Paint.Style.STROKE);
            this.fJNWhG.setStrokeWidth(AbstractC36302oWt.copydefault(1.0f));
            this.fJNWhG.setAntiAlias(true);
            int color = Color.parseColor(AEQbTJ(abstractC36262oVg.copydefault(0).getColor(), abstractC36262oVg.copydefault(0).getColorBlk()));
            int color2 = Color.parseColor(AEQbTJ(abstractC36262oVg.copydefault(1).getColor(), abstractC36262oVg.copydefault(1).getColorBlk()));
            java.util.HashMap map = new java.util.HashMap();
            android.graphics.Path path3 = new android.graphics.Path();
            android.graphics.Path path4 = new android.graphics.Path();
            map.put(new kotlin.Pair(path3, path4), java.lang.Boolean.FALSE);
            this.gHZMYf = new android.graphics.Path();
            int iDjBIcL = ((int) abstractC36262oVg.djBIcL()) + 1;
            if (i >= iDjBIcL) {
                iDjBIcL = i;
            }
            float fAhwBna = this.QOLQEE.AhwBna(iDjBIcL);
            if (iDjBIcL > i) {
                double dExecute = output.execute(iDjBIcL - 1);
                if (java.lang.Double.isNaN(dExecute)) {
                    return;
                }
                int iEZpvd = owc.EZpvd(dExecute, false);
                float f3 = fAhwBna - f;
                path3.moveTo(f3, iEZpvd);
                i3 = color2;
                path4.moveTo(f3, owc.EZpvd(fieldNames.KWHzl(r0), false));
                i4 = iDjBIcL;
                path = path3;
                f2 = fAhwBna;
                path2 = path4;
                z = false;
            } else {
                i3 = color2;
                if (java.lang.Double.isNaN(output.execute(iDjBIcL))) {
                    return;
                }
                path3.moveTo(fAhwBna, owc.EZpvd(r11, false));
                path4.moveTo(fAhwBna, owc.EZpvd(fieldNames.KWHzl(iDjBIcL), false));
                i4 = iDjBIcL + 1;
                path = path3;
                f2 = fAhwBna + f;
                path2 = path4;
                z = false;
            }
            while (i4 < i2) {
                double dExecute2 = output.execute(i4);
                if (java.lang.Double.isNaN(dExecute2)) {
                    z2 = z;
                } else {
                    int iEZpvd2 = owc.EZpvd(dExecute2, false);
                    int iEZpvd3 = owc.EZpvd(fieldNames.KWHzl(i4), false);
                    if (z == fieldNames.AEQbTJ(i4)) {
                        float f4 = f2;
                        z2 = z;
                        AEQbTJ(path, this.gHZMYf, f4, iEZpvd2, false);
                        AEQbTJ(path2, this.gHZMYf, f4, iEZpvd3, false);
                    } else {
                        boolean zAEQbTJ = fieldNames.AEQbTJ(i4);
                        android.graphics.Path path5 = new android.graphics.Path();
                        path5.moveTo(f2, iEZpvd2);
                        android.graphics.Path path6 = new android.graphics.Path();
                        path6.moveTo(f2, iEZpvd3);
                        map.put(new kotlin.Pair(path5, path6), java.lang.Boolean.valueOf(zAEQbTJ));
                        z = zAEQbTJ;
                        path = path5;
                        path2 = path6;
                        i4++;
                        f2 += f;
                    }
                }
                z = z2;
                i4++;
                f2 += f;
            }
            this.fJNWhG.setPathEffect(null);
            for (Map.Entry entry : map.entrySet()) {
                java.lang.Boolean bool = (java.lang.Boolean) entry.getValue();
                kotlin.Pair pair = (kotlin.Pair) entry.getKey();
                int i5 = bool.booleanValue() ? color : i3;
                this.fJNWhG.setColor(i5);
                this.AEQbTJ.setColor(i5);
                this.AEQbTJ.setAlpha(50);
                android.graphics.Path path7 = (android.graphics.Path) pair.getFirst();
                canvas.drawPath(path7, this.fJNWhG);
                OLrzqt(canvas, path7, (android.graphics.Path) pair.getSecond());
            }
        }
    }

    public final void OLrzqt(android.graphics.Canvas canvas, android.graphics.Path path, android.graphics.Path path2) {
        this.values.reset();
        C37878pEa c37878pEa = C37878pEa.EZpvd;
        Triple<android.graphics.Path, java.lang.Float, java.lang.Float> tripleAEQbTJ = c37878pEa.AEQbTJ(path2);
        this.values.addPath(path);
        this.values.lineTo(tripleAEQbTJ.getSecond().floatValue(), tripleAEQbTJ.getThird().floatValue());
        this.values.addPath(tripleAEQbTJ.getFirst());
        PointF pointFKWHzl = c37878pEa.KWHzl(path);
        this.values.lineTo(pointFKWHzl.x, pointFKWHzl.y);
        canvas.drawPath(this.values, this.AEQbTJ);
    }
}
