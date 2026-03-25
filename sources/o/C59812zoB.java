package o;

import com.huawei.hms.framework.common.ContainerUtils;

/* JADX INFO: renamed from: o.zoB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C59812zoB implements InterfaceC59857zou, java.lang.Cloneable {
    public final java.lang.String AEQbTJ;
    public final java.lang.String KWHzl;
    public final InterfaceC59862zoz[] copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59857zou
    public java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59857zou
    public java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    public C59812zoB(java.lang.String str, java.lang.String str2, InterfaceC59862zoz[] interfaceC59862zozArr) {
        this.AEQbTJ = (java.lang.String) C59825zoO.copydefault(str, "Name");
        this.KWHzl = str2;
        if (interfaceC59862zozArr != null) {
            this.copydefault = interfaceC59862zozArr;
        } else {
            this.copydefault = new InterfaceC59862zoz[0];
        }
    }

    @Override // o.InterfaceC59857zou
    public InterfaceC59862zoz[] OLrzqt() {
        return (InterfaceC59862zoz[]) this.copydefault.clone();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC59857zou)) {
            return false;
        }
        C59812zoB c59812zoB = (C59812zoB) obj;
        return this.AEQbTJ.equals(c59812zoB.AEQbTJ) && C59828zoR.EZpvd(this.KWHzl, c59812zoB.KWHzl) && C59828zoR.OLrzqt(this.copydefault, c59812zoB.copydefault);
    }

    public int hashCode() {
        int iAEQbTJ = C59828zoR.AEQbTJ(C59828zoR.AEQbTJ(17, this.AEQbTJ), this.KWHzl);
        for (InterfaceC59862zoz interfaceC59862zoz : this.copydefault) {
            iAEQbTJ = C59828zoR.AEQbTJ(iAEQbTJ, interfaceC59862zoz);
        }
        return iAEQbTJ;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.AEQbTJ);
        if (this.KWHzl != null) {
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(this.KWHzl);
        }
        for (InterfaceC59862zoz interfaceC59862zoz : this.copydefault) {
            sb.append("; ");
            sb.append(interfaceC59862zoz);
        }
        return sb.toString();
    }

    public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return super.clone();
    }
}
