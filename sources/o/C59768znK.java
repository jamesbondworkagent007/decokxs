package o;

import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.message.BasicRequestLine;

/* JADX INFO: renamed from: o.znK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59768znK extends AbstractC59759znB implements InterfaceC59577zjf {
    public final java.lang.String EZpvd;
    public InterfaceC59591zjt OLrzqt;
    public final java.lang.String copydefault;

    public C59768znK(java.lang.String str, java.lang.String str2, ProtocolVersion protocolVersion) {
        this(new BasicRequestLine(str, str2, protocolVersion));
    }

    public C59768znK(InterfaceC59591zjt interfaceC59591zjt) {
        this.OLrzqt = (InterfaceC59591zjt) C59851zoo.AEQbTJ(interfaceC59591zjt, "Request line");
        this.EZpvd = interfaceC59591zjt.getMethod();
        this.copydefault = interfaceC59591zjt.getUri();
    }

    @Override // o.InterfaceC59581zjj
    public ProtocolVersion getProtocolVersion() {
        return getRequestLine().getProtocolVersion();
    }

    @Override // o.InterfaceC59577zjf
    public InterfaceC59591zjt getRequestLine() {
        if (this.OLrzqt == null) {
            this.OLrzqt = new BasicRequestLine(this.EZpvd, this.copydefault, HttpVersion.HTTP_1_1);
        }
        return this.OLrzqt;
    }

    public java.lang.String toString() {
        return this.EZpvd + ' ' + this.copydefault + ' ' + this.headergroup;
    }
}
