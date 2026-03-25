package o;

import org.apache.http.HttpHost;
import org.apache.http.impl.conn.ConnectionShutdownException;

/* JADX INFO: renamed from: o.zlT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public abstract class AbstractC59671zlT extends AbstractC59664zlM {
    public volatile AbstractC59662zlK AhwBna;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @java.lang.Deprecated
    public AbstractC59662zlK fJNWhG() {
        return this.AhwBna;
    }

    public AbstractC59671zlT(InterfaceC59551zjF interfaceC59551zjF, AbstractC59662zlK abstractC59662zlK) {
        super(interfaceC59551zjF, abstractC59662zlK.EZpvd);
        this.AhwBna = abstractC59662zlK;
    }

    public void AEQbTJ(AbstractC59662zlK abstractC59662zlK) {
        if (fARcdN() || abstractC59662zlK == null) {
            throw new ConnectionShutdownException();
        }
    }

    @Override // o.AbstractC59664zlM
    public void DbNXlk() {
        synchronized (this) {
            this.AhwBna = null;
            super.DbNXlk();
        }
    }

    @Override // o.InterfaceC59560zjO, o.InterfaceC59564zjS
    public C59570zjY AYXKKw() {
        AbstractC59662zlK abstractC59662zlKFJNWhG = fJNWhG();
        AEQbTJ(abstractC59662zlKFJNWhG);
        if (abstractC59662zlKFJNWhG.KWHzl == null) {
            return null;
        }
        return abstractC59662zlKFJNWhG.KWHzl.djBIcL();
    }

    @Override // o.InterfaceC59560zjO
    public void AEQbTJ(C59570zjY c59570zjY, InterfaceC59838zob interfaceC59838zob, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        AbstractC59662zlK abstractC59662zlKFJNWhG = fJNWhG();
        AEQbTJ(abstractC59662zlKFJNWhG);
        abstractC59662zlKFJNWhG.OLrzqt(c59570zjY, interfaceC59838zob, interfaceC59779znV);
    }

    @Override // o.InterfaceC59560zjO
    public void AEQbTJ(boolean z, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        AbstractC59662zlK abstractC59662zlKFJNWhG = fJNWhG();
        AEQbTJ(abstractC59662zlKFJNWhG);
        abstractC59662zlKFJNWhG.OLrzqt(z, interfaceC59779znV);
    }

    @Override // o.InterfaceC59560zjO
    public void EZpvd(HttpHost httpHost, boolean z, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        AbstractC59662zlK abstractC59662zlKFJNWhG = fJNWhG();
        AEQbTJ(abstractC59662zlKFJNWhG);
        abstractC59662zlKFJNWhG.copydefault(httpHost, z, interfaceC59779znV);
    }

    @Override // o.InterfaceC59560zjO
    public void KWHzl(InterfaceC59838zob interfaceC59838zob, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        AbstractC59662zlK abstractC59662zlKFJNWhG = fJNWhG();
        AEQbTJ(abstractC59662zlKFJNWhG);
        abstractC59662zlKFJNWhG.copydefault(interfaceC59838zob, interfaceC59779znV);
    }

    @Override // o.InterfaceC59572zja, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        AbstractC59662zlK abstractC59662zlKFJNWhG = fJNWhG();
        if (abstractC59662zlKFJNWhG != null) {
            abstractC59662zlKFJNWhG.copydefault();
        }
        InterfaceC59569zjX interfaceC59569zjXIsConnected = isConnected();
        if (interfaceC59569zjXIsConnected != null) {
            interfaceC59569zjXIsConnected.close();
        }
    }

    @Override // o.InterfaceC59572zja
    public void EZpvd() throws java.io.IOException {
        AbstractC59662zlK abstractC59662zlKFJNWhG = fJNWhG();
        if (abstractC59662zlKFJNWhG != null) {
            abstractC59662zlKFJNWhG.copydefault();
        }
        InterfaceC59569zjX interfaceC59569zjXIsConnected = isConnected();
        if (interfaceC59569zjXIsConnected != null) {
            interfaceC59569zjXIsConnected.EZpvd();
        }
    }

    @Override // o.InterfaceC59560zjO
    public void EZpvd(java.lang.Object obj) {
        AbstractC59662zlK abstractC59662zlKFJNWhG = fJNWhG();
        AEQbTJ(abstractC59662zlKFJNWhG);
        abstractC59662zlKFJNWhG.OLrzqt(obj);
    }
}
