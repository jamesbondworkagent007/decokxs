package com.geetest.gtc4;

import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes21.dex */
public final class o6 implements PrivilegedAction {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.security.PrivilegedAction
    public final Object run() {
        return System.getProperty("com.geetest.gtc4.asn1.allow_unsafe_integer");
    }
}
