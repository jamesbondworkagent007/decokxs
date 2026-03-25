package o;

import org.apache.http.HttpException;

/* JADX INFO: renamed from: o.zoj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59846zoj implements InterfaceC59837zoa {
    public final InterfaceC59580zji[] KWHzl;
    public final InterfaceC59585zjn[] OLrzqt;

    public C59846zoj(InterfaceC59580zji[] interfaceC59580zjiArr, InterfaceC59585zjn[] interfaceC59585zjnArr) {
        if (interfaceC59580zjiArr != null) {
            int length = interfaceC59580zjiArr.length;
            InterfaceC59580zji[] interfaceC59580zjiArr2 = new InterfaceC59580zji[length];
            this.KWHzl = interfaceC59580zjiArr2;
            java.lang.System.arraycopy(interfaceC59580zjiArr, 0, interfaceC59580zjiArr2, 0, length);
        } else {
            this.KWHzl = new InterfaceC59580zji[0];
        }
        if (interfaceC59585zjnArr == null) {
            this.OLrzqt = new InterfaceC59585zjn[0];
            return;
        }
        int length2 = interfaceC59585zjnArr.length;
        InterfaceC59585zjn[] interfaceC59585zjnArr2 = new InterfaceC59585zjn[length2];
        this.OLrzqt = interfaceC59585zjnArr2;
        java.lang.System.arraycopy(interfaceC59585zjnArr, 0, interfaceC59585zjnArr2, 0, length2);
    }

    @Override // o.InterfaceC59580zji
    public void process(InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) throws HttpException, java.io.IOException {
        for (InterfaceC59580zji interfaceC59580zji : this.KWHzl) {
            interfaceC59580zji.process(interfaceC59577zjf, interfaceC59838zob);
        }
    }

    @Override // o.InterfaceC59585zjn
    public void process(InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) throws HttpException, java.io.IOException {
        for (InterfaceC59585zjn interfaceC59585zjn : this.OLrzqt) {
            interfaceC59585zjn.process(interfaceC59584zjm, interfaceC59838zob);
        }
    }
}
