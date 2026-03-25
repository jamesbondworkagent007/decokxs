package org.apache.http.auth;

import java.io.Serializable;
import java.security.Principal;
import java.util.Locale;
import o.C59851zoo;
import o.C59852zop;
import o.InterfaceC59597zjz;

/* JADX INFO: loaded from: classes13.dex */
public class NTCredentials implements InterfaceC59597zjz, Serializable {
    private static final long serialVersionUID = -7385699315228907265L;
    private final String password;
    private final NTUserPrincipal principal;
    private final String workstation;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59597zjz
    public String getPassword() {
        return this.password;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59597zjz
    public Principal getUserPrincipal() {
        return this.principal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getWorkstation() {
        return this.workstation;
    }

    @Deprecated
    public NTCredentials(String str) {
        C59851zoo.AEQbTJ(str, "Username:password string");
        int iIndexOf = str.indexOf(58);
        if (iIndexOf >= 0) {
            String strSubstring = str.substring(0, iIndexOf);
            this.password = str.substring(iIndexOf + 1);
            str = strSubstring;
        } else {
            this.password = null;
        }
        int iIndexOf2 = str.indexOf(47);
        if (iIndexOf2 >= 0) {
            this.principal = new NTUserPrincipal(str.substring(0, iIndexOf2).toUpperCase(Locale.ROOT), str.substring(iIndexOf2 + 1));
        } else {
            this.principal = new NTUserPrincipal(null, str.substring(iIndexOf2 + 1));
        }
        this.workstation = null;
    }

    public NTCredentials(String str, String str2, String str3, String str4) {
        C59851zoo.AEQbTJ(str, "User name");
        this.principal = new NTUserPrincipal(str4, str);
        this.password = str2;
        this.workstation = str3 != null ? str3.toUpperCase(Locale.ROOT) : null;
    }

    public String getUserName() {
        return this.principal.getUsername();
    }

    public String getDomain() {
        return this.principal.getDomain();
    }

    public int hashCode() {
        return C59852zop.EZpvd(C59852zop.EZpvd(17, this.principal), this.workstation);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NTCredentials)) {
            return false;
        }
        NTCredentials nTCredentials = (NTCredentials) obj;
        return C59852zop.OLrzqt(this.principal, nTCredentials.principal) && C59852zop.OLrzqt(this.workstation, nTCredentials.workstation);
    }

    public String toString() {
        return "[principal: " + this.principal + "][workstation: " + this.workstation + "]";
    }
}
