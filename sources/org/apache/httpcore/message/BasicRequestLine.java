package org.apache.httpcore.message;

import java.io.Serializable;
import o.C59817zoG;
import o.C59825zoO;
import o.InterfaceC59814zoD;
import org.apache.httpcore.ProtocolVersion;
import org.apache.httpcore.util.CharArrayBuffer;

/* JADX INFO: loaded from: classes24.dex */
public class BasicRequestLine implements InterfaceC59814zoD, Cloneable, Serializable {
    private static final long serialVersionUID = 2810581718468737193L;
    private final String method;
    private final ProtocolVersion protoversion;
    private final String uri;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59814zoD
    public String getMethod() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59814zoD
    public ProtocolVersion getProtocolVersion() {
        return this.protoversion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59814zoD
    public String getUri() {
        return this.uri;
    }

    public BasicRequestLine(String str, String str2, ProtocolVersion protocolVersion) {
        this.method = (String) C59825zoO.copydefault(str, "Method");
        this.uri = (String) C59825zoO.copydefault(str2, "URI");
        this.protoversion = (ProtocolVersion) C59825zoO.copydefault(protocolVersion, "Version");
    }

    public String toString() {
        return C59817zoG.copydefault.copydefault((CharArrayBuffer) null, this).toString();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
