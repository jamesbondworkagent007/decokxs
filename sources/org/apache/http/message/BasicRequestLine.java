package org.apache.http.message;

import java.io.Serializable;
import o.C59766znI;
import o.C59851zoo;
import o.InterfaceC59591zjt;
import org.apache.http.ProtocolVersion;
import org.apache.http.util.CharArrayBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class BasicRequestLine implements InterfaceC59591zjt, Cloneable, Serializable {
    private static final long serialVersionUID = 2810581718468737193L;
    private final String method;
    private final ProtocolVersion protoversion;
    private final String uri;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59591zjt
    public String getMethod() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59591zjt
    public ProtocolVersion getProtocolVersion() {
        return this.protoversion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59591zjt
    public String getUri() {
        return this.uri;
    }

    public BasicRequestLine(String str, String str2, ProtocolVersion protocolVersion) {
        this.method = (String) C59851zoo.AEQbTJ(str, "Method");
        this.uri = (String) C59851zoo.AEQbTJ(str2, "URI");
        this.protoversion = (ProtocolVersion) C59851zoo.AEQbTJ(protocolVersion, "Version");
    }

    public String toString() {
        return C59766znI.copydefault.copydefault((CharArrayBuffer) null, this).toString();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
