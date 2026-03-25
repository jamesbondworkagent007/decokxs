package o;

import androidx.camera.video.AudioStats;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.okinc.kline.library.layout.ChartArea;
import com.okinc.kline.library.template.TemplateSetting;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Objects;
import o.C32392mcI;

/* JADX INFO: loaded from: classes8.dex */
public class oWC extends C36252oUx {
    public static final int[] valueOf = {10, 20, 25, 40, 50, 100, 200, 250, 400, 500, 1000, 2000, DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS, 4000, 5000};
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public int AkhnZx;
    public int AuCTel;
    public int AuCTelauCTel;
    public int AubY;
    public BigDecimal AwvSrB;
    public int AxsJAY;
    public int DTwDnp;
    public double DbNXlk;
    public int ORxRYg;
    public BigDecimal OcIXYQ;
    public int QKVWgx;
    public java.lang.Double QOLQEE;
    public int QUSxYX;
    public double ejfBZ;
    public double fARcdN;
    public double fIwbmz;
    public int fJNWhG;
    public int fetchVPNInfo;
    public int gHZMYf;
    public double getFieldNames;
    public BigDecimal getNewProxyInstance;
    public double hDKMBd;
    public java.util.ArrayList<java.lang.Double> isConnected;
    public double iwGUEr;
    public int sSMYrx;
    public int uzCIH;
    public double values;
    public boolean wlaJM;
    public double zLjUOn;
    public double zsXlph;
    public double zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AEQbTJ(double d) {
        return (int) ((d * this.hDKMBd) + 1.5d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.wlaJM = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.ArrayList<java.lang.Double> AYXKKw() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double AkhnZx() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double AuCTel() {
        return this.DbNXlk - this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double DbNXlk() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int EZpvd(double d, double d2, double d3) {
        return (int) ((d3 * (d > d2 ? ((double) (this.AkhnZx - this.AuCTelauCTel)) / (d - d2) : AudioStats.AUDIO_AMPLITUDE_NONE)) + 1.5d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean EZpvd(double d) {
        return d > this.DbNXlk || d < this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(int i) {
        this.fJNWhG = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int OLrzqt(double d, double d2, double d3) {
        if (d3 >= d) {
            return this.AuCTelauCTel;
        }
        if (d3 <= d2) {
            return this.AkhnZx;
        }
        double d4 = d > d2 ? ((double) (this.AkhnZx - this.AuCTelauCTel)) / (d - d2) : 0.0d;
        return d4 > AudioStats.AUDIO_AMPLITUDE_NONE ? this.AuCTelauCTel + ((int) (((d - d3) * d4) + 0.5d)) : this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(int i) {
        this.AuCTel = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public double copydefault(int i) {
        double d = this.zuBGHE;
        return d > AudioStats.AUDIO_AMPLITUDE_NONE ? this.zLjUOn - (((double) (i - this.AuCTelauCTel)) / d) : this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int ejfBZ() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int fIwbmz() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int gEmmrt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public double getFieldNames() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean hDKMBd() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int isConnected() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int uzCIH() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int values() {
        return this.DTwDnp;
    }

    public ChartArea AEQbTJ(C36246oUr c36246oUr) {
        return c36246oUr.values().get(EZpvd());
    }

    public C36305oWw fARcdN() {
        return (C36305oWw) C36246oUr.copydefault().copydefault.get(AEQbTJ() + "Range.m");
    }

    public final int djBIcL() {
        return java.lang.Math.max(0, this.AkhnZx - this.AuCTelauCTel);
    }

    public double EZpvd(int i) {
        if ("PRICE".equals(this.AhwBna) && C36246oUr.copydefault().flVtFt().equals("YMove")) {
            return copydefault(i);
        }
        if (getFieldNames() > AudioStats.AUDIO_AMPLITUDE_NONE) {
            return DbNXlk() - (((double) (i - uzCIH())) / getFieldNames());
        }
        return DbNXlk();
    }

    public int valueOf(double d) {
        return this.hDKMBd > AudioStats.AUDIO_AMPLITUDE_NONE ? this.AuCTelauCTel + ((int) (((fetchVPNInfo() - d) * this.hDKMBd) + 0.5d)) : this.AuCTelauCTel;
    }

    public int djBIcL(double d) {
        return AhwBna(d);
    }

    public int EZpvd(double d, boolean z) {
        return djBIcL(d);
    }

    public int gEmmrt(double d) {
        int i;
        int i2;
        double d2;
        if (C36246oUr.copydefault().gHZMYf().equals("YScale")) {
            if (C36246oUr.copydefault().flVtFt().equals("YMove")) {
                i = this.AuCTelauCTel;
                d2 = (this.zLjUOn - d) * this.zuBGHE;
            } else {
                double d3 = this.hDKMBd;
                if (d3 <= AudioStats.AUDIO_AMPLITUDE_NONE) {
                    return C36246oUr.copydefault().AxsJAY();
                }
                i = this.AuCTelauCTel;
                d2 = (this.DbNXlk - d) * d3;
            }
            i2 = (int) (d2 + 0.5d);
        } else {
            double d4 = this.DbNXlk;
            if (d >= d4) {
                return C36246oUr.copydefault().AxsJAY();
            }
            if (d <= this.ejfBZ) {
                return this.AkhnZx;
            }
            double d5 = this.hDKMBd;
            if (d5 <= AudioStats.AUDIO_AMPLITUDE_NONE) {
                return this.AuCTelauCTel;
            }
            i = this.AuCTelauCTel;
            i2 = (int) (((d4 - d) * d5) + 0.5d);
        }
        return i + i2;
    }

    public int AhwBna(double d) {
        int i;
        double dFetchVPNInfo;
        double d2;
        double dKWHzl = KWHzl(d);
        if (C36246oUr.copydefault().gHZMYf().equals("YScale")) {
            if ("PRICE".equals(this.AhwBna) && !EZpvd().contains("indic")) {
                if (!C36246oUr.copydefault().flVtFt().equals("YMove")) {
                    return valueOf(dKWHzl);
                }
                i = this.AuCTelauCTel;
                dFetchVPNInfo = this.zLjUOn - dKWHzl;
                d2 = this.zuBGHE;
            } else {
                if ("PRICE".equals(this.AhwBna) && !EZpvd().contains("indic")) {
                    return valueOf(dKWHzl);
                }
                if (dKWHzl >= fetchVPNInfo()) {
                    return this.AuCTelauCTel;
                }
                if (dKWHzl <= fJNWhG()) {
                    return this.AkhnZx;
                }
                if (this.hDKMBd <= AudioStats.AUDIO_AMPLITUDE_NONE) {
                    return this.AuCTelauCTel;
                }
                i = this.AuCTelauCTel;
                dFetchVPNInfo = fetchVPNInfo() - dKWHzl;
                d2 = this.hDKMBd;
            }
        } else {
            if ("PRICE".equals(this.AhwBna) && !EZpvd().contains("indic")) {
                return valueOf(dKWHzl);
            }
            if (dKWHzl >= fetchVPNInfo()) {
                return this.AuCTelauCTel;
            }
            if (dKWHzl <= fJNWhG()) {
                return this.AkhnZx;
            }
            if (this.hDKMBd <= AudioStats.AUDIO_AMPLITUDE_NONE) {
                return this.AuCTelauCTel;
            }
            i = this.AuCTelauCTel;
            dFetchVPNInfo = fetchVPNInfo() - dKWHzl;
            d2 = this.hDKMBd;
        }
        return i + ((int) ((dFetchVPNInfo * d2) + 0.5d));
    }

    public final double KWHzl(double d) {
        return (C36246oUr.copydefault().zLjUOn().isCompareKLine() && "PRICE".equals(this.AhwBna) && !EZpvd().contains("indic")) ? copydefault(d) : d;
    }

    public boolean KWHzl(double d, double d2, double d3, double d4) {
        if (C36246oUr.copydefault().zLjUOn().isCompareKLine() && "PRICE".equals(this.AhwBna) && !EZpvd().contains("indic")) {
            d = copydefault(d);
        }
        if (d < this.zsXlph && d3 > ((double) gEmmrt()) - d4) {
            return true;
        }
        if (d >= this.zLjUOn || d <= this.zsXlph || d3 <= ((double) gEmmrt()) - d4) {
            return d > this.zLjUOn && d2 < ((double) uzCIH());
        }
        return true;
    }

    public int OLrzqt(double d) {
        if (C36246oUr.copydefault().gHZMYf().equals("YScale")) {
            return C36246oUr.copydefault().flVtFt().equals("YMove") ? this.AuCTelauCTel + ((int) (((this.zLjUOn - d) * this.zuBGHE) + 0.5d)) : valueOf(d);
        }
        return valueOf(d);
    }

    public oWC(java.lang.String str) {
        super(str);
        this.AhwBna = "";
        this.AubY = 0;
        this.sSMYrx = 3;
        this.DTwDnp = 0;
        this.wlaJM = true;
        this.ejfBZ = Double.MAX_VALUE;
        this.DbNXlk = -1.7976931348623157E308d;
        this.zLjUOn = Double.MAX_VALUE;
        this.zsXlph = -1.7976931348623157E308d;
        this.zuBGHE = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.iwGUEr = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.fARcdN = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.fetchVPNInfo = 0;
        this.QUSxYX = 4;
        this.ORxRYg = 10;
        this.getNewProxyInstance = C33129mqd.EZpvd(0);
        this.QOLQEE = java.lang.Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE);
        this.hDKMBd = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.AuCTelauCTel = 0;
        this.QKVWgx = 0;
        this.AkhnZx = 0;
        this.AuCTel = 0;
        this.fJNWhG = 0;
        this.uzCIH = -1;
        this.getFieldNames = -1.7976931348623157E308d;
        this.AYXKKw = "0";
        this.isConnected = new java.util.ArrayList<>();
        this.fIwbmz = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.values = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public void AEQbTJ(java.lang.String str) {
        this.AhwBna = str;
        AuCTelauCTel();
    }

    public void AuCTelauCTel() {
        this.sSMYrx = C36246oUr.copydefault().gkJEwt();
        this.DTwDnp = C36246oUr.copydefault().gkJEwt();
    }

    public void AubY() {
        double dMin;
        double dMax;
        double dMin2;
        if (!"PRICE".equals(this.AhwBna) || EZpvd().contains("indic") || !Objects.equals(C36246oUr.copydefault().gHZMYf(), "YScale") || C36246oUr.copydefault().gGvvIC()) {
            C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
            oUG oug = c36246oUrCopydefault.iwGUEr().AkhnZx().get(AEQbTJ() + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE);
            if (oug != null) {
                dMin = java.lang.Math.min(Double.MAX_VALUE, oug.gEmmrt());
                dMax = java.lang.Math.max(-1.7976931348623157E308d, oug.AhwBna());
            } else {
                dMin = Double.MAX_VALUE;
                dMax = -1.7976931348623157E308d;
            }
            oUG oug2 = c36246oUrCopydefault.iwGUEr().AkhnZx().get(AEQbTJ() + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND);
            if (oug2 != null && !((oUK) oug2).isConnected().AYXKKw().equals("VOLUMEM")) {
                dMin = java.lang.Math.min(dMin, oug2.gEmmrt());
                dMax = java.lang.Math.max(dMax, oug2.AhwBna());
            }
            if (oug2 != null && KWHzl(((oUK) oug2).isConnected().AYXKKw())) {
                dMin = oug2.gEmmrt();
                dMax = oug2.AhwBna();
            }
            for (java.lang.String str : c36246oUrCopydefault.KWHzl(copydefault()).getMainIndicatorNames()) {
                oUG oug3 = c36246oUrCopydefault.iwGUEr().AkhnZx().get(AEQbTJ() + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND + JwtUtilsKt.JWT_DELIMITER + str);
                if (oug3 != null && !((oUK) oug3).isConnected().AYXKKw().equals("VOLUMEM")) {
                    dMin = java.lang.Math.min(dMin, oug3.gEmmrt());
                    dMax = java.lang.Math.max(dMax, oug3.AhwBna());
                }
            }
            oUG oug4 = c36246oUrCopydefault.iwGUEr().AkhnZx().get(AEQbTJ() + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND + JwtUtilsKt.JWT_DELIMITER + "compare");
            if (oug4 != null) {
                dMin = java.lang.Math.min(dMin, oug4.gEmmrt());
                dMax = java.lang.Math.max(dMax, oug4.AhwBna());
            }
            oUG oug5 = c36246oUrCopydefault.iwGUEr().AkhnZx().get(AEQbTJ() + JwtUtilsKt.JWT_DELIMITER + "l");
            if (oug5 == null || ((oUK) oug5).isConnected().AYXKKw().equals("VOLUMEM")) {
                dMin2 = dMin;
            } else {
                dMin2 = java.lang.Math.min(dMin, oug5.gEmmrt());
                dMax = java.lang.Math.max(dMax, oug5.AhwBna());
            }
            double d = dMax;
            if (dMin2 == Double.MAX_VALUE || d == -1.7976931348623157E308d) {
                return;
            }
            TaskDescription taskDescription = new TaskDescription(dMin2, d);
            KWHzl(taskDescription);
            KWHzl(taskDescription.OLrzqt, taskDescription.KWHzl, AEQbTJ(c36246oUrCopydefault), fARcdN(), c36246oUrCopydefault.fIwbmz(), c36246oUrCopydefault.gHZMYf());
        }
    }

    public void zsXlph() {
        this.fARcdN = this.DbNXlk;
        this.iwGUEr = this.ejfBZ;
        this.QOLQEE = java.lang.Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE);
    }

    public void AEQbTJ(float f, ChartArea chartArea, C36305oWw c36305oWw, java.lang.String str, java.lang.String str2, int i) {
        double d = this.fARcdN;
        double d2 = this.iwGUEr;
        double d3 = (d - d2) * ((double) f);
        this.fetchVPNInfo = i;
        KWHzl(d2 + d3, d3 + d, chartArea, c36305oWw, str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void EZpvd(float f, ChartArea chartArea, C36305oWw c36305oWw, java.lang.String str, java.lang.String str2, int i) {
        int i2;
        if (f > 0.0f) {
            this.AYXKKw = "0";
        } else {
            this.AYXKKw = "1";
        }
        this.fetchVPNInfo = i;
        double d = this.fARcdN - this.iwGUEr;
        if (this.AYXKKw.equals("1")) {
            d /= 2.0d;
        }
        int i3 = this.fetchVPNInfo;
        if (i3 == 0) {
            i2 = 4;
        } else if (i3 == 1) {
            i2 = 5;
        } else if (i3 == 2) {
            i2 = 3;
        }
        double d2 = d * ((double) f);
        double d3 = this.fARcdN + d2;
        double d4 = this.iwGUEr - d2;
        int iGkJEwt = C36246oUr.copydefault().gkJEwt();
        if (C36246oUr.copydefault().zLjUOn().isKLineInfiniteScale()) {
            iGkJEwt = AbstractC36302oWt.EZpvd(fetchVPNInfo() - fJNWhG());
        }
        if (d3 - d4 < java.lang.Math.pow(10.0d, -((C36246oUr.copydefault().dHguZz() && "PRICE".equals(this.AhwBna) && !EZpvd().contains("indic")) ? 4 : iGkJEwt)) * ((double) i2)) {
            return;
        }
        KWHzl(d4, d3, chartArea, c36305oWw, str, str2);
    }

    public void copydefault(double d, double d2, ChartArea chartArea, C36305oWw c36305oWw, java.lang.String str, java.lang.String str2, int i) {
        this.fetchVPNInfo = i;
        if (d - d2 < java.lang.Math.pow(10.0d, -C36246oUr.copydefault().gkJEwt()) * 4.0d) {
            return;
        }
        KWHzl(d2, d, chartArea, c36305oWw, str, str2);
    }

    public class TaskDescription {
        public double KWHzl;
        public double OLrzqt;

        public TaskDescription(double d, double d2) {
            this.OLrzqt = d;
            this.KWHzl = d2;
        }
    }

    public void KWHzl(TaskDescription taskDescription) {
        if (taskDescription.OLrzqt == taskDescription.KWHzl) {
            taskDescription.OLrzqt = -1.0d;
            taskDescription.KWHzl = 1.0d;
        }
    }

    public final void KWHzl(double d, double d2, ChartArea chartArea, C36305oWw c36305oWw, java.lang.String str, java.lang.String str2) {
        double dFetchVPNInfo;
        if (chartArea == null) {
            return;
        }
        this.wlaJM = true;
        this.ejfBZ = d;
        this.DbNXlk = d2;
        if (C36246oUr.copydefault().zLjUOn().isCompareKLine() && "PRICE".equals(this.AhwBna) && !EZpvd().contains("indic")) {
            this.fIwbmz = copydefault(d);
            this.values = copydefault(d2);
        }
        if (fetchVPNInfo() == fJNWhG()) {
            zLjUOn();
        }
        this.isConnected.clear();
        int iAuCTel = chartArea.AuCTel() + this.AuCTel;
        int iKWHzl = (chartArea.KWHzl() - this.fJNWhG) - 1;
        if (iAuCTel >= iKWHzl) {
            this.ejfBZ = this.DbNXlk;
            return;
        }
        this.QKVWgx = chartArea.AuCTel() + AbstractC36302oWt.copydefault(14.0f);
        this.AuCTelauCTel = iAuCTel;
        this.AkhnZx = iKWHzl;
        if (fetchVPNInfo() >= fJNWhG()) {
            int iEZpvd = AbstractC36302oWt.EZpvd(fetchVPNInfo() - fJNWhG());
            if (C36246oUr.copydefault().dHguZz() && "PRICE".equals(this.AhwBna) && !EZpvd().contains("indic")) {
                iEZpvd = 4;
            }
            double d3 = -iEZpvd;
            if (fetchVPNInfo() - fJNWhG() < java.lang.Math.pow(10.0d, d3) * ((double) this.QUSxYX)) {
                double d4 = (this.DbNXlk + this.ejfBZ) / 2.0d;
                this.DbNXlk = ((java.lang.Math.pow(10.0d, d3) * ((double) this.QUSxYX)) / 2.0d) + d4;
                this.ejfBZ = d4 - ((java.lang.Math.pow(10.0d, d3) * ((double) this.QUSxYX)) / 2.0d);
                double dFetchVPNInfo2 = (fetchVPNInfo() + fJNWhG()) / 2.0d;
                this.values = java.lang.Math.pow(10.0d, d3) + dFetchVPNInfo2;
                this.fIwbmz = dFetchVPNInfo2 - java.lang.Math.pow(10.0d, d3);
            }
            dFetchVPNInfo = ((double) (this.AkhnZx - this.AuCTelauCTel)) / (fetchVPNInfo() - fJNWhG());
        } else {
            dFetchVPNInfo = AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        this.hDKMBd = dFetchVPNInfo;
        this.zLjUOn = fetchVPNInfo();
        double dFJNWhG = fJNWhG();
        this.zsXlph = dFJNWhG;
        this.zuBGHE = ((double) (this.AkhnZx - this.AuCTelauCTel)) / (this.zLjUOn - dFJNWhG);
        AEQbTJ(c36305oWw, str, str2);
        if (!this.AhwBna.equals("VOLUME") || this.DbNXlk < 1000.0d) {
            return;
        }
        this.sSMYrx = 2;
    }

    public final double fJNWhG() {
        return (C36246oUr.copydefault().zLjUOn().isCompareKLine() && "PRICE".equals(this.AhwBna) && !EZpvd().contains("indic")) ? this.fIwbmz : this.ejfBZ;
    }

    public final double fetchVPNInfo() {
        return (C36246oUr.copydefault().zLjUOn().isCompareKLine() && "PRICE".equals(this.AhwBna) && !EZpvd().contains("indic")) ? this.values : this.DbNXlk;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final double copydefault(double d) {
        oUG oug;
        java.lang.Double dValueOf;
        oWN own = C36246oUr.copydefault().DCJXGO().get(copydefault());
        if (own == null || (oug = C36246oUr.copydefault().iwGUEr().AkhnZx().get("ds0.m.m")) == null) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        if (oug instanceof oUM) {
            oUM oum = (oUM) oug;
            if (oum.valueOf() != null && !oum.valueOf().isEmpty()) {
                dValueOf = java.lang.Double.valueOf(oum.valueOf().get(own.isConnected()).copydefault());
            } else if (oug instanceof oUK) {
                oUK ouk = (oUK) oug;
                dValueOf = (ouk.valueOf() == null || ouk.valueOf().isEmpty()) ? null : java.lang.Double.valueOf(ouk.valueOf().get(own.isConnected()).copydefault());
            }
        }
        return dValueOf != null ? (d - dValueOf.doubleValue()) / dValueOf.doubleValue() : AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public final void zLjUOn() {
        int length;
        java.lang.String[] strArrSplit = java.lang.String.valueOf(fJNWhG()).split("\\.");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0.");
        if (strArrSplit.length <= 1 || (length = strArrSplit[1].length()) <= 0) {
            this.ejfBZ -= 10.0d;
            this.fIwbmz -= 10.0d;
        } else {
            for (int i = 0; i < length; i++) {
                if (i == length - 1) {
                    stringBuffer.append("1");
                } else {
                    stringBuffer.append("0");
                }
            }
            this.ejfBZ -= java.lang.Double.valueOf(stringBuffer.toString()).doubleValue() * 10.0d;
            this.fIwbmz -= java.lang.Double.valueOf(stringBuffer.toString()).doubleValue() * 10.0d;
        }
        if (this.ejfBZ < AudioStats.AUDIO_AMPLITUDE_NONE) {
            this.ejfBZ = AudioStats.AUDIO_AMPLITUDE_NONE;
        }
    }

    public double copydefault(C36305oWw c36305oWw) {
        double d;
        if (this.hDKMBd == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        int iDjBIcL = djBIcL();
        int iAhwBna = (int) (((double) c36305oWw.AhwBna()) * 1.5d);
        if (iDjBIcL / iAhwBna <= 1) {
            iAhwBna = iDjBIcL >> 1;
        }
        double dAuCTel = AuCTel();
        int i = 0;
        while (i > (-this.sSMYrx) && java.lang.Math.floor(dAuCTel) < dAuCTel) {
            dAuCTel *= 10.0d;
            i--;
        }
        while (true) {
            double dPow = java.lang.Math.pow(10.0d, i);
            d = 0.5d * dPow;
            if (AEQbTJ(d) > iAhwBna) {
                break;
            }
            d = 1.0d * dPow;
            if (AEQbTJ(d) > iAhwBna) {
                break;
            }
            d = 2.0d * dPow;
            if (AEQbTJ(d) > iAhwBna) {
                break;
            }
            d = 5.0d * dPow;
            if (AEQbTJ(d) > iAhwBna) {
                break;
            }
            i++;
        }
        return d;
    }

    public void AEQbTJ(C36305oWw c36305oWw, java.lang.String str, java.lang.String str2) {
        this.isConnected.clear();
        if (copydefault(c36305oWw) <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            return;
        }
        copydefault(str2);
    }

    public void copydefault(java.lang.String str) {
        java.lang.Double dValueOf = java.lang.Double.valueOf((fetchVPNInfo() - fJNWhG()) / ((double) ((this.AkhnZx * 1.0f) - (this.AuCTelauCTel * 1.0f))));
        java.lang.Double dValueOf2 = java.lang.Double.valueOf(fetchVPNInfo() + (((double) (this.AuCTel * 1.0f)) * dValueOf.doubleValue()));
        int i = 0;
        if ("PRICE".equals(this.AhwBna) && !EZpvd().contains("indic")) {
            if (str.equals("YScale") && C36246oUr.copydefault().iwGUEr().dvKsVJ().equals("Move")) {
                if (C36246oUr.copydefault().flVtFt().equals("YMove")) {
                    getNewProxyInstance();
                    return;
                } else {
                    OLrzqt(str);
                    return;
                }
            }
            if (pDN.AEQbTJ.EZpvd()) {
                OLrzqt(str);
                return;
            }
            float fDjBIcL = (((djBIcL() + this.AuCTel) + this.fJNWhG) * 1.0f) / C36246oUr.copydefault().zsXlph();
            while (i <= C36246oUr.copydefault().zsXlph()) {
                this.isConnected.add(java.lang.Double.valueOf(dValueOf2.doubleValue() - (((double) (i * fDjBIcL)) * dValueOf.doubleValue())));
                i++;
            }
            return;
        }
        if (KWHzl(this.AhwBna)) {
            if (iwGUEr()) {
                this.isConnected.add(java.lang.Double.valueOf(this.DbNXlk));
                this.isConnected.add(java.lang.Double.valueOf(this.ejfBZ));
                return;
            }
            return;
        }
        float fDjBIcL2 = (((djBIcL() + this.AuCTel) + this.fJNWhG) * 1.0f) / 2.0f;
        while (i < 3) {
            this.isConnected.add(java.lang.Double.valueOf(dValueOf2.doubleValue() - (((double) (i * fDjBIcL2)) * dValueOf.doubleValue())));
            i++;
        }
    }

    public BigDecimal KWHzl() {
        wlaJM();
        double dFetchVPNInfo = fetchVPNInfo() - fJNWhG();
        int iFloor = ((int) java.lang.Math.floor(java.lang.Math.log10(dFetchVPNInfo))) - 2;
        for (int i = 0; i < 15; i++) {
            int[] iArr = valueOf;
            double d = iFloor;
            double dPow = dFetchVPNInfo / (((double) iArr[i]) * java.lang.Math.pow(10.0d, d));
            if (this.ORxRYg >= dPow && dPow >= this.QUSxYX) {
                this.gHZMYf = iFloor;
                this.AxsJAY = i;
                return new BigDecimal(((double) iArr[i]) * java.lang.Math.pow(10.0d, d), MathContext.DECIMAL64);
            }
        }
        try {
            return new BigDecimal(dFetchVPNInfo / ((double) this.QUSxYX), MathContext.DECIMAL64);
        } catch (java.lang.Exception e) {
            C6777aVl.copydefault(new java.lang.Exception("Kline range calculate Failed: \ndifference:" + dFetchVPNInfo + " yaxisNumMin:" + this.QUSxYX + " \nmBottom:" + this.AkhnZx + " mTop" + this.AuCTelauCTel + " \nmMaxValue:" + this.DbNXlk + " mMinValue" + this.ejfBZ + " \nerrMsg: " + e.getMessage()));
            return new BigDecimal(dFetchVPNInfo / 4.0d, MathContext.DECIMAL64);
        }
    }

    public final void wlaJM() {
        this.ORxRYg = (int) java.lang.Math.ceil((this.AkhnZx - this.AuCTelauCTel) / 40);
        this.QUSxYX = (int) java.lang.Math.ceil(r0 / 2);
    }

    public final void OLrzqt(java.lang.String str) {
        try {
            int iFloor = (int) java.lang.Math.floor(java.lang.Math.log10(fetchVPNInfo() - fJNWhG()));
            if (fJNWhG() < AudioStats.AUDIO_AMPLITUDE_NONE) {
                iFloor--;
            }
            int i = iFloor + 4;
            this.OcIXYQ = new BigDecimal(java.lang.Math.floor(fJNWhG() / java.lang.Math.pow(10.0d, i))).multiply(new BigDecimal(1, MathContext.DECIMAL64).scaleByPowerOfTen(i));
            if (!str.equals("YScale") || this.AwvSrB == null) {
                this.AwvSrB = KWHzl();
            }
            valueOf();
        } catch (java.lang.Exception e) {
            pUU.copydefault("Kline-Range", "optYScaleMoveNum error: " + e.getMessage());
        }
    }

    public final void getNewProxyInstance() {
        double dFetchVPNInfo = fetchVPNInfo() - fJNWhG();
        int iFloor = (int) java.lang.Math.floor(java.lang.Math.log10(dFetchVPNInfo));
        if (fJNWhG() < AudioStats.AUDIO_AMPLITUDE_NONE) {
            iFloor--;
        }
        int i = iFloor + 4;
        double dPow = java.lang.Math.pow(10.0d, i);
        BigDecimal bigDecimalScaleByPowerOfTen = new BigDecimal(1, MathContext.DECIMAL64).scaleByPowerOfTen(i);
        double dFloor = java.lang.Math.floor(fJNWhG() / dPow);
        java.lang.Math.floor(fetchVPNInfo() / dPow);
        this.OcIXYQ = new BigDecimal(dFloor).multiply(bigDecimalScaleByPowerOfTen);
        java.lang.String str = this.AYXKKw;
        str.hashCode();
        if (str.equals("0")) {
            this.AwvSrB = copydefault(dFetchVPNInfo, true);
        } else if (str.equals("1")) {
            this.AwvSrB = copydefault(dFetchVPNInfo, false);
        }
        if (this.AwvSrB == null) {
            return;
        }
        valueOf();
    }

    public java.util.List<BigDecimal> valueOf() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        double dDoubleValue = this.OcIXYQ.doubleValue();
        double dDoubleValue2 = this.AwvSrB.doubleValue();
        int iFJNWhG = (int) (((fJNWhG() - dDoubleValue) / dDoubleValue2) - 1.0d);
        while (true) {
            iFJNWhG++;
            double d = (((double) iFJNWhG) * dDoubleValue2) + dDoubleValue;
            if (fJNWhG() <= d) {
                if (fetchVPNInfo() < d) {
                    break;
                }
                BigDecimal bigDecimalAdd = this.OcIXYQ.add(this.AwvSrB.multiply(new BigDecimal(iFJNWhG)));
                arrayList.add(bigDecimalAdd);
                this.isConnected.add(java.lang.Double.valueOf(bigDecimalAdd.doubleValue()));
            }
        }
        if (C36246oUr.copydefault().gHZMYf().equals("NORMAL")) {
            int newProxyInstance = C36246oUr.copydefault().getNewProxyInstance();
            int i = 0;
            if (newProxyInstance != 0) {
                if (newProxyInstance != 1) {
                    if (newProxyInstance == 2 && arrayList.size() / 2 > 2) {
                        this.isConnected.clear();
                        while (i < arrayList.size()) {
                            if (i % 2 == 0) {
                                this.isConnected.add(java.lang.Double.valueOf(((BigDecimal) arrayList.get(i)).doubleValue()));
                            }
                            i++;
                        }
                    }
                } else if (arrayList.size() / 2 >= 4) {
                    this.isConnected.clear();
                    while (i < arrayList.size()) {
                        if (i % 2 == 0) {
                            this.isConnected.add(java.lang.Double.valueOf(((BigDecimal) arrayList.get(i)).doubleValue()));
                        }
                        i++;
                    }
                }
            } else if (arrayList.size() / 2 > 3) {
                this.isConnected.clear();
                while (i < arrayList.size()) {
                    if (i % 2 == 0) {
                        this.isConnected.add(java.lang.Double.valueOf(((BigDecimal) arrayList.get(i)).doubleValue()));
                    }
                    i++;
                }
            }
        } else if (!this.isConnected.isEmpty()) {
            java.util.ArrayList<java.lang.Double> arrayList2 = this.isConnected;
            arrayList2.add(java.lang.Double.valueOf(arrayList2.get(arrayList2.size() - 1).doubleValue() + this.AwvSrB.doubleValue()));
        }
        if (arrayList.size() == 0) {
            return arrayList;
        }
        this.getNewProxyInstance = this.AwvSrB;
        return arrayList;
    }

    public BigDecimal copydefault(double d, boolean z) {
        BigDecimal bigDecimalOLrzqt = z ? OLrzqt(d, true) : null;
        if (bigDecimalOLrzqt == null) {
            bigDecimalOLrzqt = OLrzqt(d, false);
        }
        return (bigDecimalOLrzqt != null || z) ? bigDecimalOLrzqt : OLrzqt(d, true);
    }

    public final BigDecimal OLrzqt(double d, boolean z) {
        int i;
        int i2;
        int i3 = this.fetchVPNInfo;
        if (i3 == 0) {
            i = 4;
            i2 = 8;
        } else if (i3 == 1 || i3 != 2) {
            i = 5;
            i2 = 10;
        } else {
            i = 3;
            i2 = 6;
        }
        int i4 = this.gHZMYf;
        int i5 = this.AxsJAY;
        while (z) {
            if (i5 >= 15) {
                i4 += 3;
                i5 = 0;
            }
            double dPow = d / (((double) valueOf[i5]) * java.lang.Math.pow(10.0d, i4));
            double d2 = i;
            if (dPow >= d2) {
                if (d2 <= dPow && dPow <= i2) {
                    break;
                }
                i5++;
            } else {
                return null;
            }
        }
        while (!z) {
            if (i5 < 0) {
                i4 -= 3;
                i5 = 14;
            }
            double dPow2 = d / (((double) valueOf[i5]) * java.lang.Math.pow(10.0d, i4));
            double d3 = i2;
            if (dPow2 <= d3) {
                if (i <= dPow2 && dPow2 <= d3) {
                    break;
                }
                i5--;
            } else {
                return null;
            }
        }
        this.gHZMYf = i4;
        this.AxsJAY = i5;
        return new BigDecimal(((double) valueOf[i5]) * java.lang.Math.pow(10.0d, i4), MathContext.DECIMAL64);
    }

    public static java.lang.String AEQbTJ(double d, int i) {
        if (d >= 1.0E9d) {
            return pTB.OLrzqt(pTB.OLrzqt(java.lang.Double.valueOf(d / 1.0E9d)), i) + "B";
        }
        if (d >= 1000000.0d) {
            return pTB.OLrzqt(pTB.OLrzqt(java.lang.Double.valueOf(d / 1000000.0d)), i) + "M";
        }
        if (d < 1000.0d) {
            return d >= AudioStats.AUDIO_AMPLITUDE_NONE ? pTB.OLrzqt(pTB.OLrzqt(java.lang.Double.valueOf(d)), i) : "0.000";
        }
        return pTB.OLrzqt(pTB.OLrzqt(java.lang.Double.valueOf(d / 1000.0d)), i) + "k";
    }

    public static java.lang.String OLrzqt(double d, int i) {
        if (d >= 1000.0d) {
            i = 2;
        }
        if (d >= 9.99999995904E11d) {
            return pTB.OLrzqt(pTB.OLrzqt(java.lang.Double.valueOf(d / 9.99999995904E11d)), i) + C32979mnm.EZpvd.OLrzqt().getString(C32392mcI.Dialog.ffGIBT);
        }
        if (d >= 1.0E8d) {
            return pTB.OLrzqt(pTB.OLrzqt(java.lang.Double.valueOf(d / 1.0E8d)), i) + C32979mnm.EZpvd.OLrzqt().getString(C32392mcI.Dialog.OuxcSI);
        }
        if (d < 10000.0d) {
            return d >= AudioStats.AUDIO_AMPLITUDE_NONE ? pTB.OLrzqt(pTB.OLrzqt(java.lang.Double.valueOf(d)), i) : "0.000";
        }
        return pTB.OLrzqt(pTB.OLrzqt(java.lang.Double.valueOf(d / 10000.0d)), i) + C32979mnm.EZpvd.OLrzqt().getString(C32392mcI.Dialog.zuWLRA);
    }

    public static java.lang.String KWHzl(double d, int i) {
        if (d >= 1000.0d) {
            i = 2;
        }
        if (d >= 1.0E9d) {
            return pTB.OLrzqt(pTB.OLrzqt(java.lang.Double.valueOf(d / 1.0E9d)), i) + "B";
        }
        if (d >= 1000000.0d) {
            return pTB.OLrzqt(pTB.OLrzqt(java.lang.Double.valueOf(d / 1000000.0d)), i) + "M";
        }
        if (d < 1000.0d) {
            return d >= AudioStats.AUDIO_AMPLITUDE_NONE ? pTB.OLrzqt(pTB.OLrzqt(java.lang.Double.valueOf(d)), i) : "0.000";
        }
        return pTB.OLrzqt(pTB.OLrzqt(java.lang.Double.valueOf(d / 1000.0d)), i) + "K";
    }

    public boolean KWHzl(java.lang.String str) {
        return str.equals("OI") || str.equals("LSAcco") || str.equals("LSPos") || str.equals("LSRatio") || str.equals("BSVol");
    }

    public boolean iwGUEr() {
        TemplateSetting templateSettingKWHzl = C36246oUr.copydefault().KWHzl(copydefault());
        return (templateSettingKWHzl == null || templateSettingKWHzl.getSPTimeInterval() >= 5) && C36246oUr.copydefault().QVsKAR();
    }
}
