package org.spongycastle.crypto.tls;

/* JADX INFO: loaded from: classes25.dex */
public class TlsFatalAlert extends TlsException {
    protected short alertDescription;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public short getAlertDescription() {
        return this.alertDescription;
    }

    public TlsFatalAlert(short s) {
        this(s, null);
    }

    public TlsFatalAlert(short s, Throwable th) {
        super(AlertDescription.getText(s), th);
        this.alertDescription = s;
    }
}
