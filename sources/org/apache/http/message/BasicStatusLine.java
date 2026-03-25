package org.apache.http.message;

import java.io.Serializable;
import o.C59766znI;
import o.C59851zoo;
import o.InterfaceC59587zjp;
import org.apache.http.ProtocolVersion;

/* JADX INFO: loaded from: classes13.dex */
public class BasicStatusLine implements InterfaceC59587zjp, Cloneable, Serializable {
    private static final long serialVersionUID = -2443303766890459269L;
    private final ProtocolVersion protoVersion;
    private final String reasonPhrase;
    private final int statusCode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59587zjp
    public ProtocolVersion getProtocolVersion() {
        return this.protoVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59587zjp
    public String getReasonPhrase() {
        return this.reasonPhrase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59587zjp
    public int getStatusCode() {
        return this.statusCode;
    }

    public BasicStatusLine(ProtocolVersion protocolVersion, int i, String str) {
        this.protoVersion = (ProtocolVersion) C59851zoo.AEQbTJ(protocolVersion, "Version");
        this.statusCode = C59851zoo.KWHzl(i, "Status code");
        this.reasonPhrase = str;
    }

    public String toString() {
        return C59766znI.copydefault.OLrzqt(null, this).toString();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
