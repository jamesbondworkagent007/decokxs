package org.apache.http.auth;

import java.io.Serializable;
import java.security.Principal;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C59851zoo;
import o.C59852zop;

/* JADX INFO: loaded from: classes13.dex */
public class NTUserPrincipal implements Principal, Serializable {
    private static final long serialVersionUID = -6870169797924406894L;
    private final String domain;
    private final String ntname;
    private final String username;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDomain() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.security.Principal
    public String getName() {
        return this.ntname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getUsername() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.security.Principal
    public String toString() {
        return this.ntname;
    }

    public NTUserPrincipal(String str, String str2) {
        C59851zoo.AEQbTJ(str2, "User name");
        this.username = str2;
        this.domain = str != null ? str.toUpperCase(Locale.ROOT) : null;
        String str3 = this.domain;
        if (str3 == null || str3.isEmpty()) {
            this.ntname = str2;
            return;
        }
        this.ntname = this.domain + AbstractJsonLexerKt.STRING_ESC + str2;
    }

    @Override // java.security.Principal
    public int hashCode() {
        return C59852zop.EZpvd(C59852zop.EZpvd(17, this.username), this.domain);
    }

    @Override // java.security.Principal
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NTUserPrincipal)) {
            return false;
        }
        NTUserPrincipal nTUserPrincipal = (NTUserPrincipal) obj;
        return C59852zop.OLrzqt(this.username, nTUserPrincipal.username) && C59852zop.OLrzqt(this.domain, nTUserPrincipal.domain);
    }
}
