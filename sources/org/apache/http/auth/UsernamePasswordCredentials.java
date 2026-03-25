package org.apache.http.auth;

import java.io.Serializable;
import java.security.Principal;
import o.C59851zoo;
import o.C59852zop;
import o.InterfaceC59597zjz;

/* JADX INFO: loaded from: classes13.dex */
public class UsernamePasswordCredentials implements InterfaceC59597zjz, Serializable {
    private static final long serialVersionUID = 243343858802739403L;
    private final String password;
    private final BasicUserPrincipal principal;

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

    @Deprecated
    public UsernamePasswordCredentials(String str) {
        C59851zoo.AEQbTJ(str, "Username:password string");
        int iIndexOf = str.indexOf(58);
        if (iIndexOf >= 0) {
            this.principal = new BasicUserPrincipal(str.substring(0, iIndexOf));
            this.password = str.substring(iIndexOf + 1);
        } else {
            this.principal = new BasicUserPrincipal(str);
            this.password = null;
        }
    }

    public UsernamePasswordCredentials(String str, String str2) {
        C59851zoo.AEQbTJ(str, "Username");
        this.principal = new BasicUserPrincipal(str);
        this.password = str2;
    }

    public String getUserName() {
        return this.principal.getName();
    }

    public int hashCode() {
        return this.principal.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UsernamePasswordCredentials) && C59852zop.OLrzqt(this.principal, ((UsernamePasswordCredentials) obj).principal);
    }

    public String toString() {
        return this.principal.toString();
    }
}
