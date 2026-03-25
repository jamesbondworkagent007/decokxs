package org.spongycastle.crypto.tls;

/* JADX INFO: loaded from: classes25.dex */
public class TlsFatalAlertReceived extends TlsException {
    protected short alertDescription;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public short getAlertDescription() {
        return this.alertDescription;
    }

    public TlsFatalAlertReceived(short s) {
        super(AlertDescription.getText(s), null);
        this.alertDescription = s;
    }
}
