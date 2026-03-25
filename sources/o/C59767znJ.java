package o;

import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.message.BasicStatusLine;

/* JADX INFO: renamed from: o.znJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59767znJ extends AbstractC59759znB implements InterfaceC59584zjm {
    public java.lang.String AEQbTJ;
    public InterfaceC59587zjp AhwBna;
    public int EZpvd;
    public InterfaceC59576zje KWHzl;
    public java.util.Locale OLrzqt;
    public final InterfaceC59586zjo copydefault;
    public ProtocolVersion gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59584zjm
    public InterfaceC59576zje EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59584zjm
    public void OLrzqt(InterfaceC59576zje interfaceC59576zje) {
        this.KWHzl = interfaceC59576zje;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59581zjj
    public ProtocolVersion getProtocolVersion() {
        return this.gEmmrt;
    }

    public C59767znJ(InterfaceC59587zjp interfaceC59587zjp, InterfaceC59586zjo interfaceC59586zjo, java.util.Locale locale) {
        this.AhwBna = (InterfaceC59587zjp) C59851zoo.AEQbTJ(interfaceC59587zjp, "Status line");
        this.gEmmrt = interfaceC59587zjp.getProtocolVersion();
        this.EZpvd = interfaceC59587zjp.getStatusCode();
        this.AEQbTJ = interfaceC59587zjp.getReasonPhrase();
        this.copydefault = interfaceC59586zjo;
        this.OLrzqt = locale;
    }

    public C59767znJ(ProtocolVersion protocolVersion, int i, java.lang.String str) {
        C59851zoo.KWHzl(i, "Status code");
        this.AhwBna = null;
        this.gEmmrt = protocolVersion;
        this.EZpvd = i;
        this.AEQbTJ = str;
        this.copydefault = null;
        this.OLrzqt = null;
    }

    @Override // o.InterfaceC59584zjm
    public InterfaceC59587zjp AEQbTJ() {
        if (this.AhwBna == null) {
            ProtocolVersion protocolVersion = this.gEmmrt;
            if (protocolVersion == null) {
                protocolVersion = HttpVersion.HTTP_1_1;
            }
            int i = this.EZpvd;
            java.lang.String strKWHzl = this.AEQbTJ;
            if (strKWHzl == null) {
                strKWHzl = KWHzl(i);
            }
            this.AhwBna = new BasicStatusLine(protocolVersion, i, strKWHzl);
        }
        return this.AhwBna;
    }

    public java.lang.String KWHzl(int i) {
        InterfaceC59586zjo interfaceC59586zjo = this.copydefault;
        if (interfaceC59586zjo == null) {
            return null;
        }
        java.util.Locale locale = this.OLrzqt;
        if (locale == null) {
            locale = java.util.Locale.getDefault();
        }
        return interfaceC59586zjo.EZpvd(i, locale);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(AEQbTJ());
        sb.append(' ');
        sb.append(this.headergroup);
        if (this.KWHzl != null) {
            sb.append(' ');
            sb.append(this.KWHzl);
        }
        return sb.toString();
    }
}
