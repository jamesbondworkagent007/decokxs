package o;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.StringTokenizer;
import org.htmlcleaner.OptionalOutput;
import org.htmlcleaner.audit.ErrorType;

/* JADX INFO: renamed from: o.zoZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59836zoZ implements InterfaceC59901zpu {
    public boolean AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public int AkhnZx;
    public boolean AuCTel;
    public boolean AuCTelauCTel;
    public boolean AubY;
    public boolean AwvSrB;
    public java.lang.String AxsJAY;
    public java.lang.String DbNXlk;
    public boolean EZpvd;
    public boolean OLrzqt;
    public boolean copydefault;
    public boolean djBIcL;
    public boolean ejfBZ;
    public OptionalOutput fARcdN;
    public boolean fIwbmz;
    public boolean fJNWhG;
    public java.util.List<InterfaceC59901zpu> fetchVPNInfo;
    public java.util.List<java.lang.String> gHZMYf;
    public OptionalOutput getFieldNames;
    public java.lang.String hDKMBd;
    public boolean isConnected;
    public boolean iwGUEr;
    public boolean sSMYrx;
    public OptionalOutput uzCIH;
    public boolean values;
    public InterfaceC59892zpl wlaJM;
    public boolean zLjUOn;
    public boolean zsXlph;
    public boolean zuBGHE;
    public C59882zpb gEmmrt = new C59882zpb();
    public java.util.Set<InterfaceC59902zpv> getNewProxyInstance = new java.util.HashSet();
    public java.util.Set<InterfaceC59902zpv> KWHzl = new java.util.HashSet();
    public java.lang.String valueOf = com.google.android.exoplayer2.C.UTF8_NAME;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC59892zpl AYXKKw() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AkhnZx() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean DbNXlk() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59882zpb EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(boolean z) {
        this.isConnected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.Set<InterfaceC59902zpv> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String OLrzqt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(InterfaceC59892zpl interfaceC59892zpl) {
        this.wlaJM = interfaceC59892zpl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int copydefault() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(boolean z) {
        this.AuCTelauCTel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.Set<InterfaceC59902zpv> djBIcL() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void djBIcL(boolean z) {
        this.zLjUOn = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean ejfBZ() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fARcdN() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fIwbmz() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fJNWhG() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fetchVPNInfo() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void gEmmrt(boolean z) {
        this.sSMYrx = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean gEmmrt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean getNewProxyInstance() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isConnected() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean iwGUEr() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void valueOf(boolean z) {
        this.zsXlph = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean valueOf() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean values() {
        return this.ejfBZ;
    }

    public C59836zoZ() {
        uzCIH();
    }

    public void OLrzqt(java.lang.String str) {
        java.util.List<java.lang.String> listAsList;
        if (str != null) {
            this.AxsJAY = str;
            listAsList = java.util.Arrays.asList(str.toLowerCase().split(","));
        } else {
            this.AxsJAY = "";
            listAsList = null;
        }
        this.gHZMYf = listAsList;
    }

    public boolean AEQbTJ(java.lang.String str) {
        java.util.List<java.lang.String> list = this.gHZMYf;
        if (list == null || str == null) {
            return false;
        }
        return list.contains(str.toLowerCase());
    }

    public void AEQbTJ(boolean z) {
        this.uzCIH = z ? OptionalOutput.omit : OptionalOutput.alwaysOutput;
    }

    public void OLrzqt(boolean z) {
        this.fARcdN = z ? OptionalOutput.omit : OptionalOutput.alwaysOutput;
    }

    public boolean AuCTel() {
        return this.getFieldNames == OptionalOutput.omit;
    }

    public void copydefault(java.lang.String str) {
        this.hDKMBd = str;
        getFieldNames();
        copydefault(this.getNewProxyInstance, str);
    }

    public void EZpvd(java.lang.String str) {
        this.AYXKKw = str;
        KWHzl(str);
    }

    public final void KWHzl(java.lang.String str) {
        this.KWHzl.clear();
        copydefault(this.KWHzl, str);
    }

    public final void copydefault(java.util.Set<InterfaceC59902zpv> set, java.lang.String str) {
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
            while (stringTokenizer.hasMoreTokens()) {
                set.add(new C59865zpB(stringTokenizer.nextToken().trim().toLowerCase()));
            }
        }
    }

    public void uzCIH() {
        this.AEQbTJ = true;
        OLrzqt("script,style");
        this.zsXlph = true;
        this.AuCTelauCTel = true;
        this.iwGUEr = false;
        this.AwvSrB = false;
        this.AuCTel = false;
        this.AubY = false;
        this.ejfBZ = false;
        OptionalOutput optionalOutput = OptionalOutput.alwaysOutput;
        this.uzCIH = optionalOutput;
        this.fARcdN = optionalOutput;
        this.getFieldNames = optionalOutput;
        this.sSMYrx = true;
        this.OLrzqt = true;
        this.EZpvd = false;
        this.isConnected = true;
        this.fJNWhG = true;
        this.copydefault = true;
        this.values = true;
        this.DbNXlk = ContainerUtils.KEY_VALUE_DELIMITER;
        copydefault((java.lang.String) null);
        EZpvd((java.lang.String) null);
        this.AhwBna = "self";
        this.valueOf = com.google.android.exoplayer2.C.UTF8_NAME;
        this.gEmmrt.EZpvd();
        getFieldNames();
        if (copydefault() == C59887zpg.OLrzqt) {
            this.wlaJM = C59885zpe.EZpvd;
        } else {
            this.wlaJM = C59886zpf.OLrzqt;
        }
        this.fetchVPNInfo = new java.util.ArrayList();
        this.fIwbmz = false;
        this.zuBGHE = true;
    }

    public final void getFieldNames() {
        this.getNewProxyInstance.clear();
        this.getNewProxyInstance.add(C59903zpw.copydefault);
    }

    @Override // o.InterfaceC59901zpu
    public void AEQbTJ(InterfaceC59902zpv interfaceC59902zpv, C59895zpo c59895zpo) {
        java.util.Iterator<InterfaceC59901zpu> it = this.fetchVPNInfo.iterator();
        while (it.hasNext()) {
            it.next().AEQbTJ(interfaceC59902zpv, c59895zpo);
        }
    }

    @Override // o.InterfaceC59901zpu
    public void OLrzqt(boolean z, C59895zpo c59895zpo, ErrorType errorType) {
        java.util.Iterator<InterfaceC59901zpu> it = this.fetchVPNInfo.iterator();
        while (it.hasNext()) {
            it.next().OLrzqt(z, c59895zpo, errorType);
        }
    }

    @Override // o.InterfaceC59901zpu
    public void EZpvd(boolean z, C59895zpo c59895zpo, ErrorType errorType) {
        java.util.Iterator<InterfaceC59901zpu> it = this.fetchVPNInfo.iterator();
        while (it.hasNext()) {
            it.next().EZpvd(z, c59895zpo, errorType);
        }
    }

    @Override // o.InterfaceC59901zpu
    public void KWHzl(boolean z, C59895zpo c59895zpo, ErrorType errorType) {
        java.util.Iterator<InterfaceC59901zpu> it = this.fetchVPNInfo.iterator();
        while (it.hasNext()) {
            it.next().KWHzl(z, c59895zpo, errorType);
        }
    }
}
