package o;

import java.net.MalformedURLException;
import java.security.MessageDigest;

/* JADX INFO: renamed from: o.Pk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5378Pk implements NH {
    public java.net.URL AYXKKw;
    public final java.lang.String AhwBna;
    public java.lang.String EZpvd;
    public final InterfaceC5382Po KWHzl;
    public volatile byte[] OLrzqt;
    public int copydefault;
    public final java.net.URL gEmmrt;

    public C5378Pk(java.net.URL url) {
        this(url, InterfaceC5382Po.KWHzl);
    }

    public C5378Pk(java.lang.String str) {
        this(str, InterfaceC5382Po.KWHzl);
    }

    public C5378Pk(java.net.URL url, InterfaceC5382Po interfaceC5382Po) {
        this.gEmmrt = (java.net.URL) SE.OLrzqt(url);
        this.AhwBna = null;
        this.KWHzl = (InterfaceC5382Po) SE.OLrzqt(interfaceC5382Po);
    }

    public C5378Pk(java.lang.String str, InterfaceC5382Po interfaceC5382Po) {
        this.gEmmrt = null;
        this.AhwBna = SE.KWHzl(str);
        this.KWHzl = (InterfaceC5382Po) SE.OLrzqt(interfaceC5382Po);
    }

    public java.net.URL valueOf() throws MalformedURLException {
        return AEQbTJ();
    }

    public final java.net.URL AEQbTJ() throws MalformedURLException {
        if (this.AYXKKw == null) {
            this.AYXKKw = new java.net.URL(OLrzqt());
        }
        return this.AYXKKw;
    }

    public java.lang.String AhwBna() {
        return OLrzqt();
    }

    public final java.lang.String OLrzqt() {
        if (android.text.TextUtils.isEmpty(this.EZpvd)) {
            java.lang.String string = this.AhwBna;
            if (android.text.TextUtils.isEmpty(string)) {
                string = ((java.net.URL) SE.OLrzqt(this.gEmmrt)).toString();
            }
            this.EZpvd = android.net.Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.EZpvd;
    }

    public java.util.Map<java.lang.String, java.lang.String> copydefault() {
        return this.KWHzl.KWHzl();
    }

    public java.lang.String EZpvd() {
        java.lang.String str = this.AhwBna;
        return str != null ? str : ((java.net.URL) SE.OLrzqt(this.gEmmrt)).toString();
    }

    public java.lang.String toString() {
        return EZpvd();
    }

    @Override // o.NH
    public void AEQbTJ(@androidx.annotation.NonNull MessageDigest messageDigest) {
        messageDigest.update(KWHzl());
    }

    public final byte[] KWHzl() {
        if (this.OLrzqt == null) {
            this.OLrzqt = EZpvd().getBytes(NH.AEQbTJ);
        }
        return this.OLrzqt;
    }

    @Override // o.NH
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C5378Pk) {
            C5378Pk c5378Pk = (C5378Pk) obj;
            if (EZpvd().equals(c5378Pk.EZpvd()) && this.KWHzl.equals(c5378Pk.KWHzl)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.NH
    public int hashCode() {
        if (this.copydefault == 0) {
            int iHashCode = EZpvd().hashCode();
            this.copydefault = iHashCode;
            this.copydefault = (iHashCode * 31) + this.KWHzl.hashCode();
        }
        return this.copydefault;
    }
}
