package org.apache.http.auth;

import java.io.Serializable;
import java.security.Principal;
import o.InterfaceC59597zjz;
import org.ietf.jgss.GSSCredential;

/* JADX INFO: loaded from: classes13.dex */
public class KerberosCredentials implements InterfaceC59597zjz, Serializable {
    private static final long serialVersionUID = 487421613855550713L;
    private final GSSCredential gssCredential;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GSSCredential getGSSCredential() {
        return this.gssCredential;
    }

    @Override // o.InterfaceC59597zjz
    public String getPassword() {
        return null;
    }

    @Override // o.InterfaceC59597zjz
    public Principal getUserPrincipal() {
        return null;
    }

    public KerberosCredentials(GSSCredential gSSCredential) {
        this.gssCredential = gSSCredential;
    }
}
