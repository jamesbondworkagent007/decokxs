package o;

import com.huawei.hms.framework.common.ContainerUtils;

/* JADX INFO: renamed from: o.znE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59762znE implements InterfaceC59517ziY, java.lang.Cloneable {
    public final InterfaceC59582zjk[] KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59517ziY
    public java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59517ziY
    public java.lang.String copydefault() {
        return this.OLrzqt;
    }

    public C59762znE(java.lang.String str, java.lang.String str2, InterfaceC59582zjk[] interfaceC59582zjkArr) {
        this.OLrzqt = (java.lang.String) C59851zoo.AEQbTJ(str, "Name");
        this.copydefault = str2;
        if (interfaceC59582zjkArr != null) {
            this.KWHzl = interfaceC59582zjkArr;
        } else {
            this.KWHzl = new InterfaceC59582zjk[0];
        }
    }

    public C59762znE(java.lang.String str, java.lang.String str2) {
        this(str, str2, null);
    }

    @Override // o.InterfaceC59517ziY
    public InterfaceC59582zjk[] AEQbTJ() {
        return (InterfaceC59582zjk[]) this.KWHzl.clone();
    }

    @Override // o.InterfaceC59517ziY
    public int OLrzqt() {
        return this.KWHzl.length;
    }

    @Override // o.InterfaceC59517ziY
    public InterfaceC59582zjk KWHzl(int i) {
        return this.KWHzl[i];
    }

    @Override // o.InterfaceC59517ziY
    public InterfaceC59582zjk copydefault(java.lang.String str) {
        C59851zoo.AEQbTJ(str, "Name");
        for (InterfaceC59582zjk interfaceC59582zjk : this.KWHzl) {
            if (interfaceC59582zjk.getName().equalsIgnoreCase(str)) {
                return interfaceC59582zjk;
            }
        }
        return null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC59517ziY)) {
            return false;
        }
        C59762znE c59762znE = (C59762znE) obj;
        return this.OLrzqt.equals(c59762znE.OLrzqt) && C59852zop.OLrzqt(this.copydefault, c59762znE.copydefault) && C59852zop.AEQbTJ(this.KWHzl, c59762znE.KWHzl);
    }

    public int hashCode() {
        int iEZpvd = C59852zop.EZpvd(C59852zop.EZpvd(17, this.OLrzqt), this.copydefault);
        for (InterfaceC59582zjk interfaceC59582zjk : this.KWHzl) {
            iEZpvd = C59852zop.EZpvd(iEZpvd, interfaceC59582zjk);
        }
        return iEZpvd;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.OLrzqt);
        if (this.copydefault != null) {
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(this.copydefault);
        }
        for (InterfaceC59582zjk interfaceC59582zjk : this.KWHzl) {
            sb.append("; ");
            sb.append(interfaceC59582zjk);
        }
        return sb.toString();
    }

    public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return super.clone();
    }
}
