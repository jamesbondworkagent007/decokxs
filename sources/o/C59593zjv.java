package o;

import java.util.Queue;
import org.apache.http.auth.AuthProtocolState;

/* JADX INFO: renamed from: o.zjv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59593zjv {
    public AuthProtocolState AEQbTJ = AuthProtocolState.UNCHALLENGED;
    public InterfaceC59588zjq EZpvd;
    public InterfaceC59597zjz KWHzl;
    public C59596zjy OLrzqt;
    public Queue<C59590zjs> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC59597zjz AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Queue<C59590zjs> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC59588zjq KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AuthProtocolState copydefault() {
        return this.AEQbTJ;
    }

    public void OLrzqt() {
        this.AEQbTJ = AuthProtocolState.UNCHALLENGED;
        this.copydefault = null;
        this.EZpvd = null;
        this.OLrzqt = null;
        this.KWHzl = null;
    }

    public void EZpvd(AuthProtocolState authProtocolState) {
        if (authProtocolState == null) {
            authProtocolState = AuthProtocolState.UNCHALLENGED;
        }
        this.AEQbTJ = authProtocolState;
    }

    public void AEQbTJ(InterfaceC59588zjq interfaceC59588zjq, InterfaceC59597zjz interfaceC59597zjz) {
        C59851zoo.AEQbTJ(interfaceC59588zjq, "Auth scheme");
        C59851zoo.AEQbTJ(interfaceC59597zjz, "Credentials");
        this.EZpvd = interfaceC59588zjq;
        this.KWHzl = interfaceC59597zjz;
        this.copydefault = null;
    }

    public void copydefault(Queue<C59590zjs> queue) {
        C59851zoo.copydefault(queue, "Queue of auth options");
        this.copydefault = queue;
        this.EZpvd = null;
        this.KWHzl = null;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("state:");
        sb.append(this.AEQbTJ);
        sb.append(";");
        if (this.EZpvd != null) {
            sb.append("auth scheme:");
            sb.append(this.EZpvd.getSchemeName());
            sb.append(";");
        }
        if (this.KWHzl != null) {
            sb.append("credentials present");
        }
        return sb.toString();
    }
}
