package org.spongycastle.crypto.tls;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes25.dex */
class TlsServerContextImpl extends AbstractTlsContext implements TlsServerContext {
    @Override // org.spongycastle.crypto.tls.TlsContext
    public boolean isServer() {
        return true;
    }

    public TlsServerContextImpl(SecureRandom secureRandom, SecurityParameters securityParameters) {
        super(secureRandom, securityParameters);
    }
}
