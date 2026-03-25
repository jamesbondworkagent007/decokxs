package com.geetest.gtc4;

import java.security.PrivilegedAction;
import java.security.Security;

/* JADX INFO: loaded from: classes21.dex */
public final class n6 implements PrivilegedAction {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.security.PrivilegedAction
    public final Object run() {
        return Security.getProperty("com.geetest.gtc4.asn1.allow_unsafe_integer");
    }
}
