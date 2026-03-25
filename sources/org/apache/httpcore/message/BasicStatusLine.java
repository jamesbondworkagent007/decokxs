package org.apache.httpcore.message;

import java.io.Serializable;
import o.C59817zoG;
import o.C59825zoO;
import o.InterfaceC59811zoA;
import org.apache.httpcore.ProtocolVersion;

/* JADX INFO: loaded from: classes24.dex */
public class BasicStatusLine implements InterfaceC59811zoA, Cloneable, Serializable {
    private static final long serialVersionUID = -2443303766890459269L;
    private final ProtocolVersion protoVersion;
    private final String reasonPhrase;
    private final int statusCode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59811zoA
    public ProtocolVersion getProtocolVersion() {
        return this.protoVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59811zoA
    public String getReasonPhrase() {
        return this.reasonPhrase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59811zoA
    public int getStatusCode() {
        return this.statusCode;
    }

    public BasicStatusLine(ProtocolVersion protocolVersion, int i, String str) {
        this.protoVersion = (ProtocolVersion) C59825zoO.copydefault(protocolVersion, "Version");
        this.statusCode = C59825zoO.AEQbTJ(i, "Status code");
        this.reasonPhrase = str;
    }

    public String toString() {
        return C59817zoG.copydefault.AEQbTJ(null, this).toString();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
