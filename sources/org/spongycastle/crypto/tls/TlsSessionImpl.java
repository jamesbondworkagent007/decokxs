package org.spongycastle.crypto.tls;

import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes25.dex */
class TlsSessionImpl implements TlsSession {
    final byte[] sessionID;
    SessionParameters sessionParameters;

    public TlsSessionImpl(byte[] bArr, SessionParameters sessionParameters) {
        if (bArr == null) {
            throw new IllegalArgumentException("'sessionID' cannot be null");
        }
        if (bArr.length < 1 || bArr.length > 32) {
            throw new IllegalArgumentException("'sessionID' must have length between 1 and 32 bytes, inclusive");
        }
        this.sessionID = Arrays.clone(bArr);
        this.sessionParameters = sessionParameters;
    }

    @Override // org.spongycastle.crypto.tls.TlsSession
    public SessionParameters exportSessionParameters() {
        SessionParameters sessionParametersCopy;
        synchronized (this) {
            SessionParameters sessionParameters = this.sessionParameters;
            sessionParametersCopy = sessionParameters == null ? null : sessionParameters.copy();
        }
        return sessionParametersCopy;
    }

    @Override // org.spongycastle.crypto.tls.TlsSession
    public byte[] getSessionID() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.sessionID;
        }
        return bArr;
    }

    @Override // org.spongycastle.crypto.tls.TlsSession
    public void invalidate() {
        synchronized (this) {
            SessionParameters sessionParameters = this.sessionParameters;
            if (sessionParameters != null) {
                sessionParameters.clear();
                this.sessionParameters = null;
            }
        }
    }

    @Override // org.spongycastle.crypto.tls.TlsSession
    public boolean isResumable() {
        boolean z;
        synchronized (this) {
            z = this.sessionParameters != null;
        }
        return z;
    }
}
