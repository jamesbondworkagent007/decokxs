package com.okinc.kline.library.data;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import androidx.camera.video.AudioStats;
import com.okinc.kline.data.HistoryOrderData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import o.AbstractC36262oVg;
import o.C32392mcI;
import o.C33069mpW;
import o.C33070mpX;
import o.C34704nhP;
import o.C36246oUr;
import o.C36252oUx;
import o.C43246rlf;
import o.InterfaceC56387yDm;
import o.oUF;
import o.oUG;
import o.oUK;
import o.oUO;
import o.pUU;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes8.dex */
public class DataSource extends C36252oUx {
    public final DataArrayList<StateListAnimator> AEQbTJ;
    public final String AYXKKw;
    public final String AhwBna;
    public int DbNXlk;
    public final String EZpvd;
    public final String KWHzl;
    public final DataArrayList<StateListAnimator> OLrzqt;
    public final String djBIcL;
    public boolean gEmmrt;
    public double isConnected;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(int i) {
        this.DbNXlk = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int isConnected() {
        return this.DbNXlk;
    }

    public class StateListAnimator {
        public final double AuCTelauCTel;
        public InterfaceC56387yDm<String> AwvSrB;
        public final double AxsJAY;
        public Drawable DTwDnp;
        public String OcIXYQ;
        public String QKVWgx;
        public double QOLQEE;
        public double fARcdN;
        public double fIwbmz;
        public final long fJNWhG;
        public String getFieldNames;
        public double getNewProxyInstance;
        public final double hDKMBd;
        public String iwGUEr;
        public double sSMYrx;
        public double uzCIH;
        public double wlaJM;
        public final double zsXlph;
        public double zuBGHE;
        public String AuCTel = "";
        public String values = "";
        public String gHZMYf = "";
        public String zLjUOn = "";
        public String AubY = "";
        public String ejfBZ = "";
        public String fetchVPNInfo = "";
        public Map<String, Double> OLrzqt = new HashMap();
        public String ORxRYg = "0";
        public String AhwBna = "0";
        public String valueOf = "0";
        public String djBIcL = "0";
        public double AYXKKw = AudioStats.AUDIO_AMPLITUDE_NONE;
        public String copydefault = "0";
        public String KWHzl = "0";
        public String AEQbTJ = "0";
        public double EZpvd = AudioStats.AUDIO_AMPLITUDE_NONE;
        public String isConnected = "0";
        public String AkhnZx = "0";
        public String DbNXlk = "0";
        public double gEmmrt = AudioStats.AUDIO_AMPLITUDE_NONE;
        public String QbewEr = "0";
        public String QVAiDq = "0";
        public double QfsBiF = AudioStats.AUDIO_AMPLITUDE_NONE;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String AEQbTJ() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public double AYXKKw() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public long AhwBna() {
            return this.fJNWhG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public double AkhnZx() {
            return this.fIwbmz;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public double AuCTel() {
            return this.uzCIH;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String EZpvd() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String KWHzl() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void KWHzl(double d) {
            this.uzCIH = this.wlaJM * d;
            this.fIwbmz = this.AuCTelauCTel * d;
            this.getNewProxyInstance = this.zsXlph * d;
            this.fARcdN = this.hDKMBd * d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String OLrzqt() {
            return this.ejfBZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public double copydefault() {
            return this.fARcdN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String ejfBZ() {
            return this.AubY;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String fARcdN() {
            return this.QKVWgx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String fIwbmz() {
            return this.zLjUOn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String fJNWhG() {
            return this.OcIXYQ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public double fetchVPNInfo() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public double gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Drawable hDKMBd() {
            return this.DTwDnp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String iwGUEr() {
            return this.gHZMYf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public double uzCIH() {
            return this.QfsBiF;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public double values() {
            return this.getNewProxyInstance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public double wlaJM() {
            return this.zuBGHE;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public double zsXlph() {
            return this.sSMYrx;
        }

        public StateListAnimator(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i) {
            this.fJNWhG = j;
            this.wlaJM = d;
            this.AuCTelauCTel = d2;
            this.zsXlph = d3;
            this.hDKMBd = d4;
            this.AxsJAY = d5;
            this.QOLQEE = d6;
            this.zuBGHE = d7;
            KWHzl(d8);
            OLrzqt(i);
        }

        public StateListAnimator(String str, String str2, long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i, InterfaceC56387yDm<String> interfaceC56387yDm) {
            this.iwGUEr = str;
            this.getFieldNames = str2;
            this.fJNWhG = j;
            this.wlaJM = d;
            this.AuCTelauCTel = d2;
            this.zsXlph = d3;
            this.hDKMBd = d4;
            this.AxsJAY = d5;
            this.QOLQEE = d6;
            this.zuBGHE = d7;
            this.AwvSrB = interfaceC56387yDm;
            KWHzl(d8);
            OLrzqt(i);
        }

        public double AubY() {
            return (Objects.equals(this.getFieldNames, "SPOT") || Objects.equals(this.getFieldNames, "MARGIN")) ? this.QOLQEE : this.AxsJAY;
        }

        public double DbNXlk() {
            return Double.valueOf(this.ORxRYg).doubleValue();
        }

        public double djBIcL() {
            return Double.valueOf(this.djBIcL).doubleValue();
        }

        public double valueOf() {
            return Double.valueOf(this.AEQbTJ).doubleValue();
        }

        public double isConnected() {
            return Double.valueOf(this.DbNXlk).doubleValue();
        }

        public double getFieldNames() {
            return Double.valueOf(this.QbewEr).doubleValue();
        }

        public double getNewProxyInstance() {
            return Double.valueOf(this.QVAiDq).doubleValue();
        }

        public double EZpvd(String str) {
            Double d = this.OLrzqt.get(str);
            return d != null ? d.doubleValue() : AudioStats.AUDIO_AMPLITUDE_NONE;
        }

        public String zLjUOn() {
            InterfaceC56387yDm<String> interfaceC56387yDm = this.AwvSrB;
            return interfaceC56387yDm != null ? interfaceC56387yDm.getValue() : "";
        }

        public void OLrzqt(int i) {
            double d;
            if (i == 2) {
                d = this.zuBGHE;
            } else {
                if (i != 1) {
                    if (C34704nhP.copydefault.EZpvd()) {
                        this.sSMYrx = this.AxsJAY;
                        return;
                    } else {
                        this.sSMYrx = (Objects.equals(this.getFieldNames, "SPOT") || Objects.equals(this.getFieldNames, "MARGIN")) ? this.QOLQEE : this.AxsJAY;
                        return;
                    }
                }
                d = this.QOLQEE;
            }
            this.sSMYrx = d;
        }
    }

    public class DataArrayList<E> extends ArrayList<E> {
        public DataArrayList() {
        }

        public void removeSubList(int i, int i2) {
            removeRange(i, i2);
        }
    }

    public final int gEmmrt() {
        return this.AEQbTJ.size();
    }

    public final int djBIcL() {
        return this.AEQbTJ.size() > 0 ? 0 : -1;
    }

    public final int DbNXlk() {
        return this.AEQbTJ.size();
    }

    public long AYXKKw() {
        if (this.AEQbTJ.size() == 0) {
            return -1L;
        }
        return this.AEQbTJ.get(r0.size() - 1).AhwBna();
    }

    public long valueOf() {
        if (this.AEQbTJ.size() == 0) {
            return -1L;
        }
        return this.AEQbTJ.get(0).AhwBna();
    }

    public DataSource(String str) {
        super(str);
        this.AhwBna = "SPOT";
        this.KWHzl = "MARGIN";
        this.djBIcL = "SWAP";
        this.EZpvd = "FUTURES";
        this.AYXKKw = "OPTION";
        this.AEQbTJ = new DataArrayList<>();
        this.OLrzqt = new DataArrayList<>();
        this.DbNXlk = 1;
        this.gEmmrt = false;
        this.valueOf = 0;
        this.isConnected = -1.0d;
    }

    public final int values() {
        if (C36246oUr.copydefault().OxVOHk()) {
            return C36246oUr.copydefault().wlaJM();
        }
        return 0;
    }

    public final void fetchVPNInfo() {
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        if (this.isConnected < AudioStats.AUDIO_AMPLITUDE_NONE) {
            boolean zAuCTelauCTel = c36246oUrCopydefault.AuCTelauCTel();
            this.gEmmrt = zAuCTelauCTel;
            if (zAuCTelauCTel) {
                this.isConnected = c36246oUrCopydefault.getPostValueLengthLimit();
            } else {
                this.isConnected = 1.0d;
            }
            this.valueOf = values();
            return;
        }
        if (this.gEmmrt != c36246oUrCopydefault.AuCTelauCTel() || (this.gEmmrt && this.isConnected != c36246oUrCopydefault.getPostValueLengthLimit())) {
            boolean zAuCTelauCTel2 = c36246oUrCopydefault.AuCTelauCTel();
            this.gEmmrt = zAuCTelauCTel2;
            if (zAuCTelauCTel2) {
                this.isConnected = c36246oUrCopydefault.getPostValueLengthLimit();
            } else {
                this.isConnected = 1.0d;
            }
            for (int i = 0; i < this.AEQbTJ.size(); i++) {
                this.AEQbTJ.get(i).KWHzl(this.isConnected);
            }
            for (oUG oug : c36246oUrCopydefault.iwGUEr().AkhnZx().values()) {
                if (oug instanceof oUK) {
                    AbstractC36262oVg abstractC36262oVgIsConnected = ((oUK) oug).isConnected();
                    if (!abstractC36262oVgIsConnected.AYXKKw().equals("VOLUME")) {
                        abstractC36262oVgIsConnected.fJNWhG();
                    }
                }
            }
            this.DbNXlk = 1;
        }
        if (this.gEmmrt && this.isConnected != c36246oUrCopydefault.getPostValueLengthLimit()) {
            this.isConnected = c36246oUrCopydefault.getPostValueLengthLimit();
            for (int i2 = 0; i2 < this.AEQbTJ.size(); i2++) {
                this.AEQbTJ.get(i2).KWHzl(this.isConnected);
            }
            for (oUG oug2 : c36246oUrCopydefault.iwGUEr().AkhnZx().values()) {
                if (oug2 instanceof oUK) {
                    AbstractC36262oVg abstractC36262oVgIsConnected2 = ((oUK) oug2).isConnected();
                    if (!abstractC36262oVgIsConnected2.AYXKKw().equals("VOLUME")) {
                        abstractC36262oVgIsConnected2.fJNWhG();
                    }
                }
            }
            this.DbNXlk = 1;
        }
        if (this.valueOf != values()) {
            this.valueOf = values();
            for (int i3 = 0; i3 < this.AEQbTJ.size(); i3++) {
                this.AEQbTJ.get(i3).OLrzqt(this.valueOf);
            }
            for (oUG oug3 : c36246oUrCopydefault.iwGUEr().AkhnZx().values()) {
                if (oug3 instanceof oUK) {
                    AbstractC36262oVg abstractC36262oVgIsConnected3 = ((oUK) oug3).isConnected();
                    if (abstractC36262oVgIsConnected3.AYXKKw().equals("VOLUME")) {
                        abstractC36262oVgIsConnected3.fJNWhG();
                    }
                }
            }
            this.DbNXlk = 1;
        }
    }

    public boolean KWHzl(List<? extends oUO> list) {
        long jAhwBna;
        StateListAnimator stateListAnimatorEZpvd;
        String str;
        String str2;
        int i = 0;
        if (list == null || list.isEmpty()) {
            this.DbNXlk = 0;
            return false;
        }
        fetchVPNInfo();
        int size = list.size();
        if (this.AEQbTJ.size() > 0) {
            DataArrayList<StateListAnimator> dataArrayList = this.AEQbTJ;
            StateListAnimator stateListAnimator = dataArrayList.get(dataArrayList.size() - 1);
            oUO ouo = list.get(0);
            if (ouo.valueOf <= AudioStats.AUDIO_AMPLITUDE_NONE) {
                if (ouo.EZpvd < stateListAnimator.AhwBna()) {
                    return false;
                }
                stateListAnimator.fARcdN = ouo.KWHzl;
                DataArrayList<StateListAnimator> dataArrayList2 = this.AEQbTJ;
                dataArrayList2.set(dataArrayList2.size() - 1, stateListAnimator);
                this.DbNXlk = 2;
                return true;
            }
            if (list.get(list.size() - 1).EZpvd < stateListAnimator.AhwBna()) {
                this.DbNXlk = 0;
                return false;
            }
            if (ouo.EZpvd <= stateListAnimator.AhwBna() || ouo.valueOf <= AudioStats.AUDIO_AMPLITUDE_NONE) {
                oUO ouo2 = null;
                int i2 = 0;
                while (i2 < size) {
                    ouo2 = list.get(i2);
                    if (ouo2.EZpvd == stateListAnimator.AhwBna()) {
                        break;
                    }
                    i2++;
                }
                if (i2 >= size) {
                    this.DbNXlk = 0;
                    return false;
                }
                this.DbNXlk = 2;
                String str3 = ouo2.uzCIH;
                if (str3 != null && str3 != "" && (str2 = ouo2.getNewProxyInstance) != null && str2 != "") {
                    DataArrayList<StateListAnimator> dataArrayList3 = this.AEQbTJ;
                    int size2 = dataArrayList3.size();
                    Boolean bool = Boolean.TRUE;
                    dataArrayList3.set(size2 - 1, EZpvd(ouo2, bool, bool));
                } else {
                    DataArrayList<StateListAnimator> dataArrayList4 = this.AEQbTJ;
                    dataArrayList4.set(dataArrayList4.size() - 1, EZpvd(ouo2, Boolean.FALSE, Boolean.TRUE));
                }
                DataArrayList<StateListAnimator> dataArrayList5 = this.AEQbTJ;
                StateListAnimator stateListAnimator2 = dataArrayList5.get(dataArrayList5.size() - 1);
                stateListAnimator2.AuCTel = stateListAnimator.AEQbTJ();
                stateListAnimator2.values = stateListAnimator.KWHzl();
                stateListAnimator2.ejfBZ = stateListAnimator.OLrzqt();
                stateListAnimator2.gHZMYf = stateListAnimator.iwGUEr();
                stateListAnimator2.zLjUOn = stateListAnimator.fIwbmz();
                stateListAnimator2.AubY = stateListAnimator.ejfBZ();
                stateListAnimator2.fetchVPNInfo = stateListAnimator.EZpvd();
                stateListAnimator2.ORxRYg = stateListAnimator.ORxRYg;
                stateListAnimator2.AhwBna = stateListAnimator.AhwBna;
                stateListAnimator2.valueOf = stateListAnimator.valueOf;
                stateListAnimator2.djBIcL = stateListAnimator.djBIcL;
                stateListAnimator2.copydefault = stateListAnimator.copydefault;
                stateListAnimator2.KWHzl = stateListAnimator.KWHzl;
                stateListAnimator2.AEQbTJ = stateListAnimator.AEQbTJ;
                stateListAnimator2.isConnected = stateListAnimator.isConnected;
                stateListAnimator2.AkhnZx = stateListAnimator.AkhnZx;
                stateListAnimator2.DbNXlk = stateListAnimator.DbNXlk;
                stateListAnimator2.QbewEr = stateListAnimator.QbewEr;
                stateListAnimator2.QVAiDq = stateListAnimator.QVAiDq;
                stateListAnimator2.QfsBiF = stateListAnimator.QfsBiF;
                stateListAnimator2.EZpvd = stateListAnimator.EZpvd;
                stateListAnimator2.AYXKKw = stateListAnimator.AYXKKw;
                stateListAnimator2.gEmmrt = stateListAnimator.gEmmrt;
                stateListAnimator2.QKVWgx = stateListAnimator.fARcdN();
                stateListAnimator2.OcIXYQ = stateListAnimator.fJNWhG();
                stateListAnimator2.DTwDnp = stateListAnimator.hDKMBd();
                stateListAnimator2.OLrzqt = stateListAnimator.OLrzqt;
                if (C36246oUr.copydefault().dHguZz()) {
                    EZpvd(stateListAnimator2, stateListAnimator.iwGUEr, stateListAnimator2.copydefault());
                }
                DataArrayList<StateListAnimator> dataArrayList6 = this.AEQbTJ;
                dataArrayList6.set(dataArrayList6.size() - 1, stateListAnimator2);
                i = i2 + 1;
                if (i < size) {
                    this.DbNXlk = 3;
                }
            } else {
                this.DbNXlk = 3;
            }
        } else {
            this.DbNXlk = 1;
        }
        if (this.DbNXlk != 3 || this.AEQbTJ.isEmpty()) {
            jAhwBna = Long.MIN_VALUE;
        } else {
            DataArrayList<StateListAnimator> dataArrayList7 = this.AEQbTJ;
            jAhwBna = dataArrayList7.get(dataArrayList7.size() - 1).AhwBna();
        }
        while (i < size) {
            oUO ouo3 = list.get(i);
            long j = ouo3.EZpvd;
            if (j > jAhwBna) {
                String str4 = ouo3.uzCIH;
                if (str4 != null && str4 != "" && (str = ouo3.getNewProxyInstance) != null && str != "") {
                    stateListAnimatorEZpvd = EZpvd(ouo3, Boolean.TRUE, Boolean.FALSE);
                    stateListAnimatorEZpvd.AuCTel = ouo3.fetchVPNInfo;
                    stateListAnimatorEZpvd.values = ouo3.DbNXlk;
                    stateListAnimatorEZpvd.gHZMYf = ouo3.zsXlph;
                    stateListAnimatorEZpvd.zLjUOn = ouo3.AubY;
                    stateListAnimatorEZpvd.AubY = ouo3.AuCTelauCTel;
                    stateListAnimatorEZpvd.ejfBZ = ouo3.isConnected;
                    stateListAnimatorEZpvd.fetchVPNInfo = ouo3.AYXKKw;
                    if (C36246oUr.copydefault().dHguZz()) {
                        EZpvd(stateListAnimatorEZpvd, stateListAnimatorEZpvd.iwGUEr, stateListAnimatorEZpvd.fARcdN);
                    }
                } else {
                    Boolean bool2 = Boolean.FALSE;
                    stateListAnimatorEZpvd = EZpvd(ouo3, bool2, bool2);
                    stateListAnimatorEZpvd.AuCTel = ouo3.fetchVPNInfo;
                    stateListAnimatorEZpvd.values = ouo3.DbNXlk;
                    stateListAnimatorEZpvd.gHZMYf = ouo3.zsXlph;
                    stateListAnimatorEZpvd.zLjUOn = ouo3.AubY;
                }
                this.AEQbTJ.add(stateListAnimatorEZpvd);
                if (this.DbNXlk == 3 && C36246oUr.copydefault().ODWQjV() > 0) {
                    pUU.KWHzl("ChartView", "新增的蜡烛 date = " + stateListAnimatorEZpvd.AhwBna());
                }
                jAhwBna = j;
            }
            i++;
        }
        return true;
    }

    public final void EZpvd(StateListAnimator stateListAnimator, String str, double d) {
        stateListAnimator.OLrzqt.put(str, Double.valueOf(d));
    }

    public final StateListAnimator EZpvd(oUO ouo, Boolean bool, Boolean bool2) {
        if (C36246oUr.copydefault().getFieldNames() == "kline_dex_market_time_preference" && this.AEQbTJ.size() > 0) {
            if (bool2.booleanValue()) {
                return EZpvd(ouo, this.AEQbTJ.get(r5.size() - 1).wlaJM, bool);
            }
            return EZpvd(ouo, this.AEQbTJ.get(r5.size() - 1).hDKMBd, bool);
        }
        return EZpvd(ouo, ouo.valueOf, bool);
    }

    public final StateListAnimator EZpvd(oUO ouo, double d, Boolean bool) {
        double dMax = ouo.copydefault;
        double dMin = ouo.OLrzqt;
        if (C36246oUr.copydefault().getFieldNames() == "kline_dex_market_time_preference") {
            dMax = Math.max(Math.max(d, ouo.copydefault), Math.max(ouo.OLrzqt, ouo.KWHzl));
            dMin = Math.min(Math.min(d, ouo.copydefault), Math.min(ouo.OLrzqt, ouo.KWHzl));
        }
        double d2 = dMax;
        double d3 = dMin;
        if (bool.booleanValue()) {
            return new StateListAnimator(ouo.uzCIH, ouo.getNewProxyInstance, ouo.EZpvd, d, d2, d3, ouo.KWHzl, ouo.djBIcL, ouo.AhwBna, ouo.gEmmrt, this.isConnected, this.valueOf, ouo.getFieldNames);
        }
        return new StateListAnimator(ouo.EZpvd, d, d2, d3, ouo.KWHzl, ouo.djBIcL, ouo.AhwBna, ouo.gEmmrt, this.isConnected, this.valueOf);
    }

    public void KWHzl() {
        this.AEQbTJ.clear();
        this.DbNXlk = 1;
        AhwBna();
    }

    public final void AhwBna() {
        C36246oUr.copydefault().zLjUOn().setFastKLineMode(false);
        C36246oUr.copydefault().zLjUOn().setFastKLineIndex(-1);
    }

    public void AEQbTJ(List<? extends oUO> list, String str) {
        if (this.AEQbTJ.isEmpty()) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (i < list.size() && i2 < this.AEQbTJ.size()) {
            if (list.get(i).EZpvd == this.AEQbTJ.get(i2).AhwBna()) {
                OLrzqt(list, i2, i, str);
                i2++;
            } else if (list.get(i).EZpvd > this.AEQbTJ.get(i2).AhwBna()) {
                i2++;
            }
            i++;
        }
    }

    public final void OLrzqt(List<? extends oUO> list, int i, int i2, String str) {
        this.AEQbTJ.get(i).OLrzqt.put(str, Double.valueOf(list.get(i2).KWHzl));
    }

    public void EZpvd(List<? extends oUO> list) {
        int i;
        int i2;
        DataSource dataSource;
        String str;
        DataSource dataSource2 = this;
        fetchVPNInfo();
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            oUO ouo = list.get(i3);
            String str2 = ouo.uzCIH;
            if (str2 != null && str2 != "" && (str = ouo.getNewProxyInstance) != null && str != "") {
                i = size;
                i2 = i3;
                StateListAnimator stateListAnimator = new StateListAnimator(str2, str, ouo.EZpvd, ouo.valueOf, ouo.copydefault, ouo.OLrzqt, ouo.KWHzl, ouo.djBIcL, ouo.AhwBna, ouo.gEmmrt, dataSource2.isConnected, dataSource2.valueOf, ouo.getFieldNames);
                stateListAnimator.AuCTel = ouo.fetchVPNInfo;
                stateListAnimator.values = ouo.DbNXlk;
                stateListAnimator.gHZMYf = ouo.zsXlph;
                stateListAnimator.zLjUOn = ouo.AubY;
                stateListAnimator.AubY = ouo.AuCTelauCTel;
                stateListAnimator.ejfBZ = ouo.isConnected;
                stateListAnimator.fetchVPNInfo = ouo.AYXKKw;
                this.AEQbTJ.add(0, stateListAnimator);
                if (C36246oUr.copydefault().dHguZz()) {
                    EZpvd(stateListAnimator, stateListAnimator.iwGUEr, stateListAnimator.fARcdN);
                }
                dataSource = this;
            } else {
                i = size;
                i2 = i3;
                StateListAnimator stateListAnimator2 = new StateListAnimator(ouo.EZpvd, ouo.valueOf, ouo.copydefault, ouo.OLrzqt, ouo.KWHzl, ouo.djBIcL, ouo.AhwBna, ouo.gEmmrt, this.isConnected, this.valueOf);
                stateListAnimator2.AuCTel = ouo.fetchVPNInfo;
                stateListAnimator2.values = ouo.DbNXlk;
                stateListAnimator2.gHZMYf = ouo.zsXlph;
                stateListAnimator2.zLjUOn = ouo.AubY;
                dataSource = this;
                dataSource.AEQbTJ.add(0, stateListAnimator2);
            }
            i3 = i2 + 1;
            dataSource2 = dataSource;
            size = i;
        }
        dataSource2.DbNXlk = 1;
    }

    public void AEQbTJ(List<? extends oUO> list) {
        int i;
        DataSource dataSource;
        String str;
        DataSource dataSource2 = this;
        int i2 = 1;
        int size = list.size() - 1;
        while (size >= 0) {
            oUO ouo = list.get(size);
            String str2 = ouo.uzCIH;
            if (str2 != null && str2 != "" && (str = ouo.getNewProxyInstance) != null && str != "") {
                i = size;
                StateListAnimator stateListAnimator = new StateListAnimator(str2, str, ouo.EZpvd, ouo.valueOf, ouo.copydefault, ouo.OLrzqt, ouo.KWHzl, ouo.djBIcL, ouo.AhwBna, ouo.gEmmrt, this.isConnected, this.valueOf, ouo.getFieldNames);
                stateListAnimator.AuCTel = ouo.fetchVPNInfo;
                stateListAnimator.values = ouo.DbNXlk;
                stateListAnimator.gHZMYf = ouo.zsXlph;
                stateListAnimator.zLjUOn = ouo.AubY;
                stateListAnimator.AubY = ouo.AuCTelauCTel;
                stateListAnimator.ejfBZ = ouo.isConnected;
                stateListAnimator.fetchVPNInfo = ouo.AYXKKw;
                this.AEQbTJ.add(stateListAnimator);
                dataSource = this;
            } else {
                i = size;
                StateListAnimator stateListAnimator2 = new StateListAnimator(ouo.EZpvd, ouo.valueOf, ouo.copydefault, ouo.OLrzqt, ouo.KWHzl, ouo.djBIcL, ouo.AhwBna, ouo.gEmmrt, this.isConnected, this.valueOf);
                stateListAnimator2.AuCTel = ouo.fetchVPNInfo;
                stateListAnimator2.values = ouo.DbNXlk;
                stateListAnimator2.gHZMYf = ouo.zsXlph;
                stateListAnimator2.zLjUOn = ouo.AubY;
                dataSource = this;
                dataSource.AEQbTJ.add(stateListAnimator2);
            }
            size = i - 1;
            dataSource2 = dataSource;
            i2 = 1;
        }
        dataSource2.DbNXlk = i2;
    }

    public void OLrzqt(List<oUF> list, String str) {
        if (this.AEQbTJ.size() > 0) {
            int size = this.AEQbTJ.size() - 1;
            int i = 0;
            boolean z = false;
            while (i < list.size() && size >= 0) {
                if (Long.valueOf(list.get(i).fIwbmz()).longValue() == this.AEQbTJ.get(size).AhwBna()) {
                    KWHzl(list, size, i, str);
                    size--;
                    i++;
                    if (!z) {
                        pUU.KWHzl("ChartView", "convertData----组装蜡烛图和买卖点位数据");
                        z = true;
                    }
                } else if (Long.valueOf(list.get(i).fIwbmz()).longValue() < this.AEQbTJ.get(size).AhwBna()) {
                    size--;
                } else {
                    i++;
                }
            }
        }
    }

    public void EZpvd(List<HistoryOrderData> list, Boolean bool) {
        if (this.AEQbTJ.size() > 0) {
            int size = this.AEQbTJ.size() - 1;
            int i = 0;
            if (bool.booleanValue()) {
                for (int i2 = 0; i2 < this.AEQbTJ.size(); i2++) {
                    EZpvd(i2);
                }
            }
            boolean z = false;
            while (i < list.size() && size >= 0) {
                if (Long.valueOf(list.get(i).getTime()).longValue() == this.AEQbTJ.get(size).AhwBna()) {
                    KWHzl(list, size, i);
                    size--;
                    i++;
                    if (!z) {
                        pUU.KWHzl("ChartView", "convertData----组装蜡烛图和买卖点位数据");
                        z = true;
                    }
                } else if (Long.valueOf(list.get(i).getTime()).longValue() < this.AEQbTJ.get(size).AhwBna()) {
                    if (bool.booleanValue()) {
                        EZpvd(size);
                    }
                    size--;
                } else {
                    i++;
                    if (bool.booleanValue()) {
                        EZpvd(size);
                    }
                }
            }
        }
    }

    public final void EZpvd(int i) {
        StateListAnimator stateListAnimator = this.AEQbTJ.get(i);
        stateListAnimator.AuCTel = "";
        stateListAnimator.values = "";
        stateListAnimator.ejfBZ = "";
        stateListAnimator.gHZMYf = "";
        stateListAnimator.zLjUOn = "";
        stateListAnimator.AubY = "";
        stateListAnimator.fetchVPNInfo = "";
        stateListAnimator.OcIXYQ = "";
        stateListAnimator.QKVWgx = "";
        stateListAnimator.DTwDnp = null;
    }

    public final void KWHzl(List<HistoryOrderData> list, int i, int i2) {
        String buyCount;
        String sellCount;
        StateListAnimator stateListAnimator = this.AEQbTJ.get(i);
        HistoryOrderData historyOrderData = list.get(i2);
        stateListAnimator.AuCTel = historyOrderData.getBuyPrice();
        stateListAnimator.values = historyOrderData.getBuyCount();
        stateListAnimator.ejfBZ = historyOrderData.getBuyCountTitle();
        stateListAnimator.gHZMYf = historyOrderData.getSellPrice();
        stateListAnimator.zLjUOn = historyOrderData.getSellCount();
        stateListAnimator.AubY = historyOrderData.getSellCountTitle();
        stateListAnimator.fetchVPNInfo = AEQbTJ(i);
        stateListAnimator.DTwDnp = AEQbTJ(historyOrderData);
        if (historyOrderData.getShowBuyPrefix()) {
            buyCount = Marker.ANY_NON_NULL_MARKER + historyOrderData.getBuyCount();
        } else {
            buyCount = historyOrderData.getBuyCount();
        }
        stateListAnimator.OcIXYQ = buyCount;
        if (historyOrderData.getShowSellPrefix()) {
            sellCount = "-" + historyOrderData.getSellCount();
        } else {
            sellCount = historyOrderData.getSellCount();
        }
        stateListAnimator.QKVWgx = sellCount;
    }

    public final VectorDrawable AEQbTJ(HistoryOrderData historyOrderData) {
        Drawable drawableKWHzl = historyOrderData.getTagIconDrawableId() != null ? C33070mpX.KWHzl(historyOrderData.getTagIconDrawableId().intValue()) : null;
        if (drawableKWHzl != null && historyOrderData.getIconTintColor() != null) {
            drawableKWHzl.setTint(historyOrderData.getIconTintColor().intValue());
        }
        if (drawableKWHzl != null) {
            return (VectorDrawable) drawableKWHzl;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(List<oUF> list, int i, int i2, String str) {
        byte b;
        str.hashCode();
        switch (str.hashCode()) {
            case -2040464843:
                b = !str.equals("LSAcco") ? (byte) -1 : (byte) 0;
                break;
            case 2522:
                if (str.equals("OI")) {
                    b = 1;
                    break;
                }
                break;
            case 63511234:
                if (str.equals("BSVol")) {
                    b = 2;
                    break;
                }
                break;
            case 72740685:
                if (str.equals("LSPos")) {
                    b = 3;
                    break;
                }
                break;
            case 1185755844:
                if (str.equals("LSRatio")) {
                    b = 4;
                    break;
                }
                break;
        }
        if (b == 0) {
            this.AEQbTJ.get(i).AhwBna = list.get(i2).valueOf();
            this.AEQbTJ.get(i).valueOf = list.get(i2).djBIcL();
            this.AEQbTJ.get(i).djBIcL = list.get(i2).gEmmrt();
            this.AEQbTJ.get(i).AYXKKw = list.get(i2).OLrzqt();
            return;
        }
        if (b == 1) {
            this.AEQbTJ.get(i).ORxRYg = list.get(i2).AkhnZx();
            return;
        }
        if (b == 2) {
            this.AEQbTJ.get(i).QbewEr = list.get(i2).values();
            this.AEQbTJ.get(i).QVAiDq = list.get(i2).fetchVPNInfo();
            this.AEQbTJ.get(i).QfsBiF = list.get(i2).AuCTel();
            return;
        }
        if (b == 3) {
            this.AEQbTJ.get(i).copydefault = list.get(i2).AEQbTJ();
            this.AEQbTJ.get(i).KWHzl = list.get(i2).KWHzl();
            this.AEQbTJ.get(i).AEQbTJ = list.get(i2).EZpvd();
            this.AEQbTJ.get(i).EZpvd = list.get(i2).copydefault();
            return;
        }
        if (b != 4) {
            return;
        }
        this.AEQbTJ.get(i).isConnected = list.get(i2).isConnected();
        this.AEQbTJ.get(i).AkhnZx = list.get(i2).DbNXlk();
        this.AEQbTJ.get(i).DbNXlk = list.get(i2).AYXKKw();
        this.AEQbTJ.get(i).gEmmrt = list.get(i2).AhwBna();
    }

    public final String AEQbTJ(int i) {
        int iIntValue = !this.AEQbTJ.get(i).values.isEmpty() ? Integer.valueOf(this.AEQbTJ.get(i).values).intValue() : 0;
        int iIntValue2 = this.AEQbTJ.get(i).zLjUOn.isEmpty() ? 0 : Integer.valueOf(this.AEQbTJ.get(i).zLjUOn).intValue();
        HashMap map = new HashMap();
        map.put("num", "" + (iIntValue + iIntValue2));
        return C33069mpW.KWHzl(C43246rlf.OLrzqt.valueOf(), C32392mcI.Dialog.zLjUOn, map);
    }

    public double AkhnZx() {
        if (this.AEQbTJ.size() == 0) {
            return -1.0d;
        }
        return this.AEQbTJ.get(r0.size() - 1).copydefault();
    }
}
