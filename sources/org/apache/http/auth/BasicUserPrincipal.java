package org.apache.http.auth;

import java.io.Serializable;
import java.security.Principal;
import o.C59851zoo;
import o.C59852zop;

/* JADX INFO: loaded from: classes13.dex */
public final class BasicUserPrincipal implements Principal, Serializable {
    private static final long serialVersionUID = -2266305184969850467L;
    private final String username;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.security.Principal
    public String getName() {
        return this.username;
    }

    public BasicUserPrincipal(String str) {
        C59851zoo.AEQbTJ(str, "User name");
        this.username = str;
    }

    @Override // java.security.Principal
    public int hashCode() {
        return C59852zop.EZpvd(17, this.username);
    }

    @Override // java.security.Principal
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BasicUserPrincipal) && C59852zop.OLrzqt(this.username, ((BasicUserPrincipal) obj).username);
    }

    @Override // java.security.Principal
    public String toString() {
        return "[principal: " + this.username + "]";
    }
}
