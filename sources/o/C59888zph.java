package o;

import com.amplifyframework.core.model.ModelIdentifier;

/* JADX INFO: renamed from: o.zph, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59888zph extends AbstractC59830zoT implements InterfaceC59890zpj {
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String djBIcL;
    public java.lang.Integer valueOf = null;
    public java.lang.Boolean AYXKKw = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String OLrzqt() {
        return this.djBIcL;
    }

    public C59888zph(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.KWHzl = str;
        this.OLrzqt = str2 != null ? str2.toUpperCase() : str2;
        this.EZpvd = OLrzqt(str3);
        this.djBIcL = OLrzqt(str4);
        djBIcL();
    }

    public C59888zph(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.KWHzl = str;
        this.OLrzqt = str2 != null ? str2.toUpperCase() : str2;
        this.EZpvd = OLrzqt(str3);
        this.djBIcL = OLrzqt(str5);
        djBIcL();
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        return str != null ? str.replace('>', ' ').replace('<', ' ').replace('&', ' ').replace('\'', ' ').replace('\"', ' ') : str;
    }

    public final void djBIcL() {
        if (!"public".equalsIgnoreCase(this.OLrzqt) && !"system".equalsIgnoreCase(this.OLrzqt) && "html".equalsIgnoreCase(this.KWHzl) && this.OLrzqt == null) {
            this.valueOf = 60;
            this.AYXKKw = java.lang.Boolean.TRUE;
        }
        if ("public".equalsIgnoreCase(this.OLrzqt)) {
            if ("-//W3C//DTD HTML 4.0//EN".equals(KWHzl())) {
                this.valueOf = 10;
                this.AYXKKw = ("http://www.w3.org/TR/REC-html40/strict.dtd".equals(this.djBIcL) || "".equals(OLrzqt())) ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
            }
            if ("-//W3C//DTD HTML 4.01//EN".equals(KWHzl())) {
                this.valueOf = 21;
                this.AYXKKw = ("http://www.w3.org/TR/html4/strict.dtd".equals(this.djBIcL) || "".equals(OLrzqt())) ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
            }
            if ("-//W3C//DTD HTML 4.01 Transitional//EN".equals(KWHzl())) {
                this.valueOf = 22;
                this.AYXKKw = "http://www.w3.org/TR/html4/loose.dtd".equals(OLrzqt()) ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
            }
            if ("-//W3C//DTD HTML 4.01 Frameset//EN".equals(KWHzl())) {
                this.valueOf = 23;
                this.AYXKKw = "http://www.w3.org/TR/html4/frameset.dtd".equals(OLrzqt()) ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
            }
            if ("-//W3C//DTD XHTML 1.0 Strict//EN".equals(KWHzl())) {
                this.valueOf = 31;
                this.AYXKKw = "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd".equals(OLrzqt()) ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
            }
            if ("-//W3C//DTD XHTML 1.0 Transitional//EN".equals(KWHzl())) {
                this.valueOf = 32;
                this.AYXKKw = "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd".equals(OLrzqt()) ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
            }
            if ("-//W3C//DTD XHTML 1.0 Frameset//EN".equals(KWHzl())) {
                this.valueOf = 33;
                this.AYXKKw = "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd".equals(OLrzqt()) ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
            }
            if ("-//W3C//DTD XHTML 1.1//EN".equals(KWHzl())) {
                this.valueOf = 40;
                this.AYXKKw = "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd".equals(OLrzqt()) ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
            }
            if ("-//W3C//DTD XHTML Basic 1.1//EN".equals(KWHzl())) {
                this.valueOf = 41;
                this.AYXKKw = "http://www.w3.org/TR/xhtml11/DTD/xhtml-basic11.dtd".equals(OLrzqt()) ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
            }
        }
        if ("system".equalsIgnoreCase(this.OLrzqt) && "about:legacy-compat".equals(KWHzl())) {
            this.valueOf = 61;
            this.AYXKKw = java.lang.Boolean.TRUE;
        }
        if (this.valueOf == null) {
            this.valueOf = 0;
            this.AYXKKw = java.lang.Boolean.FALSE;
        }
    }

    public java.lang.String copydefault() {
        java.lang.String str;
        if (this.valueOf.intValue() != 0) {
            if (this.valueOf.intValue() >= 30) {
                str = "<!DOCTYPE html";
            } else {
                str = "<!DOCTYPE HTML";
            }
        } else {
            str = "<!DOCTYPE " + this.KWHzl;
        }
        if (this.OLrzqt != null) {
            java.lang.String str2 = str + " " + this.OLrzqt + " \"" + this.EZpvd + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR;
            if ("".equals(this.djBIcL)) {
                str = str2;
            } else {
                str = str2 + " \"" + this.djBIcL + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR;
            }
        }
        return str + ">";
    }

    @Override // o.AbstractC59830zoT
    public java.lang.String toString() {
        return copydefault();
    }
}
