package o;

import com.ibm.icu.impl.number.Padder;
import com.ibm.icu.number.NumberFormatter;
import com.ibm.icu.text.PluralRules;
import com.ibm.icu.util.MeasureUnit;
import com.ibm.icu.util.ULocale;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: renamed from: o.aej, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7168aej implements java.lang.Cloneable {
    public InterfaceC7102adW AEQbTJ;
    public C7230afs AYXKKw;
    public MeasureUnit AhwBna;
    public NumberFormatter.SignDisplay AkhnZx;
    public PluralRules DbNXlk;
    public java.lang.Object EZpvd;
    public NumberFormatter.DecimalSeparatorDisplay KWHzl;
    public C7228afq OLrzqt;
    public ULocale copydefault;
    public Padder djBIcL;
    public MeasureUnit ejfBZ;
    public java.lang.String fARcdN;
    public NumberFormatter.UnitWidth fIwbmz;
    public java.lang.Object fetchVPNInfo;
    public RoundingMode gEmmrt;
    public C7235afx isConnected;
    public AbstractC7236afy valueOf;
    public java.lang.Long values;

    public void EZpvd(C7168aej c7168aej) {
        if (this.AYXKKw == null) {
            this.AYXKKw = c7168aej.AYXKKw;
        }
        if (this.ejfBZ == null) {
            this.ejfBZ = c7168aej.ejfBZ;
        }
        if (this.AhwBna == null) {
            this.AhwBna = c7168aej.AhwBna;
        }
        if (this.valueOf == null) {
            this.valueOf = c7168aej.valueOf;
        }
        if (this.gEmmrt == null) {
            this.gEmmrt = c7168aej.gEmmrt;
        }
        if (this.EZpvd == null) {
            this.EZpvd = c7168aej.EZpvd;
        }
        if (this.djBIcL == null) {
            this.djBIcL = c7168aej.djBIcL;
        }
        if (this.OLrzqt == null) {
            this.OLrzqt = c7168aej.OLrzqt;
        }
        if (this.fetchVPNInfo == null) {
            this.fetchVPNInfo = c7168aej.fetchVPNInfo;
        }
        if (this.fIwbmz == null) {
            this.fIwbmz = c7168aej.fIwbmz;
        }
        if (this.AkhnZx == null) {
            this.AkhnZx = c7168aej.AkhnZx;
        }
        if (this.KWHzl == null) {
            this.KWHzl = c7168aej.KWHzl;
        }
        if (this.AEQbTJ == null) {
            this.AEQbTJ = c7168aej.AEQbTJ;
        }
        if (this.isConnected == null) {
            this.isConnected = c7168aej.isConnected;
        }
        if (this.fARcdN == null) {
            this.fARcdN = c7168aej.fARcdN;
        }
        if (this.DbNXlk == null) {
            this.DbNXlk = c7168aej.DbNXlk;
        }
        if (this.copydefault == null) {
            this.copydefault = c7168aej.copydefault;
        }
    }

    public int hashCode() {
        return Objects.hash(this.AYXKKw, this.ejfBZ, this.AhwBna, this.valueOf, this.gEmmrt, this.EZpvd, this.djBIcL, this.OLrzqt, this.fetchVPNInfo, this.fIwbmz, this.AkhnZx, this.KWHzl, this.AEQbTJ, this.isConnected, this.fARcdN, this.DbNXlk, this.copydefault);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7168aej)) {
            return false;
        }
        C7168aej c7168aej = (C7168aej) obj;
        return Objects.equals(this.AYXKKw, c7168aej.AYXKKw) && Objects.equals(this.ejfBZ, c7168aej.ejfBZ) && Objects.equals(this.AhwBna, c7168aej.AhwBna) && Objects.equals(this.valueOf, c7168aej.valueOf) && Objects.equals(this.gEmmrt, c7168aej.gEmmrt) && Objects.equals(this.EZpvd, c7168aej.EZpvd) && Objects.equals(this.djBIcL, c7168aej.djBIcL) && Objects.equals(this.OLrzqt, c7168aej.OLrzqt) && Objects.equals(this.fetchVPNInfo, c7168aej.fetchVPNInfo) && Objects.equals(this.fIwbmz, c7168aej.fIwbmz) && Objects.equals(this.AkhnZx, c7168aej.AkhnZx) && Objects.equals(this.KWHzl, c7168aej.KWHzl) && Objects.equals(this.AEQbTJ, c7168aej.AEQbTJ) && Objects.equals(this.isConnected, c7168aej.isConnected) && Objects.equals(this.fARcdN, c7168aej.fARcdN) && Objects.equals(this.DbNXlk, c7168aej.DbNXlk) && Objects.equals(this.copydefault, c7168aej.copydefault);
    }

    public java.lang.Object clone() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.AssertionError(e);
        }
    }
}
