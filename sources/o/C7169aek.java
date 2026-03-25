package o;

import com.ibm.icu.impl.number.Modifier;
import com.ibm.icu.impl.number.Padder;
import com.ibm.icu.number.NumberFormatter;
import com.ibm.icu.text.DecimalFormatSymbols;
import com.ibm.icu.util.MeasureUnit;

/* JADX INFO: renamed from: o.aek, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7169aek implements java.lang.Cloneable, InterfaceC7171aem {
    public volatile boolean AEQbTJ;
    public Modifier AYXKKw;
    public Modifier AhwBna;
    public AbstractC7236afy AkhnZx;
    public MeasureUnit DbNXlk;
    public C7228afq EZpvd;
    public final boolean KWHzl;
    public NumberFormatter.DecimalSeparatorDisplay OLrzqt;
    public C7166aeh copydefault;
    public Modifier djBIcL;
    public boolean fJNWhG;
    public Padder fetchVPNInfo;
    public java.util.List<C7254agP> gEmmrt;
    public DecimalFormatSymbols isConnected;
    public java.lang.String valueOf;
    public NumberFormatter.SignDisplay values;

    public C7169aek(boolean z) {
        this.KWHzl = z;
    }

    @Override // o.InterfaceC7171aem
    public C7169aek EZpvd(InterfaceC7163aee interfaceC7163aee) {
        if (this.KWHzl) {
            return (C7169aek) clone();
        }
        if (this.AEQbTJ) {
            throw new java.lang.AssertionError("Cannot re-use a mutable MicroProps in the quantity chain");
        }
        this.AEQbTJ = true;
        return this;
    }

    public java.lang.Object clone() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.AssertionError(e);
        }
    }
}
