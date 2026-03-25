package o;

import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.library.layout.ChartArea;
import com.okinc.rxutils.RxBus;
import com.reown.foundation.util.jwt.JwtUtilsKt;

/* JADX INFO: loaded from: classes8.dex */
public class oWN extends C36252oUx {
    public static int EZpvd = 2;
    public static int KWHzl = 15;
    public float AYXKKw;
    public int AhwBna;
    public int AkhnZx;
    public int AuCTel;
    public float AuCTelauCTel;
    public boolean AubY;
    public float AwvSrB;
    public float AxsJAY;
    public float DbNXlk;
    public boolean ORxRYg;
    public int djBIcL;
    public int ejfBZ;
    public int fARcdN;
    public int fIwbmz;
    public int fJNWhG;
    public float fetchVPNInfo;
    public int gEmmrt;
    public java.lang.String gHZMYf;
    public int getFieldNames;
    public int getNewProxyInstance;
    public int hDKMBd;
    public int isConnected;
    public int iwGUEr;
    public int sSMYrx;
    public int uzCIH;
    public boolean valueOf;
    public int values;
    public int wlaJM;
    public boolean zLjUOn;
    public int zsXlph;
    public float zuBGHE;
    public static int[] OLrzqt = new int[25];
    public static final int AEQbTJ = AbstractC36302oWt.copydefault(1.0f);

    public void AEQbTJ(java.lang.String str) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(boolean z) {
        this.valueOf = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AYXKKw() {
        this.getFieldNames = -1;
        this.isConnected = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AYXKKw(float f) {
        this.AxsJAY = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AuCTel() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AubY() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AxsJAY() {
        this.ejfBZ = this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int DbNXlk() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(boolean z) {
        this.ORxRYg = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.AubY = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(boolean z) {
        this.zLjUOn = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void djBIcL() {
        this.djBIcL = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fARcdN() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fetchVPNInfo() {
        return EZpvd;
    }

    public int getFieldNames() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getNewProxyInstance() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int hDKMBd() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isConnected() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float iwGUEr() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void sSMYrx() {
        this.uzCIH = this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int uzCIH() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void valueOf(float f) {
        this.AwvSrB = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float values() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void zLjUOn() {
        this.AuCTel = 0;
        this.gEmmrt = this.fJNWhG;
    }

    public final float fJNWhG() {
        float f = this.AwvSrB;
        if (f != 0.0f) {
            if (f < 0.0f) {
                this.AwvSrB = OLrzqt[0];
                this.iwGUEr = 0;
            }
            return this.AwvSrB;
        }
        float timelineScaleWidth = C36246oUr.copydefault().KWHzl(copydefault()).getTimelineScaleWidth();
        if (timelineScaleWidth == 0.0f) {
            return OLrzqt[this.iwGUEr];
        }
        this.AwvSrB = timelineScaleWidth;
        return timelineScaleWidth;
    }

    public final float AhwBna() {
        return fJNWhG() + fetchVPNInfo();
    }

    public final int AkhnZx() {
        return fetchVPNInfo();
    }

    public final float zsXlph() {
        return fJNWhG() / 2.0f;
    }

    public final int ejfBZ() {
        return java.lang.Math.min(this.AkhnZx + this.AuCTel, this.fJNWhG);
    }

    public final int fIwbmz() {
        int i = this.djBIcL;
        if (i != 0) {
            return i;
        }
        ChartArea chartArea = C36246oUr.copydefault().values().get(copydefault() + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE);
        if (chartArea != null && ejfBZ() > valueOf(chartArea.fIwbmz())) {
            return valueOf(chartArea.fIwbmz());
        }
        return ejfBZ();
    }

    public final int OLrzqt(int i, int i2, int i3) {
        return java.lang.Math.max(0, (i + java.lang.Math.max(i2, 1)) - java.lang.Math.max(i3, 1));
    }

    public final float EZpvd(float f) {
        return java.lang.Math.max(f - (this.fARcdN + this.hDKMBd), 0.0f);
    }

    public final int OLrzqt(float f) {
        return (int) java.lang.Math.ceil(f / AhwBna());
    }

    public final int EZpvd(int i) {
        int i2 = this.AkhnZx;
        if (i2 < 0) {
            com.okinc.kline.library.data.DataSource dataSource = C36246oUr.copydefault().zLjUOn().getDataSources().get(copydefault());
            if (dataSource.gEmmrt() > 0) {
                return java.lang.Math.max(dataSource.DbNXlk() - i, dataSource.djBIcL());
            }
            return -1;
        }
        return copydefault(OLrzqt(i2, this.AuCTel, i), i);
    }

    public final void DTwDnp() {
        C36246oUr.copydefault().values().get(copydefault() + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE);
        AEQbTJ("updateMaxItemCount :newMaxItemCount over" + AEQbTJ(this.DbNXlk) + " mKlineCurrentOffset" + C36246oUr.copydefault().QfsBiF());
    }

    public final int copydefault(int i, int i2) {
        int i3 = this.fJNWhG;
        if (i3 < 1) {
            return -1;
        }
        int i4 = this.fIwbmz;
        if (i < i4) {
            return i4;
        }
        int iMax = java.lang.Math.max(i3 - i2, i4);
        return (i > iMax || C36246oUr.copydefault().QfsBiF() >= 0.0f) ? iMax : i;
    }

    public final void ORxRYg() {
        int i = this.getFieldNames;
        if (i < this.AkhnZx) {
            this.getFieldNames = -1;
        } else if (i >= ejfBZ()) {
            this.getFieldNames = -1;
        }
    }

    public void gHZMYf() {
        float fEZpvd;
        ChartArea chartArea = C36246oUr.copydefault().values().get(copydefault() + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE);
        if (chartArea != null) {
            this.values = chartArea.AYXKKw() + this.fARcdN;
            if (ejfBZ() == -1 || C36246oUr.copydefault().QfsBiF() > 0.0f) {
                fEZpvd = EZpvd(chartArea.fIwbmz() - C36246oUr.copydefault().QfsBiF());
            } else {
                fEZpvd = EZpvd(chartArea.fIwbmz());
            }
            if (C36246oUr.copydefault().AkhnZx > 0.0f) {
                fEZpvd = EZpvd(fEZpvd - C36246oUr.copydefault().AkhnZx);
            }
            if ((this.DbNXlk != fEZpvd && fEZpvd > 0.0f) || this.AuCTel == 0 || this.AYXKKw == 0.0f || this.gEmmrt == 0) {
                pUU.copydefault("kline before onLayout: mMaxItemCount" + this.AuCTel + " mInnerWidth" + this.DbNXlk + " lastIndexX" + this.AYXKKw + " lastIndex" + this.gEmmrt + " mKlineCurrentOffset" + C36246oUr.copydefault().QfsBiF());
            }
            if ((this.DbNXlk != fEZpvd && fEZpvd > 0.0f) || this.AuCTel == 0) {
                this.DbNXlk = fEZpvd;
                DTwDnp();
                djBIcL();
            }
            if ((this.DbNXlk != fEZpvd && fEZpvd > 0.0f) || this.AuCTel == 0 || this.AYXKKw == 0.0f || this.gEmmrt == 0) {
                pUU.copydefault("kline after onLayout: mMaxItemCount" + this.AuCTel + " mInnerWidth" + this.DbNXlk + " lastIndexX" + this.AYXKKw + " lastIndex" + this.gEmmrt);
            }
        }
    }

    public int valueOf(int i) {
        return (this.gEmmrt - ((int) java.lang.Math.ceil(((AuCTelauCTel() - fJNWhG()) - i) / AhwBna()))) - 1;
    }

    public float gEmmrt(int i) {
        return (AuCTelauCTel() - (((this.gEmmrt - i) - 1) * AhwBna())) - fJNWhG();
    }

    public float DbNXlk(int i) {
        return gEmmrt(i) + AkhnZx() + getFieldNames();
    }

    public float AYXKKw(int i) {
        return DbNXlk(i) + zsXlph() + getFieldNames();
    }

    public float djBIcL(int i) {
        return DbNXlk(i);
    }

    public float AhwBna(int i) {
        return AYXKKw(i);
    }

    public oWN(java.lang.String str) {
        super(str);
        this.fARcdN = AbstractC36302oWt.copydefault(0.0f);
        this.hDKMBd = AbstractC36302oWt.copydefault(0.0f);
        this.AhwBna = AbstractC36302oWt.copydefault(4.0f);
        this.AubY = true;
        this.zLjUOn = true;
        this.values = 0;
        this.DbNXlk = 0.0f;
        this.fetchVPNInfo = 0.0f;
        this.iwGUEr = 5;
        this.ejfBZ = -1;
        this.fIwbmz = -1;
        this.fJNWhG = 0;
        this.AkhnZx = -1;
        this.getFieldNames = -1;
        this.isConnected = -1;
        this.AuCTel = 0;
        this.zsXlph = 0;
        this.wlaJM = 0;
        this.uzCIH = -1;
        this.getNewProxyInstance = -1;
        this.sSMYrx = 0;
        this.AuCTelauCTel = 0.0f;
        this.zuBGHE = 0.0f;
        this.ORxRYg = false;
        this.gHZMYf = "normal";
        this.valueOf = false;
        this.AwvSrB = 0.0f;
        this.AxsJAY = 0.0f;
        this.AYXKKw = 0.0f;
        this.gEmmrt = 0;
        this.djBIcL = 0;
    }

    public float AuCTelauCTel() {
        return valueOf();
    }

    public void AhwBna(float f) {
        djBIcL(f);
    }

    public void djBIcL(float f) {
        float fEZpvd;
        AEQbTJ("=================");
        AhwBna();
        if (f > 0.0f) {
            if (C36246oUr.copydefault().isConnected + f <= C36246oUr.copydefault().AEQbTJ) {
                C36246oUr.copydefault().AkhnZx = C36246oUr.copydefault().isConnected + f;
                AEQbTJ("mKlineCurrentOffsetLeft 1: " + C36246oUr.copydefault().AkhnZx);
            } else {
                C36246oUr.copydefault().AkhnZx = C36246oUr.copydefault().AEQbTJ;
                AEQbTJ("mKlineCurrentOffsetLeft 2: " + C36246oUr.copydefault().AkhnZx);
            }
            if (C36246oUr.copydefault().djSkpj() - f > C36246oUr.copydefault().iwGUEr().zLjUOn()) {
                C36246oUr.copydefault().KWHzl(C36246oUr.copydefault().djSkpj() - f);
                AEQbTJ("mKlineCurrentOffset 1: " + C36246oUr.copydefault().QfsBiF());
            } else {
                C36246oUr.copydefault().KWHzl(C36246oUr.copydefault().iwGUEr().zLjUOn());
                AEQbTJ("mKlineCurrentOffset 2: " + C36246oUr.copydefault().QfsBiF());
            }
        } else {
            if (C36246oUr.copydefault().djSkpj() - f <= C36246oUr.copydefault().QUSxYX()) {
                AEQbTJ("mKlineLastOffset 左移1: " + C36246oUr.copydefault().djSkpj());
                C36246oUr.copydefault().KWHzl(C36246oUr.copydefault().djSkpj() - f);
                if (C36246oUr.copydefault().QfsBiF() >= 0.0f && ejfBZ() < AuCTel()) {
                    C36246oUr.copydefault().KWHzl((ejfBZ() - AuCTel()) * AhwBna());
                    C36246oUr.copydefault().EZpvd(C36246oUr.copydefault().djSkpj() + C36246oUr.copydefault().QfsBiF());
                }
            } else {
                C36246oUr.copydefault().KWHzl(C36246oUr.copydefault().QUSxYX());
            }
            if (C36246oUr.copydefault().isConnected + f > C36246oUr.copydefault().iwGUEr().zsXlph()) {
                C36246oUr.copydefault().AkhnZx = C36246oUr.copydefault().isConnected + f;
                AEQbTJ("mKlineCurrentOffsetLeft  左移计算: " + C36246oUr.copydefault().AkhnZx);
            } else {
                C36246oUr.copydefault().AkhnZx = C36246oUr.copydefault().iwGUEr().zsXlph();
                AEQbTJ("mKlineCurrentOffsetLeft  左移计算赋值: " + C36246oUr.copydefault().AkhnZx);
            }
        }
        ChartArea chartArea = C36246oUr.copydefault().values().get(copydefault() + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE);
        if (C36246oUr.copydefault().QfsBiF() > 0.0f) {
            fEZpvd = EZpvd(chartArea.fIwbmz() - C36246oUr.copydefault().QfsBiF());
            AEQbTJ("afterMoveInnerWidth 1: " + fEZpvd);
        } else {
            fEZpvd = EZpvd(chartArea.fIwbmz());
            AEQbTJ("afterMoveInnerWidth 2: " + fEZpvd);
        }
        if (C36246oUr.copydefault().AkhnZx > 0.0f) {
            fEZpvd = EZpvd(fEZpvd - C36246oUr.copydefault().AkhnZx);
            AEQbTJ("afterMoveInnerWidth 3: " + fEZpvd);
        }
        if (this.DbNXlk != fEZpvd && fEZpvd > 0.0f) {
            this.DbNXlk = fEZpvd;
        }
        AEQbTJ("mKlineCurrentOffset:" + C36246oUr.copydefault().QfsBiF());
        AEQbTJ("distance" + f);
        KWHzl(f);
    }

    public final int AEQbTJ(float f) {
        int i;
        C36246oUr.copydefault().values().get(copydefault() + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE);
        int i2 = this.fJNWhG;
        this.gEmmrt = i2;
        this.AYXKKw = f;
        int iOLrzqt = OLrzqt(f);
        int i3 = this.fJNWhG;
        float f2 = 0.0f;
        if (iOLrzqt >= i3) {
            this.AuCTel = i3;
            this.AkhnZx = 0;
            i = i2;
        } else {
            i = i2;
            float fAhwBna = 0.0f;
            while (f > 0.0f) {
                fAhwBna = f - AhwBna();
                if (i > 0) {
                    i--;
                    f = fAhwBna;
                } else {
                    f = fAhwBna;
                    i = 0;
                }
            }
            this.AuCTel = i2 - i;
            this.AkhnZx = i;
            f2 = fAhwBna;
        }
        AEQbTJ("onLayout mMaxItemCount" + this.AuCTel);
        AEQbTJ("onLayout lastIndex" + i2);
        AEQbTJ("onLayout firstIndex" + i);
        AEQbTJ("onLayout lastIndexX" + this.AYXKKw);
        AEQbTJ("onLayout firstIndexX" + f2);
        if (this.AuCTel == 1) {
            this.AYXKKw = fJNWhG();
        }
        return this.AuCTel;
    }

    public int KWHzl(float f) {
        ChartArea chartArea = C36246oUr.copydefault().values().get(copydefault() + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE);
        float fAhwBna = this.AYXKKw + f;
        int i = this.gEmmrt;
        if (fAhwBna > chartArea.fIwbmz() + (AhwBna() * 2.0f)) {
            if (this.AkhnZx > 0) {
                while (fAhwBna > chartArea.fIwbmz() + (AhwBna() * 2.0f)) {
                    fAhwBna -= AhwBna();
                    i--;
                }
            }
        } else if (this.gEmmrt != this.fJNWhG) {
            while (fAhwBna < chartArea.fIwbmz() + (AhwBna() * 2.0f) && i < this.fJNWhG) {
                fAhwBna += AhwBna();
                i++;
            }
        }
        if (f < 0.0f && fAhwBna <= C36246oUr.copydefault().AEQbTJ) {
            ChartViewOutSideConfig chartViewOutSideConfigZLjUOn = C36246oUr.copydefault().zLjUOn();
            if ((DbNXlk(this.AkhnZx) <= 0.0f || this.AkhnZx != 0) && !chartViewOutSideConfigZLjUOn.isFastKLineMode() && !chartViewOutSideConfigZLjUOn.isScreenChange()) {
                if (this.AYXKKw > chartArea.fIwbmz()) {
                    this.djBIcL = valueOf(chartArea.fIwbmz());
                }
                return this.AuCTel;
            }
        }
        float fDbNXlk = DbNXlk(this.AkhnZx);
        if (f > 0.0f && fDbNXlk >= C36246oUr.copydefault().AEQbTJ) {
            if (this.AYXKKw > chartArea.fIwbmz()) {
                int iValueOf = valueOf(chartArea.fIwbmz());
                this.djBIcL = iValueOf;
                this.AuCTel = iValueOf;
            }
            return this.AuCTel;
        }
        this.AYXKKw = fAhwBna;
        this.gEmmrt = i;
        while (fAhwBna > 0.0f) {
            fAhwBna -= AhwBna();
            i = i > 0 ? i - 1 : 0;
        }
        this.djBIcL = this.AYXKKw > ((float) chartArea.fIwbmz()) ? valueOf(chartArea.fIwbmz()) : this.gEmmrt;
        int i2 = this.gEmmrt - i;
        this.AuCTel = i2;
        this.AkhnZx = i;
        return i2;
    }

    /* JADX DEBUG: Duplicate block (B:9:0x0059) to fix multi-entry loop: BACK_EDGE: B:9:0x0059 -> B:10:0x005c */
    public final void copydefault(float f) {
        float fAhwBna;
        int i;
        int i2;
        float f2;
        int i3;
        ChartArea chartArea = C36246oUr.copydefault().values().get(copydefault() + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE);
        int i4 = this.getNewProxyInstance;
        int i5 = 0;
        if (i4 >= this.fJNWhG) {
            f = this.AYXKKw;
            i3 = this.gEmmrt;
        } else {
            if (i4 <= 0) {
                fAhwBna = C36246oUr.copydefault().AEQbTJ;
                AEQbTJ("before scale start" + fAhwBna);
                f2 = f;
                i2 = 0;
                i = 0;
            } else {
                fAhwBna = f;
                i = i4;
                i2 = i4;
                f2 = fAhwBna;
            }
            while (true) {
                if (fAhwBna < chartArea.fIwbmz() + (AhwBna() * 2.0f)) {
                    int i6 = this.fJNWhG;
                    if (i >= i6) {
                        i = i6;
                        break;
                    }
                    int i7 = i + 1;
                    fAhwBna += AhwBna();
                    i = i7;
                    i2 = i2;
                    f2 = fAhwBna;
                } else {
                    break;
                }
            }
            this.gEmmrt = i;
            this.AYXKKw = f2;
            if (this.getNewProxyInstance <= 0) {
                f = C36246oUr.copydefault().AEQbTJ;
                AEQbTJ("before scale start" + f);
            }
            i3 = i2;
        }
        while (true) {
            if (f <= 0.0f) {
                i5 = i3;
                break;
            }
            f -= AhwBna();
            if (i3 <= 0) {
                break;
            } else {
                i3--;
            }
        }
        this.AuCTel = this.gEmmrt - i5;
        this.AkhnZx = i5;
    }

    public void AEQbTJ(float f, int i) {
        ChartArea chartArea = C36246oUr.copydefault().values().get(copydefault() + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE);
        int[] iArr = OLrzqt;
        float f2 = (float) iArr[iArr.length + (-1)];
        float f3 = (float) iArr[0];
        float f4 = this.AwvSrB + ((f / 2.0f) * ((f2 - f3) / 280.0f));
        this.AwvSrB = f4;
        if (f4 < f3) {
            this.AwvSrB = f3;
        } else if (f4 > iArr[iArr.length - 1]) {
            this.AwvSrB = iArr[iArr.length - 1];
        }
        AEQbTJ("mLastScale" + this.ejfBZ);
        AEQbTJ("scaleItemWidth" + this.AwvSrB);
        if (i > 0) {
            int i2 = this.ejfBZ;
            int[] iArr2 = OLrzqt;
            int i3 = i2 + i;
            if (i3 < iArr2.length) {
                int i4 = iArr2[i3];
                if (this.AwvSrB >= i4) {
                    AEQbTJ(i3);
                    this.ejfBZ = this.iwGUEr;
                } else {
                    pUU.copydefault("eddie", "newScalePercent 没有更新scale afterScaleWidth" + i4 + " scaleItemWidth:" + this.AwvSrB);
                }
            }
            this.gHZMYf = "ZoomOut";
            copydefault(chartArea.fIwbmz() / 2);
            return;
        }
        this.gHZMYf = "ZoomIn";
        int i5 = this.ejfBZ + i;
        if (i5 >= 0) {
            if (this.AwvSrB <= OLrzqt[i5]) {
                AEQbTJ(i5);
                this.ejfBZ = this.iwGUEr;
            }
        }
        copydefault(chartArea.fIwbmz() / 2);
    }

    public void EZpvd(float f, int i) {
        AEQbTJ(f, i);
    }

    public void OLrzqt(int i) {
        AEQbTJ(false);
        AEQbTJ(this.ejfBZ + i);
        DTwDnp();
        if (this.getFieldNames >= 0) {
            ORxRYg();
        }
    }

    public void AEQbTJ(int i) {
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        this.iwGUEr = i;
        if (i < 0) {
            this.iwGUEr = 0;
        } else {
            int[] iArr = OLrzqt;
            if (i >= iArr.length) {
                this.iwGUEr = iArr.length - 1;
            } else if (c36246oUrCopydefault.RKcVTr()) {
                int i2 = this.iwGUEr;
                int i3 = AEQbTJ;
                if (i2 < i3) {
                    this.iwGUEr = i3;
                    this.AwvSrB = i3;
                }
            }
        }
        pUU.copydefault("eddie", "更新scale setScale" + this.iwGUEr + " scaleItemWidth:" + this.AwvSrB);
        copydefault(this.iwGUEr);
        c36246oUrCopydefault.KWHzl(copydefault()).putTimelineScale(this.iwGUEr);
        if (this.AwvSrB != 0.0f) {
            c36246oUrCopydefault.KWHzl(copydefault()).putTimelineScaleWidth(this.AwvSrB);
        }
        if (c36246oUrCopydefault.EZpvd(copydefault()) == 1 || c36246oUrCopydefault.EZpvd(copydefault()) == 3) {
            return;
        }
        if (this.iwGUEr < AEQbTJ) {
            if (c36246oUrCopydefault.EZpvd(copydefault()) != 2) {
                c36246oUrCopydefault.AEQbTJ("ds0", 2);
            }
        } else if (c36246oUrCopydefault.EZpvd(copydefault()) != 0) {
            c36246oUrCopydefault.AEQbTJ("ds0", 0);
        }
    }

    public final void copydefault(int i) {
        int iRound = java.lang.Math.round((i * 8) / (OLrzqt.length - 1));
        EZpvd = iRound;
        if (iRound <= 0) {
            EZpvd = 1;
        } else if (iRound > 8) {
            EZpvd = 8;
        }
    }

    public void KWHzl(int i, int i2) {
        this.getFieldNames = valueOf(i);
        this.isConnected = valueOf(i);
        this.wlaJM = i;
        this.zsXlph = i2;
        ORxRYg();
        if (C36246oUr.copydefault().QVAiDq() == 0 && C36246oUr.copydefault().QKudOq() == 0) {
            RxBus.KWHzl("candleSelected");
        }
    }

    public void OLrzqt(int i, int i2) {
        this.getNewProxyInstance = valueOf(C36246oUr.copydefault().values().get(copydefault() + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE).fIwbmz() / 2);
        this.sSMYrx = this.AuCTel;
    }

    public void gEmmrt() {
        C36246oUr.copydefault().AuCTel += ((this.sSMYrx * AhwBna()) - (this.sSMYrx * this.AxsJAY)) / 2.0f;
        this.getNewProxyInstance = -1;
    }

    public boolean wlaJM() {
        float f = this.fJNWhG;
        float fFJNWhG = fJNWhG();
        ChartArea chartArea = C36246oUr.copydefault().values().get(copydefault() + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE);
        return chartArea != null && f * fFJNWhG > ((float) chartArea.fIwbmz());
    }

    public void AwvSrB() {
        if (C36246oUr.copydefault().QVAiDq() == 0 && C36246oUr.copydefault().QKudOq() == 0 && this.isConnected != -1) {
            RxBus.KWHzl("candleUnSelected");
        } else {
            this.getFieldNames = -1;
            this.isConnected = -1;
        }
        djBIcL();
        C36246oUr.copydefault().hDKMBd += C36246oUr.copydefault().QfsBiF() - C36246oUr.copydefault().djSkpj();
        C36246oUr.copydefault().fIwbmz += C36246oUr.copydefault().AkhnZx - C36246oUr.copydefault().isConnected;
        C36246oUr.copydefault().EZpvd(C36246oUr.copydefault().QfsBiF());
        C36246oUr.copydefault().isConnected = C36246oUr.copydefault().AkhnZx;
        AEQbTJ("mKlineLastOffsetLeft 5: " + C36246oUr.copydefault().isConnected);
    }

    public void zuBGHE() {
        int i;
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        com.okinc.kline.library.data.DataSource dataSource = c36246oUrCopydefault.zLjUOn().getDataSources().get(copydefault());
        ChartArea chartArea = c36246oUrCopydefault.values().get(copydefault() + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE);
        int i2 = this.fJNWhG;
        this.fIwbmz = dataSource.djBIcL();
        this.fJNWhG = dataSource.DbNXlk();
        if (this.AkhnZx < 0 || dataSource.isConnected() == 1) {
            this.AubY = true;
            this.AkhnZx = -1;
            this.getFieldNames = -1;
            this.isConnected = -1;
            if (dataSource.gEmmrt() <= 0 || (i = this.AuCTel) <= 0) {
                return;
            }
            this.AkhnZx = java.lang.Math.max(this.fJNWhG - i, this.fIwbmz);
            return;
        }
        if (dataSource.isConnected() == 3) {
            if (this.AYXKKw < chartArea.fIwbmz()) {
                this.AubY = true;
                int i3 = this.gEmmrt;
                int i4 = this.fJNWhG - i2;
                this.gEmmrt = i3 + i4;
                this.AkhnZx += i4;
                KWHzl();
            }
            if (this.AubY) {
                ORxRYg();
            }
        }
    }

    public static void KWHzl(int i) {
        int i2 = 0;
        if (OLrzqt[0] != 0) {
            return;
        }
        int i3 = (i / 34) - EZpvd;
        if (i3 % 2 == 0) {
            i3--;
        }
        KWHzl = (i3 / 2) + 2;
        while (true) {
            int[] iArr = OLrzqt;
            if (i2 >= iArr.length) {
                return;
            }
            int i4 = AEQbTJ;
            if (i2 < i4) {
                iArr[i2] = i2 + 1;
            } else {
                int i5 = KWHzl;
                if (i2 == i5) {
                    iArr[i2] = i3;
                } else if (i2 < i5) {
                    int i6 = i3 - ((i5 - i2) * 2);
                    if (i6 > i4) {
                        i4 = i6;
                    }
                    iArr[i2] = i4;
                } else {
                    iArr[i2] = ((i2 - i5) * 2) + i3;
                }
            }
            int i7 = OLrzqt[i2];
            i2++;
        }
    }

    public void OLrzqt(java.util.List<? extends oUO> list) {
        com.okinc.kline.library.data.DataSource dataSource = C36246oUr.copydefault().zLjUOn().getDataSources().get(copydefault());
        this.fIwbmz = dataSource.djBIcL();
        this.fJNWhG = dataSource.DbNXlk();
        this.gEmmrt += list.size();
        this.AkhnZx += list.size();
        KWHzl();
        if (C36312oXc.AEQbTJ((C36250oUv) null).gEmmrt() == null || C36312oXc.AEQbTJ((C36250oUv) null).gEmmrt().OLrzqt()) {
            return;
        }
        C36312oXc.AEQbTJ((C36250oUv) null).gEmmrt().EZpvd();
    }

    public void AEQbTJ(java.util.List<? extends oUO> list) {
        com.okinc.kline.library.data.DataSource dataSource = C36246oUr.copydefault().zLjUOn().getDataSources().get(copydefault());
        this.fIwbmz = dataSource.djBIcL();
        this.fJNWhG = dataSource.DbNXlk();
        KWHzl();
        if (C36312oXc.AEQbTJ((C36250oUv) null).gEmmrt() == null || C36312oXc.AEQbTJ((C36250oUv) null).gEmmrt().OLrzqt()) {
            return;
        }
        C36312oXc.AEQbTJ((C36250oUv) null).gEmmrt().EZpvd();
    }

    public int KWHzl() {
        ChartArea chartArea = C36246oUr.copydefault().values().get(copydefault() + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE);
        float fAhwBna = this.AYXKKw;
        int i = this.gEmmrt;
        AEQbTJ("calculateAfterAddHistoryLastIndex start" + fAhwBna);
        AEQbTJ("calculateAfterAddHistoryLastIndex limit" + (((float) chartArea.fIwbmz()) + AhwBna()));
        AEQbTJ("calculateAfterAddHistoryLastIndex KLINE_DEFAULT_OFFSET" + C36246oUr.copydefault().QUSxYX());
        if (fAhwBna > chartArea.fIwbmz() + (AhwBna() * 2.0f)) {
            if (this.AkhnZx > 0) {
                while (fAhwBna > chartArea.fIwbmz() + (AhwBna() * 2.0f)) {
                    fAhwBna -= AhwBna();
                    i--;
                }
            }
        } else if (this.gEmmrt != this.fJNWhG) {
            while (fAhwBna < chartArea.fIwbmz() + (AhwBna() * 2.0f) && i < this.fJNWhG) {
                fAhwBna += AhwBna();
                i++;
            }
        }
        AEQbTJ("calculateAfterAddHistoryLastIndex 修正lastIndex后 start" + fAhwBna);
        AEQbTJ("calculateAfterAddHistoryLastIndex 修正lastIndex后 newLastIndex" + i);
        AEQbTJ("calculateAfterAddHistoryLastIndex 左侧限制" + DbNXlk(this.AkhnZx));
        this.AYXKKw = fAhwBna;
        this.gEmmrt = i;
        while (fAhwBna > 0.0f) {
            fAhwBna -= AhwBna();
            i = i > 0 ? i - 1 : 0;
        }
        this.djBIcL = this.AYXKKw > ((float) chartArea.fIwbmz()) ? valueOf(chartArea.fIwbmz()) : this.gEmmrt;
        this.AuCTel = this.gEmmrt - i;
        this.AkhnZx = i;
        AEQbTJ("calculateAfterAddHistoryLastIndex lastIndex" + this.gEmmrt);
        AEQbTJ("calculateAfterAddHistoryLastIndex firstIndex" + i);
        AEQbTJ("calculateAfterAddHistoryLastIndex mMaxItemCount" + this.AuCTel);
        AEQbTJ("calculateAfterAddHistoryLastIndex lastIndexX" + this.AYXKKw);
        AEQbTJ("calculateAfterAddHistoryLastIndex firstIndexX" + fAhwBna);
        return this.AuCTel;
    }
}
