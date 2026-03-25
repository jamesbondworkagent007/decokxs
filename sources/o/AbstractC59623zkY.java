package o;

import java.net.SocketTimeoutException;
import org.apache.http.HttpException;

/* JADX INFO: renamed from: o.zkY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public abstract class AbstractC59623zkY implements InterfaceC59573zjb {
    public InterfaceC59758znA copydefault = null;
    public InterfaceC59808zny valueOf = null;
    public InterfaceC59803znt KWHzl = null;
    public InterfaceC59806znw<InterfaceC59584zjm> gEmmrt = null;
    public InterfaceC59807znx<InterfaceC59577zjf> AYXKKw = null;
    public C59624zkZ AEQbTJ = null;
    public final C59784zna OLrzqt = isConnected();
    public final C59729zmY EZpvd = DbNXlk();

    public abstract void djBIcL() throws java.lang.IllegalStateException;

    public C59729zmY DbNXlk() {
        return new C59729zmY(new C59787znd());
    }

    public C59784zna isConnected() {
        return new C59784zna(new C59789znf());
    }

    public InterfaceC59583zjl values() {
        return C59621zkW.copydefault;
    }

    public InterfaceC59806znw<InterfaceC59584zjm> AEQbTJ(InterfaceC59758znA interfaceC59758znA, InterfaceC59583zjl interfaceC59583zjl, InterfaceC59779znV interfaceC59779znV) {
        return new C59796znm(interfaceC59758znA, null, interfaceC59583zjl, interfaceC59779znV);
    }

    public InterfaceC59807znx<InterfaceC59577zjf> OLrzqt(InterfaceC59808zny interfaceC59808zny, InterfaceC59779znV interfaceC59779znV) {
        return new C59800znq(interfaceC59808zny, null, interfaceC59779znV);
    }

    public C59624zkZ EZpvd(InterfaceC59809znz interfaceC59809znz, InterfaceC59809znz interfaceC59809znz2) {
        return new C59624zkZ(interfaceC59809znz, interfaceC59809znz2);
    }

    public void EZpvd(InterfaceC59758znA interfaceC59758znA, InterfaceC59808zny interfaceC59808zny, InterfaceC59779znV interfaceC59779znV) {
        this.copydefault = (InterfaceC59758znA) C59851zoo.AEQbTJ(interfaceC59758znA, "Input session buffer");
        this.valueOf = (InterfaceC59808zny) C59851zoo.AEQbTJ(interfaceC59808zny, "Output session buffer");
        if (interfaceC59758znA instanceof InterfaceC59803znt) {
            this.KWHzl = (InterfaceC59803znt) interfaceC59758znA;
        }
        this.gEmmrt = AEQbTJ(interfaceC59758znA, values(), interfaceC59779znV);
        this.AYXKKw = OLrzqt(interfaceC59808zny, interfaceC59779znV);
        this.AEQbTJ = EZpvd(interfaceC59758znA.AEQbTJ(), interfaceC59808zny.EZpvd());
    }

    @Override // o.InterfaceC59573zjb
    public boolean OLrzqt(int i) throws java.io.IOException {
        djBIcL();
        try {
            return this.copydefault.copydefault(i);
        } catch (SocketTimeoutException unused) {
            return false;
        }
    }

    @Override // o.InterfaceC59573zjb
    public void EZpvd(InterfaceC59577zjf interfaceC59577zjf) throws HttpException, java.io.IOException {
        C59851zoo.AEQbTJ(interfaceC59577zjf, "HTTP request");
        djBIcL();
        this.AYXKKw.KWHzl(interfaceC59577zjf);
        this.AEQbTJ.AEQbTJ();
    }

    @Override // o.InterfaceC59573zjb
    public void KWHzl(InterfaceC59578zjg interfaceC59578zjg) throws HttpException, java.io.IOException {
        C59851zoo.AEQbTJ(interfaceC59578zjg, "HTTP request");
        djBIcL();
        if (interfaceC59578zjg.getEntity() == null) {
            return;
        }
        this.OLrzqt.AEQbTJ(this.valueOf, interfaceC59578zjg, interfaceC59578zjg.getEntity());
    }

    public void AkhnZx() throws java.io.IOException {
        this.valueOf.OLrzqt();
    }

    @Override // o.InterfaceC59573zjb
    public void copydefault() throws java.io.IOException {
        djBIcL();
        AkhnZx();
    }

    @Override // o.InterfaceC59573zjb
    public InterfaceC59584zjm AEQbTJ() throws HttpException, java.io.IOException {
        djBIcL();
        InterfaceC59584zjm interfaceC59584zjm = (InterfaceC59584zjm) this.gEmmrt.KWHzl();
        if (interfaceC59584zjm.AEQbTJ().getStatusCode() >= 200) {
            this.AEQbTJ.EZpvd();
        }
        return interfaceC59584zjm;
    }

    @Override // o.InterfaceC59573zjb
    public void OLrzqt(InterfaceC59584zjm interfaceC59584zjm) throws HttpException, java.io.IOException {
        C59851zoo.AEQbTJ(interfaceC59584zjm, "HTTP response");
        djBIcL();
        interfaceC59584zjm.OLrzqt(this.EZpvd.OLrzqt(this.copydefault, interfaceC59584zjm));
    }

    public boolean fJNWhG() {
        InterfaceC59803znt interfaceC59803znt = this.KWHzl;
        return interfaceC59803znt != null && interfaceC59803znt.copydefault();
    }

    @Override // o.InterfaceC59572zja
    public boolean OLrzqt() {
        if (!KWHzl() || fJNWhG()) {
            return true;
        }
        try {
            this.copydefault.copydefault(1);
            return fJNWhG();
        } catch (SocketTimeoutException unused) {
            return false;
        } catch (java.io.IOException unused2) {
            return true;
        }
    }
}
